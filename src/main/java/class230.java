import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class230 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "[I")
    public static int[] field3725 = new int[100];

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lck;")
    public static class119 field3726 = class298.method1987((byte) 95, "Fertigkeit)2");

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lck;")
    public static class119 field3722 = class298.method1987((byte) 81, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lbk;")
    public static class223 field3721;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 11)
    public static void method1488(int arg0) {
        field3725 = null;
        field3726 = null;
        field3722 = null;
        if (arg0 != 0) {
            method1489((class119) null, (byte) 127);
        }
        field3721 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lck;B)Z", line = 40)
    public static final boolean method1489(class119 arg0, byte arg1) {
        field3723++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class151.field2399; var2++) {
            if (arg0.method793(class203.field3214[var2], 40)) {
                return true;
            }
        }
        int var3 = -98 % ((55 - arg1) / 39);
        return false;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)I")
    public abstract int method355(byte arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method353(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method354(int arg0, Component arg1);
}
