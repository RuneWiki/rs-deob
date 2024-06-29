import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class515 extends class466 {

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    private int field7234 = 10;

    @OriginalMember(owner = "client!ai", name = "P", descriptor = "I")
    private int field7244 = 0;

    @OriginalMember(owner = "client!ai", name = "M", descriptor = "I")
    private int field7241 = 2048;

    @OriginalMember(owner = "client!ai", name = "N", descriptor = "[[Z")
    public static boolean[][] field7242 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!ai", name = "Q", descriptor = "Ldv;")
    public static class566 field7245 = new class566(15, 3);

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    public static int field7235;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!ai", name = "O", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!ai", name = "S", descriptor = "Lwl;")
    public static class346 field7247;

    @OriginalMember(owner = "client!ai", name = "R", descriptor = "Lra;")
    public static class91 field7246;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "[I")
    private int[] field7236;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "[I")
    private int[] field7239;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field7237;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field7244 = arg0.method110((byte) 118);
                }
            } else {
                this.field7241 = arg0.method93((byte) 109);
            }
        } else {
            this.field7234 = arg0.method110((byte) 96);
        }
        if (arg1 != -5062) {
            this.method6((class11) null, -2, -75);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class515() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public static void method2976(int arg0) {
        if (arg0 < -27) {
            field7242 = null;
            field7247 = null;
            field7245 = null;
            field7246 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public static final void method2977(byte arg0) {
        class320.field4337 = -1;
        if (arg0 != 21) {
            field7247 = null;
        }
        ++field7243;
        class40.field797 = 1;
        long var1 = 0L;
        if (class68.field1153 == null) {
            class464.method2712(35, (byte) -66);
        } else {
            class11 var3 = new class11(class203.method1227((byte) -117, class331.method2029(class68.field1153, -31881)));
            long var4 = var3.method85(-115);
            class103.field1569 = var3.method85(-103);
            class403.method2406(true, (byte) 98, "", class612.method3585(116, var4));
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field7238;
        int[] var3 = super.field6557.method565(arg0, arg1 ^ -24728);
        if (arg1 != 0) {
            return null;
        } else {
            if (super.field6557.field1163) {
                int var4 = class63.field1085[arg0];
                if (~this.field7244 != -1) {
                    for (int var5 = 0; class312.field4207 > var5; ++var5) {
                        int var6 = 0;
                        short var7 = 0;
                        int var8 = class431.field6129[var5];
                        int var9 = this.field7244;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (~var9 == -4) {
                                    var6 = 2048 - -(var8 - var4 >> 1);
                                }
                            } else {
                                var6 = (var4 + var8 + -4096 >> 1) + 2048;
                            }
                        } else {
                            var6 = var8;
                        }
                        for (int var10 = 0; var10 < this.field7234; ++var10) {
                            if (~var6 <= ~this.field7236[var10] && ~this.field7236[var10 + 1] < ~var6) {
                                if (~this.field7239[var10] < ~var6) {
                                    var7 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var7;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field7234; ++var12) {
                        if (this.field7236[var12] <= var4 && this.field7236[var12 + 1] > var4) {
                            if (this.field7239[var12] > var4) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class416.method2495(var3, 0, class312.field4207, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
    private final void method2978(boolean arg0) {
        ++field7240;
        this.field7236 = new int[this.field7234 + 1];
        int var2 = 0;
        this.field7239 = new int[this.field7234 + 1];
        int var3 = 4096 / this.field7234;
        int var4 = this.field7241 * var3 >> 12;
        if (!arg0) {
            this.field7239 = null;
        }
        for (int var5 = 0; ~this.field7234 < ~var5; ++var5) {
            this.field7236[var5] = var2;
            this.field7239[var5] = var2 + var4;
            var2 += var3;
        }
        this.field7236[this.field7234] = 4096;
        this.field7239[this.field7234] = 4096 - -this.field7239[0];
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 == -806066388) {
            ++field7235;
            this.method2978(true);
        }
    }
}
