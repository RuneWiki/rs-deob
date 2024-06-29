import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class237 implements class100 {

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "Lida;")
    private class271 field3291;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "Lvf;")
    private class459 field3290;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "Lju;")
    public static class102 field3295 = new class102(41, 3);

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "Lqk;")
    public static class148 field3297 = new class148(60, 1);

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!uu", name = "l", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!uu", name = "k", descriptor = "Lsga;")
    public static class650 field3299;

    @OriginalMember(owner = "client!uu", name = "j", descriptor = "[I")
    public static int[] field3298;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZZ)V", line = 6)
    public final void method681(boolean arg0, boolean arg1) {
        field3296++;
        class127 var3 = this.field3290.method2751(this.field3291.field3661, (byte) 0);
        if (!arg0) {
            this.method680(-36);
        }
        if (var3 == null) {
            return;
        }
        int var4 = this.field3291.field3665.method554(class95.field1381, (byte) -12, this.field3291.field3655) + this.field3291.field3668;
        int var5 = this.field3291.field3660.method2838(this.field3291.field3666, class631.field8989, true) + this.field3291.field3669;
        if (this.field3291.field3670) {
            class96.field1401.method2166(var4, var5, this.field3291.field3655, this.field3291.field3666, this.field3291.field3656, 0);
        }
        int var6 = var5 + this.method1512(var5, class743.field10354, var4, 5, var3.field1750, 0) * 12;
        int var9 = var6 + 8;
        if (this.field3291.field3670) {
            class96.field1401.method2168(var4, var9, this.field3291.field3655 + var4 - 1, var9, this.field3291.field3656, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method1512(var6, class743.field10354, var4, 5, var3.field1747, 0) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method1512(var10, class743.field10354, var4, 5, var3.field1749, 0) * 12;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)V", line = 40)
    public final void method682(byte arg0) {
        field3292++;
        if (arg0 <= 29) {
            method1513(-74, 123, -124, -98);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V", line = 52)
    public static final void method1511(int arg0, int arg1, int arg2, int arg3) {
        field3294++;
        if (class679.field9565 == arg1 && class485.field6557 == arg0 && class675.field9510 == arg2) {
            return;
        }
        class485.field6557 = arg0;
        class675.field9510 = arg2;
        class380.field5357 = true;
        class679.field9565 = arg1;
        double var4 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class366.field4704 = 0.0D;
        class287.field3780 = var8;
        int var16 = 36 / ((47 - arg3) / 46);
        class70.field992 = -var10 * var12;
        class683.field9603 = var8 * var12;
        class557.field7926 = var12;
        class378.field5260 = -var8 * var14;
        class253.field3503 = var10;
        class498.field6981 = var10 * var14;
        class551.field7789 = var14;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILda;IILjava/lang/String;I)I", line = 111)
    private final int method1512(int arg0, class400 arg1, int arg2, int arg3, String arg4, int arg5) {
        field3300++;
        if (arg5 != 0) {
            method1511(-119, -61, 18, -3);
        }
        return arg1.method2423(null, 0, (byte) -123, arg2 + arg3, 0, this.field3291.field3663, 0, this.field3291.field3658, null, 0, arg4, arg0 + arg3, 0, null, this.field3291.field3655 - (arg3 * 2), this.field3291.field3666 - arg3 * 2);
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(IIII)I", line = 123)
    public static final int method1513(int arg0, int arg1, int arg2, int arg3) {
        field3289++;
        if (class265.field3619 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg2 - class531.field7447;
        int var7 = arg0 - class531.field7452;
        if (arg1 != 11142) {
            field3295 = null;
        }
        for (class753 var8 = (class753) class531.field7437.method3118((byte) 73); var8 != null; var8 = (class753) class531.field7437.method3111(arg1 - 11019)) {
            if (var8.field10459 == arg3) {
                int var9 = var8.field10465;
                int var10 = var8.field10456;
                int var11 = class531.field7452 + var10 | var9 - -class531.field7447 << 14;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)V", line = 170)
    public static void method1514(int arg0) {
        field3297 = null;
        field3295 = null;
        field3299 = null;
        if (arg0 != -401938354) {
            method1513(99, 106, 34, 45);
        }
        field3298 = null;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)Z", line = 185)
    public final boolean method680(int arg0) {
        field3293++;
        if (arg0 != 29892) {
            this.field3291 = null;
        }
        return this.field3290.method2754((byte) -127);
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lvf;Lida;)V", line = 195)
    public class237(class459 arg0, class271 arg1) {
        this.field3291 = arg1;
        this.field3290 = arg0;
    }
}
