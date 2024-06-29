import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class163 extends class180 {

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Z")
    public boolean field2340 = false;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public int field2342 = -1;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "[I")
    public static int[] field2337 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "Z")
    public static boolean field2336 = false;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field2345 = 0;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "Lcs;")
    public static class351 field2347 = new class351(57, 6);

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!ji", name = "C", descriptor = "Lfk;")
    public static class79 field2348;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIZZ)V", line = 7)
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        class259.field3616 = arg0;
        class372.field5263 = 0x1 << class259.field3616;
        class411.field5703 = class372.field5263 >> 1;
        class338.field4638 = (int) Math.sqrt((double) (class411.field5703 * class411.field5703 + class411.field5703 * class411.field5703));
        class456.field6299 = arg2;
        class205.field2946 = arg3;
        class125.field1713 = arg4;
        class5.field110 = new class406[arg1][class456.field6299][class205.field2946];
        class366.field5215 = new class269[arg1];
        if (arg5) {
            class132.field1860 = new int[class456.field6299][class205.field2946];
            class226.field3194 = new byte[class456.field6299][class205.field2946];
            class269.field3727 = new byte[class456.field6299][class205.field2946];
            class96.field1366 = new class406[1][class456.field6299][class205.field2946];
            class8.field166 = new class269[1];
        } else {
            class132.field1860 = null;
            class226.field3194 = null;
            class269.field3727 = null;
            class96.field1366 = null;
            class8.field166 = null;
        }
        if (arg6) {
            class355.field4951 = new long[arg1][arg2][arg3];
            class488.field6890 = new class270[65535];
            class225.field3191 = new boolean[65535];
            class19.field321 = 0;
        } else {
            class355.field4951 = null;
            class488.field6890 = null;
            class225.field3191 = null;
            class19.field321 = 0;
        }
        class251.method1562(false);
        class376.field5316 = new class490[500];
        class173.field2560 = 0;
        class215.field3048 = new class490[500];
        class227.field3211 = 0;
        class473.field6624 = new int[arg1][class456.field6299 + 1][class205.field2946 + 1];
        class238.field3364 = new class478[5000];
        class160.field2305 = 0;
        class435.field5973 = new boolean[class125.field1713 + class125.field1713 + 1][class125.field1713 + class125.field1713 + 1];
        class451.field6194 = new boolean[class125.field1713 + class125.field1713 + 2][class125.field1713 + class125.field1713 + 2];
        class302.field4135 = null;
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 64)
    public static void method993(int arg0) {
        field2337 = null;
        field2347 = null;
        field2348 = null;
        if (arg0 > -11) {
            field2348 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)V", line = 88)
    public static final void method994(int arg0, byte arg1) {
        field2344++;
        class265 var2 = class440.method2554(arg0, 2, 1);
        if (arg1 > 80) {
            var2.method1677(21748);
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V", line = 133)
    public class163(int arg0) {
        this.field2342 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 111)
    public static final String method995(String arg0, byte arg1, String arg2, String arg3) {
        field2338++;
        for (int var4 = arg0.indexOf(arg2); var4 != -1; var4 = arg0.indexOf(arg2, var4 + arg3.length())) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(var4 + arg2.length());
        }
        int var5 = 44 % ((-arg1 - 14) / 45);
        return arg0;
    }
}
