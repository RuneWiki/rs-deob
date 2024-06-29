import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class289 {

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "Lqd;")
    public static class37 field4570 = new class37(64);

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "Z")
    public static boolean field4572 = false;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "[I")
    public static int[] field4574 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4575 = "shake:";

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIILha;)V")
    public static final void method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class267 arg6) {
        int var7 = arg2 * arg2 + arg5 * arg5;
        field4573++;
        if (var7 > 360000) {
            return;
        }
        if (arg0 != -10) {
            method1934(-59);
        }
        int var8 = Math.min(arg6.field4177 / 2, arg6.field4051 / 2);
        if ((var8 * var8) >= var7) {
            class61.method404(arg3, arg2, arg6, arg1, arg5, class131.field1917[arg4], arg0 ^ 0xFFFFFFF4);
            return;
        }
        var8 -= 10;
        int var9 = class245.field3667 + class183.field2611 & 0x7FF;
        int var10 = class18.field259[var9];
        int var11 = var10 * 256 / (class282.field4495 + 256);
        int var12 = class18.field261[var9];
        int var13 = var12 * 256 / (class282.field4495 + 256);
        int var14 = arg2 * var11 + arg5 * var13 >> 16;
        int var15 = arg5 * var11 - (arg2 * var13) >> 16;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        ((class244) class72.field1118[arg4]).method1301(arg6.field4177 / 2 + arg3 + var18 - 10, arg6.field4051 / 2 + -var19 + arg1 + -10, 20, 20, 15, 15, var16, 256);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II[SI[Ljava/lang/String;)V")
    public static final void method1933(int arg0, int arg1, short[] arg2, int arg3, String[] arg4) {
        if (arg3 < arg0) {
            int var5 = (arg0 + arg3) / 2;
            String var6 = arg4[var5];
            int var7 = arg3;
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var6;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var6 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var6)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var7];
                    arg4[var7] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var7];
                    arg2[var7++] = var11;
                }
            }
            arg4[arg0] = arg4[var7];
            arg4[var7] = var6;
            arg2[arg0] = arg2[var7];
            arg2[var7] = var8;
            method1933(var7 - 1, 121, arg2, arg3, arg4);
            method1933(arg0, 121, arg2, var7 + 1, arg4);
        }
        int var12 = 19 / ((65 - arg1) / 53);
        field4571++;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static void method1934(int arg0) {
        field4574 = null;
        field4570 = null;
        if (arg0 > -39) {
            method1934(13);
        }
        field4575 = null;
    }
}
