import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class129 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "F")
    public float field1819 = 1.0F;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "F")
    public float field1828 = 0.25F;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "F")
    public float field1829 = 1.0F;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "F")
    public float field1837;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "F")
    public float field1831;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "Lro;")
    public class1 field1838;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "F")
    public float field1816;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field1823;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public int field1820;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1834 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1817 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lpm;")
    public static class349 field1821 = new class349("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lkg;")
    public static class148 field1835;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILec;)Z", line = 5)
    public final boolean method790(int arg0, class129 arg1) {
        field1830++;
        if (arg0 != 10) {
            this.field1824 = 45;
        }
        return this.field1820 == arg1.field1820 && this.field1831 == arg1.field1831 && this.field1837 == arg1.field1837 && this.field1816 == arg1.field1816 && this.field1828 == arg1.field1828 && this.field1819 == arg1.field1819 && this.field1829 == arg1.field1829 && this.field1823 == arg1.field1823 && this.field1833 == arg1.field1833 && this.field1838 == arg1.field1838;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Llf;B)V", line = 16)
    public final void method791(class130 arg0, byte arg1) {
        if (arg1 > -94) {
            this.field1837 = -0.2844362F;
        }
        field1818++;
        this.field1819 = (float) (arg0.method837(true) * 8) / 255.0F;
        this.field1828 = (float) (arg0.method837(true) * 8) / 255.0F;
        this.field1829 = (float) (arg0.method837(true) * 8) / 255.0F;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Object;Lml;I)V", line = 29)
    public static final void method792(Object arg0, class219 arg1, int arg2) {
        field1836++;
        if (arg1.field3151 == null) {
            return;
        }
        int var3 = 0;
        if (arg2 < 8) {
            method794(-7);
        }
        while (var3 < 50 && arg1.field3151.peekEvent() != null) {
            class259.method1790((byte) -75, 1L);
            var3++;
        }
        if (arg0 != null) {
            arg1.field3151.postEvent(new ActionEvent(arg0, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lo;III[Z)Z", line = 55)
    public static final boolean method793(class21 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class439.field6280 != class241.field3567) {
            int var6 = class126.field1734[arg1].method360(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class92 var8 = class126.field1734[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method360(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method361(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method357(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 96)
    public static void method794(int arg0) {
        field1835 = null;
        if (arg0 != 0) {
            method795((class194) null, (byte) 92, -27, 26, (class297) null, (class269) null, (class400) null, 90);
        }
        field1821 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 182)
    public class129() {
        this.field1833 = 0;
        this.field1837 = 0.69921875F;
        this.field1831 = 1.1523438F;
        this.field1838 = class216.field3118;
        this.field1816 = 1.2F;
        this.field1827 = -60;
        this.field1823 = class24.field303;
        this.field1822 = -50;
        this.field1820 = class262.field3870;
        this.field1824 = -50;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Llf;)V", line = 198)
    public class129(class130 arg0) {
        int var2 = arg0.method837(true);
        if (class120.field1626 && class390.field5490.method953() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field1820 = class262.field3870;
            } else {
                this.field1820 = arg0.method815(true);
            }
            if ((var2 & 0x2) == 0) {
                this.field1831 = 1.1523438F;
            } else {
                this.field1831 = (float) arg0.method798(false) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field1837 = 0.69921875F;
            } else {
                this.field1837 = (float) arg0.method798(false) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field1816 = 1.2F;
            } else {
                this.field1816 = (float) arg0.method798(false) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method815(true);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method798(false);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method798(false);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method798(false);
            }
            this.field1831 = 1.1523438F;
            this.field1837 = 0.69921875F;
            this.field1820 = class262.field3870;
            this.field1816 = 1.2F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1822 = -50;
            this.field1824 = -50;
            this.field1827 = -60;
        } else {
            this.field1822 = arg0.method844(698527688);
            this.field1827 = arg0.method844(698527688);
            this.field1824 = arg0.method844(698527688);
        }
        if ((var2 & 0x20) == 0) {
            this.field1823 = class24.field303;
        } else {
            this.field1823 = arg0.method815(true);
        }
        if ((var2 & 0x40) == 0) {
            this.field1833 = 0;
        } else {
            this.field1833 = arg0.method798(false);
        }
        if ((var2 & 0x80) == 0) {
            this.field1838 = class216.field3118;
        } else {
            this.field1838 = class359.method2337(arg0.method798(false), arg0.method798(false), arg0.method798(false), arg0.method798(false), arg0.method798(false), 65535, arg0.method798(false));
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lak;BIILmq;Lvq;Lt;I)V", line = 131)
    public static final void method795(class194 arg0, byte arg1, int arg2, int arg3, class297 arg4, class269 arg5, class400 arg6, int arg7) {
        field1825++;
        int var8 = arg0.field2791 - (arg2 / 2) - 5;
        int var9 = arg3 + 2;
        if (arg4.field4322 != 0) {
            arg5.method1832(var8, arg4.field4322, arg2 + 10, 1, var9, arg7 * arg6.method2506() + arg3 - (var9 - 1));
        }
        if (arg4.field4296 != 0) {
            arg5.method1837(var9, arg3 + arg7 * arg6.method2506() + 1 - var9, arg2 + 10, arg4.field4296, (byte) -106, var8);
        }
        int var10 = arg4.field4316;
        if (arg1 <= 111) {
            return;
        }
        if (arg0.field2790 && arg4.field4312 != -1) {
            var10 = arg4.field4312;
        }
        for (int var11 = 0; var11 < arg7; var11++) {
            String var12 = class410.field5885[var11];
            if ((arg7 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method2510(arg5, var12, arg0.field2791, arg3, var10, true);
            arg3 += arg6.method2506();
        }
    }
}
