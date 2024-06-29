import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class342 extends class324 implements class478 {

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field4874 = 0;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Z")
    public static boolean field4880 = true;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "C")
    public char field4883;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field4872;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    public int field4873;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public int field4881;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "J")
    public long field4878;

    static {
        new class474("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field4884 = 0;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)I", line = 3)
    public final int method2198(byte arg0) {
        if (arg0 <= 82) {
            return 61;
        } else {
            field4871++;
            return this.field4881;
        }
    }

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)I", line = 16)
    public final int method2199(byte arg0) {
        field4882++;
        if (arg0 >= -52) {
            this.method2205((byte) -54);
        }
        return this.field4872;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;BILjava/lang/String;)V", line = 34)
    public static final void method2200(String arg0, String arg1, int arg2, String arg3, int arg4, String arg5, byte arg6, int arg7, String arg8) {
        field4876++;
        class463 var9 = class260.field3707[99];
        if (arg6 >= -21) {
            return;
        }
        for (int var10 = 99; var10 > 0; var10--) {
            class260.field3707[var10] = class260.field3707[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class463(arg7, arg2, arg5, arg1, arg0, arg8, arg4, arg3);
        } else {
            var9.method2836(arg1, arg3, arg8, arg0, arg7, (byte) 98, arg4, arg2, arg5);
        }
        class260.field3707[0] = var9;
        class218.field2988 = class240.field3406;
        class434.field6442++;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)I", line = 65)
    public final int method2201(byte arg0) {
        field4875++;
        if (arg0 != -109) {
            this.field4872 = 25;
        }
        return this.field4873;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 77)
    public static final void method2202(int arg0) {
        field4877++;
        if (arg0 != 26) {
            return;
        }
        if (class545.field7798.toLowerCase().indexOf("microsoft") != -1) {
            class479.field7045[220] = 74;
            class479.field7045[188] = 71;
            class479.field7045[222] = 59;
            class479.field7045[189] = 26;
            class479.field7045[221] = 43;
            class479.field7045[190] = 72;
            class479.field7045[187] = 27;
            class479.field7045[192] = 58;
            class479.field7045[191] = 73;
            class479.field7045[223] = 28;
            class479.field7045[186] = 57;
            class479.field7045[219] = 42;
            return;
        }
        if (class545.field7797 == null) {
            class479.field7045[222] = 59;
            class479.field7045[192] = 58;
        } else {
            class479.field7045[520] = 59;
            class479.field7045[192] = 28;
            class479.field7045[222] = 58;
        }
        class479.field7045[92] = 74;
        class479.field7045[45] = 26;
        class479.field7045[93] = 43;
        class479.field7045[91] = 42;
        class479.field7045[46] = 72;
        class479.field7045[47] = 73;
        class479.field7045[44] = 71;
        class479.field7045[59] = 57;
        class479.field7045[61] = 27;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V", line = 128)
    public static final void method2203(int arg0, int arg1) {
        field4879++;
        class114.field1426 = 1000000000L / (long) arg1;
        if (arg0 < 48) {
            field4884 = -37;
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(B)C", line = 140)
    public final char method2204(byte arg0) {
        if (arg0 > -93) {
            method2200(null, null, -20, null, -53, null, (byte) 55, 84, null);
        }
        field4870++;
        return this.field4883;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)J", line = 154)
    public final long method2205(byte arg0) {
        if (arg0 >= -56) {
            this.field4878 = 110L;
        }
        field4869++;
        return this.field4878;
    }
}
