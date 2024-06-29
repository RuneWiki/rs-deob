import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[Ltf;")
    private class213[] field826 = new class213[10];

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    private int field827;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    private int field825;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()[B")
    private final byte[] method354() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field826[var2] != null && this.field826[var2].field3988 + this.field826[var2].field3980 > var1) {
                var1 = this.field826[var2].field3988 + this.field826[var2].field3980;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field826[var5] != null) {
                int var6 = this.field826[var5].field3988 * 22050 / 1000;
                int var7 = this.field826[var5].field3980 * 22050 / 1000;
                int[] var8 = this.field826[var5].method1413(var6, this.field826[var5].field3988);
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

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
    public final int method355() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field826[var2] != null && this.field826[var2].field3980 / 20 < var1) {
                var1 = this.field826[var2].field3980 / 20;
            }
        }
        if (this.field827 < this.field825 && this.field827 / 20 < var1) {
            var1 = this.field827 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field826[var3] != null) {
                this.field826[var3].field3980 -= var1 * 20;
            }
        }
        if (this.field827 < this.field825) {
            this.field827 -= var1 * 20;
            this.field825 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lwa;II)Ldf;")
    public static final class40 method356(class238 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1547(arg2, 0, arg1);
        return var3 == null ? null : new class40(new class28(var3));
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()Lne;")
    public final class146 method357() {
        byte[] var1 = this.method354();
        return new class146(22050, var1, this.field827 * 22050 / 1000, this.field825 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lce;)V")
    private class40(class28 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method215(-1797813752);
            if (var3 != 0) {
                arg0.field526--;
                this.field826[var2] = new class213();
                this.field826[var2].method1411(arg0);
            }
        }
        this.field827 = arg0.method230((byte) -115);
        this.field825 = arg0.method230((byte) -119);
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    private class40() {
    }
}
