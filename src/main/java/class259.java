import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class259 extends class262 {

    @OriginalMember(owner = "client!ui", name = "X", descriptor = "I")
    private int field4305 = 1024;

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    private int field4301 = 0;

    @OriginalMember(owner = "client!ui", name = "Z", descriptor = "I")
    private int field4307 = 819;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    private int field4300 = 1024;

    @OriginalMember(owner = "client!ui", name = "eb", descriptor = "I")
    private int field4312 = 2048;

    @OriginalMember(owner = "client!ui", name = "fb", descriptor = "I")
    private int field4313 = 1024;

    @OriginalMember(owner = "client!ui", name = "bb", descriptor = "I")
    private int field4309 = 0;

    @OriginalMember(owner = "client!ui", name = "hb", descriptor = "I")
    private int field4315 = 409;

    @OriginalMember(owner = "client!ui", name = "ib", descriptor = "I")
    private int field4316 = 1024;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "Lok;")
    public static class146 field4299 = class235.method1724(-12908, "leuchten2:");

    @OriginalMember(owner = "client!ui", name = "ab", descriptor = "[I")
    public static int[] field4308 = new int[500];

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "Lok;")
    public static class146 field4302 = class235.method1724(-12908, "Hidden)2");

    @OriginalMember(owner = "client!ui", name = "gb", descriptor = "[I")
    public static int[] field4314 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ui", name = "W", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!ui", name = "Y", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!ui", name = "cb", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!ui", name = "db", descriptor = "I")
    public static int field4311;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V", line = 4)
    private final void method1877(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        field4296++;
        int var8 = this.field4305 > 0 ? 4096 - class9.method66(-482656096, this.field4305, arg6) : 4096;
        if (arg1 != -2059001524) {
            this.field4307 = 4;
        }
        int var9 = this.field4306 * this.field4300 >> 12;
        int var10 = this.field4306 - (var9 <= 0 ? 0 : class9.method66(arg1 ^ 0x667D61EC, var9, arg6));
        if (arg3 >= class98.field1598) {
            arg3 -= class98.field1598;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg2 <= 0) {
                return;
            }
            int var11 = arg2 / 2;
            int var12 = var10 > var11 ? var11 : var10;
            int var13 = arg4 / 2;
            int var14 = var10 <= var13 ? var10 : var13;
            int var15 = arg2 - (var12 * 2);
            int var16 = arg3 + var12;
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg5[arg0 + var17];
                if (var14 <= var17) {
                    int var19 = arg4 - var17 - 1;
                    if (var14 <= var19) {
                        for (int var20 = 0; var20 < var12; var20++) {
                            var18[class82.method582(arg3 + var20, class218.field3595)] = var18[class82.method582(arg3 - (var20 + 1 - arg2), class218.field3595)] = var8 * var20 / var12;
                        }
                        if ((var15 + var16) <= class98.field1598) {
                            class244.method1767(var18, var16, var15, var8);
                        } else {
                            int var21 = class98.field1598 - var16;
                            class244.method1767(var18, var16, var21, var8);
                            class244.method1767(var18, 0, var15 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field4301 == 0) {
                            for (int var25 = 0; var25 < var12; var25++) {
                                int var26 = var8 * var25 / var12;
                                var18[class82.method582(class218.field3595, arg3 + var25)] = var18[class82.method582(class218.field3595, arg3 + arg2 - var25 - 1)] = var22 * var26 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var12; var23++) {
                                int var24 = var8 * var23 / var12;
                                var18[class82.method582(arg3 + var23, class218.field3595)] = var18[class82.method582(arg2 + arg3 - var23 - 1, class218.field3595)] = var22 > var24 ? var24 : var22;
                            }
                        }
                        if (var15 + var16 > class98.field1598) {
                            int var27 = class98.field1598 - var16;
                            class244.method1767(var18, var16, var27, var22);
                            class244.method1767(var18, 0, var15 - var27, var22);
                        } else {
                            class244.method1767(var18, var16, var15, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field4301 == 0) {
                        for (int var31 = 0; var31 < var12; var31++) {
                            int var32 = var8 * var31 / var12;
                            var18[class82.method582(class218.field3595, arg3 + var31)] = var18[class82.method582(class218.field3595, arg3 + arg2 - var31 - 1)] = var28 * var32 >> 12;
                        }
                    } else {
                        for (int var29 = 0; var29 < var12; var29++) {
                            int var30 = var8 * var29 / var12;
                            var18[class82.method582(class218.field3595, arg3 + var29)] = var18[class82.method582(arg2 + arg3 - var29 - 1, class218.field3595)] = var30 >= var28 ? var28 : var30;
                        }
                    }
                    if (class98.field1598 < (var15 + var16)) {
                        int var33 = class98.field1598 - var16;
                        class244.method1767(var18, var16, var33, var28);
                        class244.method1767(var18, 0, var15 - var33, var28);
                    } else {
                        class244.method1767(var18, var16, var15, var28);
                    }
                }
            }
        } else if (class98.field1598 >= arg2 + arg3) {
            for (int var34 = 0; var34 < arg4; var34++) {
                class244.method1767(arg5[arg0 + var34], arg3, arg2, var8);
            }
        } else {
            int var35 = class98.field1598 - arg3;
            for (int var36 = 0; var36 < arg4; var36++) {
                int[] var37 = arg5[arg0 + var36];
                class244.method1767(var37, arg3, var35, var8);
                class244.method1767(var37, 0, arg2 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Ldl;", line = 205)
    public static final class35 method1878(int arg0, int arg1) {
        field4311++;
        class35 var2 = (class35) class87.field1381.method799((byte) 52, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class183.field3067.method92(arg1, 0, arg0);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method250(arg0, new class47(var3), true);
        }
        class87.field1381.method797(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZLwe;IIIIII)V", line = 225)
    public static final void method1879(int arg0, boolean arg1, class47 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4304++;
        if (arg6 >= 0 && arg6 < 104 && arg8 >= 0 && arg8 < 104) {
            if (!arg1) {
                class46.field775[arg5][arg6][arg8] = 0;
            }
            while (true) {
                int var9 = arg2.method368(-105);
                if (var9 == 0) {
                    if (arg1) {
                        class174.field2914[0][arg6][arg8] = class300.field5082[0][arg6][arg8];
                    } else if (arg5 == 0) {
                        class174.field2914[0][arg6][arg8] = -class312.method2191((byte) -107, arg3 + arg8 + 556238, arg6 + arg7 + 932731) * 8;
                    } else {
                        class174.field2914[arg5][arg6][arg8] = class174.field2914[arg5 - 1][arg6][arg8] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method368(75);
                    if (arg1) {
                        class174.field2914[0][arg6][arg8] = var10 * 8 + class300.field5082[0][arg6][arg8];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class174.field2914[0][arg6][arg8] = -var10 * 8;
                        } else {
                            class174.field2914[arg5][arg6][arg8] = class174.field2914[arg5 - 1][arg6][arg8] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class55.field988[arg5][arg6][arg8] = arg2.method352(255);
                    class292.field4973[arg5][arg6][arg8] = (byte) ((var9 - 2) / 4);
                    class20.field389[arg5][arg6][arg8] = (byte) class82.method582(3, arg0 + var9 - 2);
                } else if (var9 > 81) {
                    class118.field1914[arg5][arg6][arg8] = (byte) (var9 - 81);
                } else if (!arg1) {
                    class46.field775[arg5][arg6][arg8] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method368(-116);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method368(-115);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method368(-117);
                }
            }
        }
        if (arg4 != 8) {
            field4297 = 116;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lwe;II)V", line = 360)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4309 = arg0.method368(-108);
        } else if (arg2 == 1) {
            this.field4313 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field4312 = arg0.method379(-2);
        } else if (arg2 == 3) {
            this.field4315 = arg0.method379(-2);
        } else if (arg2 == 4) {
            this.field4307 = arg0.method379(-2);
        } else if (arg2 == 5) {
            this.field4316 = arg0.method379(-2);
        } else if (arg2 == 6) {
            this.field4301 = arg0.method368(-123);
        } else if (arg2 == 7) {
            this.field4300 = arg0.method379(arg1 ^ 0xFFFFF7FE);
        } else if (arg2 == 8) {
            this.field4305 = arg0.method379(arg1 ^ 0xFFFFF7FE);
        }
        if (arg1 != 2048) {
            method1879(-39, true, (class47) null, -95, -4, -80, 42, -79, 30);
        }
        field4298++;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 742)
    public class259() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 451)
    public final void method43(int arg0) {
        field4303++;
        if (arg0 != -2) {
            this.method40((class47) null, 93, 55);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)[I", line = 464)
    public final int[] method38(int arg0, byte arg1) {
        field4310++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 113);
        if (this.field4350.field3333) {
            int[][] var4 = this.field4350.method1533(21819);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            boolean var8 = true;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            int var12 = class98.field1598 * this.field4313 >> 12;
            int var13 = 0;
            int var14 = class98.field1598 * this.field4312 >> 12;
            int var15 = 0;
            int var16 = class104.field1676 * this.field4315 >> 12;
            int var17 = class104.field1676 * this.field4307 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field4306 = class98.field1598 / 8 * this.field4316 >> 12;
            int var18 = (class98.field1598 / var12) + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field4309);
            label134: while (true) {
                while (true) {
                    int var22 = var12 + class9.method66(-482656096, var14 - var12, var21);
                    int var23 = var16 + class9.method66(-482656096, var17 - var16, var21);
                    int var24 = var7 + var22;
                    if (class98.field1598 < var24) {
                        var22 = class98.field1598 - var7;
                        var24 = class98.field1598;
                    }
                    int var27;
                    if (var11) {
                        var27 = 0;
                    } else {
                        int var25 = var10;
                        int[] var26 = var20[var10];
                        var27 = var26[2];
                        int var28 = 0;
                        int var29 = var24 + var5;
                        if (var29 < 0) {
                            var29 += class98.field1598;
                        }
                        if (var29 > class98.field1598) {
                            var29 -= class98.field1598;
                        }
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var30[0] <= var29 && var29 <= var30[1]) {
                                if (var10 != var25) {
                                    int var31 = var5 + var7;
                                    if (var31 < 0) {
                                        var31 += class98.field1598;
                                    }
                                    if (var31 > class98.field1598) {
                                        var31 -= class98.field1598;
                                    }
                                    for (int var32 = 1; var32 <= var28; var32++) {
                                        int[] var33 = var20[(var10 + var32) % var15];
                                        var27 = Math.max(var27, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var28; var34++) {
                                        int[] var35 = var20[(var10 + var34) % var15];
                                        int var36 = var35[2];
                                        if (var27 != var36) {
                                            int var37 = var35[0];
                                            int var38 = var35[1];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var37);
                                                var40 = Math.min(var29, var38);
                                            } else if (var37 == 0) {
                                                var40 = Math.min(var29, var38);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class98.field1598;
                                            }
                                            this.method1877(var36, -2059001524, var40 - var39, var6 + var39, var27 - var36, var4, var21);
                                        }
                                    }
                                }
                                var10 = var25;
                                break;
                            }
                            var25++;
                            if (var25 >= var15) {
                                var25 = 0;
                            }
                            var28++;
                        }
                    }
                    if (class104.field1676 >= var23 + var27) {
                        var8 = false;
                    } else {
                        var23 = class104.field1676 - var27;
                    }
                    if (class98.field1598 == var24) {
                        this.method1877(var27, -2059001524, var22, var7 + var9, var23, var4, var21);
                        if (var8) {
                            break label134;
                        }
                        var10 = 0;
                        var6 = var9;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var41[2] = var27 + var23;
                        var20 = var19;
                        var15 = var13;
                        var19 = var42;
                        var8 = true;
                        var41[0] = var7;
                        var7 = 0;
                        var13 = 0;
                        var9 = class9.method66(-482656096, class98.field1598, var21);
                        var5 = var9 - var6;
                        int var43 = var5;
                        var11 = false;
                        if (var5 < 0) {
                            var43 = class98.field1598 + var5;
                        }
                        if (class98.field1598 < var43) {
                            var43 -= class98.field1598;
                        }
                        while (true) {
                            int[] var44 = var20[var10];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                break;
                            }
                            var10++;
                            if (var10 >= var15) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[0] = var7;
                        var45[2] = var23 + var27;
                        this.method1877(var27, -2059001524, var22, var7 + var9, var23, var4, var21);
                        var7 = var24;
                    }
                }
            }
        }
        if (arg1 > -85) {
            this.field4312 = -1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "(I)V", line = 727)
    public static void method1880(int arg0) {
        field4308 = null;
        field4302 = null;
        if (arg0 == 2678) {
            field4314 = null;
            field4299 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(III)J", line = 752)
    public static final long method1881(int arg0, int arg1, int arg2) {
        class11 var3 = class203.field3382[arg0][arg1][arg2];
        return var3 == null || var3.field205 == null ? 0L : var3.field205.field2787;
    }
}
