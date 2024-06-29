import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class284 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lkd;")
    private class188 field4318;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field4316;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4314;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field4320;

    static {
        new class234("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIZ)I", line = 6)
    public static final int method1840(int arg0, int arg1, boolean arg2) {
        field4317++;
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        if (!arg2) {
            field4315 = -65;
        }
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FFA50C) >> 19;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)I", line = 32)
    public static final int method1841(boolean arg0, int arg1) {
        field4320++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0) {
            return 14;
        } else {
            return class305.method1956(true, arg1);
        }
    }

    @OriginalMember(owner = "client!rm", name = "finalize", descriptor = "()V", line = 48)
    protected final void finalize() throws Throwable {
        field4319++;
        this.field4318.method1260(this.field4316, (byte) 87);
        super.finalize();
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lkd;II)V", line = 56)
    public class284(class188 arg0, int arg1, int arg2) {
        this.field4318 = arg0;
        this.field4316 = arg2;
    }
}
