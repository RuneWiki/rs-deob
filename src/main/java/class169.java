import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class169 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[Lhc;")
    private class49[] field2689 = new class49[10];

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    private int field2690;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    private int field2688;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "()I")
    public final int method1155() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2689[var2] != null && this.field2689[var2].field639 / 20 < var1) {
                var1 = this.field2689[var2].field639 / 20;
            }
        }
        if (this.field2690 < this.field2688 && this.field2690 / 20 < var1) {
            var1 = this.field2690 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2689[var3] != null) {
                this.field2689[var3].field639 -= var1 * 20;
            }
        }
        if (this.field2690 < this.field2688) {
            this.field2690 -= var1 * 20;
            this.field2688 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "()Lqh;")
    public final class29 method1156() {
        byte[] var1 = this.method1157();
        return new class29(22050, var1, this.field2690 * 22050 / 1000, this.field2688 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "()[B")
    private final byte[] method1157() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2689[var2] != null && this.field2689[var2].field639 + this.field2689[var2].field621 > var1) {
                var1 = this.field2689[var2].field639 + this.field2689[var2].field621;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2689[var5] != null) {
                int var6 = this.field2689[var5].field621 * 22050 / 1000;
                int var7 = this.field2689[var5].field639 * 22050 / 1000;
                int[] var8 = this.field2689[var5].method281(var6, this.field2689[var5].field621);
                for (int var9 = 0; var9 < var6; var9++) {
                    int var10 = (var8[var9] >> 8) + var4[var7 + var9];
                    if ((var10 + 128 & 0xFFFFFF00) != 0) {
                        var10 = var10 >> 31 ^ 0x7F;
                    }
                    var4[var7 + var9] = (byte) var10;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Leh;II)Lti;")
    public static final class169 method1158(class137 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method928(arg1, (byte) 114, arg2);
        return var3 == null ? null : new class169(new class96(var3));
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lpd;)V")
    private class169(class96 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method584(255);
            if (var3 != 0) {
                arg0.field1228--;
                this.field2689[var2] = new class49();
                this.field2689[var2].method279(arg0);
            }
        }
        this.field2690 = arg0.method549(255);
        this.field2688 = arg0.method549(255);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
    private class169() {
    }
}
