import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class78 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "Ltg;")
    private class345 field1014 = new class345();

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Ltg;")
    private class345 field1033 = new class345();

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Ltg;")
    private class345 field1034 = new class345();

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Ltg;")
    private class345 field1035 = new class345();

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Llf;")
    private class143 field1036 = new class143(4);

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public volatile int field1042 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "B")
    private byte field1043 = 0;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public volatile int field1041 = 0;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "Llf;")
    private class143 field1040 = new class143(8);

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field1028 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field1015 = -1;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field1026 = 0;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    private int field1037;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "J")
    private long field1039;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "Lkn;")
    private class220 field1038;

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "Lqo;")
    private class331 field1044;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Ljava/lang/String;")
    public static String field1032;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I", line = 5)
    private final int method499(int arg0) {
        field1025++;
        if (arg0 != 4) {
            this.field1034 = (class345) null;
        }
        return this.field1034.method2399(-2) + this.field1035.method2399(arg0 ^ 0xFFFFFFFA);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 20)
    public static void method500(byte arg0) {
        if (arg0 < -48) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 31)
    public final void method501(int arg0) {
        field1022++;
        if (this.field1038 != null) {
            this.field1038.method1526((byte) 34);
        }
        if (arg0 != 20) {
            this.method505((byte) 87);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)Z", line = 45)
    public final boolean method502(byte arg0) {
        if (this.field1038 != null) {
            long var2 = class9.method57(-14133);
            int var4 = (int) (var2 - this.field1039);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1039 = var2;
            this.field1037 += var4;
            if (this.field1037 > 30000) {
                try {
                    this.field1038.method1527(121);
                } catch (Exception var30) {
                }
                this.field1038 = null;
            }
        }
        field1030++;
        if (this.field1038 == null) {
            return this.method513(false) == 0 && this.method499(4) == 0;
        }
        try {
            this.field1038.method1537(0);
            for (class331 var6 = (class331) this.field1014.method2397((byte) -114); var6 != null; var6 = (class331) this.field1014.method2392((byte) -22)) {
                this.field1036.field2295 = 0;
                this.field1036.method1055(1, 81);
                this.field1036.method1018((byte) 92, (int) var6.field4086);
                this.field1038.method1532(4, 0, -128, this.field1036.field2260);
                this.field1033.method2395(16218, var6);
            }
            for (class331 var7 = (class331) this.field1034.method2397((byte) -119); var7 != null; var7 = (class331) this.field1034.method2392((byte) -22)) {
                this.field1036.field2295 = 0;
                this.field1036.method1055(0, 78);
                this.field1036.method1018((byte) 86, (int) var7.field4086);
                this.field1038.method1532(4, 0, -103, this.field1036.field2260);
                this.field1035.method2395(16218, var7);
            }
            if (arg0 > -74) {
                this.method504(true, (class220) null, true);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1038.method1531((byte) 124);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                byte var10 = 0;
                this.field1037 = 0;
                if (this.field1044 == null) {
                    var10 = 8;
                } else if (this.field1044.field5296 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field1044.field5300.field2260.length - this.field1044.field5304;
                    int var12 = 512 - this.field1044.field5296;
                    if ((var11 - this.field1044.field5300.field2295) < var12) {
                        var12 = var11 - this.field1044.field5300.field2295;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field1038.method1536(this.field1044.field5300.field2295, var12, (byte) -57, this.field1044.field5300.field2260);
                    if (this.field1043 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1044.field5300.field2260[this.field1044.field5300.field2295 + var13] = (byte) class60.method368(this.field1044.field5300.field2260[this.field1044.field5300.field2295 + var13], this.field1043);
                        }
                    }
                    this.field1044.field5300.field2295 += var12;
                    this.field1044.field5296 += var12;
                    if (this.field1044.field5300.field2295 == var11) {
                        this.field1044.method1829((byte) -74);
                        this.field1044.field2683 = false;
                        this.field1044 = null;
                    } else if (this.field1044.field5296 == 512) {
                        this.field1044.field5296 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1040.field2295;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field1038.method1536(this.field1040.field2295, var14, (byte) -57, this.field1040.field2260);
                    if (this.field1043 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1040.field2260[this.field1040.field2295 + var15] = (byte) class60.method368(this.field1040.field2260[this.field1040.field2295 + var15], this.field1043);
                        }
                    }
                    this.field1040.field2295 += var14;
                    if (this.field1040.field2295 >= var10) {
                        if (this.field1044 == null) {
                            this.field1040.field2295 = 0;
                            int var16 = this.field1040.method1043(true);
                            int var17 = this.field1040.method1051(1);
                            int var18 = this.field1040.method1043(true);
                            boolean var19 = (var18 & 0x80) != 0;
                            Object var20 = null;
                            long var21 = (long) ((var16 << 16) + var17);
                            int var23 = var18 & 0x7F;
                            int var24 = this.field1040.method1057(-121);
                            class331 var25;
                            if (var19) {
                                for (var25 = (class331) this.field1035.method2397((byte) 77); var25 != null && var25.field4086 != var21; var25 = (class331) this.field1035.method2392((byte) -22)) {
                                }
                            } else {
                                for (var25 = (class331) this.field1033.method2397((byte) 93); var25 != null && var25.field4086 != var21; var25 = (class331) this.field1033.method2392((byte) -22)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field1044 = var25;
                            int var26 = var23 == 0 ? 5 : 9;
                            this.field1044.field5300 = new class143(var24 + var26 + this.field1044.field5304);
                            this.field1044.field5300.method1055(var23, 118);
                            this.field1044.field5300.method1052(var24, false);
                            this.field1044.field5296 = 8;
                            this.field1040.field2295 = 0;
                        } else if (this.field1044.field5296 != 0) {
                            throw new IOException();
                        } else if (this.field1040.field2260[0] == -1) {
                            this.field1040.field2295 = 0;
                            this.field1044.field5296 = 1;
                        } else {
                            this.field1044 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field1038.method1527(114);
            } catch (Exception var29) {
            }
            this.field1041 = -2;
            this.field1038 = null;
            this.field1042++;
            return this.method513(false) == 0 && this.method499(4) == 0;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBIII)V", line = 330)
    public static final void method503(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1027++;
        int var6 = class112.method728(arg5, class244.field3844, class2.field22, -66);
        int var7 = class112.method728(arg3, class244.field3844, class2.field22, -48);
        int var8 = class112.method728(arg0, class337.field5389, class344.field5460, -64);
        int var9 = class112.method728(arg4, class337.field5389, class344.field5460, -122);
        for (int var10 = var6; var10 <= var7; var10++) {
            class278.method1986(var8, class347.field5501[var10], arg1, var9, (byte) -89);
        }
        if (arg2 <= 105) {
            field1015 = 14;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLkn;Z)V", line = 359)
    public final void method504(boolean arg0, class220 arg1, boolean arg2) {
        if (this.field1038 != null) {
            try {
                this.field1038.method1527(121);
            } catch (Exception var11) {
            }
            this.field1038 = null;
        }
        this.field1038 = arg1;
        field1016++;
        this.method512(0);
        if (arg2) {
            this.field1036 = (class143) null;
        }
        this.method507((byte) -55, arg0);
        this.field1044 = null;
        this.field1040.field2295 = 0;
        while (true) {
            class331 var5 = (class331) this.field1033.method2396(1542);
            if (var5 == null) {
                while (true) {
                    class331 var6 = (class331) this.field1035.method2396(1542);
                    if (var6 == null) {
                        if (this.field1043 != 0) {
                            try {
                                this.field1036.field2295 = 0;
                                this.field1036.method1055(4, 125);
                                this.field1036.method1055(this.field1043, 100);
                                this.field1036.method1003(0, -2);
                                this.field1038.method1532(4, 0, 106, this.field1036.field2260);
                            } catch (IOException var10) {
                                try {
                                    this.field1038.method1527(93);
                                } catch (Exception var9) {
                                }
                                this.field1042++;
                                this.field1038 = null;
                                this.field1041 = -2;
                            }
                        }
                        this.field1037 = 0;
                        this.field1039 = class9.method57(-14133);
                        return;
                    }
                    this.field1034.method2395(16218, var6);
                }
            }
            this.field1014.method2395(16218, var5);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z", line = 431)
    public final boolean method505(byte arg0) {
        int var2 = 18 % ((-arg0 - 65) / 58);
        field1023++;
        return this.method499(4) >= 20;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 442)
    public final void method506(boolean arg0) {
        try {
            this.field1038.method1527(73);
        } catch (Exception var3) {
        }
        this.field1042++;
        if (!arg0) {
            method503(102, -63, (byte) 90, -40, 81, -14);
        }
        this.field1038 = null;
        this.field1041 = -1;
        this.field1043 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        field1024++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZ)V", line = 460)
    public final void method507(byte arg0, boolean arg1) {
        field1031++;
        if (this.field1038 == null) {
            return;
        }
        try {
            if (arg0 >= -49) {
                field1015 = -56;
            }
            this.field1036.field2295 = 0;
            this.field1036.method1055(arg1 ? 2 : 3, 97);
            this.field1036.method1018((byte) 79, 0);
            this.field1038.method1532(4, 0, -123, this.field1036.field2260);
        } catch (IOException var6) {
            try {
                this.field1038.method1527(106);
            } catch (Exception var5) {
            }
            this.field1042++;
            this.field1041 = -2;
            this.field1038 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 488)
    public final void method508(boolean arg0) {
        if (!arg0) {
            field1020++;
            if (this.field1038 != null) {
                this.field1038.method1527(114);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V", line = 501)
    public final void method509(byte arg0) {
        if (arg0 != 34) {
            this.field1034 = (class345) null;
        }
        field1019++;
        if (this.field1038 == null) {
            return;
        }
        try {
            this.field1036.field2295 = 0;
            this.field1036.method1055(7, 91);
            this.field1036.method1018((byte) 120, 0);
            this.field1038.method1532(4, 0, 51, this.field1036.field2260);
        } catch (IOException var5) {
            try {
                this.field1038.method1527(67);
            } catch (Exception var4) {
            }
            this.field1041 = -2;
            this.field1042++;
            this.field1038 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(I)Z", line = 529)
    public final boolean method510(int arg0) {
        field1017++;
        int var2 = -103 % ((-arg0 - 35) / 34);
        return this.method513(false) >= 20;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZIBII)Lqo;", line = 544)
    public final class331 method511(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1021++;
        long var6 = (long) ((arg4 << 16) + arg3);
        class331 var8 = new class331();
        if (arg1 != 27702) {
            field1015 = 74;
        }
        var8.field2688 = arg0;
        var8.field5304 = arg2;
        var8.field4086 = var6;
        if (arg0) {
            if (this.method513(false) >= 20) {
                throw new RuntimeException();
            }
            this.field1014.method2395(16218, var8);
        } else if (this.method499(4) < 20) {
            this.field1034.method2395(16218, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 585)
    private final void method512(int arg0) {
        field1018++;
        if (this.field1038 == null) {
            return;
        }
        try {
            this.field1036.field2295 = arg0;
            this.field1036.method1055(6, 109);
            this.field1036.method1018((byte) 101, 3);
            this.field1038.method1532(4, 0, 63, this.field1036.field2260);
        } catch (IOException var5) {
            try {
                this.field1038.method1527(92);
            } catch (Exception var4) {
            }
            this.field1041 = -2;
            this.field1038 = null;
            this.field1042++;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(Z)I", line = 633)
    public final int method513(boolean arg0) {
        if (arg0) {
            return 115;
        } else {
            field1029++;
            return this.field1014.method2399(-2) + this.field1033.method2399(-2);
        }
    }
}
