import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class779 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field10683;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field10684;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIZIII)Lvr;", line = 4)
    public static final class458 method4280(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        field10683++;
        long var7 = (long) arg1 * 76724863L ^ (long) arg5 * 986053L ^ (long) arg2 * 67481L ^ (long) arg6 * 97549L ^ (long) arg4 * 475427L ^ (long) arg0 * 32147369L;
        if (arg3) {
            return null;
        }
        class458 var9 = (class458) class632.field8944.method2882(var7, (byte) -49);
        if (var9 == null) {
            class458 var10 = class321.field4568.method434(arg2, arg6, arg4, arg5, arg0, arg1);
            class632.field8944.method2890(-7307, var7, var10);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 33)
    public static final void method4281(int arg0, String[] arg1) {
        field10684++;
        if (arg1.length > 1) {
            for (int var2 = 0; var2 < arg1.length; var2++) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class30.method251(false, "Pausing for " + var3 + " seconds...");
                    class29.field311 = arg1;
                    class640.field9012 = var2 + 1;
                    class317.field4536 = (long) (var3 * 1000) + class337.method2062(false);
                    return;
                }
                class57.field883 = arg1[var2];
                class792.method4326(false, (byte) -69);
            }
        } else {
            class57.field883 = class57.field883 + arg1[0];
            class467.field6372 += arg1[0].length();
        }
        if (arg0 != 28924) {
            method4280(54, 42, -97, false, -47, 67, -44);
        }
    }
}
