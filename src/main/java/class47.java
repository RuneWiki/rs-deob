import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class47 {

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Lpj;")
    public static class128 field560;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public static void method292(int arg0) {
        if (arg0 != -29567) {
            method295(35, -91);
        }
        field560 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lhf;[[BB)V")
    public static final void method293(class335 arg0, byte[][] arg1, byte arg2) {
        int var3 = -42 % ((-arg2 - 6) / 41);
        field563++;
        for (int var4 = 0; var4 < arg0.field4140; var4++) {
            class539.method3268(5);
            for (int var5 = 0; var5 < (class146.field2125 >> 3); var5++) {
                for (int var6 = 0; var6 < (class410.field5609 >> 3); var6++) {
                    int var7 = class123.field1726[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0.field4139 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFDF77) >> 14;
                            int var11 = (var7 & 0x3FFB) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class340.field4706.length; var13++) {
                                if (class340.field4706[var13] == var12 && arg1[var13] != null) {
                                    arg0.method2040(var6 * 8, (var11 & 0x7) * 8, false, var5 * 8, class127.field1774, var9, (var10 & 0x7) * 8, class99.field1445, var8, var4, arg1[var13]);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Z")
    public static final boolean method294(int arg0, int arg1, int arg2) {
        field565++;
        return arg2 == 1119090531 ? (class82.method622((byte) 107, arg0, arg1) | class573.method3412(arg0, (byte) -30, arg1) | class90.method670((byte) 103, arg1, arg0)) & class243.method1543(arg0, arg1, (byte) 101) : true;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)V")
    public static final void method295(int arg0, int arg1) {
        class55.field655 = arg0;
        field561++;
        class117 var2 = class120.field1690;
        synchronized (class120.field1690) {
            if (arg1 != 28435) {
                return;
            }
            class120.field1690.method837(arg1 ^ 0x6F6C);
        }
        class117 var3 = class236.field3411;
        synchronized (class236.field3411) {
            class236.field3411.method837(127);
        }
    }
}
