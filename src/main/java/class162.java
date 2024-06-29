import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class162 extends class270 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field2614 = 1024;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    private int field2613 = 1024;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "I")
    private int field2612 = 0;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    private int field2615 = 409;

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    private int field2620 = 1024;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    private int field2623 = 1024;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    private int field2619 = 0;

    @OriginalMember(owner = "client!sd", name = "ib", descriptor = "I")
    private int field2628 = 2048;

    @OriginalMember(owner = "client!sd", name = "hb", descriptor = "I")
    private int field2627 = 819;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "[Lhm;")
    public static class223[] field2624 = new class223[50];

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Lak;")
    public static class20 field2616 = new class20();

    @OriginalMember(owner = "client!sd", name = "jb", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!sd", name = "kb", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!sd", name = "lb", descriptor = "I")
    public static int field2631 = -1;

    @OriginalMember(owner = "client!sd", name = "nb", descriptor = "S")
    public static short field2633 = 256;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!sd", name = "gb", descriptor = "I")
    private int field2626;

    @OriginalMember(owner = "client!sd", name = "mb", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I", line = 8)
    public final int[] method6(int arg0, int arg1) {
        int[] var3 = this.field4573.method919(arg1, 26072);
        field2621++;
        if (arg0 != 18693) {
            return (int[]) null;
        } else if (this.field4573.field1984) {
            int[][] var4 = this.field4573.method920(-99);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class109.field1770 * this.field2628 >> 12;
            int var15 = class109.field1770 * this.field2613 >> 12;
            int var16 = class266.field4496 * this.field2627 >> 12;
            int var17 = class266.field4496 * this.field2615 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            }
            int var18 = class109.field1770 / var15 + 1;
            this.field2626 = class109.field1770 / 8 * this.field2620 >> 12;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2612);
            while (true) {
                while (true) {
                    int var22 = var15 + class73.method525(var14 - var15, var21, true);
                    int var23 = var8 + var22;
                    int var24 = var17 + class73.method525(var16 - var17, var21, true);
                    if (class109.field1770 < var23) {
                        var22 = class109.field1770 - var8;
                        var23 = class109.field1770;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var10;
                        int[] var27 = var20[var10];
                        int var28 = 0;
                        var25 = var27[2];
                        int var29 = var7 + var23;
                        if (var29 < 0) {
                            var29 += class109.field1770;
                        }
                        if (class109.field1770 < var29) {
                            var29 -= class109.field1770;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var30[0] <= var29 && var30[1] >= var29) {
                                if (var10 != var26) {
                                    int var31 = var7 + var8;
                                    if (var31 < 0) {
                                        var31 += class109.field1770;
                                    }
                                    if (var31 > class109.field1770) {
                                        var31 -= class109.field1770;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var10 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var10 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var25 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var31 < var29) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var40 = Math.min(var29, var38);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class109.field1770;
                                            }
                                            this.method1174(var36, var39 + var5, var21, var25 - var36, var40 - var39, var4, (byte) 84);
                                        }
                                    }
                                }
                                var10 = var26;
                                break;
                            }
                            var28++;
                            var26++;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var24 + var25 > class266.field4496) {
                        var24 = class266.field4496 - var25;
                    } else {
                        var9 = false;
                    }
                    if (class109.field1770 == var23) {
                        this.method1174(var25, var6 + var8, var21, var24, var22, var4, (byte) 81);
                        if (var9) {
                            return var3;
                        }
                        var9 = true;
                        var5 = var6;
                        int[] var42 = var19[var13++];
                        var42[1] = var23;
                        var10 = 0;
                        var12 = var13;
                        var42[2] = var24 + var25;
                        var42[0] = var8;
                        var11 = false;
                        int[][] var43 = var20;
                        var13 = 0;
                        var20 = var19;
                        var19 = var43;
                        var8 = 0;
                        var6 = class73.method525(class109.field1770, var21, true);
                        var7 = var6 - var5;
                        int var44 = var7;
                        if (var7 < 0) {
                            var44 = class109.field1770 + var7;
                        }
                        if (class109.field1770 < var44) {
                            var44 -= class109.field1770;
                        }
                        while (true) {
                            int[] var45 = var20[var10];
                            if (var45[0] <= var44 && var44 <= var45[1]) {
                                break;
                            }
                            var10++;
                            if (var12 <= var10) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var41 = var19[var13++];
                        var41[2] = var24 + var25;
                        var41[1] = var23;
                        var41[0] = var8;
                        this.method1174(var25, var6 + var8, var21, var24, var22, var4, (byte) 118);
                        var8 = var23;
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 574)
    public class162() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lmi;II)V", line = 266)
    public final void method8(class92 arg0, int arg1, int arg2) {
        field2622++;
        if (arg1 == 0) {
            this.field2612 = arg0.method702(-1);
        } else if (arg1 == 1) {
            this.field2613 = arg0.method721(77);
        } else if (arg1 == 2) {
            this.field2628 = arg0.method721(88);
        } else if (arg1 == 3) {
            this.field2615 = arg0.method721(93);
        } else if (arg1 == 4) {
            this.field2627 = arg0.method721(111);
        } else if (arg1 == 5) {
            this.field2620 = arg0.method721(107);
        } else if (arg1 == 6) {
            this.field2619 = arg0.method702(-1);
        } else if (arg1 == 7) {
            this.field2623 = arg0.method721(107);
        } else if (arg1 == 8) {
            this.field2614 = arg0.method721(20);
        }
        int var5 = -68 / ((arg2 + 8) / 53);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILjava/util/Random;II[[IB)V", line = 367)
    private final void method1174(int arg0, int arg1, Random arg2, int arg3, int arg4, int[][] arg5, byte arg6) {
        field2617++;
        int var8 = this.field2614 <= 0 ? 4096 : 4096 - class73.method525(this.field2614, arg2, true);
        int var9 = this.field2626 * this.field2623 >> 12;
        int var10 = this.field2626 - (var9 <= 0 ? 0 : class73.method525(var9, arg2, true));
        if (arg6 <= 51) {
            this.method231((byte) 33);
        }
        if (class109.field1770 <= arg1) {
            arg1 -= class109.field1770;
        }
        if (var10 > 0) {
            if (arg3 <= 0 || arg4 <= 0) {
                return;
            }
            int var15 = arg3 / 2;
            int var16 = arg4 / 2;
            int var17 = var16 >= var10 ? var10 : var16;
            int var18 = var15 < var10 ? var15 : var10;
            int var19 = arg4 - var17 * 2;
            int var20 = arg1 + var17;
            for (int var21 = 0; var21 < arg3; var21++) {
                int[] var22 = arg5[arg0 + var21];
                if (var18 <= var21) {
                    int var23 = arg3 - var21 - 1;
                    if (var23 < var18) {
                        int var24 = var8 * var23 / var18;
                        if (this.field2619 == 0) {
                            for (int var25 = 0; var25 < var17; var25++) {
                                int var26 = var8 * var25 / var17;
                                var22[class234.method1648(class49.field717, arg1 + var25)] = var22[class234.method1648(arg1 + arg4 - var25 - 1, class49.field717)] = var24 * var26 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var17; var27++) {
                                int var28 = var8 * var27 / var17;
                                var22[class234.method1648(arg1 + var27, class49.field717)] = var22[class234.method1648(arg1 + arg4 - var27 - 1, class49.field717)] = var24 <= var28 ? var24 : var28;
                            }
                        }
                        if (class109.field1770 < var19 + var20) {
                            int var29 = class109.field1770 - var20;
                            class231.method1632(var22, var20, var29, var24);
                            class231.method1632(var22, 0, var19 - var29, var24);
                        } else {
                            class231.method1632(var22, var20, var19, var24);
                        }
                    } else {
                        for (int var30 = 0; var30 < var17; var30++) {
                            var22[class234.method1648(arg1 + var30, class49.field717)] = var22[class234.method1648(class49.field717, arg1 + arg4 - var30 - 1)] = var8 * var30 / var17;
                        }
                        if (var19 + var20 <= class109.field1770) {
                            class231.method1632(var22, var20, var19, var8);
                        } else {
                            int var31 = class109.field1770 - var20;
                            class231.method1632(var22, var20, var31, var8);
                            class231.method1632(var22, 0, var19 - var31, var8);
                        }
                    }
                } else {
                    int var32 = var8 * var21 / var18;
                    if (this.field2619 == 0) {
                        for (int var33 = 0; var33 < var17; var33++) {
                            int var34 = var8 * var33 / var17;
                            var22[class234.method1648(arg1 + var33, class49.field717)] = var22[class234.method1648(class49.field717, arg1 + arg4 - var33 - 1)] = var32 * var34 >> 12;
                        }
                    } else {
                        for (int var35 = 0; var35 < var17; var35++) {
                            int var36 = var8 * var35 / var17;
                            var22[class234.method1648(arg1 + var35, class49.field717)] = var22[class234.method1648(class49.field717, arg1 + arg4 - var35 - 1)] = var32 > var36 ? var36 : var32;
                        }
                    }
                    if (class109.field1770 < var20 + var19) {
                        int var37 = class109.field1770 - var20;
                        class231.method1632(var22, var20, var37, var32);
                        class231.method1632(var22, 0, var19 - var37, var32);
                    } else {
                        class231.method1632(var22, var20, var19, var32);
                    }
                }
            }
        } else if ((arg1 + arg4) <= class109.field1770) {
            for (int var11 = 0; var11 < arg3; var11++) {
                class231.method1632(arg5[arg0 + var11], arg1, arg4, var8);
            }
        } else {
            int var12 = class109.field1770 - arg1;
            for (int var13 = 0; var13 < arg3; var13++) {
                int[] var14 = arg5[arg0 + var13];
                class231.method1632(var14, arg1, var12, var8);
                class231.method1632(var14, 0, arg4 - var12, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "(B)V", line = 565)
    public final void method231(byte arg0) {
        if (arg0 != 90) {
            this.method231((byte) 96);
        }
        field2618++;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)I", line = 579)
    public static final int method1175(int arg0, boolean arg1) {
        field2625++;
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        if (!arg1) {
            method1176((byte) -80);
        }
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "(B)V", line = 626)
    public static void method1176(byte arg0) {
        field2616 = null;
        if (arg0 != -107) {
            method1176((byte) 113);
        }
        field2624 = null;
    }
}
