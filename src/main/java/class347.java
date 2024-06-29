import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class347 {

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Lpja;")
    private class43 field4682 = new class43(64);

    @OriginalMember(owner = "client!saa", name = "q", descriptor = "Lpja;")
    public class43 field4690 = new class43(60);

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "Lgj;")
    private class662 field4677;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "Lgj;")
    public class662 field4676;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Lfja;")
    public static class783 field4675 = new class783(123, 6);

    @OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
    public static int field4686 = -1;

    @OriginalMember(owner = "client!saa", name = "p", descriptor = "Lvl;")
    public static class15 field4689 = new class15(83, 3);

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "I")
    public static int field4679;

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!saa", name = "j", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!saa", name = "k", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!saa", name = "l", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!saa", name = "n", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!saa", name = "o", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!saa", name = "r", descriptor = "I")
    public int field4691;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(II)V")
    public final void method2140(int arg0, int arg1) {
        class43 var3 = this.field4682;
        synchronized (this.field4682) {
            this.field4682.method265(arg1, -69);
        }
        field4683++;
        class43 var4 = this.field4690;
        synchronized (this.field4690) {
            if (arg0 <= -71) {
                this.field4690.method265(arg1, -104);
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(I)V")
    public final void method2141(int arg0) {
        class43 var2 = this.field4682;
        synchronized (this.field4682) {
            this.field4682.method272(20);
            if (arg0 != 0) {
                method2148(121, (byte) -47);
            }
        }
        field4688++;
        class43 var3 = this.field4690;
        synchronized (this.field4690) {
            this.field4690.method272(20);
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([BB)Lfp;")
    public static final class344 method2142(byte[] arg0, byte arg1) {
        field4685++;
        class344 var2 = new class344();
        class93 var3 = new class93(arg0);
        var3.field1442 = var3.field1413.length - 2;
        int var4 = var3.method763(-30);
        int var5 = var3.field1413.length - var4 - 2 - 16;
        var3.field1442 = var5;
        int var6 = var3.method773(3);
        var2.field4637 = var3.method763(-73);
        var2.field4622 = var3.method763(arg1 + 180);
        var2.field4624 = var3.method763(91);
        var2.field4632 = var3.method763(arg1 + 13);
        var2.field4636 = var3.method763(-114);
        var2.field4635 = var3.method763(97);
        int var7 = var3.method793((byte) 102);
        if (var7 > 0) {
            var2.field4628 = new class46[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method763(arg1 + 224);
                class46 var10 = new class46(class241.method1609((byte) -73, var9));
                var2.field4628[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method773(3);
                    int var12 = var3.method773(3);
                    var10.method341((long) var11, new class345(var12), (byte) 117);
                }
            }
        }
        var3.field1442 = 0;
        var2.field4629 = var3.method802(false);
        var2.field4627 = new int[var6];
        if (arg1 != -104) {
            method2142(null, (byte) 89);
        }
        int var13 = 0;
        while (var3.field1442 < var5) {
            int var14 = var3.method763(-90);
            if (var14 == 3) {
                if (var2.field4634 == null) {
                    var2.field4634 = new String[var6];
                }
                var2.field4634[var13] = var3.method752(0).intern();
            } else if (var14 == 54) {
                if (var2.field4626 == null) {
                    var2.field4626 = new long[var6];
                }
                var2.field4626[var13] = var3.method770((byte) 71);
            } else {
                if (var2.field4625 == null) {
                    var2.field4625 = new int[var6];
                }
                if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                    var2.field4625[var13] = var3.method793((byte) 106);
                } else {
                    var2.field4625[var13] = var3.method773(3);
                }
            }
            var2.field4627[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)Lbg;")
    public final class491 method2143(int arg0, int arg1) {
        field4687++;
        class43 var3 = this.field4682;
        class491 var4;
        synchronized (this.field4682) {
            var4 = (class491) this.field4682.method266((byte) -108, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -2) {
            this.field4682 = null;
        }
        class662 var5 = this.field4677;
        byte[] var6;
        synchronized (this.field4677) {
            var6 = this.field4677.method3732(class559.method3246(45, arg1), arg0 + 8908, class606.method3444(arg1, false));
        }
        class491 var7 = new class491();
        var7.field6689 = arg1;
        var7.field6708 = this;
        if (var6 != null) {
            var7.method2815(0, new class93(var6));
        }
        class43 var8 = this.field4682;
        synchronized (this.field4682) {
            this.field4682.method270(var7, (long) arg1, -122);
            return var7;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
    public final void method2144(boolean arg0) {
        class43 var2 = this.field4682;
        synchronized (this.field4682) {
            this.field4682.method273(2);
        }
        if (!arg0) {
            this.method2145(83, 9);
        }
        field4681++;
        class43 var3 = this.field4690;
        synchronized (this.field4690) {
            this.field4690.method273(126);
        }
    }

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "(II)V")
    public final void method2145(int arg0, int arg1) {
        field4684++;
        this.field4691 = arg0;
        if (arg1 <= -86) {
            class43 var3 = this.field4690;
            synchronized (this.field4690) {
                this.field4690.method273(-99);
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
    public static void method2146(int arg0) {
        field4675 = null;
        field4689 = null;
        if (arg0 != 64) {
            field4689 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIIIIII)Len;")
    public static final class339 method2147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4679++;
        long var7 = (long) arg2 * 986053L ^ (long) arg6 * 475427L ^ (long) arg5 * 97549L ^ (long) arg4 * 67481L ^ (long) arg3 * 32147369L ^ (long) arg0 * 76724863L;
        class339 var9 = (class339) class616.field8586.method266((byte) -119, var7);
        if (var9 != null) {
            return var9;
        }
        if (arg1 < 115) {
            method2146(108);
        }
        class339 var10 = class205.field3095.method564(arg4, arg5, arg6, arg2, arg3, arg0);
        class616.field8586.method270(var10, var7, -126);
        return var10;
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IB)V")
    public static final void method2148(int arg0, byte arg1) {
        field4680++;
        class281 var2 = class54.method395((byte) -53, (long) arg0, 11);
        var2.method1818((byte) 101);
        int var3 = -100 % ((22 - arg1) / 44);
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Lim;ILgj;Lgj;)V")
    public class347(class598 arg0, int arg1, class662 arg2, class662 arg3) {
        this.field4677 = arg2;
        this.field4676 = arg3;
        int var5 = this.field4677.method3723(5) - 1;
        this.field4677.method3730((byte) -97, var5);
    }
}
