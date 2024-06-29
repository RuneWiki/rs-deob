import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class129 extends class14 {

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "I")
    private int field1880 = 4096;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    private int field1882 = 0;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[S")
    public static short[] field1876 = new short[256];

    @OriginalMember(owner = "client!me", name = "R", descriptor = "[I")
    public static int[] field1881 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!me", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field1879 = new String[5];

    @OriginalMember(owner = "client!me", name = "T", descriptor = "Z")
    public static boolean field1883;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "Lvj;")
    public static class304 field1884;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Lff;")
    public static class9 field1885;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field1878;

    static {
        new class304("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field1883 = false;
        field1884 = new class304("Take", "Nehmen", "Prendre", "Pegar");
        field1885 = new class9(59, -2);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)[[I", line = 4)
    public final int[][] method141(int arg0, int arg1) {
        ++field1878;
        if (arg0 != -30909) {
            return null;
        } else {
            int[][] var3 = super.field268.method2561(arg1, 0);
            if (super.field268.field6091) {
                int[][] var4 = this.method139(0, arg0 + 30911, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class115.field1637 > var11; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field1882 < ~var12) {
                        var8[var11] = this.field1882;
                    } else if (~var12 >= ~this.field1880) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field1880;
                    }
                    if (this.field1882 <= var13) {
                        if (~this.field1880 > ~var13) {
                            var9[var11] = this.field1880;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field1882;
                    }
                    if (~var14 <= ~this.field1882) {
                        if (this.field1880 < var14) {
                            var10[var11] = this.field1880;
                        } else {
                            var10[var11] = var14;
                        }
                    } else {
                        var10[var11] = this.field1882;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V", line = 85)
    public static void method923(int arg0) {
        int var1 = -32 % ((arg0 - 5) / 61);
        field1884 = null;
        field1876 = null;
        field1881 = null;
        field1885 = null;
        field1879 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IBLmd;)V", line = 99)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field1873;
        int var4 = -83 % ((arg1 - -51) / 37);
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field263 = ~arg2.method2238(255) == -2;
                }
            } else {
                this.field1880 = arg2.method2212((byte) 83);
            }
        } else {
            this.field1882 = arg2.method2212((byte) 83);
        }
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(I)V", line = 144)
    public static final void method924(int arg0) {
        class516.field7655.method1140(114);
        ++field1875;
        class310.field4072.method387((byte) -60);
        class204.field2828.method2535((byte) 37);
        class402.field5388.method2000((byte) -71);
        class206.field2849.method2553((byte) 79);
        class127.field1852.method2401(10551);
        class423.field5791.method1605(false);
        class441.field6049.method723(0);
        class185.field2626.method2257((byte) -117);
        class206.field2850.method421(arg0 + 27191);
        class291.field3825.method130((byte) 77);
        class466.field6434.method377(true);
        class267.field3522.method1013(53);
        class159.field2353.method1405(false);
        class270.field3546.method695(107);
        class389.field5280.method653(-24061);
        class520.field7700.method2362(3);
        class201.field2792.method2835(20495);
        class31.field513.method2337(0);
        client.field2731.method927(26);
        class26.method226(12);
        class495.method2843((byte) 42);
        class155.method1067(22966);
        if (class281.field3698 != class168.field2433) {
            for (int var1 = 0; class74.field1115.length > var1; ++var1) {
                class74.field1115[var1] = null;
            }
            class231.field3109 = 0;
        }
        class516.method3044(arg0 ^ -25726);
        client.method1269(0);
        class382.method2265(-26505);
        class277.method1648(1007);
        class329.method1898(0);
        class122.field1802.method1458((byte) 92);
        class370.field4984.method574();
        class327.field4325.method1516(3);
        class456.method2604((byte) 126);
        class226.field3056.method2718(100);
        class124.field1821.method2718(100);
        class258.field3420.method2718(arg0 + 10908);
        class184.field2619.method2718(100);
        class50.field774.method2718(arg0 ^ -10836);
        class88.field1340.method2718(100);
        class449.field6118.method2718(arg0 + 10908);
        class505.field6946.method2718(100);
        class71.field1082.method2718(100);
        class273.field3581.method2718(100);
        class131.field1899.method2718(100);
        class53.field816.method2718(100);
        class48.field752.method2718(arg0 ^ -10836);
        class201.field2790.method2718(100);
        class204.field2826.method2718(100);
        class496.field6878.method2718(100);
        class347.field4685.method2718(100);
        class149.field2130.method2718(100);
        class280.field3677.method2718(100);
        if (arg0 != -10808) {
            field1881 = null;
        }
        class277.field3630.method2718(100);
        class435.field5973.method2718(100);
        class48.field753.method2718(100);
        class366.field4956.method2718(100);
        class393.field5326.method2718(100);
        class150.field2136.method2718(100);
        class461.field6375.method2718(arg0 ^ -10836);
        class98.field1471.method2718(100);
        class226.field3054.method2718(100);
        class23.field403.method2718(100);
        class359.field4848.method2718(arg0 + 10908);
        class167.field2417.method1458((byte) 125);
        class506.field6965.method1458((byte) -60);
        class176.field2561.method1458((byte) 95);
        class401.field5380.method1458((byte) -66);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)[I", line = 232)
    public final int[] method140(int arg0, byte arg1) {
        ++field1874;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            method923(85);
        }
        if (super.field270.field5222) {
            int[] var4 = this.method145(arg0, 0, -18596);
            for (int var5 = 0; ~var5 > ~class115.field1637; ++var5) {
                int var6 = var4[var5];
                if (this.field1882 <= var6) {
                    if (~var6 >= ~this.field1880) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field1880;
                    }
                } else {
                    var3[var5] = this.field1882;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V", line = 284)
    public class129() {
        super(1, false);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 290)
    public static final void method925(String arg0, byte arg1) {
        ++field1877;
        if (!arg0.equals("")) {
            class118.method822(-124, class450.field6126);
            ++class452.field6143;
            if (arg1 >= -101) {
                method925((String) null, (byte) -11);
            }
            class193.field2708.method2200(7, class125.method912(arg0, 1));
            class193.field2708.method2216(arg0, -114);
        }
    }
}
