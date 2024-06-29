import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class402 {

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
    public int field6052 = -1;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6035 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lmq;")
    public static class350 field6042 = null;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[I")
    public static int[] field6030 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Lpi;")
    public static class342 field6046 = new class342("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field6041;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Lqa;")
    public static class162 field6038;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Lan;")
    private class20 field6040;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ljava/lang/String;")
    private String field6031;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Ljava/lang/String;")
    private String field6036;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
    private int[] field6025;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "[I")
    private int[] field6026;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "[I")
    private int[] field6027;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "[I")
    private int[] field6029;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[I")
    private int[] field6034;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "[I")
    private int[] field6048;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "[I")
    private int[] field6049;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[I")
    private int[] field6050;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field6043;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field6044;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "[[I")
    private int[][] field6028;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "[[I")
    private int[][] field6033;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[[I")
    private int[][] field6051;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BII)Z")
    public static final boolean method2462(byte arg0, int arg1, int arg2) {
        field6045++;
        if (arg0 > -117) {
            field6042 = null;
        }
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)I")
    public static final int method2463(int arg0, int arg1) {
        field6039++;
        if (arg0 != -14642) {
            method2462((byte) -9, -82, -33);
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xDE) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BI)I")
    public static final int method2464(byte arg0, int arg1) {
        int var2 = 34 % ((arg0 - 40) / 62);
        field6032++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lcu;II)V")
    private final void method2465(class145 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6036 = arg0.method1072(-124);
        } else if (arg2 == 2) {
            this.field6031 = arg0.method1072(arg1 ^ 0x41);
        } else if (arg2 == 3) {
            int var22 = arg0.method1063((byte) -46);
            this.field6051 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field6051[var23][0] = arg0.method1069((byte) -123);
                this.field6051[var23][1] = arg0.method1070(arg1 - 32369);
                this.field6051[var23][2] = arg0.method1070(-32387);
            }
        } else if (arg2 == 4) {
            int var4 = arg0.method1063((byte) -22);
            this.field6028 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6028[var5][0] = arg0.method1069((byte) -30);
                this.field6028[var5][1] = arg0.method1070(-32387);
                this.field6028[var5][2] = arg0.method1070(class125.method953(arg1, 32403));
            }
        } else if (arg2 == 5) {
            arg0.method1069((byte) -86);
        } else if (arg2 == 6) {
            arg0.method1063((byte) 117);
        } else if (arg2 == 7) {
            arg0.method1063((byte) -27);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg0.method1063((byte) 111);
            } else if (arg2 == 10) {
                int var20 = arg0.method1063((byte) 110);
                this.field6049 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6049[var21] = arg0.method1070(-32387);
                }
            } else if (arg2 == 12) {
                arg0.method1070(-32387);
            } else if (arg2 == 13) {
                int var6 = arg0.method1063((byte) 120);
                this.field6026 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6026[var7] = arg0.method1069((byte) -126);
                }
            } else if (arg2 == 14) {
                int var8 = arg0.method1063((byte) -41);
                this.field6033 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6033[var9][0] = arg0.method1063((byte) -92);
                    this.field6033[var9][1] = arg0.method1063((byte) 110);
                }
            } else if (arg2 == 15) {
                arg0.method1069((byte) -68);
            } else if (arg2 == 17) {
                this.field6052 = arg0.method1069((byte) -106);
            } else if (arg2 == 18) {
                int var18 = arg0.method1063((byte) -92);
                this.field6048 = new int[var18];
                this.field6029 = new int[var18];
                this.field6043 = new String[var18];
                this.field6027 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6048[var19] = arg0.method1070(class125.method953(arg1, 32403));
                    this.field6027[var19] = arg0.method1070(-32387);
                    this.field6029[var19] = arg0.method1070(-32387);
                    this.field6043[var19] = arg0.method1101((byte) -102);
                }
            } else if (arg2 == 19) {
                int var10 = arg0.method1063((byte) 114);
                this.field6050 = new int[var10];
                this.field6025 = new int[var10];
                this.field6034 = new int[var10];
                this.field6044 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field6034[var11] = arg0.method1070(-32387);
                    this.field6025[var11] = arg0.method1070(arg1 - 32369);
                    this.field6050[var11] = arg0.method1070(class125.method953(arg1, 32403));
                    this.field6044[var11] = arg0.method1101((byte) -60);
                }
            } else if (arg2 == 249) {
                int var12 = arg0.method1063((byte) 105);
                if (this.field6040 == null) {
                    int var13 = class51.method464(1905326856, var12);
                    this.field6040 = new class20(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg0.method1063((byte) -113) == 1;
                    int var16 = arg0.method1085(-91);
                    class320 var17;
                    if (var15) {
                        var17 = new class521(arg0.method1101((byte) -122));
                    } else {
                        var17 = new class451(arg0.method1070(-32387));
                    }
                    this.field6040.method166(var17, (long) var16, 91);
                }
            }
        }
        field6037++;
        if (arg1 != -18) {
            this.field6031 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lcu;I)V")
    public final void method2466(class145 arg0, int arg1) {
        field6047++;
        int var3 = -79 % ((arg1 + 85) / 32);
        while (true) {
            int var4 = arg0.method1063((byte) 119);
            if (var4 == 0) {
                return;
            }
            this.method2465(arg0, -18, var4);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method2467(int arg0) {
        field6041++;
        if (this.field6031 == null) {
            this.field6031 = this.field6036;
        }
        int var2 = -89 / ((arg0 + 69) / 41);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method2468(byte arg0) {
        field6042 = null;
        field6046 = null;
        if (arg0 >= -86) {
            field6038 = null;
        }
        field6035 = null;
        field6038 = null;
        field6030 = null;
    }
}
