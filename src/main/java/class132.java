import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class132 extends class146 {

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public int field2202 = 0;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public static volatile int field2190 = 0;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "Z")
    public static boolean field2209 = true;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "I")
    public int field2198;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Lti;")
    public class139 field2208;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lmk;")
    public class213 field2194;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "Lff;")
    public class221 field2199;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "Lff;")
    public class221 field2205;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Loh;")
    public class248 field2193;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Z")
    public boolean field2192;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "[I")
    public int[] field2206;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)V")
    public final void method950(boolean arg0) {
        field2200++;
        if (!arg0) {
            method951((class124) null, -63, -85);
        }
        int var2 = this.field2210;
        if (this.field2193 != null) {
            class248 var5 = this.field2193.method1656(0);
            if (var5 == null) {
                this.field2201 = 0;
                this.field2203 = 0;
                this.field2206 = null;
                this.field2198 = 0;
                this.field2210 = -1;
                this.field2196 = 0;
            } else {
                this.field2198 = var5.field3941;
                this.field2203 = var5.field3917 * 128;
                this.field2210 = var5.field3913;
                this.field2206 = var5.field3928;
                this.field2196 = var5.field3900;
                this.field2201 = var5.field3952;
            }
        } else if (this.field2208 != null) {
            int var3 = class71.method551(this.field2208, (byte) -98);
            if (var2 != var3) {
                this.field2210 = var3;
                class165 var4 = this.field2208.field2321;
                if (var4.field2741 != null) {
                    var4 = var4.method1188((byte) -83);
                }
                if (var4 == null) {
                    this.field2196 = this.field2203 = 0;
                } else {
                    this.field2196 = var4.field2680;
                    this.field2203 = var4.field2679 * 128;
                }
            }
        } else if (this.field2194 != null) {
            this.field2210 = class254.method1702(7, this.field2194);
            this.field2203 = this.field2194.field3431 * 128;
            this.field2196 = this.field2194.field3407;
        }
        if (this.field2210 != var2 && this.field2205 != null) {
            class145.field2394.method1242(this.field2205);
            this.field2205 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lsb;II)[Lcj;")
    public static final class74[] method951(class124 arg0, int arg1, int arg2) {
        if (arg1 < 121) {
            field2190 = 20;
        }
        field2191++;
        return class146.method1077(true, arg2, arg0) ? class296.method1984((byte) 5) : null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Z")
    public static final boolean method952(int arg0, int arg1, int arg2) {
        field2207++;
        if (!class198.field3226) {
            return false;
        }
        int var3 = arg0 & 0xFFFF;
        int var4 = arg0 >> 16;
        if (class128.field2119[var4] == null || class128.field2119[var4][var3] == null) {
            return false;
        } else if (arg1 == 42) {
            class114 var5 = class128.field2119[var4][var3];
            if (arg2 == -1 && var5.field1898 == 0) {
                for (int var6 = 0; var6 < class42.field776; var6++) {
                    if (class94.field1468[var6] == 12 || class94.field1468[var6] == 1004 || class94.field1468[var6] == 39 || class94.field1468[var6] == 6 || class94.field1468[var6] == 42) {
                        for (class114 var7 = class8.method43(class15.field231[var6], (byte) 33); var7 != null; var7 = class28.method244(var7, (byte) -120)) {
                            if (var5.field1789 == var7.field1789) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (int var8 = 0; var8 < class42.field776; var8++) {
                    if (class223.field3559[var8] == arg2 && class15.field231[var8] == var5.field1789 && (class94.field1468[var8] == 12 || class94.field1468[var8] == 1004 || class94.field1468[var8] == 39 || class94.field1468[var8] == 6 || class94.field1468[var8] == 42)) {
                        return true;
                    }
                }
            }
            return false;
        } else {
            return false;
        }
    }
}
