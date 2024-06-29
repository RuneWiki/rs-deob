import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class115 {

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field2729 = new int[5];

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    public static int[] field2733 = new int[128];

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Lhe;")
    public static class54 field2734 = class6.method58("Bitte warten Sie eine Minute", false);

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Lhe;")
    public static class54 field2728 = class6.method58("Lade Konfiguration )2 ", false);

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lnc;")
    public static class93 field2725 = null;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Lhe;")
    private static class54 field2723 = class6.method58("flash3:", false);

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field2727 = 0;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
    public static int[] field2730 = new int[1000];

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lhe;")
    public static class54 field2732 = field2723;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "Lhe;")
    public static class54 field2738 = field2723;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lec;")
    public static class32 field2737 = new class32(4096);

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "Lhe;")
    public static class54 field2739 = class6.method58("Ladevorgang )2 bitte warten Sie)3", false);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lef;")
    public static class35 field2731;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method874(int arg0) {
        field2731 = null;
        field2723 = null;
        field2738 = null;
        field2733 = null;
        field2730 = null;
        if (arg0 != 4) {
            return;
        }
        field2734 = null;
        field2728 = null;
        field2729 = null;
        field2739 = null;
        field2737 = null;
        field2732 = null;
        field2725 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II[Lac;I[BII)V")
    public static final void method875(int arg0, int arg1, class4[] arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        field2722++;
        if (arg6 != 100) {
            return;
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg0 + var12 > 0 && arg0 + var12 < 103 && arg1 + var13 > 0 && arg1 + var13 < 103) {
                        arg2[var7].field117[arg0 + var12][arg1 + var13] = class118.method887(arg2[var7].field117[arg0 + var12][arg1 + var13], -16777217);
                    }
                }
            }
        }
        class83 var8 = new class83(arg4);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class157.method1209(var9, arg0 + var10, arg1 + var11, var8, arg3, -105, arg5, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method876(int arg0) {
        field2735++;
        int var1 = 0;
        if (arg0 != -1) {
            return;
        }
        while (class21.field579 > var1) {
            int var2 = class89.field2193[var1];
            class120 var3 = class111.field2679[var2];
            int var4 = class40.field1044.method638(0);
            if ((var4 & 0x40) != 0) {
                int var5 = class40.field1044.method645(0);
                int var6 = class40.field1044.method661((byte) 122);
                if (var5 == 65535) {
                    var5 = -1;
                }
                if (var3.field981 == var5 && var5 != -1) {
                    int var7 = class135.method1010(var5, (byte) -113).field3238;
                    if (var7 == 1) {
                        var3.field980 = 0;
                        var3.field937 = 0;
                        var3.field943 = 0;
                        var3.field926 = var6;
                    }
                    if (var7 == 2) {
                        var3.field980 = 0;
                    }
                } else if (var5 == -1 || var3.field981 == -1 || class135.method1010(var5, (byte) -110).field3255 >= class135.method1010(var3.field981, (byte) -126).field3255) {
                    var3.field981 = var5;
                    var3.field937 = 0;
                    var3.field980 = 0;
                    var3.field926 = var6;
                    var3.field943 = 0;
                    var3.field940 = var3.field932;
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field975 = class40.field1044.method634(109);
                var3.field957 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field930 = class40.field1044.method635((byte) -117);
                int var8 = class40.field1044.method663(4);
                if (var3.field930 == 65535) {
                    var3.field930 = -1;
                }
                var3.field946 = 0;
                var3.field939 = class4.field138 + (var8 & 0xFFFF);
                if (var3.field939 > class4.field138) {
                    var3.field946 = -1;
                }
                var3.field945 = 0;
                var3.field933 = var8 >> 16;
            }
            if ((var4 & 0x1) != 0) {
                var3.field996 = class40.field1044.method645(0);
                var3.field935 = class40.field1044.method631((byte) -116);
            }
            if ((var4 & 0x10) != 0) {
                int var9 = class40.field1044.method662(32767);
                int var10 = class40.field1044.method661((byte) 31);
                var3.method287(var9, false, class4.field138, var10);
                var3.field977 = class4.field138 + 300;
                var3.field963 = class40.field1044.method661((byte) 40);
                var3.field966 = class40.field1044.method662(32767);
            }
            if ((var4 & 0x4) != 0) {
                var3.field997 = class40.field1044.method631((byte) -99);
                if (var3.field997 == 65535) {
                    var3.field997 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var11 = class40.field1044.method638(0);
                int var12 = class40.field1044.method661((byte) 79);
                var3.method287(var11, false, class4.field138, var12);
                var3.field977 = class4.field138 + 300;
                var3.field963 = class40.field1044.method638(~arg0);
                var3.field966 = class40.field1044.method638(0);
            }
            if ((var4 & 0x2) != 0) {
                var3.field2788 = class139.method1078(arg0 ^ 0x30, class40.field1044.method631((byte) -119));
                var3.field950 = var3.field2788.field261;
                var3.field955 = var3.field2788.field257;
                var3.field976 = var3.field2788.field262;
                var3.field941 = var3.field2788.field298;
                var3.field948 = var3.field2788.field252;
                var3.field973 = var3.field2788.field282;
                var3.field967 = var3.field2788.field254;
                var3.field969 = var3.field2788.field286;
                var3.field954 = var3.field2788.field268;
            }
            var1++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)V")
    public static final void method877(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field2732 = null;
        }
        field2724++;
        if (class86.method691((byte) 120, arg2)) {
            class31.method229(arg1, (byte) 2, class59.field1481[arg2]);
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(III)Z")
    public static final boolean method878(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            return true;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        field2736++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class3 var3 = class4.method34(true, arg1);
        return var3.method18(arg2, arg0 ^ 0xF29);
    }
}
