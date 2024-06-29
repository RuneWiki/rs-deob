import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class308 {

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4954 = null;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field4947 = 0;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field4948 = -1;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4955 = "Starting 3d Library";

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "I")
    public static int field4952;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public int field4956;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "J")
    public long field4950;

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Lsk;")
    public class202 field4953;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2092(byte arg0, String arg1) {
        field4949++;
        if (arg0 <= 113) {
            field4954 = null;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = class104.method662((byte) -123, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method2093(int arg0) {
        class131.field1831 = arg0;
        for (int var1 = 0; var1 < class207.field3086; var1++) {
            for (int var2 = 0; var2 < class265.field4271; var2++) {
                if (class246.field3856[arg0][var1][var2] == null) {
                    class246.field3856[arg0][var1][var2] = new class91(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method2094(byte arg0) {
        field4951++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class179.field2721 - 1; var2++) {
                if (class151.field2101[var2] < 1000 && class151.field2101[var2 + 1] > 1000) {
                    String var3 = class137.field1877[var2];
                    class137.field1877[var2] = class137.field1877[var2 + 1];
                    class137.field1877[var2 + 1] = var3;
                    var1 = false;
                    String var4 = class205.field3062[var2];
                    class205.field3062[var2] = class205.field3062[var2 + 1];
                    class205.field3062[var2 + 1] = var4;
                    int var5 = class228.field3567[var2];
                    class228.field3567[var2] = class228.field3567[var2 + 1];
                    class228.field3567[var2 + 1] = var5;
                    int var6 = class250.field3910[var2];
                    class250.field3910[var2] = class250.field3910[var2 + 1];
                    class250.field3910[var2 + 1] = var6;
                    int var7 = class84.field1186[var2];
                    class84.field1186[var2] = class84.field1186[var2 + 1];
                    class84.field1186[var2 + 1] = var7;
                    short var8 = class151.field2101[var2];
                    class151.field2101[var2] = class151.field2101[var2 + 1];
                    class151.field2101[var2 + 1] = var8;
                    long var9 = class51.field717[var2];
                    class51.field717[var2] = class51.field717[var2 + 1];
                    class51.field717[var2 + 1] = var9;
                }
            }
        }
        if (arg0 != -39) {
            field4948 = -84;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method2095(int arg0, int arg1) {
        if (arg1 == 1) {
            field4957++;
            class39 var2 = class149.method935(-121, arg0, 7);
            var2.method268((byte) -19);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    public static void method2096(boolean arg0) {
        field4954 = null;
        field4955 = null;
        if (arg0) {
            method2097(-8, -27, 57, -54, -91);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)V")
    public static final void method2097(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4952++;
        class129.method822(class247.field3876[arg3], arg4 - arg2, arg0 ^ 0xFFFFF686, arg1, arg2 + arg4);
        int var5 = arg0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        while (var6 > var5) {
            var5++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                int var9 = arg4 + var5;
                int var10 = arg4 - var5;
                var6--;
                var7 -= var6 << 1;
                int[] var11 = class247.field3876[arg3 - var6];
                int[] var12 = class247.field3876[arg3 + var6];
                class129.method822(var12, var10, -2426, arg1, var9);
                class129.method822(var11, var10, -2426, arg1, var9);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class247.field3876[arg3 + var5];
            int[] var16 = class247.field3876[arg3 - var5];
            class129.method822(var15, var14, -2426, arg1, var13);
            class129.method822(var16, var14, -2426, arg1, var13);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/Object;BZ)[B")
    public static final byte[] method2098(Object arg0, byte arg1, boolean arg2) {
        field4958++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 41) {
            field4948 = 29;
        }
        if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return arg2 ? class272.method1777(var3, 0) : var3;
        } else if (arg0 instanceof class136) {
            class136 var4 = (class136) arg0;
            return var4.method855(109);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
