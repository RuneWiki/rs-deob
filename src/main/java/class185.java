import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public abstract class class185 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Loa;")
    public static class99 field3279 = class221.method1463(2844, ":duelstake:");

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static volatile int field3282 = 0;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "Loa;")
    public static class99 field3284 = class221.method1463(2844, "scrollbar");

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3281 = 0;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Loa;")
    public static class99 field3287 = class221.method1463(2844, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Loa;")
    public static class99 field3285 = class221.method1463(2844, ")4a=");

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lng;")
    public static class76 field3280 = new class76();

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ltg;")
    public static class182 field3277;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([BZ)V")
    public abstract void method1265(byte[] arg0, boolean arg1);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static final void method1266(int arg0) {
        if (arg0 != 32632) {
            field3282 = 29;
        }
        field3283++;
        if (class240.field4149 != null) {
            class247.method1597(true, class240.field4149);
            class240.field4149 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method1267(int arg0) {
        if (arg0 < -95) {
            class237.field4100.method1812(-84);
            field3289++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Lvd;")
    public static final class4 method1268(int arg0) {
        byte[] var1 = class181.field3151[0];
        if (arg0 != 255) {
            field3280 = null;
        }
        field3290++;
        int var2 = class223.field3885[0] * class193.field3395[0];
        class4 var6;
        if (class232.field3996[0]) {
            byte[] var3 = class272.field4798[0];
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class179.method1194(class173.field3062[class71.method502(var1[var5], 255)], class71.method502(var3[var5], 255) << 24);
            }
            var6 = new class45(class164.field2883, class88.field1520, class290.field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], var4);
        } else {
            int[] var7 = new int[var2];
            for (int var8 = 0; var8 < var2; var8++) {
                var7[var8] = class173.field3062[class71.method502(255, var1[var8])];
            }
            var6 = new class4(class164.field2883, class88.field1520, class290.field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], var7);
        }
        class24.method181(false);
        return var6;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)Z")
    public static final boolean method1269(int arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg1 < 42) {
            return false;
        }
        field3278++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class153 var3 = class247.method1601(26012, arg0);
        return var3.method1020((byte) 85, arg2);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1270(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3286++;
        if (arg2 < ~arg1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        class177.field3095 = (short) arg5;
        class118.field2094 = (short) arg1;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)[B")
    public abstract byte[] method1271(int arg0);

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "(I)V")
    public static void method1272(int arg0) {
        field3277 = null;
        field3280 = null;
        field3279 = null;
        field3285 = null;
        field3287 = null;
        field3284 = null;
        if (arg0 < 110) {
            method1270(false, -15, 60, 99, 58, 114);
        }
    }
}
