import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class189 {

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "Lma;")
    public static class5 field2958 = class12.method119("lila:", (byte) 117);

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Leb;")
    public static class253 field2959 = null;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "Lwj;")
    public static class153 field2952 = new class153(128);

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "Lma;")
    private static class5 field2963 = class12.method119("K", (byte) 98);

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "Lma;")
    public static class5 field2960 = field2963;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lma;")
    public static class5 field2962 = field2963;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field2961 = 1;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "[I")
    public static int[] field2964;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lni;I)V", line = 4)
    public static final void method1240(class202 arg0, int arg1) {
        class185.field2912 = arg0;
        field2953++;
        if (arg1 != 2) {
            method1241(-47);
        }
        class114.field1707 = class185.field2912.method1326((byte) -123, 16);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1241(int arg0) {
        field2955++;
        int var1 = arg0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class188.method1234(var3, class43.field646, var2, true, false, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V", line = 67)
    public static void method1242(byte arg0) {
        field2964 = null;
        field2963 = null;
        field2952 = null;
        field2959 = null;
        field2958 = null;
        if (arg0 != 66) {
            field2963 = (class5) null;
        }
        field2962 = null;
        field2960 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIBIILrj;Leb;)V", line = 88)
    public static final void method1243(int arg0, int arg1, byte arg2, int arg3, int arg4, class237 arg5, class253 arg6) {
        field2954++;
        if (arg5 == null) {
            return;
        }
        int var7 = class24.field416 + class14.field268 & 0x7FF;
        int var8 = arg0 * arg0 + arg3 * arg3;
        int var9 = Math.max(arg6.field4228 / 2, arg6.field4190 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class229.field3805[var7];
        int var11 = var10 * 256 / (class236.field3894 + 256);
        int var12 = class229.field3806[var7];
        int var13 = var12 * 256 / (class236.field3894 + 256);
        int var14 = arg0 * var13 - (arg3 * var11) >> 16;
        int var15 = arg0 * var11 + arg3 * var13 >> 16;
        if (arg2 == -113) {
            ((class109) arg5).method723(arg6.field4228 / 2 + arg1 - (-var15 - -(arg5.field3926 / 2)), arg4 - var14 + arg6.field4190 / 2 + -(arg5.field3913 / 2), (class109) arg6.method1774(arg2 + 65, false));
        }
    }
}
