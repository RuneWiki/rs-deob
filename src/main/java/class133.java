import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class133 {

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2016;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "Ljava/io/File;")
    private File field2017;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "J")
    private long field2015;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "J")
    private long field2018;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "([BBII)I", line = 5)
    public final int method874(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2016.read(arg0, arg2, arg3);
        if (arg1 != 70) {
            this.method876((byte) -53);
        }
        if (var5 > 0) {
            this.field2018 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sk", name = "finalize", descriptor = "()V", line = 19)
    protected final void finalize() throws Throwable {
        if (this.field2016 != null) {
            System.out.println("Warning! fileondisk " + this.field2017 + " not closed correctly using close(). Auto-closing instead. ");
            this.method879(13943);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)J", line = 32)
    public final long method875(byte arg0) throws IOException {
        if (arg0 != 29) {
            this.method876((byte) 110);
        }
        return this.field2016.length();
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)Ljava/io/File;", line = 44)
    public final File method876(byte arg0) {
        return arg0 == 15 ? this.field2017 : (File) null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB[BI)V", line = 54)
    public final void method877(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 >= -25) {
            return;
        }
        if (this.field2015 < ((long) arg0 + this.field2018)) {
            this.field2016.seek(this.field2015 + 1L);
            this.field2016.write(1);
            throw new EOFException();
        } else {
            this.field2016.write(arg2, arg3, arg0);
            this.field2018 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BJ)V", line = 73)
    public final void method878(byte arg0, long arg1) throws IOException {
        int var4 = -51 / ((-arg0 - 67) / 51);
        this.field2016.seek(arg1);
        this.field2018 = arg1;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 84)
    public final void method879(int arg0) throws IOException {
        if (arg0 != 13943) {
            this.field2015 = -108L;
        }
        if (this.field2016 != null) {
            this.field2016.close();
            this.field2016 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 100)
    public class133(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2016 = new RandomAccessFile(arg0, arg1);
        this.field2017 = arg0;
        this.field2015 = arg2;
        this.field2018 = 0L;
        int var5 = this.field2016.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2016.seek(0L);
            this.field2016.write(var5);
        }
        this.field2016.seek(0L);
    }
}
