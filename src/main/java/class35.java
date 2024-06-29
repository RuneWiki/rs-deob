import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class35 {

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Lai;")
    public static class10 field551 = class44.method278(" Sekunde(Xn(Y -Ubertragen)3", 124);

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field552 = 20;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Ldd;")
    public static class34 field546 = new class34(50);

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Z")
    public static boolean field554 = false;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Lai;")
    public class10 field542;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "Lc;")
    public static class21 field553;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "Z")
    public boolean field547;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)Lai;")
    public static final class10 method234(int arg0, int arg1) {
        field549++;
        if (arg1 == 9891) {
            return class148.field2845[arg0].method40((byte) -77) <= 0 ? class116.field2235[arg0] : class67.method440(0, new class10[] { class116.field2235[arg0], class61.field1041, class148.field2845[arg0] });
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILic;IZZI)V")
    public static final void method235(int arg0, class77 arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field548++;
        if (class135.field2540 >= 50 || (arg1.field1351 == null || arg1.field1351.length <= arg0)) {
            return;
        }
        int var6 = arg1.field1351[arg0];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        int var9 = var6 & 0xF;
        if (var9 == 0) {
            if (arg3) {
                class130.method907(-82, 0, var8, var7);
            }
        } else if (class120.field2317 != 0) {
            int var10 = (arg2 - 64) / 128;
            int var11 = (arg5 - 64) / 128;
            class183.field3480[class135.field2540] = var7;
            class176.field3373[class135.field2540] = var8;
            class159.field3062[class135.field2540] = 0;
            class139.field2625[class135.field2540] = null;
            class169.field3267[class135.field2540] = (var11 << 16) + (var10 << 8) + var9;
            class135.field2540++;
            if (!arg4) {
                field554 = true;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        int var1 = -105 % ((22 - arg0) / 53);
        field546 = null;
        field553 = null;
        field551 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III)I")
    public static final int method237(int arg0, int arg1, int arg2) {
        class131 var3 = (class131) class101.field1882.method213(125, (long) arg0);
        if (arg2 > -121) {
            method234(67, -104);
        }
        field539++;
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2479.length; var5++) {
                if (var3.field2482[var5] == arg1) {
                    var4 += var3.field2479[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field545++;
        int var8 = 87 % ((arg4 - 70) / 41);
        if (arg2 < 1 || arg7 < 1 || arg2 > 102 || arg7 > 102) {
            return;
        }
        if (class126.field2406 && class42.field687 != arg3) {
            return;
        }
        boolean var9 = true;
        int var10 = 0;
        boolean var11 = false;
        boolean var12 = false;
        if (arg6 == 0) {
            var10 = class36.field560.method563(arg3, arg2, arg7);
        }
        if (arg6 == 1) {
            var10 = class36.field560.method598(arg3, arg2, arg7);
        }
        if (arg6 == 2) {
            var10 = class36.field560.method571(arg3, arg2, arg7);
        }
        if (arg6 == 3) {
            var10 = class36.field560.method580(arg3, arg2, arg7);
        }
        if (var10 != 0) {
            int var13 = var10 >> 14 & 0x7FFF;
            int var14 = class36.field560.method588(arg3, arg2, arg7, var10);
            int var15 = var14 & 0x1F;
            int var16 = var14 >> 6 & 0x3;
            if (arg6 == 0) {
                class36.field560.method581(arg3, arg2, arg7);
                class47 var17 = class184.method1189(var13, 6);
                if (var17.field789 != 0) {
                    class58.field1022[arg3].method651(76, var16, var17.field825, arg7, var15, arg2);
                }
            }
            if (arg6 == 1) {
                class36.field560.method601(arg3, arg2, arg7);
            }
            if (arg6 == 2) {
                class36.field560.method596(arg3, arg2, arg7);
                class47 var18 = class184.method1189(var13, 6);
                if (var18.field804 + arg2 > 103 || var18.field804 + arg7 > 103 || var18.field792 + arg2 > 103 || var18.field792 + arg7 > 103) {
                    return;
                }
                if (var18.field789 != 0) {
                    class58.field1022[arg3].method653(var18.field792, arg2, var18.field804, var16, arg7, var18.field825, (byte) -105);
                }
            }
            if (arg6 == 3) {
                class36.field560.method559(arg3, arg2, arg7);
                class47 var19 = class184.method1189(var13, 6);
                if (var19.field789 == 1) {
                    class58.field1022[arg3].method655(arg2, -1, arg7);
                }
            }
        }
        if (arg0 < 0) {
            return;
        }
        int var20 = arg3;
        if (arg3 < 3 && (class185.field3527[1][arg2][arg7] & 0x2) == 2) {
            var20 = arg3 + 1;
        }
        class160.method1063(arg1, var20, arg7, (byte) 50, arg5, arg2, class36.field560, arg3, arg0, class58.field1022[arg3]);
        return;
    }
}
