import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class172 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[Lcn;")
    private class301[] field2370 = new class301[10];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    private int field2369;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ltq;II)Lne;", line = 4)
    public static final class172 method1146(class376 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2431((byte) 64, arg1, arg2);
        return var3 == null ? null : new class172(new class236(var3));
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()[B", line = 12)
    private final byte[] method1147() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2370[var2] != null && this.field2370[var2].field4236 + this.field2370[var2].field4218 > var1) {
                var1 = this.field2370[var2].field4236 + this.field2370[var2].field4218;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2370[var5] != null) {
                int var6 = this.field2370[var5].field4218 * 22050 / 1000;
                int var7 = this.field2370[var5].field4236 * 22050 / 1000;
                int[] var8 = this.field2370[var5].method1987(var6, this.field2370[var5].field4218);
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

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()Lvo;", line = 77)
    public final class27 method1148() {
        byte[] var1 = this.method1147();
        return new class27(22050, var1, this.field2368 * 22050 / 1000, this.field2369 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ldg;)V", line = 86)
    private class172(class236 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1574(-12);
            if (var3 != 0) {
                arg0.field3320--;
                this.field2370[var2] = new class301();
                this.field2370[var2].method1985(arg0);
            }
        }
        this.field2368 = arg0.method1617((byte) 48);
        this.field2369 = arg0.method1617((byte) 48);
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 106)
    private class172() {
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()I", line = 110)
    public final int method1149() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2370[var2] != null && this.field2370[var2].field4236 / 20 < var1) {
                var1 = this.field2370[var2].field4236 / 20;
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
                this.field2370[var3].field4236 -= var1 * 20;
            }
        }
        if (this.field2368 < this.field2369) {
            this.field2368 -= var1 * 20;
            this.field2369 -= var1 * 20;
        }
        return var1;
    }
}
