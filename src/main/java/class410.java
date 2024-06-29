import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class410 extends class154 {

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "Lfja;")
    public static class783 field5611 = new class783(84, 4);

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "[I")
    public static int[] field5614 = new int[1];

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field5607;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public int field5610;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Lpo;")
    public static class585 field5616;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[I")
    public int[] field5602;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[I")
    public int[] field5604;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "[I")
    public int[] field5608;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "[Lfo;")
    public class545[] field5603;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[Lfo;")
    public class545[] field5612;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[[[B")
    public byte[][][] field5606;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 5)
    public static final void method2431(String arg0, byte arg1) {
        field5609++;
        class537 var2 = class333.method2094(3);
        var2.field7295.method754(class733.field10129.field6570, 53);
        var2.field7295.method781(46, 0);
        int var3 = var2.field7295.field1442;
        var2.field7295.method781(119, 642);
        int[] var4 = class534.method3032(var2, 2);
        int var5 = var2.field7295.field1442;
        var2.field7295.method783((byte) 11, arg0);
        var2.field7295.method754(class464.field6309, 67);
        var2.field7295.field1442 += 7;
        var2.field7295.method768(var5, var2.field7295.field1442, var4, false);
        var2.field7295.method760(var2.field7295.field1442 - var3, 124);
        class173.method1314(false, var2);
        class559.field7946 = 0;
        if (arg1 > -30) {
            field5616 = null;
        }
        class769.field10608 = 0;
        class204.field3082 = -3;
        class70.field1043 = 1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILha;I)V", line = 41)
    public static final void method2432(int arg0, class66 arg1, int arg2) {
        field5601++;
        if (!class378.field5160 || !class633.field8766) {
            class682.field9500 = 0;
            return;
        }
        if (class774.field10707) {
            class264.field3723 = class47.field731.method1495((byte) 99);
        }
        class137.field2345 = 0;
        if (arg0 > -26) {
            method2431(null, (byte) 66);
        }
        class640.field8802 = 0;
        class608.field8485 = 0;
        int[] var3 = arg1.method496();
        class159.field2570 = (int) ((float) var3[3] / 3.0F);
        class129.field2256 = (int) ((float) var3[2] / 3.0F);
        arg1.method583(class150.field2491);
        if (((int) ((float) class150.field2491[0] / 3.0F)) != class679.field9453 || ((int) ((float) class150.field2491[1] / 3.0F)) != class322.field4421) {
            class679.field9453 = (int) ((float) class150.field2491[0] / 3.0F);
            class322.field4421 = (int) ((float) class150.field2491[1] / 3.0F);
            class336.field4533 = new int[class679.field9453 * class322.field4421];
            class45.field705 = class679.field9453 >> 1;
            class715.field9838 = class322.field4421 >> 1;
        }
        class228.field3326 = arg1.method539();
        class682.field9500 = 0;
        for (int var4 = 0; var4 < class3.field39; var4++) {
            class441.method2568(arg1, class18.field437[var4], arg2, (byte) -119);
        }
        for (int var5 = 0; var5 < class250.field3524; var5++) {
            class441.method2568(arg1, class557.field7860[var5], arg2, (byte) -119);
        }
        for (int var6 = 0; var6 < class660.field9144; var6++) {
            class441.method2568(arg1, class262.field3687[var6], arg2, (byte) -119);
        }
        class22.field461 = 0;
        if (class682.field9500 > 0) {
            int var7 = class336.field4533.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
                class336.field4533[var9++] = Integer.MAX_VALUE;
            }
            while (var9 < var7) {
                class336.field4533[var9++] = Integer.MAX_VALUE;
            }
            class190.field2930 = 1;
            for (int var10 = 0; var10 < class682.field9500; var10++) {
                class616 var11 = class339.field4581[var10];
                class684.method3854(var11.field8585[1], var11.field8579[3], var11.field8577[1], var11.field8579[0], var11.field8579[1], var11.field8585[0], true, var11.field8577[3], var11.field8577[0], var11.field8585[3]);
                class684.method3854(var11.field8585[2], var11.field8579[3], var11.field8577[2], var11.field8579[1], var11.field8579[2], var11.field8585[1], true, var11.field8577[3], var11.field8577[1], var11.field8585[3]);
            }
            class190.field2930 = 2;
        }
        if (class774.field10707) {
            class452.field6182 = class47.field731.method1495((byte) 99) - class264.field3723;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lkh;I)V", line = 150)
    public static final void method2433(class17 arg0, int arg1) {
        if (arg1 != 14049) {
            field5616 = null;
        }
        field5613++;
        if (class1.field12 == arg0.field290) {
            class377.field5145[arg0.field297] = true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I", line = 166)
    public static final int method2434(int arg0, int arg1) {
        field5605++;
        return arg0 == -592809720 ? arg1 >>> 8 : 3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 180)
    public static void method2435(int arg0) {
        field5616 = null;
        field5611 = null;
        field5614 = null;
        if (arg0 != 1) {
            method2431(null, (byte) -40);
        }
    }
}
