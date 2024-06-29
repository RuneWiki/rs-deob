import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class250 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lfba;")
    private class348 field3634 = new class348(64);

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lla;")
    private class423 field3632;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field3636 = 2;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3640 = -1;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIZII)V")
    public static final void method1687(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field3635++;
        if (!arg2) {
            method1691((byte) 46, 85);
        }
        class503 var5 = class512.method3112(10, arg1, 0);
        var5.method3075((byte) 51);
        var5.field7312 = arg3;
        var5.field7313 = arg4;
        var5.field7310 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lhn;")
    public final class83 method1688(int arg0, int arg1) {
        field3639++;
        class348 var3 = this.field3634;
        class83 var4;
        synchronized (this.field3634) {
            var4 = (class83) this.field3634.method2216(0, (long) arg1);
        }
        if (arg0 >= -71) {
            field3640 = -89;
        }
        if (var4 != null) {
            return var4;
        }
        class423 var5 = this.field3632;
        byte[] var6;
        synchronized (this.field3632) {
            var6 = this.field3632.method2600(0, 32, arg1);
        }
        class83 var7 = new class83();
        if (var6 != null) {
            var7.method671(-1, new class479(var6));
        }
        class348 var8 = this.field3634;
        synchronized (this.field3634) {
            this.field3634.method2213((byte) -16, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)Lqk;")
    public static final class146 method1689(int arg0, boolean arg1) {
        field3638++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (arg1) {
            return null;
        }
        if (class600.field8524[var2] == null || class600.field8524[var2][var3] == null) {
            boolean var4 = class416.method2507(var2, -2113733296);
            if (!var4) {
                return null;
            }
        }
        return class600.field8524[var2][var3];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public final void method1690(int arg0) {
        class348 var2 = this.field3634;
        synchronized (this.field3634) {
            this.field3634.method2220(false);
        }
        field3633++;
        if (arg0 < 13) {
            this.method1688(18, -78);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Z")
    public static final boolean method1691(byte arg0, int arg1) {
        if (arg0 > -48) {
            return true;
        } else {
            field3637++;
            return arg1 != 1 && arg1 != 7;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(II)V")
    public final void method1692(int arg0, int arg1) {
        field3630++;
        if (arg0 != 32503) {
            this.method1693((byte) 3);
        }
        class348 var3 = this.field3634;
        synchronized (this.field3634) {
            this.field3634.method2207(arg1, 1);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method1693(byte arg0) {
        class348 var2 = this.field3634;
        synchronized (this.field3634) {
            this.field3634.method2219(arg0 - 5355);
        }
        if (arg0 == 55) {
            field3631++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lmp;ILla;)V")
    public class250(class315 arg0, int arg1, class423 arg2) {
        this.field3632 = arg2;
        this.field3632.method2616(32, 0);
    }
}
