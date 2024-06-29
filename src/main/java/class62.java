import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class62 extends class55 implements class425 {

    @OriginalMember(owner = "client!lp", name = "S", descriptor = "Lfs;")
    public class349 field824;

    @OriginalMember(owner = "client!lp", name = "Y", descriptor = "Z")
    private boolean field830;

    @OriginalMember(owner = "client!lp", name = "L", descriptor = "Z")
    public static boolean field818 = false;

    @OriginalMember(owner = "client!lp", name = "N", descriptor = "Z")
    public static boolean field820 = false;

    @OriginalMember(owner = "client!lp", name = "K", descriptor = "[I")
    public static int[] field817 = new int[32];

    @OriginalMember(owner = "client!lp", name = "C", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!lp", name = "D", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!lp", name = "E", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!lp", name = "F", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!lp", name = "G", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!lp", name = "J", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!lp", name = "O", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!lp", name = "P", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!lp", name = "Q", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!lp", name = "T", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!lp", name = "U", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!lp", name = "V", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!lp", name = "W", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!lp", name = "X", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!lp", name = "Z", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!lp", name = "ab", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!lp", name = "bb", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!lp", name = "cb", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!lp", name = "db", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!lp", name = "eb", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!lp", name = "fb", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!lp", name = "gb", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!lp", name = "hb", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!lp", name = "ib", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!lp", name = "I", descriptor = "Lln;")
    public static class252 field815;

    @OriginalMember(owner = "client!lp", name = "H", descriptor = "Llm;")
    public static class347 field814;

    @OriginalMember(owner = "client!lp", name = "M", descriptor = "[Lcq;")
    public static class67[] field819;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field838;
        class375 var5 = this.field824.method2300(-1, false, super.field740, 65536, arg3, super.field734, arg2);
        if (var5 == null) {
            return false;
        } else {
            class177 var6 = arg3.method1735();
            var6.method985(super.field740, super.field729, super.field734);
            return var5.method1594(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
    public final boolean method114(int arg0) {
        if (arg0 != 30582) {
            field819 = null;
        }
        ++field840;
        return this.field824.method2297(-70);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLii;)V")
    public final void method102(byte arg0, class405 arg1) {
        if (arg0 != 76) {
            field818 = false;
        }
        this.field824.method2290((byte) -78, arg1);
        ++field809;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
    public static final void method428(int arg0, boolean arg1) {
        if (arg1) {
            if (~class329.field4790 != 0) {
                class373.method2413(class329.field4790, 1);
            }
            for (class169 var2 = (class169) class99.field1377.method389(0); var2 != null; var2 = (class169) class99.field1377.method388(0)) {
                if (!var2.method323((byte) 69)) {
                    var2 = (class169) class99.field1377.method389(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class271.method1864(true, false, true, var2);
            }
            class329.field4790 = -1;
            class99.field1377 = new class56(8);
            class103.method688(111);
            class329.field4790 = class180.field2379;
            class110.method720((byte) 118, false);
            class145.method927(0);
            class123.method784(class329.field4790);
        }
        ++field813;
        class4.method26((byte) 82);
        class71.field995 = -1;
        if (arg0 == -8844) {
            class78.method567(arg0 ^ 8843, class139.field1909);
            class227.field2988 = new class25();
            class227.field2988.field740 = 6656;
            class227.field2988.field4360[0] = 52;
            class227.field2988.field734 = 6656;
            class179.field2371 = 0;
            class400.field5971 = 0;
            class227.field2988.field4362[0] = 52;
            if (~class346.field4979 != -3) {
                class368.method2392((byte) 117);
            } else {
                class179.field2371 = class115.field1605 << 7;
                class400.field5971 = class411.field6071 << 7;
            }
            class245.method1484((byte) 64);
            if (class400.field5971 != 0 && class179.field2371 != 0) {
                class69.method461(true);
                class232.method1391(-26, 28);
            } else {
                class232.method1391(-26, 10);
            }
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLps;)Z")
    public static final boolean method429(byte arg0, class394 arg1) {
        ++field836;
        if (arg0 != 88) {
            return true;
        } else if (arg1.field5654 == 205) {
            class262.field3797 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIIII)V")
    public static final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field835;
        int var7 = -arg5 + arg0;
        int var8 = arg3 + arg5;
        for (int var9 = arg3; ~var8 < ~var9; ++var9) {
            class207.method1221((byte) -125, arg2, arg6, class384.field5560[var9], arg4);
        }
        int var10 = -arg5 + arg6;
        int var11 = arg2 + arg5;
        for (int var12 = arg0; var12 > var7; --var12) {
            class207.method1221((byte) -123, arg2, arg6, class384.field5560[var12], arg4);
        }
        for (int var13 = var8; var7 >= var13; ++var13) {
            int[] var15 = class384.field5560[var13];
            class207.method1221((byte) -125, arg2, var11, var15, arg4);
            class207.method1221((byte) -128, var10, arg6, var15, arg4);
        }
        int var14 = 53 % ((arg1 - 26) / 41);
    }

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V")
    public static void method431(int arg0) {
        field814 = null;
        field817 = null;
        field819 = null;
        if (arg0 != 12047) {
            field819 = null;
        }
        field815 = null;
    }

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "(I)V")
    public static final void method432(int arg0) {
        class377.field5489.method1141(256);
        int var1 = -41 % ((-52 - arg0) / 63);
        ++field834;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZI)I")
    public static final int method433(boolean arg0, int arg1) {
        ++field831;
        if (arg0) {
            method433(true, -90);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
    public final void method176(boolean arg0) {
        ++field828;
        if (arg0) {
            field814 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    public final int method121(int arg0) {
        ++field827;
        if (arg0 != -15123) {
            method436((byte) 107);
        }
        return this.field824.field5038;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lii;I)V")
    public final void method118(class405 arg0, int arg1) {
        if (arg1 != 22295) {
            field817 = null;
        }
        this.field824.method2294(1, arg0);
        ++field821;
    }

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "(I)I")
    public final int method174(int arg0) {
        if (arg0 != 2) {
            return 39;
        } else {
            ++field822;
            return this.field824.method2293((byte) 126);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public final void method112(byte arg0) {
        ++field810;
        if (arg0 > -108) {
            field814 = null;
        }
    }

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)S")
    public static final short method434(int arg0, int arg1) {
        ++field833;
        int var2 = arg0 >> 10 & 63;
        int var3 = arg0 >> 3 & 112;
        int var4 = 127 & arg0;
        if (arg1 != 2194) {
            field818 = true;
        }
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (-var4 + 127) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 != 0) {
            var7 = (var5 << 8) / var6;
        } else {
            var7 = var5 << 1;
        }
        return (short) (var6 | var7 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field825;
        class375 var3 = this.field824.method2300(arg1, true, super.field740, 1024, arg0, super.field734, false);
        if (var3 == null) {
            return null;
        } else {
            class177 var4 = arg0.method1735();
            var4.method985(super.field740, super.field729, super.field734);
            class382 var5 = null;
            if (this.field830) {
                var5 = class397.method2554(1, 0);
            }
            if (this.field824.field5070 != null) {
                class352 var6 = this.field824.field5070.method35();
                arg0.method1653(var3, var6, var4, var5 == null ? null : var5.field5543[0], 0);
            } else {
                var3.method1601(var4, var5 == null ? null : var5.field5543[0], 0);
            }
            this.field824.method2295(false, super.field737, true, super.field742, super.field743, var3, super.field726, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field837;
        if (arg0 != -17506) {
            this.field830 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lii;Lge;IIIIIIIZIIIII)V")
    public class62(class405 arg0, class104 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field1448 == -2, class319.method2147(arg3, 0, arg2));
        this.field824 = new class349(arg0, arg1, arg2, arg3, super.field727, arg5, arg6, arg8, arg9, arg14);
        this.field830 = arg1.field1455 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(I)I")
    public final int method105(int arg0) {
        ++field829;
        return arg0 >= -4 ? 46 : this.field824.field5059;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILii;I)Ldc;")
    public final class375 method111(int arg0, class405 arg1, int arg2) {
        ++field811;
        if (arg2 < 27) {
            this.field830 = true;
        }
        return this.field824.method2300(-1, false, 0, arg0, arg1, 0, false);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
    public final int method120(int arg0) {
        ++field839;
        if (arg0 != 25940) {
            this.field824 = null;
        }
        return this.field824.field5074;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method435(int arg0, String arg1) {
        ++field832;
        int var2 = arg1.length();
        int var3 = arg0;
        for (int var4 = 0; var4 < var2; ++var4) {
            var3 = (var3 << 5) + -var3 + class177.method1079(123, arg1.charAt(var4));
        }
        return var3;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        if (arg0 < 102) {
            this.method111(73, (class405) null, -15);
        }
        ++field823;
        class375 var3 = this.field824.method2300(-1, true, super.field740, 131072, arg1, super.field734, true);
        if (var3 != null) {
            this.field824.method2295(false, super.field737, false, super.field742, super.field743, var3, super.field726, arg1);
        }
    }

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "(B)V")
    public static final void method436(byte arg0) {
        ++field812;
        if (class44.field624 < 0) {
            class44.field624 = 0;
            class135.field1874 = -1;
            class28.field399 = -1;
        }
        if (class293.field4199 < class44.field624) {
            class28.field399 = -1;
            class135.field1874 = -1;
            class44.field624 = class293.field4199;
        }
        if (class373.field5426 < 0) {
            class373.field5426 = 0;
            class28.field399 = -1;
            class135.field1874 = -1;
        }
        if (class373.field5426 > class293.field4192) {
            class135.field1874 = -1;
            class28.field399 = -1;
            class373.field5426 = class293.field4192;
        }
        if (arg0 != -105) {
            method429((byte) 79, (class394) null);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lii;IIIILnc;Z)V")
    public final void method169(class405 arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, boolean arg6) {
        if (arg3 >= -106) {
            this.method102((byte) 47, (class405) null);
        }
        ++field816;
        throw new IllegalStateException();
    }
}
