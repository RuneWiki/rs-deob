import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class221 extends class533 {

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    private int field3632;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    private int field3634;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lkd;")
    private class188 field3631;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    private int field3624;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    private int field3625;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3622 = new String[200];

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[I")
    public static int[] field3629 = new int[1];

    @OriginalMember(owner = "client!b", name = "r", descriptor = "[I")
    public static int[] field3627 = new int[32];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Lgl;")
    private class428 field3636;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "[[[B")
    public static byte[][][] field3633;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIILya;)V")
    public static final void method1587(int arg0, int arg1, int arg2, int arg3, int arg4, class38 arg5) {
        field3635++;
        arg5.method313(arg3, arg4, arg3 + arg2, arg0 + arg4);
        arg5.method364(arg4, 1, -16777216, arg2, arg3, arg0);
        if (class172.field2549 < 100) {
            return;
        }
        float var6 = (float) class7.field104 / (float) class7.field108;
        int var7 = arg2;
        int var8 = -104 / ((-arg1 - 71) / 51);
        int var9 = arg0;
        if ((var6 < 1.0F)) {
            var9 = (int) ((float) arg2 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var10 = (arg0 - var9) / 2 + arg4;
        int var11 = (arg2 - var7) / 2 + arg3;
        if (class59.field713 == null || class59.field713.method123() != arg2 || arg0 != class59.field713.method125()) {
            class7.method58(class7.field106, class7.field104 + class7.field103, class7.field108 + class7.field106, class7.field103, var11, var10, var7 + var11, var9 + var10);
            class7.method47(arg5);
            class59.field713 = arg5.method269(var11, var10, var7, var9, false);
        }
        class59.field713.method132(var11, var10);
        int var12 = class523.field7654 * var7 / class7.field108;
        int var13 = class346.field5123 * var9 / class7.field104;
        int var14 = class145.field2205 * var7 / class7.field108 + var11;
        int var15 = var10 + var9 - (class273.field4166 * var9 / class7.field104) - var13;
        int var16 = -1996554240;
        if (class86.field1228 == class312.field4691) {
            var16 = -1996488705;
        }
        arg5.method284(var14, var15, var12, var13, var16, 1);
        arg5.method293(var14, var15, var12, var13, var16, 0);
        if (class197.field3283 <= 0) {
            return;
        }
        int var17;
        if (class324.field4851 > 50) {
            var17 = 500 - class324.field4851 * 5;
        } else {
            var17 = class324.field4851 * 5;
        }
        for (class523 var18 = (class523) class7.field89.method1004((byte) -60); var18 != null; var18 = (class523) class7.field89.method996(1)) {
            class519 var19 = class7.field75.method3071(-128, var18.field7645);
            if (class518.method3069(var19, -17557)) {
                if (class458.field6663 == var18.field7645) {
                    int var20 = var11 + (var18.field7643 * var7 / class7.field108);
                    int var21 = var10 + ((class7.field104 - var18.field7647) * var9 / class7.field104);
                    arg5.method364(var21 - 2, 1, var17 << 24 | 0xFFFF00, 4, var20 - 2, 4);
                } else if (class71.field1026 != -1 && class71.field1026 == var19.field7562) {
                    int var22 = var18.field7643 * var7 / class7.field108 + var11;
                    int var23 = (class7.field104 - var18.field7647) * var9 / class7.field104 + var10;
                    arg5.method364(var23 - 2, 1, var17 << 24 | 0xFFFF00, 4, var22 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILya;J)V")
    public static final void method1588(int arg0, class38 arg1, long arg2) {
        field3628++;
        class100.field1428 = 0;
        class238.field3822 = class233.field3762;
        class233.field3762 = 0;
        long var4 = class493.method2937(arg0 + 26556);
        class354 var6 = (class354) class465.field6733.method1958(32);
        if (arg0 != -26648) {
            method1587(121, 33, -103, 53, 100, null);
        }
        while (var6 != null) {
            if (var6.method2222(arg1, arg2)) {
                class100.field1428++;
            }
            var6 = (class354) class465.field6733.method1961(99);
        }
        if (class258.field3967 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class465.field6733.method1962(68) + ", running: " + class100.field1428 + ". Particles: " + class233.field3762 + ". Time taken: " + (class493.method2937(-61) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BJ)V")
    public static final void method1589(byte arg0, long arg1) {
        field3630++;
        if (client.field3311 != null) {
            if (class176.field2611 == 1 || class176.field2611 == 5) {
                class78.method670(96, arg1);
            } else if (class176.field2611 == 4) {
                class398.method2504(arg0 + 353, arg1);
            }
        }
        method1588(-26648, class377.field5692, (long) class475.field6854);
        if (class155.field2310 != -1) {
            class6.method34(class155.field2310, 31673);
        }
        for (int var3 = 0; var3 < class109.field1529; var3++) {
            if (class277.field4219[var3]) {
                class8.field115[var3] = true;
            }
            class74.field1049[var3] = class277.field4219[var3];
            class277.field4219[var3] = false;
        }
        if (arg0 != -33) {
            return;
        }
        class376.field5641 = class475.field6854;
        if (class377.field5692.method347()) {
            class477.field6885 = true;
        }
        if (class155.field2310 != -1) {
            class109.field1529 = 0;
            class498.method2950(25477);
        }
        class377.field5692.method267();
        class52.method501(class377.field5692, 0);
        int var4 = class431.method2678(arg0 + 35);
        if (var4 == -1) {
            var4 = class287.field4348;
        }
        if (var4 == -1) {
            var4 = class23.field284;
        }
        class193.method1359(var4, (byte) -104);
        class333.method2105(class398.field5947.field5833, arg0 ^ 0xFFFFFFDC, class398.field5947.field5826, class398.field5947.field5837, class295.field4496);
        class295.field4496 = 0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static void method1590(byte arg0) {
        field3629 = null;
        field3622 = null;
        field3627 = null;
        if (arg0 >= 69) {
            field3633 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIZLul;I)V")
    public static final void method1591(int arg0, int arg1, int arg2, int arg3, boolean arg4, class406 arg5, int arg6) {
        if (arg2 != 16621) {
            field3629 = null;
        }
        class265.field4068 = arg6;
        class216.field3506 = arg5;
        class326.field4909 = arg0;
        field3626++;
        class53.field665 = arg3;
        class359.field5329 = arg4;
        class60.field718 = 1;
        class150.field2248 = arg1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lgl;")
    public final class428 method930(int arg0) {
        if (arg0 != -11536) {
            method1587(-51, -125, 123, 101, 55, null);
        }
        field3623++;
        if (this.field3636 == null) {
            class217.field3563[2] = this.field3632;
            class217.field3563[0] = this.field3624;
            class279 var2 = this.field3631.field524;
            class217.field3563[5] = this.field3634;
            class217.field3563[3] = this.field3621;
            class217.field3563[4] = this.field3625;
            class217.field3563[1] = this.field3619;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method579(class217.field3563[var5], true)) {
                    return null;
                }
                class281 var7 = var2.method584(true, class217.field3563[var5]);
                int var8 = var7.field4257 ? 64 : 128;
                if (var7.field4265 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class435.field6435[var6] = var2.method583(var4, var4, class217.field3563[var6], 1.0F, (byte) -123, false);
            }
            this.field3636 = new class428(this.field3631, 6407, var4, var3, class435.field6435);
        }
        return this.field3636;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lkd;IIIIII)V")
    public class221(class188 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3619 = arg2;
        this.field3621 = arg4;
        this.field3632 = arg3;
        this.field3634 = arg6;
        this.field3631 = arg0;
        this.field3624 = arg1;
        this.field3625 = arg5;
    }
}
