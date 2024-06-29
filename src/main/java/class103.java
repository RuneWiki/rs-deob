import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class103 {

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1433 = " more options";

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1435 = "Loaded update list";

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "I")
    public static int field1434 = 0;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1438 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[I")
    public static int[] field1431 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1437 = 2;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Z")
    public static boolean field1436 = false;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1441 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Lic;")
    public static class143 field1430 = new class143(128);

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1442 = 0;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "[S")
    public static short[] field1443 = new short[256];

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "Lse;")
    public static class211 field1439;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method674(int arg0) {
        field1431 = null;
        field1430 = null;
        field1443 = null;
        field1433 = null;
        field1438 = null;
        field1439 = null;
        field1435 = null;
        if (arg0 >= -105) {
            field1438 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static final void method675(boolean arg0) {
        class155.field2160.method546(-90762264);
        field1432++;
        if (arg0) {
            method676(-19, -16, -1, -100, -41, 52, 69, -29, -93, 125, -50, -122, -26);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public static final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        class217 var13 = new class217();
        var13.field3273 = arg0;
        var13.field3277 = arg4;
        var13.field3267 = arg11;
        if (arg2 <= 102) {
            method676(-16, -51, 79, 0, 111, -59, -84, -71, -74, 115, -73, -90, 96);
        }
        var13.field3271 = arg1;
        var13.field3272 = arg8;
        var13.field3281 = arg7;
        var13.field3274 = arg9;
        var13.field3268 = arg3;
        var13.field3283 = arg5;
        var13.field3284 = arg6;
        var13.field3279 = arg12;
        var13.field3270 = arg10;
        class140.field1940.method988(var13, (byte) -77);
        field1440++;
    }
}
