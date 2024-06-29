import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class264 extends class177 {

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Leg;")
    public static class37 field4639 = class174.method1167("rouge:", -110);

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "[S")
    public static short[] field4642 = new short[500];

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "Leg;")
    public static class37 field4641 = class174.method1167("ondulation2:", 67);

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "[I")
    public static int[] field4640 = new int[25];

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static volatile int field4644 = -1;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Leg;")
    public static class37 field4645 = class174.method1167("b12_full", -32);

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "Leg;")
    public static class37 field4647 = class174.method1167(")1", 88);

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method1782(int arg0) {
        field4639 = null;
        field4642 = null;
        field4647 = null;
        field4641 = null;
        field4645 = null;
        field4640 = null;
        if (arg0 != -32053) {
            field4642 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method1783(int arg0) {
        field4648++;
        if (class100.field1548 == -1 || class213.field3682 == -1) {
            return;
        }
        int var1 = ((class201.field3418 - class45.field701) * class41.field651 >> 16) + class45.field701;
        int var2 = class89.field1424 * 2;
        class41.field651 += var1;
        float[] var3 = new float[3];
        if (class41.field651 < 65535) {
            class45.field707 = false;
            class53.field827 = false;
        } else {
            class41.field651 = 65535;
            if (class53.field827) {
                class45.field707 = false;
            } else {
                class45.field707 = true;
            }
            class53.field827 = true;
        }
        float var4 = (float) class41.field651 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class174.field2912[class100.field1548][var2 + 1][var5] * 3;
            int var22 = (class174.field2912[class100.field1548][var2 + 2][var5] + class174.field2912[class100.field1548][var2 + 2][var5] - class174.field2912[class100.field1548][var2 + 3][var5]) * 3;
            int var23 = class174.field2912[class100.field1548][var2][var5] * 3;
            int var24 = class174.field2912[class100.field1548][var2][var5];
            int var25 = var22 + var23 - (var21 * 2);
            int var26 = class174.field2912[class100.field1548][var2 + 2][var5] + var21 - var24 - var22;
            int var27 = var21 - var23;
            var3[var5] = (((float) var26 * var4 + (float) var25) * var4 + (float) var27) * var4 + (float) var24;
        }
        class137.field2338 = (int) var3[1] * -1;
        class200.field3403 = (int) var3[2] - (class144.field2456 * 128);
        float[] var6 = new float[3];
        class213.field3683 = (int) var3[0] - (class40.field642 * 128);
        int var7 = class223.field3837 * 2;
        if (arg0 != 5948) {
            method1782(-75);
        }
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class174.field2912[class213.field3682][var7 + 1][var8] * 3;
            int var15 = class174.field2912[class213.field3682][var7][var8] * 3;
            int var16 = (class174.field2912[class213.field3682][var7 + 2][var8] + class174.field2912[class213.field3682][var7 + 2][var8] - class174.field2912[class213.field3682][var7 - -3][var8]) * 3;
            int var17 = var14 - var15;
            int var18 = class174.field2912[class213.field3682][var7][var8];
            int var19 = var16 + var15 - (var14 * 2);
            int var20 = var14 + class174.field2912[class213.field3682][var7 + 2][var8] - var18 - var16;
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var17) * var4 + (float) var18;
        }
        float var9 = var6[2] - var3[2];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[0] - var3[0];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class185.field3105 = (float) Math.atan2((double) var10, var12);
        class282.field4988 = -((float) Math.atan2((double) var11, (double) var9));
        class159.field2655 = (int) ((double) class185.field3105 * 325.949D) & 0x7FF;
        class117.field1990 = (int) ((double) class282.field4988 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJ)V")
    public static final void method1784(byte arg0, long arg1) {
        field4646++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class242.field4363; var3++) {
            if (class58.field941[var3] == arg1) {
                class242.field4363--;
                class132.field2227++;
                for (int var4 = var3; var4 < class242.field4363; var4++) {
                    class22.field289[var4] = class22.field289[var4 + 1];
                    class77.field1203[var4] = class77.field1203[var4 + 1];
                    class174.field2911[var4] = class174.field2911[var4 + 1];
                    class58.field941[var4] = class58.field941[var4 + 1];
                    class213.field3681[var4] = class213.field3681[var4 + 1];
                    class119.field2013[var4] = class119.field2013[var4 + 1];
                }
                class218.field3750 = class221.field3804;
                class273.field4778.method1697(179, 99);
                class273.field4778.method1256(arg1, (byte) 84);
                break;
            }
        }
        if (arg0 < 11) {
            method1783(-11);
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z")
    public static final boolean method1785(int arg0) {
        if (arg0 != -1) {
            field4639 = null;
        }
        field4643++;
        if (class30.field440) {
            try {
                class267.field4686.method234(0, class177.field2957.field3504);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
