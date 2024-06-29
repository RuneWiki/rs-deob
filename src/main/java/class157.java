import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class157 extends class224 {

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "I")
    private int field2488 = 0;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    private int field2482 = 1;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "I")
    private int field2486 = 0;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field2479 = 0;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Luf;")
    private static class168 field2485 = class148.method1019(-1720, "shake:");

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "Luf;")
    public static class168 field2480 = field2485;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "Luf;")
    public static class168 field2489 = field2485;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "Lnf;")
    public static class14 field2477 = new class14();

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!a", name = "lb", descriptor = "Le;")
    public static class169 field2493;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "Lcd;")
    public static class35 field2476;

    @OriginalMember(owner = "client!a", name = "kb", descriptor = "[I")
    public static int[] field2492;

    @OriginalMember(owner = "client!a", name = "mb", descriptor = "[Lgk;")
    public static class265[] field2494;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method1111(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class245.method1687(38, arg4);
        field2474++;
        int var7 = 0;
        int var8 = arg4 - arg0;
        int var9 = -arg4;
        int var10 = arg4;
        if (var8 < arg3) {
            var8 = 0;
        }
        int var11 = -1;
        int var12 = var8;
        int var13 = -var8;
        int[] var14 = class284.field4810[arg2];
        int var15 = arg1 + var8;
        int var16 = arg1 - var8;
        int var17 = -1;
        class133.method925(14678, arg1 - arg4, arg5, var16, var14);
        class133.method925(14678, var16, arg6, var15, var14);
        class133.method925(arg3 ^ 0x3956, var15, arg5, arg1 + arg4, var14);
        while (var7 < var10) {
            var11 += 2;
            var17 += 2;
            var13 += var17;
            if (var13 >= 0 && var12 >= 1) {
                class271.field4562[var12] = var7;
                var12--;
                var13 -= var12 << 1;
            }
            var7++;
            var9 += var11;
            if (var9 >= 0) {
                var10--;
                if (var8 > var10) {
                    int[] var18 = class284.field4810[arg2 + var10];
                    int[] var19 = class284.field4810[arg2 - var10];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    int var22 = class271.field4562[var10];
                    int var23 = arg1 - var22;
                    class133.method925(14678, var21, arg5, var23, var18);
                    int var24 = arg1 + var22;
                    class133.method925(arg3 + 14678, var23, arg6, var24, var18);
                    class133.method925(14678, var24, arg5, var20, var18);
                    class133.method925(arg3 ^ 0x3956, var21, arg5, var23, var19);
                    class133.method925(14678, var23, arg6, var24, var19);
                    class133.method925(14678, var24, arg5, var20, var19);
                } else {
                    int[] var25 = class284.field4810[arg2 + var10];
                    int[] var26 = class284.field4810[arg2 - var10];
                    int var27 = arg1 + var7;
                    int var28 = arg1 - var7;
                    class133.method925(14678, var28, arg5, var27, var25);
                    class133.method925(14678, var28, arg5, var27, var26);
                }
                var9 -= var10 << 1;
            }
            int[] var29 = class284.field4810[arg2 + var7];
            int var30 = arg1 + var10;
            int var31 = arg1 - var10;
            int[] var32 = class284.field4810[arg2 - var7];
            if (var8 <= var7) {
                class133.method925(14678, var31, arg5, var30, var29);
                class133.method925(arg3 ^ 0x3956, var31, arg5, var30, var32);
            } else {
                int var33 = var12 >= var7 ? var12 : class271.field4562[var7];
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class133.method925(14678, var31, arg5, var35, var29);
                class133.method925(14678, var35, arg6, var34, var29);
                class133.method925(14678, var34, arg5, var30, var29);
                class133.method925(arg3 ^ 0x3956, var31, arg5, var35, var32);
                class133.method925(14678, var35, arg6, var34, var32);
                class133.method925(14678, var34, arg5, var30, var32);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(Z)V", line = 134)
    public static final void method1112(boolean arg0) {
        if (!arg0) {
            field2485 = (class168) null;
        }
        field2473++;
        class256.field4359.method1429((byte) 120);
        class291.field4883.method1429((byte) 120);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B[Luf;)[Luf;", line = 146)
    public static final class168[] method1113(byte arg0, class168[] arg1) {
        field2491++;
        if (arg0 != 80) {
            field2478 = 34;
        }
        class168[] var2 = new class168[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class134.method938((byte) -124, new class168[] { class169.method1228(var3, 0), class297.field5021 });
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class134.method938((byte) -124, new class168[] { var2[var3], arg1[var3] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(IB)I", line = 181)
    public static final int method1114(int arg0, byte arg1) {
        field2475++;
        if (arg1 >= -86) {
            method1113((byte) 36, (class168[]) null);
        }
        int var2 = ((arg0 & 0xAAAAAAAA) >>> 1) + (arg0 & 0x55555555);
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IB)V", line = 197)
    public static final void method1115(int arg0, byte arg1) {
        if (arg1 != -59) {
            method1115(-90, (byte) 83);
        }
        if (class238.field3865 == arg0 && arg0 != 0) {
            class13 var2 = class155.field2456[arg0];
            var2.method47(class138.field2133);
        }
        field2484++;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 216)
    public class157() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLj;)V", line = 221)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            this.field2482 = -20;
        }
        if (arg0 == 0) {
            this.field2488 = arg2.method1042((byte) -113);
        } else if (arg0 == 1) {
            this.field2486 = arg2.method1042((byte) 97);
        } else if (arg0 == 3) {
            this.field2482 = arg2.method1042((byte) -104);
        }
        field2481++;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIILf;Lf;IIJ)V", line = 265)
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, class231 arg4, class231 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class28 var10 = new class28();
        var10.field363 = arg8;
        var10.field354 = arg1 * 128 + 64;
        var10.field362 = arg2 * 128 + 64;
        var10.field350 = arg3;
        var10.field358 = arg4;
        var10.field361 = arg5;
        var10.field364 = arg6;
        var10.field349 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class92.field1424[var11][arg1][arg2] == null) {
                class92.field1424[var11][arg1][arg2] = new class127(var11, arg1, arg2);
            }
        }
        class92.field1424[arg0][arg1][arg2].field1981 = var10;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)[I", line = 308)
    public final int[] method18(byte arg0, int arg1) {
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 45 / ((arg0 - 20) / 51);
        field2490++;
        if (this.field3613.field4531) {
            int var5 = class303.field5103[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class187.field2961; var7++) {
                int var8 = class73.field979[var7];
                int var9 = var8 - 2048 >> 1;
                int var12;
                if (this.field2488 == 0) {
                    var12 = (var8 - var5) * this.field2482;
                } else {
                    int var10 = var9 * var9 + (var6 * var6) >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field2482 * var11) * 3.141592653589793D);
                }
                int var13 = var12 - (var12 & 0xFFFFF000);
                if (this.field2486 == 0) {
                    var13 = class203.field3339[var13 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field2486 == 2) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var3[var7] = var13;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 382)
    public static void method1117(int arg0) {
        int var1 = -40 / ((66 - arg0) / 54);
        field2494 = null;
        field2493 = null;
        field2485 = null;
        field2477 = null;
        field2476 = null;
        field2480 = null;
        field2492 = null;
        field2489 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 410)
    public final void method80(boolean arg0) {
        if (!arg0) {
            field2487++;
            class125.method889(-81);
        }
    }
}
