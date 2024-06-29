import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class146 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "J")
    public long field2341 = 0L;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "Lck;")
    public static class119 field2339 = class298.method1987((byte) 55, "(U0a )2 in: ");

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lck;")
    private static class119 field2342 = class298.method1987((byte) 69, "glow3:");

    @OriginalMember(owner = "client!od", name = "o", descriptor = "Lck;")
    public static class119 field2350 = field2342;

    @OriginalMember(owner = "client!od", name = "n", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Lck;")
    public static class119 field2346 = class298.method1987((byte) 104, "Intel");

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field2343 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Lck;")
    public static class119 field2337 = field2342;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!od", name = "p", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lvc;")
    public class293 field2347;

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lvc;")
    public class293 field2348;

    @OriginalMember(owner = "client!od", name = "q", descriptor = "[[B")
    public static byte[][] field2352;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "()V", line = 7)
    public static final void method953() {
        for (int var0 = 0; var0 < class216.field3454; var0++) {
            class196 var1 = class87.field1326[var0];
            class142.method935(var1);
            class87.field1326[var0] = null;
        }
        class216.field3454 = 0;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLck;B)V", line = 23)
    public static final void method954(boolean arg0, class119 arg1, byte arg2) {
        class119 var3 = arg1.method779(false);
        int var4 = 0;
        short[] var5 = new short[16];
        field2336++;
        for (int var6 = 0; var6 < class106.field1637; var6++) {
            class262 var7 = class205.method1296((byte) -118, var6);
            if ((!arg0 || var7.field4206) && var7.field4199 == -1 && var7.field4265 == -1 && var7.field4227 == 0 && var7.field4212.method779(false).method788(1, var3) != -1) {
                if (var4 >= 250) {
                    class171.field2709 = null;
                    class179.field2854 = -1;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var8 = new short[var5.length * 2];
                    for (int var9 = 0; var9 < var4; var9++) {
                        var8[var9] = var5[var9];
                    }
                    var5 = var8;
                }
                var5[var4++] = (short) var6;
            }
        }
        class179.field2854 = var4;
        class171.field2709 = var5;
        class292.field4838 = 0;
        int var10 = -12 % ((arg2 - 13) / 47);
        class119[] var11 = new class119[class179.field2854];
        for (int var12 = 0; var12 < class179.field2854; var12++) {
            var11[var12] = class205.method1296((byte) -124, var5[var12]).field4212;
        }
        class184.method1169((byte) 109, class171.field2709, var11);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V", line = 125)
    public static void method955(boolean arg0) {
        field2352 = (byte[][]) null;
        field2342 = null;
        if (!arg0) {
            field2339 = null;
            field2337 = null;
            field2350 = null;
            field2346 = null;
        }
    }
}
