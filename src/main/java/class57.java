import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class57 extends class96 {

    @OriginalMember(owner = "client!dl", name = "yb", descriptor = "[I")
    public static int[] field802 = new int[2];

    @OriginalMember(owner = "client!dl", name = "zb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dl", name = "Ab", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!dl", name = "Bb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILes;)V", line = 5)
    public static final void method499(int arg0, int arg1, int arg2, class348 arg3) {
        class486 var4 = class80.method635(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field6748 = arg3;
        }
    }

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "(I)V", line = 11)
    public static void method500(int arg0) {
        field802 = null;
        if (arg0 != 150198248) {
            field802 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(FI)V", line = 21)
    public final void method501(float arg0, int arg1) {
        if (arg1 < 110) {
            method502(-75, -99, (byte) 53, 125);
        }
        ++field804;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field1316[super.field1301++] = (byte) var3;
        super.field1316[super.field1301++] = (byte) (var3 >> 8);
        super.field1316[super.field1301++] = (byte) (var3 >> 16);
        super.field1316[super.field1301++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 38)
    public class57(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIBI)V", line = 43)
    public static final void method502(int arg0, int arg1, byte arg2, int arg3) {
        ++field803;
        String var4 = "tele " + arg0 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (63 & arg3) + "," + (63 & arg1);
        System.out.println(var4);
        if (arg2 != -18) {
            method502(34, -46, (byte) -23, 23);
        }
        class693.method3806(false, var4, true, 4);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BF)V", line = 63)
    public final void method503(byte arg0, float arg1) {
        if (arg0 == 30) {
            ++field805;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field1316[super.field1301++] = (byte) (var3 >> 24);
            super.field1316[super.field1301++] = (byte) (var3 >> 16);
            super.field1316[super.field1301++] = (byte) (var3 >> 8);
            super.field1316[super.field1301++] = (byte) var3;
        }
    }
}
