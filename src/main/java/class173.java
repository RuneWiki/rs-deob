import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class173 extends class158 {

    @OriginalMember(owner = "client!ada", name = "h", descriptor = "Lvaa;")
    public static class493 field2683 = new class493();

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "Ljo;")
    public static class353 field2687 = new class353(8);

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field2688 = 328;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljs;I)I")
    public static final int method1260(class349 arg0, int arg1) {
        field2686++;
        if (arg1 >= -73) {
            return 56;
        }
        int var2 = arg0.method2216(-122, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method2216(-125, 5);
        } else if (var2 == 2) {
            var3 = arg0.method2216(-100, 8);
        } else {
            var3 = arg0.method2216(-120, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(I)Z")
    public static final boolean method1261(int arg0) {
        field2684++;
        try {
            int var1 = -3 / ((arg0 + 36) / 39);
            class551 var2 = new class551();
            byte[] var3 = var2.method3287(class133.field2004, 10329);
            class97.method702(var3, -2);
            return true;
        } catch (Exception var4) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "(I)V")
    public static void method1262(int arg0) {
        field2683 = null;
        field2687 = null;
        if (arg0 != -23102) {
            method1262(84);
        }
    }
}
