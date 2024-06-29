import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class428 {

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5946;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "J")
    private long field5941;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "J")
    private long field5948;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Ljava/io/File;")
    private File field5947;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Ljv;")
    public static class606 field5943 = new class606(3, 1);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "Ltd;")
    public static class691 field5951 = new class691();

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[S")
    public static short[] field5944;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 4)
    public static void method2462(int arg0) {
        field5943 = null;
        field5951 = null;
        if (arg0 != -9321) {
            field5949 = -24;
        }
        field5944 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(JI)V", line = 17)
    public final void method2463(long arg0, int arg1) throws IOException {
        field5935++;
        if (arg1 == 0) {
            this.field5946.seek(arg0);
            this.field5948 = arg0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)Laq;", line = 34)
    public static final class108 method2464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5942++;
        long var7 = (long) arg2 * 76724863L ^ (long) arg3 * 475427L ^ (long) arg0 * 67481L ^ (long) arg4 * 97549L ^ (long) arg5 * 986053L ^ (long) arg6 * 32147369L;
        class108 var9 = (class108) class175.field2203.method3134(var7, -79);
        if (var9 != null) {
            return var9;
        }
        class108 var10 = class606.field8280.method1954(arg0, arg4, arg3, arg5, arg6, arg2);
        if (arg1 != 0) {
            method2462(67);
        }
        class175.field2203.method3130(var7, true, var10);
        return var10;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BIII)V", line = 57)
    public final void method2465(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field5937++;
        if (arg2 != -20626) {
            this.field5948 = 94L;
        }
        if ((long) arg3 + this.field5948 > this.field5941) {
            this.field5946.seek(this.field5941);
            this.field5946.write(1);
            throw new EOFException();
        } else {
            this.field5946.write(arg0, arg1, arg3);
            this.field5948 += arg3;
        }
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 77)
    protected final void finalize() throws Throwable {
        field5945++;
        if (this.field5946 != null) {
            System.out.println("Warning! fileondisk " + this.field5947 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2467((byte) 106);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([BBII)I", line = 91)
    public final int method2466(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field5936++;
        int var5 = this.field5946.read(arg0, arg2, arg3);
        if (arg1 > -5) {
            field5944 = null;
        }
        if (var5 > 0) {
            this.field5948 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 109)
    public final void method2467(byte arg0) throws IOException {
        if (this.field5946 != null) {
            this.field5946.close();
            this.field5946 = null;
        }
        if (arg0 == 106) {
            field5938++;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)J", line = 131)
    public final long method2468(int arg0) throws IOException {
        field5939++;
        return arg0 == 0 ? this.field5946.length() : -75L;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 145)
    public class428(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field5946 = new RandomAccessFile(arg0, arg1);
        this.field5941 = arg2;
        this.field5948 = 0L;
        this.field5947 = arg0;
        int var5 = this.field5946.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5946.seek(0L);
            this.field5946.write(var5);
        }
        this.field5946.seek(0L);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)Ljava/io/File;", line = 179)
    public final File method2469(byte arg0) {
        if (arg0 != 26) {
            this.field5948 = 49L;
        }
        field5940++;
        return this.field5947;
    }
}
