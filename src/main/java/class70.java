import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class70 {

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lwi;")
    private class330 field983 = new class330(64);

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "Lwi;")
    private class330 field985 = new class330(100);

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "Luu;")
    private class191 field982;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Z")
    public static boolean field981 = false;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "Lwi;")
    public static class330 field975 = new class330(200);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public final void method484(int arg0, int arg1) {
        class330 var3 = this.field983;
        synchronized (this.field983) {
            this.field983.method2140(-121, arg1);
        }
        field979++;
        class330 var4 = this.field985;
        synchronized (this.field985) {
            if (arg0 != 0) {
                field975 = null;
            }
            this.field985.method2140(-107, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)Lvs;")
    public final class425 method485(int arg0, int arg1) {
        field978++;
        class330 var3 = this.field985;
        class425 var4;
        synchronized (this.field985) {
            if (arg1 != 5) {
                method488(43);
            }
            var4 = (class425) this.field985.method2133((long) arg0, (byte) 126);
            if (var4 == null) {
                var4 = new class425(arg0);
                this.field985.method2131(var4, (long) arg0, false);
            }
        }
        synchronized (var4) {
            return var4.method2593(125) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lga;I)V")
    public static final void method486(class282 arg0, int arg1) {
        field984++;
        if (arg1 <= 90) {
            method488(34);
        }
        if (class31.field457 != arg0.field4014) {
            return;
        }
        if (class56.field800.field1393 == null) {
            arg0.field4140 = 0;
            arg0.field4080 = 0;
            return;
        }
        arg0.field4068 = 150;
        arg0.field4003 = (int) (Math.sin((double) class393.field6017 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field4069 = 5;
        arg0.field4080 = class350.field5400;
        arg0.field4140 = class411.method2534(class56.field800.field1393, 0);
        arg0.field4061 = class56.field800.field3839;
        arg0.field4050 = class56.field800.field3834;
        arg0.field4015 = class56.field800.field3818;
        arg0.field4135 = 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
    public final void method487(int arg0) {
        class330 var2 = this.field983;
        synchronized (this.field983) {
            this.field983.method2127((byte) -6);
        }
        field977++;
        class330 var3 = this.field985;
        synchronized (this.field985) {
            if (arg0 > -94) {
                field981 = false;
            }
            this.field985.method2127((byte) -115);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V")
    public static void method488(int arg0) {
        field975 = null;
        if (arg0 != 150) {
            field981 = true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(II)Lvr;")
    public final class91 method489(int arg0, int arg1) {
        field976++;
        class330 var3 = this.field983;
        class91 var4;
        synchronized (this.field983) {
            var4 = (class91) this.field983.method2133((long) arg1, (byte) 120);
        }
        if (var4 != null) {
            return var4;
        }
        class191 var5 = this.field982;
        byte[] var6;
        synchronized (this.field982) {
            var6 = this.field982.method1281(class377.method2369(1020765895, arg1), class106.method679(arg1, (byte) 70), 91);
        }
        class91 var7 = new class91();
        var7.field1331 = arg1;
        var7.field1333 = this;
        if (var6 != null) {
            var7.method616(new class164(var6), 120);
        }
        var7.method614(2);
        class330 var8 = this.field983;
        synchronized (this.field983) {
            this.field983.method2131(var7, (long) arg1, false);
            if (arg0 < 16) {
                this.method489(-17, 126);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public final void method490(byte arg0) {
        class330 var2 = this.field983;
        synchronized (this.field983) {
            this.field983.method2135(0);
        }
        field980++;
        if (arg0 == -92) {
            class330 var3 = this.field985;
            synchronized (this.field985) {
                this.field985.method2135(0);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Liv;ILuu;Luu;Luu;)V")
    public class70(class65 arg0, int arg1, class191 arg2, class191 arg3, class191 arg4) {
        this.field982 = arg2;
        if (this.field982 != null) {
            int var6 = this.field982.method1294(-1) - 1;
            this.field982.method1290(false, var6);
        }
        class385.method2410(arg3, false, arg4);
    }
}
