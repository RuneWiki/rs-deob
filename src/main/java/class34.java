import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[Lmo;")
    private class681[] field391 = new class681[10];

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    private int field393;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    private int field392;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "()Lwb;", line = 5)
    public final class298 method186() {
        byte[] var1 = this.method188();
        return new class298(22050, var1, this.field393 * 22050 / 1000, this.field392 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Ljo;II)Lbh;", line = 12)
    public static final class34 method187(class303 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1719(arg2, arg1, 4);
        return var3 == null ? null : new class34(new class452(var3));
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Liaa;)V", line = 129)
    private class34(class452 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2541(57);
            if (var3 != 0) {
                arg0.field6215--;
                this.field391[var2] = new class681();
                this.field391[var2].method3807(arg0);
            }
        }
        this.field393 = arg0.method2574(-1758460248);
        this.field392 = arg0.method2574(-1758460248);
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 149)
    private class34() {
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "()[B", line = 29)
    private final byte[] method188() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field391[var2] != null && this.field391[var2].field9660 + this.field391[var2].field9655 > var1) {
                var1 = this.field391[var2].field9660 + this.field391[var2].field9655;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field391[var5] != null) {
                int var6 = this.field391[var5].field9655 * 22050 / 1000;
                int var7 = this.field391[var5].field9660 * 22050 / 1000;
                int[] var8 = this.field391[var5].method3806(var6, this.field391[var5].field9655);
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

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "()I", line = 88)
    public final int method189() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field391[var2] != null && this.field391[var2].field9660 / 20 < var1) {
                var1 = this.field391[var2].field9660 / 20;
            }
        }
        if (this.field393 < this.field392 && this.field393 / 20 < var1) {
            var1 = this.field393 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field391[var3] != null) {
                this.field391[var3].field9660 -= var1 * 20;
            }
        }
        if (this.field393 < this.field392) {
            this.field393 -= var1 * 20;
            this.field392 -= var1 * 20;
        }
        return var1;
    }
}
