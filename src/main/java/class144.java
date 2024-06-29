import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class144 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[Lgi;")
    private class250[] field2370 = new class250[10];

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()[B", line = 4)
    private final byte[] method1046() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2370[var2] != null && this.field2370[var2].field4161 + this.field2370[var2].field4149 > var1) {
                var1 = this.field2370[var2].field4161 + this.field2370[var2].field4149;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2370[var5] != null) {
                int var6 = this.field2370[var5].field4149 * 22050 / 1000;
                int var7 = this.field2370[var5].field4161 * 22050 / 1000;
                int[] var8 = this.field2370[var5].method1747(var6, this.field2370[var5].field4149);
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

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()I", line = 64)
    public final int method1047() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2370[var2] != null && this.field2370[var2].field4161 / 20 < var1) {
                var1 = this.field2370[var2].field4161 / 20;
            }
        }
        if (this.field2368 < this.field2369 && this.field2368 / 20 < var1) {
            var1 = this.field2368 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2370[var3] != null) {
                this.field2370[var3].field4161 -= var1 * 20;
            }
        }
        if (this.field2368 < this.field2369) {
            this.field2368 -= var1 * 20;
            this.field2369 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()Luc;", line = 108)
    public final class107 method1048() {
        byte[] var1 = this.method1046();
        return new class107(22050, var1, this.field2368 * 22050 / 1000, this.field2369 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lme;II)Lcl;", line = 114)
    public static final class144 method1049(class295 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2042(arg1, arg2, (byte) -128);
        return var3 == null ? null : new class144(new class170(var3));
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Ls;)V", line = 128)
    private class144(class170 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1221(106);
            if (var3 != 0) {
                arg0.field2787--;
                this.field2370[var2] = new class250();
                this.field2370[var2].method1748(arg0);
            }
        }
        this.field2368 = arg0.method1214(-18254);
        this.field2369 = arg0.method1214(-18254);
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V", line = 148)
    private class144() {
    }
}
