import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class65 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lts;")
    public static class356 field965 = null;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field967 = -1;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "Ldc;")
    public static class5 field970 = new class5(50);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "F")
    public static float field966;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Z")
    public static boolean field972;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
    public static int[] field971;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V", line = 6)
    public static final void method456(int arg0, byte arg1) {
        int var2 = -119 / ((arg1 - 58) / 35);
        class136.field1750.method39(false, arg0);
        field969++;
        field970.method39(false, arg0);
        class378.field5643.method39(false, arg0);
        class491.field7501.method39(false, arg0);
        class392.field5804.method39(false, arg0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 20)
    public static void method457(byte arg0) {
        field965 = null;
        if (arg0 >= -110) {
            field966 = 0.25574467F;
        }
        field970 = null;
        field971 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lts;III)V", line = 40)
    public static final void method458(class356 arg0, int arg1, int arg2, int arg3) {
        class135.field1723 = arg0;
        class239.field3351 = arg1;
        class362.field5444 = arg2;
        if (arg3 > -117) {
            field967 = -123;
        }
        field964++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 68)
    public static final void method459(int arg0) {
        if (arg0 == -1) {
            field968++;
            class338 var1 = class380.method2294((byte) 62, 0, 15);
            var1.method2048(37);
        }
    }
}
