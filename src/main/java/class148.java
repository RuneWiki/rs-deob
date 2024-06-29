import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class148 extends class16 {

    @OriginalMember(owner = "client!la", name = "Q", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!la", name = "R", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!la", name = "T", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!la", name = "U", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!la", name = "V", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!la", name = "W", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!la", name = "X", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!la", name = "S", descriptor = "Lkb;")
    public static class39 field2210;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(IB)I", line = 5)
    public static final int method1033(int arg0, byte arg1) {
        field2214++;
        int var2 = 0;
        if (arg1 != -19) {
            return 92;
        }
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lkb;Lnf;Lkb;I)V", line = 54)
    public static final void method1034(class39 arg0, class73 arg1, class39 arg2, int arg3) {
        field2211++;
        class255.field4047 = arg2;
        class163.field2654 = arg0;
        class27.field395 = arg1;
        if (class255.field4047 != null) {
            class29.field418 = class255.field4047.method261(-127, 1);
        }
        if (arg3 <= 69) {
            field2213 = 66;
        }
        if (class163.field2654 != null) {
            class325.field5068 = class163.field2654.method261(-121, 1);
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)[I", line = 74)
    public final int[] method8(boolean arg0, int arg1) {
        field2212++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (!arg0) {
            field2210 = (class39) null;
        }
        if (this.field207.field4024) {
            class213.method1551(var3, 0, class276.field4376, class130.field1921[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(II)V", line = 99)
    public static final void method1035(int arg0, int arg1) {
        for (class71 var2 = class101.field1550.method1746((byte) -33); var2 != null; var2 = class101.field1550.method1749((byte) -124)) {
            if ((long) arg0 == (var2.field916 >> 48 & 0xFFFFL)) {
                var2.method465((byte) -122);
            }
        }
        field2208++;
        if (arg1 != 121502384) {
            field2210 = (class39) null;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "()V", line = 121)
    public class148() {
        super(0, true);
    }

    @OriginalMember(owner = "client!la", name = "g", descriptor = "(I)V", line = 125)
    public static void method1036(int arg0) {
        field2210 = null;
        if (arg0 <= 4) {
            method1033(-42, (byte) 30);
        }
    }
}
