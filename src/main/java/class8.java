import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class8 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lph;")
    public static class229 field102 = class266.method1858("::tele ", 0);

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "Z")
    public static boolean field103 = false;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[[I")
    public static int[][] field107 = new int[5][5000];

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[[[Lo;")
    public static class227[][][] field108 = new class227[4][104][104];

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIII)I", line = 5)
    public static final int method51(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 255) {
            method51((byte[]) null, -95, 109, -26);
        }
        field101++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class72.field1203[(var4 ^ arg0[var5]) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 36)
    public static final void method52(byte arg0) {
        class118.field1982.method1415(-18218);
        class98.field1659.method1415(-18218);
        if (arg0 <= 48) {
            method52((byte) 96);
        }
        field106++;
        class25.field333.method1415(-18218);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lwe;B)V", line = 60)
    public static final void method53(class92 arg0, byte arg1) {
        class270 var2 = null;
        class191.field3153 = 3;
        class302.method2041((byte) 56, true);
        class45.field687 = true;
        class296.field4836 = true;
        class157.field2559 = 2;
        class272.field4546 = 0;
        class171.field2807 = true;
        class156.field2540 = 0;
        field109++;
        class215.field3547 = true;
        class265.field4462 = 127;
        class298.field4847 = true;
        class215.field3545 = true;
        class184.field2996 = 127;
        class214.field3532 = 0;
        class326.field5576 = 0;
        class234.field3860 = 255;
        class120.field2017 = true;
        class281.field4661 = true;
        class88.field1483 = true;
        class143.field2313 = true;
        class175.field2877 = true;
        class194.method1364(2);
        class160.field2594 = false;
        class72.field1231 = 0;
        class255.field4267 = false;
        field99 = 0;
        try {
            if (arg1 < 96) {
                return;
            }
            class247 var3 = arg0.method681(false, "runescape");
            while (var3.field4125 == 0) {
                class288.method1976((byte) 109, 1L);
            }
            if (var3.field4125 == 1) {
                int var4 = 0;
                var2 = (class270) var3.field4123;
                byte[] var5 = new byte[(int) var2.method1875((byte) -87)];
                while (var5.length > var4) {
                    int var6 = var2.method1878(var5.length - var4, false, var5, var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class328.method2252(new class164(var5), -14885);
            }
        } catch (Exception var10) {
        }
        try {
            if (var2 != null) {
                var2.method1879(-9784);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 137)
    public static void method54(int arg0) {
        field108 = (class227[][][]) null;
        if (arg0 != 128) {
            method51((byte[]) null, -42, -49, -35);
        }
        field107 = (int[][]) null;
        field102 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lrk;III)V", line = 168)
    public static final void method55(class216 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class88.field1504) {
            class72 var4 = class225.field3705[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1225 != null && var4.field1225.field2607.method222()) {
                arg0.method212(var4.field1225.field2607, 128, 0, 0, true);
            }
        }
        if (arg3 < class88.field1504) {
            class72 var5 = class225.field3705[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field1225 != null && var5.field1225.field2607.method222()) {
                arg0.method212(var5.field1225.field2607, 0, 0, 128, true);
            }
        }
        if (arg2 < class88.field1504 && arg3 < class129.field2114) {
            class72 var6 = class225.field3705[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field1225 != null && var6.field1225.field2607.method222()) {
                arg0.method212(var6.field1225.field2607, 128, 0, 128, true);
            }
        }
        if (arg2 < class88.field1504 && arg3 > 0) {
            class72 var7 = class225.field3705[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field1225 != null && var7.field1225.field2607.method222()) {
                arg0.method212(var7.field1225.field2607, 128, 0, -128, true);
            }
        }
    }
}
