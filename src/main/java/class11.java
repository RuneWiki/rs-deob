import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EAOLBHVU")
public class class11 extends class53 {

    @OriginalMember(owner = "client!EAOLBHVU", name = "q", descriptor = "Z")
    private boolean field726 = false;

    @OriginalMember(owner = "client!EAOLBHVU", name = "s", descriptor = "I")
    private int field728 = 8;

    @OriginalMember(owner = "client!EAOLBHVU", name = "u", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!EAOLBHVU", name = "v", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!EAOLBHVU", name = "w", descriptor = "I")
    private int field732;

    @OriginalMember(owner = "client!EAOLBHVU", name = "m", descriptor = "I")
    private int field722;

    @OriginalMember(owner = "client!EAOLBHVU", name = "n", descriptor = "I")
    private int field723;

    @OriginalMember(owner = "client!EAOLBHVU", name = "o", descriptor = "I")
    private int field724;

    @OriginalMember(owner = "client!EAOLBHVU", name = "p", descriptor = "I")
    private int field725;

    @OriginalMember(owner = "client!EAOLBHVU", name = "l", descriptor = "LEHYLCNJX;")
    private class15 field721;

    @OriginalMember(owner = "client!EAOLBHVU", name = "t", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!EAOLBHVU", name = "r", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!EAOLBHVU", name = "x", descriptor = "I")
    public int field733;

    @OriginalMember(owner = "client!EAOLBHVU", name = "y", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!EAOLBHVU", name = "z", descriptor = "[I")
    public int[] field735;

    @OriginalMember(owner = "client!EAOLBHVU", name = "k", descriptor = "Lclient;")
    public static client field720;

    @OriginalMember(owner = "client!EAOLBHVU", name = "<init>", descriptor = "(IIIIIIZIIZ)V")
    public class11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        this.field730 = arg7;
        this.field731 = arg5;
        this.field732 = arg3;
        this.field722 = arg4;
        if (arg9) {
            this.field728 = 278;
        }
        this.field723 = arg0;
        this.field724 = arg8;
        this.field725 = arg2;
        if (arg1 != -1) {
            this.field721 = class15.field837[arg1];
            this.field729 = 0;
            this.field727 = client.field174;
            if (arg6 && this.field721.field842 != -1) {
                this.field729 = (int) (Math.random() * (double) this.field721.field838);
                this.field727 -= (int) (Math.random() * (double) this.field721.method252(this.field729, -26977));
            }
        }
        class34 var11 = class34.method409(this.field730);
        this.field733 = var11.field1087;
        this.field734 = var11.field1065;
        this.field735 = var11.field1082;
    }

    @OriginalMember(owner = "client!EAOLBHVU", name = "a", descriptor = "(I)LLXNLNZCU;")
    public final class34 method223(int arg0) {
        int var2 = 24 / arg0;
        int var3 = -1;
        if (this.field733 != -1) {
            class23 var4 = class23.field946[this.field733];
            int var5 = var4.field948;
            int var6 = var4.field949;
            int var7 = var4.field950;
            int var8 = client.field544[var7 - var6];
            var3 = field720.field350[var5] >> var6 & var8;
        } else if (this.field734 != -1) {
            var3 = field720.field350[this.field734];
        }
        return var3 < 0 || var3 >= this.field735.length || this.field735[var3] == -1 ? null : class34.method409(this.field735[var3]);
    }

    @OriginalMember(owner = "client!EAOLBHVU", name = "a", descriptor = "(B)LCYPZUKMB;")
    public final class8 method2(byte arg0) {
        int var2 = -1;
        if (arg0 != -99) {
            this.field728 = -268;
        }
        if (this.field721 != null) {
            int var3 = client.field174 - this.field727;
            if (var3 > 100 && this.field721.field842 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field721.method252(this.field729, -26977)) {
                            break label44;
                        }
                        var3 -= this.field721.method252(this.field729, -26977);
                        this.field729++;
                    } while (this.field729 < this.field721.field838);
                    this.field729 -= this.field721.field842;
                } while (this.field729 >= 0 && this.field729 < this.field721.field838);
                this.field721 = null;
            }
            this.field727 = client.field174 - var3;
            if (this.field721 != null) {
                var2 = this.field721.field839[this.field729];
            }
        }
        class34 var4;
        if (this.field735 == null) {
            var4 = class34.method409(this.field730);
        } else {
            var4 = this.method223(453);
        }
        return var4 == null ? null : var4.method419(this.field731, this.field732, this.field722, this.field723, this.field724, this.field725, var2);
    }
}
