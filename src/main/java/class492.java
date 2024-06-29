import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class492 {

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    private int field7061 = 0;

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    private int field7069 = 0;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Ljo;")
    private class337 field7068 = null;

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "I")
    private int field7060 = 0;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "Lkfa;")
    private class382 field7066;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "Lul;")
    private class440 field7070;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "[Lraa;")
    private class460[] field7064;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "Lnca;")
    public class554 field7062;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "Lmo;")
    public static class482 field7065 = new class482(16);

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public static int field7058;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field7059;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "Ljava/applet/Applet;")
    public static Applet field7063;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method2881(byte arg0) {
        field7065 = null;
        field7063 = null;
        if (arg0 <= 15) {
            method2881((byte) 8);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IB)Z")
    public final boolean method2882(int arg0, byte arg1) {
        if (arg1 < 35) {
            return false;
        } else {
            field7059++;
            return this.field7064[arg0].method1168(2048);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZIIIZ)V")
    public final void method2883(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        boolean var7 = arg1 & this.field7066.method767();
        field7067++;
        if (!var7 && (arg2 == 4 || arg2 == 8 || arg2 == 9)) {
            if (arg2 == 4) {
                arg3 = arg4;
            }
            arg2 = 2;
        }
        if (arg2 != 0 && arg5) {
            arg2 |= Integer.MIN_VALUE;
        }
        if (this.field7061 != arg2) {
            if (this.field7061 != 0) {
                this.field7064[this.field7061 & Integer.MAX_VALUE].method1174((byte) -73);
            }
            if (arg2 != 0) {
                this.field7064[arg2 & Integer.MAX_VALUE].method1175(arg5, 0);
                this.field7064[Integer.MAX_VALUE & arg2].method1177((byte) -126, arg5);
                this.field7064[arg2 & Integer.MAX_VALUE].method1170(arg3, arg4, 1);
            }
            this.field7068 = null;
            this.field7060 = arg3;
            this.field7069 = arg4;
            this.field7061 = arg2;
        } else if (this.field7061 != 0) {
            this.field7064[this.field7061 & Integer.MAX_VALUE].method1177((byte) -127, arg5);
            if (this.field7069 != arg4 || this.field7060 != arg3) {
                this.field7064[Integer.MAX_VALUE & this.field7061].method1170(arg3, arg4, 1);
                this.field7069 = arg4;
                this.field7060 = arg3;
            }
        }
        if (arg0) {
            this.method2883(true, false, -67, 107, -87, true);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZILjo;)Z")
    public final boolean method2884(boolean arg0, int arg1, class337 arg2) {
        if (!arg0) {
            field7065 = null;
        }
        field7058++;
        if (this.field7061 == 0) {
            return false;
        }
        if (this.field7068 != arg2) {
            this.field7064[this.field7061 & Integer.MAX_VALUE].method1169(arg1, arg2, 126);
            this.field7068 = arg2;
        }
        return true;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lkfa;)V")
    public class492(class382 arg0) {
        this.field7066 = arg0;
        this.field7070 = new class440(arg0);
        this.field7064 = new class460[10];
        this.field7064[1] = new class156(arg0);
        this.field7064[2] = new class651(arg0, this.field7070);
        this.field7064[4] = new class598(arg0, this.field7070);
        this.field7064[5] = new class555(arg0, this.field7070);
        this.field7064[6] = new class625(arg0);
        this.field7064[7] = new class406(arg0);
        this.field7064[3] = this.field7062 = new class554(arg0);
        this.field7064[8] = new class218(arg0, this.field7070);
        this.field7064[9] = new class605(arg0, this.field7070);
        if (!this.field7064[8].method1168(2048)) {
            this.field7064[8] = this.field7064[4];
        }
        if (!this.field7064[9].method1168(2048)) {
            this.field7064[9] = this.field7064[8];
        }
    }
}
