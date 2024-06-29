import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class113 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[Lab;")
    private class3[] field2792 = new class3[10];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    private int field2793;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    private int field2794;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Lta;")
    public final class126 method919() {
        byte[] var1 = this.method923();
        return new class126(22050, var1, this.field2793 * 22050 / 1000, this.field2794 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public final int method920() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2792[var2] != null && this.field2792[var2].field84 / 20 < var1) {
                var1 = this.field2792[var2].field84 / 20;
            }
        }
        if (this.field2793 < this.field2794 && this.field2793 / 20 < var1) {
            var1 = this.field2793 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2792[var3] != null) {
                this.field2792[var3].field84 -= var1 * 20;
            }
        }
        if (this.field2793 < this.field2794) {
            this.field2793 -= var1 * 20;
            this.field2794 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lge;II)Lr;")
    public static final class113 method921(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method526((byte) 120, arg1, arg2);
        return var3 == null ? null : new class113(new class14(var3));
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lge;I)Lr;")
    public static final class113 method922(class47 arg0, int arg1) {
        byte[] var2 = arg0.method533(arg1, (byte) 25);
        return var2 == null ? null : new class113(new class14(var2));
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()[B")
    private final byte[] method923() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2792[var2] != null && this.field2792[var2].field84 + this.field2792[var2].field78 > var1) {
                var1 = this.field2792[var2].field84 + this.field2792[var2].field78;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2792[var5] != null) {
                int var6 = this.field2792[var5].field78 * 22050 / 1000;
                int var7 = this.field2792[var5].field84 * 22050 / 1000;
                int[] var8 = this.field2792[var5].method28(var6, this.field2792[var5].field78);
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

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lbf;)V")
    private class113(class14 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method153(true);
            if (var3 != 0) {
                arg0.field314--;
                this.field2792[var2] = new class3();
                this.field2792[var2].method27(arg0);
            }
        }
        this.field2793 = arg0.method138((byte) 97);
        this.field2794 = arg0.method138((byte) 102);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    private class113() {
    }
}
