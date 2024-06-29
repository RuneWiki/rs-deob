import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class50 extends class201 {

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "[Z")
    public static boolean[] field781 = new boolean[8];

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "Leg;")
    public static class37 field786 = class174.method1167("(U0a )2 in: ", -70);

    @OriginalMember(owner = "client!wk", name = "L", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "Ljl;")
    public static class101 field783;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)V")
    public static final void method324(int arg0, int arg1, byte arg2) {
        field782++;
        class226 var3 = class210.field3621[class237.field4140][arg1][arg0];
        if (var3 == null) {
            class254.method1738(class237.field4140, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class61 var5 = null;
        for (class61 var6 = (class61) var3.method1566(-3); var6 != null; var6 = (class61) var3.method1570(3)) {
            class241 var13 = class9.method52(true, var6.field995.field739);
            int var14 = var13.field4313;
            if (var13.field4316 == 1) {
                var14 = (var6.field995.field751 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class254.method1738(class237.field4140, arg1, arg0);
            return;
        }
        class47 var7 = null;
        class47 var8 = null;
        if (arg2 != 21) {
            return;
        }
        var3.method1567(arg2 ^ 0x15, var5);
        for (class61 var9 = (class61) var3.method1566(-3); var9 != null; var9 = (class61) var3.method1570(3)) {
            class47 var12 = var9.field995;
            if (var5.field995.field739 != var12.field739) {
                if (var8 == null) {
                    var8 = var12;
                }
                if (var8.field739 != var12.field739 && var7 == null) {
                    var7 = var12;
                }
            }
        }
        long var10 = (long) (arg1 - (-(arg0 << 7) - 1610612736));
        class89.method586(class237.field4140, arg1, arg0, class262.method1768(class237.field4140, arg1 * 128 + 64, arg0 * 128 - -64, (byte) -116), var5.field995, var10, var8, var7);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)Z")
    public static final boolean method325(int arg0, int arg1) {
        if (arg1 != 1) {
            field783 = null;
        }
        field785++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method326(byte arg0) {
        if (arg0 > -12) {
            method327(22, (class37) null);
        }
        field786 = null;
        field783 = null;
        field781 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILeg;)I")
    public static final int method327(int arg0, class37 arg1) {
        field784++;
        int var2 = 100 / ((3 - arg0) / 50);
        return arg1.method222((byte) -68) + 1;
    }
}
