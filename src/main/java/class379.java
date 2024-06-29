import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class379 {

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "B")
    public byte field5440;

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5447 = new BigInteger("c44eb3769eb75eef87911232f1159b0a1efd8fc90879df521a7fc1410fa0d016a935a2cd63455fed345e1aed74f36a2457882ab1dff7abc0bc3033e751a64641", 16);

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!rr", name = "m", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!rr", name = "n", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "Ljd;")
    public class239 field5432;

    @OriginalMember(owner = "client!rr", name = "o", descriptor = "Ljd;")
    public class239 field5444;

    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Lbq;")
    public class303 field5441;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "Lrr;")
    public class379 field5431;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "Lbk;")
    public class393 field5437;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "Lev;")
    public class719 field5430;

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lev;")
    public class719 field5439;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Lge;")
    public class736 field5446;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "S")
    public short field5434;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "S")
    public short field5435;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "S")
    public short field5436;

    @OriginalMember(owner = "client!rr", name = "p", descriptor = "S")
    public short field5445;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "[I")
    public static int[] field5438;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
    public static void method2338(int arg0) {
        if (arg0 != -1) {
            field5447 = null;
        }
        field5438 = null;
        field5447 = null;
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(I)V")
    public class379(int arg0) {
        this.field5440 = (byte) arg0;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public final void method2339(int arg0) {
        if (arg0 > -78) {
            method2342(null, 35);
        }
        while (this.field5437 != null) {
            class393 var2 = this.field5437.field5574;
            this.field5437.method2397((byte) 110);
            this.field5437 = var2;
        }
        field5443++;
    }

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)V")
    public static final void method2340(int arg0) {
        field5442++;
        if (arg0 >= 88) {
            class374.method2323(11, (byte) -124);
            class229.method1588((byte) -75);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "([BIIIII)V")
    public static final void method2341(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5433++;
        if (arg5 <= arg2) {
            return;
        }
        int var6 = arg5 - arg2 >> 2;
        int var7 = 77 / ((36 - arg3) / 52);
        int var8 = arg1 + arg2;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var9 = arg5 - arg2 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg0[var8++] = 1;
                }
            }
            arg0[var8++] = 1;
            arg0[var8++] = 1;
            arg0[var8++] = 1;
            arg0[var8++] = 1;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lofa;I)I")
    public static final int method2342(class345 arg0, int arg1) {
        field5448++;
        if (arg1 != 6410) {
            field5438 = null;
        }
        if (class67.field898 == arg0) {
            return 6407;
        } else if (class12.field247 == arg0) {
            return 6408;
        } else if (class539.field7574 == arg0) {
            return 6406;
        } else if (class652.field9200 == arg0) {
            return 6409;
        } else if (class519.field7418 == arg0) {
            return 6410;
        } else if (class310.field4609 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }
}
