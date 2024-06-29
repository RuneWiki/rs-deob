import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class271 extends class332 {

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "[B")
    public byte[] field4260;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lkk;")
    public static class248 field4259 = new class248();

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "J")
    public static long field4261 = 0L;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[S")
    public static short[] field4264 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "[S")
    public static short[] field4265 = new short[] { 38, 36, 58, 17, 23, 34, 9, 21 };

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Ldh;")
    public static class179 field4262 = new class179(64);

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "Llc;")
    public static class175 field4266;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 6)
    public static void method1964(int arg0) {
        if (arg0 >= -16) {
            field4259 = (class248) null;
        }
        field4262 = null;
        field4266 = null;
        field4264 = null;
        field4259 = null;
        field4265 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "([B)V", line = 23)
    public class271(byte[] arg0) {
        this.field4260 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZBII)V", line = 33)
    public static final void method1965(boolean arg0, byte arg1, int arg2, int arg3) {
        field4263++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg1 <= 48) {
            method1965(true, (byte) 46, 87, 109);
        }
        class276.field4312 = arg3;
        class235.field3413 = arg2;
        class177.field2566 = arg0;
    }
}
