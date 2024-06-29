import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class65 {

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "I")
    public int field746 = 2;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "Z")
    public boolean field747 = false;

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "Z")
    public boolean field741 = false;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public int field744 = -1;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "I")
    public int field743 = 1;

    @OriginalMember(owner = "client!qu", name = "j", descriptor = "I")
    public int field748 = 64;

    @OriginalMember(owner = "client!qu", name = "n", descriptor = "I")
    public int field752 = 64;

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "Lsr;")
    public static class167 field740 = new class167();

    @OriginalMember(owner = "client!qu", name = "p", descriptor = "Z")
    public static boolean field754 = false;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!qu", name = "k", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!qu", name = "l", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!qu", name = "m", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "J")
    public static long field742;

    @OriginalMember(owner = "client!qu", name = "o", descriptor = "Lo;")
    public static class24 field753;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(BJ)V")
    public static final void method383(byte arg0, long arg1) {
        field750++;
        int var3 = class153.field1999 + class96.field1170.field3704;
        int var4 = class333.field4411 + class96.field1170.field3694;
        if (class412.field5886 - var3 < -500 || class412.field5886 - var3 > 500 || class492.field7214 - var4 < -500 || (class492.field7214 - var4) > 500) {
            class492.field7214 = var4;
            class412.field5886 = var3;
        }
        if (arg0 < 88) {
            field742 = -119L;
        }
        if (class412.field5886 != var3) {
            int var5 = var3 - class412.field5886;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class412.field5886 += var6;
        }
        if (!class319.field4256.field4651) {
            class199.field2650 += (float) arg1 * class283.field3745 / 6.0F;
            class143.field1907 += (float) arg1 * class249.field3321 / 6.0F;
        }
        if (class492.field7214 != var4) {
            int var7 = var4 - class492.field7214;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class492.field7214 += var8;
        }
        class408.method2499((byte) 110);
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(B)V")
    public static void method384(byte arg0) {
        field753 = null;
        if (arg0 < 121) {
            method385(48, null, (byte) 55, 35);
        }
        field740 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(ILie;BI)V")
    public static final void method385(int arg0, class6 arg1, byte arg2, int arg3) {
        class275.field3657[arg3][arg0] = arg1;
        if (arg2 < 45) {
            field739 = 79;
        }
        field751++;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIBLug;)V")
    private final void method386(int arg0, int arg1, byte arg2, class396 arg3) {
        if (arg2 < 42) {
            field753 = null;
        }
        field749++;
        if (arg1 == 1) {
            this.field744 = arg3.method2386(-23648);
            if (this.field744 == 65535) {
                this.field744 = -1;
            }
        } else if (arg1 == 2) {
            this.field752 = arg3.method2386(-23648) + 1;
            this.field748 = arg3.method2386(-23648) + 1;
        } else if (arg1 == 3) {
            arg3.method2418(114);
        } else if (arg1 == 4) {
            this.field746 = arg3.method2388((byte) -113);
        } else if (arg1 == 5) {
            this.field743 = arg3.method2388((byte) -111);
        } else if (arg1 == 6) {
            this.field741 = true;
            return;
        } else if (arg1 == 7) {
            this.field747 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lug;II)V")
    public final void method387(class396 arg0, int arg1, int arg2) {
        field745++;
        while (true) {
            int var4 = arg0.method2388((byte) -118);
            if (var4 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method385(-43, null, (byte) 72, -59);
                    return;
                }
            }
            this.method386(arg2, var4, (byte) 77, arg0);
        }
    }
}
