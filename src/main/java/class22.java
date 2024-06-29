import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public abstract class class22 {

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lbh;")
    public static class234 field267 = new class234();

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[I")
    public static int[] field272 = new int[8];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public int field266;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public int field273;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
    public final boolean method129(byte arg0) {
        field264++;
        if (arg0 != 97) {
            this.field274 = -5;
        }
        return (this.field274 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Z")
    public final boolean method130(int arg0) {
        if (arg0 == -1) {
            field268++;
            return (this.field274 & 0x1) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z")
    public final boolean method131(byte arg0) {
        int var2 = -8 / ((50 - arg0) / 48);
        field265++;
        return (this.field274 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BZLse;)V")
    public static final void method132(byte arg0, boolean arg1, class89 arg2) {
        if (arg1) {
            int var3 = client.field4437;
            int var4 = var3 * 956 / 503;
            class29.field352.method853((class84.field1166 - var4) / 2, 0, var4, var3);
            class287.field4471.method3(class84.field1166 / 2 - class287.field4471.field18 / 2, 18);
        }
        field271++;
        if (arg0 > -56) {
            method135(-14, (byte) 48, 123, 54, 7, -1, 118, 100);
        }
        arg2.method528(class1.field3, class84.field1166 / 2, client.field4437 / 2 - 26, 16777215, -1);
        int var5 = client.field4437 / 2 - 18;
        class155.method1020(class84.field1166 / 2 - 152, var5, 304, 34, 9179409);
        class155.method1020(class84.field1166 / 2 - 151, var5 + 1, 302, 32, 0);
        class155.method1018(class84.field1166 / 2 - 150, var5 + 2, class40.field483 * 3, 30, 9179409);
        class155.method1018(class84.field1166 / 2 + class40.field483 * 3 - 150, var5 + 2, 300 - (class40.field483 * 3), 30, 0);
        arg2.method528(class243.field3545, class84.field1166 / 2, client.field4437 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
    public static final void method133(int arg0) {
        field270++;
        int[] var1 = new int[class95.field1270];
        int var2 = arg0;
        for (int var3 = 0; var3 < class95.field1270; var3++) {
            class229 var5 = class36.method224(var3, arg0 ^ 0x7A);
            if (var5.field3247 >= 0 || var5.field3268 >= 0) {
                var1[var2++] = var3;
            }
        }
        class93.field1250 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class93.field1250[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIII)I")
    public static final int method134(int arg0, int arg1, int arg2, int arg3) {
        field263++;
        if (arg1 != 14949) {
            method133(-25);
        }
        if (arg2 >= arg0) {
            return arg3 >= arg2 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IBIIIIII)V")
    public static final void method135(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field262++;
        if (arg5 >= 1 && arg4 >= 1 && arg5 <= 102 && arg4 <= 102) {
            if (!class176.method1141(1) && (class241.field3507[0][arg5][arg4] & 0x2) == 0) {
                int var8 = arg7;
                if ((class241.field3507[arg7][arg5][arg4] & 0x8) != 0) {
                    var8 = 0;
                }
                if (class251.field3626 != var8) {
                    return;
                }
            }
            int var9 = arg7;
            if (arg7 < 3 && (class241.field3507[1][arg5][arg4] & 0x2) == 2) {
                var9 = arg7 + 1;
            }
            class72.method447(false, arg2, arg7, class127.field1825[arg7], var9, arg4, arg5);
            if (arg6 >= 0) {
                boolean var10 = class149.field2169;
                class149.field2169 = true;
                class204.method1314(false, var9, arg0, arg3, false, class127.field1825[arg7], (byte) 118, arg7, arg4, arg5, arg6);
                class149.field2169 = var10;
            }
        }
        if (arg1 >= -86) {
            method133(-38);
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V")
    public static void method136(int arg0) {
        field272 = null;
        field267 = null;
        int var1 = 65 / ((arg0 - 88) / 36);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLjava/lang/String;Lbc;)La;")
    public static final class154 method137(byte arg0, String arg1, class282 arg2) {
        field261++;
        int var3 = arg2.method1844(arg1, -113);
        if (var3 == -1) {
            return new class154(0);
        }
        int[] var4 = arg2.method1851(1, var3);
        class154 var5 = new class154(var4.length);
        if (arg0 < 71) {
            method136(55);
        }
        for (int var6 = 0; var6 < var5.field2238; var6++) {
            class216 var7 = new class216(arg2.method1861(var4[var6], var3, 1));
            var5.field2229[var6] = var7.method1352((byte) -54);
            var5.field2236[var6] = var7.method1355(true);
            var5.field2228[var6] = var7.method1358(81);
            var5.field2225[var6] = var7.method1358(121);
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)Z")
    public final boolean method138(int arg0) {
        field269++;
        if (arg0 <= 97) {
            return false;
        } else {
            return (this.field274 & 0x4) != 0;
        }
    }
}
