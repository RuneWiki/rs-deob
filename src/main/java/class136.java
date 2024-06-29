import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class136 {

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "[S")
    public static short[] field2361 = new short[256];

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Lml;")
    public static class160 field2362 = new class160(64);

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field2364 = -1;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "[Z")
    public static boolean[] field2363;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 7)
    public static final void method987(int arg0, boolean arg1) {
        if (!arg1) {
            field2362 = (class160) null;
        }
        field2360++;
        if (class70.field1150 == null || class70.field1150.length < arg0) {
            class70.field1150 = new int[arg0];
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 25)
    public static void method988(byte arg0) {
        if (arg0 >= 21) {
            field2362 = null;
            field2363 = null;
            field2361 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)I", line = 42)
    public static final int method989(int arg0, int arg1) {
        if (arg0 > -73) {
            method987(-89, true);
        }
        field2359++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 62)
    public static final void method990(int arg0) {
        field2358++;
        if (arg0 != 255) {
            method987(-48, true);
        }
        int var1 = class114.method755(2);
        if (var1 == 0) {
            class214.field3639 = (byte[][][]) null;
            class26.method126(-10340, 0);
        } else if (var1 == 1) {
            class245.method1684((byte) -79, (byte) 0);
            class26.method126(-10340, 512);
            class296.method1999(125);
        } else {
            class245.method1684((byte) -44, (byte) (class167.field2970 - 4 & 0xFF));
            class26.method126(arg0 - 10595, 2);
        }
    }
}
