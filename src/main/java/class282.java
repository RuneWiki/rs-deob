import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class282 extends class242 {

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "[I")
    public static int[] field4838 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "Ljg;")
    public static class303 field4844 = new class303();

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Ljf;")
    public static class229 field4848 = class212.method1457((byte) 97, ")4a=");

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Ljf;")
    public static class229 field4847 = class212.method1457((byte) 82, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "Ljf;")
    public static class229 field4849 = class212.method1457((byte) 77, "Cabbage");

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "J")
    public long field4845;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lek;")
    public static class185 field4829;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lae;")
    public class282 field4832;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Lae;")
    public class282 field4837;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Z")
    public static boolean field4836;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "[I")
    public static int[] field4841;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "[Ltb;")
    public static class222[] field4835;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1976(int arg0, int arg1) {
        if (arg1 >= 86) {
            class107.field1868.method231((byte) 113, arg0);
            field4846++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lek;I)V", line = 22)
    public static final void method1977(class185 arg0, int arg1) {
        class144.field2523 = class225.method1549((byte) 69, arg0, class179.field3097);
        field4839++;
        class97.field1735 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class267.field4574[var2] & 0xFF0000) >> 16);
            int var4 = class267.field4574[var2 + 1] >> 16 & 0xFF;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class267.field4574[var2] >> 8 & 0xFF);
            int var7 = (class267.field4574[var2 + 1] & 0xFF00) >> 8;
            float var8 = ((float) var7 - var6) / 64.0F;
            float var9 = (float) (class267.field4574[var2] & 0xFF);
            int var10 = class267.field4574[var2 + 1] & 0xFF;
            float var11 = ((float) var10 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class97.field1735[var2 * 64 + var12] = class97.method665((int) var9, class97.method665((int) var3 << 16, (int) var6 << 8));
                var6 += var8;
                var9 += var11;
                var3 += var5;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class97.field1735[var13] = class267.field4574[3];
        }
        class294.field5025 = new int[32768];
        class110.field1943 = new int[32768];
        class191.method1309((class248) null, (byte) -96);
        if (arg1 < 43) {
            method1976(-25, -70);
        }
        class252.field4408 = new int[32768];
        class61.field1046 = new int[32768];
        if (class108.field1900) {
            class292.field4978 = new class92(128, 254);
        } else {
            class292.field4978 = new class159(128, 254);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZLoi;)V", line = 93)
    public static final void method1978(int arg0, boolean arg1, class321 arg2) {
        field4831++;
        int var3 = arg2.field5432;
        int var4 = (int) arg2.field4265;
        arg2.method1747((byte) -72);
        if (arg1) {
            class120.method852(var3, (byte) -126);
        }
        class158.method1062(false, var3);
        class67 var5 = class96.method662(var4, true);
        if (var5 != null) {
            class194.method1328((byte) -77, var5);
        }
        int var6 = class124.field2176;
        if (arg0 >= -97) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class315.method2137(true, class115.field2063[var7])) {
                class70.method521((byte) 85, var7);
            }
        }
        if (class124.field2176 == 1) {
            class61.field1044 = false;
            class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
        } else {
            class122.method872(class261.field4536, class240.field4229, class202.field3536, 0, class12.field142);
            int var8 = class44.field796.method947(class311.field5233);
            for (int var9 = 0; var9 < class124.field2176; var9++) {
                int var10 = class44.field796.method947(class26.method238(122, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class12.field142 = class124.field2176 * 15 + 22;
            class202.field3536 = var8 + 8;
        }
        if (class16.field263 != -1) {
            class22.method206(28699, class16.field263, 1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 162)
    public static void method1979(int arg0) {
        field4841 = null;
        field4847 = null;
        field4838 = null;
        field4849 = null;
        field4848 = null;
        field4835 = null;
        field4844 = null;
        if (arg0 == 32768) {
            field4829 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILjf;)V", line = 187)
    public static final void method1980(byte arg0, int arg1, class229 arg2) {
        class84.field1608.method1397(246, 0);
        if (arg0 > -98) {
            method1987(-119, (byte) -17, -6);
        }
        field4828++;
        class191.field3310++;
        class84.field1608.method118(arg2.method1617(83), (byte) -128);
        class84.field1608.method85(255, arg1);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)Z", line = 203)
    public final boolean method1981(int arg0) {
        field4840++;
        if (this.field4832 == null) {
            return false;
        } else if (arg0 == 127) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljf;I)Le;", line = 218)
    public static final class161 method1982(class229 arg0, int arg1) {
        if (arg1 != 1) {
            return (class161) null;
        }
        field4834++;
        for (class161 var2 = (class161) class157.field2687.method2078(arg1 ^ 0xFFFFFF94); var2 != null; var2 = (class161) class157.field2687.method2080(5)) {
            if (var2.field2723.method1641((byte) -64, arg0)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Lwc;", line = 250)
    public static final class104 method1983(int arg0, int arg1, int arg2) {
        class125 var3 = class312.field5246[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2201; var4++) {
            class104 var5 = var3.field2204[var4];
            if ((var5.field1814 >> 29 & 0x3L) == 2L && var5.field1800 == arg1 && var5.field1791 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIII)I", line = 274)
    public static final int method1984(byte arg0, int arg1, int arg2, int arg3) {
        field4826++;
        if (class132.field2328 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (arg0 >= -68) {
            method1980((byte) 112, -16, (class229) null);
        }
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg3;
        if (arg3 < 3 && (class142.field2464[1][var4][var5] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = arg1 & 0x7F;
        int var9 = (128 - var6) * class132.field2328[var7][var4][var5] + class132.field2328[var7][var4 + 1][var5] * var6 >> 7;
        int var10 = (128 - var6) * class132.field2328[var7][var4][var5 + 1] + class132.field2328[var7][var4 + 1][var5 + 1] * var6 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([SB)[S", line = 311)
    public static final short[] method1985(short[] arg0, byte arg1) {
        field4833++;
        int var2 = -70 / ((arg1 - 50) / 50);
        if (arg0 == null) {
            return null;
        } else {
            short[] var3 = new short[arg0.length];
            class36.method322(arg0, 0, var3, 0, arg0.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 329)
    public final void method1986(byte arg0) {
        field4843++;
        if (this.field4832 == null) {
            return;
        }
        this.field4832.field4837 = this.field4837;
        this.field4837.field4832 = this.field4832;
        this.field4832 = null;
        if (arg0 != 86) {
            field4829 = (class185) null;
        }
        this.field4837 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)Le;", line = 355)
    public static final class161 method1987(int arg0, byte arg1, int arg2) {
        field4842++;
        if (arg1 > -14) {
            return (class161) null;
        }
        for (class161 var3 = (class161) class157.field2687.method2078(-119); var3 != null; var3 = (class161) class157.field2687.method2080(5)) {
            if (var3.field2722 && var3.method1082(-82, arg2, arg0)) {
                return var3;
            }
        }
        return null;
    }
}
