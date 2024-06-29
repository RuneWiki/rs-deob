import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class165 extends class194 {

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "Lqk;")
    public class207 field2921;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field2915 = -1;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lqk;")
    private static class207 field2914 = class24.method212(255, "Connected to update server");

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Lqk;")
    public static class207 field2913 = class24.method212(255, "Benutzen");

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lqk;")
    public static class207 field2916 = class24.method212(255, "ul");

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "Lqk;")
    public static class207 field2919 = field2914;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "[Z")
    public static boolean[] field2920 = new boolean[112];

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lbf;")
    public static class199 field2917 = new class199(100);

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "Lqk;")
    public static class207 field2925 = class24.method212(255, "tremblement:");

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Luh;")
    public static class100 field2909;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lpk;")
    public static class99 field2910;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "[Z")
    public static boolean[] field2923;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)Lbg;")
    public static final class234 method1192(int arg0, int arg1) {
        field2912++;
        class234 var2 = (class234) class160.field2830.method1387((long) arg0, 126);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class88.field1592.method705(class285.method1935(arg0, 113), class110.method790(27528, arg0), -1);
        class234 var4 = new class234();
        var4.field4315 = arg0;
        if (var3 != null) {
            var4.method1676(100, new class149(var3));
        }
        if (arg1 > -96) {
            method1196(false, -4, (class99) null);
        }
        class160.field2830.method1385((long) arg0, var4, (byte) -123);
        return var4;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIBI)V")
    public static final void method1193(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field2908++;
        if (class134.field2325 < 100) {
            class242.method1708(70);
        }
        class23.method164(arg0, arg2, arg0 + arg4, arg1 + arg2);
        if (class134.field2325 < 100) {
            byte var5 = 20;
            int var6 = arg0 + (arg4 / 2);
            int var7 = arg1 / 2 + arg2 - var5 - 18;
            class23.method167(arg0, arg2, arg4, arg1, 0);
            class23.method166(var6 - 152, var7, 304, 34, 9179409);
            class23.method166(var6 - 151, var7 + 1, 302, 32, 0);
            class23.method167(var6 - 150, var7 + 2, class134.field2325 * 3, 30, 9179409);
            class23.method167(class134.field2325 * 3 + var6 - 150, var7 + 2, 300 - (class134.field2325 * 3), 30, 0);
            class284.field4996.method1600(class9.field119, var6, var5 + var7, 16777215, -1);
            return;
        }
        class230.field4219 = (int) ((float) (arg4 * 2) / class12.field170);
        class190.field3354 = (int) ((float) (arg1 * 2) / class12.field170);
        class21.field351 = class276.field4842 - (int) ((float) arg4 / class12.field170);
        int var8 = class39.field786 - (int) ((float) arg1 / class12.field170);
        int var9 = class276.field4842 - ((int) ((float) arg4 / class12.field170));
        if (arg3 >= -81) {
            return;
        }
        int var10 = (int) ((float) arg4 / class12.field170) + class276.field4842;
        int var11 = (int) ((float) arg1 / class12.field170) + class39.field786;
        class12.field168 = class39.field786 - ((int) ((float) arg1 / class12.field170));
        class269.method1840(var9, var11, false, arg0 + arg4, arg0, var10, arg1 + arg2, var8, arg2);
        class33.method250(arg1 + arg2, arg2, arg0, arg0 + arg4, var11, var10, var8, var9, -15488);
        class121.method862(arg0 + arg4, 2, arg0, var8, arg2, var9, arg1 + arg2, var11, var10);
        if (class78.field1430 > 0) {
            class26.field535--;
            if (class26.field535 == 0) {
                class78.field1430--;
                class26.field535 = 20;
            }
        }
        if (!class31.field633) {
            return;
        }
        int var12 = arg0 + arg4 - 5;
        int var13 = arg2 - (8 - arg1);
        class176.field3183.method1594(class105.method757(false, new class207[] { class214.field3794, class262.method1815(class8.field110, (byte) 93) }), var12, var13, 16776960, -1);
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var17 = var13 - 15;
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class176.field3183.method1594(class105.method757(false, new class207[] { class267.field4725, class262.method1815(var15, (byte) -106), class183.field3265 }), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IILpk;I)[Lbl;")
    public static final class33[] method1194(int arg0, int arg1, class99 arg2, int arg3) {
        field2918++;
        if (class78.method594(arg0, arg2, 120, arg3)) {
            if (arg1 != 15) {
                field2925 = null;
            }
            return class193.method1342(arg1 - 143);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V")
    public static void method1195(int arg0) {
        field2920 = null;
        field2914 = null;
        field2919 = null;
        field2925 = null;
        field2913 = null;
        field2909 = null;
        field2923 = null;
        field2910 = null;
        if (arg0 != 34) {
            field2925 = null;
        }
        field2917 = null;
        field2916 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZILpk;)[Lob;")
    public static final class130[] method1196(boolean arg0, int arg1, class99 arg2) {
        if (arg0) {
            field2917 = null;
        }
        field2922++;
        return class135.method943(arg1, arg2, 2) ? class245.method1724((byte) 33) : null;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class165() {
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lqk;)V")
    public class165(class207 arg0) {
        this.field2921 = arg0;
    }
}
