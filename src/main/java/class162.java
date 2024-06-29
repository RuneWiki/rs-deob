import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class162 extends class135 {

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Z")
    public boolean field2511 = true;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field2512 = 0;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public int field2515 = -1;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "I")
    public int field2524 = 0;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public int field2520 = -1;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "I")
    public int field2529 = 12800;

    @OriginalMember(owner = "client!il", name = "T", descriptor = "I")
    public int field2531 = 12800;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "Ljava/lang/String;")
    public String field2530;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Ljava/lang/String;")
    public String field2513;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public int field2525;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "Lrh;")
    public class46 field2516;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2518 = "Loaded title screen";

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!il", name = "P", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Ldl;")
    public static class123 field2521;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "[I")
    public static int[] field2522;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    public static void method1110(int arg0) {
        if (arg0 == -8760) {
            field2522 = null;
            field2521 = null;
            field2518 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZ)V")
    public static final void method1111(int arg0, boolean arg1) {
        if (arg1) {
            if (class242.field3880 != -1) {
                class45.method340(class242.field3880, -25149);
            }
            for (class35 var2 = (class35) class2.field22.method671(0); var2 != null; var2 = (class35) class2.field22.method666(56)) {
                class102.method680(0, var2, true);
            }
            class242.field3880 = -1;
            class2.field22 = new class100(8);
            class164.method1131(-116);
            class242.field3880 = class187.field2946;
            class146.method969((byte) 99, false);
            class33.method264(-101);
            class287.method1916(16173, class242.field3880);
        }
        field2528++;
        class191.field3019 = -1;
        class257.method1765(class147.field2162, 2048);
        class149.field2227 = new class186();
        class149.field2227.field1273 = 3000;
        class149.field2227.field1226 = 3000;
        class98.method651(false, class237.field3802);
        class245.method1650(10, (byte) -109);
        if (arg0 >= -58) {
            method1110(-49);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)Ljk;")
    public static final class253 method1112(int arg0, byte arg1) {
        field2523++;
        class253 var2 = (class253) class286.field4530.method1428((long) arg0, (byte) -94);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class37.field493.method807((byte) 96, class192.method1340(arg0, -26779), class110.method720(-113, arg0));
        class253 var4 = new class253();
        var4.field4033 = arg0;
        if (var3 != null) {
            var4.method1702(0, new class25(var3));
        }
        if (arg1 <= 87) {
            field2518 = null;
        }
        var4.method1695(-27873);
        if (var4.field4032 != -1) {
            var4.method1700(method1112(var4.field4032, (byte) 99), 0, method1112(var4.field4091, (byte) 116));
        }
        if (var4.field4050 != -1) {
            var4.method1697(method1112(var4.field4050, (byte) 105), method1112(var4.field4067, (byte) 117), (byte) 116);
        }
        if (!class130.field1898 && var4.field4044) {
            var4.field4035 = class161.field2506;
            var4.field4064 = class231.field3721;
            var4.field4087 = false;
            var4.field4053 = 0;
            var4.field4084 = class3.field39;
        }
        class286.field4530.method1424((long) arg0, var4, -2003648287);
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Z")
    public final boolean method1113(int arg0, int arg1, int arg2) {
        field2527++;
        if (arg1 < this.field2531 || arg1 > this.field2512 || arg2 < this.field2529 || this.field2524 < arg2) {
            return false;
        }
        class65 var4 = (class65) this.field2516.method350(8240);
        if (arg0 > -60) {
            return false;
        }
        while (var4 != null) {
            if (var4.method448((byte) -24, arg1, arg2)) {
                return true;
            }
            var4 = (class65) this.field2516.method353((byte) -116);
        }
        return false;
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
    public static final void method1114(int arg0) {
        field2519++;
        if (arg0 < 85) {
            field2522 = null;
        }
        class270.field4298.method1420(-1);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
    public final void method1115(int arg0) {
        this.field2524 = 0;
        this.field2531 = 12800;
        this.field2512 = arg0;
        this.field2529 = 12800;
        for (class65 var2 = (class65) this.field2516.method350(8240); var2 != null; var2 = (class65) this.field2516.method353((byte) -126)) {
            if (var2.field909 < this.field2529) {
                this.field2529 = var2.field909;
            }
            if (this.field2512 < var2.field913) {
                this.field2512 = var2.field913;
            }
            if (this.field2531 > var2.field906) {
                this.field2531 = var2.field906;
            }
            if (var2.field910 > this.field2524) {
                this.field2524 = var2.field910;
            }
        }
        field2514++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;B)J")
    public static final long method1116(String arg0, byte arg1) {
        long var2 = 0L;
        field2517++;
        if (arg1 <= 4) {
            return 97L;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg0.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (long) (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (long) (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIZI)V")
    public class162(String arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field2530 = arg1;
        this.field2513 = arg0;
        this.field2515 = arg6;
        this.field2526 = arg2;
        this.field2525 = arg3;
        this.field2520 = arg4;
        if (this.field2515 == 255) {
            this.field2515 = 0;
        }
        this.field2511 = arg5;
        this.field2516 = new class46();
    }
}
