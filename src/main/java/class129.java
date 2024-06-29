import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class129 extends class5 {

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lhb;")
    private static class44 field3095 = class102.method810("Please wait )2 attempting to reestablish", -28606);

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "Lhb;")
    public static class44 field3088 = field3095;

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "Lhb;")
    private static class44 field3102 = class102.method810("Loaded config", -28606);

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "Lhb;")
    private static class44 field3099 = class102.method810("Hidden", -28606);

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lhb;")
    public static class44 field3094 = class102.method810(" x", -28606);

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "Lhb;")
    public static class44 field3089 = field3102;

    @OriginalMember(owner = "client!wb", name = "pb", descriptor = "Lhb;")
    public static class44 field3107 = class102.method810("Lade Texturen )2 ", -28606);

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lhb;")
    public static class44 field3090 = field3099;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public static int field3105 = 0;

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "I")
    public static int field3096 = 256;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "B")
    public byte field3086;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public int field3091;

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "Lqd;")
    public class100 field3100;

    @OriginalMember(owner = "client!wb", name = "qb", descriptor = "Ltd;")
    public static class116 field3108;

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "Ll;")
    public static class66 field3106;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 11)
    public static final void method959(byte arg0) {
        class14.field276.method71(94);
        if (arg0 != -89) {
            method963(-60, 11, -68, -77, 20, 37, -65);
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class113.field2785[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class81.field2086[var2] = 0L;
        }
        class81.field2084 = 0;
        field3104++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)V", line = 41)
    public static final void method960(boolean arg0) {
        class74.field1878.method335((byte) -127);
        class77.field1917.method335((byte) 71);
        if (arg0) {
            field3095 = null;
        }
        field3097++;
    }

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "(I)Z", line = 62)
    public static final boolean method961(int arg0) {
        field3092++;
        class98 var1 = class18.field358;
        synchronized (class18.field358) {
            if (class75.field1899 == class4.field110) {
                return false;
            }
            class100.field2535 = class18.field360[class75.field1899];
            if (arg0 != -14) {
                method960(false);
            }
            class31.field771 = class81.field2074[class75.field1899];
            class75.field1899 = class75.field1899 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V", line = 82)
    public static void method962(int arg0) {
        int var1 = -109 % ((44 - arg0) / 50);
        field3090 = null;
        field3094 = null;
        field3099 = null;
        field3102 = null;
        field3095 = null;
        field3107 = null;
        field3108 = null;
        field3088 = null;
        field3106 = null;
        field3089 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V", line = 120)
    public static final void method963(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3101++;
        int var7 = 2048 - arg5 & 0x7FF;
        int var8 = 2048 - arg4 & 0x7FF;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg6;
        if (arg1 != var8) {
            int var12 = class24.field554[var8];
            int var13 = class24.field557[var8];
            int var14 = var10 * var12 - arg6 * var13 >> 16;
            var11 = var10 * var13 + arg6 * var12 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class24.field557[var7];
            int var16 = class24.field554[var7];
            int var17 = var9 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var9 * var15 >> 16;
            var9 = var17;
        }
        class130.field3122 = arg3 - var9;
        class88.field2236 = arg0 - var10;
        class101.field2579 = arg5;
        class51.field1279 = arg2 - var11;
        class95.field2420 = arg4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V", line = 183)
    public static final void method964(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class89.field2279[0].method680(arg3, arg0);
        class89.field2279[1].method680(arg3, arg0 + arg1 - 16);
        field3087++;
        int var6 = (arg1 - 32) * arg1 / arg5;
        if (var6 < 8) {
            var6 = 8;
        }
        class112.method856(arg3, arg0 + 16, 16, arg1 - 32, class31.field772);
        int var7 = (arg1 - var6 - 32) * arg4 / (arg5 - arg1);
        class112.method856(arg3, arg0 + var7 + 16, 16, var6, class44.field1117);
        class112.method850(arg3, arg0 + var7 + 16, var6, class131.field3195);
        class112.method850(arg3 + 1, var7 + 16 + arg0, var6, class131.field3195);
        class112.method860(arg3, arg0 + var7 + 16, 16, class131.field3195);
        class112.method860(arg3, arg0 + var7 + 17, 16, class131.field3195);
        int var8 = -124 % ((arg2 - 3) / 62);
        class112.method850(arg3 + 15, var7 + 16 + arg0, var6, class41.field942);
        class112.method850(arg3 + 14, arg0 + var7 + 17, var6 - 1, class41.field942);
        class112.method860(arg3, var6 + var7 + arg0 + 15, 16, class41.field942);
        class112.method860(arg3 + 1, arg0 - -14 - (-var6 + -var7), 15, class41.field942);
    }
}
