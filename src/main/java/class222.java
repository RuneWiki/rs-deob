import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class222 extends class425 {

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public volatile int field3182 = -1;

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "Ljava/lang/String;")
    public volatile String field3184;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field3181 = 0;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field3178 = 0;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "Ltj;")
    public static class108 field3179;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "[I")
    public static int[] field3177;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I")
    public static final int method1558(int arg0) {
        field3183++;
        int var1 = -50 % ((arg0 - 46) / 60);
        if (class327.field4749 == null) {
            if (!class359.field5185 && class381.field5412 > 0) {
                if (class56.field746 && class16.field247.method1758(-501, 81) && class381.field5412 > 2) {
                    return ((class382) class228.field3392.field6329.field6072.field6072).field5422;
                }
                return ((class382) class228.field3392.field6329.field6072).field5422;
            }
            int var2 = class270.field3949.method536(0);
            int var3 = class270.field3949.method543(7);
            int var4 = class129.field1832;
            int var5 = class352.field5116;
            int var6 = class264.field3882;
            if (var4 < var2 && (var4 + var6) > var2) {
                int var7 = -1;
                for (int var8 = 0; var8 < class381.field5412; var8++) {
                    if (class19.field253) {
                        int var12 = (class381.field5412 - var8 - 1) * 16 + (var5 + 33);
                        if (var12 - 13 < var3 && var3 <= (var12 + 3)) {
                            var7 = var8;
                        }
                    } else {
                        int var13 = var5 - (-(class381.field5412 - var8 - 1) * 16 - 31);
                        if (var13 - 13 < var3 && var13 + 3 >= var3) {
                            var7 = var8;
                        }
                    }
                }
                if (var7 != -1) {
                    int var9 = 0;
                    class189 var10 = new class189(class228.field3392);
                    for (class382 var11 = (class382) var10.method1354(-14082); var11 != null; var11 = (class382) var10.method1356(-28309)) {
                        if (var9++ == var7) {
                            return var11.field5422;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)V")
    public static void method1559(byte arg0) {
        if (arg0 == 49) {
            field3179 = null;
            field3177 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIBFZII)[[I")
    public static final int[][] method1560(int arg0, int arg1, int arg2, int arg3, byte arg4, float arg5, boolean arg6, int arg7, int arg8) {
        field3180++;
        int[][] var9 = new int[arg7][arg0];
        class32 var10 = new class32();
        var10.field394 = (int) (arg5 * 4096.0F);
        var10.field392 = arg2;
        var10.field410 = arg1;
        var10.field396 = arg6;
        var10.field402 = arg3;
        var10.method39((byte) -23);
        class397.method2492((byte) -43, arg0, arg7);
        if (arg4 <= 73) {
            method1559((byte) 62);
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            var10.method174(var11, (byte) 116, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class222(String arg0) {
        this.field3184 = arg0;
    }
}
