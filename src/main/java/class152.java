import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public abstract class class152 extends class274 {

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "Z")
    public boolean field1940 = false;

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "S")
    public short field1944;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public int field1942;

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public int field1934;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public int field1943;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Lme;")
    public static class668 field1941 = new class668(50);

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "Luaa;")
    public static class405 field1945 = new class405("RC", 1);

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Z")
    public static final boolean method1106(int arg0, int arg1) {
        field1935++;
        if (class245.field3279[arg1]) {
            return true;
        } else if (class12.field123.method3342(arg1, -18212)) {
            int var2 = class12.field123.method3341(arg1, -19046);
            if (var2 == 0) {
                class245.field3279[arg1] = true;
                return true;
            }
            if (class322.field4179[arg1] == null) {
                class322.field4179[arg1] = new class477[var2];
            }
            if (arg0 < 27) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class322.field4179[arg1][var3] == null) {
                    byte[] var4 = class12.field123.method3346(-1, arg1, var3);
                    if (var4 != null) {
                        class477 var5 = class322.field4179[arg1][var3] = new class477();
                        var5.field6234 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2629(new class418(var4), (byte) 116);
                    }
                }
            }
            class245.field3279[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(JI)V")
    public static final void method1107(long arg0, int arg1) {
        if (class483.field6438 != null) {
            if (class704.field9810 == 1 || class704.field9810 == 5) {
                class6.method22(arg0, 108);
            } else if (class704.field9810 == 4) {
                class235.method1491(arg0, arg1 - 62);
            }
        }
        field1936++;
        class141.method1064(-114, class520.field6799, (long) class424.field5503);
        if (class196.field2562 != -1) {
            class112.method857(class196.field2562, (byte) -116);
        }
        for (int var3 = arg1; var3 < class57.field758; var3++) {
            if (class53.field719[var3]) {
                class541.field7022[var3] = true;
            }
            class513.field6724[var3] = class53.field719[var3];
            class53.field719[var3] = false;
        }
        class689.field9423 = class424.field5503;
        if (class520.field6799.method340()) {
            class560.field7315 = true;
        }
        if (class196.field2562 != -1) {
            class57.field758 = 0;
            class244.method1525(0);
        }
        class520.field6799.method396();
        class294.method1744(class520.field6799, 0);
        int var4 = class515.method2776(0);
        if (var4 == -1) {
            var4 = client.field1223;
        }
        if (var4 == -1) {
            var4 = class252.field3441;
        }
        class46.method423(var4, arg1);
        class600.method3267(class233.field3130.field503, class57.field767, class233.field3130.field506, 126, class233.field3130.field508);
        class57.field767 = 0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1108(String arg0, byte arg1) {
        field1938++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class315.method1841((byte) 105, arg0);
        if (var2 == null) {
            return;
        }
        if (arg1 != 18) {
            method1109((byte) -53);
        }
        for (int var3 = 0; var3 < class703.field9804; var3++) {
            String var4 = class408.field5236[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class315.method1841((byte) 76, var4);
            if (var5 != null && var5.equals(var2)) {
                class703.field9804--;
                for (int var6 = var3; var6 < class703.field9804; var6++) {
                    class408.field5236[var6] = class408.field5236[var6 + 1];
                    class379.field4851[var6] = class379.field4851[var6 + 1];
                    class580.field7903[var6] = class580.field7903[var6 + 1];
                    class329.field4285[var6] = class329.field4285[var6 + 1];
                    class185.field2367[var6] = class185.field2367[var6 + 1];
                }
                class489.field6490++;
                class352.field4527 = class166.field2089;
                class11 var7 = class130.method931(class649.field9035, (byte) 54, class118.field1527);
                var7.field114.method2352(true, class367.method2111(2, arg0));
                var7.field114.method2374(arg0, -111);
                class100.method760(var7, -125);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(B)V")
    public static void method1109(byte arg0) {
        int var1 = 98 % ((45 - arg0) / 46);
        field1945 = null;
        field1941 = null;
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(IIIIZZ)V")
    public class152(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field1944 = (short) arg3;
        this.field1942 = arg1;
        this.field1940 = arg5;
        this.field1934 = arg2;
        this.field1943 = arg0;
    }
}
