import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class57 extends class182 {

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    private int field1119 = 81;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    private int field1125 = 8;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field1128 = 4;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    private int field1121 = 204;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field1138 = 1024;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    private int field1140 = 1024;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    private int field1126 = 409;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    private int field1143 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "[C")
    public static char[] field1144 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    private int field1136;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "I")
    private int field1139;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    private int field1142;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "Ltb;")
    public static class246 field1134;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "Z")
    public static boolean field1141;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "[I")
    private int[] field1131;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "[[I")
    private int[][] field1116;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "[[I")
    private int[][] field1127;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V", line = 19)
    public class57() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V", line = 28)
    public static void method479(boolean arg0) {
        field1134 = null;
        if (!arg0) {
            field1123 = 87;
        }
        field1144 = null;
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V", line = 39)
    public final void method163(int arg0) {
        field1137++;
        if (arg0 != 100) {
            field1135 = 83;
        }
        this.method481(arg0 ^ 0x6826);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Loe;IB)V", line = 57)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field1117++;
        if (arg2 != 60) {
            this.field1140 = -14;
        }
        if (arg1 == 0) {
            this.field1128 = arg0.method1005((byte) 122);
        } else if (arg1 == 1) {
            this.field1125 = arg0.method1005((byte) 122);
        } else if (arg1 == 2) {
            this.field1126 = arg0.method989(arg2 ^ 0x7E);
        } else if (arg1 == 3) {
            this.field1121 = arg0.method989(80);
        } else if (arg1 == 4) {
            this.field1138 = arg0.method989(arg2 + 3);
        } else if (arg1 == 5) {
            this.field1143 = arg0.method989(arg2 ^ 0x63);
        } else if (arg1 == 6) {
            this.field1119 = arg0.method989(94);
        } else if (arg1 == 7) {
            this.field1140 = arg0.method989(123);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(Z)V", line = 155)
    public static final void method480(boolean arg0) {
        if (class38.field822 > class38.field828) {
            class38.field828 = (float) ((double) class38.field828 / 30.0D + (double) class38.field828);
            if (class38.field828 > class38.field822) {
                class38.field828 = class38.field822;
            }
            class146.method999(475249384);
        } else if (class38.field828 > class38.field822) {
            class38.field828 = (float) ((double) class38.field828 - (double) class38.field828 / 30.0D);
            if (class38.field822 > class38.field828) {
                class38.field828 = class38.field822;
            }
            class146.method999(475249384);
        }
        if (arg0) {
            field1123 = -100;
        }
        field1132++;
        if (class105.field1914 != -1 && class170.field2809 != -1) {
            int var1 = class170.field2809 - class206.field3449;
            int var2 = class105.field1914 - class332.field5303;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class332.field5303 -= -var2;
            if (var2 == 0 && var1 == 0) {
                class105.field1914 = -1;
                class170.field2809 = -1;
            }
            class206.field3449 += var1;
            class146.method999(475249384);
        }
        if (class1.field37 > 0) {
            class6.field169--;
            if (class6.field169 == 0) {
                class1.field37--;
                class6.field169 = 100;
            }
        } else {
            class199.field3349 = -1;
            class177.field2933 = -1;
        }
        if (!class24.field611 || class82.field1425 == null) {
            return;
        }
        for (class280 var3 = (class280) class82.field1425.method431(0); var3 != null; var3 = (class280) class82.field1425.method439(-28512)) {
            class1 var4 = class125.method901(var3.field4563.field2219, (byte) -54);
            if (class347.field5535 == 0 && var3.method1979(Integer.MAX_VALUE, class73.field1339, class26.field662)) {
                if (!var3.field4563.field2210) {
                    var3.field4563.field2210 = true;
                    class192.method1329(var3.field4563.field2219, var4.field13, (byte) 41, 15);
                }
                if (var3.field4563.field2210) {
                    class192.method1329(var3.field4563.field2219, var4.field13, (byte) 41, 17);
                }
            } else if (var3.field4563.field2210) {
                var3.field4563.field2210 = false;
                class192.method1329(var3.field4563.field2219, var4.field13, (byte) 41, 16);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I", line = 270)
    public final int[] method125(int arg0, int arg1) {
        field1122++;
        if (arg0 != 2) {
            this.field1125 = 78;
        }
        int[] var3 = this.field3166.method775(arg1, arg0 + 123);
        if (this.field3166.field1903) {
            int var4 = 0;
            int var5;
            for (var5 = class248.field4066[arg1] + this.field1143; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field1125 > var4 && var5 >= this.field1131[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field1131[var4];
            int var9 = this.field1131[var4 - 1];
            if (var5 > (this.field1139 + var9) && var5 < var8 - this.field1139) {
                for (int var10 = 0; var10 < class26.field672; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field1138 : -this.field1138;
                    int var13;
                    for (var13 = (this.field1142 * var12 >> 12) + class21.field539[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field1128 > var11 && var13 >= this.field1127[var6][var11]) {
                        var11++;
                    }
                    int var14 = this.field1127[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field1127[var6][var15];
                    if ((this.field1139 + var16) < var13 && (var14 - this.field1139) > var13) {
                        var3[var10] = this.field1116[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class89.method688(var3, 0, class26.field672, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V", line = 374)
    private final void method481(int arg0) {
        Random var2 = new Random((long) this.field1125);
        this.field1131 = new int[this.field1125 + 1];
        this.field1116 = new int[this.field1125][this.field1128];
        this.field1142 = 4096 / this.field1128;
        if (arg0 != 26690) {
            field1144 = (char[]) null;
        }
        int var3 = this.field1142 / 2;
        this.field1131[0] = 0;
        this.field1127 = new int[this.field1125][this.field1128 + 1];
        field1130++;
        this.field1136 = 4096 / this.field1125;
        this.field1139 = this.field1119 / 2;
        int var4 = this.field1136 / 2;
        for (int var5 = 0; var5 < this.field1125; var5++) {
            if (var5 > 0) {
                int var6 = this.field1136;
                int var7 = (class91.method696(var2, 4096, arg0 - 26603) - 2048) * this.field1121 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1131[var5] = this.field1131[var5 - 1] + var8;
            }
            this.field1127[var5][0] = 0;
            for (int var9 = 0; var9 < this.field1128; var9++) {
                if (var9 > 0) {
                    int var10 = this.field1142;
                    int var11 = (class91.method696(var2, 4096, 71) - 2048) * this.field1126 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1127[var5][var9] = this.field1127[var5][var9 - 1] + var12;
                }
                this.field1116[var5][var9] = this.field1140 > 0 ? 4096 - class91.method696(var2, this.field1140, 98) : 4096;
            }
            this.field1127[var5][this.field1128] = 4096;
        }
        this.field1131[this.field1125] = 4096;
    }
}
