import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class411 extends class260 {

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "Lmga;")
    public static class739 field5910 = new class739(53, 7);

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field5909;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(ILfca;)V", line = 3)
    public class411(int arg0, class92 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(B)V", line = 7)
    public static void method2535(byte arg0) {
        field5910 = null;
        int var1 = 62 / ((arg0 - -29) / 59);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2(boolean arg0) {
        if (arg0) {
            this.method8((byte) -46);
        }
        ++field5914;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lor;B)Ljava/lang/String;", line = 30)
    public static final String method2536(class668 arg0, byte arg1) {
        int var2 = 104 % ((arg1 - 14) / 62);
        ++field5909;
        if (client.method2022(arg0).method839(0) == 0) {
            return null;
        } else if (arg0.field9312 != null && arg0.field9312.trim().length() != 0) {
            return arg0.field9312;
        } else {
            return class688.field9683 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)I", line = 52)
    public final int method8(byte arg0) {
        ++field5915;
        return arg0 != 4 ? -30 : 0;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lfca;)V", line = 66)
    public class411(class92 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I", line = 70)
    public final int method2537(int arg0) {
        if (arg0 <= 3) {
            this.method9(1, (byte) -46);
        }
        ++field5911;
        return super.field3868;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(IB)V", line = 85)
    public final void method9(int arg0, byte arg1) {
        super.field3868 = arg0;
        if (arg1 != -107) {
            field5910 = null;
        }
        ++field5913;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IB)I", line = 96)
    public final int method4(int arg0, byte arg1) {
        ++field5912;
        int var3 = 37 / ((-53 - arg1) / 50);
        return 1;
    }
}
