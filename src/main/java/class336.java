import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class336 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field4895 = -1;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lhi;")
    public static class45 field4896 = new class45(71, 8);

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "[Lgk;")
    public static class468[] field4900;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2048(int arg0, String arg1) {
        field4897++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class399.field5724; var2++) {
            if (arg1.equalsIgnoreCase(class494.field7148[var2])) {
                return var2;
            }
        }
        return arg0 < 117 ? 32 : -1;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZ)V")
    public static final void method2049(int arg0, boolean arg1) {
        class488.field7065 = arg0;
        field4898++;
        class473 var2 = class11.field127;
        synchronized (class11.field127) {
            class11.field127.method2764(-769);
            if (!arg1) {
                method2051((byte) -77);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Z")
    public static final boolean method2050(boolean arg0) {
        field4901++;
        return arg0 ? class250.field3408 : false;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method2051(byte arg0) {
        int var1 = 44 % ((-arg0 - 6) / 33);
        field4900 = null;
        field4896 = null;
    }
}
