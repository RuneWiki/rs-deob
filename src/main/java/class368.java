import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class368 extends class393 {

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public int field5463 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field5464 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public int field5462 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field5466 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field5471 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public int field5474 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field5468 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field5465 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Llo;")
    public class419 field5473;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static volatile int field5476 = 0;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lje;")
    public static class300 field5472;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB[I[II)V", line = 6)
    public static final void method2427(int arg0, byte arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (((var9 & 0x1) + var7) > arg3[var9]) {
                    int var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    int var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var8;
            method2427(arg0, (byte) 127, arg2, arg3, var6 - 1);
            method2427(var6 + 1, (byte) 16, arg2, arg3, arg4);
        }
        if (arg1 >= 2) {
            field5470++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Llo;)V", line = 251)
    public class368(class419 arg0) {
        this.field5473 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V", line = 67)
    public static final void method2428(long arg0, byte arg1) {
        if (arg1 <= 23) {
            field5472 = null;
        }
        field5467++;
        int var3 = class309.field4409;
        int var4 = class146.field1915;
        if (class64.field902 != var3) {
            int var5 = var3 - class64.field902;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class64.field902 += var6;
        }
        if (!class329.field4714) {
            class155.field2027 += (float) arg0 * class128.field1700 / 40.0F * 8.0F;
            class170.field2244 += (float) arg0 * class6.field51 / 40.0F * 8.0F;
        }
        if (class370.field5511 != var4) {
            int var7 = var4 - class370.field5511;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class370.field5511 += var8;
        }
        class134.method903(-4);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z", line = 152)
    public final boolean method2429(int arg0, int arg1, int arg2) {
        field5478++;
        if (arg2 >= this.field5468 && this.field5471 >= arg2 && this.field5465 <= arg1 && arg1 <= this.field5474) {
            return true;
        } else if (this.field5462 <= arg2 && arg2 <= this.field5466 && this.field5463 <= arg1 && this.field5464 >= arg1) {
            return true;
        } else if (arg0 > -104) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BB)[B", line = 177)
    public static final byte[] method2430(byte[] arg0, byte arg1) {
        field5475++;
        int var2 = arg0.length;
        if (arg1 > -123) {
            field5476 = 49;
        }
        byte[] var3 = new byte[var2];
        class111.method770(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/String;", line = 195)
    public static final String method2431(String arg0, String arg1, String arg2, int arg3) {
        field5477++;
        if (arg3 != 0) {
            field5469 = 4;
        }
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, arg2.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 233)
    public static void method2432(int arg0) {
        if (arg0 == 320) {
            field5472 = null;
        }
    }
}
