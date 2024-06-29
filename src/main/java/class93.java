import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class93 extends class81 {

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "Lsg;")
    private class30 field1875 = class220.field3976;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "Lsg;")
    public static class30 field1867 = null;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field1864 = 0;

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Lsg;")
    private static class30 field1876 = class167.method1221((byte) 33, "Please remove ");

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "Lsg;")
    public static class30 field1868 = field1876;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "Lsg;")
    public static class30 field1866 = field1876;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field1869 = 0;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ag", name = "O", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public int field1880;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "Lka;")
    private class157 field1870;

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "Lka;")
    public class157 field1879;

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "[I")
    public static int[] field1873;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLaa;I)V")
    private final void method749(byte arg0, class8 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1880 = arg1.method63((byte) 107);
        } else if (arg2 == 2) {
            this.field1887 = arg1.method63((byte) 86);
        } else if (arg2 == 3) {
            this.field1875 = arg1.method84(0);
        } else if (arg2 == 4) {
            this.field1874 = arg1.method70(65280);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method65((byte) 112);
            this.field1879 = new class157(class177.method1294(var4, (byte) -82));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method70(65280);
                class236 var7;
                if (arg2 == 5) {
                    var7 = new class196(arg1.method84(0));
                } else {
                    var7 = new class203(arg1.method70(65280));
                }
                this.field1879.method1164((byte) -38, (long) var6, var7);
            }
        }
        field1865++;
        if (arg0 < 91) {
            this.method755(-100);
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(II)Z")
    public final boolean method750(int arg0, int arg1) {
        field1877++;
        if (this.field1879 == null) {
            return false;
        }
        if (this.field1870 == null) {
            this.method755(0);
        }
        class203 var3 = (class203) this.field1870.method1168(-3, (long) arg0);
        if (var3 == null) {
            return false;
        } else {
            if (arg1 != -18253) {
                method758(99, -10);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method751(Throwable arg0, String arg1, int arg2) {
        field1883++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class109.method866(arg0, 0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            int var4 = -128 % ((-arg2 - 82) / 38);
            System.out.println("Error: " + var3);
            String var5 = var3.replace(':', '.');
            String var6 = var5.replace('@', '_');
            String var7 = var6.replace('&', '_');
            String var8 = var7.replace('#', '_');
            if (class16.field330.field1449 != null) {
                class27 var9 = class16.field330.method591(new URL(class16.field330.field1449.getCodeBase(), "clienterror.ws?c=" + class141.field2731 + "&u=" + class88.field1799 + "&v1=" + class66.field1444 + "&v2=" + class66.field1461 + "&e=" + var8), -98);
                while (var9.field493 == 0) {
                    class160.method1191(1L, 0);
                }
                if (var9.field493 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field492;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Lsg;")
    public final class30 method752(int arg0, byte arg1) {
        field1872++;
        if (this.field1879 == null) {
            return this.field1875;
        }
        class196 var3 = (class196) this.field1879.method1168(-3, (long) arg0);
        if (arg1 > -35) {
            return null;
        } else if (var3 == null) {
            return this.field1875;
        } else {
            return var3.field3549;
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    private final void method753(int arg0) {
        field1889++;
        this.field1870 = new class157(this.field1879.method1171(4));
        for (class196 var2 = (class196) this.field1879.method1178(true); var2 != null; var2 = (class196) this.field1879.method1176((byte) 22)) {
            class200 var4 = new class200(var2.field3549, (int) var2.field4215);
            this.field1870.method1164((byte) 110, var2.field3549.method287(0), var4);
        }
        int var3 = -40 % ((-arg0 - 65) / 49);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(IB)I")
    public final int method754(int arg0, byte arg1) {
        field1886++;
        int var3 = 0 / ((-arg1 - 40) / 52);
        if (this.field1879 == null) {
            return this.field1874;
        } else {
            class203 var4 = (class203) this.field1879.method1168(-3, (long) arg0);
            return var4 == null ? this.field1874 : var4.field3622;
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    private final void method755(int arg0) {
        field1878++;
        this.field1870 = new class157(this.field1879.method1171(arg0 ^ 0x4));
        if (arg0 != 0) {
            field1885 = 17;
        }
        for (class203 var2 = (class203) this.field1879.method1178(true); var2 != null; var2 = (class203) this.field1879.method1176((byte) 22)) {
            class203 var3 = new class203((int) var2.field4215);
            this.field1870.method1164((byte) -95, (long) var2.field3622, var3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILaa;)V")
    public final void method756(int arg0, class8 arg1) {
        while (true) {
            int var3 = arg1.method63((byte) 47);
            if (var3 == 0) {
                if (arg0 != 95) {
                    return;
                }
                field1888++;
                return;
            }
            this.method749((byte) 99, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lsg;I)Z")
    public final boolean method757(class30 arg0, int arg1) {
        field1881++;
        if (arg1 != 4) {
            method758(-44, -89);
        }
        if (this.field1879 == null) {
            return false;
        }
        if (this.field1870 == null) {
            this.method753(-1);
        }
        for (class200 var3 = (class200) this.field1870.method1168(-3, arg0.method287(0)); var3 != null; var3 = (class200) this.field1870.method1173(-15659)) {
            if (var3.field3575.method267(-52, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(II)V")
    public static final void method758(int arg0, int arg1) {
        if (arg1 != -1) {
            field1864 = 105;
        }
        field1882++;
        class68 var2 = class103.method830(arg0, 4, 4);
        var2.method610(arg1 + 2141640545);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method759(byte arg0) {
        field1866 = null;
        field1867 = null;
        field1873 = null;
        if (arg0 < -53) {
            field1876 = null;
            field1868 = null;
        }
    }
}
