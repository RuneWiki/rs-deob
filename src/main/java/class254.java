import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class254 extends class152 {

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "I")
    private int field4263 = 2048;

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    private int field4260 = 409;

    @OriginalMember(owner = "client!rj", name = "jb", descriptor = "I")
    private int field4276 = 0;

    @OriginalMember(owner = "client!rj", name = "hb", descriptor = "I")
    private int field4274 = 0;

    @OriginalMember(owner = "client!rj", name = "lb", descriptor = "I")
    private int field4278 = 1024;

    @OriginalMember(owner = "client!rj", name = "kb", descriptor = "I")
    private int field4277 = 1024;

    @OriginalMember(owner = "client!rj", name = "ob", descriptor = "I")
    private int field4281 = 1024;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    private int field4266 = 819;

    @OriginalMember(owner = "client!rj", name = "qb", descriptor = "I")
    private int field4283 = 1024;

    @OriginalMember(owner = "client!rj", name = "gb", descriptor = "Lce;")
    public static class126 field4273 = class206.method1445(-7923, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!rj", name = "cb", descriptor = "I")
    public static int field4269 = 0;

    @OriginalMember(owner = "client!rj", name = "bb", descriptor = "[I")
    public static int[] field4268 = new int[32];

    @OriginalMember(owner = "client!rj", name = "ib", descriptor = "[I")
    public static int[] field4275 = new int[2500];

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static volatile int field4265 = -1;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "Lml;")
    public static class160 field4264 = new class160(64);

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    private int field4267;

    @OriginalMember(owner = "client!rj", name = "db", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!rj", name = "eb", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!rj", name = "fb", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!rj", name = "mb", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!rj", name = "nb", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!rj", name = "pb", descriptor = "Lcc;")
    public static class313 field4282;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)V", line = 10)
    public final void method2(byte arg0) {
        int var2 = -89 % ((arg0 - 2) / 37);
        field4279++;
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V", line = 25)
    public static void method1719(int arg0) {
        field4264 = null;
        field4275 = null;
        field4268 = null;
        field4282 = null;
        if (arg0 != 0) {
            field4269 = -117;
        }
        field4273 = null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IILbb;)V", line = 42)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            return;
        }
        field4280++;
        if (arg1 == 0) {
            this.field4276 = arg2.method948(-125);
        } else if (arg1 == 1) {
            this.field4283 = arg2.method942(true);
        } else if (arg1 == 2) {
            this.field4263 = arg2.method942(true);
        } else if (arg1 == 3) {
            this.field4260 = arg2.method942(true);
        } else if (arg1 == 4) {
            this.field4266 = arg2.method942(true);
        } else if (arg1 == 5) {
            this.field4281 = arg2.method942(true);
        } else if (arg1 == 6) {
            this.field4274 = arg2.method948(-122);
        } else if (arg1 == 7) {
            this.field4278 = arg2.method942(true);
        } else if (arg1 == 8) {
            this.field4277 = arg2.method942(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BZ)V", line = 140)
    public static final void method1720(byte arg0, boolean arg1) {
        field4271++;
        byte[][] var2;
        byte var3;
        if (class56.field846 && arg1) {
            var2 = class314.field5388;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class128.field2200;
        }
        if (arg0 < 94) {
            field4264 = (class160) null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class181.method1294(true);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class12.field162[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x3FF8) >> 3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            int var13 = (var8 & 0x6) >> 1;
                            for (int var14 = 0; var14 < class148.field2732.length; var14++) {
                                if (class148.field2732[var14] == var12 && var2[var14] != null) {
                                    class294.method1946((var11 & 0x7) * 8, -11, var2[var14], class94.field1475, var6 * 8, var13, var9, var4, (var10 & 0x7) * 8, var5 * 8, arg1);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class213.method1481(var6 * 8, var4, false, var5 * 8, 8, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 577)
    public class254() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIBII)V", line = 256)
    public static final void method1721(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4259++;
        if (class300.field4975 < 100) {
            class159.method1171(27944);
        }
        if (class56.field846) {
            class101.method687(arg3, arg1, arg0 + arg3, arg1 + arg4);
        } else {
            class276.method1862(arg3, arg1, arg3 + arg0, arg1 - -arg4);
        }
        if (class300.field4975 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg3;
            int var7 = arg1 - (var5 + 18 - (arg4 / 2));
            if (class56.field846) {
                class101.method689(arg3, arg1, arg0, arg4, 0);
                class101.method681(var6 - 152, var7, 304, 34, 9179409);
                class101.method681(var6 - 151, var7 - -1, 302, 32, 0);
                class101.method689(var6 - 150, var7 + 2, class300.field4975 * 3, 30, 9179409);
                class101.method689(class300.field4975 * 3 + (var6 - 150), var7 - -2, 300 - (class300.field4975 * 3), 30, 0);
            } else {
                class276.method1844(arg3, arg1, arg0, arg4, 0);
                class276.method1842(var6 - 152, var7, 304, 34, 9179409);
                class276.method1842(var6 - 151, var7 + 1, 302, 32, 0);
                class276.method1844(var6 - 150, var7 + 2, class300.field4975 * 3, 30, 9179409);
                class276.method1844(class300.field4975 * 3 + var6 - 150, var7 - -2, 300 - (class300.field4975 * 3), 30, 0);
            }
            class200.field3414.method2144(class7.field85, var6, var5 + var7, 16777215, -1);
            return;
        }
        class273.field4602 = class253.field4249 - ((int) ((float) arg4 / class232.field3896));
        class286.field4738 = (int) ((float) (arg4 * 2) / class232.field3896);
        class227.field3836 = class139.field2522 - ((int) ((float) arg0 / class232.field3896));
        int var8 = class139.field2522 - (int) ((float) arg0 / class232.field3896);
        int var9 = class253.field4249 - (int) ((float) arg4 / class232.field3896);
        class226.field3805 = (int) ((float) (arg0 * 2) / class232.field3896);
        int var10 = class139.field2522 + ((int) ((float) arg0 / class232.field3896));
        int var11 = 97 / ((arg2 + 90) / 34);
        int var12 = (int) ((float) arg4 / class232.field3896) + class253.field4249;
        if (class56.field846) {
            if (client.field2076 == null || client.field2076.field4595 != arg0 || client.field2076.field4601 != arg4) {
                client.field2076 = null;
                client.field2076 = new class184(arg0, arg4);
            }
            class276.method1864(client.field2076.field3196, arg0, arg4);
            class202.method1425(0, var10, var12, arg4, -1717555696, arg0, var9, 0, var8);
            class125.method832(var8, var9, var10, 0, arg4, var12, arg0, true, 0);
            class224.method1537(0, var8, var12, 0, false, var9, arg0, arg4, var10);
            class101.method680(client.field2076.field3196, arg3, arg1, arg0, arg4);
        } else {
            class202.method1425(arg1, var10, var12, arg1 + arg4, -1717555696, arg3 + arg0, var9, arg3, var8);
            class125.method832(var8, var9, var10, arg1, arg1 + arg4, var12, arg0 + arg3, true, arg3);
            class224.method1537(arg1, var8, var12, arg3, false, var9, arg3 + arg0, arg1 + arg4, var10);
        }
        if (class98.field1574 > 0) {
            class98.field1574--;
        }
        if (!class37.field550) {
            return;
        }
        int var13 = arg3 + arg0 - 5;
        int var14 = arg1 + arg4 - 8;
        class174.field3077.method2146(class12.method69(new class126[] { class88.field1385, class195.method1386((byte) 20, class262.field4383) }, (byte) 125), var13, var14, 16776960, -1);
        int var18 = var14 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = 16776960;
        int var17 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var17 > 65536) {
            var16 = 16711680;
        }
        class174.field3077.method2146(class12.method69(new class126[] { class69.field1138, class195.method1386((byte) 20, var17), class304.field5105 }, (byte) 115), var13, var18, var16, -1);
        var14 = var18 - 15;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B[[IILjava/util/Random;III)V", line = 381)
    private final void method1722(byte arg0, int[][] arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        int var8 = this.field4277 <= 0 ? 4096 : 4096 - class244.method1675(arg3, (byte) 110, this.field4277);
        field4270++;
        int var9 = this.field4278 * this.field4267 >> 12;
        int var10 = this.field4267 - (var9 > 0 ? class244.method1675(arg3, (byte) 110, var9) : 0);
        if (arg0 != -5) {
            this.field4260 = 12;
        }
        if (arg5 >= class244.field4133) {
            arg5 -= class244.field4133;
        }
        if (var10 > 0) {
            if (arg2 <= 0 || arg4 <= 0) {
                return;
            }
            int var11 = arg2 / 2;
            int var12 = arg4 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = var10 <= var11 ? var10 : var11;
            int var15 = arg5 + var13;
            int var16 = arg4 - (var13 * 2);
            for (int var17 = 0; var17 < arg2; var17++) {
                int[] var18 = arg1[arg6 + var17];
                if (var17 >= var14) {
                    int var19 = arg2 - var17 - 1;
                    if (var14 <= var19) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class47.method289(arg5 + var20, class321.field5490)] = var18[class47.method289(class321.field5490, arg5 + arg4 - var20 - 1)] = var8 * var20 / var13;
                        }
                        if (class244.field4133 >= var15 + var16) {
                            class230.method1565(var18, var15, var16, var8);
                        } else {
                            int var21 = class244.field4133 - var15;
                            class230.method1565(var18, var15, var21, var8);
                            class230.method1565(var18, 0, var16 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field4274 == 0) {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class47.method289(class321.field5490, arg5 + var25)] = var18[class47.method289(arg5 + arg4 - var25 - 1, class321.field5490)] = var22 * var26 >> 12;
                            }
                        } else {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class47.method289(class321.field5490, arg5 + var23)] = var18[class47.method289(class321.field5490, arg4 + arg5 - var23 - 1)] = var22 > var24 ? var24 : var22;
                            }
                        }
                        if (var15 + var16 > class244.field4133) {
                            int var27 = class244.field4133 - var15;
                            class230.method1565(var18, var15, var27, var22);
                            class230.method1565(var18, 0, var16 - var27, var22);
                        } else {
                            class230.method1565(var18, var15, var16, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field4274 == 0) {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class47.method289(arg5 + var29, class321.field5490)] = var18[class47.method289(arg4 + arg5 - var29 - 1, class321.field5490)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class47.method289(class321.field5490, arg5 + var31)] = var18[class47.method289(class321.field5490, arg5 + arg4 - var31 - 1)] = var28 > var32 ? var32 : var28;
                        }
                    }
                    if ((var15 + var16) <= class244.field4133) {
                        class230.method1565(var18, var15, var16, var28);
                    } else {
                        int var33 = class244.field4133 - var15;
                        class230.method1565(var18, var15, var33, var28);
                        class230.method1565(var18, 0, var16 - var33, var28);
                    }
                }
            }
        } else if (class244.field4133 >= (arg4 + arg5)) {
            for (int var34 = 0; var34 < arg2; var34++) {
                class230.method1565(arg1[arg6 + var34], arg5, arg4, var8);
            }
        } else {
            int var35 = class244.field4133 - arg5;
            for (int var36 = 0; var36 < arg2; var36++) {
                int[] var37 = arg1[arg6 + var36];
                class230.method1565(var37, arg5, var35, var8);
                class230.method1565(var37, 0, arg4 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)[I", line = 601)
    public final int[] method6(boolean arg0, int arg1) {
        field4262++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[][] var4 = this.field2776.method1796((byte) 98);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class244.field4133 * this.field4263 >> 12;
            int var15 = class143.field2599 * this.field4266 >> 12;
            int var16 = class244.field4133 * this.field4283 >> 12;
            int var17 = class143.field2599 * this.field4260 >> 12;
            if (var15 <= 1) {
                return var4[arg1];
            }
            this.field4267 = class244.field4133 / 8 * this.field4281 >> 12;
            int var18 = class244.field4133 / var16 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field4276);
            int[][] var21 = new int[var18][3];
            label129: while (true) {
                while (true) {
                    int var22 = class244.method1675(var20, (byte) 110, var14 - var16) + var16;
                    int var23 = class244.method1675(var20, (byte) 110, var15 - var17) + var17;
                    int var24 = var7 + var22;
                    if (var24 > class244.field4133) {
                        var22 = class244.field4133 - var7;
                        var24 = class244.field4133;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int var27 = 0;
                        int[] var28 = var19[var9];
                        int var29 = var5 + var24;
                        var25 = var28[2];
                        if (var29 < 0) {
                            var29 += class244.field4133;
                        }
                        if (class244.field4133 < var29) {
                            var29 -= class244.field4133;
                        }
                        while (true) {
                            int[] var30 = var19[var26];
                            if (var30[0] <= var29 && var30[1] >= var29) {
                                if (var9 != var26) {
                                    int var31 = var7 + var5;
                                    if (var31 < 0) {
                                        var31 += class244.field4133;
                                    }
                                    if (class244.field4133 < var31) {
                                        var31 -= class244.field4133;
                                    }
                                    for (int var32 = 1; var32 <= var27; var32++) {
                                        int[] var33 = var19[(var9 + var32) % var12];
                                        var25 = Math.max(var25, var33[2]);
                                    }
                                    for (int var34 = 0; var34 <= var27; var34++) {
                                        int[] var35 = var19[(var9 + var34) % var12];
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
                                                var39 = 0;
                                                var40 = Math.min(var29, var38);
                                            } else {
                                                var39 = Math.max(var31, var37);
                                                var40 = class244.field4133;
                                            }
                                            this.method1722((byte) -5, var4, var25 - var36, var20, var40 - var39, var8 + var39, var36);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            var27++;
                            var26++;
                            if (var12 <= var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if ((var23 + var25) <= class143.field2599) {
                        var10 = false;
                    } else {
                        var23 = class143.field2599 - var25;
                    }
                    if (class244.field4133 == var24) {
                        this.method1722((byte) -5, var4, var23, var20, var22, var7 + var6, var25);
                        if (var10) {
                            break label129;
                        }
                        var10 = true;
                        var8 = var6;
                        var11 = false;
                        var9 = 0;
                        int[] var41 = var21[var13++];
                        var41[1] = var24;
                        var41[2] = var25 + var23;
                        var12 = var13;
                        var41[0] = var7;
                        var13 = 0;
                        var6 = class244.method1675(var20, (byte) 110, class244.field4133);
                        var7 = 0;
                        int[][] var42 = var19;
                        var5 = var6 - var8;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class244.field4133 + var5;
                        }
                        var19 = var21;
                        var21 = var42;
                        if (class244.field4133 < var43) {
                            var43 -= class244.field4133;
                        }
                        while (true) {
                            int[] var44 = var19[var9];
                            if (var43 >= var44[0] && var44[1] >= var43) {
                                break;
                            }
                            var9++;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var21[var13++];
                        var45[1] = var24;
                        var45[0] = var7;
                        var45[2] = var23 + var25;
                        this.method1722((byte) -5, var4, var23, var20, var22, var6 + var7, var25);
                        var7 = var24;
                    }
                }
            }
        }
        if (!arg0) {
            this.method2((byte) 57);
        }
        return var3;
    }
}
