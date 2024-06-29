import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class493 {

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field7012 = -1;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field7014 = -1;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "D")
    public static double field7011 = -1.0D;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Ldg;")
    public static class376 field7008 = new class376(75, 3);

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7018 = null;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
    public static int[] field7016;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "[I")
    public int[] field7017;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "[Lhh;")
    public static class114[] field7010;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLmo;I)V")
    private final void method2857(byte arg0, class695 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7012 = arg1.method3847((byte) 118);
        } else if (arg2 == 2) {
            this.field7017 = new int[arg1.method3826(false)];
            for (int var4 = 0; var4 < this.field7017.length; var4++) {
                this.field7017[var4] = arg1.method3847((byte) 118);
            }
        } else if (arg2 == 3) {
            this.field7014 = arg1.method3826(false);
        }
        field7015++;
        if (arg0 > -107) {
            this.method2857((byte) 82, null, 94);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lmo;I)V")
    public final void method2858(class695 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                field7009++;
                if (arg1 != 20746) {
                    method2860(36);
                    return;
                }
                return;
            }
            this.method2857((byte) -116, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)V")
    public static final void method2859(int arg0, int arg1) {
        if (arg1 < 22) {
            method2861(true, null);
        }
        field7007++;
        if (class312.method1978(false, arg0)) {
            class129.method963(-1, -937900918, class181.field2558[arg0]);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2860(int arg0) {
        field7016 = null;
        field7008 = null;
        field7018 = null;
        field7010 = null;
        if (arg0 != 19984) {
            field7010 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZLmo;)Lnaa;")
    public static final class64 method2861(boolean arg0, class695 arg1) {
        field7013++;
        class31 var2 = class533.method3036(arg1, (byte) 122);
        int var3 = arg1.method3847((byte) 118);
        int var4 = arg1.method3847((byte) 118);
        int var5 = arg1.method3847((byte) 118);
        if (arg0) {
            field7008 = null;
        }
        int var6 = arg1.method3847((byte) 118);
        int var7 = arg1.method3847((byte) 118);
        int var8 = arg1.method3847((byte) 118);
        return new class64(var2.field485, var2.field479, var2.field489, var2.field481, var2.field487, var2.field480, var2.field482, var2.field484, var2.field477, var3, var4, var5, var6, var7, var8);
    }
}
