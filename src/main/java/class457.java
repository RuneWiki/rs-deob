import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class457 extends class125 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "[Lpq;")
    public static class131[] field6824 = new class131[4];

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "F")
    public static float field6822;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field6816;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field6817;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field6819;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field6820;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field6821;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field6826;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field6827;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ZI)V")
    public final void method668(boolean arg0, int arg1) {
        super.field1617.method2263(true, 1);
        ++field6816;
        if (arg1 != 0) {
            method2814(1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILhe;I)V")
    public final void method669(int arg0, class252 arg1, int arg2) {
        ++field6820;
        super.field1617.method2236(arg1, arg0 + -83);
        if (arg0 == 67) {
            super.field1617.method2260(arg0 + 16573, arg2);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZI)Lwi;")
    public static final class327 method2813(int arg0, boolean arg1, int arg2) {
        if (arg2 > -14) {
            field6824 = null;
        }
        ++field6825;
        long var3 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
        return (class327) class474.field7027.method295(var3, -118);
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static final void method2814(int arg0) {
        class234.field3122 = -1;
        ++field6821;
        class111.field1481 = arg0;
        class417.field6028 = -1;
        class102.field1392 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public final void method667(int arg0) {
        if (arg0 != -18112) {
            this.method668(true, 16);
        }
        ++field6817;
        super.field1617.method2263(false, arg0 + 18113);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Z")
    public final boolean method666(int arg0) {
        int var2 = 102 % ((11 - arg0) / 63);
        ++field6819;
        return true;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lur;)V")
    public class457(class377 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public final void method662(int arg0, int arg1, int arg2) {
        ++field6815;
        if (arg0 >= -35) {
            field6823 = -109;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
    public static void method2815(boolean arg0) {
        field6824 = null;
        if (arg0) {
            method2815(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lug;I)Lgd;")
    public static final class227 method2816(class396 arg0, int arg1) {
        ++field6827;
        arg0.method2388((byte) -126);
        int var2 = arg0.method2388((byte) -111);
        class227 var3 = class446.method2754(var2, 107);
        var3.field3055 = arg0.method2388((byte) -125);
        int var4 = arg0.method2388((byte) -125);
        int var5 = 0;
        if (arg1 != -1) {
            field6824 = null;
        }
        while (~var5 > ~var4) {
            int var6 = arg0.method2388((byte) -121);
            var3.method61(arg0, 487215116, var6);
            ++var5;
        }
        var3.method877(1);
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(ZI)V")
    public final void method665(boolean arg0, int arg1) {
        ++field6826;
        if (arg1 < 92) {
            this.method665(false, -62);
        }
    }
}
