import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class375 extends class646 {

    @OriginalMember(owner = "client!sea", name = "I", descriptor = "I")
    private int field5196 = 0;

    @OriginalMember(owner = "client!sea", name = "N", descriptor = "I")
    private int field5201 = 4096;

    @OriginalMember(owner = "client!sea", name = "L", descriptor = "Z")
    public static boolean field5199 = false;

    @OriginalMember(owner = "client!sea", name = "O", descriptor = "Z")
    public static boolean field5202 = false;

    @OriginalMember(owner = "client!sea", name = "J", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!sea", name = "K", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!sea", name = "M", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!sea", name = "P", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V")
    public class375() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5201 = arg0.method2755((byte) -85);
            }
        } else {
            this.field5196 = arg0.method2755((byte) -87);
        }
        ++field5197;
        if (arg2 <= 7) {
            this.method424(101, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method2240(char arg0, byte arg1, String arg2) {
        ++field5198;
        int var3 = 0;
        int var4 = arg2.length();
        int var5 = 0;
        if (arg1 != -45) {
            method2240((char) 65453, (byte) 117, (String) null);
        }
        while (var5 < var4) {
            if (~arg2.charAt(var5) == ~arg0) {
                ++var3;
            }
            ++var5;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        ++field5200;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            return null;
        } else {
            if (super.field9156.field5075) {
                int[] var4 = this.method3628(false, 0, arg0);
                for (int var5 = 0; ~class89.field1330 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field5196 && var6 <= this.field5201 ? 4096 : 0;
                }
            }
            return var3;
        }
    }
}
