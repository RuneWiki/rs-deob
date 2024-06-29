import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class79 {

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1304 = 0;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lp;")
    public static class280 field1305 = class18.method140((byte) -128, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lp;")
    public static class280 field1303 = class18.method140((byte) -119, "Examiner");

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "Lak;")
    public static class137 field1301;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lma;")
    public static class187 field1297;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILgi;)V")
    public static final void method583(int arg0, class155 arg1) {
        long var2 = 0L;
        if (arg0 >= -126) {
            field1305 = null;
        }
        if (arg1.field2712 == 0) {
            var2 = class113.method798(arg1.field2716, arg1.field2702, arg1.field2706);
        }
        field1298++;
        if (arg1.field2712 == 1) {
            var2 = class17.method133(arg1.field2716, arg1.field2702, arg1.field2706);
        }
        if (arg1.field2712 == 2) {
            var2 = class155.method1108(arg1.field2716, arg1.field2702, arg1.field2706);
        }
        int var4 = 0;
        int var5 = -1;
        if (arg1.field2712 == 3) {
            var2 = class27.method242(arg1.field2716, arg1.field2702, arg1.field2706);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var4 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x359AC6) >> 20;
            var5 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field2705 = var5;
        arg1.field2703 = var4;
        arg1.field2708 = var6;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method584(byte[] arg0, boolean arg1, int arg2) {
        field1299++;
        if (arg0 == null) {
            return null;
        }
        if (arg2 < 84) {
            field1304 = -86;
        }
        if (arg0.length > 136 && !class16.field310) {
            try {
                class76 var3 = (class76) Class.forName("kf").getDeclaredConstructor().newInstance();
                var3.method567(arg0, (byte) -112);
                return var3;
            } catch (Throwable var4) {
                class16.field310 = true;
            }
        }
        return arg1 ? class131.method913(true, arg0) : arg0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    public static final int method585(int arg0, int arg1) {
        field1300++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        if (arg1 != -805756542) {
            field1305 = null;
        }
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        field1301 = null;
        field1297 = null;
        field1303 = null;
        if (arg0 != -2087691388) {
            method586(-16);
        }
        field1305 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static final void method587(boolean arg0) {
        field1302++;
        boolean var1 = true;
        class242.method1649(false, (byte) 104);
        class157.field2739 = 0;
        for (int var2 = 0; var2 < class90.field1472.length; var2++) {
            if (class265.field4666[var2] != -1 && class90.field1472[var2] == null) {
                class90.field1472[var2] = class148.field2569.method1258(class265.field4666[var2], 0, (byte) 115);
                if (class90.field1472[var2] == null) {
                    var1 = false;
                    class157.field2739++;
                }
            }
            if (class29.field554[var2] != -1 && class89.field1438[var2] == null) {
                class89.field1438[var2] = class148.field2569.method1246(class196.field3426[var2], -2, 0, class29.field554[var2]);
                if (class89.field1438[var2] == null) {
                    var1 = false;
                    class157.field2739++;
                }
            }
            if (class267.field4697 != null && class161.field2821[var2] == null && class267.field4697[var2] != -1) {
                class161.field2821[var2] = class148.field2569.method1246(class196.field3426[var2], -2, 0, class267.field4697[var2]);
                if (class161.field2821[var2] == null) {
                    class157.field2739++;
                    var1 = false;
                }
            }
        }
        if (class176.field3070 == null) {
            if (class6.field126 == null || !class267.field4691.method1236(0, class30.method266(new class280[] { class6.field126.field1716, class159.field2769 }, (byte) -87))) {
                class176.field3070 = new class184(0);
            } else if (class267.field4691.method1257((byte) -90, class30.method266(new class280[] { class6.field126.field1716, class159.field2769 }, (byte) -87))) {
                class176.field3070 = class276.method1833(class267.field4691, 120, class30.method266(new class280[] { class6.field126.field1716, class159.field2769 }, (byte) -87));
            } else {
                class157.field2739++;
                var1 = false;
            }
        }
        if (!var1) {
            class88.field1432 = 1;
            return;
        }
        class123.field2160 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class90.field1472.length; var4++) {
            byte[] var20 = class89.field1438[var4];
            if (var20 != null) {
                int var21 = (class3.field93[var4] >> 8) * 64 - class49.field806;
                int var22 = (class3.field93[var4] & 0xFF) * 64 - class91.field1480;
                if (class115.field2088) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class212.method1423(var22, var21, (byte) -122, var20);
            }
        }
        if (!var3) {
            class88.field1432 = 2;
            return;
        }
        if (class88.field1432 != 0) {
            class200.method1373(true, 6, class30.method266(new class280[] { class196.field3435, class145.field2526 }, (byte) -87));
        }
        class128.method884(-19552);
        class68.method462(121);
        boolean var5 = false;
        class59.method421(4, 104, 104, 25, var5);
        for (int var6 = 0; var6 < 4; var6++) {
            class183.field3211[var6].method706(88);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var18 = 0; var18 < 104; var18++) {
                for (int var19 = 0; var19 < 104; var19++) {
                    class259.field4598[var7][var18][var19] = 0;
                }
            }
        }
        class168.method1170(arg0, (byte) -102);
        class128.method884(-19552);
        System.gc();
        class242.method1649(true, (byte) 81);
        class165.method1160(false, true);
        if (!class115.field2088) {
            class255.method1726(false, -187351672);
            class242.method1649(true, (byte) 90);
            class162.method1150(false, false);
            if (class161.field2821 != null) {
                class29.method254((byte) 59);
            }
        }
        if (class115.field2088) {
            class24.method181(false, 80);
            class242.method1649(true, (byte) 111);
            class283.method1912(false, -123);
        }
        class68.method462(127);
        class242.method1649(true, (byte) 116);
        class18.method137((byte) -19, false, class183.field3211);
        class242.method1649(true, (byte) 113);
        int var8 = class153.field2653;
        if (var8 > class231.field4013) {
            var8 = class231.field4013;
        }
        if (var8 < class231.field4013 - 1) {
            int var9 = class231.field4013 - 1;
        }
        if (class215.method1436(104)) {
            class160.method1137(0);
        } else {
            class160.method1137(class153.field2653);
        }
        class209.method1408((byte) 114);
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var17 = 0; var17 < 104; var17++) {
                class147.method1025(var10, var17, !arg0);
            }
        }
        class136.method939((byte) 6);
        class128.method884(-19552);
        class89.method633(128);
        class68.method462(120);
        if (class153.field2656 != null && class44.field727 != null && class162.field2858 == 25) {
            class271.field4732++;
            class34.field627.method551(178, !arg0);
            class34.field627.method231(11510, 1057001181);
        }
        if (!class115.field2088) {
            int var11 = (class264.field4655 - 6) / 8;
            int var12 = (class264.field4655 + 6) / 8;
            int var13 = (class126.field2215 - 6) / 8;
            int var14 = (class126.field2215 + 6) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= var14 + 1; var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var16 > var14) {
                        class148.field2569.method1241(0, class30.method266(new class280[] { class228.field3948, class249.method1685((byte) 89, var15), class100.field1629, class249.method1685((byte) 114, var16) }, (byte) -87));
                        class148.field2569.method1241(0, class30.method266(new class280[] { class103.field1717, class249.method1685((byte) -99, var15), class100.field1629, class249.method1685((byte) -86, var16) }, (byte) -87));
                    }
                }
            }
        }
        if (class162.field2858 == 28) {
            class90.method641((byte) 66, 10);
        } else {
            class90.method641((byte) 66, 30);
            if (class44.field727 != null) {
                class34.field627.method551(231, true);
            }
        }
        class215.method1441((byte) -74);
        class128.method884(-19552);
        class224.method1514(false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BIILtg;)[Lti;")
    public static final class5[] method588(byte arg0, int arg1, int arg2, class180 arg3) {
        field1296++;
        int var4 = 88 % ((-arg0 - 31) / 46);
        return class90.method648(arg1, arg2, arg3, -41) ? class93.method660(-127) : null;
    }
}
