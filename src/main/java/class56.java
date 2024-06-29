import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class56 {

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "J")
    private long field758 = -1L;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "J")
    private long field779 = -1L;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
    private int field772 = 0;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "Lnn;")
    private class120 field780;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
    private long field776;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "J")
    private long field771;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "J")
    private long field773;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[B")
    private byte[] field762;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "[B")
    private byte[] field781;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field770 = "Loading sprites - ";

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field769 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field775 = -1;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    private int field768;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "J")
    private long field759;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IJ)V", line = 6)
    public static final void method383(int arg0, long arg1) {
        class90.field1264.field4777 = 0;
        field778++;
        class90.field1264.method2184((byte) 89, 21);
        if (arg0 != 221) {
            field775 = -52;
        }
        class90.field1264.method2202(arg1, arg0 - 328);
        class243.field3485 = -3;
        class63.field817 = 0;
        class275.field4128 = 1;
        class174.field2375 = 0;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZIII)V", line = 24)
    public static final void method384(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field757++;
        if (arg1) {
            method386((byte) 82);
        }
        if (arg0 > arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class126.field1723[var5][arg3] = arg2;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class126.field1723[var6][arg3] = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)J", line = 63)
    public final long method385(int arg0) {
        if (arg0 != -1) {
            method387(false);
        }
        field755++;
        return this.field771;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 75)
    public static final void method386(byte arg0) {
        field763++;
        class23.field295.method724(0);
        class326.field4926.method724(0);
        if (arg0 > 40) {
            class143.field1950.method724(0);
            class44.field534.method724(0);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V", line = 89)
    public static void method387(boolean arg0) {
        if (arg0) {
            method390((byte) 60);
        }
        field770 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)V", line = 100)
    public final void method388(byte arg0, long arg1) throws IOException {
        int var4 = 38 / ((-arg0 - 47) / 62);
        field766++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method395(220));
        }
        this.field773 = arg1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)I", line = 116)
    public static final int method389(byte arg0, int arg1, int arg2) {
        field754++;
        int var3 = -113 / ((39 - arg0) / 60);
        int var4 = arg2 + (arg1 * 57);
        int var5 = var4 ^ var4 << 13;
        int var6 = Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589;
        return var6 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V", line = 139)
    public static final void method390(byte arg0) {
        if (arg0 != 3) {
            field765 = 3;
        }
        if (class80.field1149.toLowerCase().indexOf("microsoft") == -1) {
            class132.field1813[93] = 43;
            class132.field1813[47] = 73;
            class132.field1813[61] = 27;
            class132.field1813[91] = 42;
            class132.field1813[46] = 72;
            class132.field1813[92] = 74;
            class132.field1813[45] = 26;
            class132.field1813[44] = 71;
            if (class80.field1168 == null) {
                class132.field1813[192] = 58;
                class132.field1813[222] = 59;
            } else {
                class132.field1813[520] = 59;
                class132.field1813[192] = 28;
                class132.field1813[222] = 58;
            }
            class132.field1813[59] = 57;
        } else {
            class132.field1813[191] = 73;
            class132.field1813[220] = 74;
            class132.field1813[221] = 43;
            class132.field1813[219] = 42;
            class132.field1813[222] = 59;
            class132.field1813[189] = 26;
            class132.field1813[223] = 28;
            class132.field1813[190] = 72;
            class132.field1813[187] = 27;
            class132.field1813[186] = 57;
            class132.field1813[192] = 58;
            class132.field1813[188] = 71;
        }
        field764++;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lnn;II)V", line = 692)
    public class56(class120 arg0, int arg1, int arg2) throws IOException {
        this.field780 = arg0;
        this.field771 = this.field776 = arg0.method872(0);
        this.field773 = 0L;
        this.field762 = new byte[arg1];
        this.field781 = new byte[arg2];
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 199)
    private final void method391(int arg0) throws IOException {
        this.field768 = 0;
        if (arg0 != 200000000) {
            method386((byte) -3);
        }
        field760++;
        if (this.field773 != this.field759) {
            this.field780.method875(this.field773, false);
            this.field759 = this.field773;
        }
        this.field779 = this.field773;
        while (this.field768 < this.field762.length) {
            int var2 = this.field762.length - this.field768;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field780.method874(var2, this.field768, this.field762, (byte) -119);
            if (var3 == -1) {
                break;
            }
            this.field768 += var3;
            this.field759 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB[BI)V", line = 243)
    public final void method392(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field761++;
        try {
            if (arg2.length < arg0 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1 != -75) {
                this.method395(1);
            }
            if (this.field758 != -1L && this.field758 <= this.field773 && ((long) this.field772 + this.field758) >= (this.field773 + ((long) arg3))) {
                class281.method1943(this.field781, (int) (this.field773 - this.field758), arg2, arg0, arg3);
                this.field773 += (long) arg3;
                return;
            }
            int var5 = arg0;
            int var6 = arg3;
            long var7 = this.field773;
            if (this.field773 >= this.field779 && this.field773 < (this.field779 + ((long) this.field768))) {
                int var9 = (int) (this.field779 + (long) this.field768 - this.field773);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class281.method1943(this.field762, (int) (this.field773 - this.field779), arg2, arg0, var9);
                arg3 -= var9;
                this.field773 += (long) var9;
                arg0 += var9;
            }
            if (this.field762.length < arg3) {
                this.field780.method875(this.field773, false);
                this.field759 = this.field773;
                while (arg3 > 0) {
                    int var10 = this.field780.method874(arg3, arg0, arg2, (byte) -115);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg3 -= var10;
                    this.field773 += (long) var10;
                    this.field759 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method391(arg1 ^ 0xF4143DB5);
                int var11 = arg3;
                if (arg3 > this.field768) {
                    var11 = this.field768;
                }
                arg3 -= var11;
                class281.method1943(this.field762, 0, arg2, arg0, var11);
                this.field773 += (long) var11;
                arg0 += var11;
            }
            if (this.field758 != -1L) {
                if (this.field773 < this.field758 && arg3 > 0) {
                    int var12 = (int) (this.field758 - this.field773) + arg0;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field773++;
                    }
                }
                long var13 = -1L;
                if ((long) this.field772 + this.field758 > var7 && (long) this.field772 + this.field758 <= (long) var6 + var7) {
                    var13 = (long) this.field772 + this.field758;
                } else if ((long) var6 + var7 > this.field758 && ((long) this.field772 + this.field758) >= ((long) var6 + var7)) {
                    var13 = var7 + ((long) var6);
                }
                long var15 = -1L;
                if (this.field758 >= var7 && this.field758 < ((long) var6 + var7)) {
                    var15 = this.field758;
                } else if (this.field758 <= var7 && var7 < (long) this.field772 + this.field758) {
                    var15 = var7;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class281.method1943(this.field781, (int) (var15 - this.field758), arg2, (int) (var15 - var7) + var5, var17);
                    if (var13 > this.field773) {
                        arg3 = (int) ((long) arg3 - (var13 - this.field773));
                        this.field773 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field759 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V", line = 429)
    private final void method393(byte arg0) throws IOException {
        field767++;
        if (arg0 <= 38) {
            this.field762 = (byte[]) null;
        }
        if (this.field758 == -1L) {
            return;
        }
        if (this.field759 != this.field758) {
            this.field780.method875(this.field758, false);
            this.field759 = this.field758;
        }
        long var2 = -1L;
        this.field780.method871((byte) -69, 0, this.field772, this.field781);
        if (this.field779 <= this.field758 && (long) this.field768 + this.field779 > this.field758) {
            var2 = this.field758;
        } else if (this.field779 >= this.field758 && this.field779 < (this.field758 + ((long) this.field772))) {
            var2 = this.field779;
        }
        long var4 = -1L;
        this.field759 += (long) this.field772;
        if (this.field759 > this.field776) {
            this.field776 = this.field759;
        }
        if ((this.field758 + ((long) this.field772)) > this.field779 && this.field779 + ((long) this.field768) >= (long) this.field772 + this.field758) {
            var4 = (long) this.field772 + this.field758;
        } else if (((long) this.field768 + this.field779) > this.field758 && (long) this.field772 + this.field758 >= (long) this.field768 + this.field779) {
            var4 = (long) this.field768 + this.field779;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class281.method1943(this.field781, (int) (var2 - this.field758), this.field762, (int) (var2 - this.field779), var6);
        }
        this.field772 = 0;
        this.field758 = -1L;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[B)V", line = 506)
    public final void method394(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field777++;
        try {
            if (this.field771 < (long) arg2 + this.field773) {
                this.field771 = (long) arg2 + this.field773;
            }
            if (this.field758 != -1L && (this.field758 > this.field773 || ((long) this.field772 + this.field758) < this.field773)) {
                this.method393((byte) 72);
            }
            if (arg1 != 0) {
                method387(true);
            }
            if (this.field758 != -1L && (this.field773 + ((long) arg2)) > ((long) this.field781.length + this.field758)) {
                int var5 = (int) (this.field758 + (long) this.field781.length - this.field773);
                arg2 -= var5;
                class281.method1943(arg3, arg0, this.field781, (int) (this.field773 - this.field758), var5);
                this.field773 += (long) var5;
                arg0 += var5;
                this.field772 = this.field781.length;
                this.method393((byte) 90);
            }
            if (arg2 > this.field781.length) {
                if (this.field773 != this.field759) {
                    this.field780.method875(this.field773, false);
                    this.field759 = this.field773;
                }
                this.field780.method871((byte) -69, arg0, arg2, arg3);
                this.field759 += (long) arg2;
                if (this.field759 > this.field776) {
                    this.field776 = this.field759;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field779 < (long) arg2 + this.field773 && ((long) arg2 + this.field773) <= ((long) this.field768 + this.field779)) {
                    var6 = this.field773 + ((long) arg2);
                } else if ((long) this.field768 + this.field779 > this.field773 && (long) arg2 + this.field773 >= this.field779 - -((long) this.field768)) {
                    var6 = (long) this.field768 + this.field779;
                }
                if (this.field773 >= this.field779 && this.field773 < (long) this.field768 + this.field779) {
                    var8 = this.field773;
                } else if (this.field779 >= this.field773 && this.field779 < (long) arg2 + this.field773) {
                    var8 = this.field779;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class281.method1943(arg3, (int) ((long) arg0 + var8 - this.field773), this.field762, (int) (var8 - this.field779), var10);
                }
                this.field773 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field758 == -1L) {
                    this.field758 = this.field773;
                }
                class281.method1943(arg3, arg0, this.field781, (int) (this.field773 - this.field758), arg2);
                this.field773 += (long) arg2;
                if ((this.field773 - this.field758) > ((long) this.field772)) {
                    this.field772 = (int) (this.field773 - this.field758);
                }
            }
        } catch (IOException var12) {
            this.field759 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)Ljava/io/File;", line = 635)
    private final File method395(int arg0) {
        if (arg0 != 220) {
            method383(-5, 66L);
        }
        field753++;
        return this.field780.method873(-11680);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z[B)V", line = 664)
    public final void method396(boolean arg0, byte[] arg1) throws IOException {
        field774++;
        if (arg0) {
            this.method392(0, (byte) -75, arg1, arg1.length);
        }
    }
}
