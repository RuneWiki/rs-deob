import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class437 extends class692 {

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field6072;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!fg", name = "j", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZB)V")
    public final void method1117(boolean arg0, byte arg1) {
        if (arg1 != 57) {
            method2608((String) null, (String) null, -1, (String) null, (byte) 14, (String) null, 65);
        }
        ++field6077;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILfga;I)V")
    public final void method1119(int arg0, class377 arg1, int arg2) {
        ++field6073;
        if (arg0 <= 48) {
            this.method1117(true, (byte) -64);
        }
        super.field9753.method3384(arg1, (byte) 82);
        super.field9753.method3375(arg2, (byte) 102);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLgga;)I")
    public static final int method2607(byte arg0, class513 arg1) {
        if (arg0 > -42) {
            return -32;
        } else {
            ++field6075;
            int var2 = 0;
            if (arg1.method3005(class561.field7772, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class406.field5590, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class229.field3331, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class616.field8743, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class759.field10512, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class663.field9340, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class707.field9902, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class55.field874, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class458.field6263, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class216.field3152, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class737.field10232, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class107.field1530, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class324.field4601, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class81.field1204, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class58.field896, (byte) -69)) {
                ++var2;
            }
            if (arg1.method3005(class27.field286, (byte) -69)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;BLjava/lang/String;I)V")
    public static final void method2608(String arg0, String arg1, int arg2, String arg3, byte arg4, String arg5, int arg6) {
        if (arg4 != 120) {
            method2607((byte) -123, (class513) null);
        }
        ++field6074;
        class647.method3660(arg0, arg2, (String) null, arg1, arg3, -1, arg5, arg6, 99);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZI)V")
    public final void method1118(boolean arg0, int arg1) {
        super.field9753.method3313(2912, true);
        ++field6076;
        if (arg1 == -3826) {
            ;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(Llea;)V")
    public class437(class573 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZI)V")
    public final void method1113(int arg0, boolean arg1, int arg2) {
        ++field6078;
        if (arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)Z")
    public final boolean method1112(int arg0) {
        if (arg0 > -124) {
            return true;
        } else {
            ++field6079;
            return true;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public final void method1111(byte arg0) {
        ++field6072;
        super.field9753.method3313(2912, false);
        if (arg0 != 114) {
            this.method1111((byte) 127);
        }
    }
}
