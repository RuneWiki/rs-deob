import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class258 extends class472 {

    @OriginalMember(owner = "client!wj", name = "K", descriptor = "[I")
    public static int[] field3686 = new int[32];

    @OriginalMember(owner = "client!wj", name = "W", descriptor = "Z")
    public static boolean field3698 = false;

    @OriginalMember(owner = "client!wj", name = "M", descriptor = "Lwt;")
    private static class194 field3688 = new class194(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!wj", name = "J", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!wj", name = "L", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!wj", name = "N", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!wj", name = "O", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!wj", name = "P", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!wj", name = "Q", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!wj", name = "R", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!wj", name = "S", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!wj", name = "T", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!wj", name = "U", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!wj", name = "V", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!wj", name = "X", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1598(String arg0, int arg1, boolean arg2) {
        ++field3687;
        if (arg0 != null) {
            if (~class136.field1754 <= -101) {
                class98.method597(29315, class391.field5796.method1220(2969, class81.field1122));
            } else {
                String var3 = method1605(arg0, arg1 ^ -1686);
                if (var3 != null) {
                    for (int var4 = 0; ~class136.field1754 < ~var4; ++var4) {
                        String var8 = method1605(class137.field1787[var4], 8);
                        if (var8 != null && var8.equals(var3)) {
                            class98.method597(29315, arg0 + class162.field2102.method1220(2969, class81.field1122));
                            return;
                        }
                        if (class149.field1932[var4] != null) {
                            String var9 = method1605(class149.field1932[var4], arg1 ^ 1689);
                            if (var9 != null && var9.equals(var3)) {
                                class98.method597(29315, arg0 + class162.field2102.method1220(2969, class81.field1122));
                                return;
                            }
                        }
                    }
                    if (arg1 != 1768) {
                        method1606(-20, (Canvas) null);
                    }
                    for (int var5 = 0; ~class296.field4317 < ~var5; ++var5) {
                        String var6 = method1605(class281.field4019[var5], 118);
                        if (var6 != null && var6.equals(var3)) {
                            class98.method597(29315, class124.field1602.method1220(2969, class81.field1122) + arg0 + class500.field7647.method1220(2969, class81.field1122));
                            return;
                        }
                        if (class145.field1885[var5] != null) {
                            String var7 = method1605(class145.field1885[var5], 127);
                            if (var7 != null && var7.equals(var3)) {
                                class98.method597(29315, class124.field1602.method1220(2969, class81.field1122) + arg0 + class500.field7647.method1220(2969, class81.field1122));
                                return;
                            }
                        }
                    }
                    if (method1605(class415.field6145.field4592, 110).equals(var3)) {
                        class98.method597(29315, class54.field841.method1220(2969, class81.field1122));
                    } else {
                        class386.method2321(true, class484.field7007);
                        ++class482.field6943;
                        class79.field1108.method947(-59, 1 + class100.method604((byte) 126, arg0));
                        class79.field1108.method956(true, arg0);
                        class79.field1108.method947(-107, arg2 ? 1 : 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(IIII)I")
    public static final int method1599(int arg0, int arg1, int arg2, int arg3) {
        ++field3690;
        if (arg1 == arg2) {
            return arg1;
        } else {
            int var4 = -arg3 + 128;
            int var5 = (arg1 & arg0) * var4 + (arg2 & 127) * arg3 >> 7;
            int var6 = (arg1 & 896) * var4 - -((896 & arg2) * arg3) >> 7;
            int var7 = (64512 & arg1) * var4 + (arg2 & 64512) * arg3 >> 7;
            return var5 & 127 | var6 & 896 | var7 & 64512;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1600(String arg0, int arg1) {
        ++field3697;
        if (arg0 != null) {
            if ((~class296.field4317 > -101 || class460.field6686) && ~class296.field4317 > -201) {
                String var2 = method1605(arg0, -73);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class296.field4317; ++var3) {
                        String var7 = method1605(class281.field4019[var3], -92);
                        if (var7 != null && var7.equals(var2)) {
                            class98.method597(29315, arg0 + field3688.method1220(2969, class81.field1122));
                            return;
                        }
                        if (class145.field1885[var3] != null) {
                            String var8 = method1605(class145.field1885[var3], -104);
                            if (var8 != null && var8.equals(var2)) {
                                class98.method597(29315, arg0 + field3688.method1220(2969, class81.field1122));
                                return;
                            }
                        }
                    }
                    if (arg1 == -201) {
                        for (int var4 = 0; ~var4 > ~class136.field1754; ++var4) {
                            String var5 = method1605(class137.field1787[var4], -13);
                            if (var5 != null && var5.equals(var2)) {
                                class98.method597(29315, class224.field3171.method1220(2969, class81.field1122) + arg0 + class20.field280.method1220(2969, class81.field1122));
                                return;
                            }
                            if (class149.field1932[var4] != null) {
                                String var6 = method1605(class149.field1932[var4], -75);
                                if (var6 != null && var6.equals(var2)) {
                                    class98.method597(29315, class224.field3171.method1220(2969, class81.field1122) + arg0 + class20.field280.method1220(2969, class81.field1122));
                                    return;
                                }
                            }
                        }
                        if (method1605(class415.field6145.field4592, -7).equals(var2)) {
                            class98.method597(29315, class323.field4723.method1220(2969, class81.field1122));
                        } else {
                            class386.method2321(true, class156.field2039);
                            ++class443.field6470;
                            class79.field1108.method947(-26, class100.method604((byte) 123, arg0));
                            class79.field1108.method956(true, arg0);
                        }
                    }
                }
            } else {
                class98.method597(29315, class112.field1460.method1220(arg1 ^ -2898, class81.field1122));
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(FI)V")
    public final void method1601(float arg0, int arg1) {
        super.field6819 = arg0;
        if (arg1 <= 121) {
            field3686 = null;
        }
        ++field3689;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIII)V")
    public final void method1602(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 125) {
            field3698 = true;
        }
        super.field6832 = arg2;
        ++field3696;
        super.field6824 = arg0;
        super.field6831 = arg3;
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
    public static final void method1603(byte arg0) {
        if (arg0 > -2) {
            method1599(97, 79, 126, 13);
        }
        ++field3685;
        class28.field488.method35((byte) -1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1604(int arg0, String arg1, int arg2) {
        class386.method2321(true, class4.field64);
        if (arg2 != 29094) {
            method1604(-53, (String) null, 107);
        }
        ++field3695;
        ++class411.field6033;
        class79.field1108.method947(-47, class100.method604((byte) 127, arg1) + 1);
        class79.field1108.method989(128, arg0);
        class79.field1108.method956(true, arg1);
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1605(String arg0, int arg1) {
        ++field3694;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg0.length();
            while (~var2 > ~var3 && class275.method1693((byte) 70, arg0.charAt(var2))) {
                ++var2;
            }
            while (var2 < var3 && class275.method1693((byte) 116, arg0.charAt(var3 - 1))) {
                --var3;
            }
            int var4 = var3 - var2;
            if (var4 >= 1 && ~var4 >= -13) {
                int var5 = -75 % ((58 - arg1) / 47);
                StringBuffer var6 = new StringBuffer(var4);
                for (int var7 = var2; ~var3 < ~var7; ++var7) {
                    char var8 = arg0.charAt(var7);
                    if (class67.method467(var8, (byte) -115)) {
                        char var9 = class323.method1941(91, var8);
                        if (var9 != 0) {
                            var6.append(var9);
                        }
                    }
                }
                if (var6.length() == 0) {
                    return null;
                } else {
                    return var6.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)Lsr;")
    public static final class157 method1606(int arg0, Canvas arg1) {
        ++field3693;
        try {
            Class var2 = Class.forName("ck");
            class157 var3 = (class157) var2.newInstance();
            if (arg0 != 1) {
                return null;
            } else {
                var3.method1007(arg1, (byte) 126);
                return var3;
            }
        } catch (Throwable var5) {
            class359 var4 = new class359();
            var4.method1007(arg1, (byte) 67);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "(B)V")
    public static final void method1607(byte arg0) {
        class390.field5787.method2315((byte) -113);
        ++field3692;
        class151.field1952.method2348(false);
        class134.field1710.method2348(false);
        if (arg0 >= -53) {
            field3686 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "(I)V")
    public static void method1608(int arg0) {
        field3686 = null;
        if (arg0 >= 90) {
            field3688 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(IIIIIF)V")
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILeq;II)V")
    public static final void method1609(int arg0, class134 arg1, int arg2, int arg3) {
        if (arg2 == 3) {
            ++field3691;
            class99.field1353 = new class121[arg3][arg0];
            class298.field4343 = arg1;
            if (class14.field219 != null) {
                class442.field6449 = class390.method2349(class14.field219[1], -107, class14.field219[5], class14.field219[0], class14.field219[3], class14.field219[4], class14.field219[2]);
            }
            class335.field4865 = new class121();
            class154.method932(0);
        }
    }
}
