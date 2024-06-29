import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class667 implements class230 {

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "I")
    public static int field9050;

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "I")
    public static int field9051;

    @OriginalMember(owner = "client!lga", name = "e", descriptor = "I")
    public static int field9053;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "Lpfa;")
    public static class275 field9049;

    @OriginalMember(owner = "client!lga", name = "d", descriptor = "Lip;")
    public static class662 field9052;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lwv;B)I", line = 3)
    public static final int method3708(class32 arg0, byte arg1) {
        field9053++;
        if (arg1 != 87) {
            method3709(86, 68, 105, 47);
        }
        if (arg0.field480 == 0) {
            return 0;
        }
        if (arg0.field491 != -1) {
            class32 var2 = null;
            if (arg0.field491 < 32768) {
                class704 var3 = (class704) class168.field1973.method3828((long) arg0.field491, (byte) -91);
                if (var3 != null) {
                    var2 = var3.field9854;
                }
            } else if (arg0.field491 >= 32768) {
                var2 = class132.field1601[arg0.field491 - 32768];
            }
            if (var2 != null) {
                int var4 = arg0.field8018 - var2.field8018;
                int var5 = arg0.field8011 - var2.field8011;
                if (var4 != 0 || var5 != 0) {
                    arg0.method228(124, (int) (Math.atan2((double) var4, (double) var5) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if (arg0 instanceof class365) {
            class365 var6 = (class365) arg0;
            if (var6.field4713 != -1 && (var6.field503 == 0 || var6.field509 > 0)) {
                var6.method228(122, var6.field4713);
                var6.field4713 = -1;
            }
        } else if (arg0 instanceof class506) {
            class506 var7 = (class506) arg0;
            if (var7.field6329 != -1 && (var7.field503 == 0 || var7.field509 > 0)) {
                int var8 = var7.field8018 - ((var7.field6329 - class227.field2938 - class227.field2938) * 256);
                int var9 = var7.field8011 - (var7.field6324 - class522.field6612 - class522.field6612) * 256;
                if (var8 != 0 || var9 != 0) {
                    var7.method228(arg1 ^ 0x29, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field6329 = -1;
            }
        }
        return arg0.method227(true);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IJ[ILvf;)Ljava/lang/String;", line = 82)
    public final String method1396(int arg0, long arg1, int[] arg2, class141 arg3) {
        field9050++;
        if (class485.field6029 == arg3) {
            class250 var6 = class156.field1837.method3592(false, arg2[0]);
            return var6.method1502(18932, (int) arg1);
        } else if (class226.field2915 == arg3 || class398.field5049 == arg3) {
            class68 var8 = class504.field6287.method1628((int) arg1, (byte) -108);
            return var8.field879;
        } else {
            int var7 = -53 % ((-arg0 - 2) / 46);
            return class612.field8320 == arg3 || class636.field8616 == arg3 || class65.field789 == arg3 ? class156.field1837.method3592(false, arg2[0]).method1502(18932, (int) arg1) : null;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII)V", line = 117)
    public static final void method3709(int arg0, int arg1, int arg2, int arg3) {
        field9051++;
        String var4 = "tele " + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & arg0) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class288.method1730(true, false, var4, false);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)V", line = 128)
    public static void method3710(boolean arg0) {
        field9049 = null;
        if (arg0) {
            field9052 = null;
        }
    }
}
