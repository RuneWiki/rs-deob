import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class359 {

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public int field4637 = 128;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public int field4633 = 128;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public int field4640;

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field4641;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "Lpi;")
    public static class340 field4642 = new class340(38, 2);

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "F")
    public static float field4647 = 1.0F;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "Ljr;")
    public static class357 field4648 = new class357(8);

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 8)
    public static void method2113(byte arg0) {
        field4642 = null;
        if (arg0 < 20) {
            method2114(-66);
        }
        field4648 = null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V", line = 23)
    public static final void method2114(int arg0) {
        field4646++;
        if (!class421.field5647.method648(-57, class520.field7690) && class473.field6914 != class366.field4715) {
            class414.method2437(false, (byte) -56, class53.field719, false, class415.field5529);
            return;
        }
        class472.method2833(518, class512.field7538);
        if (class366.field4715 != class306.field3935) {
            class466.method2813((byte) 0);
        }
        if (arg0 != 8) {
            method2114(-110);
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V", line = 85)
    public class359(int arg0) {
        this.field4640 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIIIII)V", line = 95)
    private class359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4641 = arg5;
        this.field4640 = arg0;
        this.field4637 = arg2;
        this.field4643 = arg3;
        this.field4633 = arg1;
        this.field4639 = arg4;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)Lsq;", line = 52)
    public final class359 method2115(byte arg0) {
        field4638++;
        if (arg0 != -73) {
            this.method2115((byte) 40);
        }
        return new class359(this.field4640, this.field4633, this.field4637, this.field4643, this.field4639, this.field4641);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lsq;B)V", line = 66)
    public final void method2116(class359 arg0, byte arg1) {
        this.field4641 = arg0.field4641;
        if (arg1 != -59) {
            this.field4637 = 2;
        }
        this.field4633 = arg0.field4633;
        this.field4640 = arg0.field4640;
        this.field4637 = arg0.field4637;
        this.field4643 = arg0.field4643;
        field4644++;
        this.field4639 = arg0.field4639;
    }
}
