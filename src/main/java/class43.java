import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class43 {

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "[I")
    private int[] field558;

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "[B")
    private byte[] field563;

    @OriginalMember(owner = "client!bt", name = "k", descriptor = "[I")
    private int[] field568;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field565 = 0;

    @OriginalMember(owner = "client!bt", name = "l", descriptor = "Lbca;")
    public static class662 field569 = new class662();

    @OriginalMember(owner = "client!bt", name = "m", descriptor = "Lkaa;")
    public static class47 field570 = new class47(20, 8);

    @OriginalMember(owner = "client!bt", name = "n", descriptor = "I")
    public static int field571 = 4;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!bt", name = "j", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!bt", name = "o", descriptor = "[Lfb;")
    public static class675[] field572;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lqfa;IIII)V", line = 4)
    public static final void method313(class100 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 24) {
            method313(null, 102, -15, -47, 126);
        }
        field561++;
        for (class461 var5 = (class461) class496.field6692.method21(2); var5 != null; var5 = (class461) class496.field6692.method9(arg4 ^ 0xFFFFFF99)) {
            if (var5.field6324 == arg1 && arg3 << 9 == var5.field6311 && arg2 << 9 == var5.field6306 && var5.field6301.field1301 == arg0.field1301) {
                if (var5.field6305 != null) {
                    class603.field7927.method1612(var5.field6305);
                    var5.field6305 = null;
                }
                if (var5.field6299 != null) {
                    class603.field7927.method1612(var5.field6299);
                    var5.field6299 = null;
                }
                var5.method3564(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V", line = 44)
    public static void method314(boolean arg0) {
        field569 = null;
        field572 = null;
        if (!arg0) {
            field564 = -35;
        }
        field570 = null;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lkn;IIIIILkn;IZI)V", line = 56)
    public static final void method315(class742 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class742 arg6, int arg7, boolean arg8, int arg9) {
        field566++;
        int var10 = arg0.method2266((byte) 83);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class133 var12 = (class133) class99.field1271.method552(4, (long) var10);
        if (var12 == null) {
            class720[] var13 = class720.method4047(class84.field1023, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class341.field4807.method415(var13[0], true);
            class99.field1271.method556((byte) 0, (long) var10, var12);
        }
        class180.method1245(0, arg2 >> 1, arg1, arg6.field3508, arg9, arg6.field3505, arg6.field3502, arg7 >> 1, 0, arg6.method2256(-1) * 256);
        int var14 = class259.field3621[0] + arg4 - 18;
        int var15 = class259.field3621[1] + arg5 - 16 - 54;
        int var16 = arg3 / 4 * 18 + var14;
        int var17 = arg3 % 4 * 18 + var15;
        var12.method1035(var16, var17);
        if (arg0 == arg6) {
            class341.field4807.method434(18, -256, 18, 113, var17 - 1, var16 - 1);
        }
        class62.method539(var16 + 18, var16 + -1, (byte) -95, var17 + 18, var17 - 1);
        class575 var18 = class407.method2380(arg8);
        var18.field7553 = var16 + 16;
        var18.field7556 = var17;
        var18.field7548 = var17 + 16;
        var18.field7549 = var16;
        var18.field7551 = arg0;
        class747.field10394.method3870(var18, 0);
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(BI[B[BII)I", line = 106)
    public final int method316(byte arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        field560++;
        if (arg0 != -124) {
            method315(null, -103, -120, 4, 108, 24, null, -104, true, 121);
        }
        int var7 = 0;
        int var8 = arg1 + arg5;
        int var9 = arg4 << 3;
        while (var8 > arg1) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field558[var10];
            byte var12 = this.field563[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            var9 += var12;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class446.method2556(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(II[BI[BI)I", line = 177)
    public final int method317(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field562++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        if (arg0 != -87812127) {
            return 61;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 < 0) {
                var8 = this.field568[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var12;
            if ((var12 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var13;
            if ((var13 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var14;
            if ((var14 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var15;
            if ((var15 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var16;
            if ((var16 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var17;
            if ((var17 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field568[var8];
            }
            int var18;
            if ((var18 = this.field568[var8]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 - (arg3 - 1);
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "([B)V", line = 341)
    public class43(byte[] arg0) {
        int var2 = arg0.length;
        this.field558 = new int[var2];
        this.field563 = arg0;
        this.field568 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field558[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class446.method2556(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field568[var14] == 0) {
                            this.field568[var14] = var4;
                        }
                        var14 = this.field568[var14];
                    }
                    if (var14 >= this.field568.length) {
                        int[] var17 = new int[this.field568.length * 2];
                        for (int var18 = 0; var18 < this.field568.length; var18++) {
                            var17[var18] = this.field568[var18];
                        }
                        this.field568 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field568[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
