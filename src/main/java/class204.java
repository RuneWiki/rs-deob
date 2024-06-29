import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class204 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lnj;")
    private class162 field2862 = new class162(16);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Lmg;")
    private class101 field2863;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Lqp;")
    public static class466 field2867 = new class466("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "[I")
    public static int[] field2871 = new int[4096];

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "Lwj;")
    public static class270 field2868 = new class270(35, 28);

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Lmg;")
    public static class101 field2870;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "Lmg;")
    public static class101 field2872;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIILjk;II)Luf;")
    public final class312 method1264(int arg0, int arg1, int arg2, class446 arg3, int arg4, int arg5) {
        field2865++;
        class280[] var7 = null;
        class118 var8 = this.method1266(arg4, -2148);
        if (var8.field1765 != null) {
            var7 = new class280[var8.field1765.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class298 var10 = arg3.method2645(113, var8.field1765[var9]);
                var7[var9] = new class280(var10.field4091, var10.field4099, var10.field4096, var10.field4095, var10.field4092, var10.field4094, var10.field4090, var10.field4097);
            }
        }
        if (arg2 != 0) {
            field2872 = null;
        }
        return new class312(var8.field1761, var7, var8.field1764, arg0, arg5, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public final void method1265(byte arg0) {
        field2873++;
        class162 var2 = this.field2862;
        synchronized (this.field2862) {
            if (arg0 <= 79) {
                field2872 = null;
            }
            this.field2862.method1068(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lsq;")
    private final class118 method1266(int arg0, int arg1) {
        field2864++;
        class162 var3 = this.field2862;
        class118 var4;
        synchronized (this.field2862) {
            var4 = (class118) this.field2862.method1073((long) arg0, false);
            if (arg1 != -2148) {
                this.field2862 = null;
            }
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2863.method727(arg0, 29, 32);
        class118 var6 = new class118();
        if (var5 != null) {
            var6.method835((byte) -100, new class391(var5));
        }
        class162 var7 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method1072((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZI)V")
    public final void method1267(boolean arg0, int arg1) {
        if (arg0) {
            field2870 = null;
        }
        class162 var3 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method1065((byte) -95, arg1);
        }
        field2866++;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        int var1 = -84 % ((arg0 - 26) / 62);
        field2868 = null;
        field2867 = null;
        field2870 = null;
        field2872 = null;
        field2871 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public final void method1269(int arg0) {
        field2869++;
        class162 var2 = this.field2862;
        synchronized (this.field2862) {
            this.field2862.method1066(4080);
            if (arg0 > -27) {
                field2871 = null;
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lal;ILmg;)V")
    public class204(class66 arg0, int arg1, class101 arg2) {
        this.field2863 = arg2;
        this.field2863.method753(29, -81);
    }
}
