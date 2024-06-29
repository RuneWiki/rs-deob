import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 {

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "[Lcf;")
    private class21[] field157 = new class21[10];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    private int field156;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "()[B")
    private final byte[] method47() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field157[var2] != null && this.field157[var2].field443 + this.field157[var2].field432 > var1) {
                var1 = this.field157[var2].field443 + this.field157[var2].field432;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field157[var5] != null) {
                int var6 = this.field157[var5].field443 * 22050 / 1000;
                int var7 = this.field157[var5].field432 * 22050 / 1000;
                int[] var8 = this.field157[var5].method134(var6, this.field157[var5].field443);
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

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsd;I)Lba;")
    public static final class9 method48(class122 arg0, int arg1) {
        byte[] var2 = arg0.method996(arg1, (byte) -102);
        return var2 == null ? null : new class9(new class51(var2));
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lsd;II)Lba;")
    public static final class9 method49(class122 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method986(arg2, arg1, (byte) 67);
        return var3 == null ? null : new class9(new class51(var3));
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Lhb;)V")
    private class9(class51 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method373(25094);
            if (var3 != 0) {
                arg0.field1128--;
                this.field157[var2] = new class21();
                this.field157[var2].method135(arg0);
            }
        }
        this.field155 = arg0.method383(-2056200760);
        this.field156 = arg0.method383(-2056200760);
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "()Le;")
    public final class29 method50() {
        byte[] var1 = this.method47();
        return new class29(22050, var1, this.field155 * 22050 / 1000, this.field156 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "()I")
    public final int method51() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field157[var2] != null && this.field157[var2].field432 / 20 < var1) {
                var1 = this.field157[var2].field432 / 20;
            }
        }
        if (this.field155 < this.field156 && this.field155 / 20 < var1) {
            var1 = this.field155 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field157[var3] != null) {
                this.field157[var3].field432 -= var1 * 20;
            }
        }
        if (this.field155 < this.field156) {
            this.field155 -= var1 * 20;
            this.field156 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    private class9() {
    }
}
