import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class66 extends class166 {

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    private int field1263 = 0;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    private int field1269 = 4096;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "[I")
    public static int[] field1267 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lhj;")
    public static class69 field1270 = class181.method1318("Sprites geladen)3", (byte) -127);

    @OriginalMember(owner = "client!af", name = "W", descriptor = "Lka;")
    public static class243 field1271 = new class243();

    @OriginalMember(owner = "client!af", name = "cb", descriptor = "[I")
    public static int[] field1277 = new int[500];

    @OriginalMember(owner = "client!af", name = "bb", descriptor = "[B")
    public static byte[] field1276;

    @OriginalMember(owner = "client!af", name = "eb", descriptor = "Lhj;")
    public static class69 field1279;

    @OriginalMember(owner = "client!af", name = "fb", descriptor = "Lhj;")
    public static class69 field1280;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!af", name = "X", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!af", name = "Y", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!af", name = "ab", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!af", name = "db", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!af", name = "gb", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!af", name = "Z", descriptor = "Lhj;")
    public static class69 field1274;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "Lnc;")
    public static class83 field1268;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "[[[B")
    public static byte[][][] field1265;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)[[I")
    public final int[][] method134(int arg0, int arg1) {
        ++field1273;
        if (arg0 != 0) {
            method428((class83) null, -115, 27);
        }
        int[][] var3 = super.field3064.method320(arg1, (byte) -48);
        if (super.field3064.field979) {
            int[][] var4 = this.method1229(arg1, arg0 + 23580, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[1];
            for (int var11 = 0; class253.field4565 > var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var10[var11];
                int var14 = var6[var11];
                if (this.field1263 > var12) {
                    var7[var11] = this.field1263;
                } else if (~this.field1269 > ~var12) {
                    var7[var11] = this.field1269;
                } else {
                    var7[var11] = var12;
                }
                if (this.field1263 <= var13) {
                    if (~var13 >= ~this.field1269) {
                        var8[var11] = var13;
                    } else {
                        var8[var11] = this.field1269;
                    }
                } else {
                    var8[var11] = this.field1263;
                }
                if (var14 < this.field1263) {
                    var9[var11] = this.field1263;
                } else if (~var14 < ~this.field1269) {
                    var9[var11] = this.field1269;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
    public static void method427(boolean arg0) {
        field1279 = null;
        field1267 = null;
        field1274 = null;
        field1265 = null;
        field1271 = null;
        field1280 = null;
        field1276 = null;
        field1277 = null;
        field1270 = null;
        if (arg0) {
            field1268 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class66() {
        super(1, false);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)[I")
    public final int[] method20(int arg0, int arg1) {
        ++field1266;
        int[] var3 = super.field3071.method1252(arg0, true);
        if (super.field3071.field3142) {
            int[] var4 = this.method1231(125, arg0, 0);
            for (int var5 = 0; ~var5 > ~class253.field4565; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field1263) {
                    if (~var6 < ~this.field1269) {
                        var3[var5] = this.field1269;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field1263;
                }
            }
        }
        if (arg1 != 8388607) {
            this.method20(76, -50);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lnc;II)Lfj;")
    public static final class237 method428(class83 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method586(arg2, -20658);
        ++field1272;
        if (arg1 >= -39) {
            field1278 = -127;
        }
        return var3 == null ? null : new class237(var3);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BLfh;I)V")
    public final void method18(byte arg0, class128 arg1, int arg2) {
        if (arg0 != 96) {
            field1279 = null;
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3074 = ~arg1.method937(false) == -2;
                }
            } else {
                this.field1269 = arg1.method912(108);
            }
        } else {
            this.field1263 = arg1.method912(63);
        }
        ++field1264;
    }

    static {
        int var0 = 0;
        field1276 = new byte[32896];
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field1276[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field1279 = null;
        field1280 = class181.method1318("lila:", (byte) -121);
    }
}
