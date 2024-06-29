import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class660 {

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "I")
    public static int field9031;

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "I")
    public static int field9032;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "I")
    public static int field9033;

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "Lin;")
    public static class91 field9034;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(II)V", line = 8)
    public static final void method3712(int arg0, int arg1) {
        field9032++;
        if (arg0 != -8186) {
            method3713(-99);
        }
        class425.field6121.method987(2, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 22)
    public static void method3713(int arg0) {
        if (arg0 == -14603) {
            field9034 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V", line = 42)
    public static final void method3714(boolean arg0) {
        class272.field3828.method1699((byte) 106);
        if (!arg0) {
            field9034 = null;
        }
        field9031++;
        for (int var1 = 0; var1 < 32; var1++) {
            class215.field3118[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class718.field9777[var2] = 0L;
        }
        class81.field1484 = 0;
    }
}
