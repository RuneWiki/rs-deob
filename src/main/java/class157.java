import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class157 {

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Lmq;")
    private class104 field2250 = new class104(64);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lmq;")
    private class104 field2256 = new class104(100);

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lfc;")
    private class343 field2251;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Ltm;")
    public static class112 field2254 = new class112("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!p", name = "j", descriptor = "Lfn;")
    public static class52 field2255 = new class52(48, 8);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lfc;")
    public static class343 field2259;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V")
    public final void method948(boolean arg0) {
        field2257++;
        class104 var2 = this.field2250;
        synchronized (this.field2250) {
            this.field2250.method654(false);
        }
        class104 var3 = this.field2256;
        synchronized (this.field2256) {
            this.field2256.method654(false);
        }
        if (!arg0) {
            this.method950(true, -117);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Laa;")
    public final class13 method949(int arg0, int arg1) {
        field2248++;
        class104 var3 = this.field2256;
        class13 var4;
        synchronized (this.field2256) {
            var4 = (class13) this.field2256.method659((long) arg0, (byte) -1);
            if (var4 == null) {
                var4 = new class13(arg0);
                this.field2256.method653(56, (long) arg0, var4);
            }
        }
        synchronized (var4) {
            if (!var4.method108(1)) {
                return null;
            }
        }
        if (arg1 < 50) {
            method951(true, (String) null, 72, true, (byte) 90, true, (String) null, 27, -79, 79L, -10);
        }
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Lqg;")
    public final class372 method950(boolean arg0, int arg1) {
        field2253++;
        class104 var3 = this.field2250;
        class372 var4;
        synchronized (this.field2250) {
            var4 = (class372) this.field2250.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2251.method2029(class466.method2747((byte) -73, arg1), class394.method2360(arg1, (byte) 119), 0);
        class372 var6 = new class372();
        if (!arg0) {
            this.field2256 = null;
        }
        var6.field5284 = this;
        var6.field5252 = arg1;
        if (var5 != null) {
            var6.method2229(new class425(var5), -8356);
        }
        var6.method2226(2);
        class104 var7 = this.field2250;
        synchronized (this.field2250) {
            this.field2250.method653(71, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLjava/lang/String;IZBZLjava/lang/String;IIJI)V")
    public static final void method951(boolean arg0, String arg1, int arg2, boolean arg3, byte arg4, boolean arg5, String arg6, int arg7, int arg8, long arg9, int arg10) {
        field2247++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class425 var14 = new class425(128);
        var14.method2470((byte) -74, 10);
        var14.method2462((arg5 ? 4 : 0) | (arg3 ? 1 : 0) | (arg0 ? 2 : 0), (byte) -123);
        var14.method2471(26505, arg9);
        var14.method2481(var12[0], true);
        var14.method2493((byte) 9, arg1);
        var14.method2481(var12[1], true);
        var14.method2462(class303.field4156, (byte) -123);
        var14.method2470((byte) -74, arg8);
        var14.method2470((byte) -74, arg2);
        var14.method2481(var12[2], true);
        var14.method2462(arg10, (byte) -123);
        var14.method2462(arg7, (byte) -123);
        if (arg4 != 36) {
            return;
        }
        var14.method2481(var12[3], true);
        var14.method2496(0, client.field5496, class417.field5742);
        class425 var15 = new class425(350);
        var15.method2493((byte) -127, arg6);
        int var16 = 8 - (class42.method349(arg6, arg4 - 35) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method2470((byte) -74, (int) (Math.random() * 255.0D));
        }
        var15.method2510(var12, -161911157);
        class366.field5214.field5830 = 0;
        class366.field5214.method2470((byte) -74, class430.field5937.field6474);
        class366.field5214.method2462(var14.field5830 + var15.field5830 + 2, (byte) -123);
        class366.field5214.method2462(572, (byte) -123);
        class366.field5214.method2454(false, var14.field5830, var14.field5886, 0);
        class366.field5214.method2454(false, var15.field5830, var15.field5886, 0);
        class350.field4792 = 0;
        class255.field3579 = 0;
        class73.field1058 = 1;
        class338.field4632 = -3;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V")
    public static void method952(boolean arg0) {
        if (arg0) {
            method952(false);
        }
        field2255 = null;
        field2259 = null;
        field2254 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static final void method953(int arg0) {
        field2252++;
        int var1 = -89 / ((arg0 - 53) / 62);
        if (class14.field222 != 3) {
            class355.field4955 = -1;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
    public final void method954(int arg0) {
        class104 var2 = this.field2250;
        synchronized (this.field2250) {
            this.field2250.method656(99);
        }
        field2246++;
        class104 var3 = this.field2256;
        synchronized (this.field2256) {
            this.field2256.method656(102);
        }
        if (arg0 != 572) {
            method953(126);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)V")
    public final void method955(int arg0, int arg1) {
        field2249++;
        class104 var3 = this.field2250;
        synchronized (this.field2250) {
            if (arg1 != 14346) {
                field2259 = null;
            }
            this.field2250.method666(arg0, false);
        }
        class104 var4 = this.field2256;
        synchronized (this.field2256) {
            this.field2256.method666(arg0, false);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;Lfc;)V")
    public class157(class328 arg0, int arg1, class343 arg2, class343 arg3, class343 arg4) {
        this.field2251 = arg2;
        if (this.field2251 != null) {
            int var6 = this.field2251.method2027(18) - 1;
            this.field2251.method2054(0, var6);
        }
        class394.method2353(arg4, arg3, 125);
    }
}
