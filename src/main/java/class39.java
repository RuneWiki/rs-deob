import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public class class39 {

    @OriginalMember(owner = "client!bt", name = "f", descriptor = "Ljava/lang/String;")
    public String field473;

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "F")
    public static float field471 = 1.0F;

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "Lsl;")
    public static class391 field469 = new class391("", 14);

    @OriginalMember(owner = "client!bt", name = "i", descriptor = "F")
    public static float field476;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bt", name = "e", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bt", name = "g", descriptor = "Lkda;")
    public static class328 field474;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V")
    public static final void method250(int arg0, long[] arg1, Object[] arg2) {
        class390.method2326(arg1.length - 1, -16424, 0, arg1, arg2);
        if (arg0 > 103) {
            field472++;
        }
    }

    @OriginalMember(owner = "client!bt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field468++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IBILks;)V")
    public static final void method251(int arg0, byte arg1, int arg2, class373 arg3) {
        if (arg1 != 70) {
            field474 = null;
        }
        if (arg3.field1872 == arg0 && arg0 != -1) {
            class78 var4 = class463.field6521.method2983(arg0, -111);
            int var5 = var4.field1056;
            if (var5 == 1) {
                arg3.field1938 = 0;
                arg3.field1882 = arg2;
                arg3.field1858 = 0;
                arg3.field1939 = 1;
                arg3.field1926 = 0;
                class163.method1179(-1721201176, arg3.field8496, var4, class541.field8119 == arg3, arg3.field8501, arg3.field8500, arg3.field1858);
            }
            if (var5 == 2) {
                arg3.field1938 = 0;
            }
        } else if (arg0 == -1 || arg3.field1872 == -1 || class463.field6521.method2983(arg0, arg1 - 180).field1042 >= class463.field6521.method2983(arg3.field1872, -122).field1042) {
            arg3.field1939 = 1;
            arg3.field1938 = 0;
            arg3.field1882 = arg2;
            arg3.field1858 = 0;
            arg3.field1872 = arg0;
            arg3.field1947 = arg3.field1953;
            arg3.field1926 = 0;
            if (arg3.field1872 != -1) {
                class163.method1179(arg1 ^ 0x99688DAE, arg3.field8496, class463.field6521.method2983(arg3.field1872, -122), class541.field8119 == arg3, arg3.field8501, arg3.field8500, arg3.field1858);
            }
        }
        field475++;
    }

    @OriginalMember(owner = "client!bt", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class39(String arg0, int arg1) {
        this.field473 = arg0;
        this.field470 = arg1;
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(Z)V")
    public static void method252(boolean arg0) {
        if (arg0) {
            field474 = null;
        }
        field469 = null;
        field474 = null;
    }
}
