import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class212 extends class45 {

    @OriginalMember(owner = "client!vv", name = "I", descriptor = "Lrn;")
    public static class174 field3033 = new class174(19, 4);

    @OriginalMember(owner = "client!vv", name = "P", descriptor = "Z")
    public static boolean field3040 = false;

    @OriginalMember(owner = "client!vv", name = "H", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!vv", name = "N", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!vv", name = "Q", descriptor = "Lmq;")
    public static class350 field3041;

    @OriginalMember(owner = "client!vv", name = "J", descriptor = "[Lev;")
    private class487[] field3034;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(II)V", line = 7)
    public static final void method1420(int arg0, int arg1) {
        ++field3039;
        if (~class289.field4118 == arg0) {
            class315.field4741.method2822(15, arg1);
        } else {
            class102.field1693 = arg1;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[[I)V", line = 21)
    private final void method1421(int arg0, int[][] arg1) {
        if (arg0 == -1) {
            ++field3032;
            int var3 = class259.field3768;
            int var4 = class457.field6849;
            class223.method1477((byte) -97, arg1);
            class485.method2883(0, 0, arg0 + -54, class506.field7463, class290.field4128);
            if (this.field3034 != null) {
                for (int var5 = 0; var5 < this.field3034.length; ++var5) {
                    class487 var6 = this.field3034[var5];
                    int var7 = var6.field7214;
                    int var8 = var6.field7216;
                    if (var7 >= 0) {
                        if (~var8 > -1) {
                            var6.method519(var4, var3, false);
                        } else {
                            var6.method516(var3, var4, 81);
                        }
                    } else if (var8 >= 0) {
                        var6.method515(var3, (byte) 12, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lcu;II)V", line = 72)
    public final void method37(class145 arg0, int arg1, int arg2) {
        ++field3037;
        if (arg1 == -26471) {
            if (~arg2 != -1) {
                if (~arg2 == -2) {
                    super.field844 = arg0.method1063((byte) -105) == 1;
                    return;
                }
            } else {
                this.field3034 = new class487[arg0.method1063((byte) -62)];
                for (int var4 = 0; ~var4 > ~this.field3034.length; ++var4) {
                    int var5 = arg0.method1063((byte) 104);
                    if (~var5 != -1) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field3034[var4] = class161.method1188(arg0, arg1 + 1011);
                                }
                            } else {
                                this.field3034[var4] = class107.method803(arg0, (byte) -83);
                            }
                        } else {
                            this.field3034[var4] = class201.method1393(arg0, -67);
                        }
                    } else {
                        this.field3034[var4] = class114.method849(0, arg0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 146)
    public class212() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)[I", line = 149)
    public final int[] method35(int arg0, int arg1) {
        ++field3036;
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            this.method1421(~arg0, super.field854.method862((byte) -122));
        }
        if (arg0 != 0) {
            field3040 = false;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)[[I", line = 173)
    public final int[][] method49(int arg0, int arg1) {
        if (arg0 != 8) {
            return null;
        } else {
            ++field3035;
            int[][] var3 = super.field833.method835(arg1, (byte) 23);
            if (super.field833.field1888) {
                int var4 = class259.field3768;
                int var5 = class457.field6849;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field833.method833(false);
                this.method1421(-1, var6);
                for (int var8 = 0; var8 < class457.field6849; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; class259.field3768 > var14; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class207.method1405(var15 << 4, 4080);
                        var12[var14] = class207.method1405(var15, 65280) >> 4;
                        var11[var14] = class207.method1405(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(B)V", line = 235)
    public static void method1422(byte arg0) {
        field3041 = null;
        if (arg0 != -37) {
            field3038 = -18;
        }
        field3033 = null;
    }
}
