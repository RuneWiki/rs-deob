import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class78 extends class105 {

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    private int field1480 = 1365;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field1483 = 0;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "I")
    private int field1485 = 20;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    private int field1481 = 0;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "Lvf;")
    public static class265 field1488 = class87.method582(-46, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "[Lvf;")
    public static class265[] field1486 = new class265[100];

    @OriginalMember(owner = "client!ib", name = "bb", descriptor = "Lvf;")
    private static class265 field1493 = class87.method582(-46, "Select");

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "Lvf;")
    public static class265 field1479 = field1493;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "Ljb;")
    public static class24 field1492;

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILfl;)I")
    public static final int method542(int arg0, class192 arg1) {
        ++field1487;
        int var2 = 0;
        if (arg1.method1330(class40.field920, (byte) -101)) {
            ++var2;
        }
        if (arg1.method1330(class21.field644, (byte) -56)) {
            ++var2;
        }
        if (arg1.method1330(class203.field3641, (byte) -128)) {
            ++var2;
        }
        if (arg1.method1330(class106.field1877, (byte) -15)) {
            ++var2;
        }
        if (arg0 != 20) {
            field1492 = null;
        }
        if (arg1.method1330(class155.field2873, (byte) -37)) {
            ++var2;
        }
        if (arg1.method1330(field1484, (byte) -60)) {
            ++var2;
        }
        if (arg1.method1330(class230.field4062, (byte) -76)) {
            ++var2;
        }
        if (arg1.method1330(class33.field816, (byte) -109)) {
            ++var2;
        }
        if (arg1.method1330(class27.field718, (byte) -124)) {
            ++var2;
        }
        if (arg1.method1330(class57.field1170, (byte) -56)) {
            ++var2;
        }
        if (arg1.method1330(class121.field2150, (byte) -27)) {
            ++var2;
        }
        if (arg1.method1330(class123.field2221, (byte) -12)) {
            ++var2;
        }
        if (arg1.method1330(class116.field2054, (byte) -121)) {
            ++var2;
        }
        if (arg1.method1330(class225.field4001, (byte) -104)) {
            ++var2;
        }
        if (arg1.method1330(class130.field2315, (byte) -92)) {
            ++var2;
        }
        if (arg1.method1330(class43.field962, (byte) -75)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIILdk;IJZ)Z")
    public static final boolean method543(int arg0, int arg1, int arg2, int arg3, int arg4, class179 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        } else {
            int var10 = arg1 - arg4;
            int var11 = arg2 - arg4;
            int var12 = arg1 + arg4;
            int var13 = arg2 + arg4;
            if (arg8) {
                if (arg6 > 640 && arg6 < 1408) {
                    var13 += 128;
                }
                if (arg6 > 1152 && arg6 < 1920) {
                    var12 += 128;
                }
                if (arg6 > 1664 || arg6 < 384) {
                    var11 -= 128;
                }
                if (arg6 > 128 && arg6 < 896) {
                    var10 -= 128;
                }
            }
            int var14 = var10 / 128;
            int var15 = var11 / 128;
            int var16 = var12 / 128;
            int var17 = var13 / 128;
            return class72.method508(arg0, var14, var15, var16 - var14 + 1, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            this.method12(-30, 48, (class135) null);
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 == 3) {
                        this.field1483 = arg2.method927(126);
                    }
                } else {
                    this.field1481 = arg2.method927(126);
                }
            } else {
                this.field1485 = arg2.method927(arg1 ^ 129);
            }
        } else {
            this.field1480 = arg2.method927(125);
        }
        ++field1491;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILve;IILjava/awt/Component;)Lel;")
    public static final class100 method544(int arg0, class226 arg1, int arg2, int arg3, Component arg4) {
        ++field1490;
        if (class125.field2242 == 0) {
            throw new IllegalStateException();
        } else if (~arg3 <= -1 && arg3 < 2) {
            if (~arg2 > -257) {
                arg2 = 256;
            }
            try {
                class100 var5 = (class100) Class.forName("il").newInstance();
                var5.field1767 = new int[256 * (class51.field1080 ? 2 : 1)];
                var5.field1776 = arg2;
                var5.method387(arg4);
                var5.field1772 = (-1024 & arg2) + 1024;
                if (var5.field1772 > 16384) {
                    var5.field1772 = 16384;
                }
                var5.method382(var5.field1772);
                if (arg0 >= -120) {
                    field1484 = 102;
                }
                if (class218.field3926 > 0 && class66.field1272 == null) {
                    class66.field1272 = new class149();
                    class66.field1272.field2772 = arg1;
                    arg1.method1531(class218.field3926, -110, class66.field1272);
                }
                if (class66.field1272 != null) {
                    if (class66.field1272.field2767[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class66.field1272.field2767[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class220 var6 = new class220(arg1, arg3);
                    var6.field1776 = arg2;
                    var6.field1767 = new int[(!class51.field1080 ? 1 : 2) * 256];
                    var6.method387(arg4);
                    var6.field1772 = 16384;
                    var6.method382(var6.field1772);
                    if (class218.field3926 > 0 && class66.field1272 == null) {
                        class66.field1272 = new class149();
                        class66.field1272.field2772 = arg1;
                        arg1.method1531(class218.field3926, -103, class66.field1272);
                    }
                    if (class66.field1272 != null) {
                        if (class66.field1272.field2767[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class66.field1272.field2767[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class100();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        if (arg0 != 8055) {
            this.method16(-126, 2);
        }
        int[] var3 = super.field1862.method458(arg1, false);
        ++field1478;
        if (super.field1862.field1236) {
            for (int var4 = 0; class94.field1668 > var4; ++var4) {
                int var5 = (class277.field4894[var4] << 12) / this.field1480 + this.field1481;
                int var6 = (class219.field3951[arg1] << 12) / this.field1480 + this.field1483;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; ~(var11 + var13) > -16385 && ~this.field1485 < ~var12; var13 = var10 * var10 >> 12) {
                    var10 = (var9 * var10 >> 12) * 2 + var7;
                    ++var12;
                    var9 = -var13 - -var8 + var11;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = this.field1485 + -1 > var12 ? (var12 << 12) / this.field1485 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1493 = null;
        field1492 = null;
        field1488 = null;
        field1486 = null;
        field1479 = null;
        int var1 = -120 % ((arg0 - -18) / 59);
    }
}
