import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public abstract class class668 extends class638 {

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "Z")
    public boolean field9468 = false;

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "B")
    public byte field9469;

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "B")
    public byte field9470;

    @OriginalMember(owner = "client!ov", name = "m", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!ov", name = "n", descriptor = "I")
    public int field9474;

    @OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
    public int field9475;

    @OriginalMember(owner = "client!ov", name = "p", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!ov", name = "q", descriptor = "I")
    public int field9477;

    @OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!ov", name = "s", descriptor = "I")
    public int field9479;

    @OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
    public int field9480;

    @OriginalMember(owner = "client!ov", name = "u", descriptor = "I")
    public int field9481;

    @OriginalMember(owner = "client!ov", name = "v", descriptor = "I")
    public static int field9482;

    @OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
    public static int field9483;

    @OriginalMember(owner = "client!ov", name = "x", descriptor = "I")
    public static int field9484;

    @OriginalMember(owner = "client!ov", name = "y", descriptor = "I")
    public static int field9485;

    @OriginalMember(owner = "client!ov", name = "l", descriptor = "Lov;")
    public class668 field9472;

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "Z")
    public boolean field9471;

    @OriginalMember(owner = "client!ov", name = "f", descriptor = "(I)I", line = 8)
    public int method2830(int arg0) {
        int var2 = -71 % ((-arg0 - 25) / 41);
        field9485++;
        return 0;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILjava/lang/String;Lofa;)I", line = 21)
    public static final int method3741(int arg0, String arg1, class301 arg2) {
        field9478++;
        int var3 = arg2.field4534;
        if (arg0 == -24804) {
            byte[] var4 = class4.method17(arg1, 109);
            arg2.method1953(var4.length, 32768);
            arg2.field4534 += class378.field5677.method3500(arg0 + 24828, 0, arg2.field4534, var4.length, arg2.field4543, var4);
            return arg2.field4534 - var3;
        } else {
            return -54;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II)V", line = 42)
    public static final void method3742(int arg0, int arg1) {
        class377.field5674 = 2;
        field9482++;
        class355.field5377 = arg0;
        long var2 = 0L;
        if (class658.field9375 == null) {
            class129.method1045(126, 35);
            return;
        }
        class301 var4 = new class301(class554.method3232(class143.method1110(class658.field9375, false), true));
        long var5 = var4.method1928(10185);
        class395.field5902 = var4.method1928(10185);
        int var7 = 66 / ((-arg1 - 61) / 32);
        class723.method3986((byte) -98, class77.method694(var5, (byte) -69), "", true);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(BI)Z", line = 74)
    public static final boolean method3743(byte arg0, int arg1) {
        field9484++;
        if (arg0 >= -117) {
            return true;
        } else {
            return (-arg1 & arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IFFF)I", line = 90)
    public static final int method3744(int arg0, float arg1, float arg2, float arg3) {
        field9476++;
        float var4 = (float) arg0 > arg2 ? -arg2 : arg2;
        float var5 = (arg1 < 0.0F) ? -arg1 : arg1;
        float var6 = (arg3 < 0.0F) ? -arg3 : arg3;
        if (var4 < var5 && var5 > var6) {
            return arg1 > 0.0F ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return arg3 > 0.0F ? 2 : 3;
        } else if ((arg2 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIBIII)I", line = 137)
    public static final int method3745(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field9483++;
        int var6 = -28 / ((64 - arg2) / 60);
        if (class211.field3511 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var7 = arg5 >> 9;
            int var8 = arg4 >> 9;
            if (arg3 < 0 || arg1 < 0 || (class191.field3229 - 1) < arg3 || arg1 > (class314.field4720 - 1)) {
                return 0;
            }
            if (var7 < 1 || var8 < 1 || (class191.field3229 - 1) < var7 || var8 > (class314.field4720 - 1)) {
                return 0;
            }
            boolean var9 = (class434.field6341[1][arg5 >> 9][arg4 >> 9] & 0x2) != 0;
            if ((arg5 & 0x1FF) == 0) {
                boolean var10 = (class434.field6341[1][var7 - 1][arg4 >> 9] & 0x2) != 0;
                boolean var11 = (class434.field6341[1][var7][arg4 >> 9] & 0x2) != 0;
                if (var11 != var10) {
                    var9 = (class434.field6341[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x1FF) == 0) {
                boolean var12 = (class434.field6341[1][arg5 >> 9][var8 - 1] & 0x2) != 0;
                boolean var13 = (class434.field6341[1][arg5 >> 9][var8] & 0x2) != 0;
                if (var13 != var12) {
                    var9 = (class434.field6341[1][arg3][arg1] & 0x2) != 0;
                }
            }
            if (var9) {
                arg0++;
            }
        }
        return class211.field3511[arg0].method2162(arg4, 1, arg5);
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(II[Lvt;I)I", line = 203)
    public final int method3746(int arg0, int arg1, class759[] arg2, int arg3) {
        field9473++;
        long var5 = class324.field4792[this.field9470][arg0][arg3];
        long var7 = 0L;
        int var9 = arg1;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            arg2[var9++] = class96.field1422[var10 - 1].field8979;
            var7 += 16L;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg2[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILha;)Z")
    public abstract boolean method1467(int arg0, class544 arg1);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(ZILha;Lov;IIZ)V")
    public abstract void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(B)Z")
    public abstract boolean method1468(byte arg0);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lha;I)Lkn;")
    public abstract class516 method93(class544 arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(ILha;)Lgh;")
    public abstract class48 method103(int arg0, class544 arg1);

    @OriginalMember(owner = "client!ov", name = "g", descriptor = "(I)Z")
    public abstract boolean method92(int arg0);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(IILha;I)Z")
    public abstract boolean method94(int arg0, int arg1, class544 arg2, int arg3);

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V")
    public abstract void method102(int arg0);

    @OriginalMember(owner = "client!ov", name = "i", descriptor = "(I)Z")
    public abstract boolean method86(int arg0);

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "([Lvt;I)I")
    public abstract int method1469(class759[] arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "j", descriptor = "(I)I")
    public abstract int method89(int arg0);

    @OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lha;I)V")
    public abstract void method97(class544 arg0, int arg1);

    @OriginalMember(owner = "client!ov", name = "k", descriptor = "(I)Z")
    public abstract boolean method95(int arg0);

    @OriginalMember(owner = "client!ov", name = "d", descriptor = "(B)I")
    public abstract int method100(byte arg0);
}
