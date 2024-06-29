import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class306 extends class271 {

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "Lkl;")
    public class123 field5228;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "Lwa;")
    private static class75 field5221 = class66.method560("Unable to find ", false);

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "Lwa;")
    public static class75 field5222 = class66.method560("<col=00ffff>", false);

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "Lwa;")
    public static class75 field5223 = field5221;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lwa;")
    public static class75 field5226 = class66.method560("document)3cookie=(R", false);

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lwa;")
    public static class75 field5224 = class66.method560("Versteckt", false);

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Ljm;")
    public static class223 field5231 = new class223();

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Z")
    public static boolean field5235 = false;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "[S")
    public static short[] field5233;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILwa;)V", line = 20)
    public static final void method2099(int arg0, class75 arg1) {
        field5234++;
        if (class250.field4201 >= 2) {
            if (arg1.method614(class132.field2285, -66)) {
                class100.method771(-97);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class162.method1216((byte) 38, 0, class66.method562((byte) -115, new class75[] { class164.field2782, class67.method565(83, var4), class41.field634 }), (class75) null);
            }
            if (arg1.method614(class200.field3381, -66)) {
                System.out.println("oncard_geometry:" + class119.field2007);
                System.out.println("oncard_2d:" + class119.field2005);
                System.out.println("oncard_texture:" + class119.field2008);
            }
            if (arg1.method614(class177.field2984, -66)) {
                class10.method50(1);
            }
            if (arg1.method614(class140.field2430, -66)) {
                class52.method380(102, 25);
            }
            if (arg1.method614(class233.field3952, -66)) {
                class73.field1228 = true;
            }
            if (arg1.method614(class61.field1087, -66)) {
                class73.field1228 = false;
            }
            if (arg1.method614(class178.field3010, -66)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class286.field4931[var5].field1766[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method638(class100.field1653, (byte) -112) && class265.field4574 != 0) {
                class301.method2070(arg1.method650(0, 6).method647((byte) -60), true);
            }
            if (arg1.method614(class9.field117, -66) && class265.field4574 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method638(class53.field870, (byte) -112)) {
                class85.field1392 = arg1.method650(0, 12).method649(255).method647((byte) -60);
                class162.method1216((byte) 38, 0, class66.method562((byte) 117, new class75[] { class125.field2114, class67.method565(117, class85.field1392) }), (class75) null);
            }
            if (arg1.method614(class189.field3151, -66)) {
                class214.field3662 = true;
            }
            if (arg1.method660(class178.field3008, -124)) {
                if (class299.field5117 == null) {
                    class100.method770(1024, 768, true);
                } else {
                    class28.method183((byte) 101);
                }
            }
        }
        class89.field1470.method87(65280, 110);
        if (arg0 <= 12) {
            method2099(-91, (class75) null);
        }
        class89.field1470.method518(113, arg1.method640(1) - 1);
        class276.field4744++;
        class89.field1470.method516((byte) -20, arg1.method650(0, 2));
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V", line = 153)
    public static final void method2100(int arg0) {
        field5236++;
        if (arg0 != 26534) {
            method2101(66, 29, 14, -45, -83, -8);
        }
        class213.field3626.method1201(-20111);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIII)V", line = 187)
    public static final void method2101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5225++;
        long var6 = class230.method1684(arg3, arg4, arg5);
        if (arg2 != 512) {
            return;
        }
        if (var6 != 0L) {
            int var8 = arg0;
            if (var6 > 0L) {
                var8 = arg1;
            }
            int var9 = ((int) var6 & 0x7F2A4) >> 14;
            int var10 = (int) var6 >> 20 & 0x3;
            int[] var11 = class44.field721;
            int var12 = (103 - arg5) * 4 * 512 + (arg4 * 4) + 24624;
            int var13 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class108 var14 = class3.method14((byte) 83, var13);
            if (var14.field1830 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var10 == 0) {
                        var11[var12] = var8;
                        var11[var12 + 512] = var8;
                        var11[var12 + 1024] = var8;
                        var11[var12 + 1536] = var8;
                    } else if (var10 == 1) {
                        var11[var12] = var8;
                        var11[var12 + 1] = var8;
                        var11[var12 + 2] = var8;
                        var11[var12 + 3] = var8;
                    } else if (var10 == 2) {
                        var11[var12 + 3] = var8;
                        var11[var12 + 3 + 512] = var8;
                        var11[var12 + 1024 + 3] = var8;
                        var11[var12 + 1539] = var8;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var8;
                        var11[var12 + 1536 + 1] = var8;
                        var11[var12 + 1536 + 2] = var8;
                        var11[var12 + 3 + 1536] = var8;
                    }
                }
                if (var9 == 3) {
                    if (var10 == 0) {
                        var11[var12] = var8;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var8;
                    } else if (var10 == 2) {
                        var11[var12 + 3 + 1536] = var8;
                    } else if (var10 == 3) {
                        var11[var12 + 1536] = var8;
                    }
                }
                if (var9 == 2) {
                    if (var10 == 3) {
                        var11[var12] = var8;
                        var11[var12 + 512] = var8;
                        var11[var12 + 1024] = var8;
                        var11[var12 + 1536] = var8;
                    } else if (var10 == 0) {
                        var11[var12] = var8;
                        var11[var12 + 1] = var8;
                        var11[var12 + 2] = var8;
                        var11[var12 + 3] = var8;
                    } else if (var10 == 1) {
                        var11[var12 + 3] = var8;
                        var11[var12 + 515] = var8;
                        var11[var12 + 1027] = var8;
                        var11[var12 + 1539] = var8;
                    } else if (var10 == 2) {
                        var11[var12 + 1536] = var8;
                        var11[var12 + 1536 + 1] = var8;
                        var11[var12 + 1536 + 2] = var8;
                        var11[var12 + 1539] = var8;
                    }
                }
            } else {
                class68 var15 = null;
                if (!var14.field1852) {
                    var15 = class272.field4698[var14.field1830];
                } else if (var10 == 0) {
                    var15 = class272.field4698[var14.field1830];
                } else if (var10 == 1) {
                    var15 = class116.field1957[var14.field1830];
                } else if (var10 == 2) {
                    var15 = class301.field5144[var14.field1830];
                } else if (var10 == 3) {
                    var15 = class205.field3476[var14.field1830];
                }
                if (var15 != null) {
                    int var16 = (var14.field1856 * 4 - var15.field4007) / 2;
                    int var17 = (var14.field1837 * 4 - var15.field3999) / 2;
                    var15.method351(arg4 * 4 + var16 + 48, (-arg5 + 104 + -var14.field1837) * 4 + 48 + var17);
                }
            }
        }
        long var18 = class237.method1719(arg3, arg4, arg5);
        if (var18 != 0L) {
            int var20 = ((int) var18 & 0x331EA8) >> 20;
            int var21 = (int) (var18 >>> 32) & Integer.MAX_VALUE;
            int var22 = ((int) var18 & 0x7E0B8) >> 14;
            class108 var23 = class3.method14((byte) 83, var21);
            if (var23.field1830 != -1) {
                class68 var27 = null;
                if (!var23.field1852) {
                    var27 = class272.field4698[var23.field1830];
                } else if (var20 == 0) {
                    var27 = class272.field4698[var23.field1830];
                } else if (var20 == 1) {
                    var27 = class116.field1957[var23.field1830];
                } else if (var20 == 2) {
                    var27 = class301.field5144[var23.field1830];
                } else if (var20 == 3) {
                    var27 = class205.field3476[var23.field1830];
                }
                if (var27 != null) {
                    int var28 = (var23.field1837 * 4 - var27.field3999) / 2;
                    int var29 = (var23.field1856 * 4 - var27.field4007) / 2;
                    var27.method351(48 - (-(arg4 * 4) - var29), 48 - (-((104 - arg5 + -var23.field1837) * 4) + -var28));
                }
            } else if (var22 == 9) {
                int var24 = 15658734;
                if (var18 > 0L) {
                    var24 = 15597568;
                }
                int var25 = (103 - arg5) * 4 * 512 + arg4 * 4 + 24624;
                int[] var26 = class44.field721;
                if (var20 == 0 || var20 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1024 + 1] = var24;
                    var26[var25 + 512 + 2] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 512 + 1] = var24;
                    var26[var25 + 1024 + 2] = var24;
                    var26[var25 + 1536 + 3] = var24;
                }
            }
        }
        long var30 = class196.method1463(arg3, arg4, arg5);
        if (var30 == 0L) {
            return;
        }
        int var32 = Integer.MAX_VALUE & (int) (var30 >>> 32);
        int var33 = (int) var30 >> 20 & 0x3;
        class108 var34 = class3.method14((byte) 83, var32);
        if (var34.field1830 == -1) {
            return;
        }
        class68 var35 = null;
        if (!var34.field1852) {
            var35 = class272.field4698[var34.field1830];
        } else if (var33 == 0) {
            var35 = class272.field4698[var34.field1830];
        } else if (var33 == 1) {
            var35 = class116.field1957[var34.field1830];
        } else if (var33 == 2) {
            var35 = class301.field5144[var34.field1830];
        } else if (var33 == 3) {
            var35 = class205.field3476[var34.field1830];
        }
        if (var35 != null) {
            int var36 = (var34.field1856 * 4 - var35.field4007) / 2;
            int var37 = (var34.field1837 * 4 - var35.field3999) / 2;
            var35.method351(arg4 * 4 + var36 + 48, (-var34.field1837 + 104 - arg5) * 4 + 48 + var37);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lkl;)V", line = 490)
    public class306(class123 arg0) {
        this.field5228 = arg0;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V", line = 513)
    public static void method2102(int arg0) {
        field5224 = null;
        field5226 = null;
        field5233 = null;
        if (arg0 != 18854) {
            method2102(-30);
        }
        field5231 = null;
        field5223 = null;
        field5222 = null;
        field5221 = null;
    }
}
