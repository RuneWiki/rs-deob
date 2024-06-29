import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class293 extends class259 {

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public int field4660 = 0;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public int field4668 = -1;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "[I")
    public static int[] field4656 = new int[128];

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
    public static int field4659 = 0;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field4669 = 0;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field4649;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field4650;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public int field4651;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field4654;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field4655;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public int field4657;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
    public int field4662;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public int field4663;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field4667;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public int field4670;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Llf;")
    public static class94 field4664;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public static void method1989(int arg0) {
        if (arg0 == 1) {
            field4664 = null;
            field4656 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)Llf;")
    public static final class94 method1990(int arg0) {
        field4658++;
        int var1 = class283.field4559[0] * class165.field2534[0];
        byte[] var2 = class280.field4506[arg0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class53.field748[class301.method2056(255, var2[var4])];
        }
        class148 var5 = new class148(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], var3);
        class137.method1032(-100);
        return var5;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4661++;
        int var8 = 67 / ((-arg6 - 60) / 59);
        if (arg2 == arg3) {
            class68.method518(arg5, arg0, arg1, arg2, arg4, 0, arg7);
        } else if ((arg1 - arg2) >= class264.field4230 && class273.field4418 >= (arg1 + arg2) && class73.field1156 <= (arg4 - arg3) && (arg3 + arg4) <= class59.field859) {
            class63.method477(arg4, arg3, arg7, arg2, 14, arg1, arg0, arg5);
        } else {
            class162.method1174(arg2, arg1, arg5, arg7, arg4, -43, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public static final void method1992(boolean arg0) {
        field4666++;
        if (class268.field4304 == -1 || class182.field2732 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = ((class179.field2680 - class192.field2836) * class124.field2051 >> 16) + class192.field2836;
        class124.field2051 += var2;
        if (class124.field2051 < 65535) {
            class111.field1854 = false;
            class51.field698 = false;
        } else {
            if (class111.field1854) {
                class51.field698 = false;
            } else {
                class51.field698 = true;
            }
            class111.field1854 = true;
            class124.field2051 = 65535;
        }
        float var3 = (float) class124.field2051 / 65535.0F;
        int var4 = class287.field4606 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class226.field3319[class268.field4304][var4][var5] * 3;
            int var22 = class226.field3319[class268.field4304][var4 + 1][var5] * 3;
            int var23 = (-class226.field3319[class268.field4304][var4 + 3][var5] - (-class226.field3319[class268.field4304][var4 + 2][var5] - class226.field3319[class268.field4304][var4 + 2][var5])) * 3;
            int var24 = class226.field3319[class268.field4304][var4][var5];
            int var25 = var22 - var21;
            int var26 = var23 + var21 - (var22 * 2);
            int var27 = class226.field3319[class268.field4304][var4 + 2][var5] + var22 - var24 - var23;
            var1[var5] = (((float) var27 * var3 + (float) var26) * var3 + (float) var25) * var3 + (float) var24;
        }
        class93.field1533 = (int) var1[0] - (class163.field2520 * 128);
        if (!arg0) {
            field4664 = null;
        }
        class260.field4024 = (int) var1[2] - (class149.field2390 * 128);
        float[] var6 = new float[3];
        class226.field3324 = (int) var1[1] * -1;
        int var7 = class192.field2843 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class226.field3319[class182.field2732][var7][var8] * 3;
            int var15 = class226.field3319[class182.field2732][var7 + 1][var8] * 3;
            int var16 = (class226.field3319[class182.field2732][var7 + 2][var8] + class226.field3319[class182.field2732][var7 + 2][var8] - class226.field3319[class182.field2732][var7 + 3][var8]) * 3;
            int var17 = class226.field3319[class182.field2732][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = class226.field3319[class182.field2732][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var3 + (float) var19) * var3 + (float) var18) * var3 + (float) var17;
        }
        float var9 = (var6[1] - var1[1]) * -1.0F;
        float var10 = var6[0] - var1[0];
        float var11 = var6[2] - var1[2];
        double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class4.field42 = (float) Math.atan2((double) var9, var12);
        class36.field466 = -((float) Math.atan2((double) var10, (double) var11));
        class115.field1906 = (int) ((double) class4.field42 * 325.949D) & 0x7FF;
        class268.field4303 = (int) ((double) class36.field466 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static final void method1993(byte arg0) {
        field4665++;
        if (arg0 >= -70) {
            field4669 = -5;
        }
        if (class255.field3851) {
            return;
        }
        class255.field3851 = true;
        if (class299.field4829) {
            class180.field2705 = (float) ((int) class180.field2705 + 47 & 0xFFFFFFF0);
        } else {
            class270.field4376 += (12.0F - class270.field4376) / 2.0F;
        }
        class180.field2709 = true;
    }
}
