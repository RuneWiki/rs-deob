import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class328 extends class386 {

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    private int field4371 = 4096;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "Lrf;")
    public static class74 field4373 = new class74();

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V")
    public static final void method1907(int arg0) {
        class511.field7470 = null;
        if (arg0 == -27347) {
            class612.field8779 = null;
            class242.field3330 = null;
            class521.field7651 = null;
            class156.field1902 = null;
            class251.field3445 = null;
            class493.field6894 = null;
            class410.field5803 = null;
            class335.field4459 = null;
            class489.field6829 = null;
            class657.field9330 = null;
            class39.field723 = null;
            class36.field691 = null;
            class524.field7696 = null;
            ++field4370;
            class612.field8776 = null;
            class335.field4463 = null;
            client.field3739 = null;
            class196.field2377 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBLun;)V")
    public final void method355(int arg0, byte arg1, class389 arg2) {
        if (~arg0 == -1) {
            this.field4371 = arg2.method2260(-59);
        }
        if (arg1 <= 111) {
            field4373 = null;
        }
        ++field4372;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    public class328() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(FFBF)I")
    public static final int method1908(float arg0, float arg1, byte arg2, float arg3) {
        ++field4369;
        float var4 = !(arg3 < 0.0F) ? arg3 : -arg3;
        if (arg2 > -126) {
            field4373 = null;
        }
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = !(arg1 < 0.0F) ? arg1 : -arg1;
        if (var5 > var4 && var5 > var6) {
            return !(arg0 > 0.0F) ? 1 : 0;
        } else if (var4 < var6 && var6 > var5) {
            return !(arg1 > 0.0F) ? 3 : 2;
        } else {
            return !(arg3 > 0.0F) ? 5 : 4;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I")
    public final int[] method359(int arg0, int arg1) {
        ++field4368;
        int var3 = 5 / ((arg1 - 13) / 40);
        int[] var4 = super.field5140.method1564(arg0, true);
        if (super.field5140.field3482) {
            int[] var5 = this.method2212((byte) 92, arg0 - 1 & class206.field2474, 0);
            int[] var6 = this.method2212((byte) 114, arg0, 0);
            int[] var7 = this.method2212((byte) 75, class206.field2474 & arg0 + 1, 0);
            for (int var8 = 0; var8 < class599.field8643; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field4371;
                int var10 = (var6[var8 - -1 & class276.field3782] + -var6[var8 + -1 & class276.field3782]) * this.field4371;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + var14 + 4096) / 4096.0F)));
                int var16 = var15 == 0 ? 0 : 16777216 / var15;
                var4[var8] = -var16 + 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lub;)V")
    public static final void method1909(class20 arg0) {
        if (arg0 != null) {
            for (int var1 = 0; var1 < 2; ++var1) {
                int var10002;
                for (int var2 = 0; var2 < class196.field2370[var1]; ++var2) {
                    if (class549.field7969[var1][var2] == arg0) {
                        class252.method1540(class549.field7969[var1], var2 + 1, class549.field7969[var1], var2, class196.field2370[var1] - var2 - 1);
                        var10002 = class196.field2370[var1]--;
                        return;
                    }
                }
                for (int var3 = 0; var3 < class596.field8613[var1]; ++var3) {
                    if (class516.field7547[var1][var3] == arg0) {
                        class252.method1540(class516.field7547[var1], var3 + 1, class516.field7547[var1], var3, class596.field8613[var1] - var3 - 1);
                        var10002 = class596.field8613[var1]--;
                        return;
                    }
                }
                for (int var4 = 0; var4 < class571.field8344[var1]; ++var4) {
                    if (class67.field1036[var1][var4] == arg0) {
                        class252.method1540(class67.field1036[var1], var4 + 1, class67.field1036[var1], var4, class571.field8344[var1] - var4 - 1);
                        var10002 = class571.field8344[var1]--;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "(I)V")
    public static void method1910(int arg0) {
        if (arg0 >= -92) {
            method1907(-52);
        }
        field4373 = null;
    }
}
