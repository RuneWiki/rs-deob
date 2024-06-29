import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class357 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field5397;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5399;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field5401;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Z")
    public static boolean field5400;

    @OriginalMember(owner = "client!we", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field5396++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lnfa;", line = 14)
    public static final class225 method2279(int arg0) {
        class319.field4747 = 0;
        field5399++;
        if (arg0 != 4) {
            field5400 = false;
        }
        return class81.method724(false);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V", line = 28)
    public static final void method2280(int arg0, int arg1, int arg2) {
        class114 var3 = class488.field7062[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class542.method3172(var3.field1767);
        class542.method3172(var3.field1777);
        if (var3.field1767 != null) {
            var3.field1767 = null;
        }
        if (var3.field1777 != null) {
            var3.field1777 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 44)
    public static final void method2281(int arg0, int arg1) {
        field5398++;
        if (class695.field9864 == arg1) {
            return;
        }
        class191.field3229 = class314.field4720 = class483.field6959[arg1];
        class498.method3018(-112);
        if (arg0 != 4251) {
            method2279(102);
        }
        class36.field365 = new int[4][class191.field3229 >> 3][class314.field4720 >> 3];
        class140.field2196 = new int[class191.field3229][class314.field4720];
        class639.field8976 = new int[class191.field3229][class314.field4720];
        for (int var2 = 0; var2 < 4; var2++) {
            class247.field3958[var2] = class37.method210(class314.field4720, (byte) 112, class191.field3229);
        }
        class327.field4817 = new byte[4][class191.field3229][class314.field4720];
        class94.method785(class314.field4720, class191.field3229, (byte) -124, 4);
        class271.method1786(class314.field4720 >> 3, false, class191.field3229 >> 3, class364.field5573);
        class695.field9864 = arg1;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V", line = 74)
    public static final void method2282(int arg0) {
        field5397++;
        class237.field3808.method76(88);
        if (arg0 != -223) {
            method2284(null, 16, -64, (byte) 102);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLds;Lds;)V", line = 88)
    public static final void method2283(byte arg0, class65 arg1, class65 arg2) {
        field5401++;
        if (arg2.field1042 != null) {
            arg2.method636((byte) 97);
        }
        if (arg0 >= -1) {
            method2282(34);
        }
        arg2.field1042 = arg1.field1042;
        arg2.field1044 = arg1;
        arg2.field1042.field1044 = arg2;
        arg2.field1044.field1042 = arg2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lla;IIB)Lb;", line = 106)
    public static final class352 method2284(class422 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -108) {
            method2282(127);
        }
        field5402++;
        byte[] var4 = arg0.method2624(0, arg1, arg2);
        return var4 == null ? null : new class352(var4);
    }
}
