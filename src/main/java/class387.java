import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class387 {

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Luu;")
    private class238 field5108 = null;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    private int field5110 = 0;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    private int field5102 = 0;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    private int field5106 = 0;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "Lmh;")
    private class537 field5116;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lpda;")
    private class535 field5112;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[Ltb;")
    private class337[] field5114;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lev;")
    public class592 field5103;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field5113 = -1;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "Lcea;")
    public static class180 field5111 = new class180(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
    public static boolean field5117 = true;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Z")
    public final boolean method2228(int arg0, int arg1) {
        field5115++;
        if (arg0 != -31210) {
            this.field5103 = null;
        }
        return this.field5114[arg1].method257((byte) 120);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(II)V")
    public static final void method2229(int arg0, int arg1) {
        field5104++;
        class70.field676 = arg0;
        if (arg1 != -24285) {
            method2232(-56);
        }
        class641 var2 = class325.field4116;
        synchronized (class325.field4116) {
            class325.field4116.method3687(1402);
        }
        class641 var3 = class342.field4407;
        synchronized (class342.field4407) {
            class342.field4407.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILuu;I)Z")
    public final boolean method2230(int arg0, class238 arg1, int arg2) {
        field5105++;
        if (this.field5110 == 0) {
            return false;
        } else if (arg0 == 14754) {
            if (this.field5108 != arg1) {
                this.field5114[Integer.MAX_VALUE & this.field5110].method253(arg2, (byte) 93, arg1);
                this.field5108 = arg1;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBZIIZ)V")
    public final void method2231(int arg0, byte arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        field5109++;
        boolean var7 = arg2 & this.field5116.method1190();
        if (arg1 != -101) {
            this.field5103 = null;
        }
        if (!var7 && (arg3 == 4 || arg3 == 8 || arg3 == 9)) {
            if (arg3 == 4) {
                arg0 = arg4;
            }
            arg3 = 2;
        }
        if (arg3 != 0 && arg5) {
            arg3 |= Integer.MIN_VALUE;
        }
        if (this.field5110 != arg3) {
            if (this.field5110 != 0) {
                this.field5114[Integer.MAX_VALUE & this.field5110].method251((byte) -29);
            }
            if (arg3 != 0) {
                this.field5114[Integer.MAX_VALUE & arg3].method252((byte) 102, arg5);
                this.field5114[Integer.MAX_VALUE & arg3].method256(arg5, 28300);
                this.field5114[Integer.MAX_VALUE & arg3].method258(false, arg4, arg0);
            }
            this.field5108 = null;
            this.field5106 = arg4;
            this.field5102 = arg0;
            this.field5110 = arg3;
        } else if (this.field5110 != 0) {
            this.field5114[Integer.MAX_VALUE & this.field5110].method256(arg5, 28300);
            if (this.field5106 != arg4 || this.field5102 != arg0) {
                this.field5114[this.field5110 & Integer.MAX_VALUE].method258(false, arg4, arg0);
                this.field5106 = arg4;
                this.field5102 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
    public static void method2232(int arg0) {
        if (arg0 == -5) {
            field5111 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lmh;)V")
    public class387(class537 arg0) {
        this.field5116 = arg0;
        this.field5112 = new class535(arg0);
        this.field5114 = new class337[10];
        this.field5114[1] = new class246(arg0);
        this.field5114[2] = new class252(arg0, this.field5112);
        this.field5114[4] = new class70(arg0, this.field5112);
        this.field5114[5] = new class389(arg0, this.field5112);
        this.field5114[6] = new class48(arg0);
        this.field5114[7] = new class362(arg0);
        this.field5114[3] = this.field5103 = new class592(arg0);
        this.field5114[8] = new class603(arg0, this.field5112);
        this.field5114[9] = new class430(arg0, this.field5112);
        if (!this.field5114[8].method257((byte) 119)) {
            this.field5114[8] = this.field5114[4];
        }
        if (!this.field5114[9].method257((byte) 117)) {
            this.field5114[9] = this.field5114[8];
        }
    }
}
