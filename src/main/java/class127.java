import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class127 {

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "J")
    public long field2390 = 0L;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field2371 = 20;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "[[I")
    public static int[][] field2372 = new int[104][104];

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lr;")
    private static class66 field2376 = class93.method641(43, "Use");

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    public static int field2381 = 0;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lr;")
    public static class66 field2373 = field2376;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public int field2375;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public int field2378;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public int field2382;

    @OriginalMember(owner = "client!mk", name = "m", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public int field2387;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public int field2388;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!mk", name = "n", descriptor = "La;")
    public class20 field2384;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "La;")
    public class20 field2386;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lid;")
    public static class242 field2380;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)I")
    public static final int method877(int arg0, int arg1) {
        field2383++;
        if (class69.field1401 == 1) {
            return 7;
        } else if (class69.field1401 == 2) {
            return 20;
        } else if (arg1 == 15) {
            return 13;
        } else if (arg1 == 16) {
            return 3;
        } else if (arg1 == 22) {
            return 8;
        } else if (arg1 == 31) {
            return 14;
        } else if (arg1 == 38) {
            return 2;
        } else if (arg1 == 43) {
            return 15;
        } else if (arg1 == 48) {
            return 17;
        } else if (arg1 == 58) {
            return 11;
        } else if (arg1 == 69) {
            return 6;
        } else if (arg1 == 74) {
            return 20;
        } else if (arg1 == 77) {
            return 1;
        } else if (arg1 == 101) {
            return 12;
        } else if (arg1 == 103) {
            return 19;
        } else if (arg1 == 152) {
            return 16;
        } else if (arg1 == 161) {
            return 4;
        } else if (arg1 == 162) {
            return 9;
        } else if (arg1 == 166) {
            return 10;
        } else if (arg1 == 179) {
            return 18;
        } else if (arg1 == 191) {
            return 5;
        } else {
            if (arg0 != 3) {
                field2372 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILlh;)Lke;")
    public static final class160 method878(int arg0, class249 arg1) {
        if (arg0 == 3) {
            field2379++;
            return new class160(arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(-22489), arg1.method1684(arg0 ^ 0xFFFFA824), arg1.method1648((byte) 63), arg1.method1677(-6677));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IB)V")
    public static final void method879(int arg0, byte arg1) {
        field2374++;
        if (!class164.method1107(arg0, (byte) -2)) {
            return;
        }
        class63[] var2 = class31.field466[arg0];
        if (arg1 <= 103) {
            method878(125, (class249) null);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class63 var4 = var2[var3];
            if (var4 != null) {
                var4.field1079 = 0;
                var4.field1094 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static final void method880(int arg0) {
        field2377++;
        if (class181.field3171 == -1 || class238.field4135 == -1) {
            return;
        }
        int var1 = ((class164.field2937 - class9.field91) * class253.field4438 >> 16) + class9.field91;
        class253.field4438 += var1;
        float[] var2 = new float[3];
        if (class253.field4438 >= 65535) {
            if (class83.field1616) {
                class66.field1294 = false;
            } else {
                class66.field1294 = true;
            }
            class83.field1616 = true;
            class253.field4438 = 65535;
        } else {
            class66.field1294 = false;
            class83.field1616 = false;
        }
        int var3 = class98.field1917 * 2;
        float var4 = (float) class253.field4438 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class59.field1008[class181.field3171][var3 + 1][var5] * 3;
            int var22 = (class59.field1008[class181.field3171][var3 + 2][var5] + class59.field1008[class181.field3171][var3 - -2][var5] - class59.field1008[class181.field3171][var3 + 3][var5]) * 3;
            int var23 = class59.field1008[class181.field3171][var3][var5];
            int var24 = class59.field1008[class181.field3171][var3][var5] * 3;
            int var25 = var21 - var24;
            int var26 = class59.field1008[class181.field3171][var3 + 2][var5] + var21 - var23 - var22;
            int var27 = var24 - (var21 * 2 - var22);
            var2[var5] = (((float) var26 * var4 + (float) var27) * var4 + (float) var25) * var4 + (float) var23;
        }
        if (class3.field39 == 0 && class34.field512 == 0) {
            class34.field512 = ((int) var2[2] >> 10) * 8 - 48;
            class3.field39 = ((int) var2[0] >> 10) * 8 - 48;
        }
        class192.field3330 = (int) var2[2] - (class34.field512 * 128);
        class134.field2494 = (int) var2[1] * arg0;
        class207.field3597 = (int) var2[0] - (class3.field39 * 128);
        float[] var6 = new float[3];
        int var7 = class150.field2697 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class59.field1008[class238.field4135][var7 + 1][var8] * 3;
            int var15 = class59.field1008[class238.field4135][var7][var8] * 3;
            int var16 = class59.field1008[class238.field4135][var7][var8];
            int var17 = (class59.field1008[class238.field4135][var7 + 2][var8] + class59.field1008[class238.field4135][var7 + 2][var8] - class59.field1008[class238.field4135][var7 + 3][var8]) * 3;
            int var18 = var15 + var17 - (var14 * 2);
            int var19 = var14 - var15;
            int var20 = class59.field1008[class238.field4135][var7 + 2][var8] - (var16 - var14) - var17;
            var6[var8] = (((float) var20 * var4 + (float) var18) * var4 + (float) var19) * var4 + (float) var16;
        }
        float var9 = var6[0] - var2[0];
        float var10 = (var6[1] - var2[1]) * -1.0F;
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class24.field314 = (float) Math.atan2((double) var10, var12);
        class63.field1244 = -((float) Math.atan2((double) var9, (double) var11));
        class250.field4410 = (int) ((double) class63.field1244 * 325.949D) & 0x7FF;
        class253.field4435 = (int) ((double) class24.field314 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static void method881(int arg0) {
        field2373 = null;
        field2376 = null;
        field2372 = null;
        if (arg0 == 162) {
            field2380 = null;
        }
    }
}
