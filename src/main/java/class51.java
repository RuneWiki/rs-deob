import jaclib.memory.Buffer;
import jaclib.memory.Source;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class51 extends class110 implements class401 {

    @OriginalMember(owner = "client!caa", name = "C", descriptor = "Lae;")
    public static class40 field768 = new class40();

    @OriginalMember(owner = "client!caa", name = "F", descriptor = "Llt;")
    public static class273 field771 = new class273();

    @OriginalMember(owner = "client!caa", name = "H", descriptor = "Lrga;")
    public static class280 field773 = new class280(57, 8);

    @OriginalMember(owner = "client!caa", name = "D", descriptor = "B")
    private byte field769;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!caa", name = "u", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!caa", name = "v", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!caa", name = "w", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!caa", name = "x", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!caa", name = "y", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!caa", name = "B", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!caa", name = "E", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!caa", name = "I", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!caa", name = "G", descriptor = "Lpl;")
    public static class612 field772;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIII)V", line = 4)
    public static final void method319(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field758;
        if (~class369.field4685 == -2) {
            class250.field3072[class231.field2890 / 100].method2902(class199.field2527 + -8, class204.field2591 + -8);
        }
        int var5 = 52 / ((arg1 - 69) / 39);
        if (~class369.field4685 == -3) {
            class250.field3072[4 - -(class231.field2890 / 100)].method2902(class199.field2527 - 8, class204.field2591 - 8);
        }
        class515.method2788(-3073);
    }

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "(I)V", line = 28)
    public static void method320(int arg0) {
        field771 = null;
        field772 = null;
        field773 = null;
        if (arg0 > -71) {
            method328(-72, -55, -105, (byte) 31, -61);
        }
        field768 = null;
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)I", line = 41)
    public final int method321(byte arg0) {
        if (arg0 != -102) {
            this.method323(24);
        }
        ++field770;
        return this.field769;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z", line = 53)
    public final boolean method322(int arg0) {
        ++field766;
        return arg0 < 12 ? false : super.method621(super.field1448.field4368, 35040);
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V", line = 66)
    public final void method323(int arg0) {
        ++field765;
        super.method323(arg0);
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Llm;Z)V", line = 74)
    public class51(class337 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z", line = 79)
    public final boolean method324(int arg0, int arg1, int arg2) {
        ++field759;
        if (arg0 >= -29) {
            return true;
        } else {
            this.field769 = (byte) arg1;
            super.method619(27209, arg2);
            return true;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ZI)Ljaclib/memory/Buffer;", line = 95)
    public final Buffer method325(boolean arg0, int arg1) {
        if (arg1 != 32726) {
            return null;
        } else {
            ++field760;
            return super.method616(arg0, (byte) 49, super.field1448.field4368);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljaclib/memory/Source;IIB)Z", line = 106)
    public final boolean method326(Source arg0, int arg1, int arg2, byte arg3) {
        ++field763;
        this.field769 = (byte) arg1;
        super.method620(arg2, arg0, (byte) 108);
        if (arg3 < 20) {
            field771 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILqi;BI)V", line = 121)
    public static final void method327(int arg0, class514 arg1, byte arg2, int arg3) {
        ++field761;
        int[] var4 = new int[4];
        class293.method1642(var4, 0, var4.length, arg3);
        class9.method69(arg0, var4, -120, arg1);
        if (arg2 != -123) {
            method320(-50);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIIBI)V", line = 135)
    public static final void method328(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field762;
        int var5 = 0;
        if (arg3 == 31) {
            while (var5 < class66.field905) {
                Rectangle var6 = class221.field2711[var5];
                if (~(var6.x + var6.width) < ~arg4 && var6.x < arg4 - -arg0 && ~arg1 > ~(var6.y + var6.height) && ~var6.y > ~(arg1 + arg2)) {
                    class413.field5168[var5] = true;
                }
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lrca;B)I", line = 161)
    public static final int method329(class34 arg0, byte arg1) {
        ++field767;
        if (class507.field6853 != arg0) {
            if (class31.field444 == arg0) {
                return 34065;
            } else if (class186.field2359 == arg0) {
                return 34066;
            } else {
                if (arg1 != 42) {
                    field772 = null;
                }
                throw new IllegalArgumentException();
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I", line = 185)
    public final int method330(byte arg0) {
        ++field764;
        if (arg0 <= 11) {
            this.method324(-33, 8, 88);
        }
        return super.method330((byte) 119);
    }
}
