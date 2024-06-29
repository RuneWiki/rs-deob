import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class105 extends class220 {

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "[I")
    public int[] field1568;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "[I")
    public int[] field1570;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Ltc;")
    public static class196 field1573 = new class196();

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Z")
    public static boolean field1578 = false;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
    public static int field1574 = 0;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "S")
    public static short field1576 = 1;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field1579 = 0;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public static int field1580 = 0;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field1581;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "Z")
    public static boolean field1575;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V", line = 4)
    public static void method715(int arg0) {
        int var1 = 81 / ((-arg0 - 39) / 39);
        field1573 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lsr;IIIILaa;I)V", line = 14)
    public static final void method716(class136 arg0, int arg1, int arg2, int arg3, int arg4, class281 arg5, int arg6) {
        if (class24.field320 < 100) {
            class206.method1349(arg5, arg0, (byte) -100);
        }
        field1567++;
        arg5.method1735(arg6, arg4, arg3 + arg6, arg4 - -arg1);
        if (arg2 >= -114) {
            method719(117);
        }
        if (class24.field320 < 100) {
            byte var7 = 20;
            int var8 = arg3 / 2 + arg6;
            arg5.method1785(arg6, arg4, arg3, arg1, -16777216, 0);
            int var9 = arg1 / 2 + (arg4 - (var7 + 18));
            arg5.method1748(var8 - 152, var9, 304, 34, class7.field117[class84.field1299].getRGB(), 0);
            arg5.method1785(var8 - 150, var9 + 2, class24.field320 * 3, 30, class357.field5028[class84.field1299].getRGB(), 0);
            class220.field2899.method2277(var9 + var7, class154.field2181, var8, -55, -1, class390.field5735[class84.field1299].getRGB());
            return;
        }
        int var10 = class339.field4742 - (int) ((float) arg3 / class42.field628);
        int var11 = (int) ((float) arg1 / class42.field628) + class448.field6472;
        int var12 = (int) ((float) arg3 / class42.field628) + class339.field4742;
        class223.field3003 = (int) ((float) (arg1 * 2) / class42.field628);
        class209.field2815 = (int) ((float) (arg3 * 2) / class42.field628);
        class445.field6419 = class448.field6472 - ((int) ((float) arg1 / class42.field628));
        int var13 = class448.field6472 - ((int) ((float) arg1 / class42.field628));
        class8.field131 = class339.field4742 - ((int) ((float) arg3 / class42.field628));
        class42.method288(class42.field641 + var10, var11 - -class42.field650, class42.field641 + var12, var13 - -class42.field650, arg6, arg4, arg6 + arg3, arg1 + arg4 + 1);
        class42.method307(arg5);
        class196 var14 = class42.method308(arg5);
        class118.method801(arg5, 1, 0, 0, var14);
        if (class247.field3431 > 0) {
            class270.field3687--;
            if (class270.field3687 == 0) {
                class247.field3431--;
                class270.field3687 = 20;
            }
        }
        if (!class75.field1162) {
            return;
        }
        int var15 = arg3 + arg6 - 5;
        int var16 = arg4 + arg1 - 8;
        class216.field2867.method2274("Fps:" + class62.field978, var15, -1, (byte) 38, 16776960, var16);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class216.field2867.method2274("Mem:" + var18 + "k", var15, -1, (byte) 38, var19, var20);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(BI)V", line = 98)
    public static final void method717(byte arg0, int arg1) {
        field1572++;
        class190 var2 = class236.field3212;
        synchronized (class236.field3212) {
            class236.field3212.method1254(arg1, -98);
        }
        class190 var3 = class395.field5772;
        synchronized (class395.field5772) {
            class395.field5772.method1254(arg1, 125);
        }
        class272 var4 = class362.field5075;
        synchronized (class362.field5075) {
            class362.field5075.method1676(arg1, true);
        }
        if (arg0 < 116) {
            field1576 = -48;
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I", line = 117)
    public static final int method718(int arg0, int arg1) {
        field1571++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        if (arg0 != 256) {
            field1576 = 73;
        }
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)V", line = 139)
    public static final void method719(int arg0) {
        class282.field3866.method1249(arg0 - 255);
        if (arg0 == 256) {
            field1577++;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)Z", line = 150)
    public static final boolean method720(int arg0, int arg1, int arg2) {
        field1581++;
        if (arg1 != -17669) {
            field1575 = true;
        }
        if (arg2 == 11) {
            arg2 = 10;
        }
        class369 var3 = class310.method1961(arg0, (byte) 35);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2370((byte) 107, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II[I[I)V", line = 197)
    public class105(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1568 = arg3;
        this.field1570 = arg2;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V", line = 210)
    public static final void method721(boolean arg0) {
        if (arg0) {
            field1578 = false;
        }
        field1569++;
        if (class441.field6396 != null && class288.field3991 != null) {
            return;
        }
        class441.field6396 = new int[256];
        class288.field3991 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class441.field6396[var1] = (int) (Math.sin(var2) * 4096.0D);
            class288.field3991[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }
}
