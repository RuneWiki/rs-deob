import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class95 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "J")
    private long field1508;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "J")
    private long field1511;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Ljava/io/File;")
    private File field1509;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1510;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Z)V", line = 4)
    public final void method800(boolean arg0) throws IOException {
        if (this.field1510 != null) {
            this.field1510.close();
            this.field1510 = null;
        }
        if (arg0) {
            this.method804(41);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IBI[B)I", line = 20)
    public final int method801(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = 95 / ((arg1 - 43) / 45);
        int var6 = this.field1510.read(arg3, arg2, arg0);
        if (var6 > 0) {
            this.field1511 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!km", name = "finalize", descriptor = "()V", line = 34)
    protected final void finalize() throws Throwable {
        if (this.field1510 != null) {
            System.out.println("Warning! fileondisk " + this.field1509 + " not closed correctly using close(). Auto-closing instead. ");
            this.method800(false);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IJ)V", line = 47)
    public final void method802(int arg0, long arg1) throws IOException {
        this.field1510.seek(arg1);
        if (arg0 < 8) {
            this.method804(113);
        }
        this.field1511 = arg1;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)J", line = 59)
    public final long method803(byte arg0) throws IOException {
        if (arg0 != 78) {
            this.method804(-122);
        }
        return this.field1510.length();
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)Ljava/io/File;", line = 70)
    public final File method804(int arg0) {
        if (arg0 != 6387) {
            this.field1511 = 73L;
        }
        return this.field1509;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([BZII)V", line = 81)
    public final void method805(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        if (this.field1508 < (long) arg3 + this.field1511) {
            this.field1510.seek(this.field1508);
            this.field1510.write(1);
            throw new EOFException();
        }
        this.field1510.write(arg0, arg2, arg3);
        if (!arg1) {
            this.method804(31);
        }
        this.field1511 += arg3;
    }
}
