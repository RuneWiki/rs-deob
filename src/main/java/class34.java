import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class34 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public int field479;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Ljava/lang/String;")
    public static String field475 = "";

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Lvk;")
    public static class56 field474 = new class56(512);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field478;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field482;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method231(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 7)
    public static final void method225(int arg0) {
        class189 var1 = class182.field2476;
        synchronized (class182.field2476) {
            class182.field2476.method1141(256);
        }
        field478++;
        class189 var2 = class27.field388;
        synchronized (class27.field388) {
            class27.field388.method1141(arg0 ^ 0xFFFF8CA0);
        }
        class189 var3 = class93.field1340;
        synchronized (class93.field1340) {
            class93.field1340.method1141(arg0 + 29536);
        }
        if (arg0 != -29280) {
            field476 = -76;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIIIIII)V", line = 27)
    public static final void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg6 <= 28) {
            return;
        }
        field477++;
        if (class395.method2537((byte) -114, arg5)) {
            class63.method440(arg2, 96, arg7, arg0, class365.field5292[arg5], arg4, arg3, arg1, arg8, -1);
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class270.field3927[var9] = true;
            }
        } else {
            class270.field3927[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 60)
    public static void method229(int arg0) {
        field475 = null;
        if (arg0 != -1) {
            field476 = -24;
        }
        field474 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIII)Z", line = 77)
    public static final boolean method230(int arg0, int arg1, int arg2, int arg3) {
        field472++;
        class425 var4 = (class425) class40.method292(arg2, arg3, arg0);
        boolean var5 = true;
        if (arg1 >= -113) {
            field473 = -75;
        }
        if (var4 != null) {
            var5 &= class347.method2285(var4, true);
        }
        class425 var6 = (class425) class243.method1460(arg2, arg3, arg0, field482 == null ? (field482 = method231("jb")) : field482);
        if (var6 != null) {
            var5 &= class347.method2285(var6, true);
        }
        class425 var7 = (class425) class130.method823(arg2, arg3, arg0);
        if (var7 != null) {
            var5 &= class347.method2285(var7, true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(III)V", line = 111)
    public class34(int arg0, int arg1, int arg2) {
        this.field479 = arg1;
        this.field481 = arg0;
        this.field480 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public abstract void method224(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)V")
    public abstract void method227(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(III)V")
    public abstract void method228(int arg0, int arg1, int arg2);
}
