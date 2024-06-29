import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class296 extends class748 {

    @OriginalMember(owner = "client!qn", name = "K", descriptor = "I")
    private int field3857 = 585;

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Low;")
    public static class747 field3854 = new class747("", 15);

    @OriginalMember(owner = "client!qn", name = "N", descriptor = "[I")
    public static int[] field3860 = new int[5];

    @OriginalMember(owner = "client!qn", name = "I", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!qn", name = "M", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!qn", name = "O", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!qn", name = "L", descriptor = "Lrfa;")
    public static class399 field3858;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1739(String arg0, int arg1) {
        ++field3855;
        class120 var2 = class510.method3041(120);
        var2.field1653.method184(class241.field3368.field2237, -47);
        var2.field1653.method147((byte) 53, 0);
        int var3 = var2.field1653.field330;
        var2.field1653.method147((byte) 53, 631);
        int[] var4 = class336.method1948(arg1 ^ arg1, var2);
        int var5 = var2.field1653.field330;
        var2.field1653.method187(arg0, (byte) -61);
        var2.field1653.method184(class369.field4721, arg1 ^ 24987);
        var2.field1653.field330 += 7;
        var2.field1653.method197(var4, var2.field1653.field330, var5, -106);
        var2.field1653.method164((byte) 90, -var3 + var2.field1653.field330);
        class471.method2805(95, var2);
        class369.field4720 = 0;
        class530.field7420 = -3;
        class282.field3741 = 0;
        class95.field1393 = 1;
    }

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "(I)V")
    public static void method1740(int arg0) {
        field3860 = null;
        field3854 = null;
        field3858 = null;
        if (arg0 != 4096) {
            field3858 = null;
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field3861;
        if (arg1) {
            field3860 = null;
        }
        if (~arg0 == -1) {
            this.field3857 = arg2.method193(2);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "()V")
    public class296() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field3859;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0];
            for (int var5 = 0; var5 < class424.field5889; ++var5) {
                int var6 = class237.field3298[var5];
                if (this.field3857 < var6 && ~var6 > ~(-this.field3857 + 4096) && var4 > -this.field3857 + 2048 && this.field3857 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field3857);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field3857 + 2048 < var6 && var6 < this.field3857 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3857;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field3857 + 2048);
                } else if (this.field3857 <= var4 && ~(-this.field3857 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field3857 && ~(-this.field3857 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3857 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field3857;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3857 + 2048);
                }
            }
        }
        if (arg1 != 255) {
            method1740(-106);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1741(int arg0, byte arg1, int arg2) {
        if (arg1 > -75) {
            field3860 = null;
        }
        ++field3856;
        return (2048 & arg2) != 0;
    }
}
