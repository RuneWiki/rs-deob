import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class256 {

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "[I")
    public static int[] field3537 = new int[14];

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field3535 = -1;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Z")
    public static boolean field3541 = false;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public int field3539;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public int field3544;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "Luu;")
    public static class191 field3536;

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILga;IZ)V", line = 3)
    public static final void method1649(int arg0, class282 arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field3537 = null;
        }
        field3538++;
        class30 var4 = arg1.method1812((byte) 103, class400.field6090);
        if (var4 == null) {
            return;
        }
        class400.field6090.method739(arg2, arg0, arg1.field3991 + arg2, arg0 - -arg1.field4043);
        if (class207.field2819 < 3) {
            class391.field5962.method2202((float) arg1.field3991 / 2.0F + (float) arg2, (float) arg1.field4043 / 2.0F + (float) arg0, 4096, ((int) (-class53.field744) & 0x3FFF) << 2, var4, arg2, arg0);
        } else {
            class400.field6090.method779(-16777216, var4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)V", line = 30)
    public static void method1650(int arg0) {
        field3536 = null;
        int var1 = 123 / ((arg0 + 52) / 44);
        field3537 = null;
    }
}
