import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class42 implements class389 {

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lem;")
    public class567 field576;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lvo;")
    private class345 field566;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lvo;")
    public class345 field573;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Z")
    public static boolean field564 = false;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Leda;")
    public static class116 field567 = new class116(100, 2);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Leda;")
    public static class116 field572 = new class116(94, 8);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[I")
    public static int[] field577 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "J")
    private long field571;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "Lla;")
    private class395 field562;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method339(byte arg0) {
        if (arg0 != 88) {
            method340(true, 122, 23);
        }
        field577 = null;
        field567 = null;
        field572 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)V")
    public static final void method340(boolean arg0, int arg1, int arg2) {
        field563++;
        if (arg0) {
            field567 = null;
        }
        class449 var3 = class611.method3463(arg2, (byte) -124, 1);
        var3.method2615((byte) -110);
        var3.field6472 = arg1;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public static final void method341(int arg0, int arg1, int arg2) {
        field568++;
        class449 var3 = class611.method3463(arg0, (byte) -127, 7);
        var3.method2615((byte) -103);
        var3.field6472 = arg1;
        if (arg2 != -10827) {
            method341(67, 61, 19);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZ)V")
    public abstract void method342(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public void method343(int arg0) {
        field574++;
        if (arg0 <= -29) {
            class490 var2 = class61.method514(this.field566, this.field576.field8294, -1);
            this.field562 = class637.field9048.method804(var2, class628.method3538(this.field573, this.field576.field8294), true);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZ)V")
    public final void method344(boolean arg0, boolean arg1) {
        field575++;
        if (arg0) {
            this.method345(106, 65, false, 33);
        }
        int var3 = this.field576.field8302.method1329(class570.field8333, this.field576.field8300, arg0) + this.field576.field8301;
        int var4 = this.field576.field8299.method2447(-1464849236, class140.field2349, this.field576.field8291) + this.field576.field8295;
        this.method345(var4, 0, arg1, var3);
        this.method342(var3, var4, 0, arg1);
        String var5 = class406.field5827.method255(100);
        if (class254.method1619(true) - this.field571 > 10000L) {
            var5 = var5 + " (" + class406.field5827.method254((byte) 78).method3023((byte) -11) + ")";
        }
        this.field562.method2399(this.field576.field8297, var3 + (this.field576.field8300 / 2), this.field576.field8291 / 2 + this.field576.field8293 + var4 + 4, -1, var5, (byte) 109);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIZI)V")
    public abstract void method345(int arg0, int arg1, boolean arg2, int arg3);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Z")
    public static final boolean method346(int arg0, int arg1) {
        if (arg0 != 100) {
            method340(true, 20, 115);
        }
        field569++;
        return arg1 == 13 || arg1 == 10 || arg1 == 1009 || arg1 == 23 || arg1 == 44;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)I")
    public final int method347(byte arg0) {
        field570++;
        int var2 = class406.field5827.method260(0);
        int var3 = var2 * 100;
        if (this.field565 == var2 && var2 != 0) {
            int var4 = class406.field5827.method258(false);
            if (var4 > var2) {
                long var5 = this.field571 - class406.field5827.method256(0);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class254.method1619(true) - this.field571) * 10000L;
                    if (var9 >= var7) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field565 = var2;
            this.field571 = class254.method1619(true);
        }
        return arg0 < 31 ? -33 : var3;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)Z")
    public boolean method348(int arg0) {
        field561++;
        boolean var2 = true;
        if (!this.field573.method2077(arg0 ^ arg0, this.field576.field8294)) {
            var2 = false;
        }
        if (!this.field566.method2077(0, this.field576.field8294)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lvo;Lvo;Lem;)V")
    public class42(class345 arg0, class345 arg1, class567 arg2) {
        this.field576 = arg2;
        this.field566 = arg1;
        this.field573 = arg0;
    }
}
