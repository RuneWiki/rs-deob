import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class92 extends class741 {

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "Lsi;")
    public static class769 field1073 = new class769();

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "Ljn;")
    public static class134 field1074 = new class134(121, -1);

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "Lae;")
    public static class283 field1077;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V", line = 4)
    public final void method434(int arg0) {
        super.field10209.method1502((byte) 121, false);
        int var2 = -75 % ((arg0 - 10) / 44);
        ++field1068;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V", line = 15)
    public final void method430(int arg0, boolean arg1) {
        if (arg0 <= 96) {
            method668((byte) -77, 76);
        }
        ++field1075;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V", line = 25)
    public static void method667(int arg0) {
        field1077 = null;
        field1074 = null;
        field1073 = null;
        if (arg0 <= 84) {
            field1077 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILml;)V", line = 37)
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.method434(-10);
        }
        ++field1072;
        super.field10209.method1492(arg2, 2);
        super.field10209.method1509(4, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Llba;)V", line = 49)
    public class92(class223 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V", line = 52)
    public final void method429(byte arg0, boolean arg1) {
        super.field10209.method1502((byte) -110, true);
        ++field1070;
        if (arg0 < 15) {
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)V", line = 63)
    public static final void method668(byte arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        if (arg0 >= -40) {
            method667(-20);
        }
        ++field1069;
        class778.field10694 = arg1;
        class256.field3783 = new class388[class563.field7934[class778.field10694] + 1];
        class722.field9956 = 0;
        class158.field2050 = 0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(JJ)J", line = 82)
    public static long method669(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V", line = 90)
    public final void method432(int arg0, int arg1, int arg2) {
        int var4 = -90 / ((-18 - arg2) / 51);
        ++field1071;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(B)Z", line = 100)
    public final boolean method425(byte arg0) {
        if (arg0 >= -37) {
            this.method434(121);
        }
        ++field1076;
        return true;
    }
}
