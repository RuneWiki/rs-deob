import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class187 extends Canvas {

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3039;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Lph;")
    public static class229 field3038 = class266.method1858(")4", 0);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "[Lrd;")
    public static class217[] field3035 = new class217[32768];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "[Z")
    public static boolean[] field3036 = new boolean[100];

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lph;")
    public static class229 field3043 = class266.method1858("Ausw-=hlen", 0);

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[Luf;")
    public static class186[] field3037 = new class186[6];

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public static int field3048 = -1;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "Lph;")
    public static class229 field3050 = class266.method1858("D-Bmarrage de la librairie 3D", 0);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lph;")
    private static class229 field3040 = class266.method1858("Loaded input handler", 0);

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field3052 = 0;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Lph;")
    public static class229 field3051 = field3040;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
    public static boolean field3046 = false;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "F")
    public static float field3041;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field3049;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lsl;")
    public static class283 field3053;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1312(boolean arg0) {
        field3036 = null;
        if (arg0) {
            return;
        }
        field3037 = null;
        field3051 = null;
        field3038 = null;
        field3050 = null;
        field3040 = null;
        field3035 = null;
        field3043 = null;
        field3053 = null;
    }

    @OriginalMember(owner = "client!e", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void paint(Graphics arg0) {
        this.field3039.paint(arg0);
        field3042++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIZI)V", line = 57)
    public static final void method1313(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3044++;
        if (!arg5) {
            method1315(67);
        }
        int var7 = class178.method1278(class214.field3533, arg3, -18842, class206.field3398);
        int var8 = class178.method1278(class214.field3533, arg6, -18842, class206.field3398);
        int var9 = class178.method1278(class77.field1289, arg0, -18842, class192.field3172);
        int var10 = class178.method1278(class77.field1289, arg1, -18842, class192.field3172);
        int var11 = class178.method1278(class214.field3533, arg3 + arg4, -18842, class206.field3398);
        int var12 = class178.method1278(class214.field3533, arg6 - arg4, -18842, class206.field3398);
        for (int var13 = var7; var13 < var11; var13++) {
            class193.method1354((byte) -37, var10, var9, arg2, class202.field3337[var13]);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class193.method1354((byte) -37, var10, var9, arg2, class202.field3337[var14]);
        }
        int var15 = class178.method1278(class77.field1289, arg0 + arg4, -18842, class192.field3172);
        int var16 = class178.method1278(class77.field1289, arg1 - arg4, -18842, class192.field3172);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class202.field3337[var17];
            class193.method1354((byte) -37, var15, var9, arg2, var18);
            class193.method1354((byte) -37, var10, var16, arg2, var18);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Lmj;", line = 121)
    public static final class162 method1314(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class162 var4 = var3.field1225;
            var3.field1225 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 133)
    public class187(Component arg0) {
        this.field3039 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 143)
    public final void update(Graphics arg0) {
        this.field3039.update(arg0);
        field3045++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 158)
    public static final void method1315(int arg0) {
        if (arg0 != 100) {
            method1313(74, -41, 60, 13, -36, true, -114);
        }
        field3049++;
        class254.field4238.method1414(109);
    }
}
