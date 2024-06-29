import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class451 extends class428 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field6377 = new String[8];

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field6386 = -50;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "Lvf;")
    public static class166 field6383 = new class166();

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "Ldb;")
    public static class29 field6387 = new class29("WTWIP", 3);

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public int field6380;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public int field6381;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field6382;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    public int field6385;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "Lbg;")
    public static class406 field6384;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "La;")
    public class78 field6378;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "[Lqt;")
    public class465[] field6379;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Loj;ZII)Z")
    public final boolean method2639(class280 arg0, boolean arg1, int arg2, int arg3) {
        field6376++;
        if (!arg1) {
            method2640(115);
        }
        if (this.field6379 != null) {
            for (int var5 = 0; var5 < this.field6379.length; var5++) {
                if (this.field6379[var5].method2734(arg2, arg3) && this.field6378.method28(arg2, arg0, arg3, -6085)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method2640(int arg0) {
        field6387 = null;
        field6377 = null;
        if (arg0 != 0) {
            method2640(69);
        }
        field6383 = null;
        field6384 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method2641(byte arg0) {
        field6382++;
        class11 var1 = null;
        try {
            class405 var2 = class42.field512.method2173(false);
            while (var2.field5759 == 0) {
                class85.method433(1L, -109);
            }
            if (var2.field5759 == 1) {
                var1 = (class11) var2.field5755;
                class179 var3 = new class179(class349.field5022 * 6 + 3);
                var3.method909(1, -1);
                var3.method884(class349.field5022, true);
                for (int var4 = 0; var4 < class288.field4312.length; var4++) {
                    if (class190.field2599[var4]) {
                        var3.method884(var4, true);
                        var3.method897(class288.field4312[var4], -109);
                    }
                }
                var1.method87(var3.field2159, var3.field2206, 0, 90);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method86((byte) -109);
            }
        } catch (Exception var5) {
        }
        if (arg0 < 5) {
            method2641((byte) -22);
        }
        class128.field1582 = class434.method2591(-19310);
        class176.field2130 = false;
    }
}
