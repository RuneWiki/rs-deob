import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class178 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2438 = "Discard";

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "[[[B")
    public static byte[][][] field2439;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lfh;Lfh;B)V", line = 8)
    public static final void method1312(class140 arg0, class140 arg1, byte arg2) {
        class327.field4771 = class306.method2143(arg0, arg1, 18265, class245.field3587, 0);
        if (class47.field623) {
            class293.field4263 = class171.method1260(0, arg1, class245.field3587, arg0, 1);
        } else {
            class293.field4263 = (class230) class327.field4771;
        }
        field2441++;
        class235.field3374 = class306.method2143(arg0, arg1, 18265, class80.field1031, 0);
        class186.field2554 = class306.method2143(arg0, arg1, 18265, class195.field2693, 0);
        if (arg2 < 68) {
            field2439 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(CLjava/lang/String;Z)I", line = 38)
    public static final int method1313(char arg0, String arg1, boolean arg2) {
        int var3 = 0;
        field2440++;
        int var4 = arg1.length();
        if (arg2) {
            return -30;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V", line = 63)
    public static final void method1314(byte arg0) {
        class160.field2292 = 0;
        client.field1632 = arg0;
        field2437++;
        class5.field53 = 0;
        class116.field1499 = 0;
        class133.field1818 = false;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V", line = 76)
    public static void method1315(byte arg0) {
        if (arg0 >= -28) {
            field2438 = (String) null;
        }
        field2438 = null;
        field2439 = (byte[][][]) null;
    }
}
