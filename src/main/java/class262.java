import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class262 {

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "J")
    private long field4680 = -1L;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    private int field4662 = 0;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "J")
    private long field4684 = -1L;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "Lc;")
    private class303 field4672;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "J")
    private long field4686;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "J")
    private long field4665;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "J")
    private long field4676;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "[B")
    private byte[] field4679;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[B")
    private byte[] field4663;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
    public static int field4664 = 0;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Lud;")
    public static class279 field4675 = class130.method1024("glissement:", 255);

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "Lcd;")
    public static class69 field4668 = new class69(512);

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    public static volatile int field4689 = 0;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4670;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    private int field4682;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "J")
    private long field4671;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "Lok;")
    public static class149 field4690;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZ)V", line = 5)
    public static final void method1872(int arg0, boolean arg1) {
        field4667++;
        class109 var2 = (class109) class103.field1928.method610((long) arg0, -1);
        if (var2 != null && arg1) {
            for (int var3 = 0; var3 < var2.field2019.length; var3++) {
                var2.field2019[var3] = -1;
                var2.field2013[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IBIZ[[FLvk;II[[FI[[FI[[IIBI)V", line = 30)
    public static final void method1873(int arg0, byte arg1, int arg2, boolean arg3, float[][] arg4, class168 arg5, int arg6, int arg7, float[][] arg8, int arg9, float[][] arg10, int arg11, int[][] arg12, int arg13, byte arg14, int arg15) {
        field4670++;
        int var16 = (arg6 << 8) + 255;
        int var17 = (arg2 << 8) + 255;
        int var18 = (arg0 << 8) + 255;
        int[] var19 = class20.field577[arg1];
        int var20 = (arg9 << 8) + 255;
        int[] var21 = null;
        int var22 = 110 % ((arg15 + 62) / 55);
        int[] var23 = new int[var19.length >> 1];
        for (int var24 = 0; var24 < var23.length; var24++) {
            var23[var24] = class166.method1297(var19[var24 + var24 + 1], 1, arg7, (int[][]) null, var20, var17, false, arg13, arg4, var16, arg14, arg8, arg12, var18, var19[var24 + var24], arg10, 0.0F, arg5);
        }
        if (arg3) {
            if (arg1 == 1) {
                int var43 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 64, arg10, 0.0F, arg5);
                int var44 = class166.method1297(64, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21 = new int[] { var44, var43, var23[2], var43, var23[0], var23[2] };
            } else if (arg1 == 2) {
                int var26 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21 = new int[6];
                int var27 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 64, arg10, 0.0F, arg5);
                var21[2] = var26;
                var21[3] = var26;
                var21[1] = var27;
                var21[4] = var23[1];
                var21[0] = var23[0];
                var21[5] = var23[0];
            } else if (arg1 == 3) {
                int var28 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                var21 = new int[6];
                int var29 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 64, arg10, 0.0F, arg5);
                var21[3] = var28;
                var21[1] = var23[1];
                var21[4] = var29;
                var21[0] = var23[2];
                var21[2] = var28;
                var21[5] = var23[2];
            } else if (arg1 == 4) {
                var21 = new int[3];
                int var30 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                var21[1] = var30;
                var21[0] = var23[3];
                var21[2] = var23[0];
            } else if (arg1 == 5) {
                var21 = new int[3];
                int var31 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21[1] = var31;
                var21[0] = var23[2];
                var21[2] = var23[3];
            } else if (arg1 == 6) {
                int var41 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                int var42 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21 = new int[] { var23[3], var41, var42, var42, var23[0], var23[3] };
            } else if (arg1 == 7) {
                var21 = new int[6];
                int var39 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                int var40 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21[2] = var39;
                var21[3] = var39;
                var21[4] = var23[2];
                var21[0] = var23[1];
                var21[1] = var40;
                var21[5] = var23[1];
            } else if (arg1 == 8) {
                var21 = new int[3];
                int var38 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                var21[1] = var38;
                var21[0] = var23[3];
                var21[2] = var23[4];
            } else if (arg1 == 9) {
                var21 = new int[15];
                int var32 = class166.method1297(64, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                int var33 = class166.method1297(32, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 96, arg10, 0.0F, arg5);
                int var34 = class166.method1297(0, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 64, arg10, 0.0F, arg5);
                var21[9] = var33;
                var21[2] = var23[4];
                var21[0] = var33;
                var21[10] = var23[2];
                var21[14] = var34;
                var21[4] = var23[4];
                var21[12] = var33;
                var21[1] = var32;
                var21[11] = var23[1];
                var21[13] = var23[1];
                var21[6] = var33;
                var21[3] = var33;
                var21[5] = var23[3];
                var21[8] = var23[2];
                var21[7] = var23[3];
            } else if (arg1 == 10) {
                var21 = new int[9];
                int var35 = class166.method1297(128, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                var21[1] = var35;
                var21[7] = var35;
                var21[0] = var23[2];
                var21[8] = var23[0];
                var21[4] = var35;
                var21[2] = var23[3];
                var21[5] = var23[4];
                var21[3] = var23[3];
                var21[6] = var23[4];
            } else if (arg1 == 11) {
                int var36 = class166.method1297(64, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 0, arg10, 0.0F, arg5);
                var21 = new int[12];
                int var37 = class166.method1297(64, 1, arg7, (int[][]) null, var20, var17, true, arg13, arg4, var16, arg14, arg8, arg12, var18, 128, arg10, 0.0F, arg5);
                var21[7] = var37;
                var21[5] = var36;
                var21[1] = var36;
                var21[8] = var36;
                var21[10] = var23[1];
                var21[0] = var23[3];
                var21[2] = var23[0];
                var21[9] = var23[2];
                var21[3] = var23[3];
                var21[6] = var23[2];
                var21[11] = var37;
                var21[4] = var23[2];
            }
        }
        arg5.method1315(arg11, arg7, arg13, var23, var21, false);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZJ)V", line = 312)
    public final void method1874(boolean arg0, long arg1) throws IOException {
        if (!arg0) {
            return;
        }
        field4685++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1876((byte) 99));
        }
        this.field4676 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)J", line = 329)
    public final long method1875(int arg0) {
        field4669++;
        if (arg0 != -4955) {
            this.field4686 = -2L;
        }
        return this.field4665;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Ljava/io/File;", line = 349)
    private final File method1876(byte arg0) {
        if (arg0 <= 89) {
            return (File) null;
        } else {
            field4678++;
            return this.field4672.method2145(1);
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V", line = 367)
    public static void method1877(int arg0) {
        field4690 = null;
        field4675 = null;
        int var1 = 41 % ((-arg0 - 36) / 53);
        field4668 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIZIIIII)V", line = 384)
    public static final void method1878(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4673++;
        if (arg4 >= 0 && arg3 >= 0 && arg4 < 103 && arg3 < 103) {
            if (arg5 == 0) {
                class17 var8 = class135.method1059(arg0, arg4, arg3);
                if (var8 != null) {
                    int var9 = Integer.MAX_VALUE & (int) (var8.field530 >>> 32);
                    if (arg7 == 2) {
                        var8.field522 = new class216(var9, 2, arg6 + 4, arg0, arg4, arg3, arg1, false, var8.field522);
                        var8.field525 = new class216(var9, 2, arg6 + 1 & 0x3, arg0, arg4, arg3, arg1, false, var8.field525);
                    } else {
                        var8.field522 = new class216(var9, arg7, arg6, arg0, arg4, arg3, arg1, false, var8.field522);
                    }
                }
            }
            if (arg5 == 1) {
                class235 var10 = class44.method383(arg0, arg4, arg3);
                if (var10 != null) {
                    int var11 = (int) (var10.field4095 >>> 32) & Integer.MAX_VALUE;
                    if (arg7 == 4 || arg7 == 5) {
                        var10.field4091 = new class216(var11, 4, arg6, arg0, arg4, arg3, arg1, false, var10.field4091);
                    } else if (arg7 == 6) {
                        var10.field4091 = new class216(var11, 4, arg6 + 4, arg0, arg4, arg3, arg1, false, var10.field4091);
                    } else if (arg7 == 7) {
                        var10.field4091 = new class216(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg4, arg3, arg1, false, var10.field4091);
                    } else if (arg7 == 8) {
                        var10.field4091 = new class216(var11, 4, arg6 + 4, arg0, arg4, arg3, arg1, false, var10.field4091);
                        var10.field4099 = new class216(var11, 4, (arg6 + 2 & 0x3) + 4, arg0, arg4, arg3, arg1, false, var10.field4099);
                    }
                }
            }
            if (arg5 == 2) {
                if (arg7 == 11) {
                    arg7 = 10;
                }
                class18 var12 = class99.method846(arg0, arg4, arg3);
                if (var12 != null) {
                    var12.field563 = new class216((int) (var12.field546 >>> 32) & Integer.MAX_VALUE, arg7, arg6, arg0, arg4, arg3, arg1, false, var12.field563);
                }
            }
            if (arg5 == 3) {
                class243 var13 = class54.method511(arg0, arg4, arg3);
                if (var13 != null) {
                    var13.field4316 = new class216(Integer.MAX_VALUE & (int) (var13.field4325 >>> 32), 22, arg6, arg0, arg4, arg3, arg1, false, var13.field4316);
                }
            }
        }
        if (arg2) {
            method1873(-88, (byte) -118, 10, true, (float[][]) ((float[][]) null), (class168) null, 101, -58, (float[][]) ((float[][]) null), -92, (float[][]) ((float[][]) null), 76, (int[][]) ((int[][]) null), 32, (byte) -89, -28);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I[BIZ)V", line = 475)
    public final void method1879(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field4681++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field4680 != -1L && this.field4676 >= this.field4680 && ((long) this.field4662 + this.field4680) >= ((long) arg2 + this.field4676)) {
                class25.method219(this.field4679, (int) (this.field4676 - this.field4680), arg1, arg0, arg2);
                this.field4676 += (long) arg2;
                return;
            }
            if (arg3) {
                this.field4672 = (class303) null;
            }
            int var5 = arg0;
            long var6 = this.field4676;
            int var8 = arg2;
            if (this.field4676 >= this.field4684 && (this.field4684 + ((long) this.field4682)) > this.field4676) {
                int var9 = (int) (this.field4684 + (long) this.field4682 - this.field4676);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class25.method219(this.field4663, (int) (this.field4676 - this.field4684), arg1, arg0, var9);
                arg2 -= var9;
                this.field4676 += (long) var9;
                arg0 += var9;
            }
            if (this.field4663.length < arg2) {
                this.field4672.method2146(this.field4676, 0);
                this.field4671 = this.field4676;
                while (arg2 > 0) {
                    int var10 = this.field4672.method2144(arg2, arg1, arg0, (byte) -114);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4676 += (long) var10;
                    arg0 += var10;
                    this.field4671 += (long) var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                this.method1880(-29325);
                int var11 = arg2;
                if (this.field4682 < arg2) {
                    var11 = this.field4682;
                }
                arg2 -= var11;
                class25.method219(this.field4663, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field4676 += (long) var11;
            }
            if (this.field4680 != -1L) {
                if (this.field4680 > this.field4676 && arg2 > 0) {
                    int var12 = (int) (this.field4680 - this.field4676) + arg0;
                    if ((arg0 + arg2) < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        this.field4676++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (var6 <= this.field4680 && (long) var8 + var6 > this.field4680) {
                    var13 = this.field4680;
                } else if (var6 >= this.field4680 && var6 < (long) this.field4662 + this.field4680) {
                    var13 = var6;
                }
                long var15 = -1L;
                if (((long) this.field4662 + this.field4680) > var6 && ((long) this.field4662 + this.field4680) <= (var6 + ((long) var8))) {
                    var15 = (long) this.field4662 + this.field4680;
                } else if (this.field4680 < ((long) var8 + var6) && ((long) var8 + var6) <= ((long) this.field4662 + this.field4680)) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class25.method219(this.field4679, (int) (var13 - this.field4680), arg1, (int) (var13 - var6) + var5, var17);
                    if (var15 > this.field4676) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field4676));
                        this.field4676 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4671 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V", line = 663)
    private final void method1880(int arg0) throws IOException {
        field4683++;
        this.field4682 = 0;
        if (this.field4676 != this.field4671) {
            this.field4672.method2146(this.field4676, arg0 + 29325);
            this.field4671 = this.field4676;
        }
        this.field4684 = this.field4676;
        if (arg0 != -29325) {
            return;
        }
        while (this.field4663.length > this.field4682) {
            int var2 = this.field4663.length - this.field4682;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4672.method2144(var2, this.field4663, this.field4682, (byte) 119);
            if (var3 == -1) {
                break;
            }
            this.field4682 += var3;
            this.field4671 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V", line = 706)
    private final void method1881(int arg0) throws IOException {
        if (arg0 >= -84) {
            method1873(85, (byte) 81, -76, true, (float[][]) ((float[][]) null), (class168) null, 5, 68, (float[][]) ((float[][]) null), 105, (float[][]) ((float[][]) null), -86, (int[][]) ((int[][]) null), 117, (byte) 125, -62);
        }
        if (this.field4680 != -1L) {
            if (this.field4680 != this.field4671) {
                this.field4672.method2146(this.field4680, 0);
                this.field4671 = this.field4680;
            }
            this.field4672.method2148((byte) -116, 0, this.field4679, this.field4662);
            long var2 = -1L;
            this.field4671 += (long) this.field4662;
            if (this.field4680 >= this.field4684 && ((long) this.field4682 + this.field4684) > this.field4680) {
                var2 = this.field4680;
            } else if (this.field4684 >= this.field4680 && ((long) this.field4662 + this.field4680) > this.field4684) {
                var2 = this.field4684;
            }
            if (this.field4671 > this.field4686) {
                this.field4686 = this.field4671;
            }
            long var4 = -1L;
            if (((long) this.field4662 + this.field4680) > this.field4684 && (long) this.field4682 + this.field4684 >= (long) this.field4662 + this.field4680) {
                var4 = this.field4680 + ((long) this.field4662);
            } else if (this.field4680 < (long) this.field4682 + this.field4684 && (this.field4684 + ((long) this.field4682)) <= ((long) this.field4662 + this.field4680)) {
                var4 = (long) this.field4682 + this.field4684;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class25.method219(this.field4679, (int) (var2 - this.field4680), this.field4663, (int) (var2 - this.field4684), var6);
            }
            this.field4662 = 0;
            this.field4680 = -1L;
        }
        field4687++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 794)
    public final void method1882(boolean arg0) throws IOException {
        this.method1881(-127);
        if (arg0) {
            this.field4682 = -75;
        }
        this.field4672.method2149(true);
        field4677++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "([BIIZ)V", line = 807)
    public final void method1883(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            this.field4680 = 125L;
        }
        field4666++;
        try {
            if (((long) arg2 + this.field4676) > this.field4665) {
                this.field4665 = (long) arg2 + this.field4676;
            }
            if (this.field4680 != -1L && (this.field4676 < this.field4680 || this.field4676 > (this.field4680 + ((long) this.field4662)))) {
                this.method1881(-116);
            }
            if (this.field4680 != -1L && (long) this.field4679.length + this.field4680 < (long) arg2 + this.field4676) {
                int var5 = (int) ((long) this.field4679.length + this.field4680 - this.field4676);
                arg2 -= var5;
                class25.method219(arg0, arg1, this.field4679, (int) (this.field4676 - this.field4680), var5);
                this.field4676 += (long) var5;
                this.field4662 = this.field4679.length;
                this.method1881(-108);
                arg1 += var5;
            }
            if (this.field4679.length < arg2) {
                if (this.field4676 != this.field4671) {
                    this.field4672.method2146(this.field4676, 0);
                    this.field4671 = this.field4676;
                }
                this.field4672.method2148((byte) -116, arg1, arg0, arg2);
                this.field4671 += (long) arg2;
                long var6 = -1L;
                if (this.field4686 < this.field4671) {
                    this.field4686 = this.field4671;
                }
                long var8 = -1L;
                if (this.field4676 >= this.field4684 && (long) this.field4682 + this.field4684 > this.field4676) {
                    var6 = this.field4676;
                } else if (this.field4676 <= this.field4684 && (long) arg2 + this.field4676 > this.field4684) {
                    var6 = this.field4684;
                }
                if (this.field4684 < (this.field4676 + ((long) arg2)) && (long) arg2 + this.field4676 <= (long) this.field4682 + this.field4684) {
                    var8 = this.field4676 + ((long) arg2);
                } else if (this.field4676 < (long) this.field4682 + this.field4684 && (long) this.field4682 + this.field4684 <= this.field4676 - -((long) arg2)) {
                    var8 = (long) this.field4682 + this.field4684;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class25.method219(arg0, (int) ((long) arg1 + var6 - this.field4676), this.field4663, (int) (var6 - this.field4684), var10);
                }
                this.field4676 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field4680 == -1L) {
                    this.field4680 = this.field4676;
                }
                class25.method219(arg0, arg1, this.field4679, (int) (this.field4676 - this.field4680), arg2);
                this.field4676 += (long) arg2;
                if (((long) this.field4662) < (this.field4676 - this.field4680)) {
                    this.field4662 = (int) (this.field4676 - this.field4680);
                }
            }
        } catch (IOException var12) {
            this.field4671 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lc;II)V", line = 973)
    public class262(class303 arg0, int arg1, int arg2) throws IOException {
        this.field4672 = arg0;
        this.field4665 = this.field4686 = arg0.method2147((byte) 109);
        this.field4676 = 0L;
        this.field4679 = new byte[arg2];
        this.field4663 = new byte[arg1];
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z[B)V", line = 952)
    public final void method1884(boolean arg0, byte[] arg1) throws IOException {
        if (!arg0) {
            this.method1876((byte) 62);
        }
        field4674++;
        this.method1879(0, arg1, arg1.length, false);
    }
}
