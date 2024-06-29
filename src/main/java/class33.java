import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class33 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[Lkc;")
    private class51[] field490;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "Lhi;")
    private static class82 field500 = class95.method664((byte) -62, "Loading fonts )2 ");

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field491 = 0;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "Lhi;")
    public static class82 field486 = field500;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "[[S")
    public static short[][] field499 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lhi;")
    public static class82 field488 = class95.method664((byte) -86, "blinken3:");

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "I")
    public static int field504 = 2;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lhi;")
    public static class82 field494 = class95.method664((byte) -102, "Konfig geladen)3");

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "J")
    private long field492;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "J")
    public static long field496;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Lum;")
    public static class222 field484;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "Lkc;")
    private class51 field502;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "[I")
    public static int[] field498;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(JILkc;)V", line = 4)
    public final void method253(long arg0, int arg1, class51 arg2) {
        field501++;
        if (arg2.field831 != null) {
            arg2.method358((byte) 52);
        }
        class51 var5 = this.field490[(int) (arg0 & (long) (this.field487 + arg1))];
        arg2.field836 = var5;
        arg2.field831 = var5.field831;
        arg2.field824 = arg0;
        arg2.field831.field836 = arg2;
        arg2.field836.field831 = arg2;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 22)
    public static void method254(byte arg0) {
        field500 = null;
        field498 = null;
        field499 = (short[][]) null;
        field494 = null;
        field488 = null;
        field484 = null;
        if (arg0 <= 82) {
            method254((byte) -28);
        }
        field486 = null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IJ)Lkc;", line = 42)
    public final class51 method255(int arg0, long arg1) {
        if (arg0 != -7518) {
            return (class51) null;
        }
        this.field492 = arg1;
        class51 var4 = this.field490[(int) ((long) (this.field487 - 1) & arg1)];
        field489++;
        for (this.field502 = var4.field836; this.field502 != var4; this.field502 = this.field502.field836) {
            if (this.field502.field824 == arg1) {
                class51 var5 = this.field502;
                this.field502 = this.field502.field836;
                return var5;
            }
        }
        this.field502 = null;
        return null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLhi;IIJII)V", line = 75)
    public static final void method256(byte arg0, class82 arg1, int arg2, int arg3, long arg4, int arg5, int arg6) {
        field497++;
        class153 var8 = new class153(128);
        var8.method1075(10, -1);
        var8.method1102((byte) -126, (int) (Math.random() * 99999.0D));
        var8.method1102((byte) -104, 522);
        var8.method1057((byte) 43, arg4);
        var8.method1065(178808912, (int) (Math.random() * 9.9999999E7D));
        var8.method1098((byte) 56, arg1);
        var8.method1065(178808912, (int) (Math.random() * 9.9999999E7D));
        var8.method1102((byte) -114, class80.field1361);
        var8.method1075(arg3, -1);
        var8.method1075(arg2, arg0 + 97);
        var8.method1065(178808912, (int) (Math.random() * 9.9999999E7D));
        var8.method1102((byte) -34, arg5);
        var8.method1102((byte) -126, arg6);
        if (arg0 != -98) {
            method257((byte) 30, (Component) null);
        }
        var8.method1065(arg0 ^ 0xF55797CE, (int) (Math.random() * 9.9999999E7D));
        var8.method1079(class17.field180, class276.field4647, false);
        class61.field957.field2611 = 0;
        class61.field957.method1075(112, -1);
        class61.field957.method1075(var8.field2611, -1);
        class61.field957.method1106(var8.field2598, var8.field2611, (byte) 16, 0);
        class191.field3188 = 1;
        class60.field953 = 0;
        class202.field3473 = 0;
        class19.field240 = -3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 131)
    public static final void method257(byte arg0, Component arg1) {
        if (arg0 > -15) {
            field495 = -127;
        }
        Method var2 = class120.field2126;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        field503++;
        arg1.addKeyListener(class67.field1046);
        arg1.addFocusListener(class67.field1046);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(III)J", line = 161)
    public static final long method258(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        return var3 == null || var3.field172 == null ? 0L : var3.field172.field3106;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(I)V", line = 196)
    public class33(int arg0) {
        this.field487 = arg0;
        this.field490 = new class51[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class51 var3 = this.field490[var2] = new class51();
            var3.field836 = var3;
            var3.field831 = var3;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)Lkc;", line = 219)
    public final class51 method259(int arg0) {
        field493++;
        if (arg0 != 10576) {
            method257((byte) 107, (Component) null);
        }
        if (this.field502 == null) {
            return null;
        }
        class51 var2 = this.field490[(int) ((long) (this.field487 - 1) & this.field492)];
        while (this.field502 != var2) {
            if (this.field502.field824 == this.field492) {
                class51 var3 = this.field502;
                this.field502 = this.field502.field836;
                return var3;
            }
            this.field502 = this.field502.field836;
        }
        this.field502 = null;
        return null;
    }
}
