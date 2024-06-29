import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class275 extends class202 implements class161 {

    @OriginalMember(owner = "client!nm", name = "L", descriptor = "Lso;")
    public class202 field4321;

    @OriginalMember(owner = "client!nm", name = "M", descriptor = "Lfh;")
    public static class194 field4322 = new class194(new byte[5000]);

    @OriginalMember(owner = "client!nm", name = "R", descriptor = "[F")
    public static float[] field4327 = new float[16384];

    @OriginalMember(owner = "client!nm", name = "S", descriptor = "[F")
    public static float[] field4328 = new float[16384];

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!nm", name = "P", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
    public static int field4326;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4327[var2] = (float) Math.sin((double) var2 * var0);
            field4328[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lza;III)Z", line = 6)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 23) {
            return false;
        } else {
            field4312++;
            return false;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(IIIIILso;)V", line = 17)
    public class275(int arg0, int arg1, int arg2, int arg3, int arg4, class202 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class445.method2746(arg1, -82, arg0));
        this.field4321 = arg5;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)I", line = 25)
    public final int method103(int arg0) {
        field4317++;
        if (arg0 > -10) {
            this.method104((byte) 10);
        }
        return 0;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Z", line = 37)
    public final boolean method104(byte arg0) {
        field4316++;
        int var2 = -81 % ((arg0 + 41) / 38);
        return false;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)I", line = 48)
    public final int method97(int arg0) {
        field4319++;
        return arg0 <= 82 ? -24 : 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILza;)V", line = 60)
    public final void method98(int arg0, class299 arg1) {
        field4318++;
        if (arg0 != 31203) {
            this.method109(null, 67, 126, 51);
        }
    }

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V", line = 70)
    public static void method1877(byte arg0) {
        field4322 = null;
        field4328 = null;
        field4327 = null;
        if (arg0 != -11) {
            method1877((byte) -21);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIBII)V", line = 82)
    public static final void method1878(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        if (arg6 > -20) {
            field4322 = null;
        }
        field4325++;
        if (class31.method189(14, arg2)) {
            if (class394.field5749[arg2] == null) {
                class128.method941(arg3, arg7, arg4, arg0, arg5, arg8, 1, -1, arg1, class237.field3555[arg2]);
            } else {
                class128.method941(arg3, arg7, arg4, arg0, arg5, arg8, 1, -1, arg1, class394.field5749[arg2]);
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class434.field6439[var9] = true;
            }
        } else {
            class434.field6439[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(B)I", line = 117)
    public final int method1421(byte arg0) {
        field4326++;
        int var2 = 90 / ((-arg0 - 48) / 35);
        return 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I", line = 131)
    public final int method99(byte arg0) {
        if (arg0 == -107) {
            field4314++;
            return 0;
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(ILza;)Lhp;", line = 142)
    public final class293 method110(int arg0, class299 arg1) {
        field4323++;
        if (arg0 != 0) {
            method1877((byte) 97);
        }
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lza;B)V", line = 155)
    public final void method96(class299 arg0, byte arg1) {
        field4313++;
        if (arg1 < 78) {
            this.field4321 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)V", line = 169)
    public static final void method1879(byte arg0, int arg1) {
        field4309++;
        class357.field5290 = -1;
        class240.field3593 = -1;
        if (arg0 != 103) {
            field4328 = null;
        }
        class445.field6617 = arg1;
        class321.method2121(24659);
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 183)
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            field4320++;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lza;IZ)Le;", line = 194)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        field4324++;
        if (!arg2) {
            field4322 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLza;)V", line = 206)
    public final void method100(byte arg0, class299 arg1) {
        field4310++;
        if (arg0 != 51) {
            this.method103(-5);
        }
    }
}
