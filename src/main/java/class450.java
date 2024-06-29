import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class450 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field6161;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field6166;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field6169;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public int field6167;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lfja;")
    public static class783 field6165 = new class783(54, -1);

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lkh;")
    public static class17 field6174 = null;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "Lem;")
    public static class239 field6170;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[I")
    public static int[] field6173;

    @OriginalMember(owner = "client!wg", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field6164++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 16)
    public static void method2608(int arg0) {
        field6170 = null;
        field6165 = null;
        field6174 = null;
        field6173 = null;
        if (arg0 != 0) {
            field6173 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)I", line = 32)
    public static final int method2609(int arg0, boolean arg1) {
        field6171++;
        if (class668.field9303 == null) {
            return 0;
        } else if (arg1 || class34.field569 == null) {
            int var2 = arg0;
            for (int var3 = 0; var3 < class668.field9303.length; var3++) {
                int var4 = class668.field9303[var3];
                if (class488.field6592.method3737(var4, false)) {
                    var2++;
                }
                if (class3.field40.method3737(var4, false)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class668.field9303.length * 2;
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIII)V", line = 69)
    public class450(int arg0, int arg1, int arg2, int arg3) {
        this.field6161 = arg3;
        this.field6166 = arg1;
        this.field6169 = arg0;
        this.field6167 = arg2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)I", line = 80)
    public static final int method2610(int arg0, byte arg1) {
        field6168++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 > -43) {
                method2610(13, (byte) -67);
            }
            return class2.method17(-8201, arg0);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([[[Lni;I)V", line = 95)
    public static final void method2611(class549[][][] arg0, int arg1) {
        field6163++;
        for (int var2 = arg1; var2 < arg0.length; var2++) {
            class549[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class549 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7471 instanceof class237) {
                            ((class237) var6.field7471).method1037(arg1 - 1114);
                        }
                        if (var6.field7464 instanceof class237) {
                            ((class237) var6.field7464).method1037(-1114);
                        }
                        if (var6.field7467 instanceof class237) {
                            ((class237) var6.field7467).method1037(-1114);
                        }
                        if (var6.field7462 instanceof class237) {
                            ((class237) var6.field7462).method1037(arg1 ^ 0xFFFFFBA6);
                        }
                        if (var6.field7463 instanceof class237) {
                            ((class237) var6.field7463).method1037(arg1 - 1114);
                        }
                        for (class58 var7 = var6.field7466; var7 != null; var7 = var7.field811) {
                            class597 var8 = var7.field815;
                            if (var8 instanceof class237) {
                                ((class237) var8).method1037(-1114);
                            }
                        }
                    }
                }
            }
        }
    }
}
