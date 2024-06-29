import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class614 {

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public int field8384 = 128;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public int field8381 = 128;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public int field8385;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public int field8386;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public int field8379;

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "I")
    public int field8387;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "I")
    public static int field8380 = 0;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!vfa", name = "j", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!vfa", name = "k", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ILvfa;)V")
    public final void method3375(int arg0, class614 arg1) {
        this.field8386 = arg1.field8386;
        this.field8385 = arg1.field8385;
        this.field8384 = arg1.field8384;
        field8383++;
        this.field8379 = arg1.field8379;
        if (arg0 != 128) {
            this.field8385 = 122;
        }
        this.field8387 = arg1.field8387;
        this.field8381 = arg1.field8381;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZB)Z")
    public static final boolean method3376(boolean arg0, byte arg1) {
        field8388++;
        int var2 = 35 / ((arg1 + 26) / 35);
        boolean var3 = class9.field103.method811();
        if (arg0 == var3) {
            return true;
        }
        if (!arg0) {
            class9.field103.method801();
        } else if (!class9.field103.method842()) {
            arg0 = false;
        }
        if (arg0 == var3) {
            return false;
        } else {
            class72.field935.field6534 = arg0;
            class72.field935.method1856(0, class495.field6687);
            return true;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lfca;III)V")
    public static final void method3377(class188 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 128) {
            method3376(true, (byte) 103);
        }
        field8382++;
        if (class377.field5414 != null || class483.field6542 || arg0 == null || class506.method2858(-2, arg0) == null) {
            return;
        }
        class377.field5414 = arg0;
        class278.field3766 = class506.method2858(-2, arg0);
        class299.field3998 = false;
        class363.field5238 = arg1;
        class223.field2895 = arg2;
        class436.field6020 = 0;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)Lvfa;")
    public final class614 method3378(int arg0) {
        if (arg0 != 0) {
            this.field8384 = -108;
        }
        field8389++;
        return new class614(this.field8385, this.field8381, this.field8384, this.field8387, this.field8379, this.field8386);
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I)V")
    public class614(int arg0) {
        this.field8385 = arg0;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(IIIIII)V")
    private class614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8384 = arg2;
        this.field8385 = arg0;
        this.field8386 = arg5;
        this.field8381 = arg1;
        this.field8379 = arg4;
        this.field8387 = arg3;
    }
}
