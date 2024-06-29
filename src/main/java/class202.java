import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class202 extends class331 {

    @OriginalMember(owner = "client!lw", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2579 = null;

    @OriginalMember(owner = "client!lw", name = "u", descriptor = "F")
    public static float field2581 = 1.0F;

    @OriginalMember(owner = "client!lw", name = "m", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!lw", name = "n", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!lw", name = "o", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!lw", name = "q", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!lw", name = "r", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!lw", name = "v", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!lw", name = "w", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)Z", line = 3)
    public final boolean method1254(byte arg0) {
        if (arg0 < 103) {
            method1258(-62, -65, 52, 121, 124);
        }
        ++field2583;
        if (super.field4203.method344((byte) 77)) {
            return false;
        } else {
            return super.field4203.field621.method2399((byte) -122) != 0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILts;)V", line = 23)
    public class202(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V", line = 29)
    public static void method1255(int arg0) {
        field2579 = null;
        if (arg0 != 0) {
            method1255(82);
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lts;)V", line = 40)
    public class202(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)V", line = 43)
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field2574;
        if (arg0 <= 113) {
            this.method224(119);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I", line = 54)
    public final int method226(byte arg0) {
        ++field2578;
        return arg0 != 13 ? -104 : 2;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)I", line = 65)
    public final int method1256(byte arg0) {
        if (arg0 > -119) {
            field2579 = null;
        }
        ++field2575;
        return super.field4202;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BLha;)V", line = 81)
    public static final void method1257(byte arg0, class454 arg1) {
        ++field2582;
        class524.field7408 = class98.method656(true, class14.field199, arg1, -786034064);
        if (arg0 <= -35) {
            class324.field4132 = class89.method624(class14.field199, arg1, 10000);
            class543.field7644 = class98.method656(true, class275.field3484, arg1, -786034064);
            class619.field8670 = class89.method624(class275.field3484, arg1, 10000);
            class100.field1234 = class98.method656(true, class238.field3073, arg1, -786034064);
            class111.field1373 = class89.method624(class238.field3073, arg1, 10000);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)I", line = 97)
    public final int method222(int arg0, int arg1) {
        ++field2573;
        if (super.field4203.method344((byte) -81)) {
            return 3;
        } else if (~super.field4203.field621.method2399((byte) -121) == -1) {
            return 3;
        } else {
            if (arg1 != 1) {
                field2579 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V", line = 114)
    public static final void method1258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field2577;
        if (arg4 == 2) {
            class127.field1535 = arg2;
            class717.field10116 = arg3;
            class54.field784 = arg0;
            class462.field6692 = arg1;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 129)
    public final void method224(int arg0) {
        if (arg0 != -1959) {
            field2581 = 0.48192093F;
        }
        if (super.field4203.method344((byte) 16)) {
            super.field4202 = 0;
        }
        ++field2580;
        if (~super.field4203.field621.method2399((byte) -126) == -1) {
            super.field4202 = 0;
        }
        if (super.field4202 < 0 || super.field4202 > 2) {
            super.field4202 = this.method226((byte) 13);
        }
    }
}
