import java.awt.Canvas;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class72 {

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1054;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "J")
    private long field1051;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "Ljava/io/File;")
    private File field1043;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "J")
    private long field1048;

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1059 = new String[] { method761(method760("Ch%0a")), method761(method760("Ch%>a")), method761(method760("Ch%:a")), method761(method760("Ch%8a")), method761(method760("J0%W4")), method761(method760("_kg\u0015")), method761(method760("Ch%;a")), method761(method760("Ch%E _w\u007fGa")), method761(method760("Ch%3a")), method761(method760("Ch%<a")), method761(method760("Ch%=a")), method761(method760("\u0011pd\riRrd\n,U>h\u0016;C{h\r%H>~\n _y+\u001a%^mnQ`\u001f>J\f=^3h\u0015&Bwe\u001eiXpx\r,Pz%Y")), method761(method760("f\u007fy\u0017 _y*Y/Xrn\u0016'Uwx\u0012i")), method761(method760("Ch%\u001f _\u007fg\u00103T6")), method761(method760("Ch%1a")) };

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "I")
    public static int field1049 = 0;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1057 = -1;

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Lmv;")
    public static class125 field1042 = new class125(80, 7);

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)J")
    public final long method750(int arg0) throws IOException {
        try {
            field1052++;
            if (arg0 != 0) {
                method756(42);
            }
            return this.field1054.length();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1059[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BJ)V")
    public final void method751(byte arg0, long arg1) throws IOException {
        try {
            if (arg0 > -59) {
                this.field1051 = 44L;
            }
            this.field1054.seek(arg1);
            field1058++;
            this.field1051 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1059[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            if (this.field1054 != null) {
                System.out.println(field1059[12] + this.field1043 + field1059[11]);
                this.method757(0);
            }
            field1056++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1059[13] + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[BII)V")
    public final void method752(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        try {
            field1046++;
            if (this.field1048 < (long) arg0 + this.field1051) {
                this.field1054.seek(this.field1048);
                this.field1054.write(1);
                throw new EOFException();
            }
            this.field1054.write(arg1, arg2, arg0);
            this.field1051 += arg0;
            if (arg3 != 0) {
                method756(1);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1059[9] + arg0 + ',' + (arg1 == null ? field1059[5] : field1059[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Lha;IZI)Lda;")
    public static final class216 method753(class18 arg0, int arg1, boolean arg2, int arg3) {
        try {
            field1055++;
            class488 var4 = class520.method3953((byte) 40, arg0, arg2, arg1);
            if (arg3 != -1) {
                method756(-51);
            }
            return var4 == null ? null : var4.field7156;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1059[14] + (arg0 == null ? field1059[5] : field1059[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V")
    public static final void method754(int arg0, int arg1) {
        class621 var2 = class608.field8715[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class621 var4 = class608.field8715[var3][arg0][arg1] = class608.field8715[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class219 var5 = var4.field8841; var5 != null; var5 = var5.field3190) {
                    class604 var6 = var5.field3188;
                    if (var6.field8663 == arg0 && var6.field8669 == arg1) {
                        var6.field2981--;
                    }
                }
                if (var4.field8850 != null) {
                    var4.field8850.field2981--;
                }
                if (var4.field8842 != null) {
                    var4.field8842.field2981--;
                }
                if (var4.field8845 != null) {
                    var4.field8845.field2981--;
                }
                if (var4.field8847 != null) {
                    var4.field8847.field2981--;
                }
                if (var4.field8852 != null) {
                    var4.field8852.field2981--;
                }
            }
        }
        if (class608.field8715[0][arg0][arg1] == null) {
            class608.field8715[0][arg0][arg1] = new class621(0);
            class608.field8715[0][arg0][arg1].field8846 = 1;
        }
        class608.field8715[0][arg0][arg1].field8849 = var2;
        class608.field8715[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method755(byte arg0) {
        try {
            field1044++;
            int var2 = -73 % ((19 - arg0) / 62);
            return this.field1043;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1059[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        try {
            field1042 = null;
            if (arg0 <= 52) {
                method758(null, null, 67, -99, 61);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1059[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V")
    public final void method757(int arg0) throws IOException {
        try {
            if (arg0 != 0) {
                method754(81, -103);
            }
            field1045++;
            if (this.field1054 != null) {
                this.field1054.close();
                this.field1054 = null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1059[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Ld;Ljava/awt/Canvas;III)Lha;")
    public static final class18 method758(class673 arg0, Canvas arg1, int arg2, int arg3, int arg4) {
        try {
            if (arg4 != -29406) {
                field1050 = -28;
            }
            field1053++;
            return new class59(arg1, arg0, arg2, arg3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1059[8] + (arg0 == null ? field1059[5] : field1059[4]) + ',' + (arg1 == null ? field1059[5] : field1059[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class72(File arg0, String arg1, long arg2) throws IOException {
        try {
            if (arg2 == -1L) {
                arg2 = Long.MAX_VALUE;
            }
            if (arg0.length() > arg2) {
                arg0.delete();
            }
            this.field1054 = new RandomAccessFile(arg0, arg1);
            this.field1051 = 0L;
            this.field1043 = arg0;
            this.field1048 = arg2;
            int var5 = this.field1054.read();
            if (var5 != -1 && !arg1.equals("r")) {
                this.field1054.seek(0L);
                this.field1054.write(var5);
            }
            this.field1054.seek(0L);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1059[7] + (arg0 == null ? field1059[5] : field1059[4]) + ',' + (arg1 == null ? field1059[5] : field1059[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I[BIB)I")
    public final int method759(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        try {
            field1047++;
            int var5 = this.field1054.read(arg1, arg2, arg0);
            if (var5 > 0) {
                this.field1051 += var5;
            }
            if (arg3 < 113) {
                field1042 = null;
            }
            return var5;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1059[6] + arg0 + ',' + (arg1 == null ? field1059[5] : field1059[4]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method760(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x49);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method761(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 49;
                    break;
                case 1:
                    var10005 = 30;
                    break;
                case 2:
                    var10005 = 11;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 73;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
