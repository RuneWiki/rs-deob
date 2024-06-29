import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class181 extends class134 {

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    private int field2884 = -1;

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2893 = new String[] { method1712(method1711("\\$b_\u001f\u0000")), method1712(method1711("F2o\u001d")), method1712(method1711("Si-_&")), method1712(method1711("\\$b_\u001a\u0000")), method1712(method1711("\\$b_\u0018\u0000")), method1712(method1711("\\$b_\u0019\u0000")) };

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "Lhl;")
    public static class556 field2886 = new class556(41, -2);

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    private int field2885;

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    private int field2887;

    @OriginalMember(owner = "client!tca", name = "p", descriptor = "I")
    private int field2888;

    @OriginalMember(owner = "client!tca", name = "r", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!tca", name = "s", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!tca", name = "q", descriptor = "Z")
    public static boolean field2892;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 6)
    public static void method1709(int arg0) {
        try {
            if (arg0 != -19712) {
                method1709(23);
            }
            field2886 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field2893[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ILwq;)V", line = 16)
    public final void method102(int arg0, class176 arg1) {
        try {
            this.field2884 = arg1.method1687((byte) -52);
            field2889++;
            int var3 = 31 % ((83 - arg0) / 34);
            this.field2887 = arg1.method1622(-18712);
            this.field2885 = arg1.method1645((byte) -121);
            this.field2888 = arg1.method1645((byte) -114);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field2893[0] + arg0 + ',' + (arg1 == null ? field2893[1] : field2893[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V", line = 38)
    public static final void method1710(byte arg0) {
        try {
            field2890++;
            int var1 = 0;
            if (arg0 <= 25) {
                method1709(-40);
            }
            if (class623.field8996.field6400.method4643(true) == 1) {
                int var2 = var1 | 0x1;
                int var3 = var2 | 0x10;
                int var4 = var3 | 0x20;
                int var5 = var4 | 0x2;
                var1 = var5 | 0x4;
            }
            if (class623.field8996.field6363.method1140(true) == 0) {
                var1 |= 0x40;
            }
            class150.method1366(true, var1);
            class370.field5999.method4001((byte) 36, var1);
            class229.field3563.method536(28, var1);
            class395.field6267.method3137(var1, -10006);
            class779.field11366.method1862(var1, 0);
            class426.method3380(true, var1);
            class225.method1978(var1, (byte) 110);
            class758.method5475(-60, var1);
            class89.method874(3456, var1);
            class191.method1776(-10464);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field2893[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Lsca;I)V", line = 82)
    public final void method100(class47 arg0, int arg1) {
        try {
            if (arg1 < -81) {
                field2891++;
                arg0.method490(this.field2888, this.field2887, -16, this.field2884, this.field2885);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field2893[4] + (arg0 == null ? field2893[1] : field2893[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1711(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1712(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 40;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 3;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
