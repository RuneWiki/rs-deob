import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[Lf;")
    private class36[] field1204 = new class36[10];

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()I")
    public final int method338() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field981 / 20 < var1) {
                var1 = this.field1204[var2].field981 / 20;
            }
        }
        if (this.field1205 < this.field1203 && this.field1205 / 20 < var1) {
            var1 = this.field1205 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1204[var3] != null) {
                this.field1204[var3].field981 -= var1 * 20;
            }
        }
        if (this.field1205 < this.field1203) {
            this.field1205 -= var1 * 20;
            this.field1203 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lff;II)Lga;")
    public static final class44 method339(class42 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method315(arg2, true, arg1);
        return var3 == null ? null : new class44(new class148(var3));
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()[B")
    private final byte[] method340() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1204[var2] != null && this.field1204[var2].field985 + this.field1204[var2].field981 > var1) {
                var1 = this.field1204[var2].field985 + this.field1204[var2].field981;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1204[var5] != null) {
                int var6 = this.field1204[var5].field985 * 22050 / 1000;
                int var7 = this.field1204[var5].field981 * 22050 / 1000;
                int[] var8 = this.field1204[var5].method273(var6, this.field1204[var5].field985);
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

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lqe;")
    public final class115 method341() {
        byte[] var1 = this.method340();
        return new class115(22050, var1, this.field1205 * 22050 / 1000, this.field1203 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lff;I)Lga;")
    public static final class44 method342(class42 arg0, int arg1) {
        byte[] var2 = arg0.method304(arg1, true);
        return var2 == null ? null : new class44(new class148(var2));
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lwb;)V")
    private class44(class148 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1137(255);
            if (var3 != 0) {
                arg0.field3601--;
                this.field1204[var2] = new class36();
                this.field1204[var2].method274(arg0);
            }
        }
        this.field1205 = arg0.method1140(-1);
        this.field1203 = arg0.method1140(-1);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    private class44() {
    }
}
