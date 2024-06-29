import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public class class400 {

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "[Lbb;")
    private class147[] field6090 = new class147[10];

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
    private int field6091;

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "I")
    private int field6092;

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "()[B")
    private final byte[] method2456() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6090[var2] != null && this.field6090[var2].field2114 + this.field6090[var2].field2109 > var1) {
                var1 = this.field6090[var2].field2114 + this.field6090[var2].field2109;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field6090[var5] != null) {
                int var6 = this.field6090[var5].field2114 * 22050 / 1000;
                int var7 = this.field6090[var5].field2109 * 22050 / 1000;
                int[] var8 = this.field6090[var5].method974(var6, this.field6090[var5].field2114);
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

    @OriginalMember(owner = "client!dw", name = "b", descriptor = "()Luq;")
    public final class343 method2457() {
        byte[] var1 = this.method2456();
        return new class343(22050, var1, this.field6091 * 22050 / 1000, this.field6092 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lns;II)Ldw;")
    public static final class400 method2458(class438 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method2650(arg2, -110, arg1);
        return var3 == null ? null : new class400(new class91(var3));
    }

    @OriginalMember(owner = "client!dw", name = "c", descriptor = "()I")
    public final int method2459() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field6090[var2] != null && this.field6090[var2].field2109 / 20 < var1) {
                var1 = this.field6090[var2].field2109 / 20;
            }
        }
        if (this.field6091 < this.field6092 && this.field6091 / 20 < var1) {
            var1 = this.field6091 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field6090[var3] != null) {
                this.field6090[var3].field2109 -= var1 * 20;
            }
        }
        if (this.field6091 < this.field6092) {
            this.field6091 -= var1 * 20;
            this.field6092 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(Ltl;)V")
    private class400(class91 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method618((byte) 100);
            if (var3 != 0) {
                arg0.field1292--;
                this.field6090[var2] = new class147();
                this.field6090[var2].method975(arg0);
            }
        }
        this.field6091 = arg0.method631(10494);
        this.field6092 = arg0.method631(10494);
    }

    @OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
    private class400() {
    }
}
