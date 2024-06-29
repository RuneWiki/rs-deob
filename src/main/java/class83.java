import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class83 extends class135 {

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "I")
    private int field1206 = -1;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "[[I")
    public static int[][] field1205 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "Lqj;")
    public static class196 field1199 = class80.method502("<col=00ffff>", -48);

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lqj;")
    public static class196 field1209 = class80.method502("Untersuchen", -48);

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public int field1208;

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "[I")
    public int[] field1210;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field1206 = arg0.method318(true);
        }
        ++field1212;
        if (arg2 != -16231) {
            this.method516(-6);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public final int method515(int arg0) {
        if (arg0 != -26001) {
            this.method164(-80, 74);
        }
        ++field1214;
        return this.field1206;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)Z")
    public final boolean method516(int arg0) {
        ++field1200;
        if (this.field1210 != null) {
            return true;
        } else {
            int var2 = -112 % ((arg0 - 90) / 32);
            if (~this.field1206 <= -1) {
                class233 var3 = class161.method1011(64, class18.field215, this.field1206);
                var3.method1562();
                this.field1208 = var3.field488;
                this.field1210 = var3.field4151;
                this.field1207 = var3.field491;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
    public final void method517(boolean arg0) {
        ++field1201;
        super.method517(arg0);
        this.field1210 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)[[I")
    public int[][] method164(int arg0, int arg1) {
        ++field1202;
        int[][] var3 = super.field1947.method511(arg1, -1);
        if (super.field1947.field1180 && this.method516(-14)) {
            int[] var4 = var3[0];
            int var5 = (class150.field2400 != this.field1208 ? this.field1208 * arg1 / class150.field2400 : arg1) * this.field1207;
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            if (class131.field1862 != this.field1207) {
                for (int var8 = 0; var8 < class131.field1862; ++var8) {
                    int var9 = this.field1207 * var8 / class131.field1862;
                    int var10 = this.field1210[var5 + var9];
                    var6[var8] = class65.method409(4080, var10 << 4);
                    var7[var8] = class65.method409(var10 >> 4, 4080);
                    var4[var8] = class65.method409(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class131.field1862 < ~var11; ++var11) {
                    int var12 = this.field1210[var5++];
                    var6[var11] = class65.method409(var12, 255) << 4;
                    var7[var11] = class65.method409(4080, var12 >> 4);
                    var4[var11] = class65.method409(16711680, var12) >> 12;
                }
            }
        }
        if (arg0 != 260028743) {
            field1203 = -60;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method518(int arg0, int arg1, int arg2, int arg3) {
        if (!class246.method1678(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class25.method144(var4 + 1, class42.field480[arg0][arg1][arg2] + arg3, var5 + 1) && class25.method144(var4 + 128 - 1, class42.field480[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class25.method144(var4 + 128 - 1, class42.field480[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class25.method144(var4 + 1, class42.field480[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class83() {
        super(0, false);
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public static void method519(int arg0) {
        field1205 = null;
        field1209 = null;
        field1199 = null;
        if (arg0 != 15515) {
            method518(-33, -119, 1, -61);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)Ljf;")
    public static final class172 method520(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field1204;
            class172 var1 = (class172) class87.field1283.method40(104);
            if (var1 != null) {
                var1.method797((byte) 122);
                var1.method920(-2);
                return var1;
            } else {
                class172 var2;
                do {
                    var2 = (class172) class116.field1675.method40(99);
                    if (var2 == null) {
                        return null;
                    }
                    if (~var2.method1123(0) < ~class183.method1195((byte) 117)) {
                        return null;
                    }
                    var2.method797((byte) 105);
                    var2.method920(-2);
                } while ((var2.field2327 & Long.MIN_VALUE) == 0L);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ldc;")
    public static final class145 method521(int arg0, byte arg1) {
        ++field1211;
        class145 var2 = (class145) class70.field980.method1537((long) arg0, false);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class198.field3521.method842(class181.method1188(arg0, (byte) -118), (byte) -100, class95.method598(arg0, -23628));
            class145 var4 = new class145();
            if (arg1 < 11) {
                field1213 = -111;
            }
            var4.field2244 = arg0;
            if (var3 != null) {
                var4.method900(new class56(var3), -96);
            }
            var4.method910(2);
            if (!class116.field1683 && var4.field2276) {
                var4.field2277 = null;
            }
            if (var4.field2257) {
                var4.field2270 = false;
                var4.field2253 = 0;
            }
            class70.field980.method1532(true, (long) arg0, var4);
            return var4;
        }
    }
}
