import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class479 extends class535 {

    @OriginalMember(owner = "client!lw", name = "R", descriptor = "I")
    private int field6985 = 4096;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "Z")
    public static boolean field6976 = false;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "Z")
    public static boolean field6981 = true;

    @OriginalMember(owner = "client!lw", name = "O", descriptor = "[[S")
    public static short[][] field6982 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field6974;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field6977;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field6978;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field6980;

    @OriginalMember(owner = "client!lw", name = "P", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
    public static int field6984;

    @OriginalMember(owner = "client!lw", name = "S", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!lw", name = "T", descriptor = "Lci;")
    public static class320 field6987;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "Loi;")
    public static class52 field6979;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)Lob;", line = 6)
    public static final class529 method2833(int arg0, int arg1) {
        if (arg0 != 4096) {
            return null;
        } else {
            ++field6980;
            class529 var2 = (class529) class17.field187.method2982(0, (long) arg1);
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class75.field1237.method2037(arg1, (byte) 81, 0);
                class529 var4 = new class529();
                if (var3 != null) {
                    var4.method3137(new class519(var3), (byte) 104);
                }
                var4.method3136(-15557);
                class17.field187.method2981(var4, 69, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "()V", line = 36)
    public class479() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)[I", line = 39)
    public final int[] method65(int arg0, int arg1) {
        if (arg1 != 1) {
            field6982 = null;
        }
        ++field6983;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(98, 0, arg0 + -1 & class293.field4364);
            int[] var5 = this.method3158(-100, 0, arg0);
            int[] var6 = this.method3158(82, 0, class293.field4364 & arg0 + 1);
            for (int var7 = 0; ~class174.field2597 < ~var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field6985;
                int var9 = (var5[class529.field7783 & var7 + 1] + -var5[var7 + -1 & class529.field7783]) * this.field6985;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + 4096 + var13) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V", line = 95)
    public static final void method2834(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class220.field3371.field2549 != -1 && ~arg3 != -1 && ~class215.field3238 > -51 && ~arg2 != 0) {
            class79.field1281[class215.field3238++] = new class306((byte) 2, arg2, arg3, arg1, arg4, 0);
        }
        if (arg0 != 0) {
            method2834(-65, 81, 5, 90, -66);
        }
        ++field6986;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLjava/lang/String;)I", line = 125)
    public static final int method2835(byte arg0, String arg1) {
        ++field6975;
        int var2 = arg1.length();
        if (arg0 >= -39) {
            method2834(69, -45, 74, -119, -61);
        }
        int var3 = 0;
        for (int var4 = 0; var2 > var4; ++var4) {
            char var5 = arg1.charAt(var4);
            if (~var5 < -128) {
                if (~var5 >= -2048) {
                    var3 += 2;
                } else {
                    var3 += 3;
                }
            } else {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIJI)V", line = 159)
    public static final void method2836(byte arg0, int arg1, long arg2, int arg3) {
        int var5 = 93 / ((53 - arg0) / 62);
        ++field6974;
        int var6 = (516715 & (int) arg2) >> 14;
        int var7 = (int) arg2 >> 20 & 3;
        int var8 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (~var6 != -11 && ~var6 != -12 && ~var6 != -23) {
            class15.method88(0, 0, arg1, var6, 17686, arg3, true, var7, 0);
        } else {
            class261 var9 = class277.field4139.method569((byte) 105, var8);
            int var10;
            int var11;
            if (~var7 != -1 && ~var7 != -3) {
                var10 = var9.field3864;
                var11 = var9.field3859;
            } else {
                var10 = var9.field3859;
                var11 = var9.field3864;
            }
            int var12 = var9.field3935;
            if (var7 != 0) {
                var12 = (var12 >> 4 - var7) + (var12 << var7 & 15);
            }
            class15.method88(var11, var12, arg1, 0, 17686, arg3, true, 0, var10);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILwn;I)V", line = 202)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg2 != -6232) {
            field6976 = true;
        }
        if (~arg0 == -1) {
            this.field6985 = arg1.method3018(566990904);
        }
        ++field6973;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILqa;IBIII)Lka;", line = 215)
    public static final class336 method2837(int arg0, class167 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= -92) {
            return null;
        } else {
            ++field6984;
            long var7 = (long) arg0;
            class336 var9 = (class336) class211.field3186.method2982(0, var7);
            short var10 = 2055;
            if (var9 == null) {
                class330 var11 = class494.method2904(class349.field5119, 0, arg0, -3808);
                if (var11 == null) {
                    return null;
                }
                if (var11.field4843 < 13) {
                    var11.method2082(94, 0);
                }
                var9 = arg1.method225(var11, var10, class28.field390, 64, 768);
                class211.field3186.method2981(var9, 108, var7);
            }
            class336 var12 = var9.method1154((byte) 2, var10, true);
            if (~arg6 != -1) {
                var12.method1151(arg6);
            }
            if (~arg5 != -1) {
                var12.method1135(arg5);
            }
            if (~arg4 != -1) {
                var12.method1145(arg4);
            }
            if (arg2 != 0) {
                var12.method1167(0, arg2, 0);
            }
            return var12;
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V", line = 273)
    public static void method2838(int arg0) {
        field6987 = null;
        field6982 = null;
        if (arg0 != -19122) {
            field6979 = null;
        }
        field6979 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II[III)V", line = 290)
    public static final void method2839(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        --arg1;
        ++field6977;
        int var6 = arg0 - 1;
        int var5 = var6 + -7;
        while (var5 > arg1) {
            int var7 = arg1 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var11 = var10 + 1;
            arg2[var11] = arg4;
            int var12 = var11 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg1 = var13 + 1;
            arg2[arg1] = arg4;
        }
        if (arg3 <= 59) {
            field6981 = false;
        }
        while (var6 > arg1) {
            ++arg1;
            arg2[arg1] = arg4;
        }
    }
}
