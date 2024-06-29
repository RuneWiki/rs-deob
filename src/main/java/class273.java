import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class273 extends class30 {

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Len;")
    public static class290 field3737 = new class290("", 14);

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "S")
    public static short field3745 = 256;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "Lla;")
    public static class417 field3741;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "[Ldi;")
    private class111[] field3742;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([[IB)V", line = 3)
    private final void method1692(int[][] arg0, byte arg1) {
        ++field3736;
        int var3 = class31.field399;
        int var4 = 58 / ((arg1 - -51) / 58);
        int var5 = class148.field2197;
        class41.method362((byte) 90, arg0);
        class533.method3028(0, class649.field9002, 0, class353.field4694, 95);
        if (this.field3742 != null) {
            for (int var6 = 0; ~var6 > ~this.field3742.length; ++var6) {
                class111 var7 = this.field3742[var6];
                int var8 = var7.field1543;
                int var9 = var7.field1538;
                if (~var8 <= -1) {
                    if (~var9 <= -1) {
                        var7.method807(var3, (byte) -21, var5);
                    } else {
                        var7.method806(var3, var5, 0);
                    }
                } else if (var9 >= 0) {
                    var7.method804(var3, var5, 125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 52)
    public static void method1693(int arg0) {
        field3741 = null;
        field3737 = null;
        if (arg0 >= -87) {
            method1694((byte) 109);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILac;)V", line = 63)
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg0 > 100) {
            if (~arg1 == -1) {
                this.field3742 = new class111[arg2.method2874((byte) -75)];
                for (int var4 = 0; this.field3742.length > var4; ++var4) {
                    int var5 = arg2.method2874((byte) -75);
                    if (~var5 != -1) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (~var5 == -4) {
                                    this.field3742[var4] = class300.method1815(arg2, (byte) -49);
                                }
                            } else {
                                this.field3742[var4] = class680.method3859(arg2, (byte) -118);
                            }
                        } else {
                            this.field3742[var4] = class128.method913(false, arg2);
                        }
                    } else {
                        this.field3742[var4] = class495.method2792(123, arg2);
                    }
                }
            } else if (arg1 == 1) {
                super.field378 = arg2.method2874((byte) -75) == 1;
            }
            ++field3743;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 138)
    public static final void method1694(byte arg0) {
        ++field3735;
        class234.field3232 = -1;
        class265.field3585 = null;
        int var1 = -66 / ((63 - arg0) / 36);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)[[I", line = 149)
    public final int[][] method30(int arg0, byte arg1) {
        ++field3738;
        int[][] var3 = super.field377.method3683(arg0, (byte) 119);
        if (arg1 != 7) {
            method1693(-123);
        }
        if (super.field377.field9085) {
            int var4 = class31.field399;
            int var5 = class148.field2197;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field377.method3682(arg1 ^ 7);
            this.method1692(var6, (byte) 19);
            for (int var8 = 0; ~class148.field2197 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class31.field399 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class136.method950(var15, 255) << 4;
                    var12[var14] = class136.method950(var15, 65280) >> 4;
                    var11[var14] = class136.method950(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(IB)[B", line = 224)
    public static final byte[] method1695(int arg0, byte arg1) {
        ++field3744;
        if (arg1 > -58) {
            field3741 = null;
        }
        class96 var2 = (class96) class88.field1278.method3543((long) arg0, -24045);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class351.method2023(var7, -34, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class96(var3);
            class88.field1278.method3548((long) arg0, 7, var2);
        }
        return var2.field1342;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[I", line = 273)
    public final int[] method48(int arg0, int arg1) {
        ++field3740;
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (arg0 != 1) {
            this.method48(-19, -27);
        }
        if (super.field374.field9032) {
            this.method1692(super.field374.method3663(0), (byte) -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 297)
    public class273() {
        super(0, true);
    }
}
