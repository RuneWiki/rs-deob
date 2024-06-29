import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class144 {

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    public static int[] field2320 = new int[500];

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "Lnf;")
    public static class166 field2318;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
    public static int[] field2323;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[[I")
    public static int[][] field2319;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Ldb;")
    public static final class18 method987(byte arg0, int arg1) {
        field2322++;
        class18 var2 = (class18) class92.field1468.method61(arg0 ^ 0x7D, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 5) {
            method991(false);
        }
        byte[] var3 = class130.field2072.method1156(class211.method1453(arg1, 113), class225.method1559(arg1, 16711680), (byte) -16);
        class18 var4 = new class18();
        if (var3 != null) {
            var4.method147(new class274(var3), true);
        }
        class92.field1468.method59(var4, (long) arg1, 5);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)V")
    public static final void method988(int arg0, byte arg1) {
        class16.field305 = -1;
        field2321++;
        class16.field305 = -1;
        if (arg1 <= 86) {
            method987((byte) 110, -90);
        }
        if (arg0 == 37) {
            class262.field4269 = 3.0F;
        } else if (arg0 == 50) {
            class262.field4269 = 4.0F;
        } else if (arg0 == 75) {
            class262.field4269 = 6.0F;
        } else if (arg0 == 100) {
            class262.field4269 = 8.0F;
        } else if (arg0 == 200) {
            class262.field4269 = 16.0F;
            return;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI)V")
    public static final void method989(int arg0, boolean arg1, int arg2) {
        field2316++;
        int var3 = class44.field654 * arg0 >> 8;
        if (arg2 == -1 && !class85.field1355) {
            class149.method1010((byte) -127);
        } else if (arg2 != -1 && (class215.field3393 != arg2 || !class88.method613((byte) -87)) && var3 != 0 && !class85.field1355) {
            class272.method1802(78, class203.field3290, 0, 2, false, var3, arg2);
        }
        class215.field3393 = arg2;
        if (!arg1) {
            ;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIZ)V")
    public static final void method990(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method990(56, 69, true);
        }
        field2317++;
        class119.field1879++;
        class311.field5027.method2081(!arg2, 86);
        class311.field5027.method1828(arg1, 0);
        class311.field5027.method1823(1617348648, arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Z)V")
    public static void method991(boolean arg0) {
        field2318 = null;
        field2319 = null;
        field2320 = null;
        if (!arg0) {
            method988(48, (byte) -116);
        }
        field2323 = null;
    }
}
