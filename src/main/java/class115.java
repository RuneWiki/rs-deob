import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class115 extends class90 {

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public int field1760 = -1;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public int field1770 = -1;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "Ljp;")
    public static class55 field1763 = new class55(11, 6);

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "Ljp;")
    public static class55 field1771 = new class55(99, 3);

    @OriginalMember(owner = "client!ea", name = "B", descriptor = "Z")
    public static boolean field1772 = true;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public int field1762;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public int field1764;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "I")
    public int field1765;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "[S")
    public static short[] field1769;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILza;)V")
    public final void method98(int arg0, class299 arg1) {
        if (arg0 != 31203) {
            this.method98(-57, (class299) null);
        }
        ++field1758;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIB)V")
    public static final void method877(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field1757;
        float var5 = (float) class362.field5349 / (float) class362.field5357;
        int var6 = arg1;
        if (arg4 > 105) {
            int var7 = arg0;
            if (var5 < 1.0F) {
                var7 = (int) ((float) arg1 * var5);
            } else {
                var6 = (int) ((float) arg0 / var5);
            }
            int var8 = arg2 - (-var6 + arg1) / 2;
            int var9 = arg3 - (-var7 + arg0) / 2;
            class240.field3593 = -1;
            class357.field5290 = -1;
            class274.field4298 = class362.field5349 - class362.field5349 * var9 / var7;
            class445.field6617 = class362.field5357 * var8 / var6;
            class321.method2121(24659);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIII)V")
    public static final void method878(int arg0, int arg1, int arg2, int arg3) {
        ++field1766;
        if (arg2 != -7696) {
            method878(92, 63, 32, 22);
        }
        class188 var4 = class10.method48((byte) 61, 11, arg1);
        var4.method1308(false);
        var4.field2873 = arg0;
        var4.field2882 = arg3;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILza;Lum;)V")
    public static final void method879(int arg0, class299 arg1, class83 arg2) {
        ++field1768;
        if (!class22.field250) {
            arg1.method567(0);
            if (arg0 == 2048) {
                class300.field4609 = arg1.method574(class309.method2031(arg2, class444.field6614), true);
                class300.field4609.method2316((class169.field2570 - class300.field4609.method394()) / 2, (class360.field5313 - class300.field4609.method396()) / 2);
                class392.field5728 = arg1.method574(class309.method2031(arg2, class264.field4223), true);
                class392.field5728.method2316((class169.field2570 + -class392.field5728.method394()) / 2, 18);
                class22.field250 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(ILza;)Lhp;")
    public final class293 method110(int arg0, class299 arg1) {
        ++field1759;
        class517 var3 = arg1.method538();
        var3.method951(super.field1450, super.field1451, super.field1452);
        class293 var4 = class467.method2844(arg0 ^ -22755, 3);
        if (this.field1760 != -1) {
            class289 var5 = class300.field4608.method2088(this.field1760, 108).method1527(-1, arg1, this.field1762, (class61) null, 0, (class286) null, 2048, 0, (byte) -97);
            if (var5 != null) {
                var5.method673(var3, var4.field4524[2], 0);
            }
        }
        if (~this.field1770 != 0) {
            class289 var6 = class300.field4608.method2088(this.field1770, arg0 + 116).method1527(-1, arg1, this.field1764, (class61) null, 0, (class286) null, 2048, 0, (byte) -95);
            if (var6 != null) {
                var6.method673(var3, var4.field4524[1], 0);
            }
        }
        class289 var7 = class300.field4608.method2088(this.field1765, arg0 + 105).method1527(-1, arg1, this.field1767, (class61) null, 0, (class286) null, 2048, arg0, (byte) -125);
        if (var7 != null) {
            var7.method673(var3, var4.field4524[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lza;III)Z")
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field1761;
        class517 var5 = arg0.method538();
        var5.method951(super.field1450, super.field1451, super.field1452);
        class289 var6 = class300.field4608.method2088(this.field1765, 109).method1527(-1, arg0, this.field1767, (class61) null, 0, (class286) null, 131072, 0, (byte) -118);
        if (arg2 <= 23) {
            this.field1767 = -18;
        }
        if (var6 != null && var6.method638(arg1, arg3, var5, true)) {
            return true;
        } else {
            if (this.field1770 != -1) {
                class289 var7 = class300.field4608.method2088(this.field1770, 117).method1527(-1, arg0, this.field1764, (class61) null, 0, (class286) null, 131072, 0, (byte) -92);
                if (var7 != null && var7.method638(arg1, arg3, var5, true)) {
                    return true;
                }
            }
            if (~this.field1760 != 0) {
                class289 var8 = class300.field4608.method2088(this.field1760, 126).method1527(-1, arg0, this.field1762, (class61) null, 0, (class286) null, 131072, 0, (byte) -91);
                if (var8 != null && var8.method638(arg1, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
    public static void method880(int arg0) {
        field1771 = null;
        if (arg0 == 23651) {
            field1769 = null;
            field1763 = null;
        }
    }
}
