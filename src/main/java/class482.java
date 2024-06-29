import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class482 extends class132 {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    private int field7019;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    private int field7029;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    private int field7017;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    private int field7024;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Loi;")
    public static class169 field7027 = new class169("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Lhb;")
    public static class250 field7030 = new class250(52, 4);

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field7022;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field7026;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "Ljava/lang/String;")
    public static String field7021;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)V")
    public final void method927(int arg0, int arg1, byte arg2) {
        ++field7014;
        int var4 = this.field7029 * arg1 >> 12;
        int var5 = this.field7019 * arg1 >> 12;
        int var6 = this.field7024 * arg0 >> 12;
        int var7 = -124 / ((arg2 - -47) / 33);
        int var8 = this.field7017 * arg0 >> 12;
        class505.method3010((byte) -50, var8, var5, var4, var6, super.field1792);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2887(int arg0, byte arg1, int arg2) {
        if (arg1 != 73) {
            method2887(76, (byte) -14, -60);
        }
        ++field7020;
        if (!(~(65536 & arg2) != -1 | class127.method810(arg0, arg2, -34)) && !class187.method1234(arg0, arg2, 9)) {
            return (55 & arg0) == 0 && class386.method2304(arg0, arg2, arg1 + -74);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)V")
    public final void method928(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field7026;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
    public static final void method2888(String arg0, int arg1, String arg2, int arg3, int arg4, String arg5) {
        ++field7013;
        class376.method2194(arg5, arg1, arg0, (String) null, arg4, arg3, -1, arg2);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method2889(byte arg0) {
        ++field7022;
        try {
            if (~class520.field7691 == -2) {
                int var1 = class117.field1641.method2227(13657);
                if (~var1 < -1 && class117.field1641.method2254(arg0 ^ -68)) {
                    int var2 = var1 - class291.field3719;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class117.field1641.method2230(var2, 67);
                    return;
                }
                class117.field1641.method2241(true);
                class117.field1641.method2242((byte) 96);
                if (class181.field2362 != null) {
                    class520.field7691 = 2;
                } else {
                    class520.field7691 = 0;
                }
                class480.field6986 = null;
                class503.field7395 = null;
            }
            if (arg0 != 127) {
                method2887(-101, (byte) 32, 105);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class117.field1641.method2241(true);
            class520.field7691 = 0;
            class480.field6986 = null;
            class503.field7395 = null;
            class181.field2362 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
    public static void method2890(int arg0) {
        field7027 = null;
        if (arg0 > -57) {
            field7025 = 3;
        }
        field7021 = null;
        field7030 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILdn;)V")
    public static final void method2891(int arg0, class201 arg1) {
        class352.field4499 = arg1.method1297("titlebg", -5105);
        if (arg0 > -41) {
            method2892(-125);
        }
        ++field7023;
        class333.field4262 = arg1.method1297("logo", -5105);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZI)V")
    public final void method929(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            ++field7018;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(IIIIII)V")
    public class482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field7019 = arg2;
        this.field7029 = arg0;
        this.field7017 = arg3;
        this.field7024 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
    public static final void method2892(int arg0) {
        ++field7016;
        if (!class418.field5561) {
            class418.field5561 = true;
            if (!class421.field5647.field7707) {
                class183.field2409 += (-12.0F - class183.field2409) / 2.0F;
            } else {
                class163.field2110 = (float) (-16 & (int) class163.field2110 + -17);
            }
            class267.field3387 = true;
            if (arg0 <= 106) {
                method2889((byte) 82);
            }
        }
    }
}
