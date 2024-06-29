import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class333 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public int field5163 = 16777215;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public int field5171 = 8;

    @OriginalMember(owner = "client!cj", name = "o", descriptor = "[Z")
    public static boolean[] field5177 = new boolean[112];

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "F")
    public static float field5169;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5164;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
    public boolean field5176;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILim;)V", line = 7)
    public final void method2295(int arg0, int arg1, class192 arg2) {
        while (true) {
            int var4 = arg2.method1399(-1172389784);
            if (var4 == 0) {
                field5175++;
                if (arg0 != 112) {
                    this.field5171 = 39;
                }
                return;
            }
            this.method2300(var4, arg1, arg2, 115);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2296(int arg0) {
        if (arg0 != 0) {
            method2296(-65);
        }
        field5172++;
        if (!class152.method1062(arg0 + 126) && class148.field2209 != class146.field2190) {
            class48.method334(false, false, -14842, class13.field159.field2006[0], class13.field159.field1969[0], class31.field437, class148.field2209, class336.field5209);
        } else if (class149.field2288 != class148.field2209 && class299.method2084(class148.field2209, false)) {
            class149.field2288 = class148.field2209;
            class79.method581(124);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 53)
    public static final void method2297(int arg0) {
        field5164++;
        int var1 = class55.field732.method995(class188.field3062);
        for (int var2 = 0; var2 < class126.field1887; var2++) {
            int var3 = class55.field732.method995(class93.method675(var2, true));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class126.field1887 * 15 + 21;
        int var5 = class18.field256 - (var1 / 2);
        if (var5 + var1 > class160.field2601) {
            var5 = class160.field2601 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        int var6 = class323.field5055;
        if (class210.field3432 < (var4 + var6)) {
            var6 = class210.field3432 - var4;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class121.field1848 == 1) {
            if (class18.field256 == class16.field211 && class323.field5055 == class157.field2426) {
                class181.field2932 = var1;
                class12.field136 = (class119.field1827 ? 26 : 22) + class126.field1887 * 15;
                class86.field1297 = var5;
                class19.field274 = true;
                field5166 = var6;
                class121.field1848 = 0;
            }
        } else if (class221.field3521 == class18.field256 && class323.field5055 == class144.field2158) {
            class121.field1848 = 0;
            field5166 = var6;
            class19.field274 = true;
            class181.field2932 = var1;
            class12.field136 = class126.field1887 * 15 + (class119.field1827 ? 26 : 22);
            class86.field1297 = var5;
        } else {
            class16.field211 = class221.field3521;
            class121.field1848 = 1;
            class157.field2426 = class144.field2158;
        }
        int var7 = -57 % ((88 - arg0) / 35);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IBIZ)V", line = 141)
    public static final void method2298(int arg0, byte arg1, int arg2, boolean arg3) {
        field5174++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class168.field2703 = arg2;
        class98.field1499 = arg3;
        if (arg1 != 109) {
            field5177 = (boolean[]) null;
        }
        class264.field4185 = arg0;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 164)
    public static void method2299(int arg0) {
        if (arg0 == 1) {
            field5177 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IILim;I)V", line = 181)
    private final void method2300(int arg0, int arg1, class192 arg2, int arg3) {
        if (arg3 < 112) {
            method2298(24, (byte) -59, 46, true);
        }
        if (arg0 == 1) {
            this.field5171 = arg2.method1396(-95);
        } else if (arg0 == 2) {
            this.field5176 = true;
        } else if (arg0 == 3) {
            this.field5168 = arg2.method1389(107);
            this.field5165 = arg2.method1389(106);
            this.field5167 = arg2.method1389(124);
        } else if (arg0 == 4) {
            this.field5173 = arg2.method1399(-1172389784);
        } else if (arg0 == 5) {
            this.field5170 = arg2.method1396(-16);
        } else if (arg0 == 6) {
            this.field5163 = arg2.method1378(false);
        }
        field5178++;
    }
}
