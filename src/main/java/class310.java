import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class310 extends class197 {

    @OriginalMember(owner = "client!rj", name = "O", descriptor = "Loh;")
    public static class258 field5247 = class153.method1046("m-Ochte mit Ihnen handeln)3", 121);

    @OriginalMember(owner = "client!rj", name = "S", descriptor = "I")
    public static int field5251 = 0;

    @OriginalMember(owner = "client!rj", name = "T", descriptor = "I")
    public static int field5252 = 0;

    @OriginalMember(owner = "client!rj", name = "ab", descriptor = "I")
    public static int field5259 = 0;

    @OriginalMember(owner = "client!rj", name = "V", descriptor = "F")
    public static float field5254;

    @OriginalMember(owner = "client!rj", name = "M", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!rj", name = "N", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!rj", name = "Q", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!rj", name = "R", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!rj", name = "U", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!rj", name = "Y", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!rj", name = "Z", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!rj", name = "W", descriptor = "Lgb;")
    public static class213 field5255;

    @OriginalMember(owner = "client!rj", name = "P", descriptor = "Lni;")
    public static class55 field5248;

    @OriginalMember(owner = "client!rj", name = "X", descriptor = "[Lmg;")
    public static class105[] field5256;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)[[I", line = 12)
    public final int[][] method101(int arg0, byte arg1) {
        field5246++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        if (this.field3461.field4765) {
            int[][] var4 = this.method1322(0, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class190.field3362; var11++) {
                var7[var11] = 4096 - var8[var11];
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        int var12 = -88 / ((arg1 - 1) / 37);
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 59)
    public static void method2153(int arg0) {
        field5256 = null;
        field5255 = null;
        field5248 = null;
        field5247 = null;
        if (arg0 < 94) {
            field5248 = (class55) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IB)Lmc;", line = 74)
    public static final class148 method2154(int arg0, byte arg1) {
        field5258++;
        class148 var2 = (class148) class55.field862.method701((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2628.method1453(arg0, (byte) -79, 0);
        if (var3 == null) {
            return null;
        }
        class148 var4 = new class148();
        class235 var5 = new class235(var3);
        var5.field4051 = var5.field4066.length - 2;
        int var6 = var5.method1615(-124);
        int var7 = var5.field4066.length - var6 - 2 - 12;
        var5.field4051 = var7;
        int var8 = var5.method1611(-105);
        var4.field2520 = var5.method1615(-42);
        var4.field2506 = var5.method1615(-127);
        var4.field2516 = var5.method1615(109);
        var4.field2517 = var5.method1615(-120);
        int var9 = var5.method1589(55);
        if (var9 > 0) {
            var4.field2508 = new class144[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1615(51);
                class144 var12 = new class144(class286.method2014(var11, 783135696));
                var4.field2508[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1611(-103);
                    int var14 = var5.method1611(-66);
                    var12.method984((byte) 110, new class119(var14), (long) var13);
                }
            }
        }
        var5.field4051 = 0;
        var4.field2512 = var5.method1583((byte) 115);
        var4.field2521 = new int[var8];
        var4.field2505 = new class258[var8];
        if (arg1 < 15) {
            method2155((byte) -83);
        }
        var4.field2510 = new int[var8];
        int var15 = 0;
        while (var7 > var5.field4051) {
            int var16 = var5.method1615(-124);
            if (var16 == 3) {
                var4.field2505[var15] = var5.method1620(73);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2521[var15] = var5.method1589(87);
            } else {
                var4.field2521[var15] = var5.method1611(-72);
            }
            var4.field2510[var15++] = var16;
        }
        class55.field862.method698((long) arg0, (byte) 86, var4);
        return var4;
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(B)V", line = 168)
    public static final void method2155(byte arg0) {
        field5257++;
        if (arg0 > -31) {
            return;
        }
        class317.field5349.method435(-14047);
        for (int var1 = 0; var1 < 32; var1++) {
            class242.field4200[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class60.field998[var2] = 0L;
        }
        class265.field4624 = 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILva;I)V", line = 205)
    public final void method98(int arg0, class235 arg1, int arg2) {
        field5245++;
        if (arg0 == 7955 && arg2 == 0) {
            this.field3462 = arg1.method1589(100) == 1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 232)
    public class310() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)[I", line = 250)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            this.method96(62, 48);
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        field5250++;
        if (this.field3456.field5115) {
            int[] var4 = this.method1327(0, arg0 ^ 0x3F2D, arg1);
            for (int var5 = 0; var5 < class190.field3362; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }
}
