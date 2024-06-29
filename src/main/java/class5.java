import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class5 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lec;")
    public static class32 field88 = class73.method594("Diese Betatest)2Welt ist nur f-Ur eingeladene", true);

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "Lec;")
    private static class32 field91 = class73.method594("Please remove ", true);

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "Lec;")
    public static class32 field93 = class73.method594("leuchten2:", true);

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lec;")
    public static class32 field95 = field91;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field92 = -1;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "Lec;")
    public static class32 field98 = class73.method594("Benutzeroberfl-=che geladen)3", true);

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "Lec;")
    private static class32 field100 = class73.method594("Choose Option", true);

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "Lec;")
    private static class32 field90 = class73.method594("flash3:", true);

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lec;")
    public static class32 field94 = field100;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lec;")
    public static class32 field84 = field90;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lec;")
    public static class32 field83 = field90;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "Lec;")
    public static class32 field97 = field91;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "Lec;")
    public static class32 field87 = class73.method594("<col=80ff00>", true);

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field102 = 1;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lec;")
    private static class32 field85 = class73.method594("You can(Wt add yourself to your own friend list", true);

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "[I")
    public static int[] field103 = new int[200];

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lec;")
    public static class32 field96 = field85;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "Lja;")
    public static class63 field105 = new class63(64);

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "Lec;")
    private static class32 field108 = class73.method594("white:", true);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lec;")
    public static class32 field107 = field108;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lec;")
    public static class32 field109 = field108;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lf;")
    public static class36 field89;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "[I")
    public static int[] field99;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method19(byte arg0) {
        field97 = null;
        field108 = null;
        field83 = null;
        field96 = null;
        field105 = null;
        field88 = null;
        field85 = null;
        field87 = null;
        field93 = null;
        field95 = null;
        field90 = null;
        field91 = null;
        field94 = null;
        field99 = null;
        field103 = null;
        field100 = null;
        if (arg0 != -74) {
            return;
        }
        field98 = null;
        field107 = null;
        field84 = null;
        field89 = null;
        field109 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lda;B)V")
    public static final void method20(class23 arg0, byte arg1) {
        field101++;
        int var2 = 0;
        if (arg0.field398 == 0) {
            var2 = class159.field3659.method1155(arg0.field401, arg0.field405, arg0.field420);
        }
        int var3 = 0;
        int var4 = -66 % ((arg1 + 6) / 43);
        if (arg0.field398 == 1) {
            var2 = class159.field3659.method1133(arg0.field401, arg0.field405, arg0.field420);
        }
        if (arg0.field398 == 2) {
            var2 = class159.field3659.method1135(arg0.field401, arg0.field405, arg0.field420);
        }
        int var5 = -1;
        if (arg0.field398 == 3) {
            var2 = class159.field3659.method1136(arg0.field401, arg0.field405, arg0.field420);
        }
        int var6 = 0;
        if (var2 != 0) {
            var5 = var2 >> 14 & 0x7FFF;
            int var7 = class159.field3659.method1123(arg0.field401, arg0.field405, arg0.field420, var2);
            var3 = var7 & 0x1F;
            var6 = var7 >> 6 & 0x3;
        }
        arg0.field408 = var3;
        arg0.field410 = var6;
        arg0.field406 = var5;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)I")
    public static final int method21(int arg0) {
        int var1 = arg0;
        field104++;
        if (class45.field1050 < 310) {
            int var2 = class105.field2496 >> 7;
            int var3 = class48.field1127 >> 7;
            if ((class3.field50[class43.field990][var2][var3] & 0x4) != 0) {
                var1 = class43.field990;
            }
            int var4 = class20.field373.field2749 >> 7;
            int var5 = class20.field373.field2700 >> 7;
            int var6;
            if (var2 < var4) {
                var6 = var4 - var2;
            } else {
                var6 = var2 - var4;
            }
            int var7;
            if (var3 < var5) {
                var7 = var5 - var3;
            } else {
                var7 = var3 - var5;
            }
            if (var6 > var7) {
                int var8 = var7 * 65536 / var6;
                int var9 = 32768;
                while (var2 != var4) {
                    if (var4 > var2) {
                        var2++;
                    } else if (var4 < var2) {
                        var2--;
                    }
                    if ((class3.field50[class43.field990][var2][var3] & 0x4) != 0) {
                        var1 = class43.field990;
                    }
                    var9 += var8;
                    if (var9 >= 65536) {
                        if (var5 > var3) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class3.field50[class43.field990][var2][var3] & 0x4) != 0) {
                            var1 = class43.field990;
                        }
                        var9 -= 65536;
                    }
                }
            } else {
                int var10 = var6 * 65536 / var7;
                int var11 = 32768;
                while (var3 != var5) {
                    if (var5 > var3) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    var11 += var10;
                    if ((class3.field50[class43.field990][var2][var3] & 0x4) != 0) {
                        var1 = class43.field990;
                    }
                    if (var11 >= 65536) {
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        var11 -= 65536;
                        if ((class3.field50[class43.field990][var2][var3] & 0x4) != 0) {
                            var1 = class43.field990;
                        }
                    }
                }
            }
        }
        if ((class3.field50[class43.field990][class20.field373.field2749 >> 7][class20.field373.field2700 >> 7] & 0x4) != 0) {
            var1 = class43.field990;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)Lhd;")
    public static final class53 method22(int arg0, int arg1) {
        class53 var2 = (class53) class44.field1015.method486(-28825, (long) arg1);
        field106++;
        int var3 = 48 % ((arg0 + 63) / 63);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class151.field3456.method206(6, arg1, -82);
        class53 var5 = new class53();
        var5.field1222 = arg1;
        if (var4 != null) {
            var5.method420(new class66(var4), true);
        }
        var5.method425(1);
        if (var5.field1199) {
            var5.field1220 = false;
            var5.field1236 = 0;
        }
        class44.field1015.method485((long) arg1, (byte) -128, var5);
        return var5;
    }
}
