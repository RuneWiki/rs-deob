import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class474 {

    @OriginalMember(owner = "client!uca", name = "e", descriptor = "Lvg;")
    private class49 field7022 = new class49(64);

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "Lri;")
    private class97 field7019;

    @OriginalMember(owner = "client!uca", name = "d", descriptor = "D")
    public static double field7021 = -1.0D;

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "I")
    public static int field7024;

    @OriginalMember(owner = "client!uca", name = "i", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "Lqk;")
    public static class16 field7018;

    @OriginalMember(owner = "client!uca", name = "h", descriptor = "Lrs;")
    public static class605 field7025;

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "[I")
    public static int[] field7020;

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(B)V")
    public static void method2941(byte arg0) {
        field7020 = null;
        if (arg0 > -26) {
            field7021 = -0.04536678407696282D;
        }
        field7018 = null;
        field7025 = null;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(BI)Lkk;")
    public final class175 method2942(byte arg0, int arg1) {
        field7026++;
        class49 var3 = this.field7022;
        class175 var4;
        synchronized (this.field7022) {
            var4 = (class175) this.field7022.method560(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field7019;
        byte[] var6;
        synchronized (this.field7019) {
            var6 = this.field7019.method926(5, -128, arg1);
        }
        class175 var7 = new class175();
        if (var6 != null) {
            var7.method1423((byte) -105, new class6(var6));
        }
        class49 var8 = this.field7022;
        synchronized (this.field7022) {
            this.field7022.method559(var7, (long) arg1, 0);
        }
        if (arg0 != -58) {
            method2943(null, 33, -91, 31, 69, 88, -1.7838728F, 45, 97, -0.41337538F, 112);
        }
        return var7;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "([FIIIIIFIIFI)V")
    public static final void method2943(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        int var11 = arg4 - arg7;
        int var12 = arg10 - arg2;
        int var13 = arg1 - arg3;
        field7023++;
        float var14 = arg0[arg8] * (float) var11 + arg0[1] * (float) var12 + arg0[0] * (float) var13;
        float var15 = arg0[5] * (float) var11 + arg0[4] * (float) var12 + arg0[3] * (float) var13;
        float var16 = arg0[8] * (float) var11 + arg0[7] * (float) var12 + arg0[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        float var18 = var15 + arg9 + 0.5F;
        if (arg5 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg5 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg5 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class173.field2869 = var17;
        class647.field9082 = var18;
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2944(int arg0, String arg1) {
        if (arg0 != 8) {
            return null;
        }
        field7024++;
        String var2 = null;
        int var3 = arg1.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg1.substring(0, var3 + 4);
            arg1 = arg1.substring(var3 + 4);
        }
        if (arg1.startsWith("directlogin ")) {
            int var4 = arg1.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg1.length();
                arg1 = arg1.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg1 = arg1 + "*";
                }
            }
        }
        return var2 == null ? arg1 : var2 + arg1;
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class474(class162 arg0, int arg1, class97 arg2) {
        this.field7019 = arg2;
        this.field7019.method949(5, 0);
    }
}
