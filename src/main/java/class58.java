import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field980;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "J")
    private long field981;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "J")
    private long field979;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljava/io/File;")
    private File field982;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 4)
    public final void method465(int arg0) throws IOException {
        if (arg0 == -1 && this.field980 != null) {
            this.field980.close();
            this.field980 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "finalize", descriptor = "()V", line = 21)
    protected final void finalize() throws Throwable {
        if (this.field980 != null) {
            System.out.println("Warning! fileondisk " + this.field982 + " not closed correctly using close(). Auto-closing instead. ");
            this.method465(-1);
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)J", line = 35)
    public final long method466(int arg0) throws IOException {
        return arg0 <= 44 ? 93L : this.field980.length();
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)Ljava/io/File;", line = 47)
    public final File method467(boolean arg0) {
        if (arg0) {
            this.method467(true);
        }
        return this.field982;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V", line = 57)
    public final void method468(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 <= 124) {
            this.method467(false);
        }
        if (this.field979 >= ((long) arg2 + this.field981)) {
            this.field980.write(arg3, arg0, arg2);
            this.field981 += (long) arg2;
        } else {
            this.field980.seek(this.field979 + 1L);
            this.field980.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)V", line = 77)
    public final void method469(long arg0, int arg1) throws IOException {
        this.field980.seek(arg0);
        if (arg1 != 0) {
            this.field981 = 121L;
        }
        this.field981 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 86)
    public class58(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field980 = new RandomAccessFile(arg0, arg1);
        this.field981 = 0L;
        this.field979 = arg2;
        this.field982 = arg0;
        int var5 = this.field980.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field980.seek(0L);
            this.field980.write(var5);
        }
        this.field980.seek(0L);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[BB)I", line = 119)
    public final int method470(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field980.read(arg2, arg0, arg1);
        int var6 = 26 / ((arg3 - 48) / 47);
        if (var5 > 0) {
            this.field981 += (long) var5;
        }
        return var5;
    }
}
