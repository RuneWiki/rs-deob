import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class240 {

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Lwi;")
    private class330 field3368 = new class330(64);

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "Luu;")
    private class191 field3371;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "Lpa;")
    public static class254 field3375 = new class254(3, 7);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Lla;")
    public static class319 field3376 = new class319(67, 19);

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Lla;")
    public static class319 field3377 = new class319(35, -1);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
    public static final Object method1577(boolean arg0, int arg1, byte[] arg2) {
        field3369++;
        if (arg1 != 35) {
            method1582(-105);
        }
        if (arg2 == null) {
            return null;
        }
        if (arg2.length > 136 && !class352.field5447) {
            try {
                class434 var3 = (class434) Class.forName("vu").getDeclaredConstructor().newInstance();
                var3.method1522(arg2, 7);
                return var3;
            } catch (Throwable var4) {
                class352.field5447 = true;
            }
        }
        return arg0 ? class394.method2453((byte) 114, arg2) : arg2;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method1578(byte arg0, String arg1) {
        field3370++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != -101) {
            method1577(false, 19, null);
        }
        for (int var2 = 0; var2 < class243.field3404; var2++) {
            if (arg1.equalsIgnoreCase(class165.field2242[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class321.field4646[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BI)V")
    public final void method1579(byte arg0, int arg1) {
        class330 var3 = this.field3368;
        synchronized (this.field3368) {
            int var4 = 55 % ((arg0 - 22) / 54);
            this.field3368.method2140(-124, arg1);
        }
        field3372++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)Ljb;")
    public final class347 method1580(int arg0, int arg1) {
        field3374++;
        class330 var3 = this.field3368;
        class347 var4;
        synchronized (this.field3368) {
            if (arg0 <= 71) {
                method1578((byte) 18, null);
            }
            var4 = (class347) this.field3368.method2133((long) arg1, (byte) 32);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field3371;
        byte[] var6;
        synchronized (this.field3371) {
            var6 = this.field3371.method1281(35, arg1, 121);
        }
        class347 var7 = new class347();
        if (var6 != null) {
            var7.method2246((byte) 47, new class164(var6));
        }
        var7.method2244(0);
        class330 var8 = this.field3368;
        synchronized (this.field3368) {
            this.field3368.method2131(var7, (long) arg1, false);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public final void method1581(int arg0) {
        if (arg0 != 7) {
            field3377 = null;
        }
        field3367++;
        class330 var2 = this.field3368;
        synchronized (this.field3368) {
            this.field3368.method2135(arg0 - 7);
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
    public static void method1582(int arg0) {
        field3376 = null;
        field3377 = null;
        field3375 = null;
        if (arg0 != 19) {
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V")
    public final void method1583(int arg0) {
        field3373++;
        class330 var2 = this.field3368;
        synchronized (this.field3368) {
            if (arg0 != 0) {
                this.method1579((byte) -124, 101);
            }
            this.field3368.method2127((byte) -10);
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Liv;ILuu;)V")
    public class240(class65 arg0, int arg1, class191 arg2) {
        this.field3371 = arg2;
        if (this.field3371 != null) {
            this.field3371.method1290(false, 35);
        }
    }
}
