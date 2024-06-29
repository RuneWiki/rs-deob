import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class120 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "J")
    private long field1624;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "J")
    private long field1626;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Ljava/io/File;")
    private File field1625;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1623;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 5)
    public final void method870(int arg0) throws IOException {
        if (this.field1623 != null) {
            this.field1623.close();
            this.field1623 = null;
        }
        if (arg0 != 0) {
            this.field1624 = -47L;
        }
    }

    @OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V", line = 20)
    protected final void finalize() throws Throwable {
        if (this.field1623 != null) {
            System.out.println("Warning! fileondisk " + this.field1625 + " not closed correctly using close(). Auto-closing instead. ");
            this.method870(0);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(BII[B)V", line = 35)
    public final void method871(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field1624 < (long) arg2 + this.field1626) {
            this.field1623.seek(this.field1624);
            this.field1623.write(1);
            throw new EOFException();
        } else {
            this.field1623.write(arg3, arg1, arg2);
            if (arg0 == -69) {
                this.field1626 += (long) arg2;
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)J", line = 54)
    public final long method872(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method873(-30);
        }
        return this.field1623.length();
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)Ljava/io/File;", line = 64)
    public final File method873(int arg0) {
        if (arg0 != -11680) {
            this.method873(-80);
        }
        return this.field1625;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BB)I", line = 76)
    public final int method874(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field1623.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field1626 += (long) var5;
        }
        if (arg3 > -113) {
            this.field1625 = (File) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(JZ)V", line = 90)
    public final void method875(long arg0, boolean arg1) throws IOException {
        this.field1623.seek(arg0);
        this.field1626 = arg0;
        if (arg1) {
            this.method873(-125);
        }
    }
}
