import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class101 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lba;")
    private class156[] field1502 = new class156[10];

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field1503;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()Lla;")
    public final class131 method682() {
        byte[] var1 = this.method683();
        return new class131(22050, var1, this.field1503 * 22050 / 1000, this.field1501 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()[B")
    private final byte[] method683() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1502[var2] != null && this.field1502[var2].field2326 + this.field1502[var2].field2321 > var1) {
                var1 = this.field1502[var2].field2326 + this.field1502[var2].field2321;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1502[var5] != null) {
                int var6 = this.field1502[var5].field2321 * 22050 / 1000;
                int var7 = this.field1502[var5].field2326 * 22050 / 1000;
                int[] var8 = this.field1502[var5].method1082(var6, this.field1502[var5].field2321);
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

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()I")
    public final int method684() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1502[var2] != null && this.field1502[var2].field2326 / 20 < var1) {
                var1 = this.field1502[var2].field2326 / 20;
            }
        }
        if (this.field1503 < this.field1501 && this.field1503 / 20 < var1) {
            var1 = this.field1503 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1502[var3] != null) {
                this.field1502[var3].field2326 -= var1 * 20;
            }
        }
        if (this.field1503 < this.field1501) {
            this.field1503 -= var1 * 20;
            this.field1501 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lvl;II)Lsf;")
    public static final class101 method685(class73 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method501(-2, arg2, arg1);
        return var3 == null ? null : new class101(new class170(var3));
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lim;)V")
    private class101(class170 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1218(81);
            if (var3 != 0) {
                arg0.field2676--;
                this.field1502[var2] = new class156();
                this.field1502[var2].method1084(arg0);
            }
        }
        this.field1503 = arg0.method1186((byte) -92);
        this.field1501 = arg0.method1186((byte) -38);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    private class101() {
    }
}
