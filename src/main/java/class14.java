import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 {

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    private int field199 = 0;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "J")
    private long field192 = -1L;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "J")
    private long field205 = -1L;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Lri;")
    private class193 field184;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "J")
    private long field188;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "J")
    private long field183;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "[B")
    private byte[] field194;

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "J")
    private long field206;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "[B")
    private byte[] field186;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lmb;")
    private static class132 field179 = class166.method1092(" has logged in)3", 125);

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field180 = 1;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lmb;")
    public static class132 field191 = field179;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lmb;")
    public static class132 field185 = class166.method1092("Der Anmelde)2Server ist offline)3", 118);

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "Lmb;")
    private static class132 field203 = class166.method1092("Account locked as we suspect it has been stolen)3", 112);

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
    public static int[] field202 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lmb;")
    public static class132 field196 = field203;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "I")
    private int field189;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!bb", name = "H", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "J")
    private long field197;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    public static boolean field178;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[I")
    public static int[] field181;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    private final void method66(int arg0) throws IOException {
        if (this.field192 != -1L) {
            long var2 = -1L;
            if (this.field197 != this.field192) {
                this.field184.method1234(this.field192, -1);
                this.field197 = this.field192;
            }
            long var4 = -1L;
            this.field184.method1233(this.field199, 0, this.field194, (byte) -95);
            if (this.field192 >= this.field205 && (long) this.field189 + this.field205 > this.field192) {
                var4 = this.field192;
            } else if (this.field205 >= this.field192 && this.field192 + (long) this.field199 > this.field205) {
                var4 = this.field205;
            }
            if ((long) this.field199 + this.field192 > this.field205 && (long) this.field199 + this.field192 <= (long) this.field189 + this.field205) {
                var2 = (long) this.field199 + this.field192;
            } else if ((long) this.field189 + this.field205 > this.field192 && (long) this.field199 + this.field192 >= (long) this.field189 + this.field205) {
                var2 = this.field205 + (long) this.field189;
            }
            this.field197 += this.field199;
            if (this.field197 > this.field188) {
                this.field188 = this.field197;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class80.method495(this.field194, (int) (var4 - this.field192), this.field186, (int) (var4 - this.field205), var6);
            }
            this.field199 = 0;
            this.field192 = -1L;
        }
        if (arg0 != -1) {
            this.method73(11);
        }
        field204++;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public final void method67(int arg0) throws IOException {
        field182++;
        this.method66(-1);
        this.field184.method1230((byte) -50);
        if (arg0 != 18993) {
            this.field199 = -121;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)V")
    public final void method68(int arg0, long arg1) throws IOException {
        field190++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method77(100));
        }
        this.field206 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[BI)V")
    public final void method69(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field201++;
        try {
            if (arg0 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field192 != -1L && this.field206 >= this.field192 && (long) this.field199 + this.field192 >= this.field206 - -((long) arg3)) {
                class80.method495(this.field194, (int) (this.field206 - this.field192), arg2, arg0, arg3);
                this.field206 += arg3;
                return;
            }
            long var5 = this.field206;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field205 <= this.field206 && (long) this.field189 + this.field205 > this.field206) {
                int var9 = (int) ((long) this.field189 + this.field205 - this.field206);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class80.method495(this.field186, (int) (this.field206 - this.field205), arg2, arg0, var9);
                this.field206 += var9;
                arg0 += var9;
            }
            if (this.field186.length < arg3) {
                this.field184.method1234(this.field206, -1);
                this.field197 = this.field206;
                while (arg3 > 0) {
                    int var11 = this.field184.method1229(arg2, arg3, arg0, true);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 -= var11;
                    this.field197 += var11;
                    arg0 += var11;
                    this.field206 += var11;
                }
            } else if (arg3 > 0) {
                int var10 = arg3;
                this.method74(arg1 ^ 0xF4143DFF);
                if (this.field189 < arg3) {
                    var10 = this.field189;
                }
                arg3 -= var10;
                class80.method495(this.field186, 0, arg2, arg0, var10);
                arg0 += var10;
                this.field206 += var10;
            }
            if (this.field192 != -1L) {
                if (this.field206 < this.field192 && arg3 > 0) {
                    int var12 = (int) (this.field192 - this.field206) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        this.field206++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < (long) this.field199 + this.field192 && (long) this.field199 + this.field192 <= (long) var8 + var5) {
                    var15 = (long) this.field199 + this.field192;
                } else if (this.field192 < (long) var8 + var5 && (long) this.field199 + this.field192 >= (long) var8 + var5) {
                    var15 = var5 + (long) var8;
                }
                if (var5 <= this.field192 && var5 + (long) var8 > this.field192) {
                    var13 = this.field192;
                } else if (this.field192 <= var5 && var5 < this.field192 + (long) this.field199) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class80.method495(this.field194, (int) (var13 - this.field192), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field206 < var15) {
                        arg3 = (int) ((long) arg3 + this.field206 - var15);
                        this.field206 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field197 = -1L;
            throw var19;
        }
        if (~arg3 < arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B[B)V")
    public final void method70(byte arg0, byte[] arg1) throws IOException {
        this.method69(0, -1, arg1, arg1.length);
        if (arg0 <= -70) {
            field209++;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZB)V")
    public static final void method71(boolean arg0, byte arg1) {
        if (class210.field3854.field673 >> 7 == class13.field174 && class210.field3854.field723 >> 7 == class84.field1470) {
            class13.field174 = 0;
        }
        int var2 = class160.field2906;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class159 var4;
            long var5;
            if (arg0) {
                var4 = class210.field3854;
                var5 = 8791798054912L;
            } else {
                var4 = class68.field1120[class33.field527[var3]];
                var5 = (long) class33.field527[var3] << 32;
            }
            if (var4 != null && var4.method291(107)) {
                var4.field2881 = false;
                int var7 = var4.field673 >> 7;
                if ((class66.field1096 && class160.field2906 > 50 || class160.field2906 > 200) && !arg0 && var4.field737 == var4.field715) {
                    var4.field2881 = true;
                }
                int var8 = var4.field723 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field2896 == null || class30.field460 < var4.field2901 || var4.field2899 <= class30.field460) {
                        if ((var4.field673 & 0x7F) == 64 && (var4.field723 & 0x7F) == 64) {
                            if (class117.field2237[var7][var8] == class209.field3800) {
                                continue;
                            }
                            class117.field2237[var7][var8] = class209.field3800;
                        }
                        var4.field719 = class195.method1239(var4.field723, class139.field2615, false, var4.field673);
                        class35.method249(class139.field2615, var4.field673, var4.field723, var4.field719, 60, var4, var4.field707, var5, var4.field674);
                    } else {
                        var4.field2881 = false;
                        var4.field719 = class195.method1239(var4.field723, class139.field2615, false, var4.field673);
                        class191.method1216(class139.field2615, var4.field673, var4.field723, var4.field719, var4, var4.field707, var5, var4.field2879, var4.field2888, var4.field2882, var4.field2889);
                    }
                }
            }
        }
        field208++;
        if (arg1 > -102) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method72(byte arg0) {
        field196 = null;
        field203 = null;
        field202 = null;
        field191 = null;
        field179 = null;
        field185 = null;
        field181 = null;
        int var1 = 56 % ((arg0 - 20) / 51);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)J")
    public final long method73(int arg0) {
        if (arg0 != -1) {
            this.method77(-90);
        }
        field198++;
        return this.field183;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V")
    private final void method74(int arg0) throws IOException {
        if (arg0 != 200000000) {
            return;
        }
        this.field189 = 0;
        field177++;
        if (this.field206 != this.field197) {
            this.field184.method1234(this.field206, -1);
            this.field197 = this.field206;
        }
        this.field205 = this.field206;
        while (this.field186.length > this.field189) {
            int var2 = this.field186.length - this.field189;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field184.method1229(this.field186, var2, this.field189, true);
            if (var3 == -1) {
                break;
            }
            this.field197 += var3;
            this.field189 += var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III[B)V")
    public final void method75(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field195++;
        try {
            if (arg2 != 1) {
                this.field192 = -127L;
            }
            if (this.field206 + (long) arg0 > this.field183) {
                this.field183 = (long) arg0 + this.field206;
            }
            if (this.field192 != -1L && (this.field192 > this.field206 || this.field206 > (long) this.field199 + this.field192)) {
                this.method66(arg2 ^ 0xFFFFFFFE);
            }
            if (this.field192 != -1L && (long) this.field194.length + this.field192 < (long) arg0 + this.field206) {
                int var5 = (int) (this.field192 + (long) this.field194.length - this.field206);
                arg0 -= var5;
                class80.method495(arg3, arg1, this.field194, (int) (this.field206 - this.field192), var5);
                this.field206 += var5;
                this.field199 = this.field194.length;
                arg1 += var5;
                this.method66(-1);
            }
            if (arg0 > this.field194.length) {
                if (this.field206 != this.field197) {
                    this.field184.method1234(this.field206, arg2 ^ 0xFFFFFFFE);
                    this.field197 = this.field206;
                }
                this.field184.method1233(arg0, arg1, arg3, (byte) -95);
                long var6 = -1L;
                this.field197 += arg0;
                if (this.field188 < this.field197) {
                    this.field188 = this.field197;
                }
                if (this.field205 <= this.field206 && (long) this.field189 + this.field205 > this.field206) {
                    var6 = this.field206;
                } else if (this.field206 <= this.field205 && (long) arg0 + this.field206 > this.field205) {
                    var6 = this.field205;
                }
                long var8 = -1L;
                if (this.field205 < this.field206 + (long) arg0 && (long) arg0 + this.field206 <= (long) this.field189 + this.field205) {
                    var8 = (long) arg0 + this.field206;
                } else if (this.field206 < (long) this.field189 + this.field205 && (long) arg0 + this.field206 >= this.field205 - -((long) this.field189)) {
                    var8 = (long) this.field189 + this.field205;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class80.method495(arg3, (int) (var6 + (long) arg1 - this.field206), this.field186, (int) (var6 - this.field205), var10);
                }
                this.field206 += arg0;
            } else if (arg0 > 0) {
                if (this.field192 == -1L) {
                    this.field192 = this.field206;
                }
                class80.method495(arg3, arg1, this.field194, (int) (this.field206 - this.field192), arg0);
                this.field206 += arg0;
                if ((long) this.field199 < this.field206 - this.field192) {
                    this.field199 = (int) (this.field206 - this.field192);
                }
            }
        } catch (IOException var12) {
            this.field197 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([Lgi;IIB)V")
    public static final void method76(class75[] arg0, int arg1, int arg2, byte arg3) {
        if (arg2 > arg1) {
            int var4 = arg1 - 1;
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2 + 1;
            class75 var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            while (var4 < var6) {
                boolean var8 = true;
                do {
                    var6--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class236.field4283[var9] == 2) {
                            var10 = arg0[var6].field1253;
                            var11 = var7.field1253;
                        } else if (class236.field4283[var9] == 1) {
                            var10 = arg0[var6].field1256;
                            var11 = var7.field1256;
                            if (var11 == -1 && class145.field2702[var9] == 1) {
                                var11 = 2001;
                            }
                            if (var10 == -1 && class145.field2702[var9] == 1) {
                                var10 = 2001;
                            }
                        } else if (class236.field4283[var9] == 3) {
                            var10 = arg0[var6].field1257 ? 1 : 0;
                            var11 = var7.field1257 ? 1 : 0;
                        } else {
                            var11 = var7.field1251;
                            var10 = arg0[var6].field1251;
                        }
                        if (var10 != var11) {
                            if ((class145.field2702[var9] != 1 || var10 <= var11) && (class145.field2702[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class236.field4283[var13] == 2) {
                            var14 = arg0[var4].field1253;
                            var15 = var7.field1253;
                        } else if (class236.field4283[var13] == 1) {
                            var15 = var7.field1256;
                            if (var15 == -1 && class145.field2702[var13] == 1) {
                                var15 = 2001;
                            }
                            var14 = arg0[var4].field1256;
                            if (var14 == -1 && class145.field2702[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class236.field4283[var13] == 3) {
                            var15 = var7.field1257 ? 1 : 0;
                            var14 = arg0[var4].field1257 ? 1 : 0;
                        } else {
                            var14 = arg0[var4].field1251;
                            var15 = var7.field1251;
                        }
                        if (var14 != var15) {
                            if ((class145.field2702[var13] != 1 || var14 >= var15) && (class145.field2702[var13] != 0 || var15 >= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var6 > var4) {
                    class75 var16 = arg0[var4];
                    arg0[var4] = arg0[var6];
                    arg0[var6] = var16;
                }
            }
            method76(arg0, arg1, var6, (byte) 101);
            method76(arg0, var6 + 1, arg2, (byte) 85);
        }
        if (arg3 < 80) {
            method76(null, 124, -110, (byte) -48);
        }
        field207++;
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Ljava/io/File;")
    private final File method77(int arg0) {
        int var2 = -35 / ((arg0 + 61) / 42);
        field200++;
        return this.field184.method1231(true);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lri;II)V")
    public class14(class193 arg0, int arg1, int arg2) throws IOException {
        this.field184 = arg0;
        this.field183 = this.field188 = arg0.method1232(1);
        this.field194 = new byte[arg2];
        this.field206 = 0L;
        this.field186 = new byte[arg1];
    }
}
