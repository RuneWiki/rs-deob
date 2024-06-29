import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class239 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[Lrh;")
    private class129[] field4091 = new class129[10];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    private int field4092;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    private int field4090;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()I", line = 4)
    public final int method1738() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4091[var2] != null && this.field4091[var2].field2284 / 20 < var1) {
                var1 = this.field4091[var2].field2284 / 20;
            }
        }
        if (this.field4092 < this.field4090 && this.field4092 / 20 < var1) {
            var1 = this.field4092 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field4091[var3] != null) {
                this.field4091[var3].field2284 -= var1 * 20;
            }
        }
        if (this.field4092 < this.field4090) {
            this.field4092 -= var1 * 20;
            this.field4090 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()[B", line = 50)
    private final byte[] method1739() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field4091[var2] != null && this.field4091[var2].field2300 + this.field4091[var2].field2284 > var1) {
                var1 = this.field4091[var2].field2300 + this.field4091[var2].field2284;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field4091[var5] != null) {
                int var6 = this.field4091[var5].field2300 * 22050 / 1000;
                int var7 = this.field4091[var5].field2284 * 22050 / 1000;
                int[] var8 = this.field4091[var5].method935(var6, this.field4091[var5].field2300);
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

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lqm;II)Ltk;", line = 110)
    public static final class239 method1740(class222 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1580(0, arg2, arg1);
        return var3 == null ? null : new class239(new class13(var3));
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()Lbe;", line = 123)
    public final class286 method1741() {
        byte[] var1 = this.method1739();
        return new class286(22050, var1, this.field4092 * 22050 / 1000, this.field4090 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lkh;)V", line = 129)
    private class239(class13 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method152((byte) -91);
            if (var3 != 0) {
                arg0.field281--;
                this.field4091[var2] = new class129();
                this.field4091[var2].method934(arg0);
            }
        }
        this.field4092 = arg0.method112((byte) 92);
        this.field4090 = arg0.method112((byte) 92);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V", line = 149)
    private class239() {
    }
}
