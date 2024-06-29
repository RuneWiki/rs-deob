import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class59 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lth;")
    public static class57 field866 = new class57(64);

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field870 = 0;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "[I")
    public static int[] field871;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILwi;)V", line = 4)
    public static final void method470(int arg0, class234 arg1) {
        field869++;
        for (int var2 = 0; var2 < class111.field1618.length; var2++) {
            class111.field1618[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) (Math.random() * 128.0D * (double) var3);
            class111.field1618[var5] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var3 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = (var7 << 7) + var8;
                    class214.field3124[var9] = (class111.field1618[var9 + 1] + class111.field1618[var9 - 1] + class111.field1618[var9 + -128] + class111.field1618[var9 + 128]) / 4;
                }
            }
            int[] var10 = class111.field1618;
            class111.field1618 = class214.field3124;
            class214.field3124 = var10;
        }
        int var11 = -115 % ((arg0 + 72) / 32);
        if (arg1 == null) {
            return;
        }
        int var12 = 0;
        for (int var13 = 0; var13 < arg1.field3716; var13++) {
            for (int var14 = 0; var14 < arg1.field3715; var14++) {
                if (arg1.field3528[var12++] != 0) {
                    int var15 = var14 - (-arg1.field3708 - 16);
                    int var16 = var13 + arg1.field3711 + 16;
                    int var17 = var15 + (var16 << 7);
                    class111.field1618[var17] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)V", line = 100)
    public static final void method471(int arg0, int arg1, int arg2) {
        class179.field2562 = true;
        class314.field4666 = arg0;
        class266.field4057 = arg1;
        class57.field843 = arg2;
        class336.field5235 = -1;
        class358.field5486 = -1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 109)
    public static final void method472(byte arg0) {
        if (arg0 > -117) {
            field866 = (class57) null;
        }
        class239.field3558.method462(24);
        field868++;
        class314.field4673.method462(24);
        class316.field4694.method462(24);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIII)V", line = 123)
    public static final void method473(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class184.field2644++;
            class107.field1533.method1915(true, 57);
        }
        if (arg2 == 1) {
            class107.field1533.method1915(true, 131);
            class127.field1853++;
        }
        if (arg0 != 20527) {
            field870 = 52;
        }
        field867++;
        class107.field1533.method1342(class272.field4123 + arg1, 128);
        class107.field1533.method1363((byte) 22, ++class214.field3088);
        class107.field1533.method1363((byte) 22, class236.field3549[82] ? 1 : 0);
        class107.field1533.method1342(arg3 + class202.field2968, 128);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 152)
    public static void method474(int arg0) {
        field871 = null;
        if (arg0 == -16) {
            field866 = null;
        }
    }
}
