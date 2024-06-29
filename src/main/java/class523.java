import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class523 extends class173 {

    @OriginalMember(owner = "client!va", name = "w", descriptor = "[F")
    public static float[] field6663 = new float[4];

    @OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
    public static int[] field6665 = new int[1000];

    @OriginalMember(owner = "client!va", name = "r", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public static int field6659;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field6660;

    @OriginalMember(owner = "client!va", name = "v", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "Lrda;")
    private class467 field6661;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
    public final String method2876(int arg0, String arg1, boolean arg2) {
        field6659++;
        if (this.field6661 == null) {
            return arg1;
        }
        class55 var4 = (class55) this.field6661.method2616((long) arg0, (byte) 13);
        if (arg2) {
            return var4 == null ? arg1 : var4.field715;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static void method2877(int arg0) {
        field6665 = null;
        field6663 = null;
        int var1 = 52 / ((-arg0 - 89) / 34);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZLmc;)V")
    private final void method2878(int arg0, boolean arg1, class234 arg2) {
        if (arg1) {
            this.method2878(25, true, null);
        }
        field6660++;
        if (arg0 != 249) {
            return;
        }
        int var4 = arg2.method1509(true);
        if (this.field6661 == null) {
            int var5 = class483.method2714(var4, (byte) -119);
            this.field6661 = new class467(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg2.method1509(true) == 1;
            int var8 = arg2.method1500((byte) -79);
            class337 var9;
            if (var7) {
                var9 = new class55(arg2.method1540((byte) -119));
            } else {
                var9 = new class405(arg2.method1497((byte) 61));
            }
            this.field6661.method2619(var9, (long) var8, -1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZLmc;)V")
    public final void method2879(boolean arg0, class234 arg1) {
        while (true) {
            int var3 = arg1.method1509(arg0);
            if (var3 == 0) {
                if (!arg0) {
                    return;
                }
                field6664++;
                return;
            }
            this.method2878(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(III)I")
    public final int method2880(int arg0, int arg1, int arg2) {
        field6662++;
        if (this.field6661 == null) {
            return arg0;
        } else {
            int var4 = -117 % ((arg1 + 56) / 48);
            class405 var5 = (class405) this.field6661.method2616((long) arg2, (byte) 63);
            return var5 == null ? arg0 : var5.field5378;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2881(int arg0, String[] arg1) {
        field6658++;
        String[] var2 = new String[5];
        int var3 = -4 / ((-arg0 - 6) / 57);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = var4 + ": ";
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = var2[var4] + arg1[var4];
            }
        }
        return var2;
    }
}
