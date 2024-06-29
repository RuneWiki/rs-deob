import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2357;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "J")
    private long field2356;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/io/File;")
    private File field2358;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "J")
    private long field2359;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method779(byte arg0) {
        if (arg0 != -98) {
            this.field2358 = null;
        }
        return this.field2358;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)J")
    public final long method780(byte arg0) throws IOException {
        if (arg0 != 119) {
            this.method779((byte) -97);
        }
        return this.field2357.length();
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BB)I")
    public final int method781(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (arg3 > -97) {
            this.field2356 = 96L;
        }
        int var5 = this.field2357.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field2359 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V")
    public final void method782(byte arg0) throws IOException {
        int var2 = 77 / ((-arg0 - 34) / 48);
        if (this.field2357 != null) {
            this.field2357.close();
            this.field2357 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(JB)V")
    public final void method783(long arg0, byte arg1) throws IOException {
        this.field2357.seek(arg0);
        this.field2359 = arg0;
        if (arg1 != -104) {
            this.method779((byte) 112);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(II[BI)V")
    public final void method784(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2356 < (long) arg3 + this.field2359) {
            this.field2357.seek(this.field2356 + 1L);
            this.field2357.write(1);
            throw new EOFException();
        }
        if (arg1 > -87) {
            this.field2356 = -63L;
        }
        this.field2357.write(arg2, arg0, arg3);
        this.field2359 += arg3;
    }

    @OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2357 != null) {
            System.out.println("Warning! fileondisk " + this.field2358 + " not closed correctly using close(). Auto-closing instead. ");
            this.method782((byte) 27);
        }
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class102(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2357 = new RandomAccessFile(arg0, arg1);
        this.field2356 = arg2;
        this.field2358 = arg0;
        this.field2359 = 0L;
        int var5 = this.field2357.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2357.seek(0L);
            this.field2357.write(var5);
        }
        this.field2357.seek(0L);
    }
}
