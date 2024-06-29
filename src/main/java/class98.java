import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class98 extends class27 {

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "Lkb;")
    public static class93 field1833 = class76.method390("Clientscript error in: ", 0);

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1832 = 500;

    @OriginalMember(owner = "client!kg", name = "M", descriptor = "Lkb;")
    public static class93 field1828 = class76.method390("scrollen:", 0);

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "Lnd;")
    public static class122 field1834 = new class122();

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "Lkb;")
    public static class93 field1837 = class76.method390("Hier wechseln", 0);

    @OriginalMember(owner = "client!kg", name = "N", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "[Lp;")
    public static class136[] field1838;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
    public static final void method550(int arg0) {
        for (int var1 = -1; class205.field3966 > var1; ++var1) {
            int var5;
            if (~var1 != 0) {
                var5 = class144.field2818[var1];
            } else {
                var5 = 2047;
            }
            class34 var6 = class206.field4035[var5];
            if (var6 != null && var6.field2068 > 0) {
                --var6.field2068;
                if (var6.field2068 == 0) {
                    var6.field2041 = null;
                }
            }
        }
        for (int var2 = 0; class195.field3788 > var2; ++var2) {
            int var3 = class49.field794[var2];
            class76 var4 = class143.field2791[var3];
            if (var4 != null && var4.field2068 > 0) {
                --var4.field2068;
                if (~var4.field2068 == -1) {
                    var4.field2041 = null;
                }
            }
        }
        if (arg0 != 500) {
            method550(-126);
        }
        ++field1831;
    }

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)V")
    public static final void method551(int arg0) {
        class102.field1879.method676(30626);
        ++field1829;
        class191.field3721.method676(30626);
        if (arg0 != 0) {
            method553(-45, 116);
        }
    }

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)V")
    public static void method552(int arg0) {
        field1828 = null;
        field1838 = null;
        field1834 = null;
        if (arg0 == 2047) {
            field1833 = null;
            field1837 = null;
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class98() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)V")
    public static final void method553(int arg0, int arg1) {
        ++field1836;
        class91.field1660 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field1835;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            for (int var4 = 0; ~class159.field3209 < ~var4; ++var4) {
                var3[var4] = class97.field1808[var4];
            }
        }
        return var3;
    }
}
