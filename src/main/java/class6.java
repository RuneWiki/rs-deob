import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class6 {

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Loh;")
    public static class258 field85 = class153.method1046("RuneScape wird geladen )2 bitte warten)3)3)3", 126);

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "S")
    public static short field78 = 32767;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field82 = 0;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Loh;")
    private static class258 field77 = class153.method1046("M", 114);

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Loh;")
    public static class258 field83 = field77;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Loh;")
    public static class258 field88 = field77;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field76;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public int field86;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 4)
    public static void method33(byte arg0) {
        field83 = null;
        if (arg0 > -98) {
            field85 = (class258) null;
        }
        field88 = null;
        field77 = null;
        field85 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)Z", line = 42)
    public final boolean method34(boolean arg0) {
        field79++;
        if (arg0) {
            return false;
        } else {
            return (this.field89 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)Lrm;", line = 53)
    public static final class113 method35(int arg0) {
        field84++;
        class113 var1;
        if (class257.field4390) {
            var1 = new class46(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], class37.field497[0], class121.field2143);
        } else {
            var1 = new class129(class108.field1919, class23.field279, class279.field4795[0], class280.field4819[0], class113.field1958[0], class301.field5149[0], class37.field497[0], class121.field2143);
        }
        class290.method2038(127);
        return arg0 == -24600 ? var1 : (class113) null;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)Z", line = 74)
    public final boolean method36(int arg0) {
        field80++;
        int var2 = 27 % ((48 - arg0) / 34);
        return (this.field89 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)Z", line = 91)
    public final boolean method37(int arg0) {
        if (arg0 != -1) {
            this.field89 = -22;
        }
        field90++;
        return (this.field89 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Z", line = 116)
    public final boolean method38(int arg0) {
        if (arg0 <= 96) {
            method33((byte) -1);
        }
        field87++;
        return (this.field89 & 0x1) != 0;
    }
}
