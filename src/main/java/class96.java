import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class96 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Ls;")
    private class118[] field1757 = new class118[10];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    private int field1758;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()[B", line = 9)
    private final byte[] method667() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1757[var2] != null && this.field1757[var2].field2073 + this.field1757[var2].field2072 > var1) {
                var1 = this.field1757[var2].field2073 + this.field1757[var2].field2072;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1757[var5] != null) {
                int var6 = this.field1757[var5].field2072 * 22050 / 1000;
                int var7 = this.field1757[var5].field2073 * 22050 / 1000;
                int[] var8 = this.field1757[var5].method806(var6, this.field1757[var5].field2072);
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

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lum;II)Lec;", line = 69)
    public static final class96 method668(class222 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1577(arg1, arg2, -29569);
        return var3 == null ? null : new class96(new class153(var3));
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()Lvk;", line = 79)
    public final class154 method669() {
        byte[] var1 = this.method667();
        return new class154(22050, var1, this.field1756 * 22050 / 1000, this.field1758 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I", line = 84)
    public final int method670() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1757[var2] != null && this.field1757[var2].field2073 / 20 < var1) {
                var1 = this.field1757[var2].field2073 / 20;
            }
        }
        if (this.field1756 < this.field1758 && this.field1756 / 20 < var1) {
            var1 = this.field1756 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1757[var3] != null) {
                this.field1757[var3].field2073 -= var1 * 20;
            }
        }
        if (this.field1756 < this.field1758) {
            this.field1756 -= var1 * 20;
            this.field1758 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lbc;)V", line = 129)
    private class96(class153 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1082(-121);
            if (var3 != 0) {
                arg0.field2611--;
                this.field1757[var2] = new class118();
                this.field1757[var2].method804(arg0);
            }
        }
        this.field1756 = arg0.method1090(false);
        this.field1758 = arg0.method1090(false);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 149)
    private class96() {
    }
}
