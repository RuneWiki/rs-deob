import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class601 extends class478 {

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    private int field8058 = 0;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "Lhd;")
    private class694 field8060 = new class694(16);

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    private int field8074 = 0;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "Lws;")
    private class333 field8077 = new class333();

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "J")
    private long field8079 = 0L;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Lkf;")
    private class237 field8067;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    private int field8064;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Z")
    private boolean field8075;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "Lws;")
    private class333 field8076;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Z")
    private boolean field8078;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lcs;")
    private class318 field8063;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    private int field8061;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Ljt;")
    private class94 field8065;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "[B")
    private byte[] field8071;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lkf;")
    private class237 field8051;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    private int field8047;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lci;")
    private class418 field8052;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field8053;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
    public static int field8066;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "I")
    public static int field8068;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field8072;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "Laca;")
    private class682 field8054;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "Z")
    private boolean field8073;

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "[B")
    private byte[] field8070;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)I", line = 4)
    public final int method2610(int arg0, byte arg1) {
        field8068++;
        class418 var3 = (class418) this.field8060.method3828((long) arg0, (byte) -91);
        if (var3 == null) {
            if (arg1 <= 67) {
                this.field8052 = null;
            }
            return 0;
        } else {
            return var3.method1740((byte) 58);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)Laca;", line = 22)
    public final class682 method2612(int arg0) {
        field8062++;
        if (this.field8054 != null) {
            return this.field8054;
        }
        if (this.field8052 == null) {
            if (this.field8065.method694((byte) 3)) {
                return null;
            }
            this.field8052 = this.field8065.method693(91, (byte) 0, true, this.field8064, 255);
        }
        if (this.field8052.field5346) {
            return null;
        }
        int var2 = -49 / ((arg0 + 58) / 52);
        byte[] var3 = this.field8052.method1741(0);
        if (this.field8052 instanceof class290) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field8054 = new class682(var3, this.field8061, this.field8071);
                if (this.field8054.field9286 != this.field8047) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field8054 = null;
                if (this.field8065.method694((byte) 3)) {
                    this.field8052 = null;
                } else {
                    this.field8052 = this.field8065.method693(118, (byte) 0, true, this.field8064, 255);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field8054 = new class682(var3, this.field8061, this.field8071);
            } catch (RuntimeException var5) {
                this.field8065.method704(19922);
                this.field8054 = null;
                if (this.field8065.method694((byte) 3)) {
                    this.field8052 = null;
                } else {
                    this.field8052 = this.field8065.method693(125, (byte) 0, true, this.field8064, 255);
                }
                return null;
            }
            if (this.field8051 != null) {
                this.field8063.method1848(this.field8051, this.field8064, 255, var3);
            }
        }
        this.field8052 = null;
        if (this.field8067 != null) {
            this.field8070 = new byte[this.field8054.field9293];
            this.field8058 = 0;
        }
        return this.field8054;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)[B", line = 119)
    public final byte[] method2615(int arg0, int arg1) {
        field8050++;
        class418 var3 = this.method3302(arg1, arg0, (byte) 117);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1741(0);
            var3.method1566(arg1 - 68);
            return var4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lji;I)V", line = 138)
    public static final void method3300(class572 arg0, int arg1) {
        field8048++;
        if ((arg0.field7318.length - arg0.field7313) < 1) {
            return;
        }
        int var2 = arg0.method3097((byte) 12);
        if (var2 < 0 || var2 > 1 || (arg0.field7318.length - arg0.field7313) < 2) {
            return;
        }
        int var3 = arg0.method3031(-1);
        if ((arg0.field7318.length - arg0.field7313) < (var3 * 6)) {
            return;
        }
        for (int var4 = arg1; var4 < var3; var4++) {
            int var5 = arg0.method3031(-1);
            int var6 = arg0.method3064(-2031091464);
            if (class500.field6238.length > var5 && class656.field8925[var5] && (class46.field618.method716(arg1 ^ 0x13, var5).field6618 != '1' || var6 >= -1 && var6 <= 1)) {
                class500.field6238[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 183)
    public final void method3301(int arg0) {
        if (arg0 != -9069) {
            this.method3308((byte) 17);
        }
        field8057++;
        if (this.field8076 == null || this.method2612(-128) == null) {
            return;
        }
        for (class263 var2 = this.field8077.method1909(true); var2 != null; var2 = this.field8077.method1916((byte) 120)) {
            int var3 = (int) var2.field3321;
            if (var3 < 0 || this.field8054.field9293 <= var3 || this.field8054.field9291[var3] == 0) {
                var2.method1566(-51);
            } else {
                if (this.field8070[var3] == 0) {
                    this.method3302(1, var3, (byte) -91);
                }
                if (this.field8070[var3] == -1) {
                    this.method3302(2, var3, (byte) -30);
                }
                if (this.field8070[var3] == 1) {
                    var2.method1566(-113);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIB)Lci;", line = 230)
    private final class418 method3302(int arg0, int arg1, byte arg2) {
        field8049++;
        class418 var4 = (class418) this.field8060.method3828((long) arg1, (byte) -91);
        if (var4 != null && arg0 == 0 && !var4.field5343 && var4.field5346) {
            var4.method1566(-118);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field8067 == null || this.field8070[arg1] == -1) {
                    if (this.field8065.method694((byte) 3)) {
                        return null;
                    }
                    var4 = this.field8065.method693(84, (byte) 2, true, arg1, this.field8064);
                } else {
                    var4 = this.field8063.method1850((byte) -114, this.field8067, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field8067 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8063.method1851(arg1, this.field8067, true);
            } else if (arg0 == 2) {
                if (this.field8067 == null) {
                    throw new RuntimeException();
                }
                if (this.field8070[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8065.method700((byte) -123)) {
                    return null;
                }
                var4 = this.field8065.method693(113, (byte) 2, false, arg1, this.field8064);
            } else {
                throw new RuntimeException();
            }
            this.field8060.method3832(var4, (long) arg1, 24);
        }
        if (var4.field5346) {
            return null;
        }
        int var5 = -29 % ((arg2 - 52) / 40);
        byte[] var6 = var4.method1741(0);
        if (!var4 instanceof class290) {
            try {
                label157: {
                    if (var6 != null && var6.length > 2) {
                        class633.field8586.reset();
                        class633.field8586.update(var6, 0, var6.length - 2);
                        int var13 = (int) class633.field8586.getValue();
                        if (this.field8054.field9287[arg1] != var13) {
                            throw new RuntimeException();
                        }
                        if (this.field8054.field9299 == null || this.field8054.field9299[arg1] == null) {
                            break label157;
                        }
                        byte[] var14 = this.field8054.field9299[arg1];
                        byte[] var15 = class371.method2153(0, var6.length - 2, (byte) -117, var6);
                        int var16 = 0;
                        while (true) {
                            if (var16 >= 64) {
                                break label157;
                            }
                            if (var14[var16] != var15[var16]) {
                                throw new RuntimeException();
                            }
                            var16++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field8065.field1222 = 0;
                this.field8065.field1224 = 0;
            } catch (RuntimeException var19) {
                this.field8065.method704(19922);
                var4.method1566(-79);
                if (var4.field5343 && !this.field8065.method694((byte) 3)) {
                    class612 var17 = this.field8065.method693(53, (byte) 2, true, arg1, this.field8064);
                    this.field8060.method3832(var17, (long) arg1, 93);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field8054.field9288[arg1] >>> 8);
            var6[var6.length - 1] = (byte) this.field8054.field9288[arg1];
            if (this.field8067 != null) {
                this.field8063.method1848(this.field8067, arg1, 255, var6);
                if (this.field8070[arg1] != 1) {
                    this.field8058++;
                    this.field8070[arg1] = 1;
                }
            }
            if (!var4.field5343) {
                var4.method1566(-65);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class633.field8586.reset();
            class633.field8586.update(var6, 0, var6.length - 2);
            int var7 = (int) class633.field8586.getValue();
            if (this.field8054.field9287[arg1] != var7) {
                throw new RuntimeException();
            }
            if (this.field8054.field9299 != null && this.field8054.field9299[arg1] != null) {
                byte[] var8 = this.field8054.field9299[arg1];
                byte[] var9 = class371.method2153(0, var6.length - 2, (byte) -100, var6);
                for (int var10 = 0; var10 < 64; var10++) {
                    if (var8[var10] != var9[var10]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var11 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field8054.field9288[arg1] & 0xFFFF) != var11) {
                throw new RuntimeException();
            }
            if (this.field8070[arg1] != 1) {
                this.field8058++;
                this.field8070[arg1] = 1;
            }
            if (!var4.field5343) {
                var4.method1566(-74);
            }
            return var4;
        } catch (Exception var18) {
            this.field8070[arg1] = -1;
            var4.method1566(-101);
            if (var4.field5343 && !this.field8065.method694((byte) 3)) {
                class612 var12 = this.field8065.method693(91, (byte) 2, true, arg1, this.field8064);
                this.field8060.method3832(var12, (long) arg1, 31);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)I", line = 493)
    public final int method3303(int arg0) {
        field8055++;
        if (this.field8054 == null) {
            return 0;
        } else if (this.field8075) {
            if (arg0 != -885) {
                this.method2615(60, -74);
            }
            class263 var2 = this.field8076.method1909(true);
            return var2 == null ? 0 : (int) var2.field3321;
        } else {
            return this.field8054.field9295;
        }
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)I", line = 519)
    public final int method3304(int arg0) {
        if (arg0 == 23752) {
            field8059++;
            return this.field8054 == null ? 0 : this.field8054.field9295;
        } else {
            return 96;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I", line = 544)
    public final int method3305(boolean arg0) {
        if (arg0) {
            return -34;
        } else {
            field8069++;
            return this.field8058;
        }
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)I", line = 556)
    public final int method3306(int arg0) {
        field8072++;
        if (arg0 != -19291) {
            this.field8064 = 10;
        }
        if (this.method2612(-111) == null) {
            return this.field8052 == null ? 0 : this.field8052.method1740((byte) 74);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BI)V", line = 579)
    public final void method2611(byte arg0, int arg1) {
        field8066++;
        if (this.field8067 == null) {
            return;
        }
        for (class263 var3 = this.field8077.method1909(true); var3 != null; var3 = this.field8077.method1916((byte) 122)) {
            if (((long) arg1) == var3.field3321) {
                return;
            }
        }
        int var4 = 79 / ((arg0 - 66) / 53);
        class263 var5 = new class263();
        var5.field3321 = arg1;
        this.field8077.method1904(var5, -20);
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V", line = 608)
    public final void method3307(int arg0) {
        field8056++;
        if (this.field8067 == null) {
            return;
        }
        this.field8073 = true;
        int var2 = 59 % ((arg0 - 37) / 37);
        if (this.field8076 == null) {
            this.field8076 = new class333();
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 633)
    public final void method3308(byte arg0) {
        if (arg0 != 0) {
            this.method2612(81);
        }
        field8053++;
        if (this.field8076 != null) {
            if (this.method2612(arg0 ^ 0x6B) == null) {
                return;
            }
            if (this.field8075) {
                boolean var2 = true;
                for (class263 var3 = this.field8076.method1909(true); var3 != null; var3 = this.field8076.method1916((byte) 114)) {
                    int var5 = (int) var3.field3321;
                    if (this.field8070[var5] == 0) {
                        this.method3302(1, var5, (byte) -45);
                    }
                    if (this.field8070[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1566(-59);
                    }
                }
                while (this.field8054.field9291.length > this.field8074) {
                    if (this.field8054.field9291[this.field8074] == 0) {
                        this.field8074++;
                    } else {
                        if (this.field8063.field3977 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field8070[this.field8074] == 0) {
                            this.method3302(1, this.field8074, (byte) 103);
                        }
                        if (this.field8070[this.field8074] == 0) {
                            class263 var4 = new class263();
                            var4.field3321 = this.field8074;
                            this.field8076.method1904(var4, -11);
                            var2 = false;
                        }
                        this.field8074++;
                    }
                }
                if (var2) {
                    this.field8075 = false;
                    this.field8074 = 0;
                }
            } else if (this.field8073) {
                boolean var6 = true;
                for (class263 var7 = this.field8076.method1909(true); var7 != null; var7 = this.field8076.method1916((byte) 89)) {
                    int var9 = (int) var7.field3321;
                    if (this.field8070[var9] != 1) {
                        this.method3302(2, var9, (byte) 121);
                    }
                    if (this.field8070[var9] == 1) {
                        var7.method1566(-104);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field8074 < this.field8054.field9291.length) {
                    if (this.field8054.field9291[this.field8074] == 0) {
                        this.field8074++;
                    } else {
                        if (this.field8065.method700((byte) -128)) {
                            var6 = false;
                            break;
                        }
                        if (this.field8070[this.field8074] != 1) {
                            this.method3302(2, this.field8074, (byte) 97);
                        }
                        if (this.field8070[this.field8074] != 1) {
                            class263 var8 = new class263();
                            var8.field3321 = this.field8074;
                            var6 = false;
                            this.field8076.method1904(var8, -88);
                        }
                        this.field8074++;
                    }
                }
                if (var6) {
                    this.field8073 = false;
                    this.field8074 = 0;
                }
            } else {
                this.field8076 = null;
            }
        }
        if (!this.field8078 || class321.method1854(-67) < this.field8079) {
            return;
        }
        for (class418 var10 = (class418) this.field8060.method3830((byte) -28); var10 != null; var10 = (class418) this.field8060.method3838((byte) -92)) {
            if (!var10.field5346) {
                if (var10.field5345) {
                    if (!var10.field5343) {
                        throw new RuntimeException();
                    }
                    var10.method1566(-128);
                } else {
                    var10.field5345 = true;
                }
            }
        }
        this.field8079 = class321.method1854(-123) + 1000L;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILkf;Lkf;Ljt;Lcs;I[BIZ)V", line = 839)
    public class601(int arg0, class237 arg1, class237 arg2, class94 arg3, class318 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8067 = arg1;
        this.field8064 = arg0;
        if (this.field8067 == null) {
            this.field8075 = false;
        } else {
            this.field8075 = true;
            this.field8076 = new class333();
        }
        this.field8078 = arg8;
        this.field8063 = arg4;
        this.field8061 = arg5;
        this.field8065 = arg3;
        this.field8071 = arg6;
        this.field8051 = arg2;
        this.field8047 = arg7;
        if (this.field8051 != null) {
            this.field8052 = this.field8063.method1850((byte) -107, this.field8051, this.field8064);
        }
    }
}
