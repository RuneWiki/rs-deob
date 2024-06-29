import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class308 extends class376 {

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public int field4215 = 0;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public int field4223 = -1;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Z")
    public static boolean field4217 = false;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field4227 = 0;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public int field4219;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public int field4220;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public int field4226;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public int field4229;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public int field4233;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "Laa;")
    public static class281 field4230;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILrg;)Z", line = 4)
    public static final boolean method1955(int arg0, class383 arg1) {
        field4224++;
        if (arg0 > -43) {
            method1955(91, (class383) null);
        }
        if (arg1.field5480 == 205) {
            class346.field4846 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Leb;Z)V", line = 29)
    public static final void method1956(class371 arg0, boolean arg1) {
        field4221++;
        if (arg0.field5258.length - arg0.field5273 < 1) {
            return;
        }
        int var2 = arg0.method2429(0);
        if (var2 < 0 || var2 > 1 || (arg0.field5258.length - arg0.field5273) < 2) {
            return;
        }
        int var3 = arg0.method2403((byte) 115);
        if ((var3 * 6) != (arg0.field5258.length - arg0.field5273)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field5273 >= arg0.field5258.length) {
                            if (arg1) {
                                field4231 = -99;
                                return;
                            }
                            return;
                        }
                        var4 = arg0.method2403((byte) 116);
                        var5 = arg0.method2413((byte) -30);
                    } while (var4 >= class220.field2890.length);
                } while (!class137.field1958[var4]);
            } while (class344.method2210(122, var4).field18 == '1' && (var5 < -1 || var5 > 1));
            class220.field2890[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V", line = 89)
    public static final void method1957(int arg0, byte arg1, int arg2) {
        field4225++;
        class223 var3 = new class223(16);
        for (class26 var4 = (class26) class272.field3718.method1413(30381); var4 != null; var4 = (class26) class272.field3718.method1420((byte) 113)) {
            var4.method2459(198);
            int var6 = (int) (var4.field5363 >> 28);
            int var7 = (int) (var4.field5363 >> 14 & 0x3FFFL) - arg0;
            int var8 = (int) (var4.field5363 & 0x3FFFL) - arg2;
            if (var8 >= 0 && var7 >= 0 && class432.field6220 > var8 && class267.field3646 > var7) {
                var3.method1419((long) (var8 | var6 << 28 | var7 << 14), 71, var4);
            }
        }
        int var5 = 56 % ((1 - arg1) / 58);
        class272.field3718 = var3;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 127)
    public static void method1958(int arg0) {
        field4230 = null;
        if (arg0 != 2155) {
            method1956((class371) null, false);
        }
    }
}
