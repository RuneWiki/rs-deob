import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class324 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lbs;")
    public class447 field4314 = new class447();

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field4320 = 0;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field4318 = 52;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "Lgd;")
    public static class206 field4315 = new class206("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "Ls;")
    public static class169 field4324;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "[[I")
    public static int[][] field4328;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "Lbs;")
    private class447 field4323;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLnk;)V")
    public static final void method1799(byte arg0, class464 arg1) {
        int var2 = -121 / ((66 - arg0) / 43);
        field4312++;
        if (class62.field821 != arg1.field6359) {
            return;
        }
        if (class233.field3103.field6742 == null) {
            arg1.field6431 = 0;
            arg1.field6289 = 0;
            return;
        }
        arg1.field6445 = 150;
        arg1.field6361 = (int) (Math.sin((double) class70.field968 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field6431 = class332.field4494;
        arg1.field6380 = 5;
        arg1.field6289 = class284.method1599(-102, class233.field3103.field6742);
        arg1.field6438 = class233.field3103.field1133;
        arg1.field6307 = class233.field3103.field1172;
        arg1.field6370 = 0;
        arg1.field6401 = class233.field3103.field1122;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static final void method1800(boolean arg0) {
        int var1 = 0;
        if (arg0) {
            field4324 = null;
        }
        while (class1.field26.length > var1) {
            for (int var2 = 0; var2 < class1.field26[0].length; var2++) {
                for (int var3 = 0; var3 < class1.field26[0][0].length; var3++) {
                    class1.field26[var1][var2][var3] = 0;
                }
            }
            var1++;
        }
        field4321++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)Lbs;")
    public final class447 method1801(byte arg0) {
        field4319++;
        int var2 = -97 % ((-arg0 - 26) / 34);
        class447 var3 = this.field4323;
        if (this.field4314 == var3) {
            this.field4323 = null;
            return null;
        } else {
            this.field4323 = var3.field6079;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V")
    public static void method1802(int arg0) {
        field4328 = null;
        field4315 = null;
        if (arg0 != 4) {
            field4326 = 72;
        }
        field4324 = null;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)Lbs;")
    public final class447 method1803(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field4316++;
        class447 var2 = this.field4314.field6079;
        if (this.field4314 == var2) {
            this.field4323 = null;
            return null;
        } else {
            this.field4323 = var2.field6079;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lbs;I)V")
    public final void method1804(class447 arg0, int arg1) {
        if (arg0.field6084 != null) {
            arg0.method2630((byte) -128);
        }
        field4322++;
        arg0.field6084 = this.field4314.field6084;
        arg0.field6079 = this.field4314;
        if (arg1 != 20408) {
            field4315 = null;
        }
        arg0.field6084.field6079 = arg0;
        arg0.field6079.field6084 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V")
    public final void method1805(int arg0) {
        field4317++;
        if (arg0 <= 99) {
            return;
        }
        while (true) {
            class447 var2 = this.field4314.field6079;
            if (this.field4314 == var2) {
                this.field4323 = null;
                return;
            }
            var2.method2630((byte) -71);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)V")
    public static final void method1806(int arg0, int arg1) {
        class449 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class177 var4 = class289.field3896[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class91.field1344; var5++) {
                    for (int var6 = 0; var6 < class143.field2058; var6++) {
                        var2 = var4.method369(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class302.field4025;
                            int var8 = var5 << class302.field4025;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class177 var10 = class289.field3896[var9];
                                if (var10 != null) {
                                    int var11 = var4.method371(var6, var5) - var10.method371(var6, var5);
                                    int var12 = var4.method371(var6 + 1, var5) - var10.method371(var6 + 1, var5);
                                    int var13 = var4.method371(var6 + 1, var5 + 1) - var10.method371(var6 + 1, var5 + 1);
                                    int var14 = var4.method371(var6, var5 + 1) - var10.method371(var6, var5 + 1);
                                    var10.method372(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V")
    public static final void method1807(int arg0, int arg1, int arg2, int arg3) {
        class491 var4 = class289.field3897[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class451 var5 = var4.field6840;
        class451 var6 = var4.field6849;
        if (var5 != null) {
            var5.field6136 = var5.field6136 * arg3 / 16;
            var5.field6139 = var5.field6139 * arg3 / 16;
        }
        if (var6 != null) {
            var6.field6136 = var6.field6136 * arg3 / 16;
            var6.field6139 = var6.field6139 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILr;)V")
    public static final void method1808(int arg0, class110 arg1) {
        class19.field269 = arg1;
        field4325++;
        if (arg0 != -3227) {
            field4328 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class324() {
        this.field4314.field6079 = this.field4314;
        this.field4314.field6084 = this.field4314;
    }

    static {
        new class206("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field4324 = new class169(12, 7);
        field4326 = 0;
        field4327 = 0;
        field4328 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
    }
}
