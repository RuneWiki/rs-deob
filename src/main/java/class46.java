import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class46 extends class33 implements class438 {

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lwaa;")
    public class33 field538;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[I")
    public static int[] field553;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "F")
    public static float field552;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "Lkn;")
    public static class455 field548;

    static {
        new class487("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field553 = new int[14];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lqa;Z)V", line = 4)
    public final void method166(class167 arg0, boolean arg1) {
        if (!arg1) {
            field548 = null;
        }
        field540++;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Lqa;B)V", line = 17)
    public final void method174(class167 arg0, byte arg1) {
        field542++;
        if (arg1 != 2) {
            this.method162(75);
        }
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 27)
    public static void method238(int arg0) {
        field553 = null;
        field548 = null;
        if (arg0 >= -104) {
            field552 = 1.1313819F;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Z", line = 40)
    public final boolean method167(boolean arg0) {
        field533++;
        if (!arg0) {
            this.method154((byte) -78);
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILqa;)Llb;", line = 51)
    public final class239 method169(int arg0, class167 arg1) {
        field534++;
        if (arg0 != -911932384) {
            this.field538 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lqa;B)V", line = 64)
    public final void method158(class167 arg0, byte arg1) {
        if (arg1 <= -76) {
            field541++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 76)
    public final void method154(byte arg0) {
        field551++;
        if (arg0 != -74) {
            method238(36);
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 87)
    public final void method165(byte arg0) {
        if (arg0 != -33) {
            field553 = null;
        }
        field546++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)Z", line = 99)
    public static final boolean method239(boolean arg0, int arg1, int arg2) {
        field535++;
        if (arg0) {
            method238(-4);
        }
        return (arg1 & 0x40000) != 0 | class611.method3560(arg2, arg1, 522) || class82.method474(arg1, arg2, (byte) 126);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILqa;)Lr;", line = 111)
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        if (arg0 != -127) {
            this.method170(41);
        }
        field536++;
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z", line = 124)
    public final boolean method162(int arg0) {
        field547++;
        if (arg0 != -177) {
            this.method157((byte) -98, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLqa;)Led;", line = 138)
    public final class115 method157(byte arg0, class167 arg1) {
        field544++;
        int var3 = 4 % ((14 - arg0) / 48);
        return this.field538.method157((byte) 102, arg1);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I", line = 148)
    public final int method171(boolean arg0) {
        field539++;
        return arg0 ? 0 : -39;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILqa;IIZLse;I)V", line = 159)
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 != -4) {
            this.method154((byte) -87);
        }
        field537++;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)I", line = 169)
    public final int method173(int arg0) {
        if (arg0 <= 30) {
            return 2;
        } else {
            field543++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILqa;IB)Z", line = 180)
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            this.method165((byte) -81);
        }
        field550++;
        return false;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIILwaa;)V", line = 201)
    public class46(int arg0, int arg1, int arg2, class33 arg3) {
        super(arg0, arg1, arg2, arg3.field364, false, false);
        this.field538 = arg3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I", line = 213)
    public final int method170(int arg0) {
        field545++;
        if (arg0 != -5527) {
            field548 = null;
        }
        return 0;
    }
}
