import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class479 {

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6368;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "J")
    private long field6370;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "J")
    private long field6375;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "Ljava/io/File;")
    private File field6362;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public final void method2603(byte arg0) throws IOException {
        if (arg0 >= -126) {
            return;
        }
        if (this.field6368 != null) {
            this.field6368.close();
            this.field6368 = null;
        }
        field6373++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)J")
    public final long method2604(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field6362 = null;
        }
        field6367++;
        return this.field6368.length();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI[B)V")
    public final void method2605(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field6364++;
        if (this.field6375 < (long) arg2 + this.field6370) {
            this.field6368.seek(this.field6375);
            this.field6368.write(1);
            throw new EOFException();
        } else {
            this.field6368.write(arg3, arg0, arg2);
            this.field6370 += arg2;
            int var5 = -108 / ((arg1 + 74) / 42);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method2606(byte arg0) {
        field6363++;
        return arg0 >= -112 ? null : this.field6362;
    }

    @OriginalMember(owner = "client!cu", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6374++;
        if (this.field6368 != null) {
            System.out.println("Warning! fileondisk " + this.field6362 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2603((byte) -128);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I[BII)I")
    public final int method2607(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field6366++;
        int var5 = this.field6368.read(arg1, arg0, arg2);
        if (arg3 != 3) {
            this.field6368 = null;
        }
        if (var5 > 0) {
            this.field6370 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(B)V")
    public static final void method2608(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class451.field5788[var1] = false;
        }
        field6365++;
        class196.field2471 = -1;
        class306.field3890 = -1;
        class465.field5928 = -1;
        class510.field6934 = 0;
        class697.field9866 = -1;
        class296.field3661 = 1;
        if (arg0 != -110) {
            method2610(-94, -127, (byte) -72);
        }
        class389.field4906 = 0;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(JI)V")
    public final void method2609(long arg0, int arg1) throws IOException {
        field6371++;
        this.field6368.seek(arg0);
        this.field6370 = arg0;
        if (arg1 != -1) {
            method2610(-31, -89, (byte) 71);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIB)I")
    public static final int method2610(int arg0, int arg1, byte arg2) {
        field6369++;
        if (arg2 > -126) {
            field6372 = -72;
        }
        return arg1 == 1 || arg1 == 3 ? class442.field5601[arg0 & 0x3] : class386.field4852[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class479(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field6368 = new RandomAccessFile(arg0, arg1);
        this.field6370 = 0L;
        this.field6375 = arg2;
        this.field6362 = arg0;
        int var5 = this.field6368.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field6368.seek(0L);
            this.field6368.write(var5);
        }
        this.field6368.seek(0L);
    }
}
