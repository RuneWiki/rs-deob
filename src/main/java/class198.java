import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class198 extends class102 {

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "I")
    private int field3695 = 4096;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "Z")
    private boolean field3698 = true;

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "[Lra;")
    public static class185[] field3693 = new class185[2048];

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!sd", name = "R", descriptor = "B")
    public static byte field3692;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!sd", name = "N", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!sd", name = "O", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!sd", name = "P", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!sd", name = "Q", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Llg;")
    public static class126 field3699;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(III)V")
    public static final void method1320(int arg0, int arg1, int arg2) {
        ++class102.field1966;
        ++field3690;
        if (arg1 == 0) {
            class81.field1564.method70((byte) -62, 19);
            class81.field1564.method1246(arg2, arg1 + 98);
            class81.field1564.method1233((byte) 80, arg0);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public final int[][] method14(int arg0, int arg1) {
        ++field3687;
        if (arg1 != 64) {
            field3700 = -11;
        }
        int[][] var3 = super.field1950.method598((byte) -119, arg0);
        if (super.field1950.field1724) {
            int[] var4 = this.method679(class233.field4296 & arg0 + -1, 0, (byte) -109);
            int[] var5 = this.method679(arg0, 0, (byte) -109);
            int[] var6 = this.method679(class233.field4296 & arg0 + 1, 0, (byte) -109);
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            for (int var10 = 0; class155.field2796 > var10; ++var10) {
                int var11 = (var5[class227.field4193 & var10 + 1] + -var5[class227.field4193 & var10 + -1]) * this.field3695;
                int var12 = var11 >> 12;
                int var13 = (var6[var10] + -var4[var10]) * this.field3695;
                int var14 = var12 * var12 >> 12;
                int var15 = var13 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var14 - -var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var11 / var17;
                    var19 = 16777216 / var17;
                    var20 = var13 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field3698) {
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var8[var10] = var18;
                var7[var10] = var20;
                var9[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(Z)V")
    public static final void method1321(boolean arg0) {
        if (!arg0) {
            ++field3697;
            class157.field2842.method1297((byte) 89);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lra;IZ)V")
    public final void method13(class185 arg0, int arg1, boolean arg2) {
        ++field3688;
        if (arg2) {
            field3699 = null;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field3698 = ~arg0.method1243(3) == -2;
            }
        } else {
            this.field3695 = arg0.method1252(2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        ++field3689;
        if (class163.field2940) {
            class6 var1 = class227.method1485(class167.field3024, class56.field1233, (byte) 112);
            if (var1 != null && var1.field227 != null) {
                class19 var2 = new class19();
                var2.field491 = var1.field227;
                var2.field499 = var1;
                class102.method681(200000, var2);
            }
            if (arg0 == 16777216) {
                class163.field2940 = false;
                class139.method880(var1, 123);
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(Z)V")
    public static void method1323(boolean arg0) {
        field3699 = null;
        if (arg0) {
            field3693 = null;
        }
    }
}
