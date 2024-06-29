import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class392 extends class4 {

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    private int field5443 = 585;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lvt;")
    public static class344 field5438 = new class344("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "Lpq;")
    public static class71 field5440 = null;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field5442 = 1;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class392() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field5441;
        if (arg0 != 10) {
            method2366(106);
        }
        int[] var3 = super.field31.method2252(arg1, 11);
        if (super.field31.field5127) {
            int var4 = class130.field1606[arg1];
            for (int var5 = 0; var5 < class132.field1627; ++var5) {
                int var6 = class66.field881[var5];
                if (var6 > this.field5443 && ~var6 > ~(-this.field5443 + 4096) && var4 > -this.field5443 + 2048 && var4 < this.field5443 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5443 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field5443 + 2048) && var6 < 2048 - -this.field5443) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field5443;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5443 + 2048);
                } else if (~var4 <= ~this.field5443 && ~var4 >= ~(-this.field5443 + 4096)) {
                    if (~this.field5443 >= ~var6 && var6 <= 4096 - this.field5443) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5443 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field5443;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field5443 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/lang/String;BILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2365(String arg0, byte arg1, int arg2, String arg3, int arg4, String arg5) {
        ++field5437;
        int var6 = -88 % ((28 - arg1) / 59);
        class620.method3554(arg5, (byte) -57, arg4, arg0, arg3, (String) null, -1, arg2);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg2 == 0) {
            this.field5443 = arg1.method3090(-86);
        }
        if (arg0 >= -89) {
            field5438 = null;
        }
        ++field5436;
    }

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "(I)V")
    public static void method2366(int arg0) {
        field5438 = null;
        if (arg0 > -90) {
            method2365((String) null, (byte) -29, 98, (String) null, 87, (String) null);
        }
    }
}
