import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class223 {

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[J")
    public static long[] field3824 = new long[256];

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "[J")
    public static long[] field3829 = new long[32];

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field3832 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Z")
    public static boolean field3823 = false;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Leg;")
    private static class37 field3834 = class174.method1167("Allocated memory", -97);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "[I")
    public static int[] field3833 = new int[1000];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "Leg;")
    public static class37 field3831 = field3834;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Z")
    public static boolean field3835 = false;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "[Lpe;")
    public static class237[] field3836;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
    public static final void method1553(int arg0, int arg1, int arg2) {
        int var3 = -9 % ((-arg2 - 14) / 50);
        class274 var4 = class166.method1116(6, arg1, true);
        field3825++;
        var4.method1835(-23);
        var4.field4802 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        if (arg0 != -20) {
            field3835 = false;
        }
        field3833 = null;
        field3824 = null;
        field3834 = null;
        field3836 = null;
        field3831 = null;
        field3829 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILeg;)I")
    public static final int method1555(int arg0, class37 arg1) {
        field3830++;
        for (int var2 = 0; var2 < class71.field1124.length; var2++) {
            if (class71.field1124[var2].method256(true, arg1)) {
                return var2;
            }
        }
        if (arg0 != 30181) {
            field3833 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Lrc;")
    public static final class203 method1556(int arg0, int arg1) {
        class203 var2 = (class203) class168.field2813.method1411(-37, (long) arg0);
        field3827++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class237.field4083.method666(class227.method1580(true, arg0), class85.method565(arg1 ^ 0x85139A89, arg0), (byte) -51);
        class203 var4 = new class203();
        if (arg1 != -2062292415) {
            return null;
        }
        if (var3 != null) {
            var4.method1413(new class187(var3), (byte) 121);
        }
        class168.field2813.method1404((long) arg0, false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3826++;
        int var8 = class139.method975(class286.field5050, true, arg1, class96.field1507);
        int var9 = class139.method975(class286.field5050, true, arg0, class96.field1507);
        int var10 = class139.method975(class178.field2972, true, arg6, class217.field3741);
        int var11 = class139.method975(class178.field2972, true, arg3, class217.field3741);
        int var12 = class139.method975(class286.field5050, true, arg1 + arg2, class96.field1507);
        int var13 = class139.method975(class286.field5050, true, arg0 - arg2, class96.field1507);
        for (int var14 = var8; var14 < var12; var14++) {
            class145.method1010(var11, var10, -25086, arg4, class210.field3617[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class145.method1010(var11, var10, -25086, arg4, class210.field3617[var15]);
        }
        int var16 = class139.method975(class178.field2972, true, arg2 + arg6, class217.field3741);
        int var17 = class139.method975(class178.field2972, true, arg3 - arg2, class217.field3741);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class210.field3617[var18];
            class145.method1010(var16, var10, arg7 - 45659, arg4, var19);
            class145.method1010(var17, var16, -25086, arg5, var19);
            class145.method1010(var11, var17, -25086, arg4, var19);
        }
        if (arg7 != 20573) {
            method1558(-110);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static final void method1558(int arg0) {
        class19 var1 = class4.field71;
        synchronized (class4.field71) {
            class36.field532++;
            class247.field4439 = class200.field3404;
            if (class236.field4058 >= 0) {
                while (class260.field4604 != class236.field4058) {
                    int var3 = class121.field2038[class260.field4604];
                    class260.field4604 = class260.field4604 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class158.field2625[var3] = true;
                    } else {
                        class158.field2625[~var3] = false;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class158.field2625[var2] = false;
                }
                class236.field4058 = class260.field4604;
            }
            class200.field3404 = class282.field4996;
        }
        if (arg0 < 29) {
            field3833 = null;
        }
        field3828++;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3824[var0] = var1;
        }
        field3837 = 0;
    }
}
