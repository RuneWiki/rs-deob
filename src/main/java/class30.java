import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 extends class45 {

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public int field435;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field432;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "Lwr;")
    public static class368 field430 = new class368();

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[Z")
    public static boolean[] field437 = new boolean[112];

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field434;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    public static final void method201(int arg0) {
        int var1 = -97 % ((-arg0 - 6) / 43);
        class93.field1329.method1136((byte) -97);
        field436++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public static final void method202(byte arg0) {
        if (class61.field807 != null) {
            class385.field5587.method998((byte) -111);
            class87.method618();
            class431.method2731(-1);
            class276.method1900((byte) -84);
            class33.method219((byte) 90);
            class284.method1955(19);
            if (class247.field3331 != null) {
                class247.field3331.method2761((byte) -44);
            }
            class308.method2098(-22489);
            class376.method2444(18880);
            class283.method1950((byte) 70);
            class245.method1471(false, false);
            client.method1539(-115);
            for (int var1 = 0; var1 < 2048; var1++) {
                class25 var5 = class206.field2777[var1];
                if (var5 != null) {
                    var5.field4368 = null;
                    for (int var6 = 0; var6 < var5.field4352.length; var6++) {
                        var5.field4352[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class306.field4496.length; var2++) {
                class43 var3 = class306.field4496[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4352.length; var4++) {
                        var3.field4352[var4] = null;
                    }
                }
            }
            class61.field807.method2617(1);
            class61.field807 = null;
        }
        field431++;
        if (arg0 < 21) {
            method204(false);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIIIII)V")
    public static final void method203(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field433++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg3 >= class379.field5521 && arg3 <= class125.field1751) {
            int var20 = class304.method2068(class87.field1227, arg4 + arg2, -112, class299.field4382);
            int var21 = class304.method2068(class87.field1227, arg4 - arg2, -123, class299.field4382);
            class207.method1221((byte) -125, var21, var20, class384.field5560[arg3], arg1);
        }
        if (arg0 != -72) {
            return;
        }
        int var22 = (arg5 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var22;
            var14 += -var18;
            var18 -= var15;
            var22 -= var15;
            var7--;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class379.field5521 && class125.field1751 >= var23) {
                int var25 = class304.method2068(class87.field1227, arg4 + var6, -96, class299.field4382);
                int var26 = class304.method2068(class87.field1227, arg4 - var6, -100, class299.field4382);
                if (var23 >= class379.field5521) {
                    class207.method1221((byte) -124, var26, var25, class384.field5560[var23], arg1);
                }
                if (var24 <= class125.field1751) {
                    class207.method1221((byte) -128, var26, var25, class384.field5560[var24], arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)V")
    public static void method204(boolean arg0) {
        field434 = null;
        field430 = null;
        field437 = null;
        if (!arg0) {
            field430 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lnj;B)Lmo;")
    public static final class195 method205(class228 arg0, byte arg1) {
        if (arg1 != 99) {
            method202((byte) -47);
        }
        field429++;
        return new class195(arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1319((byte) -13), arg0.method1333((byte) -128), arg0.method1333((byte) -124), arg0.method1348(-114));
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(II)V")
    public class30(int arg0, int arg1) {
        this.field435 = arg0;
        this.field432 = arg1;
    }
}
