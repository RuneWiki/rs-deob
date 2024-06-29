import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class521 extends class438 {

    @OriginalMember(owner = "client!kga", name = "X", descriptor = "I")
    public static int field6802 = 0;

    @OriginalMember(owner = "client!kga", name = "cb", descriptor = "I")
    public static int field6807 = 0;

    @OriginalMember(owner = "client!kga", name = "bb", descriptor = "[I")
    public static int[] field6806 = new int[4];

    @OriginalMember(owner = "client!kga", name = "W", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!kga", name = "Y", descriptor = "I")
    public static int field6803;

    @OriginalMember(owner = "client!kga", name = "Z", descriptor = "I")
    public static int field6804;

    @OriginalMember(owner = "client!kga", name = "ab", descriptor = "I")
    public static int field6805;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(ILji;I[BZIII)Lch;")
    public static final class219 method2798(int arg0, class622 arg1, int arg2, byte[] arg3, boolean arg4, int arg5, int arg6, int arg7) {
        ++field6801;
        if (arg2 != -13842) {
            method2799(-122, 31, -57);
        }
        if (!arg1.field8694 && (!class386.method2202(-76, arg5) || !class386.method2202(-98, arg7))) {
            return arg1.field8650 ? new class219(arg1, 34037, arg6, arg5, arg7, arg4, arg3, arg0) : new class219(arg1, arg6, arg5, arg7, class426.method2447(arg5, 250), class426.method2447(arg7, 250), arg3, arg0);
        } else {
            return new class219(arg1, 3553, arg6, arg5, arg7, arg4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(III)Z")
    public static final boolean method2799(int arg0, int arg1, int arg2) {
        if (arg2 > -69) {
            field6806 = null;
        }
        ++field6805;
        return class528.method2815(-111, arg1, arg0) | (458752 & arg1) != 0 || class575.method3086(arg0, (byte) 124, arg1);
    }

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "(I)V")
    public static void method2800(int arg0) {
        if (arg0 != -14429) {
            method2798(-24, (class622) null, -98, (byte[]) null, true, -68, 114, -118);
        }
        field6806 = null;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(IB)[[I")
    public final int[][] method107(int arg0, byte arg1) {
        ++field6804;
        int[][] var3 = super.field2467.method2466(arg0, 0);
        int var4 = -69 / ((arg1 - -14) / 34);
        if (super.field2467.field5565 && this.method2491(-1)) {
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int var8 = arg0 % super.field5669 * super.field5669;
            for (int var9 = 0; class561.field7319 > var9; ++var9) {
                int var10 = super.field5662[var9 % super.field5670 + var8];
                var7[var9] = class597.method3238(255, var10) << 4;
                var6[var9] = class597.method3238(4080, var10 >> 4);
                var5[var9] = class597.method3238(4080, var10 >> 12);
            }
        }
        return var3;
    }
}
