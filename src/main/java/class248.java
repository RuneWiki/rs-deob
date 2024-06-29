import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class248 {

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "I")
    private int field4313 = 0;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lak;")
    private class269 field4306;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lvf;")
    public static class265 field4305 = class87.method582(-46, "unzap");

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "[I")
    public static int[] field4303 = new int[32];

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Lvf;")
    private static class265 field4308 = class87.method582(-46, "Connection lost)3");

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lvf;")
    public static class265 field4310 = field4308;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "Lvf;")
    public static class265 field4312 = class87.method582(-46, "leuchten1:");

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Lkh;")
    private class12 field4311;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method1654(int arg0) {
        field4310 = null;
        field4308 = null;
        field4305 = null;
        field4303 = null;
        field4312 = null;
        if (arg0 != 1569) {
            method1654(-65);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Lkh;")
    public final class12 method1655(byte arg0) {
        field4304++;
        if (this.field4313 > 0 && this.field4306.field4791[this.field4313 - 1] != this.field4311) {
            class12 var2 = this.field4311;
            this.field4311 = var2.field388;
            return var2;
        }
        while (this.field4313 < this.field4306.field4798) {
            class12 var3 = this.field4306.field4791[this.field4313++].field388;
            if (this.field4306.field4791[this.field4313 - 1] != var3) {
                this.field4311 = var3.field388;
                return var3;
            }
        }
        return arg0 == -4 ? null : null;
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)Lkh;")
    public final class12 method1656(int arg0) {
        field4307++;
        this.field4313 = arg0;
        return this.method1655((byte) -4);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lak;)V")
    public class248(class269 arg0) {
        this.field4306 = arg0;
    }
}
