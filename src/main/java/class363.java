import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class363 extends class381 {

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lmk;")
    public class39 field5496;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field5500 = 0;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "Liv;")
    public static class64 field5503 = new class64(99, 7);

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "Liv;")
    public static class64 field5504 = new class64(19, 6);

    @OriginalMember(owner = "client!hr", name = "n", descriptor = "I")
    public static int field5506 = 1405;

    @OriginalMember(owner = "client!hr", name = "m", descriptor = "Lpi;")
    public static class342 field5505 = new class342("M", "M", "M", "M");

    @OriginalMember(owner = "client!hr", name = "o", descriptor = "[B")
    public static byte[] field5507 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field5502;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method2276(int arg0, byte arg1) {
        field5502++;
        class54 var2 = class442.method2651(arg0, 5, -13208);
        if (arg1 != 110) {
            method2276(92, (byte) 24);
        }
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lob;Z)V", line = 17)
    public static final void method2277(class517 arg0, boolean arg1) {
        field5499++;
        boolean var2 = arg1;
        if (class531.field7821 == arg0.field7677 || arg0.field7642 == -1 || arg0.field7664 != 0) {
            var2 = true;
        } else {
            class165 var3 = class431.field6419.method1137(-121, arg0.field7642);
            if (var3.field2546 || var3.field2564[arg0.field7594] < arg0.field7675 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field7677 - arg0.field7611;
            int var5 = class531.field7821 - arg0.field7611;
            int var6 = arg0.field7648 * 128 + (arg0.method1654(89) * 64);
            int var7 = arg0.field7615 * 128 + arg0.method1654(122) * 64;
            int var8 = arg0.field7654 * 128 + arg0.method1654(94) * 64;
            int var9 = arg0.field7672 * 128 + (arg0.method1654(78) * 64);
            arg0.field6228 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg0.field6233 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field7695 = 0;
        if (arg0.field7671 == 0) {
            arg0.method3085(8192, 2090249552);
        }
        if (arg0.field7671 == 1) {
            arg0.method3085(12288, 2090249552);
        }
        if (arg0.field7671 == 2) {
            arg0.method3085(0, 2090249552);
        }
        if (arg0.field7671 == 3) {
            arg0.method3085(4096, 2090249552);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V", line = 71)
    public static void method2278(byte arg0) {
        field5504 = null;
        field5507 = null;
        field5503 = null;
        if (arg0 != 42) {
            method2277(null, false);
        }
        field5505 = null;
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(B)V", line = 95)
    public static final void method2279(byte arg0) {
        class28.method321(class169.field2619, -5001);
        class121.field1973++;
        field5497++;
        class410.field6141.method1094(1618659784, class334.field5043);
        if (arg0 < 105) {
            field5500 = 84;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILgm;III)V", line = 111)
    public static final void method2280(int arg0, class79 arg1, int arg2, int arg3, int arg4) {
        field5498++;
        if (arg3 != -588) {
            return;
        }
        for (class69 var5 = (class69) class110.field1872.method2427(118); var5 != null; var5 = (class69) class110.field1872.method2422(arg3 ^ 0x223)) {
            if (var5.field1182 == arg0 && (arg2 << 7) == var5.field1187 && arg4 << 7 == var5.field1198 && var5.field1189.field1318 == arg1.field1318) {
                if (var5.field1181 != null) {
                    class45.field837.method2035(var5.field1181);
                    var5.field1181 = null;
                }
                if (var5.field1186 != null) {
                    class45.field837.method2035(var5.field1186);
                    var5.field1186 = null;
                }
                var5.method2090(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lvj;II[B)V", line = 152)
    public class363(class303 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5496 = class104.method789(arg0, (byte) 82, false, arg3, 6406, 6406, arg2, arg1);
        this.field5496.method1818(false, (byte) 116, false);
    }
}
