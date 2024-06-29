import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class480 extends class8 {

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
    public boolean field7143 = false;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Z")
    public boolean field7152 = false;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public int field7139;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public int field7142;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public int field7149;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "[C")
    public static char[] field7148 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field7146 = new String[100];

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Lbu;")
    public static class17 field7145;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "Lbi;")
    public static class333 field7153;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Lf;")
    public static class529 field7140;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7144++;
        if (arg3 >= class315.field4754 && class156.field2455 >= arg0 && arg1 >= class70.field1213 && arg4 <= class389.field5859) {
            if (arg6 == 1) {
                class53.method471(arg1, false, arg2, arg0, arg4, arg3);
            } else {
                class285.method1814(arg0, arg2, arg3, arg6, arg1, (byte) 80, arg4);
            }
        } else if (arg6 == 1) {
            class157.method1179(arg1, arg3, arg2, arg0, (byte) 71, arg4);
        } else {
            class446.method2662(arg3, arg2, arg1, arg4, arg0, (byte) 108, arg6);
        }
        if (arg5 != 8055) {
            method2859((byte) 56);
        }
    }

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(B)V")
    public static void method2859(byte arg0) {
        field7145 = null;
        field7153 = null;
        if (arg0 == 42) {
            field7140 = null;
            field7146 = null;
            field7148 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZ)V")
    public static final void method2860(int arg0, boolean arg1) {
        field7147++;
        class386.method2389(15804);
        if (class281.field4023 != 30 && class281.field4023 != 25) {
            return;
        }
        class121.field1962++;
        if (class121.field1962 < 50 && !arg1 || arg0 != 22662) {
            return;
        }
        class121.field1962 = 0;
        if (!class83.field1448 && class116.field1927 != null) {
            class28.method321(client.field2873, -5001);
            class447.field6707++;
            try {
                class116.field1927.method1304(class410.field6141.field2270, 0, class410.field6141.field2289, (byte) -104);
                class410.field6141.field2289 = 0;
            } catch (IOException var2) {
                class83.field1448 = true;
            }
        }
        class386.method2389(arg0 ^ 0x653A);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method2861(int arg0, int arg1, int arg2) {
        if (arg2 != 11221) {
            field7140 = null;
        }
        field7151++;
        return class208.method1408(arg2 ^ 0x2BD1, arg0, arg1) & class196.method1364(arg1, false, arg0);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Len;B)V")
    public static final void method2862(class208 arg0, byte arg1) {
        field7141++;
        if (arg1 == 82 && !class197.field2903) {
            arg0.method2090(-1);
            class363.field5500--;
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(IIIZZ)V")
    public class480(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field7139 = arg1;
        this.field7152 = arg4;
        this.field7143 = arg3;
        this.field7142 = arg2;
        this.field7149 = arg0;
    }
}
