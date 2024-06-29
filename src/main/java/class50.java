import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class50 {

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "Ltb;")
    private class69 field901 = new class69();

    @OriginalMember(owner = "client!ej", name = "x", descriptor = "Ltb;")
    private class69 field922 = new class69();

    @OriginalMember(owner = "client!ej", name = "y", descriptor = "Ltb;")
    private class69 field923 = new class69();

    @OriginalMember(owner = "client!ej", name = "z", descriptor = "Ltb;")
    private class69 field924 = new class69();

    @OriginalMember(owner = "client!ej", name = "D", descriptor = "Lgd;")
    private class74 field927 = new class74(4);

    @OriginalMember(owner = "client!ej", name = "G", descriptor = "I")
    public volatile int field930 = 0;

    @OriginalMember(owner = "client!ej", name = "F", descriptor = "I")
    public volatile int field929 = 0;

    @OriginalMember(owner = "client!ej", name = "H", descriptor = "B")
    private byte field931 = 0;

    @OriginalMember(owner = "client!ej", name = "I", descriptor = "Lgd;")
    private class74 field932 = new class74(8);

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
    public static int field900 = 0;

    @OriginalMember(owner = "client!ej", name = "r", descriptor = "Lid;")
    public static class149 field916 = class60.method382("lila:", (byte) 102);

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "[I")
    public static int[] field902 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ej", name = "k", descriptor = "Lid;")
    public static class149 field909 = class60.method382(": ", (byte) 47);

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!ej", name = "i", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ej", name = "j", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ej", name = "l", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ej", name = "m", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ej", name = "n", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ej", name = "o", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ej", name = "q", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ej", name = "s", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ej", name = "t", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ej", name = "u", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ej", name = "v", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ej", name = "w", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ej", name = "C", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "client!ej", name = "E", descriptor = "J")
    private long field928;

    @OriginalMember(owner = "client!ej", name = "J", descriptor = "Lfd;")
    private class122 field933;

    @OriginalMember(owner = "client!ej", name = "p", descriptor = "Lag;")
    public static class184 field914;

    @OriginalMember(owner = "client!ej", name = "B", descriptor = "Lse;")
    private class205 field925;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)I")
    private final int method319(int arg0) {
        field917++;
        if (arg0 != 2) {
            this.field932 = null;
        }
        return this.field923.method428(-19462) + this.field924.method428(-19462);
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BZ)V")
    private final void method320(byte arg0, boolean arg1) {
        field906++;
        if (this.field925 == null) {
            return;
        }
        try {
            this.field927.field1340 = 0;
            if (arg0 == -10) {
                this.field927.method494((byte) 4, arg1 ? 2 : 3);
                this.field927.method488(0, -105);
                this.field925.method1400(0, this.field927.field1321, 4, (byte) 116);
            }
        } catch (IOException var4) {
            try {
                this.field925.method1398((byte) 127);
            } catch (Exception var3) {
            }
            this.field929 = -2;
            this.field930++;
            this.field925 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
    public static void method321(int arg0) {
        if (arg0 > -46) {
            method323(-5);
        }
        field909 = null;
        field916 = null;
        field914 = null;
        field902 = null;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)V")
    private final void method322(int arg0) {
        field907++;
        if (arg0 != -2) {
            this.field924 = null;
        }
        if (this.field925 == null) {
            return;
        }
        try {
            this.field927.field1340 = 0;
            this.field927.method494((byte) 4, 6);
            this.field927.method488(3, 107);
            this.field925.method1400(0, this.field927.field1321, 4, (byte) 77);
        } catch (IOException var3) {
            try {
                this.field925.method1398((byte) -34);
            } catch (Exception var2) {
            }
            this.field929 = -2;
            this.field930++;
            this.field925 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "(I)V")
    public static final void method323(int arg0) {
        field915++;
        if (arg0 == 0 && class86.field1570 != null) {
            class98 var1 = class86.field1570;
            synchronized (class86.field1570) {
                class86.field1570 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)V")
    public final void method324(boolean arg0) {
        field913++;
        if (this.field925 == null) {
            return;
        }
        if (!arg0) {
            this.field933 = null;
        }
        try {
            this.field927.field1340 = 0;
            this.field927.method494((byte) 4, 7);
            this.field927.method488(0, 98);
            this.field925.method1400(0, this.field927.field1321, 4, (byte) 72);
        } catch (IOException var3) {
            try {
                this.field925.method1398((byte) -103);
            } catch (Exception var2) {
            }
            this.field929 = -2;
            this.field930++;
            this.field925 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(ZBLse;)V")
    public final void method325(boolean arg0, byte arg1, class205 arg2) {
        field910++;
        if (arg1 < 70) {
            this.method322(-69);
        }
        if (this.field925 != null) {
            try {
                this.field925.method1398((byte) -37);
            } catch (Exception var8) {
            }
            this.field925 = null;
        }
        this.field925 = arg2;
        this.method322(-2);
        this.method320((byte) -10, arg0);
        this.field932.field1340 = 0;
        this.field933 = null;
        while (true) {
            class122 var4 = (class122) this.field922.method427((byte) -115);
            if (var4 == null) {
                while (true) {
                    class122 var5 = (class122) this.field924.method427((byte) 7);
                    if (var5 == null) {
                        if (this.field931 != 0) {
                            try {
                                this.field927.field1340 = 0;
                                this.field927.method494((byte) 4, 4);
                                this.field927.method494((byte) 4, this.field931);
                                this.field927.method518(16711680, 0);
                                this.field925.method1400(0, this.field927.field1321, 4, (byte) 65);
                            } catch (IOException var7) {
                                try {
                                    this.field925.method1398((byte) 120);
                                } catch (Exception var6) {
                                }
                                this.field929 = -2;
                                this.field930++;
                                this.field925 = null;
                            }
                        }
                        this.field926 = 0;
                        this.field928 = class81.method608(19644);
                        return;
                    }
                    this.field923.method433(var5, -225);
                }
            }
            this.field901.method433(var4, -225);
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)Z")
    public final boolean method326(byte arg0) {
        if (arg0 <= 4) {
            this.method328(-40);
        }
        field899++;
        return this.method327((byte) -127) >= 20;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(B)I")
    public final int method327(byte arg0) {
        int var2 = -69 % ((arg0 + 68) / 35);
        field911++;
        return this.field901.method428(-19462) + this.field922.method428(-19462);
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)Z")
    public final boolean method328(int arg0) {
        field919++;
        if (arg0 <= 7) {
            return false;
        } else {
            return this.method319(2) >= 20;
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(II)V")
    public static final void method329(int arg0, int arg1) {
        field912++;
        if (class107.field1845 == arg1) {
            return;
        }
        if (class107.field1845 == 0) {
            class134.method940(255);
        }
        if (arg0 != -11461) {
            method329(26, -77);
        }
        if (arg1 == 40) {
            class255.method1758(0);
        }
        if (arg1 != 40 && class10.field144 != null) {
            class10.field144.method1398((byte) -103);
            class10.field144 = null;
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 25 || arg1 == 28) {
            class57.field1003 = 0;
            class277.field4946 = 0;
            class111.field1918 = 1;
            class10.field147 = 1;
            class175.field3213 = 0;
            class285.method1959(true, (byte) -110);
        }
        if (arg1 == 25 || arg1 == 10) {
            class69.method432(0);
        }
        if (arg1 == 5) {
            class214.method1448(class270.field4864, (byte) -62);
        } else {
            class269.method1871((byte) -88);
        }
        boolean var3 = class107.field1845 == 5 || class107.field1845 == 10 || class107.field1845 == 28;
        if (var2 != var3) {
            if (var2) {
                class133.field2425 = class218.field3855;
                if (class44.field667 == 0) {
                    class154.method1090(2, (byte) -83);
                } else {
                    class240.method1654(255, 2, class230.field4010, false, 12672, class218.field3855, 0);
                }
                class271.field4868.method320((byte) -10, false);
            } else {
                class154.method1090(2, (byte) 72);
                class271.field4868.method320((byte) -10, true);
            }
        }
        class107.field1845 = arg1;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIIBZ)Lfd;")
    public final class122 method330(byte arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field908++;
        long var6 = (long) ((arg2 << 16) + arg1);
        class122 var8 = new class122();
        var8.field3174 = var6;
        if (arg3 >= -22) {
            field902 = null;
        }
        var8.field988 = arg4;
        var8.field2143 = arg0;
        if (arg4) {
            if (this.method327((byte) 8) >= 20) {
                throw new RuntimeException();
            }
            this.field901.method433(var8, -225);
        } else if (this.method319(2) < 20) {
            this.field923.method433(var8, -225);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(I)V")
    public final void method331(int arg0) {
        if (this.field925 != null) {
            this.field925.method1394(3);
        }
        field903++;
        if (arg0 >= -110) {
            this.field922 = null;
        }
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(B)V")
    public final void method332(byte arg0) {
        field921++;
        try {
            this.field925.method1398((byte) 127);
        } catch (Exception var3) {
        }
        this.field931 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field930++;
        int var2 = 80 / ((arg0 - 5) / 60);
        this.field925 = null;
        this.field929 = -1;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(Z)V")
    public final void method333(boolean arg0) {
        field905++;
        if (this.field925 != null) {
            this.field925.method1398((byte) 121);
        }
        if (!arg0) {
            this.field931 = -86;
        }
    }

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "(I)Z")
    public final boolean method334(int arg0) {
        if (this.field925 != null) {
            long var2 = class81.method608(19644);
            int var4 = (int) (var2 - this.field928);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field928 = var2;
            this.field926 += var4;
            if (this.field926 > 30000) {
                try {
                    this.field925.method1398((byte) 114);
                } catch (Exception var27) {
                }
                this.field925 = null;
            }
        }
        field920++;
        if (this.field925 == null) {
            return this.method327((byte) -109) == 0 && this.method319(arg0 ^ 0x2) == 0;
        }
        try {
            this.field925.method1393(5000);
            for (class122 var5 = (class122) this.field901.method426(104); var5 != null; var5 = (class122) this.field901.method438(true)) {
                this.field927.field1340 = 0;
                this.field927.method494((byte) 4, 1);
                this.field927.method488((int) var5.field3174, 117);
                this.field925.method1400(0, this.field927.field1321, 4, (byte) 104);
                this.field922.method433(var5, -225);
            }
            for (class122 var6 = (class122) this.field923.method426(104); var6 != null; var6 = (class122) this.field923.method438(true)) {
                this.field927.field1340 = 0;
                this.field927.method494((byte) 4, 0);
                this.field927.method488((int) var6.field3174, -77);
                this.field925.method1400(0, this.field927.field1321, 4, (byte) 79);
                this.field924.method433(var6, -225);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field925.method1392(1);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field926 = 0;
                byte var9 = 0;
                if (this.field933 == null) {
                    var9 = 8;
                } else if (this.field933.field2151 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field932.field1340;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field925.method1395((byte) -115, this.field932.field1321, this.field932.field1340, var10);
                    if (this.field931 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field932.field1321[this.field932.field1340 + var11] = (byte) class85.method629(this.field932.field1321[this.field932.field1340 + var11], this.field931);
                        }
                    }
                    this.field932.field1340 += var10;
                    if (this.field932.field1340 >= var9) {
                        if (this.field933 == null) {
                            this.field932.field1340 = 0;
                            int var12 = this.field932.method489((byte) -83);
                            int var13 = this.field932.method485(-2386);
                            int var14 = this.field932.method489((byte) -49);
                            int var15 = this.field932.method498((byte) 127);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class122 var21;
                            if (var17) {
                                for (var21 = (class122) this.field924.method426(104); var21 != null && var21.field3174 != var18; var21 = (class122) this.field924.method438(true)) {
                                }
                            } else {
                                for (var21 = (class122) this.field922.method426(104); var21 != null && var21.field3174 != var18; var21 = (class122) this.field922.method438(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field933 = var21;
                            this.field933.field2146 = new class74(var15 + var22 + this.field933.field2143);
                            this.field933.field2146.method494((byte) 4, var16);
                            this.field933.field2146.method517(var15, 122);
                            this.field932.field1340 = 0;
                            this.field933.field2151 = 8;
                        } else if (this.field933.field2151 != 0) {
                            throw new IOException();
                        } else if (this.field932.field1321[0] == -1) {
                            this.field933.field2151 = 1;
                            this.field932.field1340 = 0;
                        } else {
                            this.field933 = null;
                        }
                    }
                } else {
                    int var23 = this.field933.field2146.field1321.length - this.field933.field2143;
                    int var24 = 512 - this.field933.field2151;
                    if ((var23 - this.field933.field2146.field1340) < var24) {
                        var24 = var23 - this.field933.field2146.field1340;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field925.method1395((byte) -115, this.field933.field2146.field1321, this.field933.field2146.field1340, var24);
                    if (this.field931 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field933.field2146.field1321[this.field933.field2146.field1340 + var25] = (byte) class85.method629(this.field933.field2146.field1321[this.field933.field2146.field1340 + var25], this.field931);
                        }
                    }
                    this.field933.field2151 += var24;
                    this.field933.field2146.field1340 += var24;
                    if (this.field933.field2146.field1340 == var23) {
                        this.field933.method1230(24120);
                        this.field933.field987 = false;
                        this.field933 = null;
                    } else if (this.field933.field2151 == 512) {
                        this.field933.field2151 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field925.method1398((byte) 126);
            } catch (Exception var26) {
            }
            this.field929 = -2;
            this.field930++;
            this.field925 = null;
            return this.method327((byte) -108) == 0 && this.method319(2) == 0;
        }
    }
}
