import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class151 extends class183 {

    @OriginalMember(owner = "client!ok", name = "Z", descriptor = "I")
    private int field2611 = 4096;

    @OriginalMember(owner = "client!ok", name = "cb", descriptor = "Z")
    private boolean field2614 = true;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "[J")
    public static long[] field2607 = new long[32];

    @OriginalMember(owner = "client!ok", name = "fb", descriptor = "I")
    public static int field2617 = -1;

    @OriginalMember(owner = "client!ok", name = "bb", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!ok", name = "gb", descriptor = "Lui;")
    public static class268 field2618 = new class268(8);

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ok", name = "ab", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ok", name = "hb", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ok", name = "ib", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ok", name = "db", descriptor = "Lek;")
    public static class185 field2615;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "Lnf;")
    public static class67 field2606;

    @OriginalMember(owner = "client!ok", name = "eb", descriptor = "Ljava/lang/String;")
    public static String field2616;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method1025(int arg0, byte arg1) {
        class211.field3634 = 0;
        class318.field5373 = 1;
        class186.field3267 = -1;
        class165.field2835 = arg0;
        class132.field2321 = -1;
        if (arg1 != 59) {
            field2607 = (long[]) null;
        }
        field2612++;
        class184.field3191 = false;
        class240.field4230 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZILjf;Ljf;Ljf;)V", line = 27)
    public static final void method1026(boolean arg0, int arg1, class229 arg2, class229 arg3, class229 arg4) {
        field2608++;
        class274.method1917(arg2, -1, arg4, arg3, arg1, -120);
        if (arg0) {
            field2606 = (class67) null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(II)[[I", line = 38)
    public final int[][] method12(int arg0, int arg1) {
        field2610++;
        int var3 = -119 / ((arg0 - 18) / 61);
        int[][] var4 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var5 = this.method1253(0, class252.field4405 & arg1 - 1, 123);
            int[] var6 = this.method1253(0, arg1, 119);
            int[] var7 = this.method1253(0, class252.field4405 & arg1 + 1, 99);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class22.field393; var11++) {
                int var12 = (var6[class52.field913 & var11 + 1] - var6[class52.field913 & var11 - 1]) * this.field2611;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = (var7[var11] - var5[var11]) * this.field2611;
                int var16 = var15 >> 12;
                int var17 = var16 * var16 >> 12;
                int var18 = (int) (Math.sqrt((double) ((float) (var14 + var17 + 4096) / 4096.0F)) * 4096.0D);
                int var19;
                int var20;
                int var21;
                if (var18 == 0) {
                    var21 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var15 / var18;
                    var20 = 16777216 / var18;
                    var21 = var12 / var18;
                }
                if (this.field2614) {
                    var21 = (var21 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var8[var11] = var21;
                var9[var11] = var19;
                var10[var11] = var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 137)
    public class151() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILkh;I)V", line = 151)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field2620++;
        if (arg0 > -43) {
            this.method12(124, -31);
        }
        if (arg2 == 0) {
            this.field2611 = arg1.method116(-1);
        } else if (arg2 == 1) {
            this.field2614 = arg1.method93(false) == 1;
        }
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V", line = 193)
    public static void method1027(int arg0) {
        field2607 = null;
        field2616 = null;
        field2618 = null;
        field2615 = null;
        if (arg0 != 0) {
            field2616 = (String) null;
        }
        field2606 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIZI)V", line = 211)
    public static final void method1028(int arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 == 28449) {
            class203.method1420(arg2, 0, arg4, class41.field737.length - 1, arg3, arg1, (byte) -123);
            field2605++;
        }
    }
}
