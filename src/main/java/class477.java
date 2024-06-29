import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class477 extends class303 {

    @OriginalMember(owner = "client!qf", name = "Pb", descriptor = "Lgf;")
    public static class180 field7007 = new class180("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!qf", name = "Hb", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!qf", name = "Jb", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!qf", name = "Kb", descriptor = "I")
    private int field7002;

    @OriginalMember(owner = "client!qf", name = "Lb", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!qf", name = "Mb", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!qf", name = "Nb", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!qf", name = "Ob", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!qf", name = "Qb", descriptor = "I")
    public static int field7008;

    @OriginalMember(owner = "client!qf", name = "Rb", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!qf", name = "Sb", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!qf", name = "Tb", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!qf", name = "Ub", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!qf", name = "Vb", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!qf", name = "Wb", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!qf", name = "Xb", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!qf", name = "Yb", descriptor = "Lpu;")
    private class393 field7016;

    @OriginalMember(owner = "client!qf", name = "Ib", descriptor = "[S")
    public static short[] field7000;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "(B)I")
    public final int method2846(byte arg0) {
        int var2 = -31 % ((-6 - arg0) / 56);
        ++field7012;
        int var3 = super.field4326[super.field4333++] - this.field7016.method2459((byte) -74) & 255;
        return var3 < 128 ? var3 : (var3 + -128 << 8) + (255 & super.field4326[super.field4333++] - this.field7016.method2459((byte) -96));
    }

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "(II)I")
    public final int method2847(int arg0, int arg1) {
        int var3 = -102 % ((arg0 - 58) / 45);
        ++field6999;
        int var4 = this.field7002 >> 3;
        int var5 = -(this.field7002 & 7) + 8;
        this.field7002 += arg1;
        int var6 = 0;
        while (~var5 > ~arg1) {
            var6 += (class225.field3285[var5] & super.field4326[var4++]) << -var5 + arg1;
            arg1 -= var5;
            var5 = 8;
        }
        int var7;
        if (~arg1 != ~var5) {
            var7 = (super.field4326[var4] >> -arg1 + var5 & class225.field3285[arg1]) + var6;
        } else {
            var7 = (super.field4326[var4] & class225.field3285[var5]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "(I)V")
    public static void method2848(int arg0) {
        field7000 = null;
        if (arg0 != -1) {
            field7000 = null;
        }
        field7007 = null;
    }

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "(I)V")
    public final void method2849(int arg0) {
        ++field7001;
        if (arg0 <= 26) {
            this.method2856(33, 106);
        }
        super.field4333 = (this.field7002 + 7) / 8;
    }

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "(B)Z")
    public final boolean method2850(byte arg0) {
        ++field7011;
        if (arg0 >= -76) {
            this.field7016 = null;
        }
        int var2 = super.field4326[super.field4333] - this.field7016.method2460(100) & 255;
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "(B)V")
    public static final void method2851(byte arg0) {
        class455.field6737.method2349(0);
        if (arg0 < -108) {
            ++field7013;
        }
    }

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "(II)V")
    public final void method2852(int arg0, int arg1) {
        super.field4326[super.field4333++] = (byte) (this.field7016.method2459((byte) -23) + arg1);
        if (arg0 <= 42) {
            field7007 = null;
        }
        ++field7006;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lhh;B)V")
    public static final void method2853(class84 arg0, byte arg1) {
        class223.field3227 = arg0;
        if (arg1 != 92) {
            field7007 = null;
        }
        ++field7008;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(III)I")
    public static final int method2854(int arg0, int arg1, int arg2) {
        ++field7014;
        if (~arg1 == 0) {
            return 12345678;
        } else if (arg0 != -19752) {
            return -52;
        } else {
            int var3 = (arg1 & 127) * arg2 >> 7;
            if (~var3 <= -3) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (65408 & arg1) + var3;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V")
    public class477(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "(I)V")
    public static final void method2855(int arg0) {
        ++field7015;
        int var1 = 0;
        if (arg0 <= 46) {
            field7007 = null;
        }
        while (var1 < class109.field1692) {
            int var2 = class305.field4371[var1];
            class13 var3 = class132.field2030[var2];
            int var4 = class387.field5738.method1918((byte) 123);
            if ((4 & var4) != 0) {
                var4 += class387.field5738.method1918((byte) -123) << 8;
            }
            if ((64 & var4) != 0) {
                int var5 = class387.field5738.method1891(false);
                int var6 = class387.field5738.method1894(255);
                var3.method181(98, class180.field2734, var5, var6);
            }
            if (~(var4 & 8) != -1) {
                int var7 = class387.field5738.method1891(false);
                int var8 = class387.field5738.method1918((byte) 100);
                var3.method181(102, class180.field2734, var7, var8);
                var3.field336 = class180.field2734 + 300;
                var3.field354 = class387.field5738.method1861((byte) 111);
            }
            if ((var4 & 16) != 0) {
                int var9 = class387.field5738.method1868(0);
                if (~var9 == -65536) {
                    var9 = -1;
                }
                int var10 = class387.field5738.method1861((byte) 111);
                class119.method867(var10, var3, var9, (byte) 22);
            }
            if ((var4 & 2048) != 0) {
                int var11 = class387.field5738.method1894(255);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                int[] var14 = new int[var11];
                for (int var15 = 0; var15 < var11; ++var15) {
                    int var16 = class387.field5738.method1903((byte) 46);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    var12[var15] = var16;
                    var13[var15] = class387.field5738.method1861((byte) 111);
                    var14[var15] = class387.field5738.method1903((byte) -125);
                }
                class133.method988((byte) -90, var12, var13, var14, var3);
            }
            if (~(var4 & 256) != -1) {
                int var17 = class387.field5738.method1903((byte) -126);
                var3.field403 = class387.field5738.method1894(255);
                var3.field382 = class387.field5738.method1861((byte) 111);
                var3.field384 = (var17 & 32768) != 0;
                var3.field341 = var17 & 32767;
                var3.field325 = class180.field2734 - -var3.field403 + var3.field341;
            }
            if ((var4 & 128) != 0) {
                if (var3.field210.method1053((byte) -25)) {
                    class62.method554(var3, (byte) -115);
                }
                var3.method119(class500.field7358.method1605((byte) -117, class387.field5738.method1869((byte) 82)), 0);
                var3.method195(var3.field210.field2214, (byte) 2);
                var3.field385 = var3.field210.field2210 << 3;
                if (var3.field210.method1053((byte) -25)) {
                    class428.method2610(var3.field5538, var3, var3.field409[0], (byte) 113, (class510) null, 0, (class62) null, var3.field416[0]);
                }
            }
            if (~(var4 & 2) != -1) {
                var3.field350 = class387.field5738.method1879(30669);
                var3.field344 = 100;
            }
            if ((8192 & var4) != 0) {
                var3.field232 = class387.field5738.method1888((byte) 103);
                var3.field229 = class387.field5738.method1903((byte) 20);
            }
            if (~(var4 & 1024) != -1) {
                int var18 = class387.field5738.method1903((byte) 113);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class387.field5738.method1898(95);
                int var20 = class387.field5738.method1894(255);
                var3.method185(var18, var19, var20, true, false);
            }
            if (~(4096 & var4) != -1) {
                var3.field356 = class387.field5738.method1922((byte) -107);
                var3.field315 = class387.field5738.method1899((byte) -118);
                var3.field368 = class387.field5738.method1884((byte) -127);
                var3.field397 = (byte) class387.field5738.method1864(16698);
                var3.field309 = class180.field2734 - -class387.field5738.method1868(0);
                var3.field364 = class180.field2734 + class387.field5738.method1888((byte) 106);
            }
            if (~(1 & var4) != -1) {
                int var21 = class387.field5738.method1903((byte) -127);
                int var22 = class387.field5738.method1870(-1945262512);
                if (var21 == 65535) {
                    var21 = -1;
                }
                int var23 = class387.field5738.method1894(255);
                var3.method185(var21, var22, var23, false, false);
            }
            if (~(32 & var4) != -1) {
                var3.field355 = class387.field5738.method1869((byte) 93);
                if (var3.field355 == 65535) {
                    var3.field355 = -1;
                }
            }
            if ((var4 & 512) != 0) {
                var3.field374 = class387.field5738.method1884((byte) -128);
                var3.field312 = class387.field5738.method1883((byte) -29);
                var3.field386 = class387.field5738.method1899((byte) -126);
                var3.field399 = class387.field5738.method1884((byte) -127);
                var3.field314 = class387.field5738.method1888((byte) 89) + class180.field2734;
                var3.field358 = class387.field5738.method1888((byte) 110) + class180.field2734;
                var3.field328 = class387.field5738.method1894(255);
                var3.field312 += var3.field416[0];
                var3.field412 = 1;
                var3.field374 += var3.field409[0];
                var3.field411 = 0;
                var3.field399 += var3.field416[0];
                var3.field386 += var3.field409[0];
            }
            ++var1;
        }
    }

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "(II)I")
    public final int method2856(int arg0, int arg1) {
        if (arg1 != 1) {
            field7003 = -42;
        }
        ++field7005;
        return arg0 * 8 + -this.field7002;
    }

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "(I)V")
    public final void method2857(int arg0) {
        if (arg0 != -18300) {
            this.method2857(78);
        }
        ++field7009;
        this.field7002 = super.field4333 * 8;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "([IB)V")
    public final void method2858(int[] arg0, byte arg1) {
        ++field7010;
        this.field7016 = new class393(arg0);
        int var3 = -119 / ((arg1 - -16) / 52);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(II[BI)V")
    public final void method2859(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 >= -99) {
            this.method2847(20, 54);
        }
        ++field7004;
        for (int var5 = 0; var5 < arg1; ++var5) {
            arg2[arg0 + var5] = (byte) (super.field4326[super.field4333++] + -this.field7016.method2459((byte) -33));
        }
    }
}
