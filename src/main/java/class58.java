import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class58 extends class87 {

    @OriginalMember(owner = "client!ib", name = "Tc", descriptor = "I")
    public static int field1175 = 0;

    @OriginalMember(owner = "client!ib", name = "Pc", descriptor = "Lqf;")
    private static class117 field1171 = class72.method514(117, "wave2:");

    @OriginalMember(owner = "client!ib", name = "Yc", descriptor = "Lqf;")
    public static class117 field1180 = field1171;

    @OriginalMember(owner = "client!ib", name = "ad", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!ib", name = "Xc", descriptor = "Lqf;")
    public static class117 field1179 = field1171;

    @OriginalMember(owner = "client!ib", name = "Uc", descriptor = "Leb;")
    public static class31 field1176 = new class31(500);

    @OriginalMember(owner = "client!ib", name = "gd", descriptor = "Lqf;")
    public static class117 field1188 = class72.method514(100, ")4l");

    @OriginalMember(owner = "client!ib", name = "ed", descriptor = "Lqf;")
    private static class117 field1186 = class72.method514(107, "Enter object name");

    @OriginalMember(owner = "client!ib", name = "fd", descriptor = "Lqf;")
    public static class117 field1187 = class72.method514(123, "Konfig geladen)3");

    @OriginalMember(owner = "client!ib", name = "bd", descriptor = "Lqf;")
    public static class117 field1183 = field1186;

    @OriginalMember(owner = "client!ib", name = "kd", descriptor = "Lqf;")
    private static class117 field1192 = class72.method514(125, "wave:");

    @OriginalMember(owner = "client!ib", name = "cd", descriptor = "Lqf;")
    public static class117 field1184 = class72.method514(106, "null");

    @OriginalMember(owner = "client!ib", name = "dd", descriptor = "Lqf;")
    public static class117 field1185 = field1192;

    @OriginalMember(owner = "client!ib", name = "ld", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!ib", name = "md", descriptor = "Lqf;")
    public static class117 field1194 = class72.method514(123, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!ib", name = "id", descriptor = "Lqf;")
    public static class117 field1190 = field1192;

    @OriginalMember(owner = "client!ib", name = "Rc", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!ib", name = "Vc", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ib", name = "Wc", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ib", name = "Zc", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!ib", name = "hd", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ib", name = "jd", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ib", name = "Qc", descriptor = "Ltc;")
    public class134 field1172;

    @OriginalMember(owner = "client!ib", name = "Sc", descriptor = "[[B")
    public static byte[][] field1174;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "(I)V")
    public static void method414(int arg0) {
        field1176 = null;
        field1188 = null;
        field1192 = null;
        field1174 = null;
        field1180 = null;
        field1187 = null;
        field1185 = null;
        field1186 = null;
        field1190 = null;
        if (arg0 >= -20) {
            field1194 = null;
        }
        field1179 = null;
        field1171 = null;
        field1194 = null;
        field1183 = null;
        field1184 = null;
    }

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "(I)Lea;")
    public final class30 method7(int arg0) {
        ++field1181;
        if (this.field1172 == null) {
            return null;
        } else {
            class96 var2 = ~super.field2017 != 0 && super.field1994 == 0 ? class130.method1013(super.field2017, arg0 ^ 7023) : null;
            class96 var3 = super.field1949 == -1 || ~super.field2019 == ~super.field1949 && var2 != null ? null : class130.method1013(super.field1949, -88);
            class30 var4 = this.field1172.method1035(var2, var3, 0, super.field1948, super.field1952);
            if (var4 == null) {
                return null;
            } else if (arg0 != -6941) {
                return null;
            } else {
                var4.method232();
                super.field1962 = var4.field708;
                if (~super.field2014 != 0 && ~super.field1961 != 0) {
                    class30 var5 = class126.method994((byte) 51, super.field2014).method423(super.field1961, false);
                    if (var5 != null) {
                        var5.method235(0, -super.field1981, 0);
                        class30[] var6 = new class30[] { var4, var5 };
                        var4 = new class30(var6, 2);
                    }
                }
                if (this.field1172.field3199 == 1) {
                    var4.field600 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "(I)V")
    public static final void method415(int arg0) {
        ++field1173;
        int var1 = -5 % ((arg0 - 6) / 38);
        int var2 = class147.field3595;
        int var3 = class140.field3341;
        int var4 = class55.field1142;
        int var5 = class87.field1987;
        int var6 = 6116423;
        class49.method360(var2, var3, var4, var5, var6);
        class49.method360(var2 + 1, var3 + 1, var4 - 2, 16, 0);
        class49.method351(var2 - -1, var3 + 18, var4 - 2, var5 - 19, 0);
        class144.field3554.method330(class139.field3295, var2 + 3, var3 + 14, var6, -1);
        int var7 = class18.field274;
        int var8 = class143.field3504;
        if (class24.field468 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (class24.field468 == 1) {
            var7 -= 205;
            var8 -= 553;
        }
        if (class24.field468 == 2) {
            var7 -= 357;
            var8 -= 17;
        }
        for (int var9 = 0; var9 < class27.field531; ++var9) {
            int var10 = 16777215;
            int var11 = (class27.field531 - 1 + -var9) * 15 + var3 + 31;
            if (~var2 > ~var8 && var8 < var2 + var4 && ~var7 < ~(var11 + -13) && ~var7 > ~(var11 + 3)) {
                var10 = 16776960;
            }
            class144.field3554.method330(class82.field1884[var9], var2 - -3, var11, var10, 0);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)Z")
    public final boolean method162(boolean arg0) {
        if (!arg0) {
            field1194 = null;
        }
        ++field1177;
        return this.field1172 != null;
    }
}
