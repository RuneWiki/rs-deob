import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class309 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
    private long field4803;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "J")
    private long field4806;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/io/File;")
    private File field4805;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4804;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIBI)I", line = 5)
    public final int method2133(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 <= 95) {
            return -125;
        }
        int var5 = this.field4804.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field4803 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(JI)V", line = 22)
    public final void method2134(long arg0, int arg1) throws IOException {
        this.field4804.seek(arg0);
        if (arg1 != -1) {
            this.method2137(-68);
        }
        this.field4803 = arg0;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 36)
    public final void method2135(int arg0) throws IOException {
        if (this.field4804 != null) {
            this.field4804.close();
            this.field4804 = null;
        }
        if (arg0 < 102) {
            this.field4804 = (RandomAccessFile) null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B[BII)V", line = 51)
    public final void method2136(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field4803 <= this.field4806) {
            this.field4804.write(arg1, arg3, arg2);
            this.field4803 += (long) arg2;
            int var5 = -23 % ((arg0 + 9) / 36);
        } else {
            this.field4804.seek(this.field4806);
            this.field4804.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Ljava/io/File;", line = 69)
    public final File method2137(int arg0) {
        if (arg0 != 0) {
            this.field4804 = (RandomAccessFile) null;
        }
        return this.field4805;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J", line = 79)
    public final long method2138(byte arg0) throws IOException {
        return arg0 == 108 ? this.field4804.length() : -111L;
    }

    @OriginalMember(owner = "client!ee", name = "finalize", descriptor = "()V", line = 89)
    protected final void finalize() throws Throwable {
        if (this.field4804 != null) {
            System.out.println("Warning! fileondisk " + this.field4805 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2135(112);
        }
    }
}
