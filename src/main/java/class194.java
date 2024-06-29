import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class194 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3352 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3357 = 0;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[I")
    public static int[] field3356 = new int[50];

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lr;")
    public static class66 field3355 = class93.method641(43, "::noclip");

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "[Ld;")
    public static class76[] field3354 = new class76[4];

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "Lr;")
    private static class66 field3360 = class93.method641(43, "Cancel");

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lr;")
    public static class66 field3358 = field3360;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[Lpc;")
    public static class29[] field3353;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method1264(int arg0) {
        class14 var1 = (class14) class180.field3146.method873((byte) 76);
        field3361++;
        while (var1 != null) {
            if (var1.field179 == -1) {
                var1.field178 = 0;
                class31.method176(var1, true);
            } else {
                var1.method560(-17554);
            }
            var1 = (class14) class180.field3146.method870((byte) 79);
        }
        if (arg0 != -28968) {
            method1264(42);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)I")
    public static final int method1265(byte arg0) {
        int var1 = 122 / ((51 - arg0) / 57);
        field3359++;
        return ((class61.field1030 == 0 ? 0 : 1) << 20) + ((class250.field4401 ? 1 : 0) << 19) + (class44.field782 & 0x3 << 17) + ((class155.field2764 ? 1 : 0) << 16) + ((class33.field492 ? 1 : 0) << 15) + ((class43.field760 ? 1 : 0) << 13) + ((class212.field3647 ? 1 : 0) << 10) + ((class15.field200 ? 1 : 0) << 9) + ((class66.field1277 ? 1 : 0) << 7) + ((class7.field61 ? 1 : 0) << 6) + ((class64.field1265 ? 1 : 0) << 5) + ((class198.field3421 ? 1 : 0) << 4) + (class63.field1242 & 0x7) + ((class76.field1514 ? 1 : 0) << 3) + ((class54.field944 == 0 ? 0 : 1) << 22) - (-((class205.field3512 ? 1 : 0) << 8) + -(class124.field2334 & 0x3 << 11) - ((class164.field2936 == 0 ? 0 : 1) << 21));
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBI[II)V")
    public static final void method1266(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 != -17) {
            method1267(false);
        }
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        field3351++;
        arg0--;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg3[var6] = arg2;
            int var7 = var6 + 1;
            arg3[var7] = arg2;
            int var8 = var7 + 1;
            arg3[var8] = arg2;
            int var9 = var8 + 1;
            arg3[var9] = arg2;
            int var10 = var9 + 1;
            arg3[var10] = arg2;
            int var11 = var10 + 1;
            arg3[var11] = arg2;
            int var12 = var11 + 1;
            arg3[var12] = arg2;
            arg0 = var12 + 1;
            arg3[arg0] = arg2;
        }
        while (arg0 < var13) {
            arg0++;
            arg3[arg0] = arg2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method1267(boolean arg0) {
        field3360 = null;
        field3354 = null;
        field3353 = null;
        field3355 = null;
        if (arg0) {
            field3356 = null;
            field3358 = null;
        }
    }
}
