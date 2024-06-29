import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 {

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Ljava/lang/String;")
    public String field1244;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method560(String arg0, int arg1, boolean arg2) {
        class215.field3080.field3348 = 1;
        field1243++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class228.field3223; var6++) {
            class193 var9 = class166.method1031(var6, false);
            if ((!arg2 || var9.field2715) && var9.field2706 == -1 && var9.field2697 == -1 && var9.field2678 == 0 && var9.field2729.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class128.field1697 = null;
                    class31.field528 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class31.field528 = var5;
        class128.field1697 = var4;
        class300.field4318 = 0;
        String[] var7 = new String[class31.field528];
        for (int var8 = 0; var8 < class31.field528; var8++) {
            var7[var8] = class166.method1031(var4[var8], false).field2729;
        }
        class80.method507(arg1, class128.field1697, var7);
        class215.field3080.method1464(false);
        class215.field3080.field3348 = 2;
    }
}
