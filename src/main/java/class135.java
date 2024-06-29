import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class135 extends class253 {

    @OriginalMember(owner = "client!pi", name = "L", descriptor = "Lwc;")
    public static class220 field2362 = new class220(0, 0);

    @OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!pi", name = "u", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!pi", name = "v", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!pi", name = "H", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!pi", name = "I", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!pi", name = "J", descriptor = "I")
    public int field2360;

    @OriginalMember(owner = "client!pi", name = "K", descriptor = "I")
    public int field2361;

    @OriginalMember(owner = "client!pi", name = "M", descriptor = "I")
    public int field2363;

    @OriginalMember(owner = "client!pi", name = "N", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!pi", name = "P", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public int field2367;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public int field2370;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    public int field2372;

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "I")
    public int field2373;

    @OriginalMember(owner = "client!pi", name = "t", descriptor = "Llb;")
    public class126 field2345;

    @OriginalMember(owner = "client!pi", name = "G", descriptor = "Lfj;")
    public class238 field2357;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "Lea;")
    public class36 field2369;

    @OriginalMember(owner = "client!pi", name = "O", descriptor = "Lld;")
    public class77 field2365;

    @OriginalMember(owner = "client!pi", name = "y", descriptor = "[I")
    public static int[] field2350;

    @OriginalMember(owner = "client!pi", name = "w", descriptor = "[[[I")
    public static int[][][] field2348;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLge;Lge;Lge;Lge;)V")
    public static final void method896(byte arg0, class68 arg1, class68 arg2, class68 arg3, class68 arg4) {
        class242.field4153 = arg4;
        field2371++;
        int var5 = -31 % ((55 - arg0) / 43);
        class28.field431 = arg1;
        class230.field3980 = arg2;
        class70.field1314 = arg3;
        class215.field3774 = new class255[class242.field4153.method478(true)][];
        class71.field1327 = new boolean[class242.field4153.method478(true)];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static void method897(byte arg0) {
        field2350 = null;
        field2348 = null;
        field2362 = null;
        int var1 = -98 % ((arg0 - 28) / 47);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
    public final void method898(byte arg0) {
        field2358++;
        if (arg0 == 29) {
            this.field2357 = null;
            this.field2365 = null;
            this.field2369 = null;
            this.field2345 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static int method899(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method900(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg7 >= class217.field3802 && class83.field1513 >= arg7 && arg0 >= class217.field3802 && arg0 <= class83.field1513 && arg3 >= class217.field3802 && class83.field1513 >= arg3 && arg5 >= class217.field3802 && class83.field1513 >= arg5 && arg4 >= class34.field522 && arg4 <= class1.field6 && class34.field522 <= arg2 && arg2 <= class1.field6 && arg9 >= class34.field522 && class1.field6 >= arg9 && class34.field522 <= arg6 && arg6 <= class1.field6) {
            class177.method1195(arg5, arg1, arg4, arg3, -109, arg9, arg6, arg0, arg7, arg2);
        } else {
            class203.method1389((byte) 80, arg7, arg4, arg6, arg3, arg1, arg2, arg0, arg9, arg5);
        }
        if (arg8) {
            field2368++;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method901(int arg0, int arg1, Random arg2) {
        field2364++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class78.method544(113, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = arg0 - (int) (4294967296L % (long) arg1);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class235.method1568(arg1, false, var4);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method902(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg7 != 128) {
            field2348 = null;
        }
        field2356++;
        int var11 = arg6 - arg5;
        int var12 = arg4 - arg0;
        boolean var13;
        if (class268.field4776 > 0 && class268.field4776 % 10 < 5) {
            var13 = true;
        } else {
            var13 = false;
        }
        int var14 = 983040 / arg8;
        int var15 = 983040 / arg1;
        for (int var16 = -var14; var16 < (var12 + var14); var16++) {
            int var18 = arg10 + ((var16 + 1) * arg8) >> 16;
            int var19 = arg8 * var16 + arg10 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var10000 = arg9 + var18;
                int var22 = arg9 + var19;
                int var23 = arg0 + var16 >> 6;
                if (var23 >= 0 && class193.field3299.length - 1 >= var23) {
                    int[][] var24 = class193.field3299[var23];
                    for (int var25 = -var15; var25 < (var11 + var15); var25++) {
                        int var26 = arg1 * var25 + arg3 >> 16;
                        int var27 = (var25 + 1) * arg1 + arg3 >> 16;
                        int var28 = var27 - var26;
                        if (var28 > 0) {
                            int var29 = arg2 + var26;
                            var10000 = arg2 + var27;
                            int var31 = arg5 + var25 >> 6;
                            if (var31 >= 0 && var31 <= var24.length - 1 && var24[var31] != null) {
                                int var32 = (var25 + arg5 & 0x3F << 6) + (arg0 + var16 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class199 var34 = class110.method753(var33 - 1, (byte) -24);
                                    if (var13 && class61.field1115 == var34.field3470) {
                                        class125 var35 = new class125();
                                        var35.field2202 = var29;
                                        var35.field2206 = var22;
                                        var35.field2203 = var34.field3470;
                                        class203.field3537.method116((byte) -121, var35);
                                    }
                                    class94.field1727[var34.field3470].method56(var22 - 7, var29 - 7);
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class125 var17 = (class125) class203.field3537.method110(64); var17 != null; var17 = (class125) class203.field3537.method117((byte) 64)) {
            class94.field1727[var17.field2203].method56(var17.field2206 - 7, var17.field2202 + -7);
            class179.method1218(var17.field2206, var17.field2202, 15, 16776960, 128);
            class179.method1218(var17.field2206, var17.field2202, 7, 16777215, 256);
        }
        class203.field3537.method112(113);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lge;II)[Lc;")
    public static final class103[] method903(class68 arg0, int arg1, int arg2) {
        field2351++;
        if (class218.method1487(arg0, arg2, 508630)) {
            return arg1 >= -28 ? null : class28.method196(3);
        } else {
            return null;
        }
    }
}
