import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class573 {

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7851;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "J")
    private long field7854;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/io/File;")
    private File field7849;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "J")
    private long field7857;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[I")
    public static int[] field7860 = new int[1];

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "S")
    public static short field7858 = 32767;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field7847;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field7852;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field7853;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field7855;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field7856;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IJ)V")
    public final void method3318(int arg0, long arg1) throws IOException {
        field7862++;
        this.field7851.seek(arg1);
        if (arg0 != -2) {
            field7858 = 117;
        }
        this.field7854 = arg1;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
    public final void method3319(int arg0) throws IOException {
        if (this.field7851 != null) {
            this.field7851.close();
            this.field7851 = null;
        }
        field7847++;
        if (arg0 <= 121) {
            field7852 = 9;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method3320(byte arg0) {
        field7860 = null;
        if (arg0 != 100) {
            method3325(-13);
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)J")
    public final long method3321(int arg0) throws IOException {
        if (arg0 != 30971) {
            method3325(-90);
        }
        field7856++;
        return this.field7851.length();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[BI)I")
    public final int method3322(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field7855++;
        int var5 = this.field7851.read(arg2, arg0, arg1);
        if (arg3 == -11433) {
            if (var5 > 0) {
                this.field7854 += var5;
            }
            return var5;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I[BZI)V")
    public final void method3323(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field7853++;
        if (((long) arg0 + this.field7854) > this.field7857) {
            this.field7851.seek(this.field7857);
            this.field7851.write(1);
            throw new EOFException();
        }
        this.field7851.write(arg1, arg3, arg0);
        this.field7854 += arg0;
        if (!arg2) {
            this.field7854 = 88L;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method3324(byte arg0) {
        if (arg0 != 56) {
            this.field7857 = -80L;
        }
        field7848++;
        return this.field7849;
    }

    @OriginalMember(owner = "client!ea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field7861++;
        if (this.field7851 != null) {
            System.out.println("Warning! fileondisk " + this.field7849 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3319(127);
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static final void method3325(int arg0) {
        if (class635.field8667 <= 1) {
            class118.field1503.method4295(class118.field1503.field10638, 2, false);
        } else {
            class118.field1503.method4295(class118.field1503.field10638, 4, false);
        }
        field7850++;
        if (arg0 != -1) {
            method3320((byte) -25);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZIII)Luea;")
    public static final class336 method3326(boolean arg0, int arg1, int arg2, int arg3) {
        field7859++;
        class336 var4 = null;
        if (!arg0) {
            return null;
        }
        if (arg2 == 0) {
            var4 = class512.method3076(class176.field2184, class591.field8030, (byte) 98);
            class737.field10283++;
        }
        if (arg2 == 1) {
            class591.field8033++;
            var4 = class512.method3076(class508.field7226, class591.field8030, (byte) 111);
        }
        var4.field4150.method2420(2760, class348.field4350.method216(-105, 82) ? 1 : 0);
        var4.field4150.method2407(class620.field8435 + arg3, (byte) -112);
        var4.field4150.method2369(-18090, class632.field8626 + arg1);
        class687.field9376 = arg3;
        class327.field4052 = false;
        class754.field10460 = arg1;
        class123.method955((byte) 117);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class573(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field7851 = new RandomAccessFile(arg0, arg1);
        this.field7854 = 0L;
        this.field7849 = arg0;
        this.field7857 = arg2;
        int var5 = this.field7851.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field7851.seek(0L);
            this.field7851.write(var5);
        }
        this.field7851.seek(0L);
    }
}
