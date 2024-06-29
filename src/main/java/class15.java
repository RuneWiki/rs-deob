import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class15 {

    @OriginalMember(owner = "client!be", name = "c", descriptor = "Lcd;")
    public static class23 field326 = class54.method414("Abbrechen", -1);

    @OriginalMember(owner = "client!be", name = "e", descriptor = "Lcd;")
    private static class23 field328 = class54.method414("slide:", -1);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Lcd;")
    private static class23 field327 = class54.method414("and choose the (Wcreate account(W", -1);

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lcd;")
    public static class23 field325 = field328;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "Lcd;")
    public static class23 field330 = field327;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field338 = -1;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Lcd;")
    public static class23 field334 = field328;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lwd;")
    public static class201 field337;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Lgd;")
    public static class58 field333;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "[I")
    public static int[] field329;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lfa;")
    public static final class47 method79(int arg0, int arg1, int arg2) {
        field324++;
        class47 var3 = class113.method725((byte) 109, arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field1029 == null || var3.field1029.length <= arg1) {
            return null;
        } else {
            if (arg2 != -12910) {
                method80((byte) -124);
            }
            return var3.field1029[arg1];
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method80(byte arg0) {
        field326 = null;
        field333 = null;
        if (arg0 < 58) {
            return;
        }
        field329 = null;
        field330 = null;
        field328 = null;
        field337 = null;
        field325 = null;
        field327 = null;
        field334 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[BII)I")
    public static final int method81(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 != 2) {
            return 76;
        }
        field335++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class133.field2744[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public static final void method82(byte arg0) {
        field332++;
        class81.field1769.method634((byte) 114);
        int var1 = class81.field1769.method626(16789, 8);
        if (class67.field1583 > var1) {
            for (int var2 = var1; var2 < class67.field1583; var2++) {
                class56.field1310[class104.field2264++] = class8.field161[var2];
            }
        }
        if (class67.field1583 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class67.field1583 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class8.field161[var3];
            class182 var5 = class91.field1944[var4];
            int var6 = class81.field1769.method626(16789, 1);
            if (var6 == 0) {
                class8.field161[class67.field1583++] = var4;
                var5.field266 = field339;
            } else {
                int var7 = class81.field1769.method626(16789, 2);
                if (var7 == 0) {
                    class8.field161[class67.field1583++] = var4;
                    var5.field266 = field339;
                    class160.field3202[class108.field2307++] = var4;
                } else if (var7 == 1) {
                    class8.field161[class67.field1583++] = var4;
                    var5.field266 = field339;
                    int var8 = class81.field1769.method626(16789, 3);
                    var5.method63(false, (byte) 126, var8);
                    int var9 = class81.field1769.method626(16789, 1);
                    if (var9 == 1) {
                        class160.field3202[class108.field2307++] = var4;
                    }
                } else if (var7 == 2) {
                    class8.field161[class67.field1583++] = var4;
                    var5.field266 = field339;
                    int var10 = class81.field1769.method626(16789, 3);
                    var5.method63(true, (byte) 125, var10);
                    int var11 = class81.field1769.method626(16789, 3);
                    var5.method63(true, (byte) 126, var11);
                    int var12 = class81.field1769.method626(16789, 1);
                    if (var12 == 1) {
                        class160.field3202[class108.field2307++] = var4;
                    }
                } else if (var7 == 3) {
                    class56.field1310[class104.field2264++] = var4;
                }
            }
        }
        if (arg0 <= 77) {
            field325 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V")
    public static final void method83(byte arg0) {
        class129.field2693.method536((byte) 61);
        field336++;
        for (int var1 = 0; var1 < 32; var1++) {
            class35.field716[var1] = 0L;
        }
        if (arg0 <= 23) {
            field327 = null;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class89.field1909[var2] = 0L;
        }
        class48.field1152 = 0;
    }
}
