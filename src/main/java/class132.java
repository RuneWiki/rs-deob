import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 {

    @OriginalMember(owner = "client!t", name = "e", descriptor = "J")
    private long field3008 = -1L;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    private int field3030 = 0;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "J")
    private long field3031 = -1L;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "Lca;")
    private class16 field3009;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "J")
    private long field3014;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "J")
    private long field3027;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "J")
    private long field3022;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[B")
    private byte[] field3005;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "[B")
    private byte[] field3019;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "[S")
    public static short[] field3013 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!t", name = "d", descriptor = "Lv;")
    private static class146 field3007 = class159.method1226((byte) -37, "Loading sprites )2 ");

    @OriginalMember(owner = "client!t", name = "c", descriptor = "[Lv;")
    public static class146[] field3006 = new class146[100];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "Lv;")
    public static class146 field3004 = field3007;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lv;")
    private static class146 field3024 = class159.method1226((byte) -37, "Loaded interfaces");

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lv;")
    public static class146 field3018 = field3024;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "Lne;")
    public static class95 field3021 = new class95(new byte[5000]);

    @OriginalMember(owner = "client!t", name = "H", descriptor = "Lv;")
    public static class146 field3037 = class159.method1226((byte) -37, "Fps:");

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!t", name = "v", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!t", name = "C", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field3036;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "J")
    private long field3026;

    @OriginalMember(owner = "client!t", name = "I", descriptor = "Lee;")
    public static class34 field3038;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIII)I")
    public static final int method980(int arg0, int arg1, int arg2, int arg3) {
        field3035++;
        if (arg2 != -11375) {
            return -42;
        }
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lla;Lla;Lmb;ZB)V")
    public static final void method981(class77 arg0, class77 arg1, class85 arg2, boolean arg3, byte arg4) {
        class49.field1140 = arg0;
        field3025++;
        if (arg4 == -125) {
            class15.field246 = arg3;
            class141.field3225 = arg1;
            class141.field3225.method578(10, 0);
            class68.field1552 = arg2;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)J")
    public final long method982(int arg0) {
        field3016++;
        if (arg0 != -1) {
            this.field3036 = -59;
        }
        return this.field3027;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public static void method983(byte arg0) {
        field3004 = null;
        field3021 = null;
        field3013 = null;
        field3038 = null;
        field3007 = null;
        field3024 = null;
        if (arg0 >= -8) {
            method983((byte) -77);
        }
        field3006 = null;
        field3018 = null;
        field3037 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V")
    private final void method984(boolean arg0) throws IOException {
        this.field3036 = 0;
        if (!arg0) {
            this.field3014 = 61L;
        }
        field3017++;
        if (this.field3026 != this.field3022) {
            this.field3009.method98(this.field3022, -15705);
            this.field3026 = this.field3022;
        }
        this.field3008 = this.field3022;
        while (this.field3019.length > this.field3036) {
            int var2 = this.field3009.method100(-61, this.field3019.length - this.field3036, this.field3036, this.field3019);
            if (var2 == -1) {
                break;
            }
            this.field3026 += var2;
            this.field3036 += var2;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(B)V")
    public final void method985(byte arg0) throws IOException {
        if (arg0 == -112) {
            field3020++;
            this.method989(13056);
            this.field3009.method96((byte) 21);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z[B)V")
    public final void method986(boolean arg0, byte[] arg1) throws IOException {
        field3012++;
        if (arg0) {
            method981(null, null, null, false, (byte) 30);
        }
        this.method993(-1, arg1, 0, arg1.length);
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method987(int arg0) {
        field3034++;
        if (arg0 != 4) {
            method981(null, null, null, false, (byte) 100);
        }
        return this.field3009.method97(-1);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Lla;Lla;III)Lmb;")
    public static final class85 method988(class77 arg0, class77 arg1, int arg2, int arg3, int arg4) {
        field3029++;
        if (class1.method3(arg4, arg2, arg3 - 5121, arg0)) {
            return arg3 == 5000 ? client.method134(arg1.method585(arg4, 104, arg2), 118) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    private final void method989(int arg0) throws IOException {
        field3032++;
        if (arg0 != 13056) {
            method988(null, null, -82, 105, -39);
        }
        if (this.field3031 == -1L) {
            return;
        }
        if (this.field3031 != this.field3026) {
            this.field3009.method98(this.field3031, -15705);
            this.field3026 = this.field3031;
        }
        long var2 = -1L;
        this.field3009.method95(-1, this.field3005, 0, this.field3030);
        if (this.field3031 >= this.field3008 && this.field3031 < (long) this.field3036 + this.field3008) {
            var2 = this.field3031;
        } else if (this.field3008 >= this.field3031 && (long) this.field3030 + this.field3031 > this.field3008) {
            var2 = this.field3008;
        }
        this.field3026 += this.field3030;
        if (this.field3026 > this.field3014) {
            this.field3014 = this.field3026;
        }
        long var4 = -1L;
        if (this.field3008 < this.field3031 + (long) this.field3030 && (long) this.field3036 + this.field3008 >= (long) this.field3030 + this.field3031) {
            var4 = this.field3031 + (long) this.field3030;
        } else if ((long) this.field3036 + this.field3008 > this.field3031 && (long) this.field3030 + this.field3031 >= (long) this.field3036 + this.field3008) {
            var4 = (long) this.field3036 + this.field3008;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class11.method68(this.field3005, (int) (var2 - this.field3031), this.field3019, (int) (var2 - this.field3008), var6);
        }
        this.field3031 = -1L;
        this.field3030 = 0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILqb;Z[B)V")
    public static final void method990(int arg0, class113 arg1, boolean arg2, byte[] arg3) {
        class18 var4 = new class18();
        var4.field285 = arg3;
        var4.field293 = 0;
        field3033++;
        var4.field679 = arg0;
        var4.field298 = arg1;
        class152 var5 = class9.field166;
        synchronized (class9.field166) {
            class9.field166.method1136(var4, !arg2);
        }
        class29.method198(-13455);
        if (!arg2) {
            method988(null, null, 50, 58, -55);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BIB)V")
    public final void method991(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if (arg3 > -126) {
            return;
        }
        field3011++;
        try {
            if ((long) arg2 + this.field3022 > this.field3027) {
                this.field3027 = (long) arg2 + this.field3022;
            }
            if (this.field3031 != -1L && (this.field3022 < this.field3031 || this.field3022 > (long) this.field3030 + this.field3031)) {
                this.method989(13056);
            }
            if (this.field3031 != -1L && (long) this.field3005.length + this.field3031 < (long) arg2 + this.field3022) {
                int var5 = (int) (this.field3031 + (long) this.field3005.length - this.field3022);
                arg2 -= var5;
                class11.method68(arg1, arg0, this.field3005, (int) (this.field3022 - this.field3031), var5);
                arg0 += var5;
                this.field3022 += var5;
                this.field3030 = this.field3005.length;
                this.method989(13056);
            }
            if (this.field3005.length < arg2) {
                if (this.field3026 != this.field3022) {
                    this.field3009.method98(this.field3022, -15705);
                    this.field3026 = this.field3022;
                }
                long var6 = -1L;
                this.field3009.method95(-1, arg1, arg0, arg2);
                this.field3026 += arg2;
                if (this.field3014 < this.field3026) {
                    this.field3014 = this.field3026;
                }
                long var8 = -1L;
                if (this.field3022 >= this.field3008 && this.field3022 < (long) this.field3036 + this.field3008) {
                    var6 = this.field3022;
                } else if (this.field3022 <= this.field3008 && this.field3022 + (long) arg2 > this.field3008) {
                    var6 = this.field3008;
                }
                if ((long) arg2 + this.field3022 > this.field3008 && this.field3008 + (long) this.field3036 >= (long) arg2 + this.field3022) {
                    var8 = (long) arg2 + this.field3022;
                } else if ((long) this.field3036 + this.field3008 > this.field3022 && (long) arg2 + this.field3022 >= (long) this.field3036 + this.field3008) {
                    var8 = this.field3008 + (long) this.field3036;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class11.method68(arg1, (int) (var6 + (long) arg0 - this.field3022), this.field3019, (int) (var6 - this.field3008), var10);
                }
                this.field3022 += arg2;
            } else if (arg2 > 0) {
                if (this.field3031 == -1L) {
                    this.field3031 = this.field3022;
                }
                class11.method68(arg1, arg0, this.field3005, (int) (this.field3022 - this.field3031), arg2);
                this.field3022 += arg2;
                if (this.field3022 - this.field3031 > (long) this.field3030) {
                    this.field3030 = (int) (this.field3022 - this.field3031);
                }
            }
        } catch (IOException var12) {
            this.field3026 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method992(int arg0, Component arg1) {
        if (arg0 != 1) {
            field3007 = null;
        }
        field3015++;
        arg1.removeKeyListener(class6.field150);
        arg1.removeFocusListener(class6.field150);
        class134.field3052 = -1;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I[BII)V")
    public final void method993(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3028++;
        try {
            if (arg1.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg1.length);
            }
            if (this.field3031 != -1L && this.field3031 <= this.field3022 && (long) arg3 + this.field3022 <= (long) this.field3030 + this.field3031) {
                class11.method68(this.field3005, (int) (this.field3022 - this.field3031), arg1, arg2, arg3);
                this.field3022 += arg3;
                return;
            }
            long var5 = this.field3022;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field3022 >= this.field3008 && this.field3022 < this.field3008 + (long) this.field3036) {
                int var9 = (int) (this.field3008 + (long) this.field3036 - this.field3022);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class11.method68(this.field3019, (int) (this.field3022 - this.field3008), arg1, arg2, var9);
                arg2 += var9;
                this.field3022 += var9;
            }
            if (arg3 > this.field3019.length) {
                this.field3009.method98(this.field3022, -15705);
                this.field3026 = this.field3022;
                while (arg3 > 0) {
                    int var10 = this.field3009.method100(-114, arg3, arg2, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    this.field3026 += var10;
                    arg3 -= var10;
                    this.field3022 += var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method984(true);
                if (arg3 > this.field3036) {
                    var11 = this.field3036;
                }
                class11.method68(this.field3019, 0, arg1, arg2, var11);
                this.field3022 += var11;
                arg2 += var11;
                arg3 -= var11;
            }
            if (this.field3031 != -1L) {
                if (this.field3031 > this.field3022 && arg3 > 0) {
                    int var12 = (int) (this.field3031 - this.field3022) + arg2;
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg1[arg2++] = 0;
                        this.field3022++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3031 && this.field3031 < var5 + (long) var7) {
                    var13 = this.field3031;
                } else if (var5 >= this.field3031 && var5 < (long) this.field3030 + this.field3031) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field3030 + this.field3031 > var5 && (long) this.field3030 + this.field3031 <= var5 - -((long) var7)) {
                    var15 = (long) this.field3030 + this.field3031;
                } else if (var5 + (long) var7 > this.field3031 && (long) this.field3030 + this.field3031 >= var5 - -((long) var7)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class11.method68(this.field3005, (int) (var13 - this.field3031), arg1, (int) (var13 - var5) + var8, var17);
                    if (this.field3022 < var15) {
                        arg3 = (int) ((long) arg3 + this.field3022 - var15);
                        this.field3022 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3026 = -1L;
            throw var19;
        }
        if (arg0 > ~arg3) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(JI)V")
    public final void method994(long arg0, int arg1) throws IOException {
        field3023++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method987(4));
        }
        this.field3022 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(Lca;II)V")
    public class132(class16 arg0, int arg1, int arg2) throws IOException {
        this.field3009 = arg0;
        this.field3027 = this.field3014 = arg0.method99(29823);
        this.field3022 = 0L;
        this.field3005 = new byte[arg2];
        this.field3019 = new byte[arg1];
    }
}
