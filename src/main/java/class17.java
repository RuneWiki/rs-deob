import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 implements Runnable {

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Z")
    private boolean field255 = false;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Z")
    private boolean field266 = false;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    private int field263 = 0;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "I")
    private int field277 = 0;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field260;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "Lwe;")
    private class59 field280;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Ljava/io/InputStream;")
    private InputStream field273;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field265;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "[[S")
    public static short[][] field270 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field257 = 0;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field281 = -1;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lul;")
    public static class51 field259 = new class51(4);

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field283 = 0;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field282 = 0;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "Lnn;")
    private class45 field276;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[B")
    private byte[] field272;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 4)
    public static void method169(int arg0) {
        field284 = null;
        field259 = null;
        if (arg0 != -12898) {
            field270 = (short[][]) ((short[][]) null);
        }
        field270 = (short[][]) null;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 20)
    public final void method170(int arg0) throws IOException {
        field264++;
        if (arg0 == 90 && !this.field266 && this.field255) {
            this.field255 = false;
            throw new IOException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BS)Z", line = 47)
    public static final boolean method171(byte arg0, short arg1) {
        field269++;
        if (arg1 == 25 || arg1 == 59 || arg1 == 35 || arg1 == 36 || arg1 == 7 || arg1 == 12 || arg1 == 5 || arg1 == 50) {
            return true;
        } else if (arg1 == 38 || arg1 == 11 || arg1 == 1007 || arg1 == 1002) {
            return true;
        } else if (arg1 == 44 || arg1 == 2 || arg1 == 29 || arg1 == 10 || arg1 == 23) {
            return true;
        } else {
            if (arg0 != -114) {
                method171((byte) 3, (short) -2);
            }
            return arg1 == 49 || arg1 == 14 || arg1 == 47 || arg1 == 21 || arg1 == 48 || arg1 == 42;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)V", line = 73)
    public static final void method172(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field262++;
        int var8 = arg1 + arg5;
        int var9 = arg0 + arg1;
        int var10 = arg4 - arg1;
        for (int var11 = arg5; var11 < var8; var11++) {
            class317.method2184(arg6, (byte) -71, class64.field1007[var11], arg7, arg0);
        }
        int var12 = arg4;
        int var13 = 119 % ((-arg2 - 10) / 46);
        while (var12 > var10) {
            class317.method2184(arg6, (byte) -17, class64.field1007[var12], arg7, arg0);
            var12--;
        }
        int var14 = arg6 - arg1;
        for (int var15 = var8; var15 <= var10; var15++) {
            int[] var16 = class64.field1007[var15];
            class317.method2184(var9, (byte) 92, var16, arg7, arg0);
            class317.method2184(var14, (byte) 91, var16, arg3, var9);
            class317.method2184(arg6, (byte) -105, var16, arg7, var14);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V", line = 118)
    public static final void method173(int arg0) {
        if (class296.field4723 != null) {
            class13 var1 = class296.field4723;
            synchronized (class296.field4723) {
                class296.field4723 = null;
            }
        }
        if (arg0 != 90) {
            method171((byte) -120, (short) 58);
        }
        field253++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILjava/awt/Component;ILwe;)Lnc;", line = 136)
    public static final class160 method174(int arg0, int arg1, Component arg2, int arg3, class59 arg4) {
        field274++;
        if (class266.field4291 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                if (arg1 >= -6) {
                    method174(99, 120, (Component) null, 24, (class59) null);
                }
                class160 var5 = (class160) Class.forName("ok").getDeclaredConstructor().newInstance();
                var5.field2851 = arg3;
                var5.field2818 = new int[(class26.field360 ? 2 : 1) * 256];
                var5.method1180(arg2);
                var5.field2846 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field2846 > 16384) {
                    var5.field2846 = 16384;
                }
                var5.method1183(var5.field2846);
                if (class248.field4027 > 0 && class31.field450 == null) {
                    class31.field450 = new class238();
                    class31.field450.field3901 = arg4;
                    arg4.method551((byte) 104, class31.field450, class248.field4027);
                }
                if (class31.field450 != null) {
                    if (class31.field450.field3896[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class31.field450.field3896[arg0] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class149 var7 = new class149(arg4, arg0);
                    var7.field2851 = arg3;
                    var7.field2818 = new int[(class26.field360 ? 2 : 1) * 256];
                    var7.method1180(arg2);
                    var7.field2846 = 16384;
                    var7.method1183(var7.field2846);
                    if (class248.field4027 > 0 && class31.field450 == null) {
                        class31.field450 = new class238();
                        class31.field450.field3901 = arg4;
                        arg4.method551((byte) 96, class31.field450, class248.field4027);
                    }
                    if (class31.field450 != null) {
                        if (class31.field450.field3896[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class31.field450.field3896[arg0] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class160();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)I", line = 221)
    public final int method175(int arg0) throws IOException {
        field256++;
        if (arg0 != -21329) {
            field259 = (class51) null;
        }
        return this.field266 ? 0 : this.field273.available();
    }

    @OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V", line = 236)
    protected final void finalize() {
        field254++;
        this.method177(false);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 246)
    public final void method176(byte arg0) {
        field261++;
        if (arg0 >= 92 && !this.field266) {
            this.field273 = new class185();
            this.field265 = new class230();
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Ljava/net/Socket;Lwe;)V", line = 493)
    public class17(Socket arg0, class59 arg1) throws IOException {
        this.field260 = arg0;
        this.field280 = arg1;
        this.field260.setSoTimeout(30000);
        this.field260.setTcpNoDelay(true);
        this.field273 = this.field260.getInputStream();
        this.field265 = this.field260.getOutputStream();
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 271)
    public final void method177(boolean arg0) {
        field278++;
        if (this.field266) {
            return;
        }
        synchronized (this) {
            this.field266 = true;
            this.notifyAll();
        }
        if (arg0) {
            method173(-112);
        }
        if (this.field276 != null) {
            while (this.field276.field709 == 0) {
                class142.method1149(1L, (byte) 127);
            }
            if (this.field276.field709 == 1) {
                try {
                    ((Thread) this.field276.field712).join();
                } catch (InterruptedException var5) {
                }
            }
        }
        this.field276 = null;
    }

    @OriginalMember(owner = "client!kh", name = "run", descriptor = "()V", line = 316)
    public final void run() {
        try {
            while (true) {
                int var3;
                int var4;
                synchronized (this) {
                    if (this.field277 == this.field263) {
                        if (this.field266) {
                            break;
                        }
                        try {
                            this.wait();
                        } catch (InterruptedException var12) {
                        }
                    }
                    var3 = this.field277;
                    if (this.field277 <= this.field263) {
                        var4 = this.field263 - this.field277;
                    } else {
                        var4 = 5000 - this.field277;
                    }
                }
                if (var4 > 0) {
                    try {
                        this.field265.write(this.field272, var3, var4);
                    } catch (IOException var11) {
                        this.field255 = true;
                    }
                    this.field277 = (this.field277 + var4) % 5000;
                    try {
                        if (this.field277 == this.field263) {
                            this.field265.flush();
                        }
                    } catch (IOException var10) {
                        this.field255 = true;
                    }
                }
            }
            try {
                if (this.field273 != null) {
                    this.field273.close();
                }
                if (this.field265 != null) {
                    this.field265.close();
                }
                if (this.field260 != null) {
                    this.field260.close();
                }
            } catch (IOException var13) {
            }
            this.field272 = null;
        } catch (Exception var15) {
            class88.method775(var15, (String) null, true);
        }
        field258++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II[BZ)V", line = 388)
    public final void method178(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field279++;
        if (this.field266) {
            return;
        }
        if (this.field255) {
            this.field255 = false;
            throw new IOException();
        }
        if (this.field272 == null) {
            this.field272 = new byte[5000];
        }
        synchronized (this) {
            if (!arg3) {
                for (int var6 = 0; var6 < arg1; var6++) {
                    this.field272[this.field263] = arg2[arg0 + var6];
                    this.field263 = (this.field263 + 1) % 5000;
                    if ((this.field277 + 4900) % 5000 == this.field263) {
                        throw new IOException();
                    }
                }
                if (this.field276 == null) {
                    this.field276 = this.field280.method551((byte) 116, this, 3);
                }
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([BIII)V", line = 441)
    public final void method179(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field271++;
        if (arg3 != 9395) {
            method169(64);
        }
        if (this.field266) {
            return;
        }
        while (arg2 > 0) {
            int var5 = this.field273.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)I", line = 469)
    public final int method180(int arg0) throws IOException {
        field268++;
        if (arg0 != 0) {
            this.finalize();
        }
        return this.field266 ? 0 : this.field273.read();
    }
}
