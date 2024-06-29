import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class641 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Z")
    public static boolean field9040 = false;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "[Z")
    public static boolean[] field9048 = new boolean[8];

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field9041;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9042;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field9043;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9044;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9046;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lmo;")
    public static class695 field9047;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Lf;")
    public static class702 field9045;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)Z")
    public static final boolean method3569(int arg0) {
        if (arg0 == 20844) {
            field9042++;
            return class340.field5002 > 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method3570(int arg0) {
        field9046++;
        if (class379.field5372 == class160.field2306) {
            return;
        }
        try {
            class556.method3150(-21295, class565.field7967, "tbrefresh");
            if (arg0 != -129) {
                field9040 = false;
            }
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method3571(byte arg0) {
        field9048 = null;
        field9045 = null;
        if (arg0 > -108) {
            method3572(49, 95, true, false, true);
        }
        field9047 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZZZ)V")
    public static final void method3572(int arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field9043++;
        class51.method578(arg1, 0, arg0, arg3, arg2, (byte) -46, class439.field6407.length - 1);
        class553.field7842 = null;
        if (!arg4) {
            field9040 = false;
        }
        class511.field7193 = 0;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lmo;I)Lpr;")
    public static final class410 method3573(class695 arg0, int arg1) {
        field9044++;
        String var2 = arg0.method3836(false);
        class109 var3 = class192.method1294(-11879)[arg0.method3826(false)];
        class630 var4 = class257.method1709(64)[arg0.method3826(false)];
        if (arg1 >= -58) {
            method3569(-125);
        }
        int var5 = arg0.method3814(false);
        int var6 = arg0.method3814(false);
        int var7 = arg0.method3826(false);
        int var8 = arg0.method3826(false);
        int var9 = arg0.method3826(false);
        int var10 = arg0.method3847((byte) 118);
        int var11 = arg0.method3847((byte) 118);
        int var12 = arg0.method3880(8);
        int var13 = arg0.method3880(8);
        int var14 = arg0.method3880(8);
        return new class410(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }
}
