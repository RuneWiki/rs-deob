import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "[Lib;")
    private class89[] field79 = new class89[10];

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field78;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    private int field77;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "()Lqc;")
    public final class171 method46() {
        byte[] var1 = this.method47();
        return new class171(22050, var1, this.field78 * 22050 / 1000, this.field77 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "()[B")
    private final byte[] method47() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field79[var2] != null && this.field79[var2].field1691 + this.field79[var2].field1679 > var1) {
                var1 = this.field79[var2].field1691 + this.field79[var2].field1679;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field79[var5] != null) {
                int var6 = this.field79[var5].field1679 * 22050 / 1000;
                int var7 = this.field79[var5].field1691 * 22050 / 1000;
                int[] var8 = this.field79[var5].method577(var6, this.field79[var5].field1679);
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

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "()I")
    public final int method48() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field79[var2] != null && this.field79[var2].field1691 / 20 < var1) {
                var1 = this.field79[var2].field1691 / 20;
            }
        }
        if (this.field78 < this.field77 && this.field78 / 20 < var1) {
            var1 = this.field78 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field79[var3] != null) {
                this.field79[var3].field1691 -= var1 * 20;
            }
        }
        if (this.field78 < this.field77) {
            this.field78 -= var1 * 20;
            this.field77 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lab;II)Lac;")
    public static final class4 method49(class3 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method33(-29616, arg1, arg2);
        return var3 == null ? null : new class4(new class109(var3));
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lka;)V")
    private class4(class109 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method662((byte) -94);
            if (var3 != 0) {
                arg0.field2053--;
                this.field79[var2] = new class89();
                this.field79[var2].method575(arg0);
            }
        }
        this.field78 = arg0.method675(2);
        this.field77 = arg0.method675(2);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    private class4() {
    }
}
