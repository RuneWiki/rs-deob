import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rha")
public class class222 implements class450 {

    @OriginalMember(owner = "client!rha", name = "h", descriptor = "Lvd;")
    private class39 field3266;

    @OriginalMember(owner = "client!rha", name = "e", descriptor = "Lhba;")
    private class10 field3263;

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "[I")
    public static int[] field3260 = new int[13];

    @OriginalMember(owner = "client!rha", name = "c", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!rha", name = "d", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!rha", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "Lpga;")
    private class536 field3259;

    @OriginalMember(owner = "client!rha", name = "g", descriptor = "Lpga;")
    public static class536 field3265;

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(IZ)V")
    public final void method1249(int arg0, boolean arg1) {
        field3264++;
        if (arg1) {
            int var3 = class501.field7123 <= class291.field4165 ? class291.field4165 : class501.field7123;
            int var4 = class510.field7263 > class344.field4988 ? class510.field7263 : class344.field4988;
            int var5 = this.field3259.method1504();
            int var6 = this.field3259.method1514();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var9 = var4;
                var8 = var4 * var5 / var6;
                var10 = 0;
                var7 = (var3 - var8) / 2;
            }
            this.field3259.method3149(var7, var10, var8, var9);
        }
        if (arg0 != 7620) {
            field3260 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(Z)V")
    public static void method1498(boolean arg0) {
        field3265 = null;
        field3260 = null;
        if (arg0) {
            field3260 = null;
        }
    }

    @OriginalMember(owner = "client!rha", name = "b", descriptor = "(I)V")
    public final void method1253(int arg0) {
        this.field3259 = class355.method2222(this.field3263.field149, this.field3266, (byte) -74);
        if (arg0 == 27444) {
            field3261++;
        }
    }

    @OriginalMember(owner = "client!rha", name = "<init>", descriptor = "(Lvd;Lhba;)V")
    public class222(class39 arg0, class10 arg1) {
        this.field3266 = arg0;
        this.field3263 = arg1;
    }

    @OriginalMember(owner = "client!rha", name = "a", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        if (arg0 == -24346) {
            field3262++;
            return this.field3266.method208(this.field3263.field149, (byte) 70);
        } else {
            return false;
        }
    }
}
