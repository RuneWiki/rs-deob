import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class427 {

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "Laq;")
    public static class90 field6016 = new class90();

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[S")
    public static short[] field6017 = new short[256];

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 4)
    public static final String method2690(String arg0, int arg1) {
        if (arg1 != -23289) {
            return null;
        }
        field6009++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg0.length();
        while (var3 > var2 && class139.method959(125, arg0.charAt(var2))) {
            var2++;
        }
        while (var3 > var2 && class139.method959(89, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class134.method940((byte) 62, var7)) {
                char var8 = class146.method997(205, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 63)
    public static final void method2691(boolean arg0) {
        class428.method2705(5, 0);
        field6012++;
        class243.method1653((byte) 125, 5);
        class231.method1594(5, arg0);
        class322.method2078(5, -93);
        class286.method1870(5, (byte) -116);
        class106.method753(5, -115);
        class341.method2167((byte) 126, 5);
        class187.method1212(257, 5);
        class436.method2741(63, 5);
        method2693(100, 5);
        class446.method2781((byte) 39, 5);
        class54.method444(-109, 5);
        class428.method2703(16191, 5);
        class389.method2461(-1860768891, 5);
        class74.method549(-103, 5);
        class48.method419(5, true);
        class218.method1407(-25, 5);
        class295.method1925(false, 5);
        class382.method2433(5, (byte) 56);
        class434.method2731(5, 123);
        class123.method832(122, 50);
        class73.method543(5, (byte) -124);
        class73.method544(-14767, 5);
        class375.field5348.method901(5, 12223);
        class412.field5842.method901(5, 12223);
        class425.field5992.method901(5, 12223);
        class5.field87.method901(5, 12223);
        class177.field2441.method901(5, 12223);
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lai;IZLjava/lang/String;)V", line = 98)
    public static final void method2692(class357 arg0, int arg1, boolean arg2, String arg3) {
        field6015++;
        if (arg1 <= 41) {
            return;
        }
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class293.field4104.method2160((class226[]) null, 250, arg3, (byte) -121);
        int var8 = class293.field4104.method2158(true, 250, (class226[]) null, arg3) * 13;
        class64.field949.method56(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var4 + var8, -16777216, 0);
        class64.field949.method59(var5 - var4, -var4 + var6, var4 + var7 + var4, var4 + var8 + var4, -1, 0);
        arg0.method2287(-1, 0, var7, -1, 1, var6, arg3, false, var8, 1, 0, 0, (int[]) null, var5, (class241) null, (class226[]) null);
        class285.method1861(var4 + var8 + var4, 28659, var6 - var4, var5 - var4, var4 + var7 + var4);
        if (arg2) {
            class64.field949.method118();
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)V", line = 125)
    private static final void method2693(int arg0, int arg1) {
        field6014++;
        class131 var2 = class73.field1045;
        synchronized (class73.field1045) {
            class73.field1045.method901(arg1, 12223);
            if (arg0 != 100) {
                field6017 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lep;Lms;IBILk;Ljava/lang/String;ILai;III)V", line = 138)
    public static final void method2694(class241 arg0, class453 arg1, int arg2, byte arg3, int arg4, class337 arg5, String arg6, int arg7, class357 arg8, int arg9, int arg10, int arg11) {
        if (arg3 != 89) {
            return;
        }
        field6010++;
        int var12;
        if (class128.field1807 == 4) {
            var12 = (int) class333.field4599 & 0x3FFF;
        } else {
            var12 = (int) class333.field4599 + class126.field1778 & 0x3FFF;
        }
        int var13 = Math.max(arg1.field6342 / 2, arg1.field6447 / 2) + 10;
        int var14 = arg4 * arg4 + arg7 * arg7;
        if ((var13 * var13) < var14) {
            return;
        }
        int var15 = class133.field1913[var12];
        int var16 = class133.field1908[var12];
        if (class128.field1807 != 4) {
            var15 = var15 * 256 / (class374.field5308 + 256);
            var16 = var16 * 256 / (class374.field5308 + 256);
        }
        int var17 = arg4 * var16 + arg7 * var15 >> 15;
        int var18 = arg7 * var16 - (arg4 * var15) >> 15;
        int var19 = arg5.method2160((class226[]) null, 100, arg6, (byte) -127);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method2161(0, arg6, 0, (class226[]) null, 100);
        if ((-arg1.field6342) <= var20 && var20 <= arg1.field6342 && var18 >= (-arg1.field6447) && var18 <= arg1.field6447) {
            arg8.method2287(0, arg2, var19, arg10, 0, arg1.field6447 / 2 + (arg2 - (var18 + arg11)) - var21, arg6, false, 50, 1, 0, arg9, (int[]) null, var20 - (-(arg1.field6342 / 2) - arg9), arg0, (class226[]) null);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)[B", line = 190)
    public static final synchronized byte[] method2695(int arg0, byte arg1) {
        field6013++;
        if (arg0 == 100 && class322.field4414 > 0) {
            byte[] var2 = class382.field5461[--class322.field4414];
            class382.field5461[class322.field4414] = null;
            return var2;
        } else if (arg0 == 5000 && class285.field4030 > 0) {
            byte[] var3 = class454.field6492[--class285.field4030];
            class454.field6492[class285.field4030] = null;
            return var3;
        } else {
            int var4 = -99 % ((arg1 + 39) / 44);
            if (arg0 == 30000 && class431.field6092 > 0) {
                byte[] var5 = class284.field4008[--class431.field6092];
                class284.field4008[class431.field6092] = null;
                return var5;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V", line = 228)
    public static void method2696(byte arg0) {
        field6017 = null;
        if (arg0 != -66) {
            field6016 = null;
        }
        field6016 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Z", line = 239)
    public static final boolean method2697(int arg0) {
        if (arg0 != -1) {
            field6016 = null;
        }
        field6011++;
        return class90.field1260 > 0;
    }
}
