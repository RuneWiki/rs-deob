import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class507 implements class351 {

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "Lgj;")
    private class662 field6971;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "Ljava/lang/String;")
    private String field6972;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "Z")
    public static boolean field6967 = false;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "[[B")
    public static byte[][] field6968 = new byte[50][];

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6965;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field6966;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6969;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6970;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)I")
    public final int method1501(byte arg0) {
        field6969++;
        if (arg0 != 5) {
            this.field6972 = null;
        }
        return this.field6971.method3747(this.field6972, -85) ? 100 : 0;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public static void method2894(int arg0) {
        field6968 = null;
        if (arg0 != -27940) {
            method2895(null, null, 63);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([[BLct;I)V")
    public static final void method2895(byte[][] arg0, class157 arg1, int arg2) {
        if (arg2 <= 63) {
            method2896(-14, -91, 90, 112, 100, -11, 28, -15, 68);
        }
        field6966++;
        int var3 = class1.field15.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class201.field3055[var4] >> 8) * 64 - class217.field3198;
                int var7 = (class201.field3055[var4] & 0xFF) * 64 - class400.field5510;
                class204.method1458(-17818);
                arg1.method1218(class95.field1472, var5, var6, var7, -99, class711.field9798);
            }
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg8 == -1343492568) {
            class18.field437[class3.field39++] = new class616(arg6, arg0, arg2, arg4, arg4, arg2, arg1, arg5, arg5, arg1, arg3, arg3, arg7, arg7);
            field6965++;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lgb;")
    public final class228 method1499(int arg0) {
        field6970++;
        return arg0 == 27291 ? class228.field3323 : null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lgj;Ljava/lang/String;)V")
    public class507(class662 arg0, String arg1) {
        this.field6971 = arg0;
        this.field6972 = arg1;
    }
}
