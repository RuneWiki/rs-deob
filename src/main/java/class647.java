import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class647 {

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field9156;

    @OriginalMember(owner = "client!ip", name = "e", descriptor = "Ljava/io/File;")
    private File field9153;

    @OriginalMember(owner = "client!ip", name = "k", descriptor = "J")
    private long field9159;

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "J")
    private long field9161;

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "Lpr;")
    public static class407 field9150 = new class407(12, 5);

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "I")
    public static int field9164 = -1;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "I")
    public static int field9149;

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "I")
    public static int field9151;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "I")
    public static int field9152;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    public static int field9154;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "I")
    public static int field9155;

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!ip", name = "j", descriptor = "I")
    public static int field9158;

    @OriginalMember(owner = "client!ip", name = "l", descriptor = "I")
    public static int field9160;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z[BII)I", line = 3)
    public final int method3630(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field9155++;
        int var5 = this.field9156.read(arg1, arg3, arg2);
        if (arg0) {
            this.field9153 = null;
        }
        if (var5 > 0) {
            this.field9161 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Loa;Z)V", line = 23)
    public static final void method3631(class635 arg0, boolean arg1) {
        class431.field5697 = new class145[class289.field3719.length];
        field9151++;
        if (!arg1) {
            field9150 = null;
        }
        for (int var2 = 0; var2 < class289.field3719.length; var2++) {
            int var3 = class289.field3719[var2];
            class645 var4 = class103.method624(class455.field6328, var3, arg1);
            class195 var5 = arg0.method349(var4, class563.method3184(class359.field4705, var3), true);
            class431.field5697[var2] = new class145(var5, var4);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)J", line = 54)
    public final long method3632(byte arg0) throws IOException {
        if (arg0 != 47) {
            this.field9159 = -4L;
        }
        field9154++;
        return this.field9156.length();
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V", line = 66)
    public final void method3633(int arg0) throws IOException {
        field9160++;
        if (arg0 != 0) {
            this.field9156 = null;
        }
        if (this.field9156 != null) {
            this.field9156.close();
            this.field9156 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(JI)V", line = 84)
    public final void method3634(long arg0, int arg1) throws IOException {
        this.field9156.seek(arg0);
        field9152++;
        this.field9161 = arg0;
        if (arg1 > -57) {
            method3638(-28);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(II[BI)V", line = 96)
    public final void method3635(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9163++;
        if (arg1 != 1) {
            return;
        }
        if (this.field9159 < ((long) arg0 + this.field9161)) {
            this.field9156.seek(this.field9159);
            this.field9156.write(1);
            throw new EOFException();
        } else {
            this.field9156.write(arg2, arg3, arg0);
            this.field9161 += arg0;
        }
    }

    @OriginalMember(owner = "client!ip", name = "finalize", descriptor = "()V", line = 120)
    protected final void finalize() throws Throwable {
        field9149++;
        if (this.field9156 != null) {
            System.out.println("Warning! fileondisk " + this.field9153 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3633(0);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)Ljava/io/File;", line = 136)
    public final File method3636(byte arg0) {
        if (arg0 != 41) {
            method3637(-94);
        }
        field9158++;
        return this.field9153;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 150)
    public class647(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field9156 = new RandomAccessFile(arg0, arg1);
        this.field9153 = arg0;
        this.field9159 = arg2;
        this.field9161 = 0L;
        int var5 = this.field9156.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field9156.seek(0L);
            this.field9156.write(var5);
        }
        this.field9156.seek(0L);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V", line = 181)
    public static void method3637(int arg0) {
        if (arg0 != 9392) {
            field9150 = null;
        }
        field9150 = null;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)Lgi;", line = 196)
    public static final class620 method3638(int arg0) {
        class559.field7966 = 0;
        if (arg0 != -30828) {
            field9150 = null;
        }
        field9157++;
        return class607.method3384(true);
    }
}
