import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class34 {

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lp;")
    public static class280 field631 = class18.method140((byte) -117, "floorshadows");

    @OriginalMember(owner = "client!va", name = "g", descriptor = "I")
    public static int field632 = 0;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lp;")
    public static class280 field633 = class18.method140((byte) -118, ")1o");

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lgd;")
    public static class74 field627 = new class74(5000);

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field634 = new Random();

    @OriginalMember(owner = "client!va", name = "l", descriptor = "Lp;")
    public static class280 field637 = class18.method140((byte) -121, "leuchten3:");

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Lp;")
    public static class280 field636 = class18.method140((byte) -122, "::errortest");

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Lka;")
    public static class253 field635 = new class253(64);

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Lp;")
    public static class280 field638 = class18.method140((byte) -121, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[B)Ltd;")
    public static final class72 method284(int arg0, byte[] arg1) {
        field630++;
        if (arg1 == null) {
            return null;
        } else {
            class281 var2 = new class281(arg1, class243.field4263, class124.field2172, class97.field1562, class57.field915, class182.field3178);
            class126.method868(-15434);
            return arg0 == -1475 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V")
    public static final void method285(int arg0, int arg1) {
        field626++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class267.method1790((byte) -75);
        } else if (arg1 == 2) {
            class51.method375(-14155);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != 1559051078) {
            method287(121);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public static final void method286(byte arg0) {
        field629++;
        if (!class263.field4647) {
            return;
        }
        class113 var1 = class224.method1509(class235.field4098, class28.field529, (byte) -62);
        int var2 = -30 % ((-arg0 - 67) / 51);
        if (var1 != null && var1.field2009 != null) {
            class178 var3 = new class178();
            var3.field3106 = var1;
            var3.field3107 = var1.field2009;
            class199.method1371(200000, var3);
        }
        class277.field4808 = -1;
        class263.field4647 = false;
        class242.method1642((byte) 108, var1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
    public static final void method287(int arg0) {
        field628++;
        int var1 = class59.field951;
        if (arg0 != -2702) {
            field632 = -27;
        }
        int var2 = class222.field3857;
        int var3 = class78.field1270;
        int var4 = class246.field4322;
        int var5 = 6116423;
        class151.method1057(var1, var2, var3, var4, var5);
        class151.method1057(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class151.method1060(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        class54.field890.method515(class99.field1619, var1 + 3, var2 - -14, var5, -1);
        int var6 = class229.field3957;
        int var7 = class154.field2673;
        for (int var8 = 0; var8 < class157.field2745; var8++) {
            int var9 = (class157.field2745 - (var8 + 1)) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && var1 + var3 > var6 && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class54.field890.method515(class199.method1366(var8, -1), var1 + 3, var9, var10, 0);
        }
        class30.method264(class222.field3857, -70, class59.field951, class78.field1270, class246.field4322);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static void method288(int arg0) {
        field637 = null;
        field635 = null;
        field634 = null;
        field631 = null;
        field636 = null;
        field627 = null;
        int var1 = -10 % ((arg0 + 19) / 56);
        field633 = null;
        field638 = null;
    }
}
