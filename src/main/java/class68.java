import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class68 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "J")
    private long field1212 = -1L;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "J")
    private long field1216 = -1L;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    private int field1228 = 0;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "Lmd;")
    private class134 field1243;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "J")
    private long field1245;

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "J")
    private long field1231;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "J")
    private long field1241;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "[B")
    private byte[] field1222;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "[B")
    private byte[] field1232;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Ldc;")
    private static class37 field1239 = class185.method1233((byte) 86, "Malformed login packet)3");

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "[J")
    public static long[] field1246 = new long[100];

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "Ldc;")
    public static class37 field1244 = field1239;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Loa;")
    public static class153 field1230 = new class153(4096);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "J")
    private long field1247;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "Lbc;")
    public static class15 field1250;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Ldj;")
    public static class44 field1236;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "Ldj;")
    public static class44 field1249;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    private final void method490(int arg0) throws IOException {
        field1215++;
        if (this.field1216 != -1L) {
            if (this.field1247 != this.field1216) {
                this.field1243.method932((byte) -29, this.field1216);
                this.field1247 = this.field1216;
            }
            long var2 = -1L;
            this.field1243.method931(this.field1222, 0, this.field1228, 1);
            long var4 = -1L;
            this.field1247 += this.field1228;
            if (this.field1245 < this.field1247) {
                this.field1245 = this.field1247;
            }
            if (this.field1212 <= this.field1216 && this.field1216 < this.field1212 + (long) this.field1226) {
                var4 = this.field1216;
            } else if (this.field1216 <= this.field1212 && this.field1216 + (long) this.field1228 > this.field1212) {
                var4 = this.field1212;
            }
            if (this.field1212 < (long) this.field1228 + this.field1216 && (long) this.field1228 + this.field1216 <= (long) this.field1226 + this.field1212) {
                var2 = (long) this.field1228 + this.field1216;
            } else if (this.field1216 < (long) this.field1226 + this.field1212 && (long) this.field1226 + this.field1212 <= (long) this.field1228 + this.field1216) {
                var2 = (long) this.field1226 + this.field1212;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class4.method35(this.field1222, (int) (var4 - this.field1216), this.field1232, (int) (var4 - this.field1212), var6);
            }
            this.field1228 = 0;
            this.field1216 = -1L;
        }
        int var7 = 23 % ((arg0 + 44) / 55);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    private final void method491(int arg0) throws IOException {
        if (arg0 != -1) {
            field1250 = null;
        }
        this.field1226 = 0;
        if (this.field1247 != this.field1241) {
            this.field1243.method932((byte) -29, this.field1241);
            this.field1247 = this.field1241;
        }
        this.field1212 = this.field1241;
        field1223++;
        while (this.field1226 < this.field1232.length) {
            int var2 = this.field1232.length - this.field1226;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1243.method928(true, this.field1232, var2, this.field1226);
            if (var3 == -1) {
                break;
            }
            this.field1247 += var3;
            this.field1226 += var3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method492(byte arg0) {
        if (arg0 >= -52) {
            return;
        }
        field1244 = null;
        field1239 = null;
        field1246 = null;
        field1230 = null;
        field1249 = null;
        field1236 = null;
        field1250 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method493(boolean arg0) {
        field1220++;
        if (class115.field2052 != null) {
            return;
        }
        if (arg0) {
            field1250 = null;
        }
        if (class56.field1073 != null) {
            return;
        }
        int var1 = class97.field1698;
        if (class118.field2114) {
            if (var1 != 1) {
                int var2 = class80.field1416;
                int var3 = class235.field4271;
                if (var2 < class246.field4491 - 10 || class149.field2826 + class246.field4491 + 10 < var2 || class10.field141 - 10 > var3 || var3 > class225.field4164 + class10.field141 + 10) {
                    class118.field2114 = false;
                    class241.method1579(class225.field4164, class149.field2826, class246.field4491, class10.field141, true);
                }
            }
            if (var1 == 1) {
                int var4 = class10.field141;
                int var5 = class246.field4491;
                int var6 = class149.field2826;
                int var7 = -1;
                int var8 = class205.field3805;
                int var9 = class200.field3745;
                for (int var10 = 0; var10 < class97.field1701; var10++) {
                    int var11 = (class97.field1701 - var10 - 1) * 15 + var4 + 31;
                    if (var8 > var5 && var8 < var5 + var6 && var11 - 13 < var9 && var9 < var11 + 3) {
                        var7 = var10;
                    }
                }
                if (var7 != -1) {
                    class156.method1057((byte) -82, var7);
                }
                class118.field2114 = false;
                class241.method1579(class225.field4164, class149.field2826, class246.field4491, class10.field141, true);
                return;
            }
            return;
        }
        if (var1 == 1 && class97.field1701 > 0) {
            short var12 = class171.field3281[class97.field1701 - 1];
            if (var12 == 36 || var12 == 7 || var12 == 8 || var12 == 28 || var12 == 51 || var12 == 50 || var12 == 47 || var12 == 20 || var12 == 6 || var12 == 11 || var12 == 18 || var12 == 1007) {
                int var13 = class73.field1302[class97.field1701 - 1];
                int var14 = class195.field3649[class97.field1701 - 1];
                class136 var15 = class180.method1200(var14, (byte) 111);
                if (class135.method934(class107.method699(var15, 71), -114) || class18.method122(class107.method699(var15, 105), -128)) {
                    class217.field4059 = false;
                    class236.field4298 = 0;
                    if (class115.field2052 != null) {
                        class210.method1395((byte) 29, class115.field2052);
                    }
                    class115.field2052 = class180.method1200(var14, (byte) 111);
                    class204.field3790 = var13;
                    class166.field3180 = class205.field3805;
                    class243.field4463 = class200.field3745;
                    class210.method1395((byte) 29, class115.field2052);
                    return;
                }
            }
        }
        if (var1 == 1 && (class215.field4009 == 1 && class97.field1701 > 2 || class209.method1390((byte) -3, class97.field1701 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class97.field1701 > 0) {
            class156.method1057((byte) -82, class97.field1701 - 1);
        }
        if (var1 != 2 || class97.field1701 <= 0) {
            return;
        }
        class85.method577(false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILwa;B)[Lqh;")
    public static final class182[] method494(int arg0, int arg1, class238 arg2, byte arg3) {
        field1237++;
        if (arg3 < 52) {
            field1224 = -99;
        }
        return class192.method1278(arg2, 0, arg1, arg0) ? class88.method589((byte) -127) : null;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(Z)J")
    public final long method495(boolean arg0) {
        field1229++;
        if (!arg0) {
            field1246 = null;
        }
        return this.field1231;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method496(int arg0) {
        if (arg0 == 20459) {
            field1219++;
            return this.field1243.method930(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(JI)V")
    public final void method497(long arg0, int arg1) throws IOException {
        field1227++;
        if (arg1 != -11320) {
            method500((byte) 34);
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method496(20459));
        }
        this.field1241 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public static final void method498(int arg0, int arg1, int arg2) {
        class18 var3 = class180.field3354[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field287 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI)V")
    public final void method499(byte[] arg0, int arg1) throws IOException {
        if (arg1 <= 100) {
            this.field1231 = -56L;
        }
        field1248++;
        this.method502(arg0.length, arg0, 11524, 0);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)Lde;")
    public static final class39 method500(byte arg0) {
        field1238++;
        try {
            if (arg0 != -88) {
                field1230 = null;
            }
            return (class39) Class.forName("gf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class13();
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lwa;Lwa;I)V")
    public static final void method501(class238 arg0, class238 arg1, int arg2) {
        class100.field1737 = arg1;
        field1234++;
        if (arg2 < 17) {
            field1230 = null;
        }
        class245.field4488 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BII)V")
    public final void method502(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1233++;
        if (arg2 != 11524) {
            return;
        }
        try {
            if (arg0 + arg3 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field1216 != -1L && this.field1216 <= this.field1241 && this.field1216 + (long) this.field1228 >= (long) arg0 + this.field1241) {
                class4.method35(this.field1222, (int) (this.field1241 - this.field1216), arg1, arg3, arg0);
                this.field1241 += arg0;
                return;
            }
            int var5 = arg0;
            long var6 = this.field1241;
            int var8 = arg3;
            if (this.field1241 >= this.field1212 && (long) this.field1226 + this.field1212 > this.field1241) {
                int var9 = (int) ((long) this.field1226 + this.field1212 - this.field1241);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class4.method35(this.field1232, (int) (this.field1241 - this.field1212), arg1, arg3, var9);
                arg3 += var9;
                this.field1241 += var9;
            }
            if (arg0 > this.field1232.length) {
                this.field1243.method932((byte) -29, this.field1241);
                this.field1247 = this.field1241;
                while (arg0 > 0) {
                    int var11 = this.field1243.method928(true, arg1, arg0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field1241 += var11;
                    arg0 -= var11;
                    arg3 += var11;
                    this.field1247 += var11;
                }
            } else if (arg0 > 0) {
                int var10 = arg0;
                this.method491(-1);
                if (arg0 > this.field1226) {
                    var10 = this.field1226;
                }
                class4.method35(this.field1232, 0, arg1, arg3, var10);
                this.field1241 += var10;
                arg0 -= var10;
                arg3 += var10;
            }
            if (this.field1216 != -1L) {
                if (this.field1216 > this.field1241 && arg0 > 0) {
                    int var12 = (int) (this.field1216 - this.field1241) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field1241++;
                    }
                }
                long var13 = -1L;
                if (var6 < (long) this.field1228 + this.field1216 && (long) this.field1228 + this.field1216 <= var6 - -((long) var5)) {
                    var13 = (long) this.field1228 + this.field1216;
                } else if (this.field1216 < (long) var5 + var6 && var6 + (long) var5 <= (long) this.field1228 + this.field1216) {
                    var13 = (long) var5 + var6;
                }
                long var15 = -1L;
                if (var6 <= this.field1216 && (long) var5 + var6 > this.field1216) {
                    var15 = this.field1216;
                } else if (this.field1216 <= var6 && (long) this.field1228 + this.field1216 > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class4.method35(this.field1222, (int) (var15 - this.field1216), arg1, (int) (var15 - var6) + var8, var17);
                    if (this.field1241 < var13) {
                        arg0 = (int) ((long) arg0 + this.field1241 - var13);
                        this.field1241 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1247 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
    public final void method503(byte arg0) throws IOException {
        int var2 = 30 % ((arg0 + 79) / 35);
        field1213++;
        this.method490(91);
        this.field1243.method927(1);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I[BII)V")
    public final void method504(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1235++;
        try {
            if ((long) arg3 + this.field1241 > this.field1231) {
                this.field1231 = (long) arg3 + this.field1241;
            }
            if (this.field1216 != -1L && (this.field1216 > this.field1241 || (long) this.field1228 + this.field1216 < this.field1241)) {
                this.method490(14);
            }
            if (this.field1216 != -1L && this.field1241 + (long) arg3 > (long) this.field1222.length + this.field1216) {
                int var5 = (int) ((long) this.field1222.length + this.field1216 - this.field1241);
                class4.method35(arg1, arg0, this.field1222, (int) (this.field1241 - this.field1216), var5);
                arg3 -= var5;
                this.field1241 += var5;
                arg0 += var5;
                this.field1228 = this.field1222.length;
                this.method490(-106);
            }
            if (this.field1222.length < arg3) {
                if (this.field1247 != this.field1241) {
                    this.field1243.method932((byte) -29, this.field1241);
                    this.field1247 = this.field1241;
                }
                this.field1243.method931(arg1, arg0, arg3, arg2 ^ 0xFFFFFFFE);
                long var6 = -1L;
                if (this.field1241 >= this.field1212 && this.field1241 < this.field1212 + (long) this.field1226) {
                    var6 = this.field1241;
                } else if (this.field1212 >= this.field1241 && (long) arg3 + this.field1241 > this.field1212) {
                    var6 = this.field1212;
                }
                this.field1247 += arg3;
                if (this.field1245 < this.field1247) {
                    this.field1245 = this.field1247;
                }
                long var8 = -1L;
                if ((long) arg3 + this.field1241 > this.field1212 && (long) this.field1226 + this.field1212 >= (long) arg3 + this.field1241) {
                    var8 = (long) arg3 + this.field1241;
                } else if (this.field1212 + (long) this.field1226 > this.field1241 && (long) this.field1226 + this.field1212 <= (long) arg3 + this.field1241) {
                    var8 = this.field1212 + (long) this.field1226;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class4.method35(arg1, (int) (var6 + (long) arg0 - this.field1241), this.field1232, (int) (var6 - this.field1212), var10);
                }
                this.field1241 += arg3;
            } else if (arg2 > ~arg3) {
                if (this.field1216 == -1L) {
                    this.field1216 = this.field1241;
                }
                class4.method35(arg1, arg0, this.field1222, (int) (this.field1241 - this.field1216), arg3);
                this.field1241 += arg3;
                if (this.field1241 - this.field1216 > (long) this.field1228) {
                    this.field1228 = (int) (this.field1241 - this.field1216);
                }
            }
        } catch (IOException var12) {
            this.field1247 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lmd;II)V")
    public class68(class134 arg0, int arg1, int arg2) throws IOException {
        this.field1243 = arg0;
        this.field1231 = this.field1245 = arg0.method929((byte) -85);
        this.field1241 = 0L;
        this.field1222 = new byte[arg2];
        this.field1232 = new byte[arg1];
    }
}
