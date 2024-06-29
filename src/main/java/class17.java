import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class17 {

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[Lda;")
    public static class275[] field248 = new class275[100];

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lda;")
    public static class275 field249 = class255.method1672(98, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field247 = 0;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "Lda;")
    public static class275 field252 = class255.method1672(127, " weitere Optionen");

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field254 = 0;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public static void method88(byte arg0) {
        int var1 = 100 / ((arg0 - 32) / 61);
        field248 = null;
        field252 = null;
        field249 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
    public static final void method89(int arg0, int arg1) {
        class52.field863--;
        field253++;
        if (class52.field863 == arg0) {
            return;
        }
        class154.method1084(class174.field3015, arg0 + 1, class174.field3015, arg0, class52.field863 - arg0);
        class154.method1084(class201.field3446, arg0 + 1, class201.field3446, arg0, class52.field863 - arg0);
        class154.method1089(class137.field2400, arg0 + arg1, class137.field2400, arg0, class52.field863 - arg0);
        class154.method1087(class13.field200, arg0 + 1, class13.field200, arg0, class52.field863 - arg0);
        class154.method1086(class161.field2820, arg0 + 1, class161.field2820, arg0, class52.field863 - arg0);
        class154.method1086(class13.field196, arg0 + 1, class13.field196, arg0, class52.field863 - arg0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public static final void method90(int arg0) {
        for (int var1 = 0; var1 < 100; var1++) {
            class200.field3418[var1] = true;
        }
        field251++;
        if (arg0 != 1) {
            field247 = -87;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIZ)V")
    public static final void method91(int arg0, int arg1, int arg2, boolean arg3) {
        field250++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class84.field1375 = arg1;
        class155.field2702 = arg0;
        class110.field1946 = arg3;
        if (arg2 != -1) {
            field249 = null;
        }
    }
}
