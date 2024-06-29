import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class89 extends class383 {

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "J")
    public long field1098;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "Lwf;")
    public class89 field1094;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lwf;")
    public class89 field1099;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
    public final void method701(int arg0) {
        field1095++;
        if (this.field1094 == null) {
            return;
        }
        if (arg0 < 54) {
            this.method701(33);
        }
        this.field1094.field1099 = this.field1099;
        this.field1099.field1094 = this.field1094;
        this.field1094 = null;
        this.field1099 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)Z")
    public final boolean method702(boolean arg0) {
        if (!arg0) {
            this.field1099 = null;
        }
        field1093++;
        return this.field1094 != null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([BIIB)[B")
    public static final byte[] method703(byte[] arg0, int arg1, int arg2, byte arg3) {
        int var4 = 100 % ((32 - arg3) / 44);
        field1097++;
        byte[] var5 = new byte[arg2];
        class318.method1875(arg0, arg1, var5, 0, arg2);
        return var5;
    }
}
