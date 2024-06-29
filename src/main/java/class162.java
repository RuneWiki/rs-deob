import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class162 extends class91 {

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "[C")
    public static char[] field2496 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lnfa;")
    public class745 field2501;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Z")
    public boolean field2497;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "[Let;")
    public class749[] field2500;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2496 = null;
        if (arg0 > -9) {
            field2496 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method1232(int arg0, int arg1, int arg2, class475 arg3) {
        field2498++;
        int var5 = 58 / ((-arg2 - 24) / 46);
        int var6 = this.field2501.method2960(-5102);
        if (this.field2500 != null) {
            for (int var7 = 0; var7 < this.field2500.length; var7++) {
                this.field2500[var7].field10400 <<= var6;
                if (this.field2500[var7].method4123(arg1, arg0) && this.field2501.method198((byte) 121, arg1, arg0, arg3)) {
                    this.field2500[var7].field10400 >>= var6;
                    return true;
                }
                this.field2500[var7].field10400 >>= var6;
            }
        }
        return false;
    }
}
