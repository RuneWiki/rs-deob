import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class182 extends class198 {

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
    private int field2810 = 0;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "I")
    private int field2813 = 81;

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field2809 = 1024;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "I")
    private int field2816 = 8;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    private int field2827 = 409;

    @OriginalMember(owner = "client!ei", name = "T", descriptor = "I")
    private int field2819 = 1024;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
    private int field2833 = 204;

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "I")
    private int field2834 = 4;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "Z")
    public static boolean field2830 = true;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "I")
    private int field2814;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ei", name = "S", descriptor = "I")
    private int field2818;

    @OriginalMember(owner = "client!ei", name = "U", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ei", name = "W", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
    private int field2832;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "[I")
    private int[] field2811;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "[[I")
    private int[][] field2815;

    @OriginalMember(owner = "client!ei", name = "V", descriptor = "[[I")
    private int[][] field2821;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Luf;")
    public static final class184 method1209(byte arg0, int arg1) {
        ++field2828;
        if (arg0 >= -24) {
            return null;
        } else {
            class184 var2 = (class184) class18.field254.method149((byte) -91, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class31.field388.method1877(arg1, 34, (byte) 87);
                class184 var4 = new class184();
                if (var3 != null) {
                    var4.method1224(new class202(var3), arg1, -1);
                }
                class18.field254.method152(var4, (long) arg1, true);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;ZZ)V")
    public static final void method1210(String arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            method1210((String) null, true, true);
        }
        if (arg2) {
            try {
                class179.field2788.getAppletContext().showDocument(new URL(class179.field2788.getCodeBase(), arg0), "_blank");
            } catch (Exception var5) {
            }
        } else {
            try {
                class291.method2038("loggedout", 20042, class259.field4254.field4211);
            } catch (Throwable var4) {
            }
            try {
                class179.field2788.getAppletContext().showDocument(new URL(class179.field2788.getCodeBase(), arg0), "_top");
            } catch (Exception var3) {
            }
        }
        ++field2831;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = 78 % ((60 - arg0) / 61);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field2809 = arg1.method1419(87);
                                    }
                                } else {
                                    this.field2813 = arg1.method1419(97);
                                }
                            } else {
                                this.field2810 = arg1.method1419(69);
                            }
                        } else {
                            this.field2819 = arg1.method1419(68);
                        }
                    } else {
                        this.field2833 = arg1.method1419(77);
                    }
                } else {
                    this.field2827 = arg1.method1419(110);
                }
            } else {
                this.field2816 = arg1.method1420((byte) 0);
            }
        } else {
            this.field2834 = arg1.method1420((byte) 0);
        }
        ++field2822;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)Lea;")
    public static final class38 method1211(int arg0) {
        ++field2817;
        int var1 = class263.field4341[0] * class184.field2854[0];
        byte[] var2 = class56.field758[0];
        if (arg0 < 72) {
            return null;
        } else {
            class38 var5;
            if (!class117.field1771[0]) {
                int[] var3 = new int[var1];
                for (int var4 = 0; ~var4 > ~var1; ++var4) {
                    var3[var4] = class12.field157[class10.method53(255, var2[var4])];
                }
                var5 = new class38(class196.field3118, class268.field4396, class239.field3781[0], class272.field4457[0], class184.field2854[0], class263.field4341[0], var3);
            } else {
                byte[] var6 = class224.field3568[0];
                int[] var7 = new int[var1];
                for (int var8 = 0; var8 < var1; ++var8) {
                    var7[var8] = class82.method554(class10.method53(-16777216, var6[var8] << 24), class12.field157[class10.method53(var2[var8], 255)]);
                }
                var5 = new class108(class196.field3118, class268.field4396, class239.field3781[0], class272.field4457[0], class184.field2854[0], class263.field4341[0], var7);
            }
            class270.method1856(101);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILfa;)I")
    public static final int method1212(int arg0, class273 arg1) {
        ++field2823;
        int var2 = arg0;
        if (arg1.method1874(class100.field1515, 3883)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1874(class127.field1960, 3883)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        this.method1213((byte) 120);
        int var2 = 77 / ((-46 - arg0) / 47);
        ++field2820;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)V")
    private final void method1213(byte arg0) {
        Random var2 = new Random((long) this.field2816);
        this.field2815 = new int[this.field2816][this.field2834];
        ++field2826;
        this.field2821 = new int[this.field2816][this.field2834 + 1];
        this.field2811 = new int[this.field2816 + 1];
        int var3 = 88 / ((47 - arg0) / 49);
        this.field2811[0] = 0;
        this.field2814 = 4096 / this.field2834;
        this.field2832 = 4096 / this.field2816;
        this.field2818 = this.field2813 / 2;
        int var4 = this.field2832 / 2;
        int var5 = this.field2814 / 2;
        for (int var6 = 0; ~var6 > ~this.field2816; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field2832;
                int var8 = (-2048 + class79.method524(4096, 117, var2)) * this.field2833 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field2811[var6] = this.field2811[var6 + -1] + var9;
            }
            this.field2821[var6][0] = 0;
            for (int var10 = 0; this.field2834 > var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field2814;
                    int var12 = (class79.method524(4096, 69, var2) - 2048) * this.field2827 >> 12;
                    int var13 = (var5 * var12 >> 12) + var11;
                    this.field2821[var6][var10] = this.field2821[var6][var10 + -1] + var13;
                }
                this.field2815[var6][var10] = ~this.field2809 < -1 ? 4096 + -class79.method524(this.field2809, 122, var2) : 4096;
            }
            this.field2821[var6][this.field2834] = 4096;
        }
        this.field2811[this.field2816] = 4096;
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field2829;
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                int var4 = 0;
                int var5;
                for (var5 = class42.field591[arg1] + this.field2810; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field2816 && var5 >= this.field2811[var4]) {
                    ++var4;
                }
                int var6 = var4 + -1;
                int var7 = this.field2811[var4];
                int var8 = this.field2811[var4 + -1];
                boolean var9 = (1 & var4) == 0;
                if (~var5 < ~(this.field2818 + var8) && ~(-this.field2818 + var7) < ~var5) {
                    for (int var10 = 0; class42.field590 > var10; ++var10) {
                        int var11 = var9 ? this.field2819 : -this.field2819;
                        int var12 = class152.field2367[var10] - -(this.field2814 * var11 >> 12);
                        int var13 = 0;
                        while (~var12 > -1) {
                            var12 += 4096;
                        }
                        while (var12 > 4096) {
                            var12 -= 4096;
                        }
                        while (~var13 > ~this.field2834 && ~this.field2821[var6][var13] >= ~var12) {
                            ++var13;
                        }
                        int var14 = this.field2821[var6][var13];
                        int var15 = var13 - 1;
                        int var16 = this.field2821[var6][var15];
                        if (~(this.field2818 + var16) > ~var12 && -this.field2818 + var14 > var12) {
                            var3[var10] = this.field2815[var6][var15];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class158.method1050(var3, 0, class42.field590, 0);
                }
            }
            return var3;
        }
    }
}
