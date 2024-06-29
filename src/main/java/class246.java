import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class246 {

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "[I")
    public static int[] field3707 = new int[13];

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field3708 = 0;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    public static int[] field3712 = new int[2];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Ldh;")
    public static class295 field3710;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)V")
    public static final void method1662(byte arg0, int arg1) {
        field3711++;
        class287 var2 = class33.field964;
        synchronized (class33.field964) {
            if (arg0 >= -104) {
                field3708 = 11;
            }
            class33.field964.method1908(arg1, (byte) -11);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)V")
    public static final void method1663(byte arg0, int arg1) {
        class263.field3848 = new int[arg1];
        class314.field4643 = new int[arg1];
        class70.field1468 = new int[arg1];
        field3709++;
        if (arg0 > -65) {
            method1663((byte) 2, 15);
        }
        class129.field2341 = new int[arg1];
        class706.field9941 = new int[arg1];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static void method1664(int arg0) {
        field3712 = null;
        if (arg0 == 22943) {
            field3710 = null;
            field3707 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
    public static final void method1665(int arg0, int arg1) {
        field3706++;
        class19 var2 = class373.method2355(86, arg1, 9);
        if (arg0 != 31200) {
            method1664(-94);
        }
        var2.method438(806);
    }
}
