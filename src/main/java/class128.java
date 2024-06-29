import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class128 extends class157 {

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Z")
    private boolean field2465 = true;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    private int field2470 = 4096;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "I")
    public static int field2469 = 3;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field2468 = 7759444;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "[I")
    public static int[] field2471 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "Lcc;")
    public static class209 field2472 = class95.method669(113, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field2464;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (arg0 != 1) {
            method922((byte) -93);
        }
        ++field2467;
        if (super.field2872.field1434) {
            int[] var4 = this.method1097((byte) 75, 0, class42.field859 & arg1 + -1);
            int[] var5 = this.method1097((byte) 75, 0, arg1);
            int[] var6 = this.method1097((byte) 75, 0, class42.field859 & arg1 + 1);
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            for (int var10 = 0; class226.field4124 > var10; ++var10) {
                int var11 = (var5[var10 + 1 & class249.field4490] + -var5[var10 + -1 & class249.field4490]) * this.field2470;
                int var12 = var11 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (var6[var10] - var4[var10]) * this.field2470;
                int var15 = var14 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var13 + 4096 - -var16) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var19 = var14 / var17;
                    var18 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field2465) {
                    var18 = (var18 >> 1) + 2048;
                    var20 = 2048 - -(var20 >> 1);
                    var19 = (var19 >> 1) + 2048;
                }
                var9[var10] = var20;
                var7[var10] = var19;
                var8[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Ljh;")
    public static final class284 method922(byte arg0) {
        int var1 = 31 / ((-9 - arg0) / 51);
        ++field2464;
        return class111.field2244;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public static void method923(boolean arg0) {
        field2471 = null;
        if (arg0) {
            method922((byte) 106);
        }
        field2472 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 > -29) {
            this.field2465 = false;
        }
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2465 = arg2.method774((byte) 118) == 1;
            }
        } else {
            this.field2470 = arg2.method736(123);
        }
        ++field2466;
    }
}
