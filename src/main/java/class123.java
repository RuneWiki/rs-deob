import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class123 extends class155 {

    @OriginalMember(owner = "client!le", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2041 = "flash1:";

    @OriginalMember(owner = "client!le", name = "F", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Lrb;")
    private class143 field2033;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "[I")
    public static int[] field2042;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILl;IIILmh;Ljava/lang/String;I)V")
    public static final void method944(int arg0, int arg1, int arg2, class10 arg3, int arg4, int arg5, int arg6, class263 arg7, String arg8, int arg9) {
        int var10 = (int) class102.field1736 + class267.field4279 & 0x7FF;
        field2047++;
        int var11 = Math.max(arg7.field4215 / 2, arg7.field4046 / 2) + 10;
        int var12 = arg4 * arg4 + arg9 * arg9;
        if (var12 > var11 * var11) {
            return;
        }
        int var13 = class244.field3590[var10];
        int var14 = class244.field3592[var10];
        int var15 = var13 * 256 / (class131.field2168 + 256);
        int var16 = var14 * 256 / (class131.field2168 + 256);
        if (arg2 != 3) {
            method948(-53);
        }
        int var17 = arg4 * var15 + arg9 * var16 >> 16;
        int var18 = arg4 * var16 - (arg9 * var15) >> 16;
        int var19 = arg3.method77(arg8, 100);
        int var20 = arg3.method75(arg8, 100, 0);
        int var21 = var17 - var19 / 2;
        if ((-arg7.field4215) <= var21 && var21 <= arg7.field4215 && -arg7.field4046 <= var18 && arg7.field4046 >= var18) {
            class130.method997(arg7.field4220, arg7.field4168);
            arg3.method82(arg8, arg7.field4215 / 2 + var21 + arg1, arg7.field4046 / 2 + arg0 + -var18 + -var20 + -arg5, var19, 50, arg6, 0, 256, 1, 0, 0);
            class130.method1000();
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;ZLhc;)I")
    public static final int method945(String arg0, boolean arg1, class53 arg2) {
        field2049++;
        int var3 = arg2.field735;
        byte[] var4 = class78.method582(-78, arg0);
        arg2.method380(-53, var4.length);
        arg2.field735 += class300.field4848.method1344(var4, arg2.field735, var4.length, arg2.field758, 0, (byte) -98);
        if (!arg1) {
            field2040 = -5;
        }
        return arg2.field735 - var3;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILhc;)V")
    private final void method946(byte arg0, int arg1, class53 arg2) {
        if (arg1 == 249) {
            int var4 = arg2.method366(-16505);
            if (this.field2033 == null) {
                int var5 = class172.method1224(var4, -45054224);
                this.field2033 = new class143(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method366(-16505) == 1;
                int var8 = arg2.method362(-4);
                class259 var9;
                if (var7) {
                    var9 = new class51(arg2.method326(93));
                } else {
                    var9 = new class108(arg2.method340(-83));
                }
                this.field2033.method1074((byte) 39, var9, (long) var8);
            }
        }
        field2044++;
        if (arg0 <= 101) {
            this.method954(-113, 100, true);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Llc;Z)V")
    public static final void method947(class270 arg0, boolean arg1) {
        class203.field2986 = class131.method1007(class78.field1264, arg1, arg0);
        field2038++;
        class185.field2762 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = (class217.field3169[var2 + 1] & 0xFF0000) >> 16;
            float var5 = (float) ((class217.field3169[var2] & 0xFF0000) >> 16);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) ((class217.field3169[var2] & 0xFF00) >> 8);
            int var8 = class217.field3169[var2 + 1] >> 8 & 0xFF;
            float var9 = (float) (class217.field3169[var2] & 0xFF);
            float var10 = ((float) var8 - var7) / 64.0F;
            int var11 = class217.field3169[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var9) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class185.field2762[var2 * 64 + var13] = class200.method1408((int) var9, class200.method1408((int) var7 << 8, (int) var5 << 16));
                var5 += var6;
                var9 += var12;
                var7 += var10;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class185.field2762[var3] = class217.field3169[3];
        }
        class57.field845 = new int[32768];
        class231.field3395 = new int[32768];
        class98.method769((class176) null, (byte) 119);
        class209.field3096 = new int[32768];
        class237.field3464 = new int[32768];
        class53.field740 = new class148(128, 254);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2042 = null;
        field2041 = null;
        if (arg0 != 2047) {
            field2045 = -18;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(ILhc;)V")
    public final void method949(int arg0, class53 arg1) {
        field2043++;
        if (arg0 != -25329) {
            field2042 = null;
        }
        while (true) {
            int var3 = arg1.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method946((byte) 118, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IBI)V")
    public static final void method950(int arg0, byte arg1, int arg2) {
        class279 var3 = class111.method844(arg0, 1, -1780180960);
        var3.method1928(false);
        var3.field4505 = arg2;
        int var4 = 38 / ((51 - arg1) / 39);
        field2034++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method951(int arg0, int arg1, boolean arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        field2037++;
        class93 var3 = class48.method297(arg2, arg1);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method712(arg0, true);
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static final void method952(int arg0) {
        field2035++;
        class272.field4399.method1422((byte) -61);
        class14.field161.method1422((byte) -73);
        if (arg0 >= -117) {
            method952(-73);
        }
        class287.field4595.method1422((byte) -73);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
    public final String method953(String arg0, byte arg1, int arg2) {
        field2046++;
        if (this.field2033 == null) {
            return arg0;
        } else if (arg1 < 22) {
            return null;
        } else {
            class51 var4 = (class51) this.field2033.method1073(-1, (long) arg2);
            return var4 == null ? arg0 : var4.field704;
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(IIZ)I")
    public final int method954(int arg0, int arg1, boolean arg2) {
        field2048++;
        if (!arg2) {
            return -125;
        } else if (this.field2033 == null) {
            return arg1;
        } else {
            class108 var4 = (class108) this.field2033.method1073(-1, (long) arg0);
            return var4 == null ? arg1 : var4.field1828;
        }
    }
}
