import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class43 extends class89 {

    @OriginalMember(owner = "client!dj", name = "x", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Lqe;")
    private static class179 field922 = class206.method1380("Jan", (byte) -127);

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "Lqe;")
    public static class179 field920 = class206.method1380("scrollen:", (byte) -127);

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lqe;")
    public static class179 field923 = class206.method1380("AUS", (byte) 30);

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "Lqe;")
    private static class179 field921 = class206.method1380("Feb", (byte) -127);

    @OriginalMember(owner = "client!dj", name = "v", descriptor = "Lqe;")
    private static class179 field929 = class206.method1380("Mar", (byte) 3);

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "Lqe;")
    private static class179 field926 = class206.method1380("Dec", (byte) -128);

    @OriginalMember(owner = "client!dj", name = "w", descriptor = "Lqe;")
    private static class179 field930 = class206.method1380("Jun", (byte) -126);

    @OriginalMember(owner = "client!dj", name = "t", descriptor = "Z")
    public static boolean field927 = true;

    @OriginalMember(owner = "client!dj", name = "y", descriptor = "Lqe;")
    private static class179 field932 = class206.method1380("May", (byte) -128);

    @OriginalMember(owner = "client!dj", name = "A", descriptor = "Lqe;")
    private static class179 field934 = class206.method1380("Aug", (byte) -126);

    @OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
    public static int field936 = 0;

    @OriginalMember(owner = "client!dj", name = "E", descriptor = "Lqe;")
    public static class179 field937 = class206.method1380("null", (byte) -7);

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lqe;")
    private static class179 field924 = class206.method1380("Nov", (byte) 9);

    @OriginalMember(owner = "client!dj", name = "H", descriptor = "Lqe;")
    private static class179 field940 = class206.method1380("Oct", (byte) -128);

    @OriginalMember(owner = "client!dj", name = "B", descriptor = "Lqe;")
    private static class179 field935 = class206.method1380("Apr", (byte) -127);

    @OriginalMember(owner = "client!dj", name = "I", descriptor = "Lqe;")
    private static class179 field941 = class206.method1380("Jul", (byte) -126);

    @OriginalMember(owner = "client!dj", name = "J", descriptor = "Lqe;")
    private static class179 field942 = class206.method1380("Sep", (byte) 109);

    @OriginalMember(owner = "client!dj", name = "G", descriptor = "[Lqe;")
    public static class179[] field939 = new class179[] { field922, field921, field929, field935, field932, field930, field941, field934, field942, field940, field924, field926 };

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!dj", name = "z", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!dj", name = "u", descriptor = "[Lnb;")
    public static class143[] field928;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IILae;I)V")
    public static final void method282(int arg0, int arg1, class6 arg2, int arg3) {
        field938++;
        if (class194.field3618 != 0 && class194.field3618 != 3) {
            return;
        }
        int var4 = arg0 - arg2.field169 / 2;
        int var5 = class236.field4342 + class143.field2608 & 0x7FF;
        int var6 = arg1 - arg2.field73 / 2;
        int var7 = class27.field600[var5];
        int var8 = class27.field612[var5];
        int var9 = (class68.field1364 + 256) * var8 >> 8;
        int var10 = (class68.field1364 + 256) * var7 >> 8;
        int var11 = var4 * var10 + var6 * var9 >> 11;
        int var12 = var6 * var10 - var4 * var9 >> 11;
        int var13 = class61.field1298.field3159 + var11 >> 7;
        int var14 = class61.field1298.field3198 - var12 >> 7;
        boolean var15 = class190.method1278(1, var13, 0, var14, 56, true, 0, class61.field1298.field3160[0], 0, 0, class61.field1298.field3200[0], 0);
        if (arg3 != -274283001) {
            method282(-93, 15, null, 31);
        }
        if (!var15) {
            return;
        }
        class81.field1564.method1230((byte) -97, var4);
        class81.field1564.method1230((byte) -117, var6);
        class81.field1564.method1222((byte) -123, class236.field4342);
        class81.field1564.method1230((byte) -53, 57);
        class81.field1564.method1230((byte) -75, class143.field2608);
        class81.field1564.method1230((byte) -74, class68.field1364);
        class81.field1564.method1230((byte) -115, 89);
        class81.field1564.method1222((byte) -117, class61.field1298.field3159);
        class81.field1564.method1222((byte) -102, class61.field1298.field3198);
        class81.field1564.method1230((byte) -112, class120.field2253);
        class81.field1564.method1230((byte) -65, 63);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(B)V")
    public static void method283(byte arg0) {
        field924 = null;
        field921 = null;
        field920 = null;
        int var1 = -124 / ((1 - arg0) / 42);
        field930 = null;
        field941 = null;
        field940 = null;
        field929 = null;
        field942 = null;
        field926 = null;
        field935 = null;
        field934 = null;
        field939 = null;
        field932 = null;
        field928 = null;
        field923 = null;
        field937 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class43() {
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V")
    public class43(int arg0) {
        this.field931 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Leh;I)V")
    public static final void method284(class52 arg0, int arg1) {
        int var2 = 89 % ((arg1 + 58) / 55);
        class59.field1271 = arg0;
        field933++;
        class17.field447 = class59.field1271.method336((byte) -121, 4);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILdh;)V")
    public static final void method285(int arg0, class41 arg1) {
        arg1.field873 = false;
        field925++;
        if (arg1.field872 != null) {
            arg1.field872.field1318 = 0;
        }
        if (arg0 != -10000) {
            field930 = null;
        }
        for (class41 var2 = arg1.method272(); var2 != null; var2 = arg1.method274()) {
            method285(-10000, var2);
        }
    }
}
