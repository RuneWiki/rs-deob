import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class331 {

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Lnf;")
    private class389 field4803 = new class389();

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    private int field4804;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    private int field4798;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Lfe;")
    private class384 field4813;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "[F")
    public static float[] field4808 = new float[16384];

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "[F")
    public static float[] field4802 = new float[16384];

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4811 = 1;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "Liu;")
    public static class390 field4816;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field4807;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field4809;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field4812;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public static int field4815;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1988(boolean arg0) {
        if (!arg0) {
            field4816 = null;
        }
        field4808 = null;
        field4816 = null;
        field4802 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method1989(int arg0) {
        if (arg0 == 10) {
            field4814++;
            return this.field4798;
        } else {
            return 101;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLjb;)V")
    private final void method1990(byte arg0, class325 arg1) {
        if (arg1 != null) {
            arg1.method536(false);
            arg1.method589((byte) 51);
            this.field4804 += arg1.field4748;
        }
        field4815++;
        if (arg0 >= -47) {
            this.method1994(88);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZB)V")
    public static final void method1991(int arg0, boolean arg1, byte arg2) {
        field4810++;
        class220 var3 = class224.method1384(arg1, true, arg0);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 >= -73) {
            method1991(-19, true, (byte) 124);
        }
        while (var4 < var3.field3097.length) {
            var3.field3097[var4] = -1;
            var3.field3101[var4] = 0;
            var4++;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;I)Ljava/lang/Object;")
    public final Object method1992(class155 arg0, int arg1) {
        field4800++;
        long var3 = arg0.method934(81);
        if (arg1 < 16) {
            this.field4803 = null;
        }
        for (class325 var5 = (class325) this.field4813.method2310((byte) 94, var3); var5 != null; var5 = (class325) this.field4813.method2309(79)) {
            if (var5.field4751.method935((byte) -100, arg0)) {
                Object var6 = var5.method729(109);
                if (var6 != null) {
                    if (var5.method728(123)) {
                        class187 var7 = new class187(arg0, var6, var5.field4748);
                        this.field4813.method2317(-1, var5.field1177, var7);
                        this.field4803.method2342((byte) 29, var7);
                        var7.field1291 = 0L;
                        var5.method536(false);
                        var5.method589((byte) 51);
                    } else {
                        this.field4803.method2342((byte) 87, var5);
                        var5.field1291 = 0L;
                    }
                    return var6;
                }
                var5.method536(false);
                var5.method589((byte) 51);
                this.field4804 += var5.field4748;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public final void method1993(byte arg0) {
        this.field4803.method2348(false);
        field4809++;
        this.field4813.method2315((byte) -112);
        if (arg0 <= 34) {
            this.method1989(20);
        }
        this.field4804 = this.field4798;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public final void method1994(int arg0) {
        int var2 = -95 / ((arg0 - 47) / 52);
        field4807++;
        for (class325 var3 = (class325) this.field4803.method2347((byte) -123); var3 != null; var3 = (class325) this.field4803.method2341(123)) {
            if (var3.method728(-69)) {
                var3.method536(false);
                var3.method589((byte) 51);
                this.field4804 += var3.field4748;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Z")
    public static final boolean method1995(int arg0) {
        field4812++;
        if (arg0 >= -46) {
            method1991(-30, false, (byte) -56);
        }
        try {
            return class265.method1632((byte) -6);
        } catch (IOException var4) {
            class388.method2338((byte) -86);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class36.field563 == null ? -1 : class36.field563.method2353(-2)) + "," + (class13.field203 == null ? -1 : class13.field203.method2353(-2)) + "," + (class357.field5300 == null ? -1 : class357.field5300.method2353(-2)) + " - " + class359.field5330 + "," + (class415.field6145.field4279[0] + class455.field6637) + "," + (class415.field6145.field4282[0] + class223.field3158) + " - ";
            for (int var3 = 0; class359.field5330 > var3 && var3 < 50; var3++) {
                var2 = var2 + class234.field3288.field2041[var3] + ",";
            }
            class356.method2169(var5, var2, (byte) 34);
            class202.method1246((byte) -102);
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
    public final void method1996(int arg0, int arg1) {
        field4805++;
        if (class120.field1566 != null) {
            for (class325 var3 = (class325) this.field4803.method2347((byte) -121); var3 != null; var3 = (class325) this.field4803.method2341(111)) {
                if (var3.method728(82)) {
                    if (var3.method729(62) == null) {
                        var3.method536(false);
                        var3.method589((byte) 51);
                        this.field4804 += var3.field4748;
                    }
                } else if ((long) arg0 < ++var3.field1291) {
                    class325 var4 = class120.field1566.method495(false, var3);
                    this.field4813.method2317(~arg1, var3.field1177, var4);
                    class106.method634(var4, 0, var3);
                    var3.method536(false);
                    var3.method589((byte) 51);
                }
            }
        }
        if (arg1 != 0) {
            this.method2000(null, -4, null, -16);
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)I")
    public final int method1997(int arg0) {
        field4801++;
        if (arg0 != -18204) {
            method1991(-75, true, (byte) 30);
        }
        return this.field4804;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqa;)V")
    private final void method1998(int arg0, class155 arg1) {
        field4799++;
        long var3 = arg1.method934(-123);
        for (class325 var5 = (class325) this.field4813.method2310((byte) 90, var3); var5 != null; var5 = (class325) this.field4813.method2309(-103)) {
            if (var5.field4751.method935((byte) -90, arg1)) {
                this.method1990((byte) -59, var5);
                break;
            }
        }
        if (arg0 > -33) {
            this.method2000(null, 13, null, -121);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;ILjava/lang/Object;)V")
    public final void method1999(class155 arg0, int arg1, Object arg2) {
        field4806++;
        this.method2000(arg0, arg1, arg2, arg1 ^ 0xFFFFFF81);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lqa;ILjava/lang/Object;I)V")
    private final void method2000(class155 arg0, int arg1, Object arg2, int arg3) {
        field4797++;
        if (this.field4798 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method1998(-90, arg0);
        this.field4804 -= arg1;
        while (this.field4804 < 0) {
            class325 var6 = (class325) this.field4803.method2344(1);
            this.method1990((byte) -85, var6);
        }
        class187 var5 = new class187(arg0, arg2, arg1);
        this.field4813.method2317(-1, arg0.method934(111), var5);
        this.field4803.method2342((byte) 89, var5);
        var5.field1291 = 0L;
        if (arg3 > -59) {
            this.field4813 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(I)V")
    public class331(int arg0) {
        this.field4804 = arg0;
        this.field4798 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field4813 = new class384(var2);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4808[var2] = (float) Math.sin((double) var2 * var0);
            field4802[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4816 = new class390(10, 12);
    }
}
