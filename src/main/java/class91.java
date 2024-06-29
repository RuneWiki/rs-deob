import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 extends class51 {

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    private int field1814 = 4096;

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Led;")
    public static class43 field1812 = class191.method1219("sl_flags", false);

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "Led;")
    public static class43 field1810 = class191.method1219("<)4col> x", false);

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "[I")
    public static int[] field1809;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static void method588(int arg0) {
        if (arg0 != -1162) {
            method588(-40);
        }
        field1812 = null;
        field1809 = null;
        field1810 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILob;IIIIII)V")
    public static final void method589(int arg0, class129 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (!class95.field1866) {
            class193.field3772 = 0;
        } else {
            class193.field3772 = 32;
        }
        if (arg2 == 32) {
            class95.field1866 = false;
            ++field1811;
            if (class21.field357 != 0) {
                if (~arg6 <= ~arg4 && arg6 < arg4 + 16 && ~arg3 <= ~arg5 && ~arg3 > ~(arg5 - -16)) {
                    arg1.field2680 -= 4;
                    class43.method265(false, arg1);
                } else if (~arg6 <= ~arg4 && ~(arg4 + 16) < ~arg6 && ~(arg5 + -16 + arg7) >= ~arg3 && ~arg3 > ~(arg5 + arg7)) {
                    arg1.field2680 += 4;
                    class43.method265(false, arg1);
                } else if (arg6 >= -class193.field3772 + arg4 && ~(arg4 + 16 - -class193.field3772) < ~arg6 && ~arg3 <= ~(arg5 + 16) && ~arg3 > ~(arg7 - 16 + arg5)) {
                    int var8 = (arg7 + -32) * arg7 / arg0;
                    if (var8 < 8) {
                        var8 = 8;
                    }
                    int var9 = -arg5 + -16 + -(var8 / 2) + arg3;
                    int var10 = arg7 + -32 + -var8;
                    arg1.field2680 = (arg0 - arg7) * var9 / var10;
                    class43.method265(false, arg1);
                    class95.field1866 = true;
                }
            }
            if (class154.field3135 != 0) {
                int var11 = arg1.field2656;
                if (-var11 + arg4 <= arg6 && arg5 <= arg3 && arg6 < arg4 + 16 && arg5 - -arg7 >= arg3) {
                    arg1.field2680 += class154.field3135 * 45;
                    class43.method265(false, arg1);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field1813;
        if (arg1 == arg2) {
            this.field1814 = arg0.method555(-1113627096);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg0 != 16) {
            return null;
        } else {
            ++field1808;
            int[] var3 = super.field1025.method39(arg1, (byte) 39);
            if (super.field1025.field154) {
                int[] var4 = this.method314(0, (byte) -72, arg1 - 1 & class71.field1407);
                int[] var5 = this.method314(0, (byte) -102, arg1);
                int[] var6 = this.method314(0, (byte) -37, class71.field1407 & arg1 - -1);
                for (int var7 = 0; ~var7 > ~class122.field2442; ++var7) {
                    int var8 = (var6[var7] + -var4[var7]) * this.field1814;
                    int var9 = (var5[var7 + 1 & class108.field2080] + -var5[var7 + -1 & class108.field2080]) * this.field1814;
                    int var10 = var9 >> 12;
                    int var11 = var8 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 + var13 - -4096) / 4096)));
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class91() {
        super(1, true);
    }
}
