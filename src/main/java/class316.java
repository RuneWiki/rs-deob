import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class316 {

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[Lch;")
    private class196[] field4768;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lhb;")
    public static class318 field4772 = new class318(64);

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4777 = "wave2:";

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field4776 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "Lom;")
    public static class156 field4775 = new class156();

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lgl;I)V", line = 17)
    public static final void method2163(class262 arg0, int arg1) {
        field4769++;
        class272.field4167 = 3;
        class257.method1743(arg1 - 2954, true);
        if (arg1 != 2954) {
            return;
        }
        class210.field3171 = true;
        class91.field1360 = 0;
        class178.field2630 = true;
        client.field1945 = true;
        class287.field4341 = 127;
        class97.field1467 = true;
        class194.field2902 = 0;
        class45.field569 = true;
        class170.field2549 = true;
        class115.field1760 = 255;
        class204.field3064 = 0;
        class292.field4447 = true;
        class197.field2968 = true;
        class233.field3506 = true;
        class264 var2 = null;
        class284.field4298 = 2;
        class157.field2348 = 0;
        class272.field4183 = 127;
        class151.field2274 = true;
        class130.field2019 = true;
        if (class84.field1251 < 96) {
            class18.method118(0);
        } else {
            class18.method118(2);
        }
        class131.field2025 = false;
        class144.field2175 = 0;
        class19.field231 = 0;
        class294.field4499 = 0;
        class179.field2656 = false;
        class36.field442 = true;
        class309.field4704 = false;
        try {
            class227 var3 = arg0.method1775("runescape", (byte) -21);
            while (var3.field3456 == 0) {
                class93.method662(-553, 1L);
            }
            if (var3.field3456 == 1) {
                var2 = (class264) var3.field3452;
                byte[] var4 = new byte[(int) var2.method1851(119)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1854(-1, var4, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class206.method1418(false, new class263(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1855(0);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 100)
    public static final void method2164(int arg0, int arg1) {
        field4767++;
        class169 var2 = class101.method712(arg0, arg1, 2089666400);
        var2.method1178((byte) 100);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)J", line = 109)
    public static final long method2165(int arg0, int arg1, int arg2) {
        class221 var3 = class158.field2367[arg0][arg1][arg2];
        return var3 == null || var3.field3364 == null ? 0L : var3.field3364.field2787;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 118)
    public static final String method2166(int arg0, byte arg1) {
        field4771++;
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class299.field4562 + "</col>";
        } else {
            if (arg1 >= -35) {
                method2165(41, -49, -95);
            }
            return "<col=00ff80>" + arg0 / 1000000 + class124.field1941 + "</col>";
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lrc;IIIIIIIZ)V", line = 152)
    public static final void method2167(class228 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class44.field556;
        int var11;
        int var12 = var11 = (arg7 << 7) - field4773;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class294.field4502[arg1][arg6][arg7] - class257.field3885;
        int var18 = class294.field4502[arg1][arg6 + 1][arg7] - class257.field3885;
        int var19 = class294.field4502[arg1][arg6 + 1][arg7 + 1] - class257.field3885;
        int var20 = class294.field4502[arg1][arg6][arg7 + 1] - class257.field3885;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class148.field2236;
        int var46 = (var24 << 9) / var25 + class148.field2231;
        int var47 = (var27 << 9) / var31 + class148.field2236;
        int var48 = (var30 << 9) / var31 + class148.field2231;
        int var49 = (var33 << 9) / var37 + class148.field2236;
        int var50 = (var36 << 9) / var37 + class148.field2231;
        int var51 = (var39 << 9) / var43 + class148.field2236;
        int var52 = (var42 << 9) / var43 + class148.field2231;
        class148.field2237 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class126.field1976 && class3.method8(class42.field506 + class148.field2236, class76.field996 + class148.field2231, var50, var52, var48, var49, var51, var47)) {
                class41.field495 = arg6;
                class190.field2826 = arg7;
            }
            if (!class117.field1817 && !arg8) {
                class148.field2227 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class148.field2223 || var51 > class148.field2223 || var47 > class148.field2223) {
                    class148.field2227 = true;
                }
                if (arg0.field3459 == -1) {
                    if (arg0.field3467 != 12345678) {
                        class148.method1061(var50, var52, var48, var49, var51, var47, arg0.field3467, arg0.field3462, arg0.field3469);
                    }
                } else if (!class233.field3506) {
                    int var53 = class148.field2233.method739(arg0.field3459, -26067);
                    class148.method1061(var50, var52, var48, var49, var51, var47, class23.method160(var53, arg0.field3467), class23.method160(var53, arg0.field3462), class23.method160(var53, arg0.field3469));
                } else if (arg0.field3466) {
                    class148.method1074(var50, var52, var48, var49, var51, var47, arg0.field3467, arg0.field3462, arg0.field3469, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3459);
                } else {
                    class148.method1074(var50, var52, var48, var49, var51, var47, arg0.field3467, arg0.field3462, arg0.field3469, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3459);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class126.field1976 && class3.method8(class42.field506 + class148.field2236, class76.field996 + class148.field2231, var46, var48, var52, var45, var47, var51)) {
            class41.field495 = arg6;
            class190.field2826 = arg7;
        }
        if (class117.field1817 || arg8) {
            return;
        }
        class148.field2227 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class148.field2223 || var47 > class148.field2223 || var51 > class148.field2223) {
            class148.field2227 = true;
        }
        if (arg0.field3459 == -1) {
            if (arg0.field3470 != 12345678) {
                class148.method1061(var46, var48, var52, var45, var47, var51, arg0.field3470, arg0.field3469, arg0.field3462);
            }
        } else if (class233.field3506) {
            class148.method1074(var46, var48, var52, var45, var47, var51, arg0.field3470, arg0.field3469, arg0.field3462, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3459);
        } else {
            int var54 = class148.field2233.method739(arg0.field3459, -26067);
            class148.method1061(var46, var48, var52, var45, var47, var51, class23.method160(var54, arg0.field3470), class23.method160(var54, arg0.field3469), class23.method160(var54, arg0.field3462));
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)Lje;", line = 309)
    public static final class169 method2168(int arg0) {
        if (arg0 != -18365) {
            return (class169) null;
        }
        field4770++;
        class169 var1 = (class169) class44.field534.method1696(-97);
        if (var1 != null) {
            var1.method714(109);
            var1.method1353(29792);
            return var1;
        }
        class169 var2;
        do {
            var2 = (class169) class23.field349.method1696(75);
            if (var2 == null) {
                return null;
            }
            if (var2.method1187((byte) -112) > class231.method1594(-20375)) {
                return null;
            }
            var2.method714(112);
            var2.method1353(arg0 ^ 0xFFFFCC23);
        } while ((Long.MIN_VALUE & var2.field2955) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 352)
    public static void method2169(byte arg0) {
        if (arg0 == -53) {
            field4772 = null;
            field4776 = null;
            field4777 = null;
            field4775 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(I)V", line = 364)
    public class316(int arg0) {
        this.field4768 = new class196[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class196 var3 = this.field4768[var2] = new class196();
            var3.field2956 = var3;
            var3.field2948 = var3;
        }
    }
}
