import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class155 extends class145 {

    @OriginalMember(owner = "client!sq", name = "E", descriptor = "I")
    private int field1916 = 1365;

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "I")
    private int field1917 = 20;

    @OriginalMember(owner = "client!sq", name = "J", descriptor = "I")
    private int field1921 = 0;

    @OriginalMember(owner = "client!sq", name = "K", descriptor = "I")
    private int field1922 = 0;

    @OriginalMember(owner = "client!sq", name = "L", descriptor = "Leea;")
    public static class114 field1923 = new class114();

    @OriginalMember(owner = "client!sq", name = "M", descriptor = "Lig;")
    public static class206 field1924 = new class206(24, -1);

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "I")
    public static int field1925 = 0;

    @OriginalMember(owner = "client!sq", name = "G", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!sq", name = "H", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!sq", name = "I", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZI)[I", line = 3)
    public final int[] method27(boolean arg0, int arg1) {
        ++field1919;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            for (int var4 = 0; ~var4 > ~class647.field9368; ++var4) {
                int var5 = (class601.field8779[var4] << 12) / this.field1916 + this.field1922;
                int var6 = (class573.field8270[arg1] << 12) / this.field1916 + this.field1921;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (~(var11 - -var12) > -16385 && ~var13 > ~this.field1917) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field1917 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field1917;
            }
        }
        if (arg0) {
            this.field1917 = -50;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V", line = 93)
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)V", line = 77)
    public static void method901(int arg0) {
        if (arg0 != 20) {
            field1923 = null;
        }
        field1924 = null;
        field1923 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(III)Z", line = 97)
    public static final boolean method902(int arg0, int arg1, int arg2) {
        ++field1918;
        int var3 = 15 % ((-45 - arg0) / 42);
        return ~(33 & arg2) != -1;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IILrt;)V", line = 112)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 < -67) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 != -3) {
                        if (arg0 == 3) {
                            this.field1921 = arg2.method1220(125);
                        }
                    } else {
                        this.field1922 = arg2.method1220(124);
                    }
                } else {
                    this.field1917 = arg2.method1220(118);
                }
            } else {
                this.field1916 = arg2.method1220(117);
            }
            ++field1920;
        }
    }
}
