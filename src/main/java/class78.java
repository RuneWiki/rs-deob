import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class78 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "B")
    private byte field1452;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public int field1445;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1458 = -1;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Lcf;")
    private static class93 field1461 = class147.method1066("scroll:", -48);

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lcf;")
    public static class93 field1455 = field1461;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "Lcf;")
    public static class93 field1468 = class147.method1066("Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3", -48);

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "Lcf;")
    public static class93 field1466 = class147.method1066("details", -48);

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field1467 = 0;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "Lcf;")
    public static class93 field1464 = field1461;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lhg;")
    public static class177 field1450;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Ltg;")
    public static class181 field1463;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[S[Lcf;)V")
    public static final void method538(int arg0, short[] arg1, class93[] arg2) {
        class141.method1024(arg1, 0, arg2.length - 1, -31452, arg2);
        if (arg0 < -32) {
            field1454++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1466 = null;
        field1463 = null;
        field1450 = null;
        field1468 = null;
        field1455 = null;
        field1461 = null;
        if (arg0 >= -27) {
            field1456 = -75;
        }
        field1464 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZIII)Ldh;")
    public static final class120 method540(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1457++;
        int var7 = (arg4 << 17) + (arg2 ? 65536 : 0) + arg1 + (arg3 << 19);
        if (arg0 != 65536) {
            method542(72, (class181[]) null, 36);
        }
        long var8 = (long) arg5 * 3147483667L + (long) var7 * 3849834839L;
        class120 var10 = (class120) class260.field4672.method302(var8, 0);
        if (var10 != null) {
            return var10;
        }
        class179.field3163 = false;
        class120 var11 = class272.method1804(arg3, arg5, 27030, arg2, false, arg1, false, arg4);
        if (var11 != null && !class179.field3163) {
            class260.field4672.method297(var8, var11, 10414);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)I")
    public final int method541(byte arg0) {
        field1446++;
        if (arg0 > -95) {
            return 17;
        } else if ((this.field1452 & 0x8) == 8) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[Ltg;I)V")
    public static final void method542(int arg0, class181[] arg1, int arg2) {
        for (int var3 = arg2; var3 < arg1.length; var3++) {
            class181 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field3289 == 0) {
                    if (var4.field3336 != null) {
                        method542(arg0, var4.field3336, 0);
                    }
                    class214 var5 = (class214) class255.field4610.method135((long) var4.field3219, true);
                    if (var5 != null) {
                        class61.method383(var5.field3912, 73, arg0);
                    }
                }
                if (arg0 == 0 && var4.field3201 != null) {
                    class223 var6 = new class223();
                    var6.field4017 = var4;
                    var6.field4015 = var4.field3201;
                    class106.method763(var6, (byte) 86);
                }
                if (arg0 == 1 && var4.field3262 != null) {
                    if (var4.field3293 >= 0) {
                        class181 var7 = client.method1114(-20985, var4.field3219);
                        if (var7 == null || var7.field3336 == null || var4.field3293 >= var7.field3336.length || var7.field3336[var4.field3293] != var4) {
                            continue;
                        }
                    }
                    class223 var8 = new class223();
                    var8.field4017 = var4;
                    var8.field4015 = var4.field3262;
                    class106.method763(var8, (byte) 108);
                }
            }
        }
        field1453++;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)I")
    public final int method543(byte arg0) {
        int var2 = -59 / ((arg0 - 44) / 61);
        field1451++;
        return this.field1452 & 0x7;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILee;)V")
    public static final void method544(int arg0, class280 arg1) {
        for (int var2 = 0; var2 < class117.field2090; var2++) {
            int var3 = arg1.method1924(8100);
            int var4 = arg1.method1891(-113);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class242.field4367[var3] != null) {
                class242.field4367[var3].field919 = var4;
            }
        }
        if (arg0 != -1) {
            field1450 = null;
        }
        field1465++;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lee;)V")
    public class78(class280 arg0) {
        this.field1452 = arg0.method1925(true);
        this.field1448 = arg0.method1891(-116);
        this.field1449 = arg0.method1872(123);
        this.field1445 = arg0.method1872(121);
        this.field1469 = arg0.method1872(99);
        this.field1459 = arg0.method1872(106);
    }
}
