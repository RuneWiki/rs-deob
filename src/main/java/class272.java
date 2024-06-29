import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class272 {

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "La;")
    private class247 field4404 = new class247();

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    private int field4386;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field4391;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lgg;")
    private class61 field4397;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "I")
    public static int field4395 = 0;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "I")
    public static int field4393 = 0;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "S")
    public static short field4389 = 1;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "[Z")
    public static boolean[] field4396 = new boolean[100];

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "Leg;")
    public static class272 field4398 = new class272(4);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Ljj;")
    public static class134 field4387;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "[I")
    public static int[] field4388;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(JILjava/lang/Object;)V")
    public final void method1830(long arg0, int arg1, Object arg2) {
        if (arg1 > -18) {
            this.method1832(-117, (byte) 109);
        }
        field4399++;
        this.method1836(0, arg0);
        if (this.field4386 == 0) {
            class86 var5 = (class86) this.field4404.method1633((byte) -71);
            var5.method544(-48);
            var5.method1213(true);
        } else {
            this.field4386--;
        }
        class268 var6 = new class268(arg2);
        this.field4397.method466(arg0, var6, (byte) 93);
        this.field4404.method1634((byte) 77, var6);
        var6.field2817 = 0L;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method1831(int arg0) {
        for (class86 var2 = (class86) this.field4404.method1635(-98); var2 != null; var2 = (class86) this.field4404.method1636((byte) -111)) {
            if (var2.method612(true)) {
                var2.method544(-22);
                var2.method1213(true);
                this.field4386++;
            }
        }
        if (arg0 > -96) {
            field4395 = 88;
        }
        field4401++;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)V")
    public final void method1832(int arg0, byte arg1) {
        if (class288.field4613 != null) {
            for (class86 var3 = (class86) this.field4404.method1635(-60); var3 != null; var3 = (class86) this.field4404.method1636((byte) -111)) {
                if (var3.method612(true)) {
                    if (var3.method613(81) == null) {
                        var3.method544(104);
                        var3.method1213(true);
                        this.field4386++;
                    }
                } else if (++var3.field2817 > (long) arg0) {
                    class86 var4 = class288.field4613.method1247((byte) -82, var3);
                    this.field4397.method466(var3.field962, var4, (byte) 93);
                    class3.method28(-27420, var4, var3);
                    var3.method544(-56);
                    var3.method1213(true);
                }
            }
        }
        field4394++;
        int var5 = 99 / ((arg1 - 7) / 57);
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static void method1833(int arg0) {
        field4396 = null;
        field4398 = null;
        field4387 = null;
        if (arg0 <= 6) {
            field4387 = null;
        }
        field4388 = null;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)V")
    public final void method1834(int arg0) {
        this.field4404.method1631((byte) -93);
        if (arg0 != 0) {
            field4396 = null;
        }
        field4400++;
        this.field4397.method458(123);
        this.field4386 = this.field4391;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)I")
    public final int method1835(int arg0) {
        field4390++;
        int var2 = 0;
        if (arg0 != 18996) {
            this.field4404 = null;
        }
        for (class86 var3 = (class86) this.field4404.method1635(-84); var3 != null; var3 = (class86) this.field4404.method1636((byte) -128)) {
            if (!var3.method612(true)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IJ)V")
    public final void method1836(int arg0, long arg1) {
        class86 var4 = (class86) this.field4397.method457(arg1, (byte) -115);
        field4402++;
        if (arg0 == 0 && var4 != null) {
            var4.method544(-79);
            var4.method1213(true);
            this.field4386++;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1837(String arg0, int arg1, Throwable arg2) {
        field4405++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class110.method801(arg2, 26053);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class58.method448((byte) 99, var3);
            String var4 = class69.method547(":", true, var3, "%3a");
            String var5 = class69.method547("@", true, var4, "%40");
            String var6 = class69.method547("&", true, var5, "%26");
            String var7 = class69.method547("#", true, var6, "%23");
            if (class254.field4068.field4090 != null) {
                class137 var8 = class254.field4068.method1678(new URL(class254.field4068.field4090.getCodeBase(), "clienterror.ws?c=" + class81.field1126 + "&u=" + class64.field905 + "&v1=" + class255.field4069 + "&v2=" + class255.field4077 + "&e=" + var7), 4);
                while (var8.field2271 == 0) {
                    class208.method1408(-126, 1L);
                }
                if (var8.field2271 == arg1) {
                    DataInputStream var9 = (DataInputStream) var8.field2266;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIILjj;)[Lwe;")
    public static final class43[] method1838(int arg0, int arg1, int arg2, class134 arg3) {
        if (arg0 < 62) {
            method1838(-31, -100, -100, (class134) null);
        }
        field4403++;
        return class227.method1499((byte) 126, arg3, arg2, arg1) ? class12.method70(0) : null;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
    public class272(int arg0) {
        this.field4386 = arg0;
        this.field4391 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field4397 = new class61(var2);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1839(byte arg0, long arg1) {
        field4392++;
        class86 var4 = (class86) this.field4397.method457(arg1, (byte) -115);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method613(-59);
        if (arg0 < 28) {
            field4389 = 69;
        }
        if (var5 == null) {
            var4.method544(91);
            var4.method1213(true);
            this.field4386++;
            return null;
        }
        if (var4.method612(true)) {
            class268 var6 = new class268(var5);
            this.field4397.method466(var4.field962, var6, (byte) 93);
            this.field4404.method1634((byte) 38, var6);
            var6.field2817 = 0L;
            var4.method544(-23);
            var4.method1213(true);
        } else {
            this.field4404.method1634((byte) 87, var4);
            var4.field2817 = 0L;
        }
        return var5;
    }
}
