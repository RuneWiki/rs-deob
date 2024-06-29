import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class86 {

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "J")
    private long field1020;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "J")
    private long field1023;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "Ljava/io/File;")
    private File field1022;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1021;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method469(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg1 + this.field1023) > this.field1020) {
            this.field1021.seek(this.field1020);
            this.field1021.write(1);
            throw new EOFException();
        }
        this.field1021.write(arg3, arg0, arg1);
        this.field1023 += arg1;
        if (arg2 != 23609) {
            this.field1023 = 10L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)Ljava/io/File;", line = 24)
    public final File method470(int arg0) {
        return arg0 == -1 ? this.field1022 : null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III[B)I", line = 36)
    public final int method471(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1021.read(arg3, arg2, arg1);
        if (arg0 < var5) {
            this.field1023 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        if (this.field1021 != null) {
            System.out.println("Warning! fileondisk " + this.field1022 + " not closed correctly using close(). Auto-closing instead. ");
            this.method472(-29827);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 62)
    public final void method472(int arg0) throws IOException {
        if (this.field1021 != null) {
            this.field1021.close();
            this.field1021 = null;
        }
        if (arg0 != -29827) {
            this.field1023 = 96L;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)J", line = 78)
    public final long method473(byte arg0) throws IOException {
        if (arg0 != 86) {
            this.method470(-17);
        }
        return this.field1021.length();
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IJ)V", line = 88)
    public final void method474(int arg0, long arg1) throws IOException {
        if (arg0 == -21004) {
            this.field1021.seek(arg1);
            this.field1023 = arg1;
        }
    }
}
