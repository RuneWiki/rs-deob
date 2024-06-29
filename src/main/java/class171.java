import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class171 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Lrd;")
    private class203[] field2820 = new class203[10];

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    private int field2821;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field2819;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method1265() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2820[var2] != null && this.field2820[var2].field3322 + this.field2820[var2].field3316 > var1) {
                var1 = this.field2820[var2].field3322 + this.field2820[var2].field3316;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2820[var5] != null) {
                int var6 = this.field2820[var5].field3316 * 22050 / 1000;
                int var7 = this.field2820[var5].field3322 * 22050 / 1000;
                int[] var8 = this.field2820[var5].method1482(var6, this.field2820[var5].field3316);
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

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I", line = 65)
    public final int method1266() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2820[var2] != null && this.field2820[var2].field3322 / 20 < var1) {
                var1 = this.field2820[var2].field3322 / 20;
            }
        }
        if (this.field2821 < this.field2819 && this.field2821 / 20 < var1) {
            var1 = this.field2821 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2820[var3] != null) {
                this.field2820[var3].field3322 -= var1 * 20;
            }
        }
        if (this.field2821 < this.field2819) {
            this.field2821 -= var1 * 20;
            this.field2819 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lak;II)Lec;", line = 109)
    public static final class171 method1267(class172 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1287(arg2, arg1, -1);
        return var3 == null ? null : new class171(new class44(var3));
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljj;)V", line = 129)
    private class171(class44 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method286((byte) -105);
            if (var3 != 0) {
                arg0.field586--;
                this.field2820[var2] = new class203();
                this.field2820[var2].method1483(arg0);
            }
        }
        this.field2821 = arg0.method271(21081);
        this.field2819 = arg0.method271(21081);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 149)
    private class171() {
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()Lom;", line = 126)
    public final class125 method1268() {
        byte[] var1 = this.method1265();
        return new class125(22050, var1, this.field2821 * 22050 / 1000, this.field2819 * 22050 / 1000);
    }
}
