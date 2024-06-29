import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class271 {

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[Lrh;")
    private class108[] field4569 = new class108[10];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    private int field4567;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    private int field4568;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()Loj;", line = 7)
    public final class156 method1818() {
        byte[] var1 = this.method1821();
        return new class156(22050, var1, this.field4567 * 22050 / 1000, this.field4568 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "()I", line = 13)
    public final int method1819() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4569[var2] != null && this.field4569[var2].field1696 / 20 < var1) {
                var1 = this.field4569[var2].field1696 / 20;
            }
        }
        if (this.field4567 < this.field4568 && this.field4567 / 20 < var1) {
            var1 = this.field4567 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4569[var3] != null) {
                this.field4569[var3].field1696 -= var1 * 20;
            }
        }
        if (this.field4567 < this.field4568) {
            this.field4567 -= var1 * 20;
            this.field4568 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lcc;II)Lmh;", line = 56)
    public static final class271 method1820(class313 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2173(arg1, arg2, (byte) -23);
        return var3 == null ? null : new class271(new class134(var3));
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "()[B", line = 68)
    private final byte[] method1821() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4569[var2] != null && this.field4569[var2].field1710 + this.field4569[var2].field1696 > var1) {
                var1 = this.field4569[var2].field1710 + this.field4569[var2].field1696;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4569[var5] != null) {
                int var6 = this.field4569[var5].field1710 * 22050 / 1000;
                int var7 = this.field4569[var5].field1696 * 22050 / 1000;
                int[] var8 = this.field4569[var5].method713(var6, this.field4569[var5].field1710);
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

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lbb;)V", line = 129)
    private class271(class134 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method948(-124);
            if (var3 != 0) {
                arg0.field2299--;
                this.field4569[var2] = new class108();
                this.field4569[var2].method715(arg0);
            }
        }
        this.field4567 = arg0.method942(true);
        this.field4568 = arg0.method942(true);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 149)
    private class271() {
    }
}
