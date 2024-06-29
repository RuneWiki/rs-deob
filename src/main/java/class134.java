import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class134 extends class155 {

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "Lr;")
    public class68 field2200;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field2199 = 2;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "Lmh;")
    public static class263 field2194 = null;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "[I")
    public static int[] field2201 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Lpi;")
    public static class201 field2196 = new class201(4);

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "[[Lmh;")
    public static class263[][] field2195;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(BI)V")
    public static final void method1014(byte arg0, int arg1) {
        class284.field4563 = new int[arg1];
        class57.field824 = new int[arg1];
        class35.field447 = new int[arg1];
        class209.field3088 = new int[arg1];
        class169.field2560 = new int[arg1];
        if (arg0 == 43) {
            field2192++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public static final void method1015(int arg0) {
        if (arg0 != 137) {
            field2201 = null;
        }
        class253.field3821.method1420((byte) -127);
        class186.field2771.method1420((byte) 118);
        field2190++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BIIIII)V")
    public static final void method1016(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class89.method669(class104.field1795[arg3], arg4, arg1 + arg5, arg1 - arg5, (byte) -123);
        field2193++;
        int var6 = arg2;
        int var7 = -28 % ((arg0 - 24) / 34);
        int var8 = arg5 * arg5;
        int var9 = 0;
        int var10 = arg2 * arg2;
        int var11 = var8 << 1;
        int var12 = arg2 << 1;
        int var13 = var10 << 1;
        int var14 = var8 << 2;
        int var15 = (1 - var12) * var8 + var13;
        int var16 = ((var9 << 1) + 3) * var13;
        int var17 = var10 << 2;
        int var18 = var10 - ((var12 - 1) * var11);
        int var19 = (var9 + 1) * var17;
        int var20 = ((arg2 << 1) - 3) * var11;
        int var21 = (arg2 - 1) * var14;
        while (var6 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var9++;
                    var18 += var19;
                    var15 += var16;
                    var19 += var17;
                    var16 += var17;
                }
            }
            var6--;
            if (var18 < 0) {
                var15 += var16;
                var9++;
                var18 += var19;
                var16 += var17;
                var19 += var17;
            }
            var18 += -var20;
            var15 += -var21;
            var20 -= var14;
            int var22 = arg3 - var6;
            int var23 = arg3 + var6;
            var21 -= var14;
            int var24 = arg1 - var9;
            int var25 = arg1 + var9;
            class89.method669(class104.field1795[var22], arg4, var25, var24, (byte) -126);
            class89.method669(class104.field1795[var23], arg4, var25, var24, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static void method1017(byte arg0) {
        field2201 = null;
        if (arg0 <= 23) {
            method1014((byte) 42, -105);
        }
        field2195 = null;
        field2196 = null;
        field2194 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V")
    public static final void method1018(int arg0, boolean arg1) {
        if (!arg1) {
            field2198++;
            class279 var2 = class111.method844(arg0, 4, -1780180960);
            var2.method1934((byte) -114);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lr;)V")
    public class134(class68 arg0) {
        this.field2200 = arg0;
    }
}
