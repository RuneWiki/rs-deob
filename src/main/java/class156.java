import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class156 extends class308 {

    @OriginalMember(owner = "client!jj", name = "B", descriptor = "I")
    public int field2106 = -1;

    @OriginalMember(owner = "client!jj", name = "G", descriptor = "I")
    public int field2111 = -1;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field2116 = 12;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "Lvk;")
    public static class56 field2114 = new class56(8);

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "[I")
    public static int[] field2118 = new int[2];

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Lwf;")
    public static class1 field2120 = new class1(5000);

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "[I")
    public static int[] field2121 = new int[256];

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2125;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "[I")
    public static int[] field2124;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public int field2103;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public int field2105;

    @OriginalMember(owner = "client!jj", name = "C", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!jj", name = "D", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!jj", name = "E", descriptor = "I")
    public int field2109;

    @OriginalMember(owner = "client!jj", name = "F", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!jj", name = "H", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!jj", name = "I", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public int field2115;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lqf;")
    public static class389 field2122;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILii;)V")
    public final void method103(int arg0, class405 arg1) {
        ++field2108;
        if (arg0 < 102) {
            this.field2106 = 45;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Lii;I)Leb;")
    public final class382 method117(class405 arg0, int arg1) {
        ++field2104;
        class177 var3 = arg0.method1735();
        var3.method985(super.field4537, super.field4532, super.field4529);
        class382 var4 = class397.method2554(3, 0);
        if (this.field2106 != arg1) {
            class375 var5 = class9.method74(this.field2106, (byte) 76).method591(0, true, 0, 1024, this.field2109, (class296) null, arg0, (class12) null, -1);
            if (var5 != null) {
                var5.method1601(var3, var4.field5543[2], 0);
            }
        }
        if (this.field2111 != -1) {
            class375 var6 = class9.method74(this.field2111, (byte) 123).method591(0, true, 0, 1024, this.field2103, (class296) null, arg0, (class12) null, -1);
            if (var6 != null) {
                var6.method1601(var3, var4.field5543[1], 0);
            }
        }
        class375 var7 = class9.method74(this.field2105, (byte) 56).method591(0, true, 0, 1024, this.field2115, (class296) null, arg0, (class12) null, -1);
        if (var7 != null) {
            var7.method1601(var3, var4.field5543[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lnj;ZI)Ljava/lang/String;")
    public static final String method966(class228 arg0, boolean arg1, int arg2) {
        ++field2107;
        if (arg1) {
            return null;
        } else {
            try {
                int var3 = arg0.method1327((byte) -64);
                if (var3 > arg2) {
                    var3 = arg2;
                }
                byte[] var4 = new byte[var3];
                arg0.field3029 += class243.field3242.method1947(0, arg0.field3040, var3, arg1, var4, arg0.field3029);
                return class374.method2421(0, 0, var3, var4);
            } catch (Exception var6) {
                return "Cabbage";
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)Z")
    public static final boolean method967(int arg0, int arg1) {
        class418.field6196 = true;
        class196.field2624 = 65535 & arg1 + 1;
        if (arg0 > -67) {
            method968((byte) -110);
        }
        ++field2113;
        return true;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(B)V")
    public static final void method968(byte arg0) {
        class69.field894.method1756(((float) class416.field6106 * 0.1F + 0.7F) * 1.1523438F);
        ++field2112;
        class69.field894.method1752(class177.field2341, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        if (arg0 >= 0) {
            field2123 = -121;
        }
        class69.field894.method1788(class434.field6384, -1);
        class69.field894.method1671(class369.field5336);
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)V")
    public static void method969(int arg0) {
        if (arg0 < 11) {
            method968((byte) 88);
        }
        field2114 = null;
        field2120 = null;
        field2122 = null;
        field2124 = null;
        field2118 = null;
        field2125 = null;
        field2121 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIZLii;)Z")
    public final boolean method119(int arg0, int arg1, boolean arg2, class405 arg3) {
        ++field2110;
        class177 var5 = arg3.method1735();
        if (arg2) {
            this.method103(29, (class405) null);
        }
        var5.method985(super.field4537, super.field4532, super.field4529);
        class375 var6 = class9.method74(this.field2105, (byte) -124).method591(0, true, 0, 65536, this.field2115, (class296) null, arg3, (class12) null, -1);
        if (var6 != null && var6.method1594(arg0, arg1, var5, true)) {
            return true;
        } else {
            if (this.field2111 != -1) {
                class375 var7 = class9.method74(this.field2111, (byte) -44).method591(0, true, 0, 65536, this.field2103, (class296) null, arg3, (class12) null, -1);
                if (var7 != null && var7.method1594(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field2106 != -1) {
                class375 var8 = class9.method74(this.field2106, (byte) 108).method591(0, true, 0, 65536, this.field2109, (class296) null, arg3, (class12) null, -1);
                if (var8 != null && var8.method1594(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; ++var0) {
            int var1 = var0;
            for (int var2 = 0; ~var2 > -9; ++var2) {
                if (~(var1 & 1) == -2) {
                    var1 = var1 >>> 1 ^ -306674912;
                } else {
                    var1 >>>= 1;
                }
            }
            field2121[var0] = var1;
        }
        field2123 = 127;
        field2125 = null;
        field2124 = new int[1000];
    }
}
