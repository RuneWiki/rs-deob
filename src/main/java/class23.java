import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("JBYEFPCA")
public class class23 extends class34 {

    @OriginalMember(owner = "JBYEFPCA", name = "y", descriptor = "I")
    private int field826 = 3;

    @OriginalMember(owner = "JBYEFPCA", name = "z", descriptor = "Z")
    private boolean field827 = true;

    @OriginalMember(owner = "JBYEFPCA", name = "l", descriptor = "I")
    private int field813;

    @OriginalMember(owner = "JBYEFPCA", name = "m", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "JBYEFPCA", name = "n", descriptor = "I")
    private int field815;

    @OriginalMember(owner = "JBYEFPCA", name = "r", descriptor = "I")
    private int field819;

    @OriginalMember(owner = "JBYEFPCA", name = "s", descriptor = "I")
    private int field820;

    @OriginalMember(owner = "JBYEFPCA", name = "t", descriptor = "I")
    private int field821;

    @OriginalMember(owner = "JBYEFPCA", name = "u", descriptor = "I")
    private int field822;

    @OriginalMember(owner = "JBYEFPCA", name = "A", descriptor = "LRIUJHZLL;")
    private class47 field828;

    @OriginalMember(owner = "JBYEFPCA", name = "o", descriptor = "I")
    private int field816;

    @OriginalMember(owner = "JBYEFPCA", name = "p", descriptor = "I")
    private int field817;

    @OriginalMember(owner = "JBYEFPCA", name = "v", descriptor = "I")
    public int field823;

    @OriginalMember(owner = "JBYEFPCA", name = "w", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "JBYEFPCA", name = "x", descriptor = "[I")
    public int[] field825;

    @OriginalMember(owner = "JBYEFPCA", name = "q", descriptor = "Lclient;")
    public static client field818;

    @OriginalMember(owner = "JBYEFPCA", name = "a", descriptor = "(I)LBQKZHFKO;")
    public final class4 method277(int arg0) {
        int var2 = -1;
        if (arg0 != -12201) {
            throw new NullPointerException();
        }
        if (this.field823 != -1) {
            class57 var3 = class57.field1497[this.field823];
            int var4 = var3.field1499;
            int var5 = var3.field1500;
            int var6 = var3.field1501;
            int var7 = client.field184[var6 - var5];
            var2 = field818.field286[var4] >> var5 & var7;
        } else if (this.field824 != -1) {
            var2 = field818.field286[this.field824];
        }
        return var2 < 0 || var2 >= this.field825.length || this.field825[var2] == -1 ? null : class4.method24(this.field825[var2]);
    }

    @OriginalMember(owner = "JBYEFPCA", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public final class66 method225(boolean arg0) {
        int var2 = -1;
        if (!arg0) {
            throw new NullPointerException();
        }
        if (this.field828 != null) {
            int var3 = client.field347 - this.field817;
            if (var3 > 100 && this.field828.field1285 > 0) {
                var3 = 100;
            }
            label44: {
                do {
                    do {
                        if (var3 <= this.field828.method414(this.field816, this.field826)) {
                            break label44;
                        }
                        var3 -= this.field828.method414(this.field816, this.field826);
                        this.field816++;
                    } while (this.field816 < this.field828.field1281);
                    this.field816 -= this.field828.field1285;
                } while (this.field816 >= 0 && this.field816 < this.field828.field1281);
                this.field828 = null;
            }
            this.field817 = client.field347 - var3;
            if (this.field828 != null) {
                var2 = this.field828.field1282[this.field816];
            }
        }
        class4 var4;
        if (this.field825 == null) {
            var4 = class4.method24(this.field813);
        } else {
            var4 = this.method277(-12201);
        }
        return var4 == null ? null : var4.method20(this.field814, this.field815, this.field819, this.field820, this.field821, this.field822, var2);
    }

    @OriginalMember(owner = "JBYEFPCA", name = "<init>", descriptor = "(IIIIIIIIZZ)V")
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field813 = arg3;
        if (!arg8) {
            for (int var11 = 1; var11 > 0; var11++) {
            }
        }
        this.field814 = arg5;
        this.field815 = arg6;
        this.field819 = arg7;
        this.field820 = arg0;
        this.field821 = arg4;
        this.field822 = arg2;
        if (arg1 != -1) {
            this.field828 = class47.field1280[arg1];
            this.field816 = 0;
            this.field817 = client.field347;
            if (arg9 && this.field828.field1285 != -1) {
                this.field816 = (int) (Math.random() * (double) this.field828.field1281);
                this.field817 -= (int) (Math.random() * (double) this.field828.method414(this.field816, this.field826));
            }
        }
        class4 var12 = class4.method24(this.field813);
        this.field823 = var12.field59;
        this.field824 = var12.field65;
        this.field825 = var12.field41;
    }
}
