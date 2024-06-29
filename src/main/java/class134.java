import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class134 extends class202 {

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "[I")
    public int[] field2146 = new int[5];

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "[Lml;")
    public class289[] field2153 = new class289[5];

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
    public int field2145 = 0;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public int field2137;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public int field2144;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field2134;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public int field2139;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public int field2147;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "I")
    public int field2151;

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "Lwi;")
    public class134 field2152;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "Lui;")
    public class229 field2133;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "Lgj;")
    public class235 field2149;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "Lwk;")
    public class272 field2150;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lah;")
    public class278 field2143;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "Lji;")
    public class42 field2140;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "La;")
    public class48 field2141;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Z")
    public boolean field2135;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Z")
    public boolean field2142;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "Z")
    public boolean field2154;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(Z)Lea;")
    public static final class37 method939(boolean arg0) {
        field2132++;
        int var1 = class236.field3847[0] * class148.field2385[0];
        byte[] var2 = class145.field2332[0];
        int[] var3 = new int[var1];
        int var4 = 0;
        if (arg0) {
            return null;
        }
        while (var4 < var1) {
            var3[var4] = class194.field3113[class202.method1393(var2[var4], 255)];
            var4++;
        }
        class37 var5 = new class37(class27.field432, class155.field2513, class152.field2464[0], class74.field1202[0], class148.field2385[0], class236.field3847[0], var3);
        class287.method1923(0);
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static final void method940(byte arg0) {
        if (arg0 != 35) {
            method939(true);
        }
        field2130++;
        if (class224.field3707 == 0) {
            return;
        }
        try {
            if ((++class227.field3765) > 1500) {
                if (class5.field69 != null) {
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                }
                if (class241.field3903 >= 1) {
                    class33.field515 = -5;
                    class224.field3707 = 0;
                    return;
                }
                class227.field3765 = 0;
                class241.field3903++;
                class224.field3707 = 1;
                if (class78.field1253 == class143.field2308) {
                    class143.field2308 = class95.field1554;
                } else {
                    class143.field2308 = class78.field1253;
                }
            }
            if (class224.field3707 == 1) {
                class16.field282 = class105.field1684.method1135(6, class121.field1972, class143.field2308);
                class224.field3707 = 2;
            }
            if (class224.field3707 == 2) {
                if (class16.field282.field2589 == 2) {
                    throw new IOException();
                }
                if (class16.field282.field2589 != 1) {
                    return;
                }
                class5.field69 = new class1((Socket) class16.field282.field2594, class105.field1684);
                class16.field282 = null;
                class5.field69.method2(0, class68.field1113.field3653, -127, class68.field1113.field3655);
                if (class74.field1203 != null) {
                    class74.field1203.method1191(arg0 - 33);
                }
                if (class13.field243 != null) {
                    class13.field243.method1191(2);
                }
                int var1 = class5.field69.method9(17335);
                if (class74.field1203 != null) {
                    class74.field1203.method1191(2);
                }
                if (class13.field243 != null) {
                    class13.field243.method1191(2);
                }
                if (var1 != 101) {
                    class224.field3707 = 0;
                    class33.field515 = var1;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                    return;
                }
                class224.field3707 = 3;
            }
            if (class224.field3707 == 3 && class5.field69.method6(arg0 ^ 0xFFFFFFA6) >= 2) {
                int var2 = class5.field69.method9(17335) << 8 | class5.field69.method9(17335);
                class170.method1173(var2, (byte) 93);
                if (class4.field46 == -1) {
                    class33.field515 = 6;
                    class224.field3707 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                } else {
                    class224.field3707 = 0;
                    class5.field69.method7((byte) 18);
                    class5.field69 = null;
                    class259.method1770(100);
                }
            }
        } catch (IOException var3) {
            if (class5.field69 != null) {
                class5.field69.method7((byte) 18);
                class5.field69 = null;
            }
            if (class241.field3903 < 1) {
                class224.field3707 = 1;
                class227.field3765 = 0;
                if (class78.field1253 == class143.field2308) {
                    class143.field2308 = class95.field1554;
                } else {
                    class143.field2308 = class78.field1253;
                }
                class241.field3903++;
            } else {
                class33.field515 = -4;
                class224.field3707 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method941(String arg0, int arg1) throws ClassNotFoundException {
        field2131++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg1 == 255) {
            return Class.forName(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(III)V")
    public class134(int arg0, int arg1, int arg2) {
        this.field2136 = this.field2138 = arg0;
        this.field2137 = arg1;
        this.field2144 = arg2;
    }
}
