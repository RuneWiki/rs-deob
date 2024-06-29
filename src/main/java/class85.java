import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class85 extends class424 {

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    private int field1185 = 2048;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    private int field1191 = 8192;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "I")
    private int field1190 = 0;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    private int field1188 = 2048;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field1194 = 4096;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    private int field1196 = 12288;

    @OriginalMember(owner = "client!pd", name = "ab", descriptor = "I")
    private int field1199 = 0;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "[Lae;")
    public static class277[] field1193 = new class277[0];

    @OriginalMember(owner = "client!pd", name = "cb", descriptor = "Lir;")
    public static class218 field1201 = new class218(8);

    @OriginalMember(owner = "client!pd", name = "db", descriptor = "Lhc;")
    public static class368 field1202 = new class368("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!pd", name = "Z", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!pd", name = "eb", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field1197;
        int[] var3 = super.field5892.method783(arg0, (byte) 75);
        if (arg1 != -10) {
            field1203 = -68;
        }
        if (super.field5892.field1427) {
            int var4 = class409.field5711[arg0] - 2048;
            for (int var5 = 0; var5 < class303.field4135; ++var5) {
                int var6 = class332.field4478[var5] - 2048;
                int var7 = this.field1188 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field1199 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 >= -2049 ? var11 : var11 + -4096;
                int var13 = this.field1190 + var6;
                int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = var4 - -this.field1185;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                var3[var5] = !this.method681((byte) 38, var9, var12) && !this.method685(var18, var15, false) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        class361.method2227(4096);
        ++field1192;
        if (arg0 != 3) {
            this.method681((byte) 88, 13, 50);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BI)I")
    public static final int method679(byte arg0, int arg1) {
        ++field1200;
        if (arg0 >= -25) {
            method680(112, 102, -19);
        }
        int var2 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (arg1 >= 256) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (~arg1 <= -17) {
            arg1 >>>= 4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)Lal;")
    public static final class371 method680(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        return var3 == null ? null : var3.field861;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BII)Z")
    private final boolean method681(byte arg0, int arg1, int arg2) {
        ++field1195;
        if (arg0 <= 37) {
            field1193 = null;
        }
        int var4 = (-arg1 + arg2) * this.field1196 >> 12;
        int var5 = class62.field843[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1196;
        int var7 = (var6 << 12) / this.field1191;
        int var8 = this.field1194 * var7 >> 12;
        return ~var8 < ~(arg1 + arg2) && -var8 < arg1 - -arg2;
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V")
    public static void method682(int arg0) {
        int var1 = 72 % ((-64 - arg0) / 43);
        field1202 = null;
        field1193 = null;
        field1201 = null;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(III)V")
    public static final void method683(int arg0, int arg1, int arg2) {
        class63 var3 = class341.field4617[arg0][arg1][arg2];
        if (var3 != null) {
            if (var3.field867 != null) {
                var3.field867 = null;
            }
            if (var3.field863 != null) {
                var3.field863 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method684(byte arg0, String arg1) {
        ++field1198;
        if (arg1 == null) {
            return false;
        } else {
            if (arg0 != 92) {
                method684((byte) 29, (String) null);
            }
            for (int var2 = 0; ~class42.field541 < ~var2; ++var2) {
                if (arg1.equalsIgnoreCase(class263.field3612[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class341.field4605[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 != -48) {
            field1203 = 31;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1191 = arg0.method2297(13352);
                                }
                            } else {
                                this.field1194 = arg0.method2297(13352);
                            }
                        } else {
                            this.field1196 = arg0.method2297(13352);
                        }
                    } else {
                        this.field1185 = arg0.method2297(arg1 ^ -13320);
                    }
                } else {
                    this.field1190 = arg0.method2297(13352);
                }
            } else {
                this.field1199 = arg0.method2297(13352);
            }
        } else {
            this.field1188 = arg0.method2297(13352);
        }
        ++field1187;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZ)Z")
    private final boolean method685(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method19((class366) null, (byte) 37, -34);
        }
        ++field1184;
        int var4 = (arg0 - -arg1) * this.field1196 >> 12;
        int var5 = class62.field843[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field1196;
        int var7 = (var6 << 12) / this.field1191;
        int var8 = this.field1194 * var7 >> 12;
        return arg0 - arg1 < var8 && ~(-arg1 + arg0) < ~(-var8);
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
    public class85() {
        super(0, true);
    }
}
