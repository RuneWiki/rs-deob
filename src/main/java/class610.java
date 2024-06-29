import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class610 extends class103 implements class322 {

    @OriginalMember(owner = "client!pca", name = "w", descriptor = "I")
    private int field8777;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "Lvf;")
    public static class131 field8770 = new class131();

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "[F")
    public static float[] field8773 = new float[4];

    @OriginalMember(owner = "client!pca", name = "x", descriptor = "S")
    public static short field8778 = 205;

    @OriginalMember(owner = "client!pca", name = "u", descriptor = "Lju;")
    public static class107 field8775 = new class107();

    @OriginalMember(owner = "client!pca", name = "B", descriptor = "[C")
    public static char[] field8782 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!pca", name = "t", descriptor = "I")
    public static int field8774;

    @OriginalMember(owner = "client!pca", name = "v", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!pca", name = "y", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!pca", name = "z", descriptor = "I")
    public static int field8780;

    @OriginalMember(owner = "client!pca", name = "A", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "Lan;")
    public static class21 field8772;

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Lgi;I[BIZ)V")
    public class610(class583 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field8777 = arg1;
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)V")
    public final void method730(int arg0) {
        ++field8780;
        super.field1561.method3349(this, 34963);
        if (arg0 != 255) {
            method3572(13, -122);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)I")
    public final int method1995(int arg0) {
        if (arg0 != -16846) {
            method3570((byte) 91);
        }
        ++field8779;
        return super.field1565;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V")
    public static void method3570(byte arg0) {
        field8782 = null;
        field8770 = null;
        field8773 = null;
        if (arg0 != -72) {
            method3572(26, 29);
        }
        field8772 = null;
        field8775 = null;
    }

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(I)V")
    public static final void method3571(int arg0) {
        ++field8774;
        if (arg0 < 29) {
            method3571(54);
        }
        class83.method631();
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(II)V")
    public static final void method3572(int arg0, int arg1) {
        class485 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class174 var4 = class608.field8767[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class34.field624; ++var5) {
                    for (int var6 = 0; var6 < class332.field4447; ++var6) {
                        var2 = var4.method1096(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class272.field3786;
                            int var8 = var5 << class272.field3786;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class174 var10 = class608.field8767[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1104(var6, var5) - var10.method1104(var6, var5);
                                    int var12 = var4.method1104(var6 + 1, var5) - var10.method1104(var6 + 1, var5);
                                    int var13 = var4.method1104(var6 + 1, var5 + 1) - var10.method1104(var6 + 1, var5 + 1);
                                    int var14 = var4.method1104(var6, var5 + 1) - var10.method1104(var6, var5 + 1);
                                    var10.method1107(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)I")
    public final int method1996(int arg0) {
        if (arg0 != -17760) {
            this.method1997(36);
        }
        ++field8776;
        return this.field8777;
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)J")
    public final long method1997(int arg0) {
        if (arg0 != -14011) {
            this.method1998((byte) 0, (byte[]) null, 85, -93);
        }
        ++field8781;
        return 0L;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B[BII)V")
    public final void method1998(byte arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 <= 117) {
            this.method1998((byte) -73, (byte[]) null, -125, -14);
        }
        this.method733(arg1, arg2, 0);
        ++field8771;
        this.field8777 = arg3;
    }
}
