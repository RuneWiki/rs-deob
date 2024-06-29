import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class126 extends class141 {

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "Lhi;")
    private static class82 field2222 = class95.method664((byte) -56, "Select");

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Z")
    public static boolean field2220 = true;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field2221 = 1;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lhi;")
    public static class82 field2217 = field2222;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "B")
    public byte field2219;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Lum;")
    public static class222 field2225;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lhi;")
    public class82 field2211;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lhi;")
    public class82 field2213;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BB)Lbh;", line = 10)
    public static final class18 method887(byte[] arg0, byte arg1) {
        field2212++;
        if (arg0 == null) {
            return null;
        }
        class18 var2;
        if (class147.field2485) {
            var2 = new class97(arg0, class86.field1536, class20.field262, class107.field1897, class42.field747, class260.field4453);
        } else {
            var2 = new class145(arg0, class86.field1536, class20.field262, class107.field1897, class42.field747, class260.field4453);
        }
        class3.method23(286013516);
        if (arg1 != 70) {
            field2222 = (class82) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V", line = 39)
    public static void method888(byte arg0) {
        field2225 = null;
        int var1 = 9 / ((62 - arg0) / 55);
        field2222 = null;
        field2217 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)I", line = 54)
    public static final int method889(int arg0, int arg1) {
        int var2 = 0;
        if (~arg0 > arg1 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        field2214++;
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIBLme;)V", line = 100)
    public static final void method890(int arg0, int arg1, int arg2, byte arg3, class75 arg4) {
        if (class147.field2485) {
            class116.method789(arg1, arg2, arg4.field1216 + arg1, arg4.field1205 + arg2);
        }
        if (class92.field1647 < 3) {
            if (class147.field2485) {
                ((class210) class55.field877).method1512(arg1, arg2, arg4.field1216, arg4.field1205, class55.field877.field1543 / 2, class55.field877.field1533 / 2, class219.field3804, 256, (class210) arg4.method469(false, 2));
            } else {
                ((class303) class55.field877).method1040(arg1, arg2, arg4.field1216, arg4.field1205, class55.field877.field1543 / 2, class55.field877.field1533 / 2, class219.field3804, 256, arg4.field1223, arg4.field1292);
            }
        } else if (class147.field2485) {
            class86 var5 = arg4.method469(false, 2);
            if (var5 != null) {
                var5.method600(arg1, arg2);
            }
        } else {
            class320.method2209(arg1, arg2, 0, arg4.field1223, arg4.field1292);
        }
        if (arg3 >= 38) {
            class302.field5151[arg0] = true;
            field2208++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "([BB)[B", line = 147)
    public static final byte[] method891(byte[] arg0, byte arg1) {
        if (arg1 != 21) {
            method889(-5, -110);
        }
        field2223++;
        class153 var2 = new class153(arg0);
        int var3 = var2.method1082(-68);
        int var4 = var2.method1097((byte) -73);
        if (var4 < 0 || class241.field4186 != 0 && class241.field4186 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1093(0, var4, arg1 + 96, var5);
            return var5;
        } else {
            int var6 = var2.method1097((byte) -128);
            if (var6 < 0 || !(class241.field4186 == 0 || var6 <= class241.field4186)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class76.method484(var7, var6, arg0, var4, 9);
            } else {
                class194.field3303.method1682(var7, var2, -18);
            }
            return var7;
        }
    }
}
