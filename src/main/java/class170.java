import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class170 extends class363 {

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
    private int[] field2658 = new int[512];

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Ldha;")
    public static class83 field2655 = new class83();

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field2660 = 0;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(FFIFIFIIII[F)V", line = 7)
    public final void method1254(float arg0, float arg1, int arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, float[] arg10) {
        field2656++;
        int var12 = (int) ((float) arg9 * arg0 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg8 * arg1 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg6 * arg1;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = var18 - (float) var19;
        float var22 = 1.0F - var21;
        int var23 = var20 & var17;
        if (arg2 != -86) {
            return;
        }
        int var24 = var19 & var17;
        float var25 = class632.method3619((byte) -13, var21);
        int var26 = this.field2658[var24];
        int var27 = this.field2658[var23];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = var29 - (float) var30;
            float var33 = 1.0F - var32;
            int var34 = var30 & var15;
            float var35 = class632.method3619((byte) -122, var32);
            int var36 = var31 & var15;
            int var37 = this.field2658[var26 + var34];
            int var38 = this.field2658[var26 + var36];
            int var39 = this.field2658[var27 + var34];
            int var40 = this.field2658[var27 + var36];
            for (int var41 = 0; var41 < arg9; var41++) {
                float var42 = (float) var41 * arg0;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = (float) (-var43) + var42;
                float var46 = 1.0F - var45;
                int var47 = var43 & var13;
                int var48 = var44 & var13;
                float var49 = class632.method3619((byte) -123, var45);
                arg10[arg7++] = arg3 * class4.method29(var25, 114, class4.method29(var35, class587.method3425(arg2, -59), class4.method29(var49, 115, class712.method4005(class702.method3977(this.field2658[var37 + var47], 7), var46, var33, var22, false), class712.method4005(class702.method3977(7, this.field2658[var37 + var48]), var45, var33, var22, false)), class4.method29(var49, 123, class712.method4005(class702.method3977(7, this.field2658[var38 + var47]), var46, var32, var22, false), class712.method4005(class702.method3977(this.field2658[var38 + var48], 7), var45, var32, var22, false))), class4.method29(var35, 107, class4.method29(var49, 121, class712.method4005(class702.method3977(this.field2658[var39 + var47], 7), var46, var33, var21, false), class712.method4005(class702.method3977(this.field2658[var39 + var48], 7), var45, var33, var21, false)), class4.method29(var49, class587.method3425(arg2, -36), class712.method4005(class702.method3977(7, this.field2658[var40 + var47]), var46, var32, var21, false), class712.method4005(class702.method3977(this.field2658[var40 + var48], 7), var45, var32, var21, false))));
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V", line = 101)
    public static final void method1255(int arg0, byte arg1) {
        field2657++;
        if (class724.field10022 == null) {
            class724.field10022 = new byte[4][class768.field10571][class350.field4898];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class768.field10571; var3++) {
                for (int var4 = 0; var4 < class350.field4898; var4++) {
                    class724.field10022[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 < 58) {
            field2660 = 46;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILd;Lha;)V", line = 139)
    public static final void method1256(int arg0, class160 arg1, class65 arg2) {
        field2659++;
        if (class117.field1791 == null) {
            return;
        }
        if (class197.field3016 < 10) {
            if (!class117.field1784.method4337(0, class117.field1791.field10445)) {
                class197.field3016 = class249.field3679.method4334((byte) 113, class117.field1791.field10445) / 10;
                return;
            }
            class488.method2908((byte) 34);
            class197.field3016 = 10;
        }
        if (class197.field3016 == 10) {
            class117.field1806 = class117.field1791.field10454 >> 6 << 6;
            class117.field1804 = class117.field1791.field10447 >> 6 << 6;
            class117.field1803 = (class117.field1791.field10443 >> 6 << 6) + 64 - class117.field1806;
            class117.field1816 = (class117.field1791.field10459 >> 6 << 6) + 64 - class117.field1804;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class117.field1791.method4210(var3, true, (class210.field3250.field5742 >> 9) + class124.field1922, class210.field3250.field5755, class88.field999 + (class210.field3250.field5746 >> 9))) {
                var4 = var3[1] - class117.field1804;
                var5 = var3[2] - class117.field1806;
            }
            if (!class74.field843 && var4 >= 0 && var4 < class117.field1816 && var5 >= 0 && class117.field1803 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class671.field9338 = var7;
                class752.field10398 = var6;
            } else if (class694.field9688 == -1 || class204.field3177 == -1) {
                class117.field1791.method4214((class117.field1791.field10439 & 0xFFFCF12) >> 14, var3, class117.field1791.field10439 & 0x3FFF, -1);
                class752.field10398 = var3[2] - class117.field1806;
                class671.field9338 = var3[1] - class117.field1804;
            } else {
                class117.field1791.method4214(class694.field9688, var3, class204.field3177, -1);
                if (var3 != null) {
                    class752.field10398 = var3[2] - class117.field1806;
                    class671.field9338 = var3[1] - class117.field1804;
                }
                class74.field843 = false;
                class204.field3177 = -1;
                class694.field9688 = -1;
            }
            if (class117.field1791.field10438 == 37) {
                class117.field1796 = 3.0F;
                class117.field1802 = 3.0F;
            } else if (class117.field1791.field10438 == 50) {
                class117.field1796 = 4.0F;
                class117.field1802 = 4.0F;
            } else if (class117.field1791.field10438 == 75) {
                class117.field1796 = 6.0F;
                class117.field1802 = 6.0F;
            } else if (class117.field1791.field10438 == 100) {
                class117.field1796 = 8.0F;
                class117.field1802 = 8.0F;
            } else if (class117.field1791.field10438 == 200) {
                class117.field1796 = 16.0F;
                class117.field1802 = 16.0F;
            } else {
                class117.field1796 = 8.0F;
                class117.field1802 = 8.0F;
            }
            class117.field1793 = (int) class117.field1796 >> 1;
            class117.field1795 = class256.method1666(class117.field1793, arg0 ^ 0xFFFF82FA);
            class665.method3789(arg0 ^ 0xFFFF82B9);
            class117.method895();
            class776.field10670 = new class266();
            class117.field1797 += (int) (Math.random() * 5.0D) - 2;
            if (class117.field1797 < -8) {
                class117.field1797 = -8;
            }
            if (class117.field1797 > 8) {
                class117.field1797 = 8;
            }
            class117.field1799 += (int) (Math.random() * 5.0D) - 2;
            if (class117.field1799 < -16) {
                class117.field1799 = -16;
            }
            if (class117.field1799 > 16) {
                class117.field1799 = 16;
            }
            class117.method888(arg1, class117.field1797 >> 2 << 10, class117.field1799 >> 1);
            class117.field1786.method1237(1024, 0, 256);
            class117.field1788.method4321(arg0 ^ 0xFFFF82FB, 256, 256);
            class117.field1785.method3918(4096, (byte) 117);
            class95.field1084.method1421(1, 256);
            class197.field3016 = 20;
        } else if (class197.field3016 == 20) {
            class594.method3465(true, 97);
            class117.method875(arg2, class117.field1797, class117.field1799);
            class197.field3016 = 60;
            class594.method3465(true, 107);
            class561.method3315(arg0 + 16838);
        } else if (class197.field3016 == 60) {
            if (class117.field1784.method4352((byte) 89, class117.field1791.field10445 + "_staticelements")) {
                if (!class117.field1784.method4337(0, class117.field1791.field10445 + "_staticelements")) {
                    return;
                }
                class117.field1798 = class333.method2123(class117.field1784, class117.field1791.field10445 + "_staticelements", 2, class792.field10895);
            } else {
                class117.field1798 = new class632(0);
            }
            class117.method880();
            class197.field3016 = 70;
            class594.method3465(true, arg0 + 32088);
            class561.method3315(-15168);
        } else if (class197.field3016 == 70) {
            class109.field1610 = new class660(arg2, 11, true, class629.field8819);
            class197.field3016 = 73;
            class594.method3465(true, 111);
            class561.method3315(-15168);
        } else if (class197.field3016 == 73) {
            class695.field9708 = new class660(arg2, 12, true, class629.field8819);
            class197.field3016 = 76;
            class594.method3465(true, 68);
            class561.method3315(-15168);
        } else if (class197.field3016 == 76) {
            class139.field2068 = new class660(arg2, 14, true, class629.field8819);
            class197.field3016 = 79;
            class594.method3465(true, 109);
            class561.method3315(arg0 ^ 0x463A);
        } else if (class197.field3016 == 79) {
            class244.field3627 = new class660(arg2, 17, true, class629.field8819);
            class197.field3016 = 82;
            class594.method3465(true, 121);
            class561.method3315(-15168);
        } else if (class197.field3016 == 82) {
            class704.field9814 = new class660(arg2, 19, true, class629.field8819);
            class197.field3016 = 85;
            class594.method3465(true, 124);
            class561.method3315(-15168);
        } else if (class197.field3016 == 85) {
            class375.field5183 = new class660(arg2, 22, true, class629.field8819);
            class197.field3016 = 88;
            class594.method3465(true, 97);
            class561.method3315(-15168);
        } else if (class197.field3016 == 88) {
            class276.field4019 = new class660(arg2, 26, true, class629.field8819);
            class197.field3016 = 91;
            class594.method3465(true, 84);
            class561.method3315(-15168);
        } else {
            class193.field2977 = new class660(arg2, 30, true, class629.field8819);
            class197.field3016 = 100;
            if (arg0 != -32006) {
                method1255(64, (byte) 99);
            }
            class594.method3465(true, 87);
            class561.method3315(-15168);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 368)
    public static void method1257(byte arg0) {
        if (arg0 == 77) {
            field2655 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(I)V", line = 383)
    public class170(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field2658[var3] = this.field2658[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field2658[var5];
            this.field2658[var5] = this.field2658[var5 + 256] = this.field2658[var4];
            this.field2658[var4] = this.field2658[var4 + 256] = var6;
        }
    }
}
