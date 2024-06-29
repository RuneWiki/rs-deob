import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class113 {

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[Lm;")
    private class63[] field2097 = new class63[10];

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field2095;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I")
    public final int method885() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2097[var2] != null && this.field2097[var2].field1087 / 20 < var1) {
                var1 = this.field2097[var2].field1087 / 20;
            }
        }
        if (this.field2096 < this.field2095 && this.field2096 / 20 < var1) {
            var1 = this.field2096 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2097[var3] != null) {
                this.field2097[var3].field1087 -= var1 * 20;
            }
        }
        if (this.field2096 < this.field2095) {
            this.field2096 -= var1 * 20;
            this.field2095 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lff;II)Lcd;")
    public static final class113 method886(class3 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method23(arg2, 103, arg1);
        return var3 == null ? null : new class113(new class239(var3));
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()Lvh;")
    public final class131 method887() {
        byte[] var1 = this.method888();
        return new class131(22050, var1, this.field2096 * 22050 / 1000, this.field2095 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()[B")
    private final byte[] method888() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2097[var2] != null && this.field2097[var2].field1087 + this.field2097[var2].field1067 > var1) {
                var1 = this.field2097[var2].field1087 + this.field2097[var2].field1067;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2097[var5] != null) {
                int var6 = this.field2097[var5].field1067 * 22050 / 1000;
                int var7 = this.field2097[var5].field1087 * 22050 / 1000;
                int[] var8 = this.field2097[var5].method447(var6, this.field2097[var5].field1067);
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

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lrg;)V")
    private class113(class239 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1651(4139);
            if (var3 != 0) {
                arg0.field4124--;
                this.field2097[var2] = new class63();
                this.field2097[var2].method449(arg0);
            }
        }
        this.field2096 = arg0.method1663((byte) 119);
        this.field2095 = arg0.method1663((byte) 98);
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    private class113() {
    }
}
