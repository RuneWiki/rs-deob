import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class231 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public static boolean field3698 = false;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lgj;")
    public static class255 field3702;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Lnh;")
    public static class55 field3700;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method1622(int arg0) {
        if (arg0 >= -52) {
            field3704 = -48;
        }
        field3700 = null;
        field3702 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public static final void method1623(int arg0, int arg1, int arg2) {
        class36 var3 = class161.method1067(12, arg1, (byte) 81);
        field3699++;
        var3.method219(-24);
        var3.field465 = arg0;
        if (arg2 != -7229) {
            field3705 = -6;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)[Lh;")
    public static final class294[] method1624(boolean arg0) {
        class294[] var1 = new class294[class230.field3697];
        for (int var2 = 0; var2 < class230.field3697; var2++) {
            byte[] var3 = class56.field758[var2];
            int var4 = class263.field4341[var2] * class184.field2854[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class12.field157[class10.method53(var3[var6], 255)];
            }
            var1[var2] = new class38(class196.field3118, class268.field4396, class239.field3781[var2], class272.field4457[var2], class184.field2854[var2], class263.field4341[var2], var5);
        }
        if (!arg0) {
            method1624(true);
        }
        field3701++;
        class270.method1856(96);
        return var1;
    }
}
