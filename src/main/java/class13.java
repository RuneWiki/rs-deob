import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class13 extends class150 {

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "Z")
    public static volatile boolean field201 = true;

    @OriginalMember(owner = "client!ah", name = "B", descriptor = "Z")
    public static boolean field202 = true;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "Lck;")
    public static class119 field199 = class298.method1987((byte) 64, "blinken3:");

    @OriginalMember(owner = "client!ah", name = "M", descriptor = "Lck;")
    public static class119 field213 = class298.method1987((byte) 5, "VOLL");

    @OriginalMember(owner = "client!ah", name = "G", descriptor = "Lck;")
    public static class119 field207 = class298.method1987((byte) 31, "<col=ff3000>");

    @OriginalMember(owner = "client!ah", name = "L", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!ah", name = "N", descriptor = "Lfj;")
    public static class3 field214 = new class3(new byte[5000]);

    @OriginalMember(owner = "client!ah", name = "O", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ah", name = "D", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ah", name = "E", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ah", name = "F", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ah", name = "I", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ah", name = "J", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ah", name = "C", descriptor = "Lwi;")
    public static class23 field203;

    @OriginalMember(owner = "client!ah", name = "H", descriptor = "Lwi;")
    public static class23 field208;

    @OriginalMember(owner = "client!ah", name = "K", descriptor = "[Lnd;")
    public static class233[] field211;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 6)
    public static void method111(int arg0) {
        field207 = null;
        if (arg0 != 4) {
            return;
        }
        field214 = null;
        field211 = null;
        field213 = null;
        field208 = null;
        field199 = null;
        field203 = null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(II)Lie;", line = 31)
    public static final class20 method112(int arg0, int arg1) {
        field210++;
        class20 var2 = (class20) class110.field1681.method524((byte) 118, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class263.field4283.method261(-1, 1, arg1);
        } else {
            var3 = class169.field2681.method261(-1, 1, arg1 & 0x7FFF);
        }
        int var4 = 77 % ((arg0 - 68) / 35);
        class20 var5 = new class20();
        if (var3 != null) {
            var5.method166(new class3(var3), false);
        }
        if (arg1 >= 32768) {
            var5.method157((byte) -125);
        }
        class110.field1681.method527((long) arg1, var5, 0);
        return var5;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 77)
    public static final void method113(byte arg0) {
        field205++;
        if (arg0 != 19) {
            method113((byte) -108);
        }
        try {
            if (class126.field1947 == 1) {
                int var1 = class263.field4274.method1212(-11444);
                if (var1 > 0 && class263.field4274.method1232(128)) {
                    int var2 = var1 - class140.field2256;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class263.field4274.method1213(var2, -1940389913);
                    return;
                }
                class263.field4274.method1217(-24302);
                class263.field4274.method1226((byte) -24);
                class64.field1010 = null;
                if (class207.field3298 == null) {
                    class126.field1947 = 0;
                } else {
                    class126.field1947 = 2;
                }
                class182.field2889 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class263.field4274.method1217(-24302);
            class182.field2889 = null;
            class64.field1010 = null;
            class126.field1947 = 0;
            class207.field3298 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lfj;I)V", line = 131)
    public static final void method114(class3 arg0, int arg1) {
        field204++;
        if (arg0.field101.length - arg0.field44 < 1) {
            return;
        }
        int var2 = arg0.method64((byte) -85);
        if (var2 < 0 || var2 > 2) {
            return;
        }
        byte var3;
        if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field101.length - arg0.field44)) {
            return;
        }
        class99.field1503 = arg0.method64((byte) 113);
        if (class99.field1503 < 1) {
            class99.field1503 = 1;
        } else if (class99.field1503 > 4) {
            class99.field1503 = 4;
        }
        class118.method747(arg1 ^ 0x76E7, arg0.method64((byte) 48) == 1);
        class29.field417 = arg0.method64((byte) -100) == 1;
        class198.field3168 = arg0.method64((byte) 95) == 1;
        class78.field1199 = arg0.method64((byte) 18) == 1;
        class281.field4640 = arg0.method64((byte) 47) == 1;
        class129.field1979 = arg0.method64((byte) 4) == 1;
        class185.field2934 = ~arg0.method64((byte) -89) == arg1;
        class224.field3598 = arg0.method64((byte) 14) == 1;
        class153.field2434 = arg0.method64((byte) -124);
        if (class153.field2434 > 2) {
            class153.field2434 = 2;
        }
        if (var2 < 2) {
            class6.field146 = arg0.method64((byte) -85) == 1;
            arg0.method64((byte) 8);
        } else {
            class6.field146 = arg0.method64((byte) 14) == 1;
        }
        class10.field184 = arg0.method64((byte) 121) == 1;
        class14.field226 = arg0.method64((byte) -120) == 1;
        class10.field183 = arg0.method64((byte) 86);
        if (class10.field183 > 2) {
            class10.field183 = 2;
        }
        class244.field3943 = arg0.method64((byte) 46) == 1;
        class4.field120 = arg0.method64((byte) -94);
        if (class4.field120 > 127) {
            class4.field120 = 127;
        }
        class78.field1205 = arg0.method64((byte) -84);
        class184.field2916 = arg0.method64((byte) 19);
        if (class184.field2916 > 127) {
            class184.field2916 = 127;
        }
        if (var2 >= 1) {
            class27.field407 = arg0.method63((byte) 1);
            class146.field2349 = arg0.method63((byte) 1);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lck;B)Z", line = 216)
    public static final boolean method115(class119 arg0, byte arg1) {
        field209++;
        int var2 = 27 % ((-arg1 - 46) / 39);
        try {
            int var3 = arg0.method758(44, 13548);
            if (var3 == -1) {
                return false;
            }
            class119 var4 = arg0.method762(var3, 0, 0);
            class119 var5 = arg0.method769(-94, var3 + 1);
            MessageDigest var6 = MessageDigest.getInstance("SHA");
            var6.reset();
            var6.update(var4.method756(false));
            byte[] var7 = var6.digest();
            byte[] var8 = var5.method754((byte) -94);
            class3 var9 = new class3(5000);
            var9.method73(var8.length, (byte) -117, 0, var8);
            var9.field44 = 0;
            var9.method31(class91.field1407, -699, class293.field4876);
            if (var9.field101[0] != 1) {
                return false;
            }
            for (int var10 = 0; var10 < 20; var10++) {
                if (var9.field101[var10 + 1] != var7[var10]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var12) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V", line = 287)
    public static final void method116(int arg0) {
        field206++;
        if (!class84.field1267) {
            return;
        }
        class84.field1267 = false;
        class1.field19 = null;
        if (arg0 == 1) {
            class272.field4477 = null;
        }
    }
}
