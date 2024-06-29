import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class148 {

    @OriginalMember(owner = "client!p", name = "b", descriptor = "[Lwg;")
    private class298[] field1968 = new class298[10];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    private int field1969;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    private int field1967;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "()[B")
    private final byte[] method923() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1968[var2] != null && this.field1968[var2].field4379 + this.field1968[var2].field4366 > var1) {
                var1 = this.field1968[var2].field4379 + this.field1968[var2].field4366;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1968[var5] != null) {
                int var6 = this.field1968[var5].field4379 * 22050 / 1000;
                int var7 = this.field1968[var5].field4366 * 22050 / 1000;
                int[] var8 = this.field1968[var5].method1830(var6, this.field1968[var5].field4379);
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

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Loi;II)Lp;")
    public static final class148 method924(class53 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method426(arg1, (byte) 9, arg2);
        return var3 == null ? null : new class148(new class403(var3));
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "()I")
    public final int method925() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1968[var2] != null && this.field1968[var2].field4366 / 20 < var1) {
                var1 = this.field1968[var2].field4366 / 20;
            }
        }
        if (this.field1969 < this.field1967 && this.field1969 / 20 < var1) {
            var1 = this.field1969 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1968[var3] != null) {
                this.field1968[var3].field4366 -= var1 * 20;
            }
        }
        if (this.field1969 < this.field1967) {
            this.field1969 -= var1 * 20;
            this.field1967 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lwm;)V")
    private class148(class403 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method2357((byte) 117);
            if (var3 != 0) {
                arg0.field5665--;
                this.field1968[var2] = new class298();
                this.field1968[var2].method1828(arg0);
            }
        }
        this.field1969 = arg0.method2338(0);
        this.field1967 = arg0.method2338(0);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "()Lcj;")
    public final class499 method926() {
        byte[] var1 = this.method923();
        return new class499(22050, var1, this.field1969 * 22050 / 1000, this.field1967 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    private class148() {
    }
}
