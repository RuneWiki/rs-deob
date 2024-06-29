import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class124 {

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[Lra;")
    private class119[] field2752 = new class119[10];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    private int field2750;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    private int field2751;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()[B")
    private final byte[] method965() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2752[var2] != null && this.field2752[var2].field2688 + this.field2752[var2].field2675 > var1) {
                var1 = this.field2752[var2].field2688 + this.field2752[var2].field2675;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2752[var5] != null) {
                int var6 = this.field2752[var5].field2688 * 22050 / 1000;
                int var7 = this.field2752[var5].field2675 * 22050 / 1000;
                int[] var8 = this.field2752[var5].method947(var6, this.field2752[var5].field2688);
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

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()I")
    public final int method966() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2752[var2] != null && this.field2752[var2].field2675 / 20 < var1) {
                var1 = this.field2752[var2].field2675 / 20;
            }
        }
        if (this.field2750 < this.field2751 && this.field2750 / 20 < var1) {
            var1 = this.field2750 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2752[var3] != null) {
                this.field2752[var3].field2675 -= var1 * 20;
            }
        }
        if (this.field2750 < this.field2751) {
            this.field2750 -= var1 * 20;
            this.field2751 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lfd;II)Lrf;")
    public static final class124 method967(class40 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method267((byte) -124, arg2, arg1);
        return var3 == null ? null : new class124(new class91(var3));
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()Ls;")
    public final class125 method968() {
        byte[] var1 = this.method965();
        return new class125(22050, var1, this.field2750 * 22050 / 1000, this.field2751 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lna;)V")
    private class124(class91 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method649(false);
            if (var3 != 0) {
                arg0.field2043--;
                this.field2752[var2] = new class119();
                this.field2752[var2].method945(arg0);
            }
        }
        this.field2750 = arg0.method641(255);
        this.field2751 = arg0.method641(255);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    private class124() {
    }
}
