import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class100 {

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lcm;")
    public static class434 field1380 = new class434();

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lwd;")
    public static class149 field1383 = new class149();

    @OriginalMember(owner = "client!c", name = "h", descriptor = "[S")
    public static short[] field1386 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lnq;")
    public static class268 field1384;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)I")
    public static final int method716(int arg0) {
        field1381++;
        if (class114.field1638) {
            return 0;
        } else if (arg0 != -30150) {
            return 89;
        } else if (class51.method428(-1)) {
            return class61.field845 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method717(boolean arg0) {
        field1380 = null;
        field1384 = null;
        field1383 = null;
        if (arg0) {
            field1386 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;BLnq;)Luh;")
    public static final class92 method718(boolean arg0, String arg1, byte arg2, class268 arg3) {
        field1379++;
        int var4 = arg3.method1751(86, arg1);
        if (var4 == -1) {
            return new class92(0);
        }
        int[] var5 = arg3.method1750((byte) -127, var4);
        class92 var6 = new class92(var5.length);
        int var7 = 0;
        if (arg2 != 33) {
            method719(false, -101);
        }
        int var8 = 0;
        while (true) {
            while (var6.field1285 > var7) {
                class11 var9 = new class11(arg3.method1745(var5[var8++], (byte) 24, var4));
                int var10 = var9.method185(25239);
                int var11 = var9.method174(arg2 ^ 0xDE);
                int var12 = var9.method172((byte) 52);
                if (!arg0 && var12 == 1) {
                    var6.field1285--;
                } else {
                    var6.field1286[var7] = var10;
                    var6.field1284[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)I")
    public static final int method719(boolean arg0, int arg1) {
        if (!arg0) {
            method719(false, -112);
        }
        field1385++;
        if (class156.field2207 != null) {
            class156.field2207.method2210(-2);
            class156.field2207 = null;
        }
        class268.field3723++;
        if (class268.field3723 > 4) {
            class268.field3723 = 0;
            class39.field573 = 0;
            return arg1;
        }
        class39.field573 = 0;
        if (class292.field4094 == class129.field1811) {
            class129.field1811 = class178.field2446;
        } else {
            class129.field1811 = class292.field4094;
        }
        return -1;
    }
}
