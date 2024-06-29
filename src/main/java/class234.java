import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class234 {

    @OriginalMember(owner = "client!cba", name = "j", descriptor = "Lwg;")
    private class58 field2991 = new class58(16);

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "Lkr;")
    private class329 field2982;

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "I")
    public static int field2984;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!cba", name = "k", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Ltm;")
    public static final class486 method1474(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7885;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(B)V")
    public final void method1475(byte arg0) {
        if (arg0 != -53) {
            return;
        }
        field2983++;
        class58 var2 = this.field2991;
        synchronized (this.field2991) {
            this.field2991.method315(1);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IIILel;II)Lhb;")
    public final class318 method1476(int arg0, int arg1, int arg2, class173 arg3, int arg4, int arg5) {
        field2987++;
        class200[] var7 = null;
        if (arg2 != 0) {
            return null;
        }
        class455 var8 = this.method1483(314, arg1);
        if (var8.field6441 != null) {
            var7 = new class200[var8.field6441.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class77 var10 = arg3.method1061(arg2 ^ 0x1E, var8.field6441[var9]);
                var7[var9] = new class200(var10.field1043, var10.field1055, var10.field1051, var10.field1052, var10.field1049, var10.field1046, var10.field1044, var10.field1050);
            }
        }
        return new class318(var8.field6445, var7, var8.field6437, arg5, arg4, arg0);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IB)V")
    public static final void method1477(int arg0, byte arg1) {
        field2990++;
        class272.field3459 = arg0;
        class251.field3138.method315(1);
        if (arg1 <= 26) {
            method1481(null, -53);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IILjq;B)V")
    public static final void method1478(int arg0, int arg1, class447 arg2, byte arg3) {
        field2988++;
        if (arg2 == null) {
            return;
        }
        if (arg2.field6331 != null) {
            class9 var4 = new class9();
            var4.field81 = arg2.field6331;
            var4.field77 = arg2;
            class218.method1408(var4);
        }
        class201.field2637 = arg2.field6229;
        class476.field6707 = arg2.field6263;
        class167.field2109 = arg2.field6317;
        class354.field4957 = arg0;
        class59.field809 = arg1;
        class497.field6936 = arg2.field6287;
        class48.field659 = arg2.field6188;
        class280.field3669 = true;
        int var5 = 76 % ((49 - arg3) / 36);
        class90.method501(arg2, -1);
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
    public final void method1479(int arg0) {
        field2984++;
        if (arg0 != 29) {
            this.method1483(-84, 75);
        }
        class58 var2 = this.field2991;
        synchronized (this.field2991) {
            this.field2991.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)V")
    public final void method1480(int arg0, int arg1) {
        field2992++;
        class58 var3 = this.field2991;
        synchronized (this.field2991) {
            if (arg1 == -2360) {
                this.field2991.method320(arg0, -306674912);
            }
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Lhda;I)V")
    public static final void method1481(class245 arg0, int arg1) {
        field2989++;
        if (class264.field3373) {
            return;
        }
        arg0.method589(-8880);
        class50.field673--;
        if (arg1 != 6550) {
            method1482(2, false);
        }
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(IZ)V")
    public static final void method1482(int arg0, boolean arg1) {
        field2986++;
        if (!arg1) {
            method1482(-84, true);
        }
        class632 var2 = class641.method3699(-102, 7, arg0);
        var2.method3655(0);
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)Lkn;")
    private final class455 method1483(int arg0, int arg1) {
        field2985++;
        if (arg0 != 314) {
            this.field2991 = null;
        }
        class58 var3 = this.field2991;
        class455 var4;
        synchronized (this.field2991) {
            var4 = (class455) this.field2991.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field2982;
        byte[] var6;
        synchronized (this.field2982) {
            var6 = this.field2982.method2054(true, 29, arg1);
        }
        class455 var7 = new class455();
        if (var6 != null) {
            var7.method2634(-121, new class551(var6));
        }
        class58 var8 = this.field2991;
        synchronized (this.field2991) {
            this.field2991.method316((long) arg1, (byte) -114, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lg;ILkr;)V")
    public class234(class513 arg0, int arg1, class329 arg2) {
        this.field2982 = arg2;
        this.field2982.method2064(0, 29);
    }
}
