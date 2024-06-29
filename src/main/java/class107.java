import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class107 {

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2703;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "J")
    private long field2704;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "J")
    private long field2702;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "Ljava/io/File;")
    private File field2701;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)J", line = 4)
    public final long method876(boolean arg0) throws IOException {
        if (!arg0) {
            this.method879((byte) 28);
        }
        return this.field2703.length();
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)V", line = 16)
    public final void method877(boolean arg0) throws IOException {
        this.field2703.close();
        this.field2703 = null;
        if (!arg0) {
            this.method879((byte) -51);
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BIBI)I", line = 27)
    public final int method878(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field2703.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field2704 += var5;
        }
        return arg2 < 45 ? -112 : var5;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Ljava/io/File;", line = 43)
    public final File method879(byte arg0) {
        return arg0 == 17 ? this.field2701 : null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(BJ)V", line = 54)
    public final void method880(byte arg0, long arg1) throws IOException {
        this.field2703.seek(arg1);
        int var4 = -97 % ((arg0 - 34) / 55);
        this.field2704 = arg1;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[BI)V", line = 65)
    public final void method881(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 32397) {
            this.field2702 = -70L;
        }
        if (this.field2702 < (long) arg3 + this.field2704) {
            this.field2703.seek(this.field2702 + 1L);
            this.field2703.write(1);
            throw new EOFException();
        } else {
            this.field2703.write(arg2, arg0, arg3);
            this.field2704 += arg3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class107(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2703 = new RandomAccessFile(arg0, arg1);
        this.field2704 = 0L;
        this.field2702 = arg2;
        this.field2701 = arg0;
    }
}
