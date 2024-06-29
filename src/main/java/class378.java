import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class378 {

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "Luaa;")
    private class395 field5551 = new class395(64);

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "Luaa;")
    private class395 field5561 = new class395(100);

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "Lgp;")
    private class561 field5557;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
    public static int field5552;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field5555;

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
    public static int field5558;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static final void method2293(int arg0) {
        field5558++;
        int var1 = class43.field586;
        int[] var2 = class343.field4927;
        for (int var3 = arg0; var3 < var1; var3++) {
            class400 var4 = class39.field536[var2[var3]];
            if (var4 != null) {
                class139.method1044(var4, var4.method781((byte) -114), -26587);
            }
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BI)V")
    public final void method2294(byte arg0, int arg1) {
        field5556++;
        class395 var3 = this.field5551;
        synchronized (this.field5551) {
            this.field5551.method2397(arg1, (byte) -68);
            if (arg0 >= -9) {
                field5562 = -8;
            }
        }
        class395 var4 = this.field5561;
        synchronized (this.field5561) {
            this.field5561.method2397(arg1, (byte) -56);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V")
    public static final void method2295(int arg0, int arg1, int arg2) {
        if (class449.field6539 != arg0) {
            class206.field2924 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class206.field2924[var3] = (var3 << 12) / arg0;
            }
            class108.field1799 = arg0 - 1;
            class449.field6539 = arg0;
            class524.field7284 = arg0 * 32;
        }
        field5559++;
        if (class527.field7334 != arg2) {
            if (class449.field6539 == arg2) {
                class638.field9258 = class206.field2924;
            } else {
                class638.field9258 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class638.field9258[var4] = (var4 << 12) / arg2;
                }
            }
            class527.field7334 = arg2;
            class589.field8379 = arg2 - 1;
        }
        if (arg1 >= -112) {
            method2293(64);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)V")
    public final void method2296(int arg0) {
        class395 var2 = this.field5551;
        synchronized (this.field5551) {
            this.field5551.method2404((byte) -126);
        }
        field5555++;
        class395 var3 = this.field5561;
        synchronized (this.field5561) {
            if (arg0 != -15769) {
                field5562 = -90;
            }
            this.field5561.method2404((byte) -124);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(BI)Lbj;")
    public final class439 method2297(byte arg0, int arg1) {
        field5552++;
        class395 var3 = this.field5551;
        class439 var4;
        synchronized (this.field5551) {
            var4 = (class439) this.field5551.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field5557;
        byte[] var6;
        synchronized (this.field5557) {
            var6 = this.field5557.method3175(class56.method455((byte) 28, arg1), (byte) -53, class471.method2742(arg1, -128));
        }
        class439 var7 = new class439();
        var7.field6390 = arg1;
        if (arg0 <= 105) {
            return null;
        }
        var7.field6411 = this;
        if (var6 != null) {
            var7.method2595(new class268(var6), 5560);
        }
        var7.method2599(65535);
        class395 var8 = this.field5551;
        synchronized (this.field5551) {
            this.field5551.method2408(var7, (long) arg1, -108);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)Lmb;")
    public final class285 method2298(int arg0, int arg1) {
        field5553++;
        if (arg0 > -55) {
            this.method2298(30, 115);
        }
        class395 var3 = this.field5561;
        class285 var4;
        synchronized (this.field5561) {
            var4 = (class285) this.field5561.method2407(false, (long) arg1);
            if (var4 == null) {
                var4 = new class285(arg1);
                this.field5561.method2408(var4, (long) arg1, -122);
            }
        }
        synchronized (var4) {
            return var4.method1813(65535) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
    public final void method2299(int arg0) {
        class395 var2 = this.field5551;
        synchronized (this.field5551) {
            this.field5551.method2406(-125);
            if (arg0 != 100) {
                this.field5551 = null;
            }
        }
        field5554++;
        class395 var3 = this.field5561;
        synchronized (this.field5561) {
            this.field5561.method2406(1);
        }
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;Lgp;)V")
    public class378(class584 arg0, int arg1, class561 arg2, class561 arg3, class561 arg4) {
        this.field5557 = arg2;
        if (this.field5557 != null) {
            int var6 = this.field5557.method3185(-128) - 1;
            this.field5557.method3164(var6, true);
        }
        class247.method1567(arg3, arg4, 103);
    }

    static {
        new class567("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field5562 = -1;
    }
}
