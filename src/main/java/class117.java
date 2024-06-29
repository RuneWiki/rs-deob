import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class117 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "F")
    public float field1805 = 1.0F;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "F")
    public float field1823 = 1.0F;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "F")
    public float field1825 = 0.25F;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field1822;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "F")
    public float field1811;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field1810;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
    public int field1817;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "F")
    public float field1820;

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "I")
    public int field1824;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field1812;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "F")
    public float field1807;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lee;")
    public class137 field1808;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljh;")
    public static class207 field1809 = null;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[Lng;")
    public static class245[] field1803;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[S")
    public static short[] field1804;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[[B")
    public static byte[][] field1814;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 6)
    public static void method803(int arg0) {
        if (arg0 != 8) {
            method803(102);
        }
        field1804 = null;
        field1803 = null;
        field1814 = (byte[][]) null;
        field1809 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 30)
    public static final void method804(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 89) {
            method803(14);
        }
        for (int var5 = 0; var5 < class64.field963; var5++) {
            if (arg3 < class167.field2563[var5] + class15.field159[var5] && class15.field159[var5] < (arg3 + arg4) && class194.field2932[var5] + class233.field3750[var5] > arg1 && (arg0 + arg1) > class194.field2932[var5]) {
                class19.field267[var5] = true;
            }
        }
        field1818++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 119)
    public class117() {
        this.field1822 = class326.field5071;
        this.field1811 = 1.2F;
        this.field1810 = -50;
        this.field1813 = -50;
        this.field1817 = 0;
        this.field1820 = 0.69921875F;
        this.field1824 = -60;
        this.field1812 = class326.field5068;
        this.field1807 = 1.1523438F;
        if (class152.field2407 != null) {
            this.field1808 = class137.method936(class152.field2407[0], class152.field2407[1], class152.field2407[2], class152.field2407[3], class152.field2407[4], class152.field2407[5]);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lgn;)V", line = 137)
    public class117(class303 arg0) {
        int var2 = arg0.method2043((byte) -104);
        if ((var2 & 0x1) == 0) {
            this.field1812 = class326.field5068;
        } else {
            this.field1812 = arg0.method1996(72);
        }
        if ((var2 & 0x2) == 0) {
            this.field1807 = 1.1523438F;
        } else {
            this.field1807 = (float) arg0.method1994(false) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field1820 = 0.69921875F;
        } else {
            this.field1820 = (float) arg0.method1994(false) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field1811 = 1.2F;
        } else {
            this.field1811 = (float) arg0.method1994(false) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field1813 = -50;
            this.field1824 = -60;
            this.field1810 = -50;
        } else {
            this.field1813 = arg0.method2042(7);
            this.field1824 = arg0.method2042(7);
            this.field1810 = arg0.method2042(7);
        }
        if ((var2 & 0x20) == 0) {
            this.field1822 = class326.field5071;
        } else {
            this.field1822 = arg0.method1996(113);
        }
        if ((var2 & 0x40) == 0) {
            this.field1817 = 0;
        } else {
            this.field1817 = arg0.method1994(false);
        }
        if ((var2 & 0x80) != 0) {
            this.field1808 = class137.method936(arg0.method1994(false), arg0.method1994(false), arg0.method1994(false), arg0.method1994(false), arg0.method1994(false), arg0.method1994(false));
        } else if (class152.field2407 != null) {
            this.field1808 = class137.method936(class152.field2407[0], class152.field2407[1], class152.field2407[2], class152.field2407[3], class152.field2407[4], class152.field2407[5]);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILwf;)[Lbd;", line = 56)
    public static final class20[] method805(int arg0, int arg1, class306 arg2) {
        field1815++;
        if (arg0 != -1) {
            method806(false, 122);
        }
        return class46.method317((byte) -124, arg2, arg1) ? class229.method1572(false) : null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)I", line = 75)
    public static final int method806(boolean arg0, int arg1) {
        field1806++;
        if (arg0) {
            method805(-63, 82, (class306) null);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLgn;)V", line = 91)
    public final void method807(boolean arg0, class303 arg1) {
        this.field1805 = (float) (arg1.method2043((byte) -108) * 8) / 255.0F;
        if (arg0) {
            this.field1807 = 0.8758795F;
        }
        this.field1825 = (float) (arg1.method2043((byte) -105) * 8) / 255.0F;
        field1821++;
        this.field1823 = (float) (arg1.method2043((byte) -123) * 8) / 255.0F;
    }
}
