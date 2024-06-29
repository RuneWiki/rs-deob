import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class237 extends class43 {

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "I")
    private int field4288 = 585;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
    public static int field4290 = 0;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "[B")
    public static byte[] field4289 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "Lmb;")
    public static class132 field4291 = class166.method1092("headicons_pk", 126);

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBLkd;)V")
    public final void method200(int arg0, byte arg1, class112 arg2) {
        if (~arg0 == -1) {
            this.field4288 = arg2.method739(arg1 + 125);
        }
        if (arg1 != -73) {
            this.method64(64, 0);
        }
        ++field4293;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)V")
    public static void method1503(byte arg0) {
        field4289 = null;
        if (arg0 <= 67) {
            field4289 = null;
        }
        field4291 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public static final void method1504() {
        for (int var0 = 0; var0 < class148.field2724; ++var0) {
            class78 var1 = class216.field3944[var0];
            class130.method854(var1);
            class216.field3944[var0] = null;
        }
        class148.field2724 = 0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)[I")
    public final int[] method64(int arg0, int arg1) {
        ++field4287;
        int[] var3 = super.field768.method1123(arg1 ^ arg1, arg0);
        if (super.field768.field3219) {
            int var4 = class2.field35[arg0];
            for (int var5 = 0; var5 < class131.field2427; ++var5) {
                int var6 = class156.field2849[var5];
                if (this.field4288 < var6 && 4096 - this.field4288 > var6 && ~(-this.field4288 + 2048) > ~var4 && this.field4288 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4288 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~(-this.field4288 + 2048) > ~var6 && ~(this.field4288 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field4288;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4288);
                } else if (var4 >= this.field4288 && var4 <= -this.field4288 + 4096) {
                    if (~this.field4288 >= ~var6 && ~var6 >= ~(-this.field4288 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4288 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field4288;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4288 + 2048);
                }
            }
        }
        return var3;
    }
}
