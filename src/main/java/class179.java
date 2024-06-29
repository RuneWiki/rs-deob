import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class179 {

    @OriginalMember(owner = "client!up", name = "e", descriptor = "[I")
    public static int[] field2710 = new int[1];

    @OriginalMember(owner = "client!up", name = "a", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!up", name = "d", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(Z)Llu;")
    public static final class500 method1268(boolean arg0) {
        if (!arg0) {
            method1271(true, (byte) -79, 121);
        }
        field2708++;
        try {
            return (class500) Class.forName("di").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "([IIIII)V")
    public static final void method1269(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field2706++;
        arg2--;
        if (arg4 != 26985) {
            return;
        }
        int var8 = arg3 - 1;
        int var5 = var8 - 7;
        while (var5 > arg2) {
            int var6 = arg2 + 1;
            arg0[var6] = arg1;
            int var7 = var6 + 1;
            arg0[var7] = arg1;
            int var9 = var7 + 1;
            arg0[var9] = arg1;
            int var10 = var9 + 1;
            arg0[var10] = arg1;
            int var11 = var10 + 1;
            arg0[var11] = arg1;
            int var12 = var11 + 1;
            arg0[var12] = arg1;
            int var13 = var12 + 1;
            arg0[var13] = arg1;
            arg2 = var13 + 1;
            arg0[arg2] = arg1;
        }
        while (arg2 < var8) {
            arg2++;
            arg0[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(B)V")
    public static void method1270(byte arg0) {
        if (arg0 == -110) {
            field2710 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ZBI)I")
    public static final int method1271(boolean arg0, byte arg1, int arg2) {
        field2709++;
        if (arg1 <= 85) {
            field2710 = null;
        }
        if (arg0) {
            return 0;
        }
        class328 var3 = class475.method2847(arg2, arg0, (byte) 124);
        if (var3 == null) {
            return class237.field3429.method2281(arg2, (byte) 104).field2918;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field4957.length; var5++) {
            if (var3.field4957[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class237.field3429.method2281(arg2, (byte) 104).field2918 - var3.field4957.length);
    }
}
