import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class406 {

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "Lnk;")
    private class206 field5906 = new class206();

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lnk;")
    private class206 field5911 = new class206();

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lnk;")
    private class206 field5916 = new class206();

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Lnk;")
    private class206 field5919 = new class206();

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Lec;")
    private class37 field5921 = new class37(4);

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public volatile int field5926 = 0;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public volatile int field5925 = 0;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "B")
    private byte field5927 = 0;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lec;")
    private class37 field5924 = new class37(8);

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field5909 = 0;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field5917;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    private int field5923;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "J")
    private long field5922;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "Lak;")
    private class219 field5920;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "Lma;")
    private class306 field5928;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BZLak;)V", line = 3)
    public final void method2559(byte arg0, boolean arg1, class219 arg2) {
        if (this.field5920 != null) {
            try {
                this.field5920.method1654(-21013);
            } catch (Exception var8) {
            }
            this.field5920 = null;
        }
        field5917++;
        this.field5920 = arg2;
        this.method2565(4);
        this.method2567(420237872, arg1);
        if (arg0 != -28) {
            return;
        }
        this.field5928 = null;
        this.field5924.field565 = 0;
        while (true) {
            class306 var4 = (class306) this.field5911.method1558(-2);
            if (var4 == null) {
                while (true) {
                    class306 var5 = (class306) this.field5919.method1558(arg0 ^ 0x1A);
                    if (var5 == null) {
                        if (this.field5927 != 0) {
                            try {
                                this.field5921.field565 = 0;
                                this.field5921.method267(4, false);
                                this.field5921.method267(this.field5927, false);
                                this.field5921.method324(0, arg0 - 72);
                                this.field5920.method1653(this.field5921.field578, arg0 ^ 0xFFFFFFE7, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field5920.method1654(arg0 ^ 0x520F);
                                } catch (Exception var6) {
                                }
                                this.field5925 = -2;
                                this.field5926++;
                                this.field5920 = null;
                            }
                        }
                        this.field5923 = 0;
                        this.field5922 = class10.method63(-21149);
                        return;
                    }
                    this.field5916.method1564((byte) 106, var5);
                }
            }
            this.field5906.method1564((byte) 106, var4);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Z", line = 73)
    public final boolean method2560(boolean arg0) {
        if (arg0) {
            field5915++;
            return this.method2562(4) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)V", line = 88)
    public final void method2561(boolean arg0) {
        field5910++;
        if (arg0) {
            this.method2563(false);
        }
        if (this.field5920 != null) {
            this.field5920.method1657((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I", line = 102)
    public final int method2562(int arg0) {
        if (arg0 != 4) {
            this.method2561(false);
        }
        field5907++;
        return this.field5906.method1559((byte) 95) + this.field5911.method1559((byte) 95);
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)Z", line = 116)
    public final boolean method2563(boolean arg0) {
        field5913++;
        if (!arg0) {
            this.field5920 = null;
        }
        return this.method2564((byte) 97) >= 20;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)I", line = 131)
    private final int method2564(byte arg0) {
        if (arg0 <= 76) {
            this.field5916 = null;
        }
        field5901++;
        return this.field5916.method1559((byte) 95) + this.field5919.method1559((byte) 95);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 144)
    private final void method2565(int arg0) {
        field5900++;
        if (this.field5920 == null) {
            return;
        }
        try {
            this.field5921.field565 = 0;
            this.field5921.method267(6, false);
            this.field5921.method308(3, (byte) 79);
            this.field5920.method1653(this.field5921.field578, 3, arg0, 0);
        } catch (IOException var3) {
            try {
                this.field5920.method1654(-21013);
            } catch (Exception var2) {
            }
            this.field5925 = -2;
            this.field5926++;
            this.field5920 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V", line = 170)
    public final void method2566(byte arg0) {
        field5912++;
        if (this.field5920 == null) {
            return;
        }
        try {
            this.field5921.field565 = 0;
            this.field5921.method267(7, false);
            this.field5921.method308(0, (byte) 117);
            if (arg0 != -13) {
                this.method2568(-31);
            }
            this.field5920.method1653(this.field5921.field578, 3, 4, 0);
        } catch (IOException var3) {
            try {
                this.field5920.method1654(arg0 ^ 0x5218);
            } catch (Exception var2) {
            }
            this.field5925 = -2;
            this.field5920 = null;
            this.field5926++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V", line = 203)
    public final void method2567(int arg0, boolean arg1) {
        if (arg0 != 420237872) {
            return;
        }
        field5905++;
        if (this.field5920 == null) {
            return;
        }
        try {
            this.field5921.field565 = 0;
            this.field5921.method267(arg1 ? 2 : 3, false);
            this.field5921.method308(0, (byte) 89);
            this.field5920.method1653(this.field5921.field578, 3, 4, 0);
        } catch (IOException var4) {
            try {
                this.field5920.method1654(-21013);
            } catch (Exception var3) {
            }
            this.field5920 = null;
            this.field5925 = -2;
            this.field5926++;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V", line = 231)
    public final void method2568(int arg0) {
        field5904++;
        if (arg0 == 30000 && this.field5920 != null) {
            this.field5920.method1654(-21013);
        }
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)Z", line = 245)
    public final boolean method2569(int arg0) {
        field5908++;
        if (this.field5920 != null) {
            long var2 = class10.method63(-21149);
            int var4 = (int) (var2 - this.field5922);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5922 = var2;
            this.field5923 += var4;
            if (this.field5923 > 30000) {
                try {
                    this.field5920.method1654(-21013);
                } catch (Exception var27) {
                }
                this.field5920 = null;
            }
        }
        if (this.field5920 == null) {
            return this.method2562(4) == 0 && this.method2564((byte) 115) == 0;
        }
        try {
            if (arg0 >= -33) {
                return true;
            }
            this.field5920.method1664(2);
            for (class306 var5 = (class306) this.field5906.method1565(1); var5 != null; var5 = (class306) this.field5906.method1562(-4)) {
                this.field5921.field565 = 0;
                this.field5921.method267(1, false);
                this.field5921.method308((int) var5.field2671, (byte) 74);
                this.field5920.method1653(this.field5921.field578, 3, 4, 0);
                this.field5911.method1564((byte) 106, var5);
            }
            for (class306 var6 = (class306) this.field5916.method1565(1); var6 != null; var6 = (class306) this.field5916.method1562(-4)) {
                this.field5921.field565 = 0;
                this.field5921.method267(0, false);
                this.field5921.method308((int) var6.field2671, (byte) 54);
                this.field5920.method1653(this.field5921.field578, 3, 4, 0);
                this.field5919.method1564((byte) 106, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5920.method1655(-10561);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5923 = 0;
                byte var9 = 0;
                if (this.field5928 == null) {
                    var9 = 8;
                } else if (this.field5928.field4474 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5924.field565;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field5920.method1659(-126, this.field5924.field578, var10, this.field5924.field565);
                    if (this.field5927 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5924.field578[this.field5924.field565 + var11] = (byte) class277.method1976(this.field5924.field578[this.field5924.field565 + var11], this.field5927);
                        }
                    }
                    this.field5924.field565 += var10;
                    if (var9 <= this.field5924.field565) {
                        if (this.field5928 == null) {
                            this.field5924.field565 = 0;
                            int var12 = this.field5924.method271((byte) 100);
                            int var13 = this.field5924.method320((byte) -87);
                            int var14 = this.field5924.method271((byte) 106);
                            int var15 = this.field5924.method278(-21);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class306 var21;
                            if (var17) {
                                for (var21 = (class306) this.field5919.method1565(1); var21 != null && var21.field2671 != var18; var21 = (class306) this.field5919.method1562(-4)) {
                                }
                            } else {
                                for (var21 = (class306) this.field5911.method1565(1); var21 != null && var21.field2671 != var18; var21 = (class306) this.field5911.method1562(-4)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5928 = var21;
                            this.field5928.field4465 = new class37(var15 + var22 + this.field5928.field4470);
                            this.field5928.field4465.method267(var16, false);
                            this.field5928.field4465.method275(var15, 1414495172);
                            this.field5924.field565 = 0;
                            this.field5928.field4474 = 8;
                        } else if (this.field5928.field4474 != 0) {
                            throw new IOException();
                        } else if (this.field5924.field578[0] == -1) {
                            this.field5924.field565 = 0;
                            this.field5928.field4474 = 1;
                        } else {
                            this.field5928 = null;
                        }
                    }
                } else {
                    int var23 = this.field5928.field4465.field578.length - this.field5928.field4470;
                    int var24 = 512 - this.field5928.field4474;
                    if (var24 > (var23 - this.field5928.field4465.field565)) {
                        var24 = var23 - this.field5928.field4465.field565;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field5920.method1659(120, this.field5928.field4465.field578, var24, this.field5928.field4465.field565);
                    if (this.field5927 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5928.field4465.field578[this.field5928.field4465.field565 + var25] = (byte) class277.method1976(this.field5928.field4465.field578[this.field5928.field4465.field565 + var25], this.field5927);
                        }
                    }
                    this.field5928.field4465.field565 += var24;
                    this.field5928.field4474 += var24;
                    if (this.field5928.field4465.field565 == var23) {
                        this.field5928.method1398(110);
                        this.field5928.field5053 = false;
                        this.field5928 = null;
                    } else if (this.field5928.field4474 == 512) {
                        this.field5928.field4474 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5920.method1654(-21013);
            } catch (Exception var26) {
            }
            this.field5920 = null;
            this.field5925 = -2;
            this.field5926++;
            return this.method2562(4) == 0 && this.method2564((byte) 97) == 0;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)V", line = 530)
    public final void method2570(int arg0) {
        field5902++;
        try {
            this.field5920.method1654(-21013);
        } catch (Exception var2) {
        }
        if (arg0 != 9252) {
            this.field5924 = null;
        }
        this.field5927 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5925 = -1;
        this.field5920 = null;
        this.field5926++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BIZIZ)Lma;", line = 548)
    public final class306 method2571(byte arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field5918++;
        if (arg4) {
            this.method2566((byte) -49);
        }
        long var6 = (long) ((arg1 << 16) + arg3);
        class306 var8 = new class306();
        var8.field4470 = arg0;
        var8.field2671 = var6;
        var8.field5052 = arg2;
        if (arg2) {
            if (this.method2562(4) >= 20) {
                throw new RuntimeException();
            }
            this.field5906.method1564((byte) 106, var8);
        } else if (this.method2564((byte) 80) < 20) {
            this.field5916.method1564((byte) 106, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }
}
