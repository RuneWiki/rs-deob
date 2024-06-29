import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class434 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field6285 = 0;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field6286 = 0;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "[I")
    public static int[] field6287 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lgk;B)Llf;", line = 9)
    public static final class505 method2579(class540 arg0, byte arg1) {
        field6290++;
        if (arg1 <= 27) {
            field6286 = -71;
        }
        int var2 = arg0.method3160(false);
        return new class505(var2);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 28)
    public static void method2580(byte arg0) {
        int var1 = 64 % ((50 - arg0) / 50);
        field6287 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILgk;I)V", line = 40)
    private final void method2581(int arg0, class540 arg1, int arg2) {
        field6289++;
        if (~arg2 == arg0) {
            this.field6285 = arg1.method3169(26488);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lgk;I)V", line = 53)
    public final void method2582(class540 arg0, int arg1) {
        field6288++;
        if (arg1 < 1) {
            this.method2581(-49, null, 22);
        }
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                return;
            }
            this.method2581(-6, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIILjava/lang/Class;)Lwo;", line = 75)
    public static final class293 method2583(int arg0, int arg1, int arg2, Class arg3) {
        class44 var4 = class603.field8695[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class361 var5 = var4.field667; var5 != null; var5 = var5.field5299) {
            class293 var6 = var5.field5301;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4299 == arg1 && var6.field4300 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
