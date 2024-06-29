import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class137 {

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "[Lga;")
    private class18[] field2310 = new class18[10];

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    private int field2309;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    private int field2311;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()Lcd;", line = 5)
    public final class64 method1011() {
        byte[] var1 = this.method1014();
        return new class64(22050, var1, this.field2309 * 22050 / 1000, this.field2311 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lce;II)Loc;", line = 14)
    public static final class137 method1012(class239 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1651(arg1, arg2, -1);
        return var3 == null ? null : new class137(new class26(var3));
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "()I", line = 23)
    public final int method1013() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2310[var2] != null && this.field2310[var2].field277 / 20 < var1) {
                var1 = this.field2310[var2].field277 / 20;
            }
        }
        if (this.field2309 < this.field2311 && this.field2309 / 20 < var1) {
            var1 = this.field2309 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field2310[var3] != null) {
                this.field2310[var3].field277 -= var1 * 20;
            }
        }
        if (this.field2309 < this.field2311) {
            this.field2309 -= var1 * 20;
            this.field2311 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "()[B", line = 67)
    private final byte[] method1014() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field2310[var2] != null && this.field2310[var2].field288 + this.field2310[var2].field277 > var1) {
                var1 = this.field2310[var2].field288 + this.field2310[var2].field277;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field2310[var5] != null) {
                int var6 = this.field2310[var5].field288 * 22050 / 1000;
                int var7 = this.field2310[var5].field277 * 22050 / 1000;
                int[] var8 = this.field2310[var5].method101(var6, this.field2310[var5].field288);
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

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lsd;)V", line = 129)
    private class137(class26 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method226(255);
            if (var3 != 0) {
                arg0.field478--;
                this.field2310[var2] = new class18();
                this.field2310[var2].method103(arg0);
            }
        }
        this.field2309 = arg0.method197(-1);
        this.field2311 = arg0.method197(-1);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 149)
    private class137() {
    }
}
