import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class185 extends class163 {

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "[I")
    public int[] field3256 = new int[] { 0 };

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "[I")
    public int[] field3254 = new int[] { -1 };

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public static int field3257 = -1;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Lke;")
    public static class256 field3265 = class316.method2202(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 27626);

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Lke;")
    private static class256 field3264 = class316.method2202("Allocated memory", 27626);

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "Lke;")
    public static class256 field3263 = field3264;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "Lke;")
    private static class256 field3262 = class316.method2202("Prepared sound engine", 27626);

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "Lke;")
    public static class256 field3255 = field3262;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Lke;")
    public static class256 field3259 = class316.method2202("Titelbild ge-Offnet)3", 27626);

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Lng;")
    public static class138 field3253;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "Lng;")
    public static class138 field3258;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "[[[B")
    public static byte[][][] field3260;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)[Lob;", line = 6)
    public static final class317[] method1346(int arg0) {
        field3261++;
        if (arg0 != -1) {
            return (class317[]) null;
        }
        if (class302.field5198 == null) {
            class317[] var1 = class148.method1076(class272.field4658, arg0 ^ 0x430B2F7D);
            int var2 = 0;
            class317[] var3 = new class317[var1.length];
            label57: for (int var4 = 0; var4 < var1.length; var4++) {
                class317 var5 = var1[var4];
                if ((var5.field5457 <= 0 || var5.field5457 >= 24) && var5.field5462 >= 800 && var5.field5465 >= 600) {
                    for (int var6 = 0; var6 < var2; var6++) {
                        class317 var7 = var3[var6];
                        if (var5.field5462 == var7.field5462 && var5.field5465 == var7.field5465) {
                            if (var7.field5457 < var5.field5457) {
                                var3[var6] = var5;
                            }
                            continue label57;
                        }
                    }
                    var3[var2] = var5;
                    var2++;
                }
            }
            class302.field5198 = new class317[var2];
            class299.method2093(var3, 0, class302.field5198, 0, var2);
            int[] var8 = new int[class302.field5198.length];
            for (int var9 = 0; var9 < class302.field5198.length; var9++) {
                class317 var10 = class302.field5198[var9];
                var8[var9] = var10.field5465 * var10.field5462;
            }
            class38.method291(class302.field5198, -10337, var8);
        }
        return class302.field5198;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 88)
    public static void method1347(byte arg0) {
        field3263 = null;
        if (arg0 >= -57) {
            field3253 = (class138) null;
        }
        field3259 = null;
        field3265 = null;
        field3253 = null;
        field3264 = null;
        field3262 = null;
        field3255 = null;
        field3260 = (byte[][][]) null;
        field3258 = null;
    }
}
