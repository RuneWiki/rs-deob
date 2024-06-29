import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class527 {

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7753;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "J")
    private long field7757;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "J")
    private long field7760;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Ljava/io/File;")
    private File field7765;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7767 = new String[] { method3944(method3943("UJ(\f*")), method3944(method3943("UJ(\n*")), method3944(method3943("UJ(\u0000*")), method3944(method3943("UJ(\u000e*")), method3944(method3943("UJ(\u0001*")), method3944(method3943("B\t(g\u007f")), method3944(method3943("WRj%")), method3944(method3943("UJ(\b*")), method3944(method3943("UJ(\r*")), method3944(method3943("UJ(\u000b*")), method3944(method3943("UJ(\u000f*")), method3944(method3943("nFt'kW@'idPKc&l]Nu\"\"")), method3944(method3943("UJ(/kWFj x\\\u000f")), method3944(method3943("\u0019Ii=\"ZKi:g]\u0007e&pKBe=n@\u0007s:kW@&*nVTca+\u0017\u0007G<vV\ne%mJNh.\"PIu=gXC(i")), method3944(method3943("UJ(ukWNrw*")) };

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "[Lfi;")
    public static class583[] field7763 = new class583[100];

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field7759;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field7764;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)Z", line = 3)
    public static final boolean method3934(int arg0, int arg1, int arg2, int arg3) {
        try {
            field7759++;
            if (!class382.field6142 || !class147.field2062) {
                return false;
            } else if (class74.field1066 < 100) {
                return false;
            } else {
                int var4 = class319.field5200[arg2][arg1][arg3];
                if (-class326.field5362 == var4) {
                    return false;
                } else if (class326.field5362 == var4) {
                    return true;
                } else if (class757.field11125 == class740.field10902) {
                    return false;
                } else {
                    int var5 = 108 / ((-arg0 - 15) / 33);
                    int var6 = arg1 << class165.field2688;
                    int var7 = arg3 << class165.field2688;
                    if (class728.method5281(class152.field2131 + var6 - 1, var6 + 1, var6 + 1, class152.field2131 + var7 + -1, var7 + class152.field2131 - 1, class740.field10902[arg2].method2495(arg3, 1, arg1), class740.field10902[arg2].method2495(arg3 + 1, 1, arg1), -93, var7 + 1, class740.field10902[arg2].method2495(arg3 + 1, 1, arg1 + 1)) && class728.method5281(class152.field2131 + var6 - 1, var6 + 1, class152.field2131 + var6 - 1, var7 - -class152.field2131 + -1, var7 + 1, class740.field10902[arg2].method2495(arg3, 1, arg1), class740.field10902[arg2].method2495(arg3 + 1, 1, arg1 + 1), 49, var7 + 1, class740.field10902[arg2].method2495(arg3, 1, arg1 + 1))) {
                        class290.field4666++;
                        class319.field5200[arg2][arg1][arg3] = class326.field5362;
                        return true;
                    } else {
                        class319.field5200[arg2][arg1][arg3] = -class326.field5362;
                        return false;
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field7767[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZII[B)I", line = 46)
    public final int method3935(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field7758++;
            int var5 = this.field7753.read(arg3, arg1, arg2);
            if (arg0) {
                this.field7765 = null;
            }
            if (var5 > 0) {
                this.field7760 += var5;
            }
            return var5;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7767[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7767[6] : field7767[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)Ljava/io/File;", line = 62)
    public final File method3936(boolean arg0) {
        try {
            field7755++;
            return arg0 ? this.field7765 : null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7767[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BJ)V", line = 74)
    public final void method3937(byte arg0, long arg1) throws IOException {
        try {
            if (arg0 != 116) {
                field7763 = null;
            }
            this.field7753.seek(arg1);
            field7764++;
            this.field7760 = arg1;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7767[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)J", line = 88)
    public final long method3938(int arg0) throws IOException {
        try {
            if (arg0 == -27115) {
                field7756++;
                return this.field7753.length();
            } else {
                return 40L;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7767[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 100)
    public static void method3939(byte arg0) {
        try {
            if (arg0 > -109) {
                method3942(-34, -93);
            }
            field7763 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7767[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 111)
    public final void method3940(int arg0) throws IOException {
        try {
            field7754++;
            if (this.field7753 != null) {
                this.field7753.close();
                this.field7753 = null;
            }
            if (arg0 != 1) {
                this.field7760 = -125L;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7767[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(III[B)V", line = 134)
    public final void method3941(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        try {
            field7761++;
            if ((long) arg1 + this.field7760 > this.field7757) {
                this.field7753.seek(this.field7757);
                this.field7753.write(1);
                throw new EOFException();
            }
            this.field7753.write(arg3, arg2, arg1);
            this.field7760 += arg1;
            if (arg0 != -1) {
                this.method3936(false);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7767[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7767[6] : field7767[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "finalize", descriptor = "()V", line = 155)
    protected final void finalize() throws Throwable {
        try {
            if (this.field7753 != null) {
                System.out.println(field7767[11] + this.field7765 + field7767[13]);
                this.method3940(1);
            }
            field7762++;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7767[12] + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V", line = 171)
    public static final void method3942(int arg0, int arg1) {
        try {
            field7766++;
            int var2 = 7 / ((arg1 - 67) / 45);
            class551 var3 = class380.method3113(-121, (long) arg0, 10);
            var3.method4089(63);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7767[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 187)
    public class527(File arg0, String arg1, long arg2) throws IOException {
        try {
            if (arg2 == -1L) {
                arg2 = Long.MAX_VALUE;
            }
            if (arg0.length() > arg2) {
                arg0.delete();
            }
            this.field7753 = new RandomAccessFile(arg0, arg1);
            this.field7757 = arg2;
            this.field7760 = 0L;
            this.field7765 = arg0;
            int var5 = this.field7753.read();
            if (var5 != -1 && !arg1.equals("r")) {
                this.field7753.seek(0L);
                this.field7753.write(var5);
            }
            this.field7753.seek(0L);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field7767[14] + (arg0 == null ? field7767[6] : field7767[5]) + ',' + (arg1 == null ? field7767[6] : field7767[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3943(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3944(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 6;
                    break;
                case 3:
                    var10005 = 73;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
