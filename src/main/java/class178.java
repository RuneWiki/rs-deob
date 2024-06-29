import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class178 {

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field2389 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "[B")
    public static byte[] field2387 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field2391;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIII)I")
    public static final int method1173(int arg0, int arg1, int arg2, int arg3) {
        field2388++;
        int var4 = arg2 / arg3;
        int var5 = arg3 - 1 & arg2;
        int var6 = arg1 / arg3;
        int var7 = arg3 - 1 & arg1;
        int var8 = class62.method552(var6, var4, (byte) -39);
        int var9 = class62.method552(var6, var4 - arg0, (byte) -39);
        int var10 = class62.method552(var6 + 1, var4, (byte) -39);
        int var11 = class62.method552(var6 + 1, var4 + 1, (byte) -39);
        int var12 = class20.method188(var9, var5, 117, var8, arg3);
        int var13 = class20.method188(var11, var5, 113, var10, arg3);
        return class20.method188(var13, var7, arg0 + 109, var12, arg3);
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLfb;)V")
    public final void method1174(byte arg0, class341 arg1) {
        field2392++;
        while (true) {
            int var3 = arg1.method2233((byte) 104);
            if (var3 == 0) {
                int var4 = 37 / ((-arg0 - 9) / 60);
                return;
            }
            this.method1175(var3, (byte) 125, arg1);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IBLfb;)V")
    private final void method1175(int arg0, byte arg1, class341 arg2) {
        field2393++;
        if (arg0 == 5) {
            this.field2389 = arg2.method2239(-1076227960);
        }
        if (arg1 <= 30) {
            field2391 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        if (arg0 > 126) {
            field2391 = null;
            field2387 = null;
        }
    }
}
