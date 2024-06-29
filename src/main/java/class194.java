import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class194 extends class154 {

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "J")
    public long field2957;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "[I")
    public static int[] field2959 = new int[1000];

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2964 = "Loaded wordpack";

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Ltd;")
    public static class225 field2960 = new class225(64);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method1224(byte arg0) {
        field2963++;
        class32.field477.method944(117);
        if (arg0 >= -47) {
            method1226(49, true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILjc;ILim;III)V")
    public static final void method1225(int arg0, class284 arg1, int arg2, class178 arg3, int arg4, int arg5, int arg6) {
        field2961++;
        if (arg1 == null) {
            return;
        }
        int var7;
        if (class12.field203 == 4) {
            var7 = (int) class123.field1743 & 0x7FF;
        } else {
            var7 = (int) class123.field1743 + class179.field2712 & 0x7FF;
        }
        int var8 = Math.max(arg3.field2529 / 2, arg3.field2571 / 2) + 10;
        int var9 = arg4 * arg4 + (arg2 * arg2);
        if ((var8 * var8) < var9) {
            return;
        }
        int var10 = -77 % ((arg6 + 40) / 63);
        int var11 = class118.field1697[var7];
        int var12 = class118.field1690[var7];
        if (class12.field203 != 4) {
            var12 = var12 * 256 / (class42.field627 + 256);
            var11 = var11 * 256 / (class42.field627 + 256);
        }
        int var13 = arg2 * var11 + (arg4 * var12) >> 16;
        int var14 = arg2 * var12 - arg4 * var11 >> 16;
        ((class74) arg1).method490(arg5 + (arg3.field2529 / 2) + var13 - arg1.field4559 / 2, arg3.field2571 / 2 + arg0 + -var14 - arg1.field4551 / 2, arg3.field2528, arg3.field2631);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)I")
    public static final int method1226(int arg0, boolean arg1) {
        if (arg1) {
            field2960 = null;
        }
        field2962++;
        class307 var2 = class218.method1425(arg0, (byte) -124);
        int var3 = var2.field4943;
        int var4 = var2.field4935;
        int var5 = var2.field4940;
        int var6 = class250.field3900[var4 - var5];
        return class189.field2864[var3] >> var5 & var6;
    }

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        class124.field1753 = null;
        class243.field3813 = null;
        class131.field1833 = null;
        class18.field313 = null;
        class109.field1551 = null;
        field2958++;
        if (arg0 != 2) {
            return;
        }
        class257.field4161 = null;
        class39.field588 = null;
        class16.field284 = null;
        class208.field3087 = null;
        class174.field2459 = null;
        class184.field2796 = null;
        class20.field328 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(J)V")
    public class194(long arg0) {
        this.field2957 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method1228(boolean arg0) {
        field2959 = null;
        field2960 = null;
        field2964 = null;
        if (arg0) {
            field2959 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZIB)Ljava/lang/String;")
    public static final String method1229(boolean arg0, int arg1, byte arg2) {
        if (arg2 >= -116) {
            method1226(-86, true);
        }
        field2956++;
        return arg0 && arg1 >= 0 ? class295.method1978(arg1, -11, arg0, 10) : Integer.toString(arg1);
    }
}
