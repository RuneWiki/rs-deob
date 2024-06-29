import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class122 {

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[S")
    public static short[] field2147 = new short[500];

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2151 = 0;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Llc;")
    public static class143 field2153 = class66.method374("showVideoAd", -1);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
    public static final int method738(byte arg0) {
        if (arg0 == -29) {
            class144.field2584 = 0;
            field2148++;
            return class232.method1577(-32222);
        } else {
            return 82;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILgf;I)[Lbc;")
    public static final class100[] method739(int arg0, class7 arg1, int arg2) {
        field2150++;
        if (class177.method1164(arg0, 69, arg1)) {
            if (arg2 != 1) {
                method739(118, (class7) null, -22);
            }
            return class240.method1611(-13652);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method740(boolean arg0) {
        field2153 = null;
        if (!arg0) {
            method743(false, -123, -120, 56, false);
        }
        field2147 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lqk;III)V")
    public static final void method741(class51 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class36.field621) {
            class120 var4 = class7.field122[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2129 != null && var4.field2129.field2445.method315()) {
                arg0.method311(var4.field2129.field2445, 128, 0, 0, true);
            }
        }
        if (arg3 < class36.field621) {
            class120 var5 = class7.field122[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2129 != null && var5.field2129.field2445.method315()) {
                arg0.method311(var5.field2129.field2445, 0, 0, 128, true);
            }
        }
        if (arg2 < class36.field621 && arg3 < class56.field1091) {
            class120 var6 = class7.field122[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2129 != null && var6.field2129.field2445.method315()) {
                arg0.method311(var6.field2129.field2445, 128, 0, 128, true);
            }
        }
        if (arg2 < class36.field621 && arg3 > 0) {
            class120 var7 = class7.field122[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2129 != null && var7.field2129.field2445.method315()) {
                arg0.method311(var7.field2129.field2445, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)Lci;")
    public static final class173 method742(int arg0, int arg1) {
        if (arg0 > -48) {
            field2147 = null;
        }
        field2149++;
        class173 var2 = (class173) class119.field2108.method826((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class168.field3008.method41(-18328, class174.method1146(arg1, 68), class24.method164(arg1, true));
        class173 var4 = new class173();
        var4.field3109 = arg1;
        if (var3 != null) {
            var4.method1141(-1, new class190(var3));
        }
        class119.field2108.method827(-3, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZIIIZ)V")
    public static final void method743(boolean arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class232.method1576(arg4, 0, class212.field3943.length - 1, false, arg3, arg1, arg0);
        if (arg2 == 6795) {
            field2152++;
        }
    }
}
