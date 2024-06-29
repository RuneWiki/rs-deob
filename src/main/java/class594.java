import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class594 {

    @OriginalMember(owner = "client!or", name = "a", descriptor = "Lrg;")
    public static class596 field8308 = new class596(11, 2);

    @OriginalMember(owner = "client!or", name = "b", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!or", name = "d", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!or", name = "e", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!or", name = "f", descriptor = "Ljava/lang/String;")
    public static String field8313;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I[Ljava/lang/String;I[SI)V", line = 3)
    public static final void method3358(int arg0, String[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg0 != 65535) {
            field8308 = null;
        }
        field8311++;
        if (arg4 >= arg2) {
            return;
        }
        int var5 = (arg2 + arg4) / 2;
        int var6 = arg4;
        String var7 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var7;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var8;
        for (int var9 = arg4; var9 < arg2; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].compareTo(var7) < (var9 & 0x1)) {
                String var10 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg1[arg2] = arg1[var6];
        arg1[var6] = var7;
        arg3[arg2] = arg3[var6];
        arg3[var6] = var8;
        method3358(65535, arg1, var6 - 1, arg3, arg4);
        method3358(65535, arg1, arg2, arg3, var6 + 1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)V", line = 57)
    public static final void method3359(int arg0) {
        for (int var1 = arg0; var1 < class562.field7587; var1++) {
            int var2 = class85.field1255[var1];
            class61 var3 = ((class393) class299.field4071.method970((byte) 89, (long) var2)).field5552;
            int var4 = class660.field9184.method2874((byte) -75);
            if ((var4 & 0x40) != 0) {
                var4 += class660.field9184.method2874((byte) -75) << 8;
            }
            if ((var4 & 0x1000) != 0) {
                int var5 = class660.field9184.method2846((byte) -69);
                var3.field1767 = class660.field9184.method2831(true);
                var3.field1708 = class660.field9184.method2843(arg0 ^ 0x1DA8);
                var3.field1754 = (var5 & 0x8000) != 0;
                var3.field1727 = var5 & 0x7FFF;
                var3.field1713 = class186.field2697 + var3.field1767 + var3.field1727;
            }
            if ((var4 & 0x800) != 0) {
                int var6 = class660.field9184.method2831(true);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                for (int var10 = 0; var10 < var6; var10++) {
                    int var11 = class660.field9184.method2846((byte) -69);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    var7[var10] = var11;
                    var8[var10] = class660.field9184.method2843(7592);
                    var9[var10] = class660.field9184.method2845(-1);
                }
                class525.method2994(var3, var7, false, var9, var8);
            }
            if ((var4 & 0x4000) != 0) {
                int var12 = class660.field9184.method2845(arg0 - 1);
                int var13 = class660.field9184.method2828((byte) 36);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var14 = class660.field9184.method2838((byte) -2);
                var3.method882(var12, var14, (byte) -22, var13, true);
            }
            if ((var4 & 0x2) != 0) {
                int var15 = class660.field9184.method2846((byte) -69);
                int var16 = class660.field9184.method2815(0);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var17 = class660.field9184.method2831(true);
                var3.method882(var15, var17, (byte) -22, var16, false);
            }
            if ((var4 & 0x80) != 0) {
                var3.field677 = class660.field9184.method2816(0);
                var3.field686 = class660.field9184.method2867(arg0 - 2);
            }
            if ((var4 & 0x400) != 0) {
                int var18 = class660.field9184.method2871((byte) -87);
                int var19 = class660.field9184.method2838((byte) -2);
                var3.method891(var18, var19, class186.field2697, -50);
            }
            if ((var4 & 0x2000) != 0) {
                var3.field1734 = class660.field9184.method2863(103);
                var3.field1752 = class660.field9184.method2876((byte) -107);
                var3.field1733 = class660.field9184.method2876((byte) -122);
                var3.field1788 = class660.field9184.method2863(arg0 + 100);
                var3.field1770 = class660.field9184.method2867(-2) + class186.field2697;
                var3.field1751 = class660.field9184.method2846((byte) -69) + class186.field2697;
                var3.field1732 = class660.field9184.method2831(true);
                var3.field1752 += var3.field1801[0];
                var3.field1788 += var3.field1801[0];
                var3.field1734 += var3.field1807[0];
                var3.field1797 = 1;
                var3.field1733 += var3.field1807[0];
                var3.field1802 = 0;
            }
            if ((var4 & 0x10) != 0) {
                var3.field1709 = class660.field9184.method2851((byte) -71);
                var3.field1755 = 100;
            }
            if ((var4 & 0x200) != 0) {
                int var20 = class660.field9184.method2838((byte) -2);
                int[] var21 = new int[var20];
                int[] var22 = new int[var20];
                for (int var23 = 0; var23 < var20; var23++) {
                    int var24 = class660.field9184.method2846((byte) -69);
                    if ((var24 & 0xC000) == 49152) {
                        int var25 = class660.field9184.method2845(-1);
                        var21[var23] = class647.method3617(var25, var24 << 16);
                    } else {
                        var21[var23] = var24;
                    }
                    var22[var23] = class660.field9184.method2867(-2);
                }
                var3.method898(var21, arg0 - 91, var22);
            }
            if ((var4 & 0x4) != 0) {
                int[] var26 = new int[4];
                for (int var27 = 0; var27 < 4; var27++) {
                    var26[var27] = class660.field9184.method2816(0);
                    if (var26[var27] == 65535) {
                        var26[var27] = -1;
                    }
                }
                int var28 = class660.field9184.method2831(true);
                class6.method19(var26, var3, var28, arg0 + 3814);
            }
            if ((var4 & 0x100) != 0) {
                var3.field1775 = class660.field9184.method2863(109);
                var3.field1743 = class660.field9184.method2870((byte) 50);
                var3.field1736 = class660.field9184.method2870((byte) 55);
                var3.field1720 = (byte) class660.field9184.method2843(7592);
                var3.field1777 = class186.field2697 + class660.field9184.method2816(0);
                var3.field1789 = class186.field2697 + class660.field9184.method2846((byte) -69);
            }
            if ((var4 & 0x1) != 0) {
                var3.field1701 = class660.field9184.method2867(-2);
                if (var3.field1701 == 65535) {
                    var3.field1701 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var29 = class660.field9184.method2871((byte) -87);
                int var30 = class660.field9184.method2874((byte) -75);
                var3.method891(var29, var30, class186.field2697, -17);
                var3.field1712 = class186.field2697 + 300;
                var3.field1705 = class660.field9184.method2831(true);
            }
            if ((var4 & 0x8) != 0) {
                if (var3.field674.method3247(false)) {
                    class8.method33(var3, 87);
                }
                var3.method500(class347.field4640.method2584(class660.field9184.method2816(0), 1), arg0 ^ 0xFFFFC741);
                var3.method892(90, var3.field674.field8041);
                var3.field1748 = var3.field674.field8075 << 3;
                if (var3.field674.method3247(false)) {
                    class7.method22(null, var3.field1807[0], null, var3, var3.field1801[0], 0, 93, var3.field4053);
                }
            }
        }
        field8309++;
    }

    @OriginalMember(owner = "client!or", name = "toString", descriptor = "()Ljava/lang/String;", line = 304)
    public final String toString() {
        field8310++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)V", line = 312)
    public static void method3360(byte arg0) {
        field8308 = null;
        field8313 = null;
        if (arg0 >= -61) {
            method3359(-91);
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(BII)I", line = 326)
    public final int method3361(byte arg0, int arg1, int arg2) {
        field8312++;
        int var4 = class222.field3096 <= arg2 ? arg2 : class222.field3096;
        if (arg0 >= -104) {
            return -85;
        } else if (class364.field4828 == this) {
            return 0;
        } else if (class16.field167 == this) {
            return var4 - arg1;
        } else if (class422.field5945 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }
}
