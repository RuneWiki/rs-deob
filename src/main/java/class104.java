import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class104 extends class83 {

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    private int field1272 = 10;

    @OriginalMember(owner = "client!lr", name = "Q", descriptor = "I")
    private int field1278 = 2048;

    @OriginalMember(owner = "client!lr", name = "X", descriptor = "I")
    private int field1285 = 0;

    @OriginalMember(owner = "client!lr", name = "S", descriptor = "Z")
    public static boolean field1280 = false;

    @OriginalMember(owner = "client!lr", name = "Y", descriptor = "Lph;")
    public static class114 field1286 = new class114(100);

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!lr", name = "T", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!lr", name = "U", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!lr", name = "V", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!lr", name = "W", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!lr", name = "Z", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "Ldj;")
    public static class304 field1273;

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "[I")
    private int[] field1275;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "[I")
    private int[] field1277;

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V", line = 119)
    public class104() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method556(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2048) {
            return -108;
        } else {
            ++field1274;
            if (~arg2 > ~arg0) {
                return arg0;
            } else {
                return arg2 <= arg3 ? arg2 : arg3;
            }
        }
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V", line = 20)
    public static final void method557(int arg0) {
        ++field1284;
        if (class192.field2420 > 0) {
            class268.method1493(14);
        } else {
            class32.field316 = class264.field3605;
            class264.field3605 = null;
            class352.method2159(40, (byte) 65);
            int var1 = 44 / ((79 - arg0) / 47);
        }
    }

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)V", line = 45)
    private final void method558(int arg0) {
        ++field1282;
        int var2 = 0;
        this.field1277 = new int[this.field1272 + 1];
        this.field1275 = new int[this.field1272 + 1];
        if (arg0 != 28175) {
            this.method120(true);
        }
        int var3 = 4096 / this.field1272;
        int var4 = this.field1278 * var3 >> 12;
        for (int var5 = 0; this.field1272 > var5; ++var5) {
            this.field1275[var5] = var2;
            this.field1277[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field1275[this.field1272] = 4096;
        this.field1277[this.field1272] = this.field1277[0] + 4096;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V", line = 79)
    public static void method559(byte arg0) {
        if (arg0 < 53) {
            field1280 = true;
        }
        field1273 = null;
        field1286 = null;
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)V", line = 100)
    public final void method120(boolean arg0) {
        ++field1287;
        this.method558(28175);
        if (arg0) {
            this.method37(84, -34);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I", line = 122)
    public final int[] method37(int arg0, int arg1) {
        ++field1276;
        if (arg0 != 2) {
            this.method35(-19, (byte) 32, (class250) null);
        }
        int[] var3 = super.field916.method1813(arg1, (byte) -32);
        if (super.field916.field4174) {
            int var4 = class225.field3036[arg1];
            if (~this.field1285 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1272; ++var6) {
                    if (var4 >= this.field1275[var6] && var4 < this.field1275[var6 + 1]) {
                        if (~var4 > ~this.field1277[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class358.method2180(var3, 0, class420.field6139, var5);
            } else {
                for (int var7 = 0; class420.field6139 > var7; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class402.field5863[var7];
                    int var11 = this.field1285;
                    if (~var11 != -2) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (var10 - var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; this.field1272 > var12; ++var12) {
                        if (var8 >= this.field1275[var12] && var8 < this.field1275[var12 + 1]) {
                            if (~this.field1277[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLtq;)V", line = 240)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field1279;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field1285 = arg2.method1350(31351);
                }
            } else {
                this.field1278 = arg2.method1374(-2);
            }
        } else {
            this.field1272 = arg2.method1350(31351);
        }
        int var5 = -14 / ((-27 - arg1) / 50);
    }
}
