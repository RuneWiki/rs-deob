import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class80 {

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "[Leg;")
    private class278[] field1400 = new class278[10];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lqs;II)Lht;", line = 5)
    public static final class80 method584(class496 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2926(arg2, -114, arg1);
        return var3 == null ? null : new class80(new class23(var3));
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "()[B", line = 13)
    private final byte[] method585() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1400[var2] != null && this.field1400[var2].field4560 + this.field1400[var2].field4558 > var1) {
                var1 = this.field1400[var2].field4560 + this.field1400[var2].field4558;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1400[var5] != null) {
                int var6 = this.field1400[var5].field4560 * 22050 / 1000;
                int var7 = this.field1400[var5].field4558 * 22050 / 1000;
                int[] var8 = this.field1400[var5].method1832(var6, this.field1400[var5].field4560);
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

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "()Lmg;", line = 73)
    public final class168 method586() {
        byte[] var1 = this.method585();
        return new class168(22050, var1, this.field1399 * 22050 / 1000, this.field1401 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "()I", line = 83)
    public final int method587() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1400[var2] != null && this.field1400[var2].field4558 / 20 < var1) {
                var1 = this.field1400[var2].field4558 / 20;
            }
        }
        if (this.field1399 < this.field1401 && this.field1399 / 20 < var1) {
            var1 = this.field1399 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1400[var3] != null) {
                this.field1400[var3].field4558 -= var1 * 20;
            }
        }
        if (this.field1399 < this.field1401) {
            this.field1399 -= var1 * 20;
            this.field1401 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lia;)V", line = 128)
    private class80(class23 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method126((byte) -96);
            if (var3 != 0) {
                arg0.field301--;
                this.field1400[var2] = new class278();
                this.field1400[var2].method1833(arg0);
            }
        }
        this.field1399 = arg0.method132(57);
        this.field1401 = arg0.method132(105);
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "()V", line = 148)
    private class80() {
    }
}
