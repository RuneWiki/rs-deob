import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class98 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[Lpa;")
    private class103[] field2348 = new class103[10];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "()I")
    public final int method804() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2348[var2] != null && this.field2348[var2].field2494 / 20 < var1) {
                var1 = this.field2348[var2].field2494 / 20;
            }
        }
        if (this.field2350 < this.field2349 && this.field2350 / 20 < var1) {
            var1 = this.field2350 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2348[var3] != null) {
                this.field2348[var3].field2494 -= var1 * 20;
            }
        }
        if (this.field2350 < this.field2349) {
            this.field2350 -= var1 * 20;
            this.field2349 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lpc;II)Lob;")
    public static final class98 method805(class105 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method903(arg1, (byte) -128, arg2);
        return var3 == null ? null : new class98(new class57(var3));
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lpc;I)Lob;")
    public static final class98 method806(class105 arg0, int arg1) {
        byte[] var2 = arg0.method897(arg1, 0);
        return var2 == null ? null : new class98(new class57(var2));
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lfc;")
    public final class38 method807() {
        byte[] var1 = this.method808();
        return new class38(22050, var1, this.field2350 * 22050 / 1000, this.field2349 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "()[B")
    private final byte[] method808() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2348[var2] != null && this.field2348[var2].field2507 + this.field2348[var2].field2494 > var1) {
                var1 = this.field2348[var2].field2507 + this.field2348[var2].field2494;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2348[var5] != null) {
                int var6 = this.field2348[var5].field2507 * 22050 / 1000;
                int var7 = this.field2348[var5].field2494 * 22050 / 1000;
                int[] var8 = this.field2348[var5].method879(var6, this.field2348[var5].field2507);
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

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lib;)V")
    private class98(class57 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method510(-127);
            if (var3 != 0) {
                arg0.field1477--;
                this.field2348[var2] = new class103();
                this.field2348[var2].method877(arg0);
            }
        }
        this.field2350 = arg0.method506(-1);
        this.field2349 = arg0.method506(-1);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
    private class98() {
    }
}
