import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class219 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3194 = "slide:";

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lie;")
    public static class2 field3193 = new class2();

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "[I")
    public static int[] field3199;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "[[[B")
    public static byte[][][] field3202;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)Lvc;")
    public static final class127 method1525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3198++;
        long var5 = (long) arg3 & 0xFFFFL | (long) arg1 << 16 & 0xFFFFL << 16 | (long) arg0 << 48 & 0xFFFFL << 48 | ((long) arg4 & 0xFFFFL) << 32;
        class127 var7 = (class127) class134.field2196.method1418(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (arg2 == 1619234272) {
            class173[] var8 = null;
            class98 var9 = class44.method269(arg3, 0);
            if (var9.field1670 != null) {
                var8 = new class173[var9.field1670.length];
                for (int var10 = 0; var10 < var8.length; var10++) {
                    class256 var11 = class279.method1935(arg2 ^ 0x60838DFE, var9.field1670[var10]);
                    var8[var10] = new class173(var11.field3862, var11.field3873, var11.field3863, var11.field3868, var11.field3860, var11.field3869, var11.field3874, var11.field3865);
                }
            }
            class127 var12 = new class127(var9.field1669, var8, var9.field1668, arg0, arg4, arg1);
            class134.field2196.method1421(var5, var12, (byte) 127);
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(II)Z")
    public static final boolean method1526(int arg0, int arg1) {
        field3201++;
        if (~arg0 > arg1) {
            return false;
        }
        int var2 = class204.field3009[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1004;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static final void method1527(int arg0) {
        field3197++;
        if (arg0 != 0) {
            method1531((String) null, -51);
        }
        class294.field4677.method1420((byte) -27);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLca;Ljava/lang/Object;)V")
    public static final void method1528(byte arg0, class122 arg1, Object arg2) {
        if (arg0 != 101) {
            return;
        }
        field3196++;
        if (arg1.field2012 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field2012.peekEvent() != null; var3++) {
            class155.method1130(1, 1L);
        }
        if (arg2 != null) {
            arg1.field2012.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static void method1529(byte arg0) {
        field3202 = null;
        field3194 = null;
        field3199 = null;
        field3193 = null;
        if (arg0 <= 74) {
            field3194 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method1530(int arg0) {
        field3195++;
        class65.field982.method1072(0);
        if (arg0 == -1) {
            class142.field2293.method1449(-12452);
            class86.field1360.method1449(-12452);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1531(String arg0, int arg1) {
        if (arg1 != 2781) {
            field3193 = null;
        }
        field3200++;
        return class57.method401(arg0, 10, 69, true);
    }
}
