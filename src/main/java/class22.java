import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class22 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "[Lpa;")
    private class2[] field335 = new class2[10];

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lcg;II)Lga;", line = 4)
    public static final class22 method220(class49 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method441(false, arg1, arg2);
        return var3 == null ? null : new class22(new class336(var3));
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "()[B", line = 12)
    private final byte[] method221() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field335[var2] != null && this.field335[var2].field31 + this.field335[var2].field18 > var1) {
                var1 = this.field335[var2].field31 + this.field335[var2].field18;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field335[var5] != null) {
                int var6 = this.field335[var5].field18 * 22050 / 1000;
                int var7 = this.field335[var5].field31 * 22050 / 1000;
                int[] var8 = this.field335[var5].method11(var6, this.field335[var5].field18);
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

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()I", line = 71)
    public final int method222() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field335[var2] != null && this.field335[var2].field31 / 20 < var1) {
                var1 = this.field335[var2].field31 / 20;
            }
        }
        if (this.field334 < this.field333 && this.field334 / 20 < var1) {
            var1 = this.field334 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field335[var3] != null) {
                this.field335[var3].field31 -= var1 * 20;
            }
        }
        if (this.field334 < this.field333) {
            this.field334 -= var1 * 20;
            this.field333 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lpi;)V", line = 124)
    private class22(class336 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2364(-9069);
            if (var3 != 0) {
                arg0.field5353--;
                this.field335[var2] = new class2();
                this.field335[var2].method9(arg0);
            }
        }
        this.field334 = arg0.method2339((byte) -46);
        this.field333 = arg0.method2339((byte) -46);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 144)
    private class22() {
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lri;", line = 148)
    public final class76 method223() {
        byte[] var1 = this.method221();
        return new class76(22050, var1, this.field334 * 22050 / 1000, this.field333 * 22050 / 1000);
    }
}
