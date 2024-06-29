import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class297 extends class362 {

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "[Ltf;")
    public class297[] field4164;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "Z")
    public boolean field4178;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "Leq;")
    public static class213 field4174 = new class213(32);

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Lqk;")
    public class16 field4165;

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "Lafa;")
    public class346 field4166;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "Lcba;")
    public static class550 field4175;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lcea;I)Lgfa;", line = 10)
    public static final class748 method1946(class215 arg0, int arg1) {
        field4159++;
        return arg1 > -4 ? null : new class748(arg0.method1520(13638), arg0.method1520(13638), arg0.method1520(13638), arg0.method1520(13638), arg0.method1499(-1), arg0.method1499(-1), arg0.method1535(255));
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I", line = 21)
    public int method1169(int arg0) {
        if (arg0 >= -113) {
            this.method1951(-125, -85, 60);
        }
        field4160++;
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 33)
    public static final void method1947(int arg0) {
        field4177++;
        int var1 = 0;
        if (class693.field9368.field4427.method3195(-32350) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (~class693.field9368.field4432.method887(-32350) == arg0) {
            var1 |= 0x40;
        }
        class390.method2444(var1, arg0);
        class76.field1366.method1684(var1, (byte) 109);
        class721.field9801.method164(var1, (byte) -125);
        class510.field7099.method1335(-25032, var1);
        class104.field1840.method3014(119, var1);
        class101.method943(var1, ~arg0);
        class537.method3091(var1, true);
        class239.method1661(var1, arg0 + 1227);
        class616.method3494(14056, var1);
        class717.method3997((byte) -106);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BII)[[I", line = 66)
    public final int[][] method1948(byte arg0, int arg1, int arg2) {
        field4172++;
        int var4 = 9 / ((6 - arg0) / 37);
        if (this.field4164[arg2].field4178) {
            int[] var5 = this.field4164[arg2].method15(arg1, 255);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field4164[arg2].method18(arg1, -1564599039);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V", line = 100)
    public static void method1949(boolean arg0) {
        field4175 = null;
        if (!arg0) {
            method1946(null, -43);
        }
        field4174 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)V", line = 112)
    public static final void method1950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4163++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg4 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 + arg4) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (class58.field1150 <= arg2 && class479.field6682 >= arg2) {
            int[] var39 = class691.field9345[arg2];
            int var40 = class486.method2865(class536.field7419, arg1 - arg0, class140.field2314, 77);
            int var41 = class486.method2865(class536.field7419, arg0 + arg1, class140.field2314, -68);
            int var42 = class486.method2865(class536.field7419, arg1 - var11, class140.field2314, arg3 - 115);
            int var43 = class486.method2865(class536.field7419, arg1 + var11, class140.field2314, 97);
            class47.method550(-27, var42, var39, var40, arg6);
            class47.method550(-27, var43, var39, var42, arg5);
            class47.method550(-27, var41, var39, var43, arg6);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var37 += var30;
                        var10++;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var25 += -var38;
                var26 += -var34;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var8++;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var31 += var28;
                var8++;
                var35 += var28;
            }
            var23 += -var36;
            var24 += -var32;
            var9--;
            var32 -= var27;
            var36 -= var27;
            int var45 = arg2 - var9;
            int var46 = arg2 + var9;
            if (class58.field1150 <= var46 && var45 <= class479.field6682) {
                int var47 = class486.method2865(class536.field7419, arg1 + var8, class140.field2314, 36);
                int var48 = class486.method2865(class536.field7419, arg1 - var8, class140.field2314, 97);
                if (var44) {
                    int var49 = class486.method2865(class536.field7419, arg1 + var10, class140.field2314, arg3 ^ 0xFFFFFFA3);
                    int var50 = class486.method2865(class536.field7419, arg1 - var10, class140.field2314, 32);
                    if (var45 >= class58.field1150) {
                        int[] var51 = class691.field9345[var45];
                        class47.method550(-27, var50, var51, var48, arg6);
                        class47.method550(-27, var49, var51, var50, arg5);
                        class47.method550(arg3 - 26, var47, var51, var49, arg6);
                    }
                    if (class479.field6682 >= var46) {
                        int[] var52 = class691.field9345[var46];
                        class47.method550(arg3 ^ 0x1A, var50, var52, var48, arg6);
                        class47.method550(-27, var49, var52, var50, arg5);
                        class47.method550(-27, var47, var52, var49, arg6);
                    }
                } else {
                    if (class58.field1150 <= var45) {
                        class47.method550(-27, var47, class691.field9345[var45], var48, arg6);
                    }
                    if (var46 <= class479.field6682) {
                        class47.method550(-27, var47, class691.field9345[var46], var48, arg6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(II)[I", line = 318)
    public int[] method15(int arg0, int arg1) {
        if (arg1 == 255) {
            field4168++;
            throw new IllegalStateException("This operation does not have a monochrome output");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)I", line = 329)
    public int method1187(int arg0) {
        field4170++;
        if (arg0 != -1) {
            this.field4166 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 341)
    public void method711(int arg0) {
        if (arg0 <= 108) {
            this.field4165 = null;
        }
        field4162++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V", line = 353)
    public void method1184(int arg0, int arg1, int arg2) {
        field4176++;
        int var4 = ~this.field4169 == arg2 ? arg1 : this.field4169;
        if (this.field4178) {
            this.field4165 = new class16(var4, arg1, arg0);
        } else {
            this.field4166 = new class346(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 373)
    public void method1170(byte arg0) {
        field4171++;
        if (arg0 > -102) {
            this.method1170((byte) -112);
        }
        if (this.field4178) {
            this.field4165.method126((byte) 124);
            this.field4165 = null;
        } else {
            this.field4166.method2181(6144);
            this.field4166 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(II)[[I", line = 400)
    public int[][] method18(int arg0, int arg1) {
        field4173++;
        if (arg1 != -1564599039) {
            this.method1951(-4, -64, 20);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(III)[I", line = 415)
    public final int[] method1951(int arg0, int arg1, int arg2) {
        field4167++;
        if (arg1 != 633706337) {
            this.field4165 = null;
        }
        return this.field4164[arg2].field4178 ? this.field4164[arg2].method15(arg0, arg1 - 633706082) : this.field4164[arg2].method18(arg0, -1564599039)[0];
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lcea;II)V", line = 448)
    public void method17(class215 arg0, int arg1, int arg2) {
        field4161++;
        if (arg2 != 31015) {
            method1947(-16);
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IZ)V", line = 458)
    public class297(int arg0, boolean arg1) {
        this.field4164 = new class297[arg0];
        this.field4178 = arg1;
    }
}
