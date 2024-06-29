import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class125 {

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
    public int[] field2971 = new int[1];

    @OriginalMember(owner = "client!se", name = "G", descriptor = "[I")
    public int[] field2975 = new int[] { -1 };

    @OriginalMember(owner = "client!se", name = "t", descriptor = "Lod;")
    private static class101 field2962 = class46.method335(-71, "You can(Wt add yourself to your own ignore list");

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lod;")
    private static class101 field2957 = class46.method335(-127, " is already on your ignore list");

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Lod;")
    public static class101 field2959 = class46.method335(121, "mapedge");

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Lod;")
    private static class101 field2958 = class46.method335(72, "Please try again)3");

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lod;")
    public static class101 field2966 = class46.method335(120, "Angreifen");

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lod;")
    public static class101 field2963 = field2962;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "Lod;")
    public static class101 field2967 = class46.method335(91, "Registrierter Benutzer");

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Lod;")
    public static class101 field2961 = field2957;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "Lod;")
    public static class101 field2974 = class46.method335(115, "leuchten2:");

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lod;")
    public static class101 field2972 = field2958;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!se", name = "B", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lrd;")
    public static class122 field2956;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Lt;")
    public static class132 field2960;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1001(boolean arg0) {
        field2963 = null;
        field2958 = null;
        field2962 = null;
        if (arg0) {
            method1003(35, 112, -25, -40);
        }
        field2960 = null;
        field2972 = null;
        field2959 = null;
        field2974 = null;
        field2967 = null;
        field2957 = null;
        field2966 = null;
        field2956 = null;
        field2961 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public static final void method1002(int arg0, int arg1, int arg2) {
        if (class80.field1693 != 0 && arg1 != -1) {
            class7.method33(arg1, 0, (byte) -85, false, class97.field2103, class80.field1693);
            class155.field3569 = true;
        }
        if (arg2 != 25095) {
            method1004(111, -54, -53);
        }
        field2970++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII)I")
    public static final int method1003(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 / arg2;
        field2964++;
        int var5 = arg1 / arg2;
        int var6 = arg0 + arg2 & arg3;
        int var7 = class54.method388(var4, 255, var5);
        int var8 = arg1 & arg2 - 1;
        int var9 = class54.method388(var4 + 1, 255, var5);
        int var10 = class54.method388(var4, 255, var5 + 1);
        int var11 = class54.method388(var4 + 1, 255, var5 + 1);
        int var12 = class127.method984(var7, var9, arg0, arg2, var6);
        int var13 = class127.method984(var10, var11, -1, arg2, var6);
        return class127.method984(var12, var13, -1, arg2, var8);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)I")
    public static final int method1004(int arg0, int arg1, int arg2) {
        field2968++;
        class130 var3 = (class130) class93.field1999.method1141((long) arg2, arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2971.length; var5++) {
                if (var3.field2975[var5] == arg0) {
                    var4 += var3.field2971[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lc;B)V")
    public static final void method1005(class15 arg0, byte arg1) {
        if (arg1 == -109) {
            field2969++;
            class39.field939 = arg0;
        }
    }
}
