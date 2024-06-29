import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class266 {

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public int field4772 = 0;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public int field4770 = 0;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Z")
    private boolean field4765 = false;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4771 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public static int[] field4763 = new int[32];

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Lcc;")
    public static class209 field4785 = class95.method669(115, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Z")
    public static boolean field4777 = false;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Lnh;")
    public static class54 field4774 = class186.method1266(false);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public int field4766;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public int field4767;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public int field4768;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    private int field4778;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public int field4782;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "J")
    public long field4788;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "[I")
    public static int[] field4787;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method1816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field4773++;
        if (class223.field4069.method577((byte) 57) == 2) {
            return class239.method1658(arg5, arg10, -1, arg6, arg0, arg1, arg11, arg9, arg8, arg4, arg3, arg2);
        } else if (class223.field4069.method577((byte) -74) > 2) {
            return class97.method680(arg0, arg3, arg2, arg6, arg5, class223.field4069.method577((byte) -86), arg9, arg11, arg1, arg8, arg4, arg10, true);
        } else {
            if (arg7 != 4474) {
                field4774 = null;
            }
            return class255.method1766(arg11, arg1, arg10, arg3, arg4, arg5, arg7 - 4475, arg9, arg0, arg2, arg8, arg6);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1817(int arg0, int arg1) {
        field4780++;
        class195 var2 = class178.method1229(arg0, 3, 47);
        if (arg1 == 202) {
            var2.method1340(true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLcc;)V")
    public static final void method1818(byte arg0, class209 arg1) {
        field4789++;
        if (class42.field743 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1448(true);
        if (arg0 >= -111 || var3 == 0L) {
            return;
        }
        while (class42.field743.length > var2 && class42.field743[var2].field596 != var3) {
            var2++;
        }
        if (var2 < class42.field743.length && class42.field743[var2] != null) {
            class117.field2348++;
            class84.field1677.method287((byte) 127, 202);
            class84.field1677.method756(class42.field743[var2].field596, (byte) -85);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IILtf;)V")
    private final void method1819(int arg0, int arg1, class106 arg2) {
        if (~arg1 == arg0) {
            this.field4778 = arg2.method736(126);
        } else if (arg1 == 2) {
            arg2.method774((byte) 87);
        } else if (arg1 == 3) {
            this.field4767 = arg2.method746((byte) -100);
            this.field4766 = arg2.method746((byte) -100);
            this.field4782 = arg2.method746((byte) -100);
        } else if (arg1 == 4) {
            this.field4790 = arg2.method774((byte) 83);
            this.field4781 = arg2.method746((byte) -100);
        } else if (arg1 == 6) {
            this.field4762 = arg2.method774((byte) 107);
        } else if (arg1 == 8) {
            this.field4772 = 1;
        } else if (arg1 == 9) {
            this.field4770 = 1;
        } else if (arg1 == 10) {
            this.field4765 = true;
        }
        field4776++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public final void method1820(boolean arg0) {
        field4786++;
        this.field4775 = class15.field280[this.field4778];
        this.field4768 = (int) Math.sqrt((double) (this.field4767 * this.field4767 + this.field4782 * this.field4782 + this.field4766 * this.field4766));
        if (this.field4781 == 0) {
            this.field4781 = 1;
        }
        if (this.field4790 == 0) {
            this.field4788 = 2147483647L;
        } else if (this.field4790 == 1) {
            this.field4788 = (long) (this.field4768 * 8 / this.field4781);
            this.field4788 *= this.field4788;
        } else if (this.field4790 == 2) {
            this.field4788 = (long) (this.field4768 * 8 / this.field4781);
        }
        if (arg0 && this.field4765) {
            this.field4768 *= -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)V")
    public static final void method1821(byte arg0, int arg1) {
        field4783++;
        int var2 = 15 / (-arg0 / 55);
        class195 var3 = class178.method1229(arg1, 9, -115);
        var3.method1340(true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field4763 = null;
        field4787 = null;
        field4774 = null;
        field4785 = null;
        if (arg0 != 1) {
            method1821((byte) 56, 68);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILtf;)V")
    public final void method1823(int arg0, class106 arg1) {
        field4764++;
        while (true) {
            int var3 = arg1.method774((byte) 109);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    method1822(-90);
                    return;
                }
            }
            this.method1819(-2, var3, arg1);
        }
    }
}
