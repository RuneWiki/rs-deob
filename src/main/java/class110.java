import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class110 {

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    private int field1788 = -1;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "Z")
    public boolean field1785 = true;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lpia;")
    private class94 field1782;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Loea;")
    private class594 field1789;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "Lme;")
    private class192 field1793;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "Lff;")
    private class9 field1794;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "Lon;")
    private class335 field1791;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "D")
    public static double field1787 = -1.0D;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    private final void method932(int arg0) {
        field1796++;
        if (!this.field1785) {
            return;
        }
        this.field1785 = false;
        byte[] var2 = this.field1782.field1643;
        byte[] var3 = this.field1789.field8693;
        int var4 = 0;
        int var5 = this.field1782.field1634;
        int var6 = this.field1786 + (this.field1782.field1634 * this.field1790);
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var13 = -128; var13 < 0; var13++) {
                if (var2[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field1793 != null && this.field1788 == var4) {
            this.field1785 = false;
            return;
        }
        this.field1788 = var4;
        int var8 = this.field1786 + (this.field1790 * var5);
        int var9 = 0;
        int var10 = -128;
        if (arg0 > -67) {
            return;
        }
        while (var10 < 0) {
            for (int var11 = -128; var11 < 0; var11++) {
                if (var2[var8] == 0) {
                    int var12 = 0;
                    if (var2[var8 - 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var12++;
                    }
                    if (var2[var8 - var5] != 0) {
                        var12++;
                    }
                    if (var2[var5 + var8] != 0) {
                        var12++;
                    }
                    var3[var9++] = (byte) (var12 * 17);
                } else {
                    var3[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field1782.field1634 - 128;
            var10++;
        }
        if (this.field1793 == null) {
            this.field1793 = new class192(this.field1789, 3553, 6406, 128, 128, false, this.field1789.field8693, 6406, false);
            this.field1793.method1346((byte) -128, false, false);
            this.field1793.method818(true, (byte) 11);
        } else {
            this.field1793.method1345(0, 0, 0, false, 128, 0, 6406, 0, this.field1789.field8693, 128);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I[BZI)V")
    public final void method933(int arg0, byte[] arg1, boolean arg2, int arg3) {
        this.field1791.method53(this.field1789.method3422(arg3, -129) * arg0, -6562, arg3, arg1);
        field1795++;
        if (!arg2) {
            this.field1791 = null;
        }
        this.method934(arg0, (byte) -85, this.field1791);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBLff;)V")
    private final void method934(int arg0, byte arg1, class9 arg2) {
        field1798++;
        if (arg0 != 0) {
            this.method932(-102);
            int var4 = -10 % ((-arg1 - 8) / 62);
            this.field1789.method3425(this.field1793, 116);
            this.field1789.method3420((byte) -95, arg0, arg2, 0, 4);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBC)C")
    public static final char method935(int arg0, byte arg1, char arg2) {
        field1783++;
        if (arg2 >= 'À' && arg2 <= 'ÿ') {
            if (arg2 >= 'À' && arg2 <= 'Æ') {
                return 'A';
            }
            if (arg2 == 'Ç') {
                return 'C';
            }
            if (arg2 >= 'È' && arg2 <= 'Ë') {
                return 'E';
            }
            if (arg2 >= 'Ì' && arg2 <= 'Ï') {
                return 'I';
            }
            if (arg2 >= 'Ò' && arg2 <= 'Ö') {
                return 'O';
            }
            if (arg2 >= 'Ù' && arg2 <= 'Ü') {
                return 'U';
            }
            if (arg2 == 'Ý') {
                return 'Y';
            }
            if (arg2 == 'ß') {
                return 's';
            }
            if (arg2 >= 'à' && arg2 <= 'æ') {
                return 'a';
            }
            if (arg2 == 'ç') {
                return 'c';
            }
            if (arg2 >= 'è' && arg2 <= 'ë') {
                return 'e';
            }
            if (arg2 >= 'ì' && arg2 <= 'ï') {
                return 'i';
            }
            if (arg2 >= 'ò' && arg2 <= 'ö') {
                return 'o';
            }
            if (arg2 >= 'ù' && arg2 <= 'ü') {
                return 'u';
            }
            if (arg2 == 'ý' || arg2 == 'ÿ') {
                return 'y';
            }
        }
        if (arg2 == 'Œ') {
            return 'O';
        } else if (arg2 == 'œ') {
            return 'o';
        } else {
            if (arg1 != -73) {
                method935(-99, (byte) -110, 'c');
            }
            if (arg2 == 'Ÿ') {
                return 'Y';
            } else {
                return arg2;
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public final void method936(int arg0) {
        if (arg0 != -11053) {
            this.field1786 = -50;
        }
        this.method934(this.field1797, (byte) 69, this.field1794);
        field1792++;
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Loea;Lpia;Luea;IIIII)V")
    public class110(class594 arg0, class94 arg1, class315 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field1782 = arg1;
        this.field1790 = arg7;
        this.field1786 = arg6;
        this.field1789 = arg0;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var25 = (var12 + var13) * arg2.field3924 + var11;
            for (int var26 = 0; var26 < var9; var26++) {
                short[] var27 = arg2.field4439[var25++];
                if (var27 != null) {
                    var10 += var27.length;
                }
            }
        }
        this.field1797 = var10;
        if (var10 <= 0) {
            this.field1793 = null;
        } else {
            class35 var14 = new class35(var10 * 2);
            if (this.field1789.field8682) {
                for (int var15 = 0; var15 < var9; var15++) {
                    int var16 = (var12 + var15) * arg2.field3924 + var11;
                    for (int var17 = 0; var17 < var9; var17++) {
                        short[] var18 = arg2.field4439[var16++];
                        if (var18 != null) {
                            for (int var19 = 0; var19 < var18.length; var19++) {
                                var14.method223(1493807496, var18[var19] & 0xFFFF);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = 0; var20 < var9; var20++) {
                    int var21 = (var12 + var20) * arg2.field3924 + var11;
                    for (int var22 = 0; var22 < var9; var22++) {
                        short[] var23 = arg2.field4439[var21++];
                        if (var23 != null) {
                            for (int var24 = 0; var24 < var23.length; var24++) {
                                var14.method237(false, var23[var24] & 0xFFFF);
                            }
                        }
                    }
                }
            }
            this.field1794 = this.field1789.method3415(var14.field469, 4, 5123, false, var14.field483);
            this.field1791 = new class335(this.field1789, 5123, null, 1);
        }
    }
}
