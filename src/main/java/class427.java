import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class427 extends class138 {

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "[F")
    public static float[] field6135 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(ILsd;Lec;III)V")
    public class427(int arg0, class95 arg1, class236 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6137 = arg5;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)I")
    public static final int method2608(int arg0) {
        field6138++;
        if (arg0 != -30477) {
            field6135 = null;
        }
        return 16;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcea;I)Lvr;")
    public static final class138 method2609(class215 arg0, int arg1) {
        field6136++;
        int var2 = arg0.method1478(842397944);
        class95 var3 = class590.method3368(48)[arg0.method1535(255)];
        class236 var4 = class554.method3187(20000)[arg0.method1535(255)];
        if (arg1 <= 27) {
            method2609(null, -35);
        }
        int var5 = arg0.method1520(13638);
        int var6 = arg0.method1520(13638);
        return new class138(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        field6134++;
        if (arg0 <= 116) {
            method2610(false);
        }
        return class133.field2238;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method2610(boolean arg0) {
        if (!arg0) {
            field6135 = null;
        }
        field6135 = null;
    }
}
