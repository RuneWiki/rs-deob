import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qw")
public class class329 extends class631 {

    @OriginalMember(owner = "client!qw", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4416 = null;

    @OriginalMember(owner = "client!qw", name = "l", descriptor = "Leba;")
    public static class550 field4415 = new class550(115, 6);

    @OriginalMember(owner = "client!qw", name = "p", descriptor = "I")
    public static int field4419 = 0;

    @OriginalMember(owner = "client!qw", name = "t", descriptor = "I")
    public static int field4423 = 0;

    @OriginalMember(owner = "client!qw", name = "u", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!qw", name = "i", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!qw", name = "j", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!qw", name = "r", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!qw", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!qw", name = "n", descriptor = "Lir;")
    public class27 field4417;

    @OriginalMember(owner = "client!qw", name = "o", descriptor = "Lga;")
    public static class332 field4418;

    @OriginalMember(owner = "client!qw", name = "q", descriptor = "Lga;")
    public static class332 field4420;

    @OriginalMember(owner = "client!qw", name = "k", descriptor = "[Lbc;")
    public class667[] field4414;

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(FFF[BFLhc;IBIIIIFI)V", line = 3)
    public static final void method1912(float arg0, float arg1, float arg2, byte[] arg3, float arg4, class427 arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, int arg11, float arg12, int arg13) {
        field4412++;
        int var14 = arg6 * arg11;
        float[] var15 = new float[var14];
        if (arg7 != -7) {
            method1913(63, 77, 89);
        }
        for (int var16 = 0; var16 < arg13; var16++) {
            int var19 = arg10;
            arg5.method2417(var15, arg12 / (float) arg6, arg7 ^ 0xFFFFFFFE, arg8, arg2 / (float) arg9, arg9, arg11, arg6, arg1 / (float) arg11, 0, arg0 * 127.0F);
            arg12 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg3[var19] = (byte) ((int) ((float) arg3[var19] + var15[var20]));
                var19++;
            }
            arg0 *= arg4;
            arg2 *= 2.0F;
            arg1 *= 2.0F;
        }
        int var17 = arg10;
        for (int var18 = 0; var18 < var14; var18++) {
            arg3[var17] = (byte) (arg3[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(III)V", line = 57)
    public static final void method1913(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        if (var3 != null) {
            class454.method2557(var3.field2765);
            if (var3.field2765 != null) {
                var3.field2765 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)V", line = 67)
    public static void method1914(byte arg0) {
        field4416 = null;
        if (arg0 == 21) {
            field4415 = null;
            field4420 = null;
            field4418 = null;
        }
    }

    @OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lr;IZI)Z", line = 81)
    public final boolean method1915(class562 arg0, int arg1, boolean arg2, int arg3) {
        field4413++;
        if (this.field4414 != null) {
            for (int var5 = 0; var5 < this.field4414.length; var5++) {
                if (this.field4414[var5].method3796(arg3, arg1) && this.field4417.method167(arg2, arg0, arg1, arg3)) {
                    return true;
                }
            }
        }
        if (arg2) {
            field4424 = 40;
        }
        return false;
    }
}
