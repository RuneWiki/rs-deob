import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class98 {

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "[S")
    public static short[] field2442 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Z")
    public static boolean field2440 = false;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "Lic;")
    public static class59 field2441 = class59.method433(0, "zur-Uck auf die RuneScape)2Webseite gehen");

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lic;")
    private static class59 field2448 = class59.method433(0, "Choose Option");

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Lic;")
    public static class59 field2443 = field2448;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lfd;")
    public static class40 field2447;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lmd;")
    public static class87 field2445;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)I")
    public static final int method802(int arg0) {
        if (arg0 != -20310) {
            method803(-93);
        }
        field2446++;
        return class153.field3321++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public static void method803(int arg0) {
        field2443 = null;
        field2441 = null;
        field2445 = null;
        field2448 = null;
        field2442 = null;
        if (arg0 != 14282) {
            method802(5);
        }
        field2447 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method68(int arg0, Component arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
    public abstract int method70(byte arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method69(boolean arg0, Component arg1);
}
