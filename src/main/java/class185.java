import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class185 {

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3025 = "Started 3d Library";

    @OriginalMember(owner = "client!la", name = "f", descriptor = "B")
    public byte field3026;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Ljava/lang/String;")
    public String field3024;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "Ljava/lang/String;")
    public String field3027;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "Ljava/lang/String;")
    public String field3028;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method1328(byte arg0) {
        field3025 = null;
        if (arg0 != -48) {
            field3025 = null;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ZZ)V")
    public static final void method1329(boolean arg0, boolean arg1) {
        class280.field4486 = null;
        class275.field4426 = null;
        class94.field1523 = null;
        class275.field4419 = null;
        if (arg1 && class275.field4417 != null) {
            class133.field2114 = class275.field4417.field1271;
        } else {
            class133.field2114 = -1;
        }
        class275.field4421 = null;
        class275.field4432 = null;
        class275.field4431 = null;
        class90.field1468 = 0;
        class275.field4417 = null;
        class275.field4429 = null;
        class275.field4433 = null;
        class275.field4430 = null;
        field3023++;
        class275.field4411.method392(1);
        class68.field1132 = -1;
        class59.field968 = null;
        class301.field4815 = -1;
        class229.field3699 = null;
        class275.field4410 = null;
        class296.field4734 = null;
        class60.field983 = null;
        class73.field1233 = null;
        class148.field2315 = null;
        class149.field2325 = null;
        if (arg0) {
            method1328((byte) -50);
        }
        class108.field1733 = null;
        class291.field4677 = null;
        class158.method1076((byte) -117);
        class48.field802 = null;
        class313.field4985 = null;
        class240.field3835 = null;
        class99.method678(128, 64, 109);
        class207.method1450((byte) -112, 64, 64);
        class66.method467(64, (byte) 113);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1330(int arg0, boolean arg1) {
        field3029++;
        return arg1 ? null : (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFA6ED) >> 16) + "." + ((arg0 & 0xFF47) >> 8) + "." + (arg0 & 0xFF);
    }
}
