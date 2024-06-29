import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class302 {

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field4132 = 16777215;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    public int field4136 = 8;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field4143 = 2;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public int field4141;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "Lpl;")
    public static class303 field4135;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Z")
    public boolean field4134;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Llk;II)V", line = 3)
    private final void method1836(class425 arg0, int arg1, int arg2) {
        if (arg1 != 11366) {
            this.field4134 = true;
        }
        field4139++;
        if (arg2 == 1) {
            this.field4136 = arg0.method2508(true);
        } else if (arg2 == 2) {
            this.field4134 = true;
        } else if (arg2 == 3) {
            this.field4137 = arg0.method2514(9786);
            this.field4140 = arg0.method2514(9786);
            this.field4144 = arg0.method2514(9786);
        } else if (arg2 == 4) {
            this.field4141 = arg0.method2503(true);
            return;
        } else if (arg2 == 5) {
            this.field4138 = arg0.method2508(true);
            return;
        } else if (arg2 == 6) {
            this.field4132 = arg0.method2498(3);
            return;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILlk;)V", line = 51)
    public final void method1837(int arg0, class425 arg1) {
        field4131++;
        while (true) {
            int var3 = arg1.method2503(true);
            if (var3 == 0) {
                if (arg0 == 5) {
                    return;
                } else {
                    this.field4132 = 24;
                    return;
                }
            }
            this.method1836(arg1, arg0 ^ 0x2C63, var3);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B[I[Ljava/lang/Object;)V", line = 82)
    public static final void method1838(byte arg0, int[] arg1, Object[] arg2) {
        class335.method1996(arg1, (byte) -92, arg2, 0, arg1.length - 1);
        field4133++;
        if (arg0 >= -121) {
            field4143 = 2;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BI)I", line = 98)
    public static final int method1839(byte arg0, int arg1) {
        if (arg0 == 16) {
            field4130++;
            return arg1 >>> 8;
        } else {
            return -121;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V", line = 115)
    public static void method1840(int arg0) {
        field4135 = null;
        if (arg0 != -3801) {
            method1840(-93);
        }
    }
}
