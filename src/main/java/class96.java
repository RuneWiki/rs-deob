import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class96 extends class255 {

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "Lja;")
    public class58 field1729;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "I")
    public static int field1728 = 0;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!uk", name = "S", descriptor = "Lgd;")
    public static class73 field1732;

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "[I")
    public static int[] field1733;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "[I")
    public static int[] field1735;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "[Lge;")
    public static class69[] field1731;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public static final void method813(boolean arg0, int arg1) {
        if (arg1 >= -101) {
            method814(-55, 33, -87, -10);
        }
        field1730++;
        byte[][] var2 = class100.field1849;
        int var3 = class91.field1646.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class13.field262[var4] >> 8) * 64 - class272.field4795;
                int var7 = (class13.field262[var4] & 0xFF) * 64 - class155.field2759;
                class154.method1175(95);
                class163.method1224((byte) -88, arg0, class112.field2007, var6, var7, var5);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lja;)V")
    public class96(class58 arg0) {
        this.field1729 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)V")
    public static final void method814(int arg0, int arg1, int arg2, int arg3) {
        class245 var4 = class7.method67(arg3, arg0, (byte) -69);
        if (var4 != null && var4.field4310 != null) {
            class75 var5 = new class75();
            var5.field1354 = var4;
            var5.field1364 = var4.field4310;
            class58.method495(var5, 150);
        }
        class138.field2475 = arg1;
        field1726++;
        class159.field2829 = arg3;
        class163.field2915 = arg0;
        class184.field3231 = true;
        class92.method777((byte) -65, var4);
        if (arg2 != 2077415688) {
            method816(-51, 21);
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V")
    public static final void method815(byte arg0) {
        field1736++;
        if (arg0 != -53) {
            field1735 = null;
        }
        if (class22.field431 != null) {
            class24 var1 = class22.field431;
            synchronized (class22.field431) {
                class22.field431 = null;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(II)Z")
    public static final boolean method816(int arg0, int arg1) {
        field1725++;
        if (arg0 != -58) {
            method815((byte) -118);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
    public static void method817(boolean arg0) {
        field1735 = null;
        if (arg0) {
            field1727 = 29;
        }
        field1733 = null;
        field1731 = null;
        field1732 = null;
    }
}
