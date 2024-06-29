import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class487 extends class26 {

    @OriginalMember(owner = "client!hg", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field7116;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "[Ljava/lang/String;")
    public static String[] field7121 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "[I")
    public static int[] field7115 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field7117;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field7118;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "I")
    public static int field7119;

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method2864(String arg0, int arg1) {
        field7118++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class336.field4605; var2++) {
            if (arg0.equalsIgnoreCase(class174.field2491[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class467.field6804[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(B)Z")
    public final boolean method188(byte arg0) {
        if (arg0 != 48) {
            this.field7116 = null;
        }
        field7117++;
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "(I)V")
    public static void method2865(int arg0) {
        field7121 = null;
        if (arg0 != 2) {
            field7115 = null;
        }
        field7115 = null;
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)Ljava/lang/Object;")
    public final Object method189(int arg0) {
        field7119++;
        if (arg0 != 2048) {
            this.method189(-123);
        }
        return this.field7116;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lcg;Ljava/lang/Object;I)V")
    public class487(class90 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field7116 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZZIII)V")
    public static final void method2866(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7120++;
        if (!arg1 && class446.field6464 == arg3 && class297.field4107 == arg4 && class400.field5571 == class304.field4173 || class437.field6374.method560((byte) 115, class278.field3761)) {
            return;
        }
        class297.field4107 = arg4;
        class446.field6464 = arg3;
        class304.field4173 = class400.field5571;
        if (class437.field6374.method560((byte) 115, class278.field3761)) {
            class304.field4173 = 0;
        }
        if (arg0) {
            class26.method186(28, 8);
        } else {
            class26.method186(25, 8);
        }
        class186.method1119(class117.field1579, class272.field3708.method590(class105.field1434, -22602), 0, true);
        int var5 = class215.field3059;
        class215.field3059 = (class446.field6464 - (class442.field6435 >> 4)) * 8;
        int var6 = class79.field1134;
        class79.field1134 = (class297.field4107 - (class232.field3217 >> 4)) * 8;
        class14.field170 = class481.method2831(class446.field6464 * 8, class297.field4107 * 8);
        class13.field161 = null;
        int var7 = class215.field3059 - var5;
        int var8 = class79.field1134 - var6;
        if (arg0) {
            class166.field2352 = 0;
            int var9 = class442.field6435 * 128 - 128;
            int var10 = (class232.field3217 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class405 var12 = class179.field2534[var11];
                if (var12 != null) {
                    var12.field466 -= var7 * 128;
                    var12.field461 -= var8 * 128;
                    if (var12.field466 >= 0 && var9 >= var12.field466 && var12.field461 >= 0 && var10 >= var12.field461) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field372[var14] -= var7;
                            var12.field362[var14] -= var8;
                            if (var12.field372[var14] < 0 || class442.field6435 <= var12.field372[var14] || var12.field362[var14] < 0 || var12.field362[var14] >= class232.field3217) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class54.field750[class166.field2352++] = var11;
                        } else {
                            class179.field2534[var11].method2343(null, -121);
                            class179.field2534[var11] = null;
                        }
                    } else {
                        class179.field2534[var11].method2343(null, -122);
                        class179.field2534[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class405 var23 = class179.field2534[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field372[var24] -= var7;
                        var23.field362[var24] -= var8;
                    }
                    var23.field466 -= var7 * 128;
                    var23.field461 -= var8 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class192 var21 = class309.field4234[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field372[var22] -= var7;
                    var21.field362[var22] -= var8;
                }
                var21.field466 -= var7 * 128;
                var21.field461 -= var8 * 128;
            }
        }
        class473[] var17 = class324.field4457;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class473 var20 = var17[var18];
            if (var20 != null) {
                var20.field6912 -= var8 * 128;
                var20.field6908 -= var7 * 128;
            }
        }
        class138.method901((byte) 76, var7, var8);
        for (class64 var19 = (class64) class114.field1552.method3072((byte) 102); var19 != null; var19 = (class64) class114.field1552.method3066(2)) {
            var19.field885 -= var7;
            var19.field884 -= var8;
            if (class65.field897 != 3 && (var19.field885 < 0 || var19.field884 < 0 || var19.field885 >= class442.field6435 || class232.field3217 <= var19.field884)) {
                var19.method2946(-128);
            }
        }
        if (class285.field3824 != 0) {
            class473.field6909 -= var8;
            class285.field3824 -= var7;
        }
        class65.method407((byte) -1);
        if (arg0) {
            class310.field4240 -= var8 * 128;
            class350.field4790 -= var7;
            class34.field485 -= var8;
            class133.field1934 -= var8;
            class132.field1901 -= var7 * 128;
            class412.field6044 -= var7;
            if (Math.abs(var7) > class442.field6435 || Math.abs(var8) > class232.field3217) {
                class348.method1929((byte) -14);
            }
        } else if (class128.field1742 == 4) {
            class254.field3530 -= var7 * 128;
            class127.field1740 -= var7 * 128;
            class67.field934 -= var8 * 128;
            class509.field7470 -= var8 * 128;
        } else {
            class128.field1742 = 1;
        }
        class498.method2938(arg2 - 141);
        if (arg2 != 28) {
            return;
        }
        class499.method2942(-1);
        class36.field504.method3076((byte) -89);
        class223.field3129.method3076((byte) -89);
        class384.field5402.method2301(false);
        class17.method136(0);
    }

    static {
        new class83("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
