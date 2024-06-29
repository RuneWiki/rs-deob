import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class42 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[I")
    private int[] field780;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "[[B")
    public static byte[][] field777 = new byte[250][];

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIII)V")
    public static final void method285(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field781++;
        for (int var5 = arg2; var5 < class29.field502; var5++) {
            if (arg3 < class172.field2999[var5] + class128.field2277[var5] && arg3 + arg4 > class172.field2999[var5] && class166.field2860[var5] + class158.field2749[var5] > arg1 && class166.field2860[var5] < arg0 + arg1) {
                class68.field1289[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIBI)V")
    public static final void method286(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class1.field9 == 1) {
            class29.field517[class202.field3617 / 100].method1010(class218.field3951 - 8, class87.field1661 + -8);
        }
        field786++;
        if (arg3 != -128) {
            field785 = -18;
        }
        if (class1.field9 == 2) {
            class29.field517[class202.field3617 / 100 + 4].method1010(class218.field3951 - 8, class87.field1661 + -8);
        }
        class115.method810(121);
        if (!class47.field878) {
            return;
        }
        int var5 = arg1 + 512 - 5;
        int var6 = arg4 + 20;
        class74.field1424.method426(class70.method555(new class44[] { class119.field2114, class199.method1287(class220.field3995, arg3 ^ 0x7F) }, -3), var5, var6, 16776960, -1);
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var10 = var6 + 15;
        int var9 = 16776960;
        if (var8 > 32768 && class33.field583) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class33.field583) {
            var9 = 16711680;
        }
        class74.field1424.method426(class70.method555(new class44[] { class98.field1815, class199.method1287(var8, -1), class45.field862 }, -3), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)I")
    public final int method287(int arg0, boolean arg1) {
        if (arg1) {
            return -38;
        }
        field778++;
        int var3 = (this.field780.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field780[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field780[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)Lpa;")
    public static final class162 method288(int arg0, int arg1) {
        field784++;
        class162 var2 = (class162) class81.field1580.method1178((long) arg1, 14176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class36.field652.method1466(arg0, arg1, (byte) -124);
        class162 var4 = new class162();
        if (var3 != null) {
            var4.method1044(new class66(var3), -128, arg1);
        }
        class81.field1580.method1183((byte) 111, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static void method289(int arg0) {
        field777 = null;
        if (arg0 != -1) {
            method288(-2, -66);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "([I)V")
    public class42(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field780 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field780[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field780[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field780[var5 + var5] = arg0[var4];
            this.field780[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([IIIII)V")
    public static final void method290(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field782++;
        int var8 = arg3 - 1;
        int var5 = arg1 + var8;
        arg2--;
        while (arg2 < var5) {
            int var6 = arg2 + 1;
            arg0[var6] = arg4;
            int var7 = var6 + 1;
            arg0[var7] = arg4;
            int var9 = var7 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg2 = var13 + 1;
            arg0[arg2] = arg4;
        }
        while (arg2 < var8) {
            arg2++;
            arg0[arg2] = arg4;
        }
    }
}
