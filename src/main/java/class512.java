import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class512 {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lhi;")
    public static class45 field7504 = new class45(18, 7);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method3035(int arg0) {
        class506.field7400 = -1;
        field7505++;
        class71.field1023 = -1;
        if (arg0 != 192) {
            method3036(-86);
        }
        class195.field2827 = 0;
    }

    @OriginalMember(owner = "client!c", name = "ha", descriptor = "(Lc;)V")
    public abstract void method944(class512 arg0);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method3036(int arg0) {
        field7504 = null;
        if (arg0 != 13515) {
            method3037(-121, -117, -30);
        }
    }

    @OriginalMember(owner = "client!c", name = "ca", descriptor = "(I)V")
    public abstract void method953(int arg0);

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(I)V")
    public abstract void method942(int arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Z")
    public static final boolean method3037(int arg0, int arg1, int arg2) {
        if (arg0 <= 37) {
            field7504 = null;
        }
        field7502++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!c", name = "U", descriptor = "(III)V")
    public abstract void method955(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "v", descriptor = "()V")
    public abstract void method954();

    @OriginalMember(owner = "client!c", name = "K", descriptor = "(III[I)V")
    public abstract void method945(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static final void method3038(boolean arg0) {
        if (arg0) {
            method3035(-70);
        }
        field7501++;
        if (class173.field2619.toLowerCase().indexOf("microsoft") != -1) {
            class327.field4463[189] = 26;
            class327.field4463[192] = 58;
            class327.field4463[191] = 73;
            class327.field4463[188] = 71;
            class327.field4463[222] = 59;
            class327.field4463[221] = 43;
            class327.field4463[187] = 27;
            class327.field4463[190] = 72;
            class327.field4463[220] = 74;
            class327.field4463[223] = 28;
            class327.field4463[219] = 42;
            class327.field4463[186] = 57;
            return;
        }
        class327.field4463[44] = 71;
        class327.field4463[91] = 42;
        class327.field4463[61] = 27;
        class327.field4463[46] = 72;
        class327.field4463[93] = 43;
        class327.field4463[47] = 73;
        class327.field4463[45] = 26;
        class327.field4463[59] = 57;
        if (class173.field2636 == null) {
            class327.field4463[222] = 59;
            class327.field4463[192] = 58;
        } else {
            class327.field4463[222] = 58;
            class327.field4463[192] = 28;
            class327.field4463[520] = 59;
        }
        class327.field4463[92] = 74;
    }

    @OriginalMember(owner = "client!c", name = "EA", descriptor = "(I)V")
    public abstract void method949(int arg0);

    @OriginalMember(owner = "client!c", name = "ea", descriptor = "(I)V")
    public abstract void method940(int arg0);

    @OriginalMember(owner = "client!c", name = "A", descriptor = "(I)V")
    public abstract void method950(int arg0);

    @OriginalMember(owner = "client!c", name = "W", descriptor = "(III)V")
    public abstract void method948(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "wa", descriptor = "([I)V")
    public abstract void method941(int[] arg0);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class512 method947();

    @OriginalMember(owner = "client!c", name = "YA", descriptor = "(IIIIII)V")
    public abstract void method943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method946(int arg0, int arg1, int arg2, int[] arg3);
}
