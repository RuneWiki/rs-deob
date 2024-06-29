import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class200 {

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "[Lhf;")
    private class82[] field3716 = new class82[10];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    private int field3715;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    private int field3717;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I")
    public final int method1328() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3716[var2] != null && this.field3716[var2].field1587 / 20 < var1) {
                var1 = this.field3716[var2].field1587 / 20;
            }
        }
        if (this.field3715 < this.field3717 && this.field3715 / 20 < var1) {
            var1 = this.field3715 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field3716[var3] != null) {
                this.field3716[var3].field1587 -= var1 * 20;
            }
        }
        if (this.field3715 < this.field3717) {
            this.field3715 -= var1 * 20;
            this.field3717 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()Lcb;")
    public final class24 method1329() {
        byte[] var1 = this.method1330();
        return new class24(22050, var1, this.field3715 * 22050 / 1000, this.field3717 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()[B")
    private final byte[] method1330() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field3716[var2] != null && this.field3716[var2].field1588 + this.field3716[var2].field1587 > var1) {
                var1 = this.field3716[var2].field1588 + this.field3716[var2].field1587;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field3716[var5] != null) {
                int var6 = this.field3716[var5].field1588 * 22050 / 1000;
                int var7 = this.field3716[var5].field1587 * 22050 / 1000;
                int[] var8 = this.field3716[var5].method522(var6, this.field3716[var5].field1588);
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

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Leh;II)Lsf;")
    public static final class200 method1331(class52 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method342(arg2, arg1, (byte) -45);
        return var3 == null ? null : new class200(new class185(var3));
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lra;)V")
    private class200(class185 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1243(3);
            if (var3 != 0) {
                arg0.field3432--;
                this.field3716[var2] = new class82();
                this.field3716[var2].method523(arg0);
            }
        }
        this.field3715 = arg0.method1252(2);
        this.field3717 = arg0.method1252(2);
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    private class200() {
    }
}
