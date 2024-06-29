import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class744 extends class119 {

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    private int field10417;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "I")
    private int field10421;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    private int field10414;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    private int field10418;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "Ltg;")
    public static class605 field10416 = new class605();

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "Lcb;")
    public static class631 field10423 = new class631(9, -1);

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field10415;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field10420;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public static int field10422;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)V", line = 3)
    public final void method465(int arg0, int arg1, int arg2) {
        ++field10420;
        int var4 = this.field10414 * arg2 >> 12;
        int var5 = this.field10418 * arg2 >> 12;
        int var6 = this.field10421 * arg0 >> 12;
        int var7 = this.field10417 * arg0 >> 12;
        if (arg1 != 2) {
            this.field10421 = 89;
        }
        class732.method4090(var7, var6, var5, super.field1828, super.field1830, 23813, var4, super.field1832);
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(Z)V", line = 22)
    public static void method4161(boolean arg0) {
        field10423 = null;
        field10416 = null;
        if (arg0) {
            field10416 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIZ)V", line = 38)
    public final void method460(int arg0, int arg1, boolean arg2) {
        ++field10415;
        if (arg2) {
            method4162((String) null, 108);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZII)V", line = 50)
    public final void method463(boolean arg0, int arg1, int arg2) {
        ++field10422;
        int var4 = this.field10414 * arg1 >> 12;
        int var5 = this.field10418 * arg1 >> 12;
        int var6 = this.field10421 * arg2 >> 12;
        int var7 = this.field10417 * arg2 >> 12;
        class126.method973(var7, -108, var4, var5, var6, super.field1830);
        if (arg0) {
            field10423 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 76)
    public static final void method4162(String arg0, int arg1) {
        ++field10419;
        class157.method1177("", 0, arg0, "", "", arg1 + -2, 0);
        if (arg1 != 3) {
            field10423 = null;
        }
    }

    @OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field10417 = arg3;
        this.field10421 = arg1;
        this.field10414 = arg0;
        this.field10418 = arg2;
    }
}
