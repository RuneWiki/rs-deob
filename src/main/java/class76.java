import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class76 extends class320 {

    @OriginalMember(owner = "client!rb", name = "K", descriptor = "Lan;")
    public class3 field1122;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field1113 = 1;

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "Lho;")
    public static class215 field1118;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "Lqn;")
    public static class361 field1117;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "[[[I")
    public static int[][][] field1115;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 7)
    public static final void method699(int arg0) {
        class339.method2380(class256.field3937, arg0 ^ 0xFFFFFF94);
        field1116++;
        class346.field5505++;
        if (class215.field3361 && class62.field955) {
            int var1 = class268.field4137;
            int var2 = class78.field1129;
            int var3 = class256.field3937.field5332;
            int var4 = var2 - class210.field3243;
            if (var4 < class81.field1185) {
                var4 = class81.field1185;
            }
            if (class256.field3937.field5339 + var4 > class81.field1185 - -class348.field5523.field5339) {
                var4 = class81.field1185 + class348.field5523.field5339 - class256.field3937.field5339;
            }
            int var5 = var4 - class261.field4002;
            int var6 = var1 - class66.field994;
            if (var6 < class67.field1030) {
                var6 = class67.field1030;
            }
            if (arg0 != -3) {
                field1119 = -53;
            }
            if ((class67.field1030 + class348.field5523.field5374) < (class256.field3937.field5374 + var6)) {
                var6 = class67.field1030 + class348.field5523.field5374 - class256.field3937.field5374;
            }
            int var7 = var6 - class204.field3158;
            int var8 = var4 + class348.field5523.field5334 - class81.field1185;
            int var9 = var6 + class348.field5523.field5351 - class67.field1030;
            if (class256.field3937.field5412 < class346.field5505 && (var3 < var7 || var7 < -var3 || var5 > var3 || var5 < (-var3))) {
                class123.field1973 = true;
            }
            if (class256.field3937.field5287 != null && class123.field1973) {
                class112 var10 = new class112();
                var10.field1709 = var9;
                var10.field1706 = class256.field3937;
                var10.field1708 = var8;
                var10.field1711 = class256.field3937.field5287;
                class160.method1288((byte) -45, var10);
            }
            if (class210.field3242 == 0) {
                if (class123.field1973) {
                    if (class256.field3937.field5263 != null) {
                        class112 var11 = new class112();
                        var11.field1709 = var9;
                        var11.field1706 = class256.field3937;
                        var11.field1711 = class256.field3937.field5263;
                        var11.field1708 = var8;
                        var11.field1716 = class297.field4619;
                        class160.method1288((byte) -45, var11);
                    }
                    if (class297.field4619 != null && client.method1038(class256.field3937) != null) {
                        class99.field1491.method1628((byte) -96, 78);
                        class184.field2892++;
                        class99.field1491.method263(class297.field4619.field5380, false);
                        class99.field1491.method252(class256.field3937.field5433, -114);
                        class99.field1491.method315(class297.field4619.field5433, arg0 + 110);
                        class99.field1491.method258(class256.field3937.field5380, (byte) 78);
                    }
                } else if ((class120.field1865 == 1 || class350.method2457(false, class66.field1006 - 1)) && class66.field1006 > 2) {
                    class10.method103(84);
                } else if (class66.field1006 > 0) {
                    class57.method570(29311);
                }
                class256.field3937 = null;
            }
        } else if (class346.field5505 > 1) {
            class256.field3937 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "(I)V", line = 130)
    public static void method700(int arg0) {
        field1115 = (int[][][]) null;
        if (arg0 == 0) {
            field1118 = null;
            field1117 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V", line = 147)
    public static final void method701(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class99.field1491.field397 = 0;
        field1121++;
        class99.field1491.method273(0, 20);
        if (arg2 != 78) {
            field1117 = (class361) null;
        }
        class99.field1491.method273(0, arg4);
        class99.field1491.method273(0, arg3);
        class99.field1491.method304(false, arg0);
        class99.field1491.method304(false, arg1);
        class113.field1738 = 0;
        class135.field2261 = -3;
        class129.field2139 = 1;
        class150.field2455 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lan;)V", line = 169)
    public class76(class3 arg0) {
        this.field1122 = arg0;
    }
}
