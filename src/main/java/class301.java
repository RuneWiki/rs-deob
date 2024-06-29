import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class301 extends class71 {

    @OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
    public static int field5358 = 99;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "Lhc;")
    public static class171 field5356 = new class171(100);

    @OriginalMember(owner = "client!ha", name = "S", descriptor = "Lud;")
    public static class279 field5362 = class130.method1024("Lade Schrifts-=tze )2 ", 255);

    @OriginalMember(owner = "client!ha", name = "V", descriptor = "Lud;")
    private static class279 field5365 = class130.method1024("Loaded title screen", 255);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "Lud;")
    public static class279 field5364 = field5365;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public static int field5355;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "I")
    public static int field5359;

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!ha", name = "R", descriptor = "Ljava/lang/String;")
    public static String field5361;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method86(int arg0, int arg1) {
        int[][] var3 = this.field1400.method1746((byte) 21, arg0);
        if (this.field1400.field4363) {
            int[] var4 = this.method624(arg0, -3, 2);
            int[][] var5 = this.method619(0, 2, arg0);
            int[][] var6 = this.method619(1, 2, arg0);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[0];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class215.field3787; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var9[var16] = var11[var16];
                    var8[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var14[var16];
                    var9[var16] = var13[var16];
                    var8[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        int var19 = 22 % ((-arg1 - 70) / 54);
        field5357++;
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IB)[I", line = 105)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            return (int[]) null;
        }
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            int[] var5 = this.method624(arg0, -3, 1);
            int[] var6 = this.method624(arg0, -3, 2);
            for (int var7 = 0; var7 < class215.field3787; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = var4[var7] * var8 + ((4096 - var8) * var5[var7]) >> 12;
                }
            }
        }
        field5353++;
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBI)I", line = 154)
    public static final int method2138(int arg0, byte arg1, int arg2) {
        if (arg1 > -42) {
            field5360 = 57;
        }
        class109 var3 = (class109) class103.field1928.method610((long) arg2, -1);
        field5355++;
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && arg0 < var3.field2019.length) {
            return var3.field2019[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZLvh;)V", line = 172)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        if (!arg1) {
            method2141(59);
        }
        field5354++;
        if (arg0 == 0) {
            this.field1389 = arg2.method483(-105) == 1;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V", line = 188)
    public class301() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I", line = 197)
    public static int method2139(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IB)Lud;", line = 205)
    public static final class279 method2140(int arg0, byte arg1) {
        field5359++;
        if (arg1 != -45) {
            method2140(-105, (byte) 78);
        }
        if (arg0 < 100000) {
            return class115.method929(new class279[] { class14.field429, class191.method1447(arg1 ^ 0xFFFFFFD6, arg0), class121.field2179 }, (byte) 60);
        } else if (arg0 < 10000000) {
            return class115.method929(new class279[] { class121.field2171, class191.method1447(5, arg0 / 1000), class43.field905, class121.field2179 }, (byte) 60);
        } else {
            return class115.method929(new class279[] { class59.field1252, class191.method1447(5, arg0 / 1000000), class68.field1339, class121.field2179 }, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 228)
    public static void method2141(int arg0) {
        field5361 = null;
        field5364 = null;
        field5365 = null;
        field5356 = null;
        field5362 = null;
        if (arg0 != -1) {
            method2140(65, (byte) 127);
        }
    }
}
