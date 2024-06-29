import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class388 {

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "I")
    public int field4980 = -1;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "Luc;")
    public static class27 field4971 = new class27(8, 7);

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "I")
    public static int field4975;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "I")
    public static int field4985;

    @OriginalMember(owner = "client!mba", name = "x", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "Lhd;")
    private class694 field4970;

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Ljava/lang/String;")
    private String field4969;

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "Ljava/lang/String;")
    private String field4972;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "[I")
    private int[] field4967;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "[I")
    private int[] field4976;

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "[I")
    private int[] field4978;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "[I")
    private int[] field4979;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "[I")
    private int[] field4981;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "[I")
    private int[] field4982;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "[I")
    private int[] field4984;

    @OriginalMember(owner = "client!mba", name = "w", descriptor = "[I")
    private int[] field4987;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "[Ljava/lang/String;")
    private String[] field4968;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field4983;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "[[I")
    private int[][] field4973;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "[[I")
    private int[][] field4977;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "[[I")
    private int[][] field4986;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ILji;I)V", line = 3)
    private final void method2215(int arg0, class572 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field4972 = arg1.method3057((byte) -117);
        } else if (arg2 == 2) {
            this.field4969 = arg1.method3057((byte) -121);
        } else if (arg2 == 3) {
            int var22 = arg1.method3097((byte) 12);
            this.field4986 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4986[var23][0] = arg1.method3031(-1);
                this.field4986[var23][1] = arg1.method3064(-2031091464);
                this.field4986[var23][2] = arg1.method3064(class289.method1735(arg0, -2031091463));
            }
        } else if (arg2 == 4) {
            int var4 = arg1.method3097((byte) 12);
            this.field4973 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4973[var5][0] = arg1.method3031(-1);
                this.field4973[var5][1] = arg1.method3064(arg0 - 2031091465);
                this.field4973[var5][2] = arg1.method3064(-2031091464);
            }
        } else if (arg2 == 5) {
            arg1.method3031(-1);
        } else if (arg2 == 6) {
            arg1.method3097((byte) 12);
        } else if (arg2 == 7) {
            arg1.method3097((byte) 12);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method3097((byte) 12);
            } else if (arg2 == 10) {
                int var20 = arg1.method3097((byte) 12);
                this.field4982 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field4982[var21] = arg1.method3064(-2031091464);
                }
            } else if (arg2 == 12) {
                arg1.method3064(-2031091464);
            } else if (arg2 == 13) {
                int var6 = arg1.method3097((byte) 12);
                this.field4967 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4967[var7] = arg1.method3031(-1);
                }
            } else if (arg2 == 14) {
                int var18 = arg1.method3097((byte) 12);
                this.field4977 = new int[var18][2];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4977[var19][0] = arg1.method3097((byte) 12);
                    this.field4977[var19][1] = arg1.method3097((byte) 12);
                }
            } else if (arg2 == 15) {
                arg1.method3031(-1);
            } else if (arg2 == 17) {
                this.field4980 = arg1.method3031(arg0 ^ 0xFFFFFFFE);
            } else if (arg2 == 18) {
                int var8 = arg1.method3097((byte) 12);
                this.field4987 = new int[var8];
                this.field4968 = new String[var8];
                this.field4979 = new int[var8];
                this.field4978 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4987[var9] = arg1.method3064(-2031091464);
                    this.field4979[var9] = arg1.method3064(arg0 - 2031091465);
                    this.field4978[var9] = arg1.method3064(-2031091464);
                    this.field4968[var9] = arg1.method3072(255);
                }
            } else if (arg2 == 19) {
                int var10 = arg1.method3097((byte) 12);
                this.field4981 = new int[var10];
                this.field4984 = new int[var10];
                this.field4976 = new int[var10];
                this.field4983 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field4981[var11] = arg1.method3064(class289.method1735(arg0, -2031091463));
                    this.field4984[var11] = arg1.method3064(-2031091464);
                    this.field4976[var11] = arg1.method3064(-2031091464);
                    this.field4983[var11] = arg1.method3072(class289.method1735(arg0, 254));
                }
            } else if (arg2 == 249) {
                int var12 = arg1.method3097((byte) 12);
                if (this.field4970 == null) {
                    int var13 = class560.method2979(var12, (byte) 118);
                    this.field4970 = new class694(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method3097((byte) 12) == 1;
                    int var16 = arg1.method3059(1);
                    class263 var17;
                    if (var15) {
                        var17 = new class654(arg1.method3072(arg0 + 254));
                    } else {
                        var17 = new class319(arg1.method3064(-2031091464));
                    }
                    this.field4970.method3832(var17, (long) var16, 72);
                }
            }
        }
        field4965++;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lji;I)V", line = 233)
    public final void method2216(class572 arg0, int arg1) {
        int var3 = -128 / ((arg1 - 53) / 54);
        field4974++;
        while (true) {
            int var4 = arg0.method3097((byte) 12);
            if (var4 == 0) {
                return;
            }
            this.method2215(1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V", line = 253)
    public static void method2217(int arg0) {
        if (arg0 == 249) {
            field4971 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 269)
    public final void method2218(byte arg0) {
        field4966++;
        if (arg0 >= 66 && this.field4969 == null) {
            this.field4969 = this.field4972;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IIIIZIB)V", line = 288)
    public static final void method2219(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, byte arg6) {
        if (arg6 != -108) {
            field4971 = null;
        }
        class27.field314 = arg2;
        class167.field1966 = arg5;
        class633.field8590 = arg3;
        field4975++;
        class243.field3149 = arg1;
        class71.field907 = arg0;
        if (arg4 && class243.field3149 >= 100) {
            class710.field9924 = class633.field8590 * 512 + 256;
            class238.field3071 = class27.field314 * 512 + 256;
            class455.field5688 = class514.method2798(class710.field9924, class238.field3071, class675.field9219, (byte) 99) - class71.field907;
        }
        class385.field4946 = 2;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(ZZ)V", line = 329)
    public static final void method2220(boolean arg0, boolean arg1) {
        field4988++;
        for (class112 var2 = (class112) class578.field7755.method1909(!arg1); var2 != null; var2 = (class112) class578.field7755.method1916((byte) 91)) {
            if (var2.field1396 != null) {
                class314.field3941.method1489(var2.field1396);
                var2.field1396 = null;
            }
            if (var2.field1386 != null) {
                class314.field3941.method1489(var2.field1386);
                var2.field1386 = null;
            }
            var2.method1566(-68);
        }
        if (arg1) {
            method2217(-106);
        }
        if (!arg0) {
            return;
        }
        for (class112 var3 = (class112) class16.field163.method1909(true); var3 != null; var3 = (class112) class16.field163.method1916((byte) 77)) {
            if (var3.field1396 != null) {
                class314.field3941.method1489(var3.field1396);
                var3.field1396 = null;
            }
            var3.method1566(-58);
        }
        for (class112 var4 = (class112) class664.field9022.method3830((byte) -102); var4 != null; var4 = (class112) class664.field9022.method3838((byte) -92)) {
            if (var4.field1396 != null) {
                class314.field3941.method1489(var4.field1396);
                var4.field1396 = null;
            }
            var4.method1566(-50);
        }
    }
}
