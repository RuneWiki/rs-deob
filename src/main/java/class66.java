import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class66 {

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "Z")
    public boolean field854 = false;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
    public static boolean field859 = false;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "Lwl;")
    public static class452 field849 = new class452(6, -2);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
    public int field848;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field852;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public int field860;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Lkr;")
    public static class234 field856;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[S")
    public static short[] field858;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILiq;Liq;ZB)V")
    public static final void method446(int arg0, class134 arg1, class134 arg2, boolean arg3, byte arg4) {
        class121.field1594 = arg2;
        class74.field982 = arg1;
        class97.field1340 = arg3;
        if (arg4 < 52) {
            field859 = true;
        }
        class246.field3686 = arg0;
        field852++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILef;I)V")
    public final void method447(int arg0, class385 arg1, int arg2) {
        field847++;
        if (arg2 != 17466) {
            field858 = null;
        }
        while (true) {
            int var4 = arg1.method2343(255);
            if (var4 == 0) {
                return;
            }
            this.method452(arg0, arg1, var4, arg2 ^ 0x1574);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static final void method448(byte arg0) {
        if (arg0 >= -68) {
            field858 = null;
        }
        class241 var1 = class277.field4214;
        synchronized (class277.field4214) {
            class277.field4214.method1482((byte) 37);
        }
        field857++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Z")
    public final boolean method449(int arg0) {
        if (arg0 == 262144) {
            field851++;
            return class180.field2713.method822(-109, this.field860);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)V")
    public static final void method450(byte arg0) {
        field850++;
        class15.field179.method1482((byte) -118);
        class328.field4924.method1482((byte) 124);
        class292.field4451.method1482((byte) -73);
        class443.field6528.method1482((byte) 91);
        if (arg0 != 62) {
            method448((byte) -109);
        }
        class128.field1633.method1482((byte) 50);
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static void method451(int arg0) {
        field849 = null;
        field856 = null;
        if (arg0 != 6) {
            field858 = null;
        }
        field858 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILef;II)V")
    private final void method452(int arg0, class385 arg1, int arg2, int arg3) {
        field853++;
        if (arg3 != 20814) {
            method446(78, (class134) null, (class134) null, false, (byte) -109);
        }
        if (arg2 == 1) {
            this.field860 = arg1.method2323(-123);
        } else if (arg2 == 2) {
            this.field848 = arg1.method2382((byte) -117);
        } else if (arg2 == 3) {
            this.field854 = true;
            return;
        } else if (arg2 == 4) {
            this.field860 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZLdr;Z)Lkr;")
    public final class234 method453(int arg0, boolean arg1, class261 arg2, boolean arg3) {
        field855++;
        long var5 = (long) (arg2.field3971 << 19 | (arg3 ? 262144 : 0) | this.field860 | arg0 << 16);
        class234 var7 = (class234) class155.field2160.method1491(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (class180.field2713.method822(-92, this.field860)) {
            class4 var8 = class4.method36(class180.field2713, this.field860, 0);
            if (var8 != null) {
                var8.field44 = var8.field45 = var8.field47 = var8.field49 = 0;
                if (arg3) {
                    var8.method32();
                }
                for (int var9 = 0; var9 < arg0; var9++) {
                    var8.method30();
                }
            }
            class234 var10 = arg2.method378(var8, arg1);
            if (var10 != null) {
                class155.field2160.method1488(128, var5, var10);
            }
            return var10;
        } else {
            return null;
        }
    }
}
