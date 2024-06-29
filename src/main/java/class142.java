import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class142 {

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "Lvm;")
    private class84 field1982 = new class84();

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "Lvm;")
    private class84 field1993 = new class84();

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "Lvm;")
    private class84 field1994 = new class84();

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "Lvm;")
    private class84 field1995 = new class84();

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "Lp;")
    private class107 field1997 = new class107(4);

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "B")
    private byte field2001 = 0;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public volatile int field2003 = 0;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "I")
    public volatile int field2002 = 0;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "Lp;")
    private class107 field2000 = new class107(8);

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "Lan;")
    public static class337 field1980 = new class337();

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "J")
    private long field1998;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "Lsm;")
    private class167 field1999;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lbi;")
    public static class91 field1987;

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "Lgf;")
    private class9 field2004;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V", line = 4)
    public final void method938(byte arg0) {
        if (this.field1999 != null) {
            this.field1999.method1095(28782);
        }
        field1990++;
        if (arg0 < 56) {
            this.field1999 = (class167) null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V", line = 22)
    private final void method939(byte arg0) {
        field1974++;
        if (this.field1999 == null) {
            return;
        }
        try {
            this.field1997.field1400 = 0;
            this.field1997.method648(6, (byte) 38);
            this.field1997.method667(-1911256952, 3);
            if (arg0 != -27) {
                this.field1997 = (class107) null;
            }
            this.field1999.method1097(this.field1997.field1388, 0, true, 4);
        } catch (IOException var5) {
            try {
                this.field1999.method1096((byte) 68);
            } catch (Exception var4) {
            }
            this.field2003++;
            this.field2002 = -2;
            this.field1999 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)Z", line = 49)
    public final boolean method940(byte arg0) {
        if (arg0 > -65) {
            this.field1998 = -109L;
        }
        field1972++;
        return this.method949(-14) >= 20;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Ljava/lang/String;ZIB)Z", line = 61)
    public static final boolean method941(String arg0, boolean arg1, int arg2, byte arg3) {
        if (arg3 != 78) {
            field1987 = (class91) null;
        }
        field1988++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = 0;
        boolean var6 = false;
        int var7 = arg0.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg0.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var6 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg2 <= var11) {
                return false;
            }
            if (var6) {
                var11 = -var11;
            }
            int var10 = arg2 * var5 + var11;
            if ((var10 / arg2) != var5) {
                return false;
            }
            var4 = true;
            var5 = var10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Z", line = 136)
    public final boolean method942(int arg0) {
        if (this.field1999 != null) {
            long var2 = class200.method1375(-16185);
            int var4 = (int) (var2 - this.field1998);
            this.field1998 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1996 += var4;
            if (this.field1996 > 30000) {
                try {
                    this.field1999.method1096((byte) 88);
                } catch (Exception var30) {
                }
                this.field1999 = null;
            }
        }
        field1984++;
        if (this.field1999 == null) {
            return this.method949(98) == 0 && this.method948(arg0 ^ 0xFFFFBA68) == 0;
        }
        try {
            this.field1999.method1098(arg0 ^ 0x73);
            for (class9 var6 = (class9) this.field1982.method499(3346); var6 != null; var6 = (class9) this.field1982.method501((byte) 102)) {
                this.field1997.field1400 = 0;
                this.field1997.method648(1, (byte) 38);
                this.field1997.method667(arg0 ^ 0x8E148888, (int) var6.field1344);
                this.field1999.method1097(this.field1997.field1388, 0, true, 4);
                this.field1993.method495((byte) -127, var6);
            }
            for (class9 var7 = (class9) this.field1994.method499(3346); var7 != null; var7 = (class9) this.field1994.method501((byte) 102)) {
                this.field1997.field1400 = 0;
                this.field1997.method648(0, (byte) 38);
                this.field1997.method667(-1911256952, (int) var7.field1344);
                this.field1999.method1097(this.field1997.field1388, 0, true, 4);
                this.field1995.method495((byte) -126, var7);
            }
            for (int var8 = arg0; var8 < 100; var8++) {
                int var9 = this.field1999.method1091((byte) 18);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                if (this.field2004 == null) {
                    var10 = 8;
                } else if (this.field2004.field126 == 0) {
                    var10 = 1;
                }
                this.field1996 = 0;
                if (var10 <= 0) {
                    int var11 = 512 - this.field2004.field126;
                    int var12 = this.field2004.field127.field1388.length - this.field2004.field114;
                    if (var11 > var12 - this.field2004.field127.field1400) {
                        var11 = var12 - this.field2004.field127.field1400;
                    }
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field1999.method1092(this.field2004.field127.field1400, var11, -1, this.field2004.field127.field1388);
                    if (this.field2001 != 0) {
                        for (int var13 = 0; var13 < var11; var13++) {
                            this.field2004.field127.field1388[this.field2004.field127.field1400 + var13] = (byte) class312.method2192(this.field2004.field127.field1388[this.field2004.field127.field1400 + var13], this.field2001);
                        }
                    }
                    this.field2004.field127.field1400 += var11;
                    this.field2004.field126 += var11;
                    if (this.field2004.field127.field1400 == var12) {
                        this.field2004.method610(-1);
                        this.field2004.field2578 = false;
                        this.field2004 = null;
                    } else if (this.field2004.field126 == 512) {
                        this.field2004.field126 = 0;
                    }
                } else {
                    int var14 = var10 - this.field2000.field1400;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field1999.method1092(this.field2000.field1400, var14, -1, this.field2000.field1388);
                    if (this.field2001 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field2000.field1388[this.field2000.field1400 + var15] = (byte) class312.method2192(this.field2000.field1388[this.field2000.field1400 + var15], this.field2001);
                        }
                    }
                    this.field2000.field1400 += var14;
                    if (var10 <= this.field2000.field1400) {
                        if (this.field2004 == null) {
                            this.field2000.field1400 = 0;
                            int var16 = this.field2000.method661(-1);
                            int var17 = this.field2000.method624(14612);
                            int var18 = this.field2000.method661(-1);
                            int var19 = this.field2000.method676(true);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class9 var25;
                            if (var21) {
                                for (var25 = (class9) this.field1995.method499(3346); var25 != null && var25.field1344 != var22; var25 = (class9) this.field1995.method501((byte) 102)) {
                                }
                            } else {
                                for (var25 = (class9) this.field1993.method499(3346); var25 != null && var25.field1344 != var22; var25 = (class9) this.field1993.method501((byte) 102)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field2004 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field2004.field127 = new class107(var19 + var26 + this.field2004.field114);
                            this.field2004.field127.method648(var20, (byte) 38);
                            this.field2004.field127.method641(1773202520, var19);
                            this.field2004.field126 = 8;
                            this.field2000.field1400 = 0;
                        } else if (this.field2004.field126 != 0) {
                            throw new IOException();
                        } else if (this.field2000.field1388[0] == -1) {
                            this.field2004.field126 = 1;
                            this.field2000.field1400 = 0;
                        } else {
                            this.field2004 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1999.method1096((byte) 124);
            } catch (Exception var29) {
            }
            this.field1999 = null;
            this.field2003++;
            this.field2002 = -2;
            return this.method949(-117) == 0 && this.method948(-17816) == 0;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZI)V", line = 411)
    public final void method943(boolean arg0, int arg1) {
        field1976++;
        if (this.field1999 == null) {
            return;
        }
        try {
            this.field1997.field1400 = 0;
            this.field1997.method648(arg0 ? 2 : 3, (byte) 38);
            this.field1997.method667(-1911256952, 0);
            int var3 = -10 / ((18 - arg1) / 36);
            this.field1999.method1097(this.field1997.field1388, 0, true, 4);
        } catch (IOException var7) {
            try {
                this.field1999.method1096((byte) 60);
            } catch (Exception var6) {
            }
            this.field2002 = -2;
            this.field1999 = null;
            this.field2003++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V", line = 438)
    public static final void method944(int arg0, int arg1) {
        field1977++;
        if (arg1 == -1 || !class285.method2039(arg1, arg0 ^ 0xFFFF9D51)) {
            return;
        }
        class263[] var2 = class175.field2535[arg1];
        if (arg0 != 7485) {
            method941((String) null, false, -75, (byte) 39);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class263 var4 = var2[var3];
            if (var4.field4017 != null) {
                class176 var5 = new class176();
                var5.field2552 = var4;
                var5.field2551 = var4.field4017;
                class313.method2195(var5, 2000000, true);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lhc;Z)I", line = 479)
    public static final int method945(class184 arg0, boolean arg1) {
        field1975++;
        class282 var2 = arg0.field2657;
        if (arg1) {
            field1992 = -39;
        }
        if (var2.field4401 != null) {
            var2 = var2.method2021((byte) 22);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4376;
        class191 var4 = arg0.method1102((byte) -58);
        if (arg0.field2376 == var4.field2737) {
            var3 = var2.field4377;
        } else if (arg0.field2376 == var4.field2728 || arg0.field2376 == var4.field2757 || arg0.field2376 == var4.field2721 || arg0.field2376 == var4.field2732) {
            var3 = var2.field4374;
        } else if (arg0.field2376 == var4.field2739 || arg0.field2376 == var4.field2742 || arg0.field2376 == var4.field2722 || arg0.field2376 == var4.field2738) {
            var3 = var2.field4436;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)V", line = 519)
    public final void method946(byte arg0) {
        field1983++;
        if (this.field1999 == null) {
            return;
        }
        if (arg0 >= -72) {
            this.method942(85);
        }
        try {
            this.field1997.field1400 = 0;
            this.field1997.method648(7, (byte) 38);
            this.field1997.method667(-1911256952, 0);
            this.field1999.method1097(this.field1997.field1388, 0, true, 4);
        } catch (IOException var5) {
            try {
                this.field1999.method1096((byte) 92);
            } catch (Exception var4) {
            }
            this.field2003++;
            this.field2002 = -2;
            this.field1999 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsm;ZI)V", line = 548)
    public final void method947(class167 arg0, boolean arg1, int arg2) {
        if (this.field1999 != null) {
            try {
                this.field1999.method1096((byte) 60);
            } catch (Exception var11) {
            }
            this.field1999 = null;
        }
        this.field1999 = arg0;
        field1973++;
        this.method939((byte) -27);
        this.method943(arg1, -24);
        this.field2004 = null;
        this.field2000.field1400 = 0;
        while (true) {
            class9 var5 = (class9) this.field1993.method494(10425);
            if (var5 == null) {
                while (true) {
                    class9 var6 = (class9) this.field1995.method494(10425);
                    if (var6 == null) {
                        if (~this.field2001 != arg2) {
                            try {
                                this.field1997.field1400 = 0;
                                this.field1997.method648(4, (byte) 38);
                                this.field1997.method648(this.field2001, (byte) 38);
                                this.field1997.method662(true, 0);
                                this.field1999.method1097(this.field1997.field1388, 0, true, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field1999.method1096((byte) 66);
                                } catch (Exception var9) {
                                }
                                this.field1999 = null;
                                this.field2003++;
                                this.field2002 = -2;
                            }
                        }
                        this.field1996 = 0;
                        this.field1998 = class200.method1375(-16185);
                        return;
                    }
                    this.field1994.method495((byte) -115, var6);
                }
            }
            this.field1982.method495((byte) -114, var5);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)I", line = 613)
    private final int method948(int arg0) {
        if (arg0 == -17816) {
            field1979++;
            return this.field1994.method502(0) + this.field1995.method502(0);
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)I", line = 630)
    public final int method949(int arg0) {
        int var2 = 22 % ((53 - arg0) / 41);
        field1978++;
        return this.field1982.method502(0) + this.field1993.method502(0);
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V", line = 647)
    public static void method950(int arg0) {
        if (arg0 != 2000000) {
            field1991 = -42;
        }
        field1980 = null;
        field1987 = null;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)Lfc;", line = 658)
    public static final class238 method951(int arg0, int arg1) {
        field1971++;
        class238 var2 = (class238) class27.field347.method1239((byte) -60, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 26915) {
            field1987 = (class91) null;
        }
        byte[] var3 = class121.field1704.method1199(28815, class118.method801(arg1 ^ 0xFFFF91BF, arg0), class261.method1880(arg0, (byte) 34));
        class238 var4 = new class238();
        var4.field3548 = arg0;
        if (var3 != null) {
            var4.method1698(new class107(var3), false);
        }
        var4.method1705(-26130);
        if (var4.field3535) {
            var4.field3565 = false;
            var4.field3507 = 0;
        }
        if (!class227.field3242 && var4.field3515) {
            var4.field3513 = null;
        }
        class27.field347.method1243(var4, (long) arg0, arg1 ^ 0xFFFFE4BD);
        return var4;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 697)
    public final void method952(int arg0) {
        try {
            this.field1999.method1096((byte) 121);
        } catch (Exception var3) {
        }
        this.field2002 = -1;
        if (arg0 < 64) {
            this.field1998 = -60L;
        }
        this.field2001 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1999 = null;
        field1986++;
        this.field2003++;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z", line = 714)
    public final boolean method953(int arg0) {
        if (arg0 == -21) {
            field1985++;
            return this.method948(arg0 - 17795) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBZB)Lgf;", line = 730)
    public final class9 method954(int arg0, int arg1, byte arg2, boolean arg3, byte arg4) {
        field1981++;
        class9 var6 = new class9();
        var6.field2572 = arg3;
        long var7 = (long) ((arg0 << 16) + arg1);
        var6.field1344 = var7;
        var6.field114 = arg4;
        if (arg2 != -112) {
            this.field2004 = (class9) null;
        }
        if (arg3) {
            if (this.method949(118) >= 20) {
                throw new RuntimeException();
            }
            this.field1982.method495((byte) -118, var6);
        } else if (this.method948(-17816) < 20) {
            this.field1994.method495((byte) -124, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(B)V", line = 772)
    public final void method955(byte arg0) {
        if (arg0 <= 78) {
            this.field1998 = -41L;
        }
        field1989++;
        if (this.field1999 != null) {
            this.field1999.method1096((byte) 104);
        }
    }
}
