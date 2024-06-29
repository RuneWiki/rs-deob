import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public abstract class class295 extends class546 {

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "[I")
    public static int[] field4040 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "[F")
    public static float[] field4043 = new float[16];

    @OriginalMember(owner = "client!vv", name = "y", descriptor = "[I")
    public static int[] field4054 = new int[1];

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "B")
    public byte field4050;

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "B")
    public byte field4053;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public int field4038;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "I")
    public int field4039;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "I")
    public int field4042;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public int field4047;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!vv", name = "z", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!vv", name = "A", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Z")
    public boolean field4048;

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "[[[Lwg;")
    public static class390[][][] field4051;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I[Ltw;II)I", line = 4)
    public final int method1798(int arg0, class186[] arg1, int arg2, int arg3) {
        field4056++;
        long var5 = class508.field6965[this.field4053][arg2][arg0];
        if (arg3 != -9609) {
            field4045 = 105;
        }
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg1[var9++] = class334.field4501[var10 - 1].field1852;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg1[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(BII)V", line = 54)
    public static final void method1799(byte arg0, int arg1, int arg2) {
        field4049++;
        if (client.method1683(arg1, (byte) 103) && arg0 == -68) {
            class340.method1986(false, class167.field2439[arg1], arg2);
        }
    }

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(I)I", line = 72)
    public static final int method1800(int arg0) {
        if (arg0 != 16) {
            return 48;
        }
        field4041++;
        if ((double) class510.field6991 == 3.0D) {
            return 37;
        } else if ((double) class510.field6991 == 4.0D) {
            return 50;
        } else if ((double) class510.field6991 == 6.0D) {
            return 75;
        } else if ((double) class510.field6991 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(B)V", line = 99)
    public static void method1801(byte arg0) {
        field4054 = null;
        field4051 = null;
        field4043 = null;
        field4040 = null;
        if (arg0 != -97) {
            field4051 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(ZI)I", line = 131)
    public static final int method1802(boolean arg0, int arg1) {
        if (!arg0) {
            method1799((byte) 125, -62, 12);
        }
        field4044++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIIIIIB)V", line = 144)
    public static final void method1803(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field4046++;
        if (arg6 >= -27) {
            method1801((byte) 58);
        }
        int var7 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg0);
        int var8 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg2);
        int var9 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1);
        int var10 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg4);
        int var11 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg0 + arg5);
        int var12 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg2 - arg5);
        for (int var13 = var7; var13 < var11; var13++) {
            class470.method2660(var9, var10, class344.field4599[var13], (byte) 11, arg3);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class470.method2660(var9, var10, class344.field4599[var14], (byte) 11, arg3);
        }
        int var15 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg1 + arg5);
        int var16 = class280.method1727((byte) 94, class529.field7169, class128.field1831, arg4 - arg5);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class344.field4599[var17];
            class470.method2660(var9, var15, var18, (byte) 11, arg3);
            class470.method2660(var16, var10, var18, (byte) 11, arg3);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([Ltw;I)I")
    public abstract int method1323(class186[] arg0, int arg1);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(ILr;)Lcr;")
    public abstract class533 method214(int arg0, class166 arg1);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lr;Z)V")
    public abstract void method220(class166 arg0, boolean arg1);

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(I)I")
    public abstract int method226(int arg0);

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Z)Z")
    public abstract boolean method216(boolean arg0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIILr;)Z")
    public abstract boolean method224(int arg0, int arg1, int arg2, class166 arg3);

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)I")
    public abstract int method217(int arg0);

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "(I)Z")
    public abstract boolean method215(int arg0);

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lvv;IIZLr;II)V")
    public abstract void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "(I)Z")
    public abstract boolean method1324(int arg0);

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "(B)Z")
    public abstract boolean method209(byte arg0);

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Lr;I)Lbca;")
    public abstract class614 method221(class166 arg0, int arg1);

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(B)Z")
    public abstract boolean method1322(byte arg0);

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "(I)V")
    public abstract void method227(int arg0);
}
