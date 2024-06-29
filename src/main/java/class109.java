import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class109 {

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2470;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
    private long field2469;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
    private long field2471;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "Ljava/io/File;")
    private File field2472;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)J")
    public final long method843(byte arg0) throws IOException {
        if (arg0 >= -24) {
            this.method845((byte) 21);
        }
        return this.field2470.length();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method844(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field2471 = 40L;
        }
        if (this.field2470 != null) {
            this.field2470.close();
            this.field2470 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method845(byte arg0) {
        if (arg0 >= -72) {
            this.method845((byte) -102);
        }
        return this.field2472;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)V")
    public final void method846(long arg0, int arg1) throws IOException {
        this.field2470.seek(arg0);
        if (arg1 == 12791) {
            this.field2471 = arg0;
        }
    }

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2470 != null) {
            System.out.println("Warning! fileondisk " + this.field2472 + " not closed correctly using close(). Auto-closing instead. ");
            this.method844(0);
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([BIZI)V")
    public final void method847(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if ((long) arg1 + this.field2471 > this.field2469) {
            this.field2470.seek(this.field2469 + 1L);
            this.field2470.write(1);
            throw new EOFException();
        } else if (!arg2) {
            this.field2470.write(arg0, arg3, arg1);
            this.field2471 += arg1;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B[BII)I")
    public final int method848(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != -26) {
            return 53;
        }
        int var5 = this.field2470.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field2471 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class109(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2470 = new RandomAccessFile(arg0, arg1);
        this.field2469 = arg2;
        this.field2471 = 0L;
        this.field2472 = arg0;
        int var5 = this.field2470.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2470.seek(0L);
            this.field2470.write(var5);
        }
        this.field2470.seek(0L);
    }
}
