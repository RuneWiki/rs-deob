import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class299 {

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "[I")
    public static int[] field4260 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "Lsa;")
    public class113 field4261;

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Ljq;")
    public class299 field4263;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "[I")
    public static int[] field4267;

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "[[[B")
    public static byte[][][] field4266;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
    public static final void method1887(byte arg0) {
        class93.field1031.method2052(0);
        if (arg0 < 98) {
            field4266 = null;
        }
        field4264++;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V")
    public final void method1888(byte arg0) {
        field4262++;
        if (class92.field1017 >= 500) {
            return;
        }
        this.field4259 = 0;
        this.field4261 = null;
        if (arg0 != 82) {
            field4266 = null;
        }
        this.field4263 = class418.field6006;
        class418.field6006 = this;
        class92.field1017++;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lfg;)V")
    public static final void method1889(class66 arg0) {
        if (class242.field3280 >= 255) {
            return;
        }
        class256.field3438[class242.field3280] = arg0;
        class278.field3925[class242.field3280] = false;
        class242.field3280++;
        int var1 = arg0.field750;
        if (arg0.field755) {
            var1 = 0;
        }
        int var2 = arg0.field750;
        if (arg0.field744) {
            var2 = class52.field594 - 1;
        }
        for (int var3 = var1; var3 <= var2; var3++) {
            int var4 = 0;
            int var5 = arg0.field311 + 64 - arg0.field307 >> 7;
            if (var5 < 0) {
                var4 -= var5;
                var5 = 0;
            }
            int var6 = arg0.field311 + arg0.field307 - 64 >> 7;
            if (var6 >= class52.field598) {
                var6 = class52.field598 - 1;
            }
            for (int var7 = var5; var7 <= var6; var7++) {
                short var8 = arg0.field751[var4++];
                int var9 = (var8 >>> 8) + (arg0.field309 + 64 - arg0.field307 >> 7);
                int var10 = (var8 & 0xFF) + var9 - 1;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var10 >= class158.field2245) {
                    var10 = class158.field2245 - 1;
                }
                for (int var11 = var9; var11 <= var10; var11++) {
                    int var12 = class124.field1648[var3][var11][var7];
                    if ((var12 & 0xFF) == 0) {
                        class124.field1648[var3][var11][var7] = var12 | class242.field3280;
                    } else if ((var12 & 0xFF00) == 0) {
                        class124.field1648[var3][var11][var7] = var12 | class242.field3280 << 8;
                    } else if ((var12 & 0xFF0000) == 0) {
                        class124.field1648[var3][var11][var7] = var12 | class242.field3280 << 16;
                    } else if ((var12 & 0xFF000000) == 0) {
                        class124.field1648[var3][var11][var7] = var12 | class242.field3280 << 24;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V")
    public static void method1890(int arg0) {
        if (arg0 == -22560) {
            field4266 = null;
            field4267 = null;
            field4260 = null;
        }
    }
}
