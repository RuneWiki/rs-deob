import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class145 extends class4 {

    @OriginalMember(owner = "client!qa", name = "qb", descriptor = "Lsg;")
    private static class169 field2695 = class165.method1060("Please wait 5 minutes before trying again)3", 1536);

    @OriginalMember(owner = "client!qa", name = "sb", descriptor = "Lsg;")
    public static class169 field2697 = field2695;

    @OriginalMember(owner = "client!qa", name = "ub", descriptor = "Lsg;")
    public static class169 field2699 = class165.method1060("<br>(X100(U(Y", 1536);

    @OriginalMember(owner = "client!qa", name = "wb", descriptor = "I")
    public static int field2701 = 0;

    @OriginalMember(owner = "client!qa", name = "rb", descriptor = "Lsg;")
    private static class169 field2696 = class165.method1060("Invalid loginserver requested)3", 1536);

    @OriginalMember(owner = "client!qa", name = "vb", descriptor = "Lsg;")
    public static class169 field2700 = field2696;

    @OriginalMember(owner = "client!qa", name = "tb", descriptor = "Lsg;")
    public static class169 field2698 = class165.method1060("Versteckt", 1536);

    @OriginalMember(owner = "client!qa", name = "jb", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!qa", name = "kb", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qa", name = "lb", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!qa", name = "mb", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!qa", name = "nb", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!qa", name = "ob", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qa", name = "pb", descriptor = "I")
    public int field2694;

    @OriginalMember(owner = "client!qa", name = "xb", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!qa", name = "yb", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lsg;ILsg;Lsg;)V")
    public static final void method954(class169 arg0, int arg1, class169 arg2, class169 arg3) {
        field2688++;
        class43.field810 = arg2;
        if (arg1 == 7791) {
            class43.field804 = arg0;
            class43.field800 = arg3;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2690++;
        class130.method851(arg0, arg1, arg0 + arg3, arg1 + arg2);
        class12.method82();
        field2701++;
        class205.method1329(true, 50);
        class66.method420(true, -30054);
        class205.method1329(false, 50);
        class66.method420(false, arg4 ^ 0xFFFFCB32);
        class8.method43(arg4 ^ 0xFFFFBE2B);
        class55.method347(arg4 - 16808);
        if (!class17.field406) {
            int var5 = class165.field3157;
            int var6 = class29.field600 + class171.field3302 & 0x7FF;
            if (class35.field704 / 256 > var5) {
                var5 = class35.field704 / 256;
            }
            if (class32.field686[4] && var5 < class95.field1811[4] + 128) {
                var5 = class95.field1811[4] + 128;
            }
            class66.method422(var6, class183.method1215(class4.field79.field3698, class61.field1132, class4.field79.field3679, 0) - 50, class110.field2024, var5, -21789, var5 * 3 + 600, class115.field2088);
        }
        int var7;
        if (class17.field406) {
            var7 = class9.method49(-26408);
        } else {
            var7 = class63.method387(false);
        }
        int var8 = class182.field3559;
        int var9 = class7.field159;
        int var10 = class148.field2743;
        int var11 = class138.field2569;
        int var12 = class177.field3468;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class32.field686[var13]) {
                int var16 = (int) ((double) -class143.field2657[var13] + (double) (class143.field2657[var13] * 2 + 1) * Math.random() + Math.sin((double) class163.field3131[var13] / 100.0D * (double) class136.field2540[var13]) * (double) class95.field1811[var13]);
                if (var13 == 1) {
                    class182.field3559 += var16;
                }
                if (var13 == 0) {
                    class7.field159 += var16;
                }
                if (var13 == 2) {
                    class138.field2569 += var16;
                }
                if (var13 == 4) {
                    class148.field2743 += var16;
                    if (class148.field2743 < 128) {
                        class148.field2743 = 128;
                    }
                    if (class148.field2743 > 383) {
                        class148.field2743 = 383;
                    }
                }
                if (var13 == 3) {
                    class177.field3468 = class177.field3468 + var16 & 0x7FF;
                }
            }
        }
        int var14 = class22.field459;
        int var15 = class150.field2806;
        if (var14 >= arg0 && var14 < arg0 + arg3 && arg1 <= var15 && arg1 + arg2 > var15) {
            class24.field512 = class22.field459 - arg0;
            class24.field510 = true;
            class24.field498 = 0;
            class24.field502 = class150.field2806 - arg1;
        } else {
            class24.field510 = false;
            class24.field498 = 0;
        }
        class37.method240((byte) -115);
        if (arg4 != 16808) {
            return;
        }
        class130.method850(arg0, arg1, arg3, arg2, 0);
        class37.method240((byte) -75);
        class196.field3840.method915(class7.field159, class182.field3559, class138.field2569, class148.field2743, class177.field3468, var7);
        class37.method240((byte) -70);
        class196.field3840.method894();
        class106.method624(-40, arg2, arg0, arg1, arg3);
        class17.method98(arg4 - 16806, arg1, arg0);
        ((class103) class12.field275).method609((byte) -95, class149.field2756);
        class129.method838((byte) -124, arg2, arg1, arg0, arg3);
        class148.field2743 = var10;
        class138.field2569 = var11;
        class182.field3559 = var8;
        class177.field3468 = var12;
        class7.field159 = var9;
        if (class48.field868 && class164.method1055(true, false, false) == 0) {
            class48.field868 = false;
        }
        if (class48.field868) {
            class130.method850(arg0, arg1, arg3, arg2, 0);
            class104.method612(arg4 ^ 0xFFFFBE21, class149.field2749, false);
        }
        if (!class48.field868 && !class189.field3707 && var14 >= arg0 && arg0 + arg3 > var14 && var15 >= arg1 && var15 < arg1 + arg2) {
            class188.method1241((byte) 126, arg1, var15, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static final void method956(byte arg0) {
        if (arg0 != -10) {
            method958(null, 91);
        }
        field2689++;
        if (class148.field2719 != null && class125.field2292 != null) {
            return;
        }
        class125.field2292 = new int[256];
        class148.field2719 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class148.field2719[var1] = (int) (Math.sin(var2) * 4096.0D);
            class125.field2292[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lcd;")
    public final class24 method30(int arg0) {
        int var2 = 57 % ((arg0 - 48) / 49);
        field2703++;
        return class180.method1196(this.field2691, 0).method446(this.field2694, 0, null, 0);
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2698 = null;
        field2697 = null;
        field2700 = null;
        field2695 = null;
        field2696 = null;
        if (arg0 != 256) {
            method958(null, 125);
        }
        field2699 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lgd;I)V")
    public static final void method958(class59 arg0, int arg1) {
        short var2 = 256;
        for (int var3 = 0; var3 < class151.field2919.length; var3++) {
            class151.field2919[var3] = 0;
        }
        int var4 = 0;
        if (arg1 <= 118) {
            method959(-33, 6);
        }
        while (var4 < 5000) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class151.field2919[var16] = (int) (Math.random() * 256.0D);
            var4++;
        }
        field2693++;
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class107.field1956[var15] = (class151.field2919[var15 - 1] + class151.field2919[var15 + 1] + class151.field2919[var15 - 128] + class151.field2919[var15 + 128]) / 4;
                }
            }
            int[] var13 = class151.field2919;
            class151.field2919 = class107.field1956;
            class107.field1956 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field1103; var7++) {
            for (int var8 = 0; var8 < arg0.field1105; var8++) {
                if (arg0.field1101[var6++] != 0) {
                    int var9 = var8 + arg0.field1100 + 16;
                    int var10 = arg0.field1107 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class151.field2919[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(II)V")
    public static final void method959(int arg0, int arg1) {
        field2702++;
        if (arg0 != 128) {
            method955(-85, -119, 75, -108, -103);
        }
        if (class201.field3927 == 0) {
            class154.field2971.method1069(-86, arg1);
        } else {
            class65.field1222 = arg1;
        }
    }
}
