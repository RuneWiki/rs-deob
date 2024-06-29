import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public int field172 = -1;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lak;")
    public static class234 field154 = new class234("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "J")
    public static volatile long field175 = 0L;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Lak;")
    public static class234 field178 = new class234("K", "T", "K", "K");

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "Lgu;")
    private class412 field168;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "Lrj;")
    public static class424 field163;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "Ljava/lang/String;")
    private String field157;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "Ljava/lang/String;")
    private String field160;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "[I")
    private int[] field153;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "[I")
    private int[] field156;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
    private int[] field158;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "[I")
    private int[] field159;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "[I")
    private int[] field162;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "[I")
    private int[] field166;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "[I")
    private int[] field167;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field164;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[Ljava/lang/String;")
    private String[] field169;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "[[I")
    private int[][] field155;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "[[I")
    private int[][] field171;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "[[I")
    private int[][] field177;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(DI)V", line = 13)
    public static final void method78(double arg0, int arg1) {
        int var3 = 67 % ((arg1 + 70) / 51);
        if (class401.field5959 != arg0) {
            for (int var4 = 0; var4 < 256; var4++) {
                int var5 = (int) (Math.pow((double) var4 / 255.0D, arg0) * 255.0D);
                class111.field1559[var4] = var5 > 255 ? 255 : var5;
            }
            class401.field5959 = arg0;
        }
        field165++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILhp;B)V", line = 52)
    private final void method79(int arg0, class217 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field160 = arg1.method1555((byte) 117);
        } else if (arg0 == 2) {
            this.field157 = arg1.method1555((byte) -79);
        } else if (arg0 == 3) {
            int var4 = arg1.method1515((byte) 121);
            this.field171 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field171[var5][0] = arg1.method1511(-44);
                this.field171[var5][1] = arg1.method1556(100);
                this.field171[var5][2] = arg1.method1556(114);
            }
        } else if (arg0 == 4) {
            int var22 = arg1.method1515((byte) 127);
            this.field155 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field155[var23][0] = arg1.method1511(-31);
                this.field155[var23][1] = arg1.method1556(104);
                this.field155[var23][2] = arg1.method1556(112);
            }
        } else if (arg0 == 5) {
            arg1.method1511(-41);
        } else if (arg0 == 6) {
            arg1.method1515((byte) 127);
        } else if (arg0 == 7) {
            arg1.method1515((byte) 121);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg1.method1515((byte) 125);
            } else if (arg0 == 10) {
                int var20 = arg1.method1515((byte) 125);
                this.field156 = new int[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field156[var21] = arg1.method1556(111);
                }
            } else if (arg0 == 12) {
                arg1.method1556(120);
            } else if (arg0 == 13) {
                int var6 = arg1.method1515((byte) 124);
                this.field153 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field153[var7] = arg1.method1511(81);
                }
            } else if (arg0 == 14) {
                int var8 = arg1.method1515((byte) 124);
                this.field177 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field177[var9][0] = arg1.method1515((byte) 126);
                    this.field177[var9][1] = arg1.method1515((byte) 126);
                }
            } else if (arg0 == 15) {
                arg1.method1511(92);
            } else if (arg0 == 17) {
                this.field172 = arg1.method1511(-55);
            } else if (arg0 == 18) {
                int var10 = arg1.method1515((byte) 126);
                this.field169 = new String[var10];
                this.field166 = new int[var10];
                this.field158 = new int[var10];
                this.field174 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field174[var11] = arg1.method1556(104);
                    this.field166[var11] = arg1.method1556(116);
                    this.field158[var11] = arg1.method1556(111);
                    this.field169[var11] = arg1.method1550((byte) 28);
                }
            } else if (arg0 == 19) {
                int var18 = arg1.method1515((byte) 127);
                this.field159 = new int[var18];
                this.field162 = new int[var18];
                this.field164 = new String[var18];
                this.field167 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field162[var19] = arg1.method1556(111);
                    this.field159[var19] = arg1.method1556(108);
                    this.field167[var19] = arg1.method1556(124);
                    this.field164[var19] = arg1.method1550((byte) 28);
                }
            } else if (arg0 == 249) {
                int var12 = arg1.method1515((byte) 126);
                if (this.field168 == null) {
                    int var13 = class396.method2493((byte) 66, var12);
                    this.field168 = new class412(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg1.method1515((byte) 126) == 1;
                    int var16 = arg1.method1548(31529);
                    class431 var17;
                    if (var15) {
                        var17 = new class46(arg1.method1550((byte) 28));
                    } else {
                        var17 = new class308(arg1.method1556(110));
                    }
                    this.field168.method2591((long) var16, var17, (byte) -114);
                }
            }
        }
        field173++;
        if (arg2 <= 83) {
            this.field167 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 283)
    public static void method80(byte arg0) {
        field163 = null;
        if (arg0 != 72) {
            field175 = -22L;
        }
        field178 = null;
        field154 = null;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILhp;)V", line = 301)
    public final void method81(int arg0, class217 arg1) {
        while (true) {
            int var3 = arg1.method1515((byte) 123);
            if (var3 == 0) {
                if (arg0 <= 108) {
                    return;
                }
                field161++;
                return;
            }
            this.method79(var3, arg1, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V", line = 336)
    public final void method82(int arg0) {
        if (this.field157 == null) {
            this.field157 = this.field160;
        }
        field176++;
        if (arg0 != 24220) {
            method80((byte) -86);
        }
    }
}
