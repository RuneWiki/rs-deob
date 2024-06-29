import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class256 {

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private int field4179 = 0;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "J")
    private long field4178 = -1L;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "J")
    private long field4166 = -1L;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Lch;")
    private class132 field4183;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "J")
    private long field4172;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "J")
    private long field4171;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "[B")
    private byte[] field4184;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "J")
    private long field4182;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[B")
    private byte[] field4168;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public static int field4185 = 0;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    private int field4170;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "J")
    private long field4180;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I[BII)V")
    public final void method1810(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4175++;
        try {
            if (arg1.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field4178 != -1L && this.field4178 <= this.field4182 && (long) this.field4179 + this.field4178 >= (long) arg0 + this.field4182) {
                class103.method689(this.field4184, (int) (this.field4182 - this.field4178), arg1, arg2, arg0);
                this.field4182 += (long) arg0;
                return;
            }
            if (arg3 > -113) {
                this.field4179 = 68;
            }
            int var5 = arg0;
            int var6 = arg2;
            long var7 = this.field4182;
            if (this.field4166 <= this.field4182 && this.field4182 < (this.field4166 + ((long) this.field4170))) {
                int var9 = (int) (this.field4166 + (long) this.field4170 - this.field4182);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class103.method689(this.field4168, (int) (this.field4182 - this.field4166), arg1, arg2, var9);
                arg0 -= var9;
                this.field4182 += (long) var9;
                arg2 += var9;
            }
            if (this.field4168.length < arg0) {
                this.field4183.method842(this.field4182, (byte) -124);
                this.field4180 = this.field4182;
                while (arg0 > 0) {
                    int var11 = this.field4183.method840(arg0, -1, arg1, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    this.field4182 += (long) var11;
                    arg0 -= var11;
                    this.field4180 += (long) var11;
                }
            } else if (arg0 > 0) {
                int var10 = arg0;
                this.method1811(false);
                if (this.field4170 < arg0) {
                    var10 = this.field4170;
                }
                class103.method689(this.field4168, 0, arg1, arg2, var10);
                arg2 += var10;
                this.field4182 += (long) var10;
                arg0 -= var10;
            }
            if (this.field4178 != -1L) {
                if (this.field4182 < this.field4178 && arg0 > 0) {
                    int var12 = arg2 + ((int) (this.field4178 - this.field4182));
                    if ((arg2 + arg0) < var12) {
                        var12 = arg2 + arg0;
                    }
                    while (arg2 < var12) {
                        arg0--;
                        arg1[arg2++] = 0;
                        this.field4182++;
                    }
                }
                long var13 = -1L;
                if ((long) this.field4179 + this.field4178 > var7 && (long) var5 + var7 >= (long) this.field4179 + this.field4178) {
                    var13 = (long) this.field4179 + this.field4178;
                } else if (this.field4178 < ((long) var5 + var7) && ((long) var5 + var7) <= ((long) this.field4179 + this.field4178)) {
                    var13 = (long) var5 + var7;
                }
                long var15 = -1L;
                if (var7 <= this.field4178 && this.field4178 < ((long) var5 + var7)) {
                    var15 = this.field4178;
                } else if (var7 >= this.field4178 && var7 < (long) this.field4179 + this.field4178) {
                    var15 = var7;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class103.method689(this.field4184, (int) (var15 - this.field4178), arg1, var6 + ((int) (var15 - var7)), var17);
                    if (this.field4182 < var13) {
                        arg0 = (int) ((long) arg0 - (var13 - this.field4182));
                        this.field4182 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4180 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V")
    private final void method1811(boolean arg0) throws IOException {
        this.field4170 = 0;
        field4177++;
        if (arg0) {
            method1820(107, (String) null);
        }
        if (this.field4182 != this.field4180) {
            this.field4183.method842(this.field4182, (byte) 48);
            this.field4180 = this.field4182;
        }
        this.field4166 = this.field4182;
        while (this.field4170 < this.field4168.length) {
            int var2 = this.field4168.length - this.field4170;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4183.method840(var2, -1, this.field4168, this.field4170);
            if (var3 == -1) {
                break;
            }
            this.field4180 += (long) var3;
            this.field4170 += var3;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)J")
    public final long method1812(boolean arg0) {
        if (arg0) {
            this.method1816(-113);
        }
        field4163++;
        return this.field4171;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "([BB)V")
    public final void method1813(byte[] arg0, byte arg1) throws IOException {
        this.method1810(arg0.length, arg0, 0, -124);
        if (arg1 >= -30) {
            this.field4183 = null;
        }
        field4187++;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IILvl;)[Lca;")
    public static final class91[] method1814(int arg0, int arg1, class73 arg2) {
        if (arg0 == -16586) {
            field4165++;
            return class75.method521(arg1, arg2, (byte) -111) ? class28.method143(-4) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(JB)V")
    public final void method1815(long arg0, byte arg1) throws IOException {
        if (arg1 != 98) {
            this.field4180 = 55L;
        }
        field4174++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1816(16101));
        }
        this.field4182 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1816(int arg0) {
        field4173++;
        if (arg0 != 16101) {
            field4164 = 2;
        }
        return this.field4183.method837(0);
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
    private final void method1817(int arg0) throws IOException {
        field4186++;
        if (this.field4178 != -1L) {
            long var2 = -1L;
            if (this.field4180 != this.field4178) {
                this.field4183.method842(this.field4178, (byte) -120);
                this.field4180 = this.field4178;
            }
            long var4 = -1L;
            this.field4183.method838(this.field4184, 0, this.field4179, 1);
            this.field4180 += (long) this.field4179;
            if ((this.field4178 + ((long) this.field4179)) > this.field4166 && ((long) this.field4170 + this.field4166) >= ((long) this.field4179 + this.field4178)) {
                var4 = (long) this.field4179 + this.field4178;
            } else if (this.field4178 < this.field4166 + ((long) this.field4170) && (long) this.field4179 + this.field4178 >= this.field4166 - -((long) this.field4170)) {
                var4 = (long) this.field4170 + this.field4166;
            }
            if (this.field4178 >= this.field4166 && this.field4178 < (long) this.field4170 + this.field4166) {
                var2 = this.field4178;
            } else if (this.field4166 >= this.field4178 && this.field4166 < (long) this.field4179 + this.field4178) {
                var2 = this.field4166;
            }
            if (this.field4172 < this.field4180) {
                this.field4172 = this.field4180;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class103.method689(this.field4184, (int) (var2 - this.field4178), this.field4168, (int) (var2 - this.field4166), var6);
            }
            this.field4179 = 0;
            this.field4178 = -1L;
        }
        if (arg0 != -27337) {
            this.method1816(22);
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static final void method1818(int arg0) {
        field4169++;
        class179.field2810.method2050(true);
        class294.field4712 = arg0;
        class138.field1992 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[BI)V")
    public final void method1819(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field4167++;
        if (arg1 != -1) {
            this.field4184 = null;
        }
        try {
            if (((long) arg3 + this.field4182) > this.field4171) {
                this.field4171 = this.field4182 + ((long) arg3);
            }
            if (this.field4178 != -1L && (this.field4182 < this.field4178 || ((long) this.field4179 + this.field4178) < this.field4182)) {
                this.method1817(arg1 - 27336);
            }
            if (this.field4178 != -1L && (this.field4182 + ((long) arg3)) > ((long) this.field4184.length + this.field4178)) {
                int var5 = (int) (this.field4178 + (long) this.field4184.length - this.field4182);
                arg3 -= var5;
                class103.method689(arg2, arg0, this.field4184, (int) (this.field4182 - this.field4178), var5);
                this.field4182 += (long) var5;
                this.field4179 = this.field4184.length;
                arg0 += var5;
                this.method1817(-27337);
            }
            if (this.field4184.length < arg3) {
                if (this.field4182 != this.field4180) {
                    this.field4183.method842(this.field4182, (byte) -119);
                    this.field4180 = this.field4182;
                }
                this.field4183.method838(arg2, arg0, arg3, 1);
                long var6 = -1L;
                if (this.field4166 <= this.field4182 && this.field4182 < ((long) this.field4170 + this.field4166)) {
                    var6 = this.field4182;
                } else if (this.field4182 <= this.field4166 && this.field4166 < (long) arg3 + this.field4182) {
                    var6 = this.field4166;
                }
                long var8 = -1L;
                if (this.field4166 < ((long) arg3 + this.field4182) && (long) arg3 + this.field4182 <= (long) this.field4170 + this.field4166) {
                    var8 = (long) arg3 + this.field4182;
                } else if ((long) this.field4170 + this.field4166 > this.field4182 && ((long) arg3 + this.field4182) >= ((long) this.field4170 + this.field4166)) {
                    var8 = (long) this.field4170 + this.field4166;
                }
                this.field4180 += (long) arg3;
                if (this.field4180 > this.field4172) {
                    this.field4172 = this.field4180;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class103.method689(arg2, (int) ((long) arg0 + var6 - this.field4182), this.field4168, (int) (var6 - this.field4166), var10);
                }
                this.field4182 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field4178 == -1L) {
                    this.field4178 = this.field4182;
                }
                class103.method689(arg2, arg0, this.field4184, (int) (this.field4182 - this.field4178), arg3);
                this.field4182 += (long) arg3;
                if ((this.field4182 - this.field4178) > ((long) this.field4179)) {
                    this.field4179 = (int) (this.field4182 - this.field4178);
                }
            }
        } catch (IOException var12) {
            this.field4180 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1820(int arg0, String arg1) {
        String var2 = class178.method1264(class176.method1256((byte) 127, arg1), (byte) 103);
        if (arg0 != -16963) {
            field4164 = -2;
        }
        if (var2 == null) {
            var2 = "";
        }
        field4162++;
        return var2;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Lch;II)V")
    public class256(class132 arg0, int arg1, int arg2) throws IOException {
        this.field4183 = arg0;
        this.field4171 = this.field4172 = arg0.method839((byte) 108);
        this.field4184 = new byte[arg2];
        this.field4182 = 0L;
        this.field4168 = new byte[arg1];
    }
}
