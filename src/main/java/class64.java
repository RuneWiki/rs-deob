import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class64 {

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "[Ljg;")
    private class268[] field924 = new class268[10];

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    private int field925;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "()I")
    public final int method422() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field924[var2] != null && this.field924[var2].field3613 / 20 < var1) {
                var1 = this.field924[var2].field3613 / 20;
            }
        }
        if (this.field925 < this.field926 && this.field925 / 20 < var1) {
            var1 = this.field925 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field924[var3] != null) {
                this.field924[var3].field3613 -= var1 * 20;
            }
        }
        if (this.field925 < this.field926) {
            this.field925 -= var1 * 20;
            this.field926 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ldk;II)Lhn;")
    public static final class64 method423(class421 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2512(arg1, (byte) -93, arg2);
        return var3 == null ? null : new class64(new class319(var3));
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "()[B")
    private final byte[] method424() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field924[var2] != null && this.field924[var2].field3613 + this.field924[var2].field3600 > var1) {
                var1 = this.field924[var2].field3613 + this.field924[var2].field3600;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field924[var5] != null) {
                int var6 = this.field924[var5].field3600 * 22050 / 1000;
                int var7 = this.field924[var5].field3613 * 22050 / 1000;
                int[] var8 = this.field924[var5].method1578(var6, this.field924[var5].field3600);
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

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lsv;)V")
    private class64(class319 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1869(-83);
            if (var3 != 0) {
                arg0.field4360--;
                this.field924[var2] = new class268();
                this.field924[var2].method1577(arg0);
            }
        }
        this.field925 = arg0.method1844(-108);
        this.field926 = arg0.method1844(-126);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "()Lhe;")
    public final class174 method425() {
        byte[] var1 = this.method424();
        return new class174(22050, var1, this.field925 * 22050 / 1000, this.field926 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V")
    private class64() {
    }
}
