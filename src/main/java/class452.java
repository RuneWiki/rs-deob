import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ifa")
public class class452 implements class762 {

    @OriginalMember(owner = "client!ifa", name = "f", descriptor = "Laj;")
    private class333 field6289;

    @OriginalMember(owner = "client!ifa", name = "e", descriptor = "Ljfa;")
    private class306 field6288;

    @OriginalMember(owner = "client!ifa", name = "k", descriptor = "I")
    public static int field6294 = 0;

    @OriginalMember(owner = "client!ifa", name = "c", descriptor = "Ljda;")
    public static class239 field6286 = new class239(128, 4);

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!ifa", name = "g", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ifa", name = "i", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ifa", name = "j", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!ifa", name = "h", descriptor = "Lvr;")
    private class147 field6291;

    @OriginalMember(owner = "client!ifa", name = "d", descriptor = "Lsaa;")
    public static class347 field6287;

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(III)Lor;")
    public static final class668 method2690(int arg0, int arg1, int arg2) {
        if (arg0 != -4353) {
            method2690(-122, 44, -100);
        }
        field6284++;
        class668 var3 = class536.method3067(arg1, arg0 + 4353);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field9289 == null || arg2 >= var3.field9289.length) {
            return null;
        } else {
            return var3.field9289[arg2];
        }
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IZ)V")
    public final void method1500(int arg0, boolean arg1) {
        if (arg0 > -93) {
            this.field6289 = null;
        }
        field6290++;
        if (!arg1) {
            return;
        }
        int var3 = class593.field8019 > class124.field1786 ? class593.field8019 : class124.field1786;
        int var4 = class710.field9945 >= class140.field2048 ? class710.field9945 : class140.field2048;
        int var5 = this.field6291.method1096();
        int var6 = this.field6291.method1106();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var10 = 0;
            var8 = var4 * var5 / var6;
            var9 = var4;
            var7 = (var3 - var8) / 2;
        }
        this.field6291.method1101(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Z")
    public final boolean method15(int arg0) {
        if (arg0 != 20662) {
            field6294 = -114;
        }
        field6292++;
        return this.field6289.method2104(99, this.field6288.field4436);
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)V")
    public static void method2691(byte arg0) {
        if (arg0 == 107) {
            field6287 = null;
            field6286 = null;
        }
    }

    @OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Laj;Ljfa;)V")
    public class452(class333 arg0, class306 arg1) {
        this.field6289 = arg0;
        this.field6288 = arg1;
    }

    @OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
    public final void method16(int arg0) {
        if (arg0 < 36) {
            field6293 = 54;
        }
        this.field6291 = class454.method2694(47, this.field6289, this.field6288.field4436);
        field6285++;
    }
}
