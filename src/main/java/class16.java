import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class16 extends class96 {

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Llu;")
    public class482 field234;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "[I")
    public static int[] field233 = new int[2];

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!l", name = "H", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Llu;)V", line = 5)
    public class16(class482 arg0) {
        this.field234 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(B)V", line = 13)
    public static void method118(byte arg0) {
        field233 = null;
        if (arg0 != -32) {
            method120(35);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIILeq;I)V", line = 25)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, class134 arg4, int arg5) {
        field235++;
        arg4.method810(arg0, arg1, arg0 + arg5, arg1 + arg2);
        arg4.method801(arg3 - 6625, arg5, arg1, -16777216, arg0, arg2);
        if (class389.field5768 < 100) {
            return;
        }
        float var6 = (float) class249.field3597 / (float) class249.field3588;
        int var7 = arg5;
        int var8 = arg2;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg5 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg1;
        int var10 = (arg5 - var7) / 2 + arg0;
        if (class12.field198 == null || arg5 != class12.field198.method93() || class12.field198.method85() != arg2) {
            class249.method1565(class249.field3584, class249.field3604 + class249.field3597, class249.field3584 - -class249.field3588, class249.field3604, var10, var9, var10 + var7, var8 + var9);
            class249.method1557(arg4);
            class12.field198 = arg4.method780(var10, var9, var7, var8, false);
        }
        class12.field198.method1845(var10, var9);
        int var11 = class107.field1434 * var7 / class249.field3588;
        int var12 = class334.field4851 * var8 / class249.field3597;
        int var13 = var10 + (class223.field3155 * var7 / class249.field3588);
        int var14 = var8 + var9 - var12 - class337.field4905 * var8 / class249.field3597;
        int var15 = -1996554240;
        if (class28.field486 == class156.field1996) {
            var15 = -1996488705;
        }
        arg4.method770(var13, var14, var11, var12, var15, 1);
        arg4.method738(var13, var14, var11, var12, var15, arg3);
        if (class440.field6432 <= 0) {
            return;
        }
        int var16;
        if (class135.field1729 > 50) {
            var16 = (100 - class135.field1729) * 5;
        } else {
            var16 = class135.field1729 * 5;
        }
        for (class410 var17 = (class410) class249.field3582.method2096(-21400); var17 != null; var17 = (class410) class249.field3582.method2084((byte) 19)) {
            class170 var18 = class249.field3573.method282(var17.field6017, 64);
            if (class440.method2576(255, var18)) {
                if (class440.field6424 == var17.field6017) {
                    int var19 = var10 + (var17.field6009 * var7 / class249.field3588);
                    int var20 = (class249.field3597 - var17.field6014) * var8 / class249.field3597 + var9;
                    arg4.method801(-6625, 4, var20 - 2, var16 << 24 | 0xFFFF00, var19 - 2, 4);
                } else if (class33.field540 != -1 && class33.field540 == var18.field2242) {
                    int var21 = var10 + (var17.field6009 * var7 / class249.field3588);
                    int var22 = (class249.field3597 - var17.field6014) * var8 / class249.field3597 + var9;
                    arg4.method801(-6625, 4, var22 - 2, var16 << 24 | 0xFFFF00, var21 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 118)
    public static final void method120(int arg0) {
        if (arg0 != -18343) {
            method118((byte) -9);
        }
        for (int var1 = 0; var1 < class389.field5771; var1++) {
            int var2 = class93.field1257[var1];
            class139 var3 = class504.field7697[var2];
            int var4 = class234.field3288.method941((byte) 123);
            if ((var4 & 0x4) != 0) {
                var4 += class234.field3288.method941((byte) 127) << 8;
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class234.field3288.method953((byte) -40);
                int var6 = class234.field3288.method941((byte) 127);
                var3.method1766(arg0 + 18343, var5, var6, class263.field3748);
                var3.field4252 = class263.field3748 + 300;
                var3.field4248 = class234.field3288.method939(49510128);
            }
            if ((var4 & 0x1) != 0) {
                var3.field4246 = class234.field3288.method981(false);
                var3.field4184 = 100;
            }
            if ((var4 & 0x100) != 0) {
                var3.field1831 = class234.field3288.method993((byte) -121);
                var3.field1829 = class234.field3288.method993((byte) -36);
            }
            if ((var4 & 0x10) != 0) {
                var3.field4222 = class234.field3288.method993((byte) -112);
                if (var3.field4222 == 65535) {
                    var3.field4222 = -1;
                }
            }
            if ((var4 & 0x2000) != 0) {
                var3.field4181 = class234.field3288.method946(arg0 ^ 0xFFFFB83F);
                var3.field4202 = class234.field3288.method976((byte) 26);
                var3.field4210 = class234.field3288.method976((byte) 26);
                var3.field4234 = class234.field3288.method994(128);
                var3.field4225 = class234.field3288.method955((byte) -126) + class263.field3748;
                var3.field4254 = class234.field3288.method993((byte) -83) + class263.field3748;
                var3.field4237 = class234.field3288.method996(8);
                var3.field4234 += var3.field4282[0];
                var3.field4274 = 0;
                var3.field4181 += var3.field4279[0];
                var3.field4277 = 1;
                var3.field4210 += var3.field4279[0];
                var3.field4202 += var3.field4282[0];
            }
            if ((var4 & 0x40) != 0) {
                int var7 = class234.field3288.method953((byte) -40);
                int var8 = class234.field3288.method939(49510128);
                var3.method1766(arg0 ^ 0xFFFFB859, var7, var8, class263.field3748);
            }
            if ((var4 & 0x8) != 0) {
                int var9 = class234.field3288.method955((byte) -126);
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = class234.field3288.method950(186);
                int var11 = class234.field3288.method980(-19443);
                var3.method1774(false, var9, var11, var10, -48);
            }
            if ((var4 & 0x200) != 0) {
                int var12 = class234.field3288.method955((byte) -125);
                var3.field4182 = class234.field3288.method941((byte) 124);
                var3.field4233 = class234.field3288.method941((byte) 123);
                var3.field4236 = (var12 & 0x8000) != 0;
                var3.field4188 = var12 & 0x7FFF;
                var3.field4205 = class263.field3748 + var3.field4188 + var3.field4182;
            }
            if ((var4 & 0x1000) != 0) {
                var3.field4244 = class234.field3288.method946(50);
                var3.field4260 = class234.field3288.method994(128);
                var3.field4192 = class234.field3288.method976((byte) 26);
                var3.field4230 = (byte) class234.field3288.method996(8);
                var3.field4239 = class263.field3748 + class234.field3288.method963(arg0 + 18220);
                var3.field4259 = class263.field3748 + class234.field3288.method955((byte) -127);
            }
            if ((var4 & 0x80) != 0) {
                int var13 = class234.field3288.method963(-124);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class234.field3288.method980(-19443);
                class403.method2417(var13, var3, var14, 96);
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field1825.method1662(arg0 ^ 0xFFFFB859)) {
                    class286.method1733(var3, 84);
                }
                var3.method876(0, class508.field7744.method565(27114, class234.field3288.method963(-120)));
                var3.method1769(var3.field1825.field3806, 0);
                var3.field4226 = var3.field1825.field3789 << 3;
                if (var3.field1825.method1662(0)) {
                    class204.method1256(var3.field2956, 0, null, var3, true, var3.field4279[0], null, var3.field4282[0]);
                }
            }
            if ((var4 & 0x400) != 0) {
                int var15 = class234.field3288.method955((byte) -127);
                int var16 = class234.field3288.method977((byte) 99);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var17 = class234.field3288.method939(arg0 ^ 0xFD0CCEA9);
                var3.method1774(true, var15, var17, var16, -119);
            }
            if ((var4 & 0x800) != 0) {
                int var18 = class234.field3288.method939(49510128);
                int[] var19 = new int[var18];
                int[] var20 = new int[var18];
                int[] var21 = new int[var18];
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = class234.field3288.method985(-46);
                    if (var23 == 65535) {
                        var23 = -1;
                    }
                    var19[var22] = var23;
                    var20[var22] = class234.field3288.method941((byte) 127);
                    var21[var22] = class234.field3288.method993((byte) -83);
                }
                class43.method317(var20, true, var3, var19, var21);
            }
        }
        field237++;
    }
}
