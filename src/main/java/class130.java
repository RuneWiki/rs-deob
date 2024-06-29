import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class130 extends class96 {

    @OriginalMember(owner = "client!cj", name = "M", descriptor = "I")
    private int field1774 = 4096;

    @OriginalMember(owner = "client!cj", name = "P", descriptor = "I")
    private int field1777 = 0;

    @OriginalMember(owner = "client!cj", name = "N", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!cj", name = "Q", descriptor = "J")
    public static long field1778;

    @OriginalMember(owner = "client!cj", name = "K", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!cj", name = "L", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!cj", name = "O", descriptor = "I")
    public static int field1776;

    static {
        new class169("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field1775 = 0;
        field1778 = -1L;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V", line = 10)
    public class130() {
        super(1, true);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)[I", line = 32)
    public final int[] method37(int arg0, int arg1) {
        ++field1772;
        int[] var3 = super.field1331.method397((byte) -110, arg0);
        if (arg1 != 255) {
            this.method31(89, 88, (class88) null);
        }
        if (super.field1331.field863) {
            int[] var4 = this.method657(0, arg0, -1);
            for (int var5 = 0; ~class269.field3403 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1777 && ~var6 >= ~this.field1774 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILbt;)V", line = 69)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            this.method31(-54, 80, (class88) null);
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field1774 = arg2.method568((byte) 110);
            }
        } else {
            this.field1777 = arg2.method568((byte) 110);
        }
        ++field1773;
    }
}
