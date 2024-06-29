import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class380 {

    @OriginalMember(owner = "client!d", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5244 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Z")
    public static boolean field5246 = false;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field5245 = -1;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lhc;")
    public static class368 field5247 = new class368("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method2356(int arg0) {
        field5244 = null;
        field5247 = null;
        if (arg0 != -2049) {
            field5244 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILrg;)Lck;")
    public static final class353 method2357(int arg0, class366 arg1) {
        field5243++;
        class353 var2 = new class353();
        var2.field4744 = arg1.method2297(13352);
        if (arg0 == 6922) {
            var2.field4748 = class128.method967(var2.field4744, -1979350136);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Leo;")
    public static final class269 method2358(int arg0, int arg1) {
        field5241++;
        class269 var2 = (class269) class113.field1742.method2529(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class95.field1311.method1926(0, arg1, 29);
        class269 var4 = new class269();
        if (var3 != null) {
            var4.method1709(0, arg1, new class366(var3));
        }
        if (arg0 != -2049) {
            method2358(124, 121);
        }
        class113.field1742.method2527(-75, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method2359(byte arg0) {
        if (arg0 != -52) {
            return;
        }
        field5242++;
        if (class354.field4765 == null) {
            return;
        }
        class345.field4667.method2476((byte) 0);
        class323.method1970();
        class169.method1204((byte) -101);
        class229.method1494(false);
        class450.method2810(-1);
        class107.method818(true);
        if (class399.field5537 != null) {
            class399.field5537.method543(-4423);
        }
        class264.method1693(arg0 + 83);
        class217.method1443(-127);
        class399.method2470(false);
        class387.method2383(false, false);
        class387.method2386((byte) 21);
        for (int var1 = 0; var1 < 2048; var1++) {
            class423 var5 = class87.field1227[var1];
            if (var5 != null) {
                var5.field2656 = null;
                for (int var6 = 0; var6 < var5.field2657.length; var6++) {
                    var5.field2657[var6] = null;
                }
            }
        }
        for (int var2 = 0; var2 < class428.field5951.length; var2++) {
            class419 var3 = class428.field5951[var2];
            if (var3 != null) {
                for (int var4 = 0; var4 < var3.field2657.length; var4++) {
                    var3.field2657[var4] = null;
                }
            }
        }
        class354.field4765.method449((byte) -74);
        class354.field4765 = null;
    }
}
