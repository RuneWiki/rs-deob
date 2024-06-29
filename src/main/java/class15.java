import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class15 extends class128 {

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    private int field204 = 4096;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "[I")
    private int[] field209 = new int[3];

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    private int field206 = 4096;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    private int field201 = 4096;

    @OriginalMember(owner = "client!un", name = "X", descriptor = "I")
    private int field212 = 409;

    @OriginalMember(owner = "client!un", name = "I", descriptor = "Ljava/lang/String;")
    public static String field199 = "You can't add yourself to your own ignore list.";

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    public static int field203 = 128;

    @OriginalMember(owner = "client!un", name = "Y", descriptor = "Ljava/lang/String;")
    public static String field213 = "Walk here";

    @OriginalMember(owner = "client!un", name = "V", descriptor = "[C")
    public static char[] field210 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!un", name = "bb", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!un", name = "Z", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!un", name = "cb", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!un", name = "db", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!un", name = "ab", descriptor = "[[[B")
    public static byte[][][] field215;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "(I)V", line = 6)
    public static void method101(int arg0) {
        field213 = null;
        field210 = null;
        int var1 = 23 / ((59 - arg0) / 54);
        field215 = (byte[][][]) null;
        field199 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I", line = 27)
    public final int[][] method102(int arg0, int arg1) {
        field218++;
        int[][] var3 = this.field1755.method875(arg1 ^ 0x13CB, arg0);
        if (arg1 != 5110) {
            method106(-31, (byte) 31);
        }
        if (this.field1755.field1815) {
            int[][] var4 = this.method855(-3102, arg0, 0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class10.field141; var11++) {
                int var12 = var6[var11];
                int var13 = var12 - this.field209[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 <= this.field212) {
                    int var14 = var8[var11];
                    int var15 = var14 - this.field209[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field212 >= var15) {
                        int var16 = var5[var11];
                        int var17 = var16 - this.field209[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field212 >= var17) {
                            var7[var11] = this.field201 * var12 >> 12;
                            var9[var11] = this.field206 * var14 >> 12;
                            var10[var11] = this.field204 * var16 >> 12;
                        } else {
                            var7[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        }
                    } else {
                        var7[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var5[var11];
                    }
                } else {
                    var7[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var5[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lcc;I)V", line = 117)
    public static final void method103(class263 arg0, int arg1) {
        field211++;
        int var2 = 3 / ((-arg1 - 8) / 38);
        class263 var3 = class258.method1871(arg0, 16011);
        int var4;
        int var5;
        if (var3 == null) {
            var4 = class314.field4847;
            var5 = class188.field2712;
        } else {
            var5 = var3.field3989;
            var4 = var3.field4096;
        }
        class216.method1489(false, var5, var4, arg0, 250);
        class187.method1297((byte) 94, arg0, var5, var4);
    }

    @OriginalMember(owner = "client!un", name = "h", descriptor = "(I)V", line = 146)
    public static final void method104(int arg0) {
        field214++;
        if (!class19.field253) {
            return;
        }
        class61.field752 = null;
        class19.field253 = false;
        class285.field4491 = null;
        if (arg0 != 50) {
            field199 = (String) null;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V", line = 288)
    public class15() {
        super(1, false);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILlc;BI)[Lbi;", line = 170)
    public static final class91[] method105(int arg0, class175 arg1, byte arg2, int arg3) {
        field207++;
        if (arg2 != -44) {
            method103((class263) null, -24);
        }
        return class304.method2132((byte) -51, arg3, arg0, arg1) ? class301.method2123((byte) 63) : null;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(IB)I", line = 208)
    public static final int method106(int arg0, byte arg1) {
        field198++;
        if (arg1 != 112) {
            field213 = (String) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lp;II)V", line = 220)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            return;
        }
        field205++;
        if (arg1 == 0) {
            this.field212 = arg0.method624(14612);
        } else if (arg1 == 1) {
            this.field204 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field206 = arg0.method624(14612);
        } else if (arg1 == 3) {
            this.field201 = arg0.method624(14612);
        } else if (arg1 == 4) {
            int var5 = arg0.method622((byte) -108);
            this.field209[1] = class229.method1613(var5 >> 4, 4080);
            this.field209[2] = class229.method1613(var5, 255) >> 12;
            this.field209[0] = class229.method1613(var5, 16711680) << 4;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 303)
    public static final void method108(byte arg0, String arg1, boolean arg2) {
        field202++;
        if (arg0 > -35) {
            field217 = -79;
        }
        if (!arg2) {
            try {
                class122.method824(class9.field131.field4179, 25315, "loggedout");
            } catch (Throwable var9) {
            }
            try {
                class110.field1561.getAppletContext().showDocument(new URL(class110.field1561.getCodeBase(), arg1), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class250.field3787 && class291.field4572) {
            try {
                class122.method826(class9.field131.field4179, new Object[] { (new URL(class110.field1561.getCodeBase(), arg1)).toString() }, (byte) 61, "openjs");
                return;
            } catch (Throwable var10) {
            }
        }
        try {
            class110.field1561.getAppletContext().showDocument(new URL(class110.field1561.getCodeBase(), arg1), "_blank");
        } catch (Exception var7) {
        }
    }
}
