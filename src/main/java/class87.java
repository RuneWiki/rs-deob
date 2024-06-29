import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class87 {

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "[Lje;")
    private class59[] field1973 = new class59[10];

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lud;II)Loc;", line = 4)
    public static final class87 method685(class118 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method909((byte) -121, arg2, arg1);
        return var3 == null ? null : new class87(new class27(var3));
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()I", line = 12)
    public final int method686() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1973[var2] != null && this.field1973[var2].field1212 / 20 < var1) {
                var1 = this.field1973[var2].field1212 / 20;
            }
        }
        if (this.field1975 < this.field1974 && this.field1975 / 20 < var1) {
            var1 = this.field1975 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1973[var3] != null) {
                this.field1973[var3].field1212 -= var1 * 20;
            }
        }
        if (this.field1975 < this.field1974) {
            this.field1975 -= var1 * 20;
            this.field1974 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()Led;", line = 55)
    public final class29 method687() {
        byte[] var1 = this.method688();
        return new class29(22050, var1, this.field1975 * 22050 / 1000, this.field1974 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Leb;)V", line = 127)
    private class87(class27 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method231(255);
            if (var3 != 0) {
                arg0.field482--;
                this.field1973[var2] = new class59();
                this.field1973[var2].method478(arg0);
            }
        }
        this.field1975 = arg0.method227(127);
        this.field1974 = arg0.method227(127);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 147)
    private class87() {
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()[B", line = 69)
    private final byte[] method688() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1973[var2] != null && this.field1973[var2].field1227 + this.field1973[var2].field1212 > var1) {
                var1 = this.field1973[var2].field1227 + this.field1973[var2].field1212;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1973[var5] != null) {
                int var6 = this.field1973[var5].field1227 * 22050 / 1000;
                int var7 = this.field1973[var5].field1212 * 22050 / 1000;
                int[] var8 = this.field1973[var5].method479(var6, this.field1973[var5].field1227);
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
}
