import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class393 {

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lcn;")
    private class356 field5753 = new class356();

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lcn;")
    private class356 field5758 = new class356();

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "Lcn;")
    private class356 field5761 = new class356();

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "Lcn;")
    private class356 field5762 = new class356();

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "Lsi;")
    private class391 field5763 = new class391(4);

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public volatile int field5767 = 0;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "B")
    private byte field5769 = 0;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public volatile int field5770 = 0;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "Lsi;")
    private class391 field5768 = new class391(8);

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5745 = 0;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "[Ltt;")
    public static class61[] field5757 = new class61[0];

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field5741;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5743;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5747;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5748;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5749;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5750;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5751;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    private int field5765;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "J")
    private long field5766;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "Lbw;")
    private class483 field5764;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "Lfg;")
    private class84 field5771;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    private final void method2367(boolean arg0) {
        field5747++;
        if (this.field5764 == null) {
            return;
        }
        try {
            this.field5763.field5719 = 0;
            this.field5763.method2302(-4, 6);
            if (arg0) {
                this.field5763.method2326((byte) 127, 3);
                this.field5764.method2835((byte) 86, 4, this.field5763.field5678, 0);
            }
        } catch (IOException var3) {
            try {
                this.field5764.method2839(-20828);
            } catch (Exception var2) {
            }
            this.field5770 = -2;
            this.field5767++;
            this.field5764 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5756++;
        if (arg4 != -1) {
            method2369(126);
        }
        int var7 = arg5 - arg3;
        int var8 = arg3 + arg6;
        for (int var9 = arg6; var9 < var8; var9++) {
            class210.method1300(arg0, class437.field6400[var9], (byte) 106, arg2, arg1);
        }
        int var10 = arg2 - arg3;
        int var11 = arg0 + arg3;
        for (int var12 = arg5; var12 > var7; var12--) {
            class210.method1300(arg0, class437.field6400[var12], (byte) 71, arg2, arg1);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class437.field6400[var13];
            class210.method1300(arg0, var14, (byte) 123, var11, arg1);
            class210.method1300(var10, var14, (byte) 71, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method2369(int arg0) {
        field5757 = null;
        if (arg0 > -110) {
            method2377(-67, false);
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method2370(int arg0) {
        field5749++;
        try {
            this.field5764.method2839(-20828);
        } catch (Exception var2) {
        }
        this.field5764 = null;
        this.field5770 = -1;
        this.field5769 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5767++;
        if (arg0 != 17044) {
            this.method2383(false, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static final void method2371(byte arg0) {
        field5751++;
        if (arg0 < -41) {
            class269.field3717 = new class479();
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
    public final int method2372(int arg0) {
        field5759++;
        return arg0 <= 88 ? 19 : this.field5753.method2129(1) + this.field5758.method2129(1);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
    public final boolean method2373(boolean arg0) {
        field5744++;
        if (this.field5764 != null) {
            long var2 = class246.method1483(5957);
            int var4 = (int) (var2 - this.field5766);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5766 = var2;
            this.field5765 += var4;
            if (this.field5765 > 30000) {
                try {
                    this.field5764.method2839(-20828);
                } catch (Exception var27) {
                }
                this.field5764 = null;
            }
        }
        if (this.field5764 == null) {
            return this.method2372(102) == 0 && this.method2375(100) == 0;
        }
        try {
            this.field5764.method2831((byte) 88);
            for (class84 var5 = (class84) this.field5753.method2130(arg0); var5 != null; var5 = (class84) this.field5753.method2131(true)) {
                this.field5763.field5719 = 0;
                this.field5763.method2302(-4, 1);
                this.field5763.method2326((byte) 66, (int) var5.field115);
                this.field5764.method2835((byte) 124, 4, this.field5763.field5678, 0);
                this.field5758.method2127((byte) -107, var5);
            }
            for (class84 var6 = (class84) this.field5761.method2130(arg0); var6 != null; var6 = (class84) this.field5761.method2131(true)) {
                this.field5763.field5719 = 0;
                this.field5763.method2302(-4, 0);
                this.field5763.method2326((byte) 80, (int) var6.field115);
                this.field5764.method2835((byte) 119, 4, this.field5763.field5678, 0);
                this.field5762.method2127((byte) -110, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field5764.method2842(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field5765 = 0;
                byte var9 = 0;
                if (this.field5771 == null) {
                    var9 = 8;
                } else if (this.field5771.field1248 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field5768.field5719;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field5764.method2833(this.field5768.field5719, this.field5768.field5678, var10, (byte) -116);
                    if (this.field5769 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field5768.field5678[this.field5768.field5719 + var11] = (byte) class36.method216(this.field5768.field5678[this.field5768.field5719 + var11], this.field5769);
                        }
                    }
                    this.field5768.field5719 += var10;
                    if (var9 <= this.field5768.field5719) {
                        if (this.field5771 == null) {
                            this.field5768.field5719 = 0;
                            int var12 = this.field5768.method2348(-2);
                            int var13 = this.field5768.method2353((byte) 72);
                            int var14 = this.field5768.method2348(-2);
                            int var15 = this.field5768.method2361((byte) -56);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class84 var21;
                            if (var17) {
                                for (var21 = (class84) this.field5762.method2130(arg0); var21 != null && var21.field115 != var18; var21 = (class84) this.field5762.method2131(true)) {
                                }
                            } else {
                                for (var21 = (class84) this.field5758.method2130(arg0); var21 != null && var21.field115 != var18; var21 = (class84) this.field5758.method2131(true)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field5771 = var21;
                            this.field5771.field1255 = new class391(var15 + var22 + this.field5771.field1251);
                            this.field5771.field1255.method2302(-4, var16);
                            this.field5771.field1255.method2359(var15, -96);
                            this.field5771.field1248 = 8;
                            this.field5768.field5719 = 0;
                        } else if (this.field5771.field1248 != 0) {
                            throw new IOException();
                        } else if (this.field5768.field5678[0] == -1) {
                            this.field5771.field1248 = 1;
                            this.field5768.field5719 = 0;
                        } else {
                            this.field5771 = null;
                        }
                    }
                } else {
                    int var23 = this.field5771.field1255.field5678.length - this.field5771.field1251;
                    int var24 = 512 - this.field5771.field1248;
                    if (var23 - this.field5771.field1255.field5719 < var24) {
                        var24 = var23 - this.field5771.field1255.field5719;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field5764.method2833(this.field5771.field1255.field5719, this.field5771.field1255.field5678, var24, (byte) -121);
                    if (this.field5769 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field5771.field1255.field5678[this.field5771.field1255.field5719 + var25] = (byte) class36.method216(this.field5771.field1255.field5678[this.field5771.field1255.field5719 + var25], this.field5769);
                        }
                    }
                    this.field5771.field1255.field5719 += var24;
                    this.field5771.field1248 += var24;
                    if (this.field5771.field1255.field5719 == var23) {
                        this.field5771.method36(0);
                        this.field5771.field2597 = false;
                        this.field5771 = null;
                    } else if (this.field5771.field1248 == 512) {
                        this.field5771.field1248 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field5764.method2839(-20828);
            } catch (Exception var26) {
            }
            this.field5767++;
            this.field5770 = -2;
            this.field5764 = null;
            return this.method2372(127) == 0 && this.method2375(-32) == 0;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)Z")
    public final boolean method2374(boolean arg0) {
        if (!arg0) {
            this.field5762 = null;
        }
        field5741++;
        return this.method2372(103) >= 20;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
    private final int method2375(int arg0) {
        int var2 = 33 / ((38 - arg0) / 50);
        field5754++;
        return this.field5761.method2129(1) + this.field5762.method2129(1);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public final void method2376(int arg0) {
        field5750++;
        if (this.field5764 == null) {
            return;
        }
        try {
            this.field5763.field5719 = 0;
            this.field5763.method2302(arg0 + arg0, 7);
            this.field5763.method2326((byte) 122, 0);
            this.field5764.method2835((byte) 117, 4, this.field5763.field5678, 0);
        } catch (IOException var3) {
            try {
                this.field5764.method2839(-20828);
            } catch (Exception var2) {
            }
            this.field5767++;
            this.field5770 = -2;
            this.field5764 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZ)V")
    public static final void method2377(int arg0, boolean arg1) {
        field5748++;
        class162 var2 = class442.field6544;
        synchronized (class442.field6544) {
            class442.field6544.method1065((byte) -95, arg0);
            if (!arg1) {
                method2371((byte) 48);
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
    public final boolean method2378(int arg0) {
        if (arg0 == -21) {
            field5743++;
            return this.method2375(-120) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public final void method2379(int arg0) {
        if (this.field5764 != null) {
            this.field5764.method2841((byte) -94);
        }
        if (arg0 != 0) {
            this.method2376(6);
        }
        field5752++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILbw;Z)V")
    public final void method2380(int arg0, class483 arg1, boolean arg2) {
        field5760++;
        if (this.field5764 != null) {
            try {
                this.field5764.method2839(-20828);
            } catch (Exception var8) {
            }
            this.field5764 = null;
        }
        this.field5764 = arg1;
        this.method2367(true);
        this.method2383(arg2, (byte) -94);
        if (arg0 >= -96) {
            this.method2381(71, 33, false, (byte) 84, 9);
        }
        this.field5771 = null;
        this.field5768.field5719 = 0;
        while (true) {
            class84 var4 = (class84) this.field5758.method2128(1339);
            if (var4 == null) {
                while (true) {
                    class84 var5 = (class84) this.field5762.method2128(1339);
                    if (var5 == null) {
                        if (this.field5769 != 0) {
                            try {
                                this.field5763.field5719 = 0;
                                this.field5763.method2302(-4, 4);
                                this.field5763.method2302(-4, this.field5769);
                                this.field5763.method2355(1686288168, 0);
                                this.field5764.method2835((byte) 101, 4, this.field5763.field5678, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field5764.method2839(-20828);
                                } catch (Exception var6) {
                                }
                                this.field5770 = -2;
                                this.field5767++;
                                this.field5764 = null;
                            }
                        }
                        this.field5765 = 0;
                        this.field5766 = class246.method1483(5957);
                        return;
                    }
                    this.field5761.method2127((byte) -98, var5);
                }
            }
            this.field5753.method2127((byte) -115, var4);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZBI)Lfg;")
    public final class84 method2381(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field5746++;
        long var6 = (long) ((arg0 << 16) + arg4);
        class84 var8 = new class84();
        var8.field1251 = arg3;
        var8.field115 = var6;
        if (arg1 != -1) {
            return null;
        }
        var8.field2600 = arg2;
        if (arg2) {
            if (this.method2372(107) >= 20) {
                throw new RuntimeException();
            }
            this.field5753.method2127((byte) -120, var8);
        } else if (this.method2375(-90) < 20) {
            this.field5761.method2127((byte) -120, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
    public final void method2382(byte arg0) {
        field5740++;
        if (this.field5764 != null) {
            this.field5764.method2839(-20828);
        }
        if (arg0 != -79) {
            this.method2372(-43);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
    public final void method2383(boolean arg0, byte arg1) {
        field5755++;
        if (this.field5764 == null) {
            return;
        }
        if (arg1 >= -59) {
            method2368(50, -75, 125, -112, -15, 7, 25);
        }
        try {
            this.field5763.field5719 = 0;
            this.field5763.method2302(-4, arg0 ? 2 : 3);
            this.field5763.method2326((byte) 59, 0);
            this.field5764.method2835((byte) 123, 4, this.field5763.field5678, 0);
        } catch (IOException var4) {
            try {
                this.field5764.method2839(-20828);
            } catch (Exception var3) {
            }
            this.field5767++;
            this.field5770 = -2;
            this.field5764 = null;
        }
    }
}
