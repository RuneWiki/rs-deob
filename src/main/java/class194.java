import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class194 extends class390 {

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public int field2669 = 0;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2662 = 0;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "[I")
    public static int[] field2677;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public int field2653;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public int field2664;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public int field2665;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public int field2666;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field2668;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public int field2671;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public int field2673;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lqa;")
    public class134 field2651;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Lkm;")
    public class198 field2660;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "Ldd;")
    public class421 field2658;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Ldd;")
    public class421 field2659;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "Lgm;")
    public class64 field2656;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "Z")
    public boolean field2676;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "[I")
    public int[] field2657;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "[[Z")
    public static boolean[][] field2654;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)Lqn;")
    public static final class40 method1252(int arg0, boolean arg1) {
        field2667++;
        class40 var2 = (class40) class133.field1915.method904(arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class399.field5693.method1745(arg0, (byte) 38, 1);
        class40 var4 = new class40();
        if (var3 != null) {
            var4.method371(arg0, 83, new class11(var3));
        }
        class133.field1915.method902((long) arg0, (byte) 112, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static final void method1253(int arg0) {
        class251.field3547 = -1;
        class50.field697 = -1;
        class53.field743 = 0;
        class73.field1047 = arg0;
        field2672++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(B)V")
    public final void method1254(byte arg0) {
        field2674++;
        int var2 = 79 % ((66 - arg0) / 58);
        int var3 = this.field2664;
        if (this.field2656 != null) {
            class64 var6 = this.field2656.method491((byte) -82);
            if (var6 == null) {
                this.field2657 = null;
                this.field2653 = 0;
                this.field2666 = 0;
                this.field2668 = 0;
                this.field2664 = -1;
                this.field2655 = 0;
            } else {
                this.field2668 = var6.field933;
                this.field2653 = var6.field930 * 128;
                this.field2664 = var6.field929;
                this.field2666 = var6.field928;
                this.field2657 = var6.field913;
                this.field2655 = var6.field921;
            }
        } else if (this.field2660 != null) {
            int var4 = class75.method557(this.field2660, 9);
            if (var3 != var4) {
                this.field2664 = var4;
                class327 var5 = this.field2660.field2737;
                if (var5.field4475 != null) {
                    var5 = var5.method2108(true);
                }
                if (var5 == null) {
                    this.field2666 = this.field2653 = 0;
                } else {
                    this.field2666 = var5.field4521;
                    this.field2653 = var5.field4518 * 128;
                }
            }
        } else if (this.field2651 != null) {
            this.field2664 = class144.method988(this.field2651, 62);
            this.field2666 = this.field2651.field1933;
            this.field2653 = this.field2651.field1924 * 128;
        }
        if (this.field2664 != var3 && this.field2659 != null) {
            class164.field2266.method2788(this.field2659);
            this.field2659 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public static void method1255(int arg0) {
        field2654 = null;
        if (arg0 != 0) {
            method1253(89);
        }
        field2677 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1256(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class59 var7 = new class59();
        var7.field787 = arg1 >> 7;
        var7.field796 = arg2 >> 7;
        var7.field788 = arg3 >> 7;
        var7.field797 = arg4 >> 7;
        var7.field794 = arg0;
        var7.field804 = arg1;
        var7.field798 = arg2;
        var7.field806 = arg3;
        var7.field807 = arg4;
        var7.field795 = arg5;
        var7.field805 = arg6;
        class362.field5029[class269.field3749++] = var7;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)S")
    public static final short method1257(int arg0, int arg1) {
        field2675++;
        int var2 = arg1 >> 10 & 0x3F;
        if (arg0 != 23213) {
            field2662 = -128;
        }
        int var3 = (arg1 & 0x382) >> 3;
        int var4 = arg1 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var7 >> 4 << 7 | var2 << 10 | var6);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILnq;)Lpi;")
    public static final class290 method1258(int arg0, int arg1, class268 arg2) {
        field2663++;
        byte[] var3 = arg2.method1757(-3, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 898) {
                field2654 = null;
            }
            return new class290(var3);
        }
    }

    static {
        new class442("Use", "Benutzen", "Utiliser", "Usar");
        field2677 = new int[25];
    }
}
