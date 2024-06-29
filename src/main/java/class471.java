import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class471 extends class313 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "[I")
    public int[] field6637;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "[I")
    public int[] field6639;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "[I")
    public static int[] field6636 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Lsd;")
    public static class74 field6640 = new class74(51, 0);

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[I")
    public static int[] field6643 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "[I")
    public static int[] field6642 = new int[4096];

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "Lec;")
    public static class40 field6641 = new class40("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "Z")
    public static boolean field6644 = false;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field6635;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    public static int field6638;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2784(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6638++;
        int var7 = class353.method2142((byte) -73, class328.field4729, arg4, class357.field5123);
        int var8 = class353.method2142((byte) 63, class328.field4729, arg2, class357.field5123);
        int var9 = class353.method2142((byte) -69, class453.field6396, arg0, class75.field912);
        int var10 = class353.method2142((byte) -45, class453.field6396, arg6, class75.field912);
        if (arg3 <= 73) {
            field6643 = null;
        }
        int var11 = class353.method2142((byte) 109, class328.field4729, arg1 + arg4, class357.field5123);
        int var12 = class353.method2142((byte) -107, class328.field4729, arg2 - arg1, class357.field5123);
        for (int var13 = var7; var13 < var11; var13++) {
            class270.method1633(class240.field3303[var13], var10, arg5, var9, 117);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class270.method1633(class240.field3303[var14], var10, arg5, var9, 101);
        }
        int var15 = class353.method2142((byte) 63, class453.field6396, arg0 + arg1, class75.field912);
        int var16 = class353.method2142((byte) 60, class453.field6396, arg6 - arg1, class75.field912);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class240.field3303[var17];
            class270.method1633(var18, var15, arg5, var9, 97);
            class270.method1633(var18, var10, arg5, var16, 98);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        field6642 = null;
        field6643 = null;
        field6640 = null;
        field6636 = null;
        field6641 = null;
        if (arg0 != 20) {
            field6636 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILgn;)V")
    public static final void method2786(int arg0, class187 arg1) {
        field6635++;
        if (arg0 < 125) {
            return;
        }
        boolean var2 = false;
        if (class204.field2796 == arg1.field2508 || arg1.field2449 == -1 || arg1.field2495 != 0) {
            var2 = true;
        } else {
            class207 var3 = class175.field2103.method1267(-31, arg1.field2449);
            if (var3.field2867 || var3.field2843[arg1.field2498] < (arg1.field2450 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field2508 - arg1.field2509;
            int var5 = class204.field2796 - arg1.field2509;
            int var6 = arg1.field2462 * 128 + (arg1.method1012(false) * 64);
            int var7 = arg1.field2479 * 128 + (arg1.method1012(false) * 64);
            int var8 = arg1.field2463 * 128 + arg1.method1012(false) * 64;
            int var9 = arg1.field2484 * 128 + (arg1.method1012(false) * 64);
            arg1.field1008 = ((var4 - var5) * var6 + var5 * var8) / var4;
            arg1.field1005 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg1.field2530 = 0;
        if (arg1.field2460 == 0) {
            arg1.method1015((byte) -8, 8192);
        }
        if (arg1.field2460 == 1) {
            arg1.method1015((byte) -8, 12288);
        }
        if (arg1.field2460 == 2) {
            arg1.method1015((byte) -8, 0);
        }
        if (arg1.field2460 == 3) {
            arg1.method1015((byte) -8, 4096);
        }
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(II[I[I)V")
    public class471(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field6637 = arg2;
        this.field6639 = arg3;
    }
}
