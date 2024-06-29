import jaggl.OpenGL;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class68 {

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field832;

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "Ljava/io/File;")
    private File field843;

    @OriginalMember(owner = "client!sga", name = "j", descriptor = "J")
    private long field839;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "J")
    private long field830;

    @OriginalMember(owner = "client!sga", name = "k", descriptor = "I")
    public static int field840 = 1338;

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
    public static int field831;

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!sga", name = "e", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!sga", name = "f", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!sga", name = "i", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!sga", name = "l", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "I")
    public static int field842;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!sga", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field832 != null) {
            System.out.println("Warning! fileondisk " + this.field843 + " not closed correctly using close(). Auto-closing instead. ");
            this.method562(126);
        }
        field835++;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IJ)V", line = 23)
    public final void method560(int arg0, long arg1) throws IOException {
        field841++;
        this.field832.seek(arg1);
        this.field839 = arg1;
        if (arg0 > -84) {
            this.method566((byte) -59);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)J", line = 35)
    public final long method561(byte arg0) throws IOException {
        if (arg0 == 69) {
            field842++;
            return this.field832.length();
        } else {
            return 57L;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V", line = 49)
    public final void method562(int arg0) throws IOException {
        field833++;
        if (this.field832 != null) {
            this.field832.close();
            this.field832 = null;
        }
        int var2 = -1 / ((69 - arg0) / 55);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ILwm;I)V", line = 66)
    public static final void method563(int arg0, class564 arg1, int arg2) {
        field837++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field7954 > class740.field10285) {
            class273.method1776((byte) 75, arg1);
        } else if (arg1.field7969 >= class740.field10285) {
            class555.method3209((byte) -120, arg1);
        } else {
            class347.method2243(false, (byte) 59, arg1);
            var3 = class381.field5459;
            var4 = class36.field457;
        }
        if (arg0 != -18081) {
            method563(37, null, -87);
        }
        if (arg1.field1264 < 512 || arg1.field1250 < 512 || ((class336.field4683 - 1) * 512) <= arg1.field1264 || arg1.field1250 >= class700.field9768 * 512 - 512) {
            arg1.field7969 = 0;
            arg1.field7954 = 0;
            var3 = -1;
            arg1.field7928 = -1;
            arg1.field7911 = null;
            arg1.field7977 = -1;
            arg1.field7991 = -1;
            var4 = 0;
            arg1.field1264 = arg1.field8009[0] * 512 + arg1.method1835((byte) 127) * 256;
            arg1.field1250 = arg1.field8015[0] * 512 + arg1.method1835((byte) 127) * 256;
            arg1.method3253(-876801394);
        }
        if (class660.field9039 == arg1 && (arg1.field1264 < 6144 || arg1.field1250 < 6144 || class336.field4683 * 512 - 6144 <= arg1.field1264 || arg1.field1250 >= (class700.field9768 * 512 - 6144))) {
            arg1.field7954 = 0;
            arg1.field7977 = -1;
            arg1.field7911 = null;
            arg1.field7928 = -1;
            arg1.field7991 = -1;
            var3 = -1;
            arg1.field7969 = 0;
            var4 = 0;
            arg1.field1264 = arg1.field8009[0] * 512 + (arg1.method1835((byte) 127) * 256);
            arg1.field1250 = arg1.field8015[0] * 512 + arg1.method1835((byte) 127) * 256;
            arg1.method3253(arg0 - 876783313);
        }
        int var5 = class150.method1024(arg1, (byte) -105);
        class114.method798(arg1, (byte) 127);
        class293.method1907(var4, var5, arg0 + 18082, var3, arg1);
        class245.method1565(var3, arg1, -1);
        class582.method3307(false, arg1);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(III[FIII)V", line = 143)
    public static final void method564(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field844++;
        if (arg2 > 0 && !class253.method1681(arg2, (byte) 97)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class253.method1681(arg6, (byte) 88)) {
            int var7 = class21.method133(arg0, true);
            if (arg1 <= 12) {
                method564(-91, -31, 32, null, 126, -57, 2);
            }
            int var8 = 0;
            int var9 = arg6 > arg2 ? arg2 : arg6;
            int var10 = arg2 >> 1;
            int var11 = arg6 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg2, arg6, 0, arg0, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg2 = var10;
                arg6 = var11;
                var8++;
                var11 >>= 0x1;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 240)
    public class68(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field832 = new RandomAccessFile(arg0, arg1);
        this.field843 = arg0;
        this.field839 = 0L;
        this.field830 = arg2;
        int var5 = this.field832.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field832.seek(0L);
            this.field832.write(var5);
        }
        this.field832.seek(0L);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI[B)I", line = 271)
    public final int method565(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field834++;
        int var5 = 115 % ((-arg1 - 6) / 40);
        int var6 = this.field832.read(arg3, arg0, arg2);
        if (var6 > 0) {
            this.field839 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)Ljava/io/File;", line = 288)
    public final File method566(byte arg0) {
        if (arg0 != 112) {
            method564(76, -104, 101, null, -79, -71, -17);
        }
        field845++;
        return this.field843;
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(II[BZ)V", line = 299)
    public final void method567(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field836++;
        if ((long) arg1 + this.field839 > this.field830) {
            this.field832.seek(this.field830);
            this.field832.write(1);
            throw new EOFException();
        }
        if (!arg3) {
            this.field839 = -117L;
        }
        this.field832.write(arg2, arg0, arg1);
        this.field839 += arg1;
    }
}
