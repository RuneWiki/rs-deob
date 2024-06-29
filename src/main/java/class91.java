import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class91 extends class4 {

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
    public boolean field1658 = false;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "I")
    private int field1663 = 0;

    @OriginalMember(owner = "client!k", name = "bb", descriptor = "I")
    private int field1670 = 0;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public int field1659;

    @OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
    public int field1668;

    @OriginalMember(owner = "client!k", name = "ab", descriptor = "I")
    public int field1669;

    @OriginalMember(owner = "client!k", name = "fb", descriptor = "I")
    public int field1674;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "I")
    public int field1662;

    @OriginalMember(owner = "client!k", name = "W", descriptor = "I")
    private int field1665;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "Ldg;")
    private class37 field1656;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field1660 = 20;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Lrd;")
    public static class158 field1664 = new class158(new byte[5000]);

    @OriginalMember(owner = "client!k", name = "X", descriptor = "Lkb;")
    private static class93 field1666 = class76.method390("Bad session id)3", 0);

    @OriginalMember(owner = "client!k", name = "cb", descriptor = "Lkb;")
    private static class93 field1671 = class76.method390("Please wait )2 attempting to reestablish)3", 0);

    @OriginalMember(owner = "client!k", name = "db", descriptor = "Lkb;")
    private static class93 field1672 = class76.method390("Drop", 0);

    @OriginalMember(owner = "client!k", name = "Y", descriptor = "Lkb;")
    public static class93 field1667 = field1666;

    @OriginalMember(owner = "client!k", name = "eb", descriptor = "Lkb;")
    public static class93 field1673 = field1671;

    @OriginalMember(owner = "client!k", name = "gb", descriptor = "Lkb;")
    public static class93 field1675 = field1672;

    @OriginalMember(owner = "client!k", name = "ib", descriptor = "I")
    public static int field1677 = 0;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!k", name = "hb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(Z)V")
    public static void method476(boolean arg0) {
        if (arg0) {
            field1673 = null;
        }
        field1675 = null;
        field1666 = null;
        field1671 = null;
        field1673 = null;
        field1672 = null;
        field1667 = null;
        field1664 = null;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method477(int arg0) {
        field1657++;
        class134.field2576 = false;
        if (arg0 != 0) {
            field1660 = 125;
        }
        class82.field1515 = false;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)V")
    public final void method478(int arg0, int arg1) {
        field1676++;
        if (this.field1658) {
            return;
        }
        int var3 = 81 % ((arg1 - 31) / 59);
        this.field1670 += arg0;
        while (this.field1656.field615[this.field1663] < this.field1670) {
            this.field1670 -= this.field1656.field615[this.field1663];
            this.field1663++;
            if (this.field1656.field616.length <= this.field1663) {
                this.field1658 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I")
    public static int method479(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)Lfd;")
    public final class52 method21(boolean arg0) {
        field1661++;
        class55 var2 = class176.method1163(this.field1665, -15);
        if (arg0) {
            return null;
        }
        class52 var3;
        if (this.field1658) {
            var3 = var2.method298(arg0, -1);
        } else {
            var3 = var2.method298(false, this.field1663);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(IIIIIII)V")
    public class91(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1659 = arg6 + arg5;
        this.field1668 = arg3;
        this.field1669 = arg4;
        this.field1674 = arg2;
        this.field1662 = arg1;
        this.field1665 = arg0;
        int var8 = class176.method1163(this.field1665, -8).field907;
        if (var8 == -1) {
            this.field1658 = true;
        } else {
            this.field1658 = false;
            this.field1656 = class39.method213(-10639, var8);
        }
    }
}
