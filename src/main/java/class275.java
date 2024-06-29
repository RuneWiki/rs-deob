import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class275 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Z")
    public static boolean field3916 = false;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public static int field3918 = 64;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "Z")
    public static boolean field3919 = false;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "[[I")
    public static int[][] field3914;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1652(String arg0, byte arg1) {
        field3917++;
        if (arg0 == null) {
            return;
        }
        if (arg1 >= -126) {
            field3916 = true;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class360.method2193(-113, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class414.field5907; var3++) {
            String var4 = class293.field4361[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class360.method2193(-64, var4);
            if (var5 != null && var5.equals(var2)) {
                class414.field5907--;
                for (int var6 = var3; var6 < class414.field5907; var6++) {
                    class293.field4361[var6] = class293.field4361[var6 + 1];
                    class283.field4121[var6] = class283.field4121[var6 + 1];
                    class66.field824[var6] = class66.field824[var6 + 1];
                    class308.field4526[var6] = class308.field4526[var6 + 1];
                    class105.field1283[var6] = class105.field1283[var6 + 1];
                }
                class205.field2807 = class129.field1601;
                class406.field5762++;
                class244.method1332((byte) 124, class187.field2520);
                class230.field3185.method909(class183.method995((byte) 23, arg0), -1);
                class230.field3185.method935(arg0, 40);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)V")
    public static void method1653(int arg0) {
        if (arg0 != 2000) {
            field3914 = null;
        }
        field3914 = null;
    }

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
    public static final void method1654(int arg0) {
        field3915++;
        if (class56.field714 == 0) {
            return;
        }
        try {
            if (++class233.field3243 > 2000) {
                if (class322.field4655 != null) {
                    class322.field4655.method669(5000);
                    class322.field4655 = null;
                }
                if (class75.field902 >= 1) {
                    class468.field6575 = -5;
                    class56.field714 = 0;
                    return;
                }
                class75.field902++;
                if (class463.field6529 == class335.field4841) {
                    class463.field6529 = class236.field3268;
                } else {
                    class463.field6529 = class335.field4841;
                }
                class233.field3243 = 0;
                class56.field714 = 1;
            }
            if (class56.field714 == 1) {
                class224.field3105 = class42.field512.method2175(class463.field6529, (byte) 102, class169.field2007);
                class56.field714 = 2;
            }
            if (class56.field714 == 2) {
                if (class224.field3105.field5759 == 2) {
                    throw new IOException();
                }
                if (class224.field3105.field5759 != 1) {
                    return;
                }
                class322.field4655 = new class142((Socket) class224.field3105.field5755, class42.field512);
                class224.field3105 = null;
                class322.field4655.method675(class230.field3185.field2206, 0, (byte) -109, class230.field3185.field2159);
                if (class46.field594 != null) {
                    class46.field594.method2655((byte) 106);
                }
                if (class460.field6501 != null) {
                    class460.field6501.method2655((byte) 106);
                }
                int var1 = class322.field4655.method673(-2101);
                if (class46.field594 != null) {
                    class46.field594.method2655((byte) 106);
                }
                if (class460.field6501 != null) {
                    class460.field6501.method2655((byte) 106);
                }
                if (var1 != 21) {
                    class56.field714 = 0;
                    class468.field6575 = var1;
                    class322.field4655.method669(5000);
                    class322.field4655 = null;
                    return;
                }
                class56.field714 = 3;
            }
            int var2 = 84 / ((arg0 - 66) / 40);
            if (class56.field714 == 3) {
                if (class322.field4655.method676((byte) 102) < 1) {
                    return;
                }
                class330.field4750 = new String[class322.field4655.method673(-2101)];
                class56.field714 = 4;
            }
            if (class56.field714 == 4 && class322.field4655.method676((byte) 91) >= class330.field4750.length * 8) {
                class79.field939.field2206 = 0;
                class322.field4655.method672(class79.field939.field2159, 0, (byte) -58, class330.field4750.length * 8);
                for (int var3 = 0; var3 < class330.field4750.length; var3++) {
                    class330.field4750[var3] = class110.method526(class79.field939.method903(-699358864), false);
                }
                class468.field6575 = 21;
                class56.field714 = 0;
                class322.field4655.method669(5000);
                class322.field4655 = null;
            }
        } catch (IOException var4) {
            if (class322.field4655 != null) {
                class322.field4655.method669(5000);
                class322.field4655 = null;
            }
            if (class75.field902 >= 1) {
                class56.field714 = 0;
                class468.field6575 = -4;
            } else {
                if (class463.field6529 == class335.field4841) {
                    class463.field6529 = class236.field3268;
                } else {
                    class463.field6529 = class335.field4841;
                }
                class56.field714 = 1;
                class233.field3243 = 0;
                class75.field902++;
            }
        }
    }
}
