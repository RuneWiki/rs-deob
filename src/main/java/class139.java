import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class139 {

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field2213 = -1;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
    public static int[] field2214;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1032(int arg0) {
        field2211++;
        int var1 = class21.field313 * 128 + 64;
        int var2 = class78.field1047 * 128 + 64;
        int var3 = class320.method2245((byte) -112, var2, class154.field2392, var1) - class171.field2815;
        if (arg0 != 201) {
            return;
        }
        if (class92.field1230 < 100) {
            if (class43.field588 < var3) {
                class43.field588 += (var3 - class43.field588) * class92.field1230 / 1000 + class132.field1950;
                if (var3 < class43.field588) {
                    class43.field588 = var3;
                }
            }
            if (class317.field5018 < var2) {
                class317.field5018 += (var2 - class317.field5018) * class92.field1230 / 1000 + class132.field1950;
                if (class317.field5018 > var2) {
                    class317.field5018 = var2;
                }
            }
            if (class295.field4572 < var1) {
                class295.field4572 += (var1 - class295.field4572) * class92.field1230 / 1000 + class132.field1950;
                if (class295.field4572 > var1) {
                    class295.field4572 = var1;
                }
            }
            if (var2 < class317.field5018) {
                class317.field5018 -= (class317.field5018 - var2) * class92.field1230 / 1000 + class132.field1950;
                if (var2 > class317.field5018) {
                    class317.field5018 = var2;
                }
            }
            if (class295.field4572 > var1) {
                class295.field4572 -= class132.field1950 + ((class295.field4572 - var1) * class92.field1230 / 1000);
                if (var1 > class295.field4572) {
                    class295.field4572 = var1;
                }
            }
            if (class43.field588 > var3) {
                class43.field588 -= class132.field1950 + ((class43.field588 - var3) * class92.field1230 / 1000);
                if (var3 > class43.field588) {
                    class43.field588 = var3;
                }
            }
        } else {
            class317.field5018 = class78.field1047 * 128 + 64;
            class295.field4572 = class21.field313 * 128 + 64;
            class43.field588 = class320.method2245((byte) -119, class317.field5018, class154.field2392, class295.field4572) - class171.field2815;
        }
        int var4 = class6.field122 * 128 + 64;
        int var5 = class135.field1987 * 128 + 64;
        int var6 = class320.method2245((byte) -57, var4, class154.field2392, var5) - class126.field1816;
        int var7 = var6 - class43.field588;
        int var8 = var5 - class295.field4572;
        int var9 = var4 - class317.field5018;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var8, (double) var9) * -325.949D) & 0x7FF;
        int var13 = var12 - class185.field2999;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var11 > class293.field4536) {
            class293.field4536 += (var11 - class293.field4536) * class14.field236 / 1000 + class319.field5044;
            if (class293.field4536 > var11) {
                class293.field4536 = var11;
            }
        }
        if (class293.field4536 > var11) {
            class293.field4536 -= (class293.field4536 - var11) * class14.field236 / 1000 + class319.field5044;
            if (var11 > class293.field4536) {
                class293.field4536 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class185.field2999 += class14.field236 * var13 / 1000 + class319.field5044;
            class185.field2999 &= 0x7FF;
        }
        if (var13 < 0) {
            class185.field2999 -= -var13 * class14.field236 / 1000 + class319.field5044;
            class185.field2999 &= 0x7FF;
        }
        int var14 = var12 - class185.field2999;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class185.field2999 = var12;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 165)
    public static final void method1033(int arg0, Component arg1) {
        field2212++;
        if (arg0 != 990923265) {
            method1036(-96, (byte[]) null);
        }
        arg1.removeMouseListener(class5.field58);
        arg1.removeMouseMotionListener(class5.field58);
        arg1.removeFocusListener(class5.field58);
        class263.field4131 = 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIBIII)V", line = 190)
    public static final void method1034(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field2215++;
        int var8 = 0;
        int var9 = arg5;
        int var10 = 0;
        int var11 = arg0 - arg7;
        int var12 = arg5 - arg7;
        int var13 = arg0 * arg0;
        int var14 = arg5 * arg5;
        int var15 = var14 << 1;
        int var16 = var12 * var12;
        int var17 = var16 << 1;
        int var18 = var11 * var11;
        int var19 = var18 << 1;
        int var20 = var13 << 1;
        int var21 = arg5 << 1;
        int var22 = var14 - ((var21 - 1) * var20);
        int var23 = (1 - var21) * var13 + var15;
        int var24 = var12 << 1;
        int var25 = (1 - var24) * var18 + var17;
        int var26 = var13 << 2;
        int var27 = var16 - ((var24 - 1) * var19);
        int var28 = var18 << 2;
        int var29 = var16 << 2;
        int var30 = var15 * 3;
        int var31 = var14 << 2;
        int var32 = var17 * 3;
        int var33 = (var21 - 3) * var20;
        int var34 = var31;
        int var35 = (var24 - 3) * var19;
        int var36 = -23 / ((arg4 + 68) / 43);
        int var37 = (arg5 - 1) * var26;
        int var38 = var29;
        int var39 = (var12 - 1) * var28;
        if (class42.field579 <= arg3 && class334.field5205 >= arg3) {
            int[] var40 = class284.field4402[arg3];
            int var41 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - arg0);
            int var42 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg0 + arg1);
            int var43 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var11);
            int var44 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var11);
            class256.method1853(var40, var41, arg6, var43, 0);
            class256.method1853(var40, var43, arg2, var44, 0);
            class256.method1853(var40, var44, arg6, var42, 0);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var22 += var34;
                    var34 += var31;
                    var23 += var30;
                    var30 += var31;
                }
            }
            boolean var45 = var12 >= var9;
            var9--;
            if (var45) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var32;
                        var32 += var29;
                        var10++;
                        var27 += var38;
                        var38 += var29;
                    }
                }
                if (var27 < 0) {
                    var27 += var38;
                    var25 += var32;
                    var38 += var29;
                    var10++;
                    var32 += var29;
                }
                var27 += -var35;
                var35 -= var28;
                var25 += -var39;
                var39 -= var28;
            }
            if (var22 < 0) {
                var8++;
                var22 += var34;
                var34 += var31;
                var23 += var30;
                var30 += var31;
            }
            var22 += -var33;
            var23 += -var37;
            var37 -= var26;
            int var46 = arg3 + var9;
            int var47 = arg3 - var9;
            var33 -= var26;
            if (class42.field579 <= var46 && var47 <= class334.field5205) {
                int var48 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var8);
                int var49 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var8);
                if (var45) {
                    int var50 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 + var10);
                    int var51 = class171.method1280(class291.field4490, (byte) -7, class210.field3309, arg1 - var10);
                    if (class42.field579 <= var47) {
                        int[] var52 = class284.field4402[var47];
                        class256.method1853(var52, var49, arg6, var51, 0);
                        class256.method1853(var52, var51, arg2, var50, 0);
                        class256.method1853(var52, var50, arg6, var48, 0);
                    }
                    if (var46 <= class334.field5205) {
                        int[] var53 = class284.field4402[var46];
                        class256.method1853(var53, var49, arg6, var51, 0);
                        class256.method1853(var53, var51, arg2, var50, 0);
                        class256.method1853(var53, var50, arg6, var48, 0);
                    }
                } else {
                    if (class42.field579 <= var47) {
                        class256.method1853(class284.field4402[var47], var49, arg6, var48, 0);
                    }
                    if (class334.field5205 >= var46) {
                        class256.method1853(class284.field4402[var46], var49, arg6, var48, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 394)
    public static final void method1035() {
        if (class225.field3566 != null) {
            for (int var0 = 0; var0 < class225.field3566.length; var0++) {
                for (int var1 = 0; var1 < class131.field1938; var1++) {
                    for (int var2 = 0; var2 < class308.field4794; var2++) {
                        class225.field3566[var0][var1][var2] = null;
                    }
                }
            }
        }
        class18.field288 = (class247[][]) null;
        if (class111.field1546 != null) {
            for (int var3 = 0; var3 < class111.field1546.length; var3++) {
                for (int var4 = 0; var4 < class131.field1938; var4++) {
                    for (int var5 = 0; var5 < class308.field4794; var5++) {
                        class111.field1546[var3][var4][var5] = null;
                    }
                }
            }
        }
        class34.field493 = (class247[][]) null;
        class163.field2641 = 0;
        if (class5.field60 != null) {
            for (int var6 = 0; var6 < class163.field2641; var6++) {
                class5.field60[var6] = null;
            }
        }
        if (class125.field1815 != null) {
            for (int var7 = 0; var7 < class277.field4269; var7++) {
                class125.field1815[var7] = null;
            }
            class277.field4269 = 0;
        }
        if (class65.field936 != null) {
            for (int var8 = 0; var8 < class65.field936.length; var8++) {
                class65.field936[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[B)V", line = 498)
    public static final void method1036(int arg0, byte[] arg1) {
        field2210++;
        class6 var2 = new class6(arg1);
        var2.field111 = arg1.length - 2;
        class230.field3599 = var2.method39((byte) 91);
        class119.field1659 = new int[class230.field3599];
        class206.field3261 = new int[class230.field3599];
        class193.field3083 = new byte[class230.field3599][];
        class213.field3355 = new int[class230.field3599];
        class81.field1103 = new int[class230.field3599];
        class207.field3298 = new byte[class230.field3599][];
        class18.field300 = new boolean[class230.field3599];
        var2.field111 = arg1.length - class230.field3599 * 8 - 7;
        class243.field3796 = var2.method39((byte) 73);
        class126.field1825 = var2.method39((byte) 41);
        int var3 = (var2.method58(-288140008) & 0xFF) + 1;
        int var4 = 0;
        int var5 = 70 % ((-arg0 - 7) / 60);
        while (class230.field3599 > var4) {
            class119.field1659[var4] = var2.method39((byte) 101);
            var4++;
        }
        for (int var6 = 0; var6 < class230.field3599; var6++) {
            class206.field3261[var6] = var2.method39((byte) 109);
        }
        for (int var7 = 0; var7 < class230.field3599; var7++) {
            class213.field3355[var7] = var2.method39((byte) 62);
        }
        for (int var8 = 0; var8 < class230.field3599; var8++) {
            class81.field1103[var8] = var2.method39((byte) 111);
        }
        var2.field111 = arg1.length - (class230.field3599 * 8) - (var3 - 1) * 3 - 7;
        class81.field1101 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class81.field1101[var9] = var2.method31(-22888);
            if (class81.field1101[var9] == 0) {
                class81.field1101[var9] = 1;
            }
        }
        var2.field111 = 0;
        for (int var10 = 0; var10 < class230.field3599; var10++) {
            int var11 = class213.field3355[var10];
            int var12 = class81.field1103[var10];
            boolean var13 = false;
            int var14 = var11 * var12;
            byte[] var15 = new byte[var14];
            class207.field3298[var10] = var15;
            byte[] var16 = new byte[var14];
            class193.field3083[var10] = var16;
            int var17 = var2.method58(-288140008);
            if ((var17 & 0x1) == 0) {
                for (int var18 = 0; var18 < var14; var18++) {
                    var15[var18] = var2.method83((byte) -77);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var19 = 0; var19 < var14; var19++) {
                        byte var20 = var16[var19] = var2.method83((byte) -89);
                        var13 |= var20 != -1;
                    }
                }
            } else {
                int var21 = 0;
                label98: while (true) {
                    if (var11 <= var21) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var23 = 0;
                        while (true) {
                            if (var23 >= var11) {
                                break label98;
                            }
                            for (int var24 = 0; var24 < var12; var24++) {
                                byte var25 = var16[var11 * var24 + var23] = var2.method83((byte) -77);
                                var13 |= var25 != -1;
                            }
                            var23++;
                        }
                    }
                    for (int var22 = 0; var22 < var12; var22++) {
                        var15[var21 + (var11 * var22)] = var2.method83((byte) -88);
                    }
                    var21++;
                }
            }
            class18.field300[var10] = var13;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 662)
    public static void method1037(int arg0) {
        field2214 = null;
        if (arg0 != 0) {
            field2214 = (int[]) null;
        }
    }
}
