import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class182 {

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "Lco;")
    private class210 field2344 = new class210(64);

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "Lg;")
    private class470 field2343;

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "Lab;")
    public static class256 field2341 = null;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field2346;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)V")
    public final void method985(int arg0, boolean arg1) {
        class210 var3 = this.field2344;
        synchronized (this.field2344) {
            this.field2344.method1166(arg0, (byte) -52);
            if (arg1) {
                this.field2344 = null;
            }
        }
        field2345++;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
    public static final void method986(int arg0) {
        field2340++;
        for (class13 var1 = (class13) class144.field1733.method2338(-38); var1 != null; var1 = (class13) class144.field1733.method2338(-46)) {
            class16.method107(var1, (byte) 111);
        }
        int var2;
        int var3;
        if (class420.method2503((byte) -127)) {
            var3 = 0;
            var2 = 3;
        } else {
            var2 = class346.field4942;
            var3 = class346.field4942;
        }
        if (arg0 >= -43) {
            method987(false);
        }
        client.method1679();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1658();
            client.method1667(var4);
            client.method1665(var4);
        }
        client.method1677();
        client.method1671();
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
    public static void method987(boolean arg0) {
        if (arg0) {
            method987(false);
        }
        field2341 = null;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
    public static final void method988(int arg0, int arg1) {
        class125 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class443 var4 = class443.field6329[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class225.field3116; var5++) {
                    for (int var6 = 0; var6 < class176.field2122; var6++) {
                        var2 = var4.method1869(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class482.field6812;
                            int var8 = var5 << class482.field6812;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class443 var10 = class443.field6329[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1861(var6, var5) - var10.method1861(var6, var5);
                                    int var12 = var4.method1861(var6 + 1, var5) - var10.method1861(var6 + 1, var5);
                                    int var13 = var4.method1861(var6 + 1, var5 + 1) - var10.method1861(var6 + 1, var5 + 1);
                                    int var14 = var4.method1861(var6, var5 + 1) - var10.method1861(var6, var5 + 1);
                                    var10.method1864(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public final void method989(int arg0) {
        class210 var2 = this.field2344;
        synchronized (this.field2344) {
            this.field2344.method1169(arg0 + 1076);
        }
        if (arg0 == 0) {
            field2349++;
        }
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)Lwq;")
    public final class36 method990(int arg0, int arg1) {
        field2348++;
        class210 var3 = this.field2344;
        class36 var4;
        synchronized (this.field2344) {
            var4 = (class36) this.field2344.method1163((byte) -101, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        } else if (arg1 > -93) {
            return null;
        } else {
            byte[] var5 = this.field2343.method2768(-20472, client.method1676(-100, arg0), class13.method96(58, arg0));
            class36 var6 = new class36();
            if (var5 != null) {
                var6.method183(true, new class179(var5));
            }
            class210 var7 = this.field2344;
            synchronized (this.field2344) {
                this.field2344.method1172((long) arg0, 1, var6);
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lci;ILg;)V")
    public class182(class421 arg0, int arg1, class470 arg2) {
        this.field2343 = arg2;
        if (this.field2343 != null) {
            int var4 = this.field2343.method2756(true) - 1;
            this.field2343.method2755(-89, var4);
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
    public final void method991(int arg0) {
        field2347++;
        if (arg0 < 72) {
            this.method991(44);
        }
        class210 var2 = this.field2344;
        synchronized (this.field2344) {
            this.field2344.method1165((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Loj;BLg;Lg;)V")
    public static final void method992(class280 arg0, byte arg1, class470 arg2, class470 arg3) {
        field2346++;
        if (arg1 < 21) {
            field2341 = null;
        }
        class56.field715 = class144.method681(0, (byte) -116, class421.field6070, arg3);
        class304.field4500 = arg0.method1484(class56.field715, class473.method2794(arg2, class421.field6070, 0), true);
        class451.field6384 = class144.method681(0, (byte) -103, class376.field5362, arg3);
        class273.field3875 = arg0.method1484(class451.field6384, class473.method2794(arg2, class376.field5362, 0), true);
        class453.field6394 = class144.method681(0, (byte) -111, class137.field1661, arg3);
        class101.field1230 = arg0.method1484(class453.field6394, class473.method2794(arg2, class137.field1661, 0), true);
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)V")
    public final void method993(int arg0, int arg1) {
        class210 var3 = this.field2344;
        synchronized (this.field2344) {
            if (arg0 != 0) {
                return;
            }
            this.field2344.method1165((byte) 118);
            this.field2344 = new class210(arg1);
        }
        field2342++;
    }
}
