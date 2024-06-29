import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class260 {

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    private int field1092 = -32768;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Laf;")
    public static class68 field1086 = new class68(64);

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1094 = 1;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field1095 = 0;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "Lqh;")
    public static class201 field1093;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "[[[Lwi;")
    public static class134[][][] field1083;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIJILlb;)V")
    public final void method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class130 arg10) {
        field1089++;
        class80 var13 = class83.method595(this.field1085, -102).method88((byte) -117, (class181) null, 0, 0, this.field1088, -1);
        if (var13 != null) {
            var13.method117(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1092 = var13.method119();
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZLwa;)V")
    public static final void method461(int arg0, boolean arg1, class258 arg2) {
        field1084++;
        int var3 = arg2.field4100;
        int var4 = (int) arg2.field3247;
        arg2.method1388(-103);
        if (arg1) {
            class194.method1322(true, var3);
        }
        class215.method1474((byte) 89, var3);
        class36 var5 = class64.method455(var4, arg0 + 592454154);
        if (var5 != null) {
            class280.method1886(var5, 32);
        }
        int var6 = class205.field3291;
        int var7 = 0;
        if (arg0 != -27002) {
            method461(-46, true, (class258) null);
        }
        while (var6 > var7) {
            if (class244.method1679(31, class279.field4427[var7])) {
                class56.method419(-94, var7);
            }
            var7++;
        }
        if (class205.field3291 == 1) {
            class199.field3181 = false;
            class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) -102);
        } else {
            class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) 104);
            int var8 = class262.field4165.method1822(class47.field849);
            for (int var9 = 0; var9 < class205.field3291; var9++) {
                int var10 = class262.field4165.method1822(class141.method978(-108, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class68.field1134 = var8 + 8;
            class145.field2322 = (class240.field3892 ? 26 : 22) + class205.field3291 * 15;
        }
        if (class157.field2548 != -1) {
            class241.method1665(1, class157.field2548, 0);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1093 = null;
        field1083 = null;
        if (arg0 > -25) {
            method465((class37[]) null, (class201) null, true);
        }
        field1086 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public final void method116(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1087++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lik;III)V")
    public static final void method463(class260 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class241.field3894) {
            class134 var4 = class288.field4563[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field2140 != null && var4.field2140.field789.method1029()) {
                arg0.method1032(var4.field2140.field789, 128, 0, 0, true);
            }
        }
        if (arg3 < class241.field3894) {
            class134 var5 = class288.field4563[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field2140 != null && var5.field2140.field789.method1029()) {
                arg0.method1032(var5.field2140.field789, 0, 0, 128, true);
            }
        }
        if (arg2 < class241.field3894 && arg3 < class129.field2084) {
            class134 var6 = class288.field4563[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field2140 != null && var6.field2140.field789.method1029()) {
                arg0.method1032(var6.field2140.field789, 128, 0, 128, true);
            }
        }
        if (arg2 < class241.field3894 && arg3 > 0) {
            class134 var7 = class288.field4563[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field2140 != null && var7.field2140.field789.method1029()) {
                arg0.method1032(var7.field2140.field789, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I")
    public final int method119() {
        field1090++;
        return this.field1092;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILqh;I)[Lia;")
    public static final class226[] method464(int arg0, int arg1, class201 arg2, int arg3) {
        field1091++;
        if (arg0 != -3256) {
            field1083 = null;
        }
        return class239.method1657(arg3, arg0 + 3142, arg1, arg2) ? class250.method1710((byte) -123) : null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([Lea;Lqh;Z)V")
    public static final void method465(class37[] arg0, class201 arg1, boolean arg2) {
        field1082++;
        class282.field4461 = arg0;
        if (arg2) {
            field1086 = null;
        }
        class176.field2771 = arg1;
        class132.field2102 = new boolean[class282.field4461.length];
        class9.field117.method854(true);
        int var3 = class176.field2771.method1373(-103, "details");
        int[] var4 = class176.field2771.method1360(1, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class9.field117.method855(false, class241.method1662((byte) -78, new class221(class176.field2771.method1357(var4[var5], var3, -1))));
        }
    }
}
