import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class212 {

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "[Lrs;")
    public static class597[] field3106 = new class597[14];

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)I", line = 7)
    public static final int method1388(byte arg0) {
        field3103++;
        if (arg0 != -13) {
            field3106 = null;
        }
        return field3102;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IILfaa;B)V", line = 18)
    public static final void method1389(int arg0, int arg1, class140 arg2, byte arg3) {
        class623.field8684 = arg1;
        class266.field3784 = arg2;
        if (arg3 != 36) {
            field3106 = null;
        }
        class359.field5138 = arg0;
        field3104++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZ)V", line = 32)
    public static final void method1390(int arg0, boolean arg1) {
        field3105++;
        if (arg1 && class148.field2178 != null) {
            class687.field9665 = class148.field2178.field3110;
        } else {
            class687.field9665 = -1;
        }
        class31.field375 = null;
        class148.field2178 = null;
        class160.field2400 = 0;
        class154.field2325 = null;
        class148.method1043();
        class148.field2193.method1269((byte) 109);
        class577.field7759 = null;
        class513.field7017 = null;
        class675.field9543 = -1;
        class148.field2188 = null;
        class186.field2755 = null;
        if (arg0 != 64) {
            method1389(115, 68, null, (byte) -79);
        }
        class232.field3303 = null;
        class623.field8692 = -1;
        class44.field664 = null;
        class383.field5370 = null;
        class117.field1561 = null;
        class490.field6779 = null;
        class201.field2962 = null;
        if (class148.field2180 != null) {
            class148.field2180.method2871(37);
            class148.field2180.method2867(75, 128, 64);
        }
        if (class148.field2184 != null) {
            class148.field2184.method597(64, 64, (byte) -122);
        }
        if (class148.field2185 != null) {
            class148.field2185.method2020((byte) 18, 64);
        }
        class311.field4616.method1194(64, -128);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 87)
    public static void method1391(byte arg0) {
        field3106 = null;
        int var1 = -87 % ((arg0 + 68) / 36);
    }
}
