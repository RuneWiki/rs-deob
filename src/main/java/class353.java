import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class353 implements class162 {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "Lkc;")
    public static class157 field5112 = new class157("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 4)
    public static final void method2116(String arg0, boolean arg1) {
        field5111++;
        if (class379.field5448 == null) {
            class411.method2417((byte) 41);
        }
        String[] var2 = class139.method982('\n', (byte) 10, arg0);
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class9.field110; var4 > 0; var4--) {
                class379.field5448[var4] = class379.field5448[var4 - 1];
            }
            class379.field5448[0] = var2[var3];
            if (class9.field110 < class379.field5448.length - 1) {
                class9.field110++;
                if (class343.field4961 > 0) {
                    class343.field4961++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(JLde;B[I)Ljava/lang/String;", line = 46)
    public final String method1137(long arg0, class10 arg1, byte arg2, int[] arg3) {
        field5115++;
        if (class487.field7045 == arg1) {
            class488 var6 = class196.field2877.method1243(arg3[0], (byte) -119);
            return var6.method2894((int) arg0, false);
        } else if (arg2 != -108) {
            return null;
        } else if (class320.field4401 == arg1 || class7.field97 == arg1) {
            class297 var7 = class534.field7872.method3089((int) arg0, 125);
            return var7.field4068;
        } else if (class246.field3360 == arg1 || class518.field7613 == arg1 || class201.field2921 == arg1) {
            return class196.field2877.method1243(arg3[0], (byte) -106).method2894((int) arg0, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)I", line = 89)
    public static final int method2117(int arg0, int arg1) {
        field5114++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFFF0) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var2 < var4) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        if (arg0 != 8) {
            return -11;
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 & 0xFF) >> 2 << 10) - (-(var21 >> 5 << 7) - (var22 >> 1));
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "()V", line = 190)
    public static final void method2118() {
        class113.field1823 = 0;
        label212: for (int var0 = 0; var0 < class349.field5072; var0++) {
            class182 var1 = class280.field3809[var0];
            if (class451.field6613 != null) {
                for (int var2 = 0; var2 < class451.field6613.length; var2++) {
                    if (class451.field6613[var2] != -1000000 && (var1.field2709 <= class451.field6613[var2] || var1.field2697 <= class451.field6613[var2]) && (var1.field2711 <= class400.field5735[var2] || var1.field2714 <= class400.field5735[var2]) && (var1.field2711 >= class422.field6136[var2] || var1.field2714 >= class422.field6136[var2]) && (var1.field2716 <= class509.field7456[var2] || var1.field2704 <= class509.field7456[var2]) && (var1.field2716 >= class476.field6880[var2] || var1.field2704 >= class476.field6880[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field2699 == 1) {
                int var3 = var1.field2700 + class282.field3832 - class39.field578;
                if (var3 >= 0 && var3 <= class282.field3832 + class282.field3832) {
                    int var4 = var1.field2713 + class282.field3832 - class119.field1859;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class282.field3832 + class282.field3832) {
                        continue;
                    }
                    int var5 = var1.field2705 + class282.field3832 - class119.field1859;
                    if (var5 > class282.field3832 + class282.field3832) {
                        var5 = class282.field3832 + class282.field3832;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class223.field3153[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class104.field1714 - var1.field2711;
                        if (var7 > class382.field5488) {
                            var1.field2707 = 1;
                        } else {
                            if (var7 >= -class382.field5488) {
                                continue;
                            }
                            var1.field2707 = 2;
                            var7 = -var7;
                        }
                        var1.field2698 = (var1.field2716 - class257.field3495 << 8) / var7;
                        var1.field2715 = (var1.field2704 - class257.field3495 << 8) / var7;
                        var1.field2712 = (var1.field2709 - class41.field611 << 8) / var7;
                        var1.field2701 = (var1.field2697 - class41.field611 << 8) / var7;
                        class274.field3725[class113.field1823++] = var1;
                    }
                }
            } else if (var1.field2699 == 2) {
                int var8 = var1.field2713 + class282.field3832 - class119.field1859;
                if (var8 >= 0 && var8 <= class282.field3832 + class282.field3832) {
                    int var9 = var1.field2700 + class282.field3832 - class39.field578;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class282.field3832 + class282.field3832) {
                        continue;
                    }
                    int var10 = var1.field2703 + class282.field3832 - class39.field578;
                    if (var10 > class282.field3832 + class282.field3832) {
                        var10 = class282.field3832 + class282.field3832;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class223.field3153[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class257.field3495 - var1.field2716;
                        if (var12 > class382.field5488) {
                            var1.field2707 = 3;
                        } else {
                            if (var12 >= -class382.field5488) {
                                continue;
                            }
                            var1.field2707 = 4;
                            var12 = -var12;
                        }
                        var1.field2710 = (var1.field2711 - class104.field1714 << 8) / var12;
                        var1.field2708 = (var1.field2714 - class104.field1714 << 8) / var12;
                        var1.field2712 = (var1.field2709 - class41.field611 << 8) / var12;
                        var1.field2701 = (var1.field2697 - class41.field611 << 8) / var12;
                        class274.field3725[class113.field1823++] = var1;
                    }
                }
            } else if (var1.field2699 == 4) {
                int var13 = var1.field2709 - class41.field611;
                if (var13 > class445.field6552) {
                    int var14 = var1.field2713 + class282.field3832 - class119.field1859;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class282.field3832 + class282.field3832) {
                        continue;
                    }
                    int var15 = var1.field2705 + class282.field3832 - class119.field1859;
                    if (var15 > class282.field3832 + class282.field3832) {
                        var15 = class282.field3832 + class282.field3832;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field2700 + class282.field3832 - class39.field578;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class282.field3832 + class282.field3832) {
                        continue;
                    }
                    int var17 = var1.field2703 + class282.field3832 - class39.field578;
                    if (var17 > class282.field3832 + class282.field3832) {
                        var17 = class282.field3832 + class282.field3832;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class223.field3153[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field2707 = 5;
                        var1.field2710 = (var1.field2711 - class104.field1714 << 8) / var13;
                        var1.field2708 = (var1.field2714 - class104.field1714 << 8) / var13;
                        var1.field2698 = (var1.field2716 - class257.field3495 << 8) / var13;
                        var1.field2715 = (var1.field2704 - class257.field3495 << 8) / var13;
                        class274.field3725[class113.field1823++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIZ)V", line = 444)
    public static final void method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            field5112 = null;
        }
        field5113++;
        class314 var5 = class177.method1213(false, 10, arg1);
        var5.method1808(-7412);
        var5.field4259 = arg2;
        var5.field4253 = arg0;
        var5.field4246 = arg3;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 460)
    public static void method2120(byte arg0) {
        if (arg0 != -9) {
            method2118();
        }
        field5112 = null;
    }
}
