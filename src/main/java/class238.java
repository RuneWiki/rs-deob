import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class238 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "[Luc;")
    private class165[] field3581 = new class165[10];

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    private int field3580;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    private int field3582;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "()I")
    public final int method1558() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3581[var2] != null && this.field3581[var2].field2389 / 20 < var1) {
                var1 = this.field3581[var2].field2389 / 20;
            }
        }
        if (this.field3580 < this.field3582 && this.field3580 / 20 < var1) {
            var1 = this.field3580 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3581[var3] != null) {
                this.field3581[var3].field2389 -= var1 * 20;
            }
        }
        if (this.field3580 < this.field3582) {
            this.field3580 -= var1 * 20;
            this.field3582 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "()[B")
    private final byte[] method1559() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3581[var2] != null && this.field3581[var2].field2389 + this.field3581[var2].field2384 > var1) {
                var1 = this.field3581[var2].field2389 + this.field3581[var2].field2384;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3581[var5] != null) {
                int var6 = this.field3581[var5].field2384 * 22050 / 1000;
                int var7 = this.field3581[var5].field2389 * 22050 / 1000;
                int[] var8 = this.field3581[var5].method1102(var6, this.field3581[var5].field2384);
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

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lve;II)Ls;")
    public static final class238 method1560(class233 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1538(arg1, arg2, (byte) 113);
        return var3 == null ? null : new class238(new class114(var3));
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lkl;)V")
    private class238(class114 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method760(false);
            if (var3 != 0) {
                arg0.field1673--;
                this.field3581[var2] = new class165();
                this.field3581[var2].method1103(arg0);
            }
        }
        this.field3580 = arg0.method756(-29901);
        this.field3582 = arg0.method756(-29901);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "()Lml;")
    public final class116 method1561() {
        byte[] var1 = this.method1559();
        return new class116(22050, var1, this.field3580 * 22050 / 1000, this.field3582 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    private class238() {
    }
}
