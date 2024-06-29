import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public abstract class class14 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field141 = 0;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[I")
    public static int[] field150 = new int[50];

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lnk;")
    public static class16 field140;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[[B")
    public static byte[][] field145;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIB)I", line = 11)
    public static final int method80(int arg0, int arg1, int arg2, byte arg3) {
        field142++;
        if (class72.field902 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2 & 0x7F;
        int var7 = arg1;
        if (arg3 != -126) {
            method81(-82);
        }
        int var8 = arg0 & 0x7F;
        if (arg1 < 3 && (class225.field3398[1][var4][var5] & 0x2) == 2) {
            var7 = arg1 + 1;
        }
        int var9 = (128 - var6) * class72.field902[var7][var4][var5 + 1] + class72.field902[var7][var4 + 1][var5 + 1] * var6 >> 7;
        int var10 = (128 - var6) * class72.field902[var7][var4][var5] + (class72.field902[var7][var4 + 1][var5] * var6) >> 7;
        return (128 - var8) * var10 + (var8 * var9) >> 7;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)Z", line = 46)
    public static final boolean method81(int arg0) {
        field144++;
        if (class28.field330 == 0) {
            return arg0 == 6567 ? class116.field1615.method611(true) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 63)
    public static void method83(int arg0) {
        int var1 = -73 % ((arg0 + 12) / 61);
        field140 = null;
        field150 = null;
        field145 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lba;Lba;Z)V", line = 76)
    public static final void method85(class188 arg0, class188 arg1, boolean arg2) {
        field149++;
        if (arg1.field2833 != null) {
            arg1.method1290(-74);
        }
        arg1.field2835 = arg0;
        arg1.field2833 = arg0.field2833;
        if (!arg2) {
            method88(-3, (class16) null, 44, 66);
        }
        arg1.field2833.field2835 = arg1;
        arg1.field2835.field2833 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)V", line = 96)
    public static final void method86(int arg0, byte arg1) {
        field148++;
        if (arg1 == -14) {
            class49.field557.method387(arg0, false);
        }
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)I", line = 110)
    public static final int method87(int arg0) {
        if (arg0 != 170) {
            field140 = (class16) null;
        }
        field137++;
        if ((double) class336.field5349 == 3.0D) {
            return 37;
        } else if ((double) class336.field5349 == 4.0D) {
            return 50;
        } else if ((double) class336.field5349 == 6.0D) {
            return 75;
        } else if ((double) class336.field5349 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(III)V", line = 143)
    public class14(int arg0, int arg1, int arg2) {
        this.field138 = arg2;
        this.field146 = arg0;
        this.field151 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILnk;II)Lch;", line = 154)
    public static final class158 method88(int arg0, class16 arg1, int arg2, int arg3) {
        field139++;
        if (arg2 != 50) {
            method81(24);
        }
        return class102.method648(arg3, -1000000000, arg0, arg1) ? class80.method526(-125) : null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)V")
    public abstract void method82(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(III)V")
    public abstract void method84(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(BII)V")
    public abstract void method89(byte arg0, int arg1, int arg2);
}
