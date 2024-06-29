import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class193 extends class264 {

    @OriginalMember(owner = "client!mi", name = "jb", descriptor = "I")
    private int field2999 = 819;

    @OriginalMember(owner = "client!mi", name = "hb", descriptor = "I")
    private int field2997 = 0;

    @OriginalMember(owner = "client!mi", name = "mb", descriptor = "I")
    private int field3002 = 409;

    @OriginalMember(owner = "client!mi", name = "pb", descriptor = "I")
    private int field3005 = 1024;

    @OriginalMember(owner = "client!mi", name = "tb", descriptor = "I")
    private int field3009 = 1024;

    @OriginalMember(owner = "client!mi", name = "qb", descriptor = "I")
    private int field3006 = 1024;

    @OriginalMember(owner = "client!mi", name = "wb", descriptor = "I")
    private int field3012 = 1024;

    @OriginalMember(owner = "client!mi", name = "Ab", descriptor = "I")
    private int field3016 = 2048;

    @OriginalMember(owner = "client!mi", name = "Cb", descriptor = "I")
    private int field3018 = 0;

    @OriginalMember(owner = "client!mi", name = "ob", descriptor = "Lma;")
    public static class5 field3004 = class12.method119("Bitte warten Sie)3)3)3", (byte) 99);

    @OriginalMember(owner = "client!mi", name = "ub", descriptor = "Lma;")
    public static class5 field3010 = class12.method119("n", (byte) 53);

    @OriginalMember(owner = "client!mi", name = "fb", descriptor = "Ltj;")
    public static class73 field2995 = new class73(500);

    @OriginalMember(owner = "client!mi", name = "gb", descriptor = "I")
    private int field2996;

    @OriginalMember(owner = "client!mi", name = "ib", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!mi", name = "kb", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!mi", name = "lb", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!mi", name = "nb", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!mi", name = "rb", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!mi", name = "sb", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!mi", name = "vb", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!mi", name = "xb", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!mi", name = "yb", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!mi", name = "zb", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!mi", name = "Bb", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)V", line = 8)
    public static void method1263(int arg0) {
        field3004 = null;
        int var1 = 7 / ((arg0 - 55) / 54);
        field2995 = null;
        field3010 = null;
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(III)V", line = 25)
    public static final void method1264(int arg0, int arg1, int arg2) {
        field3014++;
        if (arg1 != 4) {
            field3004 = (class5) null;
        }
        if (class247.field4092 != 0 && arg2 != -1) {
            class217.method1468(class247.field4092, false, true, arg2, 0, class172.field2652);
            class278.field4726 = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[[ILjava/util/Random;IIII)V", line = 42)
    private final void method1265(int arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        field2998++;
        int var8 = this.field3009 <= 0 ? 4096 : 4096 - class81.method555((byte) -57, this.field3009, arg2);
        int var9 = this.field3006 * this.field2996 >> 12;
        int var10 = this.field2996 - (arg5 < var9 ? class81.method555((byte) -57, var9, arg2) : 0);
        if (arg0 >= class226.field3716) {
            arg0 -= class226.field3716;
        }
        if (var10 > 0) {
            if (arg4 <= 0 || arg3 <= 0) {
                return;
            }
            int var11 = arg3 / 2;
            int var12 = arg4 / 2;
            int var13 = var10 > var12 ? var12 : var10;
            int var14 = var10 <= var11 ? var10 : var11;
            int var15 = arg0 + var14;
            int var16 = arg3 - (var14 * 2);
            for (int var17 = 0; var17 < arg4; var17++) {
                int[] var18 = arg1[var17 + arg6];
                if (var17 < var13) {
                    int var19 = var8 * var17 / var13;
                    if (this.field2997 == 0) {
                        for (int var22 = 0; var22 < var14; var22++) {
                            int var23 = var8 * var22 / var14;
                            var18[class204.method1354(arg0 + var22, class256.field4370)] = var18[class204.method1354(class256.field4370, arg3 + arg0 - var22 - 1)] = var19 * var23 >> 12;
                        }
                    } else {
                        for (int var20 = 0; var20 < var14; var20++) {
                            int var21 = var8 * var20 / var14;
                            var18[class204.method1354(arg0 + var20, class256.field4370)] = var18[class204.method1354(arg0 - (1 - arg3) - var20, class256.field4370)] = var21 < var19 ? var21 : var19;
                        }
                    }
                    if (var15 + var16 > class226.field3716) {
                        int var24 = class226.field3716 - var15;
                        class42.method292(var18, var15, var24, var19);
                        class42.method292(var18, 0, var16 - var24, var19);
                    } else {
                        class42.method292(var18, var15, var16, var19);
                    }
                } else {
                    int var25 = arg4 - var17 - 1;
                    if (var25 < var13) {
                        int var26 = var8 * var25 / var13;
                        if (this.field2997 == 0) {
                            for (int var29 = 0; var29 < var14; var29++) {
                                int var30 = var8 * var29 / var14;
                                var18[class204.method1354(class256.field4370, arg0 + var29)] = var18[class204.method1354(class256.field4370, arg3 + arg0 - var29 - 1)] = var26 * var30 >> 12;
                            }
                        } else {
                            for (int var27 = 0; var27 < var14; var27++) {
                                int var28 = var8 * var27 / var14;
                                var18[class204.method1354(class256.field4370, arg0 + var27)] = var18[class204.method1354(class256.field4370, arg0 - (var27 + 1 - arg3))] = var28 >= var26 ? var26 : var28;
                            }
                        }
                        if ((var15 + var16) <= class226.field3716) {
                            class42.method292(var18, var15, var16, var26);
                        } else {
                            int var31 = class226.field3716 - var15;
                            class42.method292(var18, var15, var31, var26);
                            class42.method292(var18, 0, var16 - var31, var26);
                        }
                    } else {
                        for (int var32 = 0; var32 < var14; var32++) {
                            var18[class204.method1354(arg0 + var32, class256.field4370)] = var18[class204.method1354(arg0 + arg3 - (var32 + 1), class256.field4370)] = var8 * var32 / var14;
                        }
                        if (class226.field3716 < (var15 + var16)) {
                            int var33 = class226.field3716 - var15;
                            class42.method292(var18, var15, var33, var8);
                            class42.method292(var18, 0, var16 - var33, var8);
                        } else {
                            class42.method292(var18, var15, var16, var8);
                        }
                    }
                }
            }
        } else if (arg0 + arg3 <= class226.field3716) {
            for (int var34 = 0; var34 < arg4; var34++) {
                class42.method292(arg1[arg6 + var34], arg0, arg3, var8);
            }
        } else {
            int var35 = class226.field3716 - arg0;
            for (int var36 = 0; var36 < arg4; var36++) {
                int[] var37 = arg1[arg6 + var36];
                class42.method292(var37, arg0, var35, var8);
                class42.method292(var37, 0, arg3 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 232)
    public class193() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I", line = 241)
    public final int[] method5(int arg0, int arg1) {
        field3011++;
        int[] var3 = this.field4501.method1176(arg1, 126);
        if (this.field4501.field2741) {
            int var4 = 0;
            int[][] var5 = this.field4501.method1175((byte) 102);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class226.field3716 * this.field3012 >> 12;
            int var15 = class119.field1807 * this.field3002 >> 12;
            int var16 = class226.field3716 * this.field3016 >> 12;
            int var17 = class119.field1807 * this.field2999 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            }
            this.field2996 = class226.field3716 / 8 * this.field3005 >> 12;
            int var18 = (class226.field3716 / var14) + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field3018);
            int[][] var21 = new int[var18][3];
            label142: while (true) {
                while (true) {
                    int var22 = class81.method555((byte) -57, var16 - var14, var20) + var14;
                    int var23 = class81.method555((byte) -57, var17 - var15, var20) + var15;
                    int var24 = var8 + var22;
                    if (class226.field3716 < var24) {
                        var22 = class226.field3716 - var8;
                        var24 = class226.field3716;
                    }
                    int var27;
                    if (var11) {
                        var27 = 0;
                    } else {
                        int[] var25 = var21[var10];
                        int var26 = 0;
                        var27 = var25[2];
                        int var28 = var10;
                        int var29 = var6 + var24;
                        if (var29 < 0) {
                            var29 += class226.field3716;
                        }
                        if (var29 > class226.field3716) {
                            var29 -= class226.field3716;
                        }
                        while (true) {
                            int[] var30 = var21[var28];
                            if (var29 >= var30[0] && var29 <= var30[1]) {
                                if (var10 != var28) {
                                    int var31 = var6 + var8;
                                    if (var31 < 0) {
                                        var31 += class226.field3716;
                                    }
                                    if (var31 > class226.field3716) {
                                        var31 -= class226.field3716;
                                    }
                                    for (int var32 = 1; var32 <= var26; var32++) {
                                        int[] var33 = var21[(var10 + var32) % var12];
                                        var27 = Math.max(var27, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var26; var34++) {
                                        int[] var35 = var21[(var10 + var34) % var12];
                                        int var36 = var35[2];
                                        if (var27 != var36) {
                                            int var37 = var35[1];
                                            int var38 = var35[0];
                                            int var39;
                                            int var40;
                                            if (var29 > var31) {
                                                var39 = Math.max(var31, var38);
                                                var40 = Math.min(var29, var37);
                                            } else if (var38 == 0) {
                                                var40 = Math.min(var29, var37);
                                                var39 = 0;
                                            } else {
                                                var39 = Math.max(var31, var38);
                                                var40 = class226.field3716;
                                            }
                                            this.method1265(var7 + var39, var5, var20, var40 - var39, -var36 + var27, 0, var36);
                                        }
                                    }
                                }
                                var10 = var28;
                                break;
                            }
                            var28++;
                            if (var28 >= var12) {
                                var28 = 0;
                            }
                            var26++;
                        }
                    }
                    if (var23 + var27 > class119.field1807) {
                        var23 = class119.field1807 - var27;
                    } else {
                        var9 = false;
                    }
                    if (class226.field3716 == var24) {
                        this.method1265(var8 + var4, var5, var20, var22, var23, 0, var27);
                        if (var9) {
                            break label142;
                        }
                        var10 = 0;
                        int[] var41 = var19[var13++];
                        var12 = var13;
                        var13 = 0;
                        var41[0] = var8;
                        var41[2] = var27 + var23;
                        var11 = false;
                        var8 = 0;
                        var41[1] = var24;
                        var9 = true;
                        int[][] var42 = var21;
                        var7 = var4;
                        var4 = class81.method555((byte) -57, class226.field3716, var20);
                        var6 = var4 - var7;
                        int var43 = var6;
                        if (var6 < 0) {
                            var43 = class226.field3716 + var6;
                        }
                        if (var43 > class226.field3716) {
                            var43 -= class226.field3716;
                        }
                        var21 = var19;
                        while (true) {
                            int[] var44 = var21[var10];
                            if (var43 >= var44[0] && var44[1] >= var43) {
                                var19 = var42;
                                break;
                            }
                            var10++;
                            if (var10 >= var12) {
                                var10 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[0] = var8;
                        var45[2] = var23 + var27;
                        this.method1265(var8 + var4, var5, var20, var22, var23, 0, var27);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 > -58) {
            this.method1265(-45, (int[][]) ((int[][]) null), (Random) null, -81, -16, 105, 10);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V", line = 494)
    public static final void method1266(boolean arg0) {
        field3007++;
        try {
            if (!arg0) {
                field2995 = (class73) null;
            }
            if (class164.field2511 == null) {
                class164.field2511 = new class219(class267.field4597, class288.method1940((byte) 75, new class5[] { class240.method1698((byte) 119), class86.field1304 }).method53(0));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class164.field2511 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(B)V", line = 523)
    public static final void method1267(byte arg0) {
        field3003++;
        if (arg0 == -66) {
            for (int var1 = 0; var1 < 100; var1++) {
                class296.field4975[var1] = true;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V", line = 561)
    public final void method111(int arg0) {
        int var2 = -72 % ((66 - arg0) / 44);
        field3015++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lni;BII)[Lrj;", line = 599)
    public static final class237[] method1268(class202 arg0, byte arg1, int arg2, int arg3) {
        field3013++;
        if (arg1 >= -13) {
            method1268((class202) null, (byte) -19, 46, -39);
        }
        return class180.method1171(arg3, arg2, arg0, (byte) -128) ? class112.method743(77) : null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 614)
    public static final byte[] method1269(boolean arg0, Object arg1, int arg2) {
        field3008++;
        if (arg1 == null) {
            return null;
        } else if (arg2 != 2) {
            return (byte[]) null;
        } else if ((arg1 instanceof byte[])) {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return arg0 ? class13.method128(var4, -22046) : var4;
        } else if ((arg1 instanceof class243)) {
            class243 var3 = (class243) arg1;
            return var3.method1023(127);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILii;)V", line = 673)
    public final void method4(int arg0, int arg1, class221 arg2) {
        field3001++;
        if (arg0 == 0) {
            this.field3018 = arg2.method1509(true);
        } else if (arg0 == 1) {
            this.field3012 = arg2.method1524((byte) 120);
        } else if (arg0 == 2) {
            this.field3016 = arg2.method1524((byte) 121);
        } else if (arg0 == 3) {
            this.field3002 = arg2.method1524((byte) 66);
        } else if (arg0 == 4) {
            this.field2999 = arg2.method1524((byte) 82);
        } else if (arg0 == 5) {
            this.field3005 = arg2.method1524((byte) 81);
        } else if (arg0 == 6) {
            this.field2997 = arg2.method1509(true);
        } else if (arg0 == 7) {
            this.field3006 = arg2.method1524((byte) 81);
        } else if (arg0 == 8) {
            this.field3009 = arg2.method1524((byte) 42);
        }
        if (arg1 > -27) {
            this.field2996 = -48;
        }
    }
}
