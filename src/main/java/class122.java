import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class122 extends class307 {

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "[I")
    public static int[] field2111 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ad", name = "B", descriptor = "Lqd;")
    public static class40 field2116 = class147.method1106("Fps:", (byte) -85);

    @OriginalMember(owner = "client!ad", name = "C", descriptor = "Lqd;")
    public static class40 field2117 = class147.method1106("Titelbild geladen)3", (byte) -59);

    @OriginalMember(owner = "client!ad", name = "J", descriptor = "Lqd;")
    public static class40 field2124 = class147.method1106(")4j", (byte) -47);

    @OriginalMember(owner = "client!ad", name = "y", descriptor = "Lrh;")
    public static class130 field2113 = class271.method1874(false);

    @OriginalMember(owner = "client!ad", name = "L", descriptor = "Lpl;")
    public static class186 field2126 = new class186(64);

    @OriginalMember(owner = "client!ad", name = "M", descriptor = "F")
    public static float field2127;

    @OriginalMember(owner = "client!ad", name = "z", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!ad", name = "D", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ad", name = "E", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ad", name = "G", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ad", name = "H", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "J")
    public long field2112;

    @OriginalMember(owner = "client!ad", name = "A", descriptor = "Lad;")
    public class122 field2115;

    @OriginalMember(owner = "client!ad", name = "I", descriptor = "Lad;")
    public class122 field2123;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V", line = 7)
    public final void method921(int arg0) {
        field2120++;
        if (this.field2115 == null) {
            return;
        }
        this.field2115.field2123 = this.field2123;
        this.field2123.field2115 = this.field2115;
        this.field2123 = null;
        this.field2115 = null;
        if (arg0 != 2) {
            field2126 = (class186) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lub;", line = 35)
    public static final class20 method922(int arg0, int arg1, int arg2) {
        class14 var3 = class93.field1690[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class20 var4 = var3.field225;
            var3.field225 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)[B", line = 47)
    public static final byte[] method923(int arg0, int arg1) {
        int var2 = -127 % ((-arg1 - 15) / 35);
        field2122++;
        class278 var3 = (class278) class233.field3821.method984(0, (long) arg0);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; var6++) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; var7 < 255; var7++) {
                int var8 = 255 - var7;
                int var9 = class110.method830((byte) -28, var5, var8);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[511 - var7] = var10;
            }
            var3 = new class278(var4);
            class233.field3821.method982(var3, (long) arg0, (byte) 79);
        }
        return var3.field4701;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lce;IBI)Lcm;", line = 109)
    public static final class185 method924(class239 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != -32) {
            field2117 = (class40) null;
        }
        field2125++;
        return class272.method1881(arg0, arg1, arg3, 929) ? class61.method511((byte) -81) : null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIB[B)Z", line = 128)
    public static final boolean method925(int arg0, int arg1, byte arg2, byte[] arg3) {
        field2121++;
        boolean var4 = true;
        class26 var5 = new class26(arg3);
        int var6 = 69 / ((64 - arg2) / 45);
        int var7 = -1;
        label69: while (true) {
            int var8 = var5.method199(false);
            if (var8 == 0) {
                return var4;
            }
            var7 += var8;
            boolean var9 = false;
            int var10 = 0;
            while (true) {
                int var14;
                class27 var17;
                do {
                    int var13;
                    int var16;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var18 = var5.method195((byte) 120);
                                        if (var18 == 0) {
                                            continue label69;
                                        }
                                        var5.method226(255);
                                    }
                                    int var11 = var5.method195((byte) 120);
                                    if (var11 == 0) {
                                        continue label69;
                                    }
                                    var10 += var11 - 1;
                                    int var12 = (var10 & 0xFC1) >> 6;
                                    var13 = arg0 + var12;
                                    var14 = var5.method226(255) >> 2;
                                    int var15 = var10 & 0x3F;
                                    var16 = var15 + arg1;
                                } while (var13 <= 0);
                            } while (var16 <= 0);
                        } while (var13 >= 103);
                    } while (var16 >= 103);
                    var17 = class72.method540(0, var7);
                } while (var14 == 22 && !class217.field3623 && var17.field573 == 0 && var17.field588 != 1 && !var17.field569);
                var9 = true;
                if (!var17.method256((byte) 124)) {
                    class160.field2676++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "(I)V", line = 209)
    public static void method926(int arg0) {
        field2117 = null;
        field2111 = null;
        field2113 = null;
        field2126 = null;
        field2124 = null;
        field2116 = null;
        if (arg0 < 73) {
            method927(-101, -5);
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V", line = 233)
    public static final void method927(int arg0, int arg1) {
        class14 var2 = class93.field1690[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class14 var4 = class93.field1690[var3][arg0][arg1] = class93.field1690[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field229--;
                for (int var5 = 0; var5 < var4.field216; var5++) {
                    class193 var6 = var4.field230[var5];
                    if ((var6.field3101 >> 29 & 0x3L) == 2L && var6.field3107 == arg0 && var6.field3108 == arg1) {
                        var6.field3104--;
                    }
                }
            }
        }
        if (class93.field1690[0][arg0][arg1] == null) {
            class93.field1690[0][arg0][arg1] = new class14(0, arg0, arg1);
        }
        class93.field1690[0][arg0][arg1].field238 = var2;
        class93.field1690[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lce;B)Z", line = 272)
    public static final boolean method928(class239 arg0, byte arg1) {
        field2114++;
        if (arg0.method1676(class228.field3773, -20034)) {
            return true;
        } else {
            if (arg1 != 80) {
                method927(12, 31);
            }
            return false;
        }
    }
}
