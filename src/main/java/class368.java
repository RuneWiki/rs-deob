import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class368 {

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "J")
    private long field5427 = -1L;

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    private int field5430 = 0;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "J")
    private long field5436 = -1L;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "Lcs;")
    private class408 field5423;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "J")
    private long field5434;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "J")
    private long field5440;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "J")
    private long field5419;

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "[B")
    private byte[] field5422;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "[B")
    private byte[] field5420;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "I")
    private int field5425;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "I")
    public static int field5439;

    @OriginalMember(owner = "client!cm", name = "w", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "J")
    private long field5424;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    private final void method2418(int arg0) throws IOException {
        field5437++;
        if (arg0 != -14738) {
            this.field5423 = null;
        }
        this.field5425 = 0;
        if (this.field5424 != this.field5419) {
            this.field5423.method2581((byte) -60, this.field5419);
            this.field5424 = this.field5419;
        }
        this.field5436 = this.field5419;
        while (this.field5425 < this.field5422.length) {
            int var2 = this.field5422.length - this.field5425;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5423.method2582(this.field5425, var2, (byte) 20, this.field5422);
            if (var3 == -1) {
                break;
            }
            this.field5425 += var3;
            this.field5424 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IJ)V")
    public final void method2419(int arg0, long arg1) throws IOException {
        field5431++;
        if ((long) arg0 > arg1) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2428((byte) -73));
        }
        this.field5419 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III[B)V")
    public final void method2420(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5426++;
        try {
            if (this.field5440 < (long) arg0 + this.field5419) {
                this.field5440 = this.field5419 + ((long) arg0);
            }
            if ((long) arg1 != this.field5427 && (this.field5427 > this.field5419 || ((long) this.field5430 + this.field5427) < this.field5419)) {
                this.method2423(true);
            }
            if (this.field5427 != -1L && (this.field5427 + ((long) this.field5420.length)) < ((long) arg0 + this.field5419)) {
                int var5 = (int) (-this.field5419 - (-this.field5427 - (long) this.field5420.length));
                class206.method1359(arg3, arg2, this.field5420, (int) (this.field5419 - this.field5427), var5);
                arg0 -= var5;
                arg2 += var5;
                this.field5419 += (long) var5;
                this.field5430 = this.field5420.length;
                this.method2423(true);
            }
            if (this.field5420.length < arg0) {
                if (this.field5424 != this.field5419) {
                    this.field5423.method2581((byte) -125, this.field5419);
                    this.field5424 = this.field5419;
                }
                this.field5423.method2583(arg0, 1, arg2, arg3);
                this.field5424 += (long) arg0;
                if (this.field5424 > this.field5434) {
                    this.field5434 = this.field5424;
                }
                long var6 = -1L;
                if (this.field5419 >= this.field5436 && this.field5419 < ((long) this.field5425 + this.field5436)) {
                    var6 = this.field5419;
                } else if (this.field5436 >= this.field5419 && this.field5436 < (long) arg0 + this.field5419) {
                    var6 = this.field5436;
                }
                long var8 = -1L;
                if (this.field5419 + ((long) arg0) > this.field5436 && ((long) arg0 + this.field5419) <= ((long) this.field5425 + this.field5436)) {
                    var8 = this.field5419 + ((long) arg0);
                } else if (this.field5419 < ((long) this.field5425 + this.field5436) && ((long) this.field5425 + this.field5436) <= ((long) arg0 + this.field5419)) {
                    var8 = (long) this.field5425 + this.field5436;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class206.method1359(arg3, (int) ((long) arg2 + var6 - this.field5419), this.field5422, (int) (var6 - this.field5436), var10);
                }
                this.field5419 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field5427 == -1L) {
                    this.field5427 = this.field5419;
                }
                class206.method1359(arg3, arg2, this.field5420, (int) (this.field5419 - this.field5427), arg0);
                this.field5419 += (long) arg0;
                if ((long) this.field5430 < this.field5419 - this.field5427) {
                    this.field5430 = (int) (this.field5419 - this.field5427);
                }
            }
        } catch (IOException var12) {
            this.field5424 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIIIIII)V")
    public static final void method2421(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5441++;
        class395.method2542(false, arg3);
        int var7 = 0;
        int var8 = arg3 - arg4;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class444.field6416[arg5];
        if (arg0 != 119) {
            method2424(false);
        }
        int var16 = arg2 - var8;
        int var17 = arg2 + var8;
        class351.method2317(false, var16, var15, arg2 - arg3, arg1);
        class351.method2317(false, var17, var15, var16, arg6);
        class351.method2317(false, arg2 + arg3, var15, var17, arg1);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class269.field3989[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class444.field6416[arg5 + var9];
                    int[] var19 = class444.field6416[arg5 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class351.method2317(false, var20, var18, var21, arg1);
                    class351.method2317(false, var20, var19, var21, arg1);
                } else {
                    int[] var22 = class444.field6416[arg5 + var9];
                    int[] var23 = class444.field6416[arg5 - var9];
                    int var24 = class269.field3989[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class351.method2317(false, var28, var22, var26, arg1);
                    class351.method2317(false, var27, var22, var28, arg6);
                    class351.method2317(false, var25, var22, var27, arg1);
                    class351.method2317(false, var28, var23, var26, arg1);
                    class351.method2317(false, var27, var23, var28, arg6);
                    class351.method2317(false, var25, var23, var27, arg1);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class444.field6416[arg5 + var7];
            int[] var30 = class444.field6416[arg5 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class351.method2317(false, var31, var29, var32, arg1);
                class351.method2317(false, var31, var30, var32, arg1);
            } else {
                int var33 = var11 < var7 ? class269.field3989[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class351.method2317(false, var35, var29, var32, arg1);
                class351.method2317(false, var34, var29, var35, arg6);
                class351.method2317(false, var31, var29, var34, arg1);
                class351.method2317(false, var35, var30, var32, arg1);
                class351.method2317(false, var34, var30, var35, arg6);
                class351.method2317(false, var31, var30, var34, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)J")
    public final long method2422(int arg0) {
        int var2 = -73 / ((arg0 + 19) / 58);
        field5429++;
        return this.field5440;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
    private final void method2423(boolean arg0) throws IOException {
        if (this.field5427 != -1L) {
            if (this.field5427 != this.field5424) {
                this.field5423.method2581((byte) -50, this.field5427);
                this.field5424 = this.field5427;
            }
            this.field5423.method2583(this.field5430, 1, 0, this.field5420);
            this.field5424 += (long) this.field5430;
            if (this.field5424 > this.field5434) {
                this.field5434 = this.field5424;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5427 >= this.field5436 && this.field5427 < ((long) this.field5425 + this.field5436)) {
                var2 = this.field5427;
            } else if (this.field5436 >= this.field5427 && ((long) this.field5430 + this.field5427) > this.field5436) {
                var2 = this.field5436;
            }
            if (this.field5436 < ((long) this.field5430 + this.field5427) && (this.field5436 + ((long) this.field5425)) >= ((long) this.field5430 + this.field5427)) {
                var4 = (long) this.field5430 + this.field5427;
            } else if (this.field5427 < this.field5436 + ((long) this.field5425) && (this.field5436 + ((long) this.field5425)) <= ((long) this.field5430 + this.field5427)) {
                var4 = (long) this.field5425 + this.field5436;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class206.method1359(this.field5420, (int) (var2 - this.field5427), this.field5422, (int) (var2 - this.field5436), var6);
            }
            this.field5427 = -1L;
            this.field5430 = 0;
        }
        if (!arg0) {
            this.field5422 = null;
        }
        field5435++;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(Z)Z")
    public static final boolean method2424(boolean arg0) {
        field5438++;
        if (class217.field3024 == 0) {
            return arg0 ? true : class78.field1095.method166(-72);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(II[BI)V")
    public final void method2425(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5439++;
        try {
            if (arg1 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 - (arg2.length - arg1));
            }
            if (this.field5427 != -1L && this.field5419 >= this.field5427 && ((long) this.field5430 + this.field5427) >= ((long) arg1 + this.field5419)) {
                class206.method1359(this.field5420, (int) (this.field5419 - this.field5427), arg2, arg3, arg1);
                this.field5419 += (long) arg1;
                return;
            }
            long var5 = this.field5419;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field5419 >= this.field5436 && this.field5419 < ((long) this.field5425 + this.field5436)) {
                int var9 = (int) ((long) this.field5425 - (this.field5419 - this.field5436));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class206.method1359(this.field5422, (int) (this.field5419 - this.field5436), arg2, arg3, var9);
                arg3 += var9;
                this.field5419 += (long) var9;
                arg1 -= var9;
            }
            if (arg1 > this.field5422.length) {
                this.field5423.method2581((byte) -126, this.field5419);
                this.field5424 = this.field5419;
                while (arg1 > 0) {
                    int var10 = this.field5423.method2582(arg3, arg1, (byte) 107, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field5419 += (long) var10;
                    arg3 += var10;
                    this.field5424 += (long) var10;
                    arg1 -= var10;
                }
            } else if (arg1 > 0) {
                this.method2418(-14738);
                int var11 = arg1;
                if (arg1 > this.field5425) {
                    var11 = this.field5425;
                }
                class206.method1359(this.field5422, 0, arg2, arg3, var11);
                arg3 += var11;
                arg1 -= var11;
                this.field5419 += (long) var11;
            }
            if ((long) arg0 != this.field5427) {
                if (this.field5427 > this.field5419 && arg1 > 0) {
                    int var12 = (int) (this.field5427 - this.field5419) + arg3;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2[arg3++] = 0;
                        arg1--;
                        this.field5419++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field5427 && this.field5427 < (var5 + ((long) var8))) {
                    var13 = this.field5427;
                } else if (this.field5427 <= var5 && (long) this.field5430 + this.field5427 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field5430 + this.field5427) > var5 && (long) var8 + var5 >= (long) this.field5430 + this.field5427) {
                    var15 = this.field5427 + ((long) this.field5430);
                } else if (this.field5427 < var5 + ((long) var8) && (long) this.field5430 + this.field5427 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class206.method1359(this.field5420, (int) (var13 - this.field5427), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (this.field5419 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5419));
                        this.field5419 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5424 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([II)Ljava/lang/String;")
    public static final String method2426(int[] arg0, int arg1) {
        field5428++;
        if (arg1 < 9) {
            return null;
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class348.field5182;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class299 var5 = class163.method1104((byte) 73, arg0[var4]);
            if (var5.field4510 != -1) {
                class315 var6 = (class315) class258.field3801.method378((byte) 28, (long) var5.field4510);
                if (var6 == null) {
                    class10 var7 = class10.method88(class118.field1532, var5.field4510, 0);
                    if (var7 != null) {
                        var6 = class126.field1647.method463(var7, true);
                        class258.field3801.method367((long) var5.field4510, var6, true);
                    }
                }
                if (var6 != null) {
                    class407.field5923[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "([BI)V")
    public final void method2427(byte[] arg0, int arg1) throws IOException {
        this.method2425(-1, arg0.length, arg0, 0);
        field5432++;
        if (arg1 > -47) {
            this.field5419 = 82L;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)Ljava/io/File;")
    private final File method2428(byte arg0) {
        if (arg0 > -40) {
            method2426((int[]) null, 104);
        }
        field5421++;
        return this.field5423.method2585(18791);
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lcs;II)V")
    public class368(class408 arg0, int arg1, int arg2) throws IOException {
        this.field5423 = arg0;
        this.field5440 = this.field5434 = arg0.method2580(0);
        this.field5419 = 0L;
        this.field5422 = new byte[arg1];
        this.field5420 = new byte[arg2];
    }
}
