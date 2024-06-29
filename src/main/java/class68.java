import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class68 extends class136 {

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    private int field881 = -1;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "Ljk;")
    public static class446 field872 = new class446("runescape", 0);

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    private int field877;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "Lfs;")
    public static class387 field879;

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "[I")
    private int[] field882;

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 3)
    public class68() {
        super(0, false);
    }

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V", line = 6)
    public static void method658(int arg0) {
        field872 = null;
        int var1 = -119 % ((arg0 - -66) / 38);
        field879 = null;
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V", line = 20)
    public final void method659(int arg0) {
        super.method659(127);
        if (arg0 <= 120) {
            this.field877 = -42;
        }
        ++field873;
        this.field882 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILiv;)V", line = 34)
    public final void method268(int arg0, int arg1, class65 arg2) {
        if (arg0 == 4) {
            if (~arg1 == -1) {
                this.field881 = arg2.method623((byte) -122);
            }
            ++field874;
        }
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)I", line = 49)
    public final int method660(int arg0) {
        if (arg0 != 3) {
            this.method659(89);
        }
        ++field876;
        return this.field881;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBI)V", line = 61)
    public final void method661(int arg0, byte arg1, int arg2) {
        super.method661(arg0, arg1, arg2);
        ++field880;
        if (~this.field881 <= -1 && class466.field6841 != null) {
            int var4 = class466.field6841.method1780(-31305, this.field881).field1435 ? 64 : 128;
            this.field882 = class466.field6841.method1777(false, 5754, this.field881, 1.0F, var4, var4);
            this.field878 = var4;
            this.field877 = var4;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)[[I", line = 79)
    public final int[][] method272(byte arg0, int arg1) {
        ++field875;
        int[][] var3 = super.field1952.method3127((byte) 117, arg1);
        if (arg0 <= 33) {
            this.field878 = -43;
        }
        if (super.field1952.field7770) {
            int var4 = (~class227.field3310 == ~this.field878 ? arg1 : this.field878 * arg1 / class227.field3310) * this.field877;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class467.field6889 == ~this.field877) {
                for (int var8 = 0; class467.field6889 > var8; ++var8) {
                    int var9 = this.field882[var4++];
                    var7[var8] = class345.method2089(var9 << 4, 4080);
                    var6[var8] = class345.method2089(65280, var9) >> 4;
                    var5[var8] = class345.method2089(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; ~class467.field6889 < ~var10; ++var10) {
                    int var11 = this.field877 * var10 / class467.field6889;
                    int var12 = this.field882[var4 + var11];
                    var7[var10] = class345.method2089(var12 << 4, 4080);
                    var6[var10] = class345.method2089(var12 >> 4, 4080);
                    var5[var10] = class345.method2089(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }
}
