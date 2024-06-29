import java.io.UnsupportedEncodingException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class70 extends class89 {

    @OriginalMember(owner = "client!wk", name = "U", descriptor = "I")
    private int field1132 = 409;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "I")
    private int field1128 = 81;

    @OriginalMember(owner = "client!wk", name = "Y", descriptor = "I")
    private int field1136 = 4;

    @OriginalMember(owner = "client!wk", name = "V", descriptor = "I")
    private int field1133 = 0;

    @OriginalMember(owner = "client!wk", name = "cb", descriptor = "I")
    private int field1140 = 8;

    @OriginalMember(owner = "client!wk", name = "S", descriptor = "I")
    private int field1130 = 1024;

    @OriginalMember(owner = "client!wk", name = "kb", descriptor = "I")
    private int field1148 = 204;

    @OriginalMember(owner = "client!wk", name = "jb", descriptor = "I")
    private int field1147 = 1024;

    @OriginalMember(owner = "client!wk", name = "R", descriptor = "[B")
    public static byte[] field1129 = new byte[520];

    @OriginalMember(owner = "client!wk", name = "Z", descriptor = "Lda;")
    public static class275 field1137 = class255.method1672(116, ")2");

    @OriginalMember(owner = "client!wk", name = "ab", descriptor = "Lda;")
    public static class275 field1138 = class255.method1672(124, "Hidden)2use");

    @OriginalMember(owner = "client!wk", name = "ib", descriptor = "[I")
    public static int[] field1146 = new int[50];

    @OriginalMember(owner = "client!wk", name = "nb", descriptor = "I")
    public static int field1151 = 20;

    @OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!wk", name = "W", descriptor = "I")
    private int field1134;

    @OriginalMember(owner = "client!wk", name = "db", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!wk", name = "fb", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!wk", name = "gb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!wk", name = "hb", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!wk", name = "lb", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!wk", name = "mb", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!wk", name = "ob", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!wk", name = "eb", descriptor = "[I")
    private int[] field1142;

    @OriginalMember(owner = "client!wk", name = "X", descriptor = "[[I")
    private int[][] field1135;

    @OriginalMember(owner = "client!wk", name = "bb", descriptor = "[[I")
    private int[][] field1139;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "(I)V")
    private final void method460(int arg0) {
        ++field1145;
        Random var2 = new Random((long) this.field1140);
        this.field1139 = new int[this.field1140][this.field1136];
        this.field1142 = new int[this.field1140 + 1];
        this.field1135 = new int[this.field1140][this.field1136 - -1];
        this.field1142[arg0] = 0;
        this.field1141 = 4096 / this.field1136;
        int var3 = this.field1141 / 2;
        this.field1150 = 4096 / this.field1140;
        int var4 = this.field1150 / 2;
        this.field1134 = this.field1128 / 2;
        for (int var5 = 0; ~this.field1140 < ~var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field1150;
                int var7 = (-2048 + class116.method845((byte) 127, var2, 4096)) * this.field1148 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field1142[var5] = this.field1142[var5 - 1] + var8;
            }
            this.field1135[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field1136; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field1141;
                    int var11 = (-2048 + class116.method845((byte) -118, var2, 4096)) * this.field1132 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field1135[var5][var9] = this.field1135[var5][var9 - 1] + var12;
                }
                this.field1139[var5][var9] = ~this.field1130 < -1 ? -class116.method845((byte) -76, var2, this.field1130) + 4096 : 4096;
            }
            this.field1135[var5][this.field1136] = 4096;
        }
        this.field1142[this.field1140] = 4096;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        if (arg1) {
            this.method234(-14);
        }
        int[] var3 = super.field1503.method229(arg0, (byte) -53);
        if (super.field1503.field664) {
            int var4 = 0;
            int var5;
            for (var5 = class91.field1552[arg0] - -this.field1133; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field1140 && this.field1142[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field1142[var4];
            int var9 = this.field1142[var4 + -1];
            if (var5 > this.field1134 + var9 && ~(-this.field1134 + var8) < ~var5) {
                for (int var10 = 0; var10 < class65.field1070; ++var10) {
                    int var11 = !var7 ? -this.field1147 : this.field1147;
                    int var12 = (this.field1141 * var11 >> 12) + class185.field3172[var10];
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (~this.field1136 < ~var13 && ~this.field1135[var6][var13] >= ~var12) {
                        ++var13;
                    }
                    int var14 = var13 + -1;
                    int var15 = this.field1135[var6][var14];
                    int var16 = this.field1135[var6][var13];
                    if (var12 > this.field1134 + var15 && ~var12 > ~(-this.field1134 + var16)) {
                        var3[var10] = this.field1139[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class154.method1090(var3, 0, class65.field1070, 0);
            }
        }
        ++field1143;
        return var3;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class70() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        ++field1131;
        if (arg0 != -20503) {
            this.field1140 = -5;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field1130 = arg1.method608(28);
                                    }
                                } else {
                                    this.field1128 = arg1.method608(100);
                                }
                            } else {
                                this.field1133 = arg1.method608(40);
                            }
                        } else {
                            this.field1147 = arg1.method608(arg0 ^ -20607);
                        }
                    } else {
                        this.field1148 = arg1.method608(65);
                    }
                } else {
                    this.field1132 = arg1.method608(105);
                }
            } else {
                this.field1140 = arg1.method564((byte) 99);
            }
        } else {
            this.field1136 = arg1.method564((byte) 60);
        }
    }

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field1144;
        this.method460(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(B)I")
    public static final int method461(byte arg0) {
        ++field1152;
        if (arg0 != 112) {
            method464(-69, -107, -21);
        }
        return ((class173.field3006 != 0 ? 1 : 0) << 22) + ((class90.field1531 == 0 ? 0 : 1) << 21) + ((class61.field1019 != 0 ? 1 : 0) << 20) + ((class225.field3810 ? 1 : 0) << 19) + (class73.field1189 << 17 & 393216) + ((class153.field2674 ? 1 : 0) << 16) + ((class155.field2695 ? 1 : 0) << 13) + ((class240.field4219 & 3) << 11) + (7 & class193.field3325) - -((!class48.field798 ? 0 : 1) << 3) - -((class66.field1080 ? 1 : 0) << 4) + ((!class77.field1284 ? 0 : 1) << 5) + ((!class29.field447 ? 0 : 1) << 6) + ((class76.field1257 ? 1 : 0) << 7) - (-((class32.field483 ? 1 : 0) << 8) + -((class250.field4425 ? 1 : 0) << 9)) + ((!class163.field2845 ? 0 : 1) << 10) + ((!class104.field1759 ? 0 : 1) << 15);
    }

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "(I)V")
    public static void method462(int arg0) {
        field1146 = null;
        if (arg0 < 72) {
            method463(102, (class275) null, (class229) null);
        }
        field1138 = null;
        field1129 = null;
        field1137 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILda;Lfd;)Lda;")
    public static final class275 method463(int arg0, class275 arg1, class229 arg2) {
        if (arg0 <= 57) {
            method462(-7);
        }
        ++field1149;
        if (~arg1.method1818(19701, class226.field3825) != 0) {
            while (true) {
                int var3 = arg1.method1818(19701, class44.field747);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg1.method1818(19701, class159.field2786);
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg1.method1818(19701, class180.field3089);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg1.method1818(19701, class41.field684);
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg1.method1818(19701, class244.field4252);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg1.method1818(19701, class172.field2991);
                                                        if (~var8 == 0) {
                                                            return arg1;
                                                        }
                                                        class275 var9 = class79.field1301;
                                                        if (class148.field2576 != null) {
                                                            var9 = class125.method905(class148.field2576.field4627, 121);
                                                            try {
                                                                if (class148.field2576.field4625 != null) {
                                                                    byte[] var10 = ((String) class148.field2576.field4625).getBytes("ISO-8859-1");
                                                                    var9 = class191.method1256(var10, -127, var10.length, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class197.method1291(new class275[] { arg1.method1815(0, var8, 0), var9, arg1.method1839(var8 - -4, (byte) -103) }, -30025);
                                                    }
                                                }
                                                arg1 = class197.method1291(new class275[] { arg1.method1815(0, var7, 0), class112.method821(class245.method1611(false, arg2, 4), 106), arg1.method1839(var7 + 2, (byte) -107) }, -30025);
                                            }
                                        }
                                        arg1 = class197.method1291(new class275[] { arg1.method1815(0, var6, 0), class112.method821(class245.method1611(false, arg2, 3), 93), arg1.method1839(var6 + 2, (byte) 116) }, -30025);
                                    }
                                }
                                arg1 = class197.method1291(new class275[] { arg1.method1815(0, var5, 0), class112.method821(class245.method1611(false, arg2, 2), -39), arg1.method1839(var5 - -2, (byte) -26) }, -30025);
                            }
                        }
                        arg1 = class197.method1291(new class275[] { arg1.method1815(0, var4, 0), class112.method821(class245.method1611(false, arg2, 1), -115), arg1.method1839(var4 + 2, (byte) 91) }, -30025);
                    }
                }
                arg1 = class197.method1291(new class275[] { arg1.method1815(0, var3, 0), class112.method821(class245.method1611(false, arg2, 0), -68), arg1.method1839(var3 + 2, (byte) 125) }, -30025);
            }
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(III)Ljg;")
    public static final class37 method464(int arg0, int arg1, int arg2) {
        class3 var3 = class235.field4101[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            for (int var4 = 0; var4 < var3.field29; ++var4) {
                class37 var5 = var3.field48[var4];
                if ((var5.field608 >> 29 & 3L) == 2L && var5.field616 == arg1 && var5.field617 == arg2) {
                    class117.method853(var5);
                    return var5;
                }
            }
            return null;
        }
    }
}
