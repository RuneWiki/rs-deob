import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Ltk;")
    private class53 field832 = new class53();

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ltk;")
    private class53 field843 = new class53();

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Ltk;")
    private class53 field846 = new class53();

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Ltk;")
    private class53 field848 = new class53();

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Lfl;")
    private class248 field849 = new class248(4);

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "B")
    private byte field855 = 0;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public volatile int field853 = 0;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public volatile int field856 = 0;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lfl;")
    private class248 field854 = new class248(8);

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "D")
    public static double field829 = -1.0D;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "[I")
    public static int[] field838 = new int[128];

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "[Lmi;")
    public static class266[] field844 = new class266[0];

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "[I")
    public static int[] field845 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "I")
    private int field851;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "J")
    private long field852;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "Lbj;")
    private class157 field850;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "Lpc;")
    private class22 field857;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Z")
    public final boolean method343(int arg0) {
        if (arg0 != -1) {
            this.method345(-31);
        }
        field831++;
        return this.method351(4236) >= 20;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public final void method344(byte arg0) {
        try {
            this.field850.method955((byte) -99);
            if (arg0 <= 82) {
                this.field856 = -97;
            }
        } catch (Exception var2) {
        }
        this.field856 = -1;
        this.field850 = null;
        field827++;
        this.field853++;
        this.field855 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)Z")
    public final boolean method345(int arg0) {
        field839++;
        if (this.field850 != null) {
            long var2 = class263.method1754(-26);
            int var4 = (int) (var2 - this.field852);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field852 = var2;
            this.field851 += var4;
            if (this.field851 > 30000) {
                try {
                    this.field850.method955((byte) -116);
                } catch (Exception var27) {
                }
                this.field850 = null;
            }
        }
        if (this.field850 == null) {
            return this.method346(-1) == 0 && this.method351(4236) == 0;
        }
        try {
            this.field850.method954(true);
            for (class22 var5 = (class22) this.field832.method367(78); var5 != null; var5 = (class22) this.field832.method359(-95)) {
                this.field849.field3748 = 0;
                this.field849.method1568(1, (byte) 49);
                this.field849.method1567((int) var5.field15, (byte) -97);
                this.field850.method951(4, 67, 0, this.field849.field3723);
                this.field843.method363(var5, -105);
            }
            for (class22 var6 = (class22) this.field846.method367(121); var6 != null; var6 = (class22) this.field846.method359(-43)) {
                this.field849.field3748 = 0;
                this.field849.method1568(0, (byte) 49);
                this.field849.method1567((int) var6.field15, (byte) -73);
                this.field850.method951(4, 84, 0, this.field849.field3723);
                this.field848.method363(var6, -105);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field850.method953(arg0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field851 = 0;
                byte var9 = 0;
                if (this.field857 == null) {
                    var9 = 8;
                } else if (this.field857.field265 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field854.field3748;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field850.method946(this.field854.field3723, true, var10, this.field854.field3748);
                    if (this.field855 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field854.field3723[this.field854.field3748 + var11] = (byte) class127.method799(this.field854.field3723[this.field854.field3748 + var11], this.field855);
                        }
                    }
                    this.field854.field3748 += var10;
                    if (var9 <= this.field854.field3748) {
                        if (this.field857 == null) {
                            this.field854.field3748 = 0;
                            int var12 = this.field854.method1593((byte) 27);
                            int var13 = this.field854.method1575(false);
                            int var14 = this.field854.method1593((byte) 27);
                            int var15 = var14 & 0x7F;
                            int var16 = this.field854.method1576(-17672);
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class22 var21;
                            if (var17) {
                                for (var21 = (class22) this.field848.method367(47); var21 != null && var21.field15 != var18; var21 = (class22) this.field848.method359(-116)) {
                                }
                            } else {
                                for (var21 = (class22) this.field843.method367(48); var21 != null && var21.field15 != var18; var21 = (class22) this.field843.method359(-47)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var15 == 0 ? 5 : 9;
                            this.field857 = var21;
                            this.field857.field264 = new class248(this.field857.field261 + var16 + var22);
                            this.field857.field264.method1568(var15, (byte) 49);
                            this.field857.field264.method1577((byte) 82, var16);
                            this.field857.field265 = 8;
                            this.field854.field3748 = 0;
                        } else if (this.field857.field265 != 0) {
                            throw new IOException();
                        } else if (this.field854.field3723[0] == -1) {
                            this.field854.field3748 = 0;
                            this.field857.field265 = 1;
                        } else {
                            this.field857 = null;
                        }
                    }
                } else {
                    int var23 = this.field857.field264.field3723.length - this.field857.field261;
                    int var24 = 512 - this.field857.field265;
                    if (var23 - this.field857.field264.field3748 < var24) {
                        var24 = var23 - this.field857.field264.field3748;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field850.method946(this.field857.field264.field3723, true, var24, this.field857.field264.field3748);
                    if (this.field855 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field857.field264.field3723[this.field857.field264.field3748 + var25] = (byte) class127.method799(this.field857.field264.field3723[this.field857.field264.field3748 + var25], this.field855);
                        }
                    }
                    this.field857.field265 += var24;
                    this.field857.field264.field3748 += var24;
                    if (this.field857.field264.field3748 == var23) {
                        this.field857.method4((byte) -55);
                        this.field857.field4091 = false;
                        this.field857 = null;
                    } else if (this.field857.field265 == 512) {
                        this.field857.field265 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field850.method955((byte) -94);
            } catch (Exception var26) {
            }
            this.field856 = -2;
            this.field853++;
            this.field850 = null;
            return this.method346(arg0 - 1) == 0 && this.method351(4236) == 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
    public final int method346(int arg0) {
        field825++;
        if (arg0 != -1) {
            this.method353((class157) null, true, true);
        }
        return this.field832.method364((byte) 80) + this.field843.method364((byte) 80);
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    private final void method347(int arg0) {
        field836++;
        if (this.field850 == null) {
            return;
        }
        try {
            this.field849.field3748 = 0;
            this.field849.method1568(6, (byte) 49);
            this.field849.method1567(3, (byte) -26);
            if (arg0 >= 82) {
                this.field850.method951(4, 39, 0, this.field849.field3723);
            }
        } catch (IOException var3) {
            try {
                this.field850.method955((byte) -81);
            } catch (Exception var2) {
            }
            this.field856 = -2;
            this.field850 = null;
            this.field853++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
    public final void method348(boolean arg0) {
        field847++;
        if (this.field850 == null) {
            return;
        }
        try {
            this.field849.field3748 = 0;
            this.field849.method1568(7, (byte) 49);
            this.field849.method1567(0, (byte) -36);
            this.field850.method951(4, 76, 0, this.field849.field3723);
        } catch (IOException var3) {
            try {
                this.field850.method955((byte) 121);
            } catch (Exception var2) {
            }
            this.field856 = -2;
            this.field850 = null;
            this.field853++;
        }
        if (arg0) {
            this.field857 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZB)V")
    public final void method349(boolean arg0, byte arg1) {
        field835++;
        if (this.field850 == null) {
            return;
        }
        try {
            this.field849.field3748 = 0;
            this.field849.method1568(arg0 ? 2 : 3, (byte) 49);
            this.field849.method1567(0, (byte) -112);
            this.field850.method951(4, 35, 0, this.field849.field3723);
        } catch (IOException var4) {
            try {
                this.field850.method955((byte) 82);
            } catch (Exception var3) {
            }
            this.field856 = -2;
            this.field853++;
            this.field850 = null;
        }
        if (arg1 <= 44) {
            field829 = -0.06238476706925857D;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZBII)Lpc;")
    public final class22 method350(int arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field830++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class22 var8 = new class22();
        var8.field4094 = arg1;
        int var9 = -13 / ((45 - arg3) / 44);
        var8.field15 = var6;
        var8.field261 = arg2;
        if (arg1) {
            if (this.method346(-1) >= 20) {
                throw new RuntimeException();
            }
            this.field832.method363(var8, -105);
        } else if (this.method351(4236) < 20) {
            this.field846.method363(var8, -105);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
    private final int method351(int arg0) {
        field837++;
        if (arg0 != 4236) {
            this.field856 = -40;
        }
        return this.field846.method364((byte) 80) + this.field848.method364((byte) 80);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
    public final void method352(byte arg0) {
        if (arg0 != 75) {
            this.method351(120);
        }
        field840++;
        if (this.field850 != null) {
            this.field850.method955((byte) -114);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lbj;ZZ)V")
    public final void method353(class157 arg0, boolean arg1, boolean arg2) {
        if (this.field850 != null) {
            try {
                this.field850.method955((byte) 113);
            } catch (Exception var8) {
            }
            this.field850 = null;
        }
        if (arg1) {
            return;
        }
        this.field850 = arg0;
        field828++;
        this.method347(114);
        this.method349(arg2, (byte) 86);
        this.field857 = null;
        this.field854.field3748 = 0;
        while (true) {
            class22 var4 = (class22) this.field843.method368(0);
            if (var4 == null) {
                while (true) {
                    class22 var5 = (class22) this.field848.method368(0);
                    if (var5 == null) {
                        if (this.field855 != 0) {
                            try {
                                this.field849.field3748 = 0;
                                this.field849.method1568(4, (byte) 49);
                                this.field849.method1568(this.field855, (byte) 49);
                                this.field849.method1605(0, (byte) 119);
                                this.field850.method951(4, 99, 0, this.field849.field3723);
                            } catch (IOException var7) {
                                try {
                                    this.field850.method955((byte) -78);
                                } catch (Exception var6) {
                                }
                                this.field853++;
                                this.field850 = null;
                                this.field856 = -2;
                            }
                        }
                        this.field851 = 0;
                        this.field852 = class263.method1754(124);
                        return;
                    }
                    this.field846.method363(var5, -105);
                }
            }
            this.field832.method363(var4, -105);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public final void method354(byte arg0) {
        field842++;
        if (arg0 > 52 && this.field850 != null) {
            this.field850.method952((byte) 106);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static void method355(byte arg0) {
        field838 = null;
        if (arg0 == 107) {
            field845 = null;
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method356(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field826++;
        class289 var5 = class66.method450(arg4, arg1 ^ arg1, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field4487 != null) {
            class234 var6 = new class234();
            var6.field3533 = var5.field4487;
            var6.field3528 = var5;
            var6.field3520 = arg3;
            var6.field3526 = arg2;
            class228.method1456((byte) -68, var6);
        }
        boolean var7 = true;
        if (var5.field4496 > 0) {
            var7 = class71.method479(-16, var5);
        }
        if (!var7 || !client.method972(var5).method1788(arg2 - 1, true)) {
            return;
        }
        if (arg2 == 1) {
            class244.field3647++;
            class196.field2979.method1106(152, false);
            class196.field2979.method1577((byte) 125, arg4);
            class196.field2979.method1605(arg0, (byte) 25);
        }
        if (arg2 == 2) {
            class196.field2979.method1106(126, false);
            class236.field3560++;
            class196.field2979.method1577((byte) 61, arg4);
            class196.field2979.method1605(arg0, (byte) 80);
        }
        if (arg2 == 3) {
            class186.field2817++;
            class196.field2979.method1106(12, false);
            class196.field2979.method1577((byte) 91, arg4);
            class196.field2979.method1605(arg0, (byte) 54);
        }
        if (arg2 == 4) {
            class157.field2357++;
            class196.field2979.method1106(70, false);
            class196.field2979.method1577((byte) 52, arg4);
            class196.field2979.method1605(arg0, (byte) -87);
        }
        if (arg2 == 5) {
            class196.field2979.method1106(190, false);
            class101.field1588++;
            class196.field2979.method1577((byte) 71, arg4);
            class196.field2979.method1605(arg0, (byte) -100);
        }
        if (arg2 == 6) {
            class196.field2979.method1106(117, false);
            class195.field2975++;
            class196.field2979.method1577((byte) 79, arg4);
            class196.field2979.method1605(arg0, (byte) -90);
        }
        if (arg2 == 7) {
            class63.field988++;
            class196.field2979.method1106(158, false);
            class196.field2979.method1577((byte) 104, arg4);
            class196.field2979.method1605(arg0, (byte) -90);
        }
        if (arg2 == 8) {
            class18.field222++;
            class196.field2979.method1106(63, false);
            class196.field2979.method1577((byte) 89, arg4);
            class196.field2979.method1605(arg0, (byte) 62);
        }
        if (arg2 == 9) {
            class266.field4011++;
            class196.field2979.method1106(44, false);
            class196.field2979.method1577((byte) 56, arg4);
            class196.field2979.method1605(arg0, (byte) -82);
        }
        if (arg2 == 10) {
            class196.field2979.method1106(165, false);
            class89.field1407++;
            class196.field2979.method1577((byte) 71, arg4);
            class196.field2979.method1605(arg0, (byte) 106);
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)Z")
    public final boolean method357(int arg0) {
        field833++;
        if (arg0 == 20) {
            return this.method346(-1) >= 20;
        } else {
            return false;
        }
    }
}
