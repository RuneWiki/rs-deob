import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class236 {

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3561;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "J")
    private long field3557;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "J")
    private long field3564;

    @OriginalMember(owner = "client!qb", name = "o", descriptor = "Ljava/io/File;")
    private File field3563;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3569 = new String[] { method2019(method2018("48Ry")), method2019(method2018("+/\u0010)^4$J+\u001f")), method2019(method2018("!c\u0010;J")), method2019(method2018("+/\u0010s^4,R|M?e")), method2019(method2018("z#Qa\u00179!QfR>m]zE((]a[#mKf^4*\u001ev[5>[=\u001etm\u007f`C5`]yX)$Pr\u00173#MaR;)\u00105")), method2019(method2018("\r,L{^4*\u001f5Q3![zY>$M~\u0017")), method2019(method2018("+/\u0010P\u001f")), method2019(method2018("+/\u0010S\u001f")), method2019(method2018("+/\u0010R\u001f")), method2019(method2018("+/\u0010W\u001f")), method2019(method2018("+/\u0010T\u001f")), method2019(method2018("+/\u0010V\u001f")), method2019(method2018("+/\u0010Q\u001f")) };

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "[J")
    public static long[] field3556 = new long[32];

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "I")
    public static int field3560 = 0;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "[[I")
    public static int[][] field3565 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field3559 = 1409;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 14)
    public final void method2011(int arg0) throws IOException {
        try {
            field3566++;
            if (this.field3561 != null) {
                this.field3561.close();
                this.field3561 = null;
            }
            if (arg0 != -2968) {
                method2015(110);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3569[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BII)V", line = 30)
    public final void method2012(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field3555++;
            if (this.field3557 < ((long) arg3 + this.field3564)) {
                this.field3561.seek(this.field3557);
                this.field3561.write(1);
                throw new EOFException();
            }
            if (arg2 != 1) {
                this.field3561 = null;
            }
            this.field3561.write(arg1, arg0, arg3);
            this.field3564 += arg3;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field3569[10] + arg0 + ',' + (arg1 == null ? field3569[0] : field3569[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V", line = 49)
    protected final void finalize() throws Throwable {
        try {
            field3554++;
            if (this.field3561 != null) {
                System.out.println(field3569[5] + this.field3563 + field3569[4]);
                this.method2011(-2968);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3569[3] + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BZI)I", line = 66)
    public final int method2013(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        try {
            field3562++;
            if (!arg2) {
                this.method2016(-96);
            }
            int var5 = this.field3561.read(arg1, arg3, arg0);
            if (var5 > 0) {
                this.field3564 += var5;
            }
            return var5;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3569[9] + arg0 + ',' + (arg1 == null ? field3569[0] : field3569[2]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)J", line = 85)
    public final long method2014(byte arg0) throws IOException {
        try {
            field3568++;
            if (arg0 != 93) {
                this.method2016(22);
            }
            return this.field3561.length();
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3569[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 102)
    public class236(File arg0, String arg1, long arg2) throws IOException {
        try {
            if (arg2 == -1L) {
                arg2 = Long.MAX_VALUE;
            }
            if (arg2 < arg0.length()) {
                arg0.delete();
            }
            this.field3561 = new RandomAccessFile(arg0, arg1);
            this.field3557 = arg2;
            this.field3564 = 0L;
            this.field3563 = arg0;
            int var5 = this.field3561.read();
            if (var5 != -1 && !arg1.equals("r")) {
                this.field3561.seek(0L);
                this.field3561.write(var5);
            }
            this.field3561.seek(0L);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field3569[1] + (arg0 == null ? field3569[0] : field3569[2]) + ',' + (arg1 == null ? field3569[0] : field3569[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 132)
    public static void method2015(int arg0) {
        try {
            if (arg0 != -6925) {
                field3565 = null;
            }
            field3565 = null;
            field3556 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3569[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)Ljava/io/File;", line = 143)
    public final File method2016(int arg0) {
        try {
            if (arg0 <= 126) {
                field3556 = null;
            }
            field3567++;
            return this.field3563;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3569[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IJ)V", line = 161)
    public final void method2017(int arg0, long arg1) throws IOException {
        try {
            if (arg0 == 1) {
                this.field3561.seek(arg1);
                field3558++;
                this.field3564 = arg1;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field3569[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2018(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2019(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 90;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 62;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
