import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class271 extends class155 {

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Z")
    public boolean field3696;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
    public boolean field3694;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "[S")
    public short[] field3697;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    private int field3695;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!cg", name = "Q", descriptor = "[I")
    public static int[] field3709;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    private int field3701;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    private int field3705;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    private int field3706;

    @OriginalMember(owner = "client!cg", name = "O", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field3710;

    static {
        new class368("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3709 = new int[6];
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)V", line = 10)
    public final void method1719(int arg0, int arg1, boolean arg2) {
        ++field3700;
        int var6;
        if (!arg2) {
            int var4 = this.field3695 - -(this.field3701 * arg0 / 50) & 2047;
            int var5 = this.field3706;
            if (var5 != 1) {
                if (~var5 != -4) {
                    if (var5 != 4) {
                        if (~var5 != -3) {
                            if (var5 == 5) {
                                var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
                            } else {
                                var6 = 2048;
                            }
                        } else {
                            var6 = var4;
                        }
                    } else {
                        var6 = var4 >> 10 << 11;
                    }
                } else {
                    var6 = class316.field4280[var4] >> 1;
                }
            } else {
                var6 = (class136.field2021[var4 << 3] >> 5) + 1024;
            }
        } else {
            var6 = 2048;
        }
        super.field2209 = (float) ((this.field3703 * var6 >> 11) + this.field3705) / 2048.0F;
        if (arg1 != 0) {
            this.field3695 = -2;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V", line = 90)
    public static void method1720(boolean arg0) {
        field3710 = null;
        if (arg0) {
            method1723((class58) null, (class216) null, -70, -2, -9);
        }
        field3709 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lea;JB)V", line = 102)
    public static final void method1721(class58 arg0, long arg1, byte arg2) {
        ++field3698;
        class140.field2050 = 0;
        if (arg2 == -86) {
            class249.field3495 = class354.field4767;
            class354.field4767 = 0;
            long var4 = class199.method1372(30938);
            for (class240 var6 = (class240) class337.field4558.method2480(7904); var6 != null; var6 = (class240) class337.field4558.method2482(50)) {
                if (var6.method1562(arg0, arg1)) {
                    ++class140.field2050;
                }
            }
            if (class302.field4118 && arg1 % 100L == 0L) {
                System.out.println("Particle system count: " + class337.field4558.method2481(-15824) + ", running: " + class140.field2050 + ". Particles: " + class354.field4767 + ". Time taken: " + (class199.method1372(arg2 + 31024) + -var4) + "ms");
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V", line = 149)
    private final void method1722(int arg0) {
        ++field3699;
        if (arg0 != 974345667) {
            method1723((class58) null, (class216) null, 74, 88, -93);
        }
        int var2 = this.field3704;
        if (var2 != 2) {
            if (~var2 != -4) {
                if (~var2 != -5) {
                    if (var2 != 5) {
                        if (var2 != 12) {
                            if (~var2 != -14) {
                                if (var2 != 10) {
                                    if (var2 != 11) {
                                        if (~var2 != -7) {
                                            if (var2 != 7) {
                                                if (var2 != 8) {
                                                    if (~var2 != -10) {
                                                        if (~var2 != -15) {
                                                            if (var2 != 15) {
                                                                if (~var2 == -17) {
                                                                    this.field3705 = 1792;
                                                                    this.field3703 = 256;
                                                                    this.field3701 = 8192;
                                                                    this.field3706 = 1;
                                                                } else {
                                                                    this.field3705 = 0;
                                                                    this.field3701 = 2048;
                                                                    this.field3703 = 2048;
                                                                    this.field3706 = 0;
                                                                }
                                                            } else {
                                                                this.field3705 = 1536;
                                                                this.field3703 = 512;
                                                                this.field3701 = 4096;
                                                                this.field3706 = 1;
                                                            }
                                                        } else {
                                                            this.field3705 = 1280;
                                                            this.field3706 = 1;
                                                            this.field3703 = 768;
                                                            this.field3701 = 2048;
                                                        }
                                                    } else {
                                                        this.field3706 = 3;
                                                        this.field3701 = 4096;
                                                        this.field3705 = 1024;
                                                        this.field3703 = 1024;
                                                    }
                                                } else {
                                                    this.field3705 = 1024;
                                                    this.field3706 = 3;
                                                    this.field3701 = 2048;
                                                    this.field3703 = 1024;
                                                }
                                            } else {
                                                this.field3705 = 1280;
                                                this.field3701 = 4096;
                                                this.field3703 = 768;
                                                this.field3706 = 3;
                                            }
                                        } else {
                                            this.field3706 = 3;
                                            this.field3703 = 768;
                                            this.field3701 = 2048;
                                            this.field3705 = 1280;
                                        }
                                    } else {
                                        this.field3703 = 512;
                                        this.field3706 = 3;
                                        this.field3701 = 4096;
                                        this.field3705 = 1536;
                                    }
                                } else {
                                    this.field3706 = 3;
                                    this.field3703 = 512;
                                    this.field3705 = 1536;
                                    this.field3701 = 2048;
                                }
                            } else {
                                this.field3705 = 0;
                                this.field3706 = 2;
                                this.field3703 = 2048;
                                this.field3701 = 8192;
                            }
                        } else {
                            this.field3703 = 2048;
                            this.field3706 = 2;
                            this.field3705 = 0;
                            this.field3701 = 2048;
                        }
                    } else {
                        this.field3703 = 2048;
                        this.field3701 = 8192;
                        this.field3706 = 4;
                        this.field3705 = 0;
                    }
                } else {
                    this.field3705 = 0;
                    this.field3706 = 4;
                    this.field3703 = 2048;
                    this.field3701 = 2048;
                }
            } else {
                this.field3701 = 4096;
                this.field3705 = 0;
                this.field3703 = 2048;
                this.field3706 = 1;
            }
        } else {
            this.field3705 = 0;
            this.field3703 = 2048;
            this.field3701 = 2048;
            this.field3706 = 1;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lea;Lac;III)V", line = 351)
    public static final void method1723(class58 arg0, class216 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class284.field3862) {
            class63 var5 = class341.field4617[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field854 != null && var5.field854.method697(127)) {
                arg1.method699(22546, 128, arg0, var5.field854, true, 0, 0);
            }
        }
        if (arg4 < class284.field3862) {
            class63 var6 = class341.field4617[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field854 != null && var6.field854.method697(126)) {
                arg1.method699(22546, 0, arg0, var6.field854, true, 128, 0);
            }
        }
        if (arg3 < class284.field3862 && arg4 < class354.field4768) {
            class63 var7 = class341.field4617[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field854 != null && var7.field854.method697(119)) {
                arg1.method699(22546, 128, arg0, var7.field854, true, 128, 0);
            }
        }
        if (arg3 < class284.field3862 && arg4 > 0) {
            class63 var8 = class341.field4617[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field854 != null && var8.field854.method697(121)) {
                arg1.method699(22546, 128, arg0, var8.field854, true, -128, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V", line = 397)
    public final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3705 = arg1;
        this.field3701 = arg3;
        if (arg4 < 103) {
            field3702 = -125;
        }
        ++field3707;
        this.field3703 = arg0;
        this.field3706 = arg2;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 411)
    protected class271() {
        if (class316.field4280 == null) {
            class309.method1867(true);
        }
        this.method1722(974345667);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lrg;)V", line = 429)
    public class271(class366 arg0) {
        if (class316.field4280 == null) {
            class309.method1867(true);
        }
        this.field3708 = arg0.method2306((byte) 68);
        this.field3696 = (8 & this.field3708) != 0;
        this.field3694 = (this.field3708 & 16) != 0;
        this.field3708 &= 7;
        super.field2204 = arg0.method2297(13352);
        super.field2212 = arg0.method2297(13352);
        super.field2205 = arg0.method2297(13352);
        super.field2206 = arg0.method2306((byte) 29);
        int var2 = super.field2206 * 2 + 1;
        this.field3697 = new short[var2];
        for (int var3 = 0; ~this.field3697.length < ~var3; ++var3) {
            short var5 = (short) arg0.method2297(13352);
            int var6 = var5 >>> 8;
            if (var6 >= var2) {
                var6 = var2 + -1;
            }
            int var7 = 255 & var5;
            if (~(-var6 + var2) > ~var7) {
                var7 = -var6 + var2;
            }
            this.field3697[var3] = (short) class431.method2655(var7, var6 << 8);
        }
        super.field2206 = (super.field2206 << 7) + 64;
        if (class21.field273 != null) {
            super.field2203 = class21.field273[arg0.method2297(13352)];
        } else {
            super.field2203 = class119.field1810[65535 & class408.method2524(arg0.method2297(13352), 127)];
        }
        int var4 = arg0.method2306((byte) 28);
        this.field3704 = var4 & 31;
        this.field3695 = var4 << 3 & 1792;
        if (~this.field3704 != -32) {
            this.method1722(974345667);
        }
    }
}
