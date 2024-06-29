import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class496 extends class234 {

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public int field7064;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public int field7065;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
    public int field7074;

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "I")
    public int field7063;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public int field7070;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public int field7066;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "Ljv;")
    public static class71 field7062 = new class71();

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "Lpw;")
    public static class658 field7069 = new class658();

    @OriginalMember(owner = "client!tp", name = "E", descriptor = "S")
    public static short field7075 = 32767;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
    public static int field7073;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "Lvw;")
    public static class279 field7072;

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lsc;Lia;IIIIIIIIIIIII)V")
    public class496(class320 arg0, class547 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field7064 = arg13;
        this.field7065 = arg11;
        this.field7074 = arg12;
        this.field7063 = arg9;
        this.field7070 = arg10;
        this.field7066 = arg14;
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "(I)V")
    public static void method2964(int arg0) {
        field7072 = null;
        if (arg0 == 5) {
            field7069 = null;
            field7062 = null;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2965(int arg0, boolean arg1) {
        if (arg1) {
            method2966(null, -16);
        }
        field7067++;
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lr;I)V")
    public static final void method2966(class167 arg0, int arg1) {
        field7071++;
        if (class461.field6571 == class532.field7456.field9814) {
            return;
        }
        if (arg1 != -32672) {
            field7072 = null;
        }
        if (class257.field3792 != null && class387.method2387(class532.field7456.field9814, arg0, arg1 ^ 0xFFFF8460)) {
            class461.field6571 = class532.field7456.field9814;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)Lph;")
    public class598 method474(int arg0) {
        if (arg0 != 6686) {
            this.method474(82);
        }
        field7068++;
        return class343.field5107;
    }
}
