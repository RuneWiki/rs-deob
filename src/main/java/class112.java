import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class112 {

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1375;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "Ljava/io/File;")
    private File field1376;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "J")
    private long field1385;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "J")
    private long field1388;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field1379 = 0;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field1386 = 0;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field1374;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field1380;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 6)
    public final void method756(int arg0) throws IOException {
        if (this.field1375 != null) {
            this.field1375.close();
            this.field1375 = null;
        }
        field1377++;
        if (arg0 != -1) {
            this.field1375 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)J", line = 26)
    public final long method757(int arg0) throws IOException {
        if (arg0 != -1) {
            method758(52);
        }
        field1382++;
        return this.field1375.length();
    }

    @OriginalMember(owner = "client!is", name = "finalize", descriptor = "()V", line = 37)
    protected final void finalize() throws Throwable {
        field1380++;
        if (this.field1375 != null) {
            System.out.println("Warning! fileondisk " + this.field1376 + " not closed correctly using close(). Auto-closing instead. ");
            this.method756(-1);
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V", line = 52)
    public static final void method758(int arg0) {
        class718.field10118 = -1;
        class641.field8860 = null;
        class593.field8260 = null;
        class422.field5998 = null;
        if (arg0 != -1) {
            field1383 = 17;
        }
        class41.field583 = -1;
        class87.field1109 = null;
        class709.field9973 = -1;
        class128.field1554 = null;
        class297.field3856 = null;
        class580.field8062 = -1;
        class351.field4604 = null;
        field1374++;
        class220.field2793.method3381(arg0 + 3);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I[BII)V", line = 74)
    public final void method759(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1384++;
        if (this.field1388 < ((long) arg3 + this.field1385)) {
            this.field1375.seek(this.field1388);
            this.field1375.write(1);
            throw new EOFException();
        }
        this.field1375.write(arg1, arg2, arg3);
        this.field1385 += arg3;
        if (arg0 != -1) {
            this.method760(-113);
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)Ljava/io/File;", line = 96)
    public final File method760(int arg0) {
        if (arg0 != 0) {
            this.method760(-15);
        }
        field1378++;
        return this.field1376;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IBI[B)I", line = 109)
    public final int method761(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field1381++;
        int var5 = this.field1375.read(arg3, arg2, arg0);
        if (arg1 <= 71) {
            method758(-8);
        }
        if (var5 > 0) {
            this.field1385 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IJ)V", line = 130)
    public final void method762(int arg0, long arg1) throws IOException {
        this.field1375.seek(arg1);
        if (arg0 >= 36) {
            field1387++;
            this.field1385 = arg1;
        }
    }

    @OriginalMember(owner = "client!is", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 152)
    public class112(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field1375 = new RandomAccessFile(arg0, arg1);
        this.field1376 = arg0;
        this.field1385 = 0L;
        this.field1388 = arg2;
        int var5 = this.field1375.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1375.seek(0L);
            this.field1375.write(var5);
        }
        this.field1375.seek(0L);
    }
}
