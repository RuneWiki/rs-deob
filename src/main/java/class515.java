import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class515 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lhia;")
    public class72 field7049 = new class72();

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field7046 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7045 = new BigInteger("952b9b4dee13fb995ac5e3e88183d143c3c5988d3af155e9c1134ba1ce36408d087d06fcd09fa6a2b7209a1348ccc35af3b440db87c92aab0eb4455d5f8007fbbd9d5d074a61ef0a1c53d869805e6d64ed52ea9b11853dcac93ac258cc2284a311e5688b1312bec6e9c2025f9f9758faa6cc0f96849d2727dd5f0f139a872a106cd5ff5fda8612c79cef29a0511e25449bb476c8fd37e79d097c3294563d9922d37d1dcc48268e0654dd9baf8f825865489976cfa0ca9c511cb4813284732a6f3ea79483c6815f5dfef27ab45c3195988f29b3a10d7a1b6891ae488274d9247a6a75faab92dd000a50f7836ebdcc76923e21881f0388ace393022a436183b177dba0b47dc1eee7293f76ae015a0dc5438b77e3146b55b489d744ac6bbb2551f5d60a11e4be3c97a2ed3bc3652f07ec97be74001a3d2c573efef1f855fdc0fe3a725863de691b5d7e9523915c880133df49171f97e90235f7fc621dde2bab861f6fea708217f1bb8e243b24a999a018c6abe3763f36b99fa73fa1becfe3938dd9c2a689ec07d1b7d8f51f597de5188a57117b127d8520fdd463c0029700e02f62900a6a6610d58a5e498b19963df41614388a92485892791d03f2371485486b9f375753adface025134647eeaa31268ef7cbaaae2abaca42a3fe2cede731d47ecbaf59b19a1daa6eef8c0635740686f896db83539abe835815103b63b17c7554f", 16);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "B")
    public static byte field7047;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field7051;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ef", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field7052;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2996(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Lrh;", line = 4)
    public static final class279 method2991(int arg0, int arg1, int arg2) {
        class243 var3 = class626.field8501[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class279 var4 = var3.field3278;
            var3.field3278 = null;
            class745.method4126(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z", line = 17)
    public static final boolean method2992(int arg0, int arg1, int arg2) {
        field7050++;
        if (arg0 != 11816) {
            method2995(-12);
        }
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lvc;", line = 28)
    public static final class337 method2993(int arg0, int arg1) {
        field7048++;
        return arg0 == -3 ? new class337(arg1, false) : null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lha;II)Z", line = 48)
    public static final boolean method2994(class65 arg0, int arg1, int arg2) {
        field7051++;
        int var3 = (class597.field8132 - 104) / 2;
        int var4 = (class628.field8800 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < (var3 + 104); var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg1; var58 <= 3; var58++) {
                    if (class349.method2202(var57, var6, arg1, false, var58)) {
                        int var59 = var58;
                        if (class74.method661(var6, var57, 1)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class772.method4274(64, var57, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class267.field3939 = arg0.method499(512, var7, true, 0, 512, 512);
        class442.method2662((byte) 35);
        int var9 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - (-((int) (Math.random() * 20.0D)) + -238) - 10 | 0xFF000000;
        int var10 = (((int) (Math.random() * 20.0D)) + 238) - 10 | 0xFF00 << 16;
        if (arg2 != -3) {
            method2995(49);
        }
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class18.field263 + 1 + 2][class18.field263 + 3];
        for (int var13 = var3; var13 < var3 + 104; var13 += class18.field263) {
            for (int var36 = var4; var36 < (var4 + 104); var36 += class18.field263) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var37 += 4;
                    var39 = var13 - 1;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = class18.field263 + var13;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = var36 + class18.field263;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg0.method456(0, 0, class18.field263 * 4 + var37, class18.field263 * 4 + var38);
                arg0.method458(-16777216);
                for (int var43 = arg1; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class18.field263; var50++) {
                        for (int var56 = 0; var56 <= class18.field263; var56++) {
                            var12[var50][var56] = class349.method2202(var40 + var56, var39 - -var50, arg1, false, var43);
                        }
                    }
                    class412.field5933[var43].method1153(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class697.field9777) {
                        for (int var51 = -4; var51 < class18.field263; var51++) {
                            for (int var52 = -4; var52 < class18.field263; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class349.method2202(var54, var53, arg1, false, var43)) {
                                    int var55 = var43;
                                    if (class74.method661(var53, var54, 1)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class664.method3676(var54, var37 + (var51 * 4), arg0, var38 + ((class18.field263 - var52) * 4) - 4, var55, var53, var9, -4, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class697.field9777) {
                    class502 var44 = class514.field7038[arg1];
                    for (int var45 = 0; var45 < class18.field263; var45++) {
                        for (int var46 = 0; var46 < class18.field263; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field6957[var47 - var44.field6941][var48 - var44.field6935];
                            if ((var49 & 0x40240000) != 0) {
                                arg0.method462(-119, 4, (class18.field263 - var46) * 4 + var38 - 4, 4, var45 * 4 + var37, -1713569622);
                            } else if ((var49 & 0x800000) != 0) {
                                arg0.method514(var38 + ((class18.field263 - var46) * 4) - 4, var45 * 4 + var37, -1713569622, 4, (byte) -92);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg0.method502(4, arg2 ^ 0x7E, var45 * 4 + var37 + 3, (class18.field263 - var46) * 4 + var38 + -4, -1713569622);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg0.method514(var38 + ((class18.field263 - var46) * 4) + 3 - 4, var45 * 4 + var37, -1713569622, 4, (byte) -86);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg0.method502(4, 107, var45 * 4 + var37, (-var46 + class18.field263) * 4 + -4 + var38, -1713569622);
                            }
                        }
                    }
                }
                arg0.method563(var37, var38, class18.field263 * 4, class18.field263 * 4, var11, 2);
                class267.field3939.method1082(((var13 - var3) * 4) + 48, -((-var4 + var36) * 4) - class18.field263 * 4 + 464, class18.field263 * 4, class18.field263 * 4, var37, var38);
            }
        }
        arg0.method543();
        arg0.method458(-16777215);
        class229.method1502(0);
        class747.field10302 = 0;
        class234.field3170.method2549(-64);
        if (!class697.field9777) {
            for (int var14 = var3; var14 < (var3 + 104); var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg1; (arg1 + 1) >= var21 && var21 <= 3; var21++) {
                        if (class349.method2202(var20, var14, arg1, false, var21)) {
                            class392 var22 = (class392) class119.method988(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class392) class771.method4264(var21, var14, var20, field7052 == null ? (field7052 = method2996("he")) : field7052);
                            }
                            if (var22 == null) {
                                var22 = (class392) class94.method752(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class392) class471.method2772(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class589 var23 = class350.field5132.method3732((byte) 92, var22.method31(-23356));
                                if (!var23.field7895 || class196.field2619) {
                                    int var24 = var23.field7878;
                                    if (var23.field7865 != null) {
                                        for (int var25 = 0; var25 < var23.field7865.length; var25++) {
                                            if (var23.field7865[var25] != -1) {
                                                class589 var26 = class350.field5132.method3732((byte) 52, var23.field7865[var25]);
                                                if (var26.field7878 >= 0) {
                                                    var24 = var26.field7878;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class680 var28 = class495.field6846.method2232(var24, -127);
                                            if (var28 != null && var28.field9503) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class514.field7038[var21].field6957;
                                            int var32 = class514.field7038[var21].field6941;
                                            int var33 = class514.field7038[var21].field6935;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var14 - 3 < var29 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && (var3 + 103) > var29 && var14 + 3 > var29 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var4 < var30 && (var20 - 3) < var30 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var30 < (var4 + 103) && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class788.field10850[class747.field10302] = var23.field7856;
                                        class126.field1901[class747.field10302] = var29;
                                        class775.field10670[class747.field10302] = var30;
                                        class747.field10302++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class217.field2906 != null) {
                class637.field8871.field4844 = 1;
                class495.field6846.method2234(1024, 1, 64);
                for (int var15 = 0; var15 < class217.field2906.field7064; var15++) {
                    int var16 = class217.field2906.field7065[var15];
                    if (var16 >> 28 == class551.field7456.field2250) {
                        int var17 = ((var16 & 0xFFFEE16) >> 14) - class121.field1765;
                        int var18 = (var16 & 0x3FFF) - class230.field3147;
                        if (var17 >= 0 && class597.field8132 > var17 && var18 >= 0 && var18 < class628.field8800) {
                            class234.field3170.method2545(-128, new class119(var15));
                        } else {
                            class680 var19 = class495.field6846.method2232(class217.field2906.field7066[var15], 101);
                            if (var19.field9539 != null && (var19.field9544 + var17) >= 0 && class597.field8132 > var19.field9516 + var17 && (var18 + var19.field9504) >= 0 && (var19.field9514 + var18) < class628.field8800) {
                                class234.field3170.method2545(-126, new class119(var15));
                            }
                        }
                    }
                }
                class495.field6846.method2234(128, arg2 ^ 0xFFFFFFFC, 64);
                class637.field8871.field4844 = 2;
                class637.field8871.method2119(false);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 494)
    public static void method2995(int arg0) {
        field7045 = null;
        int var1 = -39 % ((2 - arg0) / 46);
    }
}
