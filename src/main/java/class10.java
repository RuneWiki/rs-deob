import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class10 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lke;")
    public static class256 field149 = class316.method2202("Veuillez patienter)3)3)3", 27626);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field148 = 0;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lke;")
    public static class256 field159 = class316.method2202("Attaquer", 27626);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lke;")
    public static class256 field153 = class316.method2202("Schrifts-=tze geladen)3", 27626);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "Lab;")
    public static class290 field157;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    public static int[] field151;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 4)
    public static void method62(byte arg0) {
        field159 = null;
        field157 = null;
        field149 = null;
        if (arg0 == -70) {
            field151 = null;
            field153 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ)V", line = 26)
    public static final void method63(int arg0, int arg1, boolean arg2) {
        class201.field3658[arg0] = arg1;
        field155++;
        if (!arg2) {
            field153 = (class256) null;
        }
        class155 var3 = (class155) class172.field3052.method1744((byte) 123, (long) arg0);
        if (var3 == null) {
            class155 var4 = new class155(4611686018427387905L);
            class172.field3052.method1749(true, var4, (long) arg0);
        } else if (var3.field2765 != 4611686018427387905L) {
            var3.field2765 = class224.method1536(!arg2) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILra;)Lea;", line = 55)
    public static final class231 method64(int arg0, class41 arg1) {
        if (arg0 != 15) {
            field152 = -28;
        }
        field158++;
        return new class231(arg1.method309(2), arg1.method309(arg0 ^ 0xD), arg1.method309(2), arg1.method309(2), arg1.method349((byte) 87), arg1.method349((byte) 60), arg1.method357(false));
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lla;IIIIZI)V", line = 67)
    public static final void method65(class188 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field156++;
        if (arg5) {
            return;
        }
        int var7 = arg4 * arg4 + arg6 * arg6;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg0.field3391 / 2, arg0.field3343 / 2);
        if (var7 <= (var8 * var8)) {
            class300.method2097(-904, arg1, arg6, arg3, class320.field5486[arg2], arg0, arg4);
            return;
        }
        var8 -= 10;
        int var9 = class289.field5001 + class215.field3839 & 0x7FF;
        int var10 = class136.field2372[var9];
        int var11 = var10 * 256 / (class162.field2880 + 256);
        int var12 = class136.field2366[var9];
        int var13 = var12 * 256 / (class162.field2880 + 256);
        int var14 = arg6 * var11 - (arg4 * var13) >> 16;
        int var15 = arg6 * var13 + (arg4 * var11) >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var8);
        if (class253.field4323) {
            ((class87) class236.field4030[arg2]).method641(240, 240, (arg0.field3391 / 2 + arg3 + var18) * 16, (arg0.field3343 / 2 + arg1 - var19) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class227) class236.field4030[arg2]).method1486(arg3 - (-(arg0.field3391 / 2) - var18) - 10, arg0.field3343 / 2 + arg1 + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIII)V", line = 129)
    public static final void method66(int arg0, int arg1, int arg2, int arg3) {
        field150++;
        class77 var4 = class156.method1158(arg3, false, arg1);
        var4.method584(arg3 ^ 0x59DB);
        var4.field1455 = arg0;
        var4.field1459 = arg2;
    }
}
