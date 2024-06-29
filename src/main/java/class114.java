import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class114 {

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lmc;")
    public static class75 field2875 = class30.method234(true, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lmc;")
    private static class75 field2878 = class30.method234(true, "RuneScape has been updated(Q");

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lmc;")
    private static class75 field2871 = class30.method234(true, "Click to continue");

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "Lmc;")
    private static class75 field2881 = class30.method234(true, "Prepared visibility map");

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "Lmc;")
    public static class75 field2874 = field2878;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field2872 = 0;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Lmc;")
    public static class75 field2873 = field2871;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "J")
    public static long field2876 = 0L;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "Lmc;")
    public static class75 field2885 = field2881;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "Lmc;")
    private static class75 field2887 = class30.method234(true, "Loading textures )2 ");

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lmc;")
    private static class75 field2886 = class30.method234(true, "Add friend");

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lmc;")
    public static class75 field2884 = field2887;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Lmc;")
    public static class75 field2880 = field2886;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lmc;")
    private static class75 field2868 = class30.method234(true, "flash2:");

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "Z")
    public static boolean field2879 = false;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Lmc;")
    public static class75 field2877 = field2868;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public static volatile int field2888 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lj;")
    public static class54 field2869;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 12)
    public static void method916(byte arg0) {
        field2877 = null;
        field2874 = null;
        field2881 = null;
        field2884 = null;
        int var1 = -79 / ((-arg0 - 13) / 51);
        field2871 = null;
        field2868 = null;
        field2875 = null;
        field2869 = null;
        field2880 = null;
        field2886 = null;
        field2887 = null;
        field2885 = null;
        field2873 = null;
        field2878 = null;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)I", line = 47)
    public static final int method917(boolean arg0) {
        field2870++;
        if (arg0) {
            method918(38, null, null);
        }
        return class7.field99++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 79)
    public static final void method918(int arg0, String arg1, Throwable arg2) {
        field2882++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class88.method735(-25519, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            if (arg0 != 12541) {
                field2871 = null;
            }
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class121 var8 = class36.field859.method981(-16938, new URL(class36.field859.field3036.getCodeBase(), "clienterror.ws?c=" + class45.field1111 + "&u=" + class119.field2946 + "&v1=" + class124.field3032 + "&v2=" + class124.field3037 + "&e=" + var7));
            while (var8.field2964 == 0) {
                class13.method86(1L, arg0 ^ 0x30FC);
            }
            if (var8.field2964 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2959;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II[B[Lba;BLed;)V", line = 131)
    public static final void method919(int arg0, int arg1, byte[] arg2, class8[] arg3, byte arg4, class29 arg5) {
        field2883++;
        if (arg4 != -83) {
            field2876 = -53L;
        }
        class61 var6 = new class61(arg2);
        int var7 = -1;
        while (true) {
            int var8 = var6.method498(arg4 - 46);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method498(-129);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 >> 12;
                int var13 = var9 & 0x3F;
                int var14 = var6.method494(20471);
                int var15 = var14 >> 2;
                int var16 = var13 + arg0;
                int var17 = arg1 + var11;
                int var18 = var14 & 0x3;
                if (var17 > 0 && var16 > 0 && var17 < 103 && var16 < 103) {
                    int var19 = var12;
                    if ((class74.field1836[1][var17][var16] & 0x2) == 2) {
                        var19 = var12 - 1;
                    }
                    class8 var20 = null;
                    if (var19 >= 0) {
                        var20 = arg3[var19];
                    }
                    class5.method25((byte) -104, var15, var20, var16, var17, var18, var12, var7, arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)I", line = 216)
    public static final int method920(int arg0) {
        field2867++;
        if (arg0 != 3) {
            method917(false);
        }
        int var1 = class126.method1000(class44.field1057, class99.field2510, false, class84.field2082);
        return var1 - class12.field235 >= 800 || (class74.field1836[class99.field2510][class84.field2082 >> 7][class44.field1057 >> 7] & 0x4) == 0 ? 3 : class99.field2510;
    }
}
