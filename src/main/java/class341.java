import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class341 extends class42 {

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public int field5039;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public int field5035;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Z")
    public boolean field5042;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "J")
    public long field5037;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "Ljava/lang/String;")
    public String field5038;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "Ljava/lang/String;")
    public String field5045;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "Z")
    public boolean field5041;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "Lbd;")
    public static class44 field5034 = new class44("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "[I")
    public static int[] field5043;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIII)V")
    public static final void method2158(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class303.field4495 != null) {
            class303.field4495[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class539.field7922 != null) {
            class539.field7922[arg0][arg1] = (short) arg3;
        }
        if (class18.field198 != null) {
            class18.field198[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)Z")
    public static final boolean method2159(boolean arg0) {
        field5044++;
        try {
            if (arg0) {
                return false;
            }
            if (class92.field1478 == 2) {
                if (class338.field5011 == null) {
                    class338.field5011 = class381.method2313(class479.field6987, class18.field201, class431.field6188);
                    if (class338.field5011 == null) {
                        return false;
                    }
                }
                if (class284.field4223 == null) {
                    class284.field4223 = new class234(class80.field1307, class100.field1557);
                }
                if (class336.field4972.method1464(22050, class338.field5011, 120, class284.field4223, class287.field4260)) {
                    class336.field4972.method1459(-16257);
                    class336.field4972.method1472(104, class414.field5863);
                    class336.field4972.method1460(false, class338.field5011, class133.field2069);
                    class284.field4223 = null;
                    class338.field5011 = null;
                    class92.field1478 = 0;
                    class479.field6987 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class336.field4972.method1447(!arg0);
            class284.field4223 = null;
            class479.field6987 = null;
            class338.field5011 = null;
            class92.field1478 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method2160(int arg0, String arg1, int arg2) {
        field5033++;
        int var3 = class452.field6603;
        int[] var4 = class532.field7853;
        boolean var5 = false;
        for (int var6 = arg0; var6 < var3; var6++) {
            class510 var7 = class494.field7143[var4[var6]];
            if (var7 != null && class364.field5293 != var7 && var7.field7363 != null && var7.field7363.equalsIgnoreCase(arg1)) {
                if (arg2 == 1) {
                    class228.method1528(true, class313.field4669);
                    class448.field6439++;
                    class276.field4124.method3016(var4[var6], -31);
                    class276.field4124.method3048(-2034159384, 0);
                } else if (arg2 == 4) {
                    class228.method1528(true, class360.field5243);
                    class49.field913++;
                    class276.field4124.method3045(3, var4[var6]);
                    class276.field4124.method3023((byte) 27, 0);
                } else if (arg2 == 5) {
                    class228.method1528(true, class196.field2857);
                    class359.field5220++;
                    class276.field4124.method3029(-111, var4[var6]);
                    class276.field4124.method3037(0, (byte) 97);
                } else if (arg2 == 6) {
                    class128.field1996++;
                    class228.method1528(true, class251.field3736);
                    class276.field4124.method3016(var4[var6], -114);
                    class276.field4124.method3023((byte) 87, 0);
                } else if (arg2 == 7) {
                    class230.field3449++;
                    class228.method1528(true, class220.field3369);
                    class276.field4124.method3039(-113, 0);
                    class276.field4124.method3045(3, var4[var6]);
                }
                var5 = true;
                break;
            }
        }
        if (!var5) {
            class171.method1208((byte) -102, class412.field5831.method426(class503.field7255, 54) + arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
    public static void method2161(byte arg0) {
        if (arg0 != -11) {
            method2161((byte) -88);
        }
        field5043 = null;
        field5034 = null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class341(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field5039 = arg3;
        this.field5036 = arg2;
        this.field5035 = arg4;
        this.field5042 = arg9;
        this.field5037 = arg5;
        this.field5038 = arg1;
        this.field5045 = arg0;
        this.field5041 = arg8;
        this.field5046 = arg7;
        this.field5040 = arg6;
    }
}
