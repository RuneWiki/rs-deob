import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class513 {

    @OriginalMember(owner = "client!ft", name = "r", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!ft", name = "s", descriptor = "I")
    public int field25;

    @OriginalMember(owner = "client!ft", name = "p", descriptor = "[I")
    public static int[] field22 = new int[4];

    @OriginalMember(owner = "client!ft", name = "q", descriptor = "I")
    public static int field23 = 0;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ft", name = "m", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ft", name = "n", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ft", name = "o", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 3)
    public static final void method17(byte arg0) {
        int var1 = 15 % ((48 - arg0) / 48);
        field17++;
        class415.field5866.method2776(false);
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lec;I)V", line = 13)
    public static final void method18(class213 arg0, int arg1) {
        field21++;
        if (arg0.field2676 == null && arg0.field2632 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.field2676.length; var3++) {
            int var4 = -1;
            if (arg0.field2676 != null) {
                var4 = arg0.field2676[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var11;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var7 = var4 & 0xFFFFFFF;
                    int var8 = var7 >> 14;
                    var9 = arg0.field530 - (var8 - class36.field689) * 512 - 256;
                    int var10 = var7 & 0x3FFF;
                    var11 = arg0.field531 - ((var10 - class88.field1239) * 512 + 256);
                } else if ((var4 & 0x8000) == 0) {
                    class633 var12 = (class633) class522.field7662.method3678((long) var4, -127);
                    if (var12 == null) {
                        arg0.method1285(-1, var3, 256);
                        continue;
                    }
                    class557 var13 = var12.field9097;
                    var11 = arg0.field531 - var13.field531;
                    var9 = arg0.field530 - var13.field530;
                } else {
                    int var14 = var4 & 0x7FFF;
                    class613 var15 = class184.field2252[var14];
                    if (var15 == null) {
                        arg0.method1285(-1, var3, 256);
                        continue;
                    }
                    var11 = arg0.field531 - var15.field531;
                    var9 = arg0.field530 - var15.field530;
                }
                if (var9 != 0 || var11 != 0) {
                    arg0.method1285((int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF, var3, 256);
                }
            } else if (!arg0.method1285(-1, var3, 256)) {
                var2 = false;
            }
        }
        if (arg1 > 3 && var2) {
            arg0.field2632 = null;
            arg0.field2676 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 122)
    public static final void method19(boolean arg0) {
        field19++;
        if (class147.field1801 != null) {
            for (int var1 = 0; var1 < class516.field7558; var1++) {
                class147.field1801[var1] = null;
            }
            class147.field1801 = null;
        }
        if (class436.field6246 != null) {
            for (int var2 = 0; var2 < class10.field100; var2++) {
                class436.field6246[var2] = null;
            }
            class436.field6246 = null;
        }
        if (class683.field9755 != null) {
            for (int var3 = 0; var3 < class133.field1693; var3++) {
                class683.field9755[var3] = null;
            }
            class683.field9755 = null;
        }
        class501.field6999 = null;
        if (arg0) {
            method19(false);
        }
        class677.field9705 = null;
        class432.field6204 = -1;
        class353.field4718 = -1;
        class395.field5587 = null;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(IIFFF)F", line = 178)
    public static final float method20(int arg0, int arg1, float arg2, float arg3, float arg4) {
        field18++;
        if (arg1 != 2) {
            method19(false);
        }
        float[] var5 = class534.field7794[arg0];
        return var5[2] * arg2 + var5[0] * arg3 + var5[1] * arg4;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(I)V", line = 194)
    public static final void method21(int arg0) {
        class342.field4521 = arg0;
        for (int var1 = 0; var1 < class455.field6393; var1++) {
            for (int var2 = 0; var2 < class302.field4057; var2++) {
                if (class281.field3808[arg0][var1][var2] == null) {
                    class281.field3808[arg0][var1][var2] = new class433(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(Z)V", line = 221)
    public static void method22(boolean arg0) {
        field22 = null;
        if (!arg0) {
            method21(120);
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(II)V", line = 235)
    public class4(int arg0, int arg1) {
        this.field24 = arg1;
        this.field25 = arg0;
    }
}
