import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class162 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lcf;")
    private class131 field2892;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Ldn;")
    private class232 field2898;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lba;")
    private class169 field2895;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lsf;")
    private static class108 field2903 = class140.method973(255, " is already on your friend list)3");

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Lsf;")
    public static class108 field2891 = field2903;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field2907 = -1;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lge;")
    public static class155 field2901 = new class155();

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field2893;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lvc;")
    public static class193 field2902;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "Lrm;")
    private class249 field2896;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "[Lbh;")
    private class277[] field2900;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)I", line = 7)
    public static int method1118(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Li;Li;II)Lbh;", line = 19)
    public final class277 method1119(class218 arg0, class218 arg1, int arg2, int arg3) {
        field2899++;
        int var5 = -42 / ((arg3 + 40) / 38);
        return this.method1124(arg2, (byte) 120, true, arg0, arg1);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 41)
    public final void method1120(int arg0) {
        if (arg0 < 64) {
            field2891 = (class108) null;
        }
        field2905++;
        if (this.field2900 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field2900.length; var2++) {
            if (this.field2900[var2] != null) {
                this.field2900[var2].method2001((byte) -126);
            }
        }
        for (int var3 = 0; var3 < this.field2900.length; var3++) {
            if (this.field2900[var3] != null) {
                this.field2900[var3].method2003(105);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V", line = 77)
    public static void method1121(int arg0) {
        field2901 = null;
        field2902 = null;
        field2903 = null;
        field2891 = null;
        if (arg0 != -28398) {
            method1122((byte) -17, -89);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BI)Lph;", line = 91)
    public static final class79 method1122(byte arg0, int arg1) {
        field2904++;
        class79 var2 = (class79) class292.field5107.method466((long) arg1, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class92.field1479.method1868(12236, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class79 var4 = new class79();
        class249 var5 = new class249(var3);
        var5.field4314 = var5.field4338.length - 2;
        int var6 = var5.method1712(-1);
        int var7 = var5.field4338.length - (var6 + 2 + 12);
        var5.field4314 = var7;
        int var8 = var5.method1738(-1756395344);
        var4.field1204 = var5.method1712(-1);
        var4.field1211 = var5.method1712(-1);
        var4.field1206 = var5.method1712(-1);
        var4.field1196 = var5.method1712(-1);
        int var9 = var5.method1731(true);
        if (var9 > 0) {
            var4.field1209 = new class242[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1712(-1);
                class242 var12 = new class242(class117.method832(var11, (byte) 122));
                var4.field1209[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1738(-1756395344);
                    int var14 = var5.method1738(-1756395344);
                    var12.method1681(1, new class236(var14), (long) var13);
                }
            }
        }
        int var15 = 0;
        var5.field4314 = 0;
        var4.field1213 = var5.method1736(-52);
        var4.field1208 = new int[var8];
        var4.field1207 = new int[var8];
        var4.field1200 = new class108[var8];
        int var16 = -126 / ((-arg0 - 4) / 61);
        while (var7 > var5.field4314) {
            int var17 = var5.method1712(-1);
            if (var17 == 3) {
                var4.field1200[var15] = var5.method1740(true);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field1207[var15] = var5.method1731(true);
            } else {
                var4.field1207[var15] = var5.method1738(-1756395344);
            }
            var4.field1208[var15++] = var17;
        }
        class292.field5107.method468((long) arg1, (byte) -111, var4);
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Ldn;Lcf;)V", line = 189)
    public class162(class232 arg0, class131 arg1) {
        this.field2892 = arg1;
        this.field2898 = arg0;
        if (!this.field2898.method1617(false)) {
            this.field2895 = this.field2898.method1620(true, 0, 255, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z", line = 203)
    public final boolean method1123(byte arg0) {
        field2890++;
        if (this.field2896 != null) {
            return true;
        } else if (arg0 > -90) {
            return true;
        } else {
            if (this.field2895 == null) {
                if (this.field2898.method1617(false)) {
                    return false;
                }
                this.field2895 = this.field2898.method1620(true, 0, 255, 255, (byte) 0);
            }
            if (this.field2895.field986) {
                return false;
            } else {
                this.field2896 = new class249(this.field2895.method433(123));
                this.field2900 = new class277[(this.field2896.field4338.length - 5) / 8];
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBZLi;Li;)Lbh;", line = 239)
    private final class277 method1124(int arg0, byte arg1, boolean arg2, class218 arg3, class218 arg4) {
        field2893++;
        if (arg1 < 84) {
            this.method1123((byte) -16);
        }
        if (this.field2896 == null) {
            throw new RuntimeException();
        }
        this.field2896.field4314 = arg0 * 8 + 5;
        if (this.field2896.field4314 >= this.field2896.field4338.length) {
            throw new RuntimeException();
        } else if (this.field2900[arg0] == null) {
            int var6 = this.field2896.method1738(-1756395344);
            int var7 = this.field2896.method1738(-1756395344);
            class277 var8 = new class277(arg0, arg3, arg4, this.field2898, this.field2892, var6, var7, arg2);
            this.field2900[arg0] = var8;
            return var8;
        } else {
            return this.field2900[arg0];
        }
    }
}
