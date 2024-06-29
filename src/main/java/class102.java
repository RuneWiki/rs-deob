import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class102 {

    @OriginalMember(owner = "client!dba", name = "r", descriptor = "I")
    public int field1137 = -1;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1143 = new String[] { method840(method839("\u0017SG5s[")), method840(method839("\u001dDJw")), method840(method839("\b\u001f\b5L")), method840(method839("\u0017SG5r[")), method840(method839("\u0017SG5p[")), method840(method839("\u0017SG5t[")), method840(method839("\u0017SG5u[")) };

    @OriginalMember(owner = "client!dba", name = "g", descriptor = "[I")
    public static int[] field1129 = new int[1];

    @OriginalMember(owner = "client!dba", name = "i", descriptor = "[F")
    public static float[] field1136 = new float[2];

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!dba", name = "u", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!dba", name = "f", descriptor = "Lqha;")
    private class112 field1120;

    @OriginalMember(owner = "client!dba", name = "o", descriptor = "Ljava/lang/String;")
    private String field1134;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Ljava/lang/String;")
    private String field1142;

    @OriginalMember(owner = "client!dba", name = "n", descriptor = "[I")
    private int[] field1123;

    @OriginalMember(owner = "client!dba", name = "l", descriptor = "[I")
    private int[] field1124;

    @OriginalMember(owner = "client!dba", name = "s", descriptor = "[I")
    private int[] field1126;

    @OriginalMember(owner = "client!dba", name = "t", descriptor = "[I")
    private int[] field1127;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "[I")
    private int[] field1128;

    @OriginalMember(owner = "client!dba", name = "j", descriptor = "[I")
    private int[] field1131;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "[I")
    private int[] field1140;

    @OriginalMember(owner = "client!dba", name = "q", descriptor = "[I")
    private int[] field1141;

    @OriginalMember(owner = "client!dba", name = "p", descriptor = "[Ljava/lang/String;")
    private String[] field1133;

    @OriginalMember(owner = "client!dba", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field1135;

    @OriginalMember(owner = "client!dba", name = "e", descriptor = "[[I")
    private int[][] field1121;

    @OriginalMember(owner = "client!dba", name = "d", descriptor = "[[I")
    private int[][] field1122;

    @OriginalMember(owner = "client!dba", name = "h", descriptor = "[[I")
    private int[][] field1130;

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V", line = 11)
    public static final void method834(int arg0) {
        try {
            field1139++;
            class394 var1 = (class394) class417.field6150.method3863((byte) 64);
            boolean var2 = class69.field740 != null || class537.field7852 > 0;
            int var3 = var1.method2178(false);
            int var4 = var1.method2177((byte) 107);
            if (arg0 != -1) {
                field1129 = null;
            }
            if (var2) {
                class445.field6530 = 1;
            }
            if (var2) {
                class725.field10470 = class513.field7366;
            } else {
                class521.method3959(class513.field7366, var4, var3, 66);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1143[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V", line = 49)
    public final void method835(int arg0) {
        try {
            if (this.field1134 == null) {
                this.field1134 = this.field1142;
            }
            if (arg0 <= 44) {
                this.method835(111);
            }
            field1125++;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1143[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BILib;)V", line = 66)
    private final void method836(byte arg0, int arg1, class163 arg2) {
        try {
            field1132++;
            if (arg1 == 1) {
                this.field1142 = arg2.method1399(-31376);
            } else if (arg1 == 2) {
                this.field1134 = arg2.method1399(-31376);
            } else if (arg1 == 3) {
                int var4 = arg2.method1455((byte) 62);
                this.field1122 = new int[var4][3];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1122[var5][0] = arg2.method1445((byte) 110);
                    this.field1122[var5][1] = arg2.method1453((byte) 79);
                    this.field1122[var5][2] = arg2.method1453((byte) 112);
                }
            } else if (arg1 == 4) {
                int var22 = arg2.method1455((byte) 62);
                this.field1121 = new int[var22][3];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field1121[var23][0] = arg2.method1445((byte) 107);
                    this.field1121[var23][1] = arg2.method1453((byte) 83);
                    this.field1121[var23][2] = arg2.method1453((byte) 116);
                }
            } else if (arg1 == 5) {
                arg2.method1445((byte) 125);
            } else if (arg1 == 6) {
                arg2.method1455((byte) 62);
            } else if (arg1 == 7) {
                arg2.method1455((byte) 62);
            } else if (arg1 != 8) {
                if (arg1 == 9) {
                    arg2.method1455((byte) 62);
                } else if (arg1 == 10) {
                    int var20 = arg2.method1455((byte) 62);
                    this.field1124 = new int[var20];
                    for (int var21 = 0; var21 < var20; var21++) {
                        this.field1124[var21] = arg2.method1453((byte) 86);
                    }
                } else if (arg1 == 12) {
                    arg2.method1453((byte) 108);
                } else if (arg1 == 13) {
                    int var6 = arg2.method1455((byte) 62);
                    this.field1128 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        this.field1128[var7] = arg2.method1445((byte) 105);
                    }
                } else if (arg1 == 14) {
                    int var18 = arg2.method1455((byte) 62);
                    this.field1130 = new int[var18][2];
                    for (int var19 = 0; var19 < var18; var19++) {
                        this.field1130[var19][0] = arg2.method1455((byte) 62);
                        this.field1130[var19][1] = arg2.method1455((byte) 62);
                    }
                } else if (arg1 == 15) {
                    arg2.method1445((byte) 110);
                } else if (arg1 == 17) {
                    this.field1137 = arg2.method1445((byte) 106);
                } else if (arg1 == 18) {
                    int var8 = arg2.method1455((byte) 62);
                    this.field1133 = new String[var8];
                    this.field1131 = new int[var8];
                    this.field1141 = new int[var8];
                    this.field1140 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        this.field1141[var9] = arg2.method1453((byte) 87);
                        this.field1131[var9] = arg2.method1453((byte) 122);
                        this.field1140[var9] = arg2.method1453((byte) 126);
                        this.field1133[var9] = arg2.method1423(73);
                    }
                } else if (arg1 == 19) {
                    int var10 = arg2.method1455((byte) 62);
                    this.field1135 = new String[var10];
                    this.field1126 = new int[var10];
                    this.field1123 = new int[var10];
                    this.field1127 = new int[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field1127[var11] = arg2.method1453((byte) 107);
                        this.field1126[var11] = arg2.method1453((byte) 87);
                        this.field1123[var11] = arg2.method1453((byte) 95);
                        this.field1135[var11] = arg2.method1423(-51);
                    }
                } else if (arg1 == 249) {
                    int var12 = arg2.method1455((byte) 62);
                    if (this.field1120 == null) {
                        int var13 = class12.method83((byte) -1, var12);
                        this.field1120 = new class112(var13);
                    }
                    for (int var14 = 0; var14 < var12; var14++) {
                        boolean var15 = arg2.method1455((byte) 62) == 1;
                        int var16 = arg2.method1436((byte) 102);
                        class206 var17;
                        if (var15) {
                            var17 = new class78(arg2.method1423(-80));
                        } else {
                            var17 = new class609(arg2.method1453((byte) 95));
                        }
                        this.field1120.method968((byte) -111, (long) var16, var17);
                    }
                }
            }
            int var24 = -13 / ((arg0 + 5) / 32);
        } catch (RuntimeException var26) {
            throw class759.method5498(var26, field1143[0] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1143[1] : field1143[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILib;)V", line = 315)
    public final void method837(int arg0, class163 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    field1138++;
                    if (arg0 != 0) {
                        this.field1123 = null;
                        return;
                    }
                    return;
                }
                this.method836((byte) 58, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1143[3] + arg0 + ',' + (arg1 == null ? field1143[1] : field1143[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(I)V", line = 343)
    public static void method838(int arg0) {
        try {
            field1129 = null;
            int var1 = 52 % ((arg0 + 20) / 54);
            field1136 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1143[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method839(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x31);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method840(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 115;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 38;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 49;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
