import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class432 {

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "J")
    private long field5894 = -1L;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    private int field5900 = 0;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "J")
    private long field5884 = -1L;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lib;")
    private class7 field5889;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "J")
    private long field5885;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "J")
    private long field5886;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "J")
    private long field5898;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "[B")
    private byte[] field5890;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[B")
    private byte[] field5888;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "Lbb;")
    public static class270 field5895 = new class270();

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "I")
    public static int field5904 = 0;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "Lcq;")
    public static class72 field5905 = new class72("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "[I")
    public static int[] field5907 = new int[3];

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    private int field5891;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public static int field5899;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field5901;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public static int field5903;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "J")
    private long field5893;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
    private final void method2628(byte arg0) throws IOException {
        field5887++;
        if (this.field5894 != -1L) {
            if (this.field5894 != this.field5893) {
                this.field5889.method29(this.field5894, true);
                this.field5893 = this.field5894;
            }
            this.field5889.method31(this.field5900, false, 0, this.field5888);
            this.field5893 += (long) this.field5900;
            if (this.field5893 > this.field5885) {
                this.field5885 = this.field5893;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5894 >= this.field5884 && (this.field5884 + ((long) this.field5891)) > this.field5894) {
                var2 = this.field5894;
            } else if (this.field5894 <= this.field5884 && ((long) this.field5900 + this.field5894) > this.field5884) {
                var2 = this.field5884;
            }
            if (this.field5884 < this.field5894 + ((long) this.field5900) && (long) this.field5891 + this.field5884 >= (long) this.field5900 + this.field5894) {
                var4 = (long) this.field5900 + this.field5894;
            } else if (((long) this.field5891 + this.field5884) > this.field5894 && ((long) this.field5900 + this.field5894) >= ((long) this.field5891 + this.field5884)) {
                var4 = (long) this.field5891 + this.field5884;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class114.method667(this.field5888, (int) (var2 - this.field5894), this.field5890, (int) (var2 - this.field5884), var6);
            }
            this.field5900 = 0;
            this.field5894 = -1L;
        }
        int var7 = -114 % ((-arg0 - 14) / 63);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method2629(int arg0) {
        field5907 = null;
        field5905 = null;
        field5895 = null;
        if (arg0 != 23517) {
            method2629(-44);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BBII)V")
    public final void method2630(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field5901++;
        try {
            if (arg0.length < (arg2 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field5894 != -1L && this.field5894 <= this.field5898 && (this.field5894 + ((long) this.field5900)) >= ((long) arg3 + this.field5898)) {
                class114.method667(this.field5888, (int) (this.field5898 - this.field5894), arg0, arg2, arg3);
                this.field5898 += (long) arg3;
                return;
            }
            if (arg1 != 77) {
                return;
            }
            long var5 = this.field5898;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field5884 <= this.field5898 && ((long) this.field5891 + this.field5884) > this.field5898) {
                int var9 = (int) (this.field5884 + (long) this.field5891 - this.field5898);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class114.method667(this.field5890, (int) (this.field5898 - this.field5884), arg0, arg2, var9);
                this.field5898 += (long) var9;
                arg2 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field5890.length) {
                this.field5889.method29(this.field5898, true);
                this.field5893 = this.field5898;
                while (arg3 > 0) {
                    int var11 = this.field5889.method33(arg2, 11150, arg3, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    arg3 -= var11;
                    this.field5893 += (long) var11;
                    this.field5898 += (long) var11;
                }
            } else if (arg3 > 0) {
                this.method2632(true);
                int var10 = arg3;
                if (arg3 > this.field5891) {
                    var10 = this.field5891;
                }
                class114.method667(this.field5890, 0, arg0, arg2, var10);
                arg3 -= var10;
                this.field5898 += (long) var10;
                arg2 += var10;
            }
            if (this.field5894 != -1L) {
                if (this.field5898 < this.field5894 && arg3 > 0) {
                    int var12 = (int) (this.field5894 - this.field5898) + arg2;
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field5898++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field5894 >= var5 && this.field5894 < var5 + ((long) var8)) {
                    var13 = this.field5894;
                } else if (this.field5894 <= var5 && var5 < ((long) this.field5900 + this.field5894)) {
                    var13 = var5;
                }
                if ((this.field5894 + ((long) this.field5900)) > var5 && (long) this.field5900 + this.field5894 <= (long) var8 + var5) {
                    var15 = (long) this.field5900 + this.field5894;
                } else if (this.field5894 < ((long) var8 + var5) && ((long) var8 + var5) <= ((long) this.field5900 + this.field5894)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class114.method667(this.field5888, (int) (var13 - this.field5894), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field5898 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field5898));
                        this.field5898 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5893 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method2631(int arg0) {
        field5883++;
        int var2 = -95 % ((arg0 - 43) / 35);
        return this.field5889.method30(true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    private final void method2632(boolean arg0) throws IOException {
        this.field5891 = 0;
        field5899++;
        if (this.field5898 != this.field5893) {
            this.field5889.method29(this.field5898, true);
            this.field5893 = this.field5898;
        }
        if (!arg0) {
            this.field5889 = null;
        }
        this.field5884 = this.field5898;
        while (this.field5891 < this.field5890.length) {
            int var2 = this.field5890.length - this.field5891;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5889.method33(this.field5891, 11150, var2, this.field5890);
            if (var3 == -1) {
                break;
            }
            this.field5891 += var3;
            this.field5893 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I[BZI)V")
    public final void method2633(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field5896++;
        try {
            if (this.field5886 < (long) arg3 + this.field5898) {
                this.field5886 = this.field5898 + ((long) arg3);
            }
            if (this.field5894 != -1L && (this.field5894 > this.field5898 || this.field5898 > (long) this.field5900 + this.field5894)) {
                this.method2628((byte) -82);
            }
            if (this.field5894 != -1L && ((long) this.field5888.length + this.field5894) < (this.field5898 + ((long) arg3))) {
                int var5 = (int) (this.field5894 + (long) this.field5888.length - this.field5898);
                class114.method667(arg1, arg0, this.field5888, (int) (this.field5898 - this.field5894), var5);
                this.field5898 += (long) var5;
                arg3 -= var5;
                arg0 += var5;
                this.field5900 = this.field5888.length;
                this.method2628((byte) 60);
            }
            if (!arg2) {
                if (this.field5888.length < arg3) {
                    if (this.field5898 != this.field5893) {
                        this.field5889.method29(this.field5898, true);
                        this.field5893 = this.field5898;
                    }
                    this.field5889.method31(arg3, false, arg0, arg1);
                    this.field5893 += (long) arg3;
                    if (this.field5885 < this.field5893) {
                        this.field5885 = this.field5893;
                    }
                    long var6 = -1L;
                    if (this.field5898 >= this.field5884 && ((long) this.field5891 + this.field5884) > this.field5898) {
                        var6 = this.field5898;
                    } else if (this.field5884 >= this.field5898 && (long) arg3 + this.field5898 > this.field5884) {
                        var6 = this.field5884;
                    }
                    long var8 = -1L;
                    if (this.field5898 + ((long) arg3) > this.field5884 && ((long) arg3 + this.field5898) <= (this.field5884 + ((long) this.field5891))) {
                        var8 = (long) arg3 + this.field5898;
                    } else if (this.field5898 < (long) this.field5891 + this.field5884 && ((long) arg3 + this.field5898) >= ((long) this.field5891 + this.field5884)) {
                        var8 = (long) this.field5891 + this.field5884;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class114.method667(arg1, (int) ((long) arg0 + var6 - this.field5898), this.field5890, (int) (var6 - this.field5884), var10);
                    }
                    this.field5898 += (long) arg3;
                } else if (arg3 > 0) {
                    if (this.field5894 == -1L) {
                        this.field5894 = this.field5898;
                    }
                    class114.method667(arg1, arg0, this.field5888, (int) (this.field5898 - this.field5894), arg3);
                    this.field5898 += (long) arg3;
                    if ((this.field5898 - this.field5894) > ((long) this.field5900)) {
                        this.field5900 = (int) (this.field5898 - this.field5894);
                    }
                }
            }
        } catch (IOException var12) {
            this.field5893 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IJ)V")
    public final void method2634(int arg0, long arg1) throws IOException {
        if (arg0 != -10092) {
            return;
        }
        field5897++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2631(-124));
        }
        this.field5898 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BB)V")
    public final void method2635(byte[] arg0, byte arg1) throws IOException {
        if (arg1 == 0) {
            this.method2630(arg0, (byte) 77, 0, arg0.length);
            field5906++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwo;Lwo;Lwo;Lwo;I)V")
    public static final void method2636(class285 arg0, class285 arg1, class285 arg2, class285 arg3, int arg4) {
        class365.field4965 = arg0;
        if (arg4 != -1) {
            return;
        }
        field5892++;
        class170.field1995 = arg3;
        class214.field2647 = arg1;
        class367.field5004 = arg2;
        class362.field4903 = new class453[class365.field4965.method1793(0)][];
        class184.field2135 = new boolean[class365.field4965.method1793(0)];
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)J")
    public final long method2637(byte arg0) {
        if (arg0 < 86) {
            this.field5888 = null;
        }
        field5903++;
        return this.field5886;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lib;II)V")
    public class432(class7 arg0, int arg1, int arg2) throws IOException {
        this.field5889 = arg0;
        this.field5886 = this.field5885 = arg0.method34(0);
        this.field5898 = 0L;
        this.field5890 = new byte[arg1];
        this.field5888 = new byte[arg2];
    }
}
