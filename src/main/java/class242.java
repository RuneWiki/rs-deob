import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class242 {

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Ljg;")
    private class177 field3846 = new class177();

    @OriginalMember(owner = "client!md", name = "z", descriptor = "Ljg;")
    private class177 field3848 = new class177();

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Ljg;")
    private class177 field3849 = new class177();

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Ljg;")
    private class177 field3850 = new class177();

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lma;")
    private class202 field3851 = new class202(4);

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public volatile int field3858 = 0;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "B")
    private byte field3855 = 0;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public volatile int field3856 = 0;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Lma;")
    private class202 field3857 = new class202(8);

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field3837 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "C")
    public static char field3823;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    private int field3852;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "J")
    private long field3854;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lqm;")
    private class189 field3853;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Lpf;")
    private class311 field3859;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[I")
    public static int[] field3835;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "[[B")
    public static byte[][] field3841;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "[[[I")
    public static int[][][] field3842;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method1689(int arg0) {
        if (arg0 > -105) {
            field3835 = null;
        }
        field3841 = null;
        field3842 = null;
        field3835 = null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z")
    public final boolean method1690(int arg0) {
        if (this.field3853 != null) {
            long var2 = class267.method1841((byte) 126);
            int var4 = (int) (var2 - this.field3854);
            this.field3854 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3852 += var4;
            if (this.field3852 > 30000) {
                try {
                    this.field3853.method1277(false);
                } catch (Exception var27) {
                }
                this.field3853 = null;
            }
        }
        field3845++;
        if (this.field3853 == null) {
            return this.method1696((byte) 125) == 0 && this.method1695(false) == 0;
        }
        try {
            this.field3853.method1278(true);
            if (arg0 <= 41) {
                return true;
            }
            for (class311 var5 = (class311) this.field3846.method1187((byte) 127); var5 != null; var5 = (class311) this.field3846.method1186(true)) {
                this.field3851.field3272 = 0;
                this.field3851.method1446((byte) 80, 1);
                this.field3851.method1422(-17037, (int) var5.field2552);
                this.field3853.method1275(0, true, 4, this.field3851.field3234);
                this.field3848.method1190(8217, var5);
            }
            for (class311 var6 = (class311) this.field3849.method1187((byte) 127); var6 != null; var6 = (class311) this.field3849.method1186(true)) {
                this.field3851.field3272 = 0;
                this.field3851.method1446((byte) 66, 0);
                this.field3851.method1422(-17037, (int) var6.field2552);
                this.field3853.method1275(0, true, 4, this.field3851.field3234);
                this.field3850.method1190(8217, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3853.method1283((byte) -57);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3852 = 0;
                byte var9 = 0;
                if (this.field3859 == null) {
                    var9 = 8;
                } else if (this.field3859.field5032 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3859.field5024.field3234.length - this.field3859.field5023;
                    int var11 = 512 - this.field3859.field5032;
                    if (var11 > (var10 - this.field3859.field5024.field3272)) {
                        var11 = var10 - this.field3859.field5024.field3272;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field3853.method1280(true, var11, this.field3859.field5024.field3272, this.field3859.field5024.field3234);
                    if (this.field3855 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3859.field5024.field3234[this.field3859.field5024.field3272 + var12] = (byte) class93.method605(this.field3859.field5024.field3234[this.field3859.field5024.field3272 + var12], this.field3855);
                        }
                    }
                    this.field3859.field5032 += var11;
                    this.field3859.field5024.field3272 += var11;
                    if (this.field3859.field5024.field3272 == var10) {
                        this.field3859.method1075(7596);
                        this.field3859.field338 = false;
                        this.field3859 = null;
                    } else if (this.field3859.field5032 == 512) {
                        this.field3859.field5032 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3857.field3272;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3853.method1280(true, var13, this.field3857.field3272, this.field3857.field3234);
                    if (this.field3855 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3857.field3234[this.field3857.field3272 + var14] = (byte) class93.method605(this.field3857.field3234[this.field3857.field3272 + var14], this.field3855);
                        }
                    }
                    this.field3857.field3272 += var13;
                    if (var9 <= this.field3857.field3272) {
                        if (this.field3859 == null) {
                            this.field3857.field3272 = 0;
                            int var15 = this.field3857.method1420((byte) 0);
                            int var16 = this.field3857.method1419(81);
                            int var17 = this.field3857.method1420((byte) 0);
                            int var18 = this.field3857.method1440(20404);
                            int var19 = var17 & 0x7F;
                            long var20 = (long) ((var15 << 16) + var16);
                            boolean var22 = (var17 & 0x80) != 0;
                            Object var23 = null;
                            class311 var24;
                            if (var22) {
                                for (var24 = (class311) this.field3850.method1187((byte) 127); var24 != null && var24.field2552 != var20; var24 = (class311) this.field3850.method1186(true)) {
                                }
                            } else {
                                for (var24 = (class311) this.field3848.method1187((byte) 127); var24 != null && var24.field2552 != var20; var24 = (class311) this.field3848.method1186(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3859 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field3859.field5024 = new class202(var18 - (-var25 - this.field3859.field5023));
                            this.field3859.field5024.method1446((byte) 86, var19);
                            this.field3859.field5024.method1425(var18, (byte) -124);
                            this.field3859.field5032 = 8;
                            this.field3857.field3272 = 0;
                        } else if (this.field3859.field5032 != 0) {
                            throw new IOException();
                        } else if (this.field3857.field3234[0] == -1) {
                            this.field3859.field5032 = 1;
                            this.field3857.field3272 = 0;
                        } else {
                            this.field3859 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3853.method1277(false);
            } catch (Exception var26) {
            }
            this.field3856 = -2;
            this.field3858++;
            this.field3853 = null;
            return this.method1696((byte) 125) == 0 && this.method1695(false) == 0;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public final void method1691(byte arg0) {
        if (this.field3853 != null) {
            this.field3853.method1274(-1);
        }
        field3826++;
        if (arg0 != -11) {
            this.method1703((byte) 122);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZIBI)Lpf;")
    public final class311 method1692(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field3838++;
        long var6 = (long) ((arg2 << 16) + arg0);
        class311 var8 = new class311();
        var8.field2552 = var6;
        var8.field5023 = arg3;
        var8.field337 = arg1;
        if (arg1) {
            if (this.method1696((byte) 125) >= 20) {
                throw new RuntimeException();
            }
            this.field3846.method1190(8217, var8);
        } else if (this.method1695(false) < 20) {
            this.field3849.method1190(8217, var8);
        } else {
            throw new RuntimeException();
        }
        return arg4 == 17819 ? var8 : null;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)Z")
    public final boolean method1693(byte arg0) {
        if (arg0 != -72) {
            field3823 = 'y';
        }
        field3828++;
        return this.method1696((byte) 125) >= 20;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    private final void method1694(int arg0) {
        field3834++;
        if (this.field3853 == null) {
            return;
        }
        try {
            this.field3851.field3272 = arg0;
            this.field3851.method1446((byte) 120, 6);
            this.field3851.method1422(-17037, 3);
            this.field3853.method1275(0, true, 4, this.field3851.field3234);
        } catch (IOException var3) {
            try {
                this.field3853.method1277(false);
            } catch (Exception var2) {
            }
            this.field3856 = -2;
            this.field3853 = null;
            this.field3858++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)I")
    private final int method1695(boolean arg0) {
        if (arg0) {
            return -56;
        } else {
            field3839++;
            return this.field3849.method1189(0) + this.field3850.method1189(0);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)I")
    public final int method1696(byte arg0) {
        field3843++;
        if (arg0 != 125) {
            this.method1698(true, (byte) -111, (class189) null);
        }
        return this.field3846.method1189(arg0 ^ 0x7D) + this.field3848.method1189(0);
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V")
    public final void method1697(byte arg0) {
        if (arg0 != -8) {
            this.method1691((byte) 37);
        }
        field3827++;
        if (this.field3853 != null) {
            this.field3853.method1277(false);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZBLqm;)V")
    public final void method1698(boolean arg0, byte arg1, class189 arg2) {
        if (this.field3853 != null) {
            try {
                this.field3853.method1277(false);
            } catch (Exception var8) {
            }
            this.field3853 = null;
        }
        field3824++;
        if (arg1 != -30) {
            field3830 = 106;
        }
        this.field3853 = arg2;
        this.method1694(0);
        this.method1705(true, arg0);
        this.field3859 = null;
        this.field3857.field3272 = 0;
        while (true) {
            class311 var4 = (class311) this.field3848.method1185(-8241);
            if (var4 == null) {
                while (true) {
                    class311 var5 = (class311) this.field3850.method1185(-8241);
                    if (var5 == null) {
                        if (this.field3855 != 0) {
                            try {
                                this.field3851.field3272 = 0;
                                this.field3851.method1446((byte) 34, 4);
                                this.field3851.method1446((byte) 78, this.field3855);
                                this.field3851.method1412(0, false);
                                this.field3853.method1275(0, true, 4, this.field3851.field3234);
                            } catch (IOException var7) {
                                try {
                                    this.field3853.method1277(false);
                                } catch (Exception var6) {
                                }
                                this.field3856 = -2;
                                this.field3858++;
                                this.field3853 = null;
                            }
                        }
                        this.field3852 = 0;
                        this.field3854 = class267.method1841((byte) 113);
                        return;
                    }
                    this.field3849.method1190(8217, var5);
                }
            }
            this.field3846.method1190(8217, var4);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1699(Component arg0, int arg1) {
        arg0.removeKeyListener(class73.field1080);
        arg0.removeFocusListener(class73.field1080);
        class230.field3665 = arg1;
        field3840++;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Z")
    public final boolean method1700(int arg0) {
        if (arg0 != -1) {
            field3837 = 67;
        }
        field3844++;
        return this.method1695(false) >= 20;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(B)I")
    public static final int method1701(byte arg0) {
        field3829++;
        return arg0 == 53 ? class312.field5035 : 91;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZB)V")
    public static final void method1702(boolean arg0, byte arg1) {
        field3847++;
        byte[][] var2 = class225.field3574;
        byte var3 = 4;
        if (arg1 != 107) {
            return;
        }
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class53.field718[var5] & 0xFF;
            int var14 = var13 * 64 - class254.field4063;
            int var15 = class53.field718[var5] >> 8;
            int var16 = var15 * 64 - class101.field1517;
            if (var12 != null) {
                class217.method1521(1);
                var11 = class160.method1063(var12, class183.field2841, (byte) 78, var16, class254.field4063, arg0, class101.field1517, var14);
            }
            if (!arg0 && (class113.field1711 / 8) == var15 && class266.field4370 / 8 == var13) {
                if (var11 == null) {
                    class40.field496 = -1;
                } else {
                    class102.field1544 = var11[2];
                    class197.field3127 = var11[1];
                    class203.field3284 = var11[4];
                    class164.field2589 = var11[3];
                    class40.field496 = var11[0];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class53.field718[var6] >> 8) * 64 - class101.field1517;
            int var8 = (class53.field718[var6] & 0xFF) * 64 - class254.field4063;
            byte[] var9 = var2[var6];
            if (var9 == null && class266.field4370 < 800) {
                class217.method1521(1);
                for (int var10 = 0; var10 < var3; var10++) {
                    class151.method1001(var10, var7, true, var8, 64, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(B)V")
    public final void method1703(byte arg0) {
        field3833++;
        try {
            this.field3853.method1277(false);
        } catch (Exception var3) {
        }
        this.field3853 = null;
        int var2 = -7 % ((15 - arg0) / 39);
        this.field3855 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3858++;
        this.field3856 = -1;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)V")
    public final void method1704(boolean arg0) {
        field3825++;
        if (this.field3853 == null) {
            return;
        }
        try {
            this.field3851.field3272 = 0;
            this.field3851.method1446((byte) 118, 7);
            this.field3851.method1422(-17037, 0);
            this.field3853.method1275(0, arg0, 4, this.field3851.field3234);
        } catch (IOException var3) {
            try {
                this.field3853.method1277(false);
            } catch (Exception var2) {
            }
            this.field3858++;
            this.field3856 = -2;
            this.field3853 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZZ)V")
    public final void method1705(boolean arg0, boolean arg1) {
        field3832++;
        if (this.field3853 == null) {
            return;
        }
        try {
            this.field3851.field3272 = 0;
            this.field3851.method1446((byte) 74, arg1 ? 2 : 3);
            this.field3851.method1422(-17037, 0);
            this.field3853.method1275(0, arg0, 4, this.field3851.field3234);
        } catch (IOException var4) {
            try {
                this.field3853.method1277(false);
            } catch (Exception var3) {
            }
            this.field3856 = -2;
            this.field3853 = null;
            this.field3858++;
        }
    }
}
