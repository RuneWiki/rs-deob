import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class134 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field2243;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public int field2242;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2238 = "";

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2246 = "Loading world list data";

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field2245 = 0;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Z")
    public static boolean field2244 = false;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "Ll;")
    public static class66 field2247 = new class66(50);

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Ll;")
    public static class66 field2248 = new class66(8);

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[Lpc;")
    public static class100[] field2239;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 5)
    public static void method1137(int arg0) {
        field2248 = null;
        field2247 = null;
        field2238 = null;
        int var1 = 101 / ((54 - arg0) / 43);
        field2239 = null;
        field2246 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 26)
    public static final void method1138(int arg0) {
        field2240++;
        class362.field5734.method656(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V", line = 43)
    public static final void method1139(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class335.field5119; var3++) {
            for (int var4 = 0; var4 < class154.field2492; var4++) {
                for (int var5 = 0; var5 < class166.field2642; var5++) {
                    class329 var6 = class170.field2689[var3][var4][var5];
                    if (var6 != null) {
                        class202 var7 = var6.field5064;
                        if (var7 != null && var7.field3121.method390()) {
                            class94.method841(var7.field3121, var3, var4, var5, 1, 1);
                            if (var7.field3116 != null && var7.field3116.method390()) {
                                class94.method841(var7.field3116, var3, var4, var5, 1, 1);
                                var7.field3121.method394(var7.field3116, 0, 0, 0, false);
                                var7.field3116 = var7.field3116.method400(arg0, arg1, arg2);
                            }
                            var7.field3121 = var7.field3121.method400(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field5063; var8++) {
                            class297 var9 = var6.field5070[var8];
                            if (var9 != null && var9.field4605.method390()) {
                                class94.method841(var9.field4605, var3, var4, var5, var9.field4606 + 1 - var9.field4616, var9.field4612 - var9.field4614 + 1);
                                var9.field4605 = var9.field4605.method400(arg0, arg1, arg2);
                            }
                        }
                        class44 var10 = var6.field5062;
                        if (var10 != null && var10.field714.method390()) {
                            class204.method1523(var10.field714, var3, var4, var5);
                            var10.field714 = var10.field714.method400(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 118)
    public class134() {
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Ljh;)V", line = 127)
    public class134(class134 arg0) {
        this.field2243 = arg0.field2243;
        this.field2236 = arg0.field2236;
        this.field2242 = arg0.field2242;
        this.field2237 = arg0.field2237;
    }
}
