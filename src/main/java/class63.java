import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class63 extends class33 {

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    private int field1235 = 4096;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    private int field1234 = 2048;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "I")
    private int field1240 = 2048;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "I")
    private int field1244 = 0;

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "I")
    private int field1241 = 8192;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    private int field1248 = 12288;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "I")
    private int field1239 = 0;

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "I")
    public static int field1237 = -1;

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lrd;")
    public static class173 field1238 = class133.method843("hitmarks", 42);

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lrd;")
    private static class173 field1233 = class133.method843("Loading interfaces )2 ", 44);

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "I")
    public static int field1243 = 0;

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "Lrd;")
    public static class173 field1236 = field1233;

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "Lrd;")
    public static class173 field1246 = class133.method843("T", -82);

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "Lrd;")
    private static class173 field1245 = class133.method843("Enter your username (V password)3", 83);

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "Lrd;")
    public static class173 field1230 = field1245;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[[Lqf;")
    public static class165[][] field1232;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(IIB)Z")
    private final boolean method400(int arg0, int arg1, byte arg2) {
        ++field1242;
        int var4 = (arg0 - -arg1) * this.field1248 >> 12;
        int var5 = class54.field1079[(1047532 & var4 * 255) >> 12];
        int var6 = -44 % ((arg2 - 49) / 45);
        int var7 = (var5 << 12) / this.field1248;
        int var8 = (var7 << 12) / this.field1241;
        int var9 = this.field1235 * var8 >> 12;
        return -arg1 + arg0 < var9 && ~(-var9) > ~(-arg1 + arg0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        int[] var3 = super.field718.method514(arg0, -64);
        ++field1231;
        if (super.field718.field1615) {
            int var4 = class105.field1937[arg0] + -2048;
            for (int var5 = 0; var5 < class117.field2173; ++var5) {
                int var6 = this.field1244 + var4;
                int var7 = class138.field2585[var5] + -2048;
                int var8 = var6 >= -2048 ? var6 : var6 + 4096;
                int var9 = var7 - -this.field1240;
                int var10 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var11 = this.field1234 + var4;
                int var12 = this.field1239 + var7;
                int var13 = ~var12 > 2047 ? var12 + 4096 : var12;
                int var14 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var15 = var13 <= 2048 ? var13 : var13 + -4096;
                int var16 = var14 <= 2048 ? var14 : var14 + -4096;
                int var17 = ~var9 <= 2047 ? var9 : var9 + 4096;
                int var18 = var17 > 2048 ? var17 - 4096 : var17;
                var3[var5] = !this.method401(2036073612, var18, var10) && !this.method400(var16, var15, (byte) 101) ? 0 : 4096;
            }
        }
        int var19 = 42 % ((-65 - arg1) / 60);
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(III)Z")
    private final boolean method401(int arg0, int arg1, int arg2) {
        if (arg0 != 2036073612) {
            this.method177(-80, 104, (class121) null);
        }
        int var4 = (-arg1 + arg2) * this.field1248 >> 12;
        ++field1247;
        int var5 = class54.field1079[255 & var4 * 255 >> 12];
        int var6 = (var5 << 12) / this.field1248;
        int var7 = (var6 << 12) / this.field1241;
        int var8 = this.field1235 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field1249;
        if (arg0 == -1) {
            class172.method1105(arg0 ^ -5001);
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public static void method402(int arg0) {
        field1233 = null;
        field1246 = null;
        field1232 = null;
        field1230 = null;
        if (arg0 != 1560916428) {
            field1245 = null;
        }
        field1245 = null;
        field1238 = null;
        field1236 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        ++field1229;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 == 6) {
                                    this.field1241 = arg2.method755((byte) -84);
                                }
                            } else {
                                this.field1235 = arg2.method755((byte) -51);
                            }
                        } else {
                            this.field1248 = arg2.method755((byte) -56);
                        }
                    } else {
                        this.field1234 = arg2.method755((byte) -32);
                    }
                } else {
                    this.field1239 = arg2.method755((byte) -112);
                }
            } else {
                this.field1244 = arg2.method755((byte) -102);
            }
        } else {
            this.field1240 = arg2.method755((byte) -56);
        }
        if (arg1 > -99) {
            field1232 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class63() {
        super(0, true);
    }
}
