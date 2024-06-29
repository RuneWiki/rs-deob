import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class48 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[Lne;")
    private class134[] field912 = new class134[10];

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()Loa;")
    public final class140 method316() {
        byte[] var1 = this.method317();
        return new class140(22050, var1, this.field911 * 22050 / 1000, this.field913 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()[B")
    private final byte[] method317() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field912[var2] != null && this.field912[var2].field2552 + this.field912[var2].field2541 > var1) {
                var1 = this.field912[var2].field2552 + this.field912[var2].field2541;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field912[var5] != null) {
                int var6 = this.field912[var5].field2552 * 22050 / 1000;
                int var7 = this.field912[var5].field2541 * 22050 / 1000;
                int[] var8 = this.field912[var5].method848(var6, this.field912[var5].field2552);
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

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lpe;II)Leg;")
    public static final class48 method318(class154 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1065((byte) 74, arg2, arg1);
        return var3 == null ? null : new class48(new class146(var3));
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()I")
    public final int method319() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field912[var2] != null && this.field912[var2].field2541 / 20 < var1) {
                var1 = this.field912[var2].field2541 / 20;
            }
        }
        if (this.field911 < this.field913 && this.field911 / 20 < var1) {
            var1 = this.field911 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field912[var3] != null) {
                this.field912[var3].field2541 -= var1 * 20;
            }
        }
        if (this.field911 < this.field913) {
            this.field911 -= var1 * 20;
            this.field913 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Log;)V")
    private class48(class146 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method991(255);
            if (var3 != 0) {
                arg0.field2865--;
                this.field912[var2] = new class134();
                this.field912[var2].method846(arg0);
            }
        }
        this.field911 = arg0.method1007(83);
        this.field913 = arg0.method1007(126);
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V")
    private class48() {
    }
}
