import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class190 {

    @OriginalMember(owner = "client!s", name = "f", descriptor = "Lrb;")
    public class183 field3279 = new class183();

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Ldj;")
    public static class44 field3278 = class89.method650(255, "sl_back");

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Ldj;")
    public static class44 field3285 = class89.method650(255, "Untersuchen");

    @OriginalMember(owner = "client!s", name = "h", descriptor = "[S")
    public static short[] field3281 = new short[256];

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public static int field3292 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3274;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "Lrb;")
    private class183 field3293;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "Lve;")
    public static class225 field3289;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lrb;B)V")
    public final void method1185(class183 arg0, byte arg1) {
        if (arg0.field3193 != null) {
            arg0.method1148(arg1 - 13105);
        }
        arg0.field3193 = this.field3279.field3193;
        if (arg1 == -110) {
            field3275++;
            arg0.field3195 = this.field3279;
            arg0.field3193.field3195 = arg0;
            arg0.field3195.field3193 = arg0;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lrb;I)V")
    public final void method1186(class183 arg0, int arg1) {
        if (arg0.field3193 != null) {
            arg0.method1148(-13215);
        }
        field3280++;
        arg0.field3193 = this.field3279;
        if (arg1 <= 106) {
            this.field3293 = null;
        }
        arg0.field3195 = this.field3279.field3195;
        arg0.field3193.field3195 = arg0;
        arg0.field3195.field3193 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)Lrb;")
    public final class183 method1187(byte arg0) {
        field3282++;
        class183 var2 = this.field3279.field3195;
        int var3 = 89 / ((25 - arg0) / 44);
        if (this.field3279 == var2) {
            return null;
        } else {
            var2.method1148(-13215);
            return var2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method1188(int arg0) {
        field3278 = null;
        if (arg0 == 1) {
            field3281 = null;
            field3289 = null;
            field3285 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Lrb;")
    public final class183 method1189(int arg0) {
        field3291++;
        if (arg0 != 0) {
            return null;
        }
        class183 var2 = this.field3279.field3195;
        if (this.field3279 == var2) {
            this.field3293 = null;
            return null;
        } else {
            this.field3293 = var2.field3195;
            return var2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Z)Lrb;")
    public final class183 method1190(boolean arg0) {
        field3286++;
        class183 var2 = this.field3279.field3193;
        if (!arg0) {
            return null;
        } else if (this.field3279 == var2) {
            this.field3293 = null;
            return null;
        } else {
            this.field3293 = var2.field3193;
            return var2;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ldj;ILdj;ILdj;I)V")
    public static final void method1191(class44 arg0, int arg1, class44 arg2, int arg3, class44 arg4, int arg5) {
        field3274++;
        for (int var6 = 99; var6 > 0; var6--) {
            class202.field3606[var6] = class202.field3606[var6 - 1];
            class8.field166[var6] = class8.field166[var6 - 1];
            class115.field2056[var6] = class115.field2056[var6 - 1];
            class105.field1922[var6] = class105.field1922[var6 - 1];
            class71.field1348[var6] = class71.field1348[var6 - 1];
        }
        class8.field166[0] = arg2;
        class115.field2056[0] = arg4;
        class37.field666 = class66.field1251;
        class202.field3606[0] = arg3;
        class139.field2485++;
        class105.field1922[0] = arg0;
        if (arg1 != -29786) {
            field3285 = null;
        }
        class71.field1348[0] = arg5;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)Lrb;")
    public final class183 method1192(byte arg0) {
        field3277++;
        class183 var2 = this.field3293;
        if (this.field3279 == var2) {
            this.field3293 = null;
            return null;
        }
        this.field3293 = var2.field3195;
        if (arg0 >= -76) {
            this.method1187((byte) 80);
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V")
    public final void method1193(byte arg0) {
        if (arg0 != 26) {
            this.field3293 = null;
        }
        field3287++;
        while (true) {
            class183 var2 = this.field3279.field3195;
            if (this.field3279 == var2) {
                return;
            }
            var2.method1148(arg0 - 13241);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)Lrb;")
    public final class183 method1194(int arg0) {
        field3284++;
        class183 var2 = this.field3293;
        if (this.field3279 == var2) {
            this.field3293 = null;
            return null;
        }
        this.field3293 = var2.field3193;
        if (arg0 != 0) {
            this.method1189(124);
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIII)V")
    public static final void method1195(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3276++;
        for (int var6 = arg0; var6 <= arg3; var6++) {
            class42.method290(class108.field1979[var6], -7, arg5, arg2, arg4);
        }
        if (arg1 != -121) {
            field3292 = -16;
        }
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(I)V")
    public static final void method1196(int arg0) {
        class39.field694.method1179((byte) -65);
        field3288++;
        class174.field3016.method676(0);
        class74.field1431.method1179((byte) -92);
        int var1 = 8 / ((arg0 + 12) / 55);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lrb;BLrb;)V")
    public final void method1197(class183 arg0, byte arg1, class183 arg2) {
        if (arg0.field3193 != null) {
            arg0.method1148(-13215);
        }
        int var4 = -115 / ((-arg1 - 13) / 60);
        arg0.field3193 = arg2.field3193;
        field3283++;
        arg0.field3195 = arg2;
        arg0.field3193.field3195 = arg0;
        arg0.field3195.field3193 = arg0;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
    public class190() {
        this.field3279.field3193 = this.field3279;
        this.field3279.field3195 = this.field3279;
    }
}
