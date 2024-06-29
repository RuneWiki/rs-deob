import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class419 {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lwg;")
    private class58 field5723 = new class58(64);

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Lwg;")
    public class58 field5731 = new class58(64);

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "Lkr;")
    private class329 field5727;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lkr;")
    public class329 field5726;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Lvt;")
    public static class344 field5720;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field5730;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "F")
    public static float field5728;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field5729;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public final void method2480(int arg0, int arg1, int arg2) {
        if (arg0 == -19139) {
            field5725++;
            this.field5723 = new class58(arg2);
            this.field5731 = new class58(arg1);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public final void method2481(int arg0) {
        field5722++;
        class58 var2 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method315(arg0 ^ 0x409E);
        }
        class58 var3 = this.field5731;
        synchronized (this.field5731) {
            this.field5731.method315(1);
        }
        if (arg0 != 16543) {
            this.method2480(11, -48, -119);
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public final void method2482(int arg0) {
        if (arg0 != 0) {
            this.field5731 = null;
        }
        field5724++;
        class58 var2 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method317((byte) 21);
        }
        class58 var3 = this.field5731;
        synchronized (this.field5731) {
            this.field5731.method317((byte) 21);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLjq;)V")
    public static final void method2483(boolean arg0, class447 arg1) {
        field5729++;
        if (class643.field9329 == arg1.field6325) {
            if (class147.field1899.field257 == null) {
                arg1.field6197 = 0;
                arg1.field6193 = 0;
            } else {
                arg1.field6333 = 150;
                arg1.field6305 = (int) (Math.sin((double) class7.field61 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field6308 = 5;
                arg1.field6193 = class182.field2335;
                arg1.field6197 = class60.method346((byte) 123, class147.field1899.field257);
                arg1.field6234 = class147.field1899.field378;
                arg1.field6212 = 0;
                arg1.field6184 = class147.field1899.field354;
                arg1.field6259 = class147.field1899.field350;
            }
        } else if (arg0) {
            field5720 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static void method2484(int arg0) {
        if (arg0 == 256) {
            field5720 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Laj;")
    public final class264 method2485(int arg0, int arg1) {
        field5721++;
        class58 var3 = this.field5723;
        class264 var4;
        synchronized (this.field5723) {
            var4 = (class264) this.field5723.method323((long) arg1, -19814);
        }
        if (var4 != null) {
            return var4;
        }
        class329 var5 = this.field5727;
        byte[] var6;
        synchronized (this.field5727) {
            if (arg0 != 3146) {
                this.field5723 = null;
            }
            var6 = this.field5727.method2054(true, 34, arg1);
        }
        class264 var7 = new class264();
        var7.field3366 = this;
        if (var6 != null) {
            var7.method1632(new class551(var6), (byte) -46);
        }
        class58 var8 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method316((long) arg1, (byte) -127, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)I")
    public static final int method2486(int arg0, int arg1, int arg2) {
        if (arg0 != 4460) {
            field5720 = null;
        }
        field5718++;
        return arg2 == 4 || arg2 == 5 ? class343.field4762[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)V")
    public final void method2487(byte arg0, int arg1) {
        field5719++;
        class58 var3 = this.field5723;
        synchronized (this.field5723) {
            this.field5723.method320(arg1, -306674912);
        }
        class58 var4 = this.field5731;
        synchronized (this.field5731) {
            this.field5731.method320(arg1, -306674912);
            if (arg0 != 91) {
                field5728 = -0.8734064F;
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lg;ILkr;Lkr;)V")
    public class419(class513 arg0, int arg1, class329 arg2, class329 arg3) {
        this.field5727 = arg2;
        this.field5726 = arg3;
        this.field5727.method2064(0, 34);
    }

    static {
        new class344("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field5720 = new class344("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");
        field5730 = -1;
    }
}
