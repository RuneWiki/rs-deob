import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class30 {

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lmb;")
    public static class160 field445 = new class160();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Lcf;")
    private static class93 field455 = class147.method1066("Dec", -48);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lcf;")
    private static class93 field450 = class147.method1066("Mar", -48);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lcf;")
    private static class93 field457 = class147.method1066("Jan", -48);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "Lcf;")
    public static class93 field451 = class147.method1066("<img=1>", -48);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lcf;")
    private static class93 field458 = class147.method1066("Jul", -48);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Lcf;")
    private static class93 field453 = class147.method1066("Aug", -48);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Lcf;")
    private static class93 field456 = class147.method1066("Apr", -48);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lcf;")
    private static class93 field460 = class147.method1066("Jun", -48);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lcf;")
    private static class93 field448 = class147.method1066("Sep", -48);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "Lcf;")
    private static class93 field452 = class147.method1066("Feb", -48);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lcf;")
    private static class93 field461 = class147.method1066("Nov", -48);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lcf;")
    private static class93 field462 = class147.method1066("May", -48);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Lcf;")
    private static class93 field463 = class147.method1066("Oct", -48);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "[Lcf;")
    public static class93[] field454 = new class93[] { field457, field452, field450, field456, field462, field460, field458, field453, field448, field463, field461, field455 };

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "J")
    public long field440;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Lgl;")
    public class211 field459;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Ljl;")
    public static class245 field444;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BZLcf;)V")
    public static final void method175(byte arg0, boolean arg1, class93 arg2) {
        field446++;
        byte var3 = 4;
        if (arg0 != 1) {
            field454 = null;
        }
        int var4 = class140.field2436.method1835(arg2, 250);
        int var5 = class140.field2436.method1826(arg2, 250) * 13;
        int var6 = var3 + 6;
        int var7 = var3 + 6;
        class75.method517(var6 - var3, -var3 + var7, var3 + var4 + var3, var5 - -var3 + var3, 0);
        class75.method513(var6 - var3, -var3 + var7, var4 - (-var3 - var3), var3 + var5 + var3, 16777215);
        class140.field2436.method1821(arg2, var6, var7, var4, var5, 16777215, -1, 1, 1, 0);
        class195.method1396(var3 + var5 + var3, -var3 + var6, var3 + var4 + var3, -var3 + var7, 0);
        if (!arg1) {
            class165.method1201(var7, var5, (byte) 16, var4, var6);
            return;
        }
        try {
            Graphics var8 = class190.field3481.getGraphics();
            class159.field2799.method46(0, 0, 23, var8);
        } catch (Exception var9) {
            class190.field3481.repaint();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lob;")
    public static final class131 method176(int arg0, int arg1) {
        class131 var2 = (class131) class134.field2347.method1852((long) arg1, (byte) -105);
        field441++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class29.field379.method1271(11, -2154, arg1);
        class131 var4 = new class131();
        if (arg0 != 7255) {
            field454 = null;
        }
        if (var3 != null) {
            var4.method961(2, new class280(var3));
        }
        class134.field2347.method1847(var4, 58, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method177(int arg0) {
        field453 = null;
        field456 = null;
        field463 = null;
        field460 = null;
        if (arg0 > -58) {
            method177(101);
        }
        field450 = null;
        field454 = null;
        field448 = null;
        field458 = null;
        field462 = null;
        field461 = null;
        field451 = null;
        field444 = null;
        field452 = null;
        field457 = null;
        field445 = null;
        field455 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public static final void method178(int arg0) {
        field443++;
        if (arg0 <= 16) {
            return;
        }
        if (class105.field1823 < class178.field3134) {
            class105.field1823 = (float) ((double) class105.field1823 / 30.0D + (double) class105.field1823);
            if (class178.field3134 < class105.field1823) {
                class105.field1823 = class178.field3134;
            }
            class287.method1967(101);
        } else if (class178.field3134 < class105.field1823) {
            class105.field1823 = (float) ((double) class105.field1823 - (double) class105.field1823 / 30.0D);
            if (class105.field1823 < class178.field3134) {
                class105.field1823 = class178.field3134;
            }
            class287.method1967(120);
        }
        if (class89.field1591 == -1 || class14.field168 == -1) {
            return;
        }
        int var1 = class89.field1591 - class71.field1287;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class71.field1287 += var1;
        int var2 = class14.field168 - class154.field2700;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        if (var1 == 0 && var2 == 0) {
            class89.field1591 = -1;
            class14.field168 = -1;
        }
        class154.field2700 += var2;
        class287.method1967(58);
    }
}
