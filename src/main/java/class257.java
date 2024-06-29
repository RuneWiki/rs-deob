import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class257 extends class114 {

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    private int field4149 = -1;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lvc;")
    public static class179 field4154 = new class179();

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "[I")
    public static int[] field4162 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "I")
    private int field4160;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "[I")
    private int[] field4151;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "[[[I")
    public static int[][][] field4159;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "[[[I")
    public static int[][][] field4161;

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class257() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
    public final int method723(int arg0) {
        if (arg0 != -1) {
            method1688(121);
        }
        ++field4148;
        return this.field4149;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        int[][] var3 = super.field1627.method104(arg1, (byte) 122);
        if (super.field1627.field280 && this.method1689(16711680)) {
            int var4 = (class263.field4216 == this.field4160 ? arg1 : this.field4160 * arg1 / class263.field4216) * this.field4155;
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (~class145.field2009 == ~this.field4155) {
                for (int var8 = 0; ~class145.field2009 < ~var8; ++var8) {
                    int var9 = this.field4151[var4++];
                    var6[var8] = class32.method199(4080, var9 << 4);
                    var5[var8] = class32.method199(4080, var9 >> 4);
                    var7[var8] = class32.method199(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class145.field2009; ++var10) {
                    int var11 = this.field4155 * var10 / class145.field2009;
                    int var12 = this.field4151[var4 + var11];
                    var6[var10] = class32.method199(var12, 255) << 4;
                    var5[var10] = class32.method199(var12, 65280) >> 4;
                    var7[var10] = class32.method199(4080, var12 >> 12);
                }
            }
        }
        ++field4156;
        if (arg0 != -112) {
            this.method13((class215) null, -91, -88);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)I")
    public static final int method1686(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 3;
        if (arg0 != -24220) {
            method1686(110, 54, -119, -64);
        }
        ++field4152;
        if (~var4 == -1) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else {
            return var4 == 2 ? 7 - arg3 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)I")
    public static final int method1687(int arg0, int arg1) {
        ++field4147;
        return arg0 <= 122 ? 4 : 127 & arg1 >> 11;
    }

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "(I)V")
    public static void method1688(int arg0) {
        field4161 = null;
        field4154 = null;
        if (arg0 == 255) {
            field4162 = null;
            field4159 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)Z")
    private final boolean method1689(int arg0) {
        ++field4158;
        if (this.field4151 != null) {
            return true;
        } else if (~this.field4149 <= -1) {
            int var2 = class263.field4216;
            int var3 = class145.field2009;
            int var4 = class288.field4599.method395(this.field4149, -18098).field4695 ? 64 : 128;
            this.field4151 = class288.field4599.method397(this.field4149, 1.0F, (byte) -118, false, var4, var4);
            this.field4160 = var4;
            this.field4155 = var4;
            class80.method513(0, var3, var2);
            return this.field4151 != null;
        } else {
            if (arg0 != 16711680) {
                field4154 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public final void method732(boolean arg0) {
        ++field4157;
        super.method732(arg0);
        this.field4151 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            this.field4160 = 8;
        }
        ++field4153;
        if (~arg1 == -1) {
            this.field4149 = arg0.method1379(-123);
        }
    }
}
