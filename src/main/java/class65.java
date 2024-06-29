import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[Lma;")
    private class73[] field1644 = new class73[10];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    private int field1645;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    private int field1643;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()Lvb;", line = 6)
    public final class124 method573() {
        byte[] var1 = this.method574();
        return new class124(22050, var1, this.field1645 * 22050 / 1000, this.field1643 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()[B", line = 14)
    private final byte[] method574() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1644[var2] != null && this.field1644[var2].field1848 + this.field1644[var2].field1840 > var1) {
                var1 = this.field1644[var2].field1848 + this.field1644[var2].field1840;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1644[var5] != null) {
                int var6 = this.field1644[var5].field1840 * 22050 / 1000;
                int var7 = this.field1644[var5].field1848 * 22050 / 1000;
                int[] var8 = this.field1644[var5].method617(var6, this.field1644[var5].field1840);
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

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()I", line = 74)
    public final int method575() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1644[var2] != null && this.field1644[var2].field1848 / 20 < var1) {
                var1 = this.field1644[var2].field1848 / 20;
            }
        }
        if (this.field1645 < this.field1643 && this.field1645 / 20 < var1) {
            var1 = this.field1645 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1644[var3] != null) {
                this.field1644[var3].field1848 -= var1 * 20;
            }
        }
        if (this.field1645 < this.field1643) {
            this.field1645 -= var1 * 20;
            this.field1643 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lwd;)V", line = 127)
    private class65(class131 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method971(true);
            if (var3 != 0) {
                arg0.field3182--;
                this.field1644[var2] = new class73();
                this.field1644[var2].method616(arg0);
            }
        }
        this.field1645 = arg0.method1001(65280);
        this.field1643 = arg0.method1001(65280);
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 147)
    private class65() {
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ltd;II)Lke;", line = 121)
    public static final class65 method576(class116 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method892(arg1, arg2, false);
        return var3 == null ? null : new class65(new class131(var3));
    }
}
