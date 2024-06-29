import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class297 {

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Ldm;")
    private class98 field3872 = new class98();

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Ldm;")
    private class98 field3876 = new class98();

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Ldm;")
    private class98 field3877 = new class98();

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Ldm;")
    private class98 field3878 = new class98();

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lvj;")
    private class26 field3881 = new class26(4);

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "B")
    private byte field3883 = 0;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public volatile int field3884 = 0;

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "I")
    public volatile int field3886 = 0;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Lvj;")
    private class26 field3885 = new class26(8);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3864;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    private int field3882;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
    private long field3879;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Lor;")
    private class325 field3880;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "Lab;")
    private class651 field3887;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)I")
    private final int method1742(int arg0) {
        field3867++;
        return arg0 <= 75 ? -95 : this.field3877.method660((byte) 77) + this.field3878.method660((byte) 77);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public final void method1743(boolean arg0, byte arg1) {
        field3864++;
        if (this.field3880 == null) {
            return;
        }
        if (arg1 >= -58) {
            this.field3879 = 33L;
        }
        try {
            this.field3881.field330 = 0;
            this.field3881.method184(arg0 ? 2 : 3, -34);
            this.field3881.method176(0, (byte) -26);
            this.field3880.method1904(4, (byte) 39, this.field3881.field279, 0);
        } catch (IOException var4) {
            try {
                this.field3880.method1903((byte) 124);
            } catch (Exception var3) {
            }
            this.field3884++;
            this.field3880 = null;
            this.field3886 = -2;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)Z")
    public final boolean method1744(boolean arg0) {
        field3865++;
        if (this.field3880 != null) {
            long var2 = class224.method1457((byte) -62);
            int var4 = (int) (var2 - this.field3879);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3879 = var2;
            this.field3882 += var4;
            if (this.field3882 > 30000) {
                try {
                    this.field3880.method1903((byte) 115);
                } catch (Exception var27) {
                }
                this.field3880 = null;
            }
        }
        if (this.field3880 == null) {
            return this.method1752((byte) 102) == 0 && this.method1742(122) == 0;
        }
        try {
            this.field3880.method1902(true);
            for (class651 var5 = (class651) this.field3872.method667(arg0); var5 != null; var5 = (class651) this.field3872.method662((byte) 126)) {
                this.field3881.field330 = 0;
                this.field3881.method184(1, -118);
                this.field3881.method176((int) var5.field3778, (byte) 122);
                this.field3880.method1904(4, (byte) 39, this.field3881.field279, 0);
                this.field3876.method666(8192, var5);
            }
            for (class651 var6 = (class651) this.field3877.method667(arg0); var6 != null; var6 = (class651) this.field3877.method662((byte) -113)) {
                this.field3881.field330 = 0;
                this.field3881.method184(0, -45);
                this.field3881.method176((int) var6.field3778, (byte) 124);
                this.field3880.method1904(4, (byte) 39, this.field3881.field279, 0);
                this.field3878.method666(8192, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3880.method1905(!arg0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3882 = 0;
                byte var9 = 0;
                if (this.field3887 == null) {
                    var9 = 8;
                } else if (this.field3887.field9204 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3885.field330;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field3880.method1897(var10, this.field3885.field330, (byte) 12, this.field3885.field279);
                    if (this.field3883 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3885.field279[this.field3885.field330 + var11] = (byte) class450.method2703(this.field3885.field279[this.field3885.field330 + var11], this.field3883);
                        }
                    }
                    this.field3885.field330 += var10;
                    if (this.field3885.field330 >= var9) {
                        if (this.field3887 == null) {
                            this.field3885.field330 = 0;
                            int var12 = this.field3885.method194((byte) 119);
                            int var13 = this.field3885.method193(2);
                            int var14 = this.field3885.method194((byte) 119);
                            int var15 = this.field3885.method189(255);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class651 var21;
                            if (var17) {
                                for (var21 = (class651) this.field3878.method667(true); var21 != null && var21.field3778 != var18; var21 = (class651) this.field3878.method662((byte) 126)) {
                                }
                            } else {
                                for (var21 = (class651) this.field3876.method667(true); var21 != null && var21.field3778 != var18; var21 = (class651) this.field3876.method662((byte) 127)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3887 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3887.field9199 = new class26(this.field3887.field9203 + var15 + var22);
                            this.field3887.field9199.method184(var16, -73);
                            this.field3887.field9199.method199(true, var15);
                            this.field3885.field330 = 0;
                            this.field3887.field9204 = 8;
                        } else if (this.field3887.field9204 != 0) {
                            throw new IOException();
                        } else if (this.field3885.field279[0] == -1) {
                            this.field3887.field9204 = 1;
                            this.field3885.field330 = 0;
                        } else {
                            this.field3887 = null;
                        }
                    }
                } else {
                    int var23 = this.field3887.field9199.field279.length - this.field3887.field9203;
                    int var24 = 512 - this.field3887.field9204;
                    if (var24 > var23 - this.field3887.field9199.field330) {
                        var24 = var23 - this.field3887.field9199.field330;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field3880.method1897(var24, this.field3887.field9199.field330, (byte) 12, this.field3887.field9199.field279);
                    if (this.field3883 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3887.field9199.field279[this.field3887.field9199.field330 + var25] = (byte) class450.method2703(this.field3887.field9199.field279[this.field3887.field9199.field330 + var25], this.field3883);
                        }
                    }
                    this.field3887.field9199.field330 += var24;
                    this.field3887.field9204 += var24;
                    if (this.field3887.field9199.field330 == var23) {
                        this.field3887.method1706((byte) 79);
                        this.field3887.field846 = false;
                        this.field3887 = null;
                    } else if (this.field3887.field9204 == 512) {
                        this.field3887.field9204 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3880.method1903((byte) 122);
            } catch (Exception var26) {
            }
            this.field3880 = null;
            this.field3884++;
            this.field3886 = -2;
            return this.method1752((byte) -99) == 0 && this.method1742(124) == 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method1745(int arg0) {
        try {
            this.field3880.method1903((byte) 112);
        } catch (Exception var2) {
        }
        field3868++;
        this.field3883 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3886 = arg0;
        this.field3880 = null;
        this.field3884++;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
    public final boolean method1746(int arg0) {
        if (arg0 != 1) {
            this.method1753(45, 2, false, (byte) 45, 101);
        }
        field3874++;
        return this.method1752((byte) 122) >= 20;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILor;Z)V")
    public final void method1747(int arg0, class325 arg1, boolean arg2) {
        field3875++;
        if (this.field3880 != null) {
            try {
                this.field3880.method1903((byte) 124);
            } catch (Exception var8) {
            }
            this.field3880 = null;
        }
        this.field3880 = arg1;
        this.method1748((byte) 39);
        this.method1743(arg2, (byte) -74);
        this.field3887 = null;
        this.field3885.field330 = 0;
        while (true) {
            class651 var4 = (class651) this.field3876.method665((byte) -55);
            if (var4 == null) {
                while (true) {
                    class651 var5 = (class651) this.field3878.method665((byte) -55);
                    if (var5 == null) {
                        if (this.field3883 != 0) {
                            try {
                                this.field3881.field330 = 0;
                                this.field3881.method184(4, -59);
                                this.field3881.method184(this.field3883, -41);
                                this.field3881.method147((byte) 53, 0);
                                this.field3880.method1904(4, (byte) 39, this.field3881.field279, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3880.method1903((byte) 121);
                                } catch (Exception var6) {
                                }
                                this.field3884++;
                                this.field3886 = -2;
                                this.field3880 = null;
                            }
                        }
                        if (arg0 >= -125) {
                            return;
                        } else {
                            this.field3882 = 0;
                            this.field3879 = class224.method1457((byte) -62);
                            return;
                        }
                    }
                    this.field3877.method666(8192, var5);
                }
            }
            this.field3872.method666(8192, var4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    private final void method1748(byte arg0) {
        field3862++;
        if (this.field3880 == null) {
            return;
        }
        try {
            this.field3881.field330 = 0;
            this.field3881.method184(6, -112);
            this.field3881.method176(3, (byte) -98);
            this.field3880.method1904(4, arg0, this.field3881.field279, 0);
        } catch (IOException var3) {
            try {
                this.field3880.method1903((byte) 118);
            } catch (Exception var2) {
            }
            this.field3880 = null;
            this.field3886 = -2;
            this.field3884++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public final void method1749(byte arg0) {
        if (arg0 != 24) {
            this.field3880 = null;
        }
        field3863++;
        if (this.field3880 == null) {
            return;
        }
        try {
            this.field3881.field330 = 0;
            this.field3881.method184(7, -95);
            this.field3881.method176(0, (byte) -43);
            this.field3880.method1904(4, (byte) 39, this.field3881.field279, 0);
        } catch (IOException var3) {
            try {
                this.field3880.method1903((byte) 127);
            } catch (Exception var2) {
            }
            this.field3884++;
            this.field3886 = -2;
            this.field3880 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    public final void method1750(int arg0) {
        field3873++;
        if (this.field3880 != null) {
            this.field3880.method1900(69);
        }
        if (arg0 > -41) {
            this.method1751(-80);
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final void method1751(int arg0) {
        if (this.field3880 != null) {
            this.field3880.method1903((byte) 120);
        }
        if (arg0 != 4) {
            this.field3886 = -104;
        }
        field3866++;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)I")
    public final int method1752(byte arg0) {
        field3869++;
        int var2 = 119 % ((23 - arg0) / 56);
        return this.field3872.method660((byte) 77) + this.field3876.method660((byte) 77);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIZBI)Lab;")
    public final class651 method1753(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field3870++;
        long var6 = (long) ((arg4 << 16) + arg0);
        if (arg1 != 4) {
            return null;
        }
        class651 var8 = new class651();
        var8.field3778 = var6;
        var8.field843 = arg2;
        var8.field9203 = arg3;
        if (arg2) {
            if (this.method1752((byte) 104) >= 20) {
                throw new RuntimeException();
            }
            this.field3872.method666(8192, var8);
        } else if (this.method1742(91) < 20) {
            this.field3877.method666(8192, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
    public final boolean method1754(int arg0) {
        if (arg0 == 0) {
            field3871++;
            return this.method1742(arg0 + 83) >= 20;
        } else {
            return true;
        }
    }
}
