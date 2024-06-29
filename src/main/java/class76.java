import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class76 {

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[Loe;")
    private class142[] field1396 = new class142[10];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    private int field1394;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "()[B")
    private final byte[] method545() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1396[var2] != null && this.field1396[var2].field2466 + this.field1396[var2].field2450 > var1) {
                var1 = this.field1396[var2].field2466 + this.field1396[var2].field2450;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1396[var5] != null) {
                int var6 = this.field1396[var5].field2466 * 22050 / 1000;
                int var7 = this.field1396[var5].field2450 * 22050 / 1000;
                int[] var8 = this.field1396[var5].method984(var6, this.field1396[var5].field2466);
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

    @OriginalMember(owner = "client!te", name = "b", descriptor = "()I")
    public final int method546() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1396[var2] != null && this.field1396[var2].field2450 / 20 < var1) {
                var1 = this.field1396[var2].field2450 / 20;
            }
        }
        if (this.field1395 < this.field1394 && this.field1395 / 20 < var1) {
            var1 = this.field1395 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1396[var3] != null) {
                this.field1396[var3].field2450 -= var1 * 20;
            }
        }
        if (this.field1395 < this.field1394) {
            this.field1395 -= var1 * 20;
            this.field1394 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "()Lme;")
    public final class222 method547() {
        byte[] var1 = this.method545();
        return new class222(22050, var1, this.field1395 * 22050 / 1000, this.field1394 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lpk;II)Lte;")
    public static final class76 method548(class99 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method705(arg1, arg2, -1);
        return var3 == null ? null : new class76(new class149(var3));
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lv;)V")
    private class76(class149 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1045((byte) -59);
            if (var3 != 0) {
                arg0.field2593--;
                this.field1396[var2] = new class142();
                this.field1396[var2].method982(arg0);
            }
        }
        this.field1395 = arg0.method1050(1272006568);
        this.field1394 = arg0.method1050(1272006568);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    private class76() {
    }
}
