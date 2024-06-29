import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class135 extends class97 {

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    private int field1783;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public int field1780;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
    private int field1798;

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    private int field1797;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    private int field1790;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    private int field1789;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Liq;")
    public static class134 field1786;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fe", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field1800;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I[III)V")
    public final void method840(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[2] = this.field1784 + arg3 - this.field1797;
        arg1[0] = 0;
        arg1[1] = this.field1780 + arg0 - this.field1783;
        field1795++;
        int var5 = 39 % (arg2 / 53);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIII)Z")
    public final boolean method841(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            this.field1785 = -26;
        }
        field1796++;
        return this.field1790 == arg1 && arg0 >= this.field1783 && this.field1798 >= arg0 && this.field1797 <= arg3 && this.field1789 >= arg3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    public static final void method842(byte arg0, int arg1) {
        if (arg0 < -15) {
            field1799++;
            class32 var2 = class136.method854(8, (byte) 82, arg1);
            var2.method192(-17451);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "([IIII)V")
    public final void method843(int[] arg0, int arg1, int arg2, int arg3) {
        field1793++;
        arg0[1] = this.field1783 + arg2 - this.field1780;
        if (arg3 != 17806) {
            method847(-58);
        }
        arg0[2] = this.field1797 + arg1 - this.field1784;
        arg0[0] = this.field1790;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZ)Z")
    public final boolean method844(int arg0, int arg1, boolean arg2) {
        field1787++;
        if (arg2) {
            this.method844(43, 47, true);
        }
        return arg0 >= this.field1783 && this.field1798 >= arg0 && arg1 >= this.field1797 && this.field1789 >= arg1;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BII)Z")
    public final boolean method845(byte arg0, int arg1, int arg2) {
        field1782++;
        if (arg0 > -46) {
            this.method845((byte) 121, -42, 91);
        }
        return this.field1780 <= arg2 && this.field1785 >= arg2 && arg1 >= this.field1784 && arg1 <= this.field1792;
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public static final void method846(int arg0) {
        field1791++;
        class465.method2868((byte) -128, class109.field1445);
        int var1 = (class185.field2790 >> 10) + (class17.field250 >> 3);
        int var2 = (class196.field2967 >> 10) + (class112.field1487 >> 3);
        class143.field1911 = class113.field1500.field1902 = 0;
        class113.field1500.method1030(-22006, 8, 8);
        byte var3 = 18;
        class62.field789 = new int[var3];
        class432.field6343 = new byte[var3][];
        class77.field1025 = new int[var3];
        class154.field2122 = new byte[var3][];
        class236.field3544 = new byte[var3][];
        class161.field2243 = new int[var3];
        class37.field450 = new int[var3];
        class351.field5207 = new int[var3];
        class446.field6568 = new byte[var3][];
        class435.field6412 = new byte[var3][];
        if (arg0 <= 50) {
            return;
        }
        class333.field4969 = new int[var3][4];
        class244.field3663 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class115.field1522 >> 4)) / 8; var5 <= ((class115.field1522 >> 4) + var1) / 8; var5++) {
            for (int var7 = (var2 - (class198.field3004 >> 4)) / 8; var7 <= ((class198.field3004 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class161.field2243[var4] = var8;
                class244.field3663[var4] = class265.field4048.method836(-1, "m" + var5 + "_" + var7);
                class77.field1025[var4] = class265.field4048.method836(-1, "l" + var5 + "_" + var7);
                class351.field5207[var4] = class265.field4048.method836(-1, "n" + var5 + "_" + var7);
                class37.field450[var4] = class265.field4048.method836(-1, "um" + var5 + "_" + var7);
                class62.field789[var4] = class265.field4048.method836(-1, "ul" + var5 + "_" + var7);
                if (class351.field5207[var4] == -1) {
                    class244.field3663[var4] = -1;
                    class77.field1025[var4] = -1;
                    class37.field450[var4] = -1;
                    class62.field789[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class351.field5207.length; var6++) {
            class351.field5207[var6] = -1;
            class244.field3663[var6] = -1;
            class77.field1025[var6] = -1;
            class37.field450[var6] = -1;
            class62.field789[var6] = -1;
        }
        class207.method1212(-5, var2, true, false, var1);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
    public static void method847(int arg0) {
        if (arg0 <= 116) {
            method849('\u001b', -36);
        }
        field1786 = null;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method848(int arg0, int arg1, int arg2, byte arg3) {
        field1788++;
        int var4 = -48 / ((-arg3 - 82) / 43);
        boolean var5 = true;
        class18 var6 = (class18) class37.method211(arg0, arg2, arg1);
        if (var6 != null) {
            var5 &= class319.method1948(var6, -112);
        }
        class18 var7 = (class18) class51.method293(arg0, arg2, arg1, field1800 == null ? (field1800 = method850("rc")) : field1800);
        if (var7 != null) {
            var5 &= class319.method1948(var7, -114);
        }
        class18 var8 = (class18) class386.method2385(arg0, arg2, arg1);
        if (var8 != null) {
            var5 &= class319.method1948(var8, -87);
        }
        return var5;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(CI)Z")
    public static final boolean method849(char arg0, int arg1) {
        if (arg1 != 8) {
            method846(118);
        }
        field1781++;
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field1783 = arg1;
        this.field1784 = arg6;
        this.field1780 = arg5;
        this.field1785 = arg7;
        this.field1798 = arg3;
        this.field1797 = arg2;
        this.field1792 = arg8;
        this.field1790 = arg0;
        this.field1789 = arg4;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method850(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
