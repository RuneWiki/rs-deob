import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class209 extends class115 {

    @OriginalMember(owner = "client!nea", name = "Bb", descriptor = "Z")
    public static boolean field2465 = false;

    @OriginalMember(owner = "client!nea", name = "Eb", descriptor = "[I")
    public static int[] field2468 = new int[1000];

    @OriginalMember(owner = "client!nea", name = "Cb", descriptor = "I")
    public static int field2466 = -1;

    @OriginalMember(owner = "client!nea", name = "Db", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nea", name = "Fb", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!nea", name = "Gb", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!nea", name = "Hb", descriptor = "Lbea;")
    public static class702 field2471;

    @OriginalMember(owner = "client!nea", name = "u", descriptor = "(I)V", line = 13)
    public static void method1241(int arg0) {
        field2471 = null;
        if (arg0 == -23375) {
            field2468 = null;
        }
    }

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(I)V", line = 30)
    public class209(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(IF)V", line = 34)
    public final void method1242(int arg0, float arg1) {
        ++field2467;
        int var3 = Stream.floatToRawIntBits(arg1);
        if (arg0 == -12989) {
            super.field1269[super.field1218++] = (byte) (var3 >> 24);
            super.field1269[super.field1218++] = (byte) (var3 >> 16);
            super.field1269[super.field1218++] = (byte) (var3 >> 8);
            super.field1269[super.field1218++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!nea", name = "b", descriptor = "(IF)V", line = 51)
    public final void method1243(int arg0, float arg1) {
        ++field2470;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field1269[super.field1218++] = (byte) var3;
        if (arg0 < 35) {
            field2466 = 64;
        }
        super.field1269[super.field1218++] = (byte) (var3 >> 8);
        super.field1269[super.field1218++] = (byte) (var3 >> 16);
        super.field1269[super.field1218++] = (byte) (var3 >> 24);
    }
}
