import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class169 extends class179 {

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "[B")
    public byte[] field2517;

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "[I")
    public static int[] field2514 = new int[50];

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "[I")
    public static int[] field2516 = new int[50];

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "[I")
    public static int[] field2521 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Z")
    public static boolean field2515;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;", line = 10)
    public static final String[] method1289(String arg0, char arg1, int arg2) {
        field2513++;
        int var3 = class393.method2502(0, arg1, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg1 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        if (arg2 != 26329) {
            method1291(123);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V", line = 47)
    public static final void method1290(int arg0) {
        class338.field4819 = null;
        if (arg0 == 1) {
            class126.field2041 = null;
            field2518++;
        }
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V", line = 59)
    public static void method1291(int arg0) {
        field2521 = null;
        if (arg0 < 108) {
            method1290(25);
        }
        field2514 = null;
        field2516 = null;
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)V", line = 77)
    public static final void method1292(byte arg0) {
        field2520++;
        if (class436.field6359 < 1024.0F) {
            class436.field6359 = 1024.0F;
        }
        while (class106.field1756 >= 16384.0F) {
            class106.field1756 -= 16384.0F;
        }
        if (class436.field6359 > 3072.0F) {
            class436.field6359 = 3072.0F;
        }
        while (class106.field1756 < 0.0F) {
            class106.field1756 += 16384.0F;
        }
        int var1 = class99.field1551 >> 7;
        int var2 = class392.field5729 >> 7;
        int var3 = class109.method957(class392.field5729, class99.field1551, class367.field5213, 20663);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class367.field5213;
                    if (var7 < 3 && class93.method783(var5, false, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class417.field6034 != null && class417.field6034[var7] != null) {
                        var8 = (class417.field6034[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + var8 - class50.field816[var7].method794(var5, var6);
                    if (var4 < var9) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = -41 % ((arg0 - 44) / 39);
        int var11 = var4 * 1536;
        if (var11 > 786432) {
            var11 = 786432;
        }
        if (var11 < 262144) {
            var11 = 262144;
        }
        if (class164.field2466 < var11) {
            class164.field2466 += (var11 - class164.field2466) / 24;
        } else if (var11 < class164.field2466) {
            class164.field2466 += (var11 - class164.field2466) / 80;
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V", line = 175)
    public class169(byte[] arg0) {
        this.field2517 = arg0;
    }
}
