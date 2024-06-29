import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class180 implements Runnable {

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    private int field3149 = 0;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    private int field3147 = 0;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "Z")
    private boolean field3163 = false;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Z")
    private boolean field3165 = false;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljava/net/Socket;")
    private Socket field3150;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lcb;")
    private class270 field3159;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field3146;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field3161;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3153 = 7759444;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "[Lid;")
    public static class249[] field3158 = new class249[4];

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Lni;")
    private class23 field3154;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "Ldj;")
    public static class314 field3155;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "[B")
    private byte[] field3162;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZI)Lhh;", line = 5)
    public static final class200 method1226(boolean arg0, int arg1) {
        class200 var2 = (class200) class37.field744.method1836((long) arg1, 0);
        field3160++;
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method1233(81);
        }
        byte[] var3 = class210.field3727.method2155(class130.method875(255, arg1), class279.method1947(-128, arg1), (byte) 70);
        class200 var4 = new class200();
        var4.field3542 = arg1;
        if (var3 != null) {
            var4.method1396((byte) -19, new class194(var3));
        }
        var4.method1382(1);
        if (var4.field3537 != -1) {
            var4.method1388(method1226(false, var4.field3537), (byte) -72, method1226(arg0, var4.field3528));
        }
        if (var4.field3512 != -1) {
            var4.method1397(-92, method1226(false, var4.field3512), method1226(arg0, var4.field3552));
        }
        if (!class45.field910 && var4.field3485) {
            var4.field3517 = null;
            var4.field3506 = class208.field3650;
            var4.field3488 = 0;
            var4.field3522 = false;
            var4.field3521 = null;
        }
        class37.field744.method1835((byte) -81, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BBII)V", line = 51)
    public final void method1227(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3164++;
        if (this.field3163 || arg1 != -81) {
            return;
        }
        while (arg3 > 0) {
            int var5 = this.field3146.read(arg0, arg2, arg3);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg3 -= var5;
            arg2 += var5;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Ljava/net/Socket;Lcb;)V", line = 1346)
    public class180(Socket arg0, class270 arg1) throws IOException {
        this.field3150 = arg0;
        this.field3159 = arg1;
        this.field3150.setSoTimeout(30000);
        this.field3150.setTcpNoDelay(true);
        this.field3146 = this.field3150.getInputStream();
        this.field3161 = this.field3150.getOutputStream();
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 94)
    protected final void finalize() {
        this.method1229(false);
        field3156++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIZI)V", line = 107)
    public final void method1228(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        field3152++;
        if (arg2) {
            this.field3165 = true;
        }
        if (this.field3163) {
            return;
        }
        if (this.field3165) {
            this.field3165 = false;
            throw new IOException();
        }
        if (this.field3162 == null) {
            this.field3162 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg3; var6++) {
                this.field3162[this.field3149] = arg0[arg1 + var6];
                this.field3149 = (this.field3149 + 1) % 5000;
                if ((this.field3147 + 4900) % 5000 == this.field3149) {
                    throw new IOException();
                }
            }
            if (this.field3154 == null) {
                this.field3154 = this.field3159.method1904((byte) -112, 3, this);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!uc", name = "run", descriptor = "()V", line = 165)
    public final void run() {
        field3168++;
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field3149 == this.field3147) {
                        if (this.field3163) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var13) {
                        }
                    }
                    if (this.field3147 <= this.field3149) {
                        var3 = this.field3149 - this.field3147;
                    } else {
                        var3 = 5000 - this.field3147;
                    }
                    var4 = this.field3147;
                }
                if (var3 > 0) {
                    try {
                        this.field3161.write(this.field3162, var4, var3);
                    } catch (IOException var12) {
                        this.field3165 = true;
                    }
                    this.field3147 = (this.field3147 + var3) % 5000;
                    try {
                        if (this.field3149 == this.field3147) {
                            this.field3161.flush();
                        }
                    } catch (IOException var11) {
                        this.field3165 = true;
                    }
                }
            }
            try {
                if (this.field3146 != null) {
                    this.field3146.close();
                }
                if (this.field3161 != null) {
                    this.field3161.close();
                }
                if (this.field3150 != null) {
                    this.field3150.close();
                }
            } catch (IOException var10) {
            }
            this.field3162 = null;
        } catch (Exception var15) {
            class79.method506((byte) -51, (String) null, var15);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V", line = 241)
    public final void method1229(boolean arg0) {
        field3148++;
        if (this.field3163) {
            return;
        }
        synchronized (this) {
            this.field3163 = true;
            this.notifyAll();
        }
        if (this.field3154 != null) {
            while (this.field3154.field560 == 0) {
                class177.method1213(0, 1L);
            }
            if (this.field3154.field560 == 1) {
                try {
                    ((Thread) this.field3154.field562).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field3154 = null;
        if (arg0) {
            this.field3150 = (Socket) null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I", line = 300)
    public final int method1230(byte arg0) throws IOException {
        field3151++;
        int var2 = -65 / ((-arg0 - 50) / 40);
        return this.field3163 ? 0 : this.field3146.available();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)I", line = 314)
    public final int method1231(int arg0) throws IOException {
        field3167++;
        if (this.field3163) {
            return 0;
        } else {
            if (arg0 != -1) {
                this.field3165 = false;
            }
            return this.field3146.read();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B[B)Lcj;", line = 329)
    public static final class305 method1232(byte arg0, byte[] arg1) {
        if (arg0 != 116) {
            return (class305) null;
        }
        field3166++;
        if (arg1 == null) {
            return null;
        }
        class305 var2;
        if (class247.field4247) {
            var2 = new class184(arg1, class151.field2607, class266.field4603, class125.field2106, class178.field3128, class157.field2690);
        } else {
            var2 = new class14(arg1, class151.field2607, class266.field4603, class125.field2106, class178.field3128, class157.field2690);
        }
        class15.method113(60);
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 351)
    public static final void method1233(int arg0) {
        field3157++;
        if (class298.field5078 > 0) {
            class298.field5078--;
        }
        if (class32.field713 > 1) {
            class217.field3833 = class104.field1788;
            class32.field713--;
        }
        if (class74.field1400) {
            class74.field1400 = false;
            class263.method1848((byte) 88);
            return;
        }
        for (int var1 = 0; var1 < 100 && class26.method171(arg0 - 12327); var1++) {
        }
        if (class105.field1799 != 30) {
            return;
        }
        class151.method1008(class71.field1320, (byte) 107, 179);
        Object var2 = class234.field4030.field4087;
        synchronized (class234.field4030.field4087) {
            if (!class211.field3741) {
                class234.field4030.field4092 = 0;
            } else if (class103.field1767 != 0 || class234.field4030.field4092 >= 40) {
                class71.field1320.method570(219, arg0 ^ 0xFFFFA1F0);
                class170.field2978++;
                int var3 = 0;
                class71.field1320.method1352(7528, 0);
                int var4 = class71.field1320.field3380;
                for (int var5 = 0; var5 < class234.field4030.field4092 && (class71.field1320.field3380 - var4) < 240; var5++) {
                    var3++;
                    int var6 = class234.field4030.field4090[var5];
                    boolean var7 = false;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var8 = class234.field4030.field4091[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class234.field4030.field4091[var5] == -1 && class234.field4030.field4090[var5] == -1) {
                        var6 = -1;
                        var8 = -1;
                        var7 = true;
                    }
                    if (class9.field203 != var6 || class94.field1597 != var8) {
                        int var9 = var6 - class9.field203;
                        int var10 = var8 - class94.field1597;
                        class94.field1597 = var8;
                        class9.field203 = var6;
                        if (class105.field1794 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class71.field1320.method1324((class105.field1794 << 12) + (var9 << 6) + var10, 15803);
                            class105.field1794 = 0;
                        } else if (class105.field1794 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class71.field1320.method1352(7528, class105.field1794 + 128);
                            var10 += 128;
                            var9 += 128;
                            class71.field1320.method1324((var9 << 8) + var10, 15803);
                            class105.field1794 = 0;
                        } else if (class105.field1794 >= 32) {
                            class71.field1320.method1324(class105.field1794 + 57344, 15803);
                            if (var7) {
                                class71.field1320.method1337(-73, Integer.MIN_VALUE);
                            } else {
                                class71.field1320.method1337(-100, var8 << 16 | var6);
                            }
                            class105.field1794 = 0;
                        } else {
                            class71.field1320.method1352(arg0 ^ 0x4367, class105.field1794 + 192);
                            if (var7) {
                                class71.field1320.method1337(-80, Integer.MIN_VALUE);
                            } else {
                                class71.field1320.method1337(arg0 - 24161, var6 | var8 << 16);
                            }
                            class105.field1794 = 0;
                        }
                    } else if (class105.field1794 < 2047) {
                        class105.field1794++;
                    }
                }
                class71.field1320.method1294(class71.field1320.field3380 - var4, (byte) -123);
                if (var3 >= class234.field4030.field4092) {
                    class234.field4030.field4092 = 0;
                } else {
                    class234.field4030.field4092 -= var3;
                    for (int var11 = 0; var11 < class234.field4030.field4092; var11++) {
                        class234.field4030.field4090[var11] = class234.field4030.field4090[var11 + var3];
                        class234.field4030.field4091[var11] = class234.field4030.field4091[var3 + var11];
                    }
                }
            }
        }
        if (class103.field1767 != 0) {
            int var13 = class241.field4129;
            int var14 = class45.field915;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            long var15 = (class89.field1523 - class291.field4973) / 50L;
            class291.field4973 = class89.field1523;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            if (var15 > 32767L) {
                var15 = 32767L;
            }
            class103.field1762++;
            byte var17 = 0;
            if (class103.field1767 == 2) {
                var17 = 1;
            }
            int var18 = (int) var15;
            class71.field1320.method570(227, arg0 ^ 0xFFFFA1F0);
            class71.field1320.method1324(var18 | var17 << 15, 15803);
            class71.field1320.method1337(-112, var13 << 16 | var14);
        }
        if (class223.field3915 > 0) {
            class223.field3915--;
        }
        if (class257.field4426[96] || class257.field4426[97] || class257.field4426[98] || class257.field4426[99]) {
            class5.field104 = true;
        }
        if (class5.field104 && class223.field3915 <= 0) {
            class5.field104 = false;
            class223.field3915 = 20;
            class225.field3935++;
            class71.field1320.method570(116, arg0 ^ 0xFFFFA1F0);
            class71.field1320.method1324(class118.field1997, arg0 - 8276);
            class71.field1320.method1310(arg0 ^ 0x5EF0, class115.field1945);
        }
        if (class157.field2695 && !class17.field493) {
            class17.field493 = true;
            class105.field1797++;
            class71.field1320.method570(68, -1);
            class71.field1320.method1352(arg0 ^ 0x4367, 1);
        }
        if (!class157.field2695 && class17.field493) {
            class105.field1797++;
            class17.field493 = false;
            class71.field1320.method570(68, -1);
            class71.field1320.method1352(7528, 0);
        }
        if (!class183.field3204) {
            class71.field1320.method570(37, -1);
            class71.field1320.method1309(-2, class82.method525(0));
            class183.field3204 = true;
            class102.field1745++;
        }
        class189.method1267(127);
        if (class105.field1799 != 30) {
            return;
        }
        class47.method323(-119);
        class129.method870((byte) 125);
        class203.field3594++;
        if (arg0 != 24079) {
            field3153 = 91;
        }
        if (class203.field3594 > 750) {
            class263.method1848((byte) 88);
            return;
        }
        class306.method2094((byte) -88);
        class229.method1576(-24999);
        class223.method1534(107);
        if (class242.field4146 != null) {
            class15.method117(-123);
        }
        for (int var19 = class310.method2110(true, arg0 - 24077); var19 != -1; var19 = class310.method2110(false, arg0 - 24077)) {
            class290.method1998(var19, true);
            class222.field3895[class238.method1622(class84.field1488++, 31)] = var19;
        }
        for (class229 var20 = class264.method1849(-126); var20 != null; var20 = class264.method1849(-126)) {
            int var21 = var20.method1571((byte) -17);
            int var22 = var20.method1568(-105);
            if (var21 == 1) {
                class189.field3287[var22] = var20.field3981;
                class314.field5332[class238.method1622(31, class259.field4462++)] = var22;
            } else if (var21 == 2) {
                class207.field3630[var22] = var20.field3991;
                class260.field4506[class238.method1622(31, class222.field3904++)] = var22;
            } else if (var21 == 3) {
                class10 var42 = class233.method1606(true, var22);
                if (!var20.field3991.method855(var42.field207, arg0 - 23824)) {
                    var42.field207 = var20.field3991;
                    class7.method48(var42, arg0 ^ 0x5E0F);
                }
            } else if (var21 == 4) {
                class10 var39 = class233.method1606(true, var22);
                int var40 = var20.field3981;
                int var41 = var20.field3980;
                if (var39.field283 != var40 || var39.field265 != var41) {
                    var39.field265 = var41;
                    var39.field283 = var40;
                    class7.method48(var39, 0);
                }
            } else if (var21 == 5) {
                class10 var23 = class233.method1606(true, var22);
                if (var20.field3981 != var23.field275 || var20.field3981 == -1) {
                    var23.field275 = var20.field3981;
                    var23.field315 = 0;
                    var23.field354 = 0;
                    class7.method48(var23, 0);
                }
            } else if (var21 == 6) {
                int var24 = var20.field3981;
                int var25 = (var24 & 0x7E69) >> 10;
                int var26 = (var24 & 0x3E1) >> 5;
                int var27 = var24 & 0x1F;
                int var28 = (var25 << 19) + (var26 << 11) + (var27 << 3);
                class10 var29 = class233.method1606(true, var22);
                if (var29.field256 != var28) {
                    var29.field256 = var28;
                    class7.method48(var29, 0);
                }
            } else if (var21 == 7) {
                class10 var30 = class233.method1606(true, var22);
                boolean var31 = var20.field3981 == 1;
                if (var30.field292 != var31) {
                    var30.field292 = var31;
                    class7.method48(var30, 0);
                }
            } else if (var21 == 8) {
                class10 var32 = class233.method1606(true, var22);
                if (var20.field3981 != var32.field231 || var20.field3980 != var32.field290 || var20.field3983 != var32.field264) {
                    var32.field290 = var20.field3980;
                    var32.field264 = var20.field3983;
                    if (var32.field299 != -1) {
                        if (var32.field276 > 0) {
                            var32.field264 = var32.field264 * 32 / var32.field276;
                        } else if (var32.field327 > 0) {
                            var32.field264 = var32.field264 * 32 / var32.field327;
                        }
                    }
                    var32.field231 = var20.field3981;
                    class7.method48(var32, 0);
                }
            } else if (var21 == 9) {
                class10 var38 = class233.method1606(true, var22);
                if (var20.field3981 != var38.field299 || var20.field3980 != var38.field252) {
                    var38.field299 = var20.field3981;
                    var38.field252 = var20.field3980;
                    class7.method48(var38, 0);
                }
            } else if (var21 == 10) {
                class10 var33 = class233.method1606(true, var22);
                if (var20.field3981 != var33.field212 || var20.field3980 != var33.field228 || var20.field3983 != var33.field225) {
                    var33.field228 = var20.field3980;
                    var33.field212 = var20.field3981;
                    var33.field225 = var20.field3983;
                    class7.method48(var33, arg0 ^ 0x5E0F);
                }
            } else if (var21 == 11) {
                class10 var37 = class233.method1606(true, var22);
                var37.field253 = var37.field249 = var20.field3981;
                var37.field309 = var37.field338 = var20.field3980;
                var37.field341 = 0;
                var37.field270 = 0;
                class7.method48(var37, 0);
            } else if (var21 == 12) {
                class10 var35 = class233.method1606(true, var22);
                int var36 = var20.field3981;
                if (var35 != null && var35.field288 == 0) {
                    if (var36 > var35.field349 - var35.field226) {
                        var36 = var35.field349 - var35.field226;
                    }
                    if (var36 < 0) {
                        var36 = 0;
                    }
                    if (var35.field241 != var36) {
                        var35.field241 = var36;
                        class7.method48(var35, 0);
                    }
                }
            } else if (var21 == 13) {
                class10 var34 = class233.method1606(true, var22);
                var34.field274 = var20.field3981;
            }
        }
        class50.field992++;
        if (class34.field727 != 0) {
            class148.field2549 += 20;
            if (class148.field2549 >= 400) {
                class34.field727 = 0;
            }
        }
        if (class144.field2462 != null) {
            class5.field91++;
            if (class5.field91 >= 15) {
                class7.method48(class144.field2462, 0);
                class144.field2462 = null;
            }
        }
        if (class81.field1457 != null) {
            class7.method48(class81.field1457, 0);
            if (class275.field4760 > (class219.field3867 + 5) || class275.field4760 < (class219.field3867 - 5) || (class115.field1943 + 5) < class77.field1411 || (class115.field1943 - 5) > class77.field1411) {
                class252.field4360 = true;
            }
            class259.field4459++;
            if (class239.field4081 == 0) {
                if (class252.field4360 && class259.field4459 >= 5) {
                    if (class81.field1457 == class185.field3223 && class262.field4541 != class129.field2263) {
                        class306.field5202++;
                        byte var43 = 0;
                        class10 var44 = class81.field1457;
                        if (class82.field1471 == 1 && var44.field222 == 206) {
                            var43 = 1;
                        }
                        if (var44.field336[class129.field2263] <= 0) {
                            var43 = 0;
                        }
                        if (class125.method767(client.method1657(var44), arg0 ^ 0xFF5EF0)) {
                            int var45 = class129.field2263;
                            int var46 = class262.field4541;
                            var44.field336[var45] = var44.field336[var46];
                            var44.field324[var45] = var44.field324[var46];
                            var44.field336[var46] = -1;
                            var44.field324[var46] = 0;
                        } else if (var43 == 1) {
                            int var47 = class129.field2263;
                            int var48 = class262.field4541;
                            while (var47 != var48) {
                                if (var47 < var48) {
                                    var44.method74(var48, false, var48 - 1);
                                    var48--;
                                } else if (var47 > var48) {
                                    var44.method74(var48, false, var48 + 1);
                                    var48++;
                                }
                            }
                        } else {
                            var44.method74(class262.field4541, false, class129.field2263);
                        }
                        class71.field1320.method570(206, -1);
                        class71.field1320.method1324(class262.field4541, 15803);
                        class71.field1320.method1306(var43, (byte) -112);
                        class71.field1320.method1324(class129.field2263, arg0 - 8276);
                        class71.field1320.method1309(-2, class81.field1457.field230);
                    }
                } else if ((class191.field3315 == 1 || class20.method145(class275.field4769 - 1, (byte) -50)) && class275.field4769 > 2) {
                    class118.method709(25608);
                } else if (class275.field4769 > 0) {
                    class315.method2178(-3595);
                }
                class5.field91 = 10;
                class81.field1457 = null;
                class103.field1767 = 0;
            }
        }
        class109.field1856 = 0;
        class222.field3906 = null;
        class256.field4405 = false;
        class15.field411 = false;
        class10 var49 = class279.field4829;
        class279.field4829 = null;
        class10 var50 = class43.field870;
        class43.field870 = null;
        while (class86.method544(0) && class109.field1856 < 128) {
            class106.field1812[class109.field1856] = class309.field5245;
            class32.field710[class109.field1856] = class74.field1397;
            class109.field1856++;
        }
        class257.field4418 = null;
        class242.field4146 = null;
        if (class196.field3433 != -1) {
            class281.method1961(class196.field3433, class16.field420, 0, class199.field3465, 0, 0, 0, -1);
        }
        class104.field1788++;
        if (class257.field4418 != null) {
            class54.method367(class257.field4418, false, class308.field5237, class102.field1757);
            class257.field4418 = null;
        }
        while (true) {
            class102 var51;
            class10 var52;
            class10 var53;
            do {
                var51 = (class102) class50.field979.method2020((byte) -120);
                if (var51 == null) {
                    while (true) {
                        class102 var54;
                        class10 var55;
                        class10 var56;
                        do {
                            var54 = (class102) class109.field1849.method2020((byte) -117);
                            if (var54 == null) {
                                while (true) {
                                    class102 var57;
                                    class10 var58;
                                    class10 var59;
                                    do {
                                        var57 = (class102) class123.field2073.method2020((byte) -54);
                                        if (var57 == null) {
                                            if (class165.field2841 && class242.field4146 == null) {
                                                class165.field2841 = false;
                                            }
                                            if (class165.field2839 != null) {
                                                class265.method1857(-1);
                                            }
                                            if (class226.field3943 > 0 && class257.field4426[82] && class257.field4426[81] && class235.field4041 != 0) {
                                                int var60 = class133.field2315 - class235.field4041;
                                                if (var60 < 0) {
                                                    var60 = 0;
                                                } else if (var60 > 3) {
                                                    var60 = 3;
                                                }
                                                class106.method651(false, class163.field2796.field422[0] + class4.field72, var60, class163.field2796.field450[0] + class221.field3889);
                                            }
                                            if (class204.field3604 != -1) {
                                                int var61 = class204.field3604;
                                                int var62 = class260.field4511;
                                                if (class226.field3943 > 0 && class257.field4426[82] && class257.field4426[81]) {
                                                    class106.method651(false, class4.field72 + var62, class133.field2315, class221.field3889 + var61);
                                                } else if (class259.field4479) {
                                                    class71.field1320.method570(243, arg0 - 24080);
                                                    class153.field2629++;
                                                    class71.field1320.method1309(-2, class88.field1514);
                                                    class71.field1320.method1298(class4.field72 + var62, (byte) -109);
                                                    class71.field1320.method1314((byte) -126, class221.field3889 + var61);
                                                    class71.field1320.method1298(class65.field1257, (byte) -110);
                                                    class240.field4097 = class45.field915;
                                                    class34.field727 = 1;
                                                    class148.field2549 = 0;
                                                    class97.field1685 = class241.field4129;
                                                } else {
                                                    boolean var63 = class11.method87(0, 0, 0, 0, class163.field2796.field422[0], var61, arg0 - 24079, class163.field2796.field450[0], var62, 0, 0, true);
                                                    if (var63) {
                                                        class97.field1685 = class241.field4129;
                                                        class34.field727 = 1;
                                                        class148.field2549 = 0;
                                                        class240.field4097 = class45.field915;
                                                    }
                                                }
                                                class204.field3604 = -1;
                                                class259.field4479 = false;
                                            }
                                            class56.method373(-99);
                                            if (class279.field4829 != var49) {
                                                if (var49 != null) {
                                                    class7.method48(var49, 0);
                                                }
                                                if (class279.field4829 != null) {
                                                    class7.method48(class279.field4829, 0);
                                                }
                                            }
                                            if (class43.field870 != var50 && class98.field1702 == class315.field5342) {
                                                if (var50 != null) {
                                                    class7.method48(var50, 0);
                                                }
                                                if (class43.field870 != null) {
                                                    class7.method48(class43.field870, 0);
                                                }
                                            }
                                            if (class43.field870 == null) {
                                                if (class98.field1702 > 0) {
                                                    class98.field1702--;
                                                }
                                            } else if (class98.field1702 < class315.field5342) {
                                                class98.field1702++;
                                                if (class98.field1702 == class315.field5342) {
                                                    class7.method48(class43.field870, 0);
                                                }
                                            }
                                            if (class1.field21 == 1) {
                                                class116.method695(0);
                                            } else if (class1.field21 == 2) {
                                                class39.method269(0);
                                            } else {
                                                class118.method705(113);
                                            }
                                            for (int var64 = 0; var64 < 5; var64++) {
                                                int var10002 = class117.field1988[var64]++;
                                            }
                                            int var65 = class66.method445(24219);
                                            int var66 = class93.method582(-116);
                                            if (var65 > 4500 && var66 > 4500) {
                                                class39.field828++;
                                                class298.field5078 = 250;
                                                class215.method1490((byte) 106, 4000);
                                                class71.field1320.method570(2, arg0 ^ 0xFFFFA1F0);
                                            }
                                            if (class74.field1399 != null && class74.field1399.field560 == 1) {
                                                if (class74.field1399.field562 != null) {
                                                    class84.method532(class7.field167, class72.field1328, false);
                                                }
                                                class72.field1328 = false;
                                                class7.field167 = null;
                                                class74.field1399 = null;
                                            }
                                            class28.field593++;
                                            class157.field2697++;
                                            class17.field486++;
                                            if (class157.field2697 > 500) {
                                                class157.field2697 = 0;
                                                int var67 = (int) (Math.random() * 8.0D);
                                                if ((var67 & 0x2) == 2) {
                                                    class215.field3788 += class207.field3632;
                                                }
                                                if ((var67 & 0x1) == 1) {
                                                    class53.field1033 += class156.field2685;
                                                }
                                                if ((var67 & 0x4) == 4) {
                                                    class31.field696 += class164.field2824;
                                                }
                                            }
                                            if (class53.field1033 < -50) {
                                                class156.field2685 = 2;
                                            }
                                            if (class215.field3788 < -55) {
                                                class207.field3632 = 2;
                                            }
                                            if (class31.field696 < -40) {
                                                class164.field2824 = 1;
                                            }
                                            if (class28.field593 > 500) {
                                                class28.field593 = 0;
                                                int var68 = (int) (Math.random() * 8.0D);
                                                if ((var68 & 0x1) == 1) {
                                                    class216.field3803 += class278.field4796;
                                                }
                                                if ((var68 & 0x2) == 2) {
                                                    class145.field2480 += class311.field5267;
                                                }
                                            }
                                            if (class53.field1033 > 50) {
                                                class156.field2685 = -2;
                                            }
                                            if (class31.field696 > 40) {
                                                class164.field2824 = -1;
                                            }
                                            if (class215.field3788 > 55) {
                                                class207.field3632 = -2;
                                            }
                                            if (class216.field3803 < -60) {
                                                class278.field4796 = 2;
                                            }
                                            if (class216.field3803 > 60) {
                                                class278.field4796 = -2;
                                            }
                                            if (class145.field2480 < -20) {
                                                class311.field5267 = 1;
                                            }
                                            if (class145.field2480 > 10) {
                                                class311.field5267 = -1;
                                            }
                                            if (class17.field486 > 50) {
                                                class242.field4140++;
                                                class71.field1320.method570(1, -1);
                                            }
                                            if (class132.field2300) {
                                                class98.method617(arg0 ^ 0xFFFF9982);
                                                class132.field2300 = false;
                                            }
                                            try {
                                                if (class121.field2041 != null && class71.field1320.field3380 > 0) {
                                                    class121.field2041.method1228(class71.field1320.field3417, 0, false, class71.field1320.field3380);
                                                    class17.field486 = 0;
                                                    class71.field1320.field3380 = 0;
                                                }
                                            } catch (IOException var70) {
                                                class263.method1848((byte) 88);
                                            }
                                            return;
                                        }
                                        var58 = var57.field1738;
                                        if (var58.field259 < 0) {
                                            break;
                                        }
                                        var59 = class233.method1606(true, var58.field267);
                                    } while (var59 == null || var59.field348 == null || var59.field348.length <= var58.field259 || var59.field348[var58.field259] != var58);
                                    class249.method1739(var57, -71);
                                }
                            }
                            var55 = var54.field1738;
                            if (var55.field259 < 0) {
                                break;
                            }
                            var56 = class233.method1606(true, var55.field267);
                        } while (var56 == null || var56.field348 == null || var56.field348.length <= var55.field259 || var56.field348[var55.field259] != var55);
                        class249.method1739(var54, -71);
                    }
                }
                var52 = var51.field1738;
                if (var52.field259 < 0) {
                    break;
                }
                var53 = class233.method1606(true, var52.field267);
            } while (var53 == null || var53.field348 == null || var52.field259 >= var53.field348.length || var53.field348[var52.field259] != var52);
            class249.method1739(var51, arg0 ^ 0xFFFFA1B6);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 1337)
    public static void method1234(int arg0) {
        field3155 = null;
        field3158 = null;
        if (arg0 != -2) {
            method1226(true, -11);
        }
    }
}
