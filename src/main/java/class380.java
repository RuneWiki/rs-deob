import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class380 {

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "Lge;")
    private class511 field5427 = new class511(64);

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "Lge;")
    public class511 field5441 = new class511(50);

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "Lge;")
    public class511 field5442 = new class511(5);

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "Lsn;")
    public class453 field5439;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Z")
    public boolean field5426;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "Lci;")
    public class320 field5434;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "Lci;")
    private class320 field5430;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field5433 = 0;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Lqt;")
    public static class459 field5436 = new class459(70, 2);

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "Lqv;")
    public static class316 field5440 = new class316(76, 14);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field5438;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "I")
    public int field5443;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public static void method2304(int arg0) {
        field5440 = null;
        if (arg0 != 70) {
            field5433 = -80;
        }
        field5436 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method2305(byte arg0) {
        field5437++;
        class511 var2 = this.field5427;
        synchronized (this.field5427) {
            this.field5427.method2990((byte) -78);
        }
        class511 var3 = this.field5441;
        synchronized (this.field5441) {
            if (arg0 != 85) {
                this.field5439 = null;
            }
            this.field5441.method2990((byte) -125);
        }
        class511 var4 = this.field5442;
        synchronized (this.field5442) {
            this.field5442.method2990((byte) -98);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
    public final void method2306(boolean arg0, int arg1) {
        field5428++;
        class511 var3 = this.field5427;
        synchronized (this.field5427) {
            this.field5427.method2989(false, arg1);
        }
        class511 var4 = this.field5441;
        synchronized (this.field5441) {
            this.field5441.method2989(false, arg1);
        }
        class511 var5 = this.field5442;
        synchronized (this.field5442) {
            this.field5442.method2989(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(ZI)V")
    public final void method2307(boolean arg0, int arg1) {
        field5425++;
        if (this.field5426 == arg0) {
            return;
        }
        this.field5426 = arg0;
        this.method2305((byte) 85);
        if (arg1 != 20314) {
            this.field5427 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V")
    public final void method2308(boolean arg0) {
        field5435++;
        class511 var2 = this.field5427;
        synchronized (this.field5427) {
            this.field5427.method2980(-182819096);
        }
        class511 var3 = this.field5441;
        synchronized (this.field5441) {
            if (arg0) {
                this.method2307(true, -110);
            }
            this.field5441.method2980(-182819096);
        }
        class511 var4 = this.field5442;
        synchronized (this.field5442) {
            this.field5442.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)V")
    public final void method2309(int arg0, boolean arg1) {
        this.field5443 = arg0;
        field5431++;
        if (arg1) {
            return;
        }
        class511 var3 = this.field5441;
        synchronized (this.field5441) {
            this.field5441.method2990((byte) -78);
        }
        class511 var4 = this.field5442;
        synchronized (this.field5442) {
            this.field5442.method2990((byte) -116);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)Lti;")
    public final class311 method2310(int arg0, int arg1) {
        field5429++;
        class511 var3 = this.field5427;
        class311 var4;
        synchronized (this.field5427) {
            var4 = (class311) this.field5427.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != -1) {
            this.field5426 = true;
        }
        class320 var5 = this.field5430;
        byte[] var6;
        synchronized (this.field5430) {
            var6 = this.field5430.method2037(class236.method1561(-108, arg1), (byte) -59, class400.method2399(true, arg1));
        }
        class311 var7 = new class311();
        var7.field4578 = this;
        var7.field4645 = arg1;
        if (var6 != null) {
            var7.method1980((byte) 34, new class519(var6));
        }
        var7.method1970((byte) 1);
        class511 var8 = this.field5427;
        synchronized (this.field5427) {
            this.field5427.method2981(var7, 46, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method2311(int arg0) {
        if (arg0 != 2) {
            return;
        }
        class511 var2 = this.field5441;
        synchronized (this.field5441) {
            this.field5441.method2990((byte) -93);
        }
        field5432++;
        class511 var3 = this.field5442;
        synchronized (this.field5442) {
            this.field5442.method2990((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method2312(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -85) {
            method2312(-109, 93, -95, (byte) 62, 94);
        }
        field5438++;
        if ((class234.field3497[0][arg0][arg2] & 0x2) != 0) {
            return true;
        } else if ((class234.field3497[arg1][arg0][arg2] & 0x10) == 0) {
            return class412.method2466(arg1, 2, arg0, arg2) == arg4;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Lsn;IZLci;Lci;)V")
    public class380(class453 arg0, int arg1, boolean arg2, class320 arg3, class320 arg4) {
        this.field5439 = arg0;
        this.field5426 = arg2;
        this.field5434 = arg4;
        this.field5430 = arg3;
        if (this.field5430 != null) {
            int var6 = this.field5430.method2033((byte) 60) - 1;
            this.field5430.method2030(-10914, var6);
        }
    }
}
