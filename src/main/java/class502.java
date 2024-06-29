import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class502 {

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "Lifa;")
    private class487 field6780 = new class487();

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "Lifa;")
    private class487 field6791 = new class487();

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "Lifa;")
    private class487 field6793 = new class487();

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "Lifa;")
    private class487 field6795 = new class487();

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "Ldga;")
    private class138 field6798 = new class138(4);

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "B")
    private byte field6802 = 0;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public volatile int field6800 = 0;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public volatile int field6803 = 0;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "Ldga;")
    private class138 field6801 = new class138(8);

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "S")
    public static short field6773 = 32767;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "[I")
    public static int[] field6790 = new int[13];

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "[[I")
    public static int[][] field6794 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field6778;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field6788;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field6792;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    private int field6796;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "J")
    private long field6799;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Lpq;")
    public static class159 field6786;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "Lgq;")
    public static class209 field6772;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "Lie;")
    private class371 field6804;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "Ldr;")
    private class52 field6797;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III)I")
    public static final int method2827(int arg0, int arg1, int arg2) {
        int var3 = -101 % ((-arg2 - 70) / 56);
        field6778++;
        int var4 = 0;
        while (arg1 > 0) {
            var4 = var4 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Z")
    public final boolean method2828(byte arg0) {
        if (arg0 > -96) {
            field6772 = null;
        }
        field6774++;
        return this.method2832((byte) 73) >= 20;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V")
    public final void method2829(int arg0) {
        field6782++;
        if (this.field6797 == null) {
            return;
        }
        try {
            this.field6798.field1745 = 0;
            this.field6798.method951((byte) -82, 7);
            this.field6798.method932(arg0, arg0 - 78);
            this.field6797.method298(3, 0, 4, this.field6798.field1712);
        } catch (IOException var3) {
            try {
                this.field6797.method293(29241);
            } catch (Exception var2) {
            }
            this.field6797 = null;
            this.field6803 = -2;
            this.field6800++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZBII)Lie;")
    public final class371 method2830(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field6781++;
        long var6 = (long) ((arg4 << 16) + arg0);
        int var8 = 116 % ((arg3 - 37) / 47);
        class371 var9 = new class371();
        var9.field5325 = arg2;
        var9.field5294 = arg1;
        var9.field6449 = var6;
        if (arg1) {
            if (this.method2842(6) >= 20) {
                throw new RuntimeException();
            }
            this.field6780.method2713(-82, var9);
        } else if (this.method2832((byte) 125) < 20) {
            this.field6793.method2713(-82, var9);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZLdr;I)V")
    public final void method2831(boolean arg0, class52 arg1, int arg2) {
        if (this.field6797 != null) {
            try {
                this.field6797.method293(29241);
            } catch (Exception var8) {
            }
            this.field6797 = null;
        }
        field6787++;
        this.field6797 = arg1;
        this.method2834(0);
        this.method2836((byte) 108, arg0);
        this.field6804 = null;
        this.field6801.field1745 = 0;
        while (true) {
            class371 var4 = (class371) this.field6791.method2714(0);
            if (var4 == null) {
                while (true) {
                    class371 var5 = (class371) this.field6795.method2714(0);
                    if (var5 == null) {
                        if (this.field6802 != 0) {
                            try {
                                this.field6798.field1745 = 0;
                                this.field6798.method951((byte) -82, 4);
                                this.field6798.method951((byte) -82, this.field6802);
                                this.field6798.method915(0, 1502242504);
                                this.field6797.method298(arg2 + 6852, 0, 4, this.field6798.field1712);
                            } catch (IOException var7) {
                                try {
                                    this.field6797.method293(29241);
                                } catch (Exception var6) {
                                }
                                this.field6800++;
                                this.field6803 = -2;
                                this.field6797 = null;
                            }
                        }
                        this.field6796 = 0;
                        if (arg2 != -6849) {
                            method2833((byte) 83);
                        }
                        this.field6799 = class669.method3713(0);
                        return;
                    }
                    this.field6793.method2713(arg2 + 6767, var5);
                }
            }
            this.field6780.method2713(-82, var4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)I")
    private final int method2832(byte arg0) {
        field6775++;
        return arg0 <= 30 ? 108 : this.field6793.method2709(64) + this.field6795.method2709(126);
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(B)V")
    public static void method2833(byte arg0) {
        field6790 = null;
        field6786 = null;
        field6794 = null;
        if (arg0 <= 110) {
            method2833((byte) 112);
        }
        field6772 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    private final void method2834(int arg0) {
        field6792++;
        if (this.field6797 == null) {
            return;
        }
        try {
            this.field6798.field1745 = 0;
            this.field6798.method951((byte) -82, 6);
            this.field6798.method932(3, -124);
            this.field6797.method298(3, arg0, 4, this.field6798.field1712);
        } catch (IOException var3) {
            try {
                this.field6797.method293(29241);
            } catch (Exception var2) {
            }
            this.field6797 = null;
            this.field6800++;
            this.field6803 = -2;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V")
    public final void method2835(int arg0) {
        if (arg0 == 19575) {
            if (this.field6797 != null) {
                this.field6797.method300(18);
            }
            field6777++;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BZ)V")
    public final void method2836(byte arg0, boolean arg1) {
        if (arg0 <= 31) {
            return;
        }
        field6788++;
        if (this.field6797 == null) {
            return;
        }
        try {
            this.field6798.field1745 = 0;
            this.field6798.method951((byte) -82, arg1 ? 2 : 3);
            this.field6798.method932(0, 105);
            this.field6797.method298(3, 0, 4, this.field6798.field1712);
        } catch (IOException var4) {
            try {
                this.field6797.method293(29241);
            } catch (Exception var3) {
            }
            this.field6803 = -2;
            this.field6800++;
            this.field6797 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)I")
    public static final int method2837(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 <= 55) {
            method2841(24, 112, -44, 36, null);
        }
        int var4 = arg2 & 0x3;
        field6771++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return 4095 - arg1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
    public final void method2838(int arg0) {
        try {
            this.field6797.method293(29241);
        } catch (Exception var2) {
        }
        field6785++;
        if (arg0 <= 123) {
            field6794 = null;
        }
        this.field6797 = null;
        this.field6802 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6800++;
        this.field6803 = -1;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V")
    public final void method2839(int arg0) {
        if (arg0 != 0) {
            this.method2832((byte) -118);
        }
        field6779++;
        if (this.field6797 != null) {
            this.field6797.method293(arg0 + 29241);
        }
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)Z")
    public final boolean method2840(int arg0) {
        field6776++;
        if (arg0 == 6) {
            return this.method2842(6) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIILia;)V")
    public static final void method2841(int arg0, int arg1, int arg2, int arg3, class650 arg4) {
        class651 var5 = class29.method180(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field9205 = (arg1 << class428.field5949) + class49.field656;
        arg4.field9204 = arg3;
        arg4.field9213 = (arg2 << class428.field5949) + class49.field656;
        for (class82 var7 = var5.field9228; var7 != null; var7 = var7.field1024) {
            if (var7.field1027.field3918) {
                int var8 = var7.field1027.method1738(3891);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field9204 += var6;
            arg4.field9208 = true;
        } else if (var5.field9227 != null) {
            arg4.field9204 -= var5.field9227.field4842;
        }
        var5.field9219 = arg4;
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "(I)I")
    public final int method2842(int arg0) {
        if (arg0 != 6) {
            method2827(-76, -74, 31);
        }
        field6789++;
        return this.field6780.method2709(-97) + this.field6791.method2709(arg0 + 102);
    }

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "(I)Z")
    public final boolean method2843(int arg0) {
        field6783++;
        if (this.field6797 != null) {
            long var2 = class669.method3713(0);
            int var4 = (int) (var2 - this.field6799);
            this.field6799 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6796 += var4;
            if (this.field6796 > 30000) {
                try {
                    this.field6797.method293(29241);
                } catch (Exception var28) {
                }
                this.field6797 = null;
            }
        }
        if (this.field6797 == null) {
            return this.method2842(6) == 0 && this.method2832((byte) 34) == 0;
        }
        try {
            this.field6797.method292(-14);
            for (class371 var5 = (class371) this.field6780.method2715((byte) 109); var5 != null; var5 = (class371) this.field6780.method2712(0)) {
                this.field6798.field1745 = 0;
                this.field6798.method951((byte) -82, 1);
                this.field6798.method932((int) var5.field6449, -113);
                this.field6797.method298(3, 0, 4, this.field6798.field1712);
                this.field6791.method2713(-82, var5);
            }
            for (class371 var6 = (class371) this.field6793.method2715((byte) 126); var6 != null; var6 = (class371) this.field6793.method2712(0)) {
                this.field6798.field1745 = 0;
                this.field6798.method951((byte) -82, 0);
                this.field6798.method932((int) var6.field6449, -94);
                this.field6797.method298(3, 0, 4, this.field6798.field1712);
                this.field6795.method2713(-82, var6);
            }
            int var7 = 0;
            int var8 = 21 % ((40 - arg0) / 50);
            while (var7 < 100) {
                int var9 = this.field6797.method299(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field6796 = 0;
                byte var10 = 0;
                if (this.field6804 == null) {
                    var10 = 8;
                } else if (this.field6804.field5327 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field6801.field1745;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field6797.method296((byte) 111, this.field6801.field1745, var11, this.field6801.field1712);
                    if (this.field6802 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field6801.field1712[this.field6801.field1745 + var12] = (byte) class599.method3320(this.field6801.field1712[this.field6801.field1745 + var12], this.field6802);
                        }
                    }
                    this.field6801.field1745 += var11;
                    if (var10 <= this.field6801.field1745) {
                        if (this.field6804 == null) {
                            this.field6801.field1745 = 0;
                            int var13 = this.field6801.method957((byte) -78);
                            int var14 = this.field6801.method922((byte) -121);
                            int var15 = this.field6801.method957((byte) -81);
                            int var16 = this.field6801.method943(-118);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class371 var22;
                            if (var18) {
                                for (var22 = (class371) this.field6795.method2715((byte) 124); var22 != null && var22.field6449 != var19; var22 = (class371) this.field6795.method2712(0)) {
                                }
                            } else {
                                for (var22 = (class371) this.field6791.method2715((byte) 116); var22 != null && var22.field6449 != var19; var22 = (class371) this.field6791.method2712(0)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field6804 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field6804.field5324 = new class138(this.field6804.field5325 + var16 + var23);
                            this.field6804.field5324.method951((byte) -82, var17);
                            this.field6804.field5324.method906(-1, var16);
                            this.field6801.field1745 = 0;
                            this.field6804.field5327 = 8;
                        } else if (this.field6804.field5327 != 0) {
                            throw new IOException();
                        } else if (this.field6801.field1712[0] == -1) {
                            this.field6804.field5327 = 1;
                            this.field6801.field1745 = 0;
                        } else {
                            this.field6804 = null;
                        }
                    }
                } else {
                    int var24 = this.field6804.field5324.field1712.length - this.field6804.field5325;
                    int var25 = 512 - this.field6804.field5327;
                    if ((var24 - this.field6804.field5324.field1745) < var25) {
                        var25 = var24 - this.field6804.field5324.field1745;
                    }
                    if (var25 > var9) {
                        var25 = var9;
                    }
                    this.field6797.method296((byte) 125, this.field6804.field5324.field1745, var25, this.field6804.field5324.field1712);
                    if (this.field6802 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field6804.field5324.field1712[this.field6804.field5324.field1745 + var26] = (byte) class599.method3320(this.field6804.field5324.field1712[this.field6804.field5324.field1745 + var26], this.field6802);
                        }
                    }
                    this.field6804.field5324.field1745 += var25;
                    this.field6804.field5327 += var25;
                    if (this.field6804.field5324.field1745 == var24) {
                        this.field6804.method2669(-29226);
                        this.field6804.field5297 = false;
                        this.field6804 = null;
                    } else if (this.field6804.field5327 == 512) {
                        this.field6804.field5327 = 0;
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field6797.method293(29241);
            } catch (Exception var27) {
            }
            this.field6800++;
            this.field6797 = null;
            this.field6803 = -2;
            return this.method2842(6) == 0 && this.method2832((byte) 105) == 0;
        }
    }
}
