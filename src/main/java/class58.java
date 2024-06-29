import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class58 {

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[Lue;")
    private class15[] field923 = new class15[10];

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    private int field922;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lja;II)Lwf;", line = 4)
    public static final class58 method433(class64 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method467(arg2, 105, arg1);
        return var3 == null ? null : new class58(new class101(var3));
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()I", line = 12)
    public final int method434() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field923[var2] != null && this.field923[var2].field284 / 20 < var1) {
                var1 = this.field923[var2].field284 / 20;
            }
        }
        if (this.field922 < this.field924 && this.field922 / 20 < var1) {
            var1 = this.field922 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field923[var3] != null) {
                this.field923[var3].field284 -= var1 * 20;
            }
        }
        if (this.field922 < this.field924) {
            this.field922 -= var1 * 20;
            this.field924 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()[B", line = 56)
    private final byte[] method435() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field923[var2] != null && this.field923[var2].field284 + this.field923[var2].field276 > var1) {
                var1 = this.field923[var2].field284 + this.field923[var2].field276;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field923[var5] != null) {
                int var6 = this.field923[var5].field276 * 22050 / 1000;
                int var7 = this.field923[var5].field284 * 22050 / 1000;
                int[] var8 = this.field923[var5].method126(var6, this.field923[var5].field276);
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

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()Loc;", line = 119)
    public final class144 method436() {
        byte[] var1 = this.method435();
        return new class144(22050, var1, this.field922 * 22050 / 1000, this.field924 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Lpe;)V", line = 128)
    private class58(class101 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method741(97);
            if (var3 != 0) {
                arg0.field1667--;
                this.field923[var2] = new class15();
                this.field923[var2].method129(arg0);
            }
        }
        this.field922 = arg0.method731(false);
        this.field924 = arg0.method731(false);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 148)
    private class58() {
    }
}
