import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class93 extends class212 {

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)I", line = 5)
    public final int method422(int arg0) {
        ++field1638;
        return arg0 != 20014 ? -14 : 0;
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Ldh;)V", line = 18)
    public class93(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(ILdh;)V", line = 22)
    public class93(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V", line = 27)
    public final void method418(boolean arg0) {
        ++field1642;
        if (arg0) {
            field1640 = 2;
        }
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)I", line = 39)
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field1640 = 15;
        }
        ++field1636;
        return 1;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 51)
    public static final void method884(int arg0, String arg1, int arg2) {
        ++field1644;
        if (arg2 != -32394) {
            method884(93, (String) null, 106);
        }
        class594 var3 = class692.method3869(arg0, (byte) 105, 3);
        var3.method3378(arg2 ^ 7448);
        var3.field8128 = arg1;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V", line = 65)
    public final void method419(int arg0, int arg1) {
        ++field1643;
        super.field3006 = arg1;
        int var3 = -25 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)V", line = 75)
    public static final void method885(int arg0) {
        class454.method2702((byte) 60);
        if (arg0 != 8839) {
            field1639 = 63;
        }
        ++field1637;
    }

    @OriginalMember(owner = "client!tt", name = "e", descriptor = "(I)I", line = 87)
    public final int method886(int arg0) {
        if (arg0 != -32350) {
            return -40;
        } else {
            ++field1641;
            return super.field3006;
        }
    }
}
