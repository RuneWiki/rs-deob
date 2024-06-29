import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class290 {

    @OriginalMember(owner = "client!th", name = "s", descriptor = "Lvu;")
    private class680 field4159 = new class680();

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Lvu;")
    private class680 field4162 = new class680();

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Lvu;")
    private class680 field4164 = new class680();

    @OriginalMember(owner = "client!th", name = "z", descriptor = "Lvu;")
    private class680 field4166 = new class680();

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Ldc;")
    private class63 field4170 = new class63(4);

    @OriginalMember(owner = "client!th", name = "E", descriptor = "B")
    private byte field4171 = 0;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public volatile int field4173 = 0;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "I")
    public volatile int field4174 = 0;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "Ldc;")
    private class63 field4172 = new class63(8);

    @OriginalMember(owner = "client!th", name = "u", descriptor = "Lmba;")
    public static class646 field4161 = new class646();

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field4163 = 0;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "[I")
    public static int[] field4165 = new int[6];

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    private int field4168;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "J")
    private long field4167;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "Lch;")
    private class39 field4175;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lru;")
    private class683 field4169;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field4147;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILwn;I)Lfi;", line = 8)
    public static final class12 method1912(int arg0, int arg1, class585 arg2, int arg3) {
        field4154++;
        int var4 = arg0 << 10 | arg2.field7976;
        class12 var5 = (class12) class58.field830.method1945((byte) -52, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class587.field7997.method1583(class587.field7997.method1576(var4, -1), arg3 ^ 0xF36EAAF7);
        if (var6 == null) {
            int var9 = arg2.field7976 | arg1 + 65536 << 10;
            class12 var10 = (class12) class58.field830.method1945((byte) -52, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class587.field7997.method1583(class587.field7997.method1576(var9, arg3 ^ 0xF36EAAAF), -76);
            if (var11 == null) {
                int var14 = arg2.field7976 | 0x3FFFC00;
                class12 var15 = (class12) class58.field830.method1945((byte) -52, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                if (arg3 != 210851152) {
                    field4147 = null;
                }
                byte[] var16 = class587.field7997.method1583(class587.field7997.method1576(var14, -1), -127);
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class12 var17;
                    try {
                        var17 = class38.method207(true, var16);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field115 = arg2;
                    class58.field830.method1940(var17, (byte) -27, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class12 var12;
                try {
                    var12 = class38.method207(true, var11);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field115 = arg2;
                class58.field830.method1940(var12, (byte) -27, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class12 var7;
            try {
                var7 = class38.method207(true, var6);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field115 = arg2;
            class58.field830.method1940(var7, (byte) -27, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 90)
    public final void method1913(byte arg0) {
        try {
            this.field4169.method3850(107);
        } catch (Exception var2) {
        }
        field4151++;
        this.field4171 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4169 = null;
        this.field4174 = -1;
        if (arg0 != 103) {
            this.method1927((byte) 32);
        }
        this.field4173++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V", line = 108)
    public final void method1914(int arg0) {
        if (this.field4169 != null) {
            this.field4169.method3851((byte) 41);
        }
        if (arg0 != 6) {
            method1912(124, 103, null, -120);
        }
        field4148++;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V", line = 121)
    public final void method1915(int arg0) {
        field4145++;
        if (this.field4169 == null) {
            return;
        }
        try {
            this.field4170.field956 = 0;
            this.field4170.method444(7, 128);
            this.field4170.method464(arg0 ^ 0x635D, arg0);
            this.field4169.method3843(false, 4, 0, this.field4170.field954);
        } catch (IOException var3) {
            try {
                this.field4169.method3850(104);
            } catch (Exception var2) {
            }
            this.field4174 = -2;
            this.field4169 = null;
            this.field4173++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lru;IZ)V", line = 147)
    public final void method1916(class683 arg0, int arg1, boolean arg2) {
        if (this.field4169 != null) {
            try {
                this.field4169.method3850(125);
            } catch (Exception var8) {
            }
            this.field4169 = null;
        }
        field4156++;
        if (arg1 != -2) {
            return;
        }
        this.field4169 = arg0;
        this.method1926(414563472);
        this.method1923(arg2, -25670);
        this.field4172.field956 = 0;
        this.field4175 = null;
        while (true) {
            class39 var4 = (class39) this.field4162.method3834((byte) 105);
            if (var4 == null) {
                while (true) {
                    class39 var5 = (class39) this.field4166.method3834((byte) 84);
                    if (var5 == null) {
                        if (this.field4171 != 0) {
                            try {
                                this.field4170.field956 = 0;
                                this.field4170.method444(4, 128);
                                this.field4170.method444(this.field4171, 128);
                                this.field4170.method492(arg1, 0);
                                this.field4169.method3843(false, 4, 0, this.field4170.field954);
                            } catch (IOException var7) {
                                try {
                                    this.field4169.method3850(109);
                                } catch (Exception var6) {
                                }
                                this.field4174 = -2;
                                this.field4169 = null;
                                this.field4173++;
                            }
                        }
                        this.field4168 = 0;
                        this.field4167 = class97.method664((byte) -50);
                        return;
                    }
                    this.field4164.method3827(127, var5);
                }
            }
            this.field4159.method3827(-80, var4);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V", line = 215)
    public final void method1917(int arg0) {
        if (arg0 != -30857) {
            this.method1924(91, false, -41, (byte) 2, (byte) 91);
        }
        if (this.field4169 != null) {
            this.field4169.method3850(-46);
        }
        field4142++;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)Z", line = 229)
    public static final boolean method1918(byte arg0) {
        field4158++;
        class217 var1 = (class217) class593.field8040.method3618(127);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field2835; var2++) {
            if (var1.field2836[var2] != null && var1.field2836[var2].field3633 == 0) {
                return false;
            }
            if (var1.field2830[var2] != null && var1.field2830[var2].field3633 == 0) {
                return false;
            }
        }
        if (arg0 < 57) {
            field4161 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 270)
    public static final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -12) {
            return;
        }
        field4160++;
        if (arg4 != 8 && arg4 != 16) {
            class262 var5 = class137.field1948[arg2][arg3][arg1];
            if (var5 != null) {
                if (arg4 == 1) {
                    var5.field3840 = 0;
                } else if (arg4 == 2) {
                    var5.field3851 = 0;
                }
            }
            class685.method3859(21538);
            return;
        }
        for (int var6 = 0; var6 < class312.field4339; var6++) {
            class616 var7 = class166.field2285[var6];
            if (var7.field8290 == arg4 && var7.field8282 == arg3 && var7.field8291 == arg1 || var7.field8285 == arg3 && var7.field8291 == arg1) {
                if (class312.field4339 != var6) {
                    class245.method1649(class166.field2285, var6 + 1, class166.field2285, var6, class166.field2285.length - var6 - 1);
                }
                class312.field4339--;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)Z", line = 329)
    public final boolean method1920(int arg0) {
        if (this.field4169 != null) {
            long var2 = class97.method664((byte) -50);
            int var4 = (int) (var2 - this.field4167);
            this.field4167 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4168 += var4;
            if (this.field4168 > 30000) {
                try {
                    this.field4169.method3850(107);
                } catch (Exception var27) {
                }
                this.field4169 = null;
            }
        }
        field4146++;
        if (this.field4169 == null) {
            return this.method1930(71) == 0 && this.method1927((byte) 127) == 0;
        }
        try {
            this.field4169.method3847((byte) 114);
            for (class39 var5 = (class39) this.field4159.method3828(91); var5 != null; var5 = (class39) this.field4159.method3829(-29202)) {
                this.field4170.field956 = 0;
                this.field4170.method444(1, arg0 + 127);
                this.field4170.method464(25437, (int) var5.field40);
                this.field4169.method3843(false, 4, 0, this.field4170.field954);
                this.field4162.method3827(62, var5);
            }
            if (arg0 != 1) {
                this.method1913((byte) -24);
            }
            for (class39 var6 = (class39) this.field4164.method3828(111); var6 != null; var6 = (class39) this.field4164.method3829(-29202)) {
                this.field4170.field956 = 0;
                this.field4170.method444(0, arg0 + 127);
                this.field4170.method464(25437, (int) var6.field40);
                this.field4169.method3843(false, 4, 0, this.field4170.field954);
                this.field4166.method3827(arg0 ^ 0xFFFFFFD6, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4169.method3844((byte) 98);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4168 = 0;
                byte var9 = 0;
                if (this.field4175 == null) {
                    var9 = 8;
                } else if (this.field4175.field482 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4172.field956;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field4169.method3845(this.field4172.field954, var10, this.field4172.field956, (byte) 127);
                    if (this.field4171 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4172.field954[this.field4172.field956 + var11] = (byte) class134.method848(this.field4172.field954[this.field4172.field956 + var11], this.field4171);
                        }
                    }
                    this.field4172.field956 += var10;
                    if (this.field4172.field956 >= var9) {
                        if (this.field4175 == null) {
                            this.field4172.field956 = 0;
                            int var12 = this.field4172.method505((byte) -119);
                            int var13 = this.field4172.method482(-772591672);
                            int var14 = this.field4172.method505((byte) -119);
                            int var15 = this.field4172.method457(-14532);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class39 var21;
                            if (var17) {
                                for (var21 = (class39) this.field4166.method3828(115); var21 != null && var21.field40 != var18; var21 = (class39) this.field4166.method3829(-29202)) {
                                }
                            } else {
                                for (var21 = (class39) this.field4162.method3828(111); var21 != null && var21.field40 != var18; var21 = (class39) this.field4162.method3829(-29202)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field4175 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field4175.field481 = new class63(this.field4175.field487 + var15 + var22);
                            this.field4175.field481.method444(var16, arg0 ^ 0x81);
                            this.field4175.field481.method473(-128, var15);
                            this.field4172.field956 = 0;
                            this.field4175.field482 = 8;
                        } else if (this.field4175.field482 != 0) {
                            throw new IOException();
                        } else if (this.field4172.field954[0] == -1) {
                            this.field4172.field956 = 0;
                            this.field4175.field482 = 1;
                        } else {
                            this.field4175 = null;
                        }
                    }
                } else {
                    int var23 = this.field4175.field481.field954.length - this.field4175.field487;
                    int var24 = 512 - this.field4175.field482;
                    if ((var23 - this.field4175.field481.field956) < var24) {
                        var24 = var23 - this.field4175.field481.field956;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field4169.method3845(this.field4175.field481.field954, var24, this.field4175.field481.field956, (byte) 127);
                    if (this.field4171 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field4175.field481.field954[this.field4175.field481.field956 + var25] = (byte) class134.method848(this.field4175.field481.field954[this.field4175.field481.field956 + var25], this.field4171);
                        }
                    }
                    this.field4175.field481.field956 += var24;
                    this.field4175.field482 += var24;
                    if (this.field4175.field481.field956 == var23) {
                        this.field4175.method21(127);
                        this.field4175.field9191 = false;
                        this.field4175 = null;
                    } else if (this.field4175.field482 == 512) {
                        this.field4175.field482 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4169.method3850(-93);
            } catch (Exception var26) {
            }
            this.field4174 = -2;
            this.field4173++;
            this.field4169 = null;
            return this.method1930(-116) == 0 && this.method1927((byte) 113) == 0;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 604)
    public static final void method1921(int arg0, int arg1) {
        field4149++;
        if (arg1 == -1) {
            class346 var2 = class299.method1976(0, 4, arg0);
            var2.method2208(arg1 - 1718);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Z", line = 617)
    public final boolean method1922(boolean arg0) {
        field4150++;
        if (!arg0) {
            method1918((byte) 41);
        }
        return this.method1927((byte) 121) >= 20;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)V", line = 628)
    public final void method1923(boolean arg0, int arg1) {
        field4153++;
        if (this.field4169 == null) {
            return;
        }
        try {
            this.field4170.field956 = 0;
            this.field4170.method444(arg0 ? 2 : 3, 128);
            this.field4170.method464(25437, 0);
            if (arg1 == -25670) {
                this.field4169.method3843(false, 4, 0, this.field4170.field954);
            }
        } catch (IOException var4) {
            try {
                this.field4169.method3850(arg1 + 25631);
            } catch (Exception var3) {
            }
            this.field4173++;
            this.field4169 = null;
            this.field4174 = -2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZIBB)Lch;", line = 658)
    public final class39 method1924(int arg0, boolean arg1, int arg2, byte arg3, byte arg4) {
        field4155++;
        long var6 = (long) ((arg2 << 16) + arg0);
        class39 var8 = new class39();
        var8.field9192 = arg1;
        var8.field487 = arg3;
        var8.field40 = var6;
        if (arg1) {
            if (this.method1930(-123) >= 20) {
                throw new RuntimeException();
            }
            this.field4159.method3827(-88, var8);
        } else if (this.method1927((byte) 85) < 20) {
            this.field4164.method3827(126, var8);
        } else {
            throw new RuntimeException();
        }
        return arg4 >= -31 ? null : var8;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Ljava/lang/String;IIZLjava/lang/String;)V", line = 700)
    public static final void method1925(String arg0, int arg1, int arg2, boolean arg3, String arg4) {
        class126.method787(arg3, true, arg4, 0, arg2, arg0, arg1);
        field4143++;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V", line = 709)
    private final void method1926(int arg0) {
        field4157++;
        if (this.field4169 == null) {
            return;
        }
        try {
            this.field4170.field956 = 0;
            this.field4170.method444(6, arg0 ^ 0x18B5BC10);
            this.field4170.method464(25437, 3);
            this.field4169.method3843(false, 4, 0, this.field4170.field954);
            if (arg0 != 414563472) {
                this.field4169 = null;
            }
        } catch (IOException var3) {
            try {
                this.field4169.method3850(125);
            } catch (Exception var2) {
            }
            this.field4174 = -2;
            this.field4169 = null;
            this.field4173++;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)I", line = 738)
    private final int method1927(byte arg0) {
        field4144++;
        if (arg0 < 67) {
            this.field4167 = 64L;
        }
        return this.field4164.method3831(-29578) + this.field4166.method3831(-29578);
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)V", line = 749)
    public static void method1928(int arg0) {
        field4165 = null;
        field4161 = null;
        field4147 = null;
        if (arg0 != -1) {
            method1925(null, 116, 66, true, null);
        }
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)Z", line = 762)
    public final boolean method1929(int arg0) {
        if (arg0 == 13585) {
            field4152++;
            return this.method1930(43) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)I", line = 777)
    public final int method1930(int arg0) {
        field4141++;
        int var2 = -37 / ((arg0 + 48) / 44);
        return this.field4159.method3831(-29578) + this.field4162.method3831(-29578);
    }
}
