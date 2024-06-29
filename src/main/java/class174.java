import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class174 extends class259 {

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lhk;")
    public class63 field2546;

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2545 = null;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "Ljk;")
    public static class297 field2550 = null;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Lhl;")
    public static class139 field2551 = new class139(32);

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "Ljava/lang/String;")
    public static String field2553 = "M";

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IZI)V")
    public static final void method1157(int arg0, boolean arg1, int arg2) {
        class234.field3607[arg0] = arg2;
        if (arg1) {
            field2551 = null;
        }
        field2548++;
        class280 var3 = (class280) class47.field797.method306((long) arg0, 16216);
        if (var3 == null) {
            class280 var4 = new class280(4611686018427387905L);
            class47.field797.method309((byte) -8, var4, (long) arg0);
        } else if (var3.field4300 != 4611686018427387905L) {
            var3.field4300 = class257.method1736(14361) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public static final void method1158(byte arg0) {
        class211.field3148.method944(65535);
        if (arg0 > -88) {
            method1158((byte) -75);
        }
        field2549++;
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field2551 = null;
        field2545 = null;
        field2550 = null;
        if (arg0 == 2245) {
            field2553 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lhk;)V")
    public class174(class63 arg0) {
        this.field2546 = arg0;
    }
}
