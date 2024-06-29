import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hka")
public class class54 extends class232 {

    @OriginalMember(owner = "client!hka", name = "V", descriptor = "I")
    private int field673 = 1024;

    @OriginalMember(owner = "client!hka", name = "L", descriptor = "I")
    private int field669 = 0;

    @OriginalMember(owner = "client!hka", name = "db", descriptor = "I")
    private int field681 = 204;

    @OriginalMember(owner = "client!hka", name = "gb", descriptor = "I")
    private int field668 = 1024;

    @OriginalMember(owner = "client!hka", name = "S", descriptor = "I")
    private int field679 = 4;

    @OriginalMember(owner = "client!hka", name = "O", descriptor = "I")
    private int field685 = 8;

    @OriginalMember(owner = "client!hka", name = "W", descriptor = "I")
    private int field684 = 409;

    @OriginalMember(owner = "client!hka", name = "N", descriptor = "I")
    private int field682 = 81;

    @OriginalMember(owner = "client!hka", name = "hb", descriptor = "[Ljava/lang/String;")
    private static final String[] field694 = new String[] { method560(method559("9\\DrOy")), method560(method559("9\\Dr@y")), method560(method559("*\u0019\u000brq")), method560(method559("?BI0")), method560(method559("9\\DrIy")), method560(method559("9\\DrJy")), method560(method559("9\\DrMy")), method560(method559("9\\DrHy")) };

    @OriginalMember(owner = "client!hka", name = "R", descriptor = "Ljava/lang/String;")
    public static String field683 = "";

    @OriginalMember(owner = "client!hka", name = "G", descriptor = "Lhl;")
    public static class556 field671 = new class556(128, 6);

    @OriginalMember(owner = "client!hka", name = "H", descriptor = "Liha;")
    public static class29 field688 = new class29(64);

    @OriginalMember(owner = "client!hka", name = "U", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!hka", name = "K", descriptor = "I")
    public static int field693 = 0;

    @OriginalMember(owner = "client!hka", name = "P", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!hka", name = "J", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!hka", name = "fb", descriptor = "I")
    private int field675;

    @OriginalMember(owner = "client!hka", name = "M", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!hka", name = "X", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!hka", name = "I", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!hka", name = "cb", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!hka", name = "Z", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!hka", name = "T", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!hka", name = "ab", descriptor = "Ljava/lang/Object;")
    public static Object field690;

    @OriginalMember(owner = "client!hka", name = "bb", descriptor = "[I")
    private int[] field670;

    @OriginalMember(owner = "client!hka", name = "eb", descriptor = "[[B")
    public static byte[][] field691;

    @OriginalMember(owner = "client!hka", name = "Q", descriptor = "[[I")
    private int[][] field674;

    @OriginalMember(owner = "client!hka", name = "Y", descriptor = "[[I")
    private int[][] field687;

    @OriginalMember(owner = "client!hka", name = "<init>", descriptor = "()V", line = 3)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(IB)[I", line = 11)
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field678;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int var4 = 0;
                int var5;
                for (var5 = class100.field1467[arg0] + this.field669; ~var5 > -1; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (var4 < this.field685 && ~var5 <= ~this.field670[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = ~(var4 & 1) == -1;
                int var8 = this.field670[var4];
                int var9 = this.field670[var4 + -1];
                if (this.field675 + var9 < var5 && ~(-this.field675 + var8) < ~var5) {
                    for (int var10 = 0; ~var10 > ~class449.field6969; ++var10) {
                        int var11 = var7 ? this.field673 : -this.field673;
                        int var12 = 0;
                        int var13;
                        for (var13 = (this.field686 * var11 >> 12) + class788.field11518[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~var12 > ~this.field679 && ~this.field687[var6][var12] >= ~var13) {
                            ++var12;
                        }
                        int var14 = var12 + -1;
                        int var15 = this.field687[var6][var14];
                        int var16 = this.field687[var6][var12];
                        if (var13 > this.field675 + var15 && ~(var16 - this.field675) < ~var13) {
                            var3[var10] = this.field674[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class405.method3257(var3, 0, class449.field6969, 0);
                }
            }
            if (arg1 != 123) {
                this.field675 = -89;
            }
            return var3;
        } catch (RuntimeException var18) {
            throw class590.method4333(var18, field694[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "b", descriptor = "(B)V", line = 111)
    public static final void method556(byte arg0) {
        try {
            ++field677;
            class739.field10873 = null;
            class461.field7107 = null;
            class433.field6804 = null;
            class334.field5452 = null;
            class794.field11608 = null;
            if (arg0 > -72) {
                method558(71);
            }
            class338.field5513 = null;
            class475.field7238 = null;
            class789.field11531 = null;
            class486.field7354 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field694[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(Z)V", line = 130)
    private final void method557(boolean arg0) {
        try {
            ++field676;
            Random var2 = new Random((long) this.field685);
            this.field675 = this.field682 / 2;
            this.field667 = 4096 / this.field685;
            this.field686 = 4096 / this.field679;
            int var3 = this.field686 / 2;
            this.field670 = new int[this.field685 + 1];
            this.field687 = new int[this.field685][this.field679 - -1];
            this.field674 = new int[this.field685][this.field679];
            int var4 = this.field667 / 2;
            this.field670[0] = 0;
            int var5 = 0;
            if (!arg0) {
                this.method67((byte) -31);
            }
            while (~var5 > ~this.field685) {
                if (~var5 < -1) {
                    int var6 = this.field667;
                    int var7 = (class235.method2039(var2, 4096, -74) - 2048) * this.field681 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field670[var5] = this.field670[var5 + -1] + var8;
                }
                this.field687[var5][0] = 0;
                for (int var9 = 0; this.field679 > var9; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field686;
                        int var11 = (class235.method2039(var2, 4096, -110) + -2048) * this.field684 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field687[var5][var9] = this.field687[var5][var9 + -1] - -var12;
                    }
                    this.field674[var5][var9] = this.field668 <= 0 ? 4096 : 4096 - class235.method2039(var2, this.field668, -113);
                }
                this.field687[var5][this.field679] = 4096;
                ++var5;
            }
            this.field670[this.field685] = 4096;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field694[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "d", descriptor = "(I)V", line = 212)
    public static void method558(int arg0) {
        try {
            field671 = null;
            if (arg0 < 76) {
                method558(-8);
            }
            field690 = null;
            field683 = null;
            field691 = null;
            field688 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field694[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(B)V", line = 230)
    public final void method67(byte arg0) {
        try {
            this.method557(true);
            ++field680;
            int var2 = 122 % ((arg0 - 73) / 34);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field694[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "a", descriptor = "(ILwq;I)V", line = 243)
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field672;
            if (arg0 > 96) {
                if (arg2 != 0) {
                    if (~arg2 != -2) {
                        if (~arg2 != -3) {
                            if (~arg2 != -4) {
                                if (arg2 != 4) {
                                    if (~arg2 != -6) {
                                        if (arg2 != 6) {
                                            if (arg2 == 7) {
                                                this.field668 = arg1.method1687((byte) -52);
                                            }
                                        } else {
                                            this.field682 = arg1.method1687((byte) -116);
                                        }
                                    } else {
                                        this.field669 = arg1.method1687((byte) -113);
                                    }
                                } else {
                                    this.field673 = arg1.method1687((byte) -43);
                                }
                            } else {
                                this.field681 = arg1.method1687((byte) -69);
                            }
                        } else {
                            this.field684 = arg1.method1687((byte) -99);
                        }
                    } else {
                        this.field685 = arg1.method1645((byte) -127);
                    }
                } else {
                    this.field679 = arg1.method1645((byte) -118);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field694[4] + arg0 + ',' + (arg1 != null ? field694[2] : field694[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method559(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 12);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method560(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 92;
                    break;
                default:
                    var10005 = 12;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
