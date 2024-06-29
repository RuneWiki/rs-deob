import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class179 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field2898 = 50;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field2895 = 0;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public int field2905;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method1242(byte arg0) {
        field2899++;
        for (int var1 = 0; var1 < class104.field1750; var1++) {
            int var10002 = class116.field1982[var1]--;
            if (class116.field1982[var1] >= -10) {
                class282 var3 = class275.field4435[var1];
                if (var3 == null) {
                    var3 = class282.method1889(class251.field4021, class97.field1467[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class116.field1982[var1] += var3.method1890();
                    class275.field4435[var1] = var3;
                }
                if (class116.field1982[var1] < 0) {
                    int var10;
                    if (class164.field2665[var1] == 0) {
                        var10 = class197.field3181[var1] * class153.field2469 >> 8;
                    } else {
                        int var4 = (class164.field2665[var1] & 0xFF) * 128;
                        int var5 = class164.field2665[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class197.field3179.field614;
                        int var7 = class164.field2665[var1] >> 8 & 0xFF;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 - class197.field3179.field613;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class116.field1982[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class197.field3181[var1] * class45.field548 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class91 var11 = var3.method1891().method646(class82.field1140);
                        class35 var12 = class35.method256(var11, 100, var10);
                        var12.method241(class54.field772[var1] - 1);
                        class215.field3464.method451(var12);
                    }
                    class116.field1982[var1] = -100;
                }
            } else {
                class104.field1750--;
                for (int var2 = var1; var2 < class104.field1750; var2++) {
                    class97.field1467[var2] = class97.field1467[var2 + 1];
                    class275.field4435[var2] = class275.field4435[var2 + 1];
                    class54.field772[var2] = class54.field772[var2 + 1];
                    class116.field1982[var2] = class116.field1982[var2 + 1];
                    class164.field2665[var2] = class164.field2665[var2 + 1];
                    class197.field3181[var2] = class197.field3181[var2 + 1];
                }
                var1--;
            }
        }
        if (class82.field1141 && !class218.method1450(-1)) {
            if (class92.field1319 != 0 && class88.field1212 != -1) {
                class284.method1903(0, class92.field1319, 12, class198.field3188, false, class88.field1212);
            }
            class82.field1141 = false;
        } else if (class92.field1319 != 0 && class88.field1212 != -1 && !class218.method1450(-1)) {
            class229.field3636++;
            class83.field1148.method1238(61, -136478397);
            class83.field1148.method1789((byte) -38, class88.field1212);
            class88.field1212 = -1;
        }
        if (arg0 >= -41) {
            field2895 = -3;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljj;BLjj;)V")
    public static final void method1243(class134 arg0, byte arg1, class134 arg2) {
        if (arg1 >= -31) {
            method1243((class134) null, (byte) 48, (class134) null);
        }
        field2906++;
        class39.field474 = arg0;
        class73.field995 = arg2;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZBI)I")
    public static final int method1244(int arg0, boolean arg1, byte arg2, int arg3) {
        if (arg2 < 54) {
            method1243((class134) null, (byte) -114, (class134) null);
        }
        field2904++;
        class204 var4 = (class204) class78.field1067.method457((long) arg3, (byte) -115);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < var4.field3276.length; var6++) {
            if (var4.field3276[var6] >= 0 && class249.field3991 > var4.field3276[var6]) {
                class208 var7 = class64.method514(var4.field3276[var6], 0);
                if (var7.field3363 != null) {
                    class119 var8 = (class119) var7.field3363.method457((long) arg0, (byte) -115);
                    if (var8 != null) {
                        if (arg1) {
                            var5 += var4.field3274[var6] * var8.field2011;
                        } else {
                            var5 += var8.field2011;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)I")
    public static final int method1245(byte arg0, int arg1) {
        field2901++;
        if (arg1 < 0) {
            return 0;
        }
        class204 var2 = (class204) class78.field1067.method457((long) arg1, (byte) -115);
        if (var2 == null) {
            return class248.method1643((byte) 105, arg1).field898;
        }
        if (arg0 >= -46) {
            method1242((byte) -26);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3276.length; var4++) {
            if (var2.field3276[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class248.method1643((byte) 92, arg1).field898 - var2.field3276.length);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZII)V")
    public static final void method1246(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method1245((byte) -46, -119);
        }
        if (class58.field817 <= arg1 && class121.field2042 >= arg1) {
            int var5 = class18.method125(-24914, arg0, client.field3617, class156.field2507);
            int var6 = class18.method125(-24914, arg4, client.field3617, class156.field2507);
            class219.method1458(arg3, arg1, var5, -61, var6);
        }
        field2896++;
    }
}
