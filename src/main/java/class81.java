import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class81 extends class335 {

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    private int field1282 = 585;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field1274 = 0;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field1273 = 0;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field1277 = 0;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBIII)V", line = 8)
    public static final void method581(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        class85.field1376 = arg4;
        class30.field442 = arg0;
        class300.field4687 = arg5;
        if (arg2 <= 99) {
            return;
        }
        class188.field2806 = arg1;
        field1281++;
        class156.field2335 = arg3;
        if (class300.field4687 >= 100) {
            int var6 = class188.field2806 * 128 + 64;
            int var7 = class85.field1376 * 128 + 64;
            int var8 = class320.method2181(var6, var7, -112, class205.field3101) - class156.field2335;
            int var9 = var6 - class337.field5278;
            int var10 = var8 - class258.field4052;
            int var11 = var7 - class265.field4116;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class194.field2897 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class218.field3323 = (int) (Math.atan2((double) var9, (double) var11) * -325.949D) & 0x7FF;
            if (class194.field2897 < 128) {
                class194.field2897 = 128;
            }
            if (class194.field2897 > 383) {
                class194.field2897 = 383;
            }
        }
        class178.field2692 = 2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIII)V", line = 53)
    public static final void method582(int arg0, int arg1, int arg2, int arg3) {
        class257.method1766(120, false);
        field1280++;
        class2.field29 = arg3;
        class182.field2747 = arg2;
        class344.method2380(arg0, arg1);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(II)I", line = 70)
    public static int method583(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 81)
    public class81() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[I", line = 86)
    public final int[] method149(int arg0, int arg1) {
        field1278++;
        if (arg1 != 621) {
            return (int[]) null;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0];
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                int var6 = class90.field1437[var5];
                if (var6 > this.field1282 && var6 < (4096 - this.field1282) && (2048 - this.field1282) < var4 && (this.field1282 + 2048) > var4) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1282);
                    var3[var5] = 4096 - var10;
                } else if (2048 - this.field1282 < var6 && (this.field1282 + 2048) > var6) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1282;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1282);
                } else if (this.field1282 > var4 || 4096 - this.field1282 < var4) {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field1282;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1282);
                } else if (this.field1282 <= var6 && var6 <= 4096 - this.field1282) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field1282);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(II)V", line = 165)
    public static final void method584(int arg0, int arg1) {
        field1279++;
        class229.field3646.method2175(arg1, -1401253017);
        if (arg0 != 2048) {
            method582(74, -114, -3, 1);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILkh;I)V", line = 193)
    public final void method230(int arg0, class166 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1282 = arg1.method1151(-63);
        }
        field1276++;
        if (arg2 <= 51) {
            method582(-113, 98, 99, -108);
        }
    }
}
