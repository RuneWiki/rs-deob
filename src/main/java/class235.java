import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class235 extends class177 {

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    private int field3597 = 585;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[Lcg;")
    public static class42[] field3594 = new class42[4];

    @OriginalMember(owner = "client!k", name = "F", descriptor = "Z")
    public static boolean field3596 = false;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    public static int field3599 = 0;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3595 = "flash1:";

    @OriginalMember(owner = "client!k", name = "P", descriptor = "Z")
    public static boolean field3605 = false;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "[I")
    public static int[] field3604 = new int[5];

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public static int field3601 = 0;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "Lld;")
    public static class121 field3602;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "Lrd;")
    public static class172 field3603;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Lsd;")
    public static class27 field3609;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 14)
    public static void method1651(int arg0) {
        field3604 = null;
        field3603 = null;
        field3602 = null;
        field3594 = null;
        field3609 = null;
        if (arg0 != 1) {
            field3596 = true;
        }
        field3595 = null;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 249)
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lhb;II)V", line = 33)
    public final void method97(class35 arg0, int arg1, int arg2) {
        field3608++;
        if (arg2 == 0) {
            this.field3597 = arg0.method300(arg1 - 1394173571);
        }
        if (arg1 != -18061) {
            field3595 = (String) null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIBLek;)V", line = 59)
    public static final void method1652(int arg0, int arg1, byte arg2, class184 arg3) {
        if (arg3.field2831 == 0) {
            arg3.field2948 = arg3.field2897;
        } else if (arg3.field2831 == 1) {
            arg3.field2948 = (arg1 - arg3.field2890) / 2 + arg3.field2897;
        } else if (arg3.field2831 == 2) {
            arg3.field2948 = arg1 - arg3.field2897 - arg3.field2890;
        } else if (arg3.field2831 == 3) {
            arg3.field2948 = arg3.field2897 * arg1 >> 14;
        } else if (arg3.field2831 == 4) {
            arg3.field2948 = (arg3.field2897 * arg1 >> 14) + (arg1 - arg3.field2890) / 2;
        } else {
            arg3.field2948 = arg1 - (arg3.field2897 * arg1 >> 14) - arg3.field2890;
        }
        if (arg3.field2910 == 0) {
            arg3.field2887 = arg3.field2816;
        } else if (arg3.field2910 == 1) {
            arg3.field2887 = (arg0 - arg3.field2904) / 2 + arg3.field2816;
        } else if (arg3.field2910 == 2) {
            arg3.field2887 = arg0 - arg3.field2904 - arg3.field2816;
        } else if (arg3.field2910 == 3) {
            arg3.field2887 = arg3.field2816 * arg0 >> 14;
        } else if (arg3.field2910 == 4) {
            arg3.field2887 = (arg3.field2816 * arg0 >> 14) + (arg0 - arg3.field2904) / 2;
        } else {
            arg3.field2887 = arg0 - arg3.field2904 - (arg3.field2816 * arg0 >> 14);
        }
        if (arg2 != 24) {
            return;
        }
        field3593++;
        if (!class199.field3147 || !(client.method1764(arg3).field4234 != 0 || arg3.field2945 == 0)) {
            return;
        }
        if (arg3.field2887 < 0) {
            arg3.field2887 = 0;
        } else if (arg0 < arg3.field2904 + arg3.field2887) {
            arg3.field2887 = arg0 - arg3.field2904;
        }
        if (arg3.field2948 < 0) {
            arg3.field2948 = 0;
        } else if (arg1 < (arg3.field2948 + arg3.field2890)) {
            arg3.field2948 = arg1 - arg3.field2890;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[I", line = 141)
    public final int[] method95(int arg0, int arg1) {
        field3607++;
        int[] var3 = this.field2652.method1481(arg1, (byte) -46);
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1];
            for (int var5 = 0; var5 < class287.field4415; var5++) {
                int var6 = class179.field2684[var5];
                if (var6 > this.field3597 && 4096 - this.field3597 > var6 && (2048 - this.field3597) < var4 && var4 < (this.field3597 + 2048)) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3597);
                    var3[var5] = 4096 - var10;
                } else if (var6 > 2048 - this.field3597 && (this.field3597 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field3597;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3597);
                } else if (this.field3597 > var4 || (4096 - this.field3597) < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3597;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3597);
                } else if (this.field3597 <= var6 && var6 <= 4096 - this.field3597) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 < 0 ? -var15 : var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3597);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        if (arg0 > -52) {
            field3598 = 16;
        }
        return var3;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I", line = 237)
    public static final int method1653(byte arg0) {
        if (arg0 == 100) {
            field3606++;
            return class124.field1959;
        } else {
            return -90;
        }
    }
}
