import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[Lva;")
    private class123[] field2205 = new class123[10];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    private int field2207;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    private int field2206;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lfd;", line = 4)
    public final class35 method683() {
        byte[] var1 = this.method685();
        return new class35(22050, var1, this.field2207 * 22050 / 1000, this.field2206 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lmb;II)Lob;", line = 14)
    public static final class86 method684(class74 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method611(0, arg1, arg2);
        return var3 == null ? null : new class86(new class64(var3));
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()[B", line = 22)
    private final byte[] method685() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2205[var2] != null && this.field2205[var2].field3002 + this.field2205[var2].field2998 > var1) {
                var1 = this.field2205[var2].field3002 + this.field2205[var2].field2998;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2205[var5] != null) {
                int var6 = this.field2205[var5].field3002 * 22050 / 1000;
                int var7 = this.field2205[var5].field2998 * 22050 / 1000;
                int[] var8 = this.field2205[var5].method970(var6, this.field2205[var5].field3002);
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

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()I", line = 81)
    public final int method686() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2205[var2] != null && this.field2205[var2].field2998 / 20 < var1) {
                var1 = this.field2205[var2].field2998 / 20;
            }
        }
        if (this.field2207 < this.field2206 && this.field2207 / 20 < var1) {
            var1 = this.field2207 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2205[var3] != null) {
                this.field2205[var3].field2998 -= var1 * 20;
            }
        }
        if (this.field2207 < this.field2206) {
            this.field2207 -= var1 * 20;
            this.field2206 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lkd;)V", line = 126)
    private class86(class64 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method520(-114);
            if (var3 != 0) {
                arg0.field1617--;
                this.field2205[var2] = new class123();
                this.field2205[var2].method973(arg0);
            }
        }
        this.field2207 = arg0.method506((byte) -90);
        this.field2206 = arg0.method506((byte) -90);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V", line = 147)
    private class86() {
    }
}
