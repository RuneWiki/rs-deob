import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class81 {

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field1234 = 0;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Z")
    public static boolean field1237 = false;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lck;")
    public static class119 field1240 = class298.method1987((byte) 91, "compass");

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lck;")
    public static class119 field1244 = class298.method1987((byte) 51, "underlay)3dat");

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public int field1241;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Lwi;")
    public static class23 field1246;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "Lva;")
    public static class36 field1245;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Frame;Llh;I)V", line = 10)
    public static final void method555(Frame arg0, class282 arg1, int arg2) {
        while (true) {
            class275 var3 = arg1.method1868(arg0, -69);
            while (var3.field4496 == 0) {
                class232.method1493(10L, (byte) -51);
            }
            if (var3.field4496 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                if (arg2 != 0) {
                    method559((byte) 123);
                }
                field1236++;
                return;
            }
            class232.method1493(100L, (byte) -51);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V", line = 34)
    public static void method556(boolean arg0) {
        field1240 = null;
        if (!arg0) {
            field1244 = (class119) null;
        }
        field1244 = null;
        field1245 = null;
        field1246 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIBII)V", line = 59)
    public static final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field1235++;
        if (arg5 == 72 && class247.method1609(30881, arg7)) {
            client.method613(class135.field2189[arg7], -1, arg2, arg0, arg1, arg4, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I", line = 75)
    public static int method558(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 121)
    public static final void method559(byte arg0) {
        if (arg0 >= 109) {
            field1239++;
            class126.field1940.method486((byte) 93);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public abstract void method249(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(II)V")
    public abstract void method246(int arg0, int arg1);
}
