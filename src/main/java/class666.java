import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class666 {

    @OriginalMember(owner = "client!aga", name = "e", descriptor = "I")
    private int field9099 = 0;

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "Leq;")
    private class213 field9097;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "I")
    public static int field9095 = -1;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "I")
    public static int field9096;

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Leh;")
    private class362 field9101;

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "Lin;")
    public static class91 field9098;

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method3741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class755.field10550 != null) {
            class755.field10550[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class315.field4362 != null) {
            class315.field4362[arg0][arg1] = (short) arg3;
        }
        if (class208.field2981 != null) {
            class208.field2981[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Leh;", line = 19)
    public final class362 method3742(byte arg0) {
        this.field9099 = 0;
        if (arg0 != 123) {
            method3741(-115, 5, -49, 81, 25);
        }
        field9096++;
        return this.method3744((byte) 117);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V", line = 33)
    public static void method3743(int arg0) {
        if (arg0 != -16777216) {
            method3741(-59, 61, -83, 34, -32);
        }
        field9098 = null;
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(B)Leh;", line = 48)
    public final class362 method3744(byte arg0) {
        field9100++;
        int var2 = -49 / ((arg0 - 44) / 40);
        if (this.field9099 > 0 && this.field9097.field3016[this.field9099 - 1] != this.field9101) {
            class362 var3 = this.field9101;
            this.field9101 = var3.field5207;
            return var3;
        }
        while (this.field9097.field3019 > this.field9099) {
            class362 var4 = this.field9097.field3016[this.field9099++].field5207;
            if (this.field9097.field3016[this.field9099 - 1] != var4) {
                this.field9101 = var4.field5207;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V", line = 81)
    public class666() {
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Leq;)V", line = 83)
    public class666(class213 arg0) {
        this.field9097 = arg0;
    }
}
