import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class116 {

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "[Lqh;")
    private class327[] field1837 = new class327[10];

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    private int field1838;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    private int field1836;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ldp;II)Lao;")
    public static final class116 method986(class174 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method1355(arg2, -12607, arg1);
        return var3 == null ? null : new class116(new class37(var3));
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "()Lhk;")
    public final class201 method987() {
        byte[] var1 = this.method989();
        return new class201(22050, var1, this.field1838 * 22050 / 1000, this.field1836 * 22050 / 1000);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "()I")
    public final int method988() {
        int var1 = 9999999;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1837[var2] != null && this.field1837[var2].field4708 / 20 < var1) {
                var1 = this.field1837[var2].field4708 / 20;
            }
        }
        if (this.field1838 < this.field1836 && this.field1838 / 20 < var1) {
            var1 = this.field1838 / 20;
        }
        if (var1 == 9999999 || var1 == 0) {
            return 0;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field1837[var3] != null) {
                this.field1837[var3].field4708 -= var1 * 20;
            }
        }
        if (this.field1838 < this.field1836) {
            this.field1838 -= var1 * 20;
            this.field1836 -= var1 * 20;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "()[B")
    private final byte[] method989() {
        int var1 = 0;
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field1837[var2] != null && this.field1837[var2].field4708 + this.field1837[var2].field4703 > var1) {
                var1 = this.field1837[var2].field4708 + this.field1837[var2].field4703;
            }
        }
        if (var1 == 0) {
            return new byte[0];
        }
        int var3 = var1 * 22050 / 1000;
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field1837[var5] != null) {
                int var6 = this.field1837[var5].field4703 * 22050 / 1000;
                int var7 = this.field1837[var5].field4708 * 22050 / 1000;
                int[] var8 = this.field1837[var5].method2158(var6, this.field1837[var5].field4703);
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

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lec;)V")
    private class116(class37 arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            int var3 = arg0.method271((byte) 127);
            if (var3 != 0) {
                arg0.field565--;
                this.field1837[var2] = new class327();
                this.field1837[var2].method2156(arg0);
            }
        }
        this.field1838 = arg0.method320((byte) -87);
        this.field1836 = arg0.method320((byte) -87);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
    private class116() {
    }
}
