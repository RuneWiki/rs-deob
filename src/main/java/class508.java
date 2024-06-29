import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class508 {

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public int field7462;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    public static int field7470 = 0;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "I")
    public int field7455;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
    public static int field7457;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public int field7460;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "Lrk;")
    public class340 field7461;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "Lhr;")
    public static class459 field7465;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "[I")
    public int[] field7452;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[I")
    public int[] field7453;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "[I")
    public int[] field7463;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[I")
    public int[] field7467;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "[I")
    public int[] field7468;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "[I")
    public int[] field7469;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "[Lrk;")
    public class340[] field7472;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "[[I")
    public int[][] field7456;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "[[I")
    public int[][] field7466;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FFIF)F")
    public static final float method2997(float arg0, float arg1, int arg2, float arg3) {
        int var4 = 120 / ((53 - arg2) / 50);
        field7464++;
        return (arg1 - arg3) * arg0 + arg3;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "([BI)V")
    private final void method2998(byte[] arg0, int arg1) {
        field7458++;
        class468 var3 = new class468(class201.method1327(arg0, 112));
        int var4 = var3.method2765(arg1 ^ 0x54);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field7460 = var3.method2722(false);
        } else {
            this.field7460 = 0;
        }
        int var5 = var3.method2765(93);
        this.field7471 = var3.method2727((byte) 43);
        int var6 = 0;
        this.field7452 = new int[this.field7471];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field7471; var8++) {
            this.field7452[var8] = var6 += var3.method2727((byte) 43);
            if (var7 < this.field7452[var8]) {
                var7 = this.field7452[var8];
            }
        }
        this.field7455 = var7 + 1;
        this.field7467 = new int[this.field7455];
        this.field7466 = new int[this.field7455][];
        this.field7463 = new int[this.field7455];
        this.field7469 = new int[this.field7455];
        this.field7468 = new int[this.field7455];
        if (var5 != 0) {
            this.field7453 = new int[this.field7455];
            for (int var9 = 0; var9 < this.field7455; var9++) {
                this.field7453[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field7471; var10++) {
                this.field7453[this.field7452[var10]] = var3.method2722(false);
            }
            this.field7461 = new class340(this.field7453);
        }
        for (int var11 = 0; var11 < this.field7471; var11++) {
            this.field7468[this.field7452[var11]] = var3.method2722(false);
        }
        for (int var12 = 0; var12 < this.field7471; var12++) {
            this.field7467[this.field7452[var12]] = var3.method2722(false);
        }
        for (int var13 = 0; var13 < this.field7471; var13++) {
            this.field7463[this.field7452[var13]] = var3.method2727((byte) 43);
        }
        for (int var14 = arg1; var14 < this.field7471; var14++) {
            int var21 = this.field7452[var14];
            int var22 = 0;
            int var23 = this.field7463[var21];
            this.field7466[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field7466[var21][var25] = var22 += var3.method2727((byte) 43);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field7469[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field7466[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field7456 = new int[var7 + 1][];
        this.field7472 = new class340[var7 + 1];
        for (int var15 = 0; var15 < this.field7471; var15++) {
            int var16 = this.field7452[var15];
            int var17 = this.field7463[var16];
            this.field7456[var16] = new int[this.field7469[var16]];
            for (int var18 = 0; var18 < this.field7469[var16]; var18++) {
                this.field7456[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field7466[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field7466[var16][var19];
                }
                this.field7456[var16][var20] = var3.method2722(false);
            }
            this.field7472[var16] = new class340(this.field7456[var16]);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)[Ltb;")
    public static final class330[] method2999(int arg0) {
        if (class328.field5130 == null) {
            class330[] var1 = class174.method1196(arg0 + 29085, class25.field375);
            class330[] var2 = new class330[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class330 var8 = var1[var4];
                if ((var8.field5143 <= 0 || var8.field5143 >= 24) && var8.field5140 >= 800 && var8.field5137 >= 600 && (class521.field7648 >= 96 || class113.field1723 != 0 || var8.field5140 <= 1024 && var8.field5137 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class330 var10 = var2[var9];
                        if (var8.field5140 == var10.field5140 && var8.field5137 == var10.field5137) {
                            if (var8.field5143 > var10.field5143) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class328.field5130 = new class330[var3];
            class442.method2594(var2, 0, class328.field5130, 0, var3);
            int[] var5 = new int[class328.field5130.length];
            for (int var6 = 0; var6 < class328.field5130.length; var6++) {
                class330 var7 = class328.field5130[var6];
                var5[var6] = var7.field5140 * var7.field5137;
            }
            class264.method1654(var5, class328.field5130, 0);
        }
        if (arg0 == 800) {
            field7454++;
            return class328.field5130;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)V")
    public static void method3000(boolean arg0) {
        field7465 = null;
        if (arg0) {
            field7465 = null;
        }
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
    public static final void method3001(int arg0) {
        field7459++;
        class107.method807(2, 22050, (byte) -88, class454.field6661.field986);
        class80.field1106 = new class524();
        class80.field1106.method3112(128, -74, 9);
        class4.field37 = class364.method2171(class357.field5469, 0, (byte) -54, class25.field375, 22050);
        class4.field37.method1631(class80.field1106, -125);
        class95.method742(class235.field3298, false, class272.field4054, class80.field1106, class316.field4882);
        class72.field973 = class364.method2171(class357.field5469, 1, (byte) -57, class25.field375, 2048);
        if (arg0 != -18006) {
            method2999(85);
        }
        class176.field2598 = new class395();
        class72.field973.method1631(class176.field2598, -124);
        class311.field4839 = new class56(22050, class208.field3009);
        class427.field6369 = class497.field7381.method539((byte) 27, "scape main");
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([BI)V")
    public class508(byte[] arg0, int arg1) {
        this.field7462 = class84.method673((byte) 51, arg0.length, arg0);
        if (this.field7462 != arg1) {
            throw new RuntimeException();
        }
        this.method2998(arg0, 0);
    }
}
