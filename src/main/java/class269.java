import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class269 {

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Lqr;")
    private class65 field3766 = new class65(64);

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "Lqr;")
    public class65 field3770 = new class65(64);

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "Lwu;")
    public class376 field3768;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "Lwu;")
    private class376 field3761;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "[I")
    public static int[] field3767 = new int[3];

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Lhda;")
    public static class752 field3763 = new class752(9, 2);

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[B)V")
    public static final void method1619(int arg0, byte[] arg1) {
        field3762++;
        if (arg0 <= 115) {
            return;
        }
        class677 var2 = new class677(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method3821((byte) 83);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class427.field5887 = new int[6];
                    var4[0] = var2.method3807(-1);
                    var4[1] = var2.method3807(-1);
                    var4[2] = var2.method3807(-1);
                    var4[3] = var2.method3807(-1);
                    var4[4] = var2.method3807(-1);
                    var4[5] = var2.method3807(-1);
                } else if (var3 == 4) {
                    int var7 = var2.method3821((byte) 108);
                    client.field4370 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        client.field4370[var8] = var2.method3807(-1);
                        if (client.field4370[var8] == 65535) {
                            client.field4370[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method3821((byte) 79);
                    class70.field849 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class70.field849[var6] = var2.method3807(-1);
                        if (class70.field849[var6] == 65535) {
                            class70.field849[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
    public final void method1620(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field3759 = -100;
        }
        field3758++;
        this.field3766 = new class65(arg2);
        this.field3770 = new class65(arg1);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public final void method1621(int arg0) {
        class65 var2 = this.field3766;
        synchronized (this.field3766) {
            this.field3766.method561((byte) -78);
        }
        field3760++;
        class65 var3 = this.field3770;
        synchronized (this.field3770) {
            if (arg0 != 3) {
                this.method1620(-99, -39, 9);
            }
            this.field3770.method561((byte) -78);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method1622(byte arg0) {
        if (arg0 != -64) {
            this.method1623(-60, -11);
        }
        class65 var2 = this.field3766;
        synchronized (this.field3766) {
            this.field3766.method558(0);
        }
        field3769++;
        class65 var3 = this.field3770;
        synchronized (this.field3770) {
            this.field3770.method558(0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Ldk;")
    public final class513 method1623(int arg0, int arg1) {
        field3764++;
        class65 var3 = this.field3766;
        class513 var4;
        synchronized (this.field3766) {
            var4 = (class513) this.field3766.method552(4, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field3761;
        byte[] var6;
        synchronized (this.field3761) {
            var6 = this.field3761.method2218((byte) 120, 34, arg0);
        }
        class513 var7 = new class513();
        var7.field6800 = this;
        if (var6 != null) {
            var7.method2866(new class677(var6), (byte) -124);
        }
        class65 var8 = this.field3766;
        synchronized (this.field3766) {
            this.field3766.method556((byte) 0, (long) arg0, var7);
            if (arg1 < 101) {
                field3763 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static void method1624(byte arg0) {
        if (arg0 >= -30) {
            method1619(-26, null);
        }
        field3767 = null;
        field3763 = null;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(II)V")
    public final void method1625(int arg0, int arg1) {
        class65 var3 = this.field3766;
        synchronized (this.field3766) {
            this.field3766.method553(arg0, -15782);
            if (arg1 != 2) {
                field3763 = null;
            }
        }
        field3765++;
        class65 var4 = this.field3770;
        synchronized (this.field3770) {
            this.field3770.method553(arg0, -15782);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lms;ILwu;Lwu;)V")
    public class269(class763 arg0, int arg1, class376 arg2, class376 arg3) {
        this.field3768 = arg3;
        this.field3761 = arg2;
        this.field3761.method2195(34, 0);
    }
}
