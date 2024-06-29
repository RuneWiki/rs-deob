import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class164 extends class44 {

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Z")
    public static boolean field2353 = true;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "[I")
    public static int[] field2354 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2349 = "Choose Option";

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[I")
    public static int[] field2358 = new int[2500];

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)V")
    public static final void method1075(int arg0, int arg1) {
        field2352++;
        int var2 = 125 % ((arg1 - 63) / 51);
        class66 var3 = class6.method34(7, true, arg0);
        var3.method410(117);
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static final void method1076(int arg0) {
        field2351++;
        for (class206 var1 = (class206) class51.field578.method1532(arg0 ^ 0x5F); var1 != null; var1 = (class206) class51.field578.method1523(-63)) {
            if (var1.field2933 > 0) {
                var1.field2933--;
            }
            if (var1.field2933 != 0) {
                if (var1.field2923 > 0) {
                    var1.field2923--;
                }
                if (var1.field2923 == 0 && var1.field2925 >= 1 && var1.field2924 >= 1 && var1.field2925 <= 102 && var1.field2924 <= 102 && (var1.field2932 < 0 || class127.method833(var1.field2930, arg0, var1.field2932))) {
                    class22.method135(var1.field2930, (byte) -119, var1.field2934, var1.field2927, var1.field2924, var1.field2925, var1.field2932, var1.field2918);
                    var1.field2923 = -1;
                    if (var1.field2932 == var1.field2921 && var1.field2921 == -1) {
                        var1.method1935(110);
                    } else if (var1.field2932 == var1.field2921 && var1.field2927 == var1.field2917 && var1.field2930 == var1.field2922) {
                        var1.method1935(125);
                    }
                }
            } else if (var1.field2921 < 0 || class127.method833(var1.field2922, -1, var1.field2921)) {
                class22.method135(var1.field2922, (byte) -119, var1.field2934, var1.field2917, var1.field2924, var1.field2925, var1.field2921, var1.field2918);
                var1.method1935(110);
            }
        }
        if (arg0 != -1) {
            method1079(false, 17, (String) null);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIIII)V")
    public static final void method1077(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < arg2) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class268.field3919[var5][arg4] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class268.field3919[var6][arg4] = arg1;
            }
        }
        if (arg0 < 50) {
            field2354 = null;
        }
        field2357++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)I")
    public static final int method1078(boolean arg0, int arg1) {
        field2359++;
        if (!arg0) {
            method1077((byte) 7, -114, 124, 79, -31);
        }
        return arg1 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1079(boolean arg0, int arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg0 ? 32768 : 0;
        field2355++;
        int var7 = var6 + (arg0 ? class222.field3141 : class154.field2227);
        for (int var8 = var6; var8 < var7; var8++) {
            class226 var11 = class20.method123(32767, var8);
            if (var11.field3181 && var11.method1469(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class181.field2582 = null;
                    class210.field2954 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class181.field2582 = var4;
        class210.field2954 = var5;
        class209.field2943 = 0;
        String[] var9 = new String[class210.field2954];
        int var10 = 0;
        if (arg1 != -25339) {
            return;
        }
        while (class210.field2954 > var10) {
            var9[var10] = class20.method123(32767, var4[var10]).method1469(false);
            var10++;
        }
        class6.method37(class181.field2582, var9, -104);
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2358 = null;
        field2354 = null;
        field2349 = null;
        if (arg0 != -1) {
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)Lgl;")
    public static final class273 method1081(int arg0, int arg1) {
        field2356++;
        class273 var2 = (class273) class59.field703.method65((byte) -113, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class93.field1251.method1861(class123.method803((byte) 5, arg1), class287.method1927(arg1, (byte) 92), 1);
        class273 var4 = new class273();
        var4.field4012 = arg1;
        if (var3 != null) {
            var4.method1744((byte) -122, new class216(var3));
        }
        var4.method1750(1152163274);
        if (!class181.field2576 && var4.field4062) {
            var4.field3996 = null;
        }
        if (var4.field4043) {
            var4.field4063 = false;
            var4.field4016 = 0;
        }
        class59.field703.method64((long) arg1, -1, var4);
        return arg0 == 0 ? var4 : null;
    }
}
