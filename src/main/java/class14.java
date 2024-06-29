import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class14 extends class25 {

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "Lcd;")
    public static class64 field314 = class44.method335((byte) 71, ")2");

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Lqm;")
    public static class222 field317;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "[Lnm;")
    public static class176[] field315;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIII)I", line = 10)
    public static final int method164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class6.field117) {
            arg2 = 1000000;
            class6.field117 = false;
        }
        field319++;
        class313 var5 = class157.field2770[arg0][arg1];
        float var6 = var5.field5309;
        float var7 = var5.field5305;
        int var8 = var5.field5303;
        if (arg4 != 65536) {
            field317 = (class222) null;
        }
        float var9 = ((float) arg3 * 0.1F + 0.7F) * var5.field5304;
        int var10 = var5.field5310;
        int var11 = var5.field5306;
        if (!class175.field3000) {
            var11 = 0;
        }
        if (class250.field4336 != var8 || class224.field3815 != var9 || class66.field1311 != var6 || class26.field424 != var7 || class183.field3139 != var10 || class111.field2059 != var11) {
            class112.field2077 = class7.field170;
            class66.field1311 = var6;
            class26.field424 = var7;
            class153.field2706 = class264.field4521;
            class224.field3815 = var9;
            class183.field3139 = var10;
            class158.field2787 = class153.field2712;
            class40.field620 = class290.field4997;
            class250.field4336 = var8;
            class71.field1374 = class75.field1414;
            class78.field1470 = 0;
            class111.field2059 = var11;
            class241.field4163 = class155.field2738;
        }
        if (class78.field1470 < 65536) {
            class78.field1470 += arg2 * 250;
            if (class78.field1470 >= 65536) {
                class78.field1470 = 65536;
            }
            int var12 = class78.field1470 >> 8;
            int var13 = 65536 - class78.field1470 >> 8;
            class7.field170 = ((class183.field3139 & 0xFF00FF) * var12 + (class112.field2077 & 0xFF00FF) * var13 & 0xFF00FF00) + ((class183.field3139 & 0xFF00) * var12 + (class112.field2077 & 0xFF00) * var13 & 0xFF0000) >> 8;
            class153.field2712 = class158.field2787 * var13 + class111.field2059 * var12 >> 8;
            class290.field4997 = ((class40.field620 & 0xFF00) * var13 + ((class250.field4336 & 0xFF00) * var12) & 0xFF0000) + ((class40.field620 & 0xFF00FF) * var13 + (class250.field4336 & 0xFF00FF) * var12 & 0xFF00FF00) >> 8;
            float var14 = (float) (65536 - class78.field1470) / 65536.0F;
            float var15 = (float) class78.field1470 / 65536.0F;
            class155.field2738 = class26.field424 * var15 + class241.field4163 * var14;
            class75.field1414 = class71.field1374 * var14 + class224.field3815 * var15;
            class264.field4521 = class66.field1311 * var15 + class153.field2706 * var14;
        }
        class52.method393(class290.field4997, class75.field1414, class264.field4521, class155.field2738);
        class52.method388(class7.field170, class153.field2712);
        class52.method392((float) class76.field1440, (float) class247.field4298, (float) class273.field4687);
        class52.method386();
        return class7.field170;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZI)Z", line = 90)
    public static final boolean method165(int arg0, boolean arg1, int arg2) {
        class290 var3 = class172.method1207(arg0, -112);
        field318++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return arg1 ? false : var3.method2008((byte) 94, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V", line = 118)
    public static void method166(int arg0) {
        if (arg0 > -78) {
            method166(-58);
        }
        field315 = null;
        field314 = null;
        field317 = null;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(II)V", line = 139)
    public class14(int arg0, int arg1) {
        this.field316 = arg0;
        this.field313 = arg1;
    }
}
