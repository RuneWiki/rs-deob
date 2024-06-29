import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class674 extends class60 {

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lhj;")
    public static class596 field9241 = new class596(103, 2);

    @OriginalMember(owner = "client!it", name = "s", descriptor = "Lkja;")
    public static class686 field9244 = new class686();

    @OriginalMember(owner = "client!it", name = "k", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!it", name = "m", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!it", name = "q", descriptor = "I")
    public static int field9242;

    @OriginalMember(owner = "client!it", name = "r", descriptor = "I")
    public static int field9243;

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(II)I", line = 3)
    public final int method406(int arg0, int arg1) {
        ++field9239;
        return arg0 != 0 ? -65 : 1;
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(B)V", line = 14)
    public final void method409(byte arg0) {
        if (super.field799 < 0 || super.field799 > 4) {
            super.field799 = this.method405(false);
        }
        if (arg0 >= -27) {
            field9244 = null;
        }
        ++field9236;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)I", line = 27)
    public final int method3783(int arg0) {
        ++field9237;
        if (arg0 != 0) {
            this.method406(-62, -41);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(Lhd;)V", line = 38)
    public class674(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!it", name = "c", descriptor = "(B)Z", line = 41)
    public static final boolean method3784(byte arg0) {
        ++field9238;
        boolean var1 = true;
        if (class386.field4974 == null) {
            if (class208.field2470.method433((byte) -110, class403.field5288)) {
                class386.field4974 = class600.method3431(class208.field2470, class403.field5288);
            } else {
                var1 = false;
            }
        }
        if (class212.field2505 == null) {
            if (class208.field2470.method433((byte) -92, class153.field1911)) {
                class212.field2505 = class600.method3431(class208.field2470, class153.field1911);
            } else {
                var1 = false;
            }
        }
        if (arg0 >= -104) {
            return false;
        } else {
            if (class662.field9093 == null) {
                if (!class208.field2470.method433((byte) -77, class714.field10022)) {
                    var1 = false;
                } else {
                    class662.field9093 = class600.method3431(class208.field2470, class714.field10022);
                }
            }
            if (class145.field1824 == null) {
                if (class625.field8577.method433((byte) -110, class435.field5745)) {
                    class145.field1824 = class779.method4323(-1, class625.field8577, class435.field5745);
                } else {
                    var1 = false;
                }
            }
            if (class330.field4085 == null) {
                if (class208.field2470.method433((byte) -88, class435.field5745)) {
                    class330.field4085 = class600.method3419(class208.field2470, class435.field5745);
                } else {
                    var1 = false;
                }
            }
            return var1;
        }
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(ILhd;)V", line = 112)
    public class674(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(BI)V", line = 116)
    public final void method407(byte arg0, int arg1) {
        super.field799 = arg1;
        ++field9242;
        int var3 = 47 / ((arg0 - 28) / 50);
    }

    @OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V", line = 127)
    public static void method3785(int arg0) {
        if (arg0 != -12875) {
            field9243 = 56;
        }
        field9241 = null;
        field9244 = null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Z)I", line = 138)
    public final int method405(boolean arg0) {
        ++field9240;
        if (arg0) {
            this.method409((byte) 2);
        }
        return 3;
    }
}
