import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class195 {

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "J")
    public long field3157 = 0L;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "[I")
    public static int[] field3160 = new int[] { 0, 0, 6, 0, 2, 0, 0, 0, 0, 0, 0, 0, 8, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 6, 11, 0, 0, 20, 0, 0, 0, 9, 0, 0, 0, 6, 14, -2, 3, 0, 10, -2, 0, 0, -1, 28, 17, 7, 6, 6, 0, 0, 0, 14, 10, 0, -2, -2, 5, 0, 0, 3, 8, 7, 5, 0, 2, 0, 0, 0, -2, -1, 0, 0, 0, 0, 0, 3, 4, 0, 5, 0, 7, -2, 3, 0, 0, -1, 0, 0, 0, 0, 6, 0, 0, 1, 5, 0, 8, -1, 0, 0, 3, 0, 0, 12, 6, 0, -1, 0, 0, -1, 0, 0, 4, 0, 0, 7, 0, -1, 3, -2, 0, 0, 0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1, 0, 12, -2, 0, 0, 15, 0, 0, 0, 0, 3, 0, 0, 8, 0, 0, 3, 8, -1, 0, 0, 6, -2, 8, 0, 0, 0, 0, 0, 12, -1, 6, 0, 0, 1, 8, 2, 0, 0, 0, 0, 0, 2, 0, 0, -1, 0, 0, 1, 0, 4, 0, -2, 0, 0, 0, 0, 6, 0, 10, 8, -1, 0, 0, 0, 0, 0, 0, 1, 8, 15, 0, 10, -2, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 12, 0, -2, 0, -1, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "Z")
    public static boolean field3161 = true;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Lli;")
    public class197 field3149;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lli;")
    public class197 field3159;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "[Ljg;")
    public static class271[] field3158;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)I")
    public static final int method1321(boolean arg0) {
        field3155++;
        if (!arg0) {
            method1323((byte) -13);
        }
        return 0;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V")
    public static final void method1322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (arg4 - 32) * arg4 / arg0;
        field3150++;
        class55.field779[arg1].method533(arg2, arg3);
        class55.field779[1].method533(arg2, arg3 + arg4 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg4 - var6 - 32) * arg5 / (arg0 - arg4);
        class63.method507(arg2, arg3 + 16, 16, arg4 - 32, class250.field3998);
        class63.method507(arg2, var7 + arg3 + 16, 16, var6, class240.field3845);
        class63.method489(arg2, arg3 - (-var7 - 16), var6, class86.field1176);
        class63.method489(arg2 + 1, var7 + 16 + arg3, var6, class86.field1176);
        class63.method501(arg2, arg3 - (-var7 - 16), 16, class86.field1176);
        class63.method501(arg2, arg3 + var7 + 17, 16, class86.field1176);
        class63.method489(arg2 + 15, arg3 + 16 - -var7, var6, class199.field3209);
        class63.method489(arg2 + 14, arg3 + 17 + var7, var6 - 1, class199.field3209);
        class63.method501(arg2, arg3 + var7 + var6 + 15, 16, class199.field3209);
        class63.method501(arg2 + 1, 14 - -var7 - -var6 + arg3, 15, class199.field3209);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method1323(byte arg0) {
        field3158 = null;
        if (arg0 < 58) {
            field3158 = null;
        }
        field3160 = null;
    }
}
