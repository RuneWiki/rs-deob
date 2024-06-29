import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class129 extends class124 {

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    private int field2141 = 2048;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    private int field2148 = 0;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    private int field2142 = 12288;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
    private int field2153 = 0;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    private int field2146 = 8192;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    private int field2156 = 2048;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    private int field2155 = 4096;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "[Ljd;")
    public static class77[] field2149 = new class77[50];

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "Le;")
    public static class191 field2151 = class54.method368("gelb:", 2047);

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "Lef;")
    public static class175 field2154 = new class175();

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "[[I")
    public static int[][] field2157 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "[[I")
    public static int[][] field2147;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[[[I")
    public static int[][][] field2140;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public final void method451(int arg0) {
        ++field2137;
        if (arg0 != -1) {
            this.method131((byte) -92, 94);
        }
        class127.method862(7332);
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)I")
    public static final int method875(byte arg0) {
        if (arg0 != 62) {
            return -92;
        } else {
            ++field2139;
            if (class99.field1581) {
                return 0;
            } else if (!class188.method1298(10)) {
                return 1;
            } else {
                return !class183.field3154 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Z")
    private final boolean method876(int arg0, int arg1, int arg2) {
        ++field2152;
        int var4 = (arg0 + arg2) * this.field2142 >> 12;
        int var5 = class150.field2582[(1046032 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2142;
        if (arg1 != 29866) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field2146;
            int var8 = this.field2155 * var7 >> 12;
            return var8 > arg2 - arg0 && -var8 < -arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2138;
        if (!arg2) {
            field2151 = null;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field2146 = arg1.method1593(arg2);
                                }
                            } else {
                                this.field2155 = arg1.method1593(arg2);
                            }
                        } else {
                            this.field2142 = arg1.method1593(true);
                        }
                    } else {
                        this.field2141 = arg1.method1593(true);
                    }
                } else {
                    this.field2153 = arg1.method1593(arg2);
                }
            } else {
                this.field2148 = arg1.method1593(arg2);
            }
        } else {
            this.field2156 = arg1.method1593(true);
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(III)Z")
    private final boolean method877(int arg0, int arg1, int arg2) {
        ++field2145;
        int var4 = (-arg1 + arg2) * this.field2142 >> 12;
        int var5 = class150.field2582[255 & arg0 * var4 >> 12];
        int var6 = (var5 << 12) / this.field2142;
        int var7 = (var6 << 12) / this.field2146;
        int var8 = this.field2155 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg2) && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field2144;
        if (arg0 < 68) {
            this.field2141 = 116;
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1] + -2048;
            for (int var5 = 0; class64.field1132 > var5; ++var5) {
                int var6 = class257.field4559[var5] + -2048;
                int var7 = this.field2153 + var6;
                int var8 = this.field2148 + var4;
                int var9 = var8 >= -2048 ? var8 : var8 + 4096;
                int var10 = var7 >= -2048 ? var7 : var7 + 4096;
                int var11 = var10 <= 2048 ? var10 : var10 + -4096;
                int var12 = var4 - -this.field2141;
                int var13 = var9 > 2048 ? var9 + -4096 : var9;
                int var14 = ~var12 <= 2047 ? var12 : var12 + 4096;
                int var15 = this.field2156 + var6;
                int var16 = var14 <= 2048 ? var14 : var14 + -4096;
                int var17 = var15 < -2048 ? var15 + 4096 : var15;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method877(255, var18, var13) && !this.method876(var11, 29866, var16) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)V")
    public static void method878(int arg0) {
        field2147 = null;
        if (arg0 != 12219) {
            method878(30);
        }
        field2149 = null;
        field2157 = null;
        field2140 = null;
        field2154 = null;
        field2151 = null;
    }
}
