import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class123 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1766 = "Loading world list data";

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1773 = -1;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
    public static int[] field1778 = new int[2];

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public int field1768;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field1770;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "J")
    public long field1774;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lvk;")
    public static class160 field1762;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lsc;")
    public class248 field1765;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "Lsc;")
    public class248 field1767;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Lsc;")
    public class248 field1777;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ljava/awt/Frame;")
    public static Frame field1771;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Z")
    public static boolean[] field1763;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method797(int arg0) {
        field1762 = null;
        field1778 = null;
        int var1 = 7 / ((arg0 - 56) / 60);
        field1771 = null;
        field1766 = null;
        field1763 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public static final void method798(int arg0, int arg1, int arg2) {
        if (arg2 < 102) {
            return;
        }
        short var3 = 256;
        int var4 = 0;
        if (class295.field4720 > 0) {
            class95.method648(4096, class295.field4720);
            class295.field4720 = 0;
        }
        field1775++;
        int var5 = class151.field2225 * arg1;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class189.field2947[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class90.field1363[var4++];
                int var12 = class151.field2226[var5++ + arg0];
                if (var11 == 0) {
                    class282.field4587.field602[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = 238 - var11;
                    int var15 = class210.field3281[var11];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class282.field4587.field602[var6++] = class205.method1411(var14 * class205.method1411(16711935, var12) + var13 * class205.method1411(16711935, var15), -16711936) + class205.method1411(var13 * class205.method1411(65280, var15) + (class205.method1411(65280, var12) * var14), 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class282.field4587.field602[var6++] = class151.field2226[var5++ + arg0];
            }
            var5 += class151.field2225 - 128;
        }
        class282.field4587.method283(arg0, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lfe;I)Lfe;")
    public static final class231 method799(class231 arg0, int arg1) {
        field1776++;
        if (arg0.field3633 != -1) {
            return class201.method1398(arg0.field3633, 0);
        }
        int var2 = arg0.field3595 >>> 16;
        if (arg1 != 12094) {
            method799((class231) null, 21);
        }
        class127 var3 = new class127(class115.field1674);
        for (class104 var4 = (class104) var3.method819(-29274); var4 != null; var4 = (class104) var3.method821(-24864)) {
            if (var4.field1511 == var2) {
                return class201.method1398((int) var4.field4018, 0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V")
    public static final void method800(boolean arg0) {
        if (!arg0) {
            field1778 = null;
        }
        field1772++;
        class220.field3443.method1510(10283);
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public static final void method801(int arg0) {
        int var1 = 105 / ((arg0 - 55) / 38);
        if (class299.field4774 == null || class255.field4160 == null) {
            class255.field4160 = new int[256];
            class299.field4774 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class299.field4774[var2] = (int) (Math.sin(var3) * 4096.0D);
                class255.field4160[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field1769++;
    }
}
