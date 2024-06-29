import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class226 {

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lvt;")
    private class516 field3888 = new class516();

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Lvt;")
    private class516 field3900 = new class516();

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "Lvt;")
    private class516 field3907 = new class516();

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "Lvt;")
    private class516 field3908 = new class516();

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "Lia;")
    private class23 field3912 = new class23(4);

    @OriginalMember(owner = "client!lq", name = "C", descriptor = "B")
    private byte field3913 = 0;

    @OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
    public volatile int field3916 = 0;

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public volatile int field3915 = 0;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "Lia;")
    private class23 field3914 = new class23(8);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Llo;")
    public static class306 field3887 = new class306("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field3891 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    private int field3909;

    @OriginalMember(owner = "client!lq", name = "A", descriptor = "J")
    private long field3911;

    @OriginalMember(owner = "client!lq", name = "G", descriptor = "Lwk;")
    private class171 field3917;

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "Lst;")
    private class473 field3910;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "Lqs;")
    public static class496 field3886;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Lqs;")
    public static class496 field3889;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "[I")
    public static int[] field3894;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[I")
    public static int[] field3906;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V", line = 3)
    private final void method1552(byte arg0) {
        if (arg0 != 103) {
            this.field3911 = -35L;
        }
        field3904++;
        if (this.field3910 == null) {
            return;
        }
        try {
            this.field3912.field301 = 0;
            this.field3912.method163(6, (byte) 49);
            this.field3912.method174(-96, 3);
            this.field3910.method2795(0, 4, (byte) 14, this.field3912.field302);
        } catch (IOException var3) {
            try {
                this.field3910.method2804(true);
            } catch (Exception var2) {
            }
            this.field3915 = -2;
            this.field3910 = null;
            this.field3916++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z", line = 31)
    public final boolean method1553(byte arg0) {
        if (this.field3910 != null) {
            long var2 = class19.method91((byte) 96);
            int var4 = (int) (var2 - this.field3911);
            this.field3911 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3909 += var4;
            if (this.field3909 > 30000) {
                try {
                    this.field3910.method2804(true);
                } catch (Exception var27) {
                }
                this.field3910 = null;
            }
        }
        field3901++;
        if (this.field3910 == null) {
            return this.method1556((byte) -100) == 0 && this.method1558(8) == 0;
        }
        try {
            this.field3910.method2796((byte) 103);
            for (class171 var5 = (class171) this.field3888.method3056(arg0 + 102); var5 != null; var5 = (class171) this.field3888.method3053(-77)) {
                this.field3912.field301 = 0;
                this.field3912.method163(1, (byte) 49);
                this.field3912.method174(-74, (int) var5.field4496);
                this.field3910.method2795(0, 4, (byte) 14, this.field3912.field302);
                this.field3900.method3050(var5, arg0 ^ 0x1B);
            }
            if (arg0 != 25) {
                this.method1552((byte) 88);
            }
            for (class171 var6 = (class171) this.field3907.method3056(127); var6 != null; var6 = (class171) this.field3907.method3053(-88)) {
                this.field3912.field301 = 0;
                this.field3912.method163(0, (byte) 49);
                this.field3912.method174(-127, (int) var6.field4496);
                this.field3910.method2795(0, 4, (byte) 14, this.field3912.field302);
                this.field3908.method3050(var6, 2);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3910.method2803((byte) -125);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3909 = 0;
                byte var9 = 0;
                if (this.field3917 == null) {
                    var9 = 8;
                } else if (this.field3917.field2735 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3917.field2734.field302.length - this.field3917.field2741;
                    int var11 = 512 - this.field3917.field2735;
                    if ((var10 - this.field3917.field2734.field301) < var11) {
                        var11 = var10 - this.field3917.field2734.field301;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3910.method2794(118, this.field3917.field2734.field301, this.field3917.field2734.field302, var11);
                    if (this.field3913 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3917.field2734.field302[this.field3917.field2734.field301 + var12] = (byte) class53.method369(this.field3917.field2734.field302[this.field3917.field2734.field301 + var12], this.field3913);
                        }
                    }
                    this.field3917.field2735 += var11;
                    this.field3917.field2734.field301 += var11;
                    if (this.field3917.field2734.field301 == var10) {
                        this.field3917.method1799((byte) 114);
                        this.field3917.field6303 = false;
                        this.field3917 = null;
                    } else if (this.field3917.field2735 == 512) {
                        this.field3917.field2735 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3914.field301;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field3910.method2794(arg0 ^ 0x75, this.field3914.field301, this.field3914.field302, var13);
                    if (this.field3913 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3914.field302[this.field3914.field301 + var14] = (byte) class53.method369(this.field3914.field302[this.field3914.field301 + var14], this.field3913);
                        }
                    }
                    this.field3914.field301 += var13;
                    if (this.field3914.field301 >= var9) {
                        if (this.field3917 == null) {
                            this.field3914.field301 = 0;
                            int var15 = this.field3914.method126((byte) -122);
                            int var16 = this.field3914.method132(51);
                            int var17 = this.field3914.method126((byte) -100);
                            int var18 = this.field3914.method143(arg0 ^ 0xFFFFF37B);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class171 var24;
                            if (var20) {
                                for (var24 = (class171) this.field3908.method3056(126); var24 != null && var24.field4496 != var21; var24 = (class171) this.field3908.method3053(59)) {
                                }
                            } else {
                                for (var24 = (class171) this.field3900.method3056(126); var24 != null && var24.field4496 != var21; var24 = (class171) this.field3900.method3053(-111)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3917 = var24;
                            this.field3917.field2734 = new class23(var18 + var25 + this.field3917.field2741);
                            this.field3917.field2734.method163(var19, (byte) 49);
                            this.field3917.field2734.method152(var18, (byte) -38);
                            this.field3917.field2735 = 8;
                            this.field3914.field301 = 0;
                        } else if (this.field3917.field2735 != 0) {
                            throw new IOException();
                        } else if (this.field3914.field302[0] == -1) {
                            this.field3917.field2735 = 1;
                            this.field3914.field301 = 0;
                        } else {
                            this.field3917 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3910.method2804(true);
            } catch (Exception var26) {
            }
            this.field3916++;
            this.field3915 = -2;
            this.field3910 = null;
            return this.method1556((byte) -100) == 0 && this.method1558(8) == 0;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lec;IZ)V", line = 310)
    public static final void method1554(class68 arg0, int arg1, boolean arg2) {
        field3893++;
        if (arg1 != -12295) {
            field3894 = null;
        }
        int var3 = arg0.field1048 == 0 ? arg0.field1009 : arg0.field1048;
        int var4 = arg0.field1037 == 0 ? arg0.field1081 : arg0.field1037;
        class156.method1094(class508.field7389[arg0.field1059 >> 16], arg2, var3, -20837, arg0.field1059, var4);
        if (arg0.field997 != null) {
            class156.method1094(arg0.field997, arg2, var3, arg1 ^ 0x6162, arg0.field1059, var4);
        }
        class52 var5 = (class52) class259.field4346.method2516((long) arg0.field1059, -1);
        if (var5 != null) {
            class239.method1639(var3, 28248, arg2, var4, var5.field841);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZIIB)Lwk;", line = 336)
    public final class171 method1555(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field3897++;
        long var6 = (long) ((arg3 << 16) + arg0);
        class171 var8 = new class171();
        var8.field6302 = arg1;
        var8.field2741 = arg4;
        var8.field4496 = var6;
        if (arg1) {
            if (this.method1556((byte) -100) >= 20) {
                throw new RuntimeException();
            }
            this.field3888.method3050(var8, arg2 - 556956782);
        } else if (this.method1558(8) < 20) {
            this.field3907.method3050(var8, 2);
        } else {
            throw new RuntimeException();
        }
        return arg2 == 556956784 ? var8 : null;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I", line = 378)
    public final int method1556(byte arg0) {
        field3896++;
        return arg0 == -100 ? this.field3888.method3048(-106) + this.field3900.method3048(-68) : -87;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lst;ZI)V", line = 390)
    public final void method1557(class473 arg0, boolean arg1, int arg2) {
        field3890++;
        if (this.field3910 != null) {
            try {
                this.field3910.method2804(true);
            } catch (Exception var8) {
            }
            this.field3910 = null;
        }
        if (arg2 > -87) {
            method1554(null, 97, false);
        }
        this.field3910 = arg0;
        this.method1552((byte) 103);
        this.method1560(arg1, 4);
        this.field3914.field301 = 0;
        this.field3917 = null;
        while (true) {
            class171 var4 = (class171) this.field3900.method3054(-29948);
            if (var4 == null) {
                while (true) {
                    class171 var5 = (class171) this.field3908.method3054(-29948);
                    if (var5 == null) {
                        if (this.field3913 != 0) {
                            try {
                                this.field3912.field301 = 0;
                                this.field3912.method163(4, (byte) 49);
                                this.field3912.method163(this.field3913, (byte) 49);
                                this.field3912.method182(0, 114);
                                this.field3910.method2795(0, 4, (byte) 14, this.field3912.field302);
                            } catch (IOException var7) {
                                try {
                                    this.field3910.method2804(true);
                                } catch (Exception var6) {
                                }
                                this.field3916++;
                                this.field3910 = null;
                                this.field3915 = -2;
                            }
                        }
                        this.field3909 = 0;
                        this.field3911 = class19.method91((byte) 95);
                        return;
                    }
                    this.field3907.method3050(var5, 2);
                }
            }
            this.field3888.method3050(var4, 2);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I", line = 466)
    private final int method1558(int arg0) {
        if (arg0 == 8) {
            field3905++;
            return this.field3907.method3048(arg0 ^ 0xFFFFFFCD) + this.field3908.method3048(-98);
        } else {
            return 62;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V", line = 480)
    public final void method1559(int arg0) {
        field3898++;
        if (arg0 != -29619) {
            this.field3900 = null;
        }
        if (this.field3910 != null) {
            this.field3910.method2797(5000);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZI)V", line = 497)
    public final void method1560(boolean arg0, int arg1) {
        field3892++;
        if (this.field3910 == null) {
            return;
        }
        try {
            this.field3912.field301 = 0;
            this.field3912.method163(arg0 ? 2 : 3, (byte) 49);
            this.field3912.method174(arg1 - 78, 0);
            this.field3910.method2795(0, arg1, (byte) 14, this.field3912.field302);
        } catch (IOException var4) {
            try {
                this.field3910.method2804(true);
            } catch (Exception var3) {
            }
            this.field3915 = -2;
            this.field3910 = null;
            this.field3916++;
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V", line = 522)
    public final void method1561(int arg0) {
        field3895++;
        if (this.field3910 == null) {
            return;
        }
        try {
            this.field3912.field301 = 0;
            this.field3912.method163(7, (byte) 49);
            if (arg0 < -68) {
                this.field3912.method174(-77, 0);
                this.field3910.method2795(0, 4, (byte) 14, this.field3912.field302);
            }
        } catch (IOException var3) {
            try {
                this.field3910.method2804(true);
            } catch (Exception var2) {
            }
            this.field3916++;
            this.field3915 = -2;
            this.field3910 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z", line = 549)
    public final boolean method1562(int arg0) {
        if (arg0 != 20) {
            this.method1556((byte) 28);
        }
        field3903++;
        return this.method1556((byte) -100) >= 20;
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)Z", line = 560)
    public final boolean method1563(int arg0) {
        field3899++;
        if (arg0 != 0) {
            this.method1556((byte) 18);
        }
        return this.method1558(8) >= 20;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V", line = 578)
    public final void method1564(int arg0) {
        if (this.field3910 != null) {
            this.field3910.method2804(true);
        }
        field3885++;
        if (arg0 != -2) {
            this.method1560(false, -126);
        }
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)V", line = 593)
    public final void method1565(int arg0) {
        try {
            this.field3910.method2804(true);
        } catch (Exception var2) {
        }
        field3902++;
        this.field3916++;
        this.field3910 = null;
        this.field3915 = -1;
        this.field3913 = (byte) ((int) ((double) arg0 + Math.random() * 255.0D));
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V", line = 608)
    public static void method1566(boolean arg0) {
        field3894 = null;
        field3886 = null;
        field3887 = null;
        field3906 = null;
        field3889 = null;
        if (!arg0) {
            method1566(false);
        }
    }
}
