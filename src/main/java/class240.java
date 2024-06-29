import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class240 extends class139 {

    @OriginalMember(owner = "client!kk", name = "H", descriptor = "[B")
    public byte[] field3836;

    @OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
    public static int field3826 = 0;

    @OriginalMember(owner = "client!kk", name = "G", descriptor = "I")
    public static int field3835 = 0;

    @OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!kk", name = "F", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!kk", name = "I", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!kk", name = "B", descriptor = "Lql;")
    public static class224 field3830;

    @OriginalMember(owner = "client!kk", name = "z", descriptor = "Llc;")
    public static class86 field3828;

    @OriginalMember(owner = "client!kk", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field3827;

    @OriginalMember(owner = "client!kk", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3829;

    @OriginalMember(owner = "client!kk", name = "C", descriptor = "[[I")
    public static int[][] field3831;

    @OriginalMember(owner = "client!kk", name = "D", descriptor = "[[[B")
    public static byte[][][] field3832;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)V")
    public static final void method1680(byte arg0) {
        if (arg0 >= 65) {
            class181.field2915.method1558(-71);
            field3834++;
        }
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(I)V")
    public static void method1681(int arg0) {
        field3832 = null;
        field3827 = null;
        if (arg0 != -26222) {
            field3828 = null;
        }
        field3830 = null;
        field3829 = null;
        field3828 = null;
        field3831 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1682(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -6384) {
            field3827 = null;
        }
        field3838++;
        int var8 = class281.method1924(false, class228.field3657, class207.field3328, arg2);
        int var9 = class281.method1924(false, class228.field3657, class207.field3328, arg3);
        int var10 = class281.method1924(false, class211.field3386, class272.field4374, arg0);
        int var11 = class281.method1924(false, class211.field3386, class272.field4374, arg6);
        int var12 = class281.method1924(false, class228.field3657, class207.field3328, arg2 + arg5);
        int var13 = class281.method1924(false, class228.field3657, class207.field3328, arg3 - arg5);
        for (int var14 = var8; var14 < var12; var14++) {
            class177.method1330(field3831[var14], var10, arg1, 32232, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class177.method1330(field3831[var15], var10, arg1, 32232, var11);
        }
        int var16 = class281.method1924(false, class211.field3386, class272.field4374, arg0 + arg5);
        int var17 = class281.method1924(false, class211.field3386, class272.field4374, arg6 - arg5);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = field3831[var18];
            class177.method1330(var19, var10, arg1, 32232, var16);
            class177.method1330(var19, var16, arg4, arg7 ^ 0xFFFF9AF8, var17);
            class177.method1330(var19, var17, arg1, arg7 + 38616, var11);
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)I")
    public static final int method1683(byte arg0) {
        field3837++;
        return arg0 < 9 ? 9 : 15;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "([B)V")
    public class240(byte[] arg0) {
        this.field3836 = arg0;
    }
}
