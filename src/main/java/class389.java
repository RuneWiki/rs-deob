import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class389 implements class117 {

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public int field5543;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public int field5552;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "Lada;")
    public class267 field5546;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Loe;")
    public class15 field5548;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "I")
    public int field5551;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field5549;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "Z")
    public boolean field5540;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field5542;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "Ljk;")
    public static class788 field5550 = new class788("stellardawn", 1);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V", line = 4)
    public static void method2413(byte arg0) {
        field5550 = null;
        if (arg0 != -117) {
            field5550 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BLvs;I)Z", line = 20)
    public static final boolean method2414(byte arg0, class532 arg1, int arg2) {
        field5544++;
        class267.field3878.method33(arg1.field7325[arg2], arg1.field7322[arg2], arg1.field7318[arg2], class484.field6696);
        int var3 = class484.field6696[2];
        if (var3 < 50) {
            return false;
        }
        arg1.field7326[arg2] = (short) (class484.field6696[0] * class627.field8782 / var3 + class368.field5310);
        arg1.field7321[arg2] = (short) (class484.field6696[1] * class72.field781 / var3 + class309.field4454);
        if (arg0 >= -38) {
            field5550 = null;
        }
        arg1.field7320[arg2] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lof;", line = 43)
    public final class475 method473(int arg0) {
        if (arg0 != 6) {
            this.method473(-39);
        }
        field5539++;
        return class538.field7430;
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(ILada;Loe;IIIIIIIZ)V", line = 61)
    public class389(int arg0, class267 arg1, class15 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5545 = arg5;
        this.field5543 = arg9;
        this.field5547 = arg4;
        this.field5541 = arg8;
        this.field5552 = arg3;
        this.field5546 = arg1;
        this.field5548 = arg2;
        this.field5551 = arg6;
        this.field5549 = arg7;
        this.field5540 = arg10;
        this.field5542 = arg0;
    }
}
