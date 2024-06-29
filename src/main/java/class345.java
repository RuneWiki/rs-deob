import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class345 extends class687 {

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Liia;")
    public class264 field5019;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "Lel;")
    public class585 field5024;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field5031 = new String[] { method2772(method2771("6r\fP")), method2772(method2771("5jN}!")), method2772(method2771("#)N\u0012t")), method2772(method2771("5jN\u0000`6n\u0014\u0002!")), method2772(method2771("5jNy!")), method2772(method2771("5jN~!")), method2772(method2771("5jNx!")), method2772(method2771("5jN\u007f!")) };

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field5028 = 0;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "Lmv;")
    public static class125 field5018 = new class125(87, 0);

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Luu;")
    public static class240 field5029 = new class240(1, 2);

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "I")
    public int field5020;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "I")
    public static int field5021;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    public int field5025;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public int field5026;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public int field5027;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Leca;")
    public static class590 field5030;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BI)V")
    public static final void method2766(byte arg0, int arg1) {
        try {
            field5021++;
            if (arg0 != 109) {
                method2767(null, -106, -57, 26, null, 94);
            }
            if (class398.field5797 == 1) {
                class381.field5556 = arg1;
            } else if (class398.field5797 == 2) {
                class555.field8081 = arg1;
                return;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5031[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lsba;IIILka;I)V")
    public static final void method2767(class311 arg0, int arg1, int arg2, int arg3, class761 arg4, int arg5) {
        try {
            field5016++;
            if (arg4 != null) {
                if (arg3 >= -125) {
                    field5029 = null;
                }
                arg0.method2485(arg4.method417(), arg4.method432(), arg4.method385(), arg4.method377(), arg4.method433(), arg4.method410(), arg1, arg4.method414(), arg2, -64, arg5);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field5031[4] + (arg0 == null ? field5031[0] : field5031[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field5031[0] : field5031[2]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Llga;I)V")
    public static final void method2768(class47 arg0, int arg1) {
        try {
            if (arg1 == 2) {
                class249.field3564 = arg0;
                field5023++;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5031[1] + (arg0 == null ? field5031[0] : field5031[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method2769(int arg0) {
        try {
            field5022++;
            this.field5020 = this.field5019.field3727;
            this.field5017 = this.field5019.field3733;
            this.field5025 = this.field5019.field3734;
            if (this.field5019.field3726 != null) {
                this.field5019.field3726.method718(this.field5024.field8452, this.field5024.field8450, this.field5024.field8453, class305.field4246);
            }
            this.field5026 = class305.field4246[2];
            this.field5027 = class305.field4246[0];
            if (arg0 >= -115) {
                field5030 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field5031[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
    public static void method2770(int arg0) {
        try {
            field5029 = null;
            if (arg0 != 1) {
                field5018 = null;
            }
            field5018 = null;
            field5030 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field5031[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Liia;Lit;)V")
    public class345(class264 arg0, class464 arg1) {
        try {
            this.field5019 = arg0;
            this.field5024 = this.field5019.method2180(-65536);
            this.method2769(-124);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field5031[3] + (arg0 == null ? field5031[0] : field5031[2]) + ',' + (arg1 == null ? field5031[0] : field5031[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2771(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x9);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2772(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 88;
                    break;
                case 1:
                    var10005 = 7;
                    break;
                case 2:
                    var10005 = 96;
                    break;
                case 3:
                    var10005 = 60;
                    break;
                default:
                    var10005 = 9;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
