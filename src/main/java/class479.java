import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class479 {

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "Lff;")
    private class9 field6991 = new class9(64);

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Lff;")
    public class9 field7006 = new class9(50);

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "Lff;")
    public class9 field7007 = new class9(5);

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "Lvh;")
    public class240 field7005;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "Z")
    public boolean field6997;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "Lvh;")
    private class240 field6995;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "Z")
    public static boolean field6994 = false;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Z")
    public static volatile boolean field7004 = true;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "[J")
    public static long[] field6993;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)V")
    public final void method2810(boolean arg0) {
        field7001++;
        class9 var2 = this.field6991;
        synchronized (this.field6991) {
            this.field6991.method67(102);
        }
        class9 var3 = this.field7006;
        synchronized (this.field7006) {
            this.field7006.method67(34);
            if (arg0) {
                field7004 = true;
            }
        }
        class9 var4 = this.field7007;
        synchronized (this.field7007) {
            this.field7007.method67(-107);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZI)V")
    public final void method2811(boolean arg0, int arg1) {
        field7003++;
        if (this.field6997 == arg0) {
            return;
        }
        if (arg1 >= -106) {
            this.method2813((byte) 18);
        }
        this.field6997 = arg0;
        this.method2810(false);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
    public final void method2812(byte arg0) {
        class9 var2 = this.field7006;
        synchronized (this.field7006) {
            if (arg0 >= -5) {
                field6993 = null;
            }
            this.field7006.method67(118);
        }
        field6992++;
        class9 var3 = this.field7007;
        synchronized (this.field7007) {
            this.field7007.method67(-97);
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
    public final void method2813(byte arg0) {
        if (arg0 <= 112) {
            method2815(null, -107, -22, -59, -61, -67);
        }
        field7002++;
        class9 var2 = this.field6991;
        synchronized (this.field6991) {
            this.field6991.method65(false);
        }
        class9 var3 = this.field7006;
        synchronized (this.field7006) {
            this.field7006.method65(false);
        }
        class9 var4 = this.field7007;
        synchronized (this.field7007) {
            this.field7007.method65(false);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIIII)V")
    public static final void method2814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7000++;
        class163 var5 = class271.method1546(arg1, arg2, true);
        var5.method1017(0);
        var5.field2324 = arg0;
        var5.field2328 = arg3;
        var5.field2332 = arg4;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lkj;IIIII)Ljava/awt/Frame;")
    public static final Frame method2815(class397 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6990++;
        if (!arg0.method2285((byte) -43)) {
            return null;
        }
        if (arg1 == 0) {
            class319[] var6 = class77.method568(true, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4405 == arg5 && var6[var8].field4407 == arg3 && (arg4 == 0 || var6[var8].field4416 == arg4) && (!var7 || var6[var8].field4413 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field4413;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class409 var9 = arg0.method2298(arg3, (byte) -75, arg4, arg1, arg5);
        while (var9.field5652 == 0) {
            class496.method2931((byte) 123, 10L);
        }
        if (arg2 != 23430) {
            field6994 = true;
        }
        Frame var10 = (Frame) var9.field5654;
        if (var10 == null) {
            return null;
        } else if (var9.field5652 == 2) {
            class159.method978(arg2 ^ 0xFFFFA412, arg0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
    public final void method2816(int arg0, int arg1) {
        field6998++;
        class9 var3 = this.field6991;
        synchronized (this.field6991) {
            this.field6991.method61((byte) -67, arg0);
        }
        if (arg1 != 10) {
            method2818(93);
        }
        class9 var4 = this.field7006;
        synchronized (this.field7006) {
            this.field7006.method61((byte) -67, arg0);
        }
        class9 var5 = this.field7007;
        synchronized (this.field7007) {
            this.field7007.method61((byte) -67, arg0);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
    public final void method2817(int arg0, byte arg1) {
        field6996++;
        this.field7008 = arg0;
        class9 var3 = this.field7006;
        synchronized (this.field7006) {
            this.field7006.method67(-93);
            if (arg1 != 62) {
                this.field7005 = null;
            }
        }
        class9 var4 = this.field7007;
        synchronized (this.field7007) {
            this.field7007.method67(-123);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
    public static void method2818(int arg0) {
        if (arg0 != -1) {
            method2814(-103, -50, -7, -33, 34);
        }
        field6993 = null;
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)Lef;")
    public final class336 method2819(int arg0, int arg1) {
        field6999++;
        class9 var3 = this.field6991;
        class336 var4;
        synchronized (this.field6991) {
            var4 = (class336) this.field6991.method56((long) arg0, 94);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6995.method1411(true, class516.method3029(arg0, true), class412.method2450(arg0, -4));
        class336 var6 = new class336();
        var6.field4618 = this;
        var6.field4638 = arg0;
        if (var5 != null) {
            var6.method1863(new class365(var5), (byte) 70);
        }
        var6.method1861(102);
        int var7 = -93 % ((arg1 - 8) / 52);
        class9 var8 = this.field6991;
        synchronized (this.field6991) {
            this.field6991.method73((long) arg0, var6, 26425);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Llf;IZLvh;Lvh;)V")
    public class479(class157 arg0, int arg1, boolean arg2, class240 arg3, class240 arg4) {
        this.field7005 = arg4;
        this.field6997 = arg2;
        this.field6995 = arg3;
        if (this.field6995 != null) {
            int var6 = this.field6995.method1410(0) - 1;
            this.field6995.method1397((byte) -111, var6);
        }
    }

    static {
        new class83("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
