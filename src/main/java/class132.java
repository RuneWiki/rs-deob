import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class132 extends class53 {

    @OriginalMember(owner = "client!jd", name = "M", descriptor = "I")
    private int field2264 = 0;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    private int field2273 = 12288;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    private int field2274 = 8192;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    private int field2268 = 4096;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    private int field2272 = 2048;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    private int field2267 = 2048;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    private int field2276 = 0;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2278 = new CRC32();

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "Lwa;")
    public static class75 field2284 = class66.method560("Sprites geladen)3", false);

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "[I")
    public static int[] field2281 = new int[32768];

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "Lwa;")
    public static class75 field2279 = class66.method560("mapfunction", false);

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "Lwa;")
    public static class75 field2285 = class66.method560("::gc", false);

    @OriginalMember(owner = "client!jd", name = "N", descriptor = "I")
    public static int field2265;

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field2269;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Ldc;")
    public static class101 field2280;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "Lcb;")
    public static class267 field2282;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)I", line = 5)
    public static final int method1026(int arg0) {
        field2271++;
        return arg0 == -8457 ? 2 : -39;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILja;Z)V", line = 16)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        field2266++;
        if (!arg2) {
            method1029((byte) -69);
        }
        if (arg0 == 0) {
            this.field2272 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field2264 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field2276 = arg1.method485((byte) -2);
        } else if (arg0 == 3) {
            this.field2267 = arg1.method485((byte) -2);
        } else if (arg0 == 4) {
            this.field2273 = arg1.method485((byte) -2);
        } else if (arg0 == 5) {
            this.field2268 = arg1.method485((byte) -2);
        } else if (arg0 == 6) {
            this.field2274 = arg1.method485((byte) -2);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BII)Z", line = 94)
    private final boolean method1027(byte arg0, int arg1, int arg2) {
        field2275++;
        if (arg0 <= 104) {
            this.field2264 = -47;
        }
        int var4 = (arg2 - arg1) * this.field2273 >> 12;
        int var5 = class232.field3916[(var4 * 255 & 0xFF23E) >> 12];
        int var6 = (var5 << 12) / this.field2273;
        int var7 = (var6 << 12) / this.field2274;
        int var8 = this.field2268 * var7 >> 12;
        return (arg1 + arg2) < var8 && (arg1 + arg2) > (-var8);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V", line = 237)
    public class132() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V", line = 113)
    public static final void method1028(int arg0, byte arg1) {
        field2270++;
        class213.field3618.method1199(arg0, 122);
        if (arg1 != 6) {
            field2279 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)V", line = 132)
    public static void method1029(byte arg0) {
        field2280 = null;
        field2284 = null;
        if (arg0 != -116) {
            return;
        }
        field2278 = null;
        field2279 = null;
        field2285 = null;
        field2282 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(III)Z", line = 157)
    private final boolean method1030(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            return true;
        }
        field2283++;
        int var4 = (arg0 + arg1) * this.field2273 >> 12;
        int var5 = class232.field3916[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2273;
        int var7 = (var6 << 12) / this.field2274;
        int var8 = this.field2268 * var7 >> 12;
        return var8 > (arg0 - arg1) && (-var8) < (arg0 - arg1);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I", line = 184)
    public final int[] method59(int arg0, int arg1) {
        if (arg0 != -15196) {
            field2285 = (class75) null;
        }
        field2265++;
        int[] var3 = this.field878.method1603(arg1, (byte) 107);
        if (this.field878.field3749) {
            int var4 = class50.field814[arg1] - 2048;
            for (int var5 = 0; var5 < class269.field4644; var5++) {
                int var6 = class67.field1178[var5] - 2048;
                int var7 = var6 + this.field2272;
                int var8 = this.field2264 + var4;
                int var9 = var8 < -2048 ? var8 + 4096 : var8;
                int var10 = var9 > 2048 ? var9 - 4096 : var9;
                int var11 = var7 >= -2048 ? var7 : var7 + 4096;
                int var12 = this.field2276 + var6;
                int var13 = var11 > 2048 ? var11 - 4096 : var11;
                int var14 = this.field2267 + var4;
                int var15 = var12 >= -2048 ? var12 : var12 + 4096;
                int var16 = var14 < -2048 ? var14 + 4096 : var14;
                int var17 = var15 > 2048 ? var15 - 4096 : var15;
                int var18 = var16 <= 2048 ? var16 : var16 - 4096;
                var3[var5] = this.method1027((byte) 119, var13, var10) || this.method1030(var18, var17, 0) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V", line = 257)
    public final void method56(byte arg0) {
        field2269++;
        class203.method1511(arg0 + 335);
        if (arg0 != -79) {
            field2278 = (CRC32) null;
        }
    }
}
