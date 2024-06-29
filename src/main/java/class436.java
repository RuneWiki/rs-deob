import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class436 {

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
    public int field6306 = -1;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Z")
    public static boolean field6310 = false;

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "[I")
    public static int[] field6312 = null;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public int field6300;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public int field6302;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public int field6303;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public int field6304;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public int field6305;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public int field6307;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field6308;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field6309;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public int field6311;

    @OriginalMember(owner = "client!nn", name = "n", descriptor = "I")
    public int field6313;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 3)
    public static void method2615(byte arg0) {
        field6312 = null;
        if (arg0 <= 96) {
            method2615((byte) -35);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 15)
    public static final void method2616(int arg0) {
        class311.field4392++;
        field6301++;
        class43 var1 = class492.method2903(class87.field1237, 0, class73.field983);
        var1.field457.method1725(class164.method1133(-15388), 101);
        var1.field457.method1733(class460.field6558, -32466);
        if (arg0 <= -35) {
            var1.field457.method1733(class693.field9222, -32466);
            var1.field457.method1725(class125.field1721.field5184.method335(43), 53);
            class409.method2457((byte) -100, var1);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I", line = 37)
    public static final int method2617(int arg0, int arg1) {
        field6309++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
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
        if (arg1 <= arg0) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)Ldaa;", line = 90)
    public static final class12 method2618(int arg0, int arg1) {
        field6308++;
        class12[] var2 = class290.method1860((byte) 51);
        int var3 = 0;
        if (arg1 != 8352) {
            field6312 = null;
        }
        while (var2.length > var3) {
            class12 var4 = var2[var3];
            if (var4.field139 == arg0) {
                return var4;
            }
            var3++;
        }
        return null;
    }
}
