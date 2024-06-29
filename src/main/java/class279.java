import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class279 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field4433 = new int[256];

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4435 = "glow1:";

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lfl;")
    public static class293 field4436 = new class293();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1863(int arg0) {
        field4436 = null;
        if (arg0 > 102) {
            field4433 = null;
            field4435 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method1864(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class272.field4341[var1] = false;
        }
        class9.field112 = -1;
        int var2 = 106 % ((arg0 - 20) / 45);
        class292.field4634 = 0;
        field4434++;
        class269.field4299 = 0;
        class283.field4513 = 5;
        class182.field2892 = -1;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1865(int arg0, String arg1, boolean arg2) {
        String var3 = arg1.toLowerCase();
        int var4 = 0;
        field4432++;
        short[] var5 = new short[16];
        for (int var6 = 0; var6 < class144.field2288; var6++) {
            class108 var9 = class256.method1753(-2, var6);
            if ((!arg2 || var9.field1461) && var9.field1489 == -1 && var9.field1456 == -1 && var9.field1494 == 0 && var9.field1504.toLowerCase().indexOf(var3) != -1) {
                if (var4 >= 250) {
                    class117.field1660 = null;
                    class150.field2347 = -1;
                    return;
                }
                if (var4 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var6;
            }
        }
        class105.field1412 = 0;
        class117.field1660 = var5;
        class150.field2347 = var4;
        String[] var7 = new String[class150.field2347];
        if (arg0 <= -65) {
            for (int var8 = 0; var8 < class150.field2347; var8++) {
                var7[var8] = class256.method1753(-2, var5[var8]).field1504;
            }
            class266.method1795((byte) -127, var7, class117.field1660);
        }
    }
}
