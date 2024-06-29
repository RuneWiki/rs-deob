import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class438 {

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lwf;")
    public static class79 field6087 = new class79(38, 7);

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
    public static int[] field6091 = new int[13];

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field6092 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field6090 = 0;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)I")
    public abstract int method1193(int arg0);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method2576(int arg0) {
        field6091 = null;
        field6087 = null;
        if (arg0 < 101) {
            method2578(73);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBLb;)Lw;")
    public static final class179 method2577(int arg0, int arg1, byte arg2, class201 arg3) {
        field6086++;
        class276 var4 = new class276(arg3.method1257(arg0, arg1, arg2 ^ 0x5F88));
        class179 var5 = new class179(arg0, var4.method1750(-121), var4.method1750(arg2 - 12), var4.method1688(20402), var4.method1688(20402), var4.method1701(-23121) == 1, var4.method1701(arg2 - 23223), var4.method1701(-23121));
        int var6 = var4.method1701(arg2 ^ 0xFFFFA5C9);
        if (arg2 != 102) {
            return null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field2582.method2845(new class218(var4.method1701(-23121), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280), var4.method1729(65280)), (byte) 37);
        }
        var5.method1094(125);
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)I")
    public static final int method2578(int arg0) {
        if (arg0 != -1) {
            method2576(-105);
        }
        field6088++;
        return 16;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public static final void method2579(int arg0, int arg1) {
        if (arg1 != 7) {
            method2579(-97, -63);
        }
        class230.field3474 = -1;
        field6089++;
        if (arg0 == 37) {
            class395.field5615 = 3.0F;
        } else if (arg0 == 50) {
            class395.field5615 = 4.0F;
        } else if (arg0 == 75) {
            class395.field5615 = 6.0F;
        } else if (arg0 == 100) {
            class395.field5615 = 8.0F;
        } else if (arg0 == 200) {
            class395.field5615 = 16.0F;
        }
        class230.field3474 = -1;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1194(Component arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1195(Component arg0, int arg1);
}
