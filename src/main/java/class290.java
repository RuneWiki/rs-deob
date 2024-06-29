import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class290 {

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Laq;")
    private class494 field4236 = new class494(64);

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Laq;")
    public class494 field4240 = new class494(60);

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lgga;")
    public class513 field4235;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "Lgga;")
    private class513 field4228;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lkka;")
    public static class518 field4237 = new class518(0, 0);

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public final void method1826(int arg0) {
        field4231++;
        class494 var2 = this.field4236;
        synchronized (this.field4236) {
            if (arg0 != 6) {
                this.field4241 = -17;
            }
            this.field4236.method2881((byte) -44);
        }
        class494 var3 = this.field4240;
        synchronized (this.field4240) {
            this.field4240.method2881((byte) -80);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
    public static final void method1827(int arg0, int arg1) {
        class494 var2 = class725.field10099;
        synchronized (class725.field10099) {
            class725.field10099.method2888(arg1, 123);
            if (arg0 != 60) {
                method1833(true);
            }
        }
        field4230++;
        class494 var3 = class677.field9507;
        synchronized (class677.field9507) {
            class677.field9507.method2888(arg1, 125);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public static final void method1828(int arg0, int arg1) {
        field4234++;
        class371 var2 = class490.method2867((byte) -54, 6, (long) arg0);
        if (arg1 == -15282) {
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZI)V")
    public final void method1829(boolean arg0, int arg1) {
        class494 var3 = this.field4236;
        synchronized (this.field4236) {
            this.field4236.method2888(arg1, 121);
        }
        field4233++;
        class494 var4 = this.field4240;
        synchronized (this.field4240) {
            if (!arg0) {
                method1827(17, 11);
            }
            this.field4240.method2888(arg1, 118);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
    public final void method1830(byte arg0, int arg1) {
        this.field4241 = arg1;
        field4232++;
        class494 var3 = this.field4240;
        synchronized (this.field4240) {
            if (arg0 > -53) {
                this.method1831((byte) -33);
            }
            this.field4240.method2881((byte) -13);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public final void method1831(byte arg0) {
        class494 var2 = this.field4236;
        synchronized (this.field4236) {
            this.field4236.method2893((byte) -92);
            if (arg0 != -74) {
                this.method1830((byte) -52, -54);
            }
        }
        field4229++;
        class494 var3 = this.field4240;
        synchronized (this.field4240) {
            this.field4240.method2893((byte) 4);
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(II)Lsm;")
    public final class113 method1832(int arg0, int arg1) {
        field4239++;
        class494 var3 = this.field4236;
        class113 var4;
        synchronized (this.field4236) {
            var4 = (class113) this.field4236.method2882((long) arg1, (byte) -127);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field4228;
        byte[] var6;
        synchronized (this.field4228) {
            var6 = this.field4228.method3019(class435.method2594(-29742, arg1), class60.method622(arg1, 116), 110);
        }
        class113 var7 = new class113();
        var7.field1645 = arg1;
        var7.field1631 = this;
        if (var6 != null) {
            var7.method936((byte) 4, new class431(var6));
        }
        int var8 = 113 / ((-arg0 - 41) / 52);
        class494 var9 = this.field4236;
        synchronized (this.field4236) {
            this.field4236.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1833(boolean arg0) {
        field4237 = null;
        if (!arg0) {
            method1827(-98, 37);
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lmca;ILgga;Lgga;)V")
    public class290(class41 arg0, int arg1, class513 arg2, class513 arg3) {
        this.field4235 = arg3;
        this.field4228 = arg2;
        int var5 = this.field4228.method3011((byte) -128) - 1;
        this.field4228.method3007(-1, var5);
    }
}
