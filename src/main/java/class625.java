import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class625 extends class687 {

    @OriginalMember(owner = "client!qr", name = "A", descriptor = "[S")
    public static short[] field8412 = new short[] { 13, 48, 18, 51, 50, 4, 11, 30 };

    @OriginalMember(owner = "client!qr", name = "F", descriptor = "J")
    public static volatile long field8417 = 0L;

    @OriginalMember(owner = "client!qr", name = "E", descriptor = "F")
    public static float field8416;

    @OriginalMember(owner = "client!qr", name = "z", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!qr", name = "B", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!qr", name = "D", descriptor = "I")
    public static int field8415;

    @OriginalMember(owner = "client!qr", name = "G", descriptor = "I")
    public static int field8418;

    @OriginalMember(owner = "client!qr", name = "H", descriptor = "I")
    public static int field8419;

    @OriginalMember(owner = "client!qr", name = "C", descriptor = "[Lhw;")
    public static class616[] field8414;

    @OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(IIIIIF)V", line = 10)
    public class625(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(FB)V", line = 21)
    public final void method1730(float arg0, byte arg1) {
        if (arg1 != -111) {
            field8416 = -0.75177234F;
        }
        super.field9556 = arg0;
        ++field8419;
    }

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "(I)V", line = 32)
    public static final void method3522(int arg0) {
        class702.field9784 = null;
        class189.field2584 = null;
        class81.field1166 = null;
        if (arg0 < 61) {
            field8417 = 115L;
        }
        class719.field10005 = null;
        class515.field7185 = null;
        ++field8415;
        class78.field1136 = null;
        class674.field9365 = null;
        class535.field7425 = null;
        class622.field8327 = null;
    }

    @OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V", line = 52)
    public static final void method3523(int arg0) {
        ++field8413;
        class720.field10025 = class535.field7417.field2462 - -2 + class535.field7417.field2464;
        class688.field9576 = class524.field7280.field2462 + 2 + class524.field7280.field2464;
        class297.field4232 = new String[500];
        int var1 = 0;
        if (arg0 != 18) {
            field8416 = -0.78757924F;
        }
        while (var1 < class297.field4232.length) {
            class297.field4232[var1] = "";
            ++var1;
        }
        class261.method1772((byte) -111, class155.field2116.method978(class120.field1576, (byte) -118));
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(IIII)V", line = 76)
    public final void method1733(int arg0, int arg1, int arg2, int arg3) {
        ++field8418;
        super.field9555 = arg3;
        if (arg1 != -10672) {
            this.method1733(102, 11, -18, -60);
        }
        super.field9554 = arg2;
        super.field9558 = arg0;
    }

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "(Z)V", line = 93)
    public static void method3524(boolean arg0) {
        field8412 = null;
        if (arg0) {
            field8417 = 77L;
        }
        field8414 = null;
    }
}
