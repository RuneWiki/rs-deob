import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class272 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    public static int field4822 = -1;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field4825 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Lcc;")
    public static class209 field4823 = class95.method669(120, "Utiliser");

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field4821;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "I")
    public static int field4827;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field4828;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "[[[B")
    public static byte[][][] field4820;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[BII)I")
    public static final int method1854(int arg0, byte[] arg1, int arg2, int arg3) {
        field4828++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class227.field4135[(arg1[var5] ^ var4) & 0xFF];
        }
        if (arg0 < 79) {
            field4825 = 2;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BIIII)V")
    public static final void method1855(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class75 var5 = (class75) class31.field554.method1755((long) arg2, (byte) -103);
        if (var5 == null) {
            var5 = new class75();
            class31.field554.method1762(var5, (long) arg2, (byte) 73);
        }
        if (var5.field1403.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1403.length; var8++) {
                var7[var8] = var5.field1403[var8];
                var6[var8] = var5.field1401[var8];
            }
            for (int var9 = var5.field1403.length; var9 < arg4; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field1401 = var6;
            var5.field1403 = var7;
        }
        if (arg0 <= -106) {
            var5.field1403[arg4] = arg1;
            field4827++;
            var5.field1401[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static final void method1856(int arg0) {
        class42.field814++;
        field4821++;
        class84.field1677.method287((byte) 121, 194);
        class84.field1677.method740(255, class264.field4732);
        if (arg0 <= 96) {
            method1855((byte) 25, 53, -124, -23, 33);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static void method1857(int arg0) {
        field4823 = null;
        if (arg0 > -2) {
            method1857(41);
        }
        field4820 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
    public static final void method1858(boolean arg0) {
        if (arg0) {
            class115.field2291.method665(1);
            class231.field4194.method665(1);
            field4826++;
            class114.field2282.method665(1);
        }
    }
}
