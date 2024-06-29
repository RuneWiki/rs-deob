import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class158 extends class16 {

    @OriginalMember(owner = "client!qf", name = "T", descriptor = "[I")
    public static int[] field2430 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!qf", name = "Q", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!qf", name = "R", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!qf", name = "S", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qf", name = "W", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!qf", name = "Y", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!qf", name = "Z", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!qf", name = "X", descriptor = "Z")
    public static boolean field2434;

    @OriginalMember(owner = "client!qf", name = "U", descriptor = "[Lug;")
    public static class321[] field2431;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(B)V", line = 5)
    public static final void method1091(byte arg0) {
        field2428++;
        class185.field2976.method1615(72);
        class95.field1454.method1615(65);
        if (arg0 >= -4) {
            method1095(true);
        }
    }

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "(I)V", line = 22)
    public static void method1092(int arg0) {
        int var1 = 70 % ((-arg0 - 27) / 48);
        field2430 = null;
        field2431 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)[[I", line = 36)
    public final int[][] method54(int arg0, byte arg1) {
        int[][] var3 = this.field197.method715(true, arg0);
        field2427++;
        int var4 = 13 / ((40 - arg1) / 41);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[] var6 = var5[1];
            int[] var7 = var5[0];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            int[] var11 = var3[1];
            for (int var12 = 0; var12 < class276.field4376; var12++) {
                var9[var12] = 4096 - var7[var12];
                var11[var12] = 4096 - var6[var12];
                var10[var12] = 4096 - var8[var12];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILok;IIIIIB)V", line = 78)
    public static final void method1093(int arg0, class160 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field2433++;
        if (class229.field3628) {
            class209.field3416 = 32;
        } else {
            class209.field3416 = 0;
        }
        class229.field3628 = false;
        if (class342.field5335 != 0) {
            if (arg4 >= arg2 && (arg2 + 16) > arg4 && arg0 <= arg6 && (arg0 + 16) > arg6) {
                arg1.field2472 -= 4;
                class219.method1600(arg1, 117);
            } else if (arg2 <= arg4 && arg4 < (arg2 + 16) && arg0 + arg5 - 16 <= arg6 && (arg0 + arg5) > arg6) {
                arg1.field2472 += 4;
                class219.method1600(arg1, 124);
            } else if ((arg2 - class209.field3416) <= arg4 && arg2 + class209.field3416 + 16 > arg4 && arg6 >= arg0 + 16 && arg6 < (arg0 + arg5 - 16)) {
                int var8 = (arg5 - 32) * arg5 / arg3;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 - 32;
                int var10 = arg6 - arg0 - (var8 / 2) - 16;
                arg1.field2472 = (arg3 - arg5) * var10 / var9;
                class219.method1600(arg1, 118);
                class229.field3628 = true;
            }
        }
        if (class200.field3279 != 0) {
            int var11 = arg1.field2458;
            if ((arg2 - var11) <= arg4 && arg6 >= arg0 && arg4 < arg2 + 16 && arg6 <= arg0 + arg5) {
                arg1.field2472 += class200.field3279 * 45;
                class219.method1600(arg1, 124);
            }
        }
        if (arg7 >= -110) {
            field2430 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(ZI)[I", line = 155)
    public final int[] method8(boolean arg0, int arg1) {
        field2435++;
        if (!arg0) {
            field2434 = false;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 182)
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Llg;I)V", line = 187)
    public static final void method1094(class132 arg0, int arg1) {
        field2429++;
        if (class48.field648 == arg0.field1975 || arg0.field1968 == -1 || arg0.field2002 != 0 || (arg0.field1955 + 1) > class37.method236(arg0.field1968, 20254).field1223[arg0.field1948]) {
            int var2 = arg0.field1975 - arg0.field1978;
            int var3 = class48.field648 - arg0.field1978;
            int var4 = arg0.field1950 * 128 + (arg0.method910(-1) * 64);
            int var5 = arg0.field1995 * 128 + arg0.method910(-1) * 64;
            int var6 = arg0.field1988 * 128 + (arg0.method910(arg1 ^ 0xFFFFC5F9) * 64);
            int var7 = arg0.field1953 * 128 + (arg0.method910(-1) * 64);
            arg0.field1980 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            arg0.field1944 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field1959 == 0) {
            arg0.field1973 = 1024;
        }
        if (arg0.field1959 == 1) {
            arg0.field1973 = 1536;
        }
        if (arg0.field1959 == 2) {
            arg0.field1973 = 0;
        }
        if (arg0.field1959 == 3) {
            arg0.field1973 = 512;
        }
        arg0.field2041 = 0;
        if (arg1 != 14854) {
            field2434 = true;
        }
        arg0.field2037 = arg0.field1973;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(Z)V", line = 234)
    public static final void method1095(boolean arg0) {
        field2436++;
        class17 var1 = class334.field5188;
        synchronized (class334.field5188) {
            class101.field1551++;
            class342.field5335 = class118.field1762;
            if (!arg0) {
                field2434 = true;
            }
            class164.field2672 = class62.field819;
            class4.field35 = class114.field1721;
            class303.field4727 = class239.field3780;
            class221.field3521 = class78.field1181;
            class144.field2158 = class324.field5067;
            class44.field602 = class288.field4550;
            class239.field3780 = 0;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLim;I)V", line = 261)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field2432++;
        if (arg0 == -7 && arg2 == 0) {
            this.field191 = arg1.method1399(arg0 ^ 0x45E13F91) == 1;
        }
    }
}
