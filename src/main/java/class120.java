import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class120 extends class125 {

    @OriginalMember(owner = "client!md", name = "J", descriptor = "Ljd;")
    public static class92 field2432 = class202.method1325((byte) 90, "sl_back");

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Ljd;")
    private static class92 field2433 = class202.method1325((byte) 90, "Could not complete login)3");

    @OriginalMember(owner = "client!md", name = "L", descriptor = "Ljd;")
    private static class92 field2434 = class202.method1325((byte) 90, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Ljd;")
    public static class92 field2427 = field2433;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Ljd;")
    public static class92 field2438 = class202.method1325((byte) 90, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Ljd;")
    public static class92 field2423 = field2434;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "Ljd;")
    private static class92 field2437 = class202.method1325((byte) 90, "Please try again)3");

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Ljd;")
    public static class92 field2425 = field2437;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Lnh;")
    public static class133 field2422;

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Ljd;")
    public class92 field2443;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "[I")
    public int[] field2429;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "[I")
    public int[] field2439;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "[Ldb;")
    public class33[] field2424;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "[Ljd;")
    public class92[] field2440;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V")
    public static void method809(int arg0) {
        field2423 = null;
        field2437 = null;
        field2425 = null;
        field2434 = null;
        field2427 = null;
        field2433 = null;
        field2438 = null;
        field2432 = null;
        if (arg0 == -27912) {
            field2422 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -4) {
            return;
        }
        field2428++;
        if (arg0 < 1 || arg3 < 1 || arg0 > 102 || arg3 > 102) {
            return;
        }
        if (class115.field2339 && class81.field1639 != arg6) {
            return;
        }
        boolean var8 = true;
        long var9 = 0L;
        boolean var11 = false;
        boolean var12 = false;
        if (arg2 == 0) {
            var9 = class124.method831(arg6, arg0, arg3);
        }
        if (arg2 == 1) {
            var9 = class74.method515(arg6, arg0, arg3);
        }
        if (arg2 == 2) {
            var9 = class213.method1381(arg6, arg0, arg3);
        }
        if (arg2 == 3) {
            var9 = class87.method586(arg6, arg0, arg3);
        }
        if (var9 != 0L) {
            int var13 = (int) var9 >> 20 & 0x3;
            int var14 = Integer.MAX_VALUE & (int) (var9 >>> 32);
            int var15 = (int) var9 >> 14 & 0x1F;
            if (arg2 == 0) {
                class102.method704(arg6, arg0, arg3);
                class214 var16 = class126.method846(0, var14);
                if (var16.field4143 != 0) {
                    class32.field729[arg6].method790(arg3, var16.field4179, false, arg0, var13, var15);
                }
            }
            if (arg2 == 1) {
                class80.method547(arg6, arg0, arg3);
            }
            if (arg2 == 2) {
                class41.method262(arg6, arg0, arg3);
                class214 var17 = class126.method846(0, var14);
                if (var17.field4197 + arg0 > 103 || var17.field4197 + arg3 > 103 || var17.field4191 + arg0 > 103 || var17.field4191 + arg3 > 103) {
                    return;
                }
                if (var17.field4143 != 0) {
                    class32.field729[arg6].method792(var17.field4191, var13, var17.field4197, arg3, (byte) 104, arg0, var17.field4179);
                }
            }
            if (arg2 == 3) {
                class136.method908(arg6, arg0, arg3);
                class214 var18 = class126.method846(0, var14);
                if (var18.field4143 == 1) {
                    class32.field729[arg6].method805(arg3, 94, arg0);
                }
            }
        }
        if (arg5 < 0) {
            return;
        }
        int var19 = arg6;
        if (arg6 < 3 && (class59.field1239[1][arg0][arg3] & 0x2) == 2) {
            var19 = arg6 + 1;
        }
        class12.method80(arg0, var19, class32.field729[arg6], false, arg7, arg3, arg6, arg4, arg5);
        return;
    }
}
