import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class121 {

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public static int field2832 = -1;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "[I")
    public static int[] field2833 = new int[1000];

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lrd;")
    private static class114 field2826 = class84.method656("Moderator option: Mute player for 48 hours: <OFF>", (byte) 127);

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lrd;")
    public static class114 field2825 = class84.method656("An", (byte) 122);

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lrd;")
    private static class114 field2827 = class84.method656("Continue", (byte) 114);

    @OriginalMember(owner = "client!se", name = "c", descriptor = "Lrd;")
    public static class114 field2820 = class84.method656("Freund hinzuf-Ugen", (byte) 118);

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lrd;")
    public static class114 field2822 = field2827;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "Lrd;")
    public static class114 field2831 = class84.method656("Einloggen", (byte) 125);

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Lrd;")
    private static class114 field2838 = class84.method656("Create a free account", (byte) 120);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Lrd;")
    public static class114 field2818 = field2826;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lrd;")
    public static class114 field2819 = field2838;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "Lrd;")
    public static class114 field2841 = class84.method656("lila:", (byte) 126);

    @OriginalMember(owner = "client!se", name = "z", descriptor = "Lrd;")
    private static class114 field2843 = class84.method656("and choose the (Wcreate account(W", (byte) 123);

    @OriginalMember(owner = "client!se", name = "w", descriptor = "Lrd;")
    public static class114 field2840 = field2843;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Ljd;")
    public static class66 field2834;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Loa;")
    public static class93 field2828;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "Z")
    public static boolean field2835;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)I")
    public static final int method940(int arg0, int arg1, int arg2) {
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 15106) {
            field2820 = null;
        }
        field2836++;
        return arg1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BI)I")
    public static final int method941(byte arg0, int arg1) {
        field2829++;
        if (arg0 != 69) {
            method941((byte) -32, -100);
        }
        return arg1 >> 11 & 0x3F;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(III)Z")
    public static final boolean method942(int arg0, int arg1, int arg2) {
        if (arg2 != -4) {
            return true;
        }
        field2821++;
        if (arg0 == 0 && class13.field293 == arg1) {
            return true;
        } else if (arg0 == 1 && class107.field2474 == arg1) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class128.field3053 == arg1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V")
    public static final void method943(byte arg0, Throwable arg1, String arg2) {
        field2830++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class145.method1150(-22155, arg1);
            }
            if (arg2 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class72.field1603.field882 != null) {
                int var8 = -15 / ((arg0 + 44) / 45);
                class81 var9 = class72.field1603.method308(0, new URL(class72.field1603.field882.getCodeBase(), "clienterror.ws?c=" + class116.field2693 + "&u=" + class8.field114 + "&v1=" + class43.field881 + "&v2=" + class43.field887 + "&e=" + var7));
                while (var9.field1826 == 0) {
                    class141.method1122(17525, 1L);
                }
                if (var9.field1826 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field1823;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IJ)V")
    public static final void method944(int arg0, long arg1) {
        field2823++;
        if (arg1 == 0L) {
            return;
        }
        if (class128.field3058 >= 100 && class130.field3142 != 1 || class128.field3058 >= 200) {
            class86.method660(class72.field1610, class63.field1346, true, 0);
            return;
        }
        class114 var3 = class42.method295(-26567, arg1).method863(-79);
        for (int var4 = 0; var4 < class128.field3058; var4++) {
            if (class18.field338[var4] == arg1) {
                class86.method660(class72.field1610, class101.method786((byte) 126, new class114[] { var3, class9.field137 }), true, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class89.field1986; var5++) {
            if (class84.field1874[var5] == arg1) {
                class86.method660(class72.field1610, class101.method786((byte) 126, new class114[] { class49.field1027, var3, class26.field538 }), true, 0);
                return;
            }
        }
        if (var3.method881(class7.field103.field3018, false)) {
            return;
        }
        class5.field64[class128.field3058] = var3;
        class18.field338[class128.field3058] = arg1;
        class34.field674[class128.field3058] = 0;
        class11.field191++;
        class67.field1444[class128.field3058] = 0;
        class32.field653 = class20.field370 + 1;
        class128.field3058++;
        class24.field460 = true;
        class61.field1303.method1054(8, 238);
        if (arg0 > -121) {
            field2835 = true;
        }
        class61.field1303.method455(arg1, 2);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method945(byte arg0) {
        field2827 = null;
        field2820 = null;
        field2843 = null;
        field2840 = null;
        field2831 = null;
        if (arg0 >= -51) {
            field2840 = null;
        }
        field2826 = null;
        field2834 = null;
        field2841 = null;
        field2825 = null;
        field2828 = null;
        field2822 = null;
        field2838 = null;
        field2819 = null;
        field2818 = null;
        field2833 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "([BI)[B")
    public static final byte[] method946(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        if (arg1 == -16044) {
            byte[] var3 = new byte[var2];
            field2842++;
            class35.method251(arg0, 0, var3, 0, var2);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lnd;Z)Z")
    public static final boolean method947(class90 arg0, boolean arg1) {
        if (!arg1) {
            return true;
        }
        field2837++;
        if (class1.field11) {
            if (class39.method278(arg0, 1572721824) != 0) {
                return false;
            }
            if (arg0.field2024 == 0) {
                return false;
            }
        }
        return arg0.field2092;
    }
}
