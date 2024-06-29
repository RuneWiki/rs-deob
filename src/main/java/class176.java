import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class176 extends class220 {

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "B")
    public byte field3014 = 5;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public int field3018;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "Z")
    public boolean field3024;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Ldea;")
    public static final class355 method1378(int arg0, byte arg1) {
        field3020++;
        class355 var2 = (class355) class189.field3191.method80((byte) -114, (long) arg0);
        if (arg1 < 86) {
            field3019 = 77;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class161.field2511.method2624(0, 0, arg0);
        class355 var4 = new class355();
        if (var3 != null) {
            var4.method2274(arg0, new class301(var3), 51);
        }
        class189.field3191.method67((long) arg0, var4, -6772);
        return var4;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method1379(int arg0, int arg1) {
        field3023++;
        if (arg0 != 0) {
            field3019 = 108;
        }
        class14 var2 = class599.field8488;
        synchronized (class599.field8488) {
            class599.field8488.method68(-16878, arg1);
        }
    }
}
