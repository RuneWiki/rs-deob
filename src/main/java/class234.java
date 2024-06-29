import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class234 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "[Lid;")
    private class275[] field3550 = new class275[10];

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    private int field3551;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method1682() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3550[var2] != null && this.field3550[var2].field4313 + this.field3550[var2].field4305 > var1) {
                var1 = this.field3550[var2].field4313 + this.field3550[var2].field4305;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3550[var5] != null) {
                int var6 = this.field3550[var5].field4313 * 22050 / 1000;
                int var7 = this.field3550[var5].field4305 * 22050 / 1000;
                int[] var8 = this.field3550[var5].method1957(var6, this.field3550[var5].field4313);
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

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lpk;II)Lli;", line = 66)
    public static final class234 method1683(class120 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method967(arg1, arg2, 65280);
        return var3 == null ? null : new class234(new class1(var3));
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "()I", line = 75)
    public final int method1684() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3550[var2] != null && this.field3550[var2].field4305 / 20 < var1) {
                var1 = this.field3550[var2].field4305 / 20;
            }
        }
        if (this.field3549 < this.field3551 && this.field3549 / 20 < var1) {
            var1 = this.field3549 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3550[var3] != null) {
                this.field3550[var3].field4305 -= var1 * 20;
            }
        }
        if (this.field3549 < this.field3551) {
            this.field3549 -= var1 * 20;
            this.field3551 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "()Lrk;", line = 118)
    public final class187 method1685() {
        byte[] var1 = this.method1682();
        return new class187(22050, var1, this.field3549 * 22050 / 1000, this.field3551 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Laj;)V", line = 129)
    private class234(class1 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method15((byte) 106);
            if (var3 != 0) {
                arg0.field48--;
                this.field3550[var2] = new class275();
                this.field3550[var2].method1956(arg0);
            }
        }
        this.field3549 = arg0.method56(19612);
        this.field3551 = arg0.method56(19612);
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 149)
    private class234() {
    }
}
