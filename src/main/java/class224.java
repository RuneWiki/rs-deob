import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class224 extends class13 {

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3193 = 100;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Les;")
    public static class259 field3195;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[I")
    public static int[] field3196;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BIII)V", line = 5)
    public static final void method1392(byte arg0, int arg1, int arg2, int arg3) {
        field3192++;
        if (class89.field1305 == null || arg0 >= -45) {
            return;
        }
        long var4 = (long) (arg1 << 28 | arg2 << 14 | arg3);
        class135 var6 = (class135) class36.field457.method1492(var4, 6340);
        if (var6 == null) {
            class376.method2242(arg1, arg3, arg2);
            return;
        }
        class440 var7 = (class440) var6.field1950.method2818((byte) 5);
        if (var7 == null) {
            class376.method2242(arg1, arg3, arg2);
            return;
        }
        class296 var8 = (class296) class376.method2242(arg1, arg3, arg2);
        if (var8 == null) {
            var8 = new class296();
        } else {
            var8.field4064 = var8.field4061 = -1;
        }
        var8.field4071 = var7.field6509;
        var8.field4070 = var7.field6507;
        label48: while (true) {
            class440 var9 = (class440) var6.field1950.method2820((byte) -58);
            if (var9 == null) {
                break;
            }
            if (var8.field4071 != var9.field6509) {
                var8.field4065 = var9.field6507;
                var8.field4064 = var9.field6509;
                while (true) {
                    class440 var10 = (class440) var6.field1950.method2820((byte) -58);
                    if (var10 == null) {
                        break label48;
                    }
                    if (var8.field4071 != var10.field6509 && var8.field4064 != var10.field6509) {
                        var8.field4067 = var10.field6507;
                        var8.field4061 = var10.field6509;
                    }
                }
            }
        }
        int var11 = class242.method1465(123, arg1, (arg2 << 7) + 64, (arg3 << 7) + 64);
        class258.method1558(arg1, arg3, arg2, var11, var8);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 86)
    public static final void method1393(int arg0, int arg1, int arg2, Class arg3) {
        class486 var4 = class89.field1305[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class164 var5 = var4.field7115; var5 != null; var5 = var5.field2467) {
            class116 var6 = var5.field2468;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1729 == arg1 && var6.field1730 == arg2) {
                class41.method349(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)V", line = 133)
    public static void method1394(int arg0) {
        field3196 = null;
        field3195 = null;
        if (arg0 >= -110) {
            field3194 = 83;
        }
    }
}
