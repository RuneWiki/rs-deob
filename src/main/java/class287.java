import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class287 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Luj;")
    public class471 field3665 = new class471();

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Z")
    public boolean field3667 = false;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "Lvg;")
    public static class55 field3664 = new class55("WIP", 2);

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "Lkr;")
    public static class260 field3669 = new class260(0, -1);

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "Loi;")
    public static class169 field3671 = new class169("slide:", "gleiten:", "glissement:", "deslizamento:");

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Lpi;")
    public static class340 field3672 = new class340(105, 6);

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lcr;")
    public static class362 field3663;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3666;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 6)
    public static final void method1742(int arg0, int arg1, int arg2, Class arg3) {
        class510 var4 = class470.field6877[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class319 var5 = var4.field7494; var5 != null; var5 = var5.field4102) {
            class448 var6 = var5.field4107;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6238 == arg1 && var6.field6228 == arg2) {
                class122.method779(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V", line = 32)
    public static void method1743(int arg0) {
        field3664 = null;
        field3669 = null;
        field3671 = null;
        field3663 = null;
        field3672 = null;
        field3666 = null;
        int var1 = 57 / ((10 - arg0) / 52);
    }
}
