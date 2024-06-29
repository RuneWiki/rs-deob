import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class246 {

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    private int field3847 = 32;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Z")
    private boolean field3844 = false;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
    private long field3837 = class219.method1609(-898);

    @OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
    private int field3859 = 0;

    @OriginalMember(owner = "client!ea", name = "C", descriptor = "Z")
    private boolean field3858 = true;

    @OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
    private int field3864 = 0;

    @OriginalMember(owner = "client!ea", name = "E", descriptor = "J")
    private long field3860 = 0L;

    @OriginalMember(owner = "client!ea", name = "G", descriptor = "[Ltb;")
    private class177[] field3862 = new class177[8];

    @OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
    private int field3865 = 0;

    @OriginalMember(owner = "client!ea", name = "L", descriptor = "J")
    private long field3866 = 0L;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
    private int field3861 = 0;

    @OriginalMember(owner = "client!ea", name = "H", descriptor = "[Ltb;")
    private class177[] field3863 = new class177[8];

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field3841 = 0;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3856 = "Members object";

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field3834 = 0;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public int field3868;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
    private int field3869;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Ltb;")
    private class177 field3854;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "Ljava/lang/Thread;")
    public static Thread field3842;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    public int[] field3835;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1764(boolean arg0) {
        field3856 = null;
        if (!arg0) {
            field3842 = (Thread) null;
        }
        field3842 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILtb;I)V", line = 17)
    private final void method1765(int arg0, class177 arg1, int arg2) {
        field3831++;
        int var4 = arg2 >> 5;
        int var5 = 122 % ((arg0 - 72) / 35);
        class177 var6 = this.field3862[var4];
        if (var6 == null) {
            this.field3863[var4] = arg1;
        } else {
            var6.field2898 = arg1;
        }
        this.field3862[var4] = arg1;
        arg1.field2895 = arg2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V", line = 40)
    public void method534() {
        field3853++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 52)
    public final synchronized void method1766(int arg0) {
        if (arg0 != 256000) {
            this.method1778(15, (class177) null);
        }
        if (class251.field3958 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class251.field3958.field3758[var3] == this) {
                    class251.field3958.field3758[var3] = null;
                }
                if (class251.field3958.field3758[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class251.field3958.field3757 = true;
                while (class251.field3958.field3762) {
                    class272.method1918((byte) 22, 50L);
                }
                class251.field3958 = null;
            }
        }
        field3846++;
        this.method534();
        this.field3835 = null;
        this.field3844 = true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V", line = 97)
    private final void method1767(int arg0, int arg1) {
        this.field3865 -= arg1;
        field3851++;
        if (this.field3865 < arg0) {
            this.field3865 = 0;
        }
        if (this.field3854 != null) {
            this.field3854.method157(arg1);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;BLug;)Lcf;", line = 115)
    public static final class275 method1768(String arg0, byte arg1, class253 arg2) {
        field3849++;
        int var3 = arg2.method1808(-1, arg0);
        if (var3 == -1) {
            return new class275(0);
        }
        int[] var4 = arg2.method1842((byte) -128, var3);
        class275 var5 = new class275(var4.length);
        if (arg1 > -117) {
            method1769(-64, (byte) -40);
        }
        for (int var6 = 0; var6 < var5.field4244; var6++) {
            class6 var7 = new class6(arg2.method1813(var4[var6], var3, true));
            var5.field4246[var6] = var7.method40(false);
            var5.field4242[var6] = var7.method83((byte) -125);
            var5.field4249[var6] = var7.method73((byte) 19);
            var5.field4254[var6] = var7.method73((byte) 19);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 150)
    public void method528(int arg0) throws Exception {
        field3832++;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V", line = 157)
    public void method531() throws Exception {
        field3836++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)Lfn;", line = 164)
    public static final class58 method1769(int arg0, byte arg1) {
        field3833++;
        class58 var2 = (class58) class22.field324.method1628(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -113) {
            method1772(66);
        }
        byte[] var3 = class20.field303.method1813(arg0, 11, true);
        class58 var4 = new class58();
        if (var3 != null) {
            var4.method474(new class6(var3), 8220);
        }
        class22.field324.method1627((byte) 97, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 189)
    public final synchronized void method1770(int arg0) {
        field3830++;
        if (this.field3844) {
            return;
        }
        long var2 = class219.method1609(-898);
        try {
            if (this.field3837 + 500000L < var2) {
                this.field3837 = var2 - 500000L;
            }
            while (var2 > this.field3837 + 5000L) {
                this.method1767(0, 256);
                this.field3837 += (long) (256000 / class318.field5024);
            }
        } catch (Exception var9) {
            this.field3837 = var2;
        }
        if (this.field3835 == null) {
            return;
        }
        try {
            if (this.field3860 != 0L) {
                if (var2 < this.field3860) {
                    return;
                }
                this.method528(this.field3868);
                this.field3860 = 0L;
                this.field3858 = true;
            }
            int var5 = this.method529();
            if (this.field3864 < this.field3859 - var5) {
                this.field3864 = this.field3859 - var5;
            }
            int var6 = this.field3867 + this.field3869;
            if (arg0 < var6 + 256) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field3868) {
                var5 = 0;
                this.field3868 += 1024;
                if (this.field3868 > 16384) {
                    this.field3868 = 16384;
                }
                this.method534();
                this.method528(this.field3868);
                this.field3858 = true;
                if (var6 + 256 > this.field3868) {
                    var6 = this.field3868 - 256;
                    this.field3869 = var6 - this.field3867;
                }
            }
            while (var5 < var6) {
                this.method1775(this.field3835, 256);
                this.method533();
                var5 += 256;
            }
            if (this.field3866 < var2) {
                if (this.field3858) {
                    this.field3858 = false;
                } else if (this.field3864 == 0 && this.field3861 == 0) {
                    this.method534();
                    this.field3860 = var2 + 2000L;
                    return;
                } else {
                    this.field3869 = Math.min(this.field3861, this.field3864);
                    this.field3861 = this.field3864;
                }
                this.field3866 = var2 + 2000L;
                this.field3864 = 0;
            }
            this.field3859 = var5;
        } catch (Exception var8) {
            this.method534();
            this.field3860 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 304)
    public static final void method1771(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field3852++;
        if (class308.field4800 == 0) {
            return;
        }
        try {
            if (++class27.field403 > 1500) {
                if (class275.field4247 != null) {
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                }
                if (class15.field256 >= 1) {
                    class308.field4800 = 0;
                    class91.field1216 = -5;
                    return;
                }
                class15.field256++;
                if (class64.field928 == class60.field893) {
                    class64.field928 = class233.field3636;
                } else {
                    class64.field928 = class60.field893;
                }
                class308.field4800 = 1;
                class27.field403 = 0;
            }
            if (class308.field4800 == 1) {
                class1.field7 = class42.field581.method1011(class179.field2907, class64.field928, (byte) -8);
                class308.field4800 = 2;
            }
            if (class308.field4800 == 2) {
                if (class1.field7.field1595 == 2) {
                    throw new IOException();
                }
                if (class1.field7.field1595 != 1) {
                    return;
                }
                class275.field4247 = new class22((Socket) class1.field7.field1591, class42.field581);
                class1.field7 = null;
                class275.field4247.method221(117, class183.field2965.field115, 0, class183.field2965.field111);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(-128);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(-113);
                }
                int var1 = class275.field4247.method214((byte) 83);
                if (class97.field1278 != null) {
                    class97.field1278.method1774(59);
                }
                if (class26.field388 != null) {
                    class26.field388.method1774(arg0 + 28);
                }
                if (var1 != 101) {
                    class308.field4800 = 0;
                    class91.field1216 = var1;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    return;
                }
                class308.field4800 = 3;
            }
            if (class308.field4800 == 3) {
                if (class275.field4247.method217(arg0 ^ 0x7532) >= 2) {
                    int var2 = class275.field4247.method214((byte) 83) << 8 | class275.field4247.method214((byte) 83);
                    class64.method516(var2, (byte) 63);
                    if (class271.field4209 == -1) {
                        class91.field1216 = 6;
                        class308.field4800 = 0;
                        class275.field4247.method218(true);
                        class275.field4247 = null;
                        return;
                    }
                    class308.field4800 = 0;
                    class275.field4247.method218(true);
                    class275.field4247 = null;
                    class129.method945(false);
                    return;
                }
                return;
            }
        } catch (IOException var4) {
            if (class275.field4247 != null) {
                class275.field4247.method218(true);
                class275.field4247 = null;
            }
            if (class15.field256 < 1) {
                class27.field403 = 0;
                class308.field4800 = 1;
                class15.field256++;
                if (class64.field928 == class60.field893) {
                    class64.field928 = class233.field3636;
                } else {
                    class64.field928 = class60.field893;
                }
            } else {
                class308.field4800 = 0;
                class91.field1216 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V", line = 451)
    public static final void method1772(int arg0) {
        if (arg0 >= -94) {
            method1768((String) null, (byte) 1, (class253) null);
        }
        for (int var1 = -1; var1 < class232.field3631; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class81.field1116[var1];
            }
            class337 var3 = class284.field4403[var2];
            if (var3 != null && var3.field4672 > 0) {
                var3.field4672--;
                if (var3.field4672 == 0) {
                    var3.field4706 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class79.field1083; var4++) {
            int var5 = class85.field1157[var4];
            class212 var6 = class59.field870[var5];
            if (var6 != null && var6.field4672 > 0) {
                var6.field4672--;
                if (var6.field4672 == 0) {
                    var6.field4706 = null;
                }
            }
        }
        field3840++;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V", line = 512)
    public static final void method1773(int arg0) {
        if (arg0 != 0) {
            method1771(8);
        }
        field3839++;
        class327.field5130 = null;
        class148.method1088();
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "(I)V", line = 524)
    public final void method1774(int arg0) {
        field3850++;
        int var2 = 75 % ((arg0 + 27) / 57);
        this.field3858 = true;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([II)V", line = 544)
    private final void method1775(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class157.field2427) {
            var3 = arg1 << 1;
        }
        class54.method426(arg0, 0, var3);
        this.field3865 -= arg1;
        if (this.field3854 != null && this.field3865 <= 0) {
            this.field3865 += class318.field5024 >> 4;
            class162.method1208(this.field3854, true);
            this.method1765(116, this.field3854, this.field3854.method175());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class177 var10 = null;
                        class177 var11 = this.field3863[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class227 var12 = var11.field2897;
                                if (var12 == null || var12.field3585 <= var8) {
                                    var11.field2896 = true;
                                    int var13 = var11.method153();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3585 += var13;
                                    }
                                    if (var4 >= this.field3847) {
                                        break label105;
                                    }
                                    class177 var14 = var11.method187();
                                    if (var14 != null) {
                                        int var15 = var11.field2895;
                                        while (var14 != null) {
                                            this.method1765(118, var14, var15 * var14.method175() >> 8);
                                            var14 = var11.method178();
                                        }
                                    }
                                    class177 var16 = var11.field2898;
                                    var11.field2898 = null;
                                    if (var10 == null) {
                                        this.field3863[var7] = var16;
                                    } else {
                                        var10.field2898 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3862[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2898;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class177 var18 = this.field3863[var17];
                this.field3863[var17] = this.field3862[var17] = null;
                while (var18 != null) {
                    class177 var19 = var18.field2898;
                    var18.field2898 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3865 < 0) {
            this.field3865 = 0;
        }
        if (this.field3854 != null) {
            this.field3854.method179(arg0, 0, arg1);
        }
        this.field3837 = class219.method1609(-898);
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I", line = 705)
    public int method529() throws Exception {
        field3848++;
        return this.field3868;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 713)
    public final synchronized void method1776(byte arg0) {
        field3843++;
        this.field3858 = true;
        try {
            if (arg0 != 57) {
                method1764(false);
            }
            this.method531();
        } catch (Exception var3) {
            this.method534();
            this.field3860 = class219.method1609(-898) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()V", line = 737)
    public void method533() throws Exception {
        field3845++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 758)
    public void method530(Component arg0) throws Exception {
        field3838++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lh;IIBIII)V", line = 765)
    public static final void method1777(class303 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class326.method2289(arg2, arg0.field4698, arg5, arg6, arg4, arg0.field4731, true, arg1);
        if (arg3 == -87) {
            field3857++;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILtb;)V", line = 777)
    public final synchronized void method1778(int arg0, class177 arg1) {
        if (arg0 != -22090) {
            method1768((String) null, (byte) 33, (class253) null);
        }
        field3855++;
        this.field3854 = arg1;
    }
}
