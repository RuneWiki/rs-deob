import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class166 {

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "J")
    private long field3014 = -1L;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    private int field3025 = 0;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "J")
    private long field3015 = -1L;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "Lt;")
    private class198 field3010;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "J")
    private long field3019;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "J")
    private long field3003;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "[B")
    private byte[] field3030;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "J")
    private long field3013;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[B")
    private byte[] field3024;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field3005 = 4;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "Loc;")
    public static class151 field3016 = class137.method873(2, "RuneScape wurde aktualisiert(Q");

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "[[Lq;")
    public static class168[][] field3023 = new class168[field3005][500];

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field3006 = new int[field3005];

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field3017 = 0;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "Lwh;")
    public static class236 field3032 = new class236(32);

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "Loc;")
    public static class151 field3034 = class137.method873(2, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "Loc;")
    private static class151 field3037 = class137.method873(2, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Loc;")
    public static class151 field3036 = field3037;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    private int field3004;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "J")
    private long field3031;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "Lgd;")
    public static class69 field3033;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[[[B")
    public static byte[][][] field3007;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    private final void method1071(int arg0) throws IOException {
        if (this.field3015 != -1L) {
            if (this.field3031 != this.field3015) {
                this.field3010.method1241(-61, this.field3015);
                this.field3031 = this.field3015;
            }
            this.field3010.method1244((byte) -64, this.field3024, 0, this.field3025);
            long var2 = -1L;
            if (this.field3015 >= this.field3014 && this.field3015 < (long) this.field3004 + this.field3014) {
                var2 = this.field3015;
            } else if (this.field3014 >= this.field3015 && this.field3014 < (long) this.field3025 + this.field3015) {
                var2 = this.field3014;
            }
            long var4 = -1L;
            this.field3031 += this.field3025;
            if (this.field3019 < this.field3031) {
                this.field3019 = this.field3031;
            }
            if (this.field3014 < (long) this.field3025 + this.field3015 && (long) this.field3004 + this.field3014 >= (long) this.field3025 + this.field3015) {
                var4 = (long) this.field3025 + this.field3015;
            } else if (this.field3015 < (long) this.field3004 + this.field3014 && this.field3014 + (long) this.field3004 <= (long) this.field3025 + this.field3015) {
                var4 = (long) this.field3004 + this.field3014;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class145.method924(this.field3024, (int) (var2 - this.field3015), this.field3030, (int) (var2 - this.field3014), var6);
            }
            this.field3015 = -1L;
            this.field3025 = 0;
        }
        if (arg0 > -63) {
            method1083((byte) -123);
        }
        field3012++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZIIIIIIIII)V")
    public static final void method1072(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3027++;
        if (arg4 == arg8 && arg2 == arg6 && arg3 == arg7 && arg5 == arg9) {
            class113.method685(arg8, arg1, arg2, arg5, arg3, 11874);
        } else {
            int var10 = arg2;
            int var11 = arg8 * 3;
            int var12 = arg2 * 3;
            int var13 = arg8;
            int var14 = arg4 * 3;
            int var15 = arg6 * 3;
            int var16 = arg7 * 3;
            int var17 = arg9 * 3;
            int var18 = var12 + var17 - var15 - var15;
            int var19 = arg3 + var14 - arg8 - var16;
            int var20 = var16 + var11 - var14 - var14;
            int var21 = var15 - var12;
            int var22 = var14 - var11;
            int var23 = var15 + arg5 - var17 - arg2;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var23 * var26;
                int var29 = var18 * var25;
                int var30 = var20 * var25;
                int var31 = var22 * var24;
                int var32 = var21 * var24;
                int var33 = arg8 + (var27 + var30 + var31 >> 12);
                int var34 = (var28 + var29 + var32 >> 12) + arg2;
                class113.method685(var13, arg1, var10, var34, var33, 11874);
                var10 = var34;
                var13 = var33;
            }
        }
        if (arg0) {
            method1080((byte) -14, null);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)V")
    public final void method1073(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3009++;
        try {
            if (arg0 != -1) {
                method1079(67);
            }
            if (this.field3003 < (long) arg1 + this.field3013) {
                this.field3003 = (long) arg1 + this.field3013;
            }
            if (this.field3015 != -1L && (this.field3013 < this.field3015 || (long) this.field3025 + this.field3015 < this.field3013)) {
                this.method1071(-98);
            }
            if (this.field3015 != -1L && (long) this.field3024.length + this.field3015 < (long) arg1 + this.field3013) {
                int var5 = (int) ((long) this.field3024.length + this.field3015 - this.field3013);
                class145.method924(arg3, arg2, this.field3024, (int) (this.field3013 - this.field3015), var5);
                arg2 += var5;
                this.field3013 += var5;
                this.field3025 = this.field3024.length;
                arg1 -= var5;
                this.method1071(arg0 ^ 0x59);
            }
            if (arg1 > this.field3024.length) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3031 != this.field3013) {
                    this.field3010.method1241(-77, this.field3013);
                    this.field3031 = this.field3013;
                }
                this.field3010.method1244((byte) -64, arg3, arg2, arg1);
                this.field3031 += arg1;
                if (this.field3031 > this.field3019) {
                    this.field3019 = this.field3031;
                }
                if ((long) arg1 + this.field3013 > this.field3014 && (long) arg1 + this.field3013 <= (long) this.field3004 + this.field3014) {
                    var8 = (long) arg1 + this.field3013;
                } else if ((long) this.field3004 + this.field3014 > this.field3013 && (long) this.field3004 + this.field3014 <= this.field3013 - -((long) arg1)) {
                    var8 = (long) this.field3004 + this.field3014;
                }
                if (this.field3013 >= this.field3014 && this.field3013 < this.field3014 + (long) this.field3004) {
                    var6 = this.field3013;
                } else if (this.field3013 <= this.field3014 && (long) arg1 + this.field3013 > this.field3014) {
                    var6 = this.field3014;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class145.method924(arg3, (int) ((long) arg2 + var6 - this.field3013), this.field3030, (int) (var6 - this.field3014), var10);
                }
                this.field3013 += arg1;
            } else if (arg1 > 0) {
                if (this.field3015 == -1L) {
                    this.field3015 = this.field3013;
                }
                class145.method924(arg3, arg2, this.field3024, (int) (this.field3013 - this.field3015), arg1);
                this.field3013 += arg1;
                if (this.field3013 - this.field3015 > (long) this.field3025) {
                    this.field3025 = (int) (this.field3013 - this.field3015);
                }
            }
        } catch (IOException var12) {
            this.field3031 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)J")
    public final long method1074(int arg0) {
        if (arg0 == 0) {
            field3011++;
            return this.field3003;
        } else {
            return -12L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)V")
    public final void method1075(int arg0, byte[] arg1) throws IOException {
        if (arg0 > -42) {
            this.field3013 = 44L;
        }
        this.method1078(0, arg1, false, arg1.length);
        field3002++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
    private final void method1076(boolean arg0) throws IOException {
        if (arg0) {
            this.field3015 = -47L;
        }
        this.field3004 = 0;
        if (this.field3031 != this.field3013) {
            this.field3010.method1241(-30, this.field3013);
            this.field3031 = this.field3013;
        }
        this.field3014 = this.field3013;
        while (this.field3030.length > this.field3004) {
            int var2 = this.field3030.length - this.field3004;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3010.method1242(var2, 6541, this.field3004, this.field3030);
            if (var3 == -1) {
                break;
            }
            this.field3004 += var3;
            this.field3031 += var3;
        }
        field3008++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method1077(byte arg0) {
        int var2 = -123 % ((arg0 + 57) / 50);
        field3022++;
        return this.field3010.method1245((byte) -64);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BZI)V")
    public final void method1078(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field3028++;
        try {
            if (arg1.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (arg2) {
                method1083((byte) 11);
            }
            if (this.field3015 != -1L && this.field3013 >= this.field3015 && this.field3013 + (long) arg3 <= (long) this.field3025 + this.field3015) {
                class145.method924(this.field3024, (int) (this.field3013 - this.field3015), arg1, arg0, arg3);
                this.field3013 += arg3;
                return;
            }
            long var5 = this.field3013;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field3014 <= this.field3013 && this.field3013 < (long) this.field3004 + this.field3014) {
                int var9 = (int) ((long) this.field3004 + this.field3014 - this.field3013);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class145.method924(this.field3030, (int) (this.field3013 - this.field3014), arg1, arg0, var9);
                this.field3013 += var9;
                arg0 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field3030.length) {
                this.field3010.method1241(-52, this.field3013);
                this.field3031 = this.field3013;
                while (arg3 > 0) {
                    int var10 = this.field3010.method1242(arg3, 6541, arg0, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3031 += var10;
                    this.field3013 += var10;
                    arg3 -= var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                this.method1076(false);
                int var11 = arg3;
                if (this.field3004 < arg3) {
                    var11 = this.field3004;
                }
                arg3 -= var11;
                class145.method924(this.field3030, 0, arg1, arg0, var11);
                this.field3013 += var11;
                arg0 += var11;
            }
            if (this.field3015 != -1L) {
                if (this.field3015 > this.field3013 && arg3 > 0) {
                    int var12 = (int) (this.field3015 - this.field3013) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field3013++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field3025 + this.field3015 > var5 && (long) this.field3025 + this.field3015 <= var5 - -((long) var7)) {
                    var15 = (long) this.field3025 + this.field3015;
                } else if (this.field3015 < (long) var7 + var5 && (long) var7 + var5 <= (long) this.field3025 + this.field3015) {
                    var15 = (long) var7 + var5;
                }
                if (this.field3015 >= var5 && (long) var7 + var5 > this.field3015) {
                    var13 = this.field3015;
                } else if (this.field3015 <= var5 && (long) this.field3025 + this.field3015 > var5) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class145.method924(this.field3024, (int) (var13 - this.field3015), arg1, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field3013) {
                        arg3 = (int) ((long) arg3 + this.field3013 - var15);
                        this.field3013 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3031 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method1079(int arg0) {
        field3023 = null;
        if (arg0 != 0) {
            method1072(false, -1, 88, 17, -17, 22, 116, 48, -44, 126);
        }
        field3037 = null;
        field3034 = null;
        field3007 = null;
        field3036 = null;
        field3006 = null;
        field3033 = null;
        field3016 = null;
        field3032 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLwd;)Z")
    public static final boolean method1080(byte arg0, class232 arg1) {
        if (arg0 != 61) {
            return true;
        }
        field3026++;
        if (arg1.field4148 == 205) {
            class131.field2415 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BJ)V")
    public final void method1081(byte arg0, long arg1) throws IOException {
        field3020++;
        int var4 = 40 % ((arg0 + 78) / 42);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1077((byte) 106));
        }
        this.field3013 = arg1;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    public final void method1082(byte arg0) throws IOException {
        field3029++;
        this.method1071(-123);
        int var2 = 126 % ((49 - arg0) / 63);
        this.field3010.method1243((byte) 113);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(B)V")
    public static final void method1083(byte arg0) {
        class114.field2027.method1317((byte) -124);
        int var1 = 52 / ((arg0 - 36) / 63);
        class160.field2874.method1026(-1);
        class1.field39.method1317((byte) -120);
        field3018++;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lt;II)V")
    public class166(class198 arg0, int arg1, int arg2) throws IOException {
        this.field3010 = arg0;
        this.field3003 = this.field3019 = arg0.method1240((byte) -74);
        this.field3030 = new byte[arg1];
        this.field3013 = 0L;
        this.field3024 = new byte[arg2];
    }
}
