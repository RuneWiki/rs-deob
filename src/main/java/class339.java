import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class339 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lsc;")
    private class347 field4360 = new class347();

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Lsc;")
    private class347 field4373 = new class347();

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lsc;")
    private class347 field4374 = new class347();

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lsc;")
    private class347 field4375 = new class347();

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "Lig;")
    private class244 field4377 = new class244(4);

    @OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
    public volatile int field4381 = 0;

    @OriginalMember(owner = "client!gd", name = "B", descriptor = "B")
    private byte field4383 = 0;

    @OriginalMember(owner = "client!gd", name = "A", descriptor = "I")
    public volatile int field4382 = 0;

    @OriginalMember(owner = "client!gd", name = "y", descriptor = "Lig;")
    private class244 field4380 = new class244(8);

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "Lso;")
    public static class468 field4365 = new class468(3, 2);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "J")
    private long field4376;

    @OriginalMember(owner = "client!gd", name = "C", descriptor = "Loe;")
    private class200 field4384;

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "Lws;")
    private class357 field4378;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public final void method2006(int arg0) {
        try {
            this.field4378.method2099((byte) -117);
        } catch (Exception var2) {
        }
        field4369++;
        this.field4378 = null;
        this.field4382 = -1;
        this.field4381++;
        this.field4383 = (byte) ((int) ((double) arg0 * Math.random() + 1.0D));
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public final void method2007(int arg0) {
        field4359++;
        if (this.field4378 == null) {
            return;
        }
        try {
            if (arg0 <= 117) {
                this.field4380 = null;
            }
            this.field4377.field2903 = 0;
            this.field4377.method1460(7, 24710);
            this.field4377.method1440(0, (byte) -55);
            this.field4378.method2103(this.field4377.field2912, 126, 4, 0);
        } catch (IOException var3) {
            try {
                this.field4378.method2099((byte) -105);
            } catch (Exception var2) {
            }
            this.field4382 = -2;
            this.field4378 = null;
            this.field4381++;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
    public final void method2008(int arg0, boolean arg1) {
        field4372++;
        if (this.field4378 == null) {
            return;
        }
        try {
            this.field4377.field2903 = 0;
            this.field4377.method1460(arg1 ? 2 : 3, 24710);
            this.field4377.method1440(0, (byte) -55);
            this.field4378.method2103(this.field4377.field2912, 126, 4, 0);
        } catch (IOException var4) {
            try {
                this.field4378.method2099((byte) -113);
            } catch (Exception var3) {
            }
            this.field4378 = null;
            this.field4382 = -2;
            this.field4381++;
        }
        if (arg0 <= 104) {
            this.field4384 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IBIIZ)Loe;")
    public final class200 method2009(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field4370++;
        long var6 = (long) ((arg0 << 16) + arg2);
        class200 var8 = new class200();
        var8.field6561 = arg4;
        var8.field2365 = arg1;
        var8.field8919 = var6;
        if (arg4) {
            if (this.method2011(arg3 + 1802914416) >= 20) {
                throw new RuntimeException();
            }
            this.field4360.method2068(-128, var8);
        } else if (this.method2012((byte) 119) < 20) {
            this.field4374.method2068(arg3 ^ 0x6B764A10, var8);
        } else {
            throw new RuntimeException();
        }
        if (arg3 != -1802914416) {
            this.field4383 = 96;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V")
    public static void method2010(int arg0) {
        if (arg0 != -23084) {
            field4365 = null;
        }
        field4365 = null;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
    public final int method2011(int arg0) {
        if (arg0 != 0) {
            this.method2007(-79);
        }
        field4357++;
        return this.field4360.method2069(false) + this.field4373.method2069(false);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)I")
    private final int method2012(byte arg0) {
        if (arg0 < 107) {
            this.field4382 = -128;
        }
        field4364++;
        return this.field4374.method2069(false) + this.field4375.method2069(false);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)Z")
    public final boolean method2013(byte arg0) {
        field4368++;
        if (arg0 != -70) {
            this.method2015((byte) 39, null, false);
        }
        return this.method2011(0) >= 20;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lfba;II)V")
    public static final void method2014(class25 arg0, int arg1, int arg2) {
        field4366++;
        if (class306.field3815 >= 50 || arg0 == null || arg0.field266 == null || arg2 >= arg0.field266.length || arg0.field266[arg2] == null) {
            return;
        }
        int var3 = arg0.field266[arg2][0];
        int var4 = var3 >> 8;
        int var5 = var3 >> 5 & 0x7;
        if (arg1 != 5271) {
            return;
        }
        if (arg0.field266[arg2].length > 1) {
            int var6 = (int) (Math.random() * (double) arg0.field266[arg2].length);
            if (var6 > 0) {
                var4 = arg0.field266[arg2][var6];
            }
        }
        int var7 = 256;
        if (arg0.field264 != null && arg0.field255 != null) {
            var7 = class625.method3585(arg0.field255[arg2], arg0.field264[arg2], 2);
        }
        if (arg0.field271) {
            class54.method305(0, false, var5, true, var7, var4, 255);
        } else {
            class259.method1549(var7, (byte) -46, var5, var4, 255, 0);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLws;Z)V")
    public final void method2015(byte arg0, class357 arg1, boolean arg2) {
        if (this.field4378 != null) {
            try {
                this.field4378.method2099((byte) -108);
            } catch (Exception var8) {
            }
            this.field4378 = null;
        }
        field4358++;
        this.field4378 = arg1;
        this.method2018((byte) -104);
        this.method2008(arg0 ^ 0xFFFFFFFC, arg2);
        this.field4380.field2903 = 0;
        this.field4384 = null;
        while (true) {
            class200 var4 = (class200) this.field4373.method2070(-13418);
            if (var4 == null) {
                while (true) {
                    class200 var5 = (class200) this.field4375.method2070(arg0 - 13307);
                    if (var5 == null) {
                        if (arg0 != -111) {
                            return;
                        }
                        if (this.field4383 != 0) {
                            try {
                                this.field4377.field2903 = 0;
                                this.field4377.method1460(4, 24710);
                                this.field4377.method1460(this.field4383, arg0 ^ 0xFFFF9F17);
                                this.field4377.method1446(0, true);
                                this.field4378.method2103(this.field4377.field2912, 126, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field4378.method2099((byte) -105);
                                } catch (Exception var6) {
                                }
                                this.field4378 = null;
                                this.field4382 = -2;
                                this.field4381++;
                            }
                        }
                        this.field4379 = 0;
                        this.field4376 = class652.method3700(arg0 ^ 0x6E);
                        return;
                    }
                    this.field4374.method2068(-128, var5);
                }
            }
            this.field4360.method2068(-127, var4);
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
    public final void method2016(int arg0) {
        if (this.field4378 != null) {
            this.field4378.method2101((byte) 20);
        }
        if (arg0 != 0) {
            this.method2019((byte) -2);
        }
        field4362++;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(B)V")
    public static final void method2017(byte arg0) {
        field4363++;
        class519.field7380.method3549(0);
        if (arg0 < 123) {
            method2010(-50);
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
    private final void method2018(byte arg0) {
        field4367++;
        if (this.field4378 == null) {
            return;
        }
        try {
            this.field4377.field2903 = 0;
            this.field4377.method1460(6, 24710);
            int var2 = 36 / ((arg0 + 33) / 61);
            this.field4377.method1440(3, (byte) -55);
            this.field4378.method2103(this.field4377.field2912, 126, 4, 0);
        } catch (IOException var4) {
            try {
                this.field4378.method2099((byte) -111);
            } catch (Exception var3) {
            }
            this.field4381++;
            this.field4382 = -2;
            this.field4378 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(B)V")
    public final void method2019(byte arg0) {
        if (arg0 != 100) {
            this.field4373 = null;
        }
        if (this.field4378 != null) {
            this.field4378.method2099((byte) -122);
        }
        field4356++;
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(B)Z")
    public final boolean method2020(byte arg0) {
        field4361++;
        if (this.field4378 != null) {
            long var2 = class652.method3700(-1);
            int var4 = (int) (var2 - this.field4376);
            this.field4376 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4379 += var4;
            if (this.field4379 > 30000) {
                try {
                    this.field4378.method2099((byte) -116);
                } catch (Exception var28) {
                }
                this.field4378 = null;
            }
        }
        if (this.field4378 == null) {
            return this.method2011(0) == 0 && this.method2012((byte) 125) == 0;
        }
        try {
            this.field4378.method2105(false);
            for (class200 var5 = (class200) this.field4360.method2067(22462); var5 != null; var5 = (class200) this.field4360.method2066(0)) {
                this.field4377.field2903 = 0;
                this.field4377.method1460(1, 24710);
                this.field4377.method1440((int) var5.field8919, (byte) -55);
                this.field4378.method2103(this.field4377.field2912, -8, 4, 0);
                this.field4373.method2068(-127, var5);
            }
            for (class200 var6 = (class200) this.field4374.method2067(22462); var6 != null; var6 = (class200) this.field4374.method2066(0)) {
                this.field4377.field2903 = 0;
                this.field4377.method1460(0, 24710);
                this.field4377.method1440((int) var6.field8919, (byte) -55);
                this.field4378.method2103(this.field4377.field2912, 127, 4, 0);
                this.field4375.method2068(-127, var6);
            }
            int var7 = -44 % ((-arg0 - 19) / 54);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4378.method2102((byte) -121);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4379 = 0;
                byte var10 = 0;
                if (this.field4384 == null) {
                    var10 = 8;
                } else if (this.field4384.field2362 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field4384.field2370.field2912.length - this.field4384.field2365;
                    int var12 = 512 - this.field4384.field2362;
                    if (var11 - this.field4384.field2370.field2903 < var12) {
                        var12 = var11 - this.field4384.field2370.field2903;
                    }
                    if (var12 > var9) {
                        var12 = var9;
                    }
                    this.field4378.method2104(var12, this.field4384.field2370.field2912, false, this.field4384.field2370.field2903);
                    if (this.field4383 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4384.field2370.field2912[this.field4384.field2370.field2903 + var13] = (byte) class555.method3251(this.field4384.field2370.field2912[this.field4384.field2370.field2903 + var13], this.field4383);
                        }
                    }
                    this.field4384.field2362 += var12;
                    this.field4384.field2370.field2903 += var12;
                    if (this.field4384.field2370.field2903 == var11) {
                        this.field4384.method3562((byte) -101);
                        this.field4384.field6563 = false;
                        this.field4384 = null;
                    } else if (this.field4384.field2362 == 512) {
                        this.field4384.field2362 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4380.field2903;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field4378.method2104(var14, this.field4380.field2912, false, this.field4380.field2903);
                    if (this.field4383 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4380.field2912[this.field4380.field2903 + var15] = (byte) class555.method3251(this.field4380.field2912[this.field4380.field2903 + var15], this.field4383);
                        }
                    }
                    this.field4380.field2903 += var14;
                    if (var10 <= this.field4380.field2903) {
                        if (this.field4384 == null) {
                            this.field4380.field2903 = 0;
                            int var16 = this.field4380.method1423(-109);
                            int var17 = this.field4380.method1476(-105);
                            int var18 = this.field4380.method1423(-96);
                            int var19 = this.field4380.method1438(120);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class200 var25;
                            if (var21) {
                                for (var25 = (class200) this.field4375.method2067(22462); var25 != null && var25.field8919 != var22; var25 = (class200) this.field4375.method2066(0)) {
                                }
                            } else {
                                for (var25 = (class200) this.field4373.method2067(22462); var25 != null && var25.field8919 != var22; var25 = (class200) this.field4373.method2066(0)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field4384 = var25;
                            this.field4384.field2370 = new class244(var19 - (-var26 - this.field4384.field2365));
                            this.field4384.field2370.method1460(var20, 24710);
                            this.field4384.field2370.method1421(var19, -20798);
                            this.field4384.field2362 = 8;
                            this.field4380.field2903 = 0;
                        } else if (this.field4384.field2362 != 0) {
                            throw new IOException();
                        } else if (this.field4380.field2912[0] == -1) {
                            this.field4384.field2362 = 1;
                            this.field4380.field2903 = 0;
                        } else {
                            this.field4384 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field4378.method2099((byte) -115);
            } catch (Exception var27) {
            }
            this.field4378 = null;
            this.field4381++;
            this.field4382 = -2;
            return this.method2011(0) == 0 && this.method2012((byte) 121) == 0;
        }
    }

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "(B)Z")
    public final boolean method2021(byte arg0) {
        int var2 = 121 % ((58 - arg0) / 35);
        field4371++;
        return this.method2012((byte) 112) >= 20;
    }
}
