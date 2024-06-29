import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class368 {

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "Ldi;")
    public static class83 field5396 = new class83(49, 3);

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
    public static int[] field5397 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field5393;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIBIII)V", line = 5)
    public static final void method2217(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5395++;
        int var6 = arg0 - arg3;
        int var7 = arg1 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class382.method2269(arg5, arg1, arg4, (byte) 115, arg3);
            }
        } else if (var7 == 0) {
            class62.method509(-1266276916, arg0, arg4, arg5, arg3);
        } else if (arg2 == 114) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class424.field6204 > arg0) {
                var10 = class424.field6204;
                var11 = (class424.field6204 * var8 >> 12) + var9;
            } else if (class76.field1021 < arg0) {
                var10 = class76.field1021;
                var11 = (class76.field1021 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg0;
            }
            int var12;
            int var13;
            if (arg3 < class424.field6204) {
                var12 = var9 + (class424.field6204 * var8 >> 12);
                var13 = class424.field6204;
            } else if (arg3 > class76.field1021) {
                var12 = (class76.field1021 * var8 >> 12) + var9;
                var13 = class76.field1021;
            } else {
                var13 = arg3;
                var12 = arg4;
            }
            if (var11 < class417.field6057) {
                var11 = class417.field6057;
                var10 = (class417.field6057 - var9 << 12) / var8;
            } else if (var11 > class224.field3193) {
                var10 = (class224.field3193 - var9 << 12) / var8;
                var11 = class224.field3193;
            }
            if (var12 < class417.field6057) {
                var13 = (class417.field6057 - var9 << 12) / var8;
                var12 = class417.field6057;
            } else if (var12 > class224.field3193) {
                var13 = (class224.field3193 - var9 << 12) / var8;
                var12 = class224.field3193;
            }
            class298.method1747(var13, var11, arg5, true, var10, var12);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V", line = 108)
    public static final void method2218(int arg0) {
        field5394++;
        if (class404.field5937 == class181.field2670) {
            return;
        }
        try {
            class390.method2298("tbrefresh", class67.field921, (byte) 47);
        } catch (Throwable var2) {
        }
        int var1 = -94 / ((-arg0 - 33) / 41);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V", line = 129)
    public static void method2219(byte arg0) {
        if (arg0 == 21) {
            field5396 = null;
            field5397 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;)V", line = 143)
    public static final void method2220(int arg0, String arg1) {
        if (arg0 < 45) {
            method2219((byte) -123);
        }
        System.out.println("Error: " + class433.method2558("\n", arg1, (byte) -19, "%0a"));
        field5393++;
    }
}
