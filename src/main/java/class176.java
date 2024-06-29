import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class176 extends class286 {

    @OriginalMember(owner = "client!me", name = "P", descriptor = "Lkg;")
    public static class69 field3026 = null;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "([B[Lpk;IIZI)V", line = 9)
    public static final void method1158(byte[] arg0, class104[] arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg3 < 2) {
            field3026 = (class69) null;
        }
        class229 var6 = new class229(arg0);
        field3024++;
        int var7 = -1;
        while (true) {
            int var8 = var6.method1524((byte) -116);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1557(255);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method1535((byte) 100);
                int var15 = var14 & 0x3;
                int var16 = var11 + arg2;
                int var17 = arg5 + var12;
                int var18 = var14 >> 2;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    class104 var19 = null;
                    if (!arg4) {
                        int var20 = var13;
                        if ((class252.field4282[1][var17][var16] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg1[var20];
                        }
                    }
                    class306.method2087(arg4, var15, var7, !arg4, var13, 1, var13, var16, var19, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 81)
    public class176() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(III)V", line = 87)
    private final void method1159(int arg0, int arg1, int arg2) {
        if (arg2 >= -105) {
            field3026 = (class69) null;
        }
        int var4 = class153.field2509[arg1];
        field3032++;
        int var5 = class174.field2978[arg0];
        float var6 = (float) Math.atan2((double) (var5 - 2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class302.field5112 = arg0;
            class270.field4563 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && -2.356194490192345D <= (double) var6) {
            class270.field4563 = arg0;
            class302.field5112 = arg1;
        } else if (-0.7853981633974483D >= (double) var6 && (double) var6 >= -1.5707963267948966D) {
            class270.field4563 = arg0;
            class302.field5112 = class27.field410 - arg1;
        } else if (var6 <= 0.0F && -0.7853981633974483D <= (double) var6) {
            class270.field4563 = class13.field124 - arg1;
            class302.field5112 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class302.field5112 = class27.field410 - arg0;
            class270.field4563 = class13.field124 - arg1;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class270.field4563 = class13.field124 - arg0;
            class302.field5112 = class27.field410 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class270.field4563 = class13.field124 - arg0;
            class302.field5112 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class302.field5112 = class27.field410 - arg0;
            class270.field4563 = arg1;
        }
        class270.field4563 &= class126.field2100;
        class302.field5112 &= class284.field4857;
    }

    @OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V", line = 161)
    public static final void method1160(int arg0) {
        class35.method229(-114);
        class295.method2007(false);
        field3029++;
        class89.method577(-105);
        class154.method949(7456);
        class48.method279(-30444);
        class259.method1752(0);
        class88.method566((byte) -32);
        class256.method1728((byte) -15);
        class220.method1448(true);
        class273.method1838(false);
        class201.method1290((byte) -120);
        class191.method1243(true);
        class72.method482(-20);
        class249.method1688(87);
        class94.field1578.method78(-3303);
        class63.field878.method1106(21305);
        class259.field4411.method1106(21305);
        class282.field4772.method1106(21305);
        class103.field1741.method1106(21305);
        class61.field849.method1106(21305);
        class109.field1843.method1106(21305);
        if (arg0 < 69) {
            return;
        }
        class169.field2832.method1106(21305);
        class69.field1067.method1106(21305);
        class155.field2558.method1106(21305);
        class210.field3580.method1106(21305);
        class227.field3821.method1106(21305);
        class217.field3678.method1631(-27875);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lfe;ZI)V", line = 205)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field4876 = arg0.method1535((byte) 113) == 1;
        }
        field3033++;
        if (arg1) {
            field3026 = (class69) null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[I", line = 219)
    public final int[] method14(int arg0, int arg1) {
        field3028++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            for (int var4 = 0; var4 < class27.field410; var4++) {
                this.method1159(var4, arg1, -123);
                int[] var5 = this.method1963(class270.field4563, 0, -1);
                var3[var4] = var5[class302.field5112];
            }
        }
        if (arg0 >= -52) {
            field3026 = (class69) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(III)V", line = 256)
    public static final void method1161(int arg0, int arg1, int arg2) {
        class94 var3 = class46.method272(arg1, (byte) 70);
        field3025++;
        int var4 = var3.field1585;
        int var5 = var3.field1590;
        int var6 = var3.field1594;
        int var7 = class294.field4955[var6 - var5];
        if (arg0 < arg2 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class280.method1867(var4, 122, var8 & arg0 << var5 | ~var8 & class6.field63[var4]);
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 288)
    public static final void method1162(byte arg0) {
        field3030++;
        class79.method522(0);
        System.gc();
        if (arg0 == 49) {
            class77.method506(25, -30354);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBII)I", line = 303)
    public static final int method1163(int arg0, byte arg1, int arg2, int arg3) {
        field3027++;
        if (arg2 == arg3) {
            return arg2;
        }
        if (arg1 >= -67) {
            field3026 = (class69) null;
        }
        int var4 = 128 - arg0;
        int var5 = ((arg3 & -16711936) >>> 7) * arg0 + (arg2 >>> 7 & 0x1FE01FE) * var4 & 0xFF00FF00;
        int var6 = (arg2 & 0xFF00FF) * var4 + ((arg3 & 0xFF00FF) * arg0) & 0xFF00FF00;
        return var5 + (var6 >> 7);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[[I", line = 331)
    public final int[][] method16(int arg0, byte arg1) {
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        field3031++;
        if (arg1 != -19) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4878.field2524) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class27.field410; var7++) {
                this.method1159(var7, arg0, arg1 ^ 0x7C);
                int[][] var8 = this.method1964(class270.field4563, 0, false);
                var4[var7] = var8[0][class302.field5112];
                var5[var7] = var8[1][class302.field5112];
                var6[var7] = var8[2][class302.field5112];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V", line = 375)
    public static void method1164(byte arg0) {
        if (arg0 != 49) {
            method1160(53);
        }
        field3026 = null;
    }
}
