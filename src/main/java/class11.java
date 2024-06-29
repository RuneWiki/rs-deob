import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class11 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "[Lcd;")
    private class57[] field207 = new class57[10];

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "()I")
    public final int method98() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field207[var2] != null && this.field207[var2].field989 / 20 < var1) {
                var1 = this.field207[var2].field989 / 20;
            }
        }
        if (this.field209 < this.field208 && this.field209 / 20 < var1) {
            var1 = this.field209 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field207[var3] != null) {
                this.field207[var3].field989 -= var1 * 20;
            }
        }
        if (this.field209 < this.field208) {
            this.field209 -= var1 * 20;
            this.field208 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()Lsa;")
    public final class91 method99() {
        byte[] var1 = this.method100();
        return new class91(22050, var1, this.field209 * 22050 / 1000, this.field208 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "()[B")
    private final byte[] method100() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field207[var2] != null && this.field207[var2].field989 + this.field207[var2].field987 > var1) {
                var1 = this.field207[var2].field989 + this.field207[var2].field987;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field207[var5] != null) {
                int var6 = this.field207[var5].field987 * 22050 / 1000;
                int var7 = this.field207[var5].field989 * 22050 / 1000;
                int[] var8 = this.field207[var5].method394(var6, this.field207[var5].field987);
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

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lhi;II)Lnk;")
    public static final class11 method101(class250 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1688(0, arg2, arg1);
        return var3 == null ? null : new class11(new class118(var3));
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Ljd;)V")
    private class11(class118 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method867(false);
            if (var3 != 0) {
                arg0.field2155--;
                this.field207[var2] = new class57();
                this.field207[var2].method395(arg0);
            }
        }
        this.field209 = arg0.method827(255);
        this.field208 = arg0.method827(255);
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    private class11() {
    }
}
