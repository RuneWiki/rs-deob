import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class43 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lsg;")
    private static class169 field802 = class165.method1060("Connecting to update server", 1536);

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lsg;")
    private static class169 field805 = class165.method1060("Loaded title screen", 1536);

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "Lsg;")
    public static class169 field803 = field805;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Lsg;")
    public static class169 field801 = field802;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lsg;")
    private static class169 field812 = class165.method1060("Starting game engine)3)3)3", 1536);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Lsg;")
    public static class169 field808 = field812;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "Lsg;")
    public static class169 field814 = class165.method1060("", 1536);

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lsg;")
    public static class169 field810 = field814;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "Lsg;")
    public static class169 field800 = field814;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lsg;")
    public static class169 field807 = field814;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "Lsg;")
    public static class169 field804 = field814;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Lsg;")
    public static class169 field806 = field814;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "Lsg;")
    public static class169 field811 = field814;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lmg;Z)V")
    public static final void method275(class115 arg0, boolean arg1) {
        field809++;
        if (!arg1) {
            method275(null, true);
        }
        if (class56.field1040 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class178.field3480 && var2 + 14 >= class178.field3480 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(0, 0, true);
            return;
        }
        if (var2 + 15 <= class178.field3480 && var2 + 80 >= class178.field3480 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(1, 0, true);
            return;
        }
        short var3 = 390;
        if (var3 <= class178.field3480 && var3 + 14 >= class178.field3480 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(0, 1, true);
            return;
        }
        if (class178.field3480 >= var3 + 15 && class178.field3480 <= var3 + 80 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(1, 1, true);
            return;
        }
        short var4 = 500;
        if (class178.field3480 >= var4 && class178.field3480 <= var4 + 14 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(0, 2, true);
            return;
        }
        if (var4 + 15 <= class178.field3480 && class178.field3480 <= var4 + 80 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(1, 2, arg1);
            return;
        }
        short var5 = 610;
        if (var5 <= class178.field3480 && class178.field3480 <= var5 + 14 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(0, 3, true);
            return;
        }
        if (class178.field3480 >= var5 + 15 && class178.field3480 <= var5 + 80 && class42.field796 >= 4 && class42.field796 <= 18) {
            class116.method710(1, 3, arg1);
            return;
        }
        if (class178.field3480 >= 708 && class42.field796 >= 4 && class178.field3480 <= 758 && class42.field796 <= 20) {
            class54.field996 = false;
            class160.field3056.method111(0, 0);
            class185.field3609.method111(382, 0);
            class150.field2896.method370(382 - class150.field2896.field1105 / 2, 18);
            return;
        }
        if (class169.field3265 == -1) {
            return;
        }
        class187 var6 = class159.field3038[class169.field3265];
        if (class175.field3398 == var6.field3638) {
            byte[] var7 = class165.method1058(0, new class169[] { var6.field3641, class65.field1215 }).method1108((byte) -106);
            class20.field442 = new String(var7, 0, var7.length);
            if (class20.field439 != 0) {
                class80.field1472 = 443;
                class56.field1026 = 43594;
                class13.field304 = 43594;
                class20.field439 = 0;
            }
            class80.field1482 = var6.field3637;
            class54.field996 = false;
            class160.field3056.method111(0, 0);
            class185.field3609.method111(382, 0);
            class150.field2896.method370(382 - class150.field2896.field1105 / 2, 18);
            return;
        }
        class169 var8 = class165.method1058(0, new class169[] { class185.field3614, var6.field3641, class65.field1215, class45.field844, class6.field126, class2.method18((byte) -62, class105.field1925 ? 1 : 0), class31.field668, class2.method18((byte) -62, class187.field3640), class141.field2633, class2.method18((byte) -62, class7.field202) });
        try {
            arg0.getAppletContext().showDocument(var8.method1115(109), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        if (arg0 != 708) {
            method275(null, true);
        }
        field810 = null;
        field812 = null;
        field805 = null;
        field801 = null;
        field814 = null;
        field806 = null;
        field811 = null;
        field808 = null;
        field803 = null;
        field804 = null;
        field807 = null;
        field800 = null;
        field802 = null;
    }
}
