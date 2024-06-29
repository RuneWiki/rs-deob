import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class458 {

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    private int field6683 = 0;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lbj;")
    private class159 field6682;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field6686;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field6687;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lki;")
    private class499 field6684;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
    public static int[] field6688;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "[S")
    public static short[] field6685;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)Lki;")
    public final class499 method2692(byte arg0) {
        if (arg0 >= -48) {
            field6688 = null;
        }
        this.field6683 = 0;
        field6687++;
        return this.method2693(0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)Lki;")
    public final class499 method2693(int arg0) {
        field6686++;
        if (arg0 != 0) {
            return null;
        } else if (this.field6683 <= 0 || this.field6682.field2268[this.field6683 - 1] == this.field6684) {
            while (this.field6683 < this.field6682.field2282) {
                class499 var3 = this.field6682.field2268[this.field6683++].field7336;
                if (this.field6682.field2268[this.field6683 - 1] != var3) {
                    this.field6684 = var3.field7336;
                    return var3;
                }
            }
            return null;
        } else {
            class499 var2 = this.field6684;
            this.field6684 = var2.field7336;
            return var2;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static void method2694(byte arg0) {
        field6685 = null;
        int var1 = 118 / ((71 - arg0) / 38);
        field6688 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lvh;Lm;B)V")
    public static final void method2695(class240 arg0, class126 arg1, byte arg2) {
        class296.field4095 = arg0;
        if (arg2 >= -83) {
            field6685 = null;
        }
        class54.field755 = arg1;
        field6681++;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lbj;)V")
    public class458(class159 arg0) {
        this.field6682 = arg0;
    }
}
