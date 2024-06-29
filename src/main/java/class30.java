import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class30 {

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[Li;")
    private class181[] field496;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lli;")
    public static class185 field493 = class245.method1649("Polices charg-Bes", 124);

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lli;")
    private static class185 field499 = class245.method1649("Loaded sprites", -6);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lli;")
    public static class185 field492 = field499;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lgf;")
    public static class7 field495 = new class7(30);

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lgj;")
    public static class196 field497;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field500;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([Lcg;[Lcg;[Lcg;Lhi;[Lda;[Lcg;I)V")
    public static final void method183(class34[] arg0, class34[] arg1, class34[] arg2, class250 arg3, class101[] arg4, class34[] arg5, int arg6) {
        class266.field4717 = arg2;
        field494++;
        class76.field1320 = arg3;
        class193.field3570 = arg0;
        class183.field3376 = arg5;
        int var7 = -22 / ((arg6 + 6) / 38);
        class183.field3375 = arg4;
        class122.field2213 = arg1;
        class196.field3590 = new boolean[class183.field3375.length];
        class235.field4213.method1383((byte) 64);
        int var8 = class76.field1320.method1694(class90.field1743, -2);
        int[] var9 = class76.field1320.method1698(false, var8);
        for (int var10 = 0; var10 < var9.length; var10++) {
            class235.field4213.method1382(class245.method1648((byte) 1, new class118(class76.field1320.method1688(0, var9[var10], var8))), (byte) -57);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)I")
    public static final int method184(int arg0, byte arg1) {
        field498++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg1 > -117) {
            return -13;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class156 var7 = new class156();
        var7.field2952 = arg1 / 128;
        var7.field2965 = arg2 / 128;
        var7.field2954 = arg3 / 128;
        var7.field2946 = arg4 / 128;
        var7.field2944 = arg0;
        var7.field2961 = arg1;
        var7.field2956 = arg2;
        var7.field2964 = arg3;
        var7.field2959 = arg4;
        var7.field2948 = arg5;
        var7.field2938 = arg6;
        class113.field2038[class156.field2968++] = var7;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method186(int arg0) {
        if (arg0 != 30701) {
            field499 = null;
        }
        field493 = null;
        field499 = null;
        field497 = null;
        field495 = null;
        field492 = null;
        field500 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        this.field496 = new class181[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class181 var3 = this.field496[var2] = new class181();
            var3.field3322 = var3;
            var3.field3320 = var3;
        }
    }
}
