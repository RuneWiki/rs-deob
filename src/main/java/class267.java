import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class267 {

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "Lhm;")
    private class19 field4632 = null;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "Z")
    private boolean field4597;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "Lqb;")
    private class95 field4598;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "Z")
    private boolean field4624;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field4596 = new int[25];

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lwa;")
    public static class75 field4606 = class66.method560("weiss:", false);

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "Lwa;")
    public static class75 field4619 = class66.method560("Bitte warten Sie)3)3)3", false);

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!cb", name = "k", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!cb", name = "m", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public static int field4614;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!cb", name = "M", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "[Ljava/lang/Object;")
    private Object[] field4627;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[[B")
    public static byte[][] field4595;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "[[Lcg;")
    public static class38[][] field4612;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4617;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z", line = 6)
    private final boolean method1893(int arg0, int arg1, int arg2) {
        int var4 = -5 / ((44 - arg1) / 50);
        field4593++;
        if (!this.method1910((byte) -4)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && this.field4632.field251.length > arg0 && arg2 < this.field4632.field251[arg0]) {
            return true;
        } else if (class153.field2632) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLwa;)V", line = 33)
    public final void method1894(byte arg0, class75 arg1) {
        field4599++;
        if (arg0 != -111) {
            this.method1913(false);
        }
        if (this.method1910((byte) -4)) {
            class75 var3 = arg1.method622(0);
            int var4 = this.field4632.field260.method884((byte) 111, var3.method619(-62));
            this.method1923(var4, -118);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V", line = 54)
    public final void method1895(int arg0, byte arg1) {
        if (arg1 != -44) {
            this.method1909((class75) null, -33);
        }
        field4621++;
        if (this.method1918(arg0, -1) && this.field4617 != null) {
            this.field4617[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwa;I)Z", line = 88)
    public final boolean method1896(class75 arg0, int arg1) {
        field4636++;
        if (!this.method1910((byte) -4)) {
            return false;
        }
        class75 var3 = arg0.method622(0);
        int var4 = this.field4632.field260.method884((byte) 112, var3.method619(-112));
        if (arg1 != -4570) {
            field4606 = (class75) null;
        }
        return this.method1905((byte) -116, var4);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)[B", line = 108)
    public final byte[] method1897(byte arg0, int arg1, int arg2) {
        field4633++;
        if (!this.method1893(arg2, -114, arg1)) {
            return null;
        }
        if (this.field4617[arg2] == null || this.field4617[arg2][arg1] == null) {
            boolean var4 = this.method1899((int[]) null, 0, arg2);
            if (!var4) {
                this.method1917(arg2, (byte) 111);
                boolean var5 = this.method1899((int[]) null, 0, arg2);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = -61 / ((-arg0 - 11) / 41);
        return class164.method1228(this.field4617[arg2][arg1], false, (byte) -114);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 140)
    public static void method1898(int arg0) {
        field4606 = null;
        field4619 = null;
        field4596 = null;
        if (arg0 != -1) {
            method1898(39);
        }
        field4612 = (class38[][]) null;
        field4595 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([III)Z", line = 160)
    private final boolean method1899(int[] arg0, int arg1, int arg2) {
        field4625++;
        if (!this.method1918(arg2, ~arg1)) {
            return false;
        } else if (this.field4627[arg2] == null) {
            return false;
        } else {
            int[] var4 = this.field4632.field261[arg2];
            int var5 = this.field4632.field258[arg2];
            boolean var6 = true;
            if (this.field4617[arg2] == null) {
                this.field4617[arg2] = new Object[this.field4632.field251[arg2]];
            }
            Object[] var7 = this.field4617[arg2];
            for (int var8 = arg1; var8 < var5; var8++) {
                int var9;
                if (var4 == null) {
                    var9 = var8;
                } else {
                    var9 = var4[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class164.method1228(this.field4627[arg2], false, (byte) -114);
            } else {
                var10 = class164.method1228(this.field4627[arg2], true, (byte) -114);
                class60 var11 = new class60(var10);
                var11.method498(var11.field997.length, arg0, (byte) 127, 5);
            }
            byte[] var12;
            try {
                var12 = class87.method699(var10, arg1 ^ 0xFFFFFF90);
            } catch (RuntimeException var31) {
                throw class28.method191(var31, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class6.method35(-13828, var10.length, var10) + "," + class6.method35(-13828, var10.length - 2, var10) + "," + this.field4632.field267[arg2] + "," + this.field4603);
            }
            if (this.field4597) {
                this.field4627[arg2] = null;
            }
            if (var5 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var5 * var15 * 4;
                class60 var17 = new class60(var12);
                var17.field1012 = var16;
                int[] var18 = new int[var5];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var5; var21++) {
                        var20 += var17.method505(arg1 ^ 0xFF);
                        var18[var21] += var20;
                        if (var4 != null) {
                        }
                    }
                }
                byte[][] var22 = new byte[var5][];
                for (int var23 = 0; var23 < var5; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field1012 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var5; var27++) {
                        var26 += var17.method505(255);
                        class231.method1687(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var5; var28++) {
                    int var29;
                    if (var4 == null) {
                        var29 = var28;
                    } else {
                        var29 = var4[var28];
                    }
                    if (this.field4624) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class285.method2007(false, var22[var28], false);
                    }
                }
            } else {
                int var30;
                if (var4 == null) {
                    var30 = 0;
                } else {
                    var30 = var4[0];
                }
                if (this.field4624) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class285.method2007(false, var12, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BII)Z", line = 354)
    public final boolean method1900(byte arg0, int arg1, int arg2) {
        if (arg0 <= 102) {
            field4595 = (byte[][]) ((byte[][]) null);
        }
        field4622++;
        if (!this.method1893(arg1, 105, arg2)) {
            return false;
        } else if (this.field4617[arg1] != null && this.field4617[arg1][arg2] != null) {
            return true;
        } else if (this.field4627[arg1] == null) {
            this.method1917(arg1, (byte) 115);
            return this.field4627[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(IB)I", line = 380)
    private final int method1901(int arg0, byte arg1) {
        field4615++;
        if (!this.method1918(arg0, -1)) {
            return 0;
        } else if (this.field4627[arg0] == null) {
            return arg1 > -82 ? 93 : this.field4598.method734((byte) 35, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZI)V", line = 398)
    public final void method1902(boolean arg0, boolean arg1, int arg2) {
        field4594++;
        if (!this.method1910((byte) -4)) {
            return;
        }
        if (arg1) {
            this.field4632.field246 = (int[][]) null;
            this.field4632.field266 = null;
        }
        if (arg2 != 0) {
            field4619 = (class75) null;
        }
        if (arg0) {
            this.field4632.field255 = null;
            this.field4632.field260 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I", line = 423)
    public final int[] method1903(int arg0, int arg1) {
        field4607++;
        if (!this.method1918(arg1, -1)) {
            return null;
        }
        if (arg0 != 100) {
            this.method1900((byte) 24, 127, 85);
        }
        int[] var3 = this.field4632.field261[arg1];
        if (var3 == null) {
            var3 = new int[this.field4632.field258[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Lwa;I)I", line = 452)
    public final int method1904(class75 arg0, int arg1) {
        field4630++;
        if (!this.method1910((byte) -4)) {
            return 0;
        }
        class75 var3 = arg0.method622(0);
        int var4 = this.field4632.field260.method884((byte) 125, var3.method619(-73));
        if (arg1 != 4979) {
            this.method1901(51, (byte) -111);
        }
        return this.method1901(var4, (byte) -85);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z", line = 472)
    public final boolean method1905(byte arg0, int arg1) {
        field4610++;
        if (!this.method1918(arg1, -1)) {
            return false;
        }
        int var3 = -41 % ((arg0 + 59) / 47);
        if (this.field4627[arg1] == null) {
            this.method1917(arg1, (byte) 66);
            return this.field4627[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILwa;Lwa;)[B", line = 497)
    public final byte[] method1906(int arg0, class75 arg1, class75 arg2) {
        field4608++;
        if (!this.method1910((byte) -4)) {
            return null;
        }
        class75 var4 = arg1.method622(0);
        class75 var5 = arg2.method622(arg0 + 1);
        int var6 = this.field4632.field260.method884((byte) 122, var4.method619(-75));
        if (this.method1918(var6, arg0)) {
            int var7 = this.field4632.field266[var6].method884((byte) 119, var5.method619(-61));
            return this.method1911(var6, var7, -57);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIIB)[B", line = 518)
    public final byte[] method1907(int[] arg0, int arg1, int arg2, byte arg3) {
        field4611++;
        if (!this.method1893(arg1, arg3 ^ 0x2F, arg2)) {
            return null;
        }
        if (this.field4617[arg1] == null || this.field4617[arg1][arg2] == null) {
            boolean var5 = this.method1899(arg0, 0, arg1);
            if (!var5) {
                this.method1917(arg1, (byte) 68);
                boolean var6 = this.method1899(arg0, 0, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg3 != 72) {
            return (byte[]) null;
        }
        byte[] var7 = class164.method1228(this.field4617[arg1][arg2], false, (byte) -114);
        if (this.field4624) {
            this.field4617[arg1][arg2] = null;
            if (this.field4632.field251[arg1] == 1) {
                this.field4617[arg1] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(IB)Z", line = 564)
    public final boolean method1908(int arg0, byte arg1) {
        if (arg1 != -18) {
            this.method1918(96, -26);
        }
        field4614++;
        if (!this.method1910((byte) -4)) {
            return false;
        } else if (this.field4632.field251.length == 1) {
            return this.method1900((byte) 117, 0, arg0);
        } else if (!this.method1918(arg0, -1)) {
            return false;
        } else if (this.field4632.field251[arg0] == 1) {
            return this.method1900((byte) 111, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(Lwa;I)Z", line = 593)
    public final boolean method1909(class75 arg0, int arg1) {
        field4629++;
        if (this.method1910((byte) -4)) {
            class75 var3 = arg0.method622(0);
            int var4 = this.field4632.field260.method884((byte) 111, var3.method619(-128));
            return arg1 <= var4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)Z", line = 616)
    private final boolean method1910(byte arg0) {
        field4616++;
        if (arg0 != -4) {
            this.field4624 = false;
        }
        if (this.field4632 == null) {
            this.field4632 = this.field4598.method735((byte) -106);
            if (this.field4632 == null) {
                return false;
            }
            this.field4627 = new Object[this.field4632.field248];
            this.field4617 = new Object[this.field4632.field248][];
        }
        return true;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)[B", line = 640)
    public final byte[] method1911(int arg0, int arg1, int arg2) {
        if (arg2 >= -38) {
            this.method1901(0, (byte) -104);
        }
        field4609++;
        return this.method1907((int[]) null, arg0, arg1, (byte) 72);
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)I", line = 653)
    public final int method1912(byte arg0) {
        if (arg0 != 87) {
            this.method1897((byte) 87, 83, -9);
        }
        field4601++;
        return this.method1910((byte) -4) ? this.field4632.field251.length : -1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z", line = 672)
    public final boolean method1913(boolean arg0) {
        if (arg0) {
            this.method1899((int[]) null, 123, 84);
        }
        field4631++;
        if (!this.method1910((byte) -4)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4632.field245.length; var3++) {
            int var4 = this.field4632.field245[var3];
            if (this.field4627[var4] == null) {
                this.method1917(var4, (byte) 99);
                if (this.field4627[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)I", line = 708)
    public final int method1914(int arg0, int arg1) {
        int var3 = -42 % ((21 - arg0) / 54);
        field4620++;
        return this.method1918(arg1, -1) ? this.field4632.field251[arg1] : 0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILwa;)I", line = 722)
    public final int method1915(int arg0, class75 arg1) {
        if (arg0 != -15621) {
            field4634 = 92;
        }
        field4604++;
        if (this.method1910((byte) -4)) {
            class75 var3 = arg1.method622(0);
            int var4 = this.field4632.field260.method884((byte) 124, var3.method619(arg0 + 15570));
            return this.method1918(var4, -1) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lwa;Lwa;B)Z", line = 747)
    public final boolean method1916(class75 arg0, class75 arg1, byte arg2) {
        if (arg2 != 119) {
            field4602 = 8;
        }
        field4605++;
        if (!this.method1910((byte) -4)) {
            return false;
        }
        class75 var4 = arg1.method622(0);
        class75 var5 = arg0.method622(0);
        int var6 = this.field4632.field260.method884((byte) 121, var4.method619(arg2 ^ 0xFFFFFFEF));
        if (this.method1918(var6, -1)) {
            int var7 = this.field4632.field266[var6].method884((byte) 123, var5.method619(-44));
            return this.method1900((byte) 126, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(IB)V", line = 773)
    private final void method1917(int arg0, byte arg1) {
        if (arg1 <= 63) {
            field4634 = -126;
        }
        if (this.field4597) {
            this.field4627[arg0] = this.field4598.method736(arg0, (byte) -35);
        } else {
            this.field4627[arg0] = class285.method2007(false, this.field4598.method736(arg0, (byte) -35), false);
        }
        field4626++;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)Z", line = 788)
    private final boolean method1918(int arg0, int arg1) {
        field4618++;
        if (!this.method1910((byte) -4)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field4632.field251.length && this.field4632.field251[arg0] != 0) {
            return arg1 == -1;
        } else if (class153.field2632) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)[B", line = 814)
    public final byte[] method1919(int arg0, int arg1) {
        field4628++;
        if (!this.method1910((byte) -4)) {
            return null;
        } else if (this.field4632.field251.length == arg0) {
            return this.method1911(0, arg1, -72);
        } else if (!this.method1918(arg1, -1)) {
            return null;
        } else if (this.field4632.field251[arg1] == 1) {
            return this.method1911(arg1, 0, -42);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V", line = 841)
    public final void method1920(byte arg0) {
        if (this.field4617 != null) {
            for (int var2 = 0; var2 < this.field4617.length; var2++) {
                this.field4617[var2] = null;
            }
        }
        field4637++;
        if (arg0 != -59) {
            this.field4597 = true;
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I", line = 866)
    public final int method1921(int arg0) {
        field4613++;
        if (!this.method1910((byte) -4)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = -70 / ((arg0 - 7) / 45);
        for (int var5 = 0; var5 < this.field4627.length; var5++) {
            if (this.field4632.field258[var5] > 0) {
                var2 += 100;
                var3 += this.method1901(var5, (byte) -117);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lqb;ZZ)V", line = 945)
    public class267(class95 arg0, boolean arg1, boolean arg2) {
        this.field4597 = arg1;
        this.field4598 = arg0;
        this.field4624 = arg2;
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)I", line = 910)
    public static final int method1922(int arg0, int arg1) {
        field4623++;
        if (~arg1 > arg0) {
            return 0;
        }
        class118 var2 = (class118) class310.field5269.method1007((long) arg1, -17004);
        if (var2 == null) {
            return class143.method1106(arg0 ^ 0x27, arg1).field158;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field1999.length; var4++) {
            if (var2.field1999[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class143.method1106(arg0 ^ 0xFFFFFFF7, arg1).field158 - var2.field1999.length);
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(II)V", line = 957)
    private final void method1923(int arg0, int arg1) {
        int var3 = -97 % ((arg1 + 30) / 60);
        field4635++;
        this.field4598.method732(98, arg0);
    }
}
