import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class582 {

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "Laq;")
    private class494 field8370 = new class494(256);

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "Lgga;")
    private class513 field8374;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "I")
    public static int field8375 = 0;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "Lin;")
    public static class380 field8372 = new class380(83, -1);

    @OriginalMember(owner = "client!kga", name = "k", descriptor = "Lin;")
    public static class380 field8377 = new class380(50, -2);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field8367;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!kga", name = "j", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(B)V")
    public final void method3413(byte arg0) {
        field8369++;
        class494 var2 = this.field8370;
        synchronized (this.field8370) {
            this.field8370.method2881((byte) -74);
        }
        if (arg0 > -122) {
            method3416(-86, -93, null, (byte) 124);
        }
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(B)V")
    public final void method3414(byte arg0) {
        class494 var2 = this.field8370;
        synchronized (this.field8370) {
            this.field8370.method2893((byte) 95);
        }
        if (arg0 < 106) {
            this.field8370 = null;
        }
        field8373++;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZ)Ltw;")
    public final class261 method3415(int arg0, boolean arg1) {
        field8368++;
        class494 var3 = this.field8370;
        class261 var4;
        synchronized (this.field8370) {
            var4 = (class261) this.field8370.method2882((long) arg0, (byte) -123);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field8374;
        byte[] var6;
        synchronized (this.field8374) {
            var6 = this.field8374.method3019(26, arg0, 107);
        }
        if (arg1) {
            return null;
        }
        class261 var7 = new class261();
        if (var6 != null) {
            var7.method1693(-71, new class431(var6));
        }
        class494 var8 = this.field8370;
        synchronized (this.field8370) {
            this.field8370.method2890(-7307, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IILha;B)V")
    public static final void method3416(int arg0, int arg1, class475 arg2, byte arg3) {
        int var4 = -34 / ((24 - arg3) / 41);
        class548.field7629 = new class341[arg1][arg0];
        class321.field4568 = arg2;
        field8376++;
        if (class724.field10096 != null) {
            class726.field10109 = class779.method4280(class724.field10096[4], class724.field10096[5], class724.field10096[0], false, class724.field10096[2], class724.field10096[3], class724.field10096[1]);
        }
        class252.field3618 = new class341();
        class693.method3891(99);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V")
    public static void method3417(int arg0) {
        field8372 = null;
        if (arg0 != -27718) {
            field8377 = null;
        }
        field8377 = null;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)V")
    public final void method3418(int arg0, int arg1) {
        field8371++;
        class494 var3 = this.field8370;
        synchronized (this.field8370) {
            this.field8370.method2888(arg0, arg1 ^ 0x79);
        }
        if (arg1 != 1) {
            field8372 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Lsv;BLjf;)Lvi;")
    public static final class302 method3419(class570 arg0, byte arg1, class781 arg2) {
        field8367++;
        class302 var3 = class552.method3185((byte) 86);
        var3.field4332 = arg0;
        if (arg1 <= 124) {
            method3416(28, 90, null, (byte) 22);
        }
        var3.field4338 = arg0.field7910;
        if (var3.field4338 == -1) {
            var3.field4341 = new class373(260);
        } else if (var3.field4338 == -2) {
            var3.field4341 = new class373(10000);
        } else if (var3.field4338 <= 18) {
            var3.field4341 = new class373(20);
        } else if (var3.field4338 <= 98) {
            var3.field4341 = new class373(100);
        } else {
            var3.field4341 = new class373(260);
        }
        var3.field4341.method2221((byte) -82, arg2);
        var3.field4341.method2230((byte) 6, var3.field4332.method3302(true));
        var3.field4336 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lmca;ILgga;)V")
    public class582(class41 arg0, int arg1, class513 arg2) {
        this.field8374 = arg2;
        this.field8374.method3007(-1, 26);
    }
}
