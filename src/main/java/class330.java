import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class330 extends class139 {

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field4771 = -1;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "Lkb;")
    public static class449 field4774 = new class449();

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4782 = new String[100];

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "Ldk;")
    public static class326 field4783 = new class326("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "Lwf;")
    public static class79 field4785 = new class79(37, 3);

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "I")
    private int field4776;

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "I")
    private int field4780;

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "Lhi;")
    public static class125 field4781;

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "Ltr;")
    public static class176 field4784;

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "[I")
    public static int[] field4777;

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "[[[Lct;")
    public static class88[][][] field4786;

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(I)V")
    private class330(int arg0) {
        super(0, false);
        this.method2089(-106, arg0);
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)V")
    private final void method2089(int arg0, int arg1) {
        if (arg0 <= -78) {
            this.field4776 = 4080 & arg1 >> 4;
            this.field4780 = 4080 & arg1 << 4;
            ++field4772;
            this.field4778 = 4080 & arg1 >> 12;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (arg1 != -45) {
            this.method2089(-79, 34);
        }
        if (arg2 == 0) {
            this.method2089(-102, arg0.method1748(false));
        }
        ++field4770;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field4768;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 >= -67) {
            this.method2089(66, 58);
        }
        if (super.field1835.field2395) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class356.field5147; ++var7) {
                var4[var7] = this.field4778;
                var5[var7] = this.field4776;
                var6[var7] = this.field4780;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(II)V")
    public static final void method2090(int arg0, int arg1) {
        ++field4779;
        class489 var2 = class116.method731(arg0 + -805296943, 1, arg1);
        var2.method2861(-229012000);
        if (arg0 != 179755535) {
            method2092(-58, 2, 77, (byte) -6, -95, 94, -36, 21);
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class330() {
        this(0);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2091(String arg0, byte arg1) {
        ++field4769;
        int var2 = 1 / (arg1 / 46);
        System.out.println("Error: " + class105.method592(arg0, 0, "%0a", "\n"));
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method2092(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4775;
        int var8 = arg6 - 334;
        if (var8 >= 0) {
            if (var8 > 100) {
                var8 = 100;
            }
        } else {
            var8 = 0;
        }
        int var9 = (-class293.field4248 + class307.field4365) * var8 / 100 + class293.field4248;
        int var10 = arg2 * var9 >> 8;
        int var11 = -arg4 + 16384 & 16383;
        int var12 = 16383 & -arg5 + 16384;
        int var13 = 0;
        if (arg3 > -46) {
            method2094(27, -60, 67);
        }
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class53.field727[var11] * -var10 >> 15;
            var15 = class53.field726[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class53.field727[var12] * var15 >> 15;
            var15 = class53.field726[var12] * var15 >> 15;
        }
        class134.field1778 = -var14 + arg1;
        class30.field407 = arg5;
        class140.field1861 = 0;
        class490.field6904 = arg0 - var13;
        class343.field4996 = -var15 + arg7;
        class214.field3219 = arg4;
    }

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "(B)V")
    public static void method2093(byte arg0) {
        field4782 = null;
        field4786 = null;
        field4785 = null;
        field4777 = null;
        if (arg0 != -110) {
            method2090(-65, 58);
        }
        field4784 = null;
        field4774 = null;
        field4783 = null;
        field4781 = null;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(III)V")
    public static final void method2094(int arg0, int arg1, int arg2) {
        if (arg2 < 79) {
            field4786 = null;
        }
        ++field4773;
        class489 var3 = class116.method731(-625541408, 7, arg1);
        var3.method2863(255);
        var3.field6895 = arg0;
    }
}
