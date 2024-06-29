import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class71 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "J")
    private long field1064;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "J")
    private long field1067;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Ljava/io/File;")
    private File field1065;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1066;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(III[B)V", line = 3)
    public final void method408(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg2 >= -91) {
            this.method412(true);
        }
        if ((long) arg0 + this.field1064 > this.field1067) {
            this.field1066.seek(this.field1067);
            this.field1066.write(1);
            throw new EOFException();
        } else {
            this.field1066.write(arg3, arg1, arg0);
            this.field1064 += arg0;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)J", line = 22)
    public final long method409(byte arg0) throws IOException {
        return arg0 > -57 ? -59L : this.field1066.length();
    }

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V", line = 33)
    protected final void finalize() throws Throwable {
        if (this.field1066 != null) {
            System.out.println("Warning! fileondisk " + this.field1065 + " not closed correctly using close(). Auto-closing instead. ");
            this.method410(-117);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 46)
    public final void method410(int arg0) throws IOException {
        if (this.field1066 != null) {
            this.field1066.close();
            this.field1066 = null;
        }
        if (arg0 > -114) {
            this.field1067 = -118L;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IBI[B)I", line = 64)
    public final int method411(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 >= -82) {
            return -74;
        }
        int var5 = this.field1066.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field1064 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Ljava/io/File;", line = 81)
    public final File method412(boolean arg0) {
        return arg0 ? null : this.field1065;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IJ)V", line = 94)
    public final void method413(int arg0, long arg1) throws IOException {
        this.field1066.seek(arg1);
        if (arg0 != -1) {
            this.field1064 = 8L;
        }
        this.field1064 = arg1;
    }
}
