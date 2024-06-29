import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class297 {

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lve;")
    public static class527 field4470 = new class527(5, 1);

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field4475 = 50;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[I")
    public static int[] field4476 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "[I")
    public static int[] field4480 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "[I")
    public static int[] field4479 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "[I")
    public static int[] field4481 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field4477 = new String[field4475];

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[I")
    public static int[] field4478 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "[I")
    public static int[] field4482 = new int[field4475];

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lhf;")
    public static class413 field4474 = new class413();

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lqda;")
    public static class112 field4483;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BI)Lol;")
    public final class297 method1986(byte arg0, int arg1) {
        field4467++;
        int var3 = -60 / ((30 - arg0) / 50);
        return new class297(this.field4473, arg1, this.field4472, this.field4471);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILwq;I)V")
    public static final void method1987(int arg0, int arg1, class176 arg2, int arg3) {
        if (arg1 != -16777216) {
            return;
        }
        field4466++;
        class510 var4 = arg2.method1323(-21340, class638.field8979);
        if (var4 == null) {
            return;
        }
        class638.field8979.method455(arg0, arg3, arg2.field2673 + arg0, arg2.field2664 + arg3);
        if (class2.field22 >= 3) {
            class638.field8979.method494(-16777216, var4, arg0, arg3);
        } else {
            class351.field5116.method797((float) arg2.field2673 / 2.0F + (float) arg0, (float) arg2.field2664 / 2.0F + (float) arg3, 4096, ((int) (-class562.field8001) & 0x3FFF) << 2, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static final void method1988(int arg0) {
        class204.field2988.method2364(1);
        field4469++;
        if (arg0 != 16300) {
            method1989(false);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public static void method1989(boolean arg0) {
        field4476 = null;
        field4474 = null;
        field4482 = null;
        field4480 = null;
        field4478 = null;
        field4477 = null;
        field4479 = null;
        field4470 = null;
        field4481 = null;
        field4483 = null;
        if (arg0) {
            field4481 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIII)V")
    public class297(int arg0, int arg1, int arg2, int arg3) {
        this.field4472 = arg2;
        this.field4473 = arg0;
        this.field4471 = arg3;
        this.field4468 = arg1;
    }
}
