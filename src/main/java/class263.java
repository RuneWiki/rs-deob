import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class263 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "[I")
    public static int[] field4092 = new int[50];

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4089 = 0;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4095 = 0;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "J")
    public static long field4088 = 0L;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Ll;")
    public static class133 field4097;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B[BI)I", line = 6)
    public static final int method1789(byte arg0, byte[] arg1, int arg2) {
        field4087++;
        if (arg0 != -22) {
            field4095 = 6;
        }
        return class83.method590(arg1, (byte) -49, 0, arg2);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIBI)I", line = 20)
    public static final int method1790(int arg0, int arg1, byte arg2, int arg3) {
        field4091++;
        int var4 = arg3 / arg0;
        int var5 = arg0 - 1 & arg3;
        int var6 = arg1 / arg0;
        int var7 = class339.method2356(var4, var6, -125);
        int var8 = arg1 & arg0 - 1;
        int var9 = class339.method2356(var4 + 1, var6, -128);
        if (arg2 != 7) {
            method1789((byte) 115, (byte[]) null, 112);
        }
        int var10 = class339.method2356(var4, var6 + 1, -125);
        int var11 = class339.method2356(var4 + 1, var6 + 1, arg2 ^ 0xFFFFFF87);
        int var12 = class125.method906(var9, var7, arg0, var5, (byte) -123);
        int var13 = class125.method906(var11, var10, arg0, var5, (byte) -123);
        return class125.method906(var13, var12, arg0, var8, (byte) -123);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 52)
    public static final void method1791(int arg0) {
        field4090++;
        int var1 = -104 % ((-arg0 - 15) / 51);
        for (int var2 = 0; var2 < class98.field1562; var2++) {
            int var3 = class260.field4065[var2];
            class33 var4 = class254.field3992[var3];
            int var5 = class10.field132.method1178(0);
            if ((var5 & 0x80) != 0) {
                var5 += class10.field132.method1178(0) << 8;
            }
            class77.method563(var4, var5, -1, var3);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "([SB[Ljava/lang/String;)V", line = 83)
    public static final void method1792(short[] arg0, byte arg1, String[] arg2) {
        class43.method364(arg2, (byte) 78, 0, arg2.length - 1, arg0);
        field4094++;
        if (arg1 != 5) {
            field4088 = 110L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(III)V", line = 96)
    public static final void method1793(int arg0, int arg1, int arg2) {
        class174.field2639 = true;
        class241.field3864 = arg0;
        class296.field4569 = arg1;
        class156.field2333 = arg2;
        class143.field2222 = -1;
        class29.field428 = -1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 105)
    public static void method1794(int arg0) {
        field4092 = null;
        field4097 = null;
        int var1 = 111 % ((30 - arg0) / 45);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIIZII)V", line = 123)
    public static final void method1795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        int var9 = arg4 - arg8;
        field4093++;
        int var10 = (arg7 - arg2 << 16) / var9;
        int var11 = arg1 - arg0;
        int var12 = (arg3 - arg5 << 16) / var11;
        class216.method1531(0, var10, arg1, var12, arg0, 0, arg6, arg2, arg4, arg8, arg5);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(III)J", line = 138)
    public static final long method1796(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null || var3.field2196 == null ? 0L : var3.field2196.field4300;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIZII)V", line = 153)
    public static final void method1797(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 != -11999) {
            method1791(120);
        }
        field4086++;
        if (class321.method2189(arg4, (byte) 79)) {
            class193.method1372(arg3, arg2, (byte) -42, -1, class163.field2463[arg4], arg0);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZB)V", line = 172)
    public static final void method1798(boolean arg0, byte arg1) {
        field4096++;
        if (arg1 != 52) {
            method1791(45);
        }
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (class94.field1516 && arg0) {
            var3 = 1;
            var4 = class29.field430;
        } else {
            var4 = class303.field4723;
            var3 = 4;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class170.method1225((byte) -97);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class315.field4897[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFF1D3) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class331.field5158.length; var15++) {
                                if (class331.field5158[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class103.method750(arg0, var6 * 8, var5, 1936126115, var13, var7 * 8, class224.field3570, var10, var11, var4[var15], var12);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class320.method2178(var6 * 8, var7 * 8, 8, 8, -29029, var5);
                    }
                }
            }
        }
        if (var2 == null) {
            class30.field440 = -1;
            return;
        }
        class341.field5318 = var2[2];
        class117.field1791 = var2[1];
        class30.field440 = var2[0];
        class163.field2451 = var2[3];
        class278.field4282 = var2[4];
    }
}
