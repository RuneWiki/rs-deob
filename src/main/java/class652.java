import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class652 extends class349 {

    @OriginalMember(owner = "client!jaa", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field9245 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!jaa", name = "H", descriptor = "I")
    public static int field9246 = 0;

    @OriginalMember(owner = "client!jaa", name = "B", descriptor = "Ljj;")
    public static class398 field9241 = new class398(23, 15);

    @OriginalMember(owner = "client!jaa", name = "J", descriptor = "Ltaa;")
    public static class72 field9248 = new class72();

    @OriginalMember(owner = "client!jaa", name = "D", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!jaa", name = "E", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!jaa", name = "F", descriptor = "I")
    public static int field9244;

    @OriginalMember(owner = "client!jaa", name = "I", descriptor = "I")
    public static int field9247;

    @OriginalMember(owner = "client!jaa", name = "K", descriptor = "Lfca;")
    public static class188 field9249;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        int var3 = -64 / ((56 - arg0) / 41);
        ++field9243;
        int[] var4 = super.field5109.method3088(arg1, (byte) 26);
        if (super.field5109.field7515) {
            int var5 = class54.field709[arg1];
            for (int var6 = 0; ~var6 > ~class39.field497; ++var6) {
                var4[var6] = this.method3617(var5, (byte) 18, class29.field283[var6]) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IIZZI)Lpq;")
    public static final class159 method3614(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        ++field9242;
        class403 var5 = null;
        if (arg1 != 22570) {
            field9249 = null;
        }
        if (class222.field2875 != null) {
            var5 = new class403(arg0, class222.field2875, class471.field6372[arg0], 1000000);
        }
        class352.field5145[arg0] = class240.field3147.method3394(class356.field5173, var5, arg0, arg1 + -22570);
        if (arg2) {
            class352.field5145[arg0].method1600(arg1 + -22568);
        }
        return new class159(class352.field5145[arg0], arg3, arg4);
    }

    @OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "()V")
    public class652() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jaa", name = "f", descriptor = "(I)V")
    public static void method3615(int arg0) {
        field9245 = null;
        field9248 = null;
        field9241 = null;
        if (arg0 != 0) {
            method3614(-89, 7, true, true, -32);
        }
        field9249 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(CI)Z")
    public static final boolean method3616(char arg0, int arg1) {
        if (arg1 != 23) {
            method3615(32);
        }
        ++field9244;
        if ((~arg0 >= -1 || arg0 >= 128) && (arg0 < 160 || ~arg0 < -256)) {
            if (~arg0 != -1) {
                char[] var2 = class274.field3712;
                for (int var3 = 0; var3 < var2.length; ++var3) {
                    char var4 = var2[var3];
                    if (~arg0 == ~var4) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IBI)I")
    private final int method3617(int arg0, byte arg1, int arg2) {
        ++field9247;
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg1 != 18) {
            field9249 = null;
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }
}
