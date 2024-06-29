import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class298 {

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lge;")
    private class511 field4447 = new class511(64);

    @OriginalMember(owner = "client!un", name = "d", descriptor = "Lci;")
    private class320 field4449;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z")
    public static final boolean method1913(int arg0) {
        field4452++;
        if (class481.field6989) {
            try {
                class325.method2066(class280.field4173.field5824, (byte) -72, "showVideoAd");
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0 == -7959 ? false : false;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public final void method1914(int arg0) {
        class511 var2 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method2990((byte) -127);
            int var3 = 52 / ((arg0 + 46) / 45);
        }
        field4448++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)V")
    public final void method1915(int arg0, int arg1) {
        class511 var3 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method2989(false, arg0);
        }
        if (arg1 != 35) {
            this.method1917(true);
        }
        field4454++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILqa;Lwi;)I")
    public static final int method1916(int arg0, class167 arg1, class332 arg2) {
        field4450++;
        if (arg2.field4902 != -1) {
            return arg2.field4902;
        }
        if (arg2.field4922 != -1) {
            class39 var3 = arg1.field2505.method93((byte) -105, arg1.method189() ? arg2.field4922 : arg2.field4903);
            if (!var3.field814) {
                return var3.field828;
            }
        }
        if (arg0 <= 36) {
            method1913(-50);
        }
        return arg2.field4906;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
    public final void method1917(boolean arg0) {
        field4451++;
        if (arg0) {
            this.method1915(38, 123);
        }
        class511 var2 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)Lfp;")
    public final class218 method1918(int arg0, int arg1) {
        field4446++;
        class511 var3 = this.field4447;
        class218 var4;
        synchronized (this.field4447) {
            var4 = (class218) this.field4447.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field4449;
        byte[] var6;
        synchronized (this.field4449) {
            var6 = this.field4449.method2037(arg1, (byte) -99, arg0);
        }
        class218 var7 = new class218();
        if (var6 != null) {
            var7.method1478(arg0 ^ 0xFFFFB20D, new class519(var6));
        }
        var7.method1482((byte) 104);
        class511 var8 = this.field4447;
        synchronized (this.field4447) {
            this.field4447.method2981(var7, arg0 ^ 0x17, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lsn;ILci;)V")
    public class298(class453 arg0, int arg1, class320 arg2) {
        this.field4449 = arg2;
        if (this.field4449 != null) {
            this.field4449.method2030(-10914, 35);
        }
    }
}
