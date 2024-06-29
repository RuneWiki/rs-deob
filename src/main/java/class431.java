import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class431 extends class578 implements class438 {

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Llaa;")
    public class578 field6312;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field6313 = -1;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field6307;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field6310;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field6311;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "I")
    public static int field6314;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "I")
    public static int field6315;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)I")
    public final int method170(int arg0) {
        if (arg0 == -5527) {
            field6308++;
            return 0;
        } else {
            return 16;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLqa;)Led;")
    public final class115 method157(byte arg0, class167 arg1) {
        field6323++;
        int var3 = 13 / ((arg0 - 14) / 48);
        return this.field6312.method157((byte) 120, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;B)V")
    public final void method158(class167 arg0, byte arg1) {
        field6318++;
        if (arg1 > -76) {
            this.method170(88);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIIILlaa;)V")
    public class431(int arg0, int arg1, int arg2, int arg3, int arg4, class578 arg5) {
        super(arg2, arg3, arg4, class51.method262(arg1, arg0, (byte) 119));
        this.field6312 = arg5;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lqa;Z)V")
    public final void method166(class167 arg0, boolean arg1) {
        if (!arg1) {
            field6313 = 55;
        }
        field6314++;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Z)Z")
    public final boolean method167(boolean arg0) {
        field6316++;
        if (!arg0) {
            this.method160(97, null, -25, -5, true, null, -18);
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BILqa;)Lr;")
    public final class520 method161(byte arg0, int arg1, class167 arg2) {
        field6320++;
        if (arg0 != -127) {
            field6322 = -72;
        }
        return null;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lqa;B)V")
    public final void method174(class167 arg0, byte arg1) {
        if (arg1 != 2) {
            this.field6312 = null;
        }
        field6307++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILqa;IB)Z")
    public final boolean method164(int arg0, class167 arg1, int arg2, byte arg3) {
        if (arg3 != 77) {
            field6322 = -17;
        }
        field6309++;
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method154(byte arg0) {
        field6315++;
        if (arg0 != -74) {
            this.method162(-78);
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)I")
    public static final int method2639(int arg0, int arg1, int arg2) {
        field6311++;
        if (arg0 <= 17) {
            method2639(82, 95, 21);
        }
        int var3 = class418.method2482((byte) 97, arg1 - 1, arg2 + -1) + class418.method2482((byte) 90, arg1 - 1, arg2 + 1) + class418.method2482((byte) 89, arg1 + 1, arg2 - 1) + class418.method2482((byte) 91, arg1 - -1, arg2 + 1);
        int var4 = class418.method2482((byte) 102, arg1, arg2 - 1) + class418.method2482((byte) 83, arg1, arg2 + 1) + class418.method2482((byte) 120, arg1 + -1, arg2) + class418.method2482((byte) 85, arg1 - -1, arg2);
        int var5 = class418.method2482((byte) 114, arg1, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Z")
    public final boolean method162(int arg0) {
        field6310++;
        if (arg0 != -177) {
            this.field6312 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)I")
    public final int method173(int arg0) {
        field6324++;
        if (arg0 < 30) {
            field6322 = 98;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public final void method165(byte arg0) {
        field6321++;
        if (arg0 != -33) {
            field6322 = -87;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)I")
    public final int method171(boolean arg0) {
        field6317++;
        if (!arg0) {
            this.field6312 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILqa;IIZLse;I)V")
    public final void method160(int arg0, class167 arg1, int arg2, int arg3, boolean arg4, class198 arg5, int arg6) {
        if (arg2 == -4) {
            field6319++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILqa;)Llb;")
    public final class239 method169(int arg0, class167 arg1) {
        if (arg0 != -911932384) {
            this.field6312 = null;
        }
        field6325++;
        return null;
    }
}
