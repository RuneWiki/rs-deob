import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class82 extends class89 {

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Lda;")
    public static class275 field1332 = class255.method1672(113, "lila:");

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "Lne;")
    public static class137 field1331 = new class137(50);

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "Lda;")
    private static class275 field1338 = class255.method1672(92, "Please remove ");

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "Lda;")
    public static class275 field1339 = field1338;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "Lda;")
    public static class275 field1340 = field1338;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIILak;IJZ)Z")
    public static final boolean method533(int arg0, int arg1, int arg2, int arg3, int arg4, class234 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class231.method1499(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "(I)V")
    public static void method534(int arg0) {
        field1339 = null;
        field1331 = null;
        field1340 = null;
        field1332 = null;
        if (arg0 >= -105) {
            method533(-79, -67, -7, -31, -56, (class234) null, 89, -75L, false);
        }
        field1338 = null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)V")
    public static final void method535(int arg0, int arg1) {
        ++field1336;
        if (class124.field2218 == null || ~arg0 < ~class124.field2218.length) {
            class124.field2218 = new int[arg0];
        }
        if (arg1 != 1152) {
            field1338 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field1334;
        int[] var3 = super.field1503.method229(arg0, (byte) -79);
        if (arg1) {
            field1337 = 29;
        }
        if (super.field1503.field664) {
            class154.method1090(var3, 0, class65.field1070, class91.field1552[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method536(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        ++field1335;
        if (class267.method1755(0, arg1)) {
            class153.field2685 = null;
            class89.method652(arg7, arg3, class173.field3005[arg1], arg4, arg8, arg5, arg0, -1, arg2, -17446);
            if (class153.field2685 != null) {
                class89.method652(arg7, arg3, class153.field2685, class108.field1887, arg8, arg5, class167.field2906, -1412584499, arg2, -17446);
                class153.field2685 = null;
            }
            if (arg6 >= -20) {
                method533(113, 74, -119, 76, 44, (class234) null, 117, 124L, true);
            }
        } else if (arg5 != -1) {
            class200.field3418[arg5] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class200.field3418[var9] = true;
            }
        }
    }
}
