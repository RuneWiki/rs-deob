import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class729 {

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field10196;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "J")
    private long field10206;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "J")
    private long field10205;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "Ljava/io/File;")
    private File field10201;

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
    public static int field10198 = 0;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field10193;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field10194;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field10195;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "I")
    public static int field10197;

    @OriginalMember(owner = "client!ww", name = "g", descriptor = "I")
    public static int field10199;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "I")
    public static int field10200;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field10202;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field10203;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field10204;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "I")
    public static int field10207;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field10208;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field10209;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)J", line = 3)
    public final long method4059(byte arg0) throws IOException {
        if (arg0 != 88) {
            this.field10196 = null;
        }
        field10199++;
        return this.field10196.length();
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V", line = 15)
    public final void method4060(byte arg0) throws IOException {
        if (this.field10196 != null) {
            this.field10196.close();
            this.field10196 = null;
        }
        if (arg0 <= 73) {
            this.field10206 = -125L;
        }
        field10202++;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/String;)Ldb;", line = 33)
    public static final class322 method4061(byte arg0, int arg1, String arg2) {
        field10208++;
        if (arg0 != -66) {
            return null;
        }
        class322 var3;
        try {
            var3 = (class322) Class.forName("fn").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class589();
        }
        var3.field4114 = arg1;
        var3.field4112 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)I", line = 58)
    public static final int method4062(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
        field10197++;
        int var3 = ((var2 & 0xCCCCCCCF) >>> 2) + (var2 & 0x33333333);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return arg1 > -123 ? 42 : var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;)I", line = 74)
    public static final int method4063(int arg0, String arg1) {
        if (arg0 != -1) {
            field10198 = 104;
        }
        field10193++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II[BI)V", line = 85)
    public final void method4064(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field10207++;
        if (((long) arg1 + this.field10206) > this.field10205) {
            this.field10196.seek(this.field10205);
            this.field10196.write(1);
            throw new EOFException();
        }
        this.field10196.write(arg2, arg0, arg1);
        this.field10206 += arg1;
        if (arg3 < 92) {
            field10198 = -84;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(JB)V", line = 105)
    public final void method4065(long arg0, byte arg1) throws IOException {
        this.field10196.seek(arg0);
        field10209++;
        this.field10206 = arg0;
        int var4 = 25 % ((arg1 - 50) / 44);
    }

    @OriginalMember(owner = "client!ww", name = "finalize", descriptor = "()V", line = 119)
    protected final void finalize() throws Throwable {
        field10203++;
        if (this.field10196 != null) {
            System.out.println("Warning! fileondisk " + this.field10201 + " not closed correctly using close(). Auto-closing instead. ");
            this.method4060((byte) 75);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([BIBI)I", line = 132)
    public final int method4066(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field10204++;
        int var5 = this.field10196.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field10206 += var5;
        }
        return arg2 == 125 ? var5 : 49;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILtm;Ltm;)V", line = 149)
    public static final void method4067(int arg0, class389 arg1, class389 arg2) {
        if (arg1.field5382 != null) {
            arg1.method2401((byte) -57);
        }
        if (arg0 != 128) {
            return;
        }
        field10195++;
        arg1.field5382 = arg2.field5382;
        arg1.field5387 = arg2;
        arg1.field5382.field5387 = arg1;
        arg1.field5387.field5382 = arg1;
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 173)
    public class729(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field10196 = new RandomAccessFile(arg0, arg1);
        this.field10206 = 0L;
        this.field10205 = arg2;
        this.field10201 = arg0;
        int var5 = this.field10196.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field10196.seek(0L);
            this.field10196.write(var5);
        }
        this.field10196.seek(0L);
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)Ljava/io/File;", line = 205)
    public final File method4068(byte arg0) {
        int var2 = -95 / ((26 - arg0) / 52);
        field10200++;
        return this.field10201;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILnv;)V", line = 215)
    public static final void method4069(int arg0, class417 arg1) {
        if (class146.field1621 == null) {
            class236 var2 = new class236();
            byte[] var3 = var2.method1396(128, 16, -56, 128);
            class146.field1621 = class389.method2398(var3, false, 0);
        }
        field10194++;
        if (class294.field3620 == null) {
            class269 var4 = new class269();
            byte[] var5 = var4.method1605((byte) 109, 16, 128, 128);
            class294.field3620 = class389.method2398(var5, false, 0);
        }
        class712 var6 = arg1.field5914;
        if (var6.method3985(108) && class336.field4321 == null) {
            byte[] var7 = class192.method1168(-91, 0.6F, 4.0F, 0.5F, 128, 128, 16.0F, new class726(419684), 16, 8, 4.0F);
            class336.field4321 = class389.method2398(var7, false, 0);
        }
        if (arg0 > -99) {
            method4069(39, null);
        }
    }
}
