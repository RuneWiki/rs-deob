import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class310 {

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field4090 = -1;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4079 = 503;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4073;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Lub;")
    private class18 field4082;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lu;")
    public static class52 field4072;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Ljava/lang/String;")
    private String field4074;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Ljava/lang/String;")
    private String field4093;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    private int[] field4075;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "[I")
    private int[] field4078;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "[I")
    private int[] field4080;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "[I")
    private int[] field4084;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "[I")
    private int[] field4088;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[I")
    private int[] field4091;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "[I")
    private int[] field4092;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "[I")
    private int[] field4095;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "[Ljava/lang/String;")
    private String[] field4085;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field4087;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[[I")
    private int[][] field4076;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[[I")
    private int[][] field4077;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "[[I")
    private int[][] field4097;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILmd;)V", line = 3)
    private final void method1797(int arg0, int arg1, class379 arg2) {
        if (arg0 > -78) {
            return;
        }
        if (arg1 == 1) {
            this.field4074 = arg2.method2230(65536);
        } else if (arg1 == 2) {
            this.field4093 = arg2.method2230(65536);
        } else if (arg1 == 3) {
            int var22 = arg2.method2238(255);
            this.field4076 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field4076[var23][0] = arg2.method2212((byte) 83);
                this.field4076[var23][1] = arg2.method2232((byte) 126);
                this.field4076[var23][2] = arg2.method2232((byte) 125);
            }
        } else if (arg1 == 4) {
            int var4 = arg2.method2238(255);
            this.field4097 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4097[var5][0] = arg2.method2212((byte) 83);
                this.field4097[var5][1] = arg2.method2232((byte) 126);
                this.field4097[var5][2] = arg2.method2232((byte) 125);
            }
        } else if (arg1 == 5) {
            arg2.method2212((byte) 83);
        } else if (arg1 == 6) {
            arg2.method2238(255);
        } else if (arg1 == 7) {
            arg2.method2238(255);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method2238(255);
            } else if (arg1 == 10) {
                int var20 = arg2.method2238(255);
                this.field4078 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field4078[var21] = arg2.method2232((byte) 127);
                }
            } else if (arg1 == 12) {
                arg2.method2232((byte) 124);
            } else if (arg1 == 13) {
                int var6 = arg2.method2238(255);
                this.field4080 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field4080[var7] = arg2.method2212((byte) 83);
                }
            } else if (arg1 == 14) {
                int var8 = arg2.method2238(255);
                this.field4077 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field4077[var9][0] = arg2.method2238(255);
                    this.field4077[var9][1] = arg2.method2238(255);
                }
            } else if (arg1 == 15) {
                arg2.method2212((byte) 83);
            } else if (arg1 == 17) {
                this.field4090 = arg2.method2212((byte) 83);
            } else if (arg1 == 18) {
                int var18 = arg2.method2238(255);
                this.field4075 = new int[var18];
                this.field4084 = new int[var18];
                this.field4085 = new String[var18];
                this.field4088 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field4088[var19] = arg2.method2232((byte) 126);
                    this.field4075[var19] = arg2.method2232((byte) 124);
                    this.field4084[var19] = arg2.method2232((byte) 124);
                    this.field4085[var19] = arg2.method2218(127);
                }
            } else if (arg1 == 19) {
                int var10 = arg2.method2238(255);
                this.field4091 = new int[var10];
                this.field4095 = new int[var10];
                this.field4092 = new int[var10];
                this.field4087 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field4091[var11] = arg2.method2232((byte) 126);
                    this.field4095[var11] = arg2.method2232((byte) 126);
                    this.field4092[var11] = arg2.method2232((byte) 124);
                    this.field4087[var11] = arg2.method2218(22);
                }
            } else if (arg1 == 249) {
                int var12 = arg2.method2238(255);
                if (this.field4082 == null) {
                    int var13 = class321.method1857((byte) 113, var12);
                    this.field4082 = new class18(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg2.method2238(255) == 1;
                    int var16 = arg2.method2249((byte) 83);
                    class42 var17;
                    if (var15) {
                        var17 = new class494(arg2.method2218(124));
                    } else {
                        var17 = new class387(arg2.method2232((byte) 127));
                    }
                    this.field4082.method173((long) var16, var17, (byte) 76);
                }
            }
        }
        field4071++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLmd;)V", line = 257)
    public final void method1798(byte arg0, class379 arg1) {
        field4094++;
        while (true) {
            int var3 = arg1.method2238(255);
            if (var3 == 0) {
                if (arg0 == 37) {
                    return;
                } else {
                    method1800(-45, -50, -105, null, null);
                    return;
                }
            }
            this.method1797(-82, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIZIII)Z", line = 296)
    public static final boolean method1799(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4096++;
        int var6 = arg1;
        if (!arg2) {
            method1802(-38);
        }
        while (arg0 >= var6) {
            for (int var7 = arg4; var7 <= arg5; var7++) {
                if (class74.field1116[var6][var7] == arg3 && class349.field4711[var6][var7] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIILgv;Lgv;)V", line = 329)
    public static final void method1800(int arg0, int arg1, int arg2, class56 arg3, class56 arg4) {
        class409 var5 = class185.method1204(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5627 = arg3;
            var5.field5607 = arg4;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZC)C", line = 339)
    public static final char method1801(boolean arg0, char arg1) {
        if (!arg0) {
            method1805(-112, 5, null, -9, 42, null, null, null);
        }
        field4089++;
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 738)
    public static void method1802(int arg0) {
        field4072 = null;
        if (arg0 >= -54) {
            field4079 = -106;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIB)V", line = 756)
    public static final void method1803(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -41) {
            field4079 = -86;
        }
        field4073++;
        if (arg0 == 1011) {
            class122.method892(class333.field4374, arg2, arg1);
        } else if (arg0 == 1002) {
            class122.method892(class363.field4913, arg2, arg1);
        } else if (arg0 == 1008) {
            class122.method892(class372.field5010, arg2, arg1);
        } else if (arg0 == 1001) {
            class122.method892(class91.field1385, arg2, arg1);
        } else if (arg0 == 1006) {
            class122.method892(class220.field2983, arg2, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 786)
    public final void method1804(byte arg0) {
        int var2 = -9 % ((10 - arg0) / 62);
        field4086++;
        if (this.field4093 == null) {
            this.field4093 = this.field4074;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILtk;IILqa;Lfh;Ldf;)V", line = 798)
    public static final void method1805(int arg0, int arg1, class228 arg2, int arg3, int arg4, class162 arg5, class460 arg6, class274 arg7) {
        field4081++;
        int var8 = arg2.field3072 - (arg3 / 2) - 5;
        int var9 = arg4 + 2;
        if (arg6.field6355 != 0) {
            arg5.method1093(arg1 * arg7.method1638() + arg4 + 1 - var9, var8, var9, 3, arg3 + 10, arg6.field6355);
        }
        if (arg0 != -4) {
            method1805(29, -49, null, 87, 38, null, null, null);
        }
        if (arg6.field6331 != 0) {
            arg5.method1099(var8, arg3 + 10, var9, arg6.field6331, true, arg7.method1638() * arg1 + (arg4 + 1) - var9);
        }
        int var10 = arg6.field6359;
        if (arg2.field3071 && arg6.field6325 != -1) {
            var10 = arg6.field6325;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class129.field1879[var11];
            if (arg1 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg7.method1639(arg5, var12, arg2.field3072, arg4, var10, true);
            arg4 += arg7.method1638();
        }
    }
}
