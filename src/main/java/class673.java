import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class673 extends class134 {

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9555 = new String[] { method4873(method4872("??\u0019e8{")), method4873(method4872("??\u0019e2{")), method4873(method4872("(rVe\u0007")), method4873(method4872("??\u0019e>{")), method4873(method4872("=)\u0014'")), method4873(method4872("??\u0019e={")), method4873(method4872("??\u0019e9{")), method4873(method4872("??\u0019e;{")) };

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "Lhl;")
    public static class556 field9550 = new class556(19, -1);

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field9546;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    public static int field9547;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public static int field9548;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    private int field9549;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    private int field9551;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field9552;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field9553;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field9554;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 5)
    public static void method4868(int arg0) {
        try {
            field9550 = null;
            if (arg0 != -3) {
                method4868(52);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9555[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lsca;I)V", line = 17)
    public final void method100(class47 arg0, int arg1) {
        try {
            if (arg1 >= -81) {
                method4870((byte) 61);
            }
            arg0.method480((byte) -117, this.field9549, this.field9551);
            field9546++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9555[6] + (arg0 == null ? field9555[4] : field9555[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(ILwq;)Lvha;", line = 28)
    public static final class716 method4869(int arg0, class176 arg1) {
        try {
            field9552++;
            class131 var2 = class270.method2332(arg1, arg0 ^ 0xFFFFA51A);
            if (arg0 != -27151) {
                method4871(114, -0.08931437572273009D);
            }
            int var3 = arg1.method1622(-18712);
            int var4 = arg1.method1622(arg0 + 8439);
            return new class716(var2.field1875, var2.field1865, var2.field1872, var2.field1874, var2.field1869, var2.field1862, var2.field1859, var2.field1877, var2.field1870, var3, var4);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field9555[5] + arg0 + ',' + (arg1 == null ? field9555[4] : field9555[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 46)
    public static final void method4870(byte arg0) {
        try {
            field9547++;
            if (class708.field10187 != null) {
                if (class708.field10187.field3402 == 1) {
                    class708.field10187 = null;
                    return;
                }
                if (class708.field10187.field3402 == 2) {
                    class781.method5610(class370.field5997, 2, class310.field5090, 2);
                    class708.field10187 = null;
                    return;
                }
            }
            if (arg0 != 31) {
                method4871(-90, -1.133198694916459D);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9555[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ID)V", line = 77)
    public static final void method4871(int arg0, double arg1) {
        try {
            int var3 = 103 % ((6 - arg0) / 54);
            field9553++;
            if (class760.field11170 != arg1) {
                for (int var4 = 0; var4 < 256; var4++) {
                    int var5 = (int) (Math.pow((double) var4 / 255.0D, arg1) * 255.0D);
                    class606.field8730[var4] = var5 > 255 ? 255 : var5;
                }
                class760.field11170 = arg1;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9555[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILwq;)V", line = 112)
    public final void method102(int arg0, class176 arg1) {
        try {
            field9548++;
            this.field9551 = arg1.method1622(-18712);
            int var3 = -30 % ((83 - arg0) / 34);
            this.field9549 = arg1.method1622(-18712);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9555[3] + arg0 + ',' + (arg1 == null ? field9555[4] : field9555[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4872(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4873(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 92;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 122;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
