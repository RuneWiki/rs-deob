import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class694 {

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field9767;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "J")
    private long field9772;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "Ljava/io/File;")
    private File field9769;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "J")
    private long field9776;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "J")
    public static volatile long field9765 = 0L;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field9768;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "Lgga;")
    public static class513 field9779;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)I")
    public static int method3895(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)J")
    public final long method3896(int arg0) throws IOException {
        field9778++;
        if (arg0 != -8486) {
            this.field9772 = 22L;
        }
        return this.field9767.length();
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public static final void method3897(byte arg0) {
        field9771++;
        if (!class215.field3142 && arg0 == 91) {
            class438.field6083 = true;
            class133.field2232 += (24.0F - class133.field2232) / 2.0F;
            class215.field3142 = true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([BBII)V")
    public final void method3898(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field9774++;
        if (this.field9772 < ((long) arg2 + this.field9776)) {
            this.field9767.seek(this.field9772);
            this.field9767.write(1);
            throw new EOFException();
        } else {
            this.field9767.write(arg0, arg3, arg2);
            this.field9776 += arg2;
            int var5 = 71 / ((arg1 - 14) / 44);
        }
    }

    @OriginalMember(owner = "client!ji", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9775++;
        if (this.field9767 != null) {
            System.out.println("Warning! fileondisk " + this.field9769 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3900(108);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(JB)V")
    public final void method3899(long arg0, byte arg1) throws IOException {
        this.field9767.seek(arg0);
        if (arg1 != 67) {
            this.field9769 = null;
        }
        field9773++;
        this.field9776 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public final void method3900(int arg0) throws IOException {
        if (arg0 < 91) {
            method3901(64, -37, -58, 9, false);
        }
        field9766++;
        if (this.field9767 != null) {
            this.field9767.close();
            this.field9767 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)V")
    public static final void method3901(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field9770++;
        if (!arg4 && class732.field10181 == arg3 && class263.field3718 == arg1 && class403.field5560 == class112.field1620 || class420.field5820.field9495.method1677(17539) == 1) {
            return;
        }
        class112.field1620 = class403.field5560;
        class263.field3718 = arg1;
        class732.field10181 = arg3;
        if (class420.field5820.field9495.method1677(arg2 - 8516) == 1) {
            class112.field1620 = 0;
        }
        class75.method690(true, arg0);
        class609.method3526(class563.field7810.method3281(class423.field5892, arg2 ^ 0xFFFF9A38), class686.field9702, (byte) -76, class30.field322, class420.field5827, true);
        int var5 = class222.field3266;
        class222.field3266 = (class732.field10181 - (class192.field2891 >> 4)) * 8;
        int var6 = class697.field9798;
        class697.field9798 = (class263.field3718 - (class456.field6225 >> 4)) * 8;
        class370.field5222 = class751.method4144(class732.field10181 * 8, class263.field3718 * 8);
        class447.field6170 = null;
        int var7 = class222.field3266 - var5;
        int var8 = class697.field9798 - var6;
        if (arg0 == 11) {
            for (int var17 = 0; var17 < class51.field731; var17++) {
                class647 var31 = class654.field9252[var17];
                if (var31 != null) {
                    class506 var32 = var31.field9191;
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field4142[var33] -= var7;
                        var32.field4136[var33] -= var8;
                    }
                    var32.field10347 -= var7 * 512;
                    var32.field10350 -= var8 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class657.field9270 = 0;
            int var10 = class192.field2891 * 512 - 512;
            int var11 = (class456.field6225 - 1) * 512;
            for (int var12 = 0; var12 < class51.field731; var12++) {
                class647 var13 = class654.field9252[var12];
                if (var13 != null) {
                    class506 var14 = var13.field9191;
                    var14.field10350 -= var8 * 512;
                    var14.field10347 -= var7 * 512;
                    if (var14.field10347 >= 0 && var14.field10347 <= var10 && var14.field10350 >= 0 && var14.field10350 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field4142[var16] -= var7;
                            var14.field4136[var16] -= var8;
                            if (var14.field4142[var16] < 0 || var14.field4142[var16] >= class192.field2891 || var14.field4136[var16] < 0 || var14.field4136[var16] >= class456.field6225) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class350.field4963[class657.field9270++] = var14.field4051;
                        } else {
                            var14.method2965(524288, null);
                            var13.method4237(-1);
                            var9 = true;
                        }
                    } else {
                        var14.method2965(524288, null);
                        var9 = true;
                        var13.method4237(-1);
                    }
                }
            }
            if (var9) {
                class51.field731 = class486.field6697.method4257(108);
                class486.field6697.method4256(5669, class654.field9252);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class21 var29 = class588.field8451[var18];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field4142[var30] -= var7;
                    var29.field4136[var30] -= var8;
                }
                var29.field10347 -= var7 * 512;
                var29.field10350 -= var8 * 512;
            }
        }
        class780[] var19 = class55.field870;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class780 var28 = var19[var20];
            if (var28 != null) {
                var28.field10688 -= var7 * 512;
                var28.field10687 -= var8 * 512;
            }
        }
        for (class160 var21 = (class160) class218.field3198.method3731((byte) -119); var21 != null; var21 = (class160) class218.field3198.method3729((byte) -122)) {
            var21.field2479 -= var7;
            var21.field2488 -= var8;
            if (class636.field8987 != 4 && (var21.field2479 < 0 || var21.field2488 < 0 || var21.field2479 >= class192.field2891 || var21.field2488 >= class456.field6225)) {
                var21.method4237(-1);
            }
        }
        for (class160 var22 = (class160) class117.field1994.method3731((byte) -86); var22 != null; var22 = (class160) class117.field1994.method3729((byte) 24)) {
            var22.field2488 -= var8;
            var22.field2479 -= var7;
            if (class636.field8987 != 4 && (var22.field2479 < 0 || var22.field2488 < 0 || var22.field2479 >= class192.field2891 || class456.field6225 <= var22.field2488)) {
                var22.method4237(-1);
            }
        }
        if (class636.field8987 != 4) {
            for (class482 var23 = (class482) class400.field5509.method4254((byte) 8); var23 != null; var23 = (class482) class400.field5509.method4251(-57)) {
                int var24 = (int) (var23.field10592 & 0x3FFFL);
                int var25 = var24 - class222.field3266;
                int var26 = (int) (var23.field10592 >> 14 & 0x3FFFL);
                int var27 = var26 - class697.field9798;
                if (var25 < 0 || var27 < 0 || var25 >= class192.field2891 || var27 >= class456.field6225) {
                    var23.method4237(arg2 ^ 0xFFFF9A38);
                }
            }
        }
        if (class263.field3717 != 0) {
            class104.field1516 -= var8;
            class263.field3717 -= var7;
        }
        class526.method3075(arg2 ^ 0x65C0);
        if (arg0 != 11) {
            class337.field4787 -= var7;
            class286.field4204 -= var8 * 512;
            class410.field5616 -= var8;
            class733.field10199 -= var7 * 512;
            class355.field5022 -= var7;
            class427.field5930 -= var8;
            if (Math.abs(var7) > class192.field2891 || Math.abs(var8) > class456.field6225) {
                class166.method1239(false);
            }
        } else if (class783.field10725 == 4) {
            class335.field4760 -= var7 * 512;
            class45.field598 -= var8 * 512;
            class374.field5256 -= var7 * 512;
            class478.field6577 -= var8 * 512;
        } else {
            class401.field5533 = -1;
            class743.field10323 = -1;
            class783.field10725 = 1;
        }
        class664.method3720(-2);
        class726.method4025(false);
        class752.field10463.method3735(-4676);
        class248.field3573.method3735(-4676);
        class383.field5370.method1731(-126);
        if (arg2 == 26055) {
            class635.method3620((byte) 84);
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method3902(int arg0) {
        if (arg0 == -1) {
            field9777++;
            return this.field9769;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class694(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field9767 = new RandomAccessFile(arg0, arg1);
        this.field9772 = arg2;
        this.field9769 = arg0;
        this.field9776 = 0L;
        int var5 = this.field9767.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field9767.seek(0L);
            this.field9767.write(var5);
        }
        this.field9767.seek(0L);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
    public static void method3903(int arg0) {
        field9779 = null;
        int var1 = 67 / ((arg0 - 43) / 40);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BI)I")
    public final int method3904(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9768++;
        int var5 = this.field9767.read(arg2, arg0, arg1);
        int var6 = 59 % ((75 - arg3) / 44);
        if (var5 > 0) {
            this.field9776 += var5;
        }
        return var5;
    }
}
