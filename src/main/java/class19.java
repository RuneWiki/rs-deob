import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class19 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "Z")
    private boolean field222 = false;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private int field225 = 32;

    @OriginalMember(owner = "client!ir", name = "l", descriptor = "J")
    private long field227 = class175.method1195(53);

    @OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
    private int field242 = 0;

    @OriginalMember(owner = "client!ir", name = "z", descriptor = "Z")
    private boolean field241 = true;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "J")
    private long field239 = 0L;

    @OriginalMember(owner = "client!ir", name = "D", descriptor = "[Lj;")
    private class321[] field244 = new class321[8];

    @OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
    private int field245 = 0;

    @OriginalMember(owner = "client!ir", name = "F", descriptor = "[Lj;")
    private class321[] field246 = new class321[8];

    @OriginalMember(owner = "client!ir", name = "I", descriptor = "J")
    private long field249 = 0L;

    @OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
    private int field250 = 0;

    @OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
    private int field240 = 0;

    @OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
    public static int field228 = -1;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field234 = 0;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Liq;")
    public static class362 field223 = new class362("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!ir", name = "K", descriptor = "[S")
    public static short[] field251 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ir", name = "n", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ir", name = "p", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
    public int field247;

    @OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!ir", name = "q", descriptor = "Lj;")
    private class321 field232;

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)V", line = 7)
    public static final void method133(int arg0, int arg1, int arg2) {
        field216++;
        class45.field541 = new class237(arg0);
        class71.field820 = new class237(arg1);
        if (arg2 != -28663) {
            method133(106, -82, -126);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)V", line = 22)
    private final void method134(int arg0, boolean arg1) {
        field233++;
        this.field250 -= arg0;
        if (!arg1) {
            this.field243 = -86;
        }
        if (this.field250 < 0) {
            this.field250 = 0;
        }
        if (this.field232 != null) {
            this.field232.method1056(arg0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([BB)[B", line = 41)
    public static final byte[] method135(byte[] arg0, byte arg1) {
        field231++;
        class236 var2 = new class236(arg0);
        if (arg1 > -127) {
            field251 = null;
        }
        int var3 = var2.method1574(-84);
        int var4 = var2.method1597(3641);
        if (var4 < 0 || class341.field4833 != 0 && var4 > class341.field4833) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1570(var5, var4, 0, -1);
            return var5;
        } else {
            int var6 = var2.method1597(3641);
            if (var6 < 0 || !(class341.field4833 == 0 || var6 <= class341.field4833)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class142.method866(var7, var6, arg0, var4, 9);
            } else {
                class183.field2490.method2387(-4, var7, var2);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lj;I)V", line = 97)
    public final synchronized void method136(class321 arg0, int arg1) {
        field238++;
        if (arg1 != 4) {
            this.method134(82, false);
        }
        this.field232 = arg0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 108)
    public void method95(int arg0) throws Exception {
        field235++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V", line = 118)
    public final void method137(int arg0) {
        if (arg0 != -15326) {
            field223 = null;
        }
        this.field241 = true;
        field221++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "()V", line = 133)
    public void method96() {
        field220++;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "()I", line = 144)
    public int method98() throws Exception {
        field230++;
        return this.field247;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V", line = 152)
    public final synchronized void method138(int arg0) {
        if (arg0 != 28291) {
            this.method134(17, true);
        }
        if (class265.field3779 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class265.field3779.field2728[var3] == this) {
                    class265.field3779.field2728[var3] = null;
                }
                if (class265.field3779.field2728[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class265.field3779.field2724 = true;
                while (class265.field3779.field2719) {
                    class150.method907(50L, (byte) -32);
                }
                class265.field3779 = null;
            }
        }
        field229++;
        this.method96();
        this.field222 = true;
        this.field219 = null;
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "()V", line = 203)
    public void method94() throws Exception {
        field237++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V", line = 211)
    public final synchronized void method139(byte arg0) {
        field217++;
        int var2 = 109 % ((-arg0 - 55) / 59);
        this.field241 = true;
        try {
            this.method99();
        } catch (Exception var3) {
            this.method96();
            this.field249 = class175.method1195(39) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V", line = 231)
    public final synchronized void method140(int arg0) {
        field226++;
        if (this.field222) {
            return;
        }
        long var2 = class175.method1195(75);
        try {
            if (var2 > (this.field227 + 500000L)) {
                this.field227 = var2 - 500000L;
            }
            while ((this.field227 + 5000L) < var2) {
                this.method134(256, true);
                this.field227 += (long) (256000 / class313.field4484);
            }
        } catch (Exception var7) {
            this.field227 = var2;
        }
        if (this.field219 == null) {
            return;
        }
        try {
            if (this.field249 != 0L) {
                if (this.field249 > var2) {
                    return;
                }
                this.method95(this.field247);
                this.field241 = true;
                this.field249 = 0L;
            }
            int var4 = this.method98();
            if (this.field240 < (this.field245 - var4)) {
                this.field240 = this.field245 - var4;
            }
            int var5 = this.field248 + this.field243;
            if (arg0 == 255) {
                if (var5 + 256 > 16384) {
                    var5 = 16128;
                }
                if (this.field247 < var5 + 256) {
                    this.field247 += 1024;
                    if (this.field247 > 16384) {
                        this.field247 = 16384;
                    }
                    this.method96();
                    var4 = 0;
                    this.method95(this.field247);
                    if (var5 + 256 > this.field247) {
                        var5 = this.field247 - 256;
                        this.field243 = var5 - this.field248;
                    }
                    this.field241 = true;
                }
                while (var5 > var4) {
                    this.method142(this.field219, 256);
                    var4 += 256;
                    this.method94();
                }
                if (var2 > this.field239) {
                    if (this.field241) {
                        this.field241 = false;
                    } else if (this.field240 == 0 && this.field242 == 0) {
                        this.method96();
                        this.field249 = var2 + 2000L;
                        return;
                    } else {
                        this.field243 = Math.min(this.field242, this.field240);
                        this.field242 = this.field240;
                    }
                    this.field239 = var2 + 2000L;
                    this.field240 = 0;
                }
                this.field245 = var4;
            }
        } catch (Exception var6) {
            this.method96();
            this.field249 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "(I)V", line = 351)
    public static void method141(int arg0) {
        field223 = null;
        field251 = null;
        if (arg0 != 21897) {
            method135((byte[]) null, (byte) 126);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 364)
    public void method97(Component arg0) throws Exception {
        field218++;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "()V", line = 371)
    public void method99() throws Exception {
        field236++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([II)V", line = 381)
    private final void method142(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class217.field3062) {
            var3 = arg1 << 1;
        }
        class316.method2077(arg0, 0, var3);
        this.field250 -= arg1;
        if (this.field232 != null && this.field250 <= 0) {
            this.field250 += class313.field4484 >> 4;
            class406.method2596(this.field232, (byte) -84);
            this.method143(this.field232, this.field232.method1170(), (byte) 65);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
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
                        class321 var10 = null;
                        class321 var11 = this.field246[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class31 var12 = var11.field4572;
                                if (var12 == null || var12.field361 <= var8) {
                                    var11.field4575 = true;
                                    int var13 = var11.method1079();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field361 += var13;
                                    }
                                    if (var4 >= this.field225) {
                                        break label107;
                                    }
                                    class321 var14 = var11.method1078();
                                    if (var14 != null) {
                                        int var15 = var11.field4574;
                                        while (var14 != null) {
                                            this.method143(var14, var15 * var14.method1170() >> 8, (byte) 65);
                                            var14 = var11.method1060();
                                        }
                                    }
                                    class321 var16 = var11.field4573;
                                    var11.field4573 = null;
                                    if (var10 == null) {
                                        this.field246[var7] = var16;
                                    } else {
                                        var10.field4573 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field244[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4573;
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
                class321 var18 = this.field246[var17];
                this.field246[var17] = this.field244[var17] = null;
                while (var18 != null) {
                    class321 var19 = var18.field4573;
                    var18.field4573 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field250 < 0) {
            this.field250 = 0;
        }
        if (this.field232 != null) {
            this.field232.method1076(arg0, 0, arg1);
        }
        this.field227 = class175.method1195(20);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lj;IB)V", line = 540)
    private final void method143(class321 arg0, int arg1, byte arg2) {
        field224++;
        int var4 = arg1 >> 5;
        class321 var5 = this.field244[var4];
        if (var5 == null) {
            this.field246[var4] = arg0;
        } else {
            var5.field4573 = arg0;
        }
        if (arg2 != 65) {
            this.field232 = null;
        }
        this.field244[var4] = arg0;
        arg0.field4574 = arg1;
    }
}
