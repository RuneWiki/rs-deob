import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class275 {

    @OriginalMember(owner = "client!je", name = "h", descriptor = "J")
    private long field3972 = -1L;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    private int field3986 = 0;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "J")
    private long field3983 = -1L;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lhi;")
    private class137 field3971;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "J")
    private long field3968;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "J")
    private long field3976;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "[B")
    private byte[] field3974;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[B")
    private byte[] field3978;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "J")
    private long field3966;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lgf;")
    public static class180 field3967 = new class180("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!je", name = "u", descriptor = "Lao;")
    public static class188 field3985 = new class188(65, 6);

    @OriginalMember(owner = "client!je", name = "z", descriptor = "[J")
    public static long[] field3990 = new long[100];

    @OriginalMember(owner = "client!je", name = "y", descriptor = "Lvp;")
    public static class123 field3989 = new class123(70, 4);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "J")
    private long field3981;

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lbp;")
    public static class261 field3992;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "Z")
    public static boolean field3991;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "[[[B")
    public static byte[][][] field3993;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I[B)V")
    public final void method1749(int arg0, byte[] arg1) throws IOException {
        this.method1757(0, arg1.length, arg1, -200000001);
        field3982++;
        if (arg0 != 1) {
            this.method1758(false);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;BC)I")
    public static final int method1750(String arg0, byte arg1, char arg2) {
        field3969++;
        int var3 = 0;
        int var4 = arg0.length();
        int var5 = 54 % ((arg1 - 52) / 63);
        for (int var6 = 0; var6 < var4; var6++) {
            if (arg0.charAt(var6) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)V")
    public final void method1751(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3980++;
        try {
            if (this.field3976 < ((long) arg1 + this.field3966)) {
                this.field3976 = (long) arg1 + this.field3966;
            }
            if ((long) arg2 != this.field3972 && (this.field3966 < this.field3972 || ((long) this.field3986 + this.field3972) < this.field3966)) {
                this.method1756((byte) 53);
            }
            if (this.field3972 != -1L && (long) this.field3978.length + this.field3972 < (long) arg1 + this.field3966) {
                int var5 = (int) (this.field3972 + (long) this.field3978.length - this.field3966);
                class486.method2905(arg3, arg0, this.field3978, (int) (this.field3966 - this.field3972), var5);
                arg1 -= var5;
                this.field3966 += var5;
                arg0 += var5;
                this.field3986 = this.field3978.length;
                this.method1756((byte) 120);
            }
            if (this.field3978.length < arg1) {
                if (this.field3981 != this.field3966) {
                    this.field3971.method1010(this.field3966, 0);
                    this.field3981 = this.field3966;
                }
                this.field3971.method1009(arg3, arg2 + 24239, arg1, arg0);
                this.field3981 += arg1;
                if (this.field3981 > this.field3968) {
                    this.field3968 = this.field3981;
                }
                long var6 = -1L;
                if (this.field3983 <= this.field3966 && ((long) this.field3977 + this.field3983) > this.field3966) {
                    var6 = this.field3966;
                } else if (this.field3966 <= this.field3983 && ((long) arg1 + this.field3966) > this.field3983) {
                    var6 = this.field3983;
                }
                long var8 = -1L;
                if (this.field3983 < ((long) arg1 + this.field3966) && ((long) arg1 + this.field3966) <= ((long) this.field3977 + this.field3983)) {
                    var8 = this.field3966 + ((long) arg1);
                } else if (((long) this.field3977 + this.field3983) > this.field3966 && (long) arg1 + this.field3966 >= this.field3983 - -((long) this.field3977)) {
                    var8 = (long) this.field3977 + this.field3983;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class486.method2905(arg3, (int) ((long) arg0 + var6 - this.field3966), this.field3974, (int) (var6 - this.field3983), var10);
                }
                this.field3966 += arg1;
            } else if (arg1 > 0) {
                if (this.field3972 == -1L) {
                    this.field3972 = this.field3966;
                }
                class486.method2905(arg3, arg0, this.field3978, (int) (this.field3966 - this.field3972), arg1);
                this.field3966 += arg1;
                if ((long) this.field3986 < this.field3966 - this.field3972) {
                    this.field3986 = (int) (this.field3966 - this.field3972);
                }
            }
        } catch (IOException var12) {
            this.field3981 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method1752(int arg0) {
        field3985 = null;
        field3992 = null;
        field3989 = null;
        field3993 = null;
        field3990 = null;
        if (arg0 != 28257) {
            field3990 = null;
        }
        field3967 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIILir;Lir;IIIII)V")
    public static final void method1753(int arg0, int arg1, int arg2, class22 arg3, class22 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3987++;
        int var10 = arg4.method116(0);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class528 var12 = (class528) class326.field5032.method2339(-121, (long) var10);
        if (var12 == null) {
            class158[] var13 = class158.method1137(class460.field6798, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class394.field5821.method517(var13[0], true);
            class326.field5032.method2342((long) var10, var12, 90);
        }
        class222.method1468(0, (byte) -128, arg1 >> 1, arg9, arg7, arg0 >> 1, arg3.field5529, arg3.field5538, arg3.field5539, arg5 * arg3.method184(1));
        int var14 = arg6 + class387.field5746[0] - 18;
        int var15 = arg8 / 4 * 18 + var14;
        int var16 = class387.field5746[1] + arg2 - 70;
        int var17 = arg8 % 4 * 18 + var16;
        var12.method3129(var15, var17);
        if (arg3 == arg4) {
            class394.field5821.method1176(18, var15 - 1, 1, 18, -256, var17 - 1);
        }
        class301 var18 = class117.method858((byte) 119);
        var18.field4280 = arg4;
        var18.field4283 = var15 + 16;
        var18.field4285 = var15;
        var18.field4284 = var17 + 16;
        var18.field4286 = var17;
        class308.field4409.method1637((byte) -95, var18);
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    private final void method1754(int arg0) throws IOException {
        field3984++;
        this.field3977 = 0;
        if (this.field3981 != this.field3966) {
            this.field3971.method1010(this.field3966, 0);
            this.field3981 = this.field3966;
        }
        this.field3983 = this.field3966;
        while (this.field3977 < this.field3974.length) {
            int var2 = this.field3974.length - this.field3977;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3971.method1013(this.field3974, this.field3977, (byte) 118, var2);
            if (var3 == -1) {
                break;
            }
            this.field3981 += var3;
            this.field3977 += var3;
        }
        if (arg0 != -14385) {
            this.method1758(false);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(JI)V")
    public final void method1755(long arg0, int arg1) throws IOException {
        if (arg1 != -1) {
            this.field3966 = 57L;
        }
        field3975++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1759((byte) -128));
        }
        this.field3966 = arg0;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    private final void method1756(byte arg0) throws IOException {
        field3965++;
        if (this.field3972 != -1L) {
            if (this.field3981 != this.field3972) {
                this.field3971.method1010(this.field3972, 0);
                this.field3981 = this.field3972;
            }
            this.field3971.method1009(this.field3978, 24238, this.field3986, 0);
            this.field3981 += this.field3986;
            if (this.field3981 > this.field3968) {
                this.field3968 = this.field3981;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3983 <= this.field3972 && (long) this.field3977 + this.field3983 > this.field3972) {
                var2 = this.field3972;
            } else if (this.field3983 >= this.field3972 && this.field3983 < this.field3972 + ((long) this.field3986)) {
                var2 = this.field3983;
            }
            if ((long) this.field3986 + this.field3972 > this.field3983 && (long) this.field3977 + this.field3983 >= this.field3972 - -((long) this.field3986)) {
                var4 = (long) this.field3986 + this.field3972;
            } else if (this.field3972 < ((long) this.field3977 + this.field3983) && this.field3972 + ((long) this.field3986) >= (long) this.field3977 + this.field3983) {
                var4 = (long) this.field3977 + this.field3983;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class486.method2905(this.field3978, (int) (var2 - this.field3972), this.field3974, (int) (var2 - this.field3983), var6);
            }
            this.field3972 = -1L;
            this.field3986 = 0;
        }
        if (arg0 <= 52) {
            field3989 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BI)V")
    public final void method1757(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3970++;
        try {
            if ((arg0 + arg1) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg0 - arg2.length);
            }
            if (this.field3972 != -1L && this.field3972 <= this.field3966 && ((long) this.field3986 + this.field3972) >= ((long) arg1 + this.field3966)) {
                class486.method2905(this.field3978, (int) (this.field3966 - this.field3972), arg2, arg0, arg1);
                this.field3966 += arg1;
                return;
            }
            long var5 = this.field3966;
            int var7 = arg0;
            if (arg3 != -200000001) {
                this.field3986 = -110;
            }
            int var8 = arg1;
            if (this.field3983 <= this.field3966 && (long) this.field3977 + this.field3983 > this.field3966) {
                int var9 = (int) ((long) this.field3977 + this.field3983 - this.field3966);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class486.method2905(this.field3974, (int) (this.field3966 - this.field3983), arg2, arg0, var9);
                this.field3966 += var9;
                arg0 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field3974.length) {
                this.field3971.method1010(this.field3966, arg3 ^ 0xF4143DFF);
                this.field3981 = this.field3966;
                while (arg1 > 0) {
                    int var11 = this.field3971.method1013(arg2, arg0, (byte) 121, arg1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3966 += var11;
                    arg1 -= var11;
                    arg0 += var11;
                    this.field3981 += var11;
                }
            } else if (arg1 > 0) {
                this.method1754(-14385);
                int var10 = arg1;
                if (arg1 > this.field3977) {
                    var10 = this.field3977;
                }
                class486.method2905(this.field3974, 0, arg2, arg0, var10);
                arg1 -= var10;
                arg0 += var10;
                this.field3966 += var10;
            }
            if (this.field3972 != -1L) {
                if (this.field3966 < this.field3972 && arg1 > 0) {
                    int var12 = (int) (this.field3972 - this.field3966) + arg0;
                    if (arg0 + arg1 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field3966++;
                    }
                }
                long var13 = -1L;
                if (this.field3972 >= var5 && this.field3972 < (long) var8 + var5) {
                    var13 = this.field3972;
                } else if (var5 >= this.field3972 && var5 < this.field3972 + ((long) this.field3986)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((this.field3972 + ((long) this.field3986)) > var5 && (long) var8 + var5 >= this.field3972 - -((long) this.field3986)) {
                    var15 = (long) this.field3986 + this.field3972;
                } else if (var5 + ((long) var8) > this.field3972 && ((long) this.field3986 + this.field3972) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class486.method2905(this.field3978, (int) (var13 - this.field3972), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field3966 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3966));
                        this.field3966 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3981 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)J")
    public final long method1758(boolean arg0) {
        if (!arg0) {
            this.field3983 = 40L;
        }
        field3979++;
        return this.field3976;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method1759(byte arg0) {
        field3973++;
        return arg0 >= -120 ? null : this.field3971.method1012(118);
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lhi;II)V")
    public class275(class137 arg0, int arg1, int arg2) throws IOException {
        this.field3971 = arg0;
        this.field3976 = this.field3968 = arg0.method1014(false);
        this.field3974 = new byte[arg1];
        this.field3978 = new byte[arg2];
        this.field3966 = 0L;
    }
}
