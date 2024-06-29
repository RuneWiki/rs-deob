import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class272 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "J")
    private long field4327 = -1L;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field4342 = 0;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "J")
    private long field4333 = -1L;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lhm;")
    private class23 field4339;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
    private long field4334;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
    private long field4326;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "J")
    private long field4345;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "[B")
    private byte[] field4354;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "[B")
    private byte[] field4335;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[Z")
    public static boolean[] field4337 = new boolean[100];

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Llg;")
    public static class137 field4343 = null;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[I")
    public static int[] field4350 = new int[1000];

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field4344 = -1;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    private int field4349;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "J")
    private long field4324;

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lhm;II)V", line = 1042)
    public class272(class23 arg0, int arg1, int arg2) throws IOException {
        this.field4339 = arg0;
        this.field4326 = this.field4334 = arg0.method226(22639);
        this.field4345 = 0L;
        this.field4354 = new byte[arg2];
        this.field4335 = new byte[arg1];
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I", line = 40)
    public static final int method1854(byte arg0) {
        field4356++;
        if (arg0 != -93) {
            method1854((byte) -5);
        }
        return class50.field782;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V", line = 51)
    public static final void method1855(boolean arg0) {
        field4355++;
        if (class69.field1127 == 0) {
            return;
        }
        try {
            if (!arg0) {
                field4344 = 127;
            }
            if (++class225.field3792 > 2000) {
                if (class279.field4426 != null) {
                    class279.field4426.method177(!arg0);
                    class279.field4426 = null;
                }
                if (class108.field1843 >= 1) {
                    class148.field2660 = -5;
                    class69.field1127 = 0;
                    return;
                }
                class225.field3792 = 0;
                class108.field1843++;
                class69.field1127 = 1;
                if (class86.field1377 == class184.field3122) {
                    class86.field1377 = class140.field2566;
                } else {
                    class86.field1377 = class184.field3122;
                }
            }
            if (class69.field1127 == 1) {
                class356.field5613 = class85.field1369.method541(false, class86.field1377, class64.field1004);
                class69.field1127 = 2;
            }
            if (class69.field1127 == 2) {
                if (class356.field5613.field709 == 2) {
                    throw new IOException();
                }
                if (class356.field5613.field709 != 1) {
                    return;
                }
                class279.field4426 = new class17((Socket) class356.field5613.field712, class85.field1369);
                class356.field5613 = null;
                class279.field4426.method178(0, class341.field5443.field5353, class341.field5443.field5342, false);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 112);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 99);
                }
                int var1 = class279.field4426.method180(0);
                if (class135.field2362 != null) {
                    class135.field2362.method1281((byte) 106);
                }
                if (class320.field5064 != null) {
                    class320.field5064.method1281((byte) 118);
                }
                if (var1 != 21) {
                    class69.field1127 = 0;
                    class148.field2660 = var1;
                    class279.field4426.method177(false);
                    class279.field4426 = null;
                    return;
                }
                class69.field1127 = 3;
            }
            if (class69.field1127 == 3) {
                if (class279.field4426.method175(-21329) < 1) {
                    return;
                }
                class129.field2230 = new String[class279.field4426.method180(0)];
                class69.field1127 = 4;
            }
            if (class69.field1127 == 4) {
                if (class279.field4426.method175(-21329) < class129.field2230.length * 8) {
                    return;
                }
                class276.field4398.field5353 = 0;
                class279.field4426.method179(class276.field4398.field5342, 0, class129.field2230.length * 8, 9395);
                for (int var2 = 0; var2 < class129.field2230.length; var2++) {
                    class129.field2230[var2] = class195.method1467(class276.field4398.method2367((byte) -107), -11026);
                }
                class69.field1127 = 0;
                class148.field2660 = 21;
                class279.field4426.method177(false);
                class279.field4426 = null;
                return;
            }
        } catch (IOException var4) {
            if (class279.field4426 != null) {
                class279.field4426.method177(false);
                class279.field4426 = null;
            }
            if (class108.field1843 < 1) {
                class69.field1127 = 1;
                if (class86.field1377 == class184.field3122) {
                    class86.field1377 = class140.field2566;
                } else {
                    class86.field1377 = class184.field3122;
                }
                class225.field3792 = 0;
                class108.field1843++;
            } else {
                class69.field1127 = 0;
                class148.field2660 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J", line = 208)
    public final long method1856(int arg0) {
        field4328++;
        return arg0 == 1 ? this.field4326 : 108L;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I", line = 223)
    public static final int method1857(byte arg0, int arg1) {
        field4323++;
        int var2 = 0;
        int var3 = -35 % ((-arg0 - 34) / 38);
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Ljava/io/File;", line = 272)
    private final File method1858(int arg0) {
        field4331++;
        int var2 = 4 / ((arg0 - 60) / 40);
        return this.field4339.method227((byte) -78);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLwe;)[Lwm;", line = 283)
    public static final class168[] method1859(byte arg0, class59 arg1) {
        field4351++;
        if (!arg1.method533(26720)) {
            return new class168[0];
        }
        class45 var2 = arg1.method536((byte) -96);
        while (var2.field709 == 0) {
            class142.method1149(10L, (byte) 124);
        }
        if (var2.field709 == 2) {
            return new class168[0];
        }
        int[] var3 = (int[]) ((int[]) var2.field712);
        class168[] var4 = new class168[var3.length >> 2];
        int var5 = 123 % ((arg0 + 5) / 60);
        for (int var6 = 0; var6 < var4.length; var6++) {
            class168 var7 = new class168();
            var4[var6] = var7;
            var7.field2933 = var3[var6 << 2];
            var7.field2934 = var3[(var6 << 2) + 1];
            var7.field2926 = var3[(var6 << 2) + 2];
            var7.field2927 = var3[(var6 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI[BI)V", line = 326)
    public final void method1860(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4341++;
        if (arg0 != -40) {
            this.field4345 = -74L;
        }
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field4333 != -1L && this.field4345 >= this.field4333 && (long) arg1 + this.field4345 <= (long) this.field4342 + this.field4333) {
                class345.method2417(this.field4354, (int) (this.field4345 - this.field4333), arg2, arg3, arg1);
                this.field4345 += (long) arg1;
                return;
            }
            long var5 = this.field4345;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field4327 <= this.field4345 && (long) this.field4349 + this.field4327 > this.field4345) {
                int var9 = (int) ((long) this.field4349 - (this.field4345 - this.field4327));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class345.method2417(this.field4335, (int) (this.field4345 - this.field4327), arg2, arg3, var9);
                this.field4345 += (long) var9;
                arg1 -= var9;
                arg3 += var9;
            }
            if (arg1 > this.field4335.length) {
                this.field4339.method228(this.field4345, 0);
                this.field4324 = this.field4345;
                while (arg1 > 0) {
                    int var10 = this.field4339.method225(arg0 ^ 0x27, arg3, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4324 += (long) var10;
                    arg1 -= var10;
                    arg3 += var10;
                    this.field4345 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method1862(58);
                int var11 = arg1;
                if (arg1 > this.field4349) {
                    var11 = this.field4349;
                }
                arg1 -= var11;
                class345.method2417(this.field4335, 0, arg2, arg3, var11);
                arg3 += var11;
                this.field4345 += (long) var11;
            }
            if (this.field4333 != -1L) {
                if (this.field4333 > this.field4345 && arg1 > 0) {
                    int var12 = (int) (this.field4333 - this.field4345) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field4345++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (((long) this.field4342 + this.field4333) > var5 && ((long) this.field4342 + this.field4333) <= ((long) var7 + var5)) {
                    var15 = (long) this.field4342 + this.field4333;
                } else if ((long) var7 + var5 > this.field4333 && (long) var7 + var5 <= this.field4333 - -((long) this.field4342)) {
                    var15 = (long) var7 + var5;
                }
                if (var5 <= this.field4333 && var5 + ((long) var7) > this.field4333) {
                    var13 = this.field4333;
                } else if (var5 >= this.field4333 && this.field4333 + ((long) this.field4342) > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class345.method2417(this.field4354, (int) (var13 - this.field4333), arg2, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field4345) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field4345));
                        this.field4345 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4324 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 518)
    public static final void method1861(int arg0) {
        field4338++;
        try {
            if (class44.field705 == 1) {
                int var1 = class69.field1128.method929((byte) 56);
                if (var1 > 0 && class69.field1128.method933(-26314)) {
                    int var2 = var1 - class191.field3201;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class69.field1128.method915(var2, (byte) -76);
                    return;
                }
                class69.field1128.method942(18729);
                class69.field1128.method932(true);
                if (class249.field4044 == null) {
                    class44.field705 = 0;
                } else {
                    class44.field705 = 2;
                }
                class81.field1326 = null;
                class334.field5296 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class69.field1128.method942(18729);
            class81.field1326 = null;
            class44.field705 = 0;
            class249.field4044 = null;
            class334.field5296 = null;
        }
        if (arg0 != 0) {
            method1868((class49) null, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 566)
    private final void method1862(int arg0) throws IOException {
        if (arg0 < 32) {
            method1866((class116) null, (byte) -72, 16);
        }
        field4325++;
        this.field4349 = 0;
        if (this.field4345 != this.field4324) {
            this.field4339.method228(this.field4345, 0);
            this.field4324 = this.field4345;
        }
        this.field4327 = this.field4345;
        while (this.field4335.length > this.field4349) {
            int var2 = this.field4335.length - this.field4349;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4339.method225(-1, this.field4349, this.field4335, var2);
            if (var3 == -1) {
                break;
            }
            this.field4324 += (long) var3;
            this.field4349 += var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)Z", line = 611)
    public static final boolean method1863(int arg0, int arg1) {
        field4329++;
        if (arg0 != -671591600) {
            method1857((byte) -72, -26);
        }
        if (class356.field5615[arg1]) {
            return true;
        } else if (class51.field803.method448(arg1, 3138)) {
            int var2 = class51.field803.method455(arg1, true);
            if (var2 == 0) {
                class356.field5615[arg1] = true;
                return true;
            }
            if (class109.field1852[arg1] == null) {
                class109.field1852[arg1] = new class137[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class109.field1852[arg1][var3] == null) {
                    byte[] var4 = class51.field803.method441(false, arg1, var3);
                    if (var4 != null) {
                        class137 var5 = class109.field1852[arg1][var3] = new class137();
                        var5.field2462 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1130(new class336(var4), 30);
                        } else {
                            var5.method1127(-6980, new class336(var4));
                        }
                    }
                }
            }
            class356.field5615[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V", line = 670)
    public final void method1864(long arg0, int arg1) throws IOException {
        field4352++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1858(-92));
        }
        if (arg1 < 5) {
            method1855(true);
        }
        this.field4345 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)V", line = 695)
    public final void method1865(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4353++;
        try {
            if (this.field4326 < ((long) arg1 + this.field4345)) {
                this.field4326 = (long) arg1 + this.field4345;
            }
            if (this.field4333 != -1L && (this.field4333 > this.field4345 || this.field4345 > (long) this.field4342 + this.field4333)) {
                this.method1870(~arg2);
            }
            if (this.field4333 != -1L && (long) this.field4354.length + this.field4333 < (long) arg1 + this.field4345) {
                int var5 = (int) ((long) this.field4354.length + this.field4333 - this.field4345);
                arg1 -= var5;
                class345.method2417(arg3, arg0, this.field4354, (int) (this.field4345 - this.field4333), var5);
                this.field4345 += (long) var5;
                this.field4342 = this.field4354.length;
                this.method1870(0);
                arg0 += var5;
            }
            if (this.field4354.length < arg1) {
                if (this.field4345 != this.field4324) {
                    this.field4339.method228(this.field4345, arg2 + 1);
                    this.field4324 = this.field4345;
                }
                this.field4339.method224(arg1, arg0, arg3, arg2 + 1);
                this.field4324 += (long) arg1;
                if (this.field4334 < this.field4324) {
                    this.field4334 = this.field4324;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (((long) arg1 + this.field4345) > this.field4327 && (long) arg1 + this.field4345 <= (long) this.field4349 + this.field4327) {
                    var8 = (long) arg1 + this.field4345;
                } else if (((long) this.field4349 + this.field4327) > this.field4345 && ((long) this.field4349 + this.field4327) <= ((long) arg1 + this.field4345)) {
                    var8 = (long) this.field4349 + this.field4327;
                }
                if (this.field4345 >= this.field4327 && (this.field4327 + ((long) this.field4349)) > this.field4345) {
                    var6 = this.field4345;
                } else if (this.field4345 <= this.field4327 && this.field4327 < (long) arg1 + this.field4345) {
                    var6 = this.field4327;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class345.method2417(arg3, (int) ((long) arg0 + var6 - this.field4345), this.field4335, (int) (var6 - this.field4327), var10);
                }
                this.field4345 += (long) arg1;
            } else if (arg2 == -1 && arg1 > 0) {
                if (this.field4333 == -1L) {
                    this.field4333 = this.field4345;
                }
                class345.method2417(arg3, arg0, this.field4354, (int) (this.field4345 - this.field4333), arg1);
                this.field4345 += (long) arg1;
                if ((long) this.field4342 < this.field4345 - this.field4333) {
                    this.field4342 = (int) (this.field4345 - this.field4333);
                }
            }
        } catch (IOException var12) {
            this.field4324 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lwc;BI)V", line = 825)
    public static final void method1866(class116 arg0, byte arg1, int arg2) {
        field4348++;
        if (class181.field3045 < arg0.field1972) {
            class212.method1575(1, arg0);
        } else if (class181.field3045 > arg0.field1950) {
            class91.method795((byte) -128, arg0);
        } else {
            class68.method654(arg0, 108);
        }
        if (arg0.field2036 < 128 || arg0.field1985 < 128 || arg0.field2036 >= 13184 || arg0.field1985 >= 13184) {
            arg0.field1972 = 0;
            arg0.field1998 = -1;
            arg0.field1980 = -1;
            arg0.field1950 = 0;
            arg0.field2036 = arg0.field1975[0] * 128 + (arg0.method987(3047) * 64);
            arg0.field1985 = arg0.field2034[0] * 128 + (arg0.method987(3047) * 64);
            arg0.method983(-2224);
        }
        if (class218.field3632 == arg0 && (arg0.field2036 < 1536 || arg0.field1985 < 1536 || arg0.field2036 >= 11776 || arg0.field1985 >= 11776)) {
            arg0.field1980 = -1;
            arg0.field1998 = -1;
            arg0.field1950 = 0;
            arg0.field1972 = 0;
            arg0.field2036 = arg0.field1975[0] * 128 + (arg0.method987(3047) * 64);
            arg0.field1985 = arg0.field2034[0] * 128 + arg0.method987(3047) * 64;
            arg0.method983(-2224);
        }
        class318.method2186(arg0, -126);
        class347.method2434(arg0, 27826);
        if (arg1 > -124) {
            method1857((byte) 38, -28);
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 874)
    public static void method1867(int arg0) {
        field4350 = null;
        field4337 = null;
        if (arg0 != 30396) {
            field4336 = 127;
        }
        field4343 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lcg;B)V", line = 886)
    public static final void method1868(class49 arg0, byte arg1) {
        field4332++;
        class338.field5409 = class289.method1968(arg0, class125.field2162, 0);
        class318.field5048 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class120.field2072[var2] >> 16 & 0xFF);
            int var4 = (class120.field2072[var2 + 1] & 0xFF0000) >> 16;
            float var5 = ((float) var4 - var3) / 64.0F;
            float var6 = (float) (class120.field2072[var2] & 0xFF);
            int var7 = class120.field2072[var2 + 1] >> 8 & 0xFF;
            int var8 = class120.field2072[var2 + 1] & 0xFF;
            float var9 = (float) (class120.field2072[var2] >> 8 & 0xFF);
            float var10 = ((float) var8 - var6) / 64.0F;
            float var11 = ((float) var7 - var9) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class318.field5048[var2 * 64 + var12] = class144.method1159(class144.method1159((int) var9 << 8, (int) var3 << 16), (int) var6);
                var9 += var11;
                var3 += var5;
                var6 += var10;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class318.field5048[var13] = class120.field2072[3];
        }
        class116.field2033 = new int[32768];
        class293.field4696 = new int[32768];
        int var14 = -124 / ((-arg1 - 4) / 45);
        class90.method790((class217) null, -121);
        class70.field1156 = new int[32768];
        class21.field318 = new int[32768];
        class25.field353 = new class309(128, 254);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[B)V", line = 951)
    public final void method1869(byte arg0, byte[] arg1) throws IOException {
        if (arg0 >= -2) {
            method1867(92);
        }
        field4340++;
        this.method1860((byte) -40, arg1.length, arg1, 0);
    }

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V", line = 962)
    private final void method1870(int arg0) throws IOException {
        field4346++;
        if (this.field4333 != -1L) {
            long var2 = -1L;
            if (this.field4333 != this.field4324) {
                this.field4339.method228(this.field4333, 0);
                this.field4324 = this.field4333;
            }
            long var4 = -1L;
            this.field4339.method224(this.field4342, 0, this.field4354, 0);
            this.field4324 += (long) this.field4342;
            if (this.field4327 <= this.field4333 && this.field4333 < ((long) this.field4349 + this.field4327)) {
                var2 = this.field4333;
            } else if (this.field4327 >= this.field4333 && this.field4327 < (long) this.field4342 + this.field4333) {
                var2 = this.field4327;
            }
            if (this.field4327 < (long) this.field4342 + this.field4333 && (long) this.field4342 + this.field4333 <= this.field4327 - -((long) this.field4349)) {
                var4 = (long) this.field4342 + this.field4333;
            } else if ((long) this.field4349 + this.field4327 > this.field4333 && (long) this.field4349 + this.field4327 <= (long) this.field4342 + this.field4333) {
                var4 = this.field4327 + ((long) this.field4349);
            }
            if (this.field4324 > this.field4334) {
                this.field4334 = this.field4324;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class345.method2417(this.field4354, (int) (var2 - this.field4333), this.field4335, (int) (var2 - this.field4327), var6);
            }
            this.field4333 = -1L;
            this.field4342 = 0;
        }
        if (arg0 != 0) {
            this.method1858(109);
        }
    }
}
