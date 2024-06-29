import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class341 {

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lhu;")
    private class76 field4565 = new class76(64);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "Lr;")
    private class110 field4564;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lr;")
    public class110 field4563;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4560 = new Rectangle[100];

    @OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
    public static boolean field4562 = false;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "Lh;")
    public static class434 field4567;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lgd;")
    public static class206 field4569;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lgd;")
    public static class206 field4570;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Lmc;")
    public static class78 field4571;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "[I")
    public static int[] field4572;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field4568;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field4560[var0] = new Rectangle();
        }
        field4567 = new class434(48, 5);
        field4569 = new class206("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
        field4570 = new class206("M", "M", "M", "M");
        field4571 = new class78(15, -1);
        field4572 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V", line = 8)
    public final void method1931(byte arg0) {
        field4568++;
        class76 var2 = this.field4565;
        synchronized (this.field4565) {
            this.field4565.method502(0);
            if (arg0 > -99) {
                field4567 = null;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 21)
    public final void method1932(int arg0) {
        field4561++;
        class76 var2 = this.field4565;
        synchronized (this.field4565) {
            this.field4565.method495(-100);
        }
        if (arg0 != 294) {
            this.field4564 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V", line = 34)
    public static void method1933(boolean arg0) {
        field4572 = null;
        field4569 = null;
        field4571 = null;
        field4570 = null;
        field4560 = null;
        if (arg0) {
            field4567 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IB)Lge;", line = 59)
    public final class462 method1934(int arg0, byte arg1) {
        field4558++;
        class76 var3 = this.field4565;
        class462 var4;
        synchronized (this.field4565) {
            var4 = (class462) this.field4565.method493((byte) 19, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4564.method702((byte) 86, arg0, 3);
        class462 var6 = new class462();
        if (arg1 <= 82) {
            field4570 = null;
        }
        var6.field6270 = this;
        if (var5 != null) {
            var6.method2716(new class32(var5), -77);
        }
        class76 var7 = this.field4565;
        synchronized (this.field4565) {
            this.field4565.method505((long) arg0, var6, 111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)V", line = 89)
    public final void method1935(byte arg0, int arg1) {
        field4559++;
        class76 var3 = this.field4565;
        synchronized (this.field4565) {
            this.field4565.method496(arg1, 58);
        }
        if (arg0 != -41) {
            this.method1934(-104, (byte) 52);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLac;Lac;BI)I", line = 116)
    public static final int method1936(boolean arg0, class348 arg1, class348 arg2, byte arg3, int arg4) {
        field4566++;
        if (arg4 == 1) {
            int var5 = arg1.field674;
            int var6 = arg2.field674;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg3 != -40) {
            return 5;
        } else if (arg4 == 2) {
            return class487.method2832(arg2.method2152(1343648748).field177, (byte) -94, arg1.method2152(arg3 ^ 0xAFE98C34).field177, class110.field1676);
        } else if (arg4 == 3) {
            if (arg1.field4788.equals("-")) {
                if (arg2.field4788.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg2.field4788.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class487.method2832(arg2.field4788, (byte) -48, arg1.field4788, class110.field1676);
            }
        } else if (arg4 == 4) {
            if (arg1.method356((byte) 25)) {
                return arg2.method356((byte) 25) ? 0 : 1;
            } else if (arg2.method356((byte) 25)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method360(6)) {
                return arg2.method360(6) ? 0 : 1;
            } else if (arg2.method360(arg3 ^ 0xFFFFFFDE)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg1.method355(1)) {
                return arg2.method355(1) ? 0 : 1;
            } else if (arg2.method355(1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg1.method358(arg3 + 40)) {
                return arg2.method358(0) ? 0 : 1;
            } else if (arg2.method358(arg3 ^ 0xFFFFFFD8)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field4789;
            int var8 = arg2.field4789;
            if (arg0) {
                if (var8 == 1000) {
                    var8 = -1;
                }
                if (var7 == 1000) {
                    var7 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else {
            return arg1.field4786 - arg2.field4786;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ldn;ILr;Lr;)V", line = 220)
    public class341(class329 arg0, int arg1, class110 arg2, class110 arg3) {
        this.field4564 = arg2;
        this.field4563 = arg3;
        this.field4564.method694(3, (byte) 119);
    }
}
