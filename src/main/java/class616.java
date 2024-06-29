import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class616 extends class578 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field8798;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public int field8788;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[I")
    public int[] field8793;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "[Z")
    public boolean[] field8794;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "[I")
    public int[] field8790;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[[I")
    public int[][] field8791;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8799 = new String[] { method4544(method4543("r\"h\nA")), method4544(method4543("r\"h\rA")), method4544(method4543("knha\u0014")), method4544(method4543("~5*#")), method4544(method4543("r\"hs\u0000~)2qA")), method4544(method4543("r\"h\u000eA")), method4544(method4543("cz*=")), method4544(method4543("r\"h\u000bA")), method4544(method4543("r\"h\fA")) };

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lmv;")
    public static class125 field8787 = new class125(67, -1);

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
    public static int[] field8792;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)I")
    public static final int method4538(byte arg0, int arg1) {
        try {
            if (arg0 > -64) {
                field8792 = null;
            }
            field8797++;
            return arg1 & 0xFF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8799[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lha;I)V")
    public static final void method4539(class18 arg0, int arg1) {
        try {
            if (arg1 > -29) {
                field8787 = null;
            }
            field8795++;
            if (class232.field3348 != class203.field2988.field2981 && class608.field8715 != null && class679.method4876((byte) -31, class203.field2988.field2981, arg0)) {
                class232.field3348 = class203.field2988.field2981;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8799[5] + (arg0 == null ? field8799[3] : field8799[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BILeea;)V")
    public static final void method4540(byte arg0, int arg1, class476 arg2) {
        try {
            field8789++;
            boolean var3 = arg2.method3677(-119, 1) == 1;
            if (var3) {
                class570.field8265[class176.field2305++] = arg1;
            }
            int var4 = arg2.method3677(-45, 2);
            class339 var5 = class748.field10666[arg1];
            if (var4 == 0) {
                if (var3) {
                    var5.field4916 = false;
                } else if (class241.field3470 == arg1) {
                    throw new RuntimeException(field8799[6]);
                } else {
                    class570 var6 = class429.field6194[arg1] = new class570();
                    var6.field8269 = (var5.field2981 << 28) + (var5.field2252[0] + class537.field7895 >> 6 << 14) + (var5.field2256[0] + class655.field9286 >> 6);
                    if (var5.field4921 == -1) {
                        var6.field8274 = var5.field2234.method52(16383);
                    } else {
                        var6.field8274 = var5.field4921;
                    }
                    var6.field8271 = var5.field2219;
                    var6.field8268 = var5.field4909;
                    var6.field8273 = var5.field4910;
                    if (var5.field4930 > 0) {
                        class413.method3227(27548, var5);
                    }
                    class748.field10666[arg1] = null;
                    if (arg2.method3677(-82, 1) != 0) {
                        class674.method4837(arg2, arg1, 5);
                    }
                }
            } else if (var4 == 1) {
                int var7 = arg2.method3677(-91, 3);
                int var8 = var5.field2252[0];
                int var9 = var5.field2256[0];
                if (var7 == 0) {
                    var8--;
                    var9--;
                } else if (var7 == 1) {
                    var9--;
                } else if (var7 == 2) {
                    var9--;
                    var8++;
                } else if (var7 == 3) {
                    var8--;
                } else if (var7 == 4) {
                    var8++;
                } else if (var7 == 5) {
                    var8--;
                    var9++;
                } else if (var7 == 6) {
                    var9++;
                } else if (var7 == 7) {
                    var8++;
                    var9++;
                }
                if (var3) {
                    var5.field4900 = var8;
                    var5.field4916 = true;
                    var5.field4902 = var9;
                } else {
                    var5.method2721(var9, 98, var8, class176.field2308[arg1]);
                }
            } else if (var4 == 2) {
                int var10 = arg2.method3677(-77, 4);
                int var11 = var5.field2252[0];
                int var12 = var5.field2256[0];
                if (var10 == 0) {
                    var12 -= 2;
                    var11 -= 2;
                } else if (var10 == 1) {
                    var12 -= 2;
                    var11--;
                } else if (var10 == 2) {
                    var12 -= 2;
                } else if (var10 == 3) {
                    var12 -= 2;
                    var11++;
                } else if (var10 == 4) {
                    var11 += 2;
                    var12 -= 2;
                } else if (var10 == 5) {
                    var11 -= 2;
                    var12--;
                } else if (var10 == 6) {
                    var11 += 2;
                    var12--;
                } else if (var10 == 7) {
                    var11 -= 2;
                } else if (var10 == 8) {
                    var11 += 2;
                } else if (var10 == 9) {
                    var12++;
                    var11 -= 2;
                } else if (var10 == 10) {
                    var11 += 2;
                    var12++;
                } else if (var10 == 11) {
                    var12 += 2;
                    var11 -= 2;
                } else if (var10 == 12) {
                    var11--;
                    var12 += 2;
                } else if (var10 == 13) {
                    var12 += 2;
                } else if (var10 == 14) {
                    var11++;
                    var12 += 2;
                } else if (var10 == 15) {
                    var11 += 2;
                    var12 += 2;
                }
                if (var3) {
                    var5.field4900 = var11;
                    var5.field4902 = var12;
                    var5.field4916 = true;
                } else {
                    var5.method2721(var12, 50, var11, class176.field2308[arg1]);
                }
            } else {
                int var13 = arg2.method3677(-101, 1);
                if (var13 == 0) {
                    int var14 = arg2.method3677(-82, 12);
                    int var15 = var14 >> 10;
                    int var16 = var14 >> 5 & 0x1F;
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = var14 & 0x1F;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field2252[0] + var16;
                    int var19 = var5.field2256[0] + var17;
                    if (var3) {
                        var5.field4902 = var19;
                        var5.field4916 = true;
                        var5.field4900 = var18;
                    } else {
                        var5.method2721(var19, 116, var18, class176.field2308[arg1]);
                    }
                    var5.field2981 = var5.field2971 = (byte) (var5.field2981 + var15 & 0x3);
                    if (class23.method275(1, var18, var19)) {
                        var5.field2971++;
                    }
                    if (class241.field3470 == arg1) {
                        if (class693.field9689 != var5.field2981) {
                            class710.field9925 = true;
                        }
                        class693.field9689 = var5.field2981;
                    }
                } else {
                    int var20 = arg2.method3677(-69, 30);
                    int var21 = var20 >> 28;
                    int var22 = (var20 & 0xFFFD4E5) >> 14;
                    if (arg0 >= -48) {
                        field8792 = null;
                    }
                    int var23 = var20 & 0x3FFF;
                    int var24 = (var5.field2252[0] + class537.field7895 + var22 & 0x3FFF) - class537.field7895;
                    int var25 = (var5.field2256[0] + class655.field9286 + var23 & 0x3FFF) - class655.field9286;
                    if (var3) {
                        var5.field4900 = var24;
                        var5.field4902 = var25;
                        var5.field4916 = true;
                    } else {
                        var5.method2721(var25, 118, var24, class176.field2308[arg1]);
                    }
                    var5.field2981 = var5.field2971 = (byte) (var5.field2981 + var21 & 0x3);
                    if (class23.method275(1, var24, var25)) {
                        var5.field2971++;
                    }
                    if (class241.field3470 == arg1) {
                        class693.field9689 = var5.field2981;
                    }
                }
            }
        } catch (RuntimeException var27) {
            throw class665.method4799(var27, field8799[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8799[3] : field8799[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIII)V")
    public static final void method4541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            if (arg3 != 3) {
                method4539(null, 58);
            }
            if (class50.field717 >= arg4 && arg5 >= class557.field8113) {
                boolean var6;
                if (class335.field4844 > arg0) {
                    arg0 = class335.field4844;
                    var6 = false;
                } else if (arg0 <= class507.field7453) {
                    var6 = true;
                } else {
                    var6 = false;
                    arg0 = class507.field7453;
                }
                boolean var7;
                if (arg1 < class335.field4844) {
                    var7 = false;
                    arg1 = class335.field4844;
                } else if (arg1 > class507.field7453) {
                    arg1 = class507.field7453;
                    var7 = false;
                } else {
                    var7 = true;
                }
                if (arg4 < class557.field8113) {
                    arg4 = class557.field8113;
                } else {
                    class576.method4282(-7, arg0, arg2, class529.field7682[arg4++], arg1);
                }
                if (arg5 <= class50.field717) {
                    class576.method4282(-7, arg0, arg2, class529.field7682[arg5--], arg1);
                } else {
                    arg5 = class50.field717;
                }
                if (var6 && var7) {
                    for (int var8 = arg4; var8 <= arg5; var8++) {
                        int[] var9 = class529.field7682[var8];
                        var9[arg0] = var9[arg1] = arg2;
                    }
                } else if (var6) {
                    for (int var10 = arg4; var10 <= arg5; var10++) {
                        class529.field7682[var10][arg0] = arg2;
                    }
                } else if (var7) {
                    for (int var11 = arg4; var11 <= arg5; var11++) {
                        class529.field7682[var11][arg1] = arg2;
                    }
                }
            }
            field8796++;
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field8799[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method4542(int arg0) {
        try {
            field8787 = null;
            int var1 = 35 / ((arg0 - 42) / 57);
            field8792 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field8799[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(I[B)V")
    public class616(int arg0, byte[] arg1) {
        try {
            this.field8798 = arg0;
            class711 var3 = new class711(arg1);
            this.field8788 = var3.method5128(0);
            this.field8793 = new int[this.field8788];
            this.field8794 = new boolean[this.field8788];
            this.field8790 = new int[this.field8788];
            this.field8791 = new int[this.field8788][];
            for (int var4 = 0; var4 < this.field8788; var4++) {
                this.field8793[var4] = var3.method5128(0);
                if (this.field8793[var4] == 6) {
                    this.field8793[var4] = 2;
                }
            }
            for (int var5 = 0; var5 < this.field8788; var5++) {
                this.field8794[var5] = var3.method5128(0) == 1;
            }
            for (int var6 = 0; var6 < this.field8788; var6++) {
                this.field8790[var6] = var3.method5116((byte) -117);
            }
            for (int var7 = 0; var7 < this.field8788; var7++) {
                this.field8791[var7] = new int[var3.method5128(0)];
            }
            for (int var8 = 0; var8 < this.field8788; var8++) {
                for (int var9 = 0; var9 < this.field8791[var8].length; var9++) {
                    this.field8791[var8][var9] = var3.method5128(0);
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field8799[4] + arg0 + ',' + (arg1 == null ? field8799[3] : field8799[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4543(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x69);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4544(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 16;
                    break;
                case 1:
                    var10005 = 64;
                    break;
                case 2:
                    var10005 = 70;
                    break;
                case 3:
                    var10005 = 79;
                    break;
                default:
                    var10005 = 105;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
