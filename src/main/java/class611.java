import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class611 {

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field8481;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljava/io/File;")
    private File field8482;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "J")
    private long field8484;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "J")
    private long field8477;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Z")
    public static boolean field8479 = true;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field8485 = new Hashtable();

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field8474;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field8475;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field8476;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field8478;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field8480;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "[[B")
    public static byte[][] field8486;

    @OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V", line = 9)
    protected final void finalize() throws Throwable {
        if (this.field8481 != null) {
            System.out.println("Warning! fileondisk " + this.field8482 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3390(0);
        }
        field8476++;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(JB)V", line = 25)
    public final void method3384(long arg0, byte arg1) throws IOException {
        field8473++;
        if (arg1 != -59) {
            this.field8477 = 44L;
        }
        this.field8481.seek(arg0);
        this.field8477 = arg0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 41)
    public static void method3385(byte arg0) {
        field8485 = null;
        int var1 = 43 / ((arg0 - 24) / 52);
        field8486 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III[B)I", line = 51)
    public final int method3386(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field8483++;
        int var5 = this.field8481.read(arg3, arg2, arg0);
        if (var5 > arg1) {
            this.field8477 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)J", line = 65)
    public final long method3387(int arg0) throws IOException {
        field8480++;
        if (arg0 >= -78) {
            this.method3388(35);
        }
        return this.field8481.length();
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Ljava/io/File;", line = 76)
    public final File method3388(int arg0) {
        if (arg0 != 0) {
            this.field8477 = 71L;
        }
        field8478++;
        return this.field8482;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II[BI)V", line = 90)
    public final void method3389(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field8474++;
        int var5 = -56 / (arg0 / 32);
        if (this.field8484 < ((long) arg3 + this.field8477)) {
            this.field8481.seek(this.field8484);
            this.field8481.write(1);
            throw new EOFException();
        } else {
            this.field8481.write(arg2, arg1, arg3);
            this.field8477 += arg3;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V", line = 110)
    public final void method3390(int arg0) throws IOException {
        field8475++;
        if (arg0 != 0) {
            this.field8477 = -34L;
        }
        if (this.field8481 != null) {
            this.field8481.close();
            this.field8481 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 127)
    public class611(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field8481 = new RandomAccessFile(arg0, arg1);
        this.field8482 = arg0;
        this.field8484 = arg2;
        this.field8477 = 0L;
        int var5 = this.field8481.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field8481.seek(0L);
            this.field8481.write(var5);
        }
        this.field8481.seek(0L);
    }
}
