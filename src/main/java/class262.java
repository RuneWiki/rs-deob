import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class262 {

    @OriginalMember(owner = "client!td", name = "n", descriptor = "I")
    public static int field4215 = 0;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "I")
    public static int field4219 = 0;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "I")
    public static int field4216 = 0;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "Z")
    public static boolean field4214 = false;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public int field4213;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!td", name = "q", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!td", name = "s", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    public int field4221;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public int field4222;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    public int field4223;

    @OriginalMember(owner = "client!td", name = "w", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "I")
    public int field4225;

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "Lmo;")
    public static class447 field4205;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[I")
    public static int[] field4202;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V", line = 12)
    public static void method1799(int arg0) {
        field4202 = null;
        if (arg0 > -10) {
            method1799(125);
        }
        field4205 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I", line = 24)
    public static final int method1800(boolean arg0) {
        if (arg0) {
            field4215 = -111;
        }
        field4207++;
        try {
            if (class448.field6540 == 0) {
                if (class189.field3098 > class46.method297(27104) - 5000L) {
                    return 0;
                }
                class435.field6412 = class63.field822.method1894(0, class316.field4959, class11.field153);
                class359.field5495 = class46.method297(27104);
                class448.field6540 = 1;
            }
            if (class46.method297(27104) > (class359.field5495 + 30000L)) {
                return class436.method2684((byte) -74, 1000);
            }
            if (class448.field6540 == 1) {
                if (class435.field6412.field304 == 2) {
                    return class436.method2684((byte) -74, 1001);
                }
                if (class435.field6412.field304 != 1) {
                    return -1;
                }
                class421.field6216 = new class156((Socket) class435.field6412.field305, class63.field822);
                class435.field6412 = null;
                int var1 = 0;
                class11.field139.field3044 = 0;
                if (class137.field2141) {
                    var1 = class375.field5674;
                }
                class11.field139.method1312(23, -92);
                class11.field139.method1315(var1, (byte) 76);
                class421.field6216.method1101(class11.field139.field3066, 0, class11.field139.field3044, 3);
                if (class441.field6457 != null) {
                    class441.field6457.method1546(2124);
                }
                if (class313.field4928 != null) {
                    class313.field4928.method1546(2124);
                }
                int var2 = class421.field6216.method1105(false);
                if (class441.field6457 != null) {
                    class441.field6457.method1546(2124);
                }
                if (class313.field4928 != null) {
                    class313.field4928.method1546(2124);
                }
                if (var2 != 0) {
                    return class436.method2684((byte) -74, var2);
                }
                class448.field6540 = 2;
            }
            if (class448.field6540 == 2) {
                if (class421.field6216.method1102(30000) < 2) {
                    return -1;
                }
                class361.field5515 = class421.field6216.method1105(false);
                class361.field5515 <<= 0x8;
                class361.field5515 += class421.field6216.method1105(arg0);
                class448.field6540 = 3;
                class286.field4598 = 0;
                class291.field4649 = new byte[class361.field5515];
            }
            if (class448.field6540 != 3) {
                return -1;
            }
            int var3 = class421.field6216.method1102(30000);
            if (var3 < 1) {
                return -1;
            }
            if (class361.field5515 - class286.field4598 < var3) {
                var3 = class361.field5515 - class286.field4598;
            }
            class421.field6216.method1103(0, class291.field4649, var3, class286.field4598);
            class286.field4598 += var3;
            if (class361.field5515 > class286.field4598) {
                return -1;
            } else if (class248.method1719(class291.field4649, 96)) {
                class28.field323 = new class231[class137.field2142];
                int var4 = 0;
                for (int var5 = class30.field381; var5 <= class199.field3217; var5++) {
                    class231 var6 = class63.method408(var5, (byte) 51);
                    if (var6 != null) {
                        class28.field323[var4++] = var6;
                    }
                }
                class385.field5819 = null;
                class203.field3276 = 0;
                class421.field6216.method1098((byte) 92);
                class421.field6216 = null;
                class342.field5281 = 0;
                class448.field6540 = 0;
                class291.field4649 = null;
                class189.field3098 = class46.method297(27104);
                return 0;
            } else {
                return class436.method2684((byte) -74, 1002);
            }
        } catch (IOException var7) {
            return class436.method2684((byte) -74, 1003);
        }
    }
}
