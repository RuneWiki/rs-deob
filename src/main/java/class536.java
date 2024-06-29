import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class536 {

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lvs;")
    public static class425[] field7871 = new class425[14];

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "F")
    public static float field7870 = 1024.0F;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lba;")
    public static class268 field7867;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ZLba;I)V")
    public static final void method3166(String arg0, boolean arg1, class268 arg2, int arg3) {
        field7866++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class263.field3684.method562(null, 45, arg0, 250);
        if (arg3 != 2) {
            return;
        }
        int var8 = class263.field3684.method563(250, null, arg0, true) * 13;
        class400.field6090.method747(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - (-var4 + -var4), -16777216, 0);
        class400.field6090.method810(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg2.method1720(var8, 0, -1, arg0, null, 1, -1, -5594, var5, 1, null, var7, null, 0, var6, 0);
        class431.method2635(var4 + var4 + var7, (byte) 67, var5 - var4, var4 + var4 + var8, var6 - var4);
        if (arg1) {
            class400.field6090.method757();
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V")
    public static final void method3167(boolean arg0, int arg1) {
        field7869++;
        if (class86.method587(-110, arg1)) {
            class62.method442(-1, -121, class263.field3690[arg1]);
            if (arg0) {
                field7867 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    public static void method3168(byte arg0) {
        field7871 = null;
        field7867 = null;
        if (arg0 <= 24) {
            field7867 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BIIII)V")
    public static final void method3169(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -121 % ((arg0 - 54) / 51);
        field7868++;
        float var6 = (float) class12.field246 / (float) class12.field238;
        int var7 = arg3;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = arg2 - (arg3 - var7) / 2;
        int var10 = arg1 - (arg4 - var8) / 2;
        class376.field5712 = -1;
        class267.field3712 = class12.field238 * var9 / var7;
        class253.field3514 = class12.field246 - (class12.field246 * var10 / var8);
        class291.field4259 = -1;
        class194.method1311(0);
    }
}
