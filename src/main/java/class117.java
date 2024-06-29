import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class117 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
    public static long field1783 = 0L;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field1789 = -1;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "[I")
    public static int[] field1784 = new int[50];

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ll;")
    public static class133 field1786;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZII)V", line = 16)
    public static final void method861(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field1785++;
        class338 var5 = class195.method1391(10, (byte) -92, arg3);
        var5.method2352((byte) 126);
        var5.field5290 = arg4;
        if (arg2) {
            method865(-35);
        }
        var5.field5279 = arg0;
        var5.field5288 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 33)
    public static void method862(int arg0) {
        if (arg0 != 60) {
            field1789 = 14;
        }
        field1784 = null;
        field1786 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(III)I", line = 47)
    public static final int method863(int arg0, int arg1, int arg2) {
        field1792++;
        int var3 = class263.method1790(4, arg0 + 91923, (byte) 7, arg2 + 45365) + (class263.method1790(2, arg0 + 37821, (byte) 7, arg2 + 10294) - 128 >> 1) + (class263.method1790(1, arg0, (byte) 7, arg2) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        if (arg1 != -148803615) {
            field1786 = (class133) null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 71)
    public static final void method864(int arg0) {
        class244.field3901.method1226(0);
        if (arg0 == 18832) {
            field1793++;
            class331.field5156.method1594(28);
            class34.field527.method1594(53);
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 84)
    public static final void method865(int arg0) {
        if (arg0 != 10) {
            method861(-127, -75, true, 25, -34);
        }
        if (class128.field2009 == null || class288.field4490 == null) {
            class288.field4490 = new int[256];
            class128.field2009 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class128.field2009[var1] = (int) (Math.sin(var2) * 4096.0D);
                class288.field4490[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field1790++;
    }
}
