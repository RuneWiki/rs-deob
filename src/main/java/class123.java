import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class123 extends class107 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Lvc;")
    public static class137 field2844 = class45.method325("@yel@", -46);

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field2851 = 1;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "Lvc;")
    private static class137 field2853 = class45.method325("To play on this world move to a free area first", -46);

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "Lvc;")
    public static class137 field2857 = class45.method325("mapmarker", -46);

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "Lvc;")
    public static class137 field2852 = class45.method325("(X100(U(Y", -46);

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "Lvc;")
    public static class137 field2864 = field2853;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field2859 = 0;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Lvc;")
    public static class137 field2860 = class45.method325("Menge eingeben:", -46);

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "Lvc;")
    private static class137 field2850 = class45.method325("Malformed login packet)3", -46);

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "Lvc;")
    public static class137 field2855 = field2850;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field2862;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "J")
    public static long field2863;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lta;")
    public class123 field2846;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "Lta;")
    public class123 field2861;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    public static final int method921(int arg0, int arg1) {
        field2847++;
        class10 var2 = class106.method767((byte) -102, arg0);
        if (arg1 < 98) {
            field2853 = null;
        }
        int var3 = var2.field214;
        int var4 = var2.field219;
        int var5 = var2.field209;
        int var6 = class63.field1344[var5 - var3];
        return class28.field631[var4] >> var3 & var6;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method922(int arg0) {
        field2844 = null;
        field2864 = null;
        if (arg0 != 22771) {
            field2857 = null;
        }
        field2853 = null;
        field2855 = null;
        field2857 = null;
        field2850 = null;
        field2852 = null;
        field2860 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final void method923(int arg0) {
        field2849++;
        if (this.field2861 == null) {
            return;
        }
        this.field2861.field2846 = this.field2846;
        this.field2846.field2861 = this.field2861;
        this.field2861 = null;
        this.field2846 = null;
        if (arg0 != 10) {
            method924((byte) 12);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static final void method924(byte arg0) {
        field2858++;
        class85.field2031.method763((byte) -127);
        int var1 = 98 / ((36 - arg0) / 60);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZI)Lvc;")
    public static final class137 method925(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 < 1 || arg3 > 36) {
            arg3 = 10;
        }
        field2854++;
        int var4 = 1;
        if (arg0 != -29965) {
            return null;
        }
        for (int var5 = arg1 / arg3; var5 != 0; var5 /= arg3) {
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg1 % arg3;
            arg1 /= arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class137 var9 = new class137();
        var9.field3176 = var7;
        var9.field3182 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static final void method926(boolean arg0) {
        if (!arg0) {
            field2851 = 5;
        }
        field2862++;
        class38.field842.method763((byte) -12);
        class4.field57.method763((byte) 26);
    }
}
