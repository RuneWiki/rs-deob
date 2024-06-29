import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class787 extends class299 {

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11515 = new String[] { method5660(method5659("n)H.S")), method5660(method5659("n)H/S")), method5660(method5659("n)H*S")), method5660(method5659("n)H)S")), method5660(method5659("n)H+S")), method5660(method5659("n)H-S")), method5660(method5659("n)H(S")) };

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "[F")
    public static float[] field11505 = new float[4];

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field11503 = 0;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "Lqr;")
    public static class69 field11511 = new class69(16);

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "Lhl;")
    public static class556 field11513 = new class556(0, 6);

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field11504;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field11506;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field11508;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field11510;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field11512;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field11514;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "Lgda;")
    public static class58 field11509;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "Z")
    public static boolean field11502;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "[Lqc;")
    public static class777[] field11507;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)I")
    public final int method852(int arg0, int arg1) {
        try {
            ++field11514;
            return arg0 != 1 ? -50 : 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11515[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)[Lhl;")
    public static final class556[] method5656(byte arg0) {
        try {
            ++field11504;
            if (arg0 != -58) {
                field11505 = null;
            }
            return new class556[] { field11513, class345.field5605, class184.field2928, class536.field7875, class622.field8982, class368.field5979, class16.field178, class423.field6665, class75.field1091, class318.field5190, class709.field10266, class519.field7686, class128.field1841, class767.field11232, class660.field9423, class497.field7467, class521.field7695, class574.field8294, class481.field7321, class673.field9550, class419.field6626, class453.field7000, class127.field1825, class63.field853, class213.field3362, class452.field6992, class603.field8709, class536.field7877, class748.field11038, class213.field3366, class640.field9184, class299.field4851, class542.field7981, class530.field7790, class201.field3183, class455.field7032, class198.field3144, class741.field10912, class586.field8492, class13.field155, class201.field3173, class181.field2886, class504.field7548, class135.field1915, class595.field8595, class97.field1414, class628.field9047, class346.field5611, class716.field10355, class159.field2356, class317.field5170, class42.field474, class395.field6274, class476.field7245, class312.field5114, class47.field545, class760.field11165, class13.field148, class284.field4607, class451.field6984, class370.field5992, class622.field8977, class585.field8490, class581.field8372, class124.field1797, class246.field3798, class683.field9894, class541.field7978, class21.field207, class551.field8077, class320.field5207, class262.field4270, class545.field8019, class525.field7742, class561.field8139, class493.field7419, class304.field4908, class747.field11001, class256.field3890, class400.field6325, class78.field1211, class563.field8181, class759.field11154, class130.field1855, class266.field4312, class424.field6684, class585.field8489, class203.field3187, class267.field4314, class329.field5394, class606.field8735, class752.field11087, class630.field9056, class153.field2138, class337.field5494, class608.field8760, class299.field4854, class737.field10791, class746.field10996, class191.field3016, class363.field5934, class471.field7202, class430.field6764, class109.field1550, class400.field6330, class758.field11142, class656.field9403, class786.field11500, class386.field6188, class329.field5395, class708.field10184, class193.field3025, class241.field3714, class556.field8118, class597.field8644, class201.field3179, class490.field7391, class640.field9180, class740.field10891, class25.field274, class594.field8591, class68.field968, class721.field10583, class667.field9484, class149.field2087, class389.field6223, class761.field11181, class87.field1294, class54.field671, class607.field8751, class138.field1938, class136.field1922, class794.field11600, class683.field9890, class628.field9040, class580.field8360, class217.field3392, class594.field8588, class230.field3566, class95.field1378, class88.field1311, class135.field1906, class659.field9414 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11515[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public final void method848(int arg0) {
        try {
            if (~super.field4849 != -2 && ~super.field4849 != -1) {
                super.field4849 = this.method847(0);
            }
            ++field11512;
            if (arg0 != -20456) {
                this.method846(23, true);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11515[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(ILes;)V")
    public class787(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IZ)V")
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field11510;
            super.field4849 = arg0;
            if (arg1) {
                this.method846(59, false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11515[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(Z)I")
    public final int method5657(boolean arg0) {
        try {
            ++field11506;
            if (!arg0) {
                this.method848(40);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11515[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    public static void method5658(int arg0) {
        try {
            if (arg0 != 20814) {
                field11505 = null;
            }
            field11505 = null;
            field11511 = null;
            field11513 = null;
            field11509 = null;
            field11507 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11515[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)I")
    public final int method847(int arg0) {
        try {
            ++field11508;
            return arg0 != 0 ? 98 : 1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11515[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Les;)V")
    public class787(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5659(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 123);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5660(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 102;
                    break;
                case 3:
                    var10005 = 108;
                    break;
                default:
                    var10005 = 123;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
