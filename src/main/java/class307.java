import java.awt.Frame;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class307 {

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "J")
    private long field5226 = -1L;

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "J")
    private long field5236 = -1L;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "I")
    private int field5235 = 0;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lkb;")
    private class31 field5218;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "J")
    private long field5223;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "J")
    private long field5234;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "J")
    private long field5228;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[B")
    private byte[] field5232;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "[B")
    private byte[] field5244;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "[I")
    public static int[] field5224 = new int[2];

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "Lve;")
    public static class255 field5241 = class87.method607(71, "Wordpack geladen)3");

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "Lve;")
    public static class255 field5238 = class87.method607(48, ")4l=");

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "[I")
    public static int[] field5245 = new int[4096];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    private int field5239;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "J")
    private long field5225;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field5221;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIJ)Z", line = 6)
    public static final boolean method2128(int arg0, int arg1, int arg2, long arg3) {
        class249 var5 = class118.field1984[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field4192 != null && var5.field4192.field3674 == arg3) {
            return true;
        } else if (var5.field4183 != null && var5.field4183.field3625 == arg3) {
            return true;
        } else if (var5.field4184 != null && var5.field4184.field5200 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field4188; var6++) {
                if (var5.field4182[var6].field4206 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III[B)V", line = 58)
    public final void method2129(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field5227++;
        try {
            if (this.field5234 < (long) arg2 + this.field5228) {
                this.field5234 = (long) arg2 + this.field5228;
            }
            if (this.field5236 != -1L && (this.field5228 < this.field5236 || this.field5228 > (long) this.field5235 + this.field5236)) {
                this.method2133(true);
            }
            if (this.field5236 != -1L && ((long) this.field5232.length + this.field5236) < ((long) arg2 + this.field5228)) {
                int var5 = (int) ((long) this.field5232.length + this.field5236 - this.field5228);
                arg2 -= var5;
                class36.method216(arg3, arg0, this.field5232, (int) (this.field5228 - this.field5236), var5);
                this.field5228 += (long) var5;
                arg0 += var5;
                this.field5235 = this.field5232.length;
                this.method2133(true);
            }
            if (this.field5232.length < arg2) {
                if (this.field5228 != this.field5225) {
                    this.field5218.method181(this.field5228, arg1 + 9277);
                    this.field5225 = this.field5228;
                }
                this.field5218.method178(arg0, arg3, (byte) -13, arg2);
                this.field5225 += (long) arg2;
                long var6 = -1L;
                if (this.field5225 > this.field5223) {
                    this.field5223 = this.field5225;
                }
                long var8 = -1L;
                if (this.field5226 < (long) arg2 + this.field5228 && ((long) arg2 + this.field5228) <= (this.field5226 + ((long) this.field5239))) {
                    var8 = (long) arg2 + this.field5228;
                } else if (this.field5228 < ((long) this.field5239 + this.field5226) && (long) this.field5239 + this.field5226 <= (long) arg2 + this.field5228) {
                    var8 = (long) this.field5239 + this.field5226;
                }
                if (this.field5226 <= this.field5228 && this.field5228 < (long) this.field5239 + this.field5226) {
                    var6 = this.field5228;
                } else if (this.field5228 <= this.field5226 && this.field5226 < (long) arg2 + this.field5228) {
                    var6 = this.field5226;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class36.method216(arg3, (int) ((long) arg0 + var6 - this.field5228), this.field5244, (int) (var6 - this.field5226), var10);
                }
                this.field5228 += (long) arg2;
            } else if (~arg2 < arg1) {
                if (this.field5236 == -1L) {
                    this.field5236 = this.field5228;
                }
                class36.method216(arg3, arg0, this.field5232, (int) (this.field5228 - this.field5236), arg2);
                this.field5228 += (long) arg2;
                if ((this.field5228 - this.field5236) > ((long) this.field5235)) {
                    this.field5235 = (int) (this.field5228 - this.field5236);
                }
            }
        } catch (IOException var12) {
            this.field5225 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(JZ)V", line = 178)
    public final void method2130(long arg0, boolean arg1) throws IOException {
        field5219++;
        if (!arg1) {
            this.field5236 = -55L;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2138(-112));
        }
        this.field5228 = arg0;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5245[var0] = class199.method1429(var0, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)J", line = 207)
    public final long method2131(byte arg0) {
        if (arg0 >= -11) {
            method2128(108, -33, 18, 122L);
        }
        field5229++;
        return this.field5234;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([BI)V", line = 225)
    public final void method2132(byte[] arg0, int arg1) throws IOException {
        if (arg1 > -61) {
            this.field5239 = 27;
        }
        field5230++;
        this.method2134(arg0.length, 0, arg0, true);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lkb;II)V", line = 630)
    public class307(class31 arg0, int arg1, int arg2) throws IOException {
        this.field5218 = arg0;
        this.field5234 = this.field5223 = arg0.method179(0);
        this.field5228 = 0L;
        this.field5232 = new byte[arg2];
        this.field5244 = new byte[arg1];
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 243)
    private final void method2133(boolean arg0) throws IOException {
        field5237++;
        if (this.field5236 != -1L) {
            if (this.field5236 != this.field5225) {
                this.field5218.method181(this.field5236, 9276);
                this.field5225 = this.field5236;
            }
            this.field5218.method178(0, this.field5232, (byte) -13, this.field5235);
            long var2 = -1L;
            this.field5225 += (long) this.field5235;
            if (this.field5225 > this.field5223) {
                this.field5223 = this.field5225;
            }
            long var4 = -1L;
            if (this.field5226 < this.field5236 + ((long) this.field5235) && this.field5236 + ((long) this.field5235) <= this.field5226 - -((long) this.field5239)) {
                var2 = (long) this.field5235 + this.field5236;
            } else if (this.field5236 < ((long) this.field5239 + this.field5226) && (long) this.field5239 + this.field5226 <= (long) this.field5235 + this.field5236) {
                var2 = (long) this.field5239 + this.field5226;
            }
            if (this.field5226 <= this.field5236 && (this.field5226 + ((long) this.field5239)) > this.field5236) {
                var4 = this.field5236;
            } else if (this.field5226 >= this.field5236 && (long) this.field5235 + this.field5236 > this.field5226) {
                var4 = this.field5226;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class36.method216(this.field5232, (int) (var4 - this.field5236), this.field5244, (int) (var4 - this.field5226), var6);
            }
            this.field5235 = 0;
            this.field5236 = -1L;
        }
        if (!arg0) {
            field5241 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II[BZ)V", line = 317)
    public final void method2134(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field5242++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field5236 != -1L && this.field5228 >= this.field5236 && (long) this.field5235 + this.field5236 >= (long) arg0 + this.field5228) {
                class36.method216(this.field5232, (int) (this.field5228 - this.field5236), arg2, arg1, arg0);
                this.field5228 += (long) arg0;
                return;
            }
            long var5 = this.field5228;
            int var7 = arg1;
            if (!arg3) {
                this.field5225 = -120L;
            }
            int var8 = arg0;
            if (this.field5228 >= this.field5226 && this.field5228 < this.field5226 + ((long) this.field5239)) {
                int var9 = (int) (-this.field5228 - (-this.field5226 - (long) this.field5239));
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class36.method216(this.field5244, (int) (this.field5228 - this.field5226), arg2, arg1, var9);
                arg1 += var9;
                this.field5228 += (long) var9;
            }
            if (arg0 > this.field5244.length) {
                this.field5218.method181(this.field5228, 9276);
                this.field5225 = this.field5228;
                while (arg0 > 0) {
                    int var11 = this.field5218.method182(arg0, arg2, arg1, false);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    this.field5228 += (long) var11;
                    arg1 += var11;
                    this.field5225 += (long) var11;
                }
            } else if (arg0 > 0) {
                this.method2137(-115);
                int var10 = arg0;
                if (arg0 > this.field5239) {
                    var10 = this.field5239;
                }
                class36.method216(this.field5244, 0, arg2, arg1, var10);
                arg1 += var10;
                arg0 -= var10;
                this.field5228 += (long) var10;
            }
            if (this.field5236 != -1L) {
                if (this.field5236 > this.field5228 && arg0 > 0) {
                    int var12 = arg1 + ((int) (this.field5236 - this.field5228));
                    if (var12 > arg0 + arg1) {
                        var12 = arg1 + arg0;
                    }
                    while (arg1 < var12) {
                        arg2[arg1++] = 0;
                        this.field5228++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (this.field5236 >= var5 && ((long) var8 + var5) > this.field5236) {
                    var13 = this.field5236;
                } else if (var5 >= this.field5236 && ((long) this.field5235 + this.field5236) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field5235 + this.field5236) > var5 && ((long) this.field5235 + this.field5236) <= ((long) var8 + var5)) {
                    var15 = (long) this.field5235 + this.field5236;
                } else if ((long) var8 + var5 > this.field5236 && (this.field5236 + ((long) this.field5235)) >= (var5 + ((long) var8))) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class36.method216(this.field5232, (int) (var13 - this.field5236), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field5228) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field5228));
                        this.field5228 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5225 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 513)
    public final void method2135(int arg0) throws IOException {
        field5222++;
        if (arg0 == -1) {
            this.method2133(true);
            this.field5218.method177((byte) -74);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 525)
    public static final void method2136(byte arg0) {
        class212.field3611.method554(0);
        int var1 = -111 / ((arg0 + 11) / 61);
        field5231++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 544)
    private final void method2137(int arg0) throws IOException {
        field5233++;
        this.field5239 = 0;
        if (this.field5228 != this.field5225) {
            this.field5218.method181(this.field5228, 9276);
            this.field5225 = this.field5228;
        }
        int var2 = -18 / ((-arg0 - 65) / 34);
        this.field5226 = this.field5228;
        while (this.field5244.length > this.field5239) {
            int var3 = this.field5244.length - this.field5239;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field5218.method182(var3, this.field5244, this.field5239, false);
            if (var4 == -1) {
                break;
            }
            this.field5239 += var4;
            this.field5225 += (long) var4;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Ljava/io/File;", line = 585)
    private final File method2138(int arg0) {
        field5243++;
        int var2 = -107 / ((arg0 + 3) / 45);
        return this.field5218.method180(1);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 603)
    public static void method2139(byte arg0) {
        field5221 = null;
        field5241 = null;
        field5245 = null;
        field5224 = null;
        field5238 = null;
        if (arg0 < 11) {
            field5245 = (int[]) null;
        }
    }
}
