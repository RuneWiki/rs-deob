import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class424 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "Z")
    public static boolean field6187 = false;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field6193 = 0;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "Z")
    public static boolean field6189 = false;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[I")
    public static int[] field6192 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[I")
    public static int[] field6195 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field6196 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!ai", name = "i", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
    public static int field6197;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILir;III)V")
    public static final void method2530(int arg0, int arg1, int arg2, class22 arg3, int arg4, int arg5, int arg6) {
        field6186++;
        if (arg0 >= 48) {
            class239.method1384(arg5, 0, (byte) 122, arg4, arg6, arg3.field464, arg2, arg3.field461, arg3.field466, arg1);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method2531(int arg0) {
        if (arg0 != 0) {
            field6191 = -127;
        }
        field6197++;
        if (class457.field6678 != class175.field2498) {
            try {
                class484.method2855(class407.field5639, "tbrefresh", -29222);
            } catch (Throwable var1) {
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method2532(int arg0) {
        field6192 = null;
        field6195 = null;
        if (arg0 != 13257) {
            method2532(47);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIZ)V")
    public static final void method2533(int arg0, int arg1, boolean arg2) {
        field6190++;
        class163 var3 = class271.method1546(arg1, 16, true);
        var3.method1017(0);
        var3.field2328 = arg0;
        if (arg2) {
            method2533(-71, -118, false);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
    public static final void method2534(int arg0, boolean arg1) {
        class33.field465 = 0;
        class44.field614 = 0;
        field6188++;
        class401.method2326(-128);
        class161.method996(arg1, false);
        class117.method744(arg0 + 26061);
        for (int var2 = 0; var2 < class33.field465; var2++) {
            int var4 = class23.field380[var2];
            if (class393.field5484 != class179.field2534[var4].field298) {
                if (class179.field2534[var4].field5623.method1862(true)) {
                    class247.method1458(80, class179.field2534[var4]);
                }
                class179.field2534[var4].method2343(null, -128);
                class179.field2534[var4] = null;
            }
        }
        if (class438.field6394 != class387.field5435.field5069) {
            throw new RuntimeException("gnp1 pos:" + class387.field5435.field5069 + " psize:" + class438.field6394);
        }
        for (int var3 = 0; var3 < class166.field2352; var3++) {
            if (class179.field2534[class54.field750[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class166.field2352);
            }
        }
        if (arg0 != 16) {
            method2531(-8);
        }
    }
}
