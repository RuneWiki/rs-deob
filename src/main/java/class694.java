import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class694 extends class168 {

    @OriginalMember(owner = "client!ev", name = "m", descriptor = "Z")
    public static boolean field9636 = false;

    @OriginalMember(owner = "client!ev", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field9642 = new Rectangle[100];

    @OriginalMember(owner = "client!ev", name = "C", descriptor = "[I")
    public static int[] field9652;

    @OriginalMember(owner = "client!ev", name = "y", descriptor = "F")
    public static float field9648;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!ev", name = "n", descriptor = "I")
    public static int field9637;

    @OriginalMember(owner = "client!ev", name = "o", descriptor = "I")
    public int field9638;

    @OriginalMember(owner = "client!ev", name = "p", descriptor = "I")
    public int field9639;

    @OriginalMember(owner = "client!ev", name = "t", descriptor = "I")
    public int field9643;

    @OriginalMember(owner = "client!ev", name = "u", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!ev", name = "w", descriptor = "I")
    public int field9646;

    @OriginalMember(owner = "client!ev", name = "x", descriptor = "I")
    public int field9647;

    @OriginalMember(owner = "client!ev", name = "z", descriptor = "I")
    public static int field9649;

    @OriginalMember(owner = "client!ev", name = "A", descriptor = "I")
    public int field9650;

    @OriginalMember(owner = "client!ev", name = "B", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "Lria;")
    public class288 field9635;

    @OriginalMember(owner = "client!ev", name = "q", descriptor = "Lria;")
    public class288 field9640;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "Ljava/lang/String;")
    public String field9633;

    @OriginalMember(owner = "client!ev", name = "r", descriptor = "Z")
    public boolean field9641;

    @OriginalMember(owner = "client!ev", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field9645;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field9642[var0] = new Rectangle();
        }
        field9652 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZIIIIIIIII)V", line = 4)
    public static final void method3884(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field9644++;
        if (arg6 < 512 || arg1 < 512 || arg6 > (class409.field5183 - 2) * 512 || arg1 > class543.field7597 * 512 - 1024) {
            class83.field1136[0] = class83.field1136[1] = -1;
            return;
        }
        int var10 = class225.method1448(arg7, arg6, arg1, (byte) 28) - arg3;
        if (class676.field9448) {
            class16.method119(true, 16384);
        } else {
            class651.field9066.method600(arg2, 0, 0);
            class386.field4930.method505(class651.field9066);
        }
        if (class232.field3053) {
            class386.field4930.method530(arg6, var10, arg1, class286.field3600, class83.field1136);
        } else {
            class386.field4930.method543(arg6, var10, arg1, class83.field1136);
        }
        if (class676.field9448) {
            class357.method2071(256);
        } else {
            class651.field9066.method600(-arg2, 0, 0);
            class386.field4930.method505(class651.field9066);
        }
        if (arg0) {
            field9636 = true;
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lka;IIIILmk;IILha;ZIIII)Lka;", line = 46)
    public static final class474 method3885(class474 arg0, int arg1, int arg2, int arg3, int arg4, class56 arg5, int arg6, int arg7, class60 arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field9649++;
        if (arg0 == null) {
            return null;
        }
        if (arg9) {
            method3887(98);
        }
        int var14 = 2055;
        if (arg5 != null) {
            int var15 = var14 | arg5.method416(arg6, -1, (byte) -90, false);
            var14 = var15 & 0xFFFFFDFF;
        }
        long var16 = ((long) arg12 << 48) + ((long) arg2 << 32) + (long) ((arg11 << 16) + (arg10 - -(arg4 << 24)));
        class534 var18 = class26.field470;
        class474 var19;
        synchronized (class26.field470) {
            var19 = (class474) class26.field470.method3079(var16, 0);
        }
        if (var19 == null || arg8.method542(var19.method272(), var14) != 0) {
            if (var19 != null) {
                var14 = arg8.method484(var14, var19.method272());
            }
            byte var20;
            if (arg10 == 1) {
                var20 = 9;
            } else if (arg10 == 2) {
                var20 = 12;
            } else if (arg10 == 3) {
                var20 = 15;
            } else if (arg10 == 4) {
                var20 = 18;
            } else {
                var20 = 21;
            }
            byte var21 = 3;
            int[] var22 = new int[] { 64, 96, 128 };
            class714 var23 = new class714(var20 * var21 + 1, var21 * 2 * var20 + -var20, 0);
            int var24 = var23.method3995(0, 71, 0, 0);
            int[][] var25 = new int[var21][var20];
            for (int var26 = 0; var26 < var21; var26++) {
                int var27 = var22[var26];
                int var28 = var22[var26];
                for (int var29 = 0; var29 < var20; var29++) {
                    int var30 = (var29 << 14) / var20;
                    int var31 = class16.field320[var30] * var27 >> 14;
                    int var32 = class16.field322[var30] * var28 >> 14;
                    var25[var26][var29] = var23.method3995(0, 77, var31, var32);
                }
            }
            for (int var33 = 0; var33 < var21; var33++) {
                int var34 = (var33 * 256 + 128) / var21;
                int var35 = 256 - var34;
                byte var36 = (byte) (arg4 * var34 + arg11 * var35 >> 8);
                short var37 = (short) (((arg2 & 0xFC00) * var35 + (arg12 & 0xFC00) * var34 & 0xFC0000) + ((arg2 & 0x380) * var35 + (arg12 & 0x380) * var34 & 0x38000) + ((arg2 & 0x7F) * var35 + (arg12 & 0x7F) * var34 & 0x7F00) >> 8);
                for (int var38 = 0; var38 < var20; var38++) {
                    if (var33 == 0) {
                        var23.method3994((short) -1, var25[0][var38], (byte) -1, var36, var24, var25[0][(var38 + 1) % var20], (byte) 1, 112, var37);
                    } else {
                        var23.method3994((short) -1, var25[var33][(var38 + 1) % var20], (byte) -1, var36, var25[var33 - 1][var38], var25[var33 - 1][(var38 + 1) % var20], (byte) 1, 109, var37);
                        var23.method3994((short) -1, var25[var33][var38], (byte) -1, var36, var25[var33 - 1][var38], var25[var33][(var38 + 1) % var20], (byte) 1, -87, var37);
                    }
                }
            }
            var19 = arg8.method540(var23, var14, class197.field2684, 64, 768);
            class534 var39 = class26.field470;
            synchronized (class26.field470) {
                class26.field470.method3077((byte) -30, var16, var19);
            }
        }
        int var40 = arg0.method263();
        int var41 = arg0.method285();
        int var42 = arg0.method269();
        int var43 = arg0.method242();
        class701 var44 = null;
        if (arg5 != null) {
            int var45 = arg5.field771[arg6];
            var44 = class66.field941.method1298(var45 >> 16, -37);
            arg6 = var45 & 0xFFFF;
        }
        class474 var46;
        if (var44 == null) {
            var46 = var19.method273((byte) 3, var14, true);
            var46.method259(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method281(var40 + var41 >> 1, 0, var42 + var43 >> 1);
        } else {
            var46 = var19.method273((byte) 3, var14, true);
            var46.method259(var41 - var40 >> 1, 128, var43 - var42 >> 1);
            var46.method281(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            var46.method2714(var44, arg6, 91);
        }
        if (arg3 != 0) {
            var46.method257(arg3);
        }
        if (arg7 != 0) {
            var46.method276(arg7);
        }
        if (arg13 != 0) {
            var46.method281(0, arg13, 0);
        }
        return var46;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(BLei;)V", line = 224)
    public static final void method3886(byte arg0, class180 arg1) {
        field9651++;
        arg1.method2568(class117.field1725.method3185(true), -535701016);
        arg1.method2568(class443.field5876.method3185(true), arg0 ^ 0xE011D9F2);
        arg1.method2568(class531.field7380.method3185(true), arg0 ^ 0xE011D9F2);
        if (arg0 != 26) {
            method3886((byte) -54, null);
        }
        arg1.method2568(class210.field2782.method3185(true), -535701016);
        arg1.method2568(class695.field9672.method3185(true), -535701016);
        arg1.method2568(class238.field3094.method3185(true), -535701016);
        arg1.method2568(class87.field1210.method3185(true), -535701016);
        arg1.method2568(class220.field2956.method3185(true), -535701016);
        arg1.method2568(class268.field3369.method3185(true), arg0 - 535701042);
        arg1.method2568(class163.field2253.method3185(true), -535701016);
        arg1.method2568(class482.field6563.method3185(true), -535701016);
        arg1.method2568(class417.field5330.method3185(true), arg0 - 535701042);
        arg1.method2568(class329.field4206.method3185(true), -535701016);
        arg1.method2568(class445.field5928.method3185(true), -535701016);
        arg1.method2568(class652.field9072.method3185(true), -535701016);
        arg1.method2568(class641.field8904.method3185(true), -535701016);
        arg1.method2568(class625.field8599.method3185(true), -535701016);
        arg1.method2568(class627.field8636.method3185(true), arg0 ^ 0xE011D9F2);
        arg1.method2568(class155.field2129.method3185(true), -535701016);
        arg1.method2568(class560.field7904.method3185(true), -535701016);
        arg1.method2568(class88.field1224.method3185(true), -535701016);
        arg1.method2568(class229.field3018.method3185(true), -535701016);
        arg1.method2568(class761.field10615.method3185(true), arg0 - 535701042);
        arg1.method2568(class55.field758.method3185(true), arg0 - 535701042);
        arg1.method2568(class395.field5031.method3185(true), arg0 - 535701042);
        arg1.method2568(class475.field6389.method3185(true), -535701016);
        arg1.method2568(class571.field8044.method3185(true), -535701016);
        arg1.method2568(class748.field10463.method3185(true), -535701016);
        arg1.method2568(class234.field3059.method3185(true), -535701016);
        arg1.method2568(class94.field1324.method3185(true), -535701016);
        arg1.method2568(class441.field5870.method3185(true), -535701016);
        arg1.method2568(class168.field2329.method3185(true), -535701016);
        arg1.method2568(class268.method1596(6560), -535701016);
        arg1.method2568(class596.method3376((byte) -40), -535701016);
        arg1.method2568(class636.field8776.method3185(true), -535701016);
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V", line = 274)
    public static void method3887(int arg0) {
        field9642 = null;
        field9652 = null;
        if (arg0 != 0) {
            method3887(-51);
        }
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(ZLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 285)
    public static final void method3888(boolean arg0, String arg1, int arg2, int arg3, String arg4, String arg5, String arg6, String arg7, int arg8) {
        field9637++;
        if (arg0) {
            return;
        }
        class630 var9 = class669.field9390[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class669.field9390[var10] = class669.field9390[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class630(arg2, arg8, arg5, arg4, arg1, arg7, arg3, arg6);
        } else {
            var9.method3541(arg4, -124, arg3, arg2, arg6, arg1, arg8, arg7, arg5);
        }
        class156.field2139++;
        class669.field9390[0] = var9;
        class337.field4272 = class676.field9444;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIII)V", line = 315)
    public static final void method3889(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != -457000927) {
            field9636 = false;
        }
        if (arg0 >= arg2) {
            class636.method3569(arg0, arg4, arg2, arg3 + 804846727, class432.field5765[arg1]);
        } else {
            class636.method3569(arg2, arg4, arg0, 347845800, class432.field5765[arg1]);
        }
        field9634++;
    }
}
