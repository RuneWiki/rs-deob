import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class326 {

    @OriginalMember(owner = "client!ft", name = "P", descriptor = "I")
    private int field49 = 20;

    @OriginalMember(owner = "client!ft", name = "O", descriptor = "I")
    private int field48 = 1365;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
    private int field56 = 0;

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
    private int field53 = 0;

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "Lgd;")
    public static class206 field52 = new class206("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "Lmc;")
    public static class78 field54 = new class78(11, 16);

    @OriginalMember(owner = "client!ft", name = "bb", descriptor = "[I")
    public static int[] field61 = new int[5];

    @OriginalMember(owner = "client!ft", name = "Q", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ft", name = "R", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ft", name = "Y", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ft", name = "Z", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIILjava/lang/Class;)Lhb;")
    public static final class471 method29(int arg0, int arg1, int arg2, Class arg3) {
        class491 var4 = class289.field3897[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class309 var5 = var4.field6845; var5 != null; var5 = var5.field4084) {
                class471 var6 = var5.field4091;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field6500 == arg1 && var6.field6491 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 > -6) {
            return null;
        } else {
            ++field59;
            int[] var3 = super.field4344.method130(arg1, -111);
            if (super.field4344.field286) {
                for (int var4 = 0; var4 < class181.field2495; ++var4) {
                    int var5 = (class389.field5375[var4] << 12) / this.field48 + this.field56;
                    int var6 = (class95.field1400[arg1] << 12) / this.field48 + this.field53;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~this.field49 < ~var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = -var12 + var11 + var7;
                        var12 = var10 * var10 >> 12;
                        ++var13;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = var13 < this.field49 + -1 ? (var13 << 12) / this.field49 : 0;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method31(int arg0, String arg1) {
        ++field50;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; class65.field865 > var2; ++var2) {
                if (arg1.equalsIgnoreCase(class332.field4505[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class98.field1437[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V")
    public static final void method32(byte arg0) {
        if (class416.field5659 != 0) {
            class390.field5423 -= class416.field5659 * 5;
            if (class390.field5423 >= class11.field130) {
                class390.field5423 = class11.field130 + -1;
            }
            if (class390.field5423 < 0) {
                class390.field5423 = 0;
            }
            class416.field5659 = 0;
        }
        ++field51;
        if (class38.field560 < 102) {
            class38.field560 += 6;
        }
        for (int var1 = 0; ~var1 > ~class150.field2120; ++var1) {
            int var2 = class375.field5173[var1].method148(-26944);
            char var3 = class375.field5173[var1].method143(12088);
            if (var2 == 84) {
                class193.method1100(false);
            } else if (class449.field6111.method882((byte) -85, 82) && ~var2 == -67) {
                if (class298.field3995 != null) {
                    String var8 = "";
                    for (int var9 = class471.field6495.length + -1; ~var9 <= -1; --var9) {
                        if (class471.field6495[var9] != null && class471.field6495[var9].length() > 0) {
                            var8 = var8 + class471.field6495[var9] + '\n';
                        }
                    }
                    class298.field3995.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class449.field6111.method882((byte) -93, 82) && var2 == 67) {
                if (class298.field3995 != null) {
                    Transferable var4 = class298.field3995.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class490.method2852(0, '\n', var5);
                                if (var6.length <= 1) {
                                    class309.field4083 = class309.field4083 + var5;
                                } else {
                                    for (int var7 = 0; var6.length > var7; ++var7) {
                                        class309.field4083 = var6[var7];
                                        class193.method1100(false);
                                    }
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (~var2 == -86 && class102.field1471 > 0) {
                class309.field4083 = class309.field4083.substring(0, class102.field1471 + -1) + class309.field4083.substring(class102.field1471);
                --class102.field1471;
            } else if (var2 == 101 && ~class102.field1471 > ~class309.field4083.length()) {
                class309.field4083 = class309.field4083.substring(0, class102.field1471) + class309.field4083.substring(class102.field1471 - -1);
            } else if (var2 == 96 && class102.field1471 > 0) {
                --class102.field1471;
            } else if (var2 == 97 && ~class102.field1471 > ~class309.field4083.length()) {
                ++class102.field1471;
            } else if (~var2 != -103) {
                if (~var2 != -104) {
                    if (~var2 == -105 && ~class471.field6495.length < ~class30.field402) {
                        ++class30.field402;
                        class30.method176(8);
                        class102.field1471 = class309.field4083.length();
                    } else if (var2 == 105 && ~class30.field402 < -1) {
                        --class30.field402;
                        class30.method176(8);
                        class102.field1471 = class309.field4083.length();
                    } else if (class387.method2379(28407, var3) || var3 == ':' || ~var3 == -45 || ~var3 == -33 || ~var3 == -96 || ~var3 == -46 || var3 == '+' || var3 == '[' || ~var3 == -94) {
                        class309.field4083 = class309.field4083.substring(0, class102.field1471) + class375.field5173[var1].method143(12088) + class309.field4083.substring(class102.field1471);
                        ++class102.field1471;
                    }
                } else {
                    class102.field1471 = class309.field4083.length();
                }
            } else {
                class102.field1471 = 0;
            }
        }
        class150.field2120 = 0;
        for (int var10 = 0; ~var10 > -101; ++var10) {
            class377.field5193[var10] += class175.field2390[var10];
            if (~(class377.field5193[var10] >> 4) <= -351) {
                class377.field5196[var10] = (int) (Math.random() * (double) class424.field5738) << 4;
                class377.field5193[var10] = 0;
                class138.field2010[var10] = (int) (Math.random() * 102.0D) - -51;
                class175.field2390[var10] = (int) (48.0D * Math.random()) + 8;
            }
        }
        if (arg0 > 69) {
            class480.method2803((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 > -3) {
            field54 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field53 = arg1.method215((byte) 124);
                    }
                } else {
                    this.field56 = arg1.method215((byte) 97);
                }
            } else {
                this.field49 = arg1.method215((byte) 123);
            }
        } else {
            this.field48 = arg1.method215((byte) 125);
        }
        ++field58;
    }

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "(I)V")
    public static void method34(int arg0) {
        field61 = null;
        if (arg0 != 102) {
            method34(102);
        }
        field52 = null;
        field54 = null;
    }

    static {
        new class206("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
    }
}
