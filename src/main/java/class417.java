import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class417 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "[Lmc;")
    private class273[] field5702 = new class273[10];

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    private int field5703;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    private int field5704;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "()Lve;")
    public final class159 method2565() {
        byte[] var1 = this.method2568();
        return new class159(22050, var1, this.field5703 * 22050 / 1000, this.field5704 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lwo;II)Lgl;")
    public static final class417 method2566(class285 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1794(5860, arg1, arg2);
        return var3 == null ? null : new class417(new class242(var3));
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "()I")
    public final int method2567() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5702[var2] != null && this.field5702[var2].field3524 / 20 < var1) {
                var1 = this.field5702[var2].field3524 / 20;
            }
        }
        if (this.field5703 < this.field5704 && this.field5703 / 20 < var1) {
            var1 = this.field5703 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field5702[var3] != null) {
                this.field5702[var3].field3524 -= var1 * 20;
            }
        }
        if (this.field5703 < this.field5704) {
            this.field5703 -= var1 * 20;
            this.field5704 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "()[B")
    private final byte[] method2568() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field5702[var2] != null && this.field5702[var2].field3540 + this.field5702[var2].field3524 > var1) {
                var1 = this.field5702[var2].field3540 + this.field5702[var2].field3524;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field5702[var5] != null) {
                int var6 = this.field5702[var5].field3540 * 22050 / 1000;
                int var7 = this.field5702[var5].field3524 * 22050 / 1000;
                int[] var8 = this.field5702[var5].method1720(var6, this.field5702[var5].field3540);
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

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lbg;)V")
    private class417(class242 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1563(-128);
            if (var3 != 0) {
                arg0.field3211--;
                this.field5702[var2] = new class273();
                this.field5702[var2].method1719(arg0);
            }
        }
        this.field5703 = arg0.method1587((byte) -102);
        this.field5704 = arg0.method1587((byte) -102);
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V")
    private class417() {
    }
}
