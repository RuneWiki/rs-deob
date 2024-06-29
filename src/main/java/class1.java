import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 extends class182 {

    @OriginalMember(owner = "client!a", name = "L", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "client!a", name = "J", descriptor = "Lkh;")
    private static class117 field2 = class224.method1450((byte) 120, "Error connecting to server)3");

    @OriginalMember(owner = "client!a", name = "K", descriptor = "Lkh;")
    public static class117 field3 = class224.method1450((byte) 125, "event_opbase");

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "Lkh;")
    private static class117 field9 = class224.method1450((byte) 110, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Lkh;")
    public static class117 field15 = field2;

    @OriginalMember(owner = "client!a", name = "I", descriptor = "Lkh;")
    public static class117 field1 = class224.method1450((byte) 111, "hint_mapmarkers");

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Lkh;")
    private static class117 field11 = class224.method1450((byte) -111, "Created gameworld");

    @OriginalMember(owner = "client!a", name = "V", descriptor = "Lkh;")
    public static class117 field14 = field9;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "Lkh;")
    public static class117 field8 = field11;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "[I")
    public static int[] field7 = new int[100];

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "[Lsj;")
    public static class207[] field18 = new class207[32768];

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "Lai;")
    public static class10 field16;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Ldd;")
    public class38 field17;

    @OriginalMember(owner = "client!a", name = "M", descriptor = "[Lnb;")
    public static class144[] field5;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)I")
    public static final int method1(int arg0, int arg1) {
        field6++;
        if (arg0 != 255) {
            field12 = -68;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)V")
    public static final void method2(int arg0, int arg1) {
        class170 var2 = class109.field2063[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class170 var4 = class109.field2063[var3][arg0][arg1] = class109.field2063[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3069--;
                for (int var5 = 0; var5 < var4.field3065; var5++) {
                    class57 var6 = var4.field3063[var5];
                    if ((var6.field1171 >> 29 & 0x3L) == 2L && var6.field1186 == arg0 && var6.field1170 == arg1) {
                        var6.field1183--;
                    }
                }
            }
        }
        if (class109.field2063[0][arg0][arg1] == null) {
            class109.field2063[0][arg0][arg1] = new class170(0, arg0, arg1);
        }
        class109.field2063[0][arg0][arg1].field3058 = var2;
        class109.field2063[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)Z")
    public static final boolean method3(int arg0) {
        field13++;
        if (arg0 != 16676) {
            return false;
        }
        try {
            if (class209.field3751 == 2) {
                if (class12.field385 == null) {
                    class12.field385 = class183.method1259(class213.field3879, class154.field2765, class66.field1273);
                    if (class12.field385 == null) {
                        return false;
                    }
                }
                if (class230.field4143 == null) {
                    class230.field4143 = new class165(class112.field2108, class159.field2917);
                }
                if (class39.field897.method1563(class223.field4019, class12.field385, class230.field4143, 22050, true)) {
                    class39.field897.method1568(arg0 ^ 0xFFFFBEA9);
                    class39.field897.method1567(class176.field3183, arg0 ^ 0x7203);
                    class39.field897.method1542(class12.field385, (byte) 121, class69.field1328);
                    class209.field3751 = 0;
                    class12.field385 = null;
                    class230.field4143 = null;
                    class213.field3879 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class39.field897.method1545((byte) -93);
            class209.field3751 = 0;
            class12.field385 = null;
            class213.field3879 = null;
            class230.field4143 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)I")
    public static final int method4(int arg0, int arg1) {
        if (arg1 <= 17) {
            field11 = null;
        }
        field10++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "e", descriptor = "(B)V")
    public static void method5(byte arg0) {
        field18 = null;
        field14 = null;
        field8 = null;
        field7 = null;
        field11 = null;
        field9 = null;
        if (arg0 != -25) {
            return;
        }
        field5 = null;
        field15 = null;
        field3 = null;
        field16 = null;
        field2 = null;
        field1 = null;
    }
}
