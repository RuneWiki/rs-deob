import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class51 implements class245 {

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public int field726;

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field728 = new String[] { method558(method557("{'9A\u0006u*1\u001b\u00044")), method558(method557("{'9A\u007f4")), method558(method557("{'9A~4")), method558(method557("{'9Ax4")), method558(method557("{'9Ay4")), method558(method557("{'9A{4")) };

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "Lsb;")
    public static class261 field725 = new class261(33, 6);

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)V", line = 3)
    public static final void method553(byte arg0) {
        try {
            if (arg0 == -59) {
                field723++;
                int var1 = class451.field6612.field9135.method4015(3);
                if (var1 == 0) {
                    class247.field3547 = null;
                    class143.method1237((byte) 127, 0);
                } else if (var1 == 1) {
                    class625.method4588(-31211, (byte) 0);
                    class143.method1237((byte) 127, 512);
                    if (class76.field1089 != null) {
                        class691.method4933((byte) 118);
                    }
                } else {
                    class625.method4588(-31211, (byte) (class671.field9454 - 4 & 0xFF));
                    class143.method1237((byte) 127, 2);
                }
                class184.field2381 = class693.field9689;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field728[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Luu;", line = 42)
    public final class240 method482(int arg0) {
        try {
            if (arg0 != 0) {
                method554(78, -41, -31, (byte) 7, 25, -48);
            }
            field722++;
            return class694.field9695;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field728[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIIBII)V", line = 55)
    public static final void method554(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        try {
            field720++;
            int var6 = 0;
            int var7 = arg4;
            int var8 = arg1 * arg1;
            int var9 = arg4 * arg4;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg4 << 1;
            int var13 = (1 - var12) * var8 + var10;
            int var14 = var9 - ((var12 - 1) * var11);
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg4 << 1) - 3) * var11;
            int var19 = (var6 + 1) * var16;
            if (arg3 == 67) {
                if (class557.field8113 <= arg0 && class50.field717 >= arg0) {
                    int var20 = class679.method4875(class507.field7453, class335.field4844, arg2 + arg1, arg3 + -68);
                    int var21 = class679.method4875(class507.field7453, class335.field4844, arg2 - arg1, -1);
                    class576.method4282(arg3 ^ 0xFFFFFFBA, var21, arg5, class529.field7682[arg0], var20);
                }
                int var22 = (arg4 - 1) * var15;
                while (var7 > 0) {
                    if (var13 < 0) {
                        while (var13 < 0) {
                            var14 += var19;
                            var13 += var17;
                            var6++;
                            var17 += var16;
                            var19 += var16;
                        }
                    }
                    if (var14 < 0) {
                        var14 += var19;
                        var13 += var17;
                        var19 += var16;
                        var6++;
                        var17 += var16;
                    }
                    var13 += -var22;
                    var14 += -var18;
                    var7--;
                    var22 -= var15;
                    var18 -= var15;
                    int var23 = arg0 - var7;
                    int var24 = arg0 + var7;
                    if (var24 >= class557.field8113 && var23 <= class50.field717) {
                        int var25 = class679.method4875(class507.field7453, class335.field4844, arg2 + var6, -1);
                        int var26 = class679.method4875(class507.field7453, class335.field4844, arg2 - var6, -1);
                        if (var23 >= class557.field8113) {
                            class576.method4282(arg3 ^ 0xFFFFFFBA, var26, arg5, class529.field7682[var23], var25);
                        }
                        if (class50.field717 >= var24) {
                            class576.method4282(arg3 ^ 0xFFFFFFBA, var26, arg5, class529.field7682[var24], var25);
                        }
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class665.method4799(var28, field728[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(IIB)Z", line = 162)
    public static final boolean method555(int arg0, int arg1, byte arg2) {
        try {
            if (arg2 != 125) {
                field725 = null;
            }
            field721++;
            return (arg0 & 0x800) != 0 | class263.method2174(arg0, 126, arg1) || class754.method5469(arg0, arg1, 12529);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field728[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)V", line = 174)
    public static void method556(byte arg0) {
        try {
            field725 = null;
            if (arg0 <= 30) {
                method556((byte) -81);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field728[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(I)V", line = 183)
    public class51(int arg0) {
        try {
            this.field726 = arg0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field728[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method557(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3A);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method558(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
