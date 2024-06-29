import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class183 extends class47 {

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "Lrc;")
    public static class108 field2754 = new class108(50, -1);

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "Z")
    public static boolean field2760 = false;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "Lnl;")
    public static class435 field2758;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;I)Lfg;")
    public static final class269 method1304(Component arg0, int arg1) {
        field2757++;
        if (arg1 <= 18) {
            field2754 = null;
        }
        return new class393(arg0);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILbn;Lnl;Lnl;)V")
    public static final void method1305(int arg0, class321 arg1, class435 arg2, class435 arg3) {
        field2755++;
        class424.field5878 = arg2;
        class62.field912 = arg1;
        class209.field3068 = arg3;
        if (arg0 >= -66) {
            method1306(true, -58);
        }
        if (class209.field3068 != null) {
            class12.field90 = class209.field3068.method2638(1, 1);
        }
        if (class424.field5878 != null) {
            class119.field1649 = class424.field5878.method2638(1, 1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Z")
    public static final boolean method1306(boolean arg0, int arg1) {
        field2759++;
        if (arg0) {
            method1308(66);
        }
        return arg1 == 13 || arg1 == 47 || arg1 == 1002 || arg1 == 2 || arg1 == 59;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static final void method1307(int arg0) {
        field2756++;
        if (arg0 != 23952) {
            field2760 = false;
        }
        for (class113 var1 = (class113) class384.field5274.method1763((byte) -62); var1 != null; var1 = (class113) class384.field5274.method1767(true)) {
            var1.method897();
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
    public static void method1308(int arg0) {
        field2754 = null;
        if (arg0 < 58) {
            method1304((Component) null, -122);
        }
        field2758 = null;
    }

    static {
        new class151("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
