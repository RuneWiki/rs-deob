import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class263 {

    @OriginalMember(owner = "client!oaa", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3851;

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "Ljava/io/File;")
    private File field3849;

    @OriginalMember(owner = "client!oaa", name = "j", descriptor = "J")
    private long field3856;

    @OriginalMember(owner = "client!oaa", name = "f", descriptor = "J")
    private long field3852;

    @OriginalMember(owner = "client!oaa", name = "k", descriptor = "[I")
    public static int[] field3857 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "[I")
    public static int[] field3848 = new int[2];

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!oaa", name = "d", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!oaa", name = "g", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!oaa", name = "h", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!oaa", name = "i", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!oaa", name = "l", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!oaa", name = "m", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!oaa", name = "n", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!oaa", name = "o", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILr;)V")
    public static final void method1719(int arg0, int arg1, class167 arg2) {
        field3859++;
        if (!class337.field5036) {
            class389.field5685 = 0;
            return;
        }
        if (class624.field9024) {
            class26.field917 = class436.field6300.method517((byte) 113);
        }
        class518.field7310 = 0;
        class363.field5390 = 0;
        class448.field6453 = 0;
        int[] var3 = arg2.method109();
        class639.field9202 = (int) ((float) var3[3] / 3.0F);
        class216.field3286 = (int) ((float) var3[2] / 3.0F);
        arg2.method119(class138.field2455);
        if (((int) ((float) class138.field2455[0] / 3.0F)) != class356.field5332 || (int) ((float) class138.field2455[1] / 3.0F) != class295.field4420) {
            class295.field4420 = (int) ((float) class138.field2455[1] / 3.0F);
            class356.field5332 = (int) ((float) class138.field2455[0] / 3.0F);
            class122.field2228 = new int[class356.field5332 * class295.field4420];
            class35.field1028 = class356.field5332 >> 1;
            class559.field7905 = class295.field4420 >> 1;
        }
        class576.field8372 = arg2.method169();
        class389.field5685 = 0;
        for (int var4 = 0; var4 < class695.field9792; var4++) {
            class185.method1357(class237.field3522[var4], arg2, arg1, 108);
        }
        if (arg0 != -12707) {
            return;
        }
        for (int var5 = 0; var5 < class254.field3771; var5++) {
            class185.method1357(class611.field8891[var5], arg2, arg1, 111);
        }
        for (int var6 = 0; var6 < class78.field1569; var6++) {
            class185.method1357(class649.field9365[var6], arg2, arg1, 73);
        }
        class481.field6911 = 0;
        if (class389.field5685 > 0) {
            int var7 = class122.field2228.length;
            int var8 = var7 - var7 & 0x7;
            int var9 = 0;
            while (var8 > var9) {
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
                class122.field2228[var9++] = Integer.MAX_VALUE;
            }
            while (var7 > var9) {
                class122.field2228[var9++] = Integer.MAX_VALUE;
            }
            class444.field6397 = 1;
            for (int var10 = 0; var10 < class389.field5685; var10++) {
                class185 var11 = class177.field2890[var10];
                class146.method1164(var11.field2983[3], var11.field2976[3], var11.field2982[3], var11.field2976[0], var11.field2976[1], var11.field2982[1], var11.field2983[1], var11.field2983[0], var11.field2982[0], -22806);
                class146.method1164(var11.field2983[3], var11.field2976[3], var11.field2982[3], var11.field2976[1], var11.field2976[2], var11.field2982[2], var11.field2983[2], var11.field2983[1], var11.field2982[1], -22806);
            }
            class444.field6397 = 2;
        }
        if (class624.field9024) {
            class597.field8567 = class436.field6300.method517((byte) 123) - class26.field917;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZJ)V")
    public final void method1720(boolean arg0, long arg1) throws IOException {
        this.field3851.seek(arg1);
        field3858++;
        this.field3852 = arg1;
        if (!arg0) {
            this.field3856 = 4L;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(I)J")
    public final long method1721(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3852 = 3L;
        }
        field3855++;
        return this.field3851.length();
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILi;)V")
    public static final void method1722(int arg0, class37 arg1) {
        class485.field6947[arg0] = arg1;
    }

    @OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1723(int arg0) {
        if (arg0 != 65280) {
            method1725(-82, (byte) -13, -22, -34);
        }
        field3861++;
        return this.field3849;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BIII)V")
    public final void method1724(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != 0) {
            return;
        }
        field3860++;
        if (this.field3856 < ((long) arg2 + this.field3852)) {
            this.field3851.seek(this.field3856);
            this.field3851.write(1);
            throw new EOFException();
        } else {
            this.field3851.write(arg0, arg3, arg2);
            this.field3852 += arg2;
        }
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IBII)I")
    public static final int method1725(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 3) {
            method1725(-41, (byte) -115, -102, -24);
        }
        field3850++;
        int var4 = ((arg0 & 0xFF00) * arg2 & 0xFF0000 | (arg0 & 0xFF00FF) * arg2 & 0xFF00FF00) >>> 8;
        int var5 = 255 - arg2;
        return (((arg3 & 0xFF00FF) * var5 & 0xFF00FF00 | (arg3 & 0xFF00) * var5 & 0xFF0000) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)V")
    public final void method1726(byte arg0) throws IOException {
        if (arg0 != -128) {
            method1722(4, null);
        }
        if (this.field3851 != null) {
            this.field3851.close();
            this.field3851 = null;
        }
        field3847++;
    }

    @OriginalMember(owner = "client!oaa", name = "c", descriptor = "(I)V")
    public static void method1727(int arg0) {
        field3857 = null;
        field3848 = null;
        if (arg0 != 2) {
            method1719(62, 34, null);
        }
    }

    @OriginalMember(owner = "client!oaa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3851 != null) {
            System.out.println("Warning! fileondisk " + this.field3849 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1726((byte) -128);
        }
        field3853++;
    }

    @OriginalMember(owner = "client!oaa", name = "a", descriptor = "([BIBI)I")
    public final int method1728(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field3854++;
        int var5 = this.field3851.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field3852 += var5;
        }
        if (arg2 != -65) {
            field3848 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oaa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class263(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() > arg2) {
            arg0.delete();
        }
        this.field3851 = new RandomAccessFile(arg0, arg1);
        this.field3849 = arg0;
        this.field3856 = arg2;
        this.field3852 = 0L;
        int var5 = this.field3851.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3851.seek(0L);
            this.field3851.write(var5);
        }
        this.field3851.seek(0L);
    }
}
