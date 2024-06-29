import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class295 extends class25 {

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public int field5082 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "[I")
    public int[] field5076 = new int[5];

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "[Log;")
    public class195[] field5090 = new class195[5];

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public int field5084;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public int field5087;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public int field5091;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public int field5094;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
    public static int[] field5067 = new int[50];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lcd;")
    public static class64 field5071 = class44.method335((byte) 71, "<col=ffff00>");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field5065;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public int field5075;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field5077;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public int field5080;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field5085;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public int field5088;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "Lrd;")
    public class162 field5092;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Luc;")
    public class180 field5083;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lvc;")
    public class181 field5074;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "Lpl;")
    public class184 field5079;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lli;")
    public static class209 field5068;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Lbd;")
    public class295 field5086;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Ltc;")
    public class37 field5095;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "Llm;")
    public class45 field5093;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "Z")
    public boolean field5078;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Z")
    public boolean field5081;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "Z")
    public boolean field5096;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "[[[I")
    public static int[][][] field5073;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 9)
    public static void method2060(int arg0) {
        if (arg0 <= -71) {
            field5071 = null;
            field5067 = null;
            field5068 = null;
            field5073 = (int[][][]) null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lqm;Z)I", line = 28)
    public static final int method2061(class222 arg0, boolean arg1) {
        field5065++;
        int var2 = 0;
        if (arg0.method1585(class32.field538, 1)) {
            var2++;
        }
        if (arg0.method1585(class151.field2692, 1)) {
            var2++;
        }
        if (arg0.method1585(class28.field451, 1)) {
            var2++;
        }
        if (arg0.method1585(class78.field1467, 1)) {
            var2++;
        }
        if (arg0.method1585(class169.field2948, 1)) {
            var2++;
        }
        if (arg0.method1585(class70.field1352, 1)) {
            var2++;
        }
        if (arg0.method1585(class304.field5204, 1)) {
            var2++;
        }
        if (arg0.method1585(class222.field3755, 1)) {
            var2++;
        }
        if (arg0.method1585(class7.field169, 1)) {
            var2++;
        }
        if (!arg1) {
            method2062(true);
        }
        if (arg0.method1585(class85.field1580, 1)) {
            var2++;
        }
        if (arg0.method1585(class233.field3937, 1)) {
            var2++;
        }
        if (arg0.method1585(class218.field3689, 1)) {
            var2++;
        }
        if (arg0.method1585(class236.field3984, 1)) {
            var2++;
        }
        if (arg0.method1585(class92.field1664, 1)) {
            var2++;
        }
        if (arg0.method1585(class31.field529, 1)) {
            var2++;
        }
        if (arg0.method1585(class200.field3427, 1)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 96)
    public static final void method2062(boolean arg0) {
        field5069++;
        if (!arg0) {
            class165.field2896.method1198(arg0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZBIII)V", line = 112)
    public static final void method2063(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5072++;
        class276.field4750 = 0L;
        if (arg1 < 65) {
            field5066 = -120;
        }
        int var5 = class97.method731(29983);
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        boolean var6 = false;
        if (class282.field4848.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        if (arg2 > 0 != var5 > 0) {
            var6 = true;
        }
        if (arg0 && arg2 > 0) {
            var6 = true;
        }
        class9.method80(arg4, arg0, arg2, arg3, false, var6, var5);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIBI)V", line = 149)
    public static final void method2064(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (class123.field2216) {
            int var8 = arg5 - 334;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 100) {
                var8 = 100;
            }
            int var9 = class92.field1720 + ((class121.field2182 - class92.field1720) * var8 / 100);
            arg7 = arg7 * var9 >> 8;
        }
        field5070++;
        int var10 = 2048 - arg2 & 0x7FF;
        int var11 = 2048 - arg3 & 0x7FF;
        if (arg6 != 47) {
            method2063(true, (byte) -9, 122, 22, 66);
        }
        int var12 = 0;
        int var13 = 0;
        int var14 = arg7;
        if (var10 != 0) {
            int var15 = class50.field826[var10];
            var12 = -arg7 * var15 >> 16;
            int var16 = class50.field820[var10];
            var14 = arg7 * var16 >> 16;
        }
        if (var11 != 0) {
            int var17 = class50.field826[var11];
            int var18 = class50.field820[var11];
            var13 = var14 * var17 >> 16;
            var14 = var14 * var18 >> 16;
        }
        class119.field2156 = arg1 - var14;
        class131.field2336 = arg2;
        class268.field4622 = arg0 - var12;
        class181.field3102 = arg3;
        class99.field1791 = arg4 - var13;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V", line = 214)
    public class295(int arg0, int arg1, int arg2) {
        this.field5087 = this.field5084 = arg0;
        this.field5091 = arg2;
        this.field5094 = arg1;
    }
}
