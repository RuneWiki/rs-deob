import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class455 extends class34 {

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "Lea;")
    public static class115 field6645 = new class115("WIP", 2);

    @OriginalMember(owner = "client!tc", name = "I", descriptor = "[I")
    public static int[] field6647 = new int[14];

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
    public static int field6641;

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!tc", name = "E", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!tc", name = "H", descriptor = "Ldk;")
    public static class421 field6646;

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class455() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2666(int arg0, int arg1, String arg2) {
        ++field6643;
        int var3 = class210.field3001;
        int[] var4 = class169.field2570;
        boolean var5 = false;
        for (int var6 = arg1; var3 > var6; ++var6) {
            class487 var7 = class45.field642[var4[var6]];
            if (var7 != null && class81.field1158 != var7 && var7.field7036 != null && var7.field7036.equalsIgnoreCase(arg2)) {
                if (arg0 != 1) {
                    if (~arg0 != -5) {
                        if (~arg0 != -6) {
                            if (~arg0 != -7) {
                                if (~arg0 == -8) {
                                    class274.method1602(14, class133.field2026);
                                    ++class96.field1550;
                                    class17.field275.method1857(arg1 ^ 561746448, var4[var6]);
                                    class17.field275.method1891(false, 0);
                                }
                            } else {
                                ++class98.field1558;
                                class274.method1602(14, class299.field4101);
                                class17.field275.method1866(var4[var6], true);
                                class17.field275.method1872(128, 0);
                            }
                        } else {
                            ++class83.field1240;
                            class274.method1602(14, class34.field522);
                            class17.field275.method1891(false, 0);
                            class17.field275.method1857(561746448, var4[var6]);
                        }
                    } else {
                        ++class92.field1476;
                        class274.method1602(14, class351.field5101);
                        class17.field275.method1831(55750472, var4[var6]);
                        class17.field275.method1891(false, 0);
                    }
                } else {
                    ++class134.field2040;
                    class274.method1602(14, class400.field5736);
                    class17.field275.method1835(108, 0);
                    class17.field275.method1831(55750472, var4[var6]);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class35.method256((byte) 125, class450.field6605.method1126(class486.field6998, (byte) -19) + arg2);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI)I")
    private final int method2667(int arg0, boolean arg1, int arg2) {
        ++field6642;
        int var4 = arg2 - -(arg0 * 57);
        int var5 = var4 << 1 ^ var4;
        return !arg1 ? 39 : -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(B)V")
    public static void method2668(byte arg0) {
        field6646 = null;
        if (arg0 != -61) {
            field6647 = null;
        }
        field6645 = null;
        field6647 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6644;
        int var3 = -127 / (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 82);
        if (super.field537.field4191) {
            int var5 = class284.field3856[arg0];
            for (int var6 = 0; var6 < class383.field5502; ++var6) {
                var4[var6] = this.method2667(var5, true, class91.field1463[var6]) % 4096;
            }
        }
        return var4;
    }
}
