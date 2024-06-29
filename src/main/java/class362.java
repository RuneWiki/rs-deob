import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class362 extends class481 {

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public int field5481 = -1;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public int field5482 = -1;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5483 = new Rectangle[100];

    @OriginalMember(owner = "client!um", name = "B", descriptor = "Lrn;")
    public static class174 field5488;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public int field5487;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public int field5492;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public int field5494;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public int field5495;

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field5483[var0] = new Rectangle();
        }
        field5488 = new class174(32, -1);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 6)
    public static final void method2272(int arg0) {
        class308.field4710 = -1;
        class467.field6967 = -1;
        class128.field2030 = arg0;
        ++field5485;
        class369.field5593 = -1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZLqa;)Lae;", line = 22)
    public final class163 method13(boolean arg0, class162 arg1) {
        ++field5486;
        class414 var3 = arg1.method240();
        var3.method868(super.field7156, super.field7160, super.field7158);
        class163 var4 = class483.method2876(3, 0);
        if (~this.field5481 != 0) {
            class121 var5 = class367.field5550.method1312((byte) 91, this.field5481).method998(0, this.field5492, (class165) null, (class19) null, -1, 0, (byte) 37, 2048, arg1);
            if (var5 != null) {
                var5.method927(var3, var4.field2516[2], 0);
            }
        }
        if (~this.field5482 != 0) {
            class121 var6 = class367.field5550.method1312((byte) 91, this.field5482).method998(0, this.field5487, (class165) null, (class19) null, -1, 0, (byte) 37, 2048, arg1);
            if (var6 != null) {
                var6.method927(var3, var4.field2516[1], 0);
            }
        }
        if (arg0) {
            return null;
        } else {
            class121 var7 = class367.field5550.method1312((byte) 91, this.field5495).method998(0, this.field5494, (class165) null, (class19) null, -1, 0, (byte) 37, 2048, arg1);
            if (var7 != null) {
                var7.method927(var3, var4.field2516[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V", line = 70)
    public static final void method2273(int arg0, byte arg1, int arg2) {
        if (arg1 == -84) {
            ++field5491;
            class54 var3 = class442.method2651(arg2, 12, -13208);
            var3.method480(0);
            var3.field934 = arg0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZI)V", line = 84)
    public static final void method2274(boolean arg0, int arg1) {
        ++field5493;
        if (!arg0) {
            field5484 = 4;
        }
        class6.field130.method493(false, arg1);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILqa;II)Z", line = 95)
    public final boolean method14(int arg0, class162 arg1, int arg2, int arg3) {
        ++field5489;
        class414 var5 = arg1.method240();
        var5.method868(super.field7156, super.field7160, super.field7158);
        class121 var6 = class367.field5550.method1312((byte) 91, this.field5495).method998(0, this.field5494, (class165) null, (class19) null, -1, 0, (byte) 37, arg0, arg1);
        if (var6 != null && var6.method924(arg3, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field5482 != 0) {
                class121 var7 = class367.field5550.method1312((byte) 91, this.field5482).method998(0, this.field5487, (class165) null, (class19) null, -1, 0, (byte) 37, 131072, arg1);
                if (var7 != null && var7.method924(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field5481 != -1) {
                class121 var8 = class367.field5550.method1312((byte) 91, this.field5481).method998(0, this.field5492, (class165) null, (class19) null, -1, 0, (byte) 37, 131072, arg1);
                if (var8 != null && var8.method924(arg3, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLqa;)V", line = 140)
    public final void method25(byte arg0, class162 arg1) {
        int var3 = 36 / ((arg0 - -45) / 48);
        ++field5490;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 153)
    public static void method2275(byte arg0) {
        if (arg0 < -43) {
            field5483 = null;
            field5488 = null;
        }
    }
}
