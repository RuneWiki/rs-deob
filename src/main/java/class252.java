import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class252 {

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Lga;")
    private class332 field3311;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "Lga;")
    private class332 field3310;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "Z")
    public static boolean field3312 = false;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "Ltt;")
    public static class338 field3306 = new class338(22, 7);

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "Lcga;")
    private class86 field3315;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "[I")
    public static int[] field3305;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public static final String method1529(int arg0, boolean arg1) {
        field3309++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1) {
            method1529(47, true);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class371.field4912.method2141(class422.field5539, true) + " (" + var2 + ")</col>";
        } else if (var2.length() > 6) {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class371.field4914.method2141(class422.field5539, true) + " (" + var2 + ")</col>";
        } else {
            return " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)Lcga;")
    private final class86 method1530(int arg0) {
        if (this.field3315 == null) {
            this.field3315 = new class86();
        }
        if (arg0 != -2353) {
            this.field3310 = null;
        }
        field3308++;
        return this.field3315;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3305 = null;
        int var1 = -119 % ((arg0 + 43) / 32);
        field3306 = null;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(II)I")
    public static final int method1532(int arg0, int arg1) {
        field3307++;
        if (arg0 >= -54) {
            method1532(9, -13);
        }
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIILlt;)V")
    public static final void method1533(int arg0, int arg1, int arg2, class271 arg3) {
        class207 var4 = class549.method3077(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field2765 = arg3;
        int var5 = class446.field5914 == class246.field3214 ? 1 : 0;
        if (arg3.method161(28602)) {
            if (arg3.method168(20071)) {
                class648.field8957[var5][class629.field8709[var5]++] = arg3;
                return;
            }
            class150.field2058[var5][class57.field730[var5]++] = arg3;
            return;
        }
        class100.field1206[var5][class189.field2627[var5]++] = arg3;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Ldba;Z)Lgca;")
    public final class160 method1534(class236 arg0, boolean arg1) {
        field3313++;
        if (arg1) {
            method1531(-2);
        }
        if (arg0 == null) {
            return null;
        }
        class141 var3 = arg0.method421(4);
        if (class165.field2368 == var3) {
            return new class374((class226) arg0);
        } else if (class484.field6729 == var3) {
            return new class589(this.method1530(-2353), (class540) arg0);
        } else if (class545.field7457 == var3) {
            return new class411(this.field3310, (class703) arg0);
        } else if (class104.field1230 == var3) {
            return new class66(this.field3310, (class302) arg0);
        } else if (class98.field1188 == var3) {
            return new class495(this.field3310, this.field3311, (class421) arg0);
        } else if (class692.field9759 == var3) {
            return new class385(this.field3310, this.field3311, (class420) arg0);
        } else if (class315.field4228 == var3) {
            return new class113(this.field3310, this.field3311, (class77) arg0);
        } else if (class632.field8743 == var3) {
            return new class524(this.field3310, this.field3311, (class574) arg0);
        } else if (class300.field3976 == var3) {
            return new class627(this.field3310, (class257) arg0);
        } else if (class360.field4775 == var3) {
            return new class512(this.field3310, this.field3311, (class677) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lga;Lga;)V")
    public class252(class332 arg0, class332 arg1) {
        this.field3311 = arg1;
        this.field3310 = arg0;
    }
}
