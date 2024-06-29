import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class159 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Z")
    public boolean field2436 = false;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2440 = 0;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lta;")
    public static class262 field2442 = new class262(50);

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lf;II)V")
    public final void method1074(class37 arg0, int arg1, int arg2) {
        field2437++;
        while (true) {
            int var4 = arg0.method333((byte) -59);
            if (var4 == 0) {
                if (arg2 == 0) {
                    return;
                } else {
                    field2440 = -19;
                    return;
                }
            }
            this.method1075(false, arg1, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZILf;I)V")
    private final void method1075(boolean arg0, int arg1, class37 arg2, int arg3) {
        if (arg3 == 1) {
            this.field2438 = arg2.method293(-24);
        } else if (arg3 == 2) {
            this.field2441 = arg2.method336(23362);
        } else if (arg3 == 3) {
            this.field2436 = true;
        } else if (arg3 == 4) {
            this.field2438 = -1;
        }
        if (arg0) {
            this.field2436 = true;
        }
        field2443++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
    public static void method1076(boolean arg0) {
        field2442 = null;
        if (!arg0) {
            field2442 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZ)Lcg;")
    public final class168 method1077(int arg0, int arg1, boolean arg2) {
        class168 var4 = (class168) class25.field390.method1780((long) ((arg2 ? 262144 : 0) | arg1 << 16 | this.field2438), (byte) -114);
        if (arg0 >= -108) {
            this.method1074((class37) null, -21, 111);
        }
        field2439++;
        if (var4 != null) {
            return var4;
        }
        class65.field1034.method1147(this.field2438, -120);
        class168 var5 = class160.method1080(5, this.field2438, class65.field1034, 0);
        if (var5 != null) {
            var5.method1120(class239.field3712, class261.field4024, class175.field2595);
            var5.field2674 = var5.field2676;
            var5.field2669 = var5.field2670;
            if (arg2) {
                var5.method1118();
            }
            for (int var6 = 0; var6 < arg1; var6++) {
                var5.method1114();
            }
            class25.field390.method1784(var5, false, (long) (arg1 << 16 | this.field2438 | (arg2 ? 262144 : 0)));
        }
        return var5;
    }
}
