import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class144 extends class61 {

    @OriginalMember(owner = "client!ada", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field1872 = new String[] { method1250(method1249("Kt\u0012\r\u0005\u0002")), method1250(method1249("Kt\u0012\r\u0006\u0002")), method1250(method1249("Kt\u0012\r\u0007\u0002")), method1250(method1249("Kt\u0012\r\u0000\u0002")), method1250(method1249("Kt\u0012\r\u0004\u0002")), method1250(method1249("De\u001fO")), method1250(method1249("Q>]\r1")), method1250(method1249("Kt\u0012\r\u0002\u0002")), method1250(method1249("Kt\u0012\r\u0001\u0002")) };

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field1863 = new String[100];

    @OriginalMember(owner = "client!ada", name = "E", descriptor = "[I")
    public static int[] field1871 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ada", name = "H", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ada", name = "C", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ada", name = "D", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ada", name = "G", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ada", name = "A", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ada", name = "F", descriptor = "[B")
    private byte[] field1867;

    @OriginalMember(owner = "client!ada", name = "B", descriptor = "[I")
    public static int[] field1862;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IBB)V")
    public final void method665(int arg0, byte arg1, byte arg2) {
        try {
            field1869++;
            byte var8 = (byte) (((arg1 & 0xFF) >> 1) + 127);
            int var4 = arg0 * 2;
            int var5 = 51 % ((-arg2 - 39) / 55);
            int var10001 = var4;
            int var9 = var4 + 1;
            this.field1867[var10001] = var8;
            this.field1867[var9] = var8;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1872[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "(I)V")
    public static void method1243(int arg0) {
        try {
            if (arg0 > -74) {
                field1862 = null;
            }
            field1863 = null;
            field1871 = null;
            field1862 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1872[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIII)[B")
    public final byte[] method1244(int arg0, int arg1, int arg2, int arg3) {
        try {
            field1868++;
            if (arg1 < 124) {
                this.method1244(-31, -59, 85, 51);
            }
            this.field1867 = new byte[arg0 * arg2 * arg3 * 2];
            this.method5049((byte) -48, arg3, arg0, arg2);
            return this.field1867;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1872[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(IB)Z")
    public static final boolean method1245(int arg0, byte arg1) {
        try {
            field1865++;
            if (arg1 > -108) {
                field1862 = null;
            }
            return arg0 == 1 || arg0 == 3 || arg0 == 5;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1872[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "()V")
    public class144() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(ILha;IIII)V")
    public static final void method1246(int arg0, class18 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field1866++;
            class349.field5060 = arg1;
            class570.field8270 = class349.field5060.method221();
            class209.field3043 = class349.field5060.method221();
            class742.field10549 = class349.field5060.method221();
            class452.field6624 = arg2;
            class492.field7235 = null;
            class101.field1360 = arg3;
            class637.field9013 = null;
            class712.field10013 = arg0;
            class260.method2162(arg4, 12, arg5);
            class641.field9143 = -1;
            class263.field3715 = -1;
            class591.field8499 = -1;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1872[4] + arg0 + ',' + (arg1 == null ? field1872[5] : field1872[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IZIIII)V")
    public static final void method1247(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field1864++;
            if (class321.field4374 != null && (arg5 != 3 || class142.field1841 != arg3 || class789.field11399 != arg2)) {
                class653.method4747(class321.field4374, 1, class651.field9249);
                class321.field4374 = null;
            }
            if (arg5 == 3 && class321.field4374 == null) {
                class321.field4374 = class380.method3004(0, arg3, 0, class651.field9249, arg4 ^ 0x5F43, arg2);
                if (class321.field4374 != null) {
                    class789.field11399 = arg2;
                    class142.field1841 = arg3;
                    class536.method4064(10);
                }
            }
            if (arg5 == 3 && class321.field4374 == null) {
                method1247(arg0, true, -1, -1, -24334, class451.field6612.field9129.method1595(3));
            } else {
                Container var6;
                if (class321.field4374 != null) {
                    var6 = class321.field4374;
                    class40.field615 = arg2;
                    class792.field11523 = arg3;
                } else if (class543.field7942 == null) {
                    if (class290.field4091 == null) {
                        var6 = class743.field10561;
                    } else {
                        var6 = class290.field4091;
                    }
                    class792.field11523 = var6.getSize().width;
                    class40.field615 = var6.getSize().height;
                } else {
                    Insets var7 = class543.field7942.getInsets();
                    int var10001 = -var7.right;
                    class792.field11523 = class543.field7942.getSize().width + var10001 - var7.left;
                    int var12 = -var7.top;
                    class40.field615 = class543.field7942.getSize().height + var12 - var7.bottom;
                    var6 = class543.field7942;
                }
                if (arg5 == 1) {
                    class391.field5700 = class500.field7304;
                    class711.field9998 = class791.field11507;
                    class232.field3346 = 0;
                    class349.field5061 = (class792.field11523 - class500.field7304) / 2;
                } else {
                    class646.method4706(-85);
                }
                if (class398.field5793 != class35.field426) {
                    boolean var10000;
                    if (class391.field5700 < 1024 && class711.field9998 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                if (arg1) {
                    class247.method2013(arg4 ^ 0x5F66);
                } else {
                    class560.field8153.setSize(class391.field5700, class711.field9998);
                    if (class212.field3119) {
                        class437.method3408(class560.field8153, false);
                    } else {
                        class236.field3418.method168(class560.field8153, class391.field5700, class711.field9998);
                    }
                    if (class543.field7942 == var6) {
                        Insets var8 = class543.field7942.getInsets();
                        class560.field8153.setLocation(class349.field5061 + var8.left, class232.field3346 + var8.top);
                    } else {
                        class560.field8153.setLocation(class349.field5061, class232.field3346);
                    }
                }
                if (arg5 >= 2) {
                    class740.field10525 = true;
                } else {
                    class740.field10525 = false;
                }
                if (class572.field8291 != -1) {
                    class273.method2240(16664, true);
                }
                if (class60.field916.field11096 != null && class211.method1781(class559.field8139, (byte) 50)) {
                    class357.method2856(-31902);
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    class752.field10742[var9] = true;
                }
                if (arg4 != -24334) {
                    method1245(-114, (byte) -44);
                }
                class485.field7121 = true;
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1872[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IB)V")
    public static final void method1248(int arg0, byte arg1) {
        try {
            class251 var2 = class391.field5710;
            synchronized (class391.field5710) {
                class391.field5710.method2038(0, arg0);
            }
            int var3 = 116 / ((-arg1 - 70) / 53);
            field1870++;
            class251 var4 = class270.field3827;
            synchronized (class270.field3827) {
                class270.field3827.method2038(0, arg0);
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field1872[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1249(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ada", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1250(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 42;
                    break;
                case 1:
                    var10005 = 16;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
