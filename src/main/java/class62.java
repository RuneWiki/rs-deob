import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class62 {

    @OriginalMember(owner = "client!tt", name = "k", descriptor = "I")
    private int field717 = 0;

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "Lhe;")
    private class252 field719 = null;

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "I")
    private int field711 = 0;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    private int field721 = 0;

    @OriginalMember(owner = "client!tt", name = "g", descriptor = "Lur;")
    private class377 field713;

    @OriginalMember(owner = "client!tt", name = "h", descriptor = "Lqf;")
    private class482 field714;

    @OriginalMember(owner = "client!tt", name = "i", descriptor = "[Lov;")
    private class125[] field715;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "Ltf;")
    public class195 field722;

    @OriginalMember(owner = "client!tt", name = "j", descriptor = "[I")
    public static int[] field716 = new int[4];

    @OriginalMember(owner = "client!tt", name = "f", descriptor = "J")
    public static long field712 = 0L;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public static int field718;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "[I")
    public static int[] field710;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZLhe;I)Z")
    public final boolean method370(boolean arg0, class252 arg1, int arg2) {
        field709++;
        if (this.field711 == 0) {
            return false;
        }
        if (!arg0) {
            field710 = null;
        }
        if (this.field719 != arg1) {
            this.field715[Integer.MAX_VALUE & this.field711].method669(67, arg1, arg2);
            this.field719 = arg1;
        }
        return true;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLug;)Lic;")
    public static final class495 method371(byte arg0, class396 arg1) {
        if (arg0 != -29) {
            field710 = null;
        }
        field720++;
        class495 var2 = new class495();
        var2.field7223 = arg1.method2386(-23648);
        var2.field7229 = class253.field3371.method1481(var2.field7223, (byte) -120);
        return var2;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)I")
    public static final int method372(int arg0, int arg1) {
        field707++;
        if (arg0 != 32841) {
            field710 = null;
        }
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZIBZII)V")
    public final void method373(boolean arg0, int arg1, byte arg2, boolean arg3, int arg4, int arg5) {
        boolean var7 = arg3 & this.field713.method1149();
        field718++;
        if (!var7 && (arg1 == 4 || arg1 == 8 || arg1 == 9)) {
            if (arg1 == 4) {
                arg4 = arg5;
            }
            arg1 = 2;
        }
        if (arg1 != 0 && arg0) {
            arg1 |= Integer.MIN_VALUE;
        }
        if (this.field711 != arg1) {
            if (this.field711 != 0) {
                this.field715[Integer.MAX_VALUE & this.field711].method667(-18112);
            }
            if (arg1 != 0) {
                this.field715[arg1 & Integer.MAX_VALUE].method668(arg0, 0);
                this.field715[arg1 & Integer.MAX_VALUE].method665(arg0, 119);
                this.field715[arg1 & Integer.MAX_VALUE].method662(-108, arg4, arg5);
            }
            this.field719 = null;
            this.field721 = arg5;
            this.field711 = arg1;
            this.field717 = arg4;
        } else if (this.field711 != 0) {
            this.field715[this.field711 & Integer.MAX_VALUE].method665(arg0, 110);
            if (this.field721 != arg5 || this.field717 != arg4) {
                this.field715[this.field711 & Integer.MAX_VALUE].method662(-39, arg4, arg5);
                this.field721 = arg5;
                this.field717 = arg4;
            }
        }
        if (arg2 != 115) {
            field710 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
    public static void method374(boolean arg0) {
        if (!arg0) {
            field712 = 39L;
        }
        field710 = null;
        field716 = null;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(BI)Z")
    public final boolean method375(byte arg0, int arg1) {
        if (arg0 <= 92) {
            this.field711 = -23;
        }
        field723++;
        return this.field715[arg1].method666(-57);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lur;)V")
    public class62(class377 arg0) {
        this.field713 = arg0;
        this.field714 = new class482(arg0);
        this.field715 = new class125[10];
        this.field715[1] = new class118(arg0);
        this.field715[2] = new class492(arg0, this.field714);
        this.field715[4] = new class352(arg0, this.field714);
        this.field715[5] = new class181(arg0, this.field714);
        this.field715[6] = new class457(arg0);
        this.field715[7] = new class107(arg0);
        this.field715[3] = this.field722 = new class195(arg0);
        this.field715[8] = new class445(arg0, this.field714);
        this.field715[9] = new class430(arg0, this.field714);
        if (!this.field715[8].method666(-60)) {
            this.field715[8] = this.field715[4];
        }
        if (!this.field715[9].method666(117)) {
            this.field715[9] = this.field715[8];
        }
    }
}
