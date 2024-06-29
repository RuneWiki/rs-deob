import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class105 extends class55 {

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "[Ldh;")
    public static class322[] field1470 = new class322[4];

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)V")
    public static void method791(byte arg0) {
        if (arg0 != 32) {
            method792(false, -92, 122);
        }
        field1470 = null;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        this.field1472 = arg0;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(ZII)Z")
    public static final boolean method792(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method791((byte) -59);
        }
        field1473++;
        return class255.method1675(arg1, arg2, 0) | (arg1 & 0x70000) != 0 || class238.method1578(5121, arg2, arg1);
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
    public static final void method793(int arg0, int arg1) {
        class362.field5234 = 1000000000L / (long) arg0;
        if (arg1 == 458752) {
            field1469++;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(III)Z")
    public static final boolean method794(int arg0, int arg1, int arg2) {
        int var3 = 31 / ((-arg1 - 53) / 59);
        field1471++;
        return class72.method618(arg2, arg0, 67) | (arg2 & 0x800) != 0 || class530.method3099(arg2, -7, arg0);
    }
}
