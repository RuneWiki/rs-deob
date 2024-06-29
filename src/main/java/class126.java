import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class126 extends class123 {

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "Loa;")
    public static class98 field2790 = class38.method349(255, "title_mute");

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "Loa;")
    public static class98 field2797 = class38.method349(255, "sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Z")
    public static boolean field2793 = false;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "Loa;")
    public static class98 field2795 = class38.method349(255, "Passwort: ");

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Loa;")
    private static class98 field2805 = class38.method349(255, "Private chat");

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    public static int field2804 = 0;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "Loa;")
    public static class98 field2809 = class38.method349(255, ":");

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "Loa;")
    public static class98 field2799 = field2805;

    @OriginalMember(owner = "client!sd", name = "ob", descriptor = "Loa;")
    public static class98 field2824 = class38.method349(255, "(U(Y");

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "Loa;")
    public static class98 field2821 = class38.method349(255, "System)2Update in: ");

    @OriginalMember(owner = "client!sd", name = "rb", descriptor = "Loa;")
    public static class98 field2827 = class38.method349(255, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Loa;")
    private static class98 field2802 = class38.method349(255, "wishes to duel with you)3");

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "[I")
    public static int[] field2816 = new int[25];

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "Loa;")
    public static class98 field2791 = field2802;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Loa;")
    public static class98 field2807 = class38.method349(255, "Okay");

    @OriginalMember(owner = "client!sd", name = "qb", descriptor = "Z")
    public static boolean field2826 = false;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "Loa;")
    public static class98 field2822 = class38.method349(255, "An");

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public int field2794;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public int field2811;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public int field2814;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!sd", name = "pb", descriptor = "I")
    public int field2825;

    @OriginalMember(owner = "client!sd", name = "sb", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "Lp;")
    public class104 field2810;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "Lp;")
    public class104 field2813;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "Lta;")
    public class129 field2796;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "Ltb;")
    public static class130 field2815;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "Lmd;")
    public static class87 field2792;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "[I")
    public int[] field2823;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V")
    public final void method990(int arg0) {
        int var2 = this.field2811;
        if (arg0 != -1) {
            field2827 = null;
        }
        class129 var3 = this.field2796.method1029((byte) -106);
        if (var3 == null) {
            this.field2800 = 0;
            this.field2811 = -1;
            this.field2819 = 0;
            this.field2817 = 0;
            this.field2823 = null;
        } else {
            this.field2811 = var3.field2992;
            this.field2823 = var3.field2950;
            this.field2800 = var3.field2975;
            this.field2817 = var3.field2980;
            this.field2819 = var3.field2977 * 128;
        }
        field2806++;
        if (this.field2811 != var2 && this.field2813 != null) {
            class82.field1872.method1218(this.field2813);
            this.field2813 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)V")
    public static void method991(int arg0) {
        field2795 = null;
        if (arg0 != 505) {
            method993(106, 35, -72, 81, -47, 113);
        }
        field2790 = null;
        field2791 = null;
        field2816 = null;
        field2809 = null;
        field2821 = null;
        field2827 = null;
        field2815 = null;
        field2824 = null;
        field2792 = null;
        field2805 = null;
        field2799 = null;
        field2807 = null;
        field2802 = null;
        field2797 = null;
        field2822 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(III)V")
    public static final void method992(int arg0, int arg1, int arg2) {
        field2803++;
        long var3 = (long) ((arg2 << 16) + arg0);
        class118 var5 = (class118) class113.field2525.method17(-16, var3);
        if (arg1 <= 116) {
            field2822 = null;
        }
        if (var5 != null) {
            class6.field111.method981(var5, (byte) 85);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    public static final void method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2812++;
        if (class138.field3379 == arg3 && class96.field2199 == arg0 && (class17.field346 == arg1 || !class94.field2151)) {
            return;
        }
        class138.field3379 = arg3;
        class17.field346 = arg1;
        class96.field2199 = arg0;
        if (!class94.field2151) {
            class17.field346 = 0;
        }
        class96.method768((byte) 98, 25);
        class96.method766(false, class54.field1194, null, -21);
        int var6 = 103 / ((arg2 + 28) / 39);
        int var7 = class21.field470;
        class21.field470 = arg3 * 8 - 48;
        int var8 = class21.field470 - var7;
        int var9 = class71.field1479;
        int var10 = class21.field470;
        class71.field1479 = (arg0 - 6) * 8;
        int var11 = class71.field1479 - var9;
        int var12 = class71.field1479;
        for (int var13 = 0; var13 < 32768; var13++) {
            class150 var29 = class38.field935[var13];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field3603[var30] -= var8;
                    var29.field3648[var30] -= var11;
                }
                var29.field3657 -= var8 * 128;
                var29.field3667 -= var11 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class55 var27 = class33.field832[var14];
            if (var27 != null) {
                for (int var28 = 0; var28 < 10; var28++) {
                    var27.field3603[var28] -= var8;
                    var27.field3648[var28] -= var11;
                }
                var27.field3657 -= var8 * 128;
                var27.field3667 -= var11 * 128;
            }
        }
        class114.field2572 = arg1;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        byte var18 = 0;
        if (var8 < 0) {
            var17 = 103;
            var15 = -1;
            var16 = -1;
        }
        class73.field1536.method1180(128, false, arg4, arg5);
        byte var19 = 104;
        byte var20 = 1;
        if (var11 < 0) {
            var18 = 103;
            var20 = -1;
            var19 = -1;
        }
        for (int var21 = var17; var21 != var15; var21 += var16) {
            for (int var23 = var18; var23 != var19; var23 += var20) {
                int var24 = var8 + var21;
                int var25 = var11 + var23;
                for (int var26 = 0; var26 < 4; var26++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104) {
                        class10.field207[var26][var21][var23] = class10.field207[var26][var24][var25];
                    } else {
                        class10.field207[var26][var21][var23] = null;
                    }
                }
            }
        }
        for (class37 var22 = (class37) class81.field1802.method512(-124); var22 != null; var22 = (class37) class81.field1802.method513(-93)) {
            var22.field919 -= var11;
            var22.field903 -= var8;
            if (var22.field903 < 0 || var22.field919 < 0 || var22.field903 >= 104 || var22.field919 >= 104) {
                var22.method975(-118);
            }
        }
        class31.field733 = false;
        if (class44.field1009 != 0) {
            class90.field2055 -= var11;
            class44.field1009 -= var8;
        }
        class127.field2830 = 0;
        class113.field2560 = -1;
        class99.field2312.method519(true);
        class24.field583.method519(true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILd;III[Lwc;[BII)V")
    public static final void method994(int arg0, int arg1, int arg2, class22 arg3, int arg4, int arg5, int arg6, class149[] arg7, byte[] arg8, int arg9, int arg10) {
        field2808++;
        class8 var11 = new class8(arg8);
        int var12 = arg6;
        while (true) {
            int var13 = var11.method103(-23734);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method103(arg6 ^ 0x5CB5);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 >> 6 & 0x3F;
                int var17 = var14 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method62((byte) 91);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg4 == var18 && arg5 <= var16 && arg5 + 8 > var16 && var17 >= arg9 && var17 < arg9 + 8) {
                    class129 var22 = class145.method1167(var12, 65280);
                    int var23 = arg0 + class67.method553(var20, var17 & 0x7, arg1, var22.field2991, var16 & 0x7, var22.field2993, 1);
                    int var24 = arg10 + class58.method464(var17 & 0x7, 0, var20, var22.field2991, arg1, var16 & 0x7, var22.field2993);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class149 var25 = null;
                        int var26 = arg2;
                        if ((class80.field1771[1][var23][var24] & 0x2) == 2) {
                            var26 = arg2 - 1;
                        }
                        if (var26 >= 0) {
                            var25 = arg7[var26];
                        }
                        class127.method1002(var24, var25, var20 + arg1 & 0x3, var21, arg2, var23, var12, (byte) -117, arg3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2820++;
        if (arg7 < 21) {
            field2802 = null;
        }
        class37 var10 = null;
        for (class37 var11 = (class37) class81.field1802.method512(-74); var11 != null; var11 = (class37) class81.field1802.method513(-107)) {
            if (var11.field902 == arg8 && var11.field903 == arg0 && var11.field919 == arg2 && var11.field926 == arg4) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class37();
            var10.field919 = arg2;
            var10.field926 = arg4;
            var10.field903 = arg0;
            var10.field902 = arg8;
            class63.method510(0, var10);
            class81.field1802.method508(16, var10);
        }
        var10.field923 = arg9;
        var10.field915 = arg3;
        var10.field914 = arg1;
        var10.field908 = arg5;
        var10.field912 = arg6;
    }
}
