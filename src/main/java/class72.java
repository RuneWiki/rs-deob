import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class72 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lia;")
    public static class257 field1405 = null;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "Lia;")
    public static class257 field1407 = class28.method234(-122, ":chalreq:");

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public static boolean field1409 = true;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Lia;")
    private static class257 field1410 = class28.method234(-23, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "Lia;")
    public static class257 field1415 = field1410;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lia;")
    public static class257 field1412 = class28.method234(97, "<img=1>");

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "Lsf;")
    public static class33 field1413 = new class33();

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lmi;")
    public static class100 field1404;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "Lmb;")
    public static class178 field1406;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "[I")
    public static int[] field1411;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBIIII)V")
    public static final void method539(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        if (arg2 != 83) {
            field1415 = null;
        }
        class118.method841(arg1, 117);
        field1414++;
        int var8 = arg1 - arg4;
        int var9 = arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -arg1;
        int var11 = -var8;
        int var12 = var8;
        int var13 = -1;
        if (class40.field834 <= arg5 && class255.field4371 >= arg5) {
            int[] var14 = class185.field3220[arg5];
            int var15 = class34.method290(class145.field2540, arg6 - arg1, class123.field2211, -256);
            int var16 = class34.method290(class145.field2540, arg1 + arg6, class123.field2211, arg2 - 339);
            int var17 = class34.method290(class145.field2540, arg6 - var8, class123.field2211, -256);
            int var18 = class34.method290(class145.field2540, arg6 + var8, class123.field2211, -256);
            class94.method692(var14, (byte) 17, var15, arg0, var17);
            class94.method692(var14, (byte) 69, var17, arg3, var18);
            class94.method692(var14, (byte) -125, var18, arg0, var16);
        }
        int var19 = -1;
        while (var9 > var7) {
            var19 += 2;
            var10 += var19;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var12 >= 1) {
                var12--;
                class228.field3835[var12] = var7;
                var11 -= var12 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                int var20 = arg5 - var9;
                var10 -= var9 << 1;
                int var21 = arg5 + var9;
                if (var21 >= class40.field834 && class255.field4371 >= var20) {
                    if (var8 <= var9) {
                        int var22 = class34.method290(class145.field2540, arg6 + var7, class123.field2211, -256);
                        int var23 = class34.method290(class145.field2540, arg6 - var7, class123.field2211, arg2 - 339);
                        if (class255.field4371 >= var21) {
                            class94.method692(class185.field3220[var21], (byte) 111, var23, arg0, var22);
                        }
                        if (class40.field834 <= var20) {
                            class94.method692(class185.field3220[var20], (byte) 79, var23, arg0, var22);
                        }
                    } else {
                        int var24 = class228.field3835[var9];
                        int var25 = class34.method290(class145.field2540, arg6 + var7, class123.field2211, -256);
                        int var26 = class34.method290(class145.field2540, arg6 - var7, class123.field2211, -256);
                        int var27 = class34.method290(class145.field2540, arg6 + var24, class123.field2211, arg2 - 339);
                        int var28 = class34.method290(class145.field2540, arg6 - var24, class123.field2211, arg2 - 339);
                        if (class255.field4371 >= var21) {
                            int[] var29 = class185.field3220[var21];
                            class94.method692(var29, (byte) -126, var26, arg0, var28);
                            class94.method692(var29, (byte) -127, var28, arg3, var27);
                            class94.method692(var29, (byte) -123, var27, arg0, var25);
                        }
                        if (var20 >= class40.field834) {
                            int[] var30 = class185.field3220[var20];
                            class94.method692(var30, (byte) -125, var26, arg0, var28);
                            class94.method692(var30, (byte) -127, var28, arg3, var27);
                            class94.method692(var30, (byte) -125, var27, arg0, var25);
                        }
                    }
                }
            }
            int var31 = arg5 + var7;
            int var32 = arg5 - var7;
            if (var31 >= class40.field834 && var32 <= class255.field4371) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class123.field2211 && var34 <= class145.field2540) {
                    int var35 = class34.method290(class145.field2540, var33, class123.field2211, -256);
                    int var36 = class34.method290(class145.field2540, var34, class123.field2211, -256);
                    if (var7 >= var8) {
                        if (class255.field4371 >= var31) {
                            class94.method692(class185.field3220[var31], (byte) 100, var36, arg0, var35);
                        }
                        if (var32 >= class40.field834) {
                            class94.method692(class185.field3220[var32], (byte) 41, var36, arg0, var35);
                        }
                    } else {
                        int var37 = var7 <= var12 ? var12 : class228.field3835[var7];
                        int var38 = class34.method290(class145.field2540, arg6 + var37, class123.field2211, -256);
                        int var39 = class34.method290(class145.field2540, arg6 - var37, class123.field2211, -256);
                        if (var31 <= class255.field4371) {
                            int[] var40 = class185.field3220[var31];
                            class94.method692(var40, (byte) 17, var36, arg0, var39);
                            class94.method692(var40, (byte) -124, var39, arg3, var38);
                            class94.method692(var40, (byte) 63, var38, arg0, var35);
                        }
                        if (class40.field834 <= var32) {
                            int[] var41 = class185.field3220[var32];
                            class94.method692(var41, (byte) 57, var36, arg0, var39);
                            class94.method692(var41, (byte) -127, var39, arg3, var38);
                            class94.method692(var41, (byte) -125, var38, arg0, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method540(byte arg0) {
        field1410 = null;
        field1405 = null;
        field1412 = null;
        field1407 = null;
        field1404 = null;
        field1406 = null;
        field1411 = null;
        field1415 = null;
        field1413 = null;
        if (arg0 != -104) {
            method539(122, -59, (byte) -59, 49, 7, -42, 74);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(JB)V")
    public static final void method541(long arg0, byte arg1) {
        if (arg1 < 103) {
            return;
        }
        field1408++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class138.field2462; var3++) {
            if (class243.field4216[var3] == arg0) {
                class138.field2474++;
                class138.field2462--;
                for (int var4 = var3; var4 < class138.field2462; var4++) {
                    class185.field3218[var4] = class185.field3218[var4 + 1];
                    class80.field1568[var4] = class80.field1568[var4 + 1];
                    client.field1536[var4] = client.field1536[var4 + 1];
                    class243.field4216[var4] = class243.field4216[var4 + 1];
                    class55.field1182[var4] = class55.field1182[var4 + 1];
                    class91.field1744[var4] = class91.field1744[var4 + 1];
                }
                class188.field3252 = class111.field2038;
                class205.field3524.method908(false, 61);
                class205.field3524.method1044(false, arg0);
                return;
            }
        }
    }
}
