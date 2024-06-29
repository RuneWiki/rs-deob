import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class134 extends class128 {

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Loe;")
    public class57 field1844;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "Z")
    public static boolean field1845 = false;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Z")
    public static boolean field1846 = false;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public int field1850;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "[I")
    public static int[] field1843;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "[[B")
    public static byte[][] field1847;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static void method841(byte arg0) {
        field1843 = null;
        field1847 = null;
        if (arg0 != -55) {
            method844(-76);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILmi;IBIII)Lmi;")
    public static final class94 method842(int arg0, class94 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field1842++;
        long var7 = (long) arg2;
        class94 var9 = (class94) class192.field2925.method950(var7, (byte) -45);
        if (var9 == null) {
            class162 var10 = class162.method1036(class29.field449, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1024(64, 768, -50, -10, -50);
            class192.field2925.method942(var7, (byte) 108, var9);
        }
        if (arg3 != -114) {
            field1840 = -104;
        }
        int var11 = arg1.method434();
        int var12 = arg1.method419();
        int var13 = arg1.method433();
        int var14 = arg1.method426();
        class94 var15 = var9.method404(true, true, true);
        if (arg0 != 0) {
            var15.method411(arg0);
        }
        class66 var16 = (class66) var15;
        if (arg5 != class58.method360(arg4 + var13, arg6 + var11, false, class166.field2364) || class58.method360(arg4 + var14, arg6 - -var12, false, class166.field2364) != arg5) {
            for (int var17 = 0; var17 < var16.field899; var17++) {
                var16.field901[var17] += class58.method360(var16.field903[var17] + arg4, var16.field872[var17] - -arg6, false, class166.field2364) - arg5;
            }
            var16.field882 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIII)V")
    public final void method843(byte arg0, int arg1, int arg2, int arg3) {
        this.field1848 = arg1;
        this.field1841 = arg2;
        field1849++;
        this.field1855 = arg3;
        if (arg0 >= -90) {
            this.method843((byte) -74, 39, 8, 4);
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)[Lbf;")
    public static final class108[] method844(int arg0) {
        field1857++;
        if (arg0 <= 37) {
            field1845 = true;
        }
        class108[] var1 = new class108[class56.field784];
        for (int var2 = 0; var2 < class56.field784; var2++) {
            int var3 = class137.field1869[var2] * class112.field1613[var2];
            byte[] var4 = field1847[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class298.field4748[class32.method199(var4[var6], 255)];
            }
            var1[var2] = new class203(class242.field3805, class70.field1021, class275.field4376[var2], class96.field1381[var2], class137.field1869[var2], class112.field1613[var2], var5);
        }
        class282.method1840(true);
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Loe;Lte;)V")
    public class134(class57 arg0, class220 arg1) {
        this.field1844 = arg0;
    }
}
