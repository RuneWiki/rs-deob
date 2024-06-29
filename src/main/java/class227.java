import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class227 {

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    public static int[] field3416 = new int[8];

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public static int[] field3423 = new int[2500];

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
    public static int[] field3426 = new int[2048];

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field3425 = 0;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "I")
    private int field3429;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 4)
    public static final String method1690(int arg0, long arg1) {
        field3417++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        }
        if (arg0 != 32767) {
            method1698(51, 102);
        }
        if ((arg1 % 37L) == 0L) {
            return null;
        }
        int var3 = 0;
        long var4 = arg1;
        while (var4 != 0L) {
            var4 /= 37L;
            var3++;
        }
        StringBuffer var6 = new StringBuffer(var3);
        while (arg1 != 0L) {
            long var7 = arg1;
            arg1 /= 37L;
            char var9 = class177.field2545[(int) (var7 - (arg1 * 37L))];
            if (var9 == '_') {
                var9 = ' ';
                int var10 = var6.length() - 1;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            var6.append(var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 61)
    public static final void method1691(int arg0) {
        while (true) {
            if (class83.field1194.method1916(8, class358.field5481) >= 27) {
                int var1 = class83.field1194.method1911(15, 16811);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class300.field4495[var1] == null) {
                        class300.field4495[var1] = new class181();
                        var2 = true;
                    }
                    class181 var3 = class300.field4495[var1];
                    class215.field3158[class166.field2384++] = var1;
                    var3.field5153 = class304.field4560;
                    if (var3.field2609 != null && var3.field2609.method1544(-26)) {
                        class249.method1834((byte) 114, var3);
                    }
                    var3.method1259(class343.method2393((byte) -27, class83.field1194.method1911(14, 16811)), (byte) 7);
                    int var4 = class83.field1194.method1911(1, 16811);
                    int var5 = class83.field1194.method1911(1, 16811);
                    if (var5 == 1) {
                        class5.field125[class95.field1336++] = var1;
                    }
                    int var6 = class83.field1194.method1911(5, arg0 + 16779);
                    int var7 = class359.field5559[class83.field1194.method1911(3, 16811)];
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var2) {
                        var3.field5089 = var3.field5199 = var7;
                    }
                    int var8 = class83.field1194.method1911(5, 16811);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method2351(var3.field2609.field3083, -19464);
                    var3.field5149 = var3.field2609.field3081;
                    if (var3.field5149 == 0) {
                        var3.field5199 = 0;
                    }
                    var3.field5195 = var3.field2609.field3144;
                    var3.method2347(class1.field55.field5186[0] + var8, class1.field55.field5162[0] - -var6, (byte) 125, var3.method1700(-104), var4 == 1);
                    if (var3.field2609.method1544(arg0 - 142)) {
                        class277.method2029(var3.field5186[0], var3, class321.field4835, (byte) 60, var3.field5162[0], 0, (class261) null, 0, (class228) null);
                    }
                    continue;
                }
            }
            class83.field1194.method1917(arg0 ^ 0x6F);
            if (arg0 != 32) {
                method1695(36);
            }
            field3419++;
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIZII)V", line = 137)
    public static final void method1692(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 >= class355.field5452 && arg1 <= class348.field5378 && arg2 >= class326.field4901 && class261.field3911 >= arg4) {
            class207.method1517(arg0, arg1, 0, arg4, arg2, arg5);
        } else {
            class299.method2122(arg0, arg2, 26384, arg1, arg4, arg5);
        }
        if (arg3) {
            field3427++;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BILsb;)V", line = 165)
    public final void method1693(byte arg0, int arg1, class190 arg2) {
        while (true) {
            int var4 = arg2.method1319(arg0 ^ 0xFFFFFF00);
            if (var4 == 0) {
                field3422++;
                if (arg0 != -1) {
                    field3420 = -12;
                }
                return;
            }
            this.method1694(arg1, arg2, var4, -2);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILsb;II)V", line = 185)
    private final void method1694(int arg0, class190 arg1, int arg2, int arg3) {
        field3424++;
        if (~arg2 == arg3) {
            this.field3429 = arg1.method1317((byte) 114);
        } else if (arg2 == 2) {
            this.field3418 = arg1.method1319(arg3 ^ 0xFFFFFF01);
            this.field3415 = arg1.method1319(255);
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)V", line = 206)
    public static void method1695(int arg0) {
        field3423 = null;
        field3426 = null;
        field3416 = null;
        if (arg0 != 0) {
            method1699(-5, -26, 18);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)Lln;", line = 223)
    public final class118 method1696(byte arg0) {
        class118 var2 = (class118) class116.field1649.method461((byte) 120, (long) this.field3429);
        if (arg0 < 2) {
            return (class118) null;
        }
        field3421++;
        if (var2 != null) {
            return var2;
        }
        class118 var3 = class38.method277(0, this.field3429, -114, class184.field2650);
        if (var3 != null) {
            class116.field1649.method460(var3, -26089, (long) this.field3429);
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V", line = 244)
    public static final void method1697(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class150.method1063(0, arg2, arg4, arg6, -3666, arg0, arg3, arg1, arg5);
        if (arg7 > -85) {
            method1698(25, 87);
        }
        field3428++;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lpj;", line = 256)
    public static final class348 method1698(int arg0, int arg1) {
        field3413++;
        class348 var2 = (class348) class320.field4814.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class244.field3632.method2520(29, arg1, (byte) -25);
        class348 var4 = new class348();
        if (var3 != null) {
            var4.method2442((byte) 125, arg1, new class190(var3));
        }
        class320.field4814.method460(var4, arg0 ^ 0x65E7, (long) arg1);
        if (arg0 != -16) {
            method1698(44, 93);
        }
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)Lbe;", line = 279)
    public static final class95 method1699(int arg0, int arg1, int arg2) {
        field3414++;
        class95 var3 = (class95) class270.field4101.method1405((long) arg2 | (long) arg0 << 32, false);
        if (var3 == null) {
            var3 = new class95(arg0, arg2);
            class270.field4101.method1400(var3.field1656, arg1 ^ 0x9163E91A, var3);
        }
        return arg1 == -1855723168 ? var3 : (class95) null;
    }
}
