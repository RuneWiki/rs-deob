import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class453 extends class254 {

    @OriginalMember(owner = "client!uba", name = "Jb", descriptor = "I")
    public static int field6502 = 0;

    @OriginalMember(owner = "client!uba", name = "Gb", descriptor = "Ljb;")
    public static class519 field6499 = new class519(117, -2);

    @OriginalMember(owner = "client!uba", name = "Lb", descriptor = "Lwv;")
    public static class37 field6504 = new class37();

    @OriginalMember(owner = "client!uba", name = "Fb", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!uba", name = "Hb", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!uba", name = "Ib", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!uba", name = "Kb", descriptor = "Ljda;")
    public static class239 field6503;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IF)V")
    public final void method2692(int arg0, float arg1) {
        if (arg0 <= -60) {
            ++field6500;
            int var3 = Stream.floatToRawIntBits(arg1);
            super.field3789[super.field3725++] = (byte) (var3 >> 24);
            super.field3789[super.field3725++] = (byte) (var3 >> 16);
            super.field3789[super.field3725++] = (byte) (var3 >> 8);
            super.field3789[super.field3725++] = (byte) var3;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(FI)V")
    public final void method2693(float arg0, int arg1) {
        ++field6501;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field3789[super.field3725++] = (byte) var3;
        if (arg1 != -1001058736) {
            field6502 = -42;
        }
        super.field3789[super.field3725++] = (byte) (var3 >> 8);
        super.field3789[super.field3725++] = (byte) (var3 >> 16);
        super.field3789[super.field3725++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(I)V")
    public class453(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uba", name = "z", descriptor = "(I)V")
    public static final void method2694(int arg0) {
        ++field6498;
        class428 var1 = (class428) class318.field4527.method679((byte) -86);
        if (arg0 > -127) {
            field6502 = 116;
        }
        boolean var2 = class528.field7306 != null || class28.field281 > 0;
        int var3 = var1.method375(118);
        int var4 = var1.method379(true);
        if (var2) {
            class333.field4719 = 1;
        }
        if (!var2) {
            class702.method3828(2, class191.field2474, var3, var4);
        } else {
            class295.field4181 = class191.field2474;
        }
    }

    @OriginalMember(owner = "client!uba", name = "A", descriptor = "(I)V")
    public static void method2695(int arg0) {
        field6503 = null;
        int var1 = 112 % ((arg0 - 32) / 63);
        field6499 = null;
        field6504 = null;
    }
}
