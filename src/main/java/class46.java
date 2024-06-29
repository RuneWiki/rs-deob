import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class124 {

    @OriginalMember(owner = "client!gd", name = "S", descriptor = "[I")
    public static int[] field1107 = new int[99];

    @OriginalMember(owner = "client!gd", name = "W", descriptor = "Lr;")
    private static class118 field1111 = class153.method1136(127, "Loaded input handler");

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lr;")
    public static class118 field1114 = field1111;

    @OriginalMember(owner = "client!gd", name = "Q", descriptor = "I")
    public static int field1105 = -1;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lr;")
    public static class118 field1116 = class153.method1136(91, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "Lr;")
    private static class118 field1117;

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "Lr;")
    public static class118 field1120;

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lr;")
    public static class118 field1121;

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Lr;")
    private static class118 field1118;

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "Lr;")
    public static class118 field1119;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!gd", name = "P", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!gd", name = "R", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!gd", name = "T", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!gd", name = "U", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!gd", name = "V", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!gd", name = "X", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "I")
    public int field1115;

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Ljf;")
    public static class68 field1113;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public static void method383(int arg0) {
        field1111 = null;
        field1120 = null;
        field1114 = null;
        field1117 = null;
        field1113 = null;
        field1121 = null;
        field1116 = null;
        field1118 = null;
        int var1 = 106 % ((arg0 - 15) / 42);
        field1107 = null;
        field1119 = null;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lke;I)I")
    public static final int method384(class74 arg0, int arg1) {
        field1110++;
        class15 var2 = (class15) class112.field2622.method297(((long) arg0.field1703 << 32) + (long) arg0.field1764, -1);
        if (var2 == null) {
            return arg1 == 0 ? arg0.field1769 : 85;
        } else {
            return var2.field386;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
    public static final void method385(boolean arg0) {
        if (arg0) {
            method386(25, 32, -113, 19);
        }
        field1112++;
        class64.field1464 = new class35(32);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I")
    public static final int method386(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -15186) {
            return -64;
        }
        field1104++;
        int var4 = arg2 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class33.field830[1][var4][var5] & 0x2) == 2) {
            var6 = arg1 + 1;
        }
        int var7 = arg2 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class72.field1668[var6][var4][var5] + class72.field1668[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class72.field1668[var6][var4][var5 - -1] + class72.field1668[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BLpa;)V")
    public final void method387(byte arg0, class105 arg1) {
        while (true) {
            int var3 = arg1.method831((byte) 76);
            if (var3 == 0) {
                if (arg0 > -82) {
                    this.method388(null, 72, 44);
                }
                field1108++;
                return;
            }
            this.method388(arg1, var3, -1);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lpa;II)V")
    private final void method388(class105 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method386(-7, -126, 85, -45);
        }
        field1109++;
        if (arg1 == 1) {
            this.field1103 = arg0.method838((byte) 5);
            this.field1106 = arg0.method831((byte) 76);
            this.field1115 = arg0.method831((byte) 76);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1107[var1] = var0 / 4;
        }
        field1117 = class153.method1136(86, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");
        field1120 = class153.method1136(97, "Lade Texturen )2 ");
        field1121 = field1117;
        field1118 = class153.method1136(109, "Press (Wrecover a locked account(W on front page)3");
        field1119 = field1118;
    }
}
