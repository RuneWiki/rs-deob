import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class194 extends class354 {

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field2656 = 0;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Ljv;")
    public static class81 field2655 = new class81();

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Loc;")
    public static class206 field2660;

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(ILwo;)V")
    public class194(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)I")
    public final int method391(int arg0, int arg1) {
        ++field2657;
        if (arg0 != 3) {
            this.method1294((byte) -38);
        }
        return 1;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lwo;)V")
    public class194(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public static void method1293(int arg0) {
        field2660 = null;
        field2655 = null;
        if (arg0 != 1) {
            method1293(-95);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public final void method388(int arg0) {
        if (arg0 != 6384) {
            field2655 = null;
        }
        ++field2659;
        if (super.field4544.method4153(-9) == class722.field10048) {
            super.field4545 = 2;
        }
        if (super.field4545 < 0 || ~super.field4545 < -3) {
            super.field4545 = this.method393((byte) 122);
        }
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)I")
    public final int method1294(byte arg0) {
        int var2 = -120 / ((7 - arg0) / 45);
        ++field2658;
        return super.field4545;
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(II)V")
    public final void method389(int arg0, int arg1) {
        ++field2652;
        super.field4545 = arg1;
        if (arg0 != -1) {
            method1293(-55);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
    public final int method393(byte arg0) {
        ++field2653;
        int var2 = 22 % ((arg0 - 37) / 63);
        return 1;
    }
}
