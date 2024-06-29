import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class176 extends class213 {

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "Lob;")
    public static class141 field3483 = class175.method1195(40, "M");

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field3490 = 0;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Lob;")
    public static class141 field3496 = class175.method1195(40, "welle2:");

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field3487 = 0;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public static int field3485;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "Lph;")
    public static class157 field3494;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Lrg;")
    public class176 field3489;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lrg;")
    public class176 field3491;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3488;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "[[[B")
    public static byte[][][] field3497;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static final void method1199(int arg0) {
        if (arg0 != -9748) {
            return;
        }
        Object var1 = class123.field2355;
        synchronized (class123.field2355) {
            if (class158.field3062 == 0) {
                class69.field1356.method1256(arg0 + 13108, 5, new class166());
            }
            class158.field3062 = 600;
        }
        field3492++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public final void method1200(byte arg0) {
        field3495++;
        if (this.field3489 == null) {
            return;
        }
        if (arg0 != 122) {
            field3483 = null;
        }
        this.field3489.field3491 = this.field3491;
        this.field3491.field3489 = this.field3489;
        this.field3489 = null;
        this.field3491 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)I")
    public static final int method1201(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -91 % ((-arg3 - 18) / 42);
        field3486++;
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        return (arg0 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1202(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field3485++;
        class182.method1229(-16361, arg2);
        int var7 = 0;
        int var8 = arg2 - arg5;
        int var9 = arg2;
        int var10 = -arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var11 = var8;
        int var12 = -1;
        int var13 = -var8;
        int var14 = -1;
        int[] var15 = class41.field805[arg1];
        int var16 = -29 / ((-arg4 - 81) / 35);
        int var17 = arg0 - var8;
        int var18 = arg0 + var8;
        class180.method1217(var17, (byte) 52, arg0 - arg2, arg6, var15);
        class180.method1217(var18, (byte) 52, var17, arg3, var15);
        class180.method1217(arg0 + arg2, (byte) 52, var18, arg6, var15);
        while (var9 > var7) {
            var14 += 2;
            var13 += var14;
            if (var13 >= 0 && var11 >= 1) {
                class211.field4014[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var7++;
            var12 += 2;
            var10 += var12;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var19 = class41.field805[arg1 + var9];
                    int[] var20 = class41.field805[arg1 - var9];
                    int var21 = arg0 + var7;
                    int var22 = class211.field4014[var9];
                    int var23 = arg0 - var7;
                    int var24 = arg0 - var22;
                    int var25 = arg0 + var22;
                    class180.method1217(var24, (byte) 52, var23, arg6, var19);
                    class180.method1217(var25, (byte) 52, var24, arg3, var19);
                    class180.method1217(var21, (byte) 52, var25, arg6, var19);
                    class180.method1217(var24, (byte) 52, var23, arg6, var20);
                    class180.method1217(var25, (byte) 52, var24, arg3, var20);
                    class180.method1217(var21, (byte) 52, var25, arg6, var20);
                } else {
                    int[] var26 = class41.field805[arg1 + var9];
                    int var27 = arg0 + var7;
                    int[] var28 = class41.field805[arg1 - var9];
                    int var29 = arg0 - var7;
                    class180.method1217(var27, (byte) 52, var29, arg6, var26);
                    class180.method1217(var27, (byte) 52, var29, arg6, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var30 = class41.field805[arg1 + var7];
            int var31 = arg0 - var9;
            int[] var32 = class41.field805[arg1 - var7];
            int var33 = arg0 + var9;
            if (var7 >= var8) {
                class180.method1217(var33, (byte) 52, var31, arg6, var30);
                class180.method1217(var33, (byte) 52, var31, arg6, var32);
            } else {
                int var34 = var7 <= var11 ? var11 : class211.field4014[var7];
                int var35 = arg0 + var34;
                int var36 = arg0 - var34;
                class180.method1217(var36, (byte) 52, var31, arg6, var30);
                class180.method1217(var35, (byte) 52, var36, arg3, var30);
                class180.method1217(var33, (byte) 52, var35, arg6, var30);
                class180.method1217(var36, (byte) 52, var31, arg6, var32);
                class180.method1217(var35, (byte) 52, var36, arg3, var32);
                class180.method1217(var33, (byte) 52, var35, arg6, var32);
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIBII)V")
    public static final void method1203(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 != -26) {
            return;
        }
        field3493++;
        int var5 = 0;
        int var6 = arg4;
        int var7 = -1;
        int var8 = class106.method703(class68.field1323, class136.field2590, true, arg1 + arg4);
        int var9 = class106.method703(class68.field1323, class136.field2590, true, arg1 - arg4);
        int var10 = -arg4;
        class180.method1217(var8, (byte) 52, var9, arg0, class41.field805[arg3]);
        while (var6 > var5) {
            var7 += 2;
            var10 += var7;
            if (var10 > 0) {
                var6--;
                var10 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (var12 >= class35.field698 && var11 <= class130.field2470) {
                    int var13 = class106.method703(class68.field1323, class136.field2590, true, arg1 + var5);
                    int var14 = class106.method703(class68.field1323, class136.field2590, true, arg1 - var5);
                    if (var12 <= class130.field2470) {
                        class180.method1217(var13, (byte) 52, var14, arg0, class41.field805[var12]);
                    }
                    if (class35.field698 <= var11) {
                        class180.method1217(var13, (byte) 52, var14, arg0, class41.field805[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg3 + var5;
            int var16 = arg3 - var5;
            if (class35.field698 <= var15 && class130.field2470 >= var16) {
                int var17 = class106.method703(class68.field1323, class136.field2590, true, arg1 + var6);
                int var18 = class106.method703(class68.field1323, class136.field2590, true, arg1 - var6);
                if (class130.field2470 >= var15) {
                    class180.method1217(var17, (byte) 52, var18, arg0, class41.field805[var15]);
                }
                if (var16 >= class35.field698) {
                    class180.method1217(var17, (byte) 52, var18, arg0, class41.field805[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
    public static void method1204(int arg0) {
        field3497 = null;
        field3494 = null;
        if (arg0 == 8) {
            field3483 = null;
            field3496 = null;
            field3488 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILdg;I)V")
    public static final void method1205(int arg0, int arg1, int arg2, class38 arg3, int arg4) {
        field3484++;
        if (class114.field2176 == arg3) {
            return;
        }
        int var5 = -48 / ((-arg1 - 24) / 36);
        if (class188.field3637 >= 400) {
            return;
        }
        class141 var6;
        if (arg3.field755 == 0) {
            var6 = class220.method1422(new class141[] { arg3.field773, class166.method1146(class114.field2176.field767, arg3.field767, false), class204.field3910, class18.field317, class78.method543((byte) 93, arg3.field767), class98.field1943 }, -3);
        } else {
            var6 = class220.method1422(new class141[] { arg3.field773, class204.field3910, class129.field2453, class78.method543((byte) 93, arg3.field755), class98.field1943 }, -3);
        }
        if (class29.field568 == 1) {
            class65.method430(class220.method1422(new class141[] { class179.field3522, class181.field3565, var6 }, -3), class59.field1150, 0, (short) 41, (long) arg4, arg2, arg0);
            class196.field3744++;
        } else if (!class61.field1194) {
            for (int var7 = 7; var7 >= 0; var7--) {
                if (class67.field1308[var7] != null) {
                    class209.field3976++;
                    short var8 = 0;
                    boolean var9 = false;
                    if (class160.field3117 == 0 && class67.field1308[var7].method933((byte) -77, class29.field564)) {
                        if (arg3.field767 > class114.field2176.field767) {
                            var8 = 2000;
                        }
                        if (class114.field2176.field775 != 0 && arg3.field775 != 0) {
                            if (class114.field2176.field775 == arg3.field775) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class59.field1145[var7]) {
                        var8 = 2000;
                    }
                    short var10 = class18.field323[var7];
                    short var11 = (short) (var8 + var10);
                    class65.method430(class220.method1422(new class141[] { class57.field1095, var6 }, -3), class67.field1308[var7], 0, var11, (long) arg4, arg2, arg0);
                }
            }
        } else if ((class111.field2155 & 0x8) == 8) {
            class65.method430(class220.method1422(new class141[] { class185.field3607, class181.field3565, var6 }, -3), class4.field45, 0, (short) 42, (long) arg4, arg2, arg0);
            class123.field2353++;
        }
        for (int var12 = 0; var12 < class188.field3637; var12++) {
            if (class157.field3026[var12] == 43) {
                class223.field4210[var12] = class220.method1422(new class141[] { class57.field1095, var6 }, -3);
                return;
            }
        }
    }
}
