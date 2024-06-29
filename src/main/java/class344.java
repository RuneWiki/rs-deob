import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class344 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "D")
    public static double field4807 = -1.0D;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "[[B")
    public static byte[][] field4812 = new byte[50][];

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public static int[] field4810 = new int[200];

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "[I")
    public static int[] field4813 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4815 = "Choose Option";

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method2203(int arg0, int arg1, int arg2) {
        field4809++;
        if (arg1 != 2836) {
            return 26;
        }
        class124 var3 = (class124) class71.field1103.method1412((byte) -54, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field1740.length) {
            return var3.field1740[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IZ)I")
    public static final int method2204(int arg0, boolean arg1) {
        if (arg1) {
            field4808++;
            return arg0 >>> 7;
        } else {
            return -108;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method2205(byte arg0) {
        class362.field5087.method1243(1000);
        field4806++;
        if (arg0 != -84) {
            field4812 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V")
    public static final void method2206(int arg0, int arg1, int arg2) {
        class142 var3 = class5.field79[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field2052 != null) {
            var3.field2052 = null;
        }
        if (var3.field2035 != null) {
            var3.field2035 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method2207(int arg0, Component arg1) {
        if (arg0 == 99) {
            field4805++;
            arg1.addMouseListener(class371.field5260);
            arg1.addMouseMotionListener(class371.field5260);
            arg1.addFocusListener(class371.field5260);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIIFIZ)[I")
    public static final int[] method2208(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, boolean arg7) {
        field4811++;
        int[] var8 = new int[arg3];
        if (arg6 != -6470) {
            field4812 = null;
        }
        class76 var9 = new class76();
        var9.field1188 = arg7;
        var9.field1182 = arg1;
        var9.field1176 = arg0;
        var9.field1181 = (int) (arg5 * 4096.0F);
        var9.field1175 = arg4;
        var9.field1190 = arg2;
        var9.method44(-14);
        class63.method427(1, arg3, (byte) 36);
        var9.method540(var8, (byte) 57, 0);
        return var8;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method2209(int arg0) {
        field4815 = null;
        if (arg0 < 79) {
            field4807 = -1.3774939099647154D;
        }
        field4812 = null;
        field4810 = null;
        field4813 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)Ldp;")
    public static final class2 method2210(int arg0, int arg1) {
        field4814++;
        class2 var2 = (class2) class254.field3480.method567((byte) 54, (long) arg1);
        int var3 = 123 % ((-arg0 - 51) / 41);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class135.field1929.method1920(arg1, false, 19);
        class2 var5 = new class2();
        if (var4 != null) {
            var5.method12(0, new class371(var4));
        }
        class254.field3480.method565(-1, var5, (long) arg1);
        return var5;
    }
}
