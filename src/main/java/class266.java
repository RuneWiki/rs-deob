import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class266 {

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "Lmh;")
    public static class62 field4494 = class201.method1405(true, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lmh;")
    public static class62 field4493 = class201.method1405(true, "<col=80ff00>");

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lmh;")
    public static class62 field4495 = class201.method1405(true, "sl_stars");

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "Lhi;")
    public static class26 field4490;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "[[[B")
    public static byte[][][] field4497;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 10)
    public static final void method1832(int arg0) {
        field4492++;
        try {
            if (arg0 < 108) {
                field4495 = (class62) null;
            }
            if (class53.field779 == null) {
                class53.field779 = new class137(class193.field3246, class254.method1772(new class62[] { class96.method765((byte) -119), class251.field4260 }, 0).method433(116));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class53.field779 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II[BI)Lmh;", line = 29)
    public static final class62 method1833(int arg0, int arg1, byte[] arg2, int arg3) {
        class62 var4 = new class62();
        var4.field893 = arg3;
        field4491++;
        var4.field906 = new byte[arg1];
        for (int var5 = arg0; var5 < (arg0 + arg1); var5++) {
            if (arg2[var5] != 0) {
                var4.field906[var4.field893++] = arg2[var5];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V", line = 85)
    public static void method1834(boolean arg0) {
        field4490 = null;
        if (!arg0) {
            field4493 = (class62) null;
        }
        field4497 = (byte[][][]) null;
        field4494 = null;
        field4495 = null;
        field4493 = null;
    }
}
