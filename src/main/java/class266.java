import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class266 extends class220 {

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
    public static boolean field4606 = false;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lmh;")
    public static class128 field4609 = class22.method156(126, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Lmh;")
    public static class128 field4607 = class22.method156(126, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Lmh;")
    public static class128 field4617 = class22.method156(125, "m");

    @OriginalMember(owner = "client!re", name = "W", descriptor = "Lem;")
    public static class10 field4621 = null;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field4623 = 0;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public int field4604;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "I")
    public int field4614;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public int field4619;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lmh;")
    public class128 field4615;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "[I")
    public static int[] field4603;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "[I")
    public int[] field4610;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "[I")
    public int[] field4618;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "[Loe;")
    public class120[] field4620;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[Lmh;")
    public class128[] field4608;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "[Lpm;")
    public static class96[] field4612;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V", line = 24)
    public static void method1860(int arg0) {
        field4612 = null;
        if (arg0 != -31829) {
            field4613 = -5;
        }
        field4621 = null;
        field4617 = null;
        field4607 = null;
        field4603 = null;
        field4609 = null;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V", line = 50)
    public static final void method1861(int arg0) {
        while (true) {
            if (class54.field1051.method572(class102.field1749, (byte) -31) >= 27) {
                int var1 = class54.field1051.method564((byte) -98, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class201.field3560[var1] == null) {
                        var2 = true;
                        class201.field3560[var1] = new class115();
                    }
                    class115 var3 = class201.field3560[var1];
                    class39.field839[class37.field749++] = var1;
                    var3.field477 = class293.field5011;
                    if (var3.field1934 != null && var3.field1934.method1435((byte) 118)) {
                        class302.method2055(var3, -1);
                    }
                    int var4 = class54.field1051.method564((byte) -90, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class54.field1051.method564((byte) -109, 1);
                    int var6 = class54.field1051.method564((byte) -76, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class56.field1084[class54.field1051.method564((byte) -97, 3)];
                    if (var2) {
                        var3.field476 = var3.field460 = var7;
                    }
                    int var8 = class54.field1051.method564((byte) -110, 1);
                    if (var8 == 1) {
                        class158.field2715[class314.field5335++] = var1;
                    }
                    var3.field1934 = class203.method1411(false, class54.field1051.method564((byte) -84, 14));
                    var3.method126(-118, var3.field1934.field3706);
                    var3.field481 = var3.field1934.field3705;
                    var3.field446 = var3.field1934.field3651;
                    var3.field455 = var3.field1934.field3647;
                    var3.field482 = var3.field1934.field3639;
                    var3.field439 = var3.field1934.field3697;
                    var3.field443 = var3.field1934.field3680;
                    if (var3.field446 == 0) {
                        var3.field460 = 0;
                    }
                    var3.field425 = var3.field1934.field3700;
                    var3.field467 = var3.field1934.field3674;
                    var3.method127(var3.method118(-1), 0, class163.field2796.field422[0] + var6, var5 == 1, class163.field2796.field450[0] + var4);
                    if (var3.field1934.method1435((byte) 115)) {
                        class267.method1864(var3.field450[0], (class38) null, 0, (class123) null, var3, arg0 ^ 0x1, class133.field2315, var3.field422[0]);
                    }
                    continue;
                }
            }
            class54.field1051.method562(0);
            if (arg0 != 1) {
                field4606 = false;
            }
            field4616++;
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)I", line = 148)
    public static final int method1862(int arg0, int arg1) {
        if (arg1 != -1) {
            method1863(-105, 59);
        }
        int var2 = arg0 & 0x3F;
        field4605++;
        int var3 = (arg0 & 0xC9) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)V", line = 211)
    public static final void method1863(int arg0, int arg1) {
        class117.field1981 = new int[arg1];
        class242.field4143 = new int[arg1];
        class236.field4046 = new int[arg1];
        if (arg0 >= -100) {
            method1863(40, 33);
        }
        class248.field4276 = new int[arg1];
        class151.field2608 = new int[arg1];
        field4611++;
    }
}
