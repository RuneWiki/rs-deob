import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class135 {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2257 = "Loading defaults - ";

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "B")
    public static byte field2265;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field2260;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lth;")
    public static class57 field2259;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[Lqb;")
    public static class27[] field2258;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 14)
    public static void method1028(boolean arg0) {
        field2257 = null;
        field2258 = null;
        field2259 = null;
        if (arg0) {
            method1030(-72, (class299[]) null);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[Lbo;", line = 28)
    public static final class16[] method1029(byte arg0) {
        int var1 = 41 / ((arg0 + 45) / 52);
        field2261++;
        if (class189.field3036 == null) {
            class16[] var2 = class240.method1827(-2, class128.field2163);
            class16[] var3 = new class16[var2.length];
            int var4 = 0;
            label54: for (int var5 = 0; var5 < var2.length; var5++) {
                class16 var6 = var2[var5];
                if ((var6.field188 <= 0 || var6.field188 >= 24) && var6.field182 >= 800 && var6.field183 >= 600) {
                    for (int var7 = 0; var7 < var4; var7++) {
                        class16 var8 = var3[var7];
                        if (var6.field182 == var8.field182 && var6.field183 == var8.field183) {
                            if (var6.field188 > var8.field188) {
                                var3[var7] = var6;
                            }
                            continue label54;
                        }
                    }
                    var3[var4] = var6;
                    var4++;
                }
            }
            class189.field3036 = new class16[var4];
            class242.method1844(var3, 0, class189.field3036, 0, var4);
            int[] var9 = new int[class189.field3036.length];
            for (int var10 = 0; var10 < class189.field3036.length; var10++) {
                class16 var11 = class189.field3036[var10];
                var9[var10] = var11.field183 * var11.field182;
            }
            class333.method2335(var9, class189.field3036, -26941);
        }
        return class189.field3036;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lua;)V", line = 107)
    public static final void method1030(int arg0, class299[] arg1) {
        class329.field5237[arg0] = arg1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILth;)V", line = 114)
    public static final void method1031(int arg0, class57 arg1) {
        field2264++;
        if (arg0 == -801) {
            class127.field2152 = arg1;
            class288.field4693 = class127.field2152.method482(27535, 16);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 127)
    public static final void method1032(int arg0) {
        field2260++;
        int var1 = class137.method1038(true);
        if (var1 == 0) {
            class274.field4541 = (byte[][][]) null;
            class310.method2201(0, 32);
        } else if (var1 == 1) {
            class345.method2428(104, (byte) 0);
            class310.method2201(512, 32);
            if (class178.field2856 != null) {
                class215.method1624(arg0 ^ 0x2488);
            }
        } else {
            class345.method2428(104, (byte) (class2.field14 - 4 & 0xFF));
            class310.method2201(2, arg0 ^ 0x24FC);
        }
        class86.field1472 = class186.field2991;
        if (arg0 != 9436) {
            field2258 = (class27[]) null;
        }
    }
}
