import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class471 extends class175 {

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    private int field6640 = 0;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
    private int field6642 = 4096;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(CB)Z")
    public static final boolean method2752(char arg0, byte arg1) {
        ++field6643;
        if (arg1 <= 3) {
            method2752((char) 65464, (byte) 91);
        }
        return arg0 == 160 || arg0 == ' ' || arg0 == '_' || ~arg0 == -46;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V")
    public class471() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        if (!arg0) {
            this.method44(10, (class254) null, false);
        }
        ++field6641;
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[] var4 = this.method1202(arg1, -1150480797, 0);
            for (int var5 = 0; ~var5 > ~class598.field8136; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field6640 >= ~var6 && this.field6642 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field6639;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field6642 = arg1.method1728((byte) 115);
            }
        } else {
            this.field6640 = arg1.method1728((byte) 9);
        }
        if (arg2) {
            method2752('\u000f', (byte) 113);
        }
    }
}
