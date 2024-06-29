import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class394 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[Z")
    public static boolean[] field5441 = new boolean[5];

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field5444 = 0;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Ltc;")
    public static class332 field5440;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lrp;")
    public static class419 field5437;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lis;")
    public static class65 field5438;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[Z")
    public static boolean[] field5443;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 3)
    public static void method2382(int arg0) {
        field5440 = null;
        field5438 = null;
        field5441 = null;
        field5443 = null;
        if (arg0 != -1) {
            method2384((byte) 98);
        }
        field5437 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)[B", line = 21)
    public static final synchronized byte[] method2383(boolean arg0, int arg1) {
        field5436++;
        if (arg1 == 100 && class190.field2859 > 0) {
            byte[] var2 = class106.field1493[--class190.field2859];
            class106.field1493[class190.field2859] = null;
            return var2;
        } else if (arg1 == 5000 && class279.field4014 > 0) {
            byte[] var3 = class261.field3747[--class279.field4014];
            class261.field3747[class279.field4014] = null;
            return var3;
        } else {
            if (arg0) {
                method2382(-117);
            }
            if (arg1 == 30000 && class423.field5854 > 0) {
                byte[] var4 = class266.field3836[--class423.field5854];
                class266.field3836[class423.field5854] = null;
                return var4;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 65)
    public static final void method2384(byte arg0) {
        field5439++;
        int var1 = class342.field4720.length;
        if (arg0 != -37) {
            field5437 = null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class342.field4720[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class280.field4027; var4++) {
                    if (class486.field6887[var2] == class41.field551[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class41.field551[class280.field4027] = class486.field6887[var2];
                    var3 = class280.field4027++;
                }
                class161 var5 = new class161(class342.field4720[var2]);
                int var6 = 0;
                while (var5.field2298 < class342.field4720[var2].length && var6 < 511 && class24.field257 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1134(-16848);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class486.field6887[var2] >> 8) * 64 + var10 - class279.field4012;
                    int var13 = (class486.field6887[var2] & 0xFF) * 64 + var11 - class189.field2810;
                    class37 var14 = class363.field5001.method1997(var5.method1134(-16848), 24749);
                    if (class163.field2377[var7] == null && (var14.field404 & 0x1) > 0 && class259.field3691 == var9 && var12 >= 0 && class36.field388 > var14.field400 + var12 && var13 >= 0 && class68.field998 > (var14.field400 + var13)) {
                        class163.field2377[var7] = new class361();
                        class163.field2377[var7].field5751 = var7;
                        class361 var15 = class163.field2377[var7];
                        class193.field2873[class24.field257++] = var7;
                        var15.field5762 = class364.field5010;
                        var15.method2224((byte) 17, var14);
                        var15.method2501(false, var15.field4952.field400);
                        var15.field5780 = var15.field4952.field426 << 3;
                        if (var15.field5780 == 0) {
                            var15.method2499((byte) -29, 0);
                        } else {
                            var15.method2499((byte) -29, var15.field4952.field438 + 4 << 11 & 0x3A85);
                        }
                        var15.method2216(var15.method245(4452), arg0 - 18015, var13, var12, var9, true);
                    }
                }
            }
        }
    }
}
