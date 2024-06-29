import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class129 extends class196 {

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    private int field2154 = 4096;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    private int field2160 = 2048;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    private int field2163 = 0;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    private int field2164 = 8192;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "I")
    private int field2157 = 0;

    @OriginalMember(owner = "client!ak", name = "lb", descriptor = "I")
    private int field2173 = 12288;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    private int field2158 = 2048;

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "Ldf;")
    public static class51 field2167 = class46.method233("lila:", 100);

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "Ldf;")
    public static class51 field2169 = class46.method233("null", 100);

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "[Ldf;")
    public static class51[] field2166 = new class51[500];

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "Ldf;")
    public static class51 field2171 = class46.method233("null", 100);

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!ak", name = "kb", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Lpj;")
    public static class228 field2156;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "Lja;")
    public static class55 field2162;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)Z")
    private final boolean method950(int arg0, byte arg1, int arg2) {
        ++field2161;
        int var4 = (-arg2 + arg0) * this.field2173 >> 12;
        int var5 = class118.field1975[(var4 * 255 & 1045789) >> 12];
        if (arg1 >= 0) {
            return true;
        } else {
            int var6 = (var5 << 12) / this.field2173;
            int var7 = (var6 << 12) / this.field2164;
            int var8 = this.field2154 * var7 >> 12;
            return ~(arg0 + arg2) > ~var8 && -var8 < arg2 - -arg0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            this.method45(-21, -28);
        }
        int[] var3 = super.field3274.method1476(true, arg0);
        ++field2165;
        if (super.field3274.field3741) {
            int var4 = class161.field2639[arg0] + -2048;
            for (int var5 = 0; class49.field767 > var5; ++var5) {
                int var6 = class211.field3510[var5] + -2048;
                int var7 = this.field2158 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = this.field2157 + var4;
                int var10 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var11 <= 2048 ? var11 : var11 + -4096;
                int var13 = this.field2163 + var6;
                int var14 = var13 < -2048 ? var13 + 4096 : var13;
                int var15 = this.field2160 + var4;
                int var16 = var14 <= 2048 ? var14 : var14 - 4096;
                int var17 = ~var15 <= 2047 ? var15 : var15 + 4096;
                int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                var3[var5] = !this.method950(var12, (byte) -87, var10) && !this.method953(var18, var16, (byte) -104) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            this.field2158 = -108;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field2164 = arg1.method876(false);
                                }
                            } else {
                                this.field2154 = arg1.method876(false);
                            }
                        } else {
                            this.field2173 = arg1.method876(false);
                        }
                    } else {
                        this.field2160 = arg1.method876(false);
                    }
                } else {
                    this.field2163 = arg1.method876(false);
                }
            } else {
                this.field2157 = arg1.method876(false);
            }
        } else {
            this.field2158 = arg1.method876(false);
        }
        ++field2155;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Llb;I)Laa;")
    public static final class159 method951(class121 arg0, int arg1) {
        class159 var2 = new class159();
        ++field2170;
        if (arg1 != -2048) {
            field2156 = null;
        }
        var2.field2610 = arg0.method876(false);
        var2.field2604 = class225.method1551((byte) -97, var2.field2610);
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V")
    public static void method952(byte arg0) {
        field2169 = null;
        if (arg0 != 119) {
            field2162 = null;
        }
        field2171 = null;
        field2166 = null;
        field2167 = null;
        field2162 = null;
        field2156 = null;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field2159;
        int var2 = 57 / ((arg0 - 43) / 41);
        class124.method930((byte) -109);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)Z")
    private final boolean method953(int arg0, int arg1, byte arg2) {
        int var4 = (arg0 + arg1) * this.field2173 >> 12;
        int var5 = class118.field1975[(1048063 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field2173;
        if (arg2 >= -87) {
            return true;
        } else {
            int var7 = (var6 << 12) / this.field2164;
            ++field2172;
            int var8 = this.field2154 * var7 >> 12;
            return var8 > arg0 - arg1 && ~(-var8) > ~(-arg1 + arg0);
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z")
    public static final boolean method954(int arg0) {
        ++field2168;
        if (arg0 != 26546) {
            method954(11);
        }
        if (~class234.field4088 != -1) {
            try {
                if ((Boolean) class121.field2041.method295(-12249, class25.field376.field3999)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
