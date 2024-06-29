import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class106 extends class200 {

    @OriginalMember(owner = "client!c", name = "G", descriptor = "Z")
    public volatile boolean field1766 = true;

    @OriginalMember(owner = "client!c", name = "N", descriptor = "Loa;")
    public static class99 field1772 = class221.method1463(2844, " s(West d-Bconnect-B)3");

    @OriginalMember(owner = "client!c", name = "O", descriptor = "Lwk;")
    public static class273 field1773 = new class273(64);

    @OriginalMember(owner = "client!c", name = "Q", descriptor = "[I")
    public static int[] field1775 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!c", name = "R", descriptor = "[Lw;")
    public static class144[] field1776 = new class144[0];

    @OriginalMember(owner = "client!c", name = "S", descriptor = "Loa;")
    public static class99 field1777 = class221.method1463(2844, "p12_full");

    @OriginalMember(owner = "client!c", name = "J", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!c", name = "K", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!c", name = "M", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!c", name = "P", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!c", name = "H", descriptor = "Z")
    public boolean field1767;

    @OriginalMember(owner = "client!c", name = "L", descriptor = "Z")
    public boolean field1770;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)[B")
    public abstract byte[] method136(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIIII)V")
    public static final void method726(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class68.method453(arg2, arg3, arg2 + arg4, arg1 + arg3);
        class68.method465(arg2, arg3, arg4, arg1, 0);
        field1771++;
        if (class165.field2890 < 100) {
            return;
        }
        if (class130.field2268 == null || class130.field2268.field2458 != arg4 || class130.field2268.field2455 != arg1) {
            class4 var5 = new class4(arg4, arg1);
            class68.method467(var5.field35, arg4, arg1);
            class179.method1202(class218.field3794, class230.field3983, 0, arg4, 32390, 0, arg1, 0, 0);
            class130.field2268 = var5;
            class123.field2156.method105(31894);
        }
        if (arg0 > -91) {
            field1776 = null;
        }
        class130.field2268.method37(arg2, arg3);
        int var6 = class277.field4869 * arg4 / class218.field3794 + arg2;
        int var7 = class153.field2728 * arg1 / class230.field3983 + arg3;
        int var8 = class47.field793 * arg4 / class218.field3794;
        int var9 = class127.field2219 * arg1 / class230.field3983;
        class68.method455(var6, var7, var8, var9, 16711680, 128);
        class68.method447(var6, var7, var8, var9, 16711680);
        if (class97.field1628 <= 0 || class97.field1628 % 10 >= 5) {
            return;
        }
        for (class214 var10 = (class214) class144.field2537.method529(10); var10 != null; var10 = (class214) class144.field2537.method533(68)) {
            if (class240.field4146 == var10.field3714) {
                int var11 = var10.field3719 * arg1 / class230.field3983 + arg3;
                int var12 = arg2 + (var10.field3713 * arg4 / class218.field3794);
                class68.method465(var12 - 2, var11 - 2, 4, 4, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Loa;")
    public static final class99 method727(int arg0, int arg1) {
        field1769++;
        class99 var2 = class198.method1333(-126, arg0);
        for (int var3 = var2.method659(83) - 3; var3 > 0; var3 -= 3) {
            var2 = class198.method1332(arg1 + 30565, new class99[] { var2.method693(var3, arg1 + 30723, 0), class272.field4815, var2.method680((byte) -70, var3) });
        }
        if (arg1 != -30468) {
            return null;
        } else if (var2.method659(62) > 9) {
            return class198.method1332(arg1 ^ 0xFFFF88AF, new class99[] { class263.field4665, var2.method693(var2.method659(-102) - 8, arg1 + 30723, 0), class244.field4214, class100.field1712, var2, class67.field1131 });
        } else if (var2.method659(arg1 + 30405) > 6) {
            return class198.method1332(73, new class99[] { class267.field4708, var2.method693(var2.method659(113) - 4, 255, 0), class187.field3318, class100.field1712, var2, class67.field1131 });
        } else {
            return class198.method1332(arg1 + 30589, new class99[] { class254.field4400, var2, class69.field1145 });
        }
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(I)V")
    public static void method728(int arg0) {
        field1772 = null;
        field1775 = null;
        field1777 = null;
        field1776 = null;
        if (arg0 < -68) {
            field1773 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Lvd;")
    public static final class4 method729(byte arg0) {
        int var1 = class223.field3885[0] * class193.field3395[0];
        field1768++;
        int[] var2 = new int[var1];
        byte[] var3 = class181.field3151[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class173.field3062[class71.method502(var3[var4], 255)];
        }
        if (arg0 != -66) {
            method728(108);
        }
        class4 var5 = new class4(class164.field2883, class88.field1520, class290.field5082[0], class11.field94[0], class223.field3885[0], class193.field3395[0], var2);
        class24.method181(false);
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public static final void method730(int arg0) {
        field1774++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class173.field3057[var1] = true;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(I)I")
    public abstract int method133(int arg0);
}
