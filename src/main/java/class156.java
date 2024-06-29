import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class class156 extends class90 {

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public int field2165;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    public static int field2172 = 1405;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!in", name = "B", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "Ltp;")
    public static class132 field2167;

    @OriginalMember(owner = "client!in", name = "C", descriptor = "Ldp;")
    public static class319 field2175;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "[I")
    public static int[] field2170;

    @OriginalMember(owner = "client!in", name = "D", descriptor = "[Lv;")
    public static class426[] field2176;

    static {
        new class332("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLbk;Lbk;)V", line = 3)
    public static final void method1061(byte arg0, class90 arg1, class90 arg2) {
        if (arg0 != -112) {
            field2175 = null;
        }
        field2174++;
        if (arg2.field1252 != null) {
            arg2.method701(arg0 - 7);
        }
        arg2.field1252 = arg1;
        arg2.field1253 = arg1.field1253;
        arg2.field1252.field1253 = arg2;
        arg2.field1253.field1252 = arg2;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(ZZ)V", line = 20)
    public static final void method1062(boolean arg0, boolean arg1) {
        field2168++;
        class271.field4056 = 0;
        class345.field5250 = 0;
        class361.method2218(-16829);
        class163.method1104(arg1, (byte) -98);
        class461.method2717(-108);
        if (!arg0) {
            method1065((byte) -38, (char) 65475);
        }
        for (int var2 = 0; var2 < class271.field4056; var2++) {
            int var4 = class3.field72[var2];
            if (class452.field6418 != class18.field241[var4].field4595) {
                if (class18.field241[var4].field5309.method1779(92)) {
                    class439.method2556(false, class18.field241[var4]);
                }
                class18.field241[var4].method2154((class273) null, (byte) 48);
                class18.field241[var4] = null;
            }
        }
        if (class95.field1342 != class220.field3246.field6315) {
            throw new RuntimeException("gnp1 pos:" + class220.field3246.field6315 + " psize:" + class95.field1342);
        }
        for (int var3 = 0; var3 < class256.field3797; var3++) {
            if (class18.field241[class236.field3441[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class256.field3797);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BC)B", line = 77)
    public static final byte method1065(byte arg0, char arg1) {
        int var2 = 40 % ((arg0 + 28) / 48);
        field2173++;
        byte var3;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var3 = (byte) arg1;
        } else if (arg1 == '€') {
            var3 = -128;
        } else if (arg1 == '‚') {
            var3 = -126;
        } else if (arg1 == 'ƒ') {
            var3 = -125;
        } else if (arg1 == '„') {
            var3 = -124;
        } else if (arg1 == '…') {
            var3 = -123;
        } else if (arg1 == '†') {
            var3 = -122;
        } else if (arg1 == '‡') {
            var3 = -121;
        } else if (arg1 == 'ˆ') {
            var3 = -120;
        } else if (arg1 == '‰') {
            var3 = -119;
        } else if (arg1 == 'Š') {
            var3 = -118;
        } else if (arg1 == '‹') {
            var3 = -117;
        } else if (arg1 == 'Œ') {
            var3 = -116;
        } else if (arg1 == 'Ž') {
            var3 = -114;
        } else if (arg1 == '‘') {
            var3 = -111;
        } else if (arg1 == '’') {
            var3 = -110;
        } else if (arg1 == '“') {
            var3 = -109;
        } else if (arg1 == '”') {
            var3 = -108;
        } else if (arg1 == '•') {
            var3 = -107;
        } else if (arg1 == '–') {
            var3 = -106;
        } else if (arg1 == '—') {
            var3 = -105;
        } else if (arg1 == '˜') {
            var3 = -104;
        } else if (arg1 == '™') {
            var3 = -103;
        } else if (arg1 == 'š') {
            var3 = -102;
        } else if (arg1 == '›') {
            var3 = -101;
        } else if (arg1 == 'œ') {
            var3 = -100;
        } else if (arg1 == 'ž') {
            var3 = -98;
        } else if (arg1 == 'Ÿ') {
            var3 = -97;
        } else {
            var3 = 63;
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V", line = 202)
    public class156(int arg0) {
        this.field2165 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BLui;Lui;)V", line = 215)
    public static final void method1066(byte arg0, class451 arg1, class451 arg2) {
        class83.field1179 = arg1;
        field2166++;
        if (arg0 != -89) {
            method1062(true, false);
        }
        class170.field2429 = arg2;
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V", line = 228)
    public static void method1067(int arg0) {
        field2167 = null;
        int var1 = -46 % ((arg0 + 52) / 55);
        field2170 = null;
        field2175 = null;
        field2176 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Z")
    public abstract boolean method1063(byte arg0);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method1064(byte arg0);
}
