import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class383 {

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    private int field5456 = 0;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "J")
    private long field5473 = -1L;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "J")
    private long field5464 = -1L;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "Lvk;")
    private class55 field5470;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "J")
    private long field5472;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "J")
    private long field5471;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "[B")
    private byte[] field5452;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "[B")
    private byte[] field5462;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "J")
    private long field5469;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field5454;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "I")
    public static int field5475;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!oo", name = "z", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!oo", name = "A", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "J")
    private long field5468;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "Lam;")
    public static class286 field5460;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "Ljp;")
    public static class402 field5461;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)Z", line = 15)
    public static final boolean method2369(byte arg0) {
        int var1 = -94 / ((arg0 + 63) / 35);
        field5474++;
        if (class32.field310) {
            try {
                if ((Boolean) class245.method1313(class159.field2055.field6532, (byte) -40, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Lvk;II)V", line = 716)
    public class383(class55 arg0, int arg1, int arg2) throws IOException {
        this.field5470 = arg0;
        this.field5471 = this.field5472 = arg0.method283(-1);
        this.field5452 = new byte[arg2];
        this.field5462 = new byte[arg1];
        this.field5469 = 0L;
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 47)
    private final void method2370(byte arg0) throws IOException {
        this.field5466 = 0;
        field5465++;
        if (this.field5469 != this.field5468) {
            this.field5470.method286(this.field5469, (byte) 119);
            this.field5468 = this.field5469;
        }
        this.field5473 = this.field5469;
        if (arg0 > -61) {
            field5460 = null;
        }
        while (this.field5466 < this.field5462.length) {
            int var2 = this.field5462.length - this.field5466;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5470.method284(this.field5462, this.field5466, var2, (byte) 113);
            if (var3 == -1) {
                break;
            }
            this.field5466 += var3;
            this.field5468 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 89)
    public static final void method2371(int arg0) {
        if (arg0 != 0) {
            field5467 = 92;
        }
        field5454++;
        class151.field1919.method613(true);
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(B)V", line = 108)
    public static void method2372(byte arg0) {
        field5460 = null;
        field5461 = null;
        if (arg0 != -111) {
            method2380(94);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z[B)V", line = 119)
    public final void method2373(boolean arg0, byte[] arg1) throws IOException {
        if (!arg0) {
            field5455++;
            this.method2376(arg1.length, true, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(B)Ljava/io/File;", line = 133)
    private final File method2374(byte arg0) {
        field5457++;
        if (arg0 >= -59) {
            method2375(-107, true, 35, (byte) -38, 98);
        }
        return this.field5470.method287(0);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZIBI)Lem;", line = 148)
    public static final class141 method2375(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field5458++;
        class141 var5 = new class141();
        var5.field1803 = arg2;
        var5.field1802 = arg0;
        class337.field4495.method314((long) arg4, var5, arg3 + 6978);
        if (arg3 != 101) {
            field5461 = null;
        }
        class151.method804((byte) -5, arg0);
        class194 var6 = class57.method301(arg4, (byte) 105);
        if (var6 != null) {
            class204.method1107(var6, (byte) -100);
        }
        if (class203.field2717 != null) {
            class204.method1107(class203.field2717, (byte) -122);
            class203.field2717 = null;
        }
        class414.method2570(false);
        if (var6 != null) {
            class420.method2615((byte) -106, !arg1, var6);
        }
        if (!arg1) {
            class277.method1524(arg0);
        }
        if (!arg1 && class272.field3680 != -1) {
            class345.method2011(class272.field3680, 1, -13);
        }
        return var5;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZI[B)V", line = 189)
    public final void method2376(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field5453++;
        try {
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg3.length);
            }
            if (this.field5464 != -1L && this.field5464 <= this.field5469 && (long) this.field5456 + this.field5464 >= (long) arg0 + this.field5469) {
                class358.method2183(this.field5452, (int) (this.field5469 - this.field5464), arg3, arg2, arg0);
                this.field5469 += (long) arg0;
                return;
            }
            long var5 = this.field5469;
            int var7 = arg2;
            int var8 = arg0;
            if (!arg1) {
                return;
            }
            if (this.field5469 >= this.field5473 && (this.field5473 + ((long) this.field5466)) > this.field5469) {
                int var9 = (int) ((long) this.field5466 - (this.field5469 - this.field5473));
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class358.method2183(this.field5462, (int) (this.field5469 - this.field5473), arg3, arg2, var9);
                this.field5469 += (long) var9;
                arg0 -= var9;
                arg2 += var9;
            }
            if (this.field5462.length < arg0) {
                this.field5470.method286(this.field5469, (byte) 118);
                this.field5468 = this.field5469;
                while (arg0 > 0) {
                    int var10 = this.field5470.method284(arg3, arg2, arg0, (byte) -71);
                    if (var10 == -1) {
                        break;
                    }
                    this.field5469 += (long) var10;
                    arg2 += var10;
                    arg0 -= var10;
                    this.field5468 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method2370((byte) -76);
                int var11 = arg0;
                if (this.field5466 < arg0) {
                    var11 = this.field5466;
                }
                class358.method2183(this.field5462, 0, arg3, arg2, var11);
                arg2 += var11;
                arg0 -= var11;
                this.field5469 += (long) var11;
            }
            if (this.field5464 != -1L) {
                if (this.field5469 < this.field5464 && arg0 > 0) {
                    int var12 = (int) (this.field5464 - this.field5469) + arg2;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg3[arg2++] = 0;
                        arg0--;
                        this.field5469++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5464 >= var5 && this.field5464 < (long) var8 + var5) {
                    var13 = this.field5464;
                } else if (this.field5464 <= var5 && var5 < this.field5464 + ((long) this.field5456)) {
                    var13 = var5;
                }
                if ((long) this.field5456 + this.field5464 > var5 && ((long) this.field5456 + this.field5464) <= ((long) var8 + var5)) {
                    var15 = (long) this.field5456 + this.field5464;
                } else if ((long) var8 + var5 > this.field5464 && (this.field5464 + ((long) this.field5456)) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class358.method2183(this.field5452, (int) (var13 - this.field5464), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field5469 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field5469));
                        this.field5469 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5468 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I[BIB)V", line = 377)
    public final void method2377(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        field5477++;
        try {
            if ((long) arg0 + this.field5469 > this.field5471) {
                this.field5471 = (long) arg0 + this.field5469;
            }
            if (arg3 != -67) {
                field5467 = 46;
            }
            if (this.field5464 != -1L && (this.field5464 > this.field5469 || ((long) this.field5456 + this.field5464) < this.field5469)) {
                this.method2382(15578);
            }
            if (this.field5464 != -1L && ((long) this.field5452.length + this.field5464) < ((long) arg0 + this.field5469)) {
                int var5 = (int) ((long) this.field5452.length - (this.field5469 - this.field5464));
                class358.method2183(arg1, arg2, this.field5452, (int) (this.field5469 - this.field5464), var5);
                arg0 -= var5;
                this.field5469 += (long) var5;
                arg2 += var5;
                this.field5456 = this.field5452.length;
                this.method2382(15578);
            }
            if (arg0 > this.field5452.length) {
                if (this.field5469 != this.field5468) {
                    this.field5470.method286(this.field5469, (byte) 117);
                    this.field5468 = this.field5469;
                }
                this.field5470.method282(arg2, arg0, arg1, -88);
                this.field5468 += (long) arg0;
                if (this.field5468 > this.field5472) {
                    this.field5472 = this.field5468;
                }
                long var6 = -1L;
                if (this.field5473 <= this.field5469 && this.field5469 < (long) this.field5466 + this.field5473) {
                    var6 = this.field5469;
                } else if (this.field5469 <= this.field5473 && this.field5473 < (this.field5469 + ((long) arg0))) {
                    var6 = this.field5473;
                }
                long var8 = -1L;
                if ((long) arg0 + this.field5469 > this.field5473 && (this.field5473 + ((long) this.field5466)) >= ((long) arg0 + this.field5469)) {
                    var8 = (long) arg0 + this.field5469;
                } else if (this.field5469 < (long) this.field5466 + this.field5473 && (long) this.field5466 + this.field5473 <= (long) arg0 + this.field5469) {
                    var8 = this.field5473 + ((long) this.field5466);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class358.method2183(arg1, (int) ((long) arg2 + var6 - this.field5469), this.field5462, (int) (var6 - this.field5473), var10);
                }
                this.field5469 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field5464 == -1L) {
                    this.field5464 = this.field5469;
                }
                class358.method2183(arg1, arg2, this.field5452, (int) (this.field5469 - this.field5464), arg0);
                this.field5469 += (long) arg0;
                if (this.field5469 - this.field5464 > (long) this.field5456) {
                    this.field5456 = (int) (this.field5469 - this.field5464);
                }
            }
        } catch (IOException var12) {
            this.field5468 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(B)J", line = 502)
    public final long method2378(byte arg0) {
        if (arg0 >= -88) {
            return -30L;
        } else {
            field5478++;
            return this.field5471;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(JI)V", line = 516)
    public static final void method2379(long arg0, int arg1) {
        field5475++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 < 115) {
            method2375(-31, false, 40, (byte) 109, 90);
        }
    }

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(I)[Ltn;", line = 534)
    public static final class108[] method2380(int arg0) {
        if (class154.field1952 == null) {
            class108[] var1 = class229.method1248((byte) 61, class159.field2055);
            class108[] var2 = new class108[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; var4 < var1.length; var4++) {
                class108 var8 = var1[var4];
                if ((var8.field1327 <= 0 || var8.field1327 >= 24) && var8.field1320 >= 800 && var8.field1326 >= 600 && (class436.field6389 >= 96 || class101.field1182 != 0 || var8.field1320 <= 1024 && var8.field1326 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class108 var10 = var2[var9];
                        if (var8.field1320 == var10.field1320 && var8.field1326 == var10.field1326) {
                            if (var8.field1327 > var10.field1327) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class154.field1952 = new class108[var3];
            class358.method2181(var2, 0, class154.field1952, 0, var3);
            int[] var5 = new int[class154.field1952.length];
            for (int var6 = 0; var6 < class154.field1952.length; var6++) {
                class108 var7 = class154.field1952[var6];
                var5[var6] = var7.field1326 * var7.field1320;
            }
            class416.method2582((byte) 100, class154.field1952, var5);
        }
        field5459++;
        if (arg0 != 0) {
            field5460 = null;
        }
        return class154.field1952;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IJ)V", line = 625)
    public final void method2381(int arg0, long arg1) throws IOException {
        if (arg0 != 23397) {
            return;
        }
        field5476++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2374((byte) -78));
        }
        this.field5469 = arg1;
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "(I)V", line = 642)
    private final void method2382(int arg0) throws IOException {
        if (arg0 != 15578) {
            return;
        }
        if (this.field5464 != -1L) {
            if (this.field5468 != this.field5464) {
                this.field5470.method286(this.field5464, (byte) 79);
                this.field5468 = this.field5464;
            }
            this.field5470.method282(0, this.field5456, this.field5452, -88);
            this.field5468 += (long) this.field5456;
            if (this.field5468 > this.field5472) {
                this.field5472 = this.field5468;
            }
            long var2 = -1L;
            if (this.field5464 >= this.field5473 && (long) this.field5466 + this.field5473 > this.field5464) {
                var2 = this.field5464;
            } else if (this.field5464 <= this.field5473 && this.field5473 < (long) this.field5456 + this.field5464) {
                var2 = this.field5473;
            }
            long var4 = -1L;
            if (this.field5473 < ((long) this.field5456 + this.field5464) && ((long) this.field5456 + this.field5464) <= ((long) this.field5466 + this.field5473)) {
                var4 = this.field5464 + ((long) this.field5456);
            } else if (this.field5464 < this.field5473 + ((long) this.field5466) && (long) this.field5466 + this.field5473 <= this.field5464 - -((long) this.field5456)) {
                var4 = (long) this.field5466 + this.field5473;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class358.method2183(this.field5452, (int) (var2 - this.field5464), this.field5462, (int) (var2 - this.field5473), var6);
            }
            this.field5456 = 0;
            this.field5464 = -1L;
        }
        field5463++;
    }
}
