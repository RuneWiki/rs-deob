import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class1 {

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "J")
    private long field18 = -1L;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    private int field30 = 0;

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "J")
    private long field21 = -1L;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "Lek;")
    private class270 field25;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "J")
    private long field16;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "J")
    private long field32;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "[B")
    private byte[] field19;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "J")
    private long field35;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "[B")
    private byte[] field12;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "Lph;")
    public static class229 field11 = class266.method1858("logo", 0);

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "Lph;")
    public static class229 field31 = class266.method1858("unzap", 0);

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "[I")
    public static int[] field33 = new int[4096];

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "J")
    private long field27;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "Ljl;")
    public static class61 field5;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lsi;")
    public static class66 field17;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "[[[I")
    public static int[][][] field10;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)J", line = 9)
    public final long method1(int arg0) {
        field6++;
        int var2 = -22 % ((42 - arg0) / 38);
        return this.field32;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZIIILhb;II)V", line = 37)
    public static final void method2(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class164 arg6, int arg7, int arg8) {
        if (arg1 >= 0 && arg1 < 104 && arg7 >= 0 && arg7 < 104) {
            if (!arg2) {
                class245.field4050[arg5][arg1][arg7] = 0;
            }
            while (true) {
                int var9 = arg6.method1178(8);
                if (var9 == 0) {
                    if (arg2) {
                        class192.field3174[0][arg1][arg7] = class103.field1753[0][arg1][arg7];
                    } else if (arg5 == 0) {
                        class192.field3174[0][arg1][arg7] = -class260.method1812(false, 932731 - (-arg1 - arg8), arg7 + 556238 + arg4) * 8;
                    } else {
                        class192.field3174[arg5][arg1][arg7] = class192.field3174[arg5 - 1][arg1][arg7] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg6.method1178(8);
                    if (arg2) {
                        class192.field3174[0][arg1][arg7] = var10 * 8 + class103.field1753[0][arg1][arg7];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg5 == 0) {
                            class192.field3174[0][arg1][arg7] = -var10 * 8;
                        } else {
                            class192.field3174[arg5][arg1][arg7] = class192.field3174[arg5 - 1][arg1][arg7] - var10 * 8;
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class12.field166[arg5][arg1][arg7] = arg6.method1163(864348104);
                    class304.field5084[arg5][arg1][arg7] = (byte) ((var9 - 2) / 4);
                    class177.field2925[arg5][arg1][arg7] = (byte) class243.method1696(var9 + arg0 - 2, 3);
                } else if (var9 > 81) {
                    class126.field2104[arg5][arg1][arg7] = (byte) (var9 - 81);
                } else if (!arg2) {
                    class245.field4050[arg5][arg1][arg7] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg6.method1178(8);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg6.method1178(arg3 ^ 0xFFFFFF9F);
                    break;
                }
                if (var11 <= 49) {
                    arg6.method1178(8);
                }
            }
        }
        field20++;
        if (arg3 != -105) {
            method10(69, (byte) 121, 58);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)Lci;", line = 139)
    public static final class70 method3(boolean arg0, int arg1) {
        field23++;
        class70 var2 = (class70) class36.field591.method1413((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        if (arg0) {
            method11((class66) null, 54, (class66) null);
        }
        byte[] var3 = class263.field4393.method523(-87, arg1, 0);
        class70 var4 = new class70();
        if (var3 != null) {
            var4.method551(true, new class164(var3));
        }
        var4.method547((byte) -115);
        class36.field591.method1419((long) arg1, 5216, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(JI)V", line = 167)
    public final void method4(long arg0, int arg1) throws IOException {
        field13++;
        if (arg1 != 0) {
            field11 = (class229) null;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method7(0));
        }
        this.field35 = arg0;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BIBI)V", line = 195)
    public final void method5(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field14++;
        try {
            if ((long) arg3 + this.field35 > this.field32) {
                this.field32 = (long) arg3 + this.field35;
            }
            if (this.field18 != -1L && (this.field18 > this.field35 || ((long) this.field30 + this.field18) < this.field35)) {
                this.method6(0);
            }
            if (this.field18 != -1L && ((long) arg3 + this.field35) > ((long) this.field19.length + this.field18)) {
                int var5 = (int) ((long) this.field19.length + this.field18 - this.field35);
                arg3 -= var5;
                class42.method317(arg0, arg1, this.field19, (int) (this.field35 - this.field18), var5);
                arg1 += var5;
                this.field35 += (long) var5;
                this.field30 = this.field19.length;
                this.method6(0);
            }
            if (arg3 > this.field19.length) {
                if (this.field35 != this.field27) {
                    this.field25.method1877(25409, this.field35);
                    this.field27 = this.field35;
                }
                this.field25.method1880(arg1, arg0, (byte) 52, arg3);
                this.field27 += (long) arg3;
                if (this.field16 < this.field27) {
                    this.field16 = this.field27;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field21 <= this.field35 && this.field35 < (this.field21 + ((long) this.field4))) {
                    var8 = this.field35;
                } else if (this.field35 <= this.field21 && this.field21 < ((long) arg3 + this.field35)) {
                    var8 = this.field21;
                }
                if (this.field21 < (long) arg3 + this.field35 && this.field21 + ((long) this.field4) >= (long) arg3 + this.field35) {
                    var6 = (long) arg3 + this.field35;
                } else if ((long) this.field4 + this.field21 > this.field35 && ((long) arg3 + this.field35) >= (this.field21 + ((long) this.field4))) {
                    var6 = (long) this.field4 + this.field21;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class42.method317(arg0, (int) ((long) arg1 + var8 - this.field35), this.field12, (int) (var8 - this.field21), var10);
                }
                this.field35 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field18 == -1L) {
                    this.field18 = this.field35;
                }
                class42.method317(arg0, arg1, this.field19, (int) (this.field35 - this.field18), arg3);
                this.field35 += (long) arg3;
                if (((long) this.field30) < (this.field35 - this.field18)) {
                    this.field30 = (int) (this.field35 - this.field18);
                }
            } else if (arg2 != -125) {
                this.field35 = -63L;
            }
        } catch (IOException var12) {
            this.field27 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V", line = 330)
    private final void method6(int arg0) throws IOException {
        field22++;
        if (arg0 != 0) {
            this.field21 = -52L;
        }
        if (this.field18 == -1L) {
            return;
        }
        if (this.field27 != this.field18) {
            this.field25.method1877(25409, this.field18);
            this.field27 = this.field18;
        }
        this.field25.method1880(0, this.field19, (byte) 52, this.field30);
        this.field27 += (long) this.field30;
        long var2 = -1L;
        if (this.field18 >= this.field21 && this.field18 < (long) this.field4 + this.field21) {
            var2 = this.field18;
        } else if (this.field21 >= this.field18 && ((long) this.field30 + this.field18) > this.field21) {
            var2 = this.field21;
        }
        if (this.field27 > this.field16) {
            this.field16 = this.field27;
        }
        long var4 = -1L;
        if (((long) this.field30 + this.field18) > this.field21 && (this.field18 + ((long) this.field30)) <= ((long) this.field4 + this.field21)) {
            var4 = (long) this.field30 + this.field18;
        } else if (this.field18 < ((long) this.field4 + this.field21) && (long) this.field4 + this.field21 <= (long) this.field30 + this.field18) {
            var4 = this.field21 + ((long) this.field4);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class42.method317(this.field19, (int) (var2 - this.field18), this.field12, (int) (var2 - this.field21), var6);
        }
        this.field30 = 0;
        this.field18 = -1L;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Ljava/io/File;", line = 409)
    private final File method7(int arg0) {
        if (arg0 != 0) {
            method8(102);
        }
        field8++;
        return this.field25.method1876(0);
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)V", line = 428)
    public static void method8(int arg0) {
        field10 = (int[][][]) null;
        field11 = null;
        field5 = null;
        field17 = null;
        int var1 = -33 / ((21 - arg0) / 46);
        field33 = null;
        field31 = null;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lek;II)V", line = 765)
    public class1(class270 arg0, int arg1, int arg2) throws IOException {
        this.field25 = arg0;
        this.field32 = this.field16 = arg0.method1875((byte) -87);
        this.field19 = new byte[arg2];
        this.field35 = 0L;
        this.field12 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI[BI)V", line = 456)
    public final void method9(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field24++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if (this.field18 != -1L && this.field35 >= this.field18 && (long) arg1 + this.field35 <= (long) this.field30 + this.field18) {
                class42.method317(this.field19, (int) (this.field35 - this.field18), arg2, arg3, arg1);
                this.field35 += (long) arg1;
                return;
            }
            long var5 = this.field35;
            if (!arg0) {
                method8(-100);
            }
            int var7 = arg3;
            int var8 = arg1;
            if (this.field35 >= this.field21 && this.field35 < ((long) this.field4 + this.field21)) {
                int var9 = (int) ((long) this.field4 + this.field21 - this.field35);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class42.method317(this.field12, (int) (this.field35 - this.field21), arg2, arg3, var9);
                arg3 += var9;
                arg1 -= var9;
                this.field35 += (long) var9;
            }
            if (arg1 > this.field12.length) {
                this.field25.method1877(25409, this.field35);
                this.field27 = this.field35;
                while (arg1 > 0) {
                    int var10 = this.field25.method1878(arg1, false, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field35 += (long) var10;
                    arg3 += var10;
                    arg1 -= var10;
                    this.field27 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method14(53);
                int var11 = arg1;
                if (arg1 > this.field4) {
                    var11 = this.field4;
                }
                class42.method317(this.field12, 0, arg2, arg3, var11);
                this.field35 += (long) var11;
                arg3 += var11;
                arg1 -= var11;
            }
            if (this.field18 != -1L) {
                if (this.field35 < this.field18 && arg1 > 0) {
                    int var12 = (int) (this.field18 - this.field35) + arg3;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field35++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field18 && (long) var8 + var5 > this.field18) {
                    var13 = this.field18;
                } else if (var5 >= this.field18 && var5 < (long) this.field30 + this.field18) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field30 + this.field18 > var5 && this.field18 + ((long) this.field30) <= (long) var8 + var5) {
                    var15 = (long) this.field30 + this.field18;
                } else if (this.field18 < (long) var8 + var5 && ((long) var8 + var5) <= ((long) this.field30 + this.field18)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class42.method317(this.field19, (int) (var13 - this.field18), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field35) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field35));
                        this.field35 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field27 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)Lu;", line = 644)
    public static final class219 method10(int arg0, byte arg1, int arg2) {
        int var3 = 17 / ((-arg1 - 5) / 59);
        field28++;
        class219 var4 = new class219();
        for (class235 var5 = (class235) class142.field2309.method1580((byte) -39); var5 != null; var5 = (class235) class142.field2309.method1579((byte) 28)) {
            if (var5.field3876 && var5.method1664((byte) -50, arg0, arg2)) {
                var4.method1532(126, var5);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lsi;ILsi;)V", line = 667)
    public static final void method11(class66 arg0, int arg1, class66 arg2) {
        class316.field5366 = arg0;
        field7++;
        class213.field3518 = arg2;
        if (arg1 != 12327) {
            method11((class66) null, -125, (class66) null);
        }
        class22.field279 = class213.field3518.method517((byte) -126, 3);
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)V", line = 683)
    public final void method12(int arg0) throws IOException {
        this.method6(0);
        field26++;
        this.field25.method1879(-9784);
        if (arg0 != -3) {
            field5 = (class61) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BI)V", line = 701)
    public final void method13(byte[] arg0, int arg1) throws IOException {
        if (arg1 != -2) {
            method2(-42, -74, false, 120, -72, 58, (class164) null, 15, -109);
        }
        this.method9(true, arg0.length, arg0, 0);
        field29++;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)V", line = 718)
    private final void method14(int arg0) throws IOException {
        this.field4 = 0;
        field15++;
        if (this.field35 != this.field27) {
            this.field25.method1877(25409, this.field35);
            this.field27 = this.field35;
        }
        if (arg0 <= 52) {
            this.field21 = -91L;
        }
        this.field21 = this.field35;
        while (this.field4 < this.field12.length) {
            int var2 = this.field12.length - this.field4;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field25.method1878(var2, false, this.field12, this.field4);
            if (var3 == -1) {
                break;
            }
            this.field27 += (long) var3;
            this.field4 += var3;
        }
    }
}
