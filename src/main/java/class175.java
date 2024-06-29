import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class175 implements class17 {

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lgh;")
    public static class106 field2912 = new class106(5000);

    @OriginalMember(owner = "client!t", name = "e", descriptor = "[I")
    public static int[] field2915 = new int[200];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public static void method1115(int arg0) {
        field2912 = null;
        int var1 = -98 / ((17 - arg0) / 44);
        field2915 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILn;)V")
    public static final void method1116(int arg0, class138 arg1) {
        if (arg0 != 0) {
            method1115(56);
        }
        field2913++;
        class88.field1530 = arg1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(II)V")
    public static final void method1117(int arg0, int arg1) {
        field2914++;
        class258.field4507 += arg1 * 128;
        if (class226.field3899.length < class258.field4507) {
            class258.field4507 -= class226.field3899.length;
            int var2 = (int) (Math.random() * 12.0D);
            class25.method124(class152.field2639[var2], arg0);
        }
        short var3 = 256;
        int var4 = arg1 * 128;
        int var5 = 0;
        int var6 = (var3 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var26 = class142.field2448[var5 + var4] - (class226.field3899[class258.field4507 + var5 & class226.field3899.length + -1] * arg1 / 6);
            if (var26 < 0) {
                var26 = 0;
            }
            class142.field2448[var5++] = var26;
        }
        for (int var8 = var3 - arg1; var8 < var3; var8++) {
            int var23 = var8 * 128;
            for (int var24 = 0; var24 < 128; var24++) {
                int var25 = (int) (Math.random() * 100.0D);
                if (var25 < 50 && var24 > 10 && var24 < 118) {
                    class142.field2448[var23 + var24] = 255;
                } else {
                    class142.field2448[var24 + var23] = 0;
                }
            }
        }
        for (int var9 = 0; var9 < (var3 - arg1); var9++) {
            class243.field4214[var9] = class243.field4214[arg1 + var9];
        }
        for (int var10 = var3 - arg1; var10 < var3; var10++) {
            class243.field4214[var10] = (int) (Math.sin((double) class173.field2896 / 14.0D) * 16.0D + Math.sin((double) class173.field2896 / 15.0D) * 14.0D + Math.sin((double) class173.field2896 / 16.0D) * 12.0D);
            class173.field2896++;
        }
        class5.field119 += arg1;
        int var11 = ((class253.field4393 & 0x1) + arg1) / 2;
        if (arg0 <= ~var11) {
            return;
        }
        for (int var12 = 0; var12 < class5.field119; var12++) {
            int var21 = (int) (Math.random() * 124.0D) + 2;
            int var22 = (int) (Math.random() * 128.0D) + 128;
            class142.field2448[(var22 << 7) + var21] = 192;
        }
        class5.field119 = 0;
        for (int var13 = 0; var13 < var3; var13++) {
            int var18 = var13 * 128;
            int var19 = 0;
            for (int var20 = -var11; var20 < 128; var20++) {
                if (var11 + var20 < 128) {
                    var19 += class142.field2448[var11 + var20 + var18];
                }
                if ((-var11 - (1 - var20)) >= 0) {
                    var19 -= class142.field2448[var20 - (var11 + 1 - var18)];
                }
                if (var20 >= 0) {
                    class256.field4489[var18 + var20] = var19 / (var11 * 2 + 1);
                }
            }
        }
        for (int var14 = 0; var14 < 128; var14++) {
            int var15 = 0;
            for (int var16 = -var11; var16 < var3; var16++) {
                int var17 = var16 * 128;
                if (var3 > (var11 + var16)) {
                    var15 += class256.field4489[var11 * 128 + var17 + var14];
                }
                if (-(var11 - var16) - 1 >= 0) {
                    var15 -= class256.field4489[var14 + var17 - (var11 * 128) - 128];
                }
                if (var16 >= 0) {
                    class142.field2448[var14 + var17] = var15 / (var11 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Z")
    public static final boolean method1118(int arg0) {
        field2916++;
        if (class171.field2856 != 0) {
            try {
                if ((Boolean) class54.field948.method1499(104, class61.field1123.field4153)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == 4205;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JI[IB)Lub;")
    public final class227 method82(long arg0, int arg1, int[] arg2, byte arg3) {
        field2919++;
        if (arg1 == 0) {
            class14 var6 = class142.method898(arg3 - 1, arg2[0]);
            return var6.method70((int) arg0, -3);
        } else if (arg1 == 1 || arg1 == 10) {
            class178 var7 = class133.method815((int) arg0, (byte) -70);
            return var7.field3048;
        } else if (arg1 == 6 || arg1 == 7) {
            return class142.method898(arg3 + 174, arg2[0]).method70((int) arg0, arg3 + 47);
        } else {
            if (arg3 != -50) {
                field2912 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(II)Lqj;")
    public static final class152 method1119(int arg0, int arg1) {
        field2920++;
        class152 var2 = (class152) class142.field2441.method1735((long) arg1, (byte) -69);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 128) {
            byte[] var3 = class201.field3453.method884(class238.method1583(arg0 + 895, arg1), 101, class179.method1150((byte) 93, arg1));
            class152 var4 = new class152();
            if (var3 != null) {
                var4.method958(new class226(var3), 0);
            }
            class142.field2441.method1730(var4, (long) arg1, (byte) -79);
            return var4;
        } else {
            return null;
        }
    }
}
