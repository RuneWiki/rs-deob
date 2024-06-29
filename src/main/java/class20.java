import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class20 extends class202 {

    @OriginalMember(owner = "client!ha", name = "W", descriptor = "Lsb;")
    public static class98 field364 = class47.method368("Lade Benutzeroberfl-=che )2 ", 0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "Lsb;")
    public static class98 field356 = class47.method368(":tradereq:", 0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "Lvf;")
    public static class48 field366 = new class48();

    @OriginalMember(owner = "client!ha", name = "eb", descriptor = "F")
    public static float field372;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!ha", name = "ab", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!ha", name = "cb", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!ha", name = "db", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!ha", name = "fb", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ha", name = "Z", descriptor = "Lsb;")
    public class98 field367;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "[I")
    public int[] field355;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "[I")
    public int[] field357;

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "[I")
    public int[] field365;

    @OriginalMember(owner = "client!ha", name = "gb", descriptor = "[I")
    public int[] field374;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public final int method216(int arg0, int arg1) {
        field370++;
        if (this.field365 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field365.length; var3++) {
            if (this.field374[var3] == arg1) {
                return this.field365[var3];
            }
        }
        if (arg0 < 76) {
            this.method216(-41, -92);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public static final int method217(int arg0, int arg1) {
        field371++;
        if (arg0 != 1023) {
            field361 = -26;
        }
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)Lkb;")
    public static final class247 method218(boolean arg0) {
        field360++;
        int var1 = class245.field4326[0] * class164.field2958[0];
        byte[] var2 = class204.field3491[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0) {
            return null;
        }
        while (var4 < var1) {
            var3[var4] = class33.field572[class214.method1427(var2[var4], 255)];
            var4++;
        }
        class247 var5 = new class247(class144.field2538, class101.field1790, class253.field4422[0], class9.field207[0], class245.field4326[0], class164.field2958[0], var3);
        class125.method932(!arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llj;I)V")
    public final void method219(class216 arg0, int arg1) {
        field368++;
        if (arg1 != -3) {
            field361 = 110;
        }
        while (true) {
            int var3 = arg0.method1446(arg1 ^ 0xFFFFEB1B);
            if (var3 == 0) {
                return;
            }
            this.method222(var3, -22934, arg0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsb;Z)I")
    public static final int method220(class98 arg0, boolean arg1) {
        if (!arg1) {
            method218(false);
        }
        field358++;
        return arg0.method724((byte) 25) + 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method221(int arg0) {
        field366 = null;
        field356 = null;
        field364 = null;
        int var1 = -23 / ((arg0 - 63) / 60);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILlj;)V")
    private final void method222(int arg0, int arg1, class216 arg2) {
        field359++;
        if (arg1 != -22934) {
            field373 = -69;
        }
        if (arg0 == 1) {
            this.field367 = arg2.method1445(-3);
        } else if (arg0 == 2) {
            int var4 = arg2.method1446(5350);
            this.field357 = new int[var4];
            this.field355 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field357[var5] = arg2.method1487(class184.method1267(arg1, -22982));
                int var6 = arg2.method1446(5350);
                if (var6 == 0) {
                    this.field355[var5] = -1;
                } else {
                    this.field355[var5] = var6;
                }
            }
        } else if (arg0 == 3) {
            int var7 = arg2.method1446(5350);
            this.field374 = new int[var7];
            this.field365 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field365[var8] = arg2.method1487(9);
                int var9 = arg2.method1446(arg1 ^ 0xFFFFB28C);
                if (var9 == 0) {
                    this.field374[var8] = -1;
                } else {
                    this.field374[var8] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)I")
    public final int method223(int arg0, byte arg1) {
        if (arg1 <= 9) {
            return 85;
        }
        field369++;
        if (this.field357 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field357.length; var3++) {
            if (this.field355[var3] == arg0) {
                return this.field357[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(B)V")
    public final void method224(byte arg0) {
        field363++;
        if (this.field365 != null) {
            for (int var2 = 0; var2 < this.field365.length; var2++) {
                this.field365[var2] = class67.method471(this.field365[var2], 32768);
            }
        }
        if (arg0 < 48) {
            field372 = -0.14282186F;
        }
        if (this.field357 != null) {
            for (int var3 = 0; var3 < this.field357.length; var3++) {
                this.field357[var3] = class67.method471(this.field357[var3], 32768);
            }
        }
    }
}
