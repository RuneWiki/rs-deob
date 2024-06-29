import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class523 {

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7196;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "Ljava/io/File;")
    private File field7194;

    @OriginalMember(owner = "client!gba", name = "d", descriptor = "J")
    private long field7197;

    @OriginalMember(owner = "client!gba", name = "g", descriptor = "J")
    private long field7200;

    @OriginalMember(owner = "client!gba", name = "l", descriptor = "Ljava/lang/String;")
    public static String field7205 = null;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!gba", name = "h", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!gba", name = "i", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!gba", name = "j", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!gba", name = "k", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!gba", name = "m", descriptor = "I")
    public static int field7206;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(BJ)V", line = 3)
    public final void method3113(byte arg0, long arg1) throws IOException {
        field7195++;
        this.field7196.seek(arg1);
        if (arg0 > -87) {
            method3117(null, -54, 19);
        }
        this.field7197 = arg1;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(B)J", line = 15)
    public final long method3114(byte arg0) throws IOException {
        field7203++;
        int var2 = 74 / ((-arg0 - 51) / 47);
        return this.field7196.length();
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IBI[B)I", line = 26)
    public final int method3115(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field7204++;
        if (arg1 < 27) {
            method3119(false);
        }
        int var5 = this.field7196.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field7197 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(III[B)V", line = 43)
    public final void method3116(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7201++;
        if ((long) arg2 + this.field7197 > this.field7200) {
            this.field7196.seek(this.field7200);
            this.field7196.write(1);
            throw new EOFException();
        }
        this.field7196.write(arg3, arg0, arg2);
        this.field7197 += arg2;
        if (arg1 != 1) {
            method3117(null, 26, 111);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lha;II)V", line = 65)
    public static final void method3117(class473 arg0, int arg1, int arg2) {
        field7202++;
        if (!class623.field8736 || !class19.field125) {
            class197.field2782 = 0;
            return;
        }
        if (class88.field1054) {
            class613.field8627 = class416.field5805.method1803((byte) 99);
        }
        class329.field4619 = 0;
        class109.field1316 = 0;
        class759.field10431 = 0;
        int[] var3 = arg0.method238();
        class627.field8782 = (int) ((float) var3[2] / 3.0F);
        class72.field781 = (int) ((float) var3[3] / 3.0F);
        arg0.method218(class548.field7647);
        if (((int) ((float) class548.field7647[0] / 3.0F)) != class516.field7079 || (int) ((float) class548.field7647[1] / 3.0F) != class258.field3793) {
            class516.field7079 = (int) ((float) class548.field7647[0] / 3.0F);
            class258.field3793 = (int) ((float) class548.field7647[1] / 3.0F);
            class309.field4454 = class258.field3793 >> 1;
            class130.field1683 = new int[class516.field7079 * class258.field3793];
            class368.field5310 = class516.field7079 >> 1;
        }
        class267.field3878 = arg0.method187();
        class197.field2782 = 0;
        for (int var4 = 0; var4 < class752.field10378; var4++) {
            class266.method1743(arg0, (byte) 99, class428.field5974[var4], arg2);
        }
        for (int var5 = 0; var5 < class293.field4304; var5++) {
            class266.method1743(arg0, (byte) 116, class381.field5451[var5], arg2);
        }
        for (int var6 = 0; var6 < class141.field1793; var6++) {
            class266.method1743(arg0, (byte) 105, class758.field10425[var6], arg2);
        }
        if (arg1 <= 87) {
            method3117(null, 113, -90);
        }
        class380.field5448 = 0;
        if (class197.field2782 > 0) {
            int var7 = class130.field1683.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var9 < var8) {
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
                class130.field1683[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class130.field1683[var9++] = Integer.MAX_VALUE;
            }
            class635.field8859 = 1;
            for (int var10 = 0; var10 < class197.field2782; var10++) {
                class532 var11 = class356.field5133[var10];
                class788.method4323(var11.field7320[1], var11.field7326[0], var11.field7320[3], (byte) 84, var11.field7326[1], var11.field7321[0], var11.field7320[0], var11.field7321[1], var11.field7326[3], var11.field7321[3]);
                class788.method4323(var11.field7320[2], var11.field7326[1], var11.field7320[3], (byte) 84, var11.field7326[2], var11.field7321[1], var11.field7320[1], var11.field7321[2], var11.field7326[3], var11.field7321[3]);
            }
            class635.field8859 = 2;
        }
        if (class88.field1054) {
            class555.field7686 = class416.field5805.method1803((byte) -117) - class613.field8627;
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)Ljava/io/File;", line = 169)
    public final File method3118(int arg0) {
        field7207++;
        return arg0 > -52 ? null : this.field7194;
    }

    @OriginalMember(owner = "client!gba", name = "finalize", descriptor = "()V", line = 184)
    protected final void finalize() throws Throwable {
        if (this.field7196 != null) {
            System.out.println("Warning! fileondisk " + this.field7194 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3121((byte) 63);
        }
        field7206++;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V", line = 202)
    public static void method3119(boolean arg0) {
        if (arg0) {
            field7205 = null;
        }
        field7205 = null;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(Z)V", line = 213)
    public static final void method3120(boolean arg0) {
        class785.field10771 = null;
        field7198++;
        class595.field8361 = null;
        if (!arg0) {
            field7205 = null;
        }
        class353.field5119 = null;
        class382.field5481 = null;
        class93.field1090 = null;
        class465.field6478 = null;
        class436.field6056 = null;
        class534.field7396 = null;
        class492.field6782 = null;
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)V", line = 232)
    public final void method3121(byte arg0) throws IOException {
        field7199++;
        if (arg0 <= 27) {
            this.field7200 = -35L;
        }
        if (this.field7196 != null) {
            this.field7196.close();
            this.field7196 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 250)
    public class523(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field7196 = new RandomAccessFile(arg0, arg1);
        this.field7194 = arg0;
        this.field7197 = 0L;
        this.field7200 = arg2;
        int var5 = this.field7196.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field7196.seek(0L);
            this.field7196.write(var5);
        }
        this.field7196.seek(0L);
    }
}
