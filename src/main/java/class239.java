import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class239 extends class3 {

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[I")
    public static int[] field3819 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "Lok;")
    public static class41 field3826 = class137.method956("::replacecanvas", 45);

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Z")
    public static boolean field3820 = false;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field3832 = 0;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "[I")
    public static int[] field3834 = new int[1000];

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3824 = 0;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "Lmh;")
    public static class65 field3821;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "Lfl;")
    private class86 field3823;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "[[I")
    public static int[][] field3829;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V", line = 5)
    public static void method1710(byte arg0) {
        field3826 = null;
        field3834 = null;
        field3821 = null;
        field3829 = (int[][]) null;
        field3819 = null;
        if (arg0 <= 46) {
            method1716((byte) 37, -104L);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lmh;BLmh;Lmh;)V", line = 19)
    public static final void method1711(class65 arg0, byte arg1, class65 arg2, class65 arg3) {
        class10.field137 = arg0;
        if (arg1 != 68) {
            field3820 = true;
        }
        field3830++;
        class248.field3962 = arg2;
        class312.field5273 = arg3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLok;I)Lok;", line = 36)
    public final class41 method1712(byte arg0, class41 arg1, int arg2) {
        field3827++;
        if (this.field3823 == null) {
            return arg1;
        }
        class167 var4 = (class167) this.field3823.method617((long) arg2, false);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 >= -60) {
                method1713((byte) -128);
            }
            return var4.field2658;
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V", line = 62)
    public static final void method1713(byte arg0) {
        if (arg0 != -128) {
            method1713((byte) -81);
        }
        class285.field4632.method135(18436);
        class111.field1576.method135(18436);
        field3835++;
        class217.field3480.method135(18436);
        class158.field2484.method135(18436);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlb;I)V", line = 76)
    private final void method1714(int arg0, class112 arg1, int arg2) {
        if (arg2 != 13559) {
            method1713((byte) -58);
        }
        if (arg0 == 249) {
            int var4 = arg1.method792(2);
            if (this.field3823 == null) {
                int var5 = class110.method746(var4, -705295902);
                this.field3823 = new class86(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method792(2) == 1;
                int var8 = arg1.method757(11997);
                class59 var9;
                if (var7) {
                    var9 = new class167(arg1.method763(true));
                } else {
                    var9 = new class55(arg1.method779(-27100));
                }
                this.field3823.method610(127, var9, (long) var8);
            }
        }
        field3822++;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Llb;I)V", line = 126)
    public final void method1715(class112 arg0, int arg1) {
        int var3 = -70 / ((-arg1 - 51) / 40);
        field3828++;
        while (true) {
            int var4 = arg0.method792(2);
            if (var4 == 0) {
                return;
            }
            this.method1714(var4, arg0, 13559);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BJ)V", line = 144)
    public static final void method1716(byte arg0, long arg1) {
        if (arg0 != 28) {
            field3820 = true;
        }
        field3818++;
        if (arg1 != 0L) {
            class285.field4642.method844(-4, 136);
            class271.field4394++;
            class285.field4642.method800(arg1, (byte) -113);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILmh;I)Laf;", line = 163)
    public static final class72 method1717(int arg0, class65 arg1, int arg2) {
        field3825++;
        if (arg2 != 136) {
            field3824 = -84;
        }
        return class226.method1628(arg0, (byte) -110, arg1) ? class1.method3(arg2 ^ 0xFFFE79D7) : null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)I", line = 212)
    public final int method1718(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3820 = false;
        }
        field3831++;
        if (this.field3823 == null) {
            return arg1;
        } else {
            class55 var4 = (class55) this.field3823.method617((long) arg2, false);
            return var4 == null ? arg1 : var4.field804;
        }
    }
}
