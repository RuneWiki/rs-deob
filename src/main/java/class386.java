import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class386 extends class159 {

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public int field5253 = -1;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "Lvj;")
    public static class304 field5254 = new class304("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lff;")
    public static class9 field5255 = new class9(99, 8);

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Lff;")
    public static class9 field5258 = new class9(26, 14);

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "[[I")
    public static int[][] field5260 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Ljava/lang/String;")
    public String field5248;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "Ljava/lang/String;")
    public String field5249;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "[I")
    public static int[] field5257;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IZ)V", line = 9)
    public static final void method2283(int arg0, boolean arg1) {
        ++field5252;
        while (class481.field6632.method752(class219.field2965, 8) >= 15) {
            int var2 = class481.field6632.method756(7, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class291.field3822[var2] == null) {
                class291.field3822[var2] = new class117();
                class291.field3822[var2].field6170 = var2;
                var3 = true;
            }
            class117 var4 = class291.field3822[var2];
            class162.field2369[class60.field942++] = var2;
            var4.field6235 = class31.field516;
            if (var4.field1661 != null && var4.field1661.method2889(107)) {
                class526.method3092(2, var4);
            }
            var4.method803(class206.field2849.method2554(117, class481.field6632.method756(7, 14)), (byte) 122);
            int var5 = class481.field6632.method756(7, 2);
            int var6 = (4 + class481.field6632.method756(7, 3) & 710934535) << 11;
            int var7 = class481.field6632.method756(7, 1);
            if (~var7 == -2) {
                class255.field3376[class421.field5766++] = var2;
            }
            int var8 = class481.field6632.method756(7, 1);
            int var9;
            if (!arg1) {
                var9 = class481.field6632.method756(7, 5);
                if (~var9 < -16) {
                    var9 -= 32;
                }
            } else {
                var9 = class481.field6632.method756(7, 8);
                if (var9 > 127) {
                    var9 -= 256;
                }
            }
            int var10;
            if (!arg1) {
                var10 = class481.field6632.method756(7, 5);
                if (var10 > 15) {
                    var10 -= 32;
                }
            } else {
                var10 = class481.field6632.method756(7, 8);
                if (~var10 < -128) {
                    var10 -= 256;
                }
            }
            var4.method2589(var4.field1661.field6956, (byte) -105);
            var4.field6177 = var4.field1661.field6963 << 3;
            if (~var4.field6177 != -1) {
                if (var3) {
                    var4.method2593(var6, false);
                }
            } else {
                var4.method2593(0, false);
            }
            var4.method800(0, var8 == 1, class385.field5232.field6266[0] - -var9, var4.method2590(0), class385.field5232.field6261[0] + var10, var5);
            if (var4.field1661.method2889(-99)) {
                class229.method1430((class1) null, 118, (class515) null, var4, var4.field6261[0], 0, var4.field573, var4.field6266[0]);
            }
        }
        class481.field6632.method757((byte) 119);
        if (arg0 > -48) {
            method2285(-48);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 117)
    public static final boolean method2284(String arg0, int arg1) {
        ++field5256;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class114.field1621 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class222.field2989[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class309.field4070[var2])) {
                    return true;
                }
            }
            int var3 = 68 / ((58 - arg1) / 52);
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V", line = 145)
    public static void method2285(int arg0) {
        field5255 = null;
        field5258 = null;
        field5260 = null;
        if (arg0 != 6) {
            method2285(-77);
        }
        field5254 = null;
        field5257 = null;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)Lfp;", line = 159)
    public final class211 method2286(byte arg0) {
        int var2 = -67 % ((23 - arg0) / 33);
        ++field5251;
        return class80.field1184[super.field2351];
    }
}
