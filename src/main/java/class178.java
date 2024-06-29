import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class178 extends class167 {

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "[[B")
    public static byte[][] field3221 = new byte[1000][];

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "[I")
    public static int[] field3226 = new int[50];

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field3220 = -1;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "[B")
    public static byte[] field3222 = new byte[32896];

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field3223;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "[Lvh;")
    private class237[] field3225;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BI)[I")
    public final int[] method53(byte arg0, int arg1) {
        ++field3224;
        if (arg0 != -96) {
            return null;
        } else {
            int[] var3 = super.field3013.method1463((byte) -115, arg1);
            if (super.field3013.field4085) {
                this.method1237(super.field3013.method1465(40), (byte) -67);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method116(50, -28);
        }
        if (~arg2 == -1) {
            this.field3225 = new class237[arg0.method998(103)];
            for (int var4 = 0; this.field3225.length > var4; ++var4) {
                int var5 = arg0.method998(58);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (var5 != 2) {
                            if (var5 == 3) {
                                this.field3225[var4] = class165.method1171(0, arg0);
                            }
                        } else {
                            this.field3225[var4] = class70.method491((byte) -103, arg0);
                        }
                    } else {
                        this.field3225[var4] = class71.method508(arg0, 4096);
                    }
                } else {
                    this.field3225[var4] = class198.method1315(5, arg0);
                }
            }
        } else if (~arg2 == -2) {
            super.field3009 = ~arg0.method998(82) == -2;
        }
        ++field3227;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([[IB)V")
    private final void method1237(int[][] arg0, byte arg1) {
        ++field3229;
        int var3 = class115.field2146;
        int var4 = class57.field1185;
        if (arg1 != -67) {
            field3228 = -67;
        }
        class78.method546(arg0, arg1 ^ -327);
        class119.method832(class34.field801, 0, class101.field1839, (byte) -56, 0);
        if (this.field3225 != null) {
            for (int var5 = 0; ~this.field3225.length < ~var5; ++var5) {
                class237 var6 = this.field3225[var5];
                int var7 = var6.field4281;
                int var8 = var6.field4291;
                if (var7 >= 0) {
                    if (~var8 > -1) {
                        var6.method596((byte) 122, var3, var4);
                    } else {
                        var6.method595((byte) -82, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method598(var4, var3, -18503);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)V")
    public static void method1238(int arg0) {
        int var1 = 30 % ((arg0 - 8) / 62);
        field3222 = null;
        field3221 = null;
        field3226 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != -9179) {
            field3222 = null;
        }
        ++field3223;
        int[][] var3 = super.field3022.method1148(arg0, 8708);
        if (super.field3022.field2957) {
            int var4 = class115.field2146;
            int var5 = class57.field1185;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3022.method1151(127);
            this.method1237(var6, (byte) -67);
            for (int var8 = 0; ~class57.field1185 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; ~var14 > ~class115.field2146; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class209.method1370(var15 << 4, 4080);
                    var11[var14] = class209.method1370(var15, 65280) >> 4;
                    var13[var14] = class209.method1370(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; var2 <= var1; ++var2) {
                field3222[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }
}
