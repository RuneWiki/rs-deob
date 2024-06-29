import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class104 {

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "[Lee;")
    private class459[] field1836 = new class459[10];

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    private int field1837;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    private int field1835;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Llt;II)Lhq;")
    public static final class104 method766(class458 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2715(arg2, arg1, false);
        return var3 == null ? null : new class104(new class40(var3));
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "()Lgu;")
    public final class393 method767() {
        byte[] var1 = this.method769();
        return new class393(22050, var1, this.field1837 * 22050 / 1000, this.field1835 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "()I")
    public final int method768() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1836[var2] != null && this.field1836[var2].field7070 / 20 < var1) {
                var1 = this.field1836[var2].field7070 / 20;
            }
        }
        if (this.field1837 < this.field1835 && this.field1837 / 20 < var1) {
            var1 = this.field1837 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1836[var3] != null) {
                this.field1836[var3].field7070 -= var1 * 20;
            }
        }
        if (this.field1837 < this.field1835) {
            this.field1837 -= var1 * 20;
            this.field1835 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "()[B")
    private final byte[] method769() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1836[var2] != null && this.field1836[var2].field7070 + this.field1836[var2].field7056 > var1) {
                var1 = this.field1836[var2].field7070 + this.field1836[var2].field7056;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1836[var5] != null) {
                int var6 = this.field1836[var5].field7056 * 22050 / 1000;
                int var7 = this.field1836[var5].field7070 * 22050 / 1000;
                int[] var8 = this.field1836[var5].method2747(var6, this.field1836[var5].field7056);
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

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lha;)V")
    private class104(class40 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method257((byte) 90);
            if (var3 != 0) {
                arg0.field585--;
                this.field1836[var2] = new class459();
                this.field1836[var2].method2746(arg0);
            }
        }
        this.field1837 = arg0.method254((byte) -100);
        this.field1835 = arg0.method254((byte) -34);
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
    private class104() {
    }
}
