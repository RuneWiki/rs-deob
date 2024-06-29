import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class396 extends class166 {

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field5620 = 503;

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public int field5618;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "I")
    public int field5621;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public int field5623;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public int field5624;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "Loi;")
    public class74 field5626;

    @OriginalMember(owner = "client!br", name = "s", descriptor = "[[[Llha;")
    public static class624[][][] field5627;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public static void method2301(byte arg0) {
        field5627 = null;
        if (arg0 > -3) {
            field5627 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IBI)V")
    public static final void method2302(int arg0, byte arg1, int arg2) {
        class278.field3706 = arg2 - class642.field8947;
        if (arg1 < 15) {
            method2303(77, null, null, true, null, null);
        }
        class239.field3133 = arg0 - class642.field8950;
        field5622++;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILmv;Lda;ZLha;Ljava/lang/String;)V")
    public static final void method2303(int arg0, class377 arg1, class61 arg2, boolean arg3, class60 arg4, String arg5) {
        field5625++;
        boolean var6 = !class243.field3155 || class367.method2181(-4264);
        if (!var6) {
            return;
        }
        if (class243.field3155 && var6) {
            class377 var12 = class519.field6987;
            class61 var13 = arg4.method425(var12, class3.field30, true);
            int var14 = var12.method2212(250, arg5, null, (byte) 124);
            int var15 = var12.method2214(null, 250, var12.field5241, arg5, true);
            int var16 = class191.field2297.field2421;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var15;
            int var19 = var17 * 2 + var14;
            if (var18 < class391.field5527) {
                var18 = class391.field5527;
            }
            if (var19 < class368.field5168) {
                var19 = class368.field5168;
            }
            int var20 = class283.field3751.method3841(class751.field10419, var19, (byte) 61) + class116.field1521;
            int var21 = class321.field4309.method606(var18, field5620, (byte) -56) + class87.field1195;
            if (class247.field3206) {
                var20 += class63.method488((byte) 42);
                var21 += class231.method1364(false);
            }
            arg4.method366(class39.field405, false).method671(class132.field1700.field2421 + var20, class132.field1700.field2419 + var21, var19 - class132.field1700.field2421 * 2, -(class132.field1700.field2419 * 2) + var18, 1, 0, 0);
            arg4.method366(class132.field1700, true).method3859(var20, var21);
            class132.field1700.method1135();
            arg4.method366(class132.field1700, true).method3859(var19 + var20 - var16, var21);
            class132.field1700.method1126();
            arg4.method366(class132.field1700, true).method3859(var19 + var20 - var16, var21 - var16 + var18);
            class132.field1700.method1135();
            arg4.method366(class132.field1700, true).method3859(var20, var21 + var18 - var16);
            class132.field1700.method1126();
            arg4.method366(class191.field2297, true).method3860(var20, var21 + class132.field1700.field2419, var16, var18 - class132.field1700.field2419 * 2);
            class191.field2297.method1131();
            arg4.method366(class191.field2297, true).method3860(class132.field1700.field2421 + var20, var21, var19 - (class132.field1700.field2421 * 2), var16);
            class191.field2297.method1131();
            arg4.method366(class191.field2297, true).method3860(var19 + var20 - var16, class132.field1700.field2419 + var21, var16, var18 - (class132.field1700.field2419 * 2));
            class191.field2297.method1131();
            arg4.method366(class191.field2297, true).method3860(class132.field1700.field2421 + var20, var21 - var16 + var18, var19 - (class132.field1700.field2421 * 2), var16);
            class191.field2297.method1131();
            var13.method473(var17 + var20, null, var19 - var17 * 2, arg5, 0, -1, null, 1, (byte) -90, class704.field9881 | 0xFF000000, null, 0, 0, 1, var21 + var17, -(var17 * 2) + var18);
            class640.method3603(var18, -1, var19, var20, var21);
        } else {
            int var7 = arg1.method2212(250, arg5, null, (byte) -115);
            int var8 = arg1.method2211(250, 0, arg5, null) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg4.method447(var10 - var9, -var9 + var11, var7 + var9 + var9, var9 + var9 + var8, -16777216, 0);
            arg4.method391(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 - -var9, -1, 0);
            arg2.method473(var10, null, var7, arg5, 0, -1, null, 1, (byte) -84, -1, null, 0, 0, 1, var11, var8);
            class640.method3603(var8 + var9 + var9, -1, var7 - (-var9 - var9), -var9 + var10, var11 - var9);
        }
        if (arg0 > -16) {
            field5627 = null;
        }
        if (!arg3) {
            return;
        }
        try {
            if (class247.field3206) {
                class348.method2031((byte) 10);
            } else {
                arg4.method360(-127);
            }
        } catch (class353 var22) {
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2304(int arg0, int arg1, byte arg2) {
        int var3 = 34 / ((-arg2 - 45) / 45);
        field5619++;
        return (arg0 & 0x800) != 0;
    }
}
