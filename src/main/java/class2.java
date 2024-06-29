import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class142 {

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "[Ldh;")
    public static class38[] field10 = new class38[2048];

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Z")
    public static boolean field8 = false;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[Lmb;")
    public static class111[] field9 = new class111[256];

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lai;")
    private static class10 field18 = class44.method278("Members object", -71);

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lai;")
    public static class10 field11 = field18;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lda;")
    public static class31 field17;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(Z)V")
    public static void method4(boolean arg0) {
        if (!arg0) {
            field11 = null;
            field18 = null;
            field9 = null;
            field10 = null;
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I")
    public static final int method5(int arg0) {
        ++field12;
        int var1 = 3;
        if (~class120.field2306 > -311) {
            int var2 = class119.field2294 >> 7;
            int var3 = class34.field520 >> 7;
            if ((class185.field3527[class42.field687][var2][var3] & 4) != 0) {
                var1 = class42.field687;
            }
            int var4 = class145.field2767.field1097 >> 7;
            int var5 = class145.field2767.field1100 >> 7;
            int var6;
            if (var4 > var3) {
                var6 = -var3 + var4;
            } else {
                var6 = -var4 + var3;
            }
            int var7;
            if (~var5 >= ~var2) {
                var7 = -var5 + var2;
            } else {
                var7 = var5 - var2;
            }
            if (~var7 < ~var6) {
                int var8 = var6 * 65536 / var7;
                int var9 = 32768;
                while (~var2 != ~var5) {
                    var9 += var8;
                    if (~var2 > ~var5) {
                        ++var2;
                    } else if (~var5 > ~var2) {
                        --var2;
                    }
                    if (~(class185.field3527[class42.field687][var2][var3] & 4) != -1) {
                        var1 = class42.field687;
                    }
                    if (~var9 <= -65537) {
                        var9 -= 65536;
                        if (~var4 >= ~var3) {
                            if (~var3 < ~var4) {
                                --var3;
                            }
                        } else {
                            ++var3;
                        }
                        if (~(4 & class185.field3527[class42.field687][var2][var3]) != -1) {
                            var1 = class42.field687;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (~var3 != ~var4) {
                    if (var3 < var4) {
                        ++var3;
                    } else if (~var4 > ~var3) {
                        --var3;
                    }
                    if ((4 & class185.field3527[class42.field687][var2][var3]) != 0) {
                        var1 = class42.field687;
                    }
                    var10 += var11;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var5 > var2) {
                            ++var2;
                        } else if (var2 > var5) {
                            --var2;
                        }
                        if (~(class185.field3527[class42.field687][var2][var3] & 4) != -1) {
                            var1 = class42.field687;
                        }
                    }
                }
            }
        }
        if (~(arg0 & class185.field3527[class42.field687][class145.field2767.field1100 >> 7][class145.field2767.field1097 >> 7]) != -1) {
            var1 = class42.field687;
        }
        return var1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field15;
        if (arg0) {
            method7(-82, (class10) null, (class10) null, (class21) null);
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            class12.method84(var3, 0, class133.field2499, class13.field212[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILai;Lai;Lc;)[Lbf;")
    public static final class17[] method7(int arg0, class10 arg1, class10 arg2, class21 arg3) {
        int var4 = arg3.method156(arg0 + -4, arg2);
        int var5 = arg3.method154(var4, true, arg1);
        if (arg0 != 4) {
            return null;
        } else {
            ++field14;
            return class117.method835((byte) -108, arg3, var5, var4);
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        super(0, true);
    }
}
