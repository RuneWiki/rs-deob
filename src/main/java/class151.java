import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class151 {

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public int field3326 = -1;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lpe;")
    private static class109 field3320 = class141.method1120("RuneScape has been updated(Q", 0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Lpe;")
    private static class109 field3315 = class141.method1120("Loaded interfaces", 0);

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "Lpe;")
    public static class109 field3323 = field3320;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lpe;")
    private static class109 field3325 = class141.method1120(" is already on your ignore list", 0);

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "Lpe;")
    public static class109 field3329 = class141.method1120(" steht bereits auf Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Lpe;")
    public static class109 field3331 = class141.method1120(")4lang)4de", 0);

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Lpe;")
    public static class109 field3333 = class141.method1120("null", 0);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Lpe;")
    public static class109 field3316 = field3315;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "Lpe;")
    public static class109 field3335 = field3325;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "J")
    public static long field3317;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Lwc;")
    public class156 field3318;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "Lwf;")
    public static class159 field3319;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
    public int[] field3330;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[Lpe;")
    public class109[] field3332;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static final void method1171(byte arg0) {
        class124.field2737.method92((byte) 105);
        if (arg0 > -21) {
            field3331 = null;
        }
        field3328++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method1172(int arg0) {
        field3333 = null;
        field3331 = null;
        field3325 = null;
        field3335 = null;
        field3319 = null;
        field3316 = null;
        field3320 = null;
        if (arg0 != 255) {
            method1175(null, null, 62, (byte) -24);
        }
        field3323 = null;
        field3315 = null;
        field3329 = null;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)I")
    public static final int method1173(int arg0) {
        field3322++;
        if (arg0 != 0) {
            field3333 = null;
        }
        return class46.field972++;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Le;")
    public static final class29 method1174(int arg0) {
        field3324++;
        class29 var1 = new class29();
        var1.field663 = class57.field1142[0];
        var1.field664 = class120.field2668[0];
        int var2 = var1.field664 * var1.field663;
        var1.field659 = new int[var2];
        var1.field665 = class61.field1225;
        byte[] var3 = class92.field1970[0];
        var1.field661 = class107.field2246[0];
        var1.field660 = class152.field3342[0];
        var1.field662 = client.field519;
        if (arg0 != 4930) {
            field3316 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var1.field659[var4] = class131.field2879[class4.method34(var3[var4], 255)];
        }
        class46.method413(-18078);
        return var1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lre;Lfb;IB)V")
    public static final void method1175(class123 arg0, class38 arg1, int arg2, byte arg3) {
        field3321++;
        if (arg3 > -68) {
            method1173(-93);
        }
        byte[] var4 = null;
        class19 var5 = class11.field244;
        synchronized (class11.field244) {
            for (class134 var6 = (class134) class11.field244.method195((byte) 123); var6 != null; var6 = (class134) class11.field244.method198((byte) -119)) {
                if ((long) arg2 == var6.field267 && var6.field2925 == arg1 && var6.field2915 == 0) {
                    var4 = var6.field2923;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg1.method367(arg2, -1119134904);
            arg0.method998(arg2, var7, (byte) 38, true, arg1);
        } else {
            arg0.method998(arg2, var4, (byte) -72, true, arg1);
        }
    }
}
