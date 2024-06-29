import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class188 extends class627 {

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "J")
    public long field2467;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "Laca;")
    public static class580 field2468 = new class580();

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "[F")
    public static float[] field2473 = new float[4];

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "Lpaa;")
    public static class624 field2470;

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "Lco;")
    public static class634 field2466;

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "[Lac;")
    public static class712[] field2469;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1196(boolean arg0) {
        if (!arg0) {
            field2466 = null;
        }
        field2470 = null;
        field2469 = null;
        field2473 = null;
        field2468 = null;
        field2466 = null;
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "()V", line = 22)
    public class188() {
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(J)V", line = 24)
    public class188(long arg0) {
        this.field2467 = arg0;
    }

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "(Z)V", line = 40)
    public static final void method1197(boolean arg0) {
        class440.method2595(2, 22050, class223.field2944.field613.method1611((byte) -121) == 1, true);
        if (arg0) {
            return;
        }
        field2471++;
        class761.field10601 = class619.method3398(class68.field939, 0, 82, 22050, class681.field9312);
        class547.method3113(6, class497.method2887(9, null), true);
        class152.field1853 = class619.method3398(class68.field939, 1, 98, 2048, class681.field9312);
        class668.field9148 = new class99();
        class152.field1853.method1281(28305, class668.field9148);
        class441.field6191 = new class161(22050, class554.field7780);
        class519.method2979((byte) -77);
    }
}
