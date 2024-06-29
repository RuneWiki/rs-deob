import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class21 extends class147 {

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "I")
    public int field295 = -1;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "Z")
    public boolean field297 = false;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public static int field293 = 1400;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "Lsd;")
    public static class74 field290 = new class74(84, 14);

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public int field296;

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public int field298;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
    public static void method133(boolean arg0) {
        if (!arg0) {
            field290 = null;
        }
        field290 = null;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ltb;Loj;I)I")
    public static final int method134(class112 arg0, class280 arg1, int arg2) {
        field291++;
        if (arg0.field1373 != -1) {
            return arg0.field1373;
        }
        if (arg0.field1366 != -1) {
            class189 var3 = arg1.field4073.method577(arg1.method1359() ? arg0.field1366 : arg0.field1378, -123);
            if (!var3.field2573) {
                return var3.field2587;
            }
        }
        if (arg2 < 107) {
            field293 = -39;
        }
        return arg0.field1375;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "([BI)Lih;")
    public static final class354 method135(byte[] arg0, int arg1) {
        field292++;
        class354 var2 = new class354();
        class179 var3 = new class179(arg0);
        var3.field2206 = var3.field2159.length - 2;
        int var4 = var3.method916(21933);
        int var5 = var3.field2159.length - var4 - 2 - 12;
        var3.field2206 = var5;
        int var6 = var3.method939((byte) 86);
        var2.field5073 = var3.method916(21933);
        int var7 = 56 % ((arg1 - 53) / 33);
        var2.field5082 = var3.method916(21933);
        var2.field5079 = var3.method916(21933);
        var2.field5080 = var3.method916(21933);
        int var8 = var3.method895((byte) -102);
        if (var8 > 0) {
            var2.field5076 = new class45[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var3.method916(21933);
                class45 var11 = new class45(class93.method459(-719824240, var10));
                var2.field5076[var9] = var11;
                while (var10-- > 0) {
                    int var12 = var3.method939((byte) -93);
                    int var13 = var3.method939((byte) 105);
                    var11.method234(-73, (long) var12, new class363(var13));
                }
            }
        }
        var3.field2206 = 0;
        var2.field5075 = var3.method879(true);
        var2.field5083 = new int[var6];
        var2.field5074 = new int[var6];
        var2.field5087 = new String[var6];
        int var14 = 0;
        while (var5 > var3.field2206) {
            int var15 = var3.method916(21933);
            if (var15 == 3) {
                var2.field5087[var14] = var3.method907(-27652).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field5083[var14] = var3.method895((byte) -119);
            } else {
                var2.field5083[var14] = var3.method939((byte) 99);
            }
            var2.field5074[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(I)V")
    public class21(int arg0) {
        this.field295 = arg0;
    }
}
