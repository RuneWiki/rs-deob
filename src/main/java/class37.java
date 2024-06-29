import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class37 {

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lv;")
    private class57 field894 = new class57();

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "Lv;")
    private class57 field900 = new class57();

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "Lv;")
    private class57 field901 = new class57();

    @OriginalMember(owner = "client!mf", name = "v", descriptor = "Lv;")
    private class57 field902 = new class57();

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Laa;")
    private class8 field906 = new class8(4);

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "B")
    private byte field910 = 0;

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "I")
    public volatile int field909 = 0;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public volatile int field911 = 0;

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Laa;")
    private class8 field908 = new class8(8);

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field892 = 1;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field899 = 0;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!mf", name = "w", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!mf", name = "x", descriptor = "I")
    private int field904;

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "J")
    private long field907;

    @OriginalMember(owner = "client!mf", name = "y", descriptor = "Lu;")
    private class212 field905;

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Ldg;")
    private class270 field912;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
    public static int[] field895;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final void method349(byte arg0) {
        field897++;
        if (this.field905 == null) {
            return;
        }
        try {
            this.field906.field146 = 0;
            this.field906.method76(5305, 7);
            this.field906.method49(-128, 0);
            this.field905.method1509(this.field906.field124, 0, 4, true);
        } catch (IOException var3) {
            try {
                this.field905.method1516(-90);
            } catch (Exception var2) {
            }
            this.field911 = -2;
            this.field905 = null;
            this.field909++;
        }
        if (arg0 < 113) {
            this.method359(-6);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public final void method350(byte arg0) {
        field896++;
        if (arg0 >= 44 && this.field905 != null) {
            this.field905.method1514(false);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field883++;
        int var7 = 121 % ((-arg5 - 42) / 38);
        if (arg1 - arg3 >= class48.field1096 && class252.field4458 >= (arg1 + arg3) && class275.field4804 <= arg0 - arg3 && arg0 + arg3 <= class167.field3064) {
            class133.method1006(arg6, arg0, arg1, arg3, (byte) -55, arg4, arg2);
        } else {
            class232.method1648(arg1, arg4, arg6, arg3, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        if (arg6 != 79) {
            return;
        }
        if (arg3 >= 0 && arg4 >= 0 && arg3 < 103 && arg4 < 103) {
            if (arg1 == 0) {
                class225 var8 = class234.method1659(arg0, arg3, arg4);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field4039 >>> 32);
                    if (arg2 == 2) {
                        var8.field4031 = new class55(var9, 2, arg5 + 4, arg0, arg3, arg4, arg7, false, var8.field4031);
                        var8.field4029 = new class55(var9, 2, arg5 + 1 & 0x3, arg0, arg3, arg4, arg7, false, var8.field4029);
                    } else {
                        var8.field4031 = new class55(var9, arg2, arg5, arg0, arg3, arg4, arg7, false, var8.field4031);
                    }
                }
            }
            if (arg1 == 1) {
                class146 var10 = class209.method1480(arg0, arg3, arg4);
                if (var10 != null) {
                    int var11 = (int) (var10.field2803 >>> 32) & Integer.MAX_VALUE;
                    if (arg2 == 4 || arg2 == 5) {
                        var10.field2800 = new class55(var11, 4, arg5, arg0, arg3, arg4, arg7, false, var10.field2800);
                    } else if (arg2 == 6) {
                        var10.field2800 = new class55(var11, 4, arg5 + 4, arg0, arg3, arg4, arg7, false, var10.field2800);
                    } else if (arg2 == 7) {
                        var10.field2800 = new class55(var11, 4, (arg5 + 2 & 0x3) + 4, arg0, arg3, arg4, arg7, false, var10.field2800);
                    } else if (arg2 == 8) {
                        var10.field2800 = new class55(var11, 4, arg5 + 4, arg0, arg3, arg4, arg7, false, var10.field2800);
                        var10.field2798 = new class55(var11, 4, (arg5 + 2 & 0x3) + 4, arg0, arg3, arg4, arg7, false, var10.field2798);
                    }
                }
            }
            if (arg1 == 2) {
                if (arg2 == 11) {
                    arg2 = 10;
                }
                class35 var12 = class277.method1873(arg0, arg3, arg4);
                if (var12 != null) {
                    var12.field857 = new class55(Integer.MAX_VALUE & (int) (var12.field863 >>> 32), arg2, arg5, arg0, arg3, arg4, arg7, false, var12.field857);
                }
            }
            if (arg1 == 3) {
                class104 var13 = class175.method1288(arg0, arg3, arg4);
                if (var13 != null) {
                    var13.field2089 = new class55(Integer.MAX_VALUE & (int) (var13.field2087 >>> 32), 22, arg5, arg0, arg3, arg4, arg7, false, var13.field2089);
                }
            }
        }
        field882++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BZ)V")
    public final void method353(byte arg0, boolean arg1) {
        field889++;
        if (this.field905 == null || arg0 != 98) {
            return;
        }
        try {
            this.field906.field146 = 0;
            this.field906.method76(5305, arg1 ? 2 : 3);
            this.field906.method49(-127, 0);
            this.field905.method1509(this.field906.field124, 0, 4, true);
        } catch (IOException var4) {
            try {
                this.field905.method1516(-106);
            } catch (Exception var3) {
            }
            this.field905 = null;
            this.field909++;
            this.field911 = -2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)I")
    public static final int method354(byte arg0, int arg1) {
        field890++;
        double var2 = (double) ((arg1 & 0xFF0B80) >> 16) / 256.0D;
        if (arg0 <= 12) {
            field892 = 95;
        }
        double var4 = (double) ((arg1 & 0xFFAF) >> 8) / 256.0D;
        double var6 = var2;
        double var8 = 0.0D;
        double var10 = var2;
        double var12 = (double) (arg1 & 0xFF) / 256.0D;
        if (var2 > var4) {
            var6 = var4;
        }
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var12) {
            var10 = var12;
        }
        double var14 = 0.0D;
        if (var12 < var6) {
            var6 = var12;
        }
        double var16 = (var6 + var10) / 2.0D;
        if (var6 != var10) {
            if (var2 == var10) {
                var8 = (var4 - var12) / (var10 - var6);
            } else if (var4 == var10) {
                var8 = (var12 - var2) / (var10 - var6) + 2.0D;
            } else if (var10 == var12) {
                var8 = (var2 - var4) / (var10 - var6) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var6) / (var6 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var6) / (2.0D - var10 - var6);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var16 * 256.0D);
        double var20 = var8 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        return (var19 >> 1) + (var18 >> 5 << 7) + (var22 >> 2 << 10);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Z)I")
    public final int method355(boolean arg0) {
        field893++;
        return arg0 ? this.field894.method543((byte) 110) + this.field900.method543((byte) 124) : 100;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)Z")
    public final boolean method356(int arg0) {
        field885++;
        if (this.field905 != null) {
            long var2 = class111.method874(30351);
            int var4 = (int) (var2 - this.field907);
            this.field907 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field904 += var4;
            if (this.field904 > 30000) {
                try {
                    this.field905.method1516(-124);
                } catch (Exception var28) {
                }
                this.field905 = null;
            }
        }
        if (this.field905 == null) {
            return this.method355(true) == 0 && this.method360(-94) == 0;
        }
        try {
            this.field905.method1507((byte) 115);
            for (class270 var5 = (class270) this.field894.method542(18844); var5 != null; var5 = (class270) this.field894.method533(7)) {
                this.field906.field146 = 0;
                this.field906.method76(5305, 1);
                this.field906.method49(-109, (int) var5.field1743);
                this.field905.method1509(this.field906.field124, 0, 4, true);
                this.field900.method535(var5, (byte) -123);
            }
            int var6 = 74 / ((37 - arg0) / 54);
            for (class270 var7 = (class270) this.field901.method542(18844); var7 != null; var7 = (class270) this.field901.method533(7)) {
                this.field906.field146 = 0;
                this.field906.method76(5305, 0);
                this.field906.method49(-119, (int) var7.field1743);
                this.field905.method1509(this.field906.field124, 0, 4, true);
                this.field902.method535(var7, (byte) -107);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field905.method1508(0);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field904 = 0;
                byte var10 = 0;
                if (this.field912 == null) {
                    var10 = 8;
                } else if (this.field912.field4750 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field908.field146;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field905.method1510(this.field908.field146, this.field908.field124, var11, (byte) -6);
                    if (this.field910 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field908.field124[this.field908.field146 + var12] = (byte) class186.method1344(this.field908.field124[this.field908.field146 + var12], this.field910);
                        }
                    }
                    this.field908.field146 += var11;
                    if (var10 <= this.field908.field146) {
                        if (this.field912 == null) {
                            this.field908.field146 = 0;
                            int var13 = this.field908.method63((byte) 86);
                            int var14 = this.field908.method65((byte) 123);
                            int var15 = this.field908.method63((byte) 107);
                            int var16 = this.field908.method70(65280);
                            int var17 = var15 & 0x7F;
                            boolean var18 = (var15 & 0x80) != 0;
                            long var19 = (long) ((var13 << 16) + var14);
                            Object var21 = null;
                            class270 var22;
                            if (var18) {
                                for (var22 = (class270) this.field902.method542(18844); var22 != null && var22.field1743 != var19; var22 = (class270) this.field902.method533(7)) {
                                }
                            } else {
                                for (var22 = (class270) this.field900.method542(18844); var22 != null && var22.field1743 != var19; var22 = (class270) this.field900.method533(7)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            this.field912 = var22;
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field912.field4756 = new class8(this.field912.field4743 + var16 + var23);
                            this.field912.field4756.method76(5305, var17);
                            this.field912.field4756.method57(var16, 117);
                            this.field912.field4750 = 8;
                            this.field908.field146 = 0;
                        } else if (this.field912.field4750 != 0) {
                            throw new IOException();
                        } else if (this.field908.field124[0] == -1) {
                            this.field912.field4750 = 1;
                            this.field908.field146 = 0;
                        } else {
                            this.field912 = null;
                        }
                    }
                } else {
                    int var24 = this.field912.field4756.field124.length - this.field912.field4743;
                    int var25 = 512 - this.field912.field4750;
                    if (var24 - this.field912.field4756.field146 < var25) {
                        var25 = var24 - this.field912.field4756.field146;
                    }
                    if (var9 < var25) {
                        var25 = var9;
                    }
                    this.field905.method1510(this.field912.field4756.field146, this.field912.field4756.field124, var25, (byte) -6);
                    if (this.field910 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field912.field4756.field124[this.field912.field4756.field146 + var26] = (byte) class186.method1344(this.field912.field4756.field124[this.field912.field4756.field146 + var26], this.field910);
                        }
                    }
                    this.field912.field4750 += var25;
                    this.field912.field4756.field146 += var25;
                    if (this.field912.field4756.field146 == var24) {
                        this.field912.method701(true);
                        this.field912.field4506 = false;
                        this.field912 = null;
                    } else if (this.field912.field4750 == 512) {
                        this.field912.field4750 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field905.method1516(-122);
            } catch (Exception var27) {
            }
            this.field911 = -2;
            this.field905 = null;
            this.field909++;
            return this.method355(true) == 0 && this.method360(-91) == 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lu;ZI)V")
    public final void method357(class212 arg0, boolean arg1, int arg2) {
        field887++;
        if (this.field905 != null) {
            try {
                this.field905.method1516(-99);
            } catch (Exception var8) {
            }
            this.field905 = null;
        }
        this.field905 = arg0;
        this.method363(23793);
        this.method353((byte) 98, arg1);
        this.field912 = null;
        this.field908.field146 = 0;
        while (true) {
            class270 var4 = (class270) this.field900.method541(false);
            if (var4 == null) {
                while (true) {
                    class270 var5 = (class270) this.field902.method541(false);
                    if (var5 == null) {
                        if (this.field910 != arg2) {
                            try {
                                this.field906.field146 = 0;
                                this.field906.method76(5305, 4);
                                this.field906.method76(5305, this.field910);
                                this.field906.method97(0, (byte) -2);
                                this.field905.method1509(this.field906.field124, 0, 4, true);
                            } catch (IOException var7) {
                                try {
                                    this.field905.method1516(-98);
                                } catch (Exception var6) {
                                }
                                this.field909++;
                                this.field911 = -2;
                                this.field905 = null;
                            }
                        }
                        this.field904 = 0;
                        this.field907 = class111.method874(30351);
                        return;
                    }
                    this.field901.method535(var5, (byte) -127);
                }
            }
            this.field894.method535(var4, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method358(int arg0) {
        field881++;
        try {
            this.field905.method1516(arg0 ^ 0xFFFFFFA7);
        } catch (Exception var2) {
        }
        if (arg0 == 3) {
            this.field910 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field905 = null;
            this.field911 = -1;
            this.field909++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
    public final void method359(int arg0) {
        field884++;
        if (arg0 != 4) {
            this.field910 = -117;
        }
        if (this.field905 != null) {
            this.field905.method1516(-116);
        }
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)I")
    private final int method360(int arg0) {
        field888++;
        if (arg0 > -35) {
            method362(50);
        }
        return this.field901.method543((byte) 105) + this.field902.method543((byte) 100);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)Z")
    public final boolean method361(byte arg0) {
        if (arg0 >= -14) {
            return true;
        } else {
            field891++;
            return this.method360(-89) >= 20;
        }
    }

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "(I)V")
    public static void method362(int arg0) {
        if (arg0 == 8270) {
            field895 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)V")
    private final void method363(int arg0) {
        field898++;
        if (this.field905 == null) {
            return;
        }
        try {
            this.field906.field146 = 0;
            this.field906.method76(5305, 6);
            if (arg0 == 23793) {
                this.field906.method49(-114, 3);
                this.field905.method1509(this.field906.field124, 0, 4, true);
            }
        } catch (IOException var3) {
            try {
                this.field905.method1516(-99);
            } catch (Exception var2) {
            }
            this.field905 = null;
            this.field911 = -2;
            this.field909++;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIBZ)Ldg;")
    public final class270 method364(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field886++;
        if (arg2 < 22) {
            this.method360(125);
        }
        long var6 = (long) ((arg0 << 16) + arg1);
        class270 var8 = new class270();
        var8.field4743 = arg3;
        var8.field4502 = arg4;
        var8.field1743 = var6;
        if (arg4) {
            if (this.method355(true) >= 20) {
                throw new RuntimeException();
            }
            this.field894.method535(var8, (byte) -113);
        } else if (this.method360(-75) < 20) {
            this.field901.method535(var8, (byte) -126);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Z")
    public final boolean method365(int arg0) {
        if (arg0 < 53) {
            this.method365(5);
        }
        field903++;
        return this.method355(true) >= 20;
    }
}
