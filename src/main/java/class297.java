import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class297 {

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "Ld;")
    private class242 field4567 = new class242(16);

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "Lum;")
    private class83 field4569;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "J")
    public static long field4572 = 0L;

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Lpu;")
    public static class179 field4570 = new class179("Take", "Nehmen", "Prendre", "Pegar");

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Ljp;")
    public static class55 field4576 = new class55(8, 3);

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "Z")
    public static boolean field4577;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "I")
    public static int field4575;

    static {
        new class179("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field4577 = false;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lnq;IIBII)Lre;", line = 4)
    public final class486 method1976(class499 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4566++;
        class120[] var7 = null;
        class474 var8 = this.method1982(arg3 + 195, arg5);
        if (arg3 != -111) {
            this.method1979((byte) 88, 113);
        }
        if (var8.field6949 != null) {
            var7 = new class120[var8.field6949.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class237 var10 = arg0.method2984(8559, var8.field6949[var9]);
                var7[var9] = new class120(var10.field3561, var10.field3566, var10.field3557, var10.field3560, var10.field3565, var10.field3562, var10.field3558, var10.field3556);
            }
        }
        return new class486(var8.field6948, var7, var8.field6943, arg2, arg4, arg1);
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ZZ)V", line = 37)
    public static final void method1977(boolean arg0, boolean arg1) {
        field4574++;
        class491 var2 = (class491) class410.field6066.method295((byte) -96);
        if (arg0) {
            field4572 = -125L;
        }
        while (var2 != null) {
            if (var2.field7182 != null) {
                class503.field7313.method1802(var2.field7182);
                var2.field7182 = null;
            }
            if (var2.field7170 != null) {
                class503.field7313.method1802(var2.field7170);
                var2.field7170 = null;
            }
            var2.method947((byte) 125);
            var2 = (class491) class410.field6066.method296(true);
        }
        if (!arg1) {
            return;
        }
        for (class491 var3 = (class491) class351.field5231.method295((byte) -68); var3 != null; var3 = (class491) class351.field5231.method296(true)) {
            if (var3.field7182 != null) {
                class503.field7313.method1802(var3.field7182);
                var3.field7182 = null;
            }
            var3.method947((byte) 125);
        }
        for (class491 var4 = (class491) class299.field4604.method359(!arg0); var4 != null; var4 = (class491) class299.field4604.method365(-64)) {
            if (var4.field7182 != null) {
                class503.field7313.method1802(var4.field7182);
                var4.field7182 = null;
            }
            var4.method947((byte) 99);
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V", line = 103)
    public final void method1978(byte arg0) {
        int var2 = -19 % ((arg0 - 27) / 55);
        class242 var3 = this.field4567;
        synchronized (this.field4567) {
            this.field4567.method1630(-94);
        }
        field4573++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V", line = 116)
    public final void method1979(byte arg0, int arg1) {
        field4575++;
        class242 var3 = this.field4567;
        synchronized (this.field4567) {
            this.field4567.method1631(arg1, (byte) -19);
            if (arg0 < 92) {
                this.method1981(true);
            }
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(Z)V", line = 129)
    public static void method1980(boolean arg0) {
        if (arg0) {
            field4576 = null;
            field4570 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V", line = 143)
    public final void method1981(boolean arg0) {
        class242 var2 = this.field4567;
        synchronized (this.field4567) {
            if (!arg0) {
                return;
            }
            this.field4567.method1637((byte) 13);
        }
        field4568++;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)Lvs;", line = 165)
    private final class474 method1982(int arg0, int arg1) {
        field4571++;
        class242 var3 = this.field4567;
        class474 var4;
        synchronized (this.field4567) {
            var4 = (class474) this.field4567.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field4569;
        byte[] var6;
        synchronized (this.field4569) {
            var6 = this.field4569.method731(0, arg1, 29);
            int var7 = 57 % ((arg0 - 16) / 54);
        }
        class474 var8 = new class474();
        if (var6 != null) {
            var8.method2871(4713, new class194(var6));
        }
        class242 var9 = this.field4567;
        synchronized (this.field4567) {
            this.field4567.method1623((long) arg1, 17621, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 202)
    public class297(class308 arg0, int arg1, class83 arg2) {
        this.field4569 = arg2;
        this.field4569.method748(29, 12408);
    }
}
