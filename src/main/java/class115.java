import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class115 {

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Lwi;")
    public static class340 field1596 = new class340(2, 4, 4, 0);

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field1598;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lnp;")
    public class115 field1600;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "Lvj;")
    public class153 field1594;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)V")
    public static void method743(boolean arg0) {
        field1596 = null;
        if (!arg0) {
            field1597 = 86;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)Z")
    public static final boolean method744(byte arg0) {
        field1602++;
        class32 var1 = (class32) class96.field1395.field4498.field6803;
        if (var1 == null || class96.field1395.field4498 == var1) {
            return false;
        }
        if (arg0 != -83) {
            field1597 = 78;
        }
        if (var1.field485 >= 2000) {
            var1.field485 -= 2000;
        }
        return var1.field485 == 1008;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lqa;JB)V")
    public static final void method745(class496 arg0, long arg1, byte arg2) {
        class269.field3732 = 0;
        class4.field57 = class339.field5364;
        field1599++;
        class339.field5364 = 0;
        long var4 = class264.method1698(true);
        int var6 = 4 % ((arg2 + 35) / 58);
        for (class134 var7 = (class134) class13.field215.method2358((byte) 60); var7 != null; var7 = (class134) class13.field215.method2363(31844)) {
            if (var7.method867(arg0, arg1)) {
                class269.field3732++;
            }
        }
        if (class56.field754 && (arg1 % 100L) == 0L) {
            System.out.println("Particle system count: " + class13.field215.method2354(-67) + ", running: " + class269.field3732 + ". Particles: " + class339.field5364 + ". Time taken: " + (class264.method1698(true) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II[ILbv;IZ)Log;")
    public static final class346 method746(int arg0, int arg1, int[] arg2, class282 arg3, int arg4, boolean arg5) {
        field1601++;
        if (arg0 != 3553) {
            return null;
        } else if (!arg3.field4134 && (!class124.method799(true, arg1) || !class124.method799(true, arg4))) {
            return arg3.field4155 ? new class346(arg3, 34037, arg1, arg4, arg5, arg2) : new class346(arg3, arg1, arg4, class353.method2231(arg1, (byte) -84), class353.method2231(arg4, (byte) -84), arg2);
        } else {
            return new class346(arg3, 3553, arg1, arg4, arg5, arg2);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
    public final void method747(int arg0) {
        field1598++;
        if (class501.field7488 >= 500) {
            return;
        }
        this.field1595 = 0;
        this.field1594 = null;
        if (arg0 <= 33) {
            method744((byte) 105);
        }
        this.field1600 = class140.field2033;
        class140.field2033 = this;
        class501.field7488++;
    }

    static {
        new class375("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
    }
}
