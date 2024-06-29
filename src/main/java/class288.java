import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class288 extends class449 {

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "[B")
    private byte[] field4117;

    static {
        new class475("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BIB)V", line = 10)
    public final void method1854(byte arg0, int arg1, byte arg2) {
        if (arg0 != -52) {
            this.method1854((byte) 10, 118, (byte) -105);
        }
        field4118++;
        byte var4 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field4117[var10001] = var4;
        this.field4117[var6] = var4;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIIB)[B", line = 27)
    public final byte[] method1855(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = 32 / ((arg3 - 47) / 45);
        field4119++;
        this.field4117 = new byte[arg0 * 2 * arg1 * arg2];
        this.method339(arg2, (byte) 57, arg1, arg0);
        return this.field4117;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 40)
    public class288() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
