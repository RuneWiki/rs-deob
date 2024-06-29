import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class23 {

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field376;

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "J")
    private long field370;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "J")
    private long field369;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "Ljava/io/File;")
    private File field374;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "[I")
    public static int[] field368 = new int[256];

    @OriginalMember(owner = "client!qia", name = "n", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qia", name = "l", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qia", name = "m", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "([BBII)I")
    public final int method229(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field375++;
        if (arg1 != -88) {
            this.field369 = 125L;
        }
        int var5 = this.field376.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field369 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(B)V")
    public final void method230(byte arg0) throws IOException {
        int var2 = -60 / ((34 - arg0) / 49);
        field371++;
        if (this.field376 != null) {
            this.field376.close();
            this.field376 = null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public static void method231(int arg0) {
        field368 = null;
        if (arg0 != 5) {
            field368 = null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method232(int arg0, long arg1) {
        class602.field8435.setTime(new Date(arg1));
        field379++;
        int var3 = class602.field8435.get(7);
        int var4 = class602.field8435.get(5);
        int var5 = class602.field8435.get(2);
        if (arg0 >= -108) {
            field368 = null;
        }
        int var6 = class602.field8435.get(1);
        int var7 = class602.field8435.get(11);
        int var8 = class602.field8435.get(12);
        int var9 = class602.field8435.get(13);
        return class15.field292[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class430.field5833[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method233(int arg0) {
        if (arg0 != 5) {
            this.field374 = null;
        }
        field373++;
        return this.field374;
    }

    @OriginalMember(owner = "client!qia", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field376 != null) {
            System.out.println("Warning! fileondisk " + this.field374 + " not closed correctly using close(). Auto-closing instead. ");
            this.method230((byte) 90);
        }
        field377++;
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(IJ)V")
    public final void method234(int arg0, long arg1) throws IOException {
        field372++;
        this.field376.seek(arg1);
        this.field369 = arg1;
        if (arg0 != -8144) {
            this.field376 = null;
        }
    }

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "(B)J")
    public final long method235(byte arg0) throws IOException {
        if (arg0 != 80) {
            this.field369 = 105L;
        }
        field380++;
        return this.field376.length();
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(III[B)V")
    public final void method236(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field378++;
        if ((long) arg0 + this.field369 > this.field370) {
            this.field376.seek(this.field370);
            this.field376.write(1);
            throw new EOFException();
        }
        this.field376.write(arg3, arg1, arg0);
        this.field369 += arg0;
        if (arg2 != 1) {
            this.field369 = -122L;
        }
    }

    @OriginalMember(owner = "client!qia", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class23(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field376 = new RandomAccessFile(arg0, arg1);
        this.field370 = arg2;
        this.field369 = 0L;
        this.field374 = arg0;
        int var5 = this.field376.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field376.seek(0L);
            this.field376.write(var5);
        }
        this.field376.seek(0L);
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field368[var0] = var1;
        }
        field381 = -1;
    }
}
