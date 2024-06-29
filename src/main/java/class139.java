import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class139 {

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "Lhj;")
    public static class596 field1729 = new class596(126, 2);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public int field1735;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "Lwb;")
    public static class350 field1734;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "[Lbaa;")
    public class549[] field1732;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(JJ)J", line = 3)
    public static long method1013(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Les;B)V", line = 10)
    public final void method1014(class403 arg0, byte arg1) {
        this.field1736 = arg0.method2358(arg1 - 9);
        field1728++;
        this.field1735 = arg0.method2390((byte) 2);
        if (arg1 != 99) {
            method1016(-15, true, true, 48);
        }
        this.field1732 = new class549[arg0.method2396((byte) -78)];
        class251[] var3 = class449.method2682((byte) 115);
        for (int var4 = 0; var4 < this.field1732.length; var4++) {
            this.field1732[var4] = this.method1015(arg0, var3[arg0.method2396((byte) -94)], 0);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(Les;Llf;I)Lbaa;", line = 44)
    private final class549 method1015(class403 arg0, class251 arg1, int arg2) {
        field1733++;
        if (class66.field895 == arg1) {
            return class450.method2735(arg0, arg2 ^ 0xFFFF937B);
        } else if (class435.field5743 == arg1) {
            return class297.method1737((byte) 1, arg0);
        } else {
            if (arg2 != 0) {
                method1017((byte) -90);
            }
            if (class434.field5732 == arg1) {
                return class86.method795(arg0, arg2 + 186);
            } else if (class491.field6846 == arg1) {
                return class711.method4033(arg0, 126);
            } else if (class354.field4404 == arg1) {
                return class33.method308(20118, arg0);
            } else if (class308.field3823 == arg1) {
                return class88.method805(93, arg0);
            } else if (class535.field7537 == arg1) {
                return class202.method1303((byte) -83, arg0);
            } else if (class198.field2358 == arg1) {
                return class760.method4226(arg0, -20148);
            } else if (class215.field2537 == arg1) {
                return class782.method4332(7, arg0);
            } else if (class179.field2196 == arg1) {
                return class494.method2912(true, arg0);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IZZI)I", line = 88)
    public static final int method1016(int arg0, boolean arg1, boolean arg2, int arg3) {
        field1731++;
        if (arg2) {
            field1734 = null;
        }
        class430 var4 = class105.method861(arg3, Integer.MIN_VALUE, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field5667.length; var6++) {
                if (var4.field5670[var6] == arg0) {
                    var5 += var4.field5667[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V", line = 122)
    public static void method1017(byte arg0) {
        field1734 = null;
        field1729 = null;
        if (arg0 != 13) {
            method1018(true, 82L);
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 135)
    public static final String method1018(boolean arg0, long arg1) {
        class255.field2976.setTime(new Date(arg1));
        field1730++;
        int var3 = class255.field2976.get(7);
        int var4 = class255.field2976.get(5);
        int var5 = class255.field2976.get(2);
        int var6 = class255.field2976.get(1);
        if (arg0) {
            field1734 = null;
        }
        int var7 = class255.field2976.get(11);
        int var8 = class255.field2976.get(12);
        int var9 = class255.field2976.get(13);
        return class189.field2277[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class22.field352[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }
}
