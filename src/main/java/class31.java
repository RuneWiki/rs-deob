import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 {

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Lkb;")
    private class53 field577 = new class53();

    @OriginalMember(owner = "client!na", name = "f", descriptor = "Lp;")
    public static class280 field579 = class18.method140((byte) -124, "Cache:");

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Z")
    public static boolean field582 = false;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field585 = 0;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "Lp;")
    public static class280 field581 = class18.method140((byte) -123, "jaune:");

    @OriginalMember(owner = "client!na", name = "a", descriptor = "I")
    public static int field574 = 0;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lp;")
    public static class280 field587 = class18.method140((byte) -122, "_labels");

    @OriginalMember(owner = "client!na", name = "j", descriptor = "Lp;")
    public static class280 field583 = class18.method140((byte) -123, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "Lkb;")
    private class53 field589;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "Z")
    public static boolean field578;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)Lkb;")
    public final class53 method267(int arg0) {
        if (arg0 >= -112) {
            return null;
        }
        field586++;
        class53 var2 = this.field577.field864;
        if (this.field577 == var2) {
            return null;
        } else {
            var2.method392(1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V")
    public static final void method268(byte arg0) {
        field584++;
        if (!class215.method1436(104) && class231.field4013 != class23.field427) {
            class178.method1222(class264.field4655, class126.field2215, class231.field4013, -114, false, class262.field4631.field4792[0], class262.field4631.field4837[0]);
        } else if (arg0 < -25 && class231.field4013 != class130.field2295) {
            class130.field2295 = class231.field4013;
            class244.method1663((byte) 89, class231.field4013);
            class136.method939((byte) 6);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
    public static void method269(byte arg0) {
        field583 = null;
        field587 = null;
        field579 = null;
        int var1 = 123 % ((42 - arg0) / 55);
        field581 = null;
    }

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public final void method270(byte arg0) {
        if (arg0 <= 37) {
            this.method267(-100);
        }
        field576++;
        while (true) {
            class53 var2 = this.field577.field864;
            if (this.field577 == var2) {
                this.field589 = null;
                return;
            }
            var2.method392(1);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)I")
    public final int method271(int arg0) {
        field580++;
        int var2 = 0;
        if (arg0 != -27134) {
            field585 = 71;
        }
        for (class53 var3 = this.field577.field864; var3 != this.field577; var3 = var3.field864) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)Lkb;")
    public final class53 method272(boolean arg0) {
        field588++;
        class53 var2 = this.field589;
        if (!arg0) {
            return null;
        } else if (this.field577 == var2) {
            this.field589 = null;
            return null;
        } else {
            this.field589 = var2.field864;
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILkb;)V")
    public final void method273(int arg0, class53 arg1) {
        field575++;
        if (arg1.field873 != null) {
            arg1.method392(arg0 ^ 0x1);
        }
        if (arg0 != 0) {
            field583 = null;
        }
        arg1.field864 = this.field577;
        arg1.field873 = this.field577.field873;
        arg1.field873.field864 = arg1;
        arg1.field864.field873 = arg1;
    }

    @OriginalMember(owner = "client!na", name = "d", descriptor = "(B)Lkb;")
    public final class53 method274(byte arg0) {
        class53 var2 = this.field577.field864;
        field590++;
        int var3 = 17 / ((arg0 + 41) / 61);
        if (this.field577 == var2) {
            this.field589 = null;
            return null;
        } else {
            this.field589 = var2.field864;
            return var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class31() {
        this.field577.field864 = this.field577;
        this.field577.field873 = this.field577;
    }
}
