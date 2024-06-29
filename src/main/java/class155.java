import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class155 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public int field2146 = 16777215;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "I")
    public int field2155 = 8;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2142 = 0;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2145 = "cyan:";

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public int field2143;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public int field2149;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public int field2150;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public int field2154;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Z")
    public boolean field2141;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method1118(int arg0, int arg1, int arg2) {
        field2148++;
        if (!class100.field1380) {
            return false;
        }
        if (arg0 < 17) {
            field2145 = (String) null;
        }
        int var3 = arg2 >> 16;
        int var4 = arg2 & 0xFFFF;
        if (class241.field3419[var3] == null || class241.field3419[var3][var4] == null) {
            return false;
        }
        class344 var5 = class241.field3419[var3][var4];
        if (arg1 == -1 && var5.field5316 == 0) {
            for (int var6 = 0; var6 < class204.field2938; var6++) {
                if (class54.field722[var6] == 31 || class54.field722[var6] == 1002 || class54.field722[var6] == 46 || class54.field722[var6] == 13 || class54.field722[var6] == 50) {
                    for (class344 var7 = class151.method1101(-78, class20.field252[var6]); var7 != null; var7 = class310.method2131(-107, var7)) {
                        if (var5.field5206 == var7.field5206) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < class204.field2938; var8++) {
                if (class334.field5049[var8] == arg1 && class20.field252[var8] == var5.field5206 && (class54.field722[var8] == 31 || class54.field722[var8] == 1002 || class54.field722[var8] == 46 || class54.field722[var8] == 13 || class54.field722[var8] == 50)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 73)
    public static final void method1119(int arg0, int arg1) {
        field2156++;
        if (arg0 == -1 || !class157.field2170[arg0]) {
            return;
        }
        int var2 = 5 % ((arg1 + 61) / 54);
        class89.field1258.method974(-12736, arg0);
        if (class241.field3419[arg0] == null) {
            return;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < class241.field3419[arg0].length; var4++) {
            if (class241.field3419[arg0][var4] != null) {
                if (class241.field3419[arg0][var4].field5316 == 2) {
                    var3 = false;
                } else {
                    class241.field3419[arg0][var4] = null;
                }
            }
        }
        if (var3) {
            class241.field3419[arg0] = null;
        }
        class157.field2170[arg0] = false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 117)
    public static final void method1120(int arg0) {
        field2153++;
        int var1 = -116 / ((arg0 + 75) / 51);
        for (class199 var2 = (class199) class332.field4994.method1335(1); var2 != null; var2 = (class199) class332.field4994.method1336(3)) {
            class245 var3 = var2.field2837;
            if (class251.field3603 != var3.field3522 || var3.field3534) {
                var2.method1274((byte) -26);
            } else if (class329.field4966 >= var3.field3523) {
                var3.method1685((byte) -57, class287.field4278);
                if (var3.field3534) {
                    var2.method1274((byte) -26);
                } else {
                    class126.method913(var3.field3522, var3.field3530, var3.field3533, var3.field3536, 60, var3, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ILcg;I)V", line = 149)
    public final void method1121(int arg0, class316 arg1, int arg2) {
        field2144++;
        while (true) {
            int var4 = arg1.method2219(16448);
            if (var4 == 0) {
                if (arg0 != 0) {
                    method1118(-82, 119, 70);
                }
                return;
            }
            this.method1122(arg2, var4, arg1, 103);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IILcg;I)V", line = 170)
    private final void method1122(int arg0, int arg1, class316 arg2, int arg3) {
        if (arg3 <= 86) {
            method1125(123, -59, -6, 27);
        }
        field2157++;
        if (arg1 == 1) {
            this.field2155 = arg2.method2220((byte) 124);
        } else if (arg1 == 2) {
            this.field2141 = true;
        } else if (arg1 == 3) {
            this.field2147 = arg2.method2161(28984);
            this.field2149 = arg2.method2161(28984);
            this.field2143 = arg2.method2161(28984);
        } else if (arg1 == 4) {
            this.field2150 = arg2.method2219(16448);
        } else if (arg1 == 5) {
            this.field2154 = arg2.method2220((byte) 83);
        } else if (arg1 == 6) {
            this.field2146 = arg2.method2210((byte) -5);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 221)
    public static void method1123(int arg0) {
        if (arg0 != -3) {
            field2142 = 121;
        }
        field2145 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZIIIIBIII)V", line = 233)
    public static final void method1124(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field2152++;
        int var10 = arg2 - arg0;
        int var11 = arg4 - arg9;
        int var12 = (arg8 - arg3 << 16) / var11;
        int var13 = (arg5 - arg7 << 16) / var10;
        if (arg6 < 65) {
            method1119(92, 122);
        }
        class153.method1107(arg3, var12, arg4, arg0, arg7, arg9, var13, 0, arg1, -68, 0, arg2);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIII)I", line = 252)
    public static final int method1125(int arg0, int arg1, int arg2, int arg3) {
        field2151++;
        int var4 = arg3 / arg0;
        int var5 = arg3 & arg0 - 1;
        int var6 = arg1 / arg0;
        int var7 = arg1 & arg0 - 1;
        int var8 = class135.method980(var6, (byte) -123, var4);
        int var9 = class135.method980(var6, (byte) -118, var4 + 1);
        int var10 = class135.method980(var6 + 1, (byte) -94, var4);
        if (arg2 != -32) {
            field2142 = 63;
        }
        int var11 = class135.method980(var6 + 1, (byte) -117, var4 + 1);
        int var12 = class97.method709(var5, var9, arg0, var8, (byte) 108);
        int var13 = class97.method709(var5, var11, arg0, var10, (byte) 112);
        return class97.method709(var7, var13, arg0, var12, (byte) 127);
    }
}
