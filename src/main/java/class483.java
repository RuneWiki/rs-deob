import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class483 extends class223 {

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    private int field6725;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    private int field6731;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    private int field6722;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(IIIIIII)V")
    public class483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6725 = arg2;
        this.field6723 = arg1;
        this.field6731 = arg0;
        this.field6722 = arg3;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "([Lcr;IZIZI)V")
    public static final void method2787(class403[] arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        ++field6730;
        if (arg2) {
            method2788(-31);
        }
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            class403 var7 = arg0[var6];
            if (var7 != null && ~var7.field5517 == ~arg3) {
                class203.method1304(arg4, arg1, var7, arg5, (byte) 99);
                class74.method479(var7, arg1, -1, arg5);
                if (~(-var7.field5450 + var7.field5473) > ~var7.field5520) {
                    var7.field5520 = -var7.field5450 + var7.field5473;
                }
                if (~var7.field5520 > -1) {
                    var7.field5520 = 0;
                }
                if (~(-var7.field5404 + var7.field5472) > ~var7.field5442) {
                    var7.field5442 = -var7.field5404 + var7.field5472;
                }
                if (~var7.field5442 > -1) {
                    var7.field5442 = 0;
                }
                if (~var7.field5480 == -1) {
                    class388.method2290(127, arg4, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(III)V")
    public final void method205(int arg0, int arg1, int arg2) {
        ++field6729;
        int var4 = this.field6731 * arg1 >> 12;
        if (arg2 == -28706) {
            int var5 = this.field6725 * arg1 >> 12;
            int var6 = this.field6723 * arg0 >> 12;
            int var7 = this.field6722 * arg0 >> 12;
            class491.method2832(super.field3005, super.field3010, super.field3003, (byte) 45, var4, var6, var7, var5);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(III)V")
    public final void method211(int arg0, int arg1, int arg2) {
        ++field6728;
        if (arg2 != 91) {
            this.method209(41, 93, -91);
        }
        int var4 = this.field6731 * arg1 >> 12;
        int var5 = this.field6725 * arg1 >> 12;
        int var6 = this.field6723 * arg0 >> 12;
        int var7 = this.field6722 * arg0 >> 12;
        class530.method3118(var7, super.field3003, var6, 1, var4, var5, super.field3010);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)Ltk;")
    public static final class228 method2788(int arg0) {
        ++field6727;
        if (arg0 >= -108) {
            method2788(-120);
        }
        if (class6.field163 != null && class70.field1049 != null) {
            class70.field1049.method1706((byte) 104, class6.field163);
            class228 var1 = (class228) class70.field1049.method1707((byte) 124);
            if (var1 == null) {
                return null;
            } else {
                class460 var2 = class6.field160.method1014(var1.field3078, -22947);
                return var2 != null && var2.field6347 && var2.method2621(0, class6.field158) ? var1 : class96.method682(256);
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(III)V")
    public final void method209(int arg0, int arg1, int arg2) {
        ++field6726;
        int var4 = this.field6731 * arg2 >> 12;
        int var5 = this.field6725 * arg2 >> 12;
        if (arg1 != 0) {
            this.method205(80, 65, -20);
        }
        int var6 = this.field6723 * arg0 >> 12;
        int var7 = this.field6722 * arg0 >> 12;
        class9.method103(super.field3005, var4, var7, (byte) -58, var6, var5);
    }

    static {
        new class304("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
