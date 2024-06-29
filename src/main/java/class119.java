import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class119 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "Lbu;")
    public static class21 field1832 = new class21(120, 4);

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "Z")
    public static boolean field1835 = false;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIILha;I)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5) {
        field1836++;
        arg4.method434(arg1, arg0, arg1 + arg3, arg0 + arg2);
        if (arg5 != 27911) {
            field1834 = -81;
        }
        arg4.method436(arg1, arg3, -16777216, arg0, true, arg2);
        if (class197.field3016 < 100) {
            return;
        }
        float var6 = (float) class117.field1803 / (float) class117.field1816;
        int var7 = arg3;
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg2 / var6);
        }
        int var9 = (arg2 - var8) / 2 + arg0;
        int var10 = (arg3 - var7) / 2 + arg1;
        if (class145.field2117 == null || arg3 != class145.field2117.method1508() || class145.field2117.method1502() != arg2) {
            class117.method876(class117.field1804, class117.field1806 + class117.field1803, class117.field1816 + class117.field1804, class117.field1806, var10, var9, var7 + var10, var9 - -var8);
            class117.method892(arg4);
            class145.field2117 = arg4.method479(var10, var9, var7, var8, false);
        }
        class145.field2117.method1604(var10, var9);
        int var11 = class98.field1117 * var7 / class117.field1816;
        int var12 = class776.field10665 * var8 / class117.field1803;
        int var13 = class577.field8135 * var7 / class117.field1816 + var10;
        int var14 = var8 + var9 - (class488.field6906 * var8 / class117.field1803) - var12;
        int var15 = -1996554240;
        if (class60.field734 == class588.field8297) {
            var15 = -1996488705;
        }
        arg4.method495(var13, var14, var11, var12, var15, 1);
        arg4.method520(var13, var14, var11, var12, var15, 0);
        if (class503.field7134 <= 0) {
            return;
        }
        int var16;
        if (class788.field10817 > 50) {
            var16 = 500 - class788.field10817 * 5;
        } else {
            var16 = class788.field10817 * 5;
        }
        for (class492 var17 = (class492) class117.field1801.method1731((byte) -114); var17 != null; var17 = (class492) class117.field1801.method1724(0)) {
            class413 var18 = class117.field1786.method1231(74, var17.field6971);
            if (class222.method1515(var18, 21961)) {
                if (class735.field10154 == var17.field6971) {
                    int var21 = var17.field6970 * var7 / class117.field1816 + var10;
                    int var22 = (class117.field1803 - var17.field6969) * var8 / class117.field1803 + var9;
                    arg4.method436(var21 - 2, 4, var16 << 24 | 0xFFFF00, var22 - 2, true, 4);
                } else if (class399.field5481 != -1 && class399.field5481 == var18.field5656) {
                    int var19 = var17.field6970 * var7 / class117.field1816 + var10;
                    int var20 = (class117.field1803 - var17.field6969) * var8 / class117.field1803 + var9;
                    arg4.method436(var19 - 2, 4, var16 << 24 | 0xFFFF00, var20 - 2, true, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)V")
    public static void method898(boolean arg0) {
        if (!arg0) {
            method899(-114, null, 28);
        }
        field1832 = null;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ILwia;I)Lie;")
    public static final class6 method899(int arg0, class791 arg1, int arg2) {
        field1833++;
        byte[] var3 = arg1.method4335(arg2, 0);
        if (arg0 != -30298) {
            field1834 = 42;
        }
        return var3 == null ? null : new class6(var3);
    }
}
