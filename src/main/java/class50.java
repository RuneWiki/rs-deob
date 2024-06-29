import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class50 {

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "Lhda;")
    public static class752 field636 = new class752(72, -2);

    @OriginalMember(owner = "client!aea", name = "b", descriptor = "I")
    public static int field637 = -1;

    @OriginalMember(owner = "client!aea", name = "c", descriptor = "[I")
    public static int[] field638 = new int[4096];

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "Z")
    public static boolean field641 = false;

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(Ljava/lang/String;IIII)V")
    public static final void method355(String arg0, int arg1, int arg2, int arg3, int arg4) {
        field640++;
        class672 var5 = class239.method1503(arg3, arg2, 0);
        if (var5 == null) {
            return;
        }
        if (var5.field9296 != null) {
            class309 var6 = new class309();
            var6.field4435 = var5;
            var6.field4445 = arg0;
            var6.field4439 = var5.field9296;
            var6.field4438 = arg4;
            class182.method1249(var6);
        }
        if (class15.field215 != 10 || !client.method1875(var5).method1348(arg1 + arg4, arg1 ^ 0xFFFFFFFC)) {
            return;
        }
        if (arg4 == 1) {
            class111.field1547++;
            class583 var7 = class381.method2246(1, class128.field2105, class29.field449);
            class502.method2831((byte) 30, var7, arg3, var5.field9318, arg2);
            class42.method309(var7, 0);
        }
        if (arg4 == 2) {
            class509.field6782++;
            class583 var8 = class381.method2246(arg1 ^ 0xFFFFFFFE, class128.field2105, class561.field7362);
            class502.method2831((byte) 30, var8, arg3, var5.field9318, arg2);
            class42.method309(var8, 0);
        }
        if (arg4 == 3) {
            class165.field2498++;
            class583 var9 = class381.method2246(arg1 + 2, class128.field2105, class239.field3371);
            class502.method2831((byte) 30, var9, arg3, var5.field9318, arg2);
            class42.method309(var9, 0);
        }
        if (arg4 == 4) {
            class283.field3998++;
            class583 var10 = class381.method2246(1, class128.field2105, class559.field7355);
            class502.method2831((byte) 30, var10, arg3, var5.field9318, arg2);
            class42.method309(var10, ~arg1);
        }
        if (arg4 == 5) {
            class230.field3275++;
            class583 var11 = class381.method2246(arg1 ^ 0xFFFFFFFE, class128.field2105, class384.field5378);
            class502.method2831((byte) 30, var11, arg3, var5.field9318, arg2);
            class42.method309(var11, 0);
        }
        if (arg4 == 6) {
            class446.field6125++;
            class583 var12 = class381.method2246(arg1 ^ 0xFFFFFFFE, class128.field2105, class717.field9874);
            class502.method2831((byte) 30, var12, arg3, var5.field9318, arg2);
            class42.method309(var12, 0);
        }
        if (arg4 == 7) {
            class105.field1437++;
            class583 var13 = class381.method2246(arg1 + 2, class128.field2105, class179.field2695);
            class502.method2831((byte) 30, var13, arg3, var5.field9318, arg2);
            class42.method309(var13, 0);
        }
        if (arg4 == 8) {
            class381.field5294++;
            class583 var14 = class381.method2246(1, class128.field2105, class371.field5169);
            class502.method2831((byte) 30, var14, arg3, var5.field9318, arg2);
            class42.method309(var14, 0);
        }
        if (arg4 == 9) {
            class176.field2651++;
            class583 var15 = class381.method2246(1, class128.field2105, class43.field570);
            class502.method2831((byte) 30, var15, arg3, var5.field9318, arg2);
            class42.method309(var15, 0);
        }
        if (arg4 == 10) {
            class537.field7069++;
            class583 var16 = class381.method2246(1, class128.field2105, class28.field445);
            class502.method2831((byte) 30, var16, arg3, var5.field9318, arg2);
            class42.method309(var16, 0);
        }
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(IIIIZ)I")
    public static final int method356(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            return -87;
        }
        field639++;
        int var5 = arg0 & 0xF;
        int var6 = var5 < 8 ? arg1 : arg3;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg1 : arg2) : arg3;
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public static void method357(int arg0) {
        if (arg0 == -11922) {
            field638 = null;
            field636 = null;
        }
    }
}
