import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class27 extends RuntimeException {

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Ljava/lang/String;")
    public String field783;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Ljava/lang/Throwable;")
    public Throwable field781;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "Lwb;")
    public static class130 field777 = class26.method212("Name des Gegenstands eingeben:", -32376);

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lwb;")
    public static class130 field780 = class26.method212("Regelversto-8 melden", -32376);

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "Lwb;")
    private static class130 field788 = class26.method212("Bad session id)3", -32376);

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "Lwb;")
    public static class130 field787 = class26.method212(" hat sich ausgeloggt)3", -32376);

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "[I")
    public static int[] field778 = new int[256];

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lwb;")
    public static class130 field789 = field788;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lwb;")
    public static class130 field790 = class26.method212("backvmid2", -32376);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lge;")
    public static class41 field785 = new class41(200);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Lmc;")
    public static class75 field775;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)I", line = 7)
    public static final int method219(int arg0, int arg1, int arg2, int arg3) {
        field776++;
        int var4 = arg3 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class56.field1435[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg3 & 0x7F;
        int var8 = arg2 & 0x7F;
        int var9 = (128 - var7) * class69.field1781[var6][var4][var5] + class69.field1781[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class69.field1781[var6][var4][var5 + 1] + class69.field1781[var6][var4 + 1][var5 + 1] * var7 >> arg0;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z", line = 44)
    public static final boolean method220(int arg0, int arg1) {
        field782++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = -16 / ((arg0 + 41) / 56);
        int var3 = class3.field73[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        return var3 == 51;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 70)
    public static void method221(int arg0) {
        field778 = null;
        int var1 = 87 / ((-arg0 - 27) / 59);
        field790 = null;
        field788 = null;
        field777 = null;
        field775 = null;
        field787 = null;
        field780 = null;
        field789 = null;
        field785 = null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 102)
    public class27(Throwable arg0, String arg1) {
        this.field783 = arg1;
        this.field781 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZBZ)I", line = 111)
    public static final int method222(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != 12) {
            return 97;
        }
        field786++;
        int var3 = 0;
        if (arg0) {
            var3 += class79.field1914 + class21.field596;
        }
        if (arg2) {
            var3 += class21.field604 + class129.field3051;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V", line = 138)
    public static final void method223(byte arg0) {
        field779++;
        short var1 = 256;
        if (class32.field893 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class32.field893 > 768) {
                    class47.field1260[var2] = class23.method203(true, 1024 - class32.field893, class117.field2890[var2], class83.field1959[var2]);
                } else if (class32.field893 <= 256) {
                    class47.field1260[var2] = class23.method203(true, 256 - class32.field893, class83.field1959[var2], class117.field2890[var2]);
                } else {
                    class47.field1260[var2] = class83.field1959[var2];
                }
            }
        } else if (class105.field2542 > 0) {
            for (int var3 = 0; var3 < 256; var3++) {
                if (class105.field2542 > 768) {
                    class47.field1260[var3] = class23.method203(true, 1024 - class105.field2542, class117.field2890[var3], class106.field2567[var3]);
                } else if (class105.field2542 > 256) {
                    class47.field1260[var3] = class106.field2567[var3];
                } else {
                    class47.field1260[var3] = class23.method203(true, 256 - class105.field2542, class106.field2567[var3], class117.field2890[var3]);
                }
            }
        } else {
            for (int var4 = 0; var4 < 256; var4++) {
                class47.field1260[var4] = class117.field2890[var4];
            }
        }
        for (int var5 = 0; var5 < 33920; var5++) {
            class67.field1740.field593[var5] = class43.field1194.field796[var5];
        }
        int var6 = 0;
        int var7 = 1152;
        for (int var8 = 1; var8 < var1 - 1; var8++) {
            int var22 = (var1 - var8) * field778[var8] / var1;
            int var23 = var22 + 22;
            if (var23 < 0) {
                var23 = 0;
            }
            var6 += var23;
            for (int var24 = var23; var24 < 128; var24++) {
                int var25 = class42.field1184[var6++];
                if (var25 == 0) {
                    var7++;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class67.field1740.field593[var7];
                    int var29 = class47.field1260[var25];
                    class67.field1740.field593[var7++] = class32.method257(var27 * class32.method257(var28, 65280) + var25 * class32.method257(65280, var29), 16711680) + class32.method257(-16711936, class32.method257(var28, 16711935) * var27 + class32.method257(var29, 16711935) * var25) >> 8;
                }
            }
            var7 += var23;
        }
        int var9 = 1176;
        int var10 = 0;
        for (int var11 = 0; var11 < 33920; var11++) {
            class56.field1439.field593[var11] = class111.field2742.field796[var11];
        }
        for (int var12 = 1; var12 < var1 - 1; var12++) {
            int var13 = (var1 - var12) * field778[var12] / var1;
            int var14 = var9 + var13;
            int var15 = 103 - var13;
            for (int var16 = 0; var16 < var15; var16++) {
                int var17 = class42.field1184[var10++];
                if (var17 == 0) {
                    var14++;
                } else {
                    int var19 = 256 - var17;
                    int var20 = class47.field1260[var17];
                    int var21 = class56.field1439.field593[var14];
                    class56.field1439.field593[var14++] = class32.method257(class32.method257(var20, 16711935) * var17 + var19 * class32.method257(16711935, var21), -16711936) + class32.method257(16711680, var17 * class32.method257(65280, var20) + var19 * class32.method257(var21, 65280)) >> 8;
                }
            }
            var10 += 128 - var15;
            var9 = var14 + 128 - var15 - var13;
        }
        if (arg0 >= -73) {
            field789 = null;
        }
    }
}
