import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Z")
    public static boolean field222 = false;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lje;")
    public static class67 field228 = class85.method592(255, "(U5");

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Lje;")
    public static class67 field217 = class85.method592(255, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Lpa;")
    public class105 field223;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lfd;")
    public static class40 field225;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static void method90(boolean arg0) {
        field225 = null;
        field217 = null;
        field228 = null;
        if (!arg0) {
            field228 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lna;ILje;)I")
    public static final int method91(class91 arg0, int arg1, class67 arg2) {
        field216++;
        int var3 = 92 / ((arg1 - 11) / 61);
        int var4 = arg0.field2043;
        arg0.method642(arg2.field1307, 2);
        arg0.field2043 += class58.field1169.method207(arg2.field1307, arg0.field1991, arg0.field2043, false, arg2.field1324, 0);
        return arg0.field2043 - var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lfd;ILfd;Lfd;Lfd;)V")
    public static final void method92(class40 arg0, int arg1, class40 arg2, class40 arg3, class40 arg4) {
        class45.field843 = arg4;
        class35.field649 = arg3;
        if (arg1 != 0) {
            field228 = null;
        }
        class75.field1627 = arg0;
        field220++;
        class6.field141 = arg2;
        class55.field1062 = new class72[class75.field1627.method250((byte) -84)][];
        class99.field2211 = new boolean[class75.field1627.method250((byte) -104)];
    }
}
