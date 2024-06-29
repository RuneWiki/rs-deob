import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class172 extends class325 {

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field2781 = 0;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2774 = " from your ignore list first.";

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "J")
    public static long field2785 = 0L;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "Lfa;")
    public static class98 field2769 = new class98(64);

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field2787 = 0;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public int field2777;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public int field2779;

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "Ljd;")
    public static class95 field2773;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "Ljava/lang/String;")
    public String field2782;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "[I")
    public int[] field2776;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
    public int[] field2783;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "[Lii;")
    public class250[] field2786;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "[Ljava/lang/String;")
    public String[] field2780;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZ)V", line = 6)
    public static final void method1295(int arg0, int arg1, int arg2, boolean arg3) {
        field2778++;
        if (!arg3) {
            method1295(12, 94, -124, true);
        }
        class188 var4 = class147.method1111(-67, arg0, 11);
        var4.method1392((byte) -48);
        var4.field2954 = arg1;
        var4.field2959 = arg2;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIILmn;II)V", line = 31)
    public static final void method1296(int arg0, int arg1, int arg2, int arg3, int arg4, class161 arg5, int arg6, int arg7) {
        field2772++;
        int var8 = arg3 * arg3 + arg6 * arg6;
        if (arg0 < var8) {
            return;
        }
        int var9 = Math.min(arg5.field2619 / 2, arg5.field2490 / 2);
        if (var9 * var9 >= var8) {
            class264.method1851(arg5, arg2, arg3, arg4, class311.field4828[arg1], arg7 - 30027, arg6);
        } else {
            var9 -= 10;
            int var10 = (int) class243.field3695 + class63.field846 & 0x7FF;
            int var11 = class164.field2650[var10];
            int var12 = var11 * 256 / (class94.field1332 + 256);
            int var13 = class164.field2664[var10];
            int var14 = var13 * 256 / (class94.field1332 + 256);
            int var15 = arg3 * var12 + arg6 * var14 >> 16;
            int var16 = arg3 * var14 - (arg6 * var12) >> 16;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) ((double) var9 * Math.sin(var17));
            int var20 = (int) ((double) var9 * Math.cos(var17));
            if (class73.field1058) {
                ((class44) class81.field1194[arg1]).method343(240, 240, (arg5.field2619 / 2 + arg2 + var19) * 16, (arg5.field2490 / 2 + arg4 - var20) * 16, (int) (var17 * 10430.378D), 4096);
            } else {
                ((class195) class81.field1194[arg1]).method134(arg5.field2619 / 2 + arg2 + var19 - 10, arg5.field2490 / 2 + -var20 + -10 + arg4, 20, 20, 15, 15, var17, 256);
            }
        }
        if (arg7 != 240) {
            field2773 = (class95) null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V", line = 85)
    public static final void method1297(int arg0, byte arg1) {
        if (arg1 >= -110) {
            method1295(-125, 20, -60, true);
        }
        class130 var2 = (class130) class29.field355.method1716(-1, (long) arg0);
        field2784++;
        if (var2 != null) {
            var2.method39(10717);
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V", line = 100)
    public static void method1298(byte arg0) {
        if (arg0 != 99) {
            field2774 = (String) null;
        }
        field2774 = null;
        field2773 = null;
        field2769 = null;
    }
}
