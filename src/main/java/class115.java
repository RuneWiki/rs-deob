import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class115 {

    @OriginalMember(owner = "client!np", name = "s", descriptor = "I")
    public int field2047 = 0;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public int field2042 = 0;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "Z")
    private boolean field2051 = false;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "Llo;")
    public static class306 field2039 = new class306("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!np", name = "r", descriptor = "Lnk;")
    public static class326 field2046 = new class326(44, 4);

    @OriginalMember(owner = "client!np", name = "u", descriptor = "Lfr;")
    public static class231 field2049 = new class231(4);

    @OriginalMember(owner = "client!np", name = "x", descriptor = "Lrr;")
    public static class280 field2052 = new class280(14, 0, 4, 1);

    @OriginalMember(owner = "client!np", name = "y", descriptor = "Lnk;")
    public static class326 field2053 = new class326(10, 16);

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public int field2029;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public int field2030;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public int field2045;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "J")
    public long field2050;

    @OriginalMember(owner = "client!np", name = "z", descriptor = "[Lo;")
    public static class138[] field2054;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(III)B", line = 4)
    public static final byte method920(int arg0, int arg1, int arg2) {
        int var3 = -73 % ((arg1 - 58) / 33);
        field2034++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 26)
    public static void method921(byte arg0) {
        field2052 = null;
        field2054 = null;
        field2049 = null;
        if (arg0 <= 14) {
            method924(94, -76);
        }
        field2053 = null;
        field2039 = null;
        field2046 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZLia;)V", line = 46)
    public final void method922(boolean arg0, class23 arg1) {
        if (arg0) {
            this.field2045 = 22;
        }
        field2036++;
        while (true) {
            int var3 = arg1.method126((byte) -81);
            if (var3 == 0) {
                return;
            }
            this.method926(var3, arg1, 48);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIII)V", line = 66)
    public static final void method923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2033++;
        if (arg2 != 0) {
            field2053 = null;
        }
        for (int var6 = arg3; var6 <= arg0; var6++) {
            class357.method2291(arg1, arg4, class209.field3294[var6], arg5, -1);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 86)
    public static final void method924(int arg0, int arg1) {
        class465 var2 = class66.field977[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class465 var4 = class66.field977[var3][arg0][arg1] = class66.field977[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6893--;
                for (class1 var5 = var4.field6898; var5 != null; var5 = var5.field2) {
                    class290 var6 = var5.field9;
                    if (var6.field4718 == arg0 && var6.field4717 == arg1) {
                        var6.field4720--;
                    }
                }
            }
        }
        if (class66.field977[0][arg0][arg1] == null) {
            class66.field977[0][arg0][arg1] = new class465(0, arg0, arg1);
            class66.field977[0][arg0][arg1].field6916 = 1;
        }
        class66.field977[0][arg0][arg1].field6912 = var2;
        class66.field977[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 130)
    public final void method925(int arg0) {
        field2037++;
        if (arg0 != -1) {
            this.method925(-60);
        }
        this.field2045 = class46.field755[this.field2032 << 3];
        this.field2043 = (int) Math.sqrt((double) (this.field2044 * this.field2044 + this.field2038 * this.field2038 + this.field2030 * this.field2030));
        if (this.field2040 == 0) {
            this.field2040 = 1;
        }
        if (this.field2031 == 0) {
            this.field2050 = 2147483647L;
        } else if (this.field2031 == 1) {
            this.field2050 = (this.field2043 * 8 / this.field2040);
            this.field2050 *= this.field2050;
        } else if (this.field2031 == 2) {
            this.field2050 = (this.field2043 * 8 / this.field2040);
        }
        if (this.field2051) {
            this.field2043 *= -1;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ILia;I)V", line = 166)
    private final void method926(int arg0, class23 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2032 = arg1.method132(44);
        } else if (arg0 == 2) {
            arg1.method126((byte) -104);
        } else if (arg0 == 3) {
            this.field2038 = arg1.method143(-3230);
            this.field2044 = arg1.method143(-3230);
            this.field2030 = arg1.method143(-3230);
        } else if (arg0 == 4) {
            this.field2031 = arg1.method126((byte) -120);
            this.field2040 = arg1.method143(-3230);
        } else if (arg0 == 6) {
            this.field2041 = arg1.method126((byte) -94);
        } else if (arg0 == 8) {
            this.field2047 = 1;
        } else if (arg0 == 9) {
            this.field2042 = 1;
        } else if (arg0 == 10) {
            this.field2051 = true;
        }
        field2048++;
        if (arg2 <= 15) {
            method920(-5, 38, 107);
        }
    }
}
