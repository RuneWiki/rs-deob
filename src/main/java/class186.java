import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class186 {

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "Lcd;")
    public static class64 field3199 = class44.method335((byte) 71, "Sprites geladen)3");

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "[J")
    public static long[] field3203 = new long[1000];

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "Lsk;")
    public static class119 field3201;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lja;")
    public static class60 field3198;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 9)
    public static void method1315(byte arg0) {
        field3201 = null;
        field3199 = null;
        field3198 = null;
        field3203 = null;
        if (arg0 != -53) {
            field3198 = (class60) null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 23)
    public static final void method1316(int arg0, int arg1) {
        if (arg0 > -29) {
            return;
        }
        class274.field4699 = arg1;
        class189.field3257 = -1;
        field3200++;
        class189.field3257 = -1;
        class155.method1117((byte) -101);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lqm;Ldd;Lqm;Lqm;Z)Z", line = 37)
    public static final boolean method1317(class222 arg0, class238 arg1, class222 arg2, class222 arg3, boolean arg4) {
        class258.field4463 = arg1;
        class25.field419 = arg3;
        field3202++;
        class26.field427 = arg0;
        class62.field1207 = arg2;
        if (arg4) {
            method1315((byte) -78);
        }
        return true;
    }
}
