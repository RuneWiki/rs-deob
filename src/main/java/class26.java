import java.awt.Font;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class26 {

    @OriginalMember(owner = "client!de", name = "e", descriptor = "J")
    private long field642 = -1L;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "J")
    private long field662 = -1L;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    private int field667 = 0;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "Lbe;")
    private class13 field665;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "J")
    private long field650;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "J")
    private long field658;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "J")
    private long field641;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[B")
    private byte[] field638;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "[B")
    private byte[] field669;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field654 = 1;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "Lae;")
    public static class6 field660 = class64.method474(119, "backright1");

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    private int field652;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "J")
    private long field639;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lsd;")
    public static class114 field657;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lva;")
    public static class128 field663;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "Ljava/awt/Font;")
    public static Font field664;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "[I")
    public static int[] field640;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "[I")
    public static int[] field655;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V", line = 5)
    public final void method232(int arg0, long arg1) {
        field646++;
        if (arg1 >= 0L) {
            this.field641 = arg1;
            if (arg0 != 0) {
                this.field652 = 48;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B[Lae;)[Lae;", line = 29)
    public static final class6[] method233(byte arg0, class6[] arg1) {
        field651++;
        class6[] var2 = new class6[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = class85.method731(new class6[] { class114.method942((byte) 71, var3), class59.field1286 }, 14569);
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = class85.method731(new class6[] { var2[var3], arg1[var3] }, 14569);
            }
        }
        if (arg0 != 127) {
            method243((byte) -119);
        }
        return var2;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 55)
    public final void method234(byte arg0) throws IOException {
        field644++;
        if (arg0 <= -64) {
            this.method239(-127);
            this.field665.method132((byte) 62);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BIII)V", line = 86)
    public final void method235(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field648++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field642 != -1L && this.field641 >= this.field642 && (long) arg1 + this.field641 <= (long) this.field667 + this.field642) {
                class53.method417(this.field669, (int) (this.field641 - this.field642), arg0, arg3, arg1);
                this.field641 += arg1;
                return;
            }
            if (arg2 != -13443) {
                this.method236(42);
            }
            long var5 = this.field641;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field641 >= this.field662 && this.field641 < (long) this.field652 + this.field662) {
                int var9 = (int) ((long) this.field652 + this.field662 - this.field641);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class53.method417(this.field638, (int) (this.field641 - this.field662), arg0, arg3, var9);
                this.field641 += var9;
                arg3 += var9;
            }
            if (this.field638.length < arg1) {
                this.field665.method134(this.field641, (byte) -68);
                this.field639 = this.field641;
                while (arg1 > 0) {
                    int var11 = this.field665.method135(arg0, arg1, arg3, (byte) 67);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    arg3 += var11;
                    this.field639 += var11;
                    this.field641 += var11;
                }
            } else if (arg1 > 0) {
                this.method237(-21473);
                int var10 = arg1;
                if (this.field652 < arg1) {
                    var10 = this.field652;
                }
                arg1 -= var10;
                class53.method417(this.field638, 0, arg0, arg3, var10);
                arg3 += var10;
                this.field641 += var10;
            }
            if (this.field642 != -1L) {
                if (this.field642 > this.field641 && arg1 > 0) {
                    int var12 = arg3 + (int) (this.field642 - this.field641);
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field641++;
                    }
                }
                long var13 = -1L;
                if (var5 < this.field642 + (long) this.field667 && this.field642 + (long) this.field667 <= (long) var8 + var5) {
                    var13 = (long) this.field667 + this.field642;
                } else if (this.field642 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field667 + this.field642) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field642 >= var5 && this.field642 < (long) var8 + var5) {
                    var15 = this.field642;
                } else if (var5 >= this.field642 && this.field642 + (long) this.field667 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class53.method417(this.field669, (int) (var15 - this.field642), arg0, (int) (var15 - var5) + var7, var17);
                    if (this.field641 < var13) {
                        arg1 = (int) ((long) arg1 + this.field641 - var13);
                        this.field641 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field639 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J", line = 287)
    public final long method236(int arg0) {
        int var2 = 75 / ((arg0 + 17) / 58);
        field656++;
        return this.field658;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lbe;II)V", line = 942)
    public class26(class13 arg0, int arg1, int arg2) throws IOException {
        this.field665 = arg0;
        this.field658 = this.field650 = arg0.method136(1);
        this.field641 = 0L;
        this.field638 = new byte[arg1];
        this.field669 = new byte[arg2];
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 308)
    private final void method237(int arg0) throws IOException {
        this.field652 = 0;
        field668++;
        if (this.field641 != this.field639) {
            this.field665.method134(this.field641, (byte) -68);
            this.field639 = this.field641;
        }
        if (arg0 != -21473) {
            this.field638 = null;
        }
        this.field662 = this.field641;
        while (this.field652 < this.field638.length) {
            int var2 = this.field665.method135(this.field638, this.field638.length - this.field652, this.field652, (byte) 119);
            if (var2 == -1) {
                break;
            }
            this.field639 += var2;
            this.field652 += var2;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLbf;Lbf;)I", line = 352)
    public static final int method238(boolean arg0, class14 arg1, class14 arg2) {
        field649++;
        int var3 = 0;
        if (arg1.method147(22411, class102.field2400, class7.field147)) {
            var3++;
        }
        if (arg2.method147(22411, class102.field2400, class103.field2452)) {
            var3++;
        }
        if (arg2.method147(22411, class102.field2400, class37.field836)) {
            var3++;
        }
        if (arg2.method147(22411, class102.field2400, class126.field3087)) {
            var3++;
        }
        if (arg2.method147(22411, class102.field2400, class21.field516)) {
            var3++;
        }
        if (!arg0) {
            method238(true, null, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 388)
    private final void method239(int arg0) throws IOException {
        int var2 = -18 % ((41 - arg0) / 47);
        if (this.field642 != -1L) {
            if (this.field642 != this.field639) {
                this.field665.method134(this.field642, (byte) -68);
                this.field639 = this.field642;
            }
            long var3 = -1L;
            this.field665.method137(true, this.field667, 0, this.field669);
            if (this.field662 <= this.field642 && this.field642 < (long) this.field652 + this.field662) {
                var3 = this.field642;
            } else if (this.field662 >= this.field642 && this.field662 < this.field642 + (long) this.field667) {
                var3 = this.field662;
            }
            this.field639 += this.field667;
            long var5 = -1L;
            if (this.field639 > this.field650) {
                this.field650 = this.field639;
            }
            if (this.field662 < this.field642 + (long) this.field667 && this.field662 + (long) this.field652 >= (long) this.field667 + this.field642) {
                var5 = (long) this.field667 + this.field642;
            } else if (this.field662 + (long) this.field652 > this.field642 && (long) this.field652 + this.field662 <= (long) this.field667 + this.field642) {
                var5 = (long) this.field652 + this.field662;
            }
            if (var3 > -1L && var3 < var5) {
                int var7 = (int) (var5 - var3);
                class53.method417(this.field669, (int) (var3 - this.field642), this.field638, (int) (var3 - this.field662), var7);
            }
            this.field667 = 0;
            this.field642 = -1L;
        }
        field666++;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 474)
    public static void method240(int arg0) {
        field640 = null;
        field655 = null;
        if (arg0 != -1) {
            method233((byte) -74, null);
        }
        field664 = null;
        field663 = null;
        field657 = null;
        field660 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILsb;)V", line = 493)
    public static final void method241(int arg0, int arg1, class111 arg2) {
        field659++;
        if (arg0 != -14) {
            return;
        }
        while (true) {
            class78 var3 = (class78) class24.field616.method798(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1894; var5++) {
                if (var3.field1883[var5] != null) {
                    if (var3.field1883[var5].field2686 == 2) {
                        var3.field1882[var5] = -5;
                    }
                    if (var3.field1883[var5].field2686 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1895[var5] != null) {
                    if (var3.field1895[var5].field2686 == 2) {
                        var3.field1882[var5] = -6;
                    }
                    if (var3.field1895[var5].field2686 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method938((byte) 63, arg1);
            arg2.method641((byte) -28, 0);
            int var6 = arg2.field1821;
            arg2.method644(var3.field1876, (byte) 38);
            for (int var7 = 0; var7 < var3.field1894; var7++) {
                if (var3.field1882[var7] == 0) {
                    try {
                        int var8 = var3.field1884[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1883[var7].field2687;
                            int var13 = var12.getInt(null);
                            arg2.method641((byte) -28, 0);
                            arg2.method644(var13, (byte) 38);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field1883[var7].field2687;
                            var9.setInt(null, var3.field1886[var7]);
                            arg2.method641((byte) -28, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field1883[var7].field2687;
                            int var11 = var10.getModifiers();
                            arg2.method641((byte) -28, 0);
                            arg2.method644(var11, (byte) 38);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1895[var7].field2687;
                            byte[][] var15 = var3.field1889[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method641((byte) -28, 0);
                            } else if (var19 instanceof Number) {
                                arg2.method641((byte) -28, 1);
                                arg2.method639(true, ((Number) var19).longValue());
                            } else if (var19 instanceof class6) {
                                arg2.method641((byte) -28, 2);
                                arg2.method670((byte) 72, (class6) var19);
                            } else {
                                arg2.method641((byte) -28, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1895[var7].field2687;
                            int var21 = var20.getModifiers();
                            arg2.method641((byte) -28, 0);
                            arg2.method644(var21, (byte) 38);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method641((byte) -28, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method641((byte) -28, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method641((byte) -28, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method641((byte) -28, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method641((byte) -28, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method641((byte) -28, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method641((byte) -28, -16);
                    } catch (SecurityException var29) {
                        arg2.method641((byte) -28, -17);
                    } catch (IOException var30) {
                        arg2.method641((byte) -28, -18);
                    } catch (NullPointerException var31) {
                        arg2.method641((byte) -28, -19);
                    } catch (Exception var32) {
                        arg2.method641((byte) -28, -20);
                    } catch (Throwable var33) {
                        arg2.method641((byte) -28, -21);
                    }
                } else {
                    arg2.method641((byte) -28, var3.field1882[var7]);
                }
            }
            arg2.method627(arg0 + 135, var6);
            arg2.method652(arg2.field1821 - var6, -12139);
            var3.method498(124);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(III[B)V", line = 691)
    public final void method242(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field645++;
        try {
            if ((long) arg0 + this.field641 > this.field658) {
                this.field658 = (long) arg0 + this.field641;
            }
            if (arg2 == -23910) {
                if (this.field642 != -1L && (this.field642 > this.field641 || (long) this.field667 + this.field642 < this.field641)) {
                    this.method239(-77);
                }
                if (this.field642 != -1L && (long) this.field669.length + this.field642 < this.field641 - -((long) arg0)) {
                    int var5 = (int) ((long) this.field669.length + this.field642 - this.field641);
                    arg0 -= var5;
                    class53.method417(arg3, arg1, this.field669, (int) (this.field641 - this.field642), var5);
                    this.field641 += var5;
                    this.field667 = this.field669.length;
                    this.method239(125);
                    arg1 += var5;
                }
                if (arg0 > this.field669.length) {
                    if (this.field641 != this.field639) {
                        this.field665.method134(this.field641, (byte) -68);
                        this.field639 = this.field641;
                    }
                    this.field665.method137(true, arg0, arg1, arg3);
                    long var6 = -1L;
                    if (this.field662 < (long) arg0 + this.field641 && (long) this.field652 + this.field662 >= (long) arg0 + this.field641) {
                        var6 = (long) arg0 + this.field641;
                    } else if (this.field641 < this.field662 + (long) this.field652 && this.field662 + (long) this.field652 <= (long) arg0 + this.field641) {
                        var6 = (long) this.field652 + this.field662;
                    }
                    this.field639 += arg0;
                    if (this.field650 < this.field639) {
                        this.field650 = this.field639;
                    }
                    long var8 = -1L;
                    if (this.field641 >= this.field662 && this.field641 < (long) this.field652 + this.field662) {
                        var8 = this.field641;
                    } else if (this.field662 >= this.field641 && this.field662 < (long) arg0 + this.field641) {
                        var8 = this.field662;
                    }
                    if (var8 > -1L && var8 < var6) {
                        int var10 = (int) (var6 - var8);
                        class53.method417(arg3, (int) (var8 + (long) arg1 - this.field641), this.field638, (int) (var8 - this.field662), var10);
                    }
                    this.field641 += arg0;
                } else if (arg0 > 0) {
                    if (this.field642 == -1L) {
                        this.field642 = this.field641;
                    }
                    class53.method417(arg3, arg1, this.field669, (int) (this.field641 - this.field642), arg0);
                    this.field641 += arg0;
                    if ((long) this.field667 < this.field641 - this.field642) {
                        this.field667 = (int) (this.field641 - this.field642);
                    }
                }
            }
        } catch (IOException var12) {
            this.field639 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 820)
    public static final void method243(byte arg0) {
        if (arg0 < 111) {
            field664 = null;
        }
        field647++;
        if (class5.field67 == 0) {
            return;
        }
        int var1 = 0;
        if (class78.field1888 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class5.field66[var2] != null) {
                int var3 = client.field464[var2];
                class6 var4 = class103.field2431[var2];
                if (var4 != null && var4.method36(class67.field1488, false)) {
                    var4 = var4.method56(-58, 5);
                }
                if (var4 != null && var4.method36(class104.field2466, false)) {
                    var4 = var4.method56(-58, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class15.field304 == 0 || class15.field304 == 1 && class6.method31(21469, var4))) {
                    int var5 = 329 - var1 * 13;
                    if (class117.field2771 > 4 && class57.field1244 - 4 > var5 + -10 && class57.field1244 - 4 <= var5 + 3) {
                        int var6 = class102.field2397.method96(class85.method731(new class6[] { class118.field2818, class138.field3359, var4, class5.field66[var2] }, 14569)) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class117.field2771 < var6 + 4) {
                            class43.field979++;
                            class51.field1143++;
                            if (class8.field175 >= 1) {
                                class7.field136++;
                                class6.method26(0, class60.field1311, 0, class85.method731(new class6[] { class42.field959, var4 }, 14569), (byte) -128, 0, 2009);
                            }
                            class6.method26(0, class22.field575, 0, class85.method731(new class6[] { class42.field959, var4 }, 14569), (byte) -28, 0, 2021);
                            class6.method26(0, class81.field1966, 0, class85.method731(new class6[] { class42.field959, var4 }, 14569), (byte) -114, 0, 2031);
                        }
                    }
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class15.field304 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)I", line = 932)
    public static final int method244(boolean arg0) {
        if (arg0) {
            return 61;
        } else {
            field661++;
            return 19;
        }
    }
}
