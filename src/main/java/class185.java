import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class185 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lbf;")
    public static class199 field3275 = new class199(5);

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lqk;")
    public static class207 field3280 = class24.method212(255, " )2>");

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field3283 = 0;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Lqh;")
    public static class200 field3281 = new class200();

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lqk;")
    private static class207 field3287 = class24.method212(255, "Select");

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lqk;")
    public static class207 field3285 = field3287;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lmd;")
    public static class220 field3282;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lqe;")
    public static class96 field3284;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "[[B")
    public static byte[][] field3286;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3284 = null;
        field3285 = null;
        field3280 = null;
        field3282 = null;
        field3286 = null;
        field3281 = null;
        field3287 = null;
        field3275 = null;
        if (arg0 != 3524) {
            method1298(-84, -122, -52, 10, -92, -84, -109);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIZI)V")
    public static final void method1296(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg4 != -16498) {
            return;
        }
        field3276++;
        class69.field1235 = 0L;
        boolean var5 = false;
        int var6 = class262.method1813(7);
        if (arg2 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class229.field4205.startsWith("mac") && arg2 > 0) {
            arg3 = true;
        }
        if (arg2 > 0 != var6 > 0) {
            var5 = true;
        }
        if (arg3 && arg2 > 0) {
            var5 = true;
        }
        class280.method1902(arg2, arg3, arg1, (byte) 122, arg0, var6, var5);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII)V")
    public static final void method1297(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class82.field1498[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class28 var5 = var4.field3142;
        if (var5 != null) {
            var5.field561 = var5.field561 * arg3 / 16;
            var5.field568 = var5.field568 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3279++;
        if (arg1 != 0) {
            return;
        }
        class220 var7 = class108.method782((byte) 122, arg0, arg2);
        if (var7 != null && var7.field3898 != null) {
            class206 var8 = new class206();
            var8.field3614 = var7;
            var8.field3616 = var7.field3898;
            class69.method501(99, var8);
        }
        class60.field1096 = arg5;
        class231.field4236 = arg0;
        class127.field2218 = arg3;
        class175.field3166 = arg6;
        class269.field4757 = arg4;
        class4.field71 = true;
        class13.field176 = arg2;
        class82.method614((byte) 112, var7);
    }
}
