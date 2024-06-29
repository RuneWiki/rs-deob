import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class217 {

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[I")
    public static int[] field3659 = new int[200];

    @OriginalMember(owner = "client!al", name = "k", descriptor = "Z")
    public static volatile boolean field3669 = false;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3670 = "Started 3d Library";

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field3661 = null;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field3672 = 0;

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "I")
    private int field3668;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "Laj;")
    public static class151 field3667;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Lnd;")
    public static class191 field3666;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/StringBuffer;CII)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1546(StringBuffer arg0, char arg1, int arg2, int arg3) {
        if (arg3 != -11340) {
            field3661 = null;
        }
        field3660++;
        int var4 = arg0.length();
        arg0.setLength(arg2);
        for (int var5 = var4; var5 < arg2; var5++) {
            arg0.setCharAt(var5, arg1);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(B)Lbj;")
    public final class92 method1547(byte arg0) {
        class92 var2 = (class92) class245.field4104.method99((long) this.field3668, true);
        field3671++;
        if (var2 != null) {
            return var2;
        }
        class92 var3 = class104.method765(0, this.field3668, (byte) 125, class253.field4288);
        if (var3 != null) {
            class245.field4104.method100((long) this.field3668, var3, 109);
        }
        if (arg0 != -41) {
            field3659 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
    public static final void method1548(boolean arg0, byte arg1) {
        field3673++;
        int var2 = 36 % ((-arg1 - 57) / 50);
        byte var3 = 4;
        byte[][] var4 = class258.field4345;
        for (int var5 = 0; var5 < var3; var5++) {
            class159.method1187(-659813974);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class173.field2778[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = (var8 & 0x3782015) >> 24;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = var8 >> 14 & 0x3FF;
                            int var12 = (var8 & 0x3FFB) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class184.field2947.length; var14++) {
                                if (class184.field2947[var14] == var13 && var4[var14] != null) {
                                    class271.method1913((var12 & 0x7) * 8, var5, (var11 & 0x7) * 8, var4[var14], arg0, class225.field3790, var10, var7 * 8, 45, var6 * 8, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBILab;)V")
    private final void method1549(int arg0, byte arg1, int arg2, class249 arg3) {
        if (arg1 > -65) {
            field3669 = false;
        }
        if (arg0 == 1) {
            this.field3668 = arg3.method1821((byte) 51);
        } else if (arg0 == 2) {
            this.field3662 = arg3.method1802((byte) 92);
            this.field3675 = arg3.method1802((byte) -114);
        }
        field3674++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method1550(int arg0) {
        if (arg0 < 54) {
            field3661 = null;
        }
        field3666 = null;
        field3661 = null;
        field3659 = null;
        field3667 = null;
        field3670 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lvl;")
    public static final class54 method1551(int arg0, int arg1) {
        field3664++;
        class54 var2 = (class54) class49.field837.method99((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1021.method1149(class77.method546(arg1, 123), (byte) 113, class296.method2041((byte) 106, arg1));
        class54 var4 = new class54();
        var4.field923 = arg1;
        if (var3 != null) {
            var4.method336(new class249(var3), (byte) 14);
        }
        var4.method337(-13787);
        if (arg0 != 7) {
            method1546((StringBuffer) null, (char) 65528, 76, -42);
        }
        class49.field837.method100((long) arg1, var4, 89);
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
    public static final void method1552(byte arg0) {
        field3677++;
        class289.field4761 = 0;
        class268.field4456 = 0;
        class287.method2001(3);
        class115.method878(122);
        class70.method486((byte) 94);
        class77.method543(126);
        for (int var1 = 0; var1 < class268.field4456; var1++) {
            int var3 = class185.field2968[var1];
            if (class275.field4598 != class15.field300[var3].field749) {
                if (class15.field300[var3].field2091 > 0) {
                    class124.method936(-59, class15.field300[var3], var3);
                }
                class15.field300[var3] = null;
            }
        }
        if (class150.field2480 != class136.field2239.field4160) {
            throw new RuntimeException("gpp1 pos:" + class136.field2239.field4160 + " psize:" + class150.field2480);
        }
        if (arg0 < 37) {
            method1548(false, (byte) 81);
        }
        for (int var2 = 0; var2 < class154.field2553; var2++) {
            if (class15.field300[class162.field2627[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class154.field2553);
            }
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)Lli;")
    public static final class12 method1553(int arg0, int arg1) {
        field3665++;
        if (arg1 != 31779) {
            return null;
        }
        class12 var2 = (class12) class299.field4876.method99((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class245.field4118.method1149(0, (byte) 95, arg0);
        class12 var4 = new class12();
        if (var3 != null) {
            var4.method69(new class249(var3), (byte) 117);
        }
        var4.method66(-125);
        class299.field4876.method100((long) arg0, var4, 97);
        return var4;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lab;BI)V")
    public final void method1554(class249 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1802((byte) 67);
            if (var4 == 0) {
                if (arg1 != -120) {
                    return;
                }
                field3676++;
                return;
            }
            this.method1549(var4, (byte) -86, arg2, arg0);
        }
    }
}
