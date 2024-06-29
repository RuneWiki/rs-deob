import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class15 {

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "[Lta;")
    private class116[] field229 = new class116[10];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lva;II)Lai;", line = 5)
    public static final class15 method120(class36 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method261(-1, arg1, arg2);
        return var3 == null ? null : new class15(new class3(var3));
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "()[B", line = 17)
    private final byte[] method121() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field229[var2] != null && this.field229[var2].field1752 + this.field229[var2].field1736 > var1) {
                var1 = this.field229[var2].field1752 + this.field229[var2].field1736;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field229[var5] != null) {
                int var6 = this.field229[var5].field1736 * 22050 / 1000;
                int var7 = this.field229[var5].field1752 * 22050 / 1000;
                int[] var8 = this.field229[var5].method734(var6, this.field229[var5].field1736);
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

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "()Lph;", line = 78)
    public final class34 method122() {
        byte[] var1 = this.method121();
        return new class34(22050, var1, this.field228 * 22050 / 1000, this.field230 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lfj;)V", line = 128)
    private class15(class3 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method64((byte) -82);
            if (var3 != 0) {
                arg0.field44--;
                this.field229[var2] = new class116();
                this.field229[var2].method732(arg0);
            }
        }
        this.field228 = arg0.method63((byte) 1);
        this.field230 = arg0.method63((byte) 1);
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V", line = 149)
    private class15() {
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "()I", line = 86)
    public final int method123() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field229[var2] != null && this.field229[var2].field1752 / 20 < var1) {
                var1 = this.field229[var2].field1752 / 20;
            }
        }
        if (this.field228 < this.field230 && this.field228 / 20 < var1) {
            var1 = this.field228 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field229[var3] != null) {
                this.field229[var3].field1752 -= var1 * 20;
            }
        }
        if (this.field228 < this.field230) {
            this.field228 -= var1 * 20;
            this.field230 -= var1 * 20;
        }
        return var1;
    }
}
