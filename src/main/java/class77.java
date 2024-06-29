import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class77 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "[Lmi;")
    private class177[] field1331 = new class177[10];

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    private int field1332;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    private int field1333;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public final int method496() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1331[var2] != null && this.field1331[var2].field3036 / 20 < var1) {
                var1 = this.field1331[var2].field3036 / 20;
            }
        }
        if (this.field1332 < this.field1333 && this.field1332 / 20 < var1) {
            var1 = this.field1332 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1331[var3] != null) {
                this.field1331[var3].field3036 -= var1 * 20;
            }
        }
        if (this.field1332 < this.field1333) {
            this.field1332 -= var1 * 20;
            this.field1333 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lng;II)Ljd;")
    public static final class77 method497(class121 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method826((byte) 35, arg1, arg2);
        return var3 == null ? null : new class77(new class225(var3));
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()Ltf;")
    public final class103 method498() {
        byte[] var1 = this.method499();
        return new class103(22050, var1, this.field1332 * 22050 / 1000, this.field1333 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()[B")
    private final byte[] method499() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1331[var2] != null && this.field1331[var2].field3036 + this.field1331[var2].field3028 > var1) {
                var1 = this.field1331[var2].field3036 + this.field1331[var2].field3028;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1331[var5] != null) {
                int var6 = this.field1331[var5].field3028 * 22050 / 1000;
                int var7 = this.field1331[var5].field3036 * 22050 / 1000;
                int[] var8 = this.field1331[var5].method1194(var6, this.field1331[var5].field3028);
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

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lji;)V")
    private class77(class225 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method1580(-56);
            if (var3 != 0) {
                arg0.field3996--;
                this.field1331[var2] = new class177();
                this.field1331[var2].method1191(arg0);
            }
        }
        this.field1332 = arg0.method1593(true);
        this.field1333 = arg0.method1593(true);
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    private class77() {
    }
}
