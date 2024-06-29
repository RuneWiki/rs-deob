import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class253 {

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Lqc;")
    public static class329 field4353 = new class329(128);

    @OriginalMember(owner = "client!v", name = "f", descriptor = "Lhi;")
    public static class82 field4357 = class95.method664((byte) -78, "(U");

    @OriginalMember(owner = "client!v", name = "g", descriptor = "Lhi;")
    private static class82 field4358 = class95.method664((byte) -32, "Loading config )2 ");

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lhi;")
    public static class82 field4356 = field4358;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lhi;")
    public static class82 field4364 = class95.method664((byte) -112, "<col=ffffff>");

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lhi;")
    private static class82 field4363 = class95.method664((byte) -115, "Loaded sprites");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lhi;")
    public static class82 field4360 = field4363;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "F")
    public static float field4361;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lbh;")
    public static class18 field4354;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)I", line = 14)
    public static final int method1816(int arg0, int arg1, int arg2) {
        class164 var3 = (class164) class67.field1038.method507((long) arg1, 602425312);
        field4355++;
        if (arg2 > -72) {
            field4356 = (class82) null;
        }
        if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field2870.length > arg0) {
            return var3.field2870[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 39)
    public static void method1817(int arg0) {
        int var1 = -5 % ((arg0 + 8) / 51);
        field4364 = null;
        field4354 = null;
        field4360 = null;
        field4357 = null;
        field4353 = null;
        field4358 = null;
        field4363 = null;
        field4356 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V", line = 70)
    public static final void method1818(int arg0, int arg1) {
        if (arg1 != 9043) {
            field4361 = 0.25826985F;
        }
        field4362++;
        class265.field4526 = arg0;
        class60.method394(3, -1);
        class60.method394(4, -1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V", line = 91)
    public static final void method1819(byte arg0, int arg1) {
        field4352++;
        class227 var2 = class215.method1531(-1, 3, arg1);
        if (arg0 < 108) {
            method1816(88, 16, -118);
        }
        var2.method1624((byte) -101);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)Lhi;", line = 109)
    public static final class82 method1820(int arg0, int arg1) {
        field4359++;
        class82 var2 = new class82();
        var2.field1419 = new byte[arg0];
        var2.field1468 = arg1;
        return var2;
    }
}
