import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class216 {

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[C")
    public static char[] field3355 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "Lao;")
    public static class194 field3357;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "[I")
    public static int[] field3361;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lpk;Lpk;ILpk;)V", line = 13)
    public static final void method1562(class120 arg0, class120 arg1, int arg2, class120 arg3) {
        class12.field265 = arg0;
        class58.field874 = arg1;
        if (arg2 >= -41) {
            field3359 = 71;
        }
        class34.field511 = arg3;
        field3363++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Ljava/lang/String;BZ)V", line = 28)
    public static final void method1563(String arg0, byte arg1, boolean arg2) {
        if (arg1 != 41) {
            method1565((class1) null, 55);
        }
        int var3 = arg2 ? 32768 : 0;
        field3362++;
        String var4 = arg0.toLowerCase();
        short[] var5 = new short[16];
        int var6 = var3 + (arg2 ? class291.field4563 : class328.field5137);
        int var7 = 0;
        for (int var8 = var3; var8 < var6; var8++) {
            class326 var9 = class63.method502(-32769, var8);
            if (var9.field5102 && var9.method2290(true).toLowerCase().indexOf(var4) != -1) {
                if (var7 >= 50) {
                    class332.field5183 = null;
                    class36.field531 = -1;
                    return;
                }
                if (var7 >= var5.length) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var7; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var7++] = (short) var8;
            }
        }
        class36.field531 = var7;
        class105.field1732 = 0;
        class332.field5183 = var5;
        String[] var12 = new String[class36.field531];
        for (int var13 = 0; var13 < class36.field531; var13++) {
            var12[var13] = class63.method502(-32769, var5[var13]).method2290(true);
        }
        class272.method1944((byte) 21, var12, class332.field5183);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 99)
    public static void method1564(int arg0) {
        field3357 = null;
        field3361 = null;
        field3355 = null;
        if (arg0 >= -78) {
            field3357 = (class194) null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Laj;I)V", line = 125)
    public static final void method1565(class1 arg0, int arg1) {
        int var2 = arg0.method63(127);
        class104.field1715 = new class161[var2];
        for (int var3 = arg1; var3 < var2; var3++) {
            class104.field1715[var3] = new class161();
            class104.field1715[var3].field2610 = arg0.method63(127);
            class104.field1715[var3].field2613 = arg0.method45((byte) -123);
        }
        class151.field2470 = arg0.method63(127);
        class135.field2140 = arg0.method63(127);
        class233.field3547 = arg0.method63(127);
        class204.field3177 = new class44[class135.field2140 + 1 - class151.field2470];
        for (int var4 = 0; var4 < class233.field3547; var4++) {
            int var5 = arg0.method63(127);
            class44 var6 = class204.field3177[var5] = new class44();
            var6.field2836 = arg0.method15((byte) -81);
            var6.field2830 = arg0.method33(false);
            var6.field691 = class151.field2470 + var5;
            var6.field695 = arg0.method45((byte) -120);
            var6.field693 = arg0.method45((byte) -122);
        }
        class84.field1336 = arg0.method33(false);
        field3358++;
        class53.field812 = true;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)V", line = 169)
    public static final void method1566(int arg0, int arg1, int arg2, int arg3) {
        class42 var4 = class34.field521[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class293 var5 = var4.field666;
        if (var5 != null) {
            var5.field4601 = var5.field4601 * arg3 / 16;
            var5.field4592 = var5.field4592 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)Lkl;", line = 186)
    public static final class141 method1567(byte arg0, int arg1) {
        field3360++;
        class141 var2 = (class141) class170.field2731.method2288((long) arg1, (byte) 127);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class31.field489.method967(1, arg1, arg0 + 65323);
        if (arg0 != -43) {
            field3356 = -85;
        }
        class141 var4 = new class141();
        if (var3 != null) {
            var4.method1087(new class1(var3), 255, arg1);
        }
        class170.field2731.method2281(0, (long) arg1, var4);
        return var4;
    }
}
