import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class103 {

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "Lgg;")
    private static class63 field2375 = class116.method911(43, "Cancel");

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Lgg;")
    public static class63 field2374 = field2375;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "Lgg;")
    private static class63 field2377 = class116.method911(43, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lgg;")
    public static class63 field2372 = field2377;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lch;")
    public static class29 field2371 = new class29(64);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "I")
    public static int field2380 = -1;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field2382 = 0;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lgg;")
    public static class63 field2379 = class116.method911(43, "<col=ff9040>");

    @OriginalMember(owner = "client!ld", name = "n", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "Ljc;")
    public static class85 field2383;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(III)V")
    public static final void method851(int arg0, int arg1, int arg2) {
        field2378++;
        if (arg0 != 28228) {
            method852(35);
        }
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class104.field2388[var6] != arg2) {
                var3[var5] = class104.field2388[var6];
                var4[var5] = class177.field3630[var6];
                var5++;
            }
        }
        class104.field2388 = var3;
        class177.field3630 = var4;
        class40.method365(class47.field1111.length - 1, class177.field3630, class47.field1111, class104.field2388, 0, arg0 - 28186);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method852(int arg0) {
        field2383 = null;
        if (arg0 != -6102) {
            method851(80, -97, -12);
        }
        field2379 = null;
        field2372 = null;
        field2375 = null;
        field2377 = null;
        field2374 = null;
        field2371 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BII)V")
    public static final void method853(byte arg0, int arg1, int arg2) {
        field2376++;
        if (class144.method1026((byte) -125, arg1) && arg0 == -26) {
            class46.method459(arg2, class23.field539[arg1], true);
        }
    }
}
