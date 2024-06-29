import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class187 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field2778;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    private int field2779;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field2783;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "[I")
    public static int[] field2785;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhc;IB)V")
    public final void method1334(class53 arg0, int arg1, byte arg2) {
        int var4 = -25 / ((arg2 + 7) / 48);
        field2776++;
        while (true) {
            int var5 = arg0.method366(-16505);
            if (var5 == 0) {
                return;
            }
            this.method1342(arg0, var5, arg1, -68);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static final void method1335(int arg0) {
        class34.field434++;
        field2777++;
        class144.field2338.method683(true, arg0);
        class144.field2338.method376(class182.field2727, false);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(CI)Z")
    public static final boolean method1336(char arg0, int arg1) {
        int var2 = 21 / ((-arg1 - 73) / 32);
        field2780++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1337(String arg0, byte arg1) {
        System.out.println("Error: " + class57.method403((byte) 65, arg0, "\n", "%0a"));
        field2788++;
        if (arg1 <= 43) {
            method1335(99);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public static final void method1338(int arg0, int arg1, int arg2, int arg3, int arg4) {
        float var5 = (float) class46.field620 / (float) class46.field619;
        class39.field521 = -1;
        class270.field4342 = -1;
        int var6 = arg0;
        field2784++;
        int var7 = arg4;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = arg1 - (arg4 - var7) / 2;
        int var9 = arg2 - (arg0 - var6) / 2;
        class121.field1989 = class46.field620 * var8 / var7;
        class30.field319 = class46.field619 * var9 / var6;
        if (arg3 <= 94) {
            field2785 = null;
        }
        class82.method619(-1);
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(I)V")
    public static final void method1339(int arg0) {
        class269.field4330.method1422((byte) -44);
        class289.field4618.method1422((byte) 110);
        field2787++;
        if (arg0 >= -84) {
            field2785 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)Lbc;")
    public final class148 method1340(boolean arg0) {
        field2781++;
        class148 var2 = (class148) class275.field4452.method1418((long) this.field2779, 0);
        if (var2 != null) {
            return var2;
        }
        class148 var3 = class302.method2059(class1.field20, 30858, 0, this.field2779);
        if (var3 != null) {
            class275.field4452.method1421((long) this.field2779, var3, (byte) 17);
        }
        return arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static void method1341(int arg0) {
        field2785 = null;
        if (arg0 != 0) {
            method1339(-42);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lhc;III)V")
    private final void method1342(class53 arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1) {
            this.field2779 = arg0.method331(-37);
        } else if (arg1 == 2) {
            this.field2778 = arg0.method366(-16505);
            this.field2783 = arg0.method366(-16505);
        }
        field2782++;
        int var5 = 93 / ((18 - arg3) / 59);
    }
}
