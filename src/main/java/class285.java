import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class285 {

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[I")
    public static int[] field4078 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field4075 = 0;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field4081 = 1;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "Lmo;")
    public static class336 field4079 = new class336(4);

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lvh;II)V")
    public static final void method1882(class84 arg0, int arg1, int arg2) {
        field4076++;
        boolean var3 = arg0.method712(false, 1) == 1;
        if (var3) {
            class441.field6265[class163.field2372++] = arg2;
        }
        int var4 = arg0.method712(false, 2);
        class39 var5 = class112.field1570[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field500 = -1;
            } else if (class168.field2432 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class320.field4514[arg2] = (var5.field5811[0] + class279.field4012 >> 6 << 14) + (var5.field4531 << 28) + (var5.field5807[0] + class189.field2810 >> 6);
                if (var5.field497 == -1) {
                    class389.field5382[arg2] = var5.field5772.method1849(-10543);
                } else {
                    class389.field5382[arg2] = var5.field497;
                }
                class317.field4463[arg2] = var5.field5748;
                if (var5.field517 > 0) {
                    class38.method235(5521, var5);
                }
                class112.field1570[arg2] = null;
                if (arg0.method712(false, 1) != 0) {
                    class131.method977(arg0, arg2, arg1 ^ 0x8);
                }
            }
        } else if (var4 == 1) {
            int var6 = arg0.method712(false, 3);
            int var7 = var5.field5811[0];
            int var8 = var5.field5807[0];
            if (var6 == 0) {
                var8--;
                var7--;
            } else if (var6 == 1) {
                var8--;
            } else if (var6 == 2) {
                var7++;
                var8--;
            } else if (var6 == 3) {
                var7--;
            } else if (var6 == 4) {
                var7++;
            } else if (var6 == 5) {
                var8++;
                var7--;
            } else if (var6 == 6) {
                var8++;
            } else if (var6 == 7) {
                var7++;
                var8++;
            }
            if (var3) {
                var5.field493 = var8;
                var5.field500 = var7;
            } else {
                var5.field500 = -1;
                var5.method248(var8, var7, class418.field5783[arg2], 123);
            }
        } else if (var4 == 2) {
            int var9 = arg0.method712(false, 4);
            int var10 = var5.field5811[0];
            int var11 = var5.field5807[0];
            if (var9 == 0) {
                var11 -= 2;
                var10 -= 2;
            } else if (var9 == 1) {
                var11 -= 2;
                var10--;
            } else if (var9 == 2) {
                var11 -= 2;
            } else if (var9 == 3) {
                var10++;
                var11 -= 2;
            } else if (var9 == 4) {
                var10 += 2;
                var11 -= 2;
            } else if (var9 == 5) {
                var10 -= 2;
                var11--;
            } else if (var9 == 6) {
                var11--;
                var10 += 2;
            } else if (var9 == 7) {
                var10 -= 2;
            } else if (var9 == 8) {
                var10 += 2;
            } else if (var9 == 9) {
                var11++;
                var10 -= 2;
            } else if (var9 == 10) {
                var11++;
                var10 += 2;
            } else if (var9 == 11) {
                var11 += 2;
                var10 -= 2;
            } else if (var9 == 12) {
                var11 += 2;
                var10--;
            } else if (var9 == 13) {
                var11 += 2;
            } else if (var9 == 14) {
                var10++;
                var11 += 2;
            } else if (var9 == 15) {
                var10 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field500 = var10;
                var5.field493 = var11;
            } else {
                var5.field500 = -1;
                var5.method248(var11, var10, class418.field5783[arg2], 124);
            }
        } else {
            int var12 = arg0.method712(false, 1);
            if (var12 == 0) {
                int var13 = arg0.method712(false, 12);
                int var14 = var13 >> 10;
                int var15 = (var13 & 0x3EB) >> 5;
                if (var15 > 15) {
                    var15 -= 32;
                }
                int var16 = var13 & 0x1F;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var5.field5811[0] + var15;
                int var18 = var5.field5807[0] + var16;
                if (var3) {
                    var5.field493 = var18;
                    var5.field500 = var17;
                } else {
                    var5.field500 = -1;
                    var5.method248(var18, var17, class418.field5783[arg2], arg1 + 133);
                }
                var5.field4531 = (byte) (var5.field4531 + var14 & 0x3);
                if (class168.field2432 == arg2) {
                    class387.field5306 = var5.field4531;
                }
            } else {
                int var19 = arg0.method712(false, 30);
                if (arg1 != -16) {
                    field4081 = 58;
                }
                int var20 = var19 >> 28;
                int var21 = (var19 & 0xFFFE299) >> 14;
                int var22 = var19 & 0x3FFF;
                int var23 = (class279.field4012 + var21 + var5.field5811[0] & 0x3FFF) - class279.field4012;
                int var24 = (var5.field5807[0] + var22 + class189.field2810 & 0x3FFF) - class189.field2810;
                if (var3) {
                    var5.field493 = var24;
                    var5.field500 = var23;
                } else {
                    var5.field500 = -1;
                    var5.method248(var24, var23, class418.field5783[arg2], 124);
                }
                var5.field4531 = (byte) (var5.field4531 + var20 & 0x3);
                if (class168.field2432 == arg2) {
                    class387.field5306 = var5.field4531;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
    public static void method1883(int arg0) {
        int var1 = -2 / ((arg0 - 74) / 35);
        field4078 = null;
        field4079 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static final void method1884(byte arg0) {
        field4080++;
        if (arg0 != -76) {
            method1882((class84) null, -64, -45);
        }
        for (int var1 = 0; var1 < class9.field71.length; var1++) {
            for (int var2 = 0; var2 < class9.field71[var1].length; var2++) {
                class9.field71[var1][var2] = class390.field5388;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method1885(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class382.method2325(arg7, arg5, 0, arg0, arg6, arg8, arg1, arg3, (byte) 99, arg4);
        if (arg2 != 84) {
            field4075 = 51;
        }
        field4077++;
    }
}
