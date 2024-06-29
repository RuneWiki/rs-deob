import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class190 {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public int field2589 = 16;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public int field2584 = -1;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public int field2582 = 128;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public int field2581 = -1;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public int field2592 = -1;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public int field2595 = 8;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Z")
    public boolean field2593 = true;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    public int field2596 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field2590 = 1190717;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Z")
    public boolean field2585 = false;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
    public boolean field2597 = true;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILbk;BI)V")
    private final void method1214(int arg0, class211 arg1, byte arg2, int arg3) {
        field2583++;
        if (arg2 >= -9) {
            method1220((class57) null, -11, 85);
        }
        if (arg3 == 1) {
            this.field2596 = class444.method2754(arg1.method1353(77), -1);
        } else if (arg3 == 2) {
            this.field2584 = arg1.method1342((byte) -127);
        } else if (arg3 == 3) {
            this.field2584 = arg1.method1355(32136);
            if (this.field2584 == 65535) {
                this.field2584 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field2593 = false;
            return;
        } else if (arg3 == 7) {
            this.field2581 = class444.method2754(arg1.method1353(96), -1);
            return;
        } else if (arg3 == 8) {
            class450.field6573 = arg0;
            return;
        } else if (arg3 == 9) {
            this.field2582 = arg1.method1355(32136);
            return;
        } else if (arg3 == 10) {
            this.field2597 = false;
            return;
        } else if (arg3 == 11) {
            this.field2595 = arg1.method1342((byte) -128);
            return;
        } else if (arg3 == 12) {
            this.field2585 = true;
            return;
        } else {
            if (arg3 == 13) {
                this.field2590 = arg1.method1353(107);
            } else if (arg3 == 14) {
                this.field2589 = arg1.method1342((byte) -127);
                return;
            } else if (arg3 == 15) {
                this.field2592 = arg1.method1355(32136);
                if (this.field2592 == 65535) {
                    this.field2592 = -1;
                    return;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1215(int arg0, String arg1) {
        field2586++;
        long var2 = 0L;
        int var4 = arg1.length();
        if (arg0 != -1) {
            field2588 = -30;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 + 1 - 'A');
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)V")
    public final void method1216(byte arg0, int arg1) {
        if (arg0 > -34) {
            this.field2596 = -27;
        }
        if (this.field2592 == -1) {
            this.field2592 = this.field2584;
        }
        this.field2595 = arg1 | this.field2595 << 8;
        field2594++;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IILbk;)V")
    public final void method1217(int arg0, int arg1, class211 arg2) {
        if (arg1 <= 48) {
            this.method1216((byte) 98, -71);
        }
        field2580++;
        while (true) {
            int var4 = arg2.method1342((byte) -127);
            if (var4 == 0) {
                return;
            }
            this.method1214(arg0, arg2, (byte) -123, var4);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)V")
    public static final void method1218(int arg0, byte arg1) {
        field2591++;
        class235.field3194 = arg0;
        class331 var2 = class444.field6487;
        synchronized (class444.field6487) {
            class444.field6487.method2043(-26);
        }
        class331 var3 = class360.field5262;
        synchronized (class360.field5262) {
            class360.field5262.method2043(-114);
            if (arg1 != -7) {
                method1220((class57) null, 114, -92);
            }
        }
        class331 var4 = class173.field2412;
        synchronized (class173.field2412) {
            class173.field2412.method2043(arg1 ^ 0x6D);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Llg;III[Z)V")
    public static final void method1219(class238 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class132.field1814 == class111.field1285) {
            return;
        }
        int var5 = class78.field887[arg1].method1991(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class319 var7 = class78.field887[var6];
                if (var7 != null) {
                    var7.method1983(arg0, arg2, var5 - var7.method1991(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lra;II)Lcp;")
    public static final class430 method1220(class57 arg0, int arg1, int arg2) {
        field2587++;
        byte[] var3 = arg0.method348(arg2, 0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -952) {
                field2588 = -72;
            }
            return new class430(var3);
        }
    }
}
