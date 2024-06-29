import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class285 extends class529 {

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "Lgk;")
    public class616 field3558 = new class616();

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "Lbea;")
    public class702 field3568 = new class702();

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "Lrda;")
    private class96 field3561;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "[I")
    public static int[] field3557 = new int[8];

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Lad;")
    public static class19 field3550 = new class19(128, 4);

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "Lcq;")
    public static class110 field3567 = new class110(55, 7);

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "B")
    public static byte field3565;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "[Loi;")
    public static class230[] field3564;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Lbk;II)V", line = 8)
    private final void method1656(class125 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field3558 = null;
        }
        if ((this.field3561.field990[arg0.field1405] & 0x4) != 0 && arg0.field1411 < 0) {
            int var4 = this.field3561.field984[arg0.field1405] / class224.field2776;
            int var5 = (var4 + 1048575 - arg0.field1401) / var4;
            arg0.field1401 = arg2 * var4 + arg0.field1401 & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field3561.field1015[arg0.field1405] == 0) {
                    arg0.field1418 = class704.method3901(arg0.field1393, arg0.field1418.method3906(), arg0.field1418.method3915(), arg0.field1418.method3911());
                } else {
                    arg0.field1418 = class704.method3901(arg0.field1393, arg0.field1418.method3906(), 0, arg0.field1418.method3911());
                    this.field3561.method506(arg0.field1395.field5474[arg0.field1402] < 0, arg0, true);
                }
                if (arg0.field1395.field5474[arg0.field1402] < 0) {
                    arg0.field1418.method3913(-1);
                }
                arg2 = arg0.field1401 / var4;
            }
        }
        field3562++;
        arg0.field1418.method490(arg2);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBII[B)V", line = 50)
    public static final void method1657(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, byte[] arg6) {
        field3563++;
        if (arg4 > 0 && !class483.method2792(arg4, arg3 + 44)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class483.method2792(arg2, -3)) {
            int var7 = class356.method2100((byte) -45, arg0);
            int var8 = 0;
            int var9 = arg4 >= arg2 ? arg2 : arg4;
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg6;
            if (arg3 != -47) {
                method1661(-56);
            }
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg1, arg4, arg2, 0, arg0, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg2 = var11;
                var12 = var15;
                arg4 = var10;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "([III)V", line = 151)
    public final void method495(int[] arg0, int arg1, int arg2) {
        field3552++;
        this.field3568.method495(arg0, arg1, arg2);
        for (class125 var4 = (class125) this.field3558.method3434((byte) 2); var4 != null; var4 = (class125) this.field3558.method3430(true)) {
            if (!this.field3561.method507(-105, var4)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field1396) {
                        this.method1659(var5 + var6, var6, var4, -118, arg0, var5);
                        var4.field1396 -= var5;
                        break;
                    }
                    this.method1659(var5 + var6, var6, var4, -83, arg0, var4.field1396);
                    var5 -= var4.field1396;
                    var6 += var4.field1396;
                } while (!this.field3561.method504(arg0, var4, -7417, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "()Lnj;", line = 189)
    public final class529 method521() {
        field3553++;
        class125 var1;
        do {
            var1 = (class125) this.field3558.method3430(true);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1418 == null);
        return var1.field1418;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "()Lnj;", line = 214)
    public final class529 method505() {
        field3559++;
        class125 var1 = (class125) this.field3558.method3434((byte) 2);
        if (var1 == null) {
            return null;
        } else if (var1.field1418 == null) {
            return this.method521();
        } else {
            return var1.field1418;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 232)
    public final void method490(int arg0) {
        field3555++;
        this.field3568.method490(arg0);
        for (class125 var2 = (class125) this.field3558.method3434((byte) 2); var2 != null; var2 = (class125) this.field3558.method3430(true)) {
            if (!this.field3561.method507(-108, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field1396 >= var3) {
                        this.method1656(var2, 0, var3);
                        var2.field1396 -= var3;
                        break;
                    }
                    this.method1656(var2, 0, var2.field1396);
                    var3 -= var2.field1396;
                } while (!this.field3561.method504(null, var2, -7417, var3, 0));
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 273)
    public static final void method1658(int arg0) {
        field3551++;
        int var1 = class518.field7375 * 512 + 256;
        int var2 = class20.field161 * 512 + arg0;
        int var3 = class593.method3335(var2, class169.field1888, 27648, var1) - class94.field971;
        if (class77.field794 >= 100) {
            class689.field9698 = class20.field161 * 512 + 256;
            class516.field7360 = class518.field7375 * 512 + 256;
            class44.field432 = class593.method3335(class689.field9698, class169.field1888, 27648, class516.field7360) - class94.field971;
        } else {
            if (var1 > class516.field7360) {
                class516.field7360 += (var1 - class516.field7360) * class77.field794 / 1000 + class127.field1433;
                if (class516.field7360 > var1) {
                    class516.field7360 = var1;
                }
            }
            if (class44.field432 < var3) {
                class44.field432 += (var3 - class44.field432) * class77.field794 / 1000 + class127.field1433;
                if (var3 < class44.field432) {
                    class44.field432 = var3;
                }
            }
            if (var1 < class516.field7360) {
                class516.field7360 -= (class516.field7360 - var1) * class77.field794 / 1000 + class127.field1433;
                if (class516.field7360 < var1) {
                    class516.field7360 = var1;
                }
            }
            if (var3 < class44.field432) {
                class44.field432 -= (class44.field432 - var3) * class77.field794 / 1000 + class127.field1433;
                if (class44.field432 < var3) {
                    class44.field432 = var3;
                }
            }
            if (var2 > class689.field9698) {
                class689.field9698 += (var2 - class689.field9698) * class77.field794 / 1000 + class127.field1433;
                if (class689.field9698 > var2) {
                    class689.field9698 = var2;
                }
            }
            if (class689.field9698 > var2) {
                class689.field9698 -= class127.field1433 + ((class689.field9698 - var2) * class77.field794 / 1000);
                if (var2 > class689.field9698) {
                    class689.field9698 = var2;
                }
            }
        }
        int var4 = class538.field7583 * 512 + 256;
        int var5 = class152.field1684 * 512 + 256;
        int var6 = class593.method3335(var5, class169.field1888, 27648, var4) - class588.field8320;
        int var7 = var4 - class516.field7360;
        int var8 = var6 - class44.field432;
        int var9 = var5 - class689.field9698;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class485.field6986) {
            class485.field6986 += (var11 - class485.field6986 >> 3) * class475.field6842 / 1000 + class649.field9139 << 3;
            if (var11 < class485.field6986) {
                class485.field6986 = var11;
            }
        }
        if (var11 < class485.field6986) {
            class485.field6986 -= (class485.field6986 - var11 >> 3) * class475.field6842 / 1000 + class649.field9139 << 3;
            if (class485.field6986 < var11) {
                class485.field6986 = var11;
            }
        }
        int var13 = var12 - class505.field7273;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class505.field7273 += class649.field9139 + (class475.field6842 * var14 / 1000) << 3;
            class505.field7273 &= 0x3FFF;
        }
        if (var14 < 0) {
            class505.field7273 -= class649.field9139 + (-var14 * class475.field6842 / 1000) << 3;
            class505.field7273 &= 0x3FFF;
        }
        int var15 = var12 - class505.field7273;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class505.field7273 = var12;
        }
        class605.field8502 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IILbk;I[II)V", line = 425)
    private final void method1659(int arg0, int arg1, class125 arg2, int arg3, int[] arg4, int arg5) {
        if (arg3 >= -72) {
            return;
        }
        field3554++;
        if ((this.field3561.field990[arg2.field1405] & 0x4) != 0 && arg2.field1411 < 0) {
            int var7 = this.field3561.field984[arg2.field1405] / class224.field2776;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field1401) / var7;
                if (var8 > arg5) {
                    arg2.field1401 += arg5 * var7;
                    break;
                }
                arg2.field1418.method495(arg4, arg1, var8);
                arg2.field1401 += var7 * var8 - 1048576;
                arg5 -= var8;
                arg1 += var8;
                int var9 = class224.field2776 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class704 var11 = arg2.field1418;
                if (this.field3561.field1015[arg2.field1405] == 0) {
                    arg2.field1418 = class704.method3901(arg2.field1393, var11.method3906(), var11.method3915(), var11.method3911());
                } else {
                    arg2.field1418 = class704.method3901(arg2.field1393, var11.method3906(), 0, var11.method3911());
                    this.field3561.method506(arg2.field1395.field5474[arg2.field1402] < 0, arg2, true);
                    arg2.field1418.method3904(var9, var11.method3915());
                }
                if (arg2.field1395.field5474[arg2.field1402] < 0) {
                    arg2.field1418.method3913(-1);
                }
                var11.method3912(var9);
                var11.method495(arg4, arg1, arg0 - arg1);
                if (var11.method3898()) {
                    this.field3568.method3891(var11);
                }
            }
        }
        arg2.field1418.method495(arg4, arg1, arg5);
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 485)
    public static final void method1660(int arg0) {
        field3566++;
        if (class337.field4237 == class325.field4005) {
            return;
        }
        try {
            if (arg0 <= -82) {
                class627.method3524("tbrefresh", class338.field4252, 23421);
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lrda;)V", line = 570)
    public class285(class96 arg0) {
        this.field3561 = arg0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "()I", line = 507)
    public final int method497() {
        field3560++;
        return 0;
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V", line = 519)
    public static void method1661(int arg0) {
        field3567 = null;
        field3557 = null;
        field3564 = null;
        field3550 = null;
        if (arg0 < 17) {
            field3567 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIIIBIZI)Z", line = 533)
    public static final boolean method1662(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, boolean arg7, int arg8) {
        field3556++;
        int var9 = class362.field4859.field9517[0];
        int var10 = -81 % ((63 - arg5) / 46);
        int var11 = class362.field4859.field9513[0];
        if (var9 < 0 || class142.field1574 <= var9 || var11 < 0 || class140.field1550 <= var11) {
            return false;
        } else if (arg6 >= 0 && class142.field1574 > arg6 && arg8 >= 0 && class140.field1550 > arg8) {
            int var12 = class20.method94(arg8, class68.field682, arg1, arg0, class220.field2623, arg7, arg2, class282.field3534[class362.field4859.field5166], class362.field4859.method1414(-31789), var9, var11, (byte) -57, arg6, arg3, arg4);
            if (var12 < 1) {
                return false;
            }
            class248.field3078 = class68.field682[var12 - 1];
            class184.field2065 = class220.field2623[var12 - 1];
            class556.field7946 = false;
            class255.method1515(15);
            return true;
        } else {
            return false;
        }
    }
}
