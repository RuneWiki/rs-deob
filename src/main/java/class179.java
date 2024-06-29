import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class179 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field3235 = 0;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Z")
    public static boolean field3232 = false;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[[B")
    public static byte[][] field3237 = new byte[250][];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1255(int arg0, Component arg1) {
        arg1.removeMouseListener(class75.field1502);
        field3238++;
        arg1.removeMouseMotionListener(class75.field1502);
        arg1.removeFocusListener(class75.field1502);
        class180.field3240 = arg0;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljd;IIII)V")
    public static final void method1256(class86 arg0, int arg1, int arg2, int arg3, int arg4) {
        class6 var5 = class229.method1596(arg2, arg4, (byte) -27);
        field3234++;
        if (var5 == null) {
            return;
        }
        if (var5.field133 != null) {
            class55 var6 = new class55();
            var6.field1114 = var5;
            var6.field1128 = var5.field133;
            var6.field1123 = arg0;
            var6.field1118 = arg1;
            class59.method427(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field100 > 0) {
            var7 = class4.method25((byte) -74, var5);
        }
        if (!var7 || !class268.method1839((byte) -78, client.method1111(var5), arg1 - 1)) {
            return;
        }
        if (arg1 == 1) {
            class126.field2434++;
            class36.field809.method1356(174, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -112, arg2);
        }
        if (arg1 == 2) {
            class36.field809.method1356(11, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -99, arg2);
            class204.field3685++;
        }
        if (arg1 == 3) {
            class274.field4815++;
            class36.field809.method1356(232, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -92, arg2);
        }
        if (arg1 == 4) {
            class36.field809.method1356(44, true);
            class36.field809.method1406(1472534024, arg4);
            class207.field3760++;
            class36.field809.method1428((byte) -3, arg2);
        }
        int var8 = -65 % ((-arg3 - 3) / 51);
        if (arg1 == 5) {
            class36.field809.method1356(218, true);
            class69.field1397++;
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) 10, arg2);
        }
        if (arg1 == 6) {
            class147.field2763++;
            class36.field809.method1356(155, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -113, arg2);
        }
        if (arg1 == 7) {
            class195.field3490++;
            class36.field809.method1356(124, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) 30, arg2);
        }
        if (arg1 == 8) {
            class36.field809.method1356(54, true);
            class275.field4826++;
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -97, arg2);
        }
        if (arg1 == 9) {
            class36.field809.method1356(176, true);
            class268.field4719++;
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) -93, arg2);
        }
        if (arg1 == 10) {
            class36.field809.method1356(170, true);
            class36.field809.method1406(1472534024, arg4);
            class36.field809.method1428((byte) 15, arg2);
            class106.field2039++;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method1257(int arg0) {
        if (arg0 != -8) {
            field3233 = 24;
        }
        field3237 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB)Z")
    public static final boolean method1258(int arg0, byte arg1) {
        field3231++;
        if (class49.field1039[arg0]) {
            return true;
        } else if (class22.field566.method1094(arg0, 99)) {
            int var2 = class22.field566.method1075(arg0, arg1 - 72);
            if (var2 == 0) {
                class49.field1039[arg0] = true;
                return true;
            }
            if (arg1 != -36) {
                method1255(35, (Component) null);
            }
            if (class108.field2070[arg0] == null) {
                class108.field2070[arg0] = new class6[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class108.field2070[arg0][var3] == null) {
                    byte[] var4 = class22.field566.method1084((byte) -122, arg0, var3);
                    if (var4 != null) {
                        class108.field2070[arg0][var3] = new class6();
                        class108.field2070[arg0][var3].field222 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class108.field2070[arg0][var3].method37(-19180, new class200(var4));
                        } else {
                            class108.field2070[arg0][var3].method39(new class200(var4), (byte) -1);
                        }
                    }
                }
            }
            class49.field1039[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljd;Ljd;IBLjd;)V")
    public static final void method1259(class86 arg0, class86 arg1, int arg2, byte arg3, class86 arg4) {
        if (arg3 > -42) {
            field3232 = false;
        }
        class9.method58(-1, arg1, arg4, (byte) -128, arg0, arg2);
        field3236++;
    }
}
