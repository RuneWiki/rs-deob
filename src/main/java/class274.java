import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fga")
public class class274 {

    @OriginalMember(owner = "client!fga", name = "f", descriptor = "Leda;")
    private class14 field4191 = new class14(128);

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "Lla;")
    private class422 field4186;

    @OriginalMember(owner = "client!fga", name = "b", descriptor = "I")
    public static int field4187 = 0;

    @OriginalMember(owner = "client!fga", name = "d", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fga", name = "e", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!fga", name = "g", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!fga", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!fga", name = "i", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!fga", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!fga", name = "c", descriptor = "Lla;")
    public static class422 field4188;

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
    public static void method1798(int arg0) {
        field4188 = null;
        if (arg0 != 14202) {
            method1798(62);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BZILraa;I)V")
    public static final void method1799(byte arg0, boolean arg1, int arg2, class353 arg3, int arg4) {
        field4192++;
        int var5 = arg3.field5230;
        if (arg3.field5250 == 0) {
            arg3.field5230 = arg3.field5258;
        } else if (arg3.field5250 == 1) {
            arg3.field5230 = arg2 - arg3.field5258;
        } else if (arg3.field5250 == 2) {
            arg3.field5230 = arg3.field5258 * arg2 >> 14;
        }
        if (arg0 < 42) {
            method1798(94);
        }
        int var6 = arg3.field5280;
        if (arg3.field5324 == 0) {
            arg3.field5280 = arg3.field5300;
        } else if (arg3.field5324 == 1) {
            arg3.field5280 = arg4 - arg3.field5300;
        } else if (arg3.field5324 == 2) {
            arg3.field5280 = arg3.field5300 * arg4 >> 14;
        }
        if (arg3.field5250 == 4) {
            arg3.field5230 = arg3.field5280 * arg3.field5229 / arg3.field5206;
        }
        if (arg3.field5324 == 4) {
            arg3.field5280 = arg3.field5230 * arg3.field5206 / arg3.field5229;
        }
        if (class107.field1563 && (client.method2735(arg3).field4391 != 0 || arg3.field5306 == 0)) {
            if (arg3.field5280 < 5 && arg3.field5230 < 5) {
                arg3.field5230 = 5;
                arg3.field5280 = 5;
            } else {
                if (arg3.field5280 <= 0) {
                    arg3.field5280 = 5;
                }
                if (arg3.field5230 <= 0) {
                    arg3.field5230 = 5;
                }
            }
        }
        if (class376.field5662 == arg3.field5235) {
            class548.field7823 = arg3;
        }
        if (arg1 && arg3.field5322 != null && arg3.field5230 != var5 || arg3.field5280 != var6) {
            class700 var7 = new class700();
            var7.field9891 = arg3.field5322;
            var7.field9902 = arg3;
            class402.field5970.method3472(106, var7);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILjava/lang/String;ZBZIIIJZLjava/lang/String;IJ)V")
    public static final void method1800(int arg0, String arg1, boolean arg2, byte arg3, boolean arg4, int arg5, int arg6, int arg7, long arg8, boolean arg9, String arg10, int arg11, long arg12) {
        field4193++;
        if (!class32.field304 && class608.field8588 < 500) {
            int var15 = -86 % ((arg3 + 18) / 56);
            int var16 = arg5 == -1 ? class618.field8708 : arg5;
            class208 var17 = new class208(arg10, arg1, var16, arg11, arg7, arg12, arg6, arg0, arg2, arg9, arg8, arg4);
            class153.method1160(var17, -108);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BC)Z")
    public static final boolean method1801(byte arg0, char arg1) {
        int var2 = 65 / ((-arg0 - 67) / 57);
        field4189++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(BIIII)V")
    public static final void method1802(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -21) {
            method1801((byte) 96, (char) 65449);
        }
        field4195++;
        if (class184.field3102 <= arg1 && class657.field9347 >= arg1) {
            int var5 = class487.method2955(class76.field1126, class461.field6699, (byte) 115, arg3);
            int var6 = class487.method2955(class76.field1126, class461.field6699, (byte) 124, arg2);
            class25.method137(arg1, var5, arg4, var6, 26);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(ILla;I)Lcaa;")
    public static final class637 method1803(int arg0, class422 arg1, int arg2) {
        field4190++;
        byte[] var3 = arg1.method2633(true, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 2) {
                field4187 = -84;
            }
            return new class637(var3);
        }
    }

    @OriginalMember(owner = "client!fga", name = "a", descriptor = "(II)Lsia;")
    public final class150 method1804(int arg0, int arg1) {
        field4194++;
        class14 var3 = this.field4191;
        class150 var4;
        synchronized (this.field4191) {
            if (arg0 != 2) {
                this.field4186 = null;
            }
            var4 = (class150) this.field4191.method80((byte) -93, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4186.method2624(0, class527.method3129(-4, arg1), class715.method3954(arg1, 89));
        class150 var6 = new class150();
        if (var5 != null) {
            var6.method1136((byte) 16, new class301(var5));
        }
        class14 var7 = this.field4191;
        synchronized (this.field4191) {
            this.field4191.method67((long) arg1, var6, -6772);
            return var6;
        }
    }

    @OriginalMember(owner = "client!fga", name = "<init>", descriptor = "(Lcr;ILla;)V")
    public class274(class292 arg0, int arg1, class422 arg2) {
        this.field4186 = arg2;
        if (this.field4186 != null) {
            int var4 = this.field4186.method2628(-122) - 1;
            this.field4186.method2615(0, var4);
        }
    }
}
