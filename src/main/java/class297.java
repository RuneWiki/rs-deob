import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class297 {

    @OriginalMember(owner = "client!eo", name = "f", descriptor = "Ljt;")
    private class106 field4219 = new class106(256);

    @OriginalMember(owner = "client!eo", name = "i", descriptor = "Lwu;")
    private class373 field4222;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ld;")
    private class151 field4217;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!eo", name = "e", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!eo", name = "g", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!eo", name = "h", descriptor = "Z")
    public static boolean field4221;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "[J")
    public static long[] field4214;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V")
    public final void method1876(byte arg0) {
        if (arg0 != 116) {
            this.field4222 = null;
        }
        field4218++;
        this.field4219.method809(true);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)V")
    public final void method1877(int arg0) {
        field4220++;
        if (arg0 != 25410) {
            this.field4219 = null;
        }
        this.field4219.method807(5, -1);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)V")
    public static void method1878(boolean arg0) {
        field4214 = null;
        if (!arg0) {
            field4214 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(II)Lch;")
    public final class465 method1879(int arg0, int arg1) {
        field4215++;
        if (arg0 > -66) {
            field4221 = true;
        }
        Object var3 = this.field4219.method803(120, (long) arg1);
        if (var3 != null) {
            return (class465) var3;
        } else if (this.field4217.method1121(-30695, arg1)) {
            class293 var4 = this.field4217.method1124((byte) 92, arg1);
            int var5 = var4.field4174 ? 64 : this.field4222.field5567;
            class465 var7;
            if (var4.field4181 && this.field4222.method441()) {
                float[] var6 = this.field4217.method1122(16614, arg1, var5, var5, 0.7F, false);
                var7 = this.field4222.method2385(var5, var6, false, var4.field4180 != 0, var5, class752.field10511);
            } else {
                int[] var8;
                if (var4.field4192 != 2 && class412.method2618((byte) -113, var4.field4185)) {
                    var8 = this.field4217.method1123((byte) 113, 0.7F, true, arg1, var5, var5);
                } else {
                    var8 = this.field4217.method1126(false, arg1, (byte) 85, 0.7F, var5, var5);
                }
                var7 = this.field4222.method2358(76, var4.field4180 != 0, var5, var8, var5);
            }
            var7.method1272(var4.field4186, (byte) -99, var4.field4189);
            this.field4219.method801(1, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lsca;ILaa;IIILjava/lang/String;Lda;ILhia;BI)V")
    public static final void method1880(class46 arg0, int arg1, class488 arg2, int arg3, int arg4, int arg5, String arg6, class61 arg7, int arg8, class66 arg9, byte arg10, int arg11) {
        field4216++;
        int var12;
        if (class264.field3784 == 4) {
            var12 = (int) class255.field3659 & 0x3FFF;
        } else {
            var12 = (int) class255.field3659 + class748.field10464 & 0x3FFF;
        }
        int var13 = Math.max(arg0.field549 / 2, arg0.field574 / 2) + 10;
        int var14 = arg4 * arg4 + arg5 * arg5;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class373.field5548[var12];
        int var16 = class373.field5549[var12];
        if (class264.field3784 != 4) {
            var15 = var15 * 256 / (class305.field4322 + 256);
            var16 = var16 * 256 / (class305.field4322 + 256);
        }
        int var17 = arg4 * var16 + arg5 * var15 >> 14;
        int var18 = arg5 * var16 - (arg4 * var15) >> 14;
        if (arg10 != -58) {
            return;
        }
        int var19 = arg9.method583(100, null, 0, arg6);
        int var20 = var17 - var19 / 2;
        int var21 = arg9.method590(35, null, arg6, 100, 0);
        if (var20 >= (-arg0.field549) && var20 <= arg0.field549 && -arg0.field574 <= var18 && var18 <= arg0.field574) {
            arg7.method551(arg3, null, -1, arg0.field574 / 2 + arg3 - arg11 - var18 - var21, arg1, 0, arg2, 1, arg6, arg8, 0, 50, var19, arg0.field549 / 2 + var20 + arg8, 0, null);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Lwu;Ld;)V")
    public class297(class373 arg0, class151 arg1) {
        this.field4222 = arg0;
        this.field4217 = arg1;
    }
}
