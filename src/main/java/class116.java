import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "Lic;")
    public static class59 field2720 = class59.method433(0, "Titelbild geladen)3");

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field2725 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Lic;")
    public static class59 field2721 = class59.method433(0, "VOLL");

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field2724 = 0;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lic;")
    public static class59 field2730 = class59.method433(0, "(U5");

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "[Ldf;")
    public static class28[] field2722 = new class28[4];

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lic;")
    public static class59 field2734 = class59.method433(0, "p12_full");

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "J")
    public long field2736;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "Lqe;")
    public class116 field2731;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "Lqe;")
    public class116 field2733;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "[[B")
    public static byte[][] field2719;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Z")
    public final boolean method927(byte arg0) {
        field2723++;
        if (arg0 <= 110) {
            field2735 = -67;
        }
        return this.field2731 != null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method928(byte arg0) {
        field2720 = null;
        field2721 = null;
        field2734 = null;
        field2730 = null;
        field2722 = null;
        if (arg0 == 47) {
            field2719 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public final void method929(int arg0) {
        field2728++;
        if (this.field2731 != null && arg0 >= 97) {
            this.field2731.field2733 = this.field2733;
            this.field2733.field2731 = this.field2731;
            this.field2731 = null;
            this.field2733 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwf;II)I")
    public static final int method930(class159 arg0, int arg1, int arg2) {
        field2732++;
        if (arg0.field3554 == null || arg0.field3554.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg0.field3554[arg1];
            int var4 = 0;
            int var5 = arg2;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class100.field2468[var3[var5++]];
                }
                if (var7 == 2) {
                    var9 = class138.field3078[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class91.field2328[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class159 var12 = class134.method1032(var11, 499749840);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class7.method39(30996, var13).field1926 || class18.field367)) {
                        for (int var14 = 0; var14 < var12.field3613.length; var14++) {
                            if (var13 + 1 == var12.field3613[var14]) {
                                var9 += var12.field3559[var14];
                            }
                        }
                    }
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 5) {
                    var9 = class85.field2124[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class47.field1204[class138.field3078[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class85.field2124[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class159.field3650.field1239;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class106.field2524[var15]) {
                            var9 += class138.field3078[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class159 var18 = class134.method1032(var17, 499749840);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class7.method39(30996, var19).field1926 || class18.field367)) {
                        for (int var20 = 0; var20 < var18.field3613.length; var20++) {
                            if (var19 + 1 == var18.field3613[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class10.field225;
                }
                if (var7 == 12) {
                    var9 = class127.field2874;
                }
                if (var7 == 13) {
                    int var21 = class85.field2124[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class25.method175(var23, false);
                }
                if (var7 == 18) {
                    var9 = (class159.field3650.field1730 >> 7) + class89.field2229;
                }
                if (var7 == 19) {
                    var9 = (class159.field3650.field1751 >> 7) + class68.field1756;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }
}
