import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class288 {

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lvs;")
    private class617 field3604 = new class617();

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lvs;")
    private class617 field3609;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lvs;I)V")
    public final void method1674(class617 arg0, int arg1) {
        if (arg0.field8698 != null) {
            arg0.method3443(118);
        }
        field3607++;
        arg0.field8698 = this.field3604;
        arg0.field8692 = this.field3604.field8692;
        arg0.field8698.field8692 = arg0;
        arg0.field8692.field8698 = arg0;
        if (arg1 != 24800) {
            this.field3604 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)I")
    public final int method1675(byte arg0) {
        if (arg0 != -93) {
            return 35;
        }
        field3601++;
        int var2 = 0;
        class617 var3 = this.field3604.field8692;
        while (this.field3604 != var3) {
            var3 = var3.field8692;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Lvs;")
    public final class617 method1676(byte arg0) {
        field3602++;
        class617 var2 = this.field3604.field8698;
        if (arg0 != -13) {
            this.method1676((byte) -122);
        }
        if (this.field3604 == var2) {
            return null;
        } else {
            var2.method3443(113);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Lvs;")
    public final class617 method1677(int arg0) {
        field3608++;
        class617 var2 = this.field3604.field8692;
        if (this.field3604 == var2) {
            this.field3609 = null;
            return null;
        } else {
            this.field3609 = var2.field8692;
            int var3 = -108 % ((-arg0 - 26) / 46);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Lvs;")
    public final class617 method1678(boolean arg0) {
        if (!arg0) {
            return null;
        }
        field3606++;
        class617 var2 = this.field3604.field8692;
        if (this.field3604 == var2) {
            return null;
        } else {
            var2.method3443(116);
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)Z")
    public static boolean method1679(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILvs;)V")
    public final void method1680(int arg0, class617 arg1) {
        field3600++;
        if (arg1.field8698 != null) {
            arg1.method3443(97);
        }
        arg1.field8692 = this.field3604;
        if (arg0 > 4) {
            arg1.field8698 = this.field3604.field8698;
            arg1.field8698.field8692 = arg1;
            arg1.field8692.field8698 = arg1;
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Lvs;")
    public final class617 method1681(int arg0) {
        field3599++;
        class617 var2 = this.field3609;
        if (arg0 < 68) {
            this.field3604 = null;
        }
        if (this.field3604 == var2) {
            this.field3609 = null;
            return null;
        } else {
            this.field3609 = var2.field8692;
            return var2;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final void method1682(int arg0) {
        field3605++;
        while (true) {
            class617 var2 = this.field3604.field8692;
            if (this.field3604 == var2) {
                if (arg0 != 0) {
                    this.method1674(null, -60);
                }
                this.field3609 = null;
                return;
            }
            var2.method3443(118);
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class288() {
        this.field3604.field8692 = this.field3604;
        this.field3604.field8698 = this.field3604;
    }
}
