import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class15 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "J")
    private long field218;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
    private long field221;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Ljava/io/File;")
    private File field220;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field219;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III[B)I")
    public final int method111(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 > -63) {
            return -66;
        }
        int var5 = this.field219.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field218 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BJ)V")
    public final void method112(byte arg0, long arg1) throws IOException {
        int var4 = -17 % ((81 - arg0) / 40);
        this.field219.seek(arg1);
        this.field218 = arg1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BBII)V")
    public final void method113(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 < 91) {
            return;
        }
        if (this.field221 < (long) arg3 + this.field218) {
            this.field219.seek(this.field221 + 1L);
            this.field219.write(1);
            throw new EOFException();
        } else {
            this.field219.write(arg0, arg2, arg3);
            this.field218 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method114(byte arg0) {
        int var2 = 73 % ((39 - arg0) / 61);
        return this.field220;
    }

    @OriginalMember(owner = "client!ud", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field219 != null) {
            System.out.println("Warning! fileondisk " + this.field220 + " not closed correctly using close(). Auto-closing instead. ");
            this.method116(10388);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)J")
    public final long method115(byte arg0) throws IOException {
        if (arg0 <= 126) {
            this.method114((byte) -15);
        }
        return this.field219.length();
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method116(int arg0) throws IOException {
        if (this.field219 != null) {
            this.field219.close();
            this.field219 = null;
        }
        if (arg0 != 10388) {
            this.field219 = null;
        }
    }
}
