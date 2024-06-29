import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class462 extends class180 {

    @OriginalMember(owner = "client!vp", name = "J", descriptor = "I")
    public int field6516 = 0;

    @OriginalMember(owner = "client!vp", name = "w", descriptor = "Lfn;")
    public static class52 field6503 = new class52(0, -1);

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "I")
    public int field6497;

    @OriginalMember(owner = "client!vp", name = "t", descriptor = "I")
    public int field6500;

    @OriginalMember(owner = "client!vp", name = "u", descriptor = "I")
    public int field6501;

    @OriginalMember(owner = "client!vp", name = "v", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!vp", name = "x", descriptor = "I")
    public int field6504;

    @OriginalMember(owner = "client!vp", name = "y", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!vp", name = "z", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!vp", name = "C", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!vp", name = "D", descriptor = "I")
    public int field6510;

    @OriginalMember(owner = "client!vp", name = "E", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!vp", name = "H", descriptor = "I")
    public int field6514;

    @OriginalMember(owner = "client!vp", name = "I", descriptor = "I")
    public int field6515;

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "Lld;")
    public class196 field6495;

    @OriginalMember(owner = "client!vp", name = "G", descriptor = "Lqr;")
    public class23 field6513;

    @OriginalMember(owner = "client!vp", name = "A", descriptor = "Llc;")
    public class263 field6507;

    @OriginalMember(owner = "client!vp", name = "B", descriptor = "Llc;")
    public class263 field6508;

    @OriginalMember(owner = "client!vp", name = "F", descriptor = "Lcj;")
    public class475 field6512;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "Z")
    public boolean field6499;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[I")
    public int[] field6498;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)I", line = 3)
    public static final int method2732(int arg0) {
        field6505++;
        if (arg0 != -1) {
            field6503 = null;
        }
        try {
            if (class81.field1224 == 0) {
                if (class193.method1237(-9581) - 5000L < class327.field4525) {
                    return 0;
                }
                class19.field303 = class343.field4703.method125((byte) 44, class84.field1264, class270.field3736);
                class396.field5557 = class193.method1237(-9581);
                class81.field1224 = 1;
            }
            if (class193.method1237(-9581) > class396.field5557 + 30000L) {
                return class210.method1322(1000, false);
            }
            if (class81.field1224 == 1) {
                if (class19.field303.field5789 == 2) {
                    return class210.method1322(1001, false);
                }
                if (class19.field303.field5789 != 1) {
                    return -1;
                }
                class237.field3339 = new class456((Socket) class19.field303.field5791, class343.field4703);
                class19.field303 = null;
                int var1 = 0;
                class366.field5214.field5830 = 0;
                if (class449.field6183) {
                    var1 = class202.field2899;
                }
                class366.field5214.method2470((byte) -74, class430.field5938.field6474);
                class366.field5214.method2481(var1, true);
                class237.field3339.method2635(0, class366.field5214.field5830, class366.field5214.field5886, -15109);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -106);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -99);
                }
                int var2 = class237.field3339.method2630((byte) 109);
                if (class36.field622 != null) {
                    class36.field622.method1035((byte) -93);
                }
                if (class2.field22 != null) {
                    class2.field22.method1035((byte) -127);
                }
                if (var2 != 0) {
                    return class210.method1322(var2, false);
                }
                class81.field1224 = 2;
            }
            if (class81.field1224 == 2) {
                if (class237.field3339.method2634(-118) < 2) {
                    return -1;
                }
                class203.field2915 = class237.field3339.method2630((byte) 95);
                class203.field2915 <<= 0x8;
                class203.field2915 += class237.field3339.method2630((byte) 116);
                class48.field769 = new byte[class203.field2915];
                class227.field3204 = 0;
                class81.field1224 = 3;
            }
            if (class81.field1224 != 3) {
                return -1;
            }
            int var3 = class237.field3339.method2634(-120);
            if (var3 < 1) {
                return -1;
            }
            if (var3 > class203.field2915 - class227.field3204) {
                var3 = class203.field2915 - class227.field3204;
            }
            class237.field3339.method2638(class48.field769, var3, class227.field3204, 421464188);
            class227.field3204 += var3;
            if (class203.field2915 > class227.field3204) {
                return -1;
            } else if (class394.method2348(class48.field769, (byte) 68)) {
                class199.field2849 = new class334[class399.field5584];
                int var4 = 0;
                for (int var5 = class189.field2716; var5 <= class361.field5041; var5++) {
                    class334 var6 = class58.method435((byte) 47, var5);
                    if (var6 != null) {
                        class199.field2849[var4++] = var6;
                    }
                }
                class234.field3312 = 0;
                class261.field3643 = null;
                class237.field3339.method2632(32214);
                class237.field3339 = null;
                class48.field769 = null;
                class400.field5592 = 0;
                class81.field1224 = 0;
                class327.field4525 = class193.method1237(-9581);
                return 0;
            } else {
                return class210.method1322(1002, false);
            }
        } catch (IOException var7) {
            return class210.method1322(1003, false);
        }
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)V", line = 136)
    public final void method2733(int arg0) {
        field6502++;
        if (arg0 != 0) {
            this.field6508 = null;
        }
        int var2 = this.field6510;
        if (this.field6512 != null) {
            class475 var5 = this.field6512.method2797(class320.field4376, -128);
            if (var5 == null) {
                this.field6510 = -1;
                this.field6515 = 0;
                this.field6497 = 0;
                this.field6501 = 0;
                this.field6498 = null;
                this.field6504 = 0;
            } else {
                this.field6498 = var5.field6709;
                this.field6497 = var5.field6645 * 128;
                this.field6515 = var5.field6674;
                this.field6504 = var5.field6720;
                this.field6510 = var5.field6673;
                this.field6501 = var5.field6693;
            }
        } else if (this.field6495 != null) {
            int var3 = class257.method1600((byte) 103, this.field6495);
            if (var2 != var3) {
                this.field6510 = var3;
                class127 var4 = this.field6495.field2789;
                if (var4.field1780 != null) {
                    var4 = var4.method767(class320.field4376, (byte) 53);
                }
                if (var4 == null) {
                    this.field6504 = this.field6497 = 0;
                } else {
                    this.field6504 = var4.field1766;
                    this.field6497 = var4.field1747 * 128;
                }
            }
        } else if (this.field6513 != null) {
            this.field6510 = class347.method2080(true, this.field6513);
            this.field6497 = this.field6513.field423 * 128;
            this.field6504 = this.field6513.field419;
        }
        if (this.field6510 != var2 && this.field6507 != null) {
            class386.field5445.method1313(this.field6507);
            this.field6507 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V", line = 228)
    public static void method2734(int arg0) {
        field6503 = null;
        if (arg0 >= -79) {
            field6503 = null;
        }
    }
}
