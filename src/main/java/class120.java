import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mh")
public class class120 {

    @OriginalMember(owner = "mh", name = "b", descriptor = "[Lvc;")
    private class196[] field2339 = new class196[10];

    @OriginalMember(owner = "mh", name = "c", descriptor = "I")
    private int field2340;

    @OriginalMember(owner = "mh", name = "a", descriptor = "I")
    private int field2338;

    @OriginalMember(owner = "mh", name = "a", descriptor = "()[B")
    private final byte[] method865() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2339[var2] != null && this.field2339[var2].field3758 + this.field2339[var2].field3740 > var1) {
                var1 = this.field2339[var2].field3758 + this.field2339[var2].field3740;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2339[var5] != null) {
                int var6 = this.field2339[var5].field3740 * 22050 / 1000;
                int var7 = this.field2339[var5].field3758 * 22050 / 1000;
                int[] var8 = this.field2339[var5].method1308(var6, this.field2339[var5].field3740);
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

    @OriginalMember(owner = "mh", name = "b", descriptor = "()I")
    public final int method866() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2339[var2] != null && this.field2339[var2].field3758 / 20 < var1) {
                var1 = this.field2339[var2].field3758 / 20;
            }
        }
        if (this.field2340 < this.field2338 && this.field2340 / 20 < var1) {
            var1 = this.field2340 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2339[var3] != null) {
                this.field2339[var3].field3758 -= var1 * 20;
            }
        }
        if (this.field2340 < this.field2338) {
            this.field2340 -= var1 * 20;
            this.field2338 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "mh", name = "a", descriptor = "(Lbg;II)Lmh;")
    public static final class120 method867(class18 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method147(0, arg2, arg1);
        return var3 == null ? null : new class120(new class86(var3));
    }

    @OriginalMember(owner = "mh", name = "c", descriptor = "()Lk;")
    public final class94 method868() {
        byte[] var1 = this.method865();
        return new class94(22050, var1, this.field2340 * 22050 / 1000, this.field2338 * 22050 / 1000);
    }

    @OriginalMember(owner = "mh", name = "<init>", descriptor = "(Lja;)V")
    private class120(class86 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method598((byte) 119);
            if (var3 != 0) {
                arg0.field1773--;
                this.field2339[var2] = new class196();
                this.field2339[var2].method1305(arg0);
            }
        }
        this.field2340 = arg0.method569(true);
        this.field2338 = arg0.method569(true);
    }

    @OriginalMember(owner = "mh", name = "<init>", descriptor = "()V")
    private class120() {
    }
}
