import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class124 {

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
    public static int[] field1803 = new int[14];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Z")
    public static boolean field1797 = false;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "Lth;")
    public static class57 field1801 = new class57(20);

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
    public static int[] field1806 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[I")
    public static int[] field1808 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public int field1799;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field1800;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field1802;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field1804;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "Lph;")
    public static class361 field1807;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field1809;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 10)
    public static void method926(int arg0) {
        field1803 = null;
        field1809 = null;
        if (arg0 != 0) {
            method927(55);
        }
        field1806 = null;
        field1808 = null;
        field1801 = null;
        field1807 = null;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 39)
    public static final void method927(int arg0) {
        field1805++;
        int var1 = class296.field4445.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class296.field4445[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class230.field3485; var4++) {
                    if (class85.field1201[var2] == class71.field1007[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class71.field1007[class230.field3485] = class85.field1201[var2];
                    var3 = class230.field3485++;
                }
                class190 var5 = new class190(class296.field4445[var2]);
                int var6 = 0;
                while (var5.field2776 < class296.field4445[var2].length && var6 < 511 && class166.field2384 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1317((byte) 111);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class85.field1201[var2] >> 8) * 64 + var10 - class272.field4123;
                    int var13 = (class85.field1201[var2] & 0xFF) * 64 + var11 - class202.field2968;
                    class214 var14 = class343.method2393((byte) -27, var5.method1317((byte) 13));
                    if (class300.field4495[var7] == null && (var14.field3107 & 0x1) > 0 && class277.field4217 == var9 && var12 >= 0 && (var14.field3083 + var12) < 104 && var13 >= 0 && var13 + var14.field3083 < 104) {
                        class300.field4495[var7] = new class181();
                        class181 var15 = class300.field4495[var7];
                        class215.field3158[class166.field2384++] = var7;
                        var15.field5153 = class304.field4560;
                        var15.method1259(var14, (byte) 7);
                        var15.method2351(var15.field2609.field3083, -19464);
                        var15.field5089 = var15.field5199 = class359.field5559[var15.field2609.field3152];
                        var15.field5195 = var15.field2609.field3144;
                        var15.field5149 = var15.field2609.field3081;
                        if (var15.field5149 == 0) {
                            var15.field5199 = 0;
                        }
                        var15.method2347(var12, var13, (byte) 125, var15.method1700(arg0 + 911), true);
                    }
                }
            }
        }
        if (arg0 != -1024) {
            field1807 = (class361) null;
        }
    }
}
