import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class291 extends class293 {

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "S")
    public static short field4901 = 320;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field4904 = 1;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lli;")
    public static class18 field4899 = new class18();

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lbd;")
    public static class162 field4907 = class17.method142(0, "weiss:");

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field4906 = 2;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field4908 = 0;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z", line = 14)
    public static final boolean method2015(int arg0) {
        field4902++;
        if (class177.field3032) {
            try {
                class198.field3368.method1243(arg0 ^ 0xF1, client.field1903.field469);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 150) {
            method2017((byte) -67);
        }
        return false;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZBLbj;)V", line = 34)
    public static final void method2016(boolean arg0, byte arg1, class276 arg2) {
        if (class117.field2159 || arg0) {
            int var3 = class252.field4205;
            int var4 = var3 * 956 / 503;
            class97.field1766.method518((class251.field4201 - var4) / 2, 0, var4, var3);
            class137.field2444.method266(class251.field4201 / 2 - (class137.field2444.field556 / 2), 18);
        }
        field4903++;
        arg2.method1884(class242.field4030, class251.field4201 / 2, class252.field4205 / 2 - 26, 16777215, -1);
        if (arg1 <= 75) {
            field4907 = (class162) null;
        }
        int var5 = class252.field4205 / 2 - 18;
        if (class117.field2159) {
            class16.method128(class251.field4201 / 2 - 152, var5, 304, 34, 9179409);
            class16.method128(class251.field4201 / 2 - 151, var5 + 1, 302, 32, 0);
            class16.method124(class251.field4201 / 2 - 150, var5 + 2, class220.field3682 * 3, 30, 9179409);
            class16.method124(class251.field4201 / 2 - (150 - (class220.field3682 * 3)), var5 + 2, 300 - (class220.field3682 * 3), 30, 0);
        } else {
            class316.method2160(class251.field4201 / 2 - 152, var5, 304, 34, 9179409);
            class316.method2160(class251.field4201 / 2 - 151, var5 - -1, 302, 32, 0);
            class316.method2174(class251.field4201 / 2 - 150, var5 - -2, class220.field3682 * 3, 30, 9179409);
            class316.method2174(class251.field4201 / 2 + class220.field3682 * 3 - 150, var5 + 2, 300 - (class220.field3682 * 3), 30, 0);
        }
        arg2.method1884(class40.field654, class251.field4201 / 2, class252.field4205 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 94)
    public static void method2017(byte arg0) {
        field4907 = null;
        field4899 = null;
        if (arg0 >= -50) {
            field4907 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 107)
    public static final void method2018(byte arg0) {
        if (arg0 != 23) {
            method2018((byte) 38);
        }
        field4905++;
        int var1 = class240.field3984;
        int var2 = class6.field58;
        int var3 = class148.field2675;
        int var4 = class311.field5221;
        int var5 = 6116423;
        if (class117.field2159) {
            class16.method124(var3, var1, var2, var4, var5);
            class16.method124(var3 + 1, var1 + 1, var2 - 2, 16, 0);
            class16.method128(var3 + 1, var1 + 18, var2 - 2, var4 - 19, 0);
        } else {
            class316.method2174(var3, var1, var2, var4, var5);
            class316.method2174(var3 + 1, var1 + 1, var2 - 2, 16, 0);
            class316.method2160(var3 + 1, var1 - -18, var2 - 2, var4 - 19, 0);
        }
        class207.field3507.method1881(class9.field106, var3 + 3, var1 + 14, var5, -1);
        int var6 = class274.field4554;
        int var7 = class109.field1961;
        for (int var8 = 0; var8 < class293.field4931; var8++) {
            int var9 = 16777215;
            int var10 = ((class293.field4931 - var8 - 1) * 15) + var1 + 31;
            if (var3 < var7 && var2 + var3 > var7 && var6 > var10 - 13 && (var10 + 3) > var6) {
                var9 = 16776960;
            }
            class207.field3507.method1881(class180.method1370((byte) 118, var8), var3 + 3, var10, var9, 0);
        }
        class32.method261(class240.field3984, 0, class311.field5221, class148.field2675, class6.field58);
    }
}
