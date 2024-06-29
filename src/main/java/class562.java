import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class562 {

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "Luu;")
    public static class237 field7809;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[I")
    public static int[] field7807;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3302(boolean arg0) {
        field7809 = null;
        field7807 = null;
        if (arg0) {
            field7809 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)V", line = 26)
    public static final void method3303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class607.field8185 = arg2;
        class726.field10064 = arg0;
        if (arg1 != -1169633886) {
            method3302(false);
        }
        class262.field3848 = arg3;
        class291.field4181 = arg4;
        field7808++;
    }
}
