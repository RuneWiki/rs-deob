import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class268 extends class291 {

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Lca;")
    public class113 field4688;

    @OriginalMember(owner = "client!qf", name = "O", descriptor = "I")
    public static int field4689 = 0;

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "Leg;")
    public static class37 field4691 = class174.method1167("Chargement des interfaces )2 ", 83);

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "[Leg;")
    public static class37[] field4687 = new class37[8];

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
    public static int[] field4694 = new int[2];

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "Leg;")
    public static class37 field4692 = class174.method1167("Chargement en cours)3 Veuillez patienter)3", -49);

    @OriginalMember(owner = "client!qf", name = "P", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILjl;Ljl;)V")
    public static final void method1796(int arg0, class101 arg1, class101 arg2) {
        class276.field4896 = arg1;
        class63.field1032 = arg2;
        field4690++;
        if (arg0 != 0) {
            method1797(70);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V")
    public static void method1797(int arg0) {
        if (arg0 < 101) {
            method1798(58);
        }
        field4692 = null;
        field4694 = null;
        field4687 = null;
        field4691 = null;
    }

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "(I)V")
    public static final void method1798(int arg0) {
        field4693++;
        Container var1;
        if (class112.field1911 != null) {
            var1 = class112.field1911;
        } else if (class71.field1114 == null) {
            var1 = class177.field2957.field3504;
        } else {
            var1 = class71.field1114;
        }
        class131.field2193 = var1.getSize().width;
        class37.field549 = var1.getSize().height;
        if (class71.field1114 == var1) {
            Insets var2 = class71.field1114.getInsets();
            class131.field2193 -= var2.left + var2.right;
            class37.field549 -= var2.top + var2.bottom;
        }
        if (class130.method921(47) >= 2) {
            class199.field3390 = class37.field549;
            class249.field4479 = class131.field2193;
            class118.field1996 = 0;
            class46.field721 = 0;
        } else {
            class249.field4479 = 765;
            class46.field721 = 0;
            class118.field1996 = (class131.field2193 - 765) / 2;
            class199.field3390 = 503;
        }
        class93.field1466.setSize(class249.field4479, class199.field3390);
        if (arg0 != 765) {
            field4691 = null;
        }
        if (class71.field1114 == var1) {
            Insets var3 = class71.field1114.getInsets();
            class93.field1466.setLocation(class118.field1996 + var3.left, class46.field721 + var3.top);
        } else {
            class93.field1466.setLocation(class118.field1996, class46.field721);
        }
        if (class234.field4044 != -1) {
            class58.method413(arg0 ^ 0xC2DDA951, true);
        }
        class234.method1607(arg0 - 754);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lal;")
    public static final class35 method1799(Throwable arg0, String arg1) {
        field4695++;
        class35 var2;
        if ((arg0 instanceof class35)) {
            var2 = (class35) arg0;
            var2.field496 = var2.field496 + ' ' + arg1;
        } else {
            var2 = new class35(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lca;)V")
    public class268(class113 arg0) {
        this.field4688 = arg0;
    }
}
