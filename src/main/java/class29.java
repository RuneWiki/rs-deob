import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class29 {

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "I")
    public static int field458 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Llc;")
    private static class143 field461 = class66.method374("Loaded fonts", -1);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Llc;")
    public static class143 field459 = class66.method374("Chargement de RuneScape en cours )2 veuillez patienter)3)3)3", -1);

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Llc;")
    public static class143 field464 = field461;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "Ldj;")
    public static class289 field460;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([BI)Lrb;")
    public static final class193 method194(byte[] arg0, int arg1) {
        field457++;
        if (arg0 == null) {
            return null;
        } else {
            class213 var2 = new class213(arg0, class126.field2226, class32.field536, class41.field697, class153.field2766, class282.field4961);
            class258.method1708(arg1 ^ arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
    public static void method195(int arg0) {
        field460 = null;
        field459 = null;
        if (arg0 != 15) {
            method195(71);
        }
        field461 = null;
        field464 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)V")
    public static final void method196(boolean arg0, int arg1) {
        int var2 = 101 / ((35 - arg1) / 50);
        field462++;
        if (arg0) {
            if (class7.field138 != -1) {
                class170.method1117(class7.field138, (byte) 118);
            }
            for (class163 var3 = (class163) class212.field3942.method1818(false); var3 != null; var3 = (class163) class212.field3942.method1834((byte) 114)) {
                class17.method128(0, true, var3);
            }
            class7.field138 = -1;
            class212.field3942 = new class277(8);
            class155.method1022(789221);
            class7.field138 = class37.field635;
            class136.method816(true, false);
            class159.method1041(110);
            class195.method1343(class7.field138, (byte) 13);
        }
        class229.field4195 = new class32();
        class229.field4195.field4108 = 3000;
        class229.field4195.field4178 = 3000;
        class144.method917(-1562678904, class140.field2439);
        class43.method271(10, -97);
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBIII)V")
    public static final void method197(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class154.field2779 < 100) {
            class141.method847(26156);
        }
        field463++;
        class260.method1738(arg3, arg2, arg0 + arg3, arg2 + arg4);
        if (class154.field2779 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg2 - var5 - 18;
            int var7 = arg0 / 2 + arg3;
            class260.method1726(arg3, arg2, arg0, arg4, 0);
            class260.method1729(var7 - 152, var6, 304, 34, 9179409);
            class260.method1729(var7 - 151, var6 + 1, 302, 32, 0);
            class260.method1726(var7 - 150, var6 - -2, class154.field2779 * 3, 30, 9179409);
            class260.method1726(class154.field2779 * 3 + var7 - 150, var6 + 2, 300 - (class154.field2779 * 3), 30, 0);
            class239.field4326.method1325(class88.field1600, var7, var5 + var6, 16777215, -1);
            return;
        }
        class115.field2023 = class203.field3691 - ((int) ((float) arg4 / class5.field80));
        int var8 = class41.field691 - ((int) ((float) arg0 / class5.field80));
        class52.field1020 = (int) ((float) (arg0 * 2) / class5.field80);
        int var9 = (int) ((float) arg0 / class5.field80) + class41.field691;
        int var10 = (int) ((float) arg4 / class5.field80) + class203.field3691;
        class189.field3424 = class41.field691 - ((int) ((float) arg0 / class5.field80));
        class227.field4100 = (int) ((float) (arg4 * 2) / class5.field80);
        int var11 = class203.field3691 - ((int) ((float) arg4 / class5.field80));
        class247.method1636(var9, var10, var8, arg2 + arg4, arg3, arg2, (byte) -115, var11, arg0 + arg3);
        class11.method91(arg3, var11, arg1 - 242, arg2, var8, arg2 + arg4, var10, arg0 + arg3, var9);
        class22.method152((byte) 19, var8, arg3, arg2 + arg4, arg0 + arg3, arg2, var9, var11, var10);
        if (class173.field3112 > 0) {
            class173.field3112--;
        }
        if (arg1 != 118) {
            method197(-70, (byte) 121, 122, 99, 126);
        }
        if (!class194.field3593) {
            return;
        }
        int var12 = arg3 + arg0 - 5;
        int var13 = 16776960;
        int var14 = arg2 + arg4 - 8;
        class134.field2341.method1320(class25.method179(0, new class143[] { class63.field1189, class274.method1806(class250.field4507, true) }), var12, var14, 16776960, -1);
        int var17 = var14 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var13 = 16711680;
        }
        class134.field2341.method1320(class25.method179(0, new class143[] { class234.field4261, class274.method1806(var16, true), class101.field1807 }), var12, var17, var13, -1);
        var14 = var17 - 15;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZ)I")
    public static final int method198(int arg0, boolean arg1) {
        field455++;
        if (arg1) {
            field456 = -68;
        }
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
