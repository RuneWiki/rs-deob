import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class194 {

    @OriginalMember(owner = "client!na", name = "w", descriptor = "I")
    public static int field629 = 0;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "[I")
    public static int[] field627 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!na", name = "x", descriptor = "[Z")
    public static boolean[] field630 = new boolean[200];

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
    public static boolean field633 = false;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field622 = 50;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "Lqk;")
    private static class207 field639 = class24.method212(255, "Hidden");

    @OriginalMember(owner = "client!na", name = "t", descriptor = "Lqk;")
    public static class207 field626 = field639;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "I")
    public static int field641 = 0;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public int field621;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "Luh;")
    public static class100 field632;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Z")
    public static boolean field624;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "[I")
    public int[] field628;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
    public int[] field635;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "[I")
    public int[] field637;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "[Lqe;")
    public class96[] field631;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[Lqe;")
    public class96[] field640;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "[[[B")
    public byte[][][] field634;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(B)V")
    public static void method239(byte arg0) {
        field626 = null;
        field639 = null;
        field632 = null;
        field630 = null;
        field627 = null;
        if (arg0 > -94) {
            method239((byte) -30);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIZ)V")
    public static final void method240(int arg0, int arg1, boolean arg2) {
        class62.field1137 = arg0 - class198.field3473;
        field623++;
        class48.field950 = class111.field1932 + class70.field1253 - arg1 - 1;
        int var3 = (int) ((float) class231.field4240.field4037 / class12.field170) + class62.field1137;
        int var4 = class48.field950 - ((int) ((float) class231.field4240.field3948 / class12.field170));
        int var5 = class62.field1137 - ((int) ((float) class231.field4240.field4037 / class12.field170));
        if (var5 < 0) {
            class62.field1137 = (int) ((float) class231.field4240.field4037 / class12.field170);
        }
        if (var3 > class197.field3463) {
            class62.field1137 = class197.field3463 - (int) ((float) class231.field4240.field4037 / class12.field170);
        }
        if (!arg2) {
            method242(-112, 7, -6, -105, (class235) null, 55L, (class235) null, (class235) null);
        }
        int var6 = (int) ((float) class231.field4240.field3948 / class12.field170) + class48.field950;
        if (var4 < 0) {
            class48.field950 = (int) ((float) class231.field4240.field3948 / class12.field170);
        }
        if (var6 > class70.field1253) {
            class48.field950 = class70.field1253 - ((int) ((float) class231.field4240.field3948 / class12.field170));
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILmd;)V")
    public static final void method241(int arg0, int arg1, int arg2, int arg3, class220 arg4) {
        field638++;
        if (arg0 != 4703) {
            method240(96, -78, true);
        }
        if (class185.field3283 < 3) {
            ((class139) class115.field1987).method385(arg1, arg3, arg4.field4037, arg4.field3948, class115.field1987.field1802 / 2, class115.field1987.field1811 / 2, class266.field4711, 256, arg4.field4026, arg4.field3907);
        } else {
            class23.method149(arg1, arg3, 0, arg4.field4026, arg4.field3907);
        }
        class212.field3766[arg2] = true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIILdc;JLdc;Ldc;)V")
    public static final void method242(int arg0, int arg1, int arg2, int arg3, class235 arg4, long arg5, class235 arg6, class235 arg7) {
        class98 var9 = new class98();
        var9.field1736 = arg4;
        var9.field1726 = arg1 * 128 + 64;
        var9.field1735 = arg2 * 128 + 64;
        var9.field1721 = arg3;
        var9.field1720 = arg5;
        var9.field1731 = arg6;
        var9.field1722 = arg7;
        int var10 = 0;
        class174 var11 = class82.field1498[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3138; var12++) {
                class288 var13 = var11.field3140[var12];
                if ((var13.field5129 & 0x400000L) == 4194304L) {
                    int var14 = var13.field5136.method80();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1727 = -var10;
        if (class82.field1498[arg0][arg1][arg2] == null) {
            class82.field1498[arg0][arg1][arg2] = new class174(arg0, arg1, arg2);
        }
        class82.field1498[arg0][arg1][arg2].field3145 = var9;
    }
}
