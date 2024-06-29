import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class219 extends class112 {

    @OriginalMember(owner = "client!tb", name = "S", descriptor = "I")
    private int field3565 = 585;

    @OriginalMember(owner = "client!tb", name = "O", descriptor = "[S")
    public static short[] field3561 = new short[256];

    @OriginalMember(owner = "client!tb", name = "K", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!tb", name = "L", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!tb", name = "M", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!tb", name = "N", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!tb", name = "P", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!tb", name = "T", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!tb", name = "U", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!tb", name = "V", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tb", name = "R", descriptor = "Lwm;")
    public static class152 field3564;

    @OriginalMember(owner = "client!tb", name = "Q", descriptor = "[I")
    public static int[] field3563;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BI)[I", line = 9)
    public final int[] method53(byte arg0, int arg1) {
        field3566++;
        if (arg0 != -3) {
            field3559 = -58;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 75);
        if (this.field1585.field4935) {
            int var4 = class114.field1620[arg1];
            for (int var5 = 0; var5 < class58.field889; var5++) {
                int var6 = class131.field1992[var5];
                if (this.field3565 < var6 && var6 < (4096 - this.field3565) && (2048 - this.field3565) < var4 && var4 < this.field3565 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3565);
                    var3[var5] = 4096 - var10;
                } else if (var6 > (2048 - this.field3565) && var6 < this.field3565 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3565;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3565);
                } else if (this.field3565 > var4 || var4 > 4096 - this.field3565) {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field3565;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field3565);
                } else if (this.field3565 <= var6 && var6 <= (4096 - this.field3565)) {
                    var3[var5] = 0;
                } else {
                    int var15 = 2048 - var4;
                    int var16 = var15 >= 0 ? var15 : -var15;
                    int var17 = var16 << 12;
                    int var18 = var17 / (2048 - this.field3565);
                    var3[var5] = 4096 - var18;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IILhi;)V", line = 93)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg0 != 31164) {
            field3559 = -77;
        }
        field3567++;
        if (arg1 == 0) {
            this.field3565 = arg2.method2021((byte) 74);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLhi;Lwm;)I", line = 133)
    public static final int method1497(byte arg0, class291 arg1, class152 arg2) {
        if (arg0 != -11) {
            field3559 = 124;
        }
        field3557++;
        int var3 = arg1.field4946;
        byte[] var4 = arg2.method1018(-121);
        arg1.method2001(var4.length, (byte) 27);
        arg1.field4946 += class97.field1384.method47(var4.length, (byte) 116, arg1.field4946, 0, var4, arg1.field4950);
        return arg1.field4946 - var3;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 152)
    public static final void method1498(boolean arg0) {
        field3558++;
        class215.field3501 = new class127[class23.field408.method1380((byte) 12)][];
        class132.field2005 = new boolean[class23.field408.method1380((byte) 12)];
        if (!arg0) {
            field3561 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "(I)V", line = 164)
    public static void method1499(int arg0) {
        field3561 = null;
        field3564 = null;
        field3563 = null;
        int var1 = 104 / ((5 - arg0) / 55);
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 179)
    public class219() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "(I)V", line = 184)
    public static final void method1500(int arg0) {
        field3560++;
        class308.field5285.method1619(11300);
        if (arg0 != 12) {
            method1499(41);
        }
    }
}
