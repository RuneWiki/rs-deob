import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class147 implements class236 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Leh;")
    public static class53 field2686 = new class53(5);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    public static int[] field2687;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    public static int[] field2692;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILo;)V")
    public static final void method1053(int arg0, class153 arg1) {
        short var2 = 256;
        field2688++;
        if (arg0 != -6275) {
            method1053(27, null);
        }
        for (int var3 = 0; var3 < class209.field3747.length; var3++) {
            class209.field3747[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class209.field3747[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class209.field3752[var15] = (class209.field3747[var15 - 128] + class209.field3747[var15 - 1] + class209.field3747[var15 + 1] + class209.field3747[var15 + 128]) / 4;
                }
            }
            int[] var13 = class209.field3747;
            class209.field3747 = class209.field3752;
            class209.field3752 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3337; var7++) {
            for (int var8 = 0; var8 < arg1.field3340; var8++) {
                if (arg1.field2754[var6++] != 0) {
                    int var9 = var8 + arg1.field3345 + 16;
                    int var10 = var7 + arg1.field3341 + 16;
                    int var11 = var9 + (var10 << 7);
                    class209.field3747[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([IIJB)Lkh;")
    public final class117 method1054(int[] arg0, int arg1, long arg2, byte arg3) {
        field2696++;
        if (arg1 == 0) {
            class140 var6 = class58.method440((byte) 125, arg0[0]);
            return var6.method951((int) arg2, 0);
        } else if (arg1 == 1 || arg1 == 10) {
            class154 var7 = class214.method1408((byte) 102, (int) arg2);
            return var7.field2812;
        } else {
            if (arg3 <= 88) {
                method1055(5, null, null);
            }
            return arg1 == 6 || arg1 == 7 ? class58.method440((byte) -73, arg0[0]).method951((int) arg2, 0) : null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V")
    public static final void method1055(int arg0, String arg1, Throwable arg2) {
        field2694++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class57.method435(126, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class154.field2787.field2423 != null) {
                class65 var8 = class154.field2787.method897(0, new URL(class154.field2787.field2423.getCodeBase(), "clienterror.ws?c=" + class53.field1093 + "&u=" + class221.field3991 + "&v1=" + class134.field2407 + "&v2=" + class134.field2409 + "&e=" + var7));
                if (arg0 != 6678) {
                    field2686 = null;
                }
                while (var8.field1262 == 0) {
                    class165.method1167(-22942, 1L);
                }
                if (var8.field1262 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1259;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1056(int arg0) {
        if (arg0 == 12106) {
            field2692 = null;
            field2686 = null;
            field2687 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BD)V")
    public static final void method1057(byte arg0, double arg1) {
        field2698++;
        if (arg0 != -24) {
            method1056(-128);
        }
        if (class232.field4172 == arg1) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
            class123.field2301[var3] = var4 > 255 ? 255 : var4;
        }
        class232.field4172 = arg1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILah;)V")
    public static final void method1058(int arg0, int arg1, int arg2, class9 arg3) {
        field2689++;
        if (class201.field3645 != 0 && class201.field3645 != 3) {
            return;
        }
        int var4 = arg0 - arg3.field256 / 2;
        int var5 = arg2 - arg3.field207 / 2;
        int var6 = client.field776 + class13.field427 & 0x7FF;
        int var7 = class89.field1650[var6];
        int var8 = class89.field1646[var6];
        int var9 = (class174.field3151 + 256) * var8 >> 8;
        int var10 = (class174.field3151 + arg1) * var7 >> 8;
        int var11 = var5 * var9 - var4 * var10 >> 11;
        int var12 = class93.field1712.field4221 - var11 >> 7;
        int var13 = var5 * var10 + var4 * var9 >> 11;
        int var14 = class93.field1712.field4244 + var13 >> 7;
        boolean var15 = class169.method1190(var12, 1, 0, true, 0, (byte) 99, class93.field1712.field4266[0], class93.field1712.field4259[0], 0, var14, 0, 0);
        if (!var15) {
            return;
        }
        class105.field1911.method1002(false, var4);
        class105.field1911.method1002(false, var5);
        class105.field1911.method993(false, client.field776);
        class105.field1911.method1002(false, 57);
        class105.field1911.method1002(false, class13.field427);
        class105.field1911.method1002(false, class174.field3151);
        class105.field1911.method1002(false, 89);
        class105.field1911.method993(false, class93.field1712.field4244);
        class105.field1911.method993(false, class93.field1712.field4221);
        class105.field1911.method1002(false, class216.field3931);
        class105.field1911.method1002(false, 63);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILah;)Lah;")
    public static final class9 method1059(int arg0, class9 arg1) {
        field2690++;
        if (arg1.field175 != -1) {
            return class119.method837((byte) 97, arg1.field175);
        }
        int var2 = arg1.field218 >>> 16;
        if (arg0 >= -71) {
            field2687 = null;
        }
        for (class73 var3 = (class73) class11.field371.method456((byte) 112); var3 != null; var3 = (class73) class11.field371.method459((byte) -87)) {
            if (var3.field1397 == var2) {
                return class119.method837((byte) 122, (int) var3.field389);
            }
        }
        return null;
    }
}
