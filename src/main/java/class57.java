import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "[Lk;")
    private class68[] field1192 = new class68[10];

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()Lna;")
    public final class87 method418() {
        byte[] var1 = this.method419();
        return new class87(22050, var1, this.field1193 * 22050 / 1000, this.field1191 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "()[B")
    private final byte[] method419() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1192[var2] != null && this.field1192[var2].field1481 + this.field1192[var2].field1461 > var1) {
                var1 = this.field1192[var2].field1481 + this.field1192[var2].field1461;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1192[var5] != null) {
                int var6 = this.field1192[var5].field1481 * 22050 / 1000;
                int var7 = this.field1192[var5].field1461 * 22050 / 1000;
                int[] var8 = this.field1192[var5].method544(var6, this.field1192[var5].field1481);
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

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lid;)V")
    private class57(class60 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method462((byte) 116);
            if (var3 != 0) {
                arg0.field1227--;
                this.field1192[var2] = new class68();
                this.field1192[var2].method542(arg0);
            }
        }
        this.field1193 = arg0.method467(255);
        this.field1191 = arg0.method467(255);
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "()I")
    public final int method420() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1192[var2] != null && this.field1192[var2].field1461 / 20 < var1) {
                var1 = this.field1192[var2].field1461 / 20;
            }
        }
        if (this.field1193 < this.field1191 && this.field1193 / 20 < var1) {
            var1 = this.field1193 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1192[var3] != null) {
                this.field1192[var3].field1461 -= var1 * 20;
            }
        }
        if (this.field1193 < this.field1191) {
            this.field1193 -= var1 * 20;
            this.field1191 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lpb;II)Lia;")
    public static final class57 method421(class100 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method762(arg1, arg2, (byte) 66);
        return var3 == null ? null : new class57(new class60(var3));
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    private class57() {
    }
}
