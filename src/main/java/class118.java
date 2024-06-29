import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class118 {

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public static int field1834 = 100;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "Leg;")
    public static class188 field1833 = new class188(64);

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lbd;")
    public class20 field1831;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lfe;")
    public class94 field1830;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[Lkd;")
    public static class272[] field1828;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfh;IIIIIIZ)V", line = 5)
    public static final void method808(class62 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field859.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field859[var9] - class343.field5342;
            int var11 = arg0.field870[var9] - class99.field1542;
            int var12 = arg0.field873[var9] - class246.field3859;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field872 != null) {
                class62.field856[var9] = var13;
                class62.field863[var9] = var16;
                class62.field858[var9] = var17;
            }
            class62.field869[var9] = (var13 << 9) / var17 + class12.field119;
            class62.field861[var9] = (var16 << 9) / var17 + class12.field128;
        }
        class12.field115 = 0;
        int var19 = arg0.field875.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field875[var20];
            int var22 = arg0.field865[var20];
            int var23 = arg0.field862[var20];
            int var24 = class62.field869[var21];
            int var25 = class62.field869[var22];
            int var26 = class62.field869[var23];
            int var27 = class62.field861[var21];
            int var28 = class62.field861[var22];
            int var29 = class62.field861[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class230.field3717 && class210.method1407(class12.field119 + class101.field1573, class45.field637 + class12.field128, var27, var28, var29, var24, var25, var26)) {
                    class13.field140 = arg5;
                    class220.field3496 = arg6;
                }
                if (!class333.field5166 && !arg7) {
                    class12.field118 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class12.field117 || var25 > class12.field117 || var26 > class12.field117) {
                        class12.field118 = true;
                    }
                    if (arg0.field872 == null || arg0.field872[var20] == -1) {
                        if (arg0.field860[var20] != 12345678) {
                            class12.method86(var27, var28, var29, var24, var25, var26, arg0.field860[var20], arg0.field876[var20], arg0.field857[var20]);
                        }
                    } else if (!class124.field1935) {
                        int var30 = class12.field126.method477(7053, arg0.field872[var20]);
                        class12.method86(var27, var28, var29, var24, var25, var26, class77.method541(var30, arg0.field860[var20]), class77.method541(var30, arg0.field876[var20]), class77.method541(var30, arg0.field857[var20]));
                    } else if (arg0.field874) {
                        class12.method90(var27, var28, var29, var24, var25, var26, arg0.field860[var20], arg0.field876[var20], arg0.field857[var20], class62.field856[0], class62.field856[1], class62.field856[3], class62.field863[0], class62.field863[1], class62.field863[3], class62.field858[0], class62.field858[1], class62.field858[3], arg0.field872[var20]);
                    } else {
                        class12.method90(var27, var28, var29, var24, var25, var26, arg0.field860[var20], arg0.field876[var20], arg0.field857[var20], class62.field856[var21], class62.field856[var22], class62.field856[var23], class62.field863[var21], class62.field863[var22], class62.field863[var23], class62.field858[var21], class62.field858[var22], class62.field858[var23], arg0.field872[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BI)Lgh;", line = 121)
    public static final class222 method809(byte arg0, int arg1) {
        field1827++;
        if (arg0 < 37) {
            field1833 = (class188) null;
        }
        class222 var2 = (class222) class345.field5347.method1294((long) arg1, 125);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class133.field2096.method2103(0, class283.method1857(arg1, false), class329.method2224(96, arg1));
        class222 var4 = new class222();
        var4.field3549 = arg1;
        if (var3 != null) {
            var4.method1482(new class303(var3), (byte) 123);
        }
        var4.method1493((byte) -63);
        class345.field5347.method1292((long) arg1, -77, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZIII)V", line = 147)
    public static final void method810(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class34.field441 != 0 && arg2 != 0 && class271.field4162 < 50 && arg0 != -1) {
            class207.field3223[class271.field4162] = arg0;
            class228.field3652[class271.field4162] = arg2;
            class44.field631[class271.field4162] = arg4;
            class222.field3536[class271.field4162] = null;
            class29.field359[class271.field4162] = 0;
            class315.field4966[class271.field4162] = arg3;
            class271.field4162++;
        }
        if (arg1) {
            field1829++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V", line = 174)
    public static void method811(int arg0) {
        field1833 = null;
        field1828 = null;
        if (arg0 != 12345678) {
            field1834 = -93;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)I", line = 189)
    public static final int method812(int arg0, int arg1) {
        field1832++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 > -91) {
            return -121;
        } else {
            int var3 = arg0 * 6 - 61440;
            int var4 = (arg0 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        }
    }
}
