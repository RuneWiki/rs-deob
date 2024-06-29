import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class234 extends class86 {

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public int field3946;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "Lbe;")
    public static class283 field3941 = class153.method941(27, "hint_mapmarkers");

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "Lek;")
    public static class172 field3945;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZ)V", line = 7)
    public static final void method1572(byte arg0, boolean arg1) {
        field3943++;
        if (arg0 <= 108) {
            field3941 = (class283) null;
        }
        for (int var2 = 0; var2 < class242.field4078; var2++) {
            class60 var3 = class33.field493[class219.field3698[var2]];
            long var4 = (long) class219.field3698[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method395(true) && var3.field822.field2181 == arg1 && var3.field822.method803((byte) -86)) {
                int var6 = var3.field1210 >> 7;
                int var7 = var3.field1193 >> 7;
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.method460((byte) 118) == 1 && (var3.field1193 & 0x7F) == 64 && (var3.field1210 & 0x7F) == 64) {
                        if (class34.field510[var7][var6] == class309.field5285) {
                            continue;
                        }
                        class34.field510[var7][var6] = class309.field5285;
                    }
                    if (!var3.field822.field2199) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field1180 = class42.method254(class61.field850, var3.field1210, var3.field1193, -20341);
                    class81.method532(class61.field850, var3.field1193, var3.field1210, var3.field1180, var3.method460((byte) -57) * 64 + 60 - 64, var3, var3.field1160, var4, var3.field1176);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 69)
    public static void method1573(int arg0) {
        field3941 = null;
        field3945 = null;
        if (arg0 != -14416) {
            field3945 = (class172) null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V", line = 86)
    public static final void method1574(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class183 var5 = (class183) class58.field797.method1812((byte) -84); var5 != null; var5 = (class183) class58.field797.method1813((byte) 85)) {
            class141.method887(arg3, (byte) 122, arg0, var5, arg4, arg2);
        }
        int var6 = 63 % ((-arg1 - 80) / 39);
        for (class183 var7 = (class183) class259.field4397.method1812((byte) -84); var7 != null; var7 = (class183) class259.field4397.method1813((byte) 46)) {
            byte var8 = 1;
            if (var7.field3153.field1219 == var7.field3153.field1203) {
                var8 = 0;
            } else if (var7.field3153.field1219 == var7.field3153.field1187) {
                var8 = 2;
            }
            if (var7.field3147 != var8) {
                int var9 = class252.method1714(0, var7.field3153);
                if (var7.field3140 != var9) {
                    if (var7.field3155 != null) {
                        class301.field5089.method1275(var7.field3155);
                        var7.field3155 = null;
                    }
                    var7.field3140 = var9;
                }
                var7.field3147 = var8;
            }
            var7.field3138 = var7.field3153.field1193;
            var7.field3133 = var7.field3153.field1193 + var7.field3153.method460((byte) 7) * 64;
            var7.field3149 = var7.field3153.field1210;
            var7.field3152 = var7.field3153.field1210 + var7.field3153.method460((byte) -77) * 64;
            class141.method887(arg3, (byte) 125, arg0, var7, arg4, arg2);
        }
        for (class183 var10 = (class183) class172.field2899.method1607(0); var10 != null; var10 = (class183) class172.field2899.method1604((byte) -40)) {
            byte var11 = 1;
            if (var10.field3137.field1219 == var10.field3137.field1203) {
                var11 = 0;
            } else if (var10.field3137.field1219 == var10.field3137.field1187) {
                var11 = 2;
            }
            if (var10.field3147 != var11) {
                int var12 = class267.method1800(var10.field3137, (byte) 62);
                if (var10.field3140 != var12) {
                    if (var10.field3155 != null) {
                        class301.field5089.method1275(var10.field3155);
                        var10.field3155 = null;
                    }
                    var10.field3140 = var12;
                }
                var10.field3147 = var11;
            }
            var10.field3138 = var10.field3137.field1193;
            var10.field3133 = var10.field3137.field1193 + var10.field3137.method460((byte) 13) * 64;
            var10.field3149 = var10.field3137.field1210;
            var10.field3152 = var10.field3137.field1210 + (var10.field3137.method460((byte) 117) * 64);
            class141.method887(arg3, (byte) 122, arg0, var10, arg4, arg2);
        }
        field3942++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Z", line = 185)
    public final boolean method1575(byte arg0, int arg1, int arg2) {
        if (arg0 < 113) {
            this.field3940 = -35;
        }
        field3938++;
        return arg2 >= this.field3944 && this.field3946 >= arg2 && this.field3940 <= arg1 && this.field3939 >= arg1;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIII)V", line = 199)
    public class234(int arg0, int arg1, int arg2, int arg3) {
        this.field3946 = arg2;
        this.field3939 = arg3;
        this.field3944 = arg0;
        this.field3940 = arg1;
    }
}
