import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class272 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Leb;")
    public static class230 field4799 = class68.method589(0, "(U0a )2 via: ");

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Leb;")
    public static class230 field4798 = class68.method589(0, "Konfig geladen)3");

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field4801 = 0;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Leb;")
    public static class230 field4803 = class68.method589(0, "Nehmen");

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1856(byte arg0) {
        field4798 = null;
        field4803 = null;
        field4799 = null;
        if (arg0 != 3) {
            field4795 = 30;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "([Leb;I[S)V")
    public static final void method1857(class230[] arg0, int arg1, short[] arg2) {
        class102.method863(arg0.length - 1, false, arg2, 0, arg0);
        field4797++;
        if (arg1 != -10922) {
            method1859(-88);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;")
    public static final Object method1858(int arg0, byte[] arg1, boolean arg2) {
        if (arg0 < 46) {
            return null;
        }
        field4796++;
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class251.field4501) {
            try {
                class141 var3 = (class141) Class.forName("rd").getDeclaredConstructor().newInstance();
                var3.method1083(-76, arg1);
                return var3;
            } catch (Throwable var4) {
                class251.field4501 = true;
            }
        }
        return arg2 ? class161.method1214(arg1, true) : arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method1859(int arg0) {
        if (arg0 != 28445) {
            method1856((byte) 78);
        }
        while (class183.field3182.method974(class16.field368, 8) >= 27) {
            int var1 = class183.field3182.method971(-103, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class168.field2963[var1] == null) {
                class168.field2963[var1] = new class109();
                var2 = true;
            }
            class109 var3 = class168.field2963[var1];
            class167.field2956[class18.field393++] = var1;
            var3.field2256 = class259.field4584;
            if (var3.field1956 != null && var3.field1956.method826(-103)) {
                class182.method1308(var3, -4448);
            }
            int var4 = class183.field3182.method971(arg0 - 28532, 5);
            int var5 = class183.field3182.method971(-117, 1);
            int var6 = class183.field3182.method971(arg0 - 28505, 5);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class23.field450[class183.field3182.method971(-116, 3)];
            if (var2) {
                var3.field2278 = var3.field2289 = var7;
            }
            int var8 = class183.field3182.method971(-58, 1);
            if (var8 == 1) {
                class121.field2132[class105.field1911++] = var1;
            }
            var3.field1956 = class232.method1640(-92, class183.field3182.method971(-113, 14));
            var3.method1009(-1000, var3.field1956.field1769);
            var3.field2301 = var3.field1956.field1777;
            var3.field2293 = var3.field1956.field1770;
            var3.field2252 = var3.field1956.field1794;
            var3.field2298 = var3.field1956.field1796;
            var3.field2291 = var3.field1956.field1784;
            var3.field2283 = var3.field1956.field1791;
            var3.field2270 = var3.field1956.field1755;
            if (var3.field2270 == 0) {
                var3.field2289 = 0;
            }
            var3.field2305 = var3.field1956.field1768;
            var3.method1010(var3.method1005(0), (byte) 5, class56.field1033.field2253[0] + var6, class56.field1033.field2296[0] + var4, var5 == 1);
            if (var3.field1956.method826(arg0 ^ 0xFFFF9089)) {
                class115.method919(var3, var3.field2253[0], var3.field2296[0], 0, (class260) null, class124.field2174, 128, (class194) null);
            }
        }
        field4800++;
        class183.field3182.method976(89);
    }
}
