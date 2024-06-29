import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class355 {

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4976;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "J")
    private long field4968;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "J")
    private long field4978;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Ljava/io/File;")
    private File field4970;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[F")
    public static float[] field4975 = new float[16384];

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[F")
    public static float[] field4977 = new float[16384];

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field4974;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
    public static int[] field4981;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[Lkm;")
    public static class181[] field4980;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4977[var2] = (float) Math.sin((double) var2 * var0);
            field4975[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J", line = 4)
    public final long method2144(int arg0) throws IOException {
        field4972++;
        int var2 = -63 % ((arg0 - 8) / 48);
        return this.field4976.length();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZB)I", line = 15)
    public static final int method2145(int arg0, int arg1, boolean arg2, byte arg3) {
        field4965++;
        class569 var4 = class198.method1392(arg1, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return -1;
        } else {
            int var5 = 1 % ((arg3 + 88) / 32);
            return arg0 >= 0 && arg0 < var4.field8318.length ? var4.field8318[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        if (this.field4976 != null) {
            System.out.println("Warning! fileondisk " + this.field4970 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2152(false);
        }
        field4973++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[BI)I", line = 52)
    public final int method2146(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4971++;
        int var5 = this.field4976.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field4968 += var5;
        }
        if (arg1 != -1) {
            method2148(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V", line = 70)
    public final void method2147(long arg0, byte arg1) throws IOException {
        this.field4976.seek(arg0);
        int var4 = -117 / ((53 - arg1) / 57);
        field4966++;
        this.field4968 = arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 84)
    public static void method2148(boolean arg0) {
        if (arg0) {
            method2148(false);
        }
        field4977 = null;
        field4975 = null;
        field4980 = null;
        field4981 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([BIII)V", line = 100)
    public final void method2149(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4974++;
        if (((long) arg1 + this.field4968) > this.field4978) {
            this.field4976.seek(this.field4978);
            this.field4976.write(1);
            throw new EOFException();
        }
        this.field4976.write(arg0, arg2, arg1);
        this.field4968 += arg1;
        if (arg3 != 1) {
            field4980 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Ljava/io/File;", line = 120)
    public final File method2150(int arg0) {
        field4969++;
        return arg0 == 16384 ? this.field4970 : null;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 137)
    public static final void method2151(int arg0) {
        field4967++;
        if (arg0 != 29229) {
            field4980 = null;
        }
        for (int var1 = 0; var1 < class119.field1958.length; var1++) {
            for (int var2 = 0; var2 < class119.field1958[var1].length; var2++) {
                class119.field1958[var1][var2] = class521.field7682;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V", line = 165)
    public final void method2152(boolean arg0) throws IOException {
        if (this.field4976 != null) {
            this.field4976.close();
            this.field4976 = null;
        }
        if (arg0) {
            method2148(true);
        }
        field4979++;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 181)
    public class355(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field4976 = new RandomAccessFile(arg0, arg1);
        this.field4968 = 0L;
        this.field4978 = arg2;
        this.field4970 = arg0;
        int var5 = this.field4976.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field4976.seek(0L);
            this.field4976.write(var5);
        }
        this.field4976.seek(0L);
    }
}
