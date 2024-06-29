import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class14 extends class93 {

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    private int field402 = 1024;

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    private int field408 = 4;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    private int field398 = 409;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    private int field414 = 0;

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "I")
    private int field412 = 204;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "I")
    private int field415 = 81;

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "I")
    private int field416 = 8;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    private int field413 = 1024;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "Ljd;")
    public static class92 field399 = class202.method1325((byte) 90, "Texturen geladen)3");

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "D")
    public static double field409 = -1.0D;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "Ljd;")
    public static class92 field397 = class202.method1325((byte) 90, "Hidden)2use");

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "[I")
    private int[] field405;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "[[B")
    public static byte[][] field401;

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "[[I")
    private int[][] field396;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "[[I")
    private int[][] field411;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field418;
        int[] var3 = super.field1887.method916(arg0, -122);
        int var4 = 45 / ((arg1 - 67) / 42);
        if (super.field1887.field2757) {
            int var5 = 0;
            int var6;
            for (var6 = class166.field3271[arg0] + this.field414; var6 < 0; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (~this.field416 < ~var5 && ~this.field405[var5] >= ~var6) {
                ++var5;
            }
            float var7 = (float) this.field405[var5];
            float var8 = (float) this.field405[var5 - 1];
            if ((float) var6 > (float) this.field410 + var8 && (float) var6 < (float) (-this.field410) + var7) {
                for (int var9 = 0; var9 < class150.field2985; ++var9) {
                    int var10 = 0;
                    int var11 = ~(var5 % 2) == -1 ? this.field413 : -this.field413;
                    int var12;
                    for (var12 = (this.field404 * var11 >> 12) + class75.field1574[var9]; ~var12 > -1; var12 += 4096) {
                    }
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (this.field408 > var10 && ~this.field396[var5 - 1][var10] >= ~var12) {
                        ++var10;
                    }
                    float var13 = (float) this.field396[var5 + -1][var10 + -1];
                    float var14 = (float) this.field396[var5 + -1][var10];
                    if ((float) var12 > (float) this.field410 + var13 && (float) var12 < (float) (-this.field410) + var14) {
                        var3[var9] = this.field411[var5 + -1][var10 + -1];
                    } else {
                        var3[var9] = 0;
                    }
                }
            } else {
                class11.method77(var3, 0, class150.field2985, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
    public static void method85(boolean arg0) {
        field399 = null;
        if (arg0) {
            method88();
        }
        field401 = null;
        field397 = null;
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    private final void method86(int arg0) {
        Random var2 = new Random((long) this.field416);
        this.field396 = new int[this.field416][this.field408 + 1];
        this.field400 = 4096 / this.field416;
        this.field411 = new int[this.field416][this.field408];
        this.field405 = new int[this.field416 + 1];
        this.field410 = this.field415 / 2;
        this.field405[0] = 0;
        ++field417;
        this.field404 = 4096 / this.field408;
        int var3 = this.field404 / 2;
        int var4 = this.field400 / 2;
        if (arg0 < 105) {
            field399 = null;
        }
        for (int var5 = 0; ~var5 > ~this.field416; ++var5) {
            if (var5 > 0) {
                int var6 = this.field400;
                int var7 = (class42.method265(-1, 4096, var2) + -2048) * this.field412 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field405[var5] = this.field405[var5 + -1] + var8;
            }
            this.field396[var5][0] = 0;
            for (int var9 = 0; ~this.field408 < ~var9; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field404;
                    int var11 = (-2048 + class42.method265(-1, 4096, var2)) * this.field398 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field396[var5][var9] = this.field396[var5][var9 + -1] + var12;
                }
                this.field411[var5][var9] = this.field402 > 0 ? -class42.method265(-1, this.field402, var2) + 4096 : 4096;
            }
            this.field396[var5][this.field408] = 4096;
        }
        this.field405[this.field416] = 4096;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V")
    public class14() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public final void method87(byte arg0) {
        ++field403;
        if (arg0 == -85) {
            this.method86(106);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
    public static final void method88() {
        for (int var0 = 0; var0 < class124.field2525; ++var0) {
            class185 var1 = class91.field1793[var0];
            class67.method394(var1);
            class91.field1793[var0] = null;
        }
        class124.field2525 = 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 == 7) {
                                        this.field402 = arg1.method442(-21351);
                                    }
                                } else {
                                    this.field415 = arg1.method442(-21351);
                                }
                            } else {
                                this.field414 = arg1.method442(-21351);
                            }
                        } else {
                            this.field413 = arg1.method442(-21351);
                        }
                    } else {
                        this.field412 = arg1.method442(-21351);
                    }
                } else {
                    this.field398 = arg1.method442(-21351);
                }
            } else {
                this.field416 = arg1.method443(255);
            }
        } else {
            this.field408 = arg1.method443(255);
        }
        if (arg2 != 0) {
            this.field413 = -74;
        }
        ++field406;
    }
}
