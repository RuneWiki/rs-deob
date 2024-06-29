import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class204 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "Ljd;")
    public static class92 field3936 = class202.method1325((byte) 90, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Ljd;")
    public static class92 field3938 = class202.method1325((byte) 90, "Passwort: ");

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lla;IILud;)V")
    public static final void method1330(class108 arg0, int arg1, int arg2, class192 arg3) {
        field3929++;
        byte[] var4 = null;
        class18 var5 = class189.field3595;
        synchronized (class189.field3595) {
            if (arg1 != 0) {
                field3938 = null;
            }
            for (class150 var6 = (class150) class189.field3595.method103(arg1 ^ 0x39); var6 != null; var6 = (class150) class189.field3595.method100(arg1 ^ 0xFFFFFFCF)) {
                if ((long) arg2 == var6.field4079 && var6.field2975 == arg0 && var6.field2970 == 0) {
                    var4 = var6.field2974;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg0.method742(true, arg2);
            arg3.method1270(true, var7, (byte) 0, arg2, arg0);
        } else {
            arg3.method1270(true, var4, (byte) 0, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method1331(int arg0) {
        Object var1 = class138.field2762;
        synchronized (class138.field2762) {
            if (class31.field701 != 0) {
                class31.field701 = 1;
                try {
                    class138.field2762.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        if (arg0 > 70) {
            field3935++;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILnh;I)Z")
    public static final boolean method1332(int arg0, class133 arg1, int arg2) {
        byte[] var3 = arg1.method873(0, arg0);
        field3930++;
        if (var3 == null) {
            return false;
        } else {
            class130.method856(var3, true);
            return arg2 >= 120;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BIILji;I)V")
    public static final void method1333(byte arg0, int arg1, int arg2, class97 arg3, int arg4) {
        field3937++;
        if (class3.field182 >= 400) {
            return;
        }
        if (arg3.field1940 != null) {
            arg3 = arg3.method674((byte) -99);
        }
        if (arg3 == null || !arg3.field1941) {
            return;
        }
        class92 var5 = arg3.field1965;
        if (arg3.field1981 != 0) {
            var5 = class77.method529(-3, new class92[] { var5, class176.method1159(126, arg3.field1981, class15.field423.field1796), class79.field1618, class132.field2646, class142.method938(arg3.field1981, false), class1.field83 });
        }
        if (class59.field1235 == 1) {
            class32.field724++;
            class44.method275((byte) -110, (short) 47, arg4, (long) arg2, class77.method529(arg0 ^ 0x50, new class92[] { class1.field6, class76.field1589, var5 }), arg1, class25.field581);
        } else if (!class95.field1918) {
            class177.field3406++;
            class92[] var6 = arg3.field1942;
            if (class119.field2416) {
                var6 = class166.method1078(124, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class45.field1006 != 0 || !var6[var7].method646(126, class206.field3970))) {
                        class179.field3432++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 19;
                        }
                        if (var7 == 1) {
                            var8 = 18;
                        }
                        if (var7 == 2) {
                            var8 = 48;
                        }
                        if (var7 == 3) {
                            var8 = 10;
                        }
                        if (var7 == 4) {
                            var8 = 40;
                        }
                        class44.method275((byte) -110, var8, arg4, (long) arg2, class77.method529(-3, new class92[] { class114.field2311, var5 }), arg1, var6[var7]);
                    }
                }
            }
            if (class45.field1006 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method646(96, class206.field3970)) {
                        short var10 = 0;
                        if (arg3.field1981 > class15.field423.field1796) {
                            var10 = 2000;
                        }
                        class190.field3658++;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 19;
                        }
                        if (var9 == 1) {
                            var11 = 18;
                        }
                        if (var9 == 2) {
                            var11 = 48;
                        }
                        if (var9 == 3) {
                            var11 = 10;
                        }
                        if (var9 == 4) {
                            var11 = 40;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class44.method275((byte) -110, var11, arg4, (long) arg2, class77.method529(arg0 + 80, new class92[] { class114.field2311, var5 }), arg1, var6[var9]);
                    }
                }
            }
            class44.method275((byte) -110, (short) 1005, arg4, (long) arg2, class77.method529(-3, new class92[] { class114.field2311, var5 }), arg1, class54.field1129);
        } else if ((class42.field921 & 0x2) == 2) {
            class187.field3526++;
            class44.method275((byte) -110, (short) 1, arg4, (long) arg2, class77.method529(-3, new class92[] { class33.field746, class76.field1589, var5 }), arg1, class124.field2527);
        }
        if (arg0 != -83) {
            method1332(105, null, -117);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static void method1334(boolean arg0) {
        if (!arg0) {
            field3936 = null;
            field3938 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1335(byte arg0, int arg1) {
        if (arg0 != 89) {
            method1330(null, 12, 24, null);
        }
        field3932++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }
}
