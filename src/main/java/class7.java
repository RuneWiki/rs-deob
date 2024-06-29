import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class7 extends class531 {

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lrt;")
    public static class486 field62 = class98.method664(-77);

    @OriginalMember(owner = "client!db", name = "S", descriptor = "Z")
    public static boolean field64 = false;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "[I")
    public static int[] field66 = new int[1000];

    @OriginalMember(owner = "client!db", name = "V", descriptor = "F")
    public static float field67;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(III)Z")
    public static final boolean method29(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field67 = -0.56572735F;
        }
        field63++;
        return class71.method449(arg1, arg0, false) || class620.method3631(arg1, 55, arg0);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(CB)Z")
    public static final boolean method30(char arg0, byte arg1) {
        field61++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class235.method1502(arg0, (byte) -127)) {
            return true;
        } else {
            char[] var2 = class734.field10272;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var8 = var2[var3];
                if (arg0 == var8) {
                    return true;
                }
            }
            char[] var4 = class431.field5929;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var7 = var4[var5];
                if (arg0 == var7) {
                    return true;
                }
            }
            int var6 = -91 / ((arg1 + 34) / 45);
            return false;
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method31(int arg0) {
        field62 = null;
        field66 = null;
        if (arg0 != 0) {
            field66 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZILwu;)Lcw;")
    public static final class21 method32(boolean arg0, int arg1, class557 arg2) {
        field65++;
        if (arg0) {
            return null;
        }
        class21 var3 = (class21) class492.field6802.method3200((long) arg1, -19983);
        if (var3 == null) {
            if (class696.field9712) {
                var3 = class96.field1401.method2126(class320.method1861(arg2, arg1), true);
            } else {
                var3 = class407.method2482(8, arg2.method3318(8941, arg1));
            }
            class492.field6802.method3199((byte) 78, var3, (long) arg1);
        }
        return var3;
    }
}
