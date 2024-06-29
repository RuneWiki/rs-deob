import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class41 {

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "Lv;")
    public static class146 field936 = class159.method1226((byte) -37, "blinken2:");

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "Lv;")
    public static class146 field929 = class159.method1226((byte) -37, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field931 = -2;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field934 = 0;

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "[Lsd;")
    public static class129[] field938 = new class129[4];

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "Lne;")
    public static class95 field930;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "[I")
    public static int[] field935;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "[[B")
    public static byte[][] field928;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)Lv;")
    public static final class146 method270(int arg0, int arg1) {
        field937++;
        return ~class74.field1720[arg0].method1080(-1) >= arg1 ? class137.field3113[arg0] : class71.method509(new class146[] { class137.field3113[arg0], class13.field218, class74.field1720[arg0] }, (byte) -104);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)V")
    public static final void method271(int arg0, byte arg1) {
        field932++;
        if (arg0 == -1 || !class110.field2609[arg0]) {
            return;
        }
        class37.field820.method582(arg0, true);
        if (class34.field736[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 != -56) {
            method272(null, (byte) -23, -56, null, null);
        }
        for (int var3 = 0; var3 < class34.field736[arg0].length; var3++) {
            if (class34.field736[arg0][var3] != null) {
                if (class34.field736[arg0][var3].field479 == 2) {
                    var2 = false;
                } else {
                    class34.field736[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class34.field736[arg0] = null;
        }
        class110.field2609[arg0] = false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lv;BILv;Lv;)V")
    public static final void method272(class146 arg0, byte arg1, int arg2, class146 arg3, class146 arg4) {
        field933++;
        for (int var5 = 99; var5 > 0; var5--) {
            class94.field2238[var5] = class94.field2238[var5 - 1];
            class42.field968[var5] = class42.field968[var5 - 1];
            class76.field1805[var5] = class76.field1805[var5 - 1];
            class132.field3006[var5] = class132.field3006[var5 - 1];
        }
        class94.field2238[0] = arg2;
        class88.field2084++;
        if (arg1 >= -20) {
            field936 = null;
        }
        class42.field968[0] = arg4;
        class76.field1805[0] = arg0;
        class132.field3006[0] = arg3;
        class117.field2734 = class44.field1016;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public static void method273(int arg0) {
        field938 = null;
        field930 = null;
        field928 = null;
        if (arg0 == -9711) {
            field929 = null;
            field936 = null;
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZLla;)V")
    public static final void method274(boolean arg0, class77 arg1) {
        if (!arg0) {
            method270(-56, 82);
        }
        class98.field2361 = arg1;
        field940++;
        class71.field1647 = class98.field2361.method578(16, 0);
    }
}
