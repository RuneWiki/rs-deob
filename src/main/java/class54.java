import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class54 extends class232 {

    @OriginalMember(owner = "client!cg", name = "U", descriptor = "I")
    private int field861 = 2048;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "I")
    private int field862 = 12288;

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "I")
    private int field865 = 2048;

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "I")
    private int field863 = 0;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    private int field867 = 4096;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "I")
    private int field864 = 8192;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!cg", name = "S", descriptor = "Lhi;")
    public static class82 field859 = class95.method664((byte) -95, "::rebuild");

    @OriginalMember(owner = "client!cg", name = "P", descriptor = "Lhi;")
    public static class82 field857 = class95.method664((byte) -85, "showVideoAd");

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field860 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "Lhi;")
    public static class82 field873 = class95.method664((byte) -36, "blinken1:");

    @OriginalMember(owner = "client!cg", name = "R", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!cg", name = "jb", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Ljf;")
    public static class86 field870;

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V", line = 5)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V", line = 17)
    public final void method144(int arg0) {
        class20.method137(4096);
        field869++;
        if (arg0 <= 48) {
            this.method80(-53, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 32)
    public static void method377(boolean arg0) {
        field859 = null;
        field857 = null;
        field870 = null;
        if (arg0) {
            field857 = (class82) null;
        }
        field873 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IIB)Z", line = 53)
    private final boolean method378(int arg0, int arg1, byte arg2) {
        field875++;
        int var4 = (arg0 + arg1) * this.field862 >> 12;
        if (arg2 <= 27) {
            this.field862 = -75;
        }
        int var5 = class138.field2368[(var4 * 255 & 0xFF622) >> 12];
        int var6 = (var5 << 12) / this.field862;
        int var7 = (var6 << 12) / this.field864;
        int var8 = this.field867 * var7 >> 12;
        return var8 > (arg0 - arg1) && arg0 - arg1 > -var8;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z", line = 73)
    private final boolean method379(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field861 = -75;
        }
        field876++;
        int var4 = (arg2 - arg0) * this.field862 >> 12;
        int var5 = class138.field2368[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field862;
        int var7 = (var6 << 12) / this.field864;
        int var8 = this.field867 * var7 >> 12;
        return (arg0 + arg2) < var8 && (arg0 + arg2) > (-var8);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(IB)[I", line = 98)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -103, arg0);
        field866++;
        if (this.field4008.field256) {
            int var4 = class273.field4607[arg0] - 2048;
            for (int var5 = 0; var5 < field858; var5++) {
                int var6 = this.field871 + var4;
                int var7 = class24.field329[var5] - 2048;
                int var8 = var7 + this.field863;
                int var9 = var7 + this.field865;
                int var10 = var8 < -2048 ? var8 + 4096 : var8;
                int var11 = var9 < -2048 ? var9 + 4096 : var9;
                int var12 = var6 < -2048 ? var6 + 4096 : var6;
                int var13 = var11 <= 2048 ? var11 : var11 - 4096;
                int var14 = var10 <= 2048 ? var10 : var10 - 4096;
                int var15 = this.field861 + var4;
                int var16 = var12 <= 2048 ? var12 : var12 - 4096;
                int var17 = var15 < -2048 ? var15 + 4096 : var15;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method379(var13, 0, var16) || this.method378(var18, var14, (byte) 80) ? 4096 : 0;
            }
        }
        int var19 = 116 / ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIIII)V", line = 162)
    public static final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -15001) {
            return;
        }
        class181 var10 = (class181) class68.field1055.method1936(arg7 ^ 0xFFFFFA4A);
        class181 var11 = null;
        field872++;
        while (var10 != null) {
            if (var10.field3093 == arg4 && var10.field3085 == arg3 && var10.field3087 == arg1 && var10.field3095 == arg6) {
                var11 = var10;
                break;
            }
            var10 = (class181) class68.field1055.method1926((byte) 90);
        }
        if (var11 == null) {
            var11 = new class181();
            var11.field3085 = arg3;
            var11.field3095 = arg6;
            var11.field3093 = arg4;
            var11.field3087 = arg1;
            class183.method1270(var11, (byte) 102);
            class68.field1055.method1940((byte) -100, var11);
        }
        var11.field3090 = arg0;
        var11.field3094 = arg5;
        var11.field3099 = arg2;
        var11.field3092 = arg8;
        var11.field3082 = arg9;
    }

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "(I)V", line = 223)
    public static final void method381(int arg0) {
        field874++;
        int var1 = class87.field1549 * 128 + 64;
        int var2 = class24.field326 * 128 + 64;
        int var3 = class21.method145(var1, var2, class297.field5058, (byte) -113) - class262.field4480;
        if (class9.field73 < 100) {
            if (class219.field3792 < var1) {
                class219.field3792 += (var1 - class219.field3792) * class9.field73 / 1000 + class217.field3772;
                if (class219.field3792 > var1) {
                    class219.field3792 = var1;
                }
            }
            if (var3 > class134.field2322) {
                class134.field2322 += (var3 - class134.field2322) * class9.field73 / 1000 + class217.field3772;
                if (var3 < class134.field2322) {
                    class134.field2322 = var3;
                }
            }
            if (class219.field3792 > var1) {
                class219.field3792 -= class217.field3772 + ((class219.field3792 - var1) * class9.field73 / 1000);
                if (var1 > class219.field3792) {
                    class219.field3792 = var1;
                }
            }
            if (class134.field2322 > var3) {
                class134.field2322 -= class217.field3772 + ((class134.field2322 - var3) * class9.field73 / 1000);
                if (class134.field2322 < var3) {
                    class134.field2322 = var3;
                }
            }
            if (class4.field32 < var2) {
                class4.field32 += (var2 - class4.field32) * class9.field73 / 1000 + class217.field3772;
                if (class4.field32 > var2) {
                    class4.field32 = var2;
                }
            }
            if (var2 < class4.field32) {
                class4.field32 -= (class4.field32 - var2) * class9.field73 / 1000 + class217.field3772;
                if (class4.field32 < var2) {
                    class4.field32 = var2;
                }
            }
        } else {
            class219.field3792 = class87.field1549 * 128 + 64;
            class4.field32 = class24.field326 * 128 + 64;
            class134.field2322 = class21.method145(class219.field3792, class4.field32, class297.field5058, (byte) -108) - class262.field4480;
        }
        int var4 = class19.field252 * 128 + 64;
        int var5 = class325.field5578 * 128 + 64;
        int var6 = class21.method145(var5, var4, class297.field5058, (byte) -109) - class109.field1958;
        int var7 = var6 - class134.field2322;
        int var8 = var5 - class219.field3792;
        int var9 = var4 - class4.field32;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        if (arg0 != 30605) {
            method377(true);
        }
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var9)) & 0x7FF;
        int var13 = var12 - class224.field3887;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (class197.field3380 < var11) {
            class197.field3380 += class73.field1116 + ((var11 - class197.field3380) * class232.field4011 / 1000);
            if (class197.field3380 > var11) {
                class197.field3380 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < class197.field3380) {
            class197.field3380 -= class73.field1116 + ((class197.field3380 - var11) * class232.field4011 / 1000);
            if (class197.field3380 < var11) {
                class197.field3380 = var11;
            }
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class224.field3887 += class232.field4011 * var13 / 1000 + class73.field1116;
            class224.field3887 &= 0x7FF;
        }
        if (var13 < 0) {
            class224.field3887 -= class73.field1116 + (-var13 * class232.field4011 / 1000);
            class224.field3887 &= 0x7FF;
        }
        int var14 = var12 - class224.field3887;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class224.field3887 = var12;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IBLbc;)V", line = 400)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg0 == 0) {
            this.field865 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field871 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field863 = arg2.method1090(false);
        } else if (arg0 == 3) {
            this.field861 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field862 = arg2.method1090(false);
        } else if (arg0 == 5) {
            this.field867 = arg2.method1090(false);
        } else if (arg0 == 6) {
            this.field864 = arg2.method1090(false);
        }
        if (arg1 != -19) {
            this.method81(-104, (byte) -43, (class153) null);
        }
        field868++;
    }
}
