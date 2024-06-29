import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class147 implements class241 {

    @OriginalMember(owner = "client!us", name = "F", descriptor = "Lig;")
    private class218 field9;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)V")
    public final void method1(int arg0, int arg1) {
        int var3 = 121 / ((arg0 - 72) / 43);
        super.method1(124, this.field9.field3046 * arg1);
        ++field5;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lhp;Lig;Z)V")
    public class1(class296 arg0, class218 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field9 = arg1;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z")
    public final boolean method2(int arg0) {
        int var2 = 8 % ((arg0 - 22) / 62);
        ++field8;
        return super.method1050(super.field2141.field4431, 1);
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lig;")
    public final class218 method3(int arg0) {
        ++field1;
        if (arg0 != -885) {
            this.field9 = null;
        }
        return this.field9;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)I")
    public final int method4(byte arg0) {
        ++field2;
        if (arg0 != 1) {
            this.method4((byte) 72);
        }
        return super.method4((byte) 1);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;")
    public final Buffer method5(boolean arg0, int arg1) {
        if (arg1 < 76) {
            method6((byte) 63, (class49) null);
        }
        ++field6;
        return super.method1048(104, arg0, super.field2141.field4431);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLvg;)Lvg;")
    public static final class49 method6(byte arg0, class49 arg1) {
        ++field3;
        class49 var2 = client.method1779(arg1);
        if (var2 == null) {
            var2 = arg1.field949;
        }
        int var3 = -86 / ((arg0 - 42) / 38);
        return var2;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public final void method7(int arg0) {
        if (arg0 >= -98) {
            this.field9 = null;
        }
        super.method7(-122);
        ++field4;
    }
}
