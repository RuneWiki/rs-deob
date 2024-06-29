import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class320 extends class148 implements class395 {

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Lcp;")
    public class397 field4618;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "Z")
    private boolean field4631;

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4622 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!si", name = "v", descriptor = "[Leb;")
    public static class382[] field4620 = new class382[4];

    @OriginalMember(owner = "client!si", name = "s", descriptor = "[I")
    public static int[] field4617 = new int[99];

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4634 = null;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field4619;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    public static int field4621;

    @OriginalMember(owner = "client!si", name = "y", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!si", name = "z", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!si", name = "A", descriptor = "I")
    public static int field4625;

    @OriginalMember(owner = "client!si", name = "B", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field4627;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field4633;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Lof;")
    public static class421 field4629;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4617[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZLja;)V", line = 7)
    public final void method1022(boolean arg0, class90 arg1) {
        this.field4618.method2527(arg1, 108);
        ++field4619;
        if (!arg0) {
            this.method1018((byte) 70);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)I", line = 23)
    public final int method1013(boolean arg0) {
        ++field4627;
        if (arg0) {
            this.method1025((byte) -18, -109, (class90) null);
        }
        return this.field4618.field5841;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)Z", line = 34)
    public final boolean method53(byte arg0) {
        ++field4632;
        return arg0 < 58;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)I", line = 46)
    public final int method1024(int arg0) {
        if (arg0 != 20691) {
            return -3;
        } else {
            ++field4626;
            return this.field4618.field5827;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILja;II)Z", line = 64)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        ++field4621;
        if (arg2 != 28033) {
            return false;
        } else {
            class100 var5 = this.field4618.method2522(false, arg1, super.field2289, 65536, false, (byte) -66, super.field2282);
            if (var5 == null) {
                return false;
            } else {
                class202 var6 = arg1.method709();
                var6.method1527(super.field2289, super.field2286, super.field2282);
                return var5.method574(arg3, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 83)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        ++field4624;
        if (arg1 != 47) {
            this.method47(96, (byte) -42, false, 119, 28, (class256) null, (class90) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!si", name = "d", descriptor = "(I)V", line = 95)
    public final void method54(int arg0) {
        ++field4636;
        if (arg0 == 0) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lja;Lfb;IIIIIIIZI)V", line = 110)
    public class320(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        super(arg6, arg7, arg8, class63.method486(arg2, arg3, (byte) 100));
        this.field4618 = new class397(arg0, arg1, arg2, arg3, arg4, arg5, super.field2289, super.field2282, arg9, arg10);
        this.field4631 = arg1.field697 != 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z", line = 119)
    public final boolean method1018(byte arg0) {
        if (arg0 > -16) {
            this.method1013(true);
        }
        ++field4628;
        return this.field4618.method2536(16426);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lja;I)V", line = 136)
    public final void method1021(class90 arg0, int arg1) {
        this.field4618.method2523(-17547, arg0);
        ++field4633;
        int var3 = 1 / ((-58 - arg1) / 56);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BLja;)Lkh;", line = 147)
    public final class69 method134(byte arg0, class90 arg1) {
        if (arg0 < 90) {
            return null;
        } else {
            ++field4630;
            class100 var3 = this.field4618.method2522(true, arg1, super.field2289, 1024, false, (byte) -54, super.field2282);
            if (var3 == null) {
                return null;
            } else {
                class202 var4 = arg1.method709();
                var4.method1527(super.field2289, super.field2286, super.field2282);
                class69 var5 = null;
                if (this.field4631) {
                    var5 = class256.method1849(1, 111);
                }
                if (this.field4618.field5813 != null) {
                    class30 var6 = this.field4618.field5813.method427();
                    arg1.method698(var3, var6, var4, var5 != null ? var5.field1128[0] : null, 0);
                } else {
                    var3.method530(var4, var5 != null ? var5.field1128[0] : null, 0);
                }
                this.field4618.method2525(super.field2289 >> 7, arg1, false, super.field2282 >> 7, var3, true, super.field2289 >> 7, super.field2282 >> 7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)I", line = 184)
    public final int method1020(int arg0) {
        if (arg0 != 15829) {
            field4622 = null;
        }
        ++field4625;
        return this.field4618.field5834;
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)V", line = 195)
    public final void method1023(int arg0) {
        if (arg0 <= 40) {
            method2139(-6);
        }
        ++field4635;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BILja;)Lrc;", line = 207)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        ++field4616;
        if (arg0 != -84) {
            field4620 = null;
        }
        return this.field4618.method2522(false, arg2, 0, arg1, false, (byte) -123, 0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILja;)V", line = 219)
    public final void method137(int arg0, class90 arg1) {
        ++field4623;
        class100 var3 = this.field4618.method2522(true, arg1, super.field2289, 131072, true, (byte) -43, super.field2282);
        if (var3 != null) {
            this.field4618.method2525(super.field2289 >> 7, arg1, false, super.field2282 >> 7, var3, false, super.field2289 >> 7, super.field2282 >> 7);
        }
        int var4 = -118 % ((arg0 - -31) / 51);
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)V", line = 238)
    public static void method2139(int arg0) {
        field4620 = null;
        field4622 = null;
        field4629 = null;
        if (arg0 != 1833392871) {
            method2139(90);
        }
        field4617 = null;
        field4634 = null;
    }
}
