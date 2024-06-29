import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class177 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lqk;")
    public static class1 field2231 = new class1(43, 2);

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "Lgca;")
    public static class705 field2233 = new class705(true);

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public static int field2234 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field2236 = 0;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "[I")
    public static int[] field2238 = new int[1];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[I")
    public static int[] field2237 = new int[5];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)[Lwb;")
    public static final class577[] method1129(int arg0) {
        field2230++;
        if (class718.field9943 == null) {
            class577[] var1 = class418.method2531((byte) -95, class129.field1674);
            class577[] var2 = new class577[var1.length];
            int var3 = 0;
            int var4 = class688.field9602.field8523.method1283((byte) -98);
            label74: for (int var5 = 0; var5 < var1.length; var5++) {
                class577 var9 = var1[var5];
                if ((var9.field8116 <= 0 || var9.field8116 >= 24) && var9.field8111 >= 800 && var9.field8107 >= 600 && (var4 != 2 || var9.field8111 <= 800 && var9.field8107 <= 600) && (var4 != 1 || var9.field8111 <= 1024 && var9.field8107 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class577 var11 = var2[var10];
                        if (var9.field8111 == var11.field8111 && var9.field8107 == var11.field8107) {
                            if (var11.field8116 < var9.field8116) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class718.field9943 = new class577[var3];
            class335.method2123(var2, 0, class718.field9943, 0, var3);
            int[] var6 = new int[class718.field9943.length];
            for (int var7 = 0; var7 < class718.field9943.length; var7++) {
                class577 var8 = class718.field9943[var7];
                var6[var7] = var8.field8111 * var8.field8107;
            }
            class419.method2539(var6, class718.field9943, 31492);
        }
        if (arg0 != 5) {
            field2231 = null;
        }
        return class718.field9943;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method1130(byte arg0) {
        field2233 = null;
        field2237 = null;
        if (arg0 >= -12) {
            method1131(-24, null, 126);
        }
        field2238 = null;
        field2231 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method1131(int arg0, float[] arg1, int arg2) {
        field2232++;
        if (arg0 >= -18) {
            method1130((byte) 81);
        }
        float[] var3 = new float[arg2];
        class335.method2122(arg1, 0, var3, 0, arg2);
        return var3;
    }
}
