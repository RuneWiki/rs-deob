import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class119 {

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
    private int[] field2401;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2406 = 0;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "Leh;")
    public static class47 field2408 = class195.method1282((byte) -4, "_");

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Leh;")
    public static class47 field2409 = class195.method1282((byte) -4, "Einloggen");

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2410 = new CRC32();

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Leh;")
    private static class47 field2416 = class195.method1282((byte) -4, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "Leh;")
    public static class47 field2411 = field2416;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field2418 = 4;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "[[Lpg;")
    public static class142[][] field2414 = new class142[field2418][500];

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Leh;")
    public static class47 field2417 = class195.method1282((byte) -4, "VOLL");

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Leh;")
    public static class47 field2419 = class195.method1282((byte) -4, "<)4col> x");

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "[I")
    public static int[] field2412 = new int[field2418];

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "Leh;")
    private static class47 field2413 = class195.method1282((byte) -4, "The server is being updated)3");

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Leh;")
    public static class47 field2415 = field2413;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
    public static int field2402;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)I")
    public final int method922(int arg0, byte arg1) {
        field2405++;
        if (arg1 <= 37) {
            return 117;
        }
        int var3 = (this.field2401.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field2401[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2401[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method923(int arg0) {
        field2419 = null;
        field2411 = null;
        field2417 = null;
        field2410 = null;
        field2408 = null;
        field2416 = null;
        if (arg0 <= 9) {
            return;
        }
        field2413 = null;
        field2415 = null;
        field2414 = null;
        field2412 = null;
        field2409 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "([I)V")
    public class119(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2401 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2401[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field2401[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field2401[var5 + var5] = arg0[var4];
            this.field2401[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public static final void method924(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class8.field167; var3++) {
            for (int var4 = 0; var4 < class103.field2156; var4++) {
                for (int var5 = 0; var5 < class100.field2102; var5++) {
                    class152 var6 = class173.field3351[var3][var4][var5];
                    if (var6 != null) {
                        class44 var7 = var6.field2991;
                        if (var7 != null && var7.field876 instanceof class102) {
                            class102 var8 = (class102) var7.field876;
                            class197.method1291(var8, var3, var4, var5, 1, 1);
                            if (var7.field878 instanceof class102) {
                                class102 var9 = (class102) var7.field878;
                                class197.method1291(var9, var3, var4, var5, 1, 1);
                                class102.method827(var8, var9, 0, 0, 0, false);
                                var7.field878 = var9.method838(var9.field2148, var9.field2147, arg0, arg1, arg2, false, false);
                            }
                            var7.field876 = var8.method838(var8.field2148, var8.field2147, arg0, arg1, arg2, false, false);
                        }
                        for (int var10 = 0; var10 < var6.field2975; var10++) {
                            class60 var13 = var6.field2979[var10];
                            if (var13 != null && var13.field1150 instanceof class102) {
                                class102 var14 = (class102) var13.field1150;
                                class197.method1291(var14, var3, var4, var5, var13.field1153 + 1 - var13.field1172, var13.field1168 - var13.field1170 + 1);
                                var13.field1150 = var14.method838(var14.field2148, var14.field2147, arg0, arg1, arg2, false, false);
                            }
                        }
                        class200 var11 = var6.field2989;
                        if (var11 != null && var11.field3894 instanceof class102) {
                            class102 var12 = (class102) var11.field3894;
                            class35.method303(var12, var3, var4, var5);
                            var11.field3894 = var12.method838(var12.field2148, var12.field2147, arg0, arg1, arg2, false, false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIIIIIIB)V")
    public static final void method925(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        class199 var10 = null;
        class199 var11 = (class199) client.field551.method345(-112);
        field2407++;
        while (var11 != null) {
            if (var11.field3889 == arg6 && var11.field3885 == arg2 && var11.field3873 == arg4 && var11.field3878 == arg3) {
                var10 = var11;
                break;
            }
            var11 = (class199) client.field551.method348(13949);
        }
        if (var10 == null) {
            var10 = new class199();
            var10.field3889 = arg6;
            var10.field3878 = arg3;
            var10.field3885 = arg2;
            var10.field3873 = arg4;
            class16.method175((byte) -74, var10);
            client.field551.method337(var10, (byte) -22);
        }
        var10.field3888 = arg1;
        var10.field3887 = arg5;
        var10.field3876 = arg8;
        var10.field3875 = arg7;
        if (arg9 >= -110) {
            method924(-78, 81, 110);
        }
        var10.field3891 = arg0;
    }
}
