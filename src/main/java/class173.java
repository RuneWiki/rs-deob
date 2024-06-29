import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class173 extends class376 {

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
    public boolean field2456 = false;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field2464 = -1;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2461 = "Discard";

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public int field2460;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "I")
    public int field2463;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "I")
    public int field2466;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field2458;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "[S")
    public static short[] field2465;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILeb;)Ljava/lang/String;")
    public static final String method1167(byte arg0, int arg1, class371 arg2) {
        field2462++;
        try {
            int var3 = -65 % ((arg0 - 35) / 36);
            int var4 = arg2.method2433(-43);
            if (var4 > arg1) {
                var4 = arg1;
            }
            byte[] var5 = new byte[var4];
            arg2.field5273 += class81.field1249.method1880(arg2.field5273, 0, 0, var5, var4, arg2.field5258);
            return class359.method2323(0, 122, var4, var5);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V")
    public static void method1168(byte arg0) {
        if (arg0 != -45) {
            field2458 = null;
        }
        field2458 = null;
        field2465 = null;
        field2461 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Laa;)V")
    public static final void method1169(class281 arg0) {
        for (int var1 = class223.field3011; var1 < class176.field2480; var1++) {
            for (int var2 = 0; var2 < class386.field5629; var2++) {
                for (int var3 = 0; var3 < class371.field5311; var3++) {
                    class142 var4 = class5.field79[var1][var2][var3];
                    if (var4 != null) {
                        class254 var5 = var4.field2031;
                        class254 var6 = var4.field2044;
                        if (var5 != null && var5.method137(0)) {
                            class352.method2279(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method137(0)) {
                                class352.method2279(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method129(0, false, 0, 0, arg0, 0, var5);
                                var6.method135((byte) -123);
                            }
                            var5.method135((byte) -123);
                        }
                        for (class218 var7 = var4.field2043; var7 != null; var7 = var7.field2884) {
                            class430 var9 = var7.field2882;
                            if (var9 != null && var9.method137(0)) {
                                class352.method2279(arg0, var9, var1, var2, var3, var9.field6195 + 1 - var9.field6182, var9.field6185 - var9.field6186 + 1);
                                var9.method135((byte) -123);
                            }
                        }
                        class127 var8 = var4.field2047;
                        if (var8 != null && var8.method137(0)) {
                            class313.method1989(arg0, var8, var1, var2, var3);
                            var8.method135((byte) -123);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    public class173(int arg0) {
        this.field2464 = arg0;
    }
}
