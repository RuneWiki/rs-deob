import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class126 {

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2131;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Ljava/io/File;")
    private File field2130;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "J")
    private long field2129;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "J")
    private long field2128;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)J")
    public final long method935(boolean arg0) throws IOException {
        if (arg0) {
            this.method939(61);
        }
        return this.field2131.length();
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[B)I")
    public final int method936(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 < 43) {
            return 72;
        }
        int var5 = this.field2131.read(arg3, arg0, arg1);
        if (var5 > 0) {
            this.field2129 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method937(int arg0) throws IOException {
        if (this.field2131 != null) {
            this.field2131.close();
            this.field2131 = null;
        }
        if (arg0 != 0) {
            this.method939(9);
        }
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2131 != null) {
            System.out.println("Warning! fileondisk " + this.field2130 + " not closed correctly using close(). Auto-closing instead. ");
            this.method937(0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(JI)V")
    public final void method938(long arg0, int arg1) throws IOException {
        this.field2131.seek(arg0);
        this.field2129 = arg0;
        if (arg1 <= 10) {
            this.method939(1);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method939(int arg0) {
        if (arg0 != 1) {
            this.method939(84);
        }
        return this.field2130;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class126(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2131 = new RandomAccessFile(arg0, arg1);
        this.field2130 = arg0;
        this.field2129 = 0L;
        this.field2128 = arg2;
        int var5 = this.field2131.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2131.seek(0L);
            this.field2131.write(var5);
        }
        this.field2131.seek(0L);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BII[B)V")
    public final void method940(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg2 + this.field2129) > this.field2128) {
            this.field2131.seek(this.field2128 + 1L);
            this.field2131.write(1);
            throw new EOFException();
        }
        this.field2131.write(arg3, arg1, arg2);
        this.field2129 += (long) arg2;
        if (arg0 < 68) {
            this.method939(-25);
        }
    }
}
