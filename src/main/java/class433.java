import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class433 {

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "Lid;")
    public static class388 field6280 = new class388();

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "Ljava/lang/String;")
    public static String field6283 = null;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "[I")
    public static int[] field6282 = new int[2];

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "F")
    public static float field6284;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZIIIIIIIII)Z", line = 4)
    public static final boolean method2575(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6281++;
        if (!class512.method2897(arg5, arg1, arg8, (byte) 68)) {
            return false;
        }
        int var10 = class520.field7297[0];
        int var11 = class520.field7297[1];
        int var12 = class520.field7297[2];
        if (!class512.method2897(arg2, arg9, arg7, (byte) 68)) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            int var13 = class520.field7297[1];
            int var14 = class520.field7297[0];
            int var15 = class520.field7297[2];
            if (class512.method2897(arg4, arg3, arg6, (byte) 68)) {
                int var16 = class520.field7297[1];
                int var17 = class520.field7297[0];
                int var18 = class520.field7297[2];
                return class379.method2353(var13, var15, var16, 124, var18, var11, var10, var12, var17, var14);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V", line = 36)
    public static final void method2576(boolean arg0) {
        class57.field938 = 0;
        field6278++;
        boolean var1 = class389.field5816.method3115(29871) == 1;
        int var2 = class389.field5816.method3116(-124);
        int var3 = class389.field5816.method3169(26488);
        int var4 = class389.field5816.method3115(29871);
        class684.method3832(0);
        class293.method1804(var4, (byte) 70);
        int var5 = (class297.field4376 - class389.field5816.field7956) / 16;
        class654.field9367 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class654.field9367[var6][var10] = class389.field5816.method3160(false);
            }
        }
        class221.field2933 = new int[var5];
        class108.field1609 = null;
        class476.field6823 = new byte[var5][];
        class246.field3253 = new byte[var5][];
        class480.field6863 = null;
        class505.field7147 = new int[var5];
        class443.field6438 = new int[var5];
        class372.field5505 = new int[var5];
        class299.field4396 = new int[var5];
        class51.field801 = new byte[var5][];
        class47.field751 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class72.field1144 >> 4)) / 8; var8 <= ((class72.field1144 >> 4) + var3) / 8; var8++) {
            for (int var9 = (var2 - (class668.field9444 >> 4)) / 8; var9 <= ((class668.field9444 >> 4) + var2) / 8; var9++) {
                class505.field7147[var7] = (var8 << 8) + var9;
                class221.field2933[var7] = class43.field625.method1819("m" + var8 + "_" + var9, (byte) 117);
                class372.field5505[var7] = class43.field625.method1819("l" + var8 + "_" + var9, (byte) 44);
                class299.field4396[var7] = class43.field625.method1819("um" + var8 + "_" + var9, (byte) 84);
                class443.field6438[var7] = class43.field625.method1819("ul" + var8 + "_" + var9, (byte) 50);
                var7++;
            }
        }
        if (!arg0) {
            method2575(true, 75, 72, 73, -64, -43, 73, -124, -51, -109);
        }
        class699.method3924(var2, 117, 11, var3, var1);
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V", line = 118)
    public static void method2577(boolean arg0) {
        field6280 = null;
        field6282 = null;
        if (arg0) {
            field6283 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 131)
    public static final void method2578(byte arg0) {
        field6279++;
        class380.field5721 = class624.field9024.field8759 + class624.field9024.field8749 + 2;
        class11.field276 = class141.field2042.field8749 + class141.field2042.field8759 + 2;
        class69.field1078 = new String[500];
        if (arg0 <= -51) {
            for (int var1 = 0; var1 < class69.field1078.length; var1++) {
                class69.field1078[var1] = "";
            }
            class600.method3415(class279.field3626.method1654(-124, class262.field3401), true);
        }
    }
}
