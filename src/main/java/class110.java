import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class110 extends class59 {

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
    private int field2127 = 3072;

    @OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
    private int field2134 = 2048;

    @OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
    private int field2133 = 1024;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "Lsd;")
    public static class166 field2126 = class135.method935("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!mb", name = "bb", descriptor = "J")
    public static volatile long field2130 = 0L;

    @OriginalMember(owner = "client!mb", name = "ab", descriptor = "Lsd;")
    public static class166 field2129 = class135.method935("Wordpack geladen)3", 0);

    @OriginalMember(owner = "client!mb", name = "gb", descriptor = "Lb;")
    public static class11 field2135 = new class11(64);

    @OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!mb", name = "S", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!mb", name = "cb", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!mb", name = "db", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!mb", name = "ib", descriptor = "Lv;")
    public static class189 field2137;

    @OriginalMember(owner = "client!mb", name = "U", descriptor = "[I")
    public static int[] field2123;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
    public static void method797(int arg0) {
        field2123 = null;
        field2129 = null;
        field2126 = null;
        if (arg0 != 12) {
            method798(-26, 103);
        }
        field2135 = null;
        field2137 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method37(boolean arg0, int arg1) {
        ++field2125;
        int[][] var3 = super.field1207.method528(81, arg1);
        if (super.field1207.field1320) {
            int[][] var4 = this.method498(arg1, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class98.field1879; ++var11) {
                var7[var11] = (var5[var11] * this.field2134 >> 12) + this.field2133;
                var9[var11] = this.field2133 - -(var6[var11] * this.field2134 >> 12);
                var10[var11] = (var8[var11] * this.field2134 >> 12) + this.field2133;
            }
        }
        if (!arg0) {
            field2130 = -119L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lgg;")
    public static final class62 method798(int arg0, int arg1) {
        class62 var2 = (class62) class116.field2247.method64((byte) 28, (long) arg0);
        ++field2131;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class178.field3375.method353(arg1, arg0, -90);
            class62 var4 = new class62();
            if (var3 != null) {
                var4.method521(new class53(var3), 16298);
            }
            var4.method522((byte) -118);
            class116.field2247.method67(var4, 15266, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lff;BI)V")
    public final void method41(class53 arg0, byte arg1, int arg2) {
        ++field2122;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1216 = arg0.method400(255) == 1;
                }
            } else {
                this.field2127 = arg0.method405(2);
            }
        } else {
            this.field2133 = arg0.method405(2);
        }
        if (arg1 < 18) {
            field2130 = 113L;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)[I")
    public final int[] method36(int arg0, byte arg1) {
        int[] var3 = super.field1219.method721(arg0, -125);
        if (super.field1219.field1816) {
            int[] var4 = this.method499(0, arg0, 0);
            for (int var5 = 0; class98.field1879 > var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2134 >> 12) + this.field2133;
            }
        }
        if (arg1 >= -124) {
            this.method36(-109, (byte) -112);
        }
        ++field2124;
        return var3;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        ++field2121;
        this.field2134 = -this.field2133 + this.field2127;
        if (arg0 != 23459) {
            field2123 = null;
        }
    }
}
