import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class170 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Led;")
    private static class43 field3394 = class191.method1219("Existing User", false);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Led;")
    public static class43 field3395 = field3394;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3399 = 0;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field3396 = 3353893;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Led;")
    private static class43 field3400 = class191.method1219("Please subscribe)1 or use a different world)3", false);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Led;")
    public static class43 field3389 = field3400;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lga;")
    public static class58 field3390;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Led;")
    public static final class43 method1080(int arg0, int arg1) {
        field3397++;
        return ~class115.field2237[arg1].method248((byte) 60) < arg0 ? class167.method1036(new class43[] { class112.field2141[arg1], class97.field1881, class115.field2237[arg1] }, true) : class112.field2141[arg1];
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)[B")
    public abstract byte[] method986(int arg0);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([BI)V")
    public abstract void method985(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public static void method1081(int arg0) {
        if (arg0 != 64) {
            method1081(63);
        }
        field3390 = null;
        field3395 = null;
        field3400 = null;
        field3394 = null;
        field3389 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILed;)V")
    public static final void method1082(int arg0, int arg1, class43 arg2) {
        class29.field522.method338(253, arg1);
        class29.field522.method580(arg1 + 22130, arg0);
        class29.field522.method559(-1821211872, arg2.method249(-48));
        field3392++;
        class17.field293++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILna;)V")
    public static final void method1083(int arg0, int arg1, class119 arg2) {
        if (client.field559 < arg2.field2365) {
            class114.method717(arg2, -91);
        } else if (arg2.field2333 >= client.field559) {
            class133.method855(arg2, 1024);
        } else {
            class107.method661(false, arg2);
        }
        if (arg2.field2347 < 128 || arg2.field2328 < 128 || arg2.field2347 >= 13184 || arg2.field2328 >= 13184) {
            arg2.field2351 = -1;
            arg2.field2333 = 0;
            arg2.field2328 = arg2.field2335[0] * 128 + arg2.field2327 * 64;
            arg2.field2365 = 0;
            arg2.field2364 = -1;
            arg2.field2347 = arg2.field2357[0] * 128 + arg2.field2327 * 64;
            arg2.method760(false);
        }
        field3391++;
        if (class67.field1348 == arg2 && (arg2.field2347 < 1536 || arg2.field2328 < 1536 || arg2.field2347 >= 11776 || arg2.field2328 >= 11776)) {
            arg2.field2328 = arg2.field2335[0] * 128 + arg2.field2327 * 64;
            arg2.field2351 = -1;
            arg2.field2333 = 0;
            arg2.field2365 = 0;
            arg2.field2347 = arg2.field2357[0] * 128 + arg2.field2327 * 64;
            arg2.field2364 = -1;
            arg2.method760(false);
        }
        class100.method620(arg2, -1);
        class52.method319(118, arg2);
        int var3 = -87 / ((arg0 - 14) / 35);
    }
}
