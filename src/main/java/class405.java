import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class405 extends class600 {

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Lls;")
    public class459 field5072;

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
    public static int field5073 = -1;

    @OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
    public static int field5076 = 0;

    @OriginalMember(owner = "client!ao", name = "l", descriptor = "Lwp;")
    public static class453 field5077 = new class453(12, -1);

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!ao", name = "m", descriptor = "I")
    public static int field5078;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZILr;I)Lla;", line = 6)
    public static final class413 method2155(boolean arg0, int arg1, class566 arg2, int arg3) {
        field5078++;
        class462 var4 = class449.method2401((byte) -56, arg1, arg2, arg0);
        if (arg3 == 0) {
            return var4 == null ? null : var4.field5890;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIB)V", line = 28)
    public static final void method2156(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class301.field3698.field6633 * arg1 >> 8;
        field5071++;
        if (arg3 != -123) {
            field5073 = 97;
        }
        if (arg0 == -1 && !class639.field8989) {
            class538.method2919(true);
        } else if (arg0 != -1 && (class582.field8137 != arg0 || !class27.method185(true)) && var4 != 0 && !class639.field8989) {
            class431.method2275(var4, false, arg0, class81.field1086, arg2, 0, (byte) 117);
        }
        class582.field8137 = arg0;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 54)
    public static final void method2157(int arg0) {
        field5075++;
        for (class637 var1 = (class637) class201.field2540.method237(86); var1 != null; var1 = (class637) class201.field2540.method245((byte) 122)) {
            class509 var2 = var1.field8932;
            if (var2.field6909 < class133.field1735) {
                var1.method1871(-61);
                var2.method2746((byte) 105);
            } else if (var2.field6916 <= class133.field1735) {
                if (var2.field6917 > 0) {
                    class206 var3 = (class206) class180.field2318.method399(-32748, (long) (var2.field6917 - 1));
                    if (var3 != null) {
                        class307 var4 = var3.field2618;
                        if (var4.field6461 >= 0 && class431.field5395 * 512 > var4.field6461 && var4.field6464 >= 0 && class452.field5802 * 512 > var4.field6464) {
                            var2.method2749(var4.field6464, var4.field6461, 0, class133.field1735, class467.method2469(var4.field6461, var2.field6470, -20214, var4.field6464) - var2.field6906);
                        }
                    }
                }
                if (var2.field6917 < 0) {
                    int var5 = -var2.field6917 - 1;
                    class514 var6;
                    if (class167.field2200 == var5) {
                        var6 = class376.field4748;
                    } else {
                        var6 = class351.field4490[var5];
                    }
                    if (var6 != null && var6.field6461 >= 0 && var6.field6461 < class431.field5395 * 512 && var6.field6464 >= 0 && var6.field6464 < class452.field5802 * 512) {
                        var2.method2749(var6.field6464, var6.field6461, 0, class133.field1735, class467.method2469(var6.field6461, var2.field6470, -20214, var6.field6464) - var2.field6906);
                    }
                }
                var2.method2748(class653.field9220, 0);
                class231.method1391(var2, true);
            }
        }
        if (arg0 > -64) {
            method2156(-68, 62, -61, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 122)
    public static void method2158(byte arg0) {
        field5077 = null;
        if (arg0 >= -99) {
            field5077 = null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Len;II[B)V", line = 131)
    public class405(class478 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5072 = arg0.method2592(arg3, arg1, arg2, class586.field8227, false, (byte) 73);
        this.field5072.method525((byte) -81, false, false);
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Len;II[I)V", line = 144)
    public class405(class478 arg0, int arg1, int arg2, int[] arg3) {
        this.field5072 = arg0.method2576(arg1, false, arg2, arg3, (byte) 65);
        this.field5072.method525((byte) -81, false, false);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BFFF)I", line = 158)
    public static final int method2159(byte arg0, float arg1, float arg2, float arg3) {
        field5074++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        if (arg0 > -90) {
            field5077 = null;
        }
        float var5 = arg1 < 0.0F ? -arg1 : arg1;
        float var6 = (arg2 < 0.0F) ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return (arg1 > 0.0F) ? 0 : 1;
        } else if (var4 < var6 && var6 > var5) {
            return (arg2 > 0.0F) ? 2 : 3;
        } else if (arg3 > 0.0F) {
            return 4;
        } else {
            return 5;
        }
    }
}
