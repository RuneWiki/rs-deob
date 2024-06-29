import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class60 {

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "Lhi;")
    public static class82 field925 = class95.method664((byte) -80, "M-Bmoire en cours d(Wattribution");

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field943 = 0;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field931 = 0;

    @OriginalMember(owner = "client!wh", name = "z", descriptor = "Lam;")
    public static class277 field947 = new class277();

    @OriginalMember(owner = "client!wh", name = "C", descriptor = "Lhi;")
    private static class82 field950 = class95.method664((byte) -27, "Loaded world list data");

    @OriginalMember(owner = "client!wh", name = "F", descriptor = "I")
    public static int field953 = 0;

    @OriginalMember(owner = "client!wh", name = "D", descriptor = "Lhi;")
    public static class82 field951 = class95.method664((byte) -93, "T");

    @OriginalMember(owner = "client!wh", name = "E", descriptor = "Lhi;")
    public static class82 field952 = field950;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    public int field924;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field932;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public int field934;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field935;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field936;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field938;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public int field941;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!wh", name = "w", descriptor = "I")
    public int field944;

    @OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!wh", name = "y", descriptor = "I")
    public int field946;

    @OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
    public int field948;

    @OriginalMember(owner = "client!wh", name = "B", descriptor = "[Ljf;")
    public static class86[] field949;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V", line = 14)
    public static final void method394(int arg0, int arg1) {
        field940++;
        if (class211.field3704 == arg0 && arg0 != 0) {
            class115 var2 = class112.field2018[arg0];
            var2.method66(class290.field4877);
        }
        if (arg1 != -1) {
            field952 = (class82) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILum;B)[Lti;", line = 45)
    public static final class186[] method395(int arg0, int arg1, class222 arg2, byte arg3) {
        field929++;
        if (arg3 == -10) {
            return client.method866(arg1, arg0, (byte) 49, arg2) ? class37.method292((byte) 22) : null;
        } else {
            return (class186[]) null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lti;I)V", line = 60)
    public static final void method396(class186 arg0, int arg1) {
        field933++;
        short var2 = 256;
        for (int var3 = 0; var3 < class150.field2561.length; var3++) {
            class150.field2561[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var5 = (int) ((double) var2 * Math.random() * 128.0D);
            class150.field2561[var5] = (int) (Math.random() * 284.0D);
        }
        if (arg1 <= 13) {
            field925 = (class82) null;
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var7 = 1; var7 < var2 - 1; var7++) {
                for (int var8 = 1; var8 < 127; var8++) {
                    int var9 = var8 + (var7 << 7);
                    class203.field3523[var9] = (class150.field2561[var9 + 1] + class150.field2561[var9 - 1] + class150.field2561[var9 + -128] + class150.field2561[var9 - -128]) / 4;
                }
            }
            int[] var10 = class150.field2561;
            class150.field2561 = class203.field3523;
            class203.field3523 = var10;
        }
        if (arg0 == null) {
            return;
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0.field3718; var12++) {
            for (int var13 = 0; var13 < arg0.field3711; var13++) {
                if (arg0.field3139[var11++] != 0) {
                    int var14 = var13 + arg0.field3720 + 16;
                    int var15 = var12 + arg0.field3709 + 16;
                    int var16 = (var15 << 7) + var14;
                    class150.field2561[var16] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)V", line = 161)
    public static final void method397(int arg0, int arg1) {
        class227 var2 = class215.method1531(-1, 4, arg0);
        var2.method1624((byte) -101);
        if (arg1 != 14704) {
            field953 = -78;
        }
        field927++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 189)
    public static void method398(int arg0) {
        field952 = null;
        field925 = null;
        field947 = null;
        field949 = null;
        field951 = null;
        if (arg0 == 1) {
            field950 = null;
        }
    }
}
