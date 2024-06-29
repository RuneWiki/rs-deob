import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class248 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "J")
    private long field3932 = -1L;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "J")
    private long field3939 = -1L;

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    private int field3952 = 0;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Leo;")
    private class133 field3930;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "J")
    private long field3927;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "J")
    private long field3934;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "[B")
    private byte[] field3954;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "[B")
    private byte[] field3944;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "J")
    private long field3937;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field3924 = 0;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "[I")
    public static int[] field3931 = new int[200];

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    private int field3946;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "J")
    private long field3929;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "Lnm;")
    public static class221 field3951;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
    public static int[] field3938;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "[I")
    public static int[] field3943;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method1754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 7083) {
            method1760((class274) null, (byte) 124);
        }
        field3928++;
        for (class250 var5 = (class250) class250.field3988.method1081(107); var5 != null; var5 = (class250) class250.field3988.method1083((byte) 113)) {
            class41.method327(arg3 ^ 0x1BAB, arg2, var5, arg4, arg0, arg1);
        }
        for (class250 var6 = (class250) class49.field701.method1081(arg3 - 6957); var6 != null; var6 = (class250) class49.field701.method1083((byte) 113)) {
            class118 var7 = var6.field3968.method2025((byte) 126);
            byte var8 = 1;
            if (var6.field3968.field4750 == var7.field1739) {
                var8 = 0;
            } else if (var6.field3968.field4750 == var7.field1738 || var6.field3968.field4750 == var7.field1749 || var6.field3968.field4750 == var7.field1713 || var6.field3968.field4750 == var7.field1715) {
                var8 = 2;
            } else if (var6.field3968.field4750 == var7.field1741 || var6.field3968.field4750 == var7.field1751 || var6.field3968.field4750 == var7.field1727 || var6.field3968.field4750 == var7.field1752) {
                var8 = 3;
            }
            if (var6.field3982 != var8) {
                int var9 = class142.method1004(var6.field3968, 20438);
                if (var6.field3972 != var9) {
                    if (var6.field3983 != null) {
                        class28.field434.method1412(var6.field3983);
                        var6.field3983 = null;
                    }
                    var6.field3972 = var9;
                }
                var6.field3982 = var8;
            }
            var6.field3987 = var6.field3968.field4796;
            var6.field3970 = var6.field3968.field4796 + var6.field3968.method312(arg3 ^ 0xFFFFE413) * 64;
            var6.field3989 = var6.field3968.field4783;
            var6.field3977 = var6.field3968.field4783 + var6.field3968.method312(37) * 64;
            class41.method327(0, arg2, var6, arg4, arg0, arg1);
        }
        for (class250 var10 = (class250) class109.field1586.method27(arg3 ^ 0x1BD4); var10 != null; var10 = (class250) class109.field1586.method34(arg3 - 7075)) {
            byte var11 = 1;
            class118 var12 = var10.field3984.method2025((byte) 116);
            if (var10.field3984.field4750 == var12.field1739) {
                var11 = 0;
            } else if (var10.field3984.field4750 == var12.field1738 || var10.field3984.field4750 == var12.field1749 || var10.field3984.field4750 == var12.field1713 || var10.field3984.field4750 == var12.field1715) {
                var11 = 2;
            } else if (var10.field3984.field4750 == var12.field1741 || var10.field3984.field4750 == var12.field1751 || var10.field3984.field4750 == var12.field1727 || var10.field3984.field4750 == var12.field1752) {
                var11 = 3;
            }
            if (var10.field3982 != var11) {
                int var13 = class68.method477((byte) 72, var10.field3984);
                if (var10.field3972 != var13) {
                    if (var10.field3983 != null) {
                        class28.field434.method1412(var10.field3983);
                        var10.field3983 = null;
                    }
                    var10.field3972 = var13;
                }
                var10.field3982 = var11;
            }
            var10.field3987 = var10.field3984.field4796;
            var10.field3970 = var10.field3984.field4796 + var10.field3984.method312(21) * 64;
            var10.field3989 = var10.field3984.field4783;
            var10.field3977 = var10.field3984.field4783 + (var10.field3984.method312(-81) * 64);
            class41.method327(arg3 ^ 0x1BAB, arg2, var10, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BII)V", line = 123)
    public final void method1755(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3935++;
        try {
            if (arg3 > 12) {
                if (this.field3934 < (this.field3937 + ((long) arg2))) {
                    this.field3934 = (long) arg2 + this.field3937;
                }
                if (this.field3932 != -1L && (this.field3932 > this.field3937 || this.field3937 > ((long) this.field3952 + this.field3932))) {
                    this.method1761(-1);
                }
                if (this.field3932 != -1L && ((long) this.field3944.length + this.field3932) < ((long) arg2 + this.field3937)) {
                    int var5 = (int) ((long) this.field3944.length + this.field3932 - this.field3937);
                    class298.method2103(arg1, arg0, this.field3944, (int) (this.field3937 - this.field3932), var5);
                    arg2 -= var5;
                    this.field3937 += (long) var5;
                    this.field3952 = this.field3944.length;
                    this.method1761(-1);
                    arg0 += var5;
                }
                if (arg2 > this.field3944.length) {
                    long var6 = -1L;
                    if (this.field3937 != this.field3929) {
                        this.field3930.method868(0, this.field3937);
                        this.field3929 = this.field3937;
                    }
                    this.field3930.method866(arg2, arg1, -83, arg0);
                    if (this.field3937 >= this.field3939 && ((long) this.field3946 + this.field3939) > this.field3937) {
                        var6 = this.field3937;
                    } else if (this.field3937 <= this.field3939 && ((long) arg2 + this.field3937) > this.field3939) {
                        var6 = this.field3939;
                    }
                    long var8 = -1L;
                    this.field3929 += (long) arg2;
                    if (this.field3929 > this.field3927) {
                        this.field3927 = this.field3929;
                    }
                    if (this.field3939 < ((long) arg2 + this.field3937) && ((long) arg2 + this.field3937) <= (this.field3939 + ((long) this.field3946))) {
                        var8 = (long) arg2 + this.field3937;
                    } else if (this.field3937 < (long) this.field3946 + this.field3939 && ((long) this.field3946 + this.field3939) <= ((long) arg2 + this.field3937)) {
                        var8 = this.field3939 + ((long) this.field3946);
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class298.method2103(arg1, (int) ((long) arg0 + var6 - this.field3937), this.field3954, (int) (var6 - this.field3939), var10);
                    }
                    this.field3937 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field3932 == -1L) {
                        this.field3932 = this.field3937;
                    }
                    class298.method2103(arg1, arg0, this.field3944, (int) (this.field3937 - this.field3932), arg2);
                    this.field3937 += (long) arg2;
                    if ((long) this.field3952 < this.field3937 - this.field3932) {
                        this.field3952 = (int) (this.field3937 - this.field3932);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3929 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IJ)V", line = 245)
    public final void method1756(int arg0, long arg1) throws IOException {
        field3925++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1763((byte) 108));
        }
        this.field3937 = arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 257)
    public static final void method1757(int arg0) {
        class181.field2820.method644((byte) -123);
        class195.field2988.method644((byte) -45);
        field3942++;
        if (arg0 != 0) {
            field3943 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILuo;ZLjava/awt/Component;)Lon;", line = 269)
    public static final class151 method1758(int arg0, int arg1, class274 arg2, boolean arg3, Component arg4) {
        field3933++;
        if (class322.field5294 == 0) {
            throw new IllegalStateException();
        }
        if (arg3) {
            method1754(-97, 63, 62, -109, -74);
        }
        if (arg0 < 0 || arg0 >= 2) {
            throw new IllegalArgumentException();
        }
        if (arg1 < 256) {
            arg1 = 256;
        }
        try {
            class151 var5 = (class151) Class.forName("qa").getDeclaredConstructor().newInstance();
            var5.field2438 = new int[(class228.field3587 ? 2 : 1) * 256];
            var5.field2448 = arg1;
            var5.method705(arg4);
            var5.field2455 = (arg1 & 0xFFFFFC00) + 1024;
            if (var5.field2455 > 16384) {
                var5.field2455 = 16384;
            }
            var5.method709(var5.field2455);
            if (class89.field1298 > 0 && class148.field2395 == null) {
                class148.field2395 = new class297();
                class148.field2395.field4921 = arg2;
                arg2.method1952(0, class89.field1298, class148.field2395);
            }
            if (class148.field2395 != null) {
                if (class148.field2395.field4928[arg0] != null) {
                    throw new IllegalArgumentException();
                }
                class148.field2395.field4928[arg0] = var5;
            }
            return var5;
        } catch (Throwable var10) {
            try {
                class336 var7 = new class336(arg2, arg0);
                var7.field2448 = arg1;
                var7.field2438 = new int[(class228.field3587 ? 2 : 1) * 256];
                var7.method705(arg4);
                var7.field2455 = 16384;
                var7.method709(var7.field2455);
                if (class89.field1298 > 0 && class148.field2395 == null) {
                    class148.field2395 = new class297();
                    class148.field2395.field4921 = arg2;
                    arg2.method1952(0, class89.field1298, class148.field2395);
                }
                if (class148.field2395 != null) {
                    if (class148.field2395.field4928[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class148.field2395.field4928[arg0] = var7;
                }
                return var7;
            } catch (Throwable var9) {
                return new class151();
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(IIIII)V", line = 356)
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class245.field3886) {
            class335.method2375(arg3, arg0, arg2 + arg3, arg0 + arg1);
            class335.method2380(arg3, arg0, arg2, arg1, 0);
        } else {
            class317.method2273(arg3, arg0, arg2 + arg3, arg0 + arg1);
            class317.method2282(arg3, arg0, arg2, arg1, 0);
        }
        field3947++;
        if (class334.field5425 < 100) {
            return;
        }
        float var5 = (float) class88.field1262 / (float) class88.field1263;
        int var6 = arg1;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var6 = (int) ((float) arg2 * var5);
        } else {
            var7 = (int) ((float) arg1 / var5);
        }
        int var8 = (arg1 - var6) / 2 + arg0;
        int var9 = (arg2 - var7) / 2 + arg3;
        if (class50.field724 == null || class50.field724.field4802 != arg2 || class50.field724.field4811 != arg1) {
            class137 var10 = new class137(arg2, arg1);
            class317.method2280(var10.field2172, arg2, arg1);
            if (class88.field1260.field4530 != -1) {
                class317.method2282(0, 0, arg2, arg1, class88.field1260.field4530);
            }
            class88.method587(0, 0, class88.field1263, class88.field1262, 0, 0, var7, var6);
            class88.method589();
            if (class245.field3886) {
                class50.field724 = new class232(var10);
            } else {
                class50.field724 = var10;
            }
            if (class245.field3886) {
                class317.field5228 = null;
            } else {
                class92.field1331.method1169(0);
            }
        }
        class50.field724.method966(var9, var8);
        int var11 = class217.field3349 * var6 / class88.field1262 + var8;
        int var12 = class224.field3462 * var7 / class88.field1263;
        int var13 = class318.field5244 * var6 / class88.field1262;
        if (arg4 < 62) {
            method1757(45);
        }
        int var14 = class165.field2605 * var7 / class88.field1263 + var9;
        int var15 = 16711680;
        if (class179.field2789 == 1) {
            var15 = 16777215;
        }
        if (class245.field3886) {
            class335.method2365(var14, var11, var12, var13, var15, 128);
            class335.method2376(var14, var11, var12, var13, var15);
        } else {
            class317.method2270(var14, var11, var12, var13, var15, 128);
            class317.method2266(var14, var11, var12, var13, var15);
        }
        if (class268.field4416 <= 0) {
            return;
        }
        int var16;
        if (class6.field76 <= 50) {
            var16 = class6.field76 * 5;
        } else {
            var16 = 500 - (class6.field76 * 5);
        }
        for (class148 var17 = (class148) class88.field1258.method1350(0); var17 != null; var17 = (class148) class88.field1258.method1351(-98)) {
            class312 var18 = class165.method1150(var17.field2378, (byte) -70);
            if (class227.method1545(var18, 125)) {
                if (class325.field5326 == var17.field2378) {
                    int var21 = var17.field2391 * var7 / class88.field1263 + var9;
                    int var22 = var17.field2381 * var6 / class88.field1262 + var8;
                    if (class245.field3886) {
                        class335.method2365(var21 - 2, var22 - 2, 4, 4, 16776960, var16);
                    } else {
                        class317.method2270(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    }
                } else if (class2.field14 != -1 && class2.field14 == var18.field5095) {
                    int var19 = var17.field2391 * var7 / class88.field1263 + var9;
                    int var20 = var17.field2381 * var6 / class88.field1262 + var8;
                    if (class245.field3886) {
                        class335.method2365(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    } else {
                        class317.method2270(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Luo;B)V", line = 500)
    public static final void method1760(class274 arg0, byte arg1) {
        class75.field1138 = 3;
        field3949++;
        class133 var2 = null;
        class101.method659(true, 0);
        class58.field878 = 127;
        class118.field1725 = true;
        class121.field1814 = true;
        class315.field5201 = 255;
        class182.field2824 = 127;
        if (arg1 < 37) {
            method1760((class274) null, (byte) 57);
        }
        class295.field4905 = true;
        class352.field5610 = true;
        class162.field2580 = 2;
        class72.field1105 = 0;
        class322.field5287 = true;
        class70.field1094 = 0;
        class142.field2279 = true;
        class347.field5557 = true;
        class178.field2777 = true;
        class96.field1398 = true;
        class115.field1680 = true;
        class251.field4012 = 0;
        class153.field2486 = true;
        class306.field4997 = 0;
        if (class6.field81 < 96) {
            class145.method1035(0);
        } else {
            class145.method1035(2);
        }
        class307.field5005 = false;
        class299.field4941 = 0;
        class31.field478 = 0;
        class201.field3094 = false;
        class115.field1689 = false;
        class295.field4901 = 0;
        class186.field2903 = true;
        try {
            class158 var3 = arg0.method1957(10, "runescape");
            while (var3.field2542 == 0) {
                class177.method1246(1L, -32644);
            }
            if (var3.field2542 == 1) {
                var2 = (class133) var3.field2538;
                byte[] var4 = new byte[(int) var2.method867(false)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method864(var4, (byte) 27, var4.length - var5, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class266.method1876(-56, new class313(var4));
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method865((byte) -113);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 587)
    private final void method1761(int arg0) throws IOException {
        if (this.field3932 != -1L) {
            if (this.field3932 != this.field3929) {
                this.field3930.method868(0, this.field3932);
                this.field3929 = this.field3932;
            }
            long var2 = -1L;
            this.field3930.method866(this.field3952, this.field3944, -86, 0);
            this.field3929 += (long) this.field3952;
            if (this.field3932 >= this.field3939 && this.field3932 < ((long) this.field3946 + this.field3939)) {
                var2 = this.field3932;
            } else if (this.field3932 <= this.field3939 && this.field3932 + ((long) this.field3952) > this.field3939) {
                var2 = this.field3939;
            }
            if (this.field3929 > this.field3927) {
                this.field3927 = this.field3929;
            }
            long var4 = -1L;
            if (this.field3939 < (long) this.field3952 + this.field3932 && ((long) this.field3946 + this.field3939) >= ((long) this.field3952 + this.field3932)) {
                var4 = (long) this.field3952 + this.field3932;
            } else if (this.field3932 < ((long) this.field3946 + this.field3939) && (long) this.field3952 + this.field3932 >= (long) this.field3946 + this.field3939) {
                var4 = this.field3939 + ((long) this.field3946);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class298.method2103(this.field3944, (int) (var2 - this.field3932), this.field3954, (int) (var2 - this.field3939), var6);
            }
            this.field3932 = -1L;
            this.field3952 = 0;
        }
        if (arg0 == -1) {
            field3940++;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)J", line = 675)
    public final long method1762(byte arg0) {
        int var2 = -32 / ((arg0 - 18) / 38);
        field3941++;
        return this.field3934;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Leo;II)V", line = 1028)
    public class248(class133 arg0, int arg1, int arg2) throws IOException {
        this.field3930 = arg0;
        this.field3934 = this.field3927 = arg0.method867(false);
        this.field3954 = new byte[arg1];
        this.field3944 = new byte[arg2];
        this.field3937 = 0L;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(B)Ljava/io/File;", line = 692)
    private final File method1763(byte arg0) {
        int var2 = -127 / ((60 - arg0) / 40);
        field3936++;
        return this.field3930.method863(-63);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V", line = 704)
    private final void method1764(int arg0) throws IOException {
        this.field3946 = 0;
        if (this.field3937 != this.field3929) {
            this.field3930.method868(0, this.field3937);
            this.field3929 = this.field3937;
        }
        field3945++;
        if (arg0 != -1) {
            return;
        }
        this.field3939 = this.field3937;
        while (this.field3946 < this.field3954.length) {
            int var2 = this.field3954.length - this.field3946;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3930.method864(this.field3954, (byte) 27, var2, this.field3946);
            if (var3 == -1) {
                break;
            }
            this.field3946 += var3;
            this.field3929 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V", line = 760)
    public static void method1765(int arg0) {
        field3931 = null;
        field3943 = null;
        field3951 = null;
        if (arg0 != 304) {
            method1754(120, -100, 123, -67, 104);
        }
        field3938 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BIBI)V", line = 773)
    public final void method1766(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field3950++;
        try {
            if (arg3 + arg1 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field3932 != -1L && this.field3937 >= this.field3932 && ((long) this.field3952 + this.field3932) >= ((long) arg1 + this.field3937)) {
                class298.method2103(this.field3944, (int) (this.field3937 - this.field3932), arg0, arg3, arg1);
                this.field3937 += (long) arg1;
                return;
            }
            long var5 = this.field3937;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field3937 >= this.field3939 && this.field3939 + ((long) this.field3946) > this.field3937) {
                int var9 = (int) (this.field3939 + (long) this.field3946 - this.field3937);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class298.method2103(this.field3954, (int) (this.field3937 - this.field3939), arg0, arg3, var9);
                this.field3937 += (long) var9;
                arg3 += var9;
            }
            if (arg1 > this.field3954.length) {
                this.field3930.method868(0, this.field3937);
                this.field3929 = this.field3937;
                while (arg1 > 0) {
                    int var11 = this.field3930.method864(arg0, (byte) 27, arg1, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3929 += (long) var11;
                    arg1 -= var11;
                    arg3 += var11;
                    this.field3937 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method1764(-1);
                int var10 = arg1;
                if (arg1 > this.field3946) {
                    var10 = this.field3946;
                }
                arg1 -= var10;
                class298.method2103(this.field3954, 0, arg0, arg3, var10);
                arg3 += var10;
                this.field3937 += (long) var10;
            }
            if (this.field3932 != -1L) {
                if (this.field3937 < this.field3932 && arg1 > 0) {
                    int var12 = (int) (this.field3932 - this.field3937) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0[arg3++] = 0;
                        this.field3937++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < (long) this.field3952 + this.field3932 && (long) var8 + var5 >= (long) this.field3952 + this.field3932) {
                    var15 = this.field3932 + ((long) this.field3952);
                } else if ((long) var8 + var5 > this.field3932 && ((long) var8 + var5) <= ((long) this.field3952 + this.field3932)) {
                    var15 = (long) var8 + var5;
                }
                if (this.field3932 >= var5 && ((long) var8 + var5) > this.field3932) {
                    var13 = this.field3932;
                } else if (var5 >= this.field3932 && (long) this.field3952 + this.field3932 > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class298.method2103(this.field3944, (int) (var13 - this.field3932), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field3937 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3937));
                        this.field3937 = var15;
                    }
                }
            }
            int var18 = 0 % ((-arg2 - 37) / 45);
        } catch (IOException var20) {
            this.field3929 = -1L;
            throw var20;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)V", line = 968)
    public final void method1767(byte[] arg0, int arg1) throws IOException {
        if (arg1 != -26770) {
            field3943 = (int[]) null;
        }
        field3953++;
        this.method1766(arg0, arg0.length, (byte) -92, 0);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Luj;BZ)V", line = 980)
    public static final void method1768(class175 arg0, byte arg1, boolean arg2) {
        int var3 = -98 % ((35 - arg1) / 48);
        field3926++;
        if (class245.field3886 || arg2) {
            int var4 = class243.field3838;
            int var5 = var4 * 956 / 503;
            class15.field201.method959((class233.field3712 - var5) / 2, 0, var5, var4);
            class13.field165.method572(class233.field3712 / 2 - class13.field165.field2915 / 2, 18);
        }
        arg0.method1222(class179.field2789 == 1 ? class41.field631 : class55.field824, class233.field3712 / 2, class243.field3838 / 2 - 26, 16777215, -1);
        int var6 = class243.field3838 / 2 - 18;
        if (class245.field3886) {
            class335.method2376(class233.field3712 / 2 - 152, var6, 304, 34, 9179409);
            class335.method2376(class233.field3712 / 2 - 151, var6 + 1, 302, 32, 0);
            class335.method2380(class233.field3712 / 2 - 150, var6 + 2, class353.field5618 * 3, 30, 9179409);
            class335.method2380(class353.field5618 * 3 + (class233.field3712 / 2 - 150), var6 - -2, 300 - (class353.field5618 * 3), 30, 0);
        } else {
            class317.method2266(class233.field3712 / 2 - 152, var6, 304, 34, 9179409);
            class317.method2266(class233.field3712 / 2 - 151, var6 - -1, 302, 32, 0);
            class317.method2282(class233.field3712 / 2 - 150, var6 + 2, class353.field5618 * 3, 30, 9179409);
            class317.method2282(class233.field3712 / 2 + class353.field5618 * 3 - 150, var6 + 2, 300 - (class353.field5618 * 3), 30, 0);
        }
        arg0.method1222(class98.field1411, class233.field3712 / 2, class243.field3838 / 2 + 4, 16777215, -1);
    }
}
