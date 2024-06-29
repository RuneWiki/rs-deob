import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class433 {

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field6157 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[I")
    public static int[] field6158 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Z")
    public static boolean field6160 = false;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "[I")
    public static int[] field6159;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIIIIIIZ)Z", line = 6)
    public static final boolean method2534(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field6154++;
        int var9 = class472.field6622.field4675[0];
        int var10 = class472.field6622.field4674[0];
        if (var9 < 0 || class379.field5642 <= var9 || var10 < 0 || var10 >= class456.field6477) {
            return false;
        } else if (arg4 >= 0 && arg4 < class379.field5642 && arg0 >= 0 && class456.field6477 > arg0) {
            int var11 = class403.method2408(arg5, class472.field6622.method1705((byte) 65), var9, class302.field4494, arg3, class183.field2717[class472.field6622.field4545], arg0, class4.field87, arg4, (byte) -40, arg7, var10, arg6, arg8, arg2);
            int var12 = -9 % ((arg1 + 53) / 60);
            if (var11 < 1) {
                return false;
            }
            class37.field492 = class4.field87[var11 - 1];
            class106.field1483 = class302.field4494[var11 - 1];
            class105.field1482 = false;
            class228.method1482((byte) 92);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 42)
    public static final void method2535(int arg0, int arg1, int arg2, Class arg3) {
        class337 var4 = class170.field2427[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class448 var5 = var4.field5054; var5 != null; var5 = var5.field6340) {
            class305 var6 = var5.field6343;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4542 == arg1 && var6.field4547 == arg2) {
                class389.method2347(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 76)
    public static void method2536(int arg0) {
        field6159 = null;
        int var1 = 33 % ((arg0 - 62) / 47);
        field6158 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 89)
    public static final void method2537(byte arg0) {
        class299.field4466 = 0;
        field6155++;
        if (arg0 == 1) {
            for (int var1 = 0; var1 < 2048; var1++) {
                class98.field1400[var1] = null;
                class317.field4765[var1] = 1;
            }
        }
    }
}
