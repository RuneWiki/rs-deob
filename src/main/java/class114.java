import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class114 extends class314 {

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    private int field1791 = 0;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    private int field1785 = 4096;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "[J")
    public static long[] field1792 = new long[256];

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "[Lf;")
    public static class702[] field1790;

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            long var1 = (long) var0;
            for (int var3 = 0; ~var3 > -9; ++var3) {
                if (~(var1 & 1L) == -2L) {
                    var1 = -3932672073523589310L ^ var1 >>> 1;
                } else {
                    var1 >>>= 1;
                }
            }
            field1792[var0] = var1;
        }
        field1793 = -1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3)
    public static final void method1034(String arg0, int arg1) {
        class247.method1763("", "", arg0, false, 0, 0, "");
        ++field1789;
        if (arg1 != 256) {
            field1792 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLie;I)V", line = 15)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field1787;
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                this.field1785 = arg1.method67(12021);
            }
        } else {
            this.field1791 = arg1.method67(12021);
        }
        if (arg0 >= -1) {
            field1790 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I", line = 50)
    public final int[] method6(int arg0, int arg1) {
        ++field1788;
        int[] var3 = super.field4928.method534((byte) -75, arg0);
        if (super.field4928.field618) {
            int[] var4 = this.method2140(0, arg0, -123);
            for (int var5 = 0; var5 < class81.field1009; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1791 && ~this.field1785 <= ~var6 ? 4096 : 0;
            }
        }
        return arg1 <= 109 ? null : var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V", line = 87)
    public static void method1035(byte arg0) {
        field1792 = null;
        if (arg0 == -63) {
            field1790 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V", line = 99)
    public class114() {
        super(1, true);
    }
}
