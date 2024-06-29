import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class153 extends class251 {

    @OriginalMember(owner = "client!taa", name = "G", descriptor = "I")
    public static int field2007 = -2;

    @OriginalMember(owner = "client!taa", name = "E", descriptor = "Ljn;")
    public static class134 field2005 = new class134(97, 10);

    @OriginalMember(owner = "client!taa", name = "w", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!taa", name = "x", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!taa", name = "y", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!taa", name = "z", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!taa", name = "A", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!taa", name = "D", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!taa", name = "F", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!taa", name = "H", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!taa", name = "C", descriptor = "Ljava/awt/Font;")
    public static Font field2003;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I[B)[B", line = 9)
    public static final byte[] method1002(int arg0, byte[] arg1) {
        ++field1998;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class335.method2118(arg1, 0, var3, arg0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IF)V", line = 27)
    public final void method54(int arg0, float arg1) {
        ++field2000;
        int var3 = 91 % ((19 - arg0) / 55);
        super.field3737 = arg1;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ZIZ)V", line = 39)
    public static final void method1003(boolean arg0, int arg1, boolean arg2) {
        if (arg2) {
            --class753.field10383;
            if (~class753.field10383 == -1) {
                class109.field1323 = null;
            }
        }
        ++field2001;
        if (arg1 != -2) {
            method1003(false, 122, true);
        }
        if (arg0) {
            --class647.field9057;
            if (~class647.field9057 == -1) {
                class372.field5346 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(IIII)V", line = 65)
    public final void method55(int arg0, int arg1, int arg2, int arg3) {
        super.field3730 = arg2;
        super.field3729 = arg3;
        if (arg1 == 26119132) {
            super.field3735 = arg0;
            ++field2006;
        }
    }

    @OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(IIIIIF)V", line = 79)
    public class153(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(Z)V", line = 85)
    public static void method1004(boolean arg0) {
        field2003 = null;
        field2005 = null;
        if (arg0) {
            method1004(false);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 101)
    public static final void method1005(byte arg0) {
        class586.method3439(7);
        ++field2008;
        class116.method848(22050, 2, -8001, class688.field9602.field8531.method2857((byte) -98) == 1);
        if (arg0 < -80) {
            class32.field307 = class115.method842(22050, true, class129.field1674, 0, class749.field10341);
            class144.method957(class266.method1742((byte) -104, (class82) null), (byte) -66, true);
            class607.field8497 = class115.method842(2048, true, class129.field1674, 1, class749.field10341);
            class607.field8497.method1904((byte) 117, class44.field468);
        }
    }
}
