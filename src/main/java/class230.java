import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class230 {

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field3568;

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3574 = new String[] { method2013(method2012("5/:bI")), method2013(method2012("5/:\u001f\b3+`\u001dI")), method2013(method2012("5/:gI")), method2013(method2012("5/:W\u000e\u000e6fJ\u000f:j")), method2013(method2012("5/:`I")), method2013(method2012("5/:aI")) };

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "[Lcka;")
    public static class183[] field3571 = new class183[37];

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lhl;")
    public static class556 field3566 = new class556(138, 10);

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[Z")
    public static boolean[] field3573 = new boolean[100];

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V")
    public static final void method2008(byte arg0) {
        try {
            field3572++;
            if (class494.field7431 != 0) {
                try {
                    if (++class667.field9488 > 2000) {
                        class185.field2943.method1540(-74);
                        if (class232.field3607 >= 2) {
                            class268.field4323 = -5;
                            class494.field7431 = 0;
                            return;
                        }
                        class88.field1319.method3884(true);
                        class667.field9488 = 0;
                        class232.field3607++;
                        class494.field7431 = 1;
                    }
                    if (class494.field7431 == 1) {
                        class185.field2943.field2647 = class88.field1319.method3887(class393.field6256, 32380);
                        class494.field7431 = 2;
                    }
                    if (class494.field7431 == 2) {
                        if (class185.field2943.field2647.field3402 == 2) {
                            throw new IOException();
                        }
                        if (class185.field2943.field2647.field3402 != 1) {
                            return;
                        }
                        class185.field2943.field2644 = class523.method3912(15000, (Socket) class185.field2943.field2647.field3407, 0);
                        class185.field2943.field2647 = null;
                        class185.field2943.method1545(86);
                        class494.field7431 = 4;
                    }
                    if (class494.field7431 == 4) {
                        if (!class185.field2943.field2644.method2171((byte) -108, 1)) {
                            return;
                        }
                        class185.field2943.field2644.method2172(class185.field2943.field2660.field2805, -16392, 1, 0);
                        int var1 = class185.field2943.field2660.field2805[0] & 0xFF;
                        class494.field7431 = 0;
                        class268.field4323 = var1;
                        class185.field2943.method1540(-97);
                        return;
                    }
                } catch (IOException var4) {
                    class185.field2943.method1540(-98);
                    if (class232.field3607 >= 2) {
                        class268.field4323 = -4;
                        class494.field7431 = 0;
                    } else {
                        class88.field1319.method3884(true);
                        class232.field3607++;
                        class494.field7431 = 1;
                        class667.field9488 = 0;
                    }
                }
                int var2 = 126 / ((arg0 - 30) / 48);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3574[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field3570++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3574[3] + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(III)V")
    public static final void method2009(int arg0, int arg1, int arg2) {
        try {
            field3569++;
            class551 var3 = class380.method3113(-118, (long) arg1, 13);
            var3.method4086(-33);
            if (arg2 != -13550) {
                field3566 = null;
            }
            var3.field8076 = arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3574[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)V")
    public static final void method2010(byte arg0) {
        try {
            field3567++;
            if (!class445.field6928) {
                class206.method1866(0, class609.field8771);
                if (arg0 == 37) {
                    if (class393.field6261 != null) {
                        class206.method1866(0, class393.field6261);
                    }
                    class445.field6928 = true;
                }
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3574[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(B)V")
    public static void method2011(byte arg0) {
        try {
            field3566 = null;
            field3571 = null;
            if (arg0 > -74) {
                method2011((byte) -75);
            }
            field3573 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3574[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(II)V")
    public class230(int arg0, int arg1) {
        try {
            this.field3568 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3574[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2012(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2013(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 93;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 35;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
