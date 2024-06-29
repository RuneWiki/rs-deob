import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class278 extends class217 {

    @OriginalMember(owner = "client!re", name = "o", descriptor = "[I")
    public int[] field4272 = new int[] { -1 };

    @OriginalMember(owner = "client!re", name = "q", descriptor = "[I")
    public int[] field4274 = new int[] { 0 };

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4265 = 0;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4268 = "green:";

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "Llb;")
    public static class211 field4267;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lui;")
    public static class266 field4273;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[Lob;")
    public static class292[] field4269;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1955(int arg0) {
        if (arg0 >= -61) {
            return;
        }
        field4270++;
        class126.field1997.method1433(30);
        class31.field397.method1433(30);
        class290.field4561.method1433(30);
        class170.field2534.method1433(30);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ZI)V", line = 23)
    public static final void method1956(boolean arg0, int arg1) {
        if (arg1 != -3318) {
            method1955(31);
        }
        byte[][] var2;
        byte var3;
        if (class36.field534 && arg0) {
            var2 = class86.field1259;
            var3 = 1;
        } else {
            var2 = class60.field892;
            var3 = 4;
        }
        field4271++;
        for (int var4 = 0; var4 < var3; var4++) {
            client.method1774(arg1 ^ 0xC98);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class176.field2636[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3A15BE3) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFA) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class324.field5049.length; var14++) {
                                if (class324.field5049[var14] == var13 && var2[var14] != null) {
                                    class288.method2036((var12 & 0x7) * 8, (var11 & 0x7) * 8, 124, var4, var2[var14], var9, var6 * 8, var10, class90.field1309, var5 * 8, arg0);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class242.method1674((byte) -126, var4, var6 * 8, var5 * 8, 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V", line = 118)
    public static void method1957(int arg0) {
        if (arg0 == 7) {
            field4273 = null;
            field4269 = null;
            field4268 = null;
            field4267 = null;
        }
    }
}
