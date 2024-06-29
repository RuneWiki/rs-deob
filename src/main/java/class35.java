import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class35 extends class132 {

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lvd;")
    public class222 field764;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lvd;")
    public static class222 field766 = class212.method1357("<col=00ff00>", 10731);

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lcf;")
    public static class28 field765 = new class28();

    @OriginalMember(owner = "client!db", name = "y", descriptor = "Lvd;")
    public static class222 field770 = class212.method1357("Lade Wordpack )2 ", 10731);

    @OriginalMember(owner = "client!db", name = "B", descriptor = "I")
    public static int field773 = -1;

    @OriginalMember(owner = "client!db", name = "z", descriptor = "Lvd;")
    public static class222 field771 = class212.method1357(" <col=ffffff>", 10731);

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field774 = -1;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!db", name = "w", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!db", name = "x", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "Lab;")
    public static class3 field772;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V")
    public static final void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field769++;
        if (arg2 >= class129.field2514 && class230.field4322 >= arg2) {
            int var5 = class22.method209(class112.field2107, arg3, -120, class127.field2448);
            int var6 = class22.method209(class112.field2107, arg1, -40, class127.field2448);
            class66.method456(var5, var6, arg2, false, arg4);
        }
        if (arg0 > -1) {
            method294(-82);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIZ)V")
    public static final void method293(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field770 = null;
        }
        field767++;
        if (class27.method232(arg0, -7754)) {
            class38.method308(arg1, arg2, -1, 1, class220.field4066[arg0]);
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
    public class35() {
    }

    @OriginalMember(owner = "client!db", name = "e", descriptor = "(I)V")
    public static void method294(int arg0) {
        field770 = null;
        field771 = null;
        field766 = null;
        field772 = null;
        int var1 = -120 % ((45 - arg0) / 56);
        field765 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lvd;)V")
    public class35(class222 arg0) {
        this.field764 = arg0;
    }
}
