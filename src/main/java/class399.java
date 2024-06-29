import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class399 implements class20 {

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lfi;")
    public static class166 field5584 = new class166();

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[I")
    public static int[] field5585 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field5587 = new String[100];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field5581;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "[I")
    public static int[] field5586;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 10)
    public static void method2449(int arg0) {
        field5586 = null;
        if (arg0 <= 3) {
            method2450((byte) -28, (class391) null);
        }
        field5584 = null;
        field5585 = null;
        field5587 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[IIJ)Ljava/lang/String;", line = 25)
    public final String method271(int arg0, int[] arg1, int arg2, long arg3) {
        field5583++;
        if (arg0 == arg2) {
            class169 var6 = class321.method2029(arg1[0], -119);
            return var6.method1267(false, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class452 var7 = class234.method1569(2142, (int) arg3);
            return var7.field6595;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class321.method2029(arg1[0], 34).method1267(false, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLpe;)V", line = 56)
    public static final void method2450(byte arg0, class391 arg1) {
        field5582++;
        int var2 = class381.field5345;
        int var3 = class127.field1791;
        int var4 = class277.field3735;
        int var5 = class236.field3264;
        int var6 = -10660793;
        arg1.method2414(var3, var2, var5, true, var4, var6);
        arg1.method2414(var3 + 1, var2 + 1, 16, true, var4 - 2, -16777216);
        arg1.method2413(var2 + 1, arg0 ^ 0xFFFFC514, var3 + 18, -16777216, var5 - 19, var4 - 2);
        class96.field1387.method1314(var2 + 3, var6, class148.field2266, arg0 ^ 0x17, var3 + 14, -1);
        int var7 = class391.field5490;
        int var8 = class312.field4220;
        int var9 = 0;
        if (arg0 != 0) {
            return;
        }
        for (class63 var10 = (class63) class268.field3613.method1240((byte) -99); var10 != null; var10 = (class63) class268.field3613.method1245(1)) {
            int var11 = var3 + ((class415.field5808 - var9 - 1) * 16) + 31;
            short var12 = -1;
            if (var7 > var2 && var7 < (var2 + var4) && var11 - 13 < var8 && var8 < var11 + 3) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class416.method2574(true, var10.field966)) {
                var13 = class234.method1569(arg0 ^ 0x85E, (int) var10.field957).field6567;
            } else if (class335.method2118(var10.field966, arg0 ^ 0xFFFFC6F1)) {
                class127 var14 = class298.field4012[(int) var10.field957];
                if (var14 != null) {
                    var13 = var14.field1784.field164;
                }
            } else if (class352.method2228(true, var10.field966)) {
                if (var10.field966 == 1009) {
                    var13 = class10.method53((int) var10.field957, true).field5179;
                } else {
                    var13 = class10.method53((int) (var10.field957 >>> 32 & 0x7FFFFFFFL), true).field5179;
                }
            }
            String var15 = class374.method2340((byte) -116, var10);
            if (var13 != null) {
                var15 = var15 + class330.method2104(var13, (byte) -74);
            }
            class96.field1387.method1311(class258.field3483, var15, -94, var12, var11, var2 + 3, class53.field872, 0);
            var9++;
        }
        class198.method1400((byte) -60, class236.field3264, class277.field3735, class381.field5345, class127.field1791);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 136)
    public static final void method2451(int arg0) {
        class258.field3484.method2510(true);
        field5581++;
        class229.field3182 = arg0;
        class241.field3327 = null;
    }
}
