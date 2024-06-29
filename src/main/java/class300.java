import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class300 {

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "[Lfd;")
    private class48[] field4645 = new class48[10];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    private int field4644;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lwf;II)Lkk;", line = 7)
    public static final class300 method1973(class306 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2103(0, arg1, arg2);
        return var3 == null ? null : new class300(new class303(var3));
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "()Lb;", line = 16)
    public final class73 method1974() {
        byte[] var1 = this.method1975();
        return new class73(22050, var1, this.field4644 * 22050 / 1000, this.field4646 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "()[B", line = 21)
    private final byte[] method1975() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4645[var2] != null && this.field4645[var2].field681 + this.field4645[var2].field673 > var1) {
                var1 = this.field4645[var2].field681 + this.field4645[var2].field673;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4645[var5] != null) {
                int var6 = this.field4645[var5].field681 * 22050 / 1000;
                int var7 = this.field4645[var5].field673 * 22050 / 1000;
                int[] var8 = this.field4645[var5].method334(var6, this.field4645[var5].field681);
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

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "()I", line = 84)
    public final int method1976() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4645[var2] != null && this.field4645[var2].field673 / 20 < var1) {
                var1 = this.field4645[var2].field673 / 20;
            }
        }
        if (this.field4644 < this.field4646 && this.field4644 / 20 < var1) {
            var1 = this.field4644 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4645[var3] != null) {
                this.field4645[var3].field673 -= var1 * 20;
            }
        }
        if (this.field4644 < this.field4646) {
            this.field4644 -= var1 * 20;
            this.field4646 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lgn;)V", line = 129)
    private class300(class303 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2043((byte) -118);
            if (var3 != 0) {
                arg0.field4679--;
                this.field4645[var2] = new class48();
                this.field4645[var2].method333(arg0);
            }
        }
        this.field4644 = arg0.method1994(false);
        this.field4646 = arg0.method1994(false);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 149)
    private class300() {
    }
}
