import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class293 {

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "J")
    public static long field4509 = 0L;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4511 = "Attack";

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field4515 = 7759444;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "F")
    public static float field4508;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 9)
    public static final void method1909(int arg0) {
        field4514++;
        class63.field950.method491(arg0);
        for (int var1 = 0; var1 < 32; var1++) {
            class229.field3692[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class29.field364[var2] = 0L;
        }
        class33.field429 = arg0;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 32)
    public static void method1910(int arg0) {
        if (arg0 <= 31) {
            method1914(44, (class334) null);
        }
        field4511 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 45)
    public static final void method1911(String arg0, String arg1, int arg2, int arg3, String arg4) {
        class128.method862(arg4, arg1, -1, true, arg0, arg2);
        field4510++;
        if (arg3 != -31574) {
            method1914(-85, (class334) null);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 56)
    public static final void method1912(byte arg0) {
        if (class310.field4923 == 2) {
            if (class302.field4661 == class286.field4384 && class308.field4847 == class255.field3984) {
                class310.field4923 = 0;
                if (class86.field1301 && class294.field4534[81] && class168.field2565 > 2) {
                    class215.method1436((byte) 33, class168.field2565 - 2);
                } else {
                    class215.method1436((byte) 103, class168.field2565 - 1);
                }
            }
        } else if (class85.field1295 == class302.field4661 && class7.field81 == class308.field4847) {
            class310.field4923 = 0;
            if (class86.field1301 && class294.field4534[81] && class168.field2565 > 2) {
                class215.method1436((byte) -122, class168.field2565 - 2);
            } else {
                class215.method1436((byte) 104, class168.field2565 - 1);
            }
        } else {
            class310.field4923 = 2;
            class255.field3984 = class7.field81;
            class286.field4384 = class85.field1295;
        }
        field4512++;
        if (arg0 != -76) {
            method1914(6, (class334) null);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)V", line = 121)
    public static final void method1913(byte arg0, int arg1) {
        class276.field4262.method1287(arg1, 127);
        class56.field781.method1287(arg1, 116);
        class109.field1685.method1287(arg1, 123);
        field4506++;
        int var2 = 42 % ((arg0 - 7) / 37);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILed;)V", line = 134)
    public static final void method1914(int arg0, class334 arg1) {
        field4513++;
        class235.field3784 = arg1;
        if (arg0 != -14005) {
            method1910(-28);
        }
    }
}
