import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!EFJXCNIG")
public class class15 extends class58 {

    @OriginalMember(owner = "client!EFJXCNIG", name = "q", descriptor = "Z")
    private boolean field738 = true;

    @OriginalMember(owner = "client!EFJXCNIG", name = "B", descriptor = "B")
    private byte field749 = -23;

    @OriginalMember(owner = "client!EFJXCNIG", name = "m", descriptor = "I")
    private int field734;

    @OriginalMember(owner = "client!EFJXCNIG", name = "n", descriptor = "I")
    private int field735;

    @OriginalMember(owner = "client!EFJXCNIG", name = "o", descriptor = "I")
    private int field736;

    @OriginalMember(owner = "client!EFJXCNIG", name = "w", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!EFJXCNIG", name = "x", descriptor = "I")
    private int field745;

    @OriginalMember(owner = "client!EFJXCNIG", name = "y", descriptor = "I")
    private int field746;

    @OriginalMember(owner = "client!EFJXCNIG", name = "z", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!EFJXCNIG", name = "v", descriptor = "LDVIZXFSW;")
    private class14 field743;

    @OriginalMember(owner = "client!EFJXCNIG", name = "A", descriptor = "I")
    private int field748;

    @OriginalMember(owner = "client!EFJXCNIG", name = "p", descriptor = "I")
    private int field737;

    @OriginalMember(owner = "client!EFJXCNIG", name = "s", descriptor = "I")
    public int field740;

    @OriginalMember(owner = "client!EFJXCNIG", name = "t", descriptor = "I")
    public int field741;

    @OriginalMember(owner = "client!EFJXCNIG", name = "r", descriptor = "[I")
    public int[] field739;

    @OriginalMember(owner = "client!EFJXCNIG", name = "u", descriptor = "Lclient;")
    public static client field742;

    @OriginalMember(owner = "client!EFJXCNIG", name = "<init>", descriptor = "(IIIIIIIIZI)V")
    public class15(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field734 = arg7;
        this.field735 = arg9;
        this.field736 = arg6;
        if (arg0 <= 0) {
            this.field738 = !this.field738;
        }
        this.field744 = arg5;
        this.field745 = arg4;
        this.field746 = arg2;
        this.field747 = arg1;
        if (arg3 != -1) {
            this.field743 = class14.field717[arg3];
            this.field748 = 0;
            this.field737 = client.field598 - 1;
            if (arg8 && this.field743.field722 != -1) {
                this.field748 = (int) (Math.random() * (double) this.field743.field718);
                this.field737 -= (int) (Math.random() * (double) this.field743.method207((byte) 6, this.field748));
            }
        }
        class64 var11 = class64.method548(this.field734);
        this.field740 = var11.field1614;
        this.field741 = var11.field1612;
        this.field739 = var11.field1591;
    }

    @OriginalMember(owner = "client!EFJXCNIG", name = "a", descriptor = "(B)LWEJSKHXC;")
    public final class64 method209(byte arg0) {
        if (this.field749 != arg0) {
            throw new NullPointerException();
        }
        int var2 = -1;
        if (this.field740 != -1) {
            class9 var3 = class9.field134[this.field740];
            int var4 = var3.field136;
            int var5 = var3.field137;
            int var6 = var3.field138;
            int var7 = client.field156[var6 - var5];
            var2 = field742.field344[var4] >> var5 & var7;
        } else if (this.field741 != -1) {
            var2 = field742.field344[this.field741];
        }
        return var2 < 0 || var2 >= this.field739.length || this.field739[var2] == -1 ? null : class64.method548(this.field739[var2]);
    }

    @OriginalMember(owner = "client!EFJXCNIG", name = "a", descriptor = "(I)LOJGAHFXC;")
    public final class41 method1(int arg0) {
        int var2 = -1;
        if (this.field743 != null) {
            int var3 = client.field598 - this.field737;
            if (var3 > 100 && this.field743.field722 > 0) {
                var3 = 100;
            }
            label45: {
                do {
                    do {
                        if (var3 <= this.field743.method207((byte) 6, this.field748)) {
                            break label45;
                        }
                        var3 -= this.field743.method207((byte) 6, this.field748);
                        this.field748++;
                    } while (this.field748 < this.field743.field718);
                    this.field748 -= this.field743.field722;
                } while (this.field748 >= 0 && this.field748 < this.field743.field718);
                this.field743 = null;
            }
            this.field737 = client.field598 - var3;
            if (this.field743 != null) {
                var2 = this.field743.field719[this.field748];
            }
        }
        class64 var4;
        if (this.field739 == null) {
            var4 = class64.method548(this.field734);
        } else {
            var4 = this.method209((byte) -23);
        }
        if (var4 == null) {
            return null;
        }
        class41 var5 = var4.method549(this.field735, this.field736, this.field744, this.field745, this.field746, this.field747, var2);
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
        return var5;
    }
}
