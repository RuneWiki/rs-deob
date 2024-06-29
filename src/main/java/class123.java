import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public abstract class class123 {

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1450 = new String[] { method1073(method1072("\u0010.y\u0000#")), method1073(method1072("\u0010.y\u0007#")) };

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[I")
    public static int[] field1449 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Lbu;")
    public static class21 field1448;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1066(int arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)I")
    public abstract int method1067(int arg0, byte arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        try {
            field1449 = null;
            field1448 = null;
            if (arg0 != -64) {
                method1068((byte) -48);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1450[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZZ)V")
    public static final void method1069(boolean arg0, boolean arg1) {
        try {
            field1446++;
            if (arg0 && class161.field2149 != null) {
                class280.field4199 = class161.field2149.field5554;
            } else {
                class280.field4199 = -1;
            }
            class712.field10330 = 0;
            class161.field2149 = null;
            class728.field10550 = null;
            class67.field705 = null;
            class161.method1384();
            class161.field2158.method3879(81);
            class628.field9194 = null;
            class439.field6483 = null;
            class647.field9369 = null;
            class253.field3922 = null;
            class388.field5859 = -1;
            class753.field10965 = null;
            class348.field5385 = -1;
            class311.field4933 = null;
            class161.field2156 = null;
            class643.field9315 = null;
            class133.field1556 = null;
            class253.field3929 = null;
            if (class161.field2147 != null) {
                class161.field2147.method620(-30398);
                class161.field2147.method621(36, 64, 128);
            }
            if (arg1) {
                field1449 = null;
            }
            if (class161.field2153 != null) {
                class161.field2153.method4607(!arg1, 64, 64);
            }
            if (class161.field2151 != null) {
                class161.field2151.method3028(true, 64);
            }
            class369.field5638.method4270(true, 64);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1450[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V")
    public abstract void method1070(byte arg0, int arg1);

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Lgj;")
    public abstract class660 method1071(int arg0);

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1072(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xB);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1073(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 98;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 87;
                    break;
                case 3:
                    var10005 = 67;
                    break;
                default:
                    var10005 = 11;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
