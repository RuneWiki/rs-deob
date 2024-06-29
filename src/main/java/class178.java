import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class178 extends class30 {

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "I")
    private int field2918 = 585;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "I")
    public static int field2916 = 0;

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!hp", name = "M", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        if (arg1 <= 49) {
            this.field2918 = -89;
        }
        ++field2917;
        int[] var3 = super.field371.method2367((byte) 72, arg0);
        if (super.field371.field5586) {
            int var4 = class132.field2064[arg0];
            for (int var5 = 0; var5 < class369.field5610; ++var5) {
                int var6 = class79.field995[var5];
                if (~this.field2918 > ~var6 && -this.field2918 + 4096 > var6 && ~(-this.field2918 + 2048) > ~var4 && 2048 - -this.field2918 > var4) {
                    int var7 = 2048 - var6;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2918 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field2918 + 2048 && ~(this.field2918 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2918;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2918 + 2048);
                } else if (var4 >= this.field2918 && var4 <= 4096 - this.field2918) {
                    if (~var6 <= ~this.field2918 && ~(-this.field2918 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2918 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field2918;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2918 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Z")
    public static final boolean method1225(int arg0, int arg1) {
        ++field2920;
        if (class302.field4780[arg1]) {
            return true;
        } else if (!class173.field2883.method2785(arg1, (byte) 115)) {
            return false;
        } else {
            int var2 = class173.field2883.method2758(arg1, 14535);
            if (~var2 == -1) {
                class302.field4780[arg1] = true;
                return true;
            } else {
                if (class203.field3266[arg1] == null) {
                    class203.field3266[arg1] = new class172[var2];
                }
                for (int var3 = 0; var3 < var2; ++var3) {
                    if (class203.field3266[arg1][var3] == null) {
                        byte[] var4 = class173.field2883.method2771(arg1, var3, 3);
                        if (var4 != null) {
                            class172 var5 = class203.field3266[arg1][var3] = new class172();
                            var5.field2865 = (arg1 << 16) - -var3;
                            if (var4[0] != -1) {
                                var5.method1206(new class186(var4), (byte) 123);
                            } else {
                                var5.method1199(1413249480, new class186(var4));
                            }
                        }
                    }
                }
                if (arg0 <= 33) {
                    return true;
                } else {
                    class302.field4780[arg1] = true;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (arg1 != 6456) {
            field2916 = -83;
        }
        if (arg2 == 0) {
            this.field2918 = arg0.method1272((byte) -113);
        }
        ++field2919;
    }
}
