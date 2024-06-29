import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class245 {

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[Lef;")
    private class370[] field3336 = new class370[10];

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "I")
    private int field3335;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lg;II)Lfo;", line = 6)
    public static final class245 method1333(class470 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2768(-20472, arg2, arg1);
        return var3 == null ? null : new class245(new class179(var3));
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "()Ljk;", line = 18)
    public final class436 method1334() {
        byte[] var1 = this.method1335();
        return new class436(22050, var1, this.field3337 * 22050 / 1000, this.field3335 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "()[B", line = 23)
    private final byte[] method1335() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3336[var2] != null && this.field3336[var2].field5310 + this.field3336[var2].field5295 > var1) {
                var1 = this.field3336[var2].field5310 + this.field3336[var2].field5295;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3336[var5] != null) {
                int var6 = this.field3336[var5].field5310 * 22050 / 1000;
                int var7 = this.field3336[var5].field5295 * 22050 / 1000;
                int[] var8 = this.field3336[var5].method2237(var6, this.field3336[var5].field5310);
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

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "()I", line = 83)
    public final int method1336() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3336[var2] != null && this.field3336[var2].field5295 / 20 < var1) {
                var1 = this.field3336[var2].field5295 / 20;
            }
        }
        if (this.field3337 < this.field3335 && this.field3337 / 20 < var1) {
            var1 = this.field3337 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3336[var3] != null) {
                this.field3336[var3].field5295 -= var1 * 20;
            }
        }
        if (this.field3337 < this.field3335) {
            this.field3337 -= var1 * 20;
            this.field3335 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lvt;)V", line = 129)
    private class245(class179 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method895((byte) -102);
            if (var3 != 0) {
                arg0.field2206--;
                this.field3336[var2] = new class370();
                this.field3336[var2].method2239(arg0);
            }
        }
        this.field3337 = arg0.method916(21933);
        this.field3335 = arg0.method916(21933);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V", line = 149)
    private class245() {
    }
}
