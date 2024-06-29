import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class256 extends class215 implements class158 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    private int field3252;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "Lkg;")
    public static class275 field3256 = new class275(86, 3);

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "[[B")
    public static byte[][] field3258;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V")
    public static void method1558(byte arg0) {
        field3258 = null;
        if (arg0 != 86) {
            field3258 = null;
        }
        field3256 = null;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lbi;I[BI)V")
    public class256(class483 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3252 = arg1;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)J")
    public final long method1105(byte arg0) {
        ++field3251;
        return arg0 > -85 ? 60L : super.field2847.getAddress();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
    public static final void method1559() {
        class4.method18(1, class29.field515);
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I[BII)V")
    public final void method1107(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg2 != 21189) {
            method1559();
        }
        ++field3255;
        this.method1374(arg1, arg3);
        this.field3252 = arg0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
    public final int method1104(int arg0) {
        int var2 = 117 % ((arg0 - 69) / 57);
        ++field3254;
        return this.field3252;
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)I")
    public final int method1106(byte arg0) {
        ++field3257;
        if (arg0 != -79) {
            method1558((byte) -22);
        }
        return 0;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLha;J)V")
    public static final void method1560(boolean arg0, class60 arg1, long arg2) {
        class63.field879 = 0;
        class708.field9836 = class97.field1356;
        class611.field8466 = 0;
        if (arg0) {
            field3258 = null;
        }
        ++field3253;
        class97.field1356 = 0;
        long var4 = class446.method2525(500);
        for (class509 var6 = (class509) class259.field3282.method162(-22305); var6 != null; var6 = (class509) class259.field3282.method158(false)) {
            if (var6.method2966(arg1, arg2)) {
                ++class611.field8466;
            }
        }
        if (class623.field8569 && ~(arg2 % 100L) == -1L) {
            System.out.println("Particle system count: " + class259.field3282.method161(-13282) + ", running: " + class611.field8466);
            System.out.println("Emitters: " + class63.field879 + " Particles: " + class97.field1356 + ". Time taken: " + (class446.method2525(500) - var4) + "ms");
        }
    }
}
