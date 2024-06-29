import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class348 extends class145 {

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "I")
    private int field4703 = 1024;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    private int field4701 = 8;

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
    private int field4700 = 1024;

    @OriginalMember(owner = "client!lm", name = "X", descriptor = "I")
    private int field4716 = 81;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    private int field4698 = 204;

    @OriginalMember(owner = "client!lm", name = "S", descriptor = "I")
    private int field4711 = 0;

    @OriginalMember(owner = "client!lm", name = "V", descriptor = "I")
    private int field4714 = 4;

    @OriginalMember(owner = "client!lm", name = "Z", descriptor = "I")
    private int field4718 = 409;

    @OriginalMember(owner = "client!lm", name = "Y", descriptor = "Lio;")
    public static class286 field4717 = new class286(5000);

    @OriginalMember(owner = "client!lm", name = "db", descriptor = "Lik;")
    public static class410 field4722 = new class410(64);

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    private int field4702;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!lm", name = "Q", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!lm", name = "R", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!lm", name = "T", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!lm", name = "U", descriptor = "I")
    public static int field4713;

    @OriginalMember(owner = "client!lm", name = "W", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!lm", name = "ab", descriptor = "I")
    private int field4719;

    @OriginalMember(owner = "client!lm", name = "bb", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!lm", name = "cb", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!lm", name = "eb", descriptor = "Z")
    public static boolean field4723;

    @OriginalMember(owner = "client!lm", name = "P", descriptor = "[I")
    private int[] field4708;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "[[I")
    private int[][] field4699;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "[[I")
    private int[][] field4707;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "(I)V")
    public static final void method2196(int arg0) {
        class236.field3287 = null;
        class236.field3273 = null;
        class334.field4534 = null;
        class77.field1152 = null;
        class1.field4 = null;
        class90.field1346 = null;
        ++field4715;
        class277.field3734 = null;
        class422.field5901 = null;
        if (arg0 == 4404) {
            class399.field5586 = null;
            class44.field703 = null;
            class134.field1913 = null;
            class236.field3283 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
    public class348() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
    private final void method2197(boolean arg0) {
        ++field4710;
        Random var2 = new Random((long) this.field4701);
        this.field4702 = this.field4716 / 2;
        this.field4721 = 4096 / this.field4714;
        this.field4719 = 4096 / this.field4701;
        int var3 = this.field4721 / 2;
        int var4 = this.field4719 / 2;
        this.field4707 = new int[this.field4701][this.field4714];
        this.field4708 = new int[this.field4701 + 1];
        this.field4699 = new int[this.field4701][this.field4714 + 1];
        this.field4708[0] = 0;
        for (int var5 = 0; this.field4701 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field4719;
                int var7 = (-2048 + class283.method1785((byte) 23, 4096, var2)) * this.field4698 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4708[var5] = this.field4708[var5 + -1] + var8;
            }
            this.field4699[var5][0] = 0;
            for (int var9 = 0; this.field4714 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field4721;
                    int var11 = (-2048 + class283.method1785((byte) 23, 4096, var2)) * this.field4718 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4699[var5][var9] = this.field4699[var5][var9 + -1] + var12;
                }
                this.field4707[var5][var9] = ~this.field4703 < -1 ? 4096 + -class283.method1785((byte) 23, this.field4703, var2) : 4096;
            }
            this.field4699[var5][this.field4714] = 4096;
        }
        if (!arg0) {
            this.field4698 = 3;
        }
        this.field4708[this.field4701] = 4096;
    }

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "(I)V")
    public static void method2198(int arg0) {
        field4717 = null;
        field4722 = null;
        if (arg0 != 0) {
            method2196(44);
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field4706;
        if (arg0 != 77) {
            this.field4718 = -35;
        }
        this.method2197(true);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field4705;
        int[] var3 = super.field2218.method1614(51, arg0);
        int var4 = 1 / ((16 - arg1) / 49);
        if (super.field2218.field3396) {
            int var5 = 0;
            int var6;
            for (var6 = class134.field1902[arg0] + this.field4711; var6 < 0; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~this.field4701 < ~var5 && this.field4708[var5] <= var6) {
                ++var5;
            }
            int var7 = var5 + -1;
            boolean var8 = ~(var5 & 1) == -1;
            int var9 = this.field4708[var5];
            int var10 = this.field4708[var5 + -1];
            if (~var6 < ~(this.field4702 + var10) && -this.field4702 + var9 > var6) {
                for (int var11 = 0; var11 < class156.field2364; ++var11) {
                    int var12 = 0;
                    int var13 = var8 ? this.field4700 : -this.field4700;
                    int var14;
                    for (var14 = (this.field4721 * var13 >> 12) + class229.field3181[var11]; ~var14 > -1; var14 += 4096) {
                    }
                    while (~var14 < -4097) {
                        var14 -= 4096;
                    }
                    while (var12 < this.field4714 && this.field4699[var7][var12] <= var14) {
                        ++var12;
                    }
                    int var15 = var12 + -1;
                    int var16 = this.field4699[var7][var15];
                    int var17 = this.field4699[var7][var12];
                    if (this.field4702 + var16 < var14 && ~var14 > ~(-this.field4702 + var17)) {
                        var3[var11] = this.field4707[var7][var15];
                    } else {
                        var3[var11] = 0;
                    }
                }
            } else {
                class152.method1171(var3, 0, class156.field2364, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V")
    public static final void method2199() {
        for (int var0 = 0; var0 < class275.field3692; ++var0) {
            class228 var1 = class396.field5544[var0];
            class167.method1262(var1);
            class396.field5544[var0] = null;
        }
        class275.field3692 = 0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BZLjava/lang/String;)V")
    public static final void method2200(byte arg0, boolean arg1, String arg2) {
        if (arg0 <= 1) {
            field4717 = null;
        }
        String var3 = arg2.toLowerCase();
        ++field4709;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class330.field4498 : class179.field2634);
        for (int var8 = var6; ~var7 < ~var8; ++var8) {
            class102 var11 = class335.method2122(var8, 93);
            if (var11.field1516 && ~var11.method872(false).toLowerCase().indexOf(var3) != 0) {
                if (~var5 <= -51) {
                    class358.field4858 = null;
                    class97.field1406 = -1;
                    return;
                }
                if (~var4.length >= ~var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; ++var13) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class97.field1406 = var5;
        class358.field4858 = var4;
        class221.field3052 = 0;
        String[] var9 = new String[class97.field1406];
        for (int var10 = 0; ~var10 > ~class97.field1406; ++var10) {
            var9[var10] = class335.method2122(var4[var10], 87).method872(false);
        }
        class1.method7(var9, -106, class358.field4858);
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)V")
    public static final void method2201(int arg0) {
        class387.field5450.method211(((float) class73.field1095 * 0.1F + 0.7F) * class440.field6325);
        ++field4713;
        if (arg0 == -6120) {
            class387.field5450.method151(class183.field2657, class445.field6403, class341.field4657, (float) class276.field3712, (float) class75.field1120, (float) class228.field3173);
            class387.field5450.method170(class367.field5043);
        }
    }

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "(I)V")
    public static final void method2202(int arg0) {
        for (class64 var1 = (class64) class204.field2865.method608(-94); var1 != null; var1 = (class64) class204.field2865.method606((byte) 40)) {
            int var2 = var1.field976;
            if (class15.method76(6, var2)) {
                boolean var3 = true;
                class139[] var4 = class291.field3949[var2];
                for (int var5 = 0; ~var5 > ~var4.length; ++var5) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field2048;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field5349;
                    class139 var7 = class10.method57(arg0 + 65535, var6);
                    if (var7 != null) {
                        class10.method52(var7, (byte) -89);
                    }
                }
            }
        }
        if (arg0 != 0) {
            field4723 = true;
        }
        ++field4712;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lap;BI)V")
    public final void method2(class289 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field4703 = arg0.method1853(-104);
                                    }
                                } else {
                                    this.field4716 = arg0.method1853(-75);
                                }
                            } else {
                                this.field4711 = arg0.method1853(97);
                            }
                        } else {
                            this.field4700 = arg0.method1853(93);
                        }
                    } else {
                        this.field4698 = arg0.method1853(100);
                    }
                } else {
                    this.field4718 = arg0.method1853(-91);
                }
            } else {
                this.field4701 = arg0.method1861((byte) -72);
            }
        } else {
            this.field4714 = arg0.method1861((byte) -72);
        }
        int var5 = -73 / ((11 - arg1) / 52);
        ++field4704;
    }
}
