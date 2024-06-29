import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class65 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "[Lwf;")
    private class53[] field852 = new class53[10];

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    private int field854;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    private int field853;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()I", line = 4)
    public final int method429() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field852[var2] != null && this.field852[var2].field655 / 20 < var1) {
                var1 = this.field852[var2].field655 / 20;
            }
        }
        if (this.field854 < this.field853 && this.field854 / 20 < var1) {
            var1 = this.field854 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field852[var3] != null) {
                this.field852[var3].field655 -= var1 * 20;
            }
        }
        if (this.field854 < this.field853) {
            this.field854 -= var1 * 20;
            this.field853 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lre;)V", line = 115)
    private class65(class263 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1787(false);
            if (var3 != 0) {
                arg0.field4025--;
                this.field852[var2] = new class53();
                this.field852[var2].method352(arg0);
            }
        }
        this.field854 = arg0.method1830((byte) -77);
        this.field853 = arg0.method1830((byte) -77);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 144)
    private class65() {
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "()[B", line = 56)
    private final byte[] method430() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field852[var2] != null && this.field852[var2].field666 + this.field852[var2].field655 > var1) {
                var1 = this.field852[var2].field666 + this.field852[var2].field655;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field852[var5] != null) {
                int var6 = this.field852[var5].field666 * 22050 / 1000;
                int var7 = this.field852[var5].field655 * 22050 / 1000;
                int[] var8 = this.field852[var5].method350(var6, this.field852[var5].field666);
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

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Llm;II)Lg;", line = 137)
    public static final class65 method431(class210 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1441(arg2, (byte) -44, arg1);
        return var3 == null ? null : new class65(new class263(var3));
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "()Lsf;", line = 148)
    public final class220 method432() {
        byte[] var1 = this.method430();
        return new class220(22050, var1, this.field854 * 22050 / 1000, this.field853 * 22050 / 1000);
    }
}
