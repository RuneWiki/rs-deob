import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class183 {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "Z")
    public static volatile boolean field2940 = false;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "I")
    public static int field2942 = 0;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "Laj;")
    public static class287 field2943 = new class287(4);

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static void method1338(int arg0) {
        int var1 = 97 / ((11 - arg0) / 46);
        field2943 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)Llk;")
    public static final class545 method1339(int arg0, byte arg1, int arg2) {
        field2939++;
        class545 var3 = class415.method2533((byte) 76, arg0);
        if (arg1 < 35) {
            return null;
        } else if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field7641 == null || var3.field7641.length <= arg2) {
            return null;
        } else {
            return var3.field7641[arg2];
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(III)Z")
    public static final boolean method1340(int arg0, int arg1, int arg2) {
        field2938++;
        if (arg0 == 540800) {
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
    public static final void method1341(byte arg0) {
        field2937++;
        class361.field5364 = null;
        if (arg0 != -82) {
            method1338(-85);
        }
        class607.field8840 = null;
        class536.field7509 = null;
        class81.field1590 = null;
        class703.field9887 = null;
        class223.field3358 = null;
        class430.field6212 = null;
        class139.field2462 = null;
        class126.field2308 = null;
    }
}
