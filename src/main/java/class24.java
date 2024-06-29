import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class24 extends class287 {

    @OriginalMember(owner = "client!mp", name = "H", descriptor = "I")
    public int field331 = -1;

    @OriginalMember(owner = "client!mp", name = "z", descriptor = "I")
    public int field324 = -1;

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field319 = new String[100];

    @OriginalMember(owner = "client!mp", name = "I", descriptor = "[Ljj;")
    public static class170[] field332;

    @OriginalMember(owner = "client!mp", name = "G", descriptor = "Z")
    public static boolean field330;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "I")
    public int field321;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!mp", name = "A", descriptor = "I")
    public int field325;

    @OriginalMember(owner = "client!mp", name = "B", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!mp", name = "C", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!mp", name = "D", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!mp", name = "E", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!mp", name = "K", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!mp", name = "J", descriptor = "Lsd;")
    public static class74 field333;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(ILoj;)V")
    public final void method27(int arg0, class280 arg1) {
        ++field323;
        if (arg0 != 0) {
            this.method27(-104, (class280) null);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V")
    public static final void method139(int arg0, byte arg1) {
        class259.field3742 = arg0;
        ++field320;
        class210 var2 = class160.field1926;
        synchronized (class160.field1926) {
            class160.field1926.method1165((byte) 118);
            if (arg1 != -1) {
                method141(-116);
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(ILoj;)Lmg;")
    public final class451 method19(int arg0, class280 arg1) {
        ++field326;
        class327 var3 = arg1.method1456();
        var3.method553(super.field4302, super.field4306, super.field4303);
        class451 var4 = class134.method638(762096108, 3);
        if (~this.field331 != 0) {
            class352 var5 = class422.field6096.method121(this.field331, -1).method2324(-1, 1024, (class207) null, (class448) null, 0, this.field334, -115, 0, arg1);
            if (var5 != null) {
                var5.method1716(var3, var4.field6379[2], 0);
            }
        }
        if (~this.field324 != 0) {
            class352 var6 = class422.field6096.method121(this.field324, -1).method2324(-1, 1024, (class207) null, (class448) null, 0, this.field325, -123, 0, arg1);
            if (var6 != null) {
                var6.method1716(var3, var4.field6379[1], 0);
            }
        }
        class352 var7 = class422.field6096.method121(this.field321, -1).method2324(-1, 1024, (class207) null, (class448) null, 0, this.field322, -123, 0, arg1);
        if (arg0 <= 95) {
            this.method28(-29, (class280) null, -94, 96);
        }
        if (var7 != null) {
            var7.method1716(var3, var4.field6379[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    public static void method140(int arg0) {
        field332 = null;
        field319 = null;
        if (arg0 != -2608) {
            field332 = null;
        }
        field333 = null;
    }

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "(I)V")
    public static final void method141(int arg0) {
        if (arg0 > 54) {
            class63.field794 = null;
            class301.field4470 = null;
            class398.field5666 = null;
            class408.field5780 = null;
            class298.field4459 = null;
            class115.field1420 = null;
            class233.field3239 = null;
            class487.field6902 = null;
            class79.field950 = null;
            class137.field1649 = null;
            ++field328;
            class304.field4500 = null;
            class283.field4119 = null;
            class437.field6277 = null;
            class83.field1014 = null;
            class283.field4125 = null;
            class273.field3875 = null;
            class101.field1230 = null;
            class92.field1147 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILoj;II)Z")
    public final boolean method28(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg3 != -6085) {
            method141(-50);
        }
        ++field329;
        class327 var5 = arg1.method1456();
        var5.method553(super.field4302, super.field4306, super.field4303);
        class352 var6 = class422.field6096.method121(this.field321, -1).method2324(-1, 65536, (class207) null, (class448) null, 0, this.field322, -126, 0, arg1);
        if (var6 != null && var6.method1695(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field324 != 0) {
                class352 var7 = class422.field6096.method121(this.field324, -1).method2324(-1, 65536, (class207) null, (class448) null, 0, this.field325, -109, 0, arg1);
                if (var7 != null && var7.method1695(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field331 != -1) {
                class352 var8 = class422.field6096.method121(this.field331, -1).method2324(-1, 65536, (class207) null, (class448) null, 0, this.field334, -128, 0, arg1);
                if (var8 != null && var8.method1695(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new class40("You are temporarily banned from this clan channel.", "Du wurdest temporär aus diesem Chatraum verbannt.", "Vous êtes temporairement exclu de ce canal de clan.", "Você está temporariamente vetado de entrar nesse canal de clã.");
        field332 = new class170[14];
        field330 = false;
    }
}
