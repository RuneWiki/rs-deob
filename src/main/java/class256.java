import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class256 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4533 = 0;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "Leg;")
    public static class37 field4547 = class174.method1167("Liste der Welten geladen", -93);

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Leg;")
    public static class37 field4548 = class174.method1167("<)4col> x", 102);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public int field4531;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field4536;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field4538;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field4539;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public int field4540;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public int field4542;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field4545;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field4546;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field4549;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public int field4550;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public int field4554;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method1743(int arg0) {
        field4547 = null;
        field4548 = null;
        if (arg0 <= 116) {
            method1743(117);
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        if (class10.field166 < 128) {
            class10.field166 = 128;
        }
        if (arg0 != 19044) {
            return;
        }
        class25.field355 &= 0x7FF;
        int var1 = class265.field4658 >> 7;
        int var2 = class72.field1134 >> 7;
        field4530++;
        if (class10.field166 > 383) {
            class10.field166 = 383;
        }
        int var3 = 0;
        int var4 = class262.method1768(class237.field4140, class72.field1134, class265.field4658, (byte) -117);
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= (var2 + 4); var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class237.field4140;
                    if (var7 < 3 && (class241.field4312[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 + ((class19.field257[var7][var5][var6] & 0xFF) * 8) - class218.field3754[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class69.field1096 < var9) {
            class69.field1096 += (var9 - class69.field1096) / 24;
        } else if (class69.field1096 > var9) {
            class69.field1096 += (var9 - class69.field1096) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZ)V")
    public static final void method1745(int arg0, boolean arg1) {
        class108.field1715 = new int[104];
        field4541++;
        class191.field3287 = new int[104];
        class109.field1778 = new int[104];
        class222.field3820 = new int[104];
        class61.field1004 = new int[104];
        class271.field4758 = 99;
        if (arg0 >= -90) {
            method1745(-62, true);
        }
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class228.field3925 = new int[var2][105][105];
        client.field1894 = new byte[var2][104][104];
        class265.field4657 = new byte[var2][104][104];
        class174.field2910 = new byte[var2][104][104];
        class30.field432 = new byte[var2][104][104];
        class10.field173 = new byte[var2][105][105];
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lod;ZB)V")
    public static final void method1746(class190 arg0, boolean arg1, byte arg2) {
        field4544++;
        int var3 = arg0.field3259;
        int var4 = (int) arg0.field1027;
        arg0.method441(arg2 ^ 0xFFF14D);
        if (arg1) {
            class130.method923(true, var3);
        }
        class75.method503(-84, var3);
        class237 var5 = class156.method1066(-66, var4);
        if (var5 != null) {
            class121.method856(24665, var5);
        }
        if (arg2 != 76) {
            return;
        }
        int var6 = class159.field2661;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class191.method1321(class264.field4642[var7], -7129)) {
                class27.method157(var7, (byte) -30);
            }
        }
        if (class159.field2661 == 1) {
            class152.field2556 = false;
            class171.method1151(class62.field1011, class137.field2348, class160.field2676, -30822, class146.field2482);
        } else {
            class171.method1151(class62.field1011, class137.field2348, class160.field2676, -30822, class146.field2482);
            int var8 = class180.field3002.method1211(class131.field2192);
            for (int var9 = 0; var9 < class159.field2661; var9++) {
                int var10 = class180.field3002.method1211(class132.method945(var9, arg2 + 18));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class146.field2482 = class159.field2661 * 15 + 22;
            class137.field2348 = var8 + 8;
        }
        if (class234.field4044 != -1) {
            class175.method1175(-499336730, class234.field4044, 1);
        }
    }
}
