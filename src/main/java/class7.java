import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class7 extends class288 {

    @OriginalMember(owner = "client!gf", name = "O", descriptor = "I")
    private int field95 = 409;

    @OriginalMember(owner = "client!gf", name = "K", descriptor = "I")
    private int field91 = 204;

    @OriginalMember(owner = "client!gf", name = "M", descriptor = "I")
    private int field93 = 1024;

    @OriginalMember(owner = "client!gf", name = "L", descriptor = "I")
    private int field92 = 0;

    @OriginalMember(owner = "client!gf", name = "T", descriptor = "I")
    private int field100 = 4;

    @OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
    private int field102 = 81;

    @OriginalMember(owner = "client!gf", name = "U", descriptor = "I")
    private int field101 = 8;

    @OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
    private int field103 = 1024;

    @OriginalMember(owner = "client!gf", name = "H", descriptor = "I")
    public static int field88 = 0;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "La;")
    public static class247 field83 = new class247();

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "Leg;")
    public static class272 field105 = new class272(50);

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
    public static int field106 = 0;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static volatile int field108 = -1;

    @OriginalMember(owner = "client!gf", name = "X", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!gf", name = "D", descriptor = "I")
    private int field84;

    @OriginalMember(owner = "client!gf", name = "E", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!gf", name = "F", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!gf", name = "I", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!gf", name = "J", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!gf", name = "P", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!gf", name = "R", descriptor = "I")
    private int field98;

    @OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!gf", name = "N", descriptor = "[I")
    private int[] field94;

    @OriginalMember(owner = "client!gf", name = "G", descriptor = "[[I")
    private int[][] field87;

    @OriginalMember(owner = "client!gf", name = "Q", descriptor = "[[I")
    private int[][] field97;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILjj;)V")
    public static final void method42(int arg0, class134 arg1) {
        ++field96;
        if (arg0 != 6) {
            field106 = 112;
        }
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z")
    public static final boolean method43(String arg0, byte arg1, String arg2) {
        int var3 = arg0.length();
        ++field99;
        int var4 = arg2.length();
        if (var4 > var3) {
            return false;
        } else {
            if (arg1 != 125) {
                field106 = -4;
            }
            for (int var5 = 0; var4 > var5; ++var5) {
                char var6 = arg0.charAt(var5);
                char var7 = arg2.charAt(var5);
                if (~var6 != ~var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && ~Character.toUpperCase(var6) != ~Character.toUpperCase(var7)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field89;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field93 = arg0.method1777(-120);
                                    }
                                } else {
                                    this.field102 = arg0.method1777(arg1 + -43);
                                }
                            } else {
                                this.field92 = arg0.method1777(-90);
                            }
                        } else {
                            this.field103 = arg0.method1777(-101);
                        }
                    } else {
                        this.field91 = arg0.method1777(-116);
                    }
                } else {
                    this.field95 = arg0.method1777(-121);
                }
            } else {
                this.field101 = arg0.method1779(-116);
            }
        } else {
            this.field100 = arg0.method1779(arg1 + -51);
        }
        if (arg1 != -19) {
            this.method26(-128, -28);
        }
    }

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
    private final void method44(int arg0) {
        ++field90;
        Random var2 = new Random((long) this.field101);
        this.field84 = 4096 / this.field100;
        this.field86 = 4096 / this.field101;
        this.field87 = new int[this.field101][this.field100 + 1];
        this.field94 = new int[this.field101 + 1];
        this.field98 = this.field102 / 2;
        if (arg0 != -2048) {
            field88 = 93;
        }
        this.field94[0] = 0;
        int var3 = this.field84 / 2;
        this.field97 = new int[this.field101][this.field100];
        int var4 = this.field86 / 2;
        for (int var5 = 0; ~var5 > ~this.field101; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field86;
                int var7 = (-2048 + class256.method1680(var2, (byte) 20, 4096)) * this.field91 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field94[var5] = this.field94[var5 + -1] + var8;
            }
            this.field87[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field100; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field84;
                    int var11 = (-2048 + class256.method1680(var2, (byte) 7, 4096)) * this.field95 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field87[var5][var9] = this.field87[var5][var9 + -1] + var12;
                }
                this.field97[var5][var9] = ~this.field93 >= -1 ? 4096 : 4096 + -class256.method1680(var2, (byte) 96, this.field93);
            }
            this.field87[var5][this.field100] = 4096;
        }
        this.field94[this.field101] = 4096;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field85;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                int var4 = 0;
                int var5;
                for (var5 = class1.field15[arg1] + this.field92; var5 < 0; var5 += 4096) {
                }
                while (var5 > 4096) {
                    var5 -= 4096;
                }
                while (~this.field101 < ~var4 && var5 >= this.field94[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                int var7 = this.field94[var4];
                boolean var8 = ~(1 & var4) == -1;
                int var9 = this.field94[var4 - 1];
                if (~var5 < ~(this.field98 + var9) && ~(-this.field98 + var7) < ~var5) {
                    for (int var10 = 0; ~class186.field2986 < ~var10; ++var10) {
                        int var11 = var8 ? this.field103 : -this.field103;
                        int var12;
                        for (var12 = (this.field84 * var11 >> 12) + class246.field3958[var10]; ~var12 > -1; var12 += 4096) {
                        }
                        while (var12 > 4096) {
                            var12 -= 4096;
                        }
                        int var13;
                        for (var13 = 0; var13 < this.field100 && ~this.field87[var6][var13] >= ~var12; ++var13) {
                        }
                        int var14 = this.field87[var6][var13];
                        int var15 = var13 + -1;
                        int var16 = this.field87[var6][var15];
                        if (this.field98 + var16 < var12 && -this.field98 + var14 > var12) {
                            var3[var10] = this.field97[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class56.method430(var3, 0, class186.field2986, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "(B)V")
    public static void method45(byte arg0) {
        field83 = null;
        if (arg0 != 85) {
            method43((String) null, (byte) 95, (String) null);
        }
        field105 = null;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
    public final void method16(byte arg0) {
        this.method44(-2048);
        ++field104;
        if (arg0 != -125) {
            this.method16((byte) 53);
        }
    }
}
