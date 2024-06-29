import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class192 {

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "[Lki;")
    private class62[] field3083 = new class62[10];

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    private int field3084;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lqh;II)Lgg;")
    public static final class192 method1307(class201 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1357(arg2, arg1, -1);
        return var3 == null ? null : new class192(new class221(var3));
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()Lcf;")
    public final class93 method1308() {
        byte[] var1 = this.method1309();
        return new class93(22050, var1, this.field3085 * 22050 / 1000, this.field3084 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()[B")
    private final byte[] method1309() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3083[var2] != null && this.field3083[var2].field1012 + this.field3083[var2].field1010 > var1) {
                var1 = this.field3083[var2].field1012 + this.field3083[var2].field1010;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3083[var5] != null) {
                int var6 = this.field3083[var5].field1012 * 22050 / 1000;
                int var7 = this.field3083[var5].field1010 * 22050 / 1000;
                int[] var8 = this.field3083[var5].method441(var6, this.field3083[var5].field1012);
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

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()I")
    public final int method1310() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3083[var2] != null && this.field3083[var2].field1010 / 20 < var1) {
                var1 = this.field3083[var2].field1010 / 20;
            }
        }
        if (this.field3085 < this.field3084 && this.field3085 / 20 < var1) {
            var1 = this.field3085 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3083[var3] != null) {
                this.field3083[var3].field1010 -= var1 * 20;
            }
        }
        if (this.field3085 < this.field3084) {
            this.field3085 -= var1 * 20;
            this.field3084 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Log;)V")
    private class192(class221 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1517((byte) -96);
            if (var3 != 0) {
                arg0.field3655--;
                this.field3083[var2] = new class62();
                this.field3083[var2].method442(arg0);
            }
        }
        this.field3085 = arg0.method1521((byte) 113);
        this.field3084 = arg0.method1521((byte) 113);
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    private class192() {
    }
}
