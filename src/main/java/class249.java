import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class249 {

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "J")
    private long field3372 = -1L;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    private int field3384 = 0;

    @OriginalMember(owner = "client!ah", name = "x", descriptor = "J")
    private long field3392 = -1L;

    @OriginalMember(owner = "client!ah", name = "z", descriptor = "Lhr;")
    private class218 field3394;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "J")
    private long field3383;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "J")
    private long field3377;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "J")
    private long field3380;

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "[B")
    private byte[] field3391;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[B")
    private byte[] field3378;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Z")
    public static boolean field3389 = true;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field3370 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "F")
    public static float field3369;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field3375;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!ah", name = "y", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!ah", name = "A", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "J")
    private long field3379;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Loca;IIIIIIIIIBLffa;)V", line = 9)
    public static final void method1558(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, class562 arg11) {
        class590.field8007 = arg0;
        field3371++;
        class527.field6861 = arg7;
        class463.field6064 = null;
        class619.field8352 = arg6;
        class392.field5007 = arg5;
        class694.field9488 = arg3;
        class290.field3752 = null;
        class419.field5430 = null;
        class526.field6857 = arg9;
        class138.field1814 = arg1;
        class635.field8835 = arg8;
        class541.field7035 = arg11;
        if (arg10 != 120) {
            method1570(78);
        }
        class663.field9217 = arg2;
        class32.field469 = arg4;
        class165.method1151(arg10 ^ 0x4);
        class382.field4897 = true;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)J", line = 37)
    public final long method1559(int arg0) {
        int var2 = 28 % ((-arg0 - 64) / 49);
        field3386++;
        return this.field3377;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V", line = 51)
    private final void method1560(int arg0) throws IOException {
        field3393++;
        if ((long) arg0 == this.field3392) {
            return;
        }
        if (this.field3392 != this.field3379) {
            this.field3394.method1392(13984, this.field3392);
            this.field3379 = this.field3392;
        }
        this.field3394.method1393(this.field3384, this.field3391, (byte) 117, 0);
        this.field3379 += this.field3384;
        if (this.field3383 < this.field3379) {
            this.field3383 = this.field3379;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3372 <= this.field3392 && ((long) this.field3375 + this.field3372) > this.field3392) {
            var2 = this.field3392;
        } else if (this.field3392 <= this.field3372 && this.field3372 < ((long) this.field3384 + this.field3392)) {
            var2 = this.field3372;
        }
        if (this.field3372 < this.field3392 + ((long) this.field3384) && (this.field3392 + ((long) this.field3384)) <= (this.field3372 + ((long) this.field3375))) {
            var4 = (long) this.field3384 + this.field3392;
        } else if (this.field3392 < ((long) this.field3375 + this.field3372) && (long) this.field3375 + this.field3372 <= (long) this.field3384 + this.field3392) {
            var4 = (long) this.field3375 + this.field3372;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class443.method2514(this.field3391, (int) (var2 - this.field3392), this.field3378, (int) (var2 - this.field3372), var6);
        }
        this.field3384 = 0;
        this.field3392 = -1L;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BIIZ)V", line = 124)
    public final void method1561(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field3385++;
        try {
            if (arg0.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
            }
            if (this.field3392 != -1L && this.field3392 <= this.field3380 && (this.field3392 + ((long) this.field3384)) >= (this.field3380 + ((long) arg1))) {
                class443.method2514(this.field3391, (int) (this.field3380 - this.field3392), arg0, arg2, arg1);
                this.field3380 += arg1;
                return;
            }
            if (arg3) {
                this.field3383 = -29L;
            }
            long var5 = this.field3380;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field3380 >= this.field3372 && ((long) this.field3375 + this.field3372) > this.field3380) {
                int var9 = (int) (-this.field3380 - (-this.field3372 - (long) this.field3375));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class443.method2514(this.field3378, (int) (this.field3380 - this.field3372), arg0, arg2, var9);
                arg2 += var9;
                arg1 -= var9;
                this.field3380 += var9;
            }
            if (arg1 > this.field3378.length) {
                this.field3394.method1392(13984, this.field3380);
                this.field3379 = this.field3380;
                while (arg1 > 0) {
                    int var10 = this.field3394.method1390(0, arg1, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    arg1 -= var10;
                    this.field3380 += var10;
                    this.field3379 += var10;
                }
            } else if (arg1 > 0) {
                this.method1568(84);
                int var11 = arg1;
                if (arg1 > this.field3375) {
                    var11 = this.field3375;
                }
                class443.method2514(this.field3378, 0, arg0, arg2, var11);
                arg1 -= var11;
                arg2 += var11;
                this.field3380 += var11;
            }
            if (this.field3392 != -1L) {
                if (this.field3392 > this.field3380 && arg1 > 0) {
                    int var12 = (int) (this.field3392 - this.field3380) + arg2;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        arg1--;
                        this.field3380++;
                    }
                }
                long var13 = -1L;
                if (this.field3392 >= var5 && this.field3392 < (long) var8 + var5) {
                    var13 = this.field3392;
                } else if (var5 >= this.field3392 && var5 < (long) this.field3384 + this.field3392) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field3384 + this.field3392 && (long) this.field3384 + this.field3392 <= var5 - -((long) var8)) {
                    var15 = this.field3392 + ((long) this.field3384);
                } else if (this.field3392 < ((long) var8 + var5) && ((long) var8 + var5) <= ((long) this.field3384 + this.field3392)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class443.method2514(this.field3391, (int) (var13 - this.field3392), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field3380) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3380));
                        this.field3380 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3379 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Ljava/io/File;", line = 315)
    private final File method1562(int arg0) {
        if (arg0 != -1) {
            field3370 = null;
        }
        field3373++;
        return this.field3394.method1388(arg0 ^ 0xFFFFD840);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JB)V", line = 326)
    public final void method1563(long arg0, byte arg1) throws IOException {
        field3390++;
        int var4 = 118 / ((arg1 + 4) / 45);
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1562(-1));
        }
        this.field3380 = arg0;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lhr;II)V", line = 607)
    public class249(class218 arg0, int arg1, int arg2) throws IOException {
        this.field3394 = arg0;
        this.field3377 = this.field3383 = arg0.method1391(14);
        this.field3380 = 0L;
        this.field3391 = new byte[arg2];
        this.field3378 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIB)V", line = 354)
    public static final void method1564(int arg0, int arg1, byte arg2) {
        field3382++;
        class559 var3 = class287.field3714[arg0][arg1];
        if (var3 != null) {
            class542.field7047 = var3.field7301;
            class107.field1400 = var3.field7286;
            class503.field6624 = var3.field7287;
        }
        if (arg2 != 20) {
            method1558(null, -96, -76, 10, -81, -22, -84, -37, 23, -70, (byte) -20, null);
        }
        class445.method2523(54);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BI)V", line = 378)
    public final void method1565(byte[] arg0, int arg1) throws IOException {
        this.method1561(arg0, arg0.length, 0, false);
        field3388++;
        if (arg1 < 74) {
            this.field3375 = -94;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 390)
    public final void method1566(int arg0) throws IOException {
        this.method1560(-1);
        if (arg0 != 28186) {
            this.field3377 = 63L;
        }
        field3381++;
        this.field3394.method1397(true);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([BIII)V", line = 409)
    public final void method1567(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3387++;
        try {
            if (((long) arg3 + this.field3380) > this.field3377) {
                this.field3377 = (long) arg3 + this.field3380;
            }
            if (this.field3392 != -1L && (this.field3392 > this.field3380 || this.field3380 > (long) this.field3384 + this.field3392)) {
                this.method1560(-1);
            }
            if (this.field3392 != -1L && this.field3380 + ((long) arg3) > (long) this.field3391.length + this.field3392) {
                int var5 = (int) (this.field3392 + (long) this.field3391.length - this.field3380);
                class443.method2514(arg0, arg1, this.field3391, (int) (this.field3380 - this.field3392), var5);
                this.field3380 += var5;
                arg1 += var5;
                arg3 -= var5;
                this.field3384 = this.field3391.length;
                this.method1560(-1);
            }
            if (arg3 > this.field3391.length) {
                if (this.field3380 != this.field3379) {
                    this.field3394.method1392(13984, this.field3380);
                    this.field3379 = this.field3380;
                }
                this.field3394.method1393(arg3, arg0, (byte) 125, arg1);
                this.field3379 += arg3;
                if (this.field3379 > this.field3383) {
                    this.field3383 = this.field3379;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3380 >= this.field3372 && this.field3380 < this.field3372 + ((long) this.field3375)) {
                    var6 = this.field3380;
                } else if (this.field3380 <= this.field3372 && ((long) arg3 + this.field3380) > this.field3372) {
                    var6 = this.field3372;
                }
                if (this.field3380 + ((long) arg3) > this.field3372 && ((long) this.field3375 + this.field3372) >= ((long) arg3 + this.field3380)) {
                    var8 = this.field3380 + ((long) arg3);
                } else if (((long) this.field3375 + this.field3372) > this.field3380 && ((long) this.field3375 + this.field3372) <= ((long) arg3 + this.field3380)) {
                    var8 = (long) this.field3375 + this.field3372;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class443.method2514(arg0, (int) ((long) arg1 + var6 - this.field3380), this.field3378, (int) (var6 - this.field3372), var10);
                }
                this.field3380 += arg3;
            } else if (~arg3 < arg2) {
                if (this.field3392 == -1L) {
                    this.field3392 = this.field3380;
                }
                class443.method2514(arg0, arg1, this.field3391, (int) (this.field3380 - this.field3392), arg3);
                this.field3380 += arg3;
                if (((long) this.field3384) < (this.field3380 - this.field3392)) {
                    this.field3384 = (int) (this.field3380 - this.field3392);
                }
            }
        } catch (IOException var12) {
            this.field3379 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "(I)V", line = 528)
    private final void method1568(int arg0) throws IOException {
        field3395++;
        this.field3375 = 0;
        if (arg0 <= 4) {
            method1570(-100);
        }
        if (this.field3380 != this.field3379) {
            this.field3394.method1392(13984, this.field3380);
            this.field3379 = this.field3380;
        }
        this.field3372 = this.field3380;
        while (this.field3378.length > this.field3375) {
            int var2 = this.field3378.length - this.field3375;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3394.method1390(0, var2, this.field3378, this.field3375);
            if (var3 == -1) {
                break;
            }
            this.field3379 += var3;
            this.field3375 += var3;
        }
    }

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)V", line = 581)
    public static void method1569(int arg0) {
        field3370 = null;
        int var1 = -11 % ((arg0 - 18) / 40);
    }

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "(I)Z", line = 625)
    public static final boolean method1570(int arg0) {
        field3376++;
        if (arg0 >= -117) {
            return false;
        }
        try {
            if (class426.field5523 == 2) {
                if (class697.field9585 == null) {
                    class697.field9585 = class157.method1125(class414.field5327, class557.field7280, class521.field6803);
                    if (class697.field9585 == null) {
                        return false;
                    }
                }
                if (class526.field6855 == null) {
                    class526.field6855 = new class649(class101.field1354, class680.field9380);
                }
                if (class359.field4658.method2927(-127, class526.field6855, 22050, class558.field7282, class697.field9585)) {
                    class359.field4658.method2946((byte) 101);
                    class359.field4658.method2930(class332.field4314, -63);
                    class359.field4658.method2948(class697.field9585, class64.field867, (byte) -52);
                    class414.field5327 = null;
                    class426.field5523 = 0;
                    class526.field6855 = null;
                    class697.field9585 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class359.field4658.method2934((byte) -125);
            class526.field6855 = null;
            class697.field9585 = null;
            class414.field5327 = null;
            class426.field5523 = 0;
        }
        return false;
    }
}
