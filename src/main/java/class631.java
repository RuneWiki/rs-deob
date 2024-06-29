import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class631 extends class161 {

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field8967;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILufa;I)V")
    public static final void method3561(int arg0, class141 arg1, int arg2) {
        field8965++;
        int var3 = -1;
        int var4 = arg2;
        if (class148.field2508 < arg1.field2413) {
            class128.method1011(arg1, (byte) -92);
        } else if (class148.field2508 > arg1.field2376) {
            class465.method2722(arg1, (byte) 111, false);
            var4 = class625.field8910;
            var3 = class694.field9861;
        } else {
            class187.method1330(arg1, true);
        }
        if (arg1.field3155 < 512 || arg1.field3154 < 512 || arg1.field3155 >= class430.field6136 * 512 - 512 || arg1.field3154 >= ((class580.field8504 - 1) * 512)) {
            arg1.field2376 = 0;
            var4 = 0;
            var3 = -1;
            arg1.field2413 = 0;
            arg1.field2391 = -1;
            arg1.field2400 = -1;
            arg1.field2371 = -1;
            arg1.field2438 = null;
            arg1.field3155 = arg1.field2454[0] * 512 + (arg1.method1108(arg2 ^ 0x7F) * 256);
            arg1.field3154 = arg1.field2459[0] * 512 + (arg1.method1108(arg2 ^ 0x53) * 256);
            arg1.method1099(75);
        }
        if (class103.field1708 == arg1 && (arg1.field3155 < 6144 || arg1.field3154 < 6144 || arg1.field3155 >= (class430.field6136 - 12) * 512 || ((class580.field8504 - 12) * 512) <= arg1.field3154)) {
            arg1.field2391 = -1;
            arg1.field2376 = 0;
            var3 = -1;
            arg1.field2400 = -1;
            arg1.field2413 = 0;
            var4 = 0;
            arg1.field2438 = null;
            arg1.field2371 = -1;
            arg1.field3155 = arg1.field2454[0] * 512 + arg1.method1108(arg2 + 109) * 256;
            arg1.field3154 = arg1.field2459[0] * 512 + (arg1.method1108(91) * 256);
            arg1.method1099(69);
        }
        int var5 = class104.method877(true, arg1);
        class33.method296(32768, arg1);
        class266.method1686(arg1, var4, var5, (byte) -31, var3);
        class192.method1358(var3, (byte) 98, arg1);
        class674.method3817(-124, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILmf;Lvn;IIIIB)V")
    public static final void method3562(int arg0, int arg1, int arg2, int arg3, int arg4, class409 arg5, class186 arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        class673.field9557 = arg6;
        class363.field5049 = arg0;
        class654.field9237 = arg4;
        class438.field6306 = arg2;
        class263.field3788 = arg1;
        class180.field2853 = null;
        class606.field8722 = null;
        class699.field9905 = arg8;
        class242.field3550 = arg3;
        class331.field4573 = arg7;
        class642.field9126 = arg5;
        class325.field4526 = arg9;
        field8966++;
        if (arg11 < 105) {
            method3563(72, false, null);
        }
        class681.field9698 = arg10;
        class648.field9186 = null;
        class218.method1468(26851);
        class542.field7956 = true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLr;)V")
    public static final void method3563(int arg0, boolean arg1, class98 arg2) {
        field8967++;
        if (!class155.field2557) {
            class550.field8071 = 0;
            return;
        }
        if (class434.field6250) {
            class38.field499 = class233.field3451.method610(13221);
        }
        class184.field2918 = 0;
        class78.field1197 = 0;
        class661.field9298 = 0;
        int[] var3 = arg2.method826();
        class314.field4356 = (int) ((float) var3[2] / 3.0F);
        class452.field6505 = (int) ((float) var3[3] / 3.0F);
        arg2.method769(class129.field2098);
        if (((int) ((float) class129.field2098[0] / 3.0F)) != class346.field4893 || (int) ((float) class129.field2098[1] / 3.0F) != class348.field4915) {
            class346.field4893 = (int) ((float) class129.field2098[0] / 3.0F);
            class348.field4915 = (int) ((float) class129.field2098[1] / 3.0F);
            class520.field7673 = class346.field4893 >> 1;
            class213.field3236 = new int[class348.field4915 * class346.field4893];
            class683.field9717 = class348.field4915 >> 1;
        }
        class28.field398 = arg2.method740();
        class550.field8071 = 0;
        for (int var4 = 0; var4 < class576.field8442; var4++) {
            class59.method510(arg2, (byte) 33, class316.field4374[var4], arg0);
        }
        if (arg1) {
            return;
        }
        for (int var5 = 0; var5 < class465.field6718; var5++) {
            class59.method510(arg2, (byte) 35, class333.field4644[var5], arg0);
        }
        for (int var6 = 0; var6 < class203.field3148; var6++) {
            class59.method510(arg2, (byte) 115, class117.field1847[var6], arg0);
        }
        class495.field7220 = 0;
        if (class550.field8071 > 0) {
            int var7 = class213.field3236.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
                class213.field3236[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class213.field3236[var9++] = Integer.MAX_VALUE;
            }
            class540.field7931 = 1;
            for (int var10 = 0; var10 < class550.field8071; var10++) {
                class302 var11 = class596.field8630[var10];
                class84.method638(var11.field4237[3], var11.field4229[1], var11.field4229[3], var11.field4230[0], var11.field4229[0], var11.field4237[1], var11.field4237[0], var11.field4230[1], 47, var11.field4230[3]);
                class84.method638(var11.field4237[3], var11.field4229[2], var11.field4229[3], var11.field4230[1], var11.field4229[1], var11.field4237[2], var11.field4237[1], var11.field4230[2], 81, var11.field4230[3]);
            }
            class540.field7931 = 2;
        }
        if (class434.field6250) {
            class143.field2465 = class233.field3451.method610(13221) - class38.field499;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(JJ)J")
    public static long method3564(long arg0, long arg1) {
        return arg0 | arg1;
    }
}
