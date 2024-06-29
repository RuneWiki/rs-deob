import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class639 extends class401 {

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method3564(int arg0, int arg1, int arg2) {
        if (arg2 < 118) {
            method3564(47, 68, 34);
        }
        field8853++;
        return (class340.method1990(0, arg1, arg0) | class222.method1408(arg1, (byte) -75, arg0) | class355.method2034(arg1, arg0, 0)) & class437.method2500(0, arg1, arg0);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(III)I", line = 26)
    public static final int method3565(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        field8855++;
        if (arg1 > -102) {
            return -24;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)V", line = 54)
    public static final void method3566(int arg0) {
        if (arg0 <= 63) {
            return;
        }
        field8854++;
        class400.field5608 = class377.field5030.field3874 + class377.field5030.field3859 + 2;
        class311.field4298 = class136.field1916.field3859 + class136.field1916.field3874 + 2;
        class61.field687 = new String[500];
        for (int var1 = 0; var1 < class61.field687.length; var1++) {
            class61.field687[var1] = "";
        }
        class26.method251(class65.field789.method555(class697.field9900, true), (byte) -114);
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(Z)I")
    public abstract int method1014(boolean arg0);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)J")
    public abstract long method1012(int arg0);

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(Z)I")
    public abstract int method1011(boolean arg0);

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I")
    public abstract int method1013(int arg0);

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)I")
    public abstract int method1010(int arg0);
}
