import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class207 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lso;")
    private class330[] field2685 = new class330[10];

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field2683;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()[B", line = 5)
    private final byte[] method1284() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2685[var2] != null && this.field2685[var2].field4172 + this.field2685[var2].field4169 > var1) {
                var1 = this.field2685[var2].field4172 + this.field2685[var2].field4169;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2685[var5] != null) {
                int var6 = this.field2685[var5].field4172 * 22050 / 1000;
                int var7 = this.field2685[var5].field4169 * 22050 / 1000;
                int[] var8 = this.field2685[var5].method1922(var6, this.field2685[var5].field4172);
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

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()I", line = 69)
    public final int method1285() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2685[var2] != null && this.field2685[var2].field4169 / 20 < var1) {
                var1 = this.field2685[var2].field4169 / 20;
            }
        }
        if (this.field2683 < this.field2684 && this.field2683 / 20 < var1) {
            var1 = this.field2683 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2685[var3] != null) {
                this.field2685[var3].field4169 -= var1 * 20;
            }
        }
        if (this.field2683 < this.field2684) {
            this.field2683 -= var1 * 20;
            this.field2684 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lfh;)V", line = 124)
    private class207(class463 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2737(false);
            if (var3 != 0) {
                arg0.field6631--;
                this.field2685[var2] = new class330();
                this.field2685[var2].method1921(arg0);
            }
        }
        this.field2683 = arg0.method2758((byte) 118);
        this.field2684 = arg0.method2758((byte) 75);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V", line = 144)
    private class207() {
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lqn;II)Lcd;", line = 117)
    public static final class207 method1286(class47 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method481(arg1, arg2, -82);
        return var3 == null ? null : new class207(new class463(var3));
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()Ljc;", line = 148)
    public final class305 method1287() {
        byte[] var1 = this.method1284();
        return new class305(22050, var1, this.field2683 * 22050 / 1000, this.field2684 * 22050 / 1000);
    }
}
