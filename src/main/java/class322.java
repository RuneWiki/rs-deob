import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class322 {

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4389;

    @OriginalMember(owner = "client!jn", name = "l", descriptor = "J")
    private long field4394;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "J")
    private long field4383;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Ljava/io/File;")
    private File field4391;

    @OriginalMember(owner = "client!jn", name = "m", descriptor = "I")
    public static int field4395 = 0;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "[F")
    public static float[] field4397 = new float[4];

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!jn", name = "k", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!jn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4389 != null) {
            System.out.println("Warning! fileondisk " + this.field4391 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2000((byte) 33);
        }
        field4385++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)J")
    public final long method1996(int arg0) throws IOException {
        field4387++;
        int var2 = 93 % ((arg0 - 51) / 53);
        return this.field4389.length();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)V")
    public static final void method1997(int arg0, int arg1, byte arg2) {
        field4393++;
        class503 var3 = class512.method3112(5, arg1, 0);
        var3.method3075((byte) 90);
        if (arg2 <= -29) {
            var3.field7310 = arg0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IJ)V")
    public final void method1998(int arg0, long arg1) throws IOException {
        this.field4389.seek(arg1);
        field4392++;
        if (arg0 != -858993460) {
            field4397 = null;
        }
        this.field4394 = arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
    public static final int method1999(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        field4398++;
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & arg1);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public final void method2000(byte arg0) throws IOException {
        if (arg0 != 33) {
            this.method2001(-3);
        }
        field4396++;
        if (this.field4389 != null) {
            this.field4389.close();
            this.field4389 = null;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method2001(int arg0) {
        field4388++;
        if (arg0 != -23220) {
            field4397 = null;
        }
        return this.field4391;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZI[B)V")
    public final void method2002(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        field4390++;
        if (!arg1) {
            return;
        }
        if (((long) arg0 + this.field4394) > this.field4383) {
            this.field4389.seek(this.field4383);
            this.field4389.write(1);
            throw new EOFException();
        } else {
            this.field4389.write(arg3, arg2, arg0);
            this.field4394 += arg0;
        }
    }

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)V")
    public static void method2003(int arg0) {
        field4397 = null;
        if (arg0 != 0) {
            method2003(40);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III[B)I")
    public final int method2004(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field4386++;
        if (arg0 != -20708) {
            field4384 = 7;
        }
        int var5 = this.field4389.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field4394 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class322(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field4389 = new RandomAccessFile(arg0, arg1);
        this.field4394 = 0L;
        this.field4383 = arg2;
        this.field4391 = arg0;
        int var5 = this.field4389.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4389.seek(0L);
            this.field4389.write(var5);
        }
        this.field4389.seek(0L);
    }
}
