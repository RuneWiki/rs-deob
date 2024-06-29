import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class185 extends class68 {

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "Z")
    public boolean field2748 = false;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Z")
    public boolean field2750 = false;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field2751;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public int field2749;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public int field2756;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "[[Lvg;")
    public static class38[][] field2754;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(B)Lid;")
    public static final class412 method1272(byte arg0) {
        field2755++;
        int var1 = -79 % ((-arg0 - 31) / 36);
        return class37.field387 < class92.field1377.length ? class92.field1377[class37.field387++] : null;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V")
    public static void method1273(int arg0) {
        if (arg0 == 128) {
            field2754 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIZZB)V")
    public static final void method1274(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        field2757++;
        if (!arg3 && class116.field1744 == arg1 && class210.field3062 == arg0 && class79.field1192 == class271.field3942 || class426.field6401.method2532(1, class170.field2529)) {
            return;
        }
        class116.field1744 = arg1;
        class271.field3942 = class79.field1192;
        class210.field3062 = arg0;
        if (class426.field6401.method2532(1, class170.field2529)) {
            class271.field3942 = 0;
        }
        if (arg2) {
            class11.method76(false, 28);
        } else {
            class11.method76(false, 25);
        }
        class183.method1254(83, class147.field2181, class237.field3490.method2838(false, class143.field2137), true);
        int var5 = class68.field1038;
        class68.field1038 = (class116.field1744 - (class30.field323 >> 4)) * 8;
        int var6 = class24.field259;
        class24.field259 = (class210.field3062 - (class182.field2661 >> 4)) * 8;
        class509.field7428 = class460.method2756(class116.field1744 * 8, class210.field3062 * 8);
        class27.field284 = null;
        int var7 = class68.field1038 - var5;
        int var8 = class24.field259 - var6;
        if (arg2) {
            class402.field6044 = 0;
            int var9 = class30.field323 * 128 - 128;
            int var10 = class182.field2661 * 128 - 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class167 var12 = class193.field2821[var11];
                if (var12 != null) {
                    var12.field1769 -= var8 * 128;
                    var12.field1763 -= var7 * 128;
                    if (var12.field1763 >= 0 && var9 >= var12.field1763 && var12.field1769 >= 0 && var10 >= var12.field1769) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field1997[var14] -= var7;
                            var12.field1996[var14] -= var8;
                            if (var12.field1997[var14] < 0 || class30.field323 <= var12.field1997[var14] || var12.field1996[var14] < 0 || class182.field2661 <= var12.field1996[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class378.field5766[class402.field6044++] = var11;
                        } else {
                            class193.field2821[var11].method1160(null, 56);
                            class193.field2821[var11] = null;
                        }
                    } else {
                        class193.field2821[var11].method1160(null, arg4 + 135);
                        class193.field2821[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class167 var23 = class193.field2821[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field1997[var24] -= var7;
                        var23.field1996[var24] -= var8;
                    }
                    var23.field1769 -= var8 * 128;
                    var23.field1763 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class239 var21 = class44.field707[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1997[var22] -= var7;
                    var21.field1996[var22] -= var8;
                }
                var21.field1763 -= var7 * 128;
                var21.field1769 -= var8 * 128;
            }
        }
        class308[] var17 = class409.field6169;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class308 var20 = var17[var18];
            if (var20 != null) {
                var20.field4424 -= var7 * 128;
                var20.field4431 -= var8 * 128;
            }
        }
        class468.method2797((byte) -111, var7, var8);
        for (class278 var19 = (class278) class422.field6338.method816(119); var19 != null; var19 = (class278) class422.field6338.method812(arg4 ^ 0xFFFFFFB0)) {
            var19.field4002 -= var8;
            var19.field4008 -= var7;
            if (class474.field6982 != 3 && (var19.field4008 < 0 || var19.field4002 < 0 || var19.field4008 >= class30.field323 || var19.field4002 >= class182.field2661)) {
                var19.method2049(-52);
            }
        }
        if (class401.field6030 != 0) {
            class523.field7749 -= var8;
            class401.field6030 -= var7;
        }
        class43.method280(arg4);
        if (arg2) {
            class526.field7785 -= var7;
            class267.field3906 -= var7;
            class24.field258 -= var7 * 128;
            class260.field3827 -= var8 * 128;
            class5.field74 -= var8;
            class38.field558 -= var8;
            if (Math.abs(var7) > class30.field323 || Math.abs(var8) > class182.field2661) {
                class407.method2449(-124);
            }
        } else if (class140.field2103 == 4) {
            class48.field774 -= var7 * 128;
            class94.field1398 -= var7 * 128;
            class367.field5612 -= var8 * 128;
            class366.field5598 -= var8 * 128;
        } else {
            class140.field2103 = 1;
        }
        class203.method1377(false);
        class264.method1758(20841);
        class100.field1459.method817(-4);
        class405.field6119.method817(-4);
        class504.field7390.method1881(2);
        class258.method1718(-30235);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLmv;)V")
    public static final void method1275(boolean arg0, class252 arg1) {
        arg1.method1695(18);
        field2747++;
        int var2 = class172.field2546;
        class239 var3 = class500.field7365 = class44.field707[var2] = new class239();
        var3.field1942 = var2;
        int var4 = arg1.method1690((byte) 1, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field1997[0] = var6 - class68.field1038;
        int var7 = var4 & 0x3FFF;
        var3.field1763 = (var3.field1997[0] << 7) + (var3.method847(-1) << 6);
        var3.field1996[0] = var7 - class24.field259;
        var3.field1769 = (var3.field1996[0] << 7) + (var3.method847(-1) << 6);
        class79.field1192 = var3.field1768 = var5;
        if (class353.field5403[var2] != null) {
            var3.method1621(class353.field5403[var2], 5);
        }
        class74.field1105 = 0;
        class272.field3948[class74.field1105++] = var2;
        class182.field2659[var2] = 0;
        class338.field4760 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1690((byte) 1, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFBB) >> 8;
                int var12 = var9 & 0xFF;
                class105 var13 = class244.field3610[var8] = new class105();
                var13.field1526 = -1;
                var13.field1518 = false;
                var13.field1519 = 0;
                var13.field1523 = (var10 << 28) + (var11 << 14) + var12;
                class208.field2972[class338.field4760++] = var8;
                class182.field2659[var8] = 0;
            }
        }
        arg1.method1691(arg0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IBIIII)V")
    public static final void method1276(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2753++;
        int var6 = class42.method249(class37.field393, arg5, (byte) -72, class509.field7436);
        int var7 = class42.method249(class37.field393, arg3, (byte) -72, class509.field7436);
        int var8 = class42.method249(class494.field7297, arg0, (byte) -72, class445.field6629);
        int var9 = -70 % ((40 - arg1) / 43);
        int var10 = class42.method249(class494.field7297, arg2, (byte) -72, class445.field6629);
        for (int var11 = var6; var11 <= var7; var11++) {
            class415.method2491(var10, var8, class339.field4800[var11], arg4, -31541);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I")
    public static final int method1277(int arg0, int arg1) {
        field2752++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = -96 / ((-arg0 - 46) / 41);
        int var5 = (arg1 * var3 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIZZ)V")
    public class185(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2751 = arg1;
        this.field2749 = arg0;
        this.field2750 = arg3;
        this.field2748 = arg4;
        this.field2756 = arg2;
    }
}
