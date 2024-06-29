import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class490 {

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "[Liaa;")
    private class470[] field6858 = new class470[10];

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    private int field6859;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lkr;II)Ljt;")
    public static final class490 method2753(class329 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2054(true, arg1, arg2);
        return var3 == null ? null : new class490(new class551(var3));
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "()[B")
    private final byte[] method2754() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6858[var2] != null && this.field6858[var2].field6670 + this.field6858[var2].field6659 > var1) {
                var1 = this.field6858[var2].field6670 + this.field6858[var2].field6659;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6858[var5] != null) {
                int var6 = this.field6858[var5].field6670 * 22050 / 1000;
                int var7 = this.field6858[var5].field6659 * 22050 / 1000;
                int[] var8 = this.field6858[var5].method2690(var6, this.field6858[var5].field6670);
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

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lge;)V")
    private class490(class551 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method3045(-126);
            if (var3 != 0) {
                arg0.field7707--;
                this.field6858[var2] = new class470();
                this.field6858[var2].method2689(arg0);
            }
        }
        this.field6860 = arg0.method3090(-111);
        this.field6859 = arg0.method3090(-71);
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "()I")
    public final int method2755() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6858[var2] != null && this.field6858[var2].field6659 / 20 < var1) {
                var1 = this.field6858[var2].field6659 / 20;
            }
        }
        if (this.field6860 < this.field6859 && this.field6860 / 20 < var1) {
            var1 = this.field6860 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6858[var3] != null) {
                this.field6858[var3].field6659 -= var1 * 20;
            }
        }
        if (this.field6860 < this.field6859) {
            this.field6860 -= var1 * 20;
            this.field6859 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "()Lti;")
    public final class300 method2756() {
        byte[] var1 = this.method2754();
        return new class300(22050, var1, this.field6860 * 22050 / 1000, this.field6859 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V")
    private class490() {
    }
}
